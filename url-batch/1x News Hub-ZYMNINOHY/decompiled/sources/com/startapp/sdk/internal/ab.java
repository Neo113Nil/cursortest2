package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public final yf f3559a;

    /* renamed from: b, reason: collision with root package name */
    public final yf f3560b;

    public ab(yf yfVar, yf yfVar2) {
        this.f3559a = yfVar;
        this.f3560b = yfVar2;
    }

    public final void a(de... deVarArr) {
        for (de deVar : deVarArr) {
            if (deVar.f3698d) {
                this.f3560b.a(deVar, deVar.f3699e.longValue());
            } else {
                this.f3559a.a(deVar, deVar.f3699e.longValue());
            }
        }
    }
}
