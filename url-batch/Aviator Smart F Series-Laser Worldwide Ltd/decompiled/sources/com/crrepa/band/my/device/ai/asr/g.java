package com.crrepa.band.my.device.ai.asr;

import android.content.Context;
import android.util.Log;
import com.artillery.ctc.CtHelper;
import com.artillery.ctc.base.Audio2TextBody;
import com.artillery.ctc.base.Audio2TextBodyRaw;
import com.artillery.ctc.interfaces.ISimpleCallback;
import com.artillery.ctc.uitls.Base64Utils;
import com.crrepa.band.my.device.ai.asr.model.AsrOverseaResp;
import com.crrepa.band.my.device.ai.asr.model.AsrResp;
import com.crrepa.band.my.device.ai.asr.r;
import com.crrepa.band.my.device.ai.chat.model.HisiliconErrorCode;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.ble.conn.type.CRPChatErrorCode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.lib.ai.asr.d;
import com.my.lib.AFlash;
import com.my.lib.data.ErrorCode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import y5.w;

/* loaded from: classes2.dex */
public class g extends r {
    private final r.a asrCallback;
    private boolean isCanceled = false;
    Context context = com.moyoung.dafit.module.common.utils.d.get();

    class a implements com.moyoung.lib.ai.asr.a {
        a() {
        }

        @Override // com.moyoung.lib.ai.asr.a
        public void onError(String str) {
            String str2 = "error: " + str;
            g.this.asrCallback.onRecognizeError(str2);
            Log.d("MoyAI", str2);
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f("asrResultStr=" + str2));
        }

