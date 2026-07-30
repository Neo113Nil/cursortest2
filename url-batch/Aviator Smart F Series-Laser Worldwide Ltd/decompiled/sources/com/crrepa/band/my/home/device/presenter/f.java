package com.crrepa.band.my.home.device.presenter;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.watchface.model.BandWatchFaceChangeEvent;
import com.crrepa.band.my.device.watchface.model.TplsMsgUpdateEvent;
import com.crrepa.band.my.device.watchface.model.WatchFaceDeleteCompleteEvent;
import com.crrepa.band.my.device.watchface.model.WatchFaceDownloadCompleteEvent;
import com.crrepa.band.my.device.watchface.presenter.g;
import com.crrepa.band.my.device.watchfacenew.video.model.event.VideoWatchFaceSetSuccessEvent;
import com.crrepa.band.my.model.WatchFaceModel;
import com.crrepa.band.my.model.band.provider.BandDisplayWatchFaceProvider;
import com.crrepa.band.my.model.band.provider.BandStorageProvider;
import com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider;
import com.crrepa.band.my.model.band.provider.watchface.DefaultWatchFaceProvider;
import com.crrepa.band.my.model.band.provider.watchface.JieliWatchFaceProvider;
import com.crrepa.ble.conn.bean.CRPHisiliconWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPJieliSupportWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPSifliSupportWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPSupportWatchFaceInfo;
import com.crrepa.ble.conn.callback.CRPDeviceDisplayWatchFaceCallback;
import com.crrepa.ble.conn.callback.CRPDeviceSupportWatchFaceCallback;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class f implements com.moyoung.dafit.module.common.baseui.f {
    private o3.b view;
    private BaseWatchFaceProvider watchFaceProvider;
    private d supportWatchFaceCallback = new d(this);
    private c WatchFaceCallback = new c(this);

    class a implements Consumer {
        final /* synthetic */ List val$list;

        a(List list) {
            this.val$list = list;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(List<WatchFaceModel> list) {
            f.this.view.renderWatchFaceList(this.val$list);
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            f.this.view.renderDisplayWatchFaceIndex(num.intValue());
        }
    }

    static class c implements CRPDeviceDisplayWatchFaceCallback {
        private WeakReference<f> weakReference;

        public c(f fVar) {
            this.weakReference = new WeakReference<>(fVar);
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceDisplayWatchFaceCallback
        public void onDisplayWatchFace(int i8) {
            com.orhanobut.logger.f.d("onWatchFaces: " + i8);
            f fVar = this.weakReference.get();
            if (fVar == null) {
                return;
            }
            fVar.showDisplayWatchFaceIndex(i8);
            fVar.saveDisplayWatchFaceIndex(i8);
        }
    }

    private static class d implements CRPDeviceSupportWatchFaceCallback {
        private WeakReference<f> weakReference;

        public d(f fVar) {
            this.weakReference = new WeakReference<>(fVar);
        }

        private void handleWatchFaceStore(List<Integer> list, List<Integer> list2, boolean z7) {
            f fVar = this.weakReference.get();
            if (fVar != null) {
                fVar.getWatchFaceProvider().saveWatchFaceStoreInfo(list);
                if (z7) {
                    fVar.getWatchFaceProvider().saveDownloadWatchFace(list2);
                }
                fVar.getAllWatchFaces();
                fVar.getDisplayWatchFaceIndex();
            }
            org.greenrobot.eventbus.c.getDefault().post(new TplsMsgUpdateEvent());
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceSupportWatchFaceCallback
        public void onHisiliconSupportWatchFace(CRPHisiliconWatchFaceInfo cRPHisiliconWatchFaceInfo) {
            com.orhanobut.logger.f.d("onHisiliconSupportWatchFace: " + cRPHisiliconWatchFaceInfo);
            if (cRPHisiliconWatchFaceInfo != null) {
                List<Integer> savedWatchFaceList = cRPHisiliconWatchFaceInfo.getSavedWatchFaceList();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(cRPHisiliconWatchFaceInfo.getTemplateID()));
                JieliWatchFaceProvider.saveWatchFaceApi(cRPHisiliconWatchFaceInfo.getSingleFloat());
                JieliWatchFaceProvider.saveWatchFaceFeature(cRPHisiliconWatchFaceInfo.getMultipleFloats());
                JieliWatchFaceProvider.saveWatchFaceConfig(new byte[]{(byte) cRPHisiliconWatchFaceInfo.getTextType()});
                handleWatchFaceStore(arrayList, savedWatchFaceList, true);
            }
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceSupportWatchFaceCallback
        public void onJieliDownloadWatchFaceList(List<Integer> list) {
            f fVar = this.weakReference.get();
            com.orhanobut.logger.f.d("onJieliDownloadWatchFaceList: " + list);
            if (fVar != null) {
                BandDisplayWatchFaceProvider.saveJieliMultipleDownloadWatchFace();
                fVar.getWatchFaceProvider().saveDownloadWatchFace(list);
                fVar.showDownloadWatchFaceEdit();
            }
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceSupportWatchFaceCallback
        public void onJieliSupportWatchFace(CRPJieliSupportWatchFaceInfo cRPJieliSupportWatchFaceInfo) {
            if (cRPJieliSupportWatchFaceInfo != null) {
                com.orhanobut.logger.f.d("onJieliSupportWatchFace: " + cRPJieliSupportWatchFaceInfo);
                List<Integer> supportTypeList = cRPJieliSupportWatchFaceInfo.getSupportTypeList();
                ArrayList arrayList = new ArrayList();
                int displayWatchFace = cRPJieliSupportWatchFaceInfo.getDisplayWatchFace();
                if (displayWatchFace <= 0) {
                    displayWatchFace = 65535;
                }
                arrayList.add(Integer.valueOf(displayWatchFace));
                handleWatchFaceStore(supportTypeList, arrayList, !com.crrepa.band.my.ble.band.utils.a.getInstance().isMultipleDownloadWatchFace());
                int watchFaceMaxSize = cRPJieliSupportWatchFaceInfo.getWatchFaceMaxSize();
                BandStorageProvider.saveAvailableStorage(watchFaceMaxSize > 0 ? watchFaceMaxSize : 1);
            }
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceSupportWatchFaceCallback
        public void onSifliSupportWatchFace(CRPSifliSupportWatchFaceInfo cRPSifliSupportWatchFaceInfo) {
            if (cRPSifliSupportWatchFaceInfo != null) {
                com.orhanobut.logger.f.d("onSifliSupportWatchFace: " + cRPSifliSupportWatchFaceInfo);
                List<CRPSifliSupportWatchFaceInfo.WatchFace> list = cRPSifliSupportWatchFaceInfo.getList();
                ArrayList arrayList = new ArrayList();
                if (list != null && !list.isEmpty()) {
                    for (CRPSifliSupportWatchFaceInfo.WatchFace watchFace : list) {
                        if (watchFace.getState() == CRPSifliSupportWatchFaceInfo.InstalledState.INSTALLED) {
                            arrayList.add(Integer.valueOf(watchFace.getId()));
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(cRPSifliSupportWatchFaceInfo.getType()));
                handleWatchFaceStore(arrayList2, arrayList, true);
            }
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceSupportWatchFaceCallback
        public void onSupportWatchFace(CRPSupportWatchFaceInfo cRPSupportWatchFaceInfo) {
            if (cRPSupportWatchFaceInfo != null) {
                com.orhanobut.logger.f.d("onSupportWatchFace: " + cRPSupportWatchFaceInfo);
                List<Integer> supportWatchFaceList = cRPSupportWatchFaceInfo.getSupportWatchFaceList();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(cRPSupportWatchFaceInfo.getDisplayWatchFace()));
                handleWatchFaceStore(supportWatchFaceList, arrayList, true);
            }
        }
    }

    public f() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveDisplayWatchFaceIndex(int i8) {
        BandDisplayWatchFaceProvider.setDisplayWatchFaceIndex(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void showDisplayWatchFaceIndex(int i8) {
        if (this.view != null) {
            Observable.just(Integer.valueOf(i8)).observeOn(AndroidSchedulers.mainThread()).subscribe(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDownloadWatchFaceEdit() {
        if (this.view != null) {
            Observable observeOn = Observable.just(Boolean.valueOf(com.crrepa.band.my.ble.band.utils.a.getInstance().isMultipleDownloadWatchFace())).observeOn(AndroidSchedulers.mainThread());
            final o3.b bVar = this.view;
            Objects.requireNonNull(bVar);
            observeOn.subscribe(new Consumer() { // from class: com.crrepa.band.my.home.device.presenter.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    o3.b.this.renderDownloadWatchFaceEdit(((Boolean) obj).booleanValue());
                }
            });
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @SuppressLint({"CheckResult"})
    public void getAllWatchFaces() {
        List<WatchFaceModel> allWatchFace = getWatchFaceProvider().getAllWatchFace();
        if (this.view != null) {
            Observable.just(allWatchFace).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(allWatchFace));
        }
    }

    public void getDisplayWatchFaceIndex() {
        i4.getInstance().queryBandWatchFaceIndex(this.WatchFaceCallback);
    }

    public void getLocalDisplayWatchFaceIndex() {
        showDisplayWatchFaceIndex(BandDisplayWatchFaceProvider.getDisplayWatchFaceIndex());
    }

    public BaseWatchFaceProvider getWatchFaceProvider() {
        if (this.watchFaceProvider == null) {
            this.watchFaceProvider = new DefaultWatchFaceProvider();
        }
        return this.watchFaceProvider;
    }

    public void getWatchFaceStore() {
        if (!getWatchFaceProvider().hasWatchFaceStore()) {
            getDisplayWatchFaceIndex();
        } else {
            showDownloadWatchFaceEdit();
            i4.getInstance().queryBandSupportWatchFace(this.supportWatchFaceCallback);
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandConnectStateChangeEvent(m0.a aVar) {
        com.orhanobut.logger.f.d("onBandConnectStateChangeEvent: " + aVar.getState());
        if (aVar.getState() == 2) {
            getWatchFaceStore();
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandWatchFaceChangeEvent(BandWatchFaceChangeEvent bandWatchFaceChangeEvent) {
        getAllWatchFaces();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(com.crrepa.band.my.device.ai.b bVar) {
        getAllWatchFaces();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onWatchFaceDeleteCompleteEvent(WatchFaceDeleteCompleteEvent watchFaceDeleteCompleteEvent) {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isJieli()) {
            i4.getInstance().queryBandSupportWatchFace(this.supportWatchFaceCallback);
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onWatchFaceDownloadCompleteEvent(WatchFaceDownloadCompleteEvent watchFaceDownloadCompleteEvent) {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isJieli() && com.crrepa.band.my.ble.band.utils.a.getInstance().isMultipleDownloadWatchFace()) {
            i4.getInstance().queryBandSupportWatchFace(this.supportWatchFaceCallback);
        }
        getAllWatchFaces();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    public void resetWatchFaceProvider() {
        this.watchFaceProvider = null;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
        getDisplayWatchFaceIndex();
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isNewWatchFace() && TextUtils.isEmpty(g.getWatchFaceTpls())) {
            i4.getInstance().queryBandSupportWatchFace(this.supportWatchFaceCallback);
        }
    }

    public void sendDisplayWatchFaceIndex(int i8) {
        if (!i4.getInstance().sendBandWatchFaceIndex(i8)) {
            this.view.renderUpdateDisplayWatchFaceError();
        } else {
            showDisplayWatchFaceIndex(i8);
            saveDisplayWatchFaceIndex(i8);
        }
    }

    public void setView(o3.b bVar) {
        this.view = bVar;
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(VideoWatchFaceSetSuccessEvent videoWatchFaceSetSuccessEvent) {
        getAllWatchFaces();
    }
}
