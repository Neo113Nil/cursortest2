package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class Eo extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f834a;

    public Eo() {
        super(false, "[WakelocksToggle]");
        this.f834a = new WeakHashMap();
    }

    public final synchronized void a(Object obj) {
        this.f834a.put(obj, null);
        if (this.f834a.size() == 1) {
            updateState(true);
        }
    }

    public final synchronized void b(Object obj) {
        this.f834a.remove(obj);
        if (this.f834a.isEmpty()) {
            updateState(false);
        }
    }
}
