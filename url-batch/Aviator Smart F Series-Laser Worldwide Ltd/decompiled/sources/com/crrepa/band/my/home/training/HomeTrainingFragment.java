package com.crrepa.band.my.home.training;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.FragmentHomeTrainingBinding;
import com.crrepa.band.my.home.device.permisisonexplain.PermissionRequestDialog;
import com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog;
import com.crrepa.band.my.home.training.model.HomeTrainingEvent;
import com.crrepa.band.my.home.training.model.HomeTrainingModel;
import com.crrepa.band.my.home.training.model.HomeTrainingRecordsBean;
import com.crrepa.band.my.home.training.model.HomeWeatherEvent;
import com.crrepa.band.my.model.GpsTrainingModel;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.band.my.training.RequestLocationActivity;
import com.crrepa.band.my.training.TrainingHistoryActivity;
import com.crrepa.band.my.training.TrainingSettingActivity;
import com.crrepa.band.my.training.TrainingWearTipsActivity;
import com.crrepa.band.my.training.goalsetting.GpsTrainingGoalActivity;
import com.crrepa.band.my.training.map.BaseMapTrainingActivity;
import com.crrepa.band.my.training.widgets.GpsSignalView;
import com.google.android.gms.maps.MapView;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.utils.c0;
import com.moyoung.dafit.module.common.utils.o0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.instructions.utils.InstructionsType;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;

@SuppressLint({"NeedOnRequestPermissionsResult"})
/* loaded from: classes2.dex */
public abstract class HomeTrainingFragment extends BaseVBFragment<FragmentHomeTrainingBinding> {
    public static final String[] ACTIVITY_PERMISSIONS;
    public static final int LOCATION_INTERVAL = 30000;
    public static final String[] LOCATION_PERMISSIONS;
    private static final GpsTrainingModel.GpsTrainingType[] TRAINING_RUNNING_TYPE_ARRAY;
    private static final GpsTrainingModel.GpsTrainingType[] TRAINING_TYPE_ARRAY;
    private static final int[] TRAINING_TYPE_RES_ID_ARRAY;
    private static final GpsTrainingModel.GpsTrainingType[] TRAINING_WALKING_TYPE_ARRAY;
    public static final int UNDEFINE_TEMPERATURE = 10000;
    protected MapView googleMapView;
    protected GpsSignalView gpsSignalView;
    private PermissionRequestDialog permissionRequestDialog;
    private int weatherCode;
    private com.crrepa.band.my.device.weather.b weatherPresenter;
    protected boolean hasLocationPermission = false;
    protected HomeTrainingModel trainingModel = new HomeTrainingModel();
    private GpsTrainingModel.GpsTrainingType trainingType = TRAINING_TYPE_ARRAY[0];
    private int nowTemperature = 10000;
    private final CompositeDisposable disposableList = new CompositeDisposable();

    class a implements TabLayout.OnTabSelectedListener {
        final /* synthetic */ TabLayout val$tabLayoutRunning;
        final /* synthetic */ TabLayout val$tabLayoutWalking;

