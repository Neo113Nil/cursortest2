package com.crrepa.band.my.health.water;

import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityWaterCalendarBinding;
import com.crrepa.band.my.health.water.adapter.WaterCalendarAdapter;
import com.crrepa.band.my.health.water.adapter.WaterCalendarMonthAdapter;
import com.crrepa.band.my.health.water.model.WaterCalendarModel;
import com.crrepa.band.my.model.db.Water;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class WaterCalendarActivity extends BaseVBActivity<ActivityWaterCalendarBinding> implements g3.a {
    private final e3.c presenter = new e3.c();
    private WaterCalendarAdapter waterCalendarAdapter;

    private void initActionBar() {
        setSupportActionBar(((ActivityWaterCalendarBinding) this.binding).waterCalendarBar.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        ((ActivityWaterCalendarBinding) this.binding).waterCalendarBar.toolbar.setNavigationIcon(R$drawable.ic_water_close);
        ((ActivityWaterCalendarBinding) this.binding).waterCalendarBar.toolbar.setBackgroundResource(R.color.color_water);
        ((ActivityWaterCalendarBinding) this.binding).waterCalendarBar.tvToolbarTitle.setText(i3.a.getDateText(this, new Date(), 1));
    }

    private void initListener() {
        this.waterCalendarAdapter.setOnScrollYearChangeListener(new WaterCalendarAdapter.a() { // from class: com.crrepa.band.my.health.water.a
            @Override // com.crrepa.band.my.health.water.adapter.WaterCalendarAdapter.a
            public final void onYearChange(String str) {
                WaterCalendarActivity.this.lambda$initListener$0(str);
            }
        });
        this.waterCalendarAdapter.setOnCalendarDayClickListener(new WaterCalendarMonthAdapter.a() { // from class: com.crrepa.band.my.health.water.b
            @Override // com.crrepa.band.my.health.water.adapter.WaterCalendarMonthAdapter.a
            public final void onItemClick(Water water) {
                WaterCalendarActivity.this.lambda$initListener$1(water);
            }
        });
    }

    private void initRecycleView() {
        this.waterCalendarAdapter = new WaterCalendarAdapter(this);
        ((ActivityWaterCalendarBinding) this.binding).rcvWaterCalendar.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityWaterCalendarBinding) this.binding).rcvWaterCalendar.setAdapter(this.waterCalendarAdapter);
    }

    private void initView() {
        initActionBar();
        initRecycleView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(String str) {
        ((ActivityWaterCalendarBinding) this.binding).waterCalendarBar.tvToolbarTitle.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(Water water) {
        if (i3.a.isSameDay(water.getDate(), new Date())) {
            onBackPressed();
        } else {
            startActivity(WaterHistoryActivity.getCallingIntent(this, water.getDate()));
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(this);
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.color_water));
        this.presenter.setView(this);
        initView();
        initListener();
        this.presenter.getCalendarModelList();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // g3.a
    public void renderWaterCalendar(List<WaterCalendarModel> list) {
        this.waterCalendarAdapter.setCalendarModelList(list);
        ((ActivityWaterCalendarBinding) this.binding).rcvWaterCalendar.scrollToPosition(list.size() - 1);
    }
}
