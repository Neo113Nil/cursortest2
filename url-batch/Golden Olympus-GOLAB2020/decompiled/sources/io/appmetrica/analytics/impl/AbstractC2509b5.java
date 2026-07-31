package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.b5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2509b5 extends J5 {
    public AbstractC2509b5(@NonNull BaseRequestConfig.ComponentLoader<Object, Object, C2670h6> componentLoader, @NonNull C2633fm c2633fm, @NonNull BaseRequestConfig.BaseRequestArguments<J4, Object> baseRequestArguments) {
        super(componentLoader, c2633fm, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.J5
    public final void a(@NonNull Object obj) {
        J4 j4 = (J4) obj;
        synchronized (this) {
            super.a((Object) j4);
        }
    }

    public final synchronized void a(@NonNull J4 j4) {
        super.a((Object) j4);
    }
}
