package com.crrepa.band.my.health.bloodoxygen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.databinding.ActivityTimingBloodOxygenBinding;
import com.crrepa.band.my.health.base.BaseCalendarHistoryActivity;
import com.crrepa.band.my.health.bloodoxygen.presenter.c;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.widgets.ContentPagerAdapter;
import h2.b;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class BandTimingBloodOxygenActivity extends BaseActivity implements b {
    private ActivityTimingBloodOxygenBinding binding;
    private Date date;
    private c presenter = new c();

    class a implements TabLayout.OnTabSelectedListener {
        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab.getPosition() == 0) {
                s0.logEvent("点击全天血氧饱和度_日");
            } else if (tab.getPosition() == 1) {
                s0.logEvent("点击全天血氧饱和度_周");
            } else {
                s0.logEvent("点击全天血氧饱和度_月");
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public static Intent getCallingIntent(Context context, Date date) {
        Intent intent = new Intent(context, (Class<?>) BandTimingBloodOxygenActivity.class);
        intent.putExtra("statistics_date", date);
        return intent;
    }

    private void initTabLayout() {
        this.binding.tlBloodOxygenTab.setTabMode(1);
        ActivityTimingBloodOxygenBinding activityTimingBloodOxygenBinding = this.binding;
        activityTimingBloodOxygenBinding.tlBloodOxygenTab.setupWithViewPager(activityTimingBloodOxygenBinding.vpBloodOxygenContent);
        this.binding.tlBloodOxygenTab.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
    }

    private void onHistoryClick() {
        startActivity(BaseCalendarHistoryActivity.getCallingIntent(this, BandTimingBloodOxygenHistoryActivity.class, this.date));
    }

    private void setActionBar() {
        setSupportActionBar(this.binding.includeTitleBar.toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        this.binding.includeTitleBar.toolbar.setNavigationIcon(R.drawable.selector_title_close_w);
        this.binding.includeTitleBar.toolbar.setBackgroundResource(R.color.color_blood_oxygen);
        this.binding.includeTitleBar.tvToolbarTitle.setText(getString(R.string.continuous_blood_oxygen));
    }

    private void setTabLayoutContent() {
        String[] stringArray = getResources().getStringArray(R.array.statistics_period_array);
        int tabCount = this.binding.tlBloodOxygenTab.getTabCount();
        for (int i8 = 0; i8 < stringArray.length && tabCount > i8; i8++) {
            TabLayout.Tab tabAt = this.binding.tlBloodOxygenTab.getTabAt(i8);
            if (tabAt != null) {
                tabAt.setCustomView(R.layout.item_statistics_tab);
                ((TextView) tabAt.getCustomView().findViewById(R.id.tv_tictistics_name)).setText(stringArray[i8]);
            }
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity
    protected int getStatusBarColor() {
        return ContextCompat.getColor(this, R.color.color_blood_oxygen);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        startActivity(MainActivity.getCallingIntent(this));
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityTimingBloodOxygenBinding inflate = ActivityTimingBloodOxygenBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.presenter.setView(this);
        setActionBar();
        initTabLayout();
        Date date = (Date) getIntent().getSerializableExtra("statistics_date");
        this.date = date;
        this.presenter.getStatisticsFragment(date);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.band_calendar_menu, menu);
        return true;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressedSupport();
        } else if (itemId == R.id.menu_band_data_history) {
            onHistoryClick();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        s0.logPage(getClass(), "全天血氧饱和度详情页  ");
    }

    @Override // h2.b
    public void renderStatisticsFragment(List<Fragment> list) {
        ContentPagerAdapter contentPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());
        contentPagerAdapter.setContentFragments(list);
        this.binding.vpBloodOxygenContent.setAdapter(contentPagerAdapter);
        this.binding.vpBloodOxygenContent.setOffscreenPageLimit(list.size());
        setTabLayoutContent();
    }
}
