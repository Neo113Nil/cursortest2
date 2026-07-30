package com.crrepa.band.my.profile.googlefit;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityGoogleFitBinding;
import com.crrepa.band.my.model.user.provider.GoogleFitProvider;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.fitness.FitnessOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.r0;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

/* loaded from: classes2.dex */
public class GoogleFitActivity extends BaseVBActivity<ActivityGoogleFitBinding> {
    private static final int GOOGLE_FIT_PERMISSIONS_REQUEST_CODE = 10;
    private FitnessOptions fitnessOptions = FitnessOptions.builder().accessActivitySessions(1).build();

    class a implements OnFailureListener {
        a() {
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(@NonNull Exception exc) {
            f.d("onFailure");
            exc.printStackTrace();
        }
    }

    class b implements OnSuccessListener {
        b() {
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(Void r12) {
            f.d("onSuccess");
        }
    }

    class c implements Consumer {
        c() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Boolean bool) {
            int i8;
            int i9;
            int i10;
            if (bool.booleanValue()) {
                i8 = 0;
                i9 = R.drawable.shape_google_fit_disconnect;
                i10 = R.string.disconnect_google_fit;
            } else {
                i8 = 4;
                i9 = R.drawable.shape_google_fit_connect;
                i10 = R.string.connect;
            }
            ((ActivityGoogleFitBinding) ((BaseVBActivity) GoogleFitActivity.this).binding).tvGoogleFitConnected.setVisibility(i8);
            ((ActivityGoogleFitBinding) ((BaseVBActivity) GoogleFitActivity.this).binding).btnConnect.setBackgroundResource(i9);
            ((ActivityGoogleFitBinding) ((BaseVBActivity) GoogleFitActivity.this).binding).btnConnect.setText(i10);
        }
    }

    private void disableGoogleFit() {
        Fitness.getConfigClient((Activity) this, GoogleSignIn.getAccountForExtension(this, this.fitnessOptions)).disableFit().addOnSuccessListener(new b()).addOnFailureListener(new a());
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) GoogleFitActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        onConnectClicked();
    }

    private void loginGoogle() {
        GoogleSignInAccount accountForExtension = GoogleSignIn.getAccountForExtension(this, this.fitnessOptions);
        f.d("account: " + accountForExtension.zad());
        if (GoogleSignIn.hasPermissions(accountForExtension, this.fitnessOptions)) {
            saveGoogleFitConnectState(true);
        } else {
            f.d("requestPermissions");
            GoogleSignIn.requestPermissions(this, 10, accountForExtension, this.fitnessOptions);
        }
    }

    private void saveGoogleFitConnectState(boolean z7) {
        f.d("saveGoogleFitConnectState: " + z7);
        GoogleFitProvider.saveConnected(z7);
        setGoogleFitConnectState(z7);
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityGoogleFitBinding) this.binding).includeTitle.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityGoogleFitBinding) vb).includeTitle.tvTitle, ((ActivityGoogleFitBinding) vb).includeTitle.tvExpandedTitle);
        setSupportActionBar(((ActivityGoogleFitBinding) this.binding).includeTitle.toolbar);
    }

    @SuppressLint({"CheckResult"})
    private void setGoogleFitConnectState(boolean z7) {
        Observable.just(Boolean.valueOf(z7)).observeOn(AndroidSchedulers.mainThread()).subscribe(new c());
    }

    private void setTitle() {
        ((ActivityGoogleFitBinding) this.binding).includeTitle.tvTitle.setText(R.string.connect_google_fit);
        ((ActivityGoogleFitBinding) this.binding).includeTitle.tvExpandedTitle.setText(R.string.connect_google_fit);
        ((ActivityGoogleFitBinding) this.binding).includeTitle.ivTitleBack.setImageResource(R.drawable.selector_title_back);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        setActionBar();
        setTitle();
        boolean connected = GoogleFitProvider.getConnected();
        setGoogleFitConnectState(connected);
        if (connected) {
            loginGoogle();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityGoogleFitBinding) this.binding).includeTitle.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.googlefit.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoogleFitActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityGoogleFitBinding) this.binding).btnConnect.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.googlefit.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoogleFitActivity.this.lambda$initOnClickListener$1(view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, @Nullable Intent intent) {
        super.onActivityResult(i8, i9, intent);
        f.d("onActivityResult requestCode: " + i8);
        f.d("onActivityResult resultCode: " + i9);
        if (i8 == 10) {
            boolean z7 = i9 == -1;
            saveGoogleFitConnectState(z7);
            if (z7) {
                return;
            }
            r0.showLong(this, getString(R.string.net_disonnected));
        }
    }

    public void onBackClick() {
        finish();
    }

    public void onConnectClicked() {
        if (GoogleFitProvider.getConnected()) {
            saveGoogleFitConnectState(false);
        } else {
            loginGoogle();
        }
    }
}
