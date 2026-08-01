package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class xg extends zg {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zg f2994c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zg f2995d;

    public xg(zg zgVar, zg zgVar2) {
        this.f2994c = zgVar;
        this.f2995d = zgVar2;
    }

    @Override // com.google.android.gms.internal.measurement.zg
    public final void a() {
        zg zgVar = this.f2995d;
        try {
            this.f2994c.a();
        } finally {
            zgVar.a();
        }
    }
}
