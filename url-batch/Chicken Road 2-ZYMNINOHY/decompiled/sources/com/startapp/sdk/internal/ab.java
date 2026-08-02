package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public final yf f6661a;

    /* renamed from: b, reason: collision with root package name */
    public final yf f6662b;

    public ab(yf yfVar, yf yfVar2) {
        this.f6661a = yfVar;
        this.f6662b = yfVar2;
    }

    public final void a(de... deVarArr) {
        for (de deVar : deVarArr) {
            if (deVar.f6812d) {
                this.f6662b.a(deVar, deVar.f6813e.longValue());
            } else {
                this.f6661a.a(deVar, deVar.f6813e.longValue());
            }
        }
    }
}
