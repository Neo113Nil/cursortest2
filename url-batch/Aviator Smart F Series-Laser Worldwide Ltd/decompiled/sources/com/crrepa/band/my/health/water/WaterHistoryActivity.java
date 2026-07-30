package com.crrepa.band.my.health.water;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityWaterHistoryBinding;
import com.crrepa.band.my.health.water.adapter.WaterRecordAdapter;
import com.crrepa.band.my.health.water.model.WaterConst;
import com.crrepa.band.my.health.water.util.WaterProvider;
import com.crrepa.band.my.health.widgets.WaveHelper;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.crrepa.band.my.model.db.Water;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class WaterHistoryActivity extends BaseVBActivity<ActivityWaterHistoryBinding> implements g3.b {
    private WaveHelper mWaveHelper;
    private final e3.e presenter = new e3.e();
    private WaterRecordAdapter waterRecordAdapter;

    public static Intent getCallingIntent(Context context, Date date) {
        Intent intent = new Intent(context, (Class<?>) WaterHistoryActivity.class);
        intent.putExtra(WaterConst.WATER_DATE, date);
        return intent;
    }

    private void initActionBar() {
        setSupportActionBar(((ActivityWaterHistoryBinding) this.binding).waterHistoryBar.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        ((ActivityWaterHistoryBinding) this.binding).waterHistoryBar.toolbar.setNavigationIcon(R$drawable.ic_water_close_black);
        ((ActivityWaterHistoryBinding) this.binding).waterHistoryBar.toolbar.setBackgroundResource(R.color.white);
        ((ActivityWaterHistoryBinding) this.binding).waterHistoryBar.tvToolbarTitle.setText(com.moyoung.dafit.module.common.utils.m.format(this.presenter.getCurrentDate(), getString(R.string.year_month_day_format)));
        ((ActivityWaterHistoryBinding) this.binding).waterHistoryBar.tvToolbarTitle.setTextColor(ContextCompat.getColor(this, R.color.black));
    }

    private void initRecycleView() {
        this.waterRecordAdapter = new WaterRecordAdapter(null, this, false);
        ((ActivityWaterHistoryBinding) this.binding).rcvWaterRecords.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityWaterHistoryBinding) this.binding).rcvWaterRecords.setAdapter(this.waterRecordAdapter);
    }

    private void initView() {
        initActionBar();
        initRecycleView();
        initWaveView();
        ((ActivityWaterHistoryBinding) this.binding).tvWaterUnit.setText(WaterProvider.getWaterUnit(this));
    }

    private void initWaveView() {
        Drawable drawable = ContextCompat.getDrawable(this, R$drawable.water_record_bg);
        if (drawable != null) {
            drawable.setColorFilter(ContextCompat.getColor(this, R.color.water_main_2_cup), PorterDuff.Mode.SRC_ATOP);
            ((ActivityWaterHistoryBinding) this.binding).wvWater.setBackground(drawable);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setLightMode(this);
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.white));
        this.presenter.setView(this);
        this.presenter.setCurrentDate((Date) getIntent().getSerializableExtra(WaterConst.WATER_DATE));
        initView();
        this.presenter.updateWaterData(true);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mWaveHelper.end();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.set12HourTime(BandTimeSystemProvider.is12HourTime());
    }

    @Override // g3.b
    public void renderWaterRecord(List<Water> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        ((ActivityWaterHistoryBinding) this.binding).rcvWaterRecords.setVisibility(0);
        this.waterRecordAdapter.setNewData(list);
    }

    @Override // g3.b
    public void showGoal(int i8) {
        ((ActivityWaterHistoryBinding) this.binding).tvWaterGoal.setText(getString(R.string.water_total_intake, i8 + WaterProvider.getWaterUnit(this)));
    }

    @Override // g3.b
    @SuppressLint({"SetTextI18n"})
    public void showPercentage(int i8, boolean z7) {
        int min = Math.min(Math.max(0, i8), 100);
        String valueOf = String.valueOf(min);
        ((ActivityWaterHistoryBinding) this.binding).tvWaterPercentage.setText(valueOf + "%");
        ((ActivityWaterHistoryBinding) this.binding).tvWaterPercentageNote.setText(getString(R.string.water_percentage_note, valueOf + "%"));
        WaveHelper waveHelper = new WaveHelper(((ActivityWaterHistoryBinding) this.binding).wvWater);
        this.mWaveHelper = waveHelper;
        waveHelper.setWaterLevelRatio((((float) min) * 1.0f) / 100.0f);
    }

    @Override // g3.b
    public void showTotalIntake(int i8) {
        ((ActivityWaterHistoryBinding) this.binding).tvWaterTotalIntake.setText(String.valueOf(Math.max(0, i8)));
    }
}
