package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class s30 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference<q30> f11641a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference<r30> f11642b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    static final AtomicBoolean f11643c = new AtomicBoolean();

    static q30 a() {
        return f11641a.get();
    }

    static r30 b() {
        return f11642b.get();
    }

    public static void c(q30 q30Var) {
        f11641a.set(q30Var);
    }
}
