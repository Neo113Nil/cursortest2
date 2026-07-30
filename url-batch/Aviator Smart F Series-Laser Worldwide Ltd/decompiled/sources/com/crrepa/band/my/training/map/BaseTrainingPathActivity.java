package com.crrepa.band.my.training.map;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.mapapi.http.HttpClient;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityTrainingPathBinding;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.GpsTraining;
import com.crrepa.band.my.model.gps.GpsTrainingInfoModel;
import com.crrepa.band.my.model.gps.TrainingLocation;
import com.crrepa.band.my.profile.strava.StravaMainActivity;
import com.crrepa.band.my.training.TrainingHistoryActivity;
import com.crrepa.band.my.training.adapter.GpsTrainingInfoAdapter;
import com.crrepa.band.my.training.adapter.OneDistancePaceAdapter;
import com.crrepa.band.my.training.gomoresport.GomoreSportTipsDialog;
import com.crrepa.band.my.training.map.TrainingPathShareDialog;
import com.crrepa.band.my.training.presenter.TrainingPathPresenter;
import com.crrepa.band.my.training.widgets.TrainingEffectProgressView;
import com.crrepa.ble.conn.bean.CRPTrainingAdvancedInfo;
import com.moyoung.dafit.module.common.baseui.BaseRequestPermissionVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.widgets.chart.CrpLineChart;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class BaseTrainingPathActivity extends BaseRequestPermissionVBActivity<ActivityTrainingPathBinding> implements x3.c {
    protected GpsTrainingInfoAdapter gpsTrainingInfoAdapter;
    public b onMapScreenShotListener;
    private TrainingPathPresenter.TrainingSourceType trainingSourceType;
    protected TrainingPathPresenter trainingPathPresenter = new TrainingPathPresenter();
    protected boolean isBandGpsPath = false;
    protected double milestoneDistance = getMilestoneDistance();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$band$my$training$presenter$TrainingPathPresenter$TrainingSourceType;

        static {
            int[] iArr = new int[TrainingPathPresenter.TrainingSourceType.values().length];
            $SwitchMap$com$crrepa$band$my$training$presenter$TrainingPathPresenter$TrainingSourceType = iArr;
            try {
                iArr[TrainingPathPresenter.TrainingSourceType.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$training$presenter$TrainingPathPresenter$TrainingSourceType[TrainingPathPresenter.TrainingSourceType.WATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$training$presenter$TrainingPathPresenter$TrainingSourceType[TrainingPathPresenter.TrainingSourceType.WATCH_AND_APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface b {
        void onShot(Bitmap bitmap);
    }

    private void doScreenShoot() {
        if (!isMapMode()) {
            saveScreenShoot(null);
        } else {
            setOnMapScreenShotListener(new b() { // from class: com.crrepa.band.my.training.map.n
                @Override // com.crrepa.band.my.training.map.BaseTrainingPathActivity.b
                public final void onShot(Bitmap bitmap) {
                    BaseTrainingPathActivity.this.lambda$doScreenShoot$5(bitmap);
                }
            });
            shotMap();
        }
    }

    public static Intent getCallingIntent(Context context, long j8, int i8, boolean z7) {
        Intent intent = i8 == 1 ? new Intent(context, (Class<?>) GoogleMapTrainingPathActivity.class) : new Intent(context, (Class<?>) NoMapTrainingPathActivity.class);
        intent.putExtra(TrainingHistoryActivity.PATH_ID, j8);
        intent.putExtra("mapType", i8);
        intent.putExtra("isFromHistory", z7);
        return intent;
    }

    private long getTrainingId() {
        return getIntent().getLongExtra(TrainingHistoryActivity.PATH_ID, -1L);
    }

    private void initElevationChart(CrpLineChart crpLineChart) {
        crpLineChart.init(0);
        crpLineChart.hideXAxisLabels();
        crpLineChart.setLeftAxis(3);
        crpLineChart.getAxisLeft().setDrawZeroLine(false);
        crpLineChart.getAxisLeft().setDrawGridLines(true);
        crpLineChart.getAxisLeft().setGridLineWidth(1.0f);
        crpLineChart.getAxisLeft().setGridColor(ContextCompat.getColor(this, R.color.color_gps_training_33));
        crpLineChart.getAxisLeft().setTextColor(ContextCompat.getColor(this, R.color.dark_grey));
        crpLineChart.setXAxisLineWidth(1);
        crpLineChart.setXAxisLineColor(R.color.color_gps_training);
    }

    private void initHeartRateChart(CrpLineChart crpLineChart) {
        crpLineChart.init(0);
        crpLineChart.hideXAxisLabels();
        crpLineChart.setLeftAxis();
        crpLineChart.getAxisLeft().setDrawZeroLine(false);
        crpLineChart.getAxisLeft().setDrawGridLines(true);
        crpLineChart.getAxisLeft().setGridLineWidth(1.0f);
        crpLineChart.getAxisLeft().setGridColor(ContextCompat.getColor(this, R.color.assist_15_33));
        crpLineChart.getAxisLeft().setTextColor(ContextCompat.getColor(this, R.color.dark_grey));
        crpLineChart.setXAxisLineWidth(1);
        crpLineChart.setXAxisLineColor(R.color.assist_15);
        crpLineChart.setMaxValue(200.0f);
        crpLineChart.getAxisLeft().setAxisMinimum(0.0f);
    }

    private void initRealTimePaceChart(CrpLineChart crpLineChart) {
        crpLineChart.init(0);
        crpLineChart.hideXAxisLabels();
        crpLineChart.setLeftAxis(3);
        crpLineChart.getAxisLeft().setDrawZeroLine(false);
        crpLineChart.getAxisLeft().setDrawGridLines(true);
        crpLineChart.getAxisLeft().setGridLineWidth(1.0f);
        crpLineChart.getAxisLeft().setGridColor(ContextCompat.getColor(this, R.color.main_33));
        crpLineChart.getAxisLeft().setTextColor(ContextCompat.getColor(this, R.color.dark_grey));
        crpLineChart.setXAxisLineWidth(1);
        crpLineChart.setXAxisLineColor(R.color.main);
        crpLineChart.getAxisLeft().setValueFormatter(new com.crrepa.band.my.training.widgets.a());
    }

    private void initStepsInfoChart(CrpLineChart crpLineChart) {
        crpLineChart.init(5);
        crpLineChart.hideXAxisLabels();
        crpLineChart.setLeftAxis();
        crpLineChart.getAxisLeft().setDrawZeroLine(false);
        crpLineChart.getAxisLeft().setDrawGridLines(true);
        crpLineChart.getAxisLeft().setGridLineWidth(1.0f);
        crpLineChart.getAxisLeft().setGridColor(ContextCompat.getColor(this, R.color.assist_11_33_33));
        crpLineChart.getAxisLeft().setTextColor(ContextCompat.getColor(this, R.color.assist_11_33));
        crpLineChart.setXAxisLineWidth(1);
        crpLineChart.setXAxisLineColor(R.color.assist_11_33);
        if (isMapMode()) {
            crpLineChart.setRightAxis();
            crpLineChart.getAxisRight().setDrawZeroLine(false);
            crpLineChart.getAxisRight().setTextColor(ContextCompat.getColor(this, R.color.assist_11_33));
        }
    }

    private void initTrainingInfoList() {
        ((ActivityTrainingPathBinding) this.binding).includeDetail.rcvTrainingInfo.setLayoutManager(new GridLayoutManager(this, 3));
        ((ActivityTrainingPathBinding) this.binding).includeDetail.rcvTrainingInfo.setAdapter(this.gpsTrainingInfoAdapter);
    }

    private boolean isMapMode() {
        int intExtra = getIntent().getIntExtra("mapType", 0);
        Log.d("isMapMode", "mapType=" + intExtra);
        return intExtra != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doScreenShoot$5(Bitmap bitmap) {
        if (bitmap == null) {
            r0.showShort(getApplicationContext(), getString(R.string.gps_record_save_image_photos_defeated));
        } else {
            saveScreenShoot(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        doScreenShoot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        resetMapCamera();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3() {
        this.trainingPathPresenter.uploadGPXFile(getTrainingId(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$4(View view) {
        TrainingPathShareDialog trainingPathShareDialog = new TrainingPathShareDialog(this);
        trainingPathShareDialog.show();
        trainingPathShareDialog.setOnDoneClickListener(new TrainingPathShareDialog.a() { // from class: com.crrepa.band.my.training.map.m
            @Override // com.crrepa.band.my.training.map.TrainingPathShareDialog.a
            public final void onStravaClick() {
                BaseTrainingPathActivity.this.lambda$initBinding$3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderGomoreEnergySource$9(View view) {
        showGomoreTipsDialog(R.string.training_energy_source, R.string.training_desc_energy_source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderGomoreRecoveryTime$10(View view) {
        showGomoreTipsDialog(R.string.training_recovery_time, R.string.training_recovery_desc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderGomoreRunningPose$7(View view) {
        showGomoreTipsDialog(R.string.training_running_form, R.string.training_desc_stance_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderGomoreTrainingEffect$8(View view) {
        showGomoreTipsDialog(R.string.training_effect, R.string.training_desc_training_effect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showShotBtn$6(Bitmap bitmap) {
        ((ActivityTrainingPathBinding) this.binding).slShoot.setVisibility(0);
    }

    private void saveGpsTrackShoot() {
        ((ActivityTrainingPathBinding) this.binding).gpsTrackView.setDrawingCacheEnabled(true);
        ((ActivityTrainingPathBinding) this.binding).gpsTrackView.buildDrawingCache();
        Bitmap createBitmap = Bitmap.createBitmap(((ActivityTrainingPathBinding) this.binding).gpsTrackView.getMeasuredWidth(), ((ActivityTrainingPathBinding) this.binding).gpsTrackView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        ((ActivityTrainingPathBinding) this.binding).gpsTrackView.draw(new Canvas(createBitmap));
        com.moyoung.dafit.module.common.utils.r.save2Gallery(getApplicationContext(), createBitmap, "GpsTrackShoot " + com.moyoung.dafit.module.common.utils.m.format(new Date(), "yyyy-MM-dd hh.mm.ss") + ".png");
    }

    private void saveScreenShoot(Bitmap bitmap) {
        String str = "Training Path " + com.moyoung.dafit.module.common.utils.m.format(new Date(), "yyyy-MM-dd hh.mm.ss") + ".png";
        Bitmap bitmapByView = com.crrepa.band.my.training.utils.l.getBitmapByView(((ActivityTrainingPathBinding) this.binding).llContent);
        if (bitmap != null) {
            com.moyoung.dafit.module.common.utils.r.save2Gallery(getApplicationContext(), com.crrepa.band.my.training.utils.l.jointBitmapToBottom(bitmap, bitmapByView), str);
        } else {
            com.moyoung.dafit.module.common.utils.r.save2Gallery(getApplicationContext(), bitmapByView, str);
        }
        r0.showShort(getString(R.string.gps_record_save_image_photos_succeed));
    }

    private void showGomoreTipsDialog(@StringRes int i8, @StringRes int i9) {
        GomoreSportTipsDialog gomoreSportTipsDialog = new GomoreSportTipsDialog(this);
        gomoreSportTipsDialog.showData(i8, i9);
        gomoreSportTipsDialog.show();
    }

    private void showNoMapUI() {
        ((ActivityTrainingPathBinding) this.binding).flMap.setVisibility(8);
        ((ActivityTrainingPathBinding) this.binding).ivShare.setVisibility(8);
        ((ActivityTrainingPathBinding) this.binding).includeDetail.rlSpeedRange.setVisibility(8);
        ((ActivityTrainingPathBinding) this.binding).rlTitle.setVisibility(0);
        ((ActivityTrainingPathBinding) this.binding).slShoot.setVisibility(0);
    }

    private void showShotBtn() {
        setOnMapScreenShotListener(new b() { // from class: com.crrepa.band.my.training.map.p
            @Override // com.crrepa.band.my.training.map.BaseTrainingPathActivity.b
            public final void onShot(Bitmap bitmap) {
                BaseTrainingPathActivity.this.lambda$showShotBtn$6(bitmap);
            }
        });
    }

    protected Bitmap buildMilestoneView(int i8) {
        TextView textView = new TextView(this);
        textView.setText(String.valueOf(i8));
        textView.setGravity(17);
        textView.setTextColor(ContextCompat.getColor(this, R.color.white));
        textView.setTextSize(com.moyoung.dafit.module.common.utils.o.dp2px(this, 2.5f));
        textView.setBackgroundResource(R.drawable.shape_map_milestone_bg);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.addView(textView);
        frameLayout.setDrawingCacheEnabled(true);
        return com.crrepa.band.my.training.utils.r.toBitmap(frameLayout);
    }

    protected double getMilestoneDistance() {
        return BandUnitSystemProvider.isImperialSystem() ? 1609.0d : 1000.0d;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setLightMode(this);
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.translucent));
        this.gpsTrainingInfoAdapter = new GpsTrainingInfoAdapter(this);
        ((ActivityTrainingPathBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseTrainingPathActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityTrainingPathBinding) this.binding).slShoot.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseTrainingPathActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityTrainingPathBinding) this.binding).ivLocation.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseTrainingPathActivity.this.lambda$initBinding$2(view);
            }
        });
        ((ActivityTrainingPathBinding) this.binding).ivShare.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseTrainingPathActivity.this.lambda$initBinding$4(view);
            }
        });
        initTrainingInfoList();
        this.trainingPathPresenter.setView(this);
        this.trainingPathPresenter.setMapMode(isMapMode());
        long trainingId = getTrainingId();
        boolean booleanExtra = getIntent().getBooleanExtra("isFromHistory", true);
        this.trainingPathPresenter.getGpsTrainingDetail(this, trainingId, booleanExtra);
        if (isMapMode()) {
            showShotBtn();
        }
        if (!isMapMode()) {
            showNoMapUI();
        }
        if (booleanExtra || ((ActivityTrainingPathBinding) this.binding).ivShare.getVisibility() != 0) {
            return;
        }
        this.trainingPathPresenter.uploadGPXFile(getTrainingId(), false);
    }

    protected void loadTrainingPath() {
        if (isMapMode()) {
            this.trainingPathPresenter.renderTrainingPath(getTrainingId());
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.trainingPathPresenter.destroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.trainingPathPresenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.trainingPathPresenter.resume();
        s0.logPage(getClass(), "锻炼详情");
    }

    protected void releaseGoogleMap() {
        if (isMapMode()) {
            ((ActivityTrainingPathBinding) this.binding).googleMapView.onDestroy();
        }
    }

    @Override // x3.c
    public void renderBandGpsPath(boolean z7) {
        this.isBandGpsPath = z7;
        if (z7) {
            ((ActivityTrainingPathBinding) this.binding).includeDetail.rlSpeedRange.setVisibility(8);
        }
    }

    @Override // x3.c
    public void renderDistance(String str) {
        ((ActivityTrainingPathBinding) this.binding).includeDetail.tvDistance.setText(String.valueOf(str));
    }

    @Override // x3.c
    public void renderDistancePercent(float f8) {
        this.milestoneDistance *= f8;
    }

    @Override // x3.c
    public void renderDistanceUnit(int i8) {
        ((ActivityTrainingPathBinding) this.binding).includeDetail.tvDistanceUnit.setText(i8);
    }

    @Override // x3.c
    public void renderElevationChart(Date date, Date date2, List<Float> list, String str, String str2, String str3, String str4, String str5) {
        ((ActivityTrainingPathBinding) this.binding).includeElevation.llElevationChart.setVisibility(0);
        CrpLineChart crpLineChart = ((ActivityTrainingPathBinding) this.binding).includeElevation.chartElevation;
        initElevationChart(crpLineChart);
        int intValue = ((Float) Collections.max(list)).intValue();
        if (intValue % 10 != 0) {
            intValue = ((intValue / 10) * 10) + 10;
        }
        int intValue2 = ((Float) Collections.min(list)).intValue();
        if (intValue2 % 10 != 0) {
            intValue2 = ((intValue2 / 10) * 10) - 10;
        }
        if (intValue == intValue2) {
            intValue2 -= 10;
        }
        crpLineChart.setMaxValue(intValue);
        crpLineChart.setMinValue(intValue2);
        crpLineChart.setData(list, ContextCompat.getDrawable(this, R.drawable.fade_elevation_chart), ContextCompat.getColor(this, R.color.color_gps_training), 2.0f);
        ((ActivityTrainingPathBinding) this.binding).includeElevation.tvLowestElevation.setText(str2);
        ((ActivityTrainingPathBinding) this.binding).includeElevation.tvAverageElevation.setText(str);
        ((ActivityTrainingPathBinding) this.binding).includeElevation.tvHighestElevation.setText(str3);
        ((ActivityTrainingPathBinding) this.binding).includeElevation.tvGainCumulative.setText(str4);
        ((ActivityTrainingPathBinding) this.binding).includeElevation.tvLossCumulative.setText(str5);
        ((ActivityTrainingPathBinding) this.binding).includeElevation.tvStartTime.setText(com.crrepa.band.my.training.utils.q.getTrainingTime(this, date));
        ((ActivityTrainingPathBinding) this.binding).includeElevation.tvEndTime.setText(com.crrepa.band.my.training.utils.q.getTrainingTime(this, date2));
    }

    @Override // x3.c
    public void renderGomoreAvgStepMsg(float f8, float f9) {
        ((ActivityTrainingPathBinding) this.binding).includeSteps.tvAvgRate.setText(com.moyoung.dafit.module.common.utils.n.format(f8, com.moyoung.dafit.module.common.utils.n.TWO_DECIMAL_PATTERN));
        ((ActivityTrainingPathBinding) this.binding).includeSteps.tvAvgStride.setText(String.format(Locale.getDefault(), "%.2f", Float.valueOf(f9 / 100.0f)));
    }

    @Override // x3.c
    public void renderGomoreEnergySource(int i8, int i9) {
        ((ActivityTrainingPathBinding) this.binding).includeEnergySource.llGomoreSportEnergySource.setVisibility(0);
        ((ActivityTrainingPathBinding) this.binding).includeEnergySource.tvEnergyFat.setText(String.valueOf(i8));
        ((ActivityTrainingPathBinding) this.binding).includeEnergySource.tvEnergyCarb.setText(String.valueOf(i9));
        ((ActivityTrainingPathBinding) this.binding).includeEnergySource.tvEnergySourceTitle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseTrainingPathActivity.this.lambda$renderGomoreEnergySource$9(view);
            }
        });
    }

    @Override // x3.c
    public void renderGomoreRecoveryTime(int i8) {
        ((ActivityTrainingPathBinding) this.binding).includeRecoveryTime.rlGomoreSportRecoveryTime.setVisibility(0);
        ((ActivityTrainingPathBinding) this.binding).includeRecoveryTime.tvRecoveryTime.setText(com.moyoung.dafit.module.common.utils.n.format(i8 / 3600, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN) + ":" + com.moyoung.dafit.module.common.utils.n.format((i8 % 3600) / 60, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN) + ":" + com.moyoung.dafit.module.common.utils.n.format(i8 % 60, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN));
        ((ActivityTrainingPathBinding) this.binding).includeRecoveryTime.tvRecoveryTimeTitle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseTrainingPathActivity.this.lambda$renderGomoreRecoveryTime$10(view);
            }
        });
    }

    @Override // x3.c
    public void renderGomoreRunningPose(CRPTrainingAdvancedInfo.RunningInfo runningInfo) {
        ((ActivityTrainingPathBinding) this.binding).includeRunningPose.llGomoreSportRunningPose.setVisibility(0);
        float averageTouchDownTime = runningInfo.getAverageTouchDownTime();
        String str = HttpClient.ENDFLAG;
        ((ActivityTrainingPathBinding) this.binding).includeRunningPose.tvAvgStanceTime.setText(averageTouchDownTime > 0.0f ? String.valueOf((int) averageTouchDownTime) : HttpClient.ENDFLAG);
        if (runningInfo.getAverageBalance() > 0.0f) {
            String format = String.format(Locale.getDefault(), "%.2f", Double.valueOf(Math.floor(r0 * 100.0f) / 100.0d));
            ((ActivityTrainingPathBinding) this.binding).includeRunningPose.tvAvgStanceBalanceLeft.setText(format);
            ((ActivityTrainingPathBinding) this.binding).includeRunningPose.tvAvgStanceBalanceRight.setText((100.0f - Float.parseFloat(format)) + "");
        }
        float averageShakeAmplitude = runningInfo.getAverageShakeAmplitude();
        ((ActivityTrainingPathBinding) this.binding).includeRunningPose.tvAvgVerticalOscillation.setText(averageShakeAmplitude > 0.0f ? String.valueOf((int) averageShakeAmplitude) : HttpClient.ENDFLAG);
        float averagePower = runningInfo.getAveragePower();
        if (averagePower > 0.0f) {
            str = String.valueOf((int) averagePower);
        }
        ((ActivityTrainingPathBinding) this.binding).includeRunningPose.tvAvgRunPower.setText(str);
        ((ActivityTrainingPathBinding) this.binding).includeRunningPose.tvRunningPoseTitle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseTrainingPathActivity.this.lambda$renderGomoreRunningPose$7(view);
            }
        });
    }

    @Override // x3.c
    public void renderGomoreTitle(String str) {
        ((ActivityTrainingPathBinding) this.binding).tvTitle.setVisibility(8);
        ((ActivityTrainingPathBinding) this.binding).llGomoreTitle.setVisibility(0);
        ((ActivityTrainingPathBinding) this.binding).tvGomoreTitle.setText(str);
    }

    @Override // x3.c
    public void renderGomoreTrainingEffect(float f8, String str, float f9, String str2) {
        ((ActivityTrainingPathBinding) this.binding).includeTrainingEffect.llGomoreSportTrainingEffect.setVisibility(0);
        ((ActivityTrainingPathBinding) this.binding).includeTrainingEffect.tvAerobic.setText(String.valueOf(f8));
        ((ActivityTrainingPathBinding) this.binding).includeTrainingEffect.tvAerobicLevel.setText(str);
        ((ActivityTrainingPathBinding) this.binding).includeTrainingEffect.tvAnaerobic.setText(String.valueOf(f9));
        ((ActivityTrainingPathBinding) this.binding).includeTrainingEffect.tvAnaerobicLevel.setText(str2);
        TrainingEffectProgressView trainingEffectProgressView = ((ActivityTrainingPathBinding) this.binding).includeTrainingEffect.chartAerobic;
        trainingEffectProgressView.setProgress((int) (f8 * 10.0f));
        trainingEffectProgressView.setMax(60);
        trainingEffectProgressView.setProgressColor(getResources().getColor(R.color.training_main_2_btn));
        trainingEffectProgressView.setBackgroundColor(getResources().getColor(R.color.assist_4));
        TrainingEffectProgressView trainingEffectProgressView2 = ((ActivityTrainingPathBinding) this.binding).includeTrainingEffect.chartAnaerobic;
        trainingEffectProgressView2.setProgress((int) (f9 * 10.0f));
        trainingEffectProgressView2.setMax(60);
        trainingEffectProgressView2.setProgressColor(getResources().getColor(R.color.training_main_2_btn));
        trainingEffectProgressView2.setBackgroundColor(getResources().getColor(R.color.assist_4));
        ((ActivityTrainingPathBinding) this.binding).includeTrainingEffect.tvTrainingEffectTitle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseTrainingPathActivity.this.lambda$renderGomoreTrainingEffect$8(view);
            }
        });
    }

    @Override // x3.c
    public void renderGomoreVo2max(String str) {
        ((ActivityTrainingPathBinding) this.binding).includeVo2max.rlGomoreSportVo2max.setVisibility(0);
        ((ActivityTrainingPathBinding) this.binding).includeVo2max.tvVo2max.setText(str);
    }

    @Override // x3.c
    public void renderGpsTrack(List<TrainingLocation> list) {
    }

    @Override // x3.c
    public void renderHeartRateAnalysis(int i8, int... iArr) {
        ((ActivityTrainingPathBinding) this.binding).includeHrZone.llHeartRateZone.setVisibility(0);
        ((ActivityTrainingPathBinding) this.binding).includeHrZone.heartRateRangeAnalysis.setHeartRateRangeData(i8, iArr);
    }

    @Override // x3.c
    public void renderHeartRateChart(GpsTraining gpsTraining, List<Float> list) {
        ((ActivityTrainingPathBinding) this.binding).includeHrChart.llHeartRateChart.setVisibility(0);
        CrpLineChart crpLineChart = ((ActivityTrainingPathBinding) this.binding).includeHrChart.chartHeartRate;
        initHeartRateChart(crpLineChart);
        crpLineChart.setData(list, ContextCompat.getDrawable(this, R.drawable.fade_heart_rate_chart), ContextCompat.getColor(this, R.color.color_gps_finish_path_slow), 2.0f);
        ((ActivityTrainingPathBinding) this.binding).includeHrChart.tvStartTime.setText(com.crrepa.band.my.training.utils.q.getTrainingTime(this, gpsTraining.getStartDate()));
        ((ActivityTrainingPathBinding) this.binding).includeHrChart.tvEndTime.setText(com.crrepa.band.my.training.utils.q.getTrainingTime(this, gpsTraining.getEndDate()));
    }

    @Override // x3.c
    public void renderHeartRateTotalSeconds(int i8) {
        q2.a.setAnalysisTime(this, ((ActivityTrainingPathBinding) this.binding).includeHrZone.tvTotalZoneTime, i8);
    }

    @Override // x3.c
    public void renderOneDistancePaceChart(List<Float> list, String str, String str2) {
        ((ActivityTrainingPathBinding) this.binding).includeOneDistancePace.llOneDistancePaceChart.setVisibility(0);
        RecyclerView recyclerView = ((ActivityTrainingPathBinding) this.binding).includeOneDistancePace.rvPace;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        OneDistancePaceAdapter oneDistancePaceAdapter = new OneDistancePaceAdapter(getApplicationContext(), list);
        recyclerView.setAdapter(oneDistancePaceAdapter);
        oneDistancePaceAdapter.setNewData(OneDistancePaceAdapter.createOneDistancePaceList(list));
        ((ActivityTrainingPathBinding) this.binding).includeOneDistancePace.tvLowestPace.setText(str);
        ((ActivityTrainingPathBinding) this.binding).includeOneDistancePace.tvFastestPace.setText(str2);
        if (BandUnitSystemProvider.isImperialSystem()) {
            ((ActivityTrainingPathBinding) this.binding).includeOneDistancePace.tvTitle.setText(getString(R.string.gps_result_per_mile_speed_title));
            ((ActivityTrainingPathBinding) this.binding).includeOneDistancePace.tvDistanceUnit.setText(getString(R.string.distance_unit_miles));
        } else {
            ((ActivityTrainingPathBinding) this.binding).includeOneDistancePace.tvTitle.setText(getString(R.string.gps_result_per_kilometer_speed_title));
            ((ActivityTrainingPathBinding) this.binding).includeOneDistancePace.tvDistanceUnit.setText(getString(R.string.distance_unit_km));
        }
    }

    @Override // x3.c
    public void renderRatingDialog() {
    }

    @Override // x3.c
    public void renderRealTimePaceChart(GpsTraining gpsTraining, List<Float> list, String str, String str2) {
        ((ActivityTrainingPathBinding) this.binding).includeRealTimePace.llRealTimePaceChart.setVisibility(0);
        CrpLineChart crpLineChart = ((ActivityTrainingPathBinding) this.binding).includeRealTimePace.chartRealTimePace;
        initRealTimePaceChart(crpLineChart);
        for (int i8 = 0; i8 < list.size(); i8++) {
            list.set(i8, Float.valueOf(list.get(i8).floatValue() / 10.0f));
        }
        crpLineChart.setMaxValue(((Float) Collections.max(list)).floatValue());
        crpLineChart.setData(list, ContextCompat.getDrawable(this, R.drawable.fade_real_time_pace_chart), ContextCompat.getColor(this, R.color.main), 2.0f);
        ((ActivityTrainingPathBinding) this.binding).includeRealTimePace.tvAveragePace.setText(str);
        ((ActivityTrainingPathBinding) this.binding).includeRealTimePace.tvFastestPace.setText(str2);
        ((ActivityTrainingPathBinding) this.binding).includeRealTimePace.tvStartTime.setText(com.crrepa.band.my.training.utils.q.getTrainingTime(this, gpsTraining.getStartDate()));
        ((ActivityTrainingPathBinding) this.binding).includeRealTimePace.tvEndTime.setText(com.crrepa.band.my.training.utils.q.getTrainingTime(this, gpsTraining.getEndDate()));
    }

    @Override // x3.c
    public void renderStepsInfoChart(GpsTraining gpsTraining, float f8, float f9, List<Float> list, List<Float> list2) {
        if (gpsTraining.getTrainingType().intValue() == 32) {
            return;
        }
        if (!isMapMode() || list2 == null) {
            ((ActivityTrainingPathBinding) this.binding).includeSteps.llAvgStride.setVisibility(8);
            ((ActivityTrainingPathBinding) this.binding).includeSteps.tvAvgStrideTips.setVisibility(8);
        }
        ((ActivityTrainingPathBinding) this.binding).includeSteps.llStepChart.setVisibility(0);
        CrpLineChart crpLineChart = ((ActivityTrainingPathBinding) this.binding).includeSteps.chartSteps;
        initStepsInfoChart(crpLineChart);
        if (gpsTraining.getAverageStepLength() != null) {
            ((ActivityTrainingPathBinding) this.binding).includeSteps.tvAvgStride.setText(com.moyoung.dafit.module.common.utils.n.format(r0.floatValue(), com.moyoung.dafit.module.common.utils.n.TWO_DECIMAL_PATTERN));
        } else {
            ((ActivityTrainingPathBinding) this.binding).includeSteps.tvAvgStride.setText(R.string.data_blank);
        }
        Integer averageStepFrequency = gpsTraining.getAverageStepFrequency();
        if (averageStepFrequency != null) {
            ((ActivityTrainingPathBinding) this.binding).includeSteps.tvAvgRate.setText(String.valueOf(averageStepFrequency));
        } else {
            ((ActivityTrainingPathBinding) this.binding).includeSteps.tvAvgRate.setText(R.string.data_blank);
        }
        ((ActivityTrainingPathBinding) this.binding).includeSteps.tvStartTime.setText(com.crrepa.band.my.training.utils.q.getTrainingTime(this, gpsTraining.getStartDate()));
        ((ActivityTrainingPathBinding) this.binding).includeSteps.tvEndTime.setText(com.crrepa.band.my.training.utils.q.getTrainingTime(this, gpsTraining.getEndDate()));
        crpLineChart.getAxisLeft().setAxisMaximum(f8 + (0.1f * f8));
        crpLineChart.getAxisRight().setAxisMaximum(f9 + (0.2f * f9));
        int color = ContextCompat.getColor(this, R.color.color_gps_training);
        if (isMapMode() && list2 != null) {
            crpLineChart.setData(list, list2, color, ContextCompat.getColor(this, R.color.color_gps_finish_path_fast), 2.0f);
        } else {
            crpLineChart.setData(list, color, 2.0f);
            ((ActivityTrainingPathBinding) this.binding).includeSteps.tvTitle.setText(getString(R.string.gps_training_stride_frequency_title));
        }
    }

    @Override // x3.c
    public void renderStravaOauthInvalid() {
        startActivity(new Intent(this, (Class<?>) StravaMainActivity.class));
    }

    @Override // x3.c
    public void renderStravaToast(@StringRes int i8) {
        r0.showShort(com.moyoung.dafit.module.common.utils.d.get(), i8);
    }

    @Override // x3.c
    public void renderTitle(String str) {
        ((ActivityTrainingPathBinding) this.binding).tvTitle.setText(str);
    }

    @Override // x3.c
    public void renderTrainingInfoList(List<GpsTrainingInfoModel> list) {
        this.gpsTrainingInfoAdapter.setNewData(list);
    }

    @Override // x3.c
    public abstract /* synthetic */ void renderTrainingPath(List list);

    @Override // x3.c
    @SuppressLint({"SetTextI18n"})
    public void renderTrainingSource(Date date, TrainingPathPresenter.TrainingSourceType trainingSourceType) {
        this.trainingSourceType = trainingSourceType;
        int i8 = a.$SwitchMap$com$crrepa$band$my$training$presenter$TrainingPathPresenter$TrainingSourceType[trainingSourceType.ordinal()];
        if (i8 == 1) {
            ((ActivityTrainingPathBinding) this.binding).includeDetail.ivDataOrigin.setImageResource(R$drawable.ic_gps_phone);
        } else if (i8 == 2) {
            ((ActivityTrainingPathBinding) this.binding).includeDetail.ivDataOrigin.setImageResource(R$drawable.ic_gps_watch);
        } else if (i8 == 3) {
            ((ActivityTrainingPathBinding) this.binding).includeDetail.ivDataOrigin.setImageResource(R$drawable.ic_gps_connect);
        }
        String format = com.moyoung.dafit.module.common.utils.m.format(date, getString(R.string.year_month_day_format));
        String formatPeriodTime = m3.a.formatPeriodTime(this, date);
        ((ActivityTrainingPathBinding) this.binding).includeDetail.tvTime.setText(format + cn.hutool.core.text.l.SPACE + formatPeriodTime);
    }

    @Override // x3.c
    public void renderTrainingWeather(GpsTraining gpsTraining) {
        if (isMapMode()) {
            int intValue = gpsTraining.getNowTemperature().intValue();
            int intValue2 = gpsTraining.getWeatherCode().intValue();
            if (intValue2 == -1 || intValue == 10000) {
                return;
            }
            ((ActivityTrainingPathBinding) this.binding).includeDetail.tvTemp.setVisibility(0);
            ((ActivityTrainingPathBinding) this.binding).includeDetail.ivWeather.setVisibility(0);
            ((ActivityTrainingPathBinding) this.binding).includeDetail.tvTemp.setText(l2.b.getTempStr(getApplicationContext(), intValue, gpsTraining.getNowTemperatureUnit().intValue()));
            ((ActivityTrainingPathBinding) this.binding).includeDetail.ivWeather.setImageDrawable(getResources().getDrawable(c2.e.getWeatherCodeIcon(intValue2)));
        }
    }

    public abstract void resetMapCamera();

    public void setOnMapScreenShotListener(b bVar) {
        this.onMapScreenShotListener = bVar;
    }

    public abstract void shotMap();
}
