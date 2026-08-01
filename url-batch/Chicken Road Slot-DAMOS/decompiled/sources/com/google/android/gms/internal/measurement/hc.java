package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class hc extends kc {

    /* renamed from: s, reason: collision with root package name */
    public volatile double f2376s;

    @Override // com.google.android.gms.internal.measurement.kc
    public final /* synthetic */ Object a() {
        return Double.valueOf(-3.0d);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final /* synthetic */ Object b(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final /* synthetic */ Object c(Object obj) {
        return (Double) obj;
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final /* synthetic */ Object d() {
        return Double.valueOf(this.f2376s);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final /* synthetic */ void e(Object obj) {
        this.f2376s = ((Double) obj).doubleValue();
    }
}
