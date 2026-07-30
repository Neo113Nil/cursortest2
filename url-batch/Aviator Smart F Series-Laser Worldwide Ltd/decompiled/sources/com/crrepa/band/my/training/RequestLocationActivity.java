package com.crrepa.band.my.training;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityRequestLocationBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.c0;
import com.moyoung.dafit.module.common.utils.r0;

/* loaded from: classes3.dex */
public class RequestLocationActivity extends BaseVBActivity<ActivityRequestLocationBinding> {
    private boolean jumpAppDetailsSetting = false;

    class a implements MaterialDialog.l {
        a() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            RequestLocationActivity.this.onBackPressedSupport();
        }
    }

    class b implements MaterialDialog.l {
        b() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            materialDialog.dismiss();
            RequestLocationActivity.this.jumpAppDetailsSetting = true;
            c0.jumpAppDetailsSetting(RequestLocationActivity.this);
        }
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) RequestLocationActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        onBackPressedSupport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        p.requestBackgroundLocationWithPermissionCheck(this);
    }

    private void showNeverAskDialog(@StringRes int i8) {
        new MaterialDialog.e(this).content(i8).positiveText(R.string.allow).negativeText(R.string.deny).onPositive(new b()).onNegative(new a()).cancelable(false).show();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityRequestLocationBinding) this.binding).tvNoThanks.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RequestLocationActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityRequestLocationBinding) this.binding).btnTurnOn.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RequestLocationActivity.this.lambda$initOnClickListener$1(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        com.orhanobut.logger.f.d("onRequestPermissionsResult");
        p.onRequestPermissionsResult(this, i8, iArr);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.jumpAppDetailsSetting) {
            this.jumpAppDetailsSetting = false;
            if (q7.b.hasSelfPermissions(this, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                requestBackgroundLocation();
            }
        }
    }

    void requestBackgroundLocation() {
        com.orhanobut.logger.f.d("requestBackgroundLocation");
        finish();
    }

    void showDeniedForBackgroundLocation() {
        com.orhanobut.logger.f.d("showDeniedForBackgroundLocation");
        r0.showLong(this, getString(R.string.permission_location_denied));
        onBackPressedSupport();
    }

    void showNeverAskForBackgroundLocation() {
        com.orhanobut.logger.f.d("showNeverAskForBackgroundLocation");
        showNeverAskDialog(R.string.permission_location_denied);
    }

    void showRationaleForBackgroundLocation(q7.a aVar) {
        com.orhanobut.logger.f.d("showRationaleForBackgroundLocation");
        aVar.proceed();
    }
}
