package com.crrepa.band.my.device.appmarket;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityAppMarketMainBinding;
import com.crrepa.band.my.device.appmarket.model.event.ToBeUpdateAppsEvent;
import com.crrepa.band.my.model.band.provider.BtBluetoothProvider;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.o0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.widgets.ContentPagerAdapter;
import java.util.ArrayList;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class AppMarketMainActivity extends BaseVBActivity<ActivityAppMarketMainBinding> {
    private TextView tabTvDot;

    private void checkBandConnectionState() {
        String address = BtBluetoothProvider.getAddress();
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isDisConnected() || TextUtils.isEmpty(address)) {
            r0.showShort(com.moyoung.dafit.module.common.utils.d.get(), R.string.common_device_disconnected_tips);
        }
    }

    public static Intent getCallingIntent(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, AppMarketMainActivity.class);
        return intent;
    }

    private void initViewPager() {
        ContentPagerAdapter contentPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AppDiscoverFragment());
        arrayList.add(new MyAppsFragment());
        contentPagerAdapter.setContentFragments(arrayList);
        ((ActivityAppMarketMainBinding) this.binding).vpMarket.setAdapter(contentPagerAdapter);
        ((ActivityAppMarketMainBinding) this.binding).vpMarket.setOffscreenPageLimit(2);
        ((ActivityAppMarketMainBinding) this.binding).tab.setTabMode(1);
        VB vb = this.binding;
        ((ActivityAppMarketMainBinding) vb).tab.setupWithViewPager(((ActivityAppMarketMainBinding) vb).vpMarket);
        TabLayout.Tab tabAt = ((ActivityAppMarketMainBinding) this.binding).tab.getTabAt(0);
        if (tabAt != null) {
            tabAt.setText(R.string.device_app_market_discover_title);
            o0.hideTabToast(tabAt);
        }
        TabLayout.Tab tabAt2 = ((ActivityAppMarketMainBinding) this.binding).tab.getTabAt(1);
        if (tabAt2 != null) {
            tabAt2.setCustomView(R.layout.layout_app_market_main_tab);
            if (tabAt2.getCustomView() != null) {
                TextView textView = (TextView) tabAt2.getCustomView().findViewById(R.id.tv_title);
                this.tabTvDot = (TextView) tabAt2.getCustomView().findViewById(R.id.tv_dot);
                textView.setText(R.string.device_app_market_my_app_title);
            }
            o0.hideTabToast(tabAt2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        org.greenrobot.eventbus.c.getDefault().register(this);
        ((ActivityAppMarketMainBinding) this.binding).tvBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.appmarket.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppMarketMainActivity.this.lambda$initBinding$0(view);
            }
        });
        initViewPager();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        checkBandConnectionState();
        i4.getInstance().queryAppAvailableSize();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(ToBeUpdateAppsEvent toBeUpdateAppsEvent) {
        int i8 = toBeUpdateAppsEvent.count;
        if (i8 <= 0) {
            this.tabTvDot.setVisibility(8);
        } else {
            this.tabTvDot.setText(String.valueOf(i8));
            this.tabTvDot.setVisibility(0);
        }
    }
}
