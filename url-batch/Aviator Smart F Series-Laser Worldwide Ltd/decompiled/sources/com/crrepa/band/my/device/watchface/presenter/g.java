package com.crrepa.band.my.device.watchface.presenter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceTagBean;
import com.crrepa.band.my.device.watchface.model.TplsMsgUpdateEvent;
import com.crrepa.band.my.model.band.provider.BandDisplayLanguageProvider;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.band.provider.BandStorageProvider;
import com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider;
import com.crrepa.band.my.model.band.provider.watchface.DefaultWatchFaceProvider;
import com.crrepa.band.my.model.band.provider.watchface.JieliWatchFaceProvider;
import com.crrepa.band.my.model.db.SupportWatchFace;
import com.crrepa.band.my.model.db.proxy.LanguageDaoProxy;
import com.crrepa.band.my.model.db.proxy.SupportWatchFaceDaoProxy;
import com.crrepa.ble.conn.bean.CRPBluetrumWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceInfo;
import com.crrepa.ble.conn.callback.CRPAvailableStorageCallback;
import com.crrepa.ble.conn.callback.CRPBluetrumWatchFaceCallback;
import com.crrepa.ble.conn.callback.CRPJieliWatchFaceCallback;
import com.moyoung.dafit.module.common.utils.a0;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class g implements com.moyoung.dafit.module.common.baseui.f {
    private x1.d view;
    private final BaseWatchFaceProvider netWatchFaceProvider = new DefaultWatchFaceProvider();
    private boolean updatedAvailableStorage = false;
    private boolean tplsWatchFaceUpdated = false;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(List<StoreWatchFaceTagBean> list) {
            g.this.showWatchFaceTagList(list);
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
            g.this.showNetError();
        }
    }

    class c implements CRPAvailableStorageCallback {
        final /* synthetic */ Context val$context;
        final /* synthetic */ int val$pageIndex;

        c(Context context, int i8) {
            this.val$context = context;
            this.val$pageIndex = i8;
        }

        @Override // com.crrepa.ble.conn.callback.CRPAvailableStorageCallback
        public void onAvailableSize(int i8) {
            com.orhanobut.logger.f.d("onAvailableSize: " + i8);
            g.this.updatedAvailableStorage = true;
            BandStorageProvider.saveAvailableStorage(i8 * 1024);
            g.this.updateWatchFaceTagList(this.val$context, this.val$pageIndex);
        }
    }

    class d implements CRPJieliWatchFaceCallback {
        final /* synthetic */ Context val$context;
        final /* synthetic */ int val$pageIndex;

        d(Context context, int i8) {
            this.val$context = context;
            this.val$pageIndex = i8;
        }

        @Override // com.crrepa.ble.conn.callback.CRPJieliWatchFaceCallback
        public void onWatchFaceInfo(CRPJieliWatchFaceInfo cRPJieliWatchFaceInfo) {
            com.orhanobut.logger.f.d("onWatchFaceInfo: " + cRPJieliWatchFaceInfo);
            if (cRPJieliWatchFaceInfo == null) {
                g.this.showNetError();
                return;
            }
            JieliWatchFaceProvider.saveWatchFaceApi(cRPJieliWatchFaceInfo.getApiVersion());
            JieliWatchFaceProvider.saveWatchFaceFeature(cRPJieliWatchFaceInfo.getFeature());
            g.this.updateWatchFaceTagList(this.val$context, this.val$pageIndex);
        }
    }

    class e implements CRPBluetrumWatchFaceCallback {
        final /* synthetic */ Context val$context;
        final /* synthetic */ int val$pageIndex;

        e(Context context, int i8) {
            this.val$context = context;
            this.val$pageIndex = i8;
        }

        @Override // com.crrepa.ble.conn.callback.CRPBluetrumWatchFaceCallback
        public void onWatchFaceInfo(CRPBluetrumWatchFaceInfo cRPBluetrumWatchFaceInfo) {
            com.orhanobut.logger.f.d("onWatchFaceInfo: " + cRPBluetrumWatchFaceInfo);
            if (cRPBluetrumWatchFaceInfo == null) {
                g.this.showNetError();
                return;
            }
            JieliWatchFaceProvider.saveWatchFaceApi(cRPBluetrumWatchFaceInfo.getApiVersion());
            JieliWatchFaceProvider.saveWatchFaceFeature(cRPBluetrumWatchFaceInfo.getFeature());
            JieliWatchFaceProvider.saveWatchFaceConfig(cRPBluetrumWatchFaceInfo.getBytes());
            g.this.updateWatchFaceTagList(this.val$context, this.val$pageIndex);
        }
    }

    class f implements Consumer {
        final /* synthetic */ int val$pageIndex;

        f(int i8) {
            this.val$pageIndex = i8;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Context context) {
            g.this.getWatchFaceTagList(context, this.val$pageIndex);
        }
    }

    public g() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    public static String getWatchFaceTpls() {
        SupportWatchFace supportWatchFace = new SupportWatchFaceDaoProxy().get(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
        if (supportWatchFace == null) {
            return null;
        }
        return supportWatchFace.getTpls();
    }

    private boolean queryAvailableStorage(Context context, int i8) {
        return i4.getInstance().queryAvailableStorage(new c(context, i8));
    }

    private boolean queryBluetrumWatchFaceInfo(Context context, int i8) {
        return i4.getInstance().queryBluetrumWatchFaceInfo(new e(context, i8));
    }

    private boolean queryJieliWatchFaceInfo(Context context, int i8) {
        return i4.getInstance().queryJieliWatchFaceInfo(new d(context, i8));
    }

    private void showBandDisconnect(int i8) {
        this.view.renderWatchFaceLoadEnd();
        this.view.renderBandDisconnect(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNetError() {
        this.view.renderWatchFaceLoadEnd();
        this.view.renderNetError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showWatchFaceTagList(List<StoreWatchFaceTagBean> list) {
        if (list == null || list.isEmpty()) {
            this.view.renderWatchFaceLoadEnd();
            this.view.renderInsufficientStorage();
        } else {
            if (list.size() < 20) {
                this.view.renderWatchFaceLoadEnd();
            } else {
                this.view.renderWatchFaceLoadComplete();
            }
            this.view.renderWatchFaceTagList(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void updateWatchFaceTagList(Context context, int i8) {
        if (this.view == null || context == null) {
            return;
        }
        Observable.just(context).observeOn(AndroidSchedulers.mainThread()).subscribe(new f(i8));
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @SuppressLint({"CheckResult"})
    public void getWatchFaceTagList(Context context, int i8) {
        if (!a0.isNetworkConnected(context)) {
            showNetError();
            return;
        }
        if ((com.crrepa.band.my.ble.band.utils.a.getInstance().isSifli() || com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) && !this.updatedAvailableStorage) {
            if (queryAvailableStorage(context, i8)) {
                return;
            }
            showBandDisconnect(0);
            return;
        }
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isJieli() && !JieliWatchFaceProvider.hasWatchFaceInfo() && !this.updatedAvailableStorage) {
            if (queryJieliWatchFaceInfo(context, i8)) {
                return;
            }
            showBandDisconnect(1);
            return;
        }
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isBluetrum() && !JieliWatchFaceProvider.hasWatchFaceConfig() && !this.updatedAvailableStorage) {
            if (queryBluetrumWatchFaceInfo(context, i8)) {
                return;
            }
            showBandDisconnect(2);
            return;
        }
        String watchFaceTpls = getWatchFaceTpls();
        String firmwareVersion = BandInfoManager.getFirmwareVersion();
        if (!TextUtils.isEmpty(watchFaceTpls) && !TextUtils.isEmpty(firmwareVersion)) {
            this.netWatchFaceProvider.getStoreWatchFaceTagListV3(new LanguageDaoProxy().getLanguageCode(BandDisplayLanguageProvider.getDisplayLanguage()), watchFaceTpls, firmwareVersion, i8).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(), new b());
            return;
        }
        Log.d("getWatchFaceTpls", "tpls=" + watchFaceTpls + ", firmwareVersion=" + firmwareVersion);
        showBandDisconnect(3);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onTplsMsgUpdateEvent(TplsMsgUpdateEvent tplsMsgUpdateEvent) {
        if (this.tplsWatchFaceUpdated) {
            return;
        }
        this.tplsWatchFaceUpdated = true;
        getWatchFaceTagList(com.moyoung.dafit.module.common.utils.d.get(), 1);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(x1.d dVar) {
        this.view = dVar;
    }
}
