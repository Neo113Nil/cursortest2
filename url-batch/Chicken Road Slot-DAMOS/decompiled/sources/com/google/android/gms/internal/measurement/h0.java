package com.google.android.gms.internal.measurement;

import java.io.Closeable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final g0 f2353e = new g0(0);

    /* renamed from: d, reason: collision with root package name */
    public int f2354d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i3 = this.f2354d;
        if (i3 <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.f2354d = i3 - 1;
    }
}
