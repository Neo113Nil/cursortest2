package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ic extends kc {

    /* renamed from: s, reason: collision with root package name */
    public volatile long f2405s;

    /* renamed from: t, reason: collision with root package name */
    public final long f2406t;

    public ic(String str, z6.j jVar, long j) {
        super(str, jVar);
        this.f2406t = j;
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final /* synthetic */ Object a() {
        return Long.valueOf(this.f2406t);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final /* synthetic */ Object b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final /* synthetic */ Object c(Object obj) {
        return (Long) obj;
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final /* synthetic */ Object d() {
        return Long.valueOf(this.f2405s);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final /* synthetic */ void e(Object obj) {
        this.f2405s = ((Long) obj).longValue();
    }
}
