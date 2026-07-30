package com.crrepa.band.my.device.appmarket.map;

import androidx.annotation.NonNull;
import cn.hutool.core.text.l;
import com.artillery.ctc.CtHelper;
import com.artillery.ctc.base.Audio2TextBody;
import com.artillery.ctc.base.ChatRequestBody;
import com.artillery.ctc.interfaces.IChatCallback;
import com.artillery.ctc.interfaces.ISimpleCallback;
import com.artillery.ctc.uitls.Base64Utils;
import com.crrepa.band.my.device.ai.asr.model.AsrResp;
import com.crrepa.band.my.device.ai.chat.model.AIChatResp;
import com.crrepa.ble.spp.hisilicon.CRPHisiliconSPPManager;
import com.crrepa.ble.spp.hisilicon.write.map.CRPMapMessageBuilder;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPVoiceResultInfo;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.g0;
import com.moyoung.dafit.module.common.utils.s;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public class b {
    public static final String PCM_FILE_NAME = "map_record.pcm";
    private FileOutputStream outputStream;

    class a implements IChatCallback {
        a() {
        }

        @Override // com.artillery.ctc.interfaces.IChatFailCallback
        public void onFail(int i8, @NonNull String str) {
            com.orhanobut.logger.f.d("AIChat onFail: " + str);
            b.this.sendVoiceContent(false, "");
        }

        @Override // com.artillery.ctc.interfaces.ISimpleCallback
        public void onSuccess(@NonNull String str) {
            com.orhanobut.logger.f.d("AIChat onSuccess: " + str);
            try {
                AIChatResp aIChatResp = (AIChatResp) s.json2Bean(str, AIChatResp.class);
                if (aIChatResp != null) {
                    b.this.sendVoiceContent(true, aIChatResp.data.answer);
                }
            } catch (Exception unused) {
                b.this.sendVoiceContent(false, "");
            }
        }
    }

    /* renamed from: com.crrepa.band.my.device.appmarket.map.b$b, reason: collision with other inner class name */
    class C0166b implements IChatCallback {
        C0166b() {
        }

        @Override // com.artillery.ctc.interfaces.IChatFailCallback
        public void onFail(int i8, @NonNull String str) {
            com.orhanobut.logger.f.d("AIChat onFail: " + str);
            b.this.sendVoiceContent(false, "");
        }

        @Override // com.artillery.ctc.interfaces.ISimpleCallback
        public void onSuccess(@NonNull String str) {
            com.orhanobut.logger.f.d("AIChat onSuccess: " + str);
            try {
                AIChatResp aIChatResp = (AIChatResp) s.json2Bean(str, AIChatResp.class);
                if (aIChatResp != null) {
                    b.this.sendVoiceContent(true, aIChatResp.data.answer);
                }
            } catch (Exception unused) {
                b.this.sendVoiceContent(false, "");
            }
        }
    }

    private void getAddress(String str) {
        CtHelper.Companion companion = CtHelper.Companion;
        boolean isOverseas = companion.get().isOverseas();
        com.orhanobut.logger.f.d("getAddress overseas: " + isOverseas);
        ChatRequestBody chatRequestBody = new ChatRequestBody();
        if (isOverseas) {
            ChatRequestBody.Oversea oversea = new ChatRequestBody.Oversea();
            oversea.prompt = str + "。请识别出前文中地点名，并只回复地点名。";
            oversea.max_tokens = 100;
            oversea.language = com.crrepa.band.my.device.ai.helper.g.getAISupportedLanguageCode();
            oversea.stream = Boolean.FALSE;
            oversea.qid = String.valueOf(System.currentTimeMillis());
            chatRequestBody.oversea = oversea;
            companion.get().chatWithBodyOverseas(chatRequestBody, new a());
            return;
        }
        ChatRequestBody.Data data = new ChatRequestBody.Data();
        data.prompt = str + "。请识别出前文中地点名，并只回复地点名。";
        data.max_tokens = 100;
        data.stream = false;
        chatRequestBody.data = data;
        chatRequestBody.mode = 2;
        chatRequestBody.pid = "104";
        chatRequestBody.qid = String.valueOf(System.currentTimeMillis());
        companion.get().chatWithBody(chatRequestBody, new C0166b());
    }

    private static String getPcmFilePath() {
        return g0.getMusicFilePath(com.moyoung.dafit.module.common.utils.d.get(), PCM_FILE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$0(String str) {
        com.orhanobut.logger.f.d("asrResultStr: " + str);
        try {
            AsrResp asrResp = (AsrResp) s.json2Bean(str, AsrResp.class);
            if (asrResp == null || asrResp.getErr_no() != 0) {
                sendVoiceContent(false, "");
            } else {
                getAddress(asrResp.getResult().get(0));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            sendVoiceContent(false, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendVoiceContent(boolean z7, String str) {
        com.orhanobut.logger.f.d("sendVoiceContent: " + z7 + l.SPACE + str);
        CRPVoiceResultInfo cRPVoiceResultInfo = new CRPVoiceResultInfo();
        cRPVoiceResultInfo.setCode(!z7 ? 1 : 0);
        cRPVoiceResultInfo.setIsEnded(0);
        cRPVoiceResultInfo.setType(0);
        cRPVoiceResultInfo.setVoiceContent(str);
        CRPHisiliconSPPManager.getInstance().send(CRPMapMessageBuilder.sendVoiceResultCmd(cRPVoiceResultInfo));
    }

    public void recording(byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = this.outputStream;
            if (fileOutputStream != null) {
                fileOutputStream.write(bArr);
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    public void start() {
        try {
            this.outputStream = new FileOutputStream(getPcmFilePath(), false);
        } catch (FileNotFoundException e8) {
            e8.printStackTrace();
        }
    }

    public void stop() {
        try {
            FileOutputStream fileOutputStream = this.outputStream;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (!a0.isNetworkConnected(com.moyoung.dafit.module.common.utils.d.get()) || com.crrepa.band.my.device.ai.helper.g.isMacUnauthorized()) {
                com.orhanobut.logger.f.d("asrResultStr: network state：" + a0.isNetworkConnected(com.moyoung.dafit.module.common.utils.d.get()));
                com.orhanobut.logger.f.d("asrResultStr: mac state：" + com.crrepa.band.my.device.ai.helper.g.isMacUnauthorized());
                sendVoiceContent(false, "");
                return;
            }
            File file = new File(getPcmFilePath());
            com.orhanobut.logger.f.d("asrResultStr pcmFile: " + file.length());
            Audio2TextBody audio2TextBody = new Audio2TextBody(Base64Utils.Companion.encodeToString(file), file.length());
            audio2TextBody.dev_pid = 1537;
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.e(audio2TextBody));
            CtHelper.Companion.get().audio2TextByJson(audio2TextBody, new ISimpleCallback() { // from class: com.crrepa.band.my.device.appmarket.map.a
                @Override // com.artillery.ctc.interfaces.ISimpleCallback
                public final void onSuccess(String str) {
                    b.this.lambda$stop$0(str);
                }
            });
        } catch (IOException e8) {
            e8.printStackTrace();
            sendVoiceContent(false, "");
        }
    }
}