        @Override // com.moyoung.lib.ai.asr.a
        public void onSuccess(com.moyoung.lib.ai.asr.e eVar) {
            Log.d("MoyAI", "onSuccess: " + eVar);
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(eVar));
            if (g.this.isCanceled) {
                return;
            }
            g.this.asrCallback.onRecognizeResult(eVar.getText());
        }
    }

    public g(r.a aVar) {
        this.asrCallback = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static byte[] fileToByteArray(File file) {
        FileInputStream fileInputStream;
        Throwable th;
        ?? r62;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th2) {
                th = th2;
                r62 = file;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        fileInputStream.close();
                        byteArrayOutputStream.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    return byteArray;
                } catch (IOException e9) {
                    e = e9;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                            return null;
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    return null;
                }
            } catch (IOException e11) {
                e = e11;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                r62 = 0;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                        throw th;
                    }
                }
                if (r62 != 0) {
                    r62.close();
                }
                throw th;
            }
        } catch (IOException e13) {
            e = e13;
            byteArrayOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            r62 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ w lambda$requestAFlashASR$0(String str, String str2) {
        Log.d("AFlash", "onSuccess: " + str2);
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f("asrResultStr=" + str + ",,," + str2));
        if (this.isCanceled) {
            return null;
        }
        this.asrCallback.onRecognizeResult(str2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ w lambda$requestAFlashASR$1(String str, ErrorCode errorCode) {
        String str2 = "errorCode: " + errorCode.getCode() + "，Message：" + errorCode.getMessage();
        com.crrepa.band.my.device.ai.helper.c.checkUnauthorized(errorCode.getCode());
        this.asrCallback.onRecognizeError(str2);
        Log.d("AFlash", str2);
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f("asrResultStr=" + str2));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestHuaqiaoASR$2(String str) {
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(str));
        if (this.isCanceled) {
            return;
        }
        try {
            AsrOverseaResp asrOverseaResp = (AsrOverseaResp) new Gson().fromJson(str, AsrOverseaResp.class);
            if (FirebaseAnalytics.Param.SUCCESS.equals(asrOverseaResp.getStatus())) {
                this.asrCallback.onRecognizeResult(asrOverseaResp.getRows().getDisplayText());
            } else {
                this.asrCallback.onRecognizeError(asrOverseaResp.getMessage());
            }
        } catch (Exception unused) {
            this.asrCallback.onRecognizeError("数据异常");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestHuaqiaoASR$3(String str) {
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(str));
        if (this.isCanceled) {
            return;
        }
        try {
            AsrResp asrResp = (AsrResp) new Gson().fromJson(str, AsrResp.class);
            if (asrResp.getErr_no() == 0) {
                this.asrCallback.onRecognizeResult(asrResp.getResult().get(0));
            } else {
                this.asrCallback.onRecognizeError(asrResp.getErr_msg());
            }
        } catch (Exception unused) {
            this.asrCallback.onRecognizeError("数据异常");
        }
    }

    private void requestAFlashASR(File file) {
        String currentLanguage = b.getCurrentLanguage();
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.e(currentLanguage + ",,," + file));
        AFlash.Companion.getInstance().speechToText(com.moyoung.dafit.module.common.utils.d.get(), com.crrepa.band.my.device.ai.helper.d.getUUID(), com.crrepa.band.my.device.ai.helper.c.getWID(), com.crrepa.band.my.device.ai.helper.d.getUUID(), fileToByteArray(file), "pcm", currentLanguage, new f6.p() { // from class: com.crrepa.band.my.device.ai.asr.c
            @Override // f6.p
            public final Object invoke(Object obj, Object obj2) {
                w lambda$requestAFlashASR$0;
                lambda$requestAFlashASR$0 = g.this.lambda$requestAFlashASR$0((String) obj, (String) obj2);
                return lambda$requestAFlashASR$0;
            }
        }, new f6.p() { // from class: com.crrepa.band.my.device.ai.asr.d
            @Override // f6.p
            public final Object invoke(Object obj, Object obj2) {
                w lambda$requestAFlashASR$1;
                lambda$requestAFlashASR$1 = g.this.lambda$requestAFlashASR$1((String) obj, (ErrorCode) obj2);
                return lambda$requestAFlashASR$1;
            }
        });
    }

    private void requestASR(File file) {
        if (AIProvider.getProviderType() == 0) {
            requestHuaqiaoASR(file);
        } else if (AIProvider.getProviderType() == 1) {
            requestAFlashASR(file);
        } else {
            requestMoyASR(file);
        }
    }

    private void requestHuaqiaoASR(File file) {
        CtHelper.Companion companion = CtHelper.Companion;
        if (companion.get().isOverseas()) {
            Audio2TextBodyRaw audio2TextBodyRaw = new Audio2TextBodyRaw(file);
            audio2TextBodyRaw.language = com.crrepa.band.my.device.ai.helper.g.getAISupportedLanguageCode();
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.e(audio2TextBodyRaw));
            companion.get().audio2TextRawOverseas(audio2TextBodyRaw, new ISimpleCallback() { // from class: com.crrepa.band.my.device.ai.asr.e
                @Override // com.artillery.ctc.interfaces.ISimpleCallback
                public final void onSuccess(String str) {
                    g.this.lambda$requestHuaqiaoASR$2(str);
                }
            });
            return;
        }
        String encodeToString = Base64Utils.Companion.encodeToString(file);
        int i8 = com.moyoung.dafit.module.common.utils.u.isZH() ? 1537 : 1737;
        Audio2TextBody audio2TextBody = new Audio2TextBody(encodeToString, file.length());
        audio2TextBody.dev_pid = Integer.valueOf(i8);
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.e(audio2TextBody));
        companion.get().audio2TextByJson(audio2TextBody, new ISimpleCallback() { // from class: com.crrepa.band.my.device.ai.asr.f
            @Override // com.artillery.ctc.interfaces.ISimpleCallback
            public final void onSuccess(String str) {
                g.this.lambda$requestHuaqiaoASR$3(str);
            }
        });
    }

    private void requestMoyASR(File file) {
        String absolutePath = file.getAbsolutePath();
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.e(absolutePath));
        com.moyoung.lib.ai.e.get().asr.speechToText(new d.a().setAudioFilePath(absolutePath).build(), new a());
    }

    @Override // com.crrepa.band.my.device.ai.asr.r
    public void cancel() {
        this.isCanceled = true;
    }

    public void recognizePcmFileByte(int i8, boolean z7) {
        if (!a0.isNetworkConnected(com.moyoung.dafit.module.common.utils.d.get())) {
            com.crrepa.band.my.device.ai.helper.d.sendAIError(i8, CRPChatErrorCode.NET_ERROR);
            com.crrepa.band.my.device.ai.helper.d.sendHisiliconAIError(i8, HisiliconErrorCode.NETWORK_ERROR);
        } else {
            if (com.crrepa.band.my.device.ai.helper.d.isUnauthorizedAndShowTips() && com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
                return;
            }
            requestASR(new File(q.getPcmFilePath()));
            if (i8 == 1) {
                com.crrepa.band.my.device.ai.helper.d.logGPTASREvent(z7);
            } else {
                if (i8 == 3) {
                    return;
                }
                com.crrepa.band.my.device.ai.helper.d.logPictureASREvent(z7);
            }
        }
    }

    @Override // com.crrepa.band.my.device.ai.asr.r
    public void startRecognize(int i8, boolean z7) {
        this.isCanceled = false;
        recognizePcmFileByte(i8, z7);
    }
}
