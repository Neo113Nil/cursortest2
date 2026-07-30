package com.crrepa.band.my.device.watchface.presenter;

import android.annotation.SuppressLint;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.watchface.model.WatchFaceDeleteCompleteEvent;
import com.crrepa.band.my.model.DownloadWatchFaceModel;
import com.crrepa.band.my.model.band.provider.BandStorageProvider;
import com.crrepa.band.my.model.db.DownloadWatchFace;
import com.crrepa.band.my.model.db.proxy.DownloadWatchFaceDaoProxy;
import com.crrepa.ble.conn.callback.CRPAvailableStorageCallback;
import com.crrepa.ble.conn.callback.CRPWatchFaceDeleteCallback;
import com.crrepa.ble.scan.bean.CRPScanRecordInfo;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class b implements com.moyoung.dafit.module.common.baseui.f {
    private int deleteWatchFaceId;
    private List<Integer> deleteWatchFaceList;
    private x1.a view;
    private DownloadWatchFaceDaoProxy watchFaceDaoProxy = new DownloadWatchFaceDaoProxy();
    private f watchFaceDeleteCallback = new f(this);

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(List<DownloadWatchFaceModel> list) {
            b.this.view.renderWatchFaceList(list);
        }
    }

    /* renamed from: com.crrepa.band.my.device.watchface.presenter.b$b, reason: collision with other inner class name */
    class C0189b implements Function {
        C0189b() {
        }

        @Override // io.reactivex.functions.Function
        public List<DownloadWatchFaceModel> apply(List<DownloadWatchFace> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<DownloadWatchFace> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new DownloadWatchFaceModel(it.next()));
            }
            return arrayList;
        }
    }

    class c implements Consumer {
        c() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            b.this.view.renderDeleteWatchFaceComplete();
        }
    }

    class d implements Consumer {
        d() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            b.this.view.renderDeleteWatchFaceError();
        }
    }

    static /* synthetic */ class e {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$ble$scan$bean$CRPScanRecordInfo$McuPlatform;

        static {
            int[] iArr = new int[CRPScanRecordInfo.McuPlatform.values().length];
            $SwitchMap$com$crrepa$ble$scan$bean$CRPScanRecordInfo$McuPlatform = iArr;
            try {
                iArr[CRPScanRecordInfo.McuPlatform.PLATFORM_SIFLI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$ble$scan$bean$CRPScanRecordInfo$McuPlatform[CRPScanRecordInfo.McuPlatform.PLATFORM_JIELI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static class f implements CRPWatchFaceDeleteCallback {
        private WeakReference<b> weakReference;

        public f(b bVar) {
            this.weakReference = new WeakReference<>(bVar);
        }

        @Override // com.crrepa.ble.conn.callback.CRPWatchFaceDeleteCallback
        public void onComplete() {
            b bVar = this.weakReference.get();
            if (bVar != null) {
                bVar.deleteWatchFaceComplete();
            }
        }

        @Override // com.crrepa.ble.conn.callback.CRPWatchFaceDeleteCallback
        public void onError() {
            b bVar = this.weakReference.get();
            if (bVar != null) {
                bVar.showDeleteWatchFaceError();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteWatchFaceComplete() {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().getMcuPlatform() == CRPScanRecordInfo.McuPlatform.PLATFORM_JIELI) {
            Iterator<Integer> it = this.deleteWatchFaceList.iterator();
            while (it.hasNext()) {
                this.watchFaceDaoProxy.delete(it.next().intValue());
            }
            this.deleteWatchFaceList.clear();
        } else {
            this.watchFaceDaoProxy.delete(this.deleteWatchFaceId);
        }
        startDeleteWatchFace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startDeleteWatchFace$0(int i8) {
        if (i8 == 0) {
            i8 = 1;
        }
        BandStorageProvider.saveAvailableStorage(i8 * 1024);
    }

    @SuppressLint({"CheckResult"})
    private void showDeleteWatchFaceComplete() {
        org.greenrobot.eventbus.c.getDefault().post(new WatchFaceDeleteCompleteEvent());
        Observable.just(0).observeOn(AndroidSchedulers.mainThread()).subscribe(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void showDeleteWatchFaceError() {
        Observable.timer(1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new d());
    }

    @SuppressLint({"CheckResult"})
    private void startDeleteWatchFace() {
        boolean deleteDownloadWatchFace;
        if (this.deleteWatchFaceList.isEmpty()) {
            showDeleteWatchFaceComplete();
            i4.getInstance().queryAvailableStorage(new CRPAvailableStorageCallback() { // from class: com.crrepa.band.my.device.watchface.presenter.a
                @Override // com.crrepa.ble.conn.callback.CRPAvailableStorageCallback
                public final void onAvailableSize(int i8) {
                    b.lambda$startDeleteWatchFace$0(i8);
                }
            });
            return;
        }
        int i8 = e.$SwitchMap$com$crrepa$ble$scan$bean$CRPScanRecordInfo$McuPlatform[com.crrepa.band.my.ble.band.utils.a.getInstance().getMcuPlatform().ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                int[] iArr = new int[this.deleteWatchFaceList.size()];
                for (int i9 = 0; i9 < this.deleteWatchFaceList.size(); i9++) {
                    iArr[i9] = this.deleteWatchFaceList.get(i9).intValue();
                }
                deleteDownloadWatchFace = i4.getInstance().deleteJieliDownloadWatchFace(iArr, this.watchFaceDeleteCallback);
            }
            showDeleteWatchFaceError();
        }
        this.deleteWatchFaceId = this.deleteWatchFaceList.remove(0).intValue();
        deleteDownloadWatchFace = i4.getInstance().deleteDownloadWatchFace(this.deleteWatchFaceId, this.watchFaceDeleteCallback);
        if (deleteDownloadWatchFace) {
            return;
        }
        showDeleteWatchFaceError();
    }

    public void deleteWatchFace(List<Integer> list) {
        this.deleteWatchFaceList = list;
        this.view.renderDeleteWatchFaceStart();
        startDeleteWatchFace();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    @SuppressLint({"CheckResult"})
    public void getDownloadWatchFace() {
        List<DownloadWatchFace> all = this.watchFaceDaoProxy.getAll();
        if (all != null) {
            Observable.just(all).map(new C0189b()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(x1.a aVar) {
        this.view = aVar;
    }
}
