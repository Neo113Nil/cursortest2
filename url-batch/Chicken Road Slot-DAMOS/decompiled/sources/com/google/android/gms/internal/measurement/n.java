package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends r {

    /* renamed from: b, reason: collision with root package name */
    public static final n f2553b = new n(s.f2767a);

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f2554a;

    public n(r rVar) {
        this.f2554a = new AtomicReference(rVar);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final void a(String str, Level level, boolean z10) {
        ((r) this.f2554a.get()).a(str, level, z10);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final x b() {
        return ((r) this.f2554a.get()).b();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final oa c() {
        return ((r) this.f2554a.get()).c();
    }
}
