package com.crrepa.band.my.device.localvideo;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.band.my.model.band.provider.BtBluetoothProvider;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.moyoung.dafit.module.common.baseui.BaseCustomUploadingDialog;
import com.moyoung.dafit.module.common.databinding.DialogCustomUploadingBinding;
import com.moyoung.dafit.module.common.utils.r0;
import java.io.File;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class VideoUploadingDialog extends BaseCustomUploadingDialog implements CRPFileTransListener {
    private a onVideoUploadChangedListener;

    public interface a {
        void onCanceled();

        void onCompleted();

        void onFailed();
    }

    public VideoUploadingDialog(Context context) {
        super(context);
        org.greenrobot.eventbus.c.getDefault().register(this);
        lambda$onTransProgressChanged$2(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        a aVar = this.onVideoUploadChangedListener;
        if (aVar != null) {
            aVar.onCanceled();
        }
        i4.getInstance().abortSendLocalVideo();
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$4() {
        a aVar = this.onVideoUploadChangedListener;
        if (aVar != null) {
            aVar.onFailed();
        }
        r0.showShort(com.moyoung.dafit.module.common.utils.d.get(), R.string.contact_upload_fail);
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTransCompleted$3() {
        lambda$onTransProgressChanged$2(100);
        a aVar = this.onVideoUploadChangedListener;
        if (aVar != null) {
            aVar.onCompleted();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTransProgressStarting$1() {
        lambda$onTransProgressChanged$2(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: renderUploadingPercent, reason: merged with bridge method [inline-methods] */
    public void lambda$onTransProgressChanged$2(int i8) {
        Log.d("VideoUploadingDialog", "renderUploadingPercent: " + i8);
        if (i8 < 0) {
            return;
        }
        setProgress(i8);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        this.onVideoUploadChangedListener = null;
        if (getWindow() != null) {
            getWindow().clearFlags(128);
        }
        super.dismiss();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseCustomUploadingDialog, com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        if (getWindow() == null) {
            return;
        }
        getWindow().addFlags(128);
        setCanceledOnTouchOutside(false);
        getWindow().setLayout(-1, -2);
        setTitleTxt(R.string.device_local_video_uploading);
        setCancelTxt(R.string.cancel);
        hideProgressTv();
        ((DialogCustomUploadingBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localvideo.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoUploadingDialog.this.lambda$initBinding$0(view);
            }
        });
    }

    @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
    public void onError(int i8) {
        Log.d("VideoUploadingDialog", "onError: " + i8);
        ((DialogCustomUploadingBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.localvideo.p
            @Override // java.lang.Runnable
            public final void run() {
                VideoUploadingDialog.this.lambda$onError$4();
            }
        });
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(m0.a aVar) {
        if (aVar.getState() != 2) {
            i4.getInstance().abortSendLocalVideo();
            r0.showShort(R.string.common_device_disconnected_tips);
            dismiss();
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
    public void onTransCompleted() {
        Log.d("VideoUploadingDialog", "onTransCompleted");
        i4.getInstance().queryLocalVideoInfo();
        ((DialogCustomUploadingBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.localvideo.q
            @Override // java.lang.Runnable
            public final void run() {
                VideoUploadingDialog.this.lambda$onTransCompleted$3();
            }
        });
    }

    @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
    public void onTransProgressChanged(final int i8) {
        ((DialogCustomUploadingBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.localvideo.n
            @Override // java.lang.Runnable
            public final void run() {
                VideoUploadingDialog.this.lambda$onTransProgressChanged$2(i8);
            }
        });
        Log.d("VideoUploadingDialog", "onTransProgressChanged: " + i8);
    }

    @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
    public void onTransProgressStarting() {
        ((DialogCustomUploadingBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.localvideo.o
            @Override // java.lang.Runnable
            public final void run() {
                VideoUploadingDialog.this.lambda$onTransProgressStarting$1();
            }
        });
        Log.d("VideoUploadingDialog", "onTransProgressStarting");
    }

    public void setListener(a aVar) {
        this.onVideoUploadChangedListener = aVar;
    }

    public void uploadFile(File file) {
        String address = BtBluetoothProvider.getAddress();
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isDisConnected() || TextUtils.isEmpty(address)) {
            r0.showShort(R.string.common_device_disconnected_tips);
            dismiss();
        } else if (!BandBatteryProvider.isOtaLowBattery()) {
            i4.getInstance().sendLocalVideo(file, this);
        } else {
            r0.showShort(R.string.measure_low_battery_hint);
            dismiss();
        }
    }
}
