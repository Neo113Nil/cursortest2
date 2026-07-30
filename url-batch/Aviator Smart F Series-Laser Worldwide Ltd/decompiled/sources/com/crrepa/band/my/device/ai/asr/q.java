package com.crrepa.band.my.device.ai.asr;

import android.util.Log;
import androidx.annotation.NonNull;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ai.asr.decoder.b;
import com.crrepa.band.my.device.ai.asr.model.AsrRecordStatusEvent;
import com.crrepa.band.my.device.ai.chat.model.HisiliconErrorCode;
import com.crrepa.ble.conn.type.CRPChatErrorCode;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.g0;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public class q {
    public static final String OPUS_FILE_NAME = "record.opus";
    public static final String PCM_FILE_NAME = "record.pcm";
    private final int aiType;
    private com.crrepa.band.my.device.ai.asr.decoder.b decoder;
    private FileOutputStream fos;

    class a implements b.a {
        a() {
        }

        @Override // com.crrepa.band.my.device.ai.asr.decoder.b.a
        public void onComplete() {
            org.greenrobot.eventbus.c.getDefault().post(new AsrRecordStatusEvent(q.this.aiType, 1));
        }

        @Override // com.crrepa.band.my.device.ai.asr.decoder.b.a
        public void onError(String str) {
            com.crrepa.band.my.device.ai.helper.d.sendAIError(q.this.aiType, CRPChatErrorCode.VOICE_CONVERSION_ERROR);
            com.crrepa.band.my.device.ai.helper.d.sendHisiliconAIError(q.this.aiType, HisiliconErrorCode.NETWORK_ERROR);
        }

        @Override // com.crrepa.band.my.device.ai.asr.decoder.b.a
        public void onStart() {
        }
    }

    public q(int i8) {
        this.aiType = i8;
    }

    @NonNull
    public static String getOpusFilePath() {
        return g0.getMusicFilePath(com.moyoung.dafit.module.common.utils.d.get(), OPUS_FILE_NAME);
    }

    @NonNull
    public static String getPcmFilePath() {
        return g0.getMusicFilePath(com.moyoung.dafit.module.common.utils.d.get(), PCM_FILE_NAME);
    }

    public void cancelRecord() {
        org.greenrobot.eventbus.c.getDefault().post(new AsrRecordStatusEvent(this.aiType, 2));
    }

    public void recording(byte[] bArr) {
        com.crrepa.band.my.device.ai.asr.decoder.b bVar = this.decoder;
        if (bVar == null) {
            return;
        }
        try {
            bVar.decode(bArr);
            this.fos.write(bArr);
        } catch (IOException e8) {
            Log.d("AudioDecoderDelegate", "recording: " + e8.getMessage());
        }
    }

    public void startRecord() {
        if (!a0.isNetworkConnected(com.moyoung.dafit.module.common.utils.d.get())) {
            com.crrepa.band.my.device.ai.helper.d.sendAIError(this.aiType, CRPChatErrorCode.NET_ERROR);
            com.crrepa.band.my.device.ai.helper.d.sendHisiliconAIError(this.aiType, HisiliconErrorCode.NETWORK_ERROR);
            return;
        }
        try {
            this.fos = new FileOutputStream(getOpusFilePath(), false);
            org.greenrobot.eventbus.c.getDefault().post(new AsrRecordStatusEvent(this.aiType, 0));
            int i8 = this.aiType;
            if (i8 == 1) {
                i4.getInstance().sendChatActivateRecording();
            } else if (i8 == 3) {
                i4.getInstance().sendFetchActivateRecording();
            } else {
                i4.getInstance().sendAIWatchFaceActivateRecording();
            }
        } catch (IOException e8) {
            e8.printStackTrace();
            com.crrepa.band.my.device.ai.helper.d.sendAIError(this.aiType, CRPChatErrorCode.VOICE_CONVERSION_ERROR);
            com.crrepa.band.my.device.ai.helper.d.sendHisiliconAIError(this.aiType, HisiliconErrorCode.AI_SERVER_BUSY);
        }
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isJieli()) {
            this.decoder = new com.crrepa.band.my.device.ai.asr.decoder.c();
            return;
        }
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isRealtek()) {
            this.decoder = new com.crrepa.band.my.device.ai.asr.decoder.d(com.moyoung.dafit.module.common.utils.d.get());
            return;
        }
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isSifli()) {
            this.decoder = new com.crrepa.band.my.device.ai.asr.decoder.e();
        } else if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            this.decoder = new com.crrepa.band.my.device.ai.asr.decoder.a();
        } else {
            this.decoder = new com.crrepa.band.my.device.ai.asr.decoder.c();
        }
    }

    public void stopRecord() {
        FileOutputStream fileOutputStream;
        if (this.decoder == null || (fileOutputStream = this.fos) == null) {
            com.crrepa.band.my.device.ai.helper.d.sendAIError(this.aiType, CRPChatErrorCode.VOICE_CONVERSION_ERROR);
            com.crrepa.band.my.device.ai.helper.d.sendHisiliconAIError(this.aiType, HisiliconErrorCode.NETWORK_ERROR);
        } else {
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
                com.crrepa.band.my.device.ai.helper.d.sendAIError(this.aiType, CRPChatErrorCode.VOICE_CONVERSION_ERROR);
                com.crrepa.band.my.device.ai.helper.d.sendHisiliconAIError(this.aiType, HisiliconErrorCode.NETWORK_ERROR);
            }
            this.decoder.opus2Audio(getOpusFilePath(), getPcmFilePath(), new a());
        }
    }
}
