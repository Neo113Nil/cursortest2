package com.crrepa.band.my.health.water;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityWaterStatisticsBinding;
import com.crrepa.band.my.health.base.editpage.EditInfoActivity;
import com.crrepa.band.my.health.water.adapter.WaterRecordAdapter;
import com.crrepa.band.my.health.water.model.BandWaterConnectChangeEvent;
import com.crrepa.band.my.health.water.model.WaterConst;
import com.crrepa.band.my.health.water.model.WaterGoalChangeEvent;
import com.crrepa.band.my.health.water.model.WaterIntakeChangeEvent;
import com.crrepa.band.my.health.water.model.WaterRecordDeleteEvent;
import com.crrepa.band.my.health.water.util.WaterProvider;
import com.crrepa.band.my.health.widgets.WaveHelper;
import com.crrepa.band.my.health.widgets.dialog.i;
import com.crrepa.band.my.health.widgets.dialog.i0;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.Water;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.u0;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class WaterStatisticsActivity extends BaseVBActivity<ActivityWaterStatisticsBinding> implements g3.b {
    private com.crrepa.band.my.health.widgets.dialog.i deleteConfirmDialog;
    private WaveHelper mWaveHelper;
    private long selectedId;
    private WaterRecordAdapter waterRecordAdapter;
    private final e3.e presenter = new e3.e();
    private final com.yanzhenjie.recyclerview.k swipeMenuCreator = new com.yanzhenjie.recyclerview.k() { // from class: com.crrepa.band.my.health.water.w
        @Override // com.yanzhenjie.recyclerview.k
        public final void onCreateMenu(com.yanzhenjie.recyclerview.i iVar, com.yanzhenjie.recyclerview.i iVar2, int i8) {
            WaterStatisticsActivity.this.lambda$new$1(iVar, iVar2, i8);
        }
    };

    private void dismissDeleteConfirmDialog() {
        com.crrepa.band.my.health.widgets.dialog.i iVar = this.deleteConfirmDialog;
        if (iVar != null) {
            iVar.dismiss();
        }
    }

    public static Intent getCallingIntent(Context context, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) WaterStatisticsActivity.class);
        intent.putExtra(WaterConst.GO_DRINK, z7);
        return intent;
    }

    private void initActionBar() {
        setSupportActionBar(((ActivityWaterStatisticsBinding) this.binding).waterStatisticsBar.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        ((ActivityWaterStatisticsBinding) this.binding).waterStatisticsBar.toolbar.setNavigationIcon(R$drawable.ic_water_close);
        ((ActivityWaterStatisticsBinding) this.binding).waterStatisticsBar.toolbar.setBackgroundResource(R.color.color_water);
        ((ActivityWaterStatisticsBinding) this.binding).waterStatisticsBar.tvToolbarTitle.setText(getString(R.string.water));
    }

    private void initData() {
        this.presenter.setCurrentDate(new Date());
        initView();
        initListener();
        this.presenter.updateWaterData(true);
    }

    private void initListener() {
        ((ActivityWaterStatisticsBinding) this.binding).tvAddWater.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.water.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WaterStatisticsActivity.this.lambda$initListener$3(view);
            }
        });
        ((ActivityWaterStatisticsBinding) this.binding).llWaterAddIntake100.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.water.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WaterStatisticsActivity.this.lambda$initListener$4(view);
            }
        });
        ((ActivityWaterStatisticsBinding) this.binding).llWaterAddIntake200.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.water.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WaterStatisticsActivity.this.lambda$initListener$5(view);
            }
        });
        ((ActivityWaterStatisticsBinding) this.binding).llWaterAddIntake400.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.water.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WaterStatisticsActivity.this.lambda$initListener$6(view);
            }
        });
    }

    private void initRecycleView() {
        this.waterRecordAdapter = new WaterRecordAdapter(null, this, true);
        ((ActivityWaterStatisticsBinding) this.binding).rcvWaterRecords.setLayoutManager(new LinearLayoutManager(this));
        setRecycleViewMenu();
    }

    private void initView() {
        initActionBar();
        initRecycleView();
        initWaveView();
        ((ActivityWaterStatisticsBinding) this.binding).tvWaterAddIntake100.setText(WaterProvider.getWaterUnitText(this, 100, -1));
        ((ActivityWaterStatisticsBinding) this.binding).tvWaterAddIntake200.setText(WaterProvider.getWaterUnitText(this, 200, -1));
        ((ActivityWaterStatisticsBinding) this.binding).tvWaterAddIntake400.setText(WaterProvider.getWaterUnitText(this, 400, -1));
        ((ActivityWaterStatisticsBinding) this.binding).tvWaterUnit.setText(WaterProvider.getWaterUnit(this));
        ((ActivityWaterStatisticsBinding) this.binding).tvAddWater.setText(getString(R.string.water_symbol_add) + getString(R.string.water_add));
        if (getIntent().getBooleanExtra(WaterConst.GO_DRINK, true)) {
            showWaterAddDialog();
        }
    }

    private void initWaveView() {
        Drawable drawable = ContextCompat.getDrawable(this, R$drawable.water_home_bg);
        if (drawable != null) {
            drawable.setColorFilter(ContextCompat.getColor(this, R.color.water_assist_3_cup), PorterDuff.Mode.SRC_ATOP);
            ((ActivityWaterStatisticsBinding) this.binding).wvWater.setBackground(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$3(View view) {
        showWaterAddDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$4(View view) {
        this.presenter.insertIntakeWater(BandUnitSystemProvider.getUnitSystem() == 0 ? 100 : u0.ml2OzsAdd(100));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$5(View view) {
        this.presenter.insertIntakeWater(BandUnitSystemProvider.getUnitSystem() == 0 ? 200 : u0.ml2OzsAdd(200));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$6(View view) {
        this.presenter.insertIntakeWater(BandUnitSystemProvider.getUnitSystem() == 0 ? 400 : u0.ml2OzsAdd(400));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(com.yanzhenjie.recyclerview.i iVar, com.yanzhenjie.recyclerview.i iVar2, int i8) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.weight_history_menu_width);
        iVar2.addMenuItem(new com.yanzhenjie.recyclerview.l(this).setBackgroundColor(ContextCompat.getColor(this, R.color.color_water)).setTextColor(ContextCompat.getColor(this, R.color.white)).setText(getString(R.string.edit)).setTextSize(13).setWidth(dimensionPixelSize).setHeight(-1));
        iVar2.addMenuItem(new com.yanzhenjie.recyclerview.l(this).setBackgroundColor(ContextCompat.getColor(this, R.color.color_remove_menu_bg)).setTextColor(ContextCompat.getColor(this, R.color.white)).setText(getString(R.string.remove)).setTextSize(13).setWidth(dimensionPixelSize).setHeight(-1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setRecycleViewMenu$0(com.yanzhenjie.recyclerview.j jVar, int i8) {
        jVar.closeMenu();
        int position = jVar.getPosition();
        Water waterByPosition = this.presenter.getWaterByPosition(i8);
        if (waterByPosition != null) {
            this.selectedId = waterByPosition.getId().longValue();
            if (position != 0) {
                if (position == 1) {
                    showDeleteConfirmDialog(waterByPosition, i8);
                }
            } else {
                com.orhanobut.logger.f.d("water ==> edit : " + i8);
                startActivity(EditInfoActivity.getCallingIntent(this, 1, com.crrepa.band.my.health.base.editpage.h.getInstance().setEditObject(this, 1, waterByPosition)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDeleteConfirmDialog$2(int i8, Water water) {
        com.orhanobut.logger.f.d("water ==> delete : " + i8);
        this.waterRecordAdapter.remove(this.presenter.getPositionByWater(water));
        this.presenter.deleteWater(water);
        updateShowMenu();
    }

    private void setRecycleViewMenu() {
        ((ActivityWaterStatisticsBinding) this.binding).rcvWaterRecords.setSwipeMenuCreator(this.swipeMenuCreator);
        ((ActivityWaterStatisticsBinding) this.binding).rcvWaterRecords.setOnItemMenuClickListener(new com.yanzhenjie.recyclerview.g() { // from class: com.crrepa.band.my.health.water.x
            @Override // com.yanzhenjie.recyclerview.g
            public final void onItemClick(com.yanzhenjie.recyclerview.j jVar, int i8) {
                WaterStatisticsActivity.this.lambda$setRecycleViewMenu$0(jVar, i8);
            }
        });
        ((ActivityWaterStatisticsBinding) this.binding).rcvWaterRecords.setAdapter(this.waterRecordAdapter);
        updateShowMenu();
    }

    private void showDeleteConfirmDialog(final Water water, final int i8) {
        com.crrepa.band.my.health.widgets.dialog.i onDoneClickListener = new com.crrepa.band.my.health.widgets.dialog.i(this).setTitle(getString(R.string.water_delete_tip)).setOnDoneClickListener(new i.a() { // from class: com.crrepa.band.my.health.water.y
            @Override // com.crrepa.band.my.health.widgets.dialog.i.a
            public final void onClick() {
                WaterStatisticsActivity.this.lambda$showDeleteConfirmDialog$2(i8, water);
            }
        });
        this.deleteConfirmDialog = onDoneClickListener;
        onDoneClickListener.show();
    }

    private void showWaterAddDialog() {
        i0 defaultIntake = new i0(this).setDefaultIntake(WaterProvider.getDefaultIntake());
        final e3.e eVar = this.presenter;
        Objects.requireNonNull(eVar);
        defaultIntake.setOnDoneClickListener(new i0.a() { // from class: com.crrepa.band.my.health.water.r
            @Override // com.crrepa.band.my.health.widgets.dialog.i0.a
            public final void onDone(int i8) {
                e3.e.this.insertIntakeWater(i8);
            }
        }).show();
    }

    private void showWaveAnimation(float f8, boolean z7) {
        if (!z7) {
            this.mWaveHelper.updateWaterLevelRatio(f8);
            return;
        }
        WaveHelper waveHelper = new WaveHelper(((ActivityWaterStatisticsBinding) this.binding).wvWater);
        this.mWaveHelper = waveHelper;
        waveHelper.setWaterLevelRatio(f8);
    }

    private void updateShowMenu() {
        ((ActivityWaterStatisticsBinding) this.binding).rcvWaterRecords.smoothCloseMenu();
        boolean z7 = WaterProvider.WATER_STATUS == WaterProvider.WaterConnectStatus.CONNECT_NEW;
        for (int i8 = 0; i8 < this.presenter.getRecordListSize(); i8++) {
            ((ActivityWaterStatisticsBinding) this.binding).rcvWaterRecords.setSwipeItemMenuEnabled(i8, this.presenter.getWaterByPosition(i8).getType() == 1 || z7);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        org.greenrobot.eventbus.c.getDefault().register(this);
        k0.setDarkMode(this);
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.color_water));
        this.presenter.setView(this);
        initData();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(MainActivity.getCallingIntent(this));
        finish();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandWaterConnectChangeEvent(BandWaterConnectChangeEvent bandWaterConnectChangeEvent) {
        this.presenter.getTodayWaterRecordList();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.water_menu, menu);
        return true;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        this.mWaveHelper.end();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getBooleanExtra(WaterConst.GO_DRINK, true)) {
            showWaterAddDialog();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
        } else if (itemId == R.id.menu_band_data_calendar) {
            startActivity(new Intent(this, (Class<?>) WaterCalendarActivity.class));
        } else if (itemId == R.id.menu_band_data_settings) {
            startActivity(new Intent(this, (Class<?>) WaterSettingActivity.class));
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.mWaveHelper.getStatus() == WaveHelper.AnimatorStatus.START) {
            this.mWaveHelper.pause();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        WaveHelper waveHelper = this.mWaveHelper;
        if (waveHelper != null && waveHelper.getStatus() == WaveHelper.AnimatorStatus.PAUSE) {
            this.mWaveHelper.resume();
        }
        this.presenter.set12HourTime(BandTimeSystemProvider.is12HourTime());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onWaterGoalChangeEvent(WaterGoalChangeEvent waterGoalChangeEvent) {
        this.presenter.updateWaterData(false);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onWaterIntakeChangeEvent(WaterIntakeChangeEvent waterIntakeChangeEvent) {
        this.presenter.updateWaterData(false);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onWaterRecordDeleteEvent(WaterRecordDeleteEvent waterRecordDeleteEvent) {
        if (this.selectedId == waterRecordDeleteEvent.getId() && this.deleteConfirmDialog.isShowing()) {
            dismissDeleteConfirmDialog();
        }
    }

    @Override // g3.b
    public void renderWaterRecord(List<Water> list) {
        if (list == null || list.size() <= 0) {
            ((ActivityWaterStatisticsBinding) this.binding).rcvWaterRecords.setVisibility(8);
            ((ActivityWaterStatisticsBinding) this.binding).rlWaterNoRecord.setVisibility(0);
        } else {
            ((ActivityWaterStatisticsBinding) this.binding).rlWaterNoRecord.setVisibility(8);
            ((ActivityWaterStatisticsBinding) this.binding).rcvWaterRecords.setVisibility(0);
            this.waterRecordAdapter.setNewData(list);
            updateShowMenu();
        }
    }

    @Override // g3.b
    public void showGoal(int i8) {
        com.orhanobut.logger.f.d("water ==> goal: " + i8);
        ((ActivityWaterStatisticsBinding) this.binding).tvWaterGoal.setText(getString(R.string.water_total_intake, i8 + WaterProvider.getWaterUnit(this)));
    }

    @Override // g3.b
    @SuppressLint({"SetTextI18n"})
    public void showPercentage(int i8, boolean z7) {
        com.orhanobut.logger.f.d("water ==> percentage: " + i8);
        int min = Math.min(Math.max(0, i8), 100);
        String valueOf = String.valueOf(min);
        ((ActivityWaterStatisticsBinding) this.binding).tvWaterPercentage.setText(valueOf + "%");
        ((ActivityWaterStatisticsBinding) this.binding).tvWaterPercentageNote.setText(getString(R.string.water_percentage_note, valueOf + "%"));
        showWaveAnimation((((float) min) * 1.0f) / 100.0f, z7);
    }

    @Override // g3.b
    public void showTotalIntake(int i8) {
        com.orhanobut.logger.f.d("water ==> totalIntake: " + i8);
        ((ActivityWaterStatisticsBinding) this.binding).tvWaterTotalIntake.setText(String.valueOf(Math.max(0, i8)));
    }
}
