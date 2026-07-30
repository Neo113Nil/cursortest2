package com.crrepa.band.my.device.ai.picture;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.crrepa.band.my.device.ai.AIForegroundService;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.picture.model.CRPWatchFaceLayoutInfoEvent;
import com.crrepa.band.my.device.ai.picture.model.ConfirmPreviewEvent;
import com.crrepa.band.my.device.ai.picture.model.RequestPreviewEvent;
import com.crrepa.ble.conn.bean.CRPAiWatchFacePreviewInfo;
import com.crrepa.ble.conn.bean.CRPJieliPhotoWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPPhotoWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.crrepa.ble.conn.listener.CRPAiWatchFaceChangeListener;
import com.crrepa.ble.conn.type.CRPBleRecordingType;
import com.crrepa.ble.conn.type.CRPWatchFaceType;

/* loaded from: classes2.dex */
public class c0 implements CRPAiWatchFaceChangeListener {
    private com.crrepa.band.my.device.ai.asr.q audioDecoderDelegate;
    private final Context context;
    private final Handler handler = new Handler(Looper.getMainLooper());

    public c0(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivateRecording$0() {
        this.audioDecoderDelegate.startRecord();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivateRecording$1() {
        if (this.audioDecoderDelegate == null) {
            this.audioDecoderDelegate = new com.crrepa.band.my.device.ai.asr.q(0);
            AIForegroundService.start(this.context);
        }
        this.handler.postDelayed(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.a0
            @Override // java.lang.Runnable
            public final void run() {
                c0.this.lambda$onActivateRecording$0();
            }
        }, 10L);
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiWatchFaceChangeListener
    public void onActivateRecording() {
        Log.d("AIWatchFaceChangeListen", "onActivateRecord");
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onActivateRecord()"));
        this.handler.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.b0
            @Override // java.lang.Runnable
            public final void run() {
                c0.this.lambda$onActivateRecording$1();
            }
        });
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiWatchFaceChangeListener
    public void onCancel() {
        Log.d("AIWatchFaceChangeListen", "onCancel");
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onCancel()"));
        com.crrepa.band.my.device.ai.asr.q qVar = this.audioDecoderDelegate;
        if (qVar != null) {
            qVar.cancelRecord();
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiWatchFaceChangeListener
    public void onConfirmPreview() {
        Log.d("AIWatchFaceChangeListen", "onConfirmPreview");
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onConfirmPreview()"));
        org.greenrobot.eventbus.c.getDefault().post(new ConfirmPreviewEvent());
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiWatchFaceChangeListener
    public void onPhotoWatchFace(CRPJieliPhotoWatchFaceInfo cRPJieliPhotoWatchFaceInfo) {
        Log.d("AIWatchFaceChangeListen", "CRPJieliPhotoWatchFaceInfo---" + cRPJieliPhotoWatchFaceInfo);
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onPhotoWatchFace()"));
        com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.saveJieliPhotoWatchFaceInfo(CRPWatchFaceType.AI_WATCH_FACE, cRPJieliPhotoWatchFaceInfo);
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiWatchFaceChangeListener
    public void onPhotoWatchFaceLayout(CRPPhotoWatchFaceLayoutInfo cRPPhotoWatchFaceLayoutInfo) {
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onPhotoWatchFaceLayout()"));
        if (cRPPhotoWatchFaceLayoutInfo != null) {
            Log.d("AIWatchFaceChangeListen", "CRPPhotoWatchFaceLayoutInfo---" + cRPPhotoWatchFaceLayoutInfo);
            com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.saveJieliWatchFaceLayoutInfo(CRPWatchFaceType.AI_WATCH_FACE, cRPPhotoWatchFaceLayoutInfo.getLayoutInfo());
        } else {
            Log.d("AIWatchFaceChangeListen", "CRPPhotoWatchFaceLayoutInfo=null");
        }
        com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.saveJieli707Platform();
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiWatchFaceChangeListener
    public void onRequestPreview(CRPAiWatchFacePreviewInfo cRPAiWatchFacePreviewInfo) {
        Log.d("AIWatchFaceChangeListen", "onRequestPreview=" + cRPAiWatchFacePreviewInfo);
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onRequestPreview()"));
        org.greenrobot.eventbus.c.getDefault().post(new RequestPreviewEvent(cRPAiWatchFacePreviewInfo));
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiWatchFaceChangeListener
    public void onStartRecording(byte[] bArr) {
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onRecording()"));
        com.crrepa.band.my.device.ai.asr.q qVar = this.audioDecoderDelegate;
        if (qVar == null) {
            return;
        }
        qVar.recording(bArr);
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiWatchFaceChangeListener
    public void onStopRecording(CRPBleRecordingType cRPBleRecordingType) {
        Log.d("AIWatchFaceChangeListen", "onStopRecord");
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onStopRecord()"));
        com.crrepa.band.my.device.ai.asr.q qVar = this.audioDecoderDelegate;
        if (qVar == null) {
            return;
        }
        qVar.stopRecord();
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiWatchFaceChangeListener
    public void onWatchFaceLayout(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo) {
        Log.d("AIWatchFaceChangeListen", "AIWatchFaceLayoutInfo---" + cRPWatchFaceLayoutInfo.getTextColor());
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onWatchFaceLayout()"));
        if (AIProvider.getAIWatchFaceLayoutInfo() == null) {
            AIProvider.saveAIWatchFaceLayoutInfo(cRPWatchFaceLayoutInfo);
        }
        org.greenrobot.eventbus.c.getDefault().post(new CRPWatchFaceLayoutInfoEvent(cRPWatchFaceLayoutInfo));
    }
}
