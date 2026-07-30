package com.crrepa.band.my.training;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityGpsTrainingBinding;
import com.crrepa.band.my.model.GpsTrainingModel;
import com.crrepa.band.my.training.adapter.GpsTrainingAdapter;
import com.crrepa.band.my.training.map.BaseMapTrainingActivity;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.c0;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class GpsTrainingActivity extends BaseVBActivity<ActivityGpsTrainingBinding> {
    GpsTrainingAdapter gpsTrainingAdapter = new GpsTrainingAdapter();

    class a implements MaterialDialog.l {
        a() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            GpsTrainingActivity.this.onBackPressedSupport();
        }
    }

    class b implements MaterialDialog.l {
        b() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            materialDialog.dismiss();
            c0.jumpAppDetailsSetting(GpsTrainingActivity.this);
        }
    }

    private List<GpsTrainingModel> getAllTraining() {
        ArrayList arrayList = new ArrayList();
        GpsTrainingModel.GpsTrainingType gpsTrainingType = GpsTrainingModel.GpsTrainingType.RUNNING;
        arrayList.add(new GpsTrainingModel(gpsTrainingType, R$drawable.ic_gps_running, getName(gpsTrainingType.getValue())));
        GpsTrainingModel.GpsTrainingType gpsTrainingType2 = GpsTrainingModel.GpsTrainingType.WALKING;
        arrayList.add(new GpsTrainingModel(gpsTrainingType2, R$drawable.ic_gps_walking, getName(gpsTrainingType2.getValue())));
        GpsTrainingModel.GpsTrainingType gpsTrainingType3 = GpsTrainingModel.GpsTrainingType.CYCLING;
        arrayList.add(new GpsTrainingModel(gpsTrainingType3, R$drawable.ic_gps_cycling, getName(gpsTrainingType3.getValue())));
        GpsTrainingModel.GpsTrainingType gpsTrainingType4 = GpsTrainingModel.GpsTrainingType.TRAIL_RUNNING;
        arrayList.add(new GpsTrainingModel(gpsTrainingType4, R$drawable.ic_gps_trail_running, getName(gpsTrainingType4.getValue())));
        GpsTrainingModel.GpsTrainingType gpsTrainingType5 = GpsTrainingModel.GpsTrainingType.ON_FOOT;
        arrayList.add(new GpsTrainingModel(gpsTrainingType5, R$drawable.ic_gps_on_foot, getName(gpsTrainingType5.getValue())));
        return arrayList;
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) GpsTrainingActivity.class);
    }

    private String getName(int i8) {
        return com.crrepa.band.my.training.utils.q.getTrainingName(this, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        Log.d("dddd", "onItemClick");
        startActivity(BaseMapTrainingActivity.getCallingIntent(this, ((GpsTrainingModel) baseQuickAdapter.getItem(i8)).getType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(this);
        k0.setColor(this, ContextCompat.getColor(this, R.color.color_gps_training), 0);
        ((ActivityGpsTrainingBinding) this.binding).rcvGpsTraining.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityGpsTrainingBinding) this.binding).rcvGpsTraining.setAdapter(this.gpsTrainingAdapter);
        this.gpsTrainingAdapter.setNewData(getAllTraining());
        this.gpsTrainingAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.training.l
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                GpsTrainingActivity.this.lambda$initBinding$0(baseQuickAdapter, view, i8);
            }
        });
        m.requestLocationWithPermissionCheck(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityGpsTrainingBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GpsTrainingActivity.this.lambda$initOnClickListener$1(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        m.onRequestPermissionsResult(this, i8, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        s0.logPage(getClass(), "GPS锻炼");
    }

    void requestLocation() {
        com.orhanobut.logger.f.d("requestLocation");
        if (29 > Build.VERSION.SDK_INT || c0.checkSelfPermission(this, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            return;
        }
        startActivity(RequestLocationActivity.getCallingIntent(this));
    }

    void showDeniedForLocation() {
        com.orhanobut.logger.f.d("showDeniedForBackgroundLocation");
        r0.showLong(this, getString(R.string.permission_location_denied));
        onBackPressedSupport();
    }

    void showNeverAskForLocation() {
        com.orhanobut.logger.f.d("showNeverAskForBackgroundLocation");
        new MaterialDialog.e(this).content(R.string.permission_location_denied).positiveText(R.string.allow).negativeText(R.string.deny).onPositive(new b()).onNegative(new a()).cancelable(false).show();
    }

    void showRationaleForLocation(q7.a aVar) {
        com.orhanobut.logger.f.d("showRationaleForBackgroundLocation");
        aVar.proceed();
    }
}
