package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class gc extends kc {

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f2333s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2334t;

    public gc(String str, z6.j jVar, boolean z10) {
        super(str, jVar);
        this.f2334t = z10;
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final /* synthetic */ Object a() {
        return Boolean.valueOf(this.f2334t);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final /* synthetic */ Object b(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final /* synthetic */ Object c(Object obj) {
        return (Boolean) obj;
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final /* synthetic */ Object d() {
        return Boolean.valueOf(this.f2333s);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final /* synthetic */ void e(Object obj) {
        this.f2333s = ((Boolean) obj).booleanValue();
    }
}
