package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.zo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3154zo extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f40410a;

    public C3154zo() {
        super(false, "[WakelocksToggle]");
        this.f40410a = new WeakHashMap();
    }

    public final synchronized void a(@NotNull Object obj) {
        this.f40410a.put(obj, null);
        if (this.f40410a.size() == 1) {
            updateState(true);
        }
    }

    public final synchronized void b(@NotNull Object obj) {
        this.f40410a.remove(obj);
        if (this.f40410a.isEmpty()) {
            updateState(false);
        }
    }
}
