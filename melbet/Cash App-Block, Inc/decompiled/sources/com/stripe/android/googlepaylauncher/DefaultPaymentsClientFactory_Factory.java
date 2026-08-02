package com.stripe.android.googlepaylauncher;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda0;
import com.squareup.kotterknife.Lazy;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.domain.RealIsLinkWithStripe;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.uicore.image.DefaultStripeImageLoader;
import com.stripe.attestation.IntegrityStandardRequestManager;
import com.stripe.attestation.RealStandardIntegrityManagerFactory;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes8.dex */
public final class DefaultPaymentsClientFactory_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final InstanceFactory contextProvider;

    public /* synthetic */ DefaultPaymentsClientFactory_Factory(InstanceFactory instanceFactory, int i) {
        this.$r8$classId = i;
        this.contextProvider = instanceFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        InstanceFactory instanceFactory = this.contextProvider;
        switch (i) {
            case 0:
                return new DefaultPaymentsClientFactory((Context) instanceFactory.instance);
            case 1:
                FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration = (FinancialConnectionsSheetConfiguration) instanceFactory.instance;
                financialConnectionsSheetConfiguration.getClass();
                String str = financialConnectionsSheetConfiguration.publishableKey;
                Preconditions.checkNotNullFromProvides(str);
                return str;
            case 2:
                Application application = (Application) instanceFactory.instance;
                application.getClass();
                return new DefaultStripeImageLoader(application, 14);
            case 3:
                Application application2 = (Application) instanceFactory.instance;
                application2.getClass();
                return new IntegrityStandardRequestManager(new KotterKnifeKt$$ExternalSyntheticLambda0(21), new RealStandardIntegrityManagerFactory(application2, 0));
            case 4:
                return new RealIsLinkWithStripe((FinancialConnectionsSheetNativeState) instanceFactory.instance);
            case 5:
                return new Lazy((CoroutineContext) instanceFactory.instance);
            case 6:
                Context context = (Context) instanceFactory.instance;
                context.getClass();
                String packageName = context.getPackageName();
                packageName.getClass();
                return new DefaultReturnUrl(packageName);
            default:
                Context context2 = (Context) instanceFactory.instance;
                context2.getClass();
                PaymentConfiguration paymentConfiguration = PaymentConfiguration.instance;
                if (paymentConfiguration != null) {
                    return paymentConfiguration;
                }
                SharedPreferences sharedPreferences = new PaymentConfiguration.Store(context2).prefs;
                String string2 = sharedPreferences.getString("key_publishable_key", null);
                PaymentConfiguration paymentConfiguration2 = string2 != null ? new PaymentConfiguration(string2, sharedPreferences.getString("key_account_id", null)) : null;
                if (paymentConfiguration2 != null) {
                    PaymentConfiguration.instance = paymentConfiguration2;
                    return paymentConfiguration2;
                }
                a$$ExternalSyntheticBUOutline0.m$1("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                return null;
        }
    }

    public /* synthetic */ DefaultPaymentsClientFactory_Factory(Object obj, InstanceFactory instanceFactory, int i) {
        this.$r8$classId = i;
        this.contextProvider = instanceFactory;
    }
}
