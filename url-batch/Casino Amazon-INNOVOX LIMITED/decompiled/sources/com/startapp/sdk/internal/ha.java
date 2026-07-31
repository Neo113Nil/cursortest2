package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ha {

    /* renamed from: a, reason: collision with root package name */
    public final gf f262a;
    public final gf b;

    public ha(gf gfVar, gf gfVar2) {
        this.f262a = gfVar;
        this.b = gfVar2;
    }

    public final void a(pd... pdVarArr) {
        for (pd pdVar : pdVarArr) {
            if (pdVar.d) {
                this.b.a(pdVar, pdVar.e.longValue());
            } else {
                this.f262a.a(pdVar, pdVar.e.longValue());
            }
        }
    }
}
