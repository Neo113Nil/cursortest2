package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet$WalletOptions;
import com.google.android.gms.wallet.zzk;
import papa.internal.InputTracker$listener$1$1$2$trigger$1;

/* loaded from: classes8.dex */
public final class DefaultPaymentsClientFactory {
    public final Context context;

    public DefaultPaymentsClientFactory(Context context) {
        context.getClass();
        this.context = context;
    }

    public final PaymentsClient create(GooglePayEnvironment googlePayEnvironment) {
        googlePayEnvironment.getClass();
        InputTracker$listener$1$1$2$trigger$1 inputTracker$listener$1$1$2$trigger$1 = new InputTracker$listener$1$1$2$trigger$1();
        inputTracker$listener$1$1$2$trigger$1.setEnvironment(googlePayEnvironment.value);
        Wallet$WalletOptions wallet$WalletOptions = new Wallet$WalletOptions(inputTracker$listener$1$1$2$trigger$1);
        return new PaymentsClient(this.context, null, zzk.API, wallet$WalletOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
