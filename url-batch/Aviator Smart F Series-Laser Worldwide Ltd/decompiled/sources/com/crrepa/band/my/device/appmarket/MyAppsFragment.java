package com.crrepa.band.my.device.appmarket;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentAppMarketMyAppsBinding;
import com.crrepa.band.my.device.appmarket.adapter.AppMarketAppAdapter;
import com.crrepa.band.my.device.appmarket.model.AppMarketAppBean;
import com.crrepa.band.my.device.appmarket.model.AppMarketModel;
import com.crrepa.band.my.device.appmarket.model.event.InstalledAppsChangeEvent;
import com.crrepa.band.my.device.appmarket.model.event.ToBeUpdateAppsEvent;
import com.crrepa.ble.conn.bean.CRPAppInfo;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.x0;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class MyAppsFragment extends BaseVBFragment<FragmentAppMarketMyAppsBinding> {
    private final AppMarketModel appMarketModel = new AppMarketModel();
    private final CompositeDisposable disposableList = new CompositeDisposable();
    private AppMarketAppAdapter latestAppsAdapter;
    private AppMarketAppAdapter toBeUpdateAppsAdapter;

    private void initLatestAppsRv() {
        this.latestAppsAdapter = new AppMarketAppAdapter();
        ((FragmentAppMarketMyAppsBinding) this.binding).rvLatestApps.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        ((FragmentAppMarketMyAppsBinding) this.binding).rvLatestApps.setHasFixedSize(true);
        ((FragmentAppMarketMyAppsBinding) this.binding).rvLatestApps.setAdapter(this.latestAppsAdapter);
    }

    private void initToBeUpdateAppsRv() {
        ((FragmentAppMarketMyAppsBinding) this.binding).rvToBeUpdateApps.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        AppMarketAppAdapter appMarketAppAdapter = new AppMarketAppAdapter();
        this.toBeUpdateAppsAdapter = appMarketAppAdapter;
        ((FragmentAppMarketMyAppsBinding) this.binding).rvToBeUpdateApps.setAdapter(appMarketAppAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadData$0(List list, List list2) {
        renderToBeUpdateAppList(list, list2);
        renderLatestAppList(list, list2);
        ((FragmentAppMarketMyAppsBinding) this.binding).llEmpty.setVisibility(8);
        ((FragmentAppMarketMyAppsBinding) this.binding).llContent.setVisibility(0);
        if (x0.isEmpty(this.toBeUpdateAppsAdapter.getData()) && x0.isEmpty(this.latestAppsAdapter.getData())) {
            renderNoDataUI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadData$1(Throwable th) {
        renderNetError();
        th.printStackTrace();
    }

    private void renderDisconnectHint() {
        r0.showLong(requireContext(), getString(R.string.band_setting_send_fail));
    }

    private void renderLatestAppList(List<CRPAppInfo> list, List<AppMarketAppBean> list2) {
        List<AppMarketAppBean> latestAppList = this.appMarketModel.getLatestAppList(list, list2);
        this.latestAppsAdapter.setNewData(latestAppList);
        if (x0.isEmpty(latestAppList)) {
            ((FragmentAppMarketMyAppsBinding) this.binding).tvLatestAppsTitle.setVisibility(8);
        } else {
            ((FragmentAppMarketMyAppsBinding) this.binding).tvLatestAppsTitle.setVisibility(0);
        }
    }

    private void renderNetError() {
        r0.showShort(requireContext(), R.string.net_disonnected);
    }

    private void renderNoDataUI() {
        ((FragmentAppMarketMyAppsBinding) this.binding).llEmpty.setVisibility(0);
        ((FragmentAppMarketMyAppsBinding) this.binding).llContent.setVisibility(8);
    }

    private void renderToBeUpdateAppList(List<CRPAppInfo> list, List<AppMarketAppBean> list2) {
        List<AppMarketAppBean> toBeUpdateAppList = this.appMarketModel.getToBeUpdateAppList(list, list2);
        this.toBeUpdateAppsAdapter.setNewData(toBeUpdateAppList);
        if (x0.isEmpty(toBeUpdateAppList)) {
            ((FragmentAppMarketMyAppsBinding) this.binding).tvToBeUpdateAppsTitle.setVisibility(8);
        } else {
            ((FragmentAppMarketMyAppsBinding) this.binding).tvToBeUpdateAppsTitle.setVisibility(0);
        }
        org.greenrobot.eventbus.c.getDefault().post(new ToBeUpdateAppsEvent(toBeUpdateAppList.size()));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        org.greenrobot.eventbus.c.getDefault().register(this);
        initToBeUpdateAppsRv();
        initLatestAppsRv();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void loadData() {
        super.loadData();
        if (a0.isDisconnected()) {
            renderDisconnectHint();
            return;
        }
        final List<CRPAppInfo> installedAppList = AppMarketProvider.getInstalledAppList();
        if (x0.isEmpty(installedAppList)) {
            renderNoDataUI();
            org.greenrobot.eventbus.c.getDefault().post(new ToBeUpdateAppsEvent(0));
        } else {
            this.disposableList.add(this.appMarketModel.requestInstalledAppList(installedAppList).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.appmarket.v
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MyAppsFragment.this.lambda$loadData$0(installedAppList, (List) obj);
                }
            }, new Consumer() { // from class: com.crrepa.band.my.device.appmarket.w
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MyAppsFragment.this.lambda$loadData$1((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.disposableList.clear();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(InstalledAppsChangeEvent installedAppsChangeEvent) {
        loadData();
    }
}
