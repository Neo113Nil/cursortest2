package com.crrepa.band.my.device.appmarket;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.FragmentAppMarketDiscoverBinding;
import com.crrepa.band.my.device.appmarket.adapter.AppMarketAppAdapter;
import com.crrepa.band.my.device.appmarket.adapter.AppMarketTagAdapter;
import com.crrepa.band.my.device.appmarket.model.AppMarketMixResp;
import com.crrepa.band.my.device.appmarket.model.AppMarketModel;
import com.crrepa.band.my.device.appmarket.openharmony.AppStoreActivity;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.r0;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.List;

/* loaded from: classes2.dex */
public class AppDiscoverFragment extends BaseVBFragment<FragmentAppMarketDiscoverBinding> {
    private AppMarketAppAdapter allAppAdapter;
    private final AppMarketModel appMarketModel = new AppMarketModel();
    private final CompositeDisposable disposableList = new CompositeDisposable();
    private AppMarketTagAdapter tagAdapter;

    private void initAllAppRv() {
        ((FragmentAppMarketDiscoverBinding) this.binding).rvAllApps.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        AppMarketAppAdapter appMarketAppAdapter = new AppMarketAppAdapter();
        this.allAppAdapter = appMarketAppAdapter;
        ((FragmentAppMarketDiscoverBinding) this.binding).rvAllApps.setAdapter(appMarketAppAdapter);
    }

    private void initTagRv() {
        this.tagAdapter = new AppMarketTagAdapter();
        ((FragmentAppMarketDiscoverBinding) this.binding).rvTags.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        ((FragmentAppMarketDiscoverBinding) this.binding).rvTags.setHasFixedSize(true);
        ((FragmentAppMarketDiscoverBinding) this.binding).rvTags.setAdapter(this.tagAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadData$0(List list) {
        getPageLoadingUI().hide();
        if (list == null) {
            ((FragmentAppMarketDiscoverBinding) this.binding).tvAllAppTitle.setVisibility(8);
        } else {
            ((FragmentAppMarketDiscoverBinding) this.binding).tvAllAppTitle.setVisibility(0);
            this.allAppAdapter.setNewData(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadData$1(AppMarketMixResp appMarketMixResp) {
        List<AppMarketMixResp.Tag> list;
        if (appMarketMixResp != null && (list = appMarketMixResp.tags) != null) {
            this.tagAdapter.setNewData(list);
            if (appMarketMixResp.showHongmengStore()) {
                showOpenHarmonyBanner();
            }
        }
        this.disposableList.add(this.appMarketModel.requestAllAppList().subscribe(new Consumer() { // from class: com.crrepa.band.my.device.appmarket.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AppDiscoverFragment.this.lambda$loadData$0((List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showOpenHarmonyBanner$2(View view) {
        startActivity(new Intent(getActivity(), (Class<?>) AppStoreActivity.class));
    }

    private void renderNetError() {
        r0.showShort(requireContext(), R.string.net_disonnected);
    }

    private void showOpenHarmonyBanner() {
        if (AppMarketProvider.getAppStoreInfo() == null) {
            return;
        }
        ((FragmentAppMarketDiscoverBinding) this.binding).ivOpenharmonyBanner.setVisibility(0);
        if (com.moyoung.dafit.module.common.utils.u.isSimplified()) {
            ((FragmentAppMarketDiscoverBinding) this.binding).ivOpenharmonyBanner.setBackgroundResource(R$drawable.img_appmarket_harmony_zh);
        } else {
            ((FragmentAppMarketDiscoverBinding) this.binding).ivOpenharmonyBanner.setBackgroundResource(R$drawable.img_appmarket_harmony_en);
        }
        ((FragmentAppMarketDiscoverBinding) this.binding).ivOpenharmonyBanner.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.appmarket.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppDiscoverFragment.this.lambda$showOpenHarmonyBanner$2(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        initTagRv();
        initAllAppRv();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void loadData() {
        super.loadData();
        if (a0.isDisconnected()) {
            renderNetError();
            return;
        }
        getPageLoadingUI().show();
        this.disposableList.add(this.appMarketModel.requestAppMarketMixMsg(null).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.appmarket.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AppDiscoverFragment.this.lambda$loadData$1((AppMarketMixResp) obj);
            }
        }));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.disposableList.clear();
    }
}
