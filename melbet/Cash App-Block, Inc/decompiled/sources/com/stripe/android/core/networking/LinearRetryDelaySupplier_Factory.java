package com.stripe.android.core.networking;

import dagger.internal.Factory;

/* loaded from: classes8.dex */
public final class LinearRetryDelaySupplier_Factory implements Factory {
    @Override // javax.inject.Provider
    public final Object get() {
        return new LinearRetryDelaySupplier(0);
    }
}
