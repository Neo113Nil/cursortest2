package com.stripe.android.stripe3ds2.views;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default;
import com.stripe.android.stripe3ds2.transaction.DefaultTransactionTimer;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.UiType;

/* loaded from: classes8.dex */
public final class ChallengeFragmentFactory extends FragmentFactory {
    public final ChallengeActionHandler$Default challengeActionHandler;
    public final DefaultErrorReporter errorReporter;
    public final StripeErrorRequestExecutor errorRequestExecutor;
    public final UiType initialUiType;
    public final IntentData intentData;
    public final DefaultTransactionTimer transactionTimer;
    public final StripeUiCustomization uiCustomization;

    public ChallengeFragmentFactory(StripeUiCustomization stripeUiCustomization, DefaultTransactionTimer defaultTransactionTimer, StripeErrorRequestExecutor stripeErrorRequestExecutor, DefaultErrorReporter defaultErrorReporter, ChallengeActionHandler$Default challengeActionHandler$Default, UiType uiType, IntentData intentData) {
        stripeUiCustomization.getClass();
        defaultTransactionTimer.getClass();
        stripeErrorRequestExecutor.getClass();
        defaultErrorReporter.getClass();
        challengeActionHandler$Default.getClass();
        intentData.getClass();
        this.uiCustomization = stripeUiCustomization;
        this.transactionTimer = defaultTransactionTimer;
        this.errorRequestExecutor = stripeErrorRequestExecutor;
        this.errorReporter = defaultErrorReporter;
        this.challengeActionHandler = challengeActionHandler$Default;
        this.initialUiType = uiType;
        this.intentData = intentData;
    }

    @Override // androidx.fragment.app.FragmentFactory
    public final Fragment instantiate(ClassLoader classLoader, String str) {
        classLoader.getClass();
        str.getClass();
        if (str.equals(ChallengeFragment.class.getName())) {
            return new ChallengeFragment(this.uiCustomization, this.transactionTimer, this.errorRequestExecutor, this.errorReporter, this.challengeActionHandler, this.initialUiType, this.intentData);
        }
        Fragment instantiate = super.instantiate(classLoader, str);
        instantiate.getClass();
        return instantiate;
    }
}