        a(TabLayout tabLayout, TabLayout tabLayout2) {
            this.val$tabLayoutRunning = tabLayout;
            this.val$tabLayoutWalking = tabLayout2;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            TabLayout.Tab tabAt = this.val$tabLayoutRunning.getTabAt(0);
            Objects.requireNonNull(tabAt);
            tabAt.select();
            TabLayout.Tab tabAt2 = this.val$tabLayoutWalking.getTabAt(0);
            Objects.requireNonNull(tabAt2);
            tabAt2.select();
            int position = tab.getPosition();
            HomeTrainingFragment.this.trainingType = HomeTrainingFragment.TRAINING_TYPE_ARRAY[position];
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((FragmentHomeTrainingBinding) ((BaseVBFragment) HomeTrainingFragment.this).binding).rlTrainingGuidance.getLayoutParams();
            if (position == 0) {
                layoutParams.addRule(2, R.id.sl_shoot_running);
            } else {
                layoutParams.addRule(2, R.id.sl_shoot_walking);
            }
            ((FragmentHomeTrainingBinding) ((BaseVBFragment) HomeTrainingFragment.this).binding).slShootRunning.setVisibility(position == 0 ? 0 : 8);
            ((FragmentHomeTrainingBinding) ((BaseVBFragment) HomeTrainingFragment.this).binding).slShootWalking.setVisibility(position != 1 ? 8 : 0);
            HomeTrainingFragment.this.updateIndoorTrainingUI();
            HomeTrainingFragment.this.showImgByTrainingType();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    class b implements TabLayout.OnTabSelectedListener {
        final /* synthetic */ TabLayout val$tabLayoutRunning;

        b(TabLayout tabLayout) {
            this.val$tabLayoutRunning = tabLayout;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        @SuppressLint({"UseCompatLoadingForDrawables"})
        public void onTabSelected(TabLayout.Tab tab) {
            int position = tab.getPosition();
            HomeTrainingFragment.this.trainingType = HomeTrainingFragment.TRAINING_RUNNING_TYPE_ARRAY[position];
            HomeTrainingFragment.this.updateIndoorTrainingUI();
            HomeTrainingFragment.this.showImgByTrainingType();
            o0.updateTabItemStyle(this.val$tabLayoutRunning);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    class c implements TabLayout.OnTabSelectedListener {
        final /* synthetic */ TabLayout val$tabLayoutWalking;

        c(TabLayout tabLayout) {
            this.val$tabLayoutWalking = tabLayout;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            int position = tab.getPosition();
            HomeTrainingFragment.this.trainingType = HomeTrainingFragment.TRAINING_WALKING_TYPE_ARRAY[position];
            HomeTrainingFragment.this.updateIndoorTrainingUI();
            HomeTrainingFragment.this.showImgByTrainingType();
            o0.updateTabItemStyle(this.val$tabLayoutWalking);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    class d implements PermissionDescriptionDialog.b {
        d() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("定位", true);
            k.requestLocationPermissionWithPermissionCheck(HomeTrainingFragment.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("定位", false);
        }
    }

    class e implements PermissionDescriptionDialog.b {
        e() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("运动数据", true);
            k.startNoDeviceTrainingWithPermissionCheck(HomeTrainingFragment.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("运动数据", false);
        }
    }

    static {
        GpsTrainingModel.GpsTrainingType gpsTrainingType = GpsTrainingModel.GpsTrainingType.RUNNING;
        GpsTrainingModel.GpsTrainingType gpsTrainingType2 = GpsTrainingModel.GpsTrainingType.WALKING;
        TRAINING_TYPE_ARRAY = new GpsTrainingModel.GpsTrainingType[]{gpsTrainingType, gpsTrainingType2, GpsTrainingModel.GpsTrainingType.CYCLING};
        TRAINING_TYPE_RES_ID_ARRAY = new int[]{R.string.training_names_running, R.string.training_names_walking, R.string.training_names_bicycle};
        TRAINING_RUNNING_TYPE_ARRAY = new GpsTrainingModel.GpsTrainingType[]{gpsTrainingType, GpsTrainingModel.GpsTrainingType.TRAIL_RUNNING, GpsTrainingModel.GpsTrainingType.INDOOR_RUNNING};
        TRAINING_WALKING_TYPE_ARRAY = new GpsTrainingModel.GpsTrainingType[]{gpsTrainingType2, GpsTrainingModel.GpsTrainingType.ON_FOOT, GpsTrainingModel.GpsTrainingType.INDOOR_WALKING};
        LOCATION_PERMISSIONS = new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
        ACTIVITY_PERMISSIONS = new String[]{"android.permission.ACTIVITY_RECOGNITION"};
    }

    public static HomeTrainingFragment getInstance() {
        return com.crrepa.band.my.training.utils.h.isGooglePlayServices(com.moyoung.dafit.module.common.utils.d.get()) ? new HomeTrainingGoogleMapFragment() : new HomeTrainingNoMapFragment();
    }

    private void initTrainingTypeView() {
        VB vb = this.binding;
        TabLayout tabLayout = ((FragmentHomeTrainingBinding) vb).tabTrainingType;
        TabLayout tabLayout2 = ((FragmentHomeTrainingBinding) vb).tabTrainingRunning;
        LinearLayout linearLayout = (LinearLayout) tabLayout2.getChildAt(0);
        linearLayout.setShowDividers(2);
        linearLayout.setDividerDrawable(new ColorDrawable(ContextCompat.getColor(requireContext(), R.color.assist_10_66)));
        linearLayout.setDividerPadding(24);
        TabLayout tabLayout3 = ((FragmentHomeTrainingBinding) this.binding).tabTrainingWalking;
        LinearLayout linearLayout2 = (LinearLayout) tabLayout3.getChildAt(0);
        linearLayout2.setShowDividers(2);
        linearLayout2.setDividerDrawable(new ColorDrawable(ContextCompat.getColor(requireContext(), R.color.assist_7_B3)));
        linearLayout2.setDividerPadding(24);
        for (int i8 : TRAINING_TYPE_RES_ID_ARRAY) {
            String string = getResources().getString(i8);
            TabLayout.Tab newTab = tabLayout.newTab();
            tabLayout.addTab(newTab.setText(string));
            o0.hideTabToast(newTab);
        }
        for (GpsTrainingModel.GpsTrainingType gpsTrainingType : TRAINING_RUNNING_TYPE_ARRAY) {
            String trainingName = HomeTrainingModel.getTrainingName(requireContext(), gpsTrainingType);
            TabLayout.Tab newTab2 = tabLayout2.newTab();
            tabLayout2.addTab(newTab2.setText(trainingName));
            o0.hideTabToast(newTab2);
        }
        TabLayout.Tab tabAt = tabLayout2.getTabAt(0);
        Objects.requireNonNull(tabAt);
        tabAt.select();
        o0.updateTabItemStyle(tabLayout2);
        for (GpsTrainingModel.GpsTrainingType gpsTrainingType2 : TRAINING_WALKING_TYPE_ARRAY) {
            String trainingName2 = HomeTrainingModel.getTrainingName(requireContext(), gpsTrainingType2);
            TabLayout.Tab newTab3 = tabLayout3.newTab();
            tabLayout3.addTab(newTab3.setText(trainingName2));
            o0.hideTabToast(newTab3);
        }
        o0.updateTabItemStyle(tabLayout3);
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a(tabLayout2, tabLayout3));
        tabLayout2.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new b(tabLayout2));
        tabLayout3.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new c(tabLayout3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        startActivity(TrainingHistoryActivity.getCallingIntent(requireActivity()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        startActivity(GpsTrainingGoalActivity.getCallingIntent(requireActivity(), this.trainingType, this.nowTemperature, this.weatherCode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(View view) {
        if (this.hasLocationPermission) {
            renderMapCamera();
        } else {
            showNeedLocationPermission();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$4(View view) {
        startActivity(new Intent(requireActivity(), (Class<?>) TrainingSettingActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$5(View view) {
        startActivity(new Intent(requireActivity(), (Class<?>) TrainingWearTipsActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$6(View view) {
        GpsTrainingModel.GpsTrainingType gpsTrainingType = this.trainingType;
        if (gpsTrainingType == GpsTrainingModel.GpsTrainingType.INDOOR_RUNNING || gpsTrainingType == GpsTrainingModel.GpsTrainingType.INDOOR_WALKING) {
            startTrainingByConnectionStatus();
            return;
        }
        if (!this.hasLocationPermission) {
            showNeedLocationPermission();
        } else if (29 > Build.VERSION.SDK_INT || c0.checkSelfPermission(requireActivity(), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            startTrainingByConnectionStatus();
        } else {
            startActivity(RequestLocationActivity.getCallingIntent(requireActivity()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$7(View view) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(BaseParamNames.SHOW_TRAINING_TIP, false);
        ((FragmentHomeTrainingBinding) this.binding).rlTrainingGuidance.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$shareGPSTrainingToStrava$0() {
        this.trainingModel.shareGPSTrainingToStrava();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateTrainingRecords$8(HomeTrainingRecordsBean homeTrainingRecordsBean) {
        ((FragmentHomeTrainingBinding) this.binding).tvTotalDuration.setText(String.valueOf(homeTrainingRecordsBean.getTotalDuration()));
        ((FragmentHomeTrainingBinding) this.binding).tvTotalTimes.setText(String.valueOf(homeTrainingRecordsBean.getTotalTimes()));
    }

    private void requestWeatherInfo() {
        if (this.nowTemperature != 10000) {
            return;
        }
        if (this.weatherPresenter == null) {
            this.weatherPresenter = new com.crrepa.band.my.device.weather.b();
        }
        this.weatherPresenter.sendWeatherInfoForTraining(requireContext());
    }

    private void shareGPSTrainingToStrava() {
        this.disposableList.add(Schedulers.io().scheduleDirect(new Runnable() { // from class: com.crrepa.band.my.home.training.j
            @Override // java.lang.Runnable
            public final void run() {
                HomeTrainingFragment.this.lambda$shareGPSTrainingToStrava$0();
            }
        }));
    }

    private void showActivityRecognitionPermissionDialog() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_exercise).setTitle(R.string.permission_motion_data_title).setContent(R.string.permission_motion_data_content).setOnClickListener(new e()).build(requireContext()).show();
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    private void showBandConnectState(boolean z7) {
        Drawable drawable;
        int i8;
        if (z7) {
            drawable = getResources().getDrawable(R$drawable.ic_gps_watch_connected);
            i8 = R.string.ble_connected;
        } else {
            drawable = getResources().getDrawable(R$drawable.ic_gps_watch_disconnect);
            i8 = R.string.ble_disconnected;
        }
        ((FragmentHomeTrainingBinding) this.binding).tvBandConnectState.setText(i8);
        ((FragmentHomeTrainingBinding) this.binding).tvBandConnectState.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        updateIndoorTrainingUI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UseCompatLoadingForDrawables"})
    public void showImgByTrainingType() {
        GpsTrainingModel.GpsTrainingType gpsTrainingType = this.trainingType;
        GpsTrainingModel.GpsTrainingType[] gpsTrainingTypeArr = TRAINING_RUNNING_TYPE_ARRAY;
        if (gpsTrainingType == gpsTrainingTypeArr[0]) {
            ((FragmentHomeTrainingBinding) this.binding).ivTrainingType.setImageDrawable(getResources().getDrawable(R$drawable.ic_gps_exercise_02_running));
            return;
        }
        if (gpsTrainingType == gpsTrainingTypeArr[1]) {
            ((FragmentHomeTrainingBinding) this.binding).ivTrainingType.setImageDrawable(getResources().getDrawable(R$drawable.ic_gps_exercise_04_trail_running));
            return;
        }
        if (gpsTrainingType == gpsTrainingTypeArr[2]) {
            ((FragmentHomeTrainingBinding) this.binding).ivTrainingType.setImageDrawable(getResources().getDrawable(R$drawable.ic_gps_exercise_07_indoor_running));
            return;
        }
        GpsTrainingModel.GpsTrainingType[] gpsTrainingTypeArr2 = TRAINING_WALKING_TYPE_ARRAY;
        if (gpsTrainingType == gpsTrainingTypeArr2[0]) {
            ((FragmentHomeTrainingBinding) this.binding).ivTrainingType.setImageDrawable(getResources().getDrawable(R$drawable.ic_gps_exercise_01_walking));
            return;
        }
        if (gpsTrainingType == gpsTrainingTypeArr2[1]) {
            ((FragmentHomeTrainingBinding) this.binding).ivTrainingType.setImageDrawable(getResources().getDrawable(R$drawable.ic_gps_exercise_05_on_foot));
        } else if (gpsTrainingType == gpsTrainingTypeArr2[2]) {
            ((FragmentHomeTrainingBinding) this.binding).ivTrainingType.setImageDrawable(getResources().getDrawable(R$drawable.ic_gps_exercise_06_indoor_walking));
        } else {
            ((FragmentHomeTrainingBinding) this.binding).ivTrainingType.setImageDrawable(getResources().getDrawable(R$drawable.ic_gps_exercise_03_cycling));
        }
    }

    private void showNeedLocationPermission() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_location).setTitle(R.string.permission_location_title).setContent(getString(R.string.permission_location_content, getString(R.string.app_name))).setOnClickListener(new d()).build(requireContext()).show();
    }

    @SuppressLint({"SetTextI18n"})
    private void showWeather() {
        ((FragmentHomeTrainingBinding) this.binding).tvWeather.setText(l2.b.getTempStr(requireContext(), this.nowTemperature));
        ((FragmentHomeTrainingBinding) this.binding).tvWeather.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(c2.e.getWeatherCodeIcon(this.weatherCode)), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private void startMapTrainingActivity() {
        startActivity(BaseMapTrainingActivity.getCallingIntent(requireActivity(), this.trainingType, this.nowTemperature, this.weatherCode));
    }

    private void startTrainingByConnectionStatus() {
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            startMapTrainingActivity();
            return;
        }
        if (!h5.a.isSupportStepCountSensor(requireContext())) {
            r0.showShort(requireContext(), R.string.gps_training_no_steps_counter_tips);
        } else if (Build.VERSION.SDK_INT >= 29 && !c0.checkSelfPermission(requireActivity(), ACTIVITY_PERMISSIONS)) {
            showActivityRecognitionPermissionDialog();
            return;
        }
        startMapTrainingActivity();
    }

    private void updateHasLocationPermission() {
        boolean checkSelfPermission = c0.checkSelfPermission(requireActivity(), LOCATION_PERMISSIONS);
        this.hasLocationPermission = checkSelfPermission;
        ((FragmentHomeTrainingBinding) this.binding).ivNoPermissions.setVisibility(checkSelfPermission ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateIndoorTrainingUI() {
        GpsTrainingModel.GpsTrainingType gpsTrainingType = this.trainingType;
        boolean z7 = gpsTrainingType == GpsTrainingModel.GpsTrainingType.INDOOR_WALKING || gpsTrainingType == GpsTrainingModel.GpsTrainingType.INDOOR_RUNNING;
        ((FragmentHomeTrainingBinding) this.binding).ivIndoorRunning.setVisibility(z7 ? 0 : 8);
        ((FragmentHomeTrainingBinding) this.binding).tvWeather.setVisibility(!z7 ? 0 : 8);
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isDisConnected() && z7) {
            ((FragmentHomeTrainingBinding) this.binding).tvWearTips.setVisibility(0);
        } else {
            ((FragmentHomeTrainingBinding) this.binding).tvWearTips.setVisibility(8);
        }
    }

    private void updateTrainingRecords() {
        this.disposableList.add(Observable.just(this.trainingModel.queryAllTrainingHistory()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.home.training.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HomeTrainingFragment.this.lambda$updateTrainingRecords$8((HomeTrainingRecordsBean) obj);
            }
        }));
    }

    public void deniedActivityRecognition() {
        com.crrepa.band.my.home.guidance.c.systemPermission("运动数据", false);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        super.initBinding();
        VB vb = this.binding;
        this.googleMapView = ((FragmentHomeTrainingBinding) vb).googleMapView;
        this.gpsSignalView = ((FragmentHomeTrainingBinding) vb).gpsSignalView;
        initTrainingTypeView();
        showBandConnectState(com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected());
        ((FragmentHomeTrainingBinding) this.binding).rlRecord.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.training.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeTrainingFragment.this.lambda$initBinding$1(view);
            }
        });
        ((FragmentHomeTrainingBinding) this.binding).tvGoal.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.training.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeTrainingFragment.this.lambda$initBinding$2(view);
            }
        });
        ((FragmentHomeTrainingBinding) this.binding).ivLocation.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.training.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeTrainingFragment.this.lambda$initBinding$3(view);
            }
        });
        ((FragmentHomeTrainingBinding) this.binding).ivSetting.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.training.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeTrainingFragment.this.lambda$initBinding$4(view);
            }
        });
        ((FragmentHomeTrainingBinding) this.binding).tvWearTips.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.training.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeTrainingFragment.this.lambda$initBinding$5(view);
            }
        });
        ((FragmentHomeTrainingBinding) this.binding).tvStart.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.training.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeTrainingFragment.this.lambda$initBinding$6(view);
            }
        });
        ((FragmentHomeTrainingBinding) this.binding).rlTrainingGuidance.setVisibility(com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(BaseParamNames.SHOW_TRAINING_TIP, true) ? 0 : 8);
        ((FragmentHomeTrainingBinding) this.binding).ivTrainingGuidanceClose.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.training.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeTrainingFragment.this.lambda$initBinding$7(view);
            }
        });
        com.moyoung.instructions.c.hook(InstructionsType.TRAINING, ((FragmentHomeTrainingBinding) this.binding).tvTrainingGuidanceBtn);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void loadData() {
        super.loadData();
        if (this.weatherPresenter == null) {
            this.weatherPresenter = new com.crrepa.band.my.device.weather.b();
        }
        this.weatherPresenter.sendWeatherInfo(requireContext());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandConnectStateChangeEvent(m0.a aVar) {
        showBandConnectState(aVar.getState() == 2);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.disposableList.clear();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void onFirstVisible() {
        super.onFirstVisible();
        updateHasLocationPermission();
        requestWeatherInfo();
        if (q7.b.hasSelfPermissions(requireContext(), "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            return;
        }
        showNeedLocationPermission();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onHomeTrainingEvent(HomeTrainingEvent homeTrainingEvent) {
        updateTrainingRecords();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onHomeWeatherEvent(HomeWeatherEvent homeWeatherEvent) {
        this.nowTemperature = homeWeatherEvent.getNowTemperature();
        this.weatherCode = homeWeatherEvent.getWeatherCode();
        showWeather();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        removeLocation();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        k.onRequestPermissionsResult(this, i8, iArr);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        updateTrainingRecords();
        shareGPSTrainingToStrava();
        updateHasLocationPermission();
        if (this.hasLocationPermission && this.isVisibleToUser) {
            requestLocation();
        }
    }

    public abstract void removeLocation();

    public abstract void renderMapCamera();

    public abstract void requestLocation();

    void requestLocationPermission() {
        com.orhanobut.logger.f.d("requestLocationPermission");
        com.crrepa.band.my.home.guidance.c.systemPermission("定位", true);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z7) {
        super.setUserVisibleHint(z7);
        if (this.isFirstVisible || !this.hasLocationPermission) {
            return;
        }
        if (z7) {
            requestLocation();
        } else {
            removeLocation();
        }
    }

    void showDeniedForLocation() {
        com.orhanobut.logger.f.d("showDeniedForBackgroundLocation");
        com.crrepa.band.my.home.guidance.c.systemPermission("定位", false);
        r0.showLong(requireContext(), getString(R.string.permission_location_denied));
    }

    void showNeverAskForActivityRecognition() {
        c0.jumpAppDetailsSetting(requireActivity());
    }

    void showNeverAskForLocation() {
        com.orhanobut.logger.f.d("showNeverAskForBackgroundLocation");
        c0.jumpAppDetailsSetting(requireActivity());
    }

    void showRationaleForLocation(q7.a aVar) {
        com.orhanobut.logger.f.d("showRationaleForBackgroundLocation");
        aVar.proceed();
        updateHasLocationPermission();
    }

    public void startNoDeviceTraining() {
        com.crrepa.band.my.home.guidance.c.systemPermission("运动数据", true);
        startMapTrainingActivity();
    }
}
