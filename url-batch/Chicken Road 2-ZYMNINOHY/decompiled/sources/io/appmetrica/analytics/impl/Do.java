package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Do extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f10227a;

    public Do() {
        super(false, "[WakelocksToggle]");
        this.f10227a = new WeakHashMap();
    }

    public final synchronized void a(Object obj) {
        this.f10227a.put(obj, null);
        if (this.f10227a.size() == 1) {
            updateState(true);
        }
    }

    public final synchronized void b(Object obj) {
        this.f10227a.remove(obj);
        if (this.f10227a.isEmpty()) {
            updateState(false);
        }
    }
}
