package com.squareup.cash.work.session;

import android.content.SharedPreferences;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealSelectedMerchantSetter {
    public final SquareAccountStore squareAccountStore;

    public RealSelectedMerchantSetter(SquareAccountStore squareAccountStore) {
        this.squareAccountStore = squareAccountStore;
    }

    public final void selectMerchant(MerchantIdentifier merchantIdentifier) {
        SquareAccountStore squareAccountStore = this.squareAccountStore;
        synchronized (squareAccountStore) {
            try {
                Timber.Forest.d("Setting selected merchant: " + (merchantIdentifier != null ? merchantIdentifier.token : null), new Object[0]);
                SharedPreferences.Editor edit = squareAccountStore.preferences.edit();
                if (merchantIdentifier == null) {
                    edit.remove("selected_merchant_token");
                } else {
                    edit.putString("selected_merchant_token", merchantIdentifier.token);
                }
                edit.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
