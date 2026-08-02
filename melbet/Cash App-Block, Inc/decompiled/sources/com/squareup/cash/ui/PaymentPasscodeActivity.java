package com.squareup.cash.ui;

import android.R;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1;
import app.cash.history.screens.HistoryScreens;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.dialog.MooncakeDialog;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$Factory$Impl;
import com.squareup.cash.history.views.PaymentPasscodeDialogView;
import com.squareup.cash.history.views.PaymentPasscodeDialogView$Factory$Impl;
import com.squareup.cash.mooncake.themes.HasThemeInfo;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.thing.Thing;
import com.squareup.util.cash.Countries;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class PaymentPasscodeActivity extends AppCompatActivity implements UiContainer, HasThemeInfo {
    public static final /* synthetic */ int $r8$clinit = 0;
    public ContextScope activityScope;
    public AndroidNotificationManager notificationManager;
    public PaymentPasscodeDialogView$Factory$Impl paymentPasscodeDialogViewFactory;
    public PasscodeDialogPresenter$Factory$Impl presenterFactory;
    public final Lazy themeInfo$delegate = LazyKt.lazy(new PaymentPasscodeActivity$$ExternalSyntheticLambda1(this, 0));

    @Override // com.squareup.cash.mooncake.themes.HasThemeInfo
    public final ThemeInfo getThemeInfo() {
        return (ThemeInfo) this.themeInfo$delegate.getValue();
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(PKIFailureInfo.certRevoked);
        ContextScope MainScope = JobKt.MainScope();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        this.activityScope = JobKt.plus(new CoroutineName("PaymentPasscodeActivity"), JobKt.plus(MainDispatcherLoader.dispatcher.immediate, MainScope));
        Application application = getApplication();
        application.getClass();
        ContextScope contextScope = this.activityScope;
        Continuation continuation = null;
        if (contextScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityScope");
            throw null;
        }
        Countries.onCurrentSandboxComponentExt(application, contextScope, new PaymentPasscodeActivity$onCreate$$inlined$onCurrentSandbox$1(new PaymentPasscodeActivity$$ExternalSyntheticLambda0(this), contextScope, 0));
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("payment-token");
        String stringExtra2 = intent.getStringExtra("instrument-token");
        String stringExtra3 = intent.getStringExtra("verification-instrument-token");
        int intExtra = intent.getIntExtra("verification-instrument-type", -1);
        InstrumentType fromValue = intExtra == -1 ? null : InstrumentType.INSTANCE.fromValue(intExtra);
        String stringExtra4 = intent.getStringExtra("verification-instrument-suffix");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            Timber.Forest.e("%s is empty", "paymentToken");
        } else {
            if (stringExtra2 != null && !TextUtils.isEmpty(stringExtra2)) {
                BlockersData.Flow.INSTANCE.getClass();
                HistoryScreens.PaymentPasscodeDialog paymentPasscodeDialog = new HistoryScreens.PaymentPasscodeDialog(BlockersData.Flow.Companion.generateToken(), stringExtra, stringExtra2, stringExtra3, fromValue, stringExtra4);
                AndroidNotificationManager androidNotificationManager = this.notificationManager;
                if (androidNotificationManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
                    throw null;
                }
                androidNotificationManager.notificationManager.cancel(stringExtra, 1);
                Thing thing = new Thing(this, null);
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
                View decorView = getWindow().getDecorView();
                decorView.getClass();
                decorView.setTag(com.squareup.cash.R.id.view_tree_lifecycle_owner, this);
                decorView.setTag(com.squareup.cash.R.id.view_tree_view_model_store_owner, this);
                decorView.setTag(com.squareup.cash.R.id.view_tree_saved_state_registry_owner, this);
                MooncakeDialog mooncakeDialog = new MooncakeDialog(new ContextThemeWrapper(this, com.squareup.cash.R.style.Theme_Cash_Dialog));
                mooncakeDialog.setBackgroundColor(0);
                viewGroup.addView(mooncakeDialog);
                PaymentPasscodeDialogView$Factory$Impl paymentPasscodeDialogView$Factory$Impl = this.paymentPasscodeDialogViewFactory;
                if (paymentPasscodeDialogView$Factory$Impl == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("paymentPasscodeDialogViewFactory");
                    throw null;
                }
                Thing.ThingContextThemeWrapper thingContextThemeWrapper = new Thing.ThingContextThemeWrapper(this, com.squareup.cash.R.style.Theme_Cash_Dialog, thing);
                RealCashVibrator realCashVibrator = (RealCashVibrator) paymentPasscodeDialogView$Factory$Impl.delegateFactory.sandboxer.invoke();
                realCashVibrator.getClass();
                PaymentPasscodeDialogView paymentPasscodeDialogView = new PaymentPasscodeDialogView(realCashVibrator, thingContextThemeWrapper);
                mooncakeDialog.content.addView(paymentPasscodeDialogView, new ViewGroup.LayoutParams(getResources().getDimensionPixelSize(com.squareup.cash.R.dimen.dialog_max_width), -1));
                PasscodeDialogPresenter$Factory$Impl passcodeDialogPresenter$Factory$Impl = this.presenterFactory;
                if (passcodeDialogPresenter$Factory$Impl == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
                    throw null;
                }
                MoleculePresenterKt$asPresenter$1 asPresenter$default = MoleculePresenterKt.asPresenter$default(passcodeDialogPresenter$Factory$Impl.create(paymentPasscodeDialog, new PaymentPasscodeActivity$loadView$passcodeDialogPresenter$1(this)));
                ContextScope contextScope2 = this.activityScope;
                if (contextScope2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activityScope");
                    throw null;
                }
                Presenter.Binding start$default = Presenter.start$default(asPresenter$default, contextScope2, this);
                paymentPasscodeDialogView.setEventReceiver(new PaymentPasscodeActivity$loadView$2(start$default, 0));
                ContextScope contextScope3 = this.activityScope;
                if (contextScope3 != null) {
                    JobKt.launch$default(contextScope3, null, null, new TaxWebAppBridge.AnonymousClass3(paymentPasscodeDialogView, start$default, continuation, 24), 3);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("activityScope");
                    throw null;
                }
            }
            Timber.Forest.e("%s is empty", "instrument");
        }
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ContextScope contextScope = this.activityScope;
        if (contextScope != null) {
            JobKt.cancel(contextScope, (CancellationException) null);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("activityScope");
            throw null;
        }
    }
}
