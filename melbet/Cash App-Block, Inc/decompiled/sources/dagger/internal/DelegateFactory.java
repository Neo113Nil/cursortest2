package dagger.internal;

import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes8.dex */
public final class DelegateFactory implements Factory {
    public Provider delegate;

    public static void setDelegate(Provider provider, Provider provider2) {
        DelegateFactory delegateFactory = (DelegateFactory) provider;
        if (delegateFactory.delegate == null) {
            delegateFactory.delegate = provider2;
        } else {
            Path$$ExternalSyntheticBUOutline0.m();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Provider provider = this.delegate;
        if (provider != null) {
            return provider.get();
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
