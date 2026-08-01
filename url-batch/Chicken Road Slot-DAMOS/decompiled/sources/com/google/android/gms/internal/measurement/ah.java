package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ah extends zg {

    /* renamed from: d, reason: collision with root package name */
    public static final fg f2150d = new fg(3);

    /* renamed from: e, reason: collision with root package name */
    public static final g0 f2151e = new g0(2);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f2152c = new AtomicInteger();

    @Override // com.google.android.gms.internal.measurement.zg
    public final void a() {
        this.f2152c.decrementAndGet();
    }
}
