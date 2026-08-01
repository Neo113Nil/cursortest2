package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ig extends zg {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2410d = 0;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f2411c = new AtomicLong(-1);

    static {
        new fg(1);
    }

    @Override // com.google.android.gms.internal.measurement.zg
    public final void a() {
        AtomicLong atomicLong = this.f2411c;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
