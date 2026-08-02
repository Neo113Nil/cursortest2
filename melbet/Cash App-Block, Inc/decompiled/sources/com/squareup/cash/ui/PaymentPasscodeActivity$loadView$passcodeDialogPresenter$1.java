package com.squareup.cash.ui;

import android.content.Intent;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.screens.Finish;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaymentPasscodeActivity$loadView$passcodeDialogPresenter$1 implements Navigator, FunctionAdapter {
    public final /* synthetic */ PaymentPasscodeActivity $tmp0;

    public PaymentPasscodeActivity$loadView$passcodeDialogPresenter$1(PaymentPasscodeActivity paymentPasscodeActivity) {
        this.$tmp0 = paymentPasscodeActivity;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Navigator) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(1, 0, PaymentPasscodeActivity.class, this.$tmp0, "goTo", "goTo(Lapp/cash/broadway/screen/Screen;)V");
    }

    @Override // app.cash.broadway.navigation.Navigator
    public final void goTo(Screen screen) {
        Intent intent;
        screen.getClass();
        if (!(screen instanceof Finish)) {
            OptionalProvider$$ExternalSyntheticLambda0.m();
            return;
        }
        Object obj = ((Finish) screen).result;
        obj.getClass();
        HistoryScreens.PaymentPasscodeDialog.Result result = (HistoryScreens.PaymentPasscodeDialog.Result) obj;
        int ordinal = result.status.ordinal();
        PaymentPasscodeActivity paymentPasscodeActivity = this.$tmp0;
        if (ordinal != 0 && ordinal != 4) {
            ScenarioPlan scenarioPlan = result.scenarioPlan;
            if ((scenarioPlan != null ? scenarioPlan.blocker_descriptors : null) != null && (intent = (Intent) paymentPasscodeActivity.getIntent().getParcelableExtra("details-intent")) != null) {
                paymentPasscodeActivity.startActivity(intent);
            }
        }
        paymentPasscodeActivity.finish();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
