package com.crrepa.band.my.device.localmusic;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogLocalMusicUploadingBinding;
import com.crrepa.band.my.device.localmusic.model.SongBean;
import com.crrepa.band.my.device.localmusic.model.event.MusicUploadCompletedEvent;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.band.provider.BtBluetoothProvider;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.conn.type.CRPMcuPlatform;
import com.crrepa.ble.trans.music.CRPMusicTrainsInitiator;
import com.moyoung.dafit.module.common.baseui.BaseVBDialog;
import com.moyoung.dafit.module.common.utils.g0;
import com.moyoung.dafit.module.common.utils.r0;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class MusicUploadingDialog extends BaseVBDialog<DialogLocalMusicUploadingBinding> implements CRPFileTransListener {
    private int currentSongIndex;
    private String currentSongName;
    private final a onSongUploadChangedListener;
    private final List<SongBean> selectedSongList;
    private final CRPMusicTrainsInitiator trainsInitiator;

    public interface a {
        void onCanceled();

        void onCompleted();

        void onLastSongFailed();
    }

    public MusicUploadingDialog(Context context, List<SongBean> list, a aVar) {
        super(context);
        this.currentSongIndex = 0;
        this.trainsInitiator = CRPMusicTrainsInitiator.getInstance();
        this.selectedSongList = list;
        this.onSongUploadChangedListener = aVar;
        lambda$onTransProgressChanged$2(0);
        uploadOneFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        this.trainsInitiator.abort();
        dismiss();
        a aVar = this.onSongUploadChangedListener;
        if (aVar != null) {
            aVar.onCanceled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$4() {
        dismiss();
        a aVar = this.onSongUploadChangedListener;
        if (aVar != null) {
            aVar.onLastSongFailed();
        }
        r0.showShort(com.moyoung.dafit.module.common.utils.d.get(), R.string.device_local_music_uploading_failure_alrt_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTransCompleted$3() {
        lambda$onTransProgressChanged$2(100);
        i.saveMusicSavedCount(i.getMusicSavedCount() + 1);
        org.greenrobot.eventbus.c.getDefault().post(new MusicUploadCompletedEvent(this.currentSongName));
        uploadNextFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTransProgressStarting$1() {
        lambda$onTransProgressChanged$2(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: renderUnloadingPercent, reason: merged with bridge method [inline-methods] */
    public void lambda$onTransProgressChanged$2(int i8) {
        Log.d("MusicUploadingDialog", "renderUnloadingPercent: " + i8);
        if (i8 < 0) {
            return;
        }
        ((DialogLocalMusicUploadingBinding) this.binding).tvTitle.setText(getContext().getResources().getString(R.string.device_local_music_uploading_progress_alrt_title) + (" (" + (this.currentSongIndex + 1) + "/" + this.selectedSongList.size() + ")"));
        ((DialogLocalMusicUploadingBinding) this.binding).tvProgress.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf(i8)));
        ((DialogLocalMusicUploadingBinding) this.binding).pb.setProgress(i8);
    }

    private void uploadNextFile() {
        int i8 = this.currentSongIndex + 1;
        this.currentSongIndex = i8;
        if (i8 < this.selectedSongList.size()) {
            uploadOneFile();
            return;
        }
        dismiss();
        a aVar = this.onSongUploadChangedListener;
        if (aVar != null) {
            aVar.onCompleted();
        }
    }

    private void uploadOneFile() {
        CRPMcuPlatform cRPMcuPlatform = CRPMcuPlatform.PLATFORM_HISILICON;
        if (BandInfoManager.getMcuPlatform() != cRPMcuPlatform.getValue()) {
            cRPMcuPlatform = CRPMcuPlatform.PLATFORM_JIELI;
        }
        CRPMcuPlatform cRPMcuPlatform2 = cRPMcuPlatform;
        String address = BtBluetoothProvider.getAddress();
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isDisConnected() || TextUtils.isEmpty(address)) {
            r0.showShort(com.moyoung.dafit.module.common.utils.d.get(), R.string.common_device_disconnected_tips);
            dismiss();
            return;
        }
        if (BandBatteryProvider.isOtaLowBattery()) {
            r0.showShort(R.string.measure_low_battery_hint);
            dismiss();
            return;
        }
        SongBean songBean = this.selectedSongList.get(this.currentSongIndex);
        String filePath = songBean.getFilePath();
        this.currentSongName = songBean.title + g0.getFileSuffixFromPath(filePath);
        this.trainsInitiator.start(cRPMcuPlatform2, address, new File(filePath), this.currentSongName, this);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (getWindow() != null) {
            getWindow().clearFlags(128);
        }
        super.dismiss();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        if (getWindow() == null) {
            return;
        }
        getWindow().addFlags(128);
        setCanceledOnTouchOutside(false);
        getWindow().setLayout(-1, -2);
        ((DialogLocalMusicUploadingBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localmusic.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicUploadingDialog.this.lambda$initBinding$0(view);
            }
        });
    }

    @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
    public void onError(int i8) {
        ((DialogLocalMusicUploadingBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.localmusic.t
            @Override // java.lang.Runnable
            public final void run() {
                MusicUploadingDialog.this.lambda$onError$4();
            }
        });
        Log.e("MusicUploadingDialog", "onError: " + i8);
    }

    @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
    public void onTransCompleted() {
        ((DialogLocalMusicUploadingBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.localmusic.s
            @Override // java.lang.Runnable
            public final void run() {
                MusicUploadingDialog.this.lambda$onTransCompleted$3();
            }
        });
        Log.e("MusicUploadingDialog", "onTransCompleted");
    }

    @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
    public void onTransProgressChanged(final int i8) {
        ((DialogLocalMusicUploadingBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.localmusic.u
            @Override // java.lang.Runnable
            public final void run() {
                MusicUploadingDialog.this.lambda$onTransProgressChanged$2(i8);
            }
        });
        Log.d("MusicUploadingDialog", "onTransProgressChanged: " + i8);
    }

    @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
    public void onTransProgressStarting() {
        ((DialogLocalMusicUploadingBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.localmusic.w
            @Override // java.lang.Runnable
            public final void run() {
                MusicUploadingDialog.this.lambda$onTransProgressStarting$1();
            }
        });
        Log.e("MusicUploadingDialog", "onTransProgressStarting");
    }
}
