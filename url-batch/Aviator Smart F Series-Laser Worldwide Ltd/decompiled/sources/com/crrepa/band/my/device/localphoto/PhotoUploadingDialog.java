package com.crrepa.band.my.device.localphoto;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.localphoto.model.LocalImageModel;
import com.crrepa.band.my.device.localphoto.model.SavedPhotoInfoEvent;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.band.my.model.band.provider.BtBluetoothProvider;
import com.crrepa.ble.conn.listener.CRPGalleryTransListener;
import com.moyoung.dafit.module.common.baseui.BaseCustomUploadingDialog;
import com.moyoung.dafit.module.common.databinding.DialogCustomUploadingBinding;
import com.moyoung.dafit.module.common.utils.g0;
import com.moyoung.dafit.module.common.utils.r0;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class PhotoUploadingDialog extends BaseCustomUploadingDialog implements CRPGalleryTransListener {
    private final CompositeDisposable disposableList;
    private a uploadListener;

    public interface a {
        void onCanceled();

        void onCompleted();

        void onFailed();
    }

    public PhotoUploadingDialog(Context context) {
        super(context);
        this.disposableList = new CompositeDisposable();
        org.greenrobot.eventbus.c.getDefault().register(this);
        lambda$onTransProgressChanged$3(0);
    }

    private static List<File> copyFile(List<File> list) {
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        int i8 = 11;
        for (File file : list) {
            File file2 = new File(LocalImageModel.getLocalPhotoDir(), (i8 + currentTimeMillis) + g0.getFileSuffixFromPath(file.getName()));
            com.moyoung.dafit.module.common.utils.q.copyFile(file, file2);
            arrayList.add(file2);
            i8++;
        }
        return arrayList;
    }

    public static Observable<List<File>> executeCopyFile(final List<File> list) {
        return Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.device.localphoto.u
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                PhotoUploadingDialog.lambda$executeCopyFile$7(list, observableEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$executeCopyFile$7(List list, ObservableEmitter observableEmitter) {
        observableEmitter.onNext(copyFile(list));
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        a aVar = this.uploadListener;
        if (aVar != null) {
            aVar.onCanceled();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$6() {
        a aVar = this.uploadListener;
        if (aVar != null) {
            aVar.onFailed();
        }
        r0.showShort(com.moyoung.dafit.module.common.utils.d.get(), R.string.contact_upload_fail);
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTransCompleted$5() {
        lambda$onTransProgressChanged$3(100);
        a aVar = this.uploadListener;
        if (aVar != null) {
            aVar.onCompleted();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTransProgressStarting$2() {
        lambda$onTransProgressChanged$3(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uploadFile$1(List list) {
        i4.getInstance().sendLocalPhoto(list, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: renderUploadingPercent, reason: merged with bridge method [inline-methods] */
    public void lambda$onTransProgressChanged$3(int i8) {
        if (i8 < 0) {
            return;
        }
        setProgress(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    /* renamed from: renderUploadingTitle, reason: merged with bridge method [inline-methods] */
    public void lambda$onTransPhotoChanged$4(int i8, int i9) {
        setTitleTxt(getContext().getResources().getString(R.string.device_video_watch_face_cutting_title) + " (" + (i8 + 1) + "/" + i9 + ")");
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        i4.getInstance().abortSendLocalPhoto();
        this.disposableList.clear();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        this.uploadListener = null;
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
        hideProgressTv();
        ((DialogCustomUploadingBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localphoto.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoUploadingDialog.this.lambda$initBinding$0(view);
            }
        });
    }

    @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
    public void onError(int i8) {
        Log.d("PhotoUploadingDialog", "onError: " + i8);
        i4.getInstance().queryLocalPhotoInfo();
        ((DialogCustomUploadingBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.localphoto.z
            @Override // java.lang.Runnable
            public final void run() {
                PhotoUploadingDialog.this.lambda$onError$6();
            }
        });
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(m0.a aVar) {
        if (aVar.getState() != 2) {
            i4.getInstance().abortSendLocalVideo();
            r0.showShort(R.string.common_device_disconnected_tips);
            a aVar2 = this.uploadListener;
            if (aVar2 != null) {
                aVar2.onFailed();
            }
            dismiss();
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
    public void onTransCompleted() {
        Log.d("PhotoUploadingDialog", "onTransCompleted");
        org.greenrobot.eventbus.c.getDefault().post(new SavedPhotoInfoEvent());
        ((DialogCustomUploadingBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.localphoto.x
            @Override // java.lang.Runnable
            public final void run() {
                PhotoUploadingDialog.this.lambda$onTransCompleted$5();
            }
        });
    }

    @Override // com.crrepa.ble.conn.listener.CRPGalleryTransListener
    public void onTransPhotoChanged(final int i8, final int i9) {
        ((DialogCustomUploadingBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.localphoto.w
            @Override // java.lang.Runnable
            public final void run() {
                PhotoUploadingDialog.this.lambda$onTransPhotoChanged$4(i9, i8);
            }
        });
        Log.d("PhotoUploadingDialog", "onTransPhotoChanged: " + i9 + "/" + i8);
    }

    @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
    public void onTransProgressChanged(final int i8) {
        ((DialogCustomUploadingBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.localphoto.v
            @Override // java.lang.Runnable
            public final void run() {
                PhotoUploadingDialog.this.lambda$onTransProgressChanged$3(i8);
            }
        });
        Log.d("PhotoUploadingDialog", "onTransProgressChanged: " + i8);
    }

    @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
    public void onTransProgressStarting() {
        ((DialogCustomUploadingBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.localphoto.t
            @Override // java.lang.Runnable
            public final void run() {
                PhotoUploadingDialog.this.lambda$onTransProgressStarting$2();
            }
        });
        Log.d("PhotoUploadingDialog", "onTransProgressStarting");
    }

    public void setListener(a aVar) {
        this.uploadListener = aVar;
    }

    public void uploadFile(List<File> list) {
        String address = BtBluetoothProvider.getAddress();
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isDisConnected() || TextUtils.isEmpty(address)) {
            r0.showShort(R.string.common_device_disconnected_tips);
            dismiss();
        } else if (BandBatteryProvider.isOtaLowBattery()) {
            r0.showShort(R.string.measure_low_battery_hint);
            dismiss();
        } else {
            lambda$onTransPhotoChanged$4(0, list.size());
            this.disposableList.add(executeCopyFile(list).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.localphoto.s
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PhotoUploadingDialog.this.lambda$uploadFile$1((List) obj);
                }
            }));
        }
    }
}
