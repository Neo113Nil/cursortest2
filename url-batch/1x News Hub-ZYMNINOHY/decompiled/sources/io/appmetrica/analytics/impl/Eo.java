package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Eo extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f5970a;

    public Eo() {
        super(false, "[WakelocksToggle]");
        this.f5970a = new WeakHashMap();
    }

    public final synchronized void a(Object obj) {
        this.f5970a.put(obj, null);
        if (this.f5970a.size() == 1) {
            updateState(true);
        }
    }

    public final synchronized void b(Object obj) {
        this.f5970a.remove(obj);
        if (this.f5970a.isEmpty()) {
            updateState(false);
        }
    }
}
