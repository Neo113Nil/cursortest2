package dev.zacsweers.metro.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;

/* loaded from: classes.dex */
public final class DelegateFactory implements Factory {
    public Provider delegate;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Provider provider = this.delegate;
        if (provider != null) {
            return provider.invoke();
        }
        a$$ExternalSyntheticBUOutline0.m$1("Backing delegate was never set!");
        return null;
    }
}
