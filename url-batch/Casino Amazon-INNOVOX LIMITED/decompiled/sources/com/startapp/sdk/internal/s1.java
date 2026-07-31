package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class s1 implements id {

    /* renamed from: a, reason: collision with root package name */
    public boolean f412a;
    public final /* synthetic */ id b;
    public final /* synthetic */ t1 c;

    public s1(t1 t1Var, id idVar) {
        this.c = t1Var;
        this.b = idVar;
    }

    @Override // com.startapp.sdk.internal.id
    public final synchronized void a(Object obj) {
        if (this.f412a) {
            return;
        }
        this.f412a = true;
        this.c.c.removeCallbacksAndMessages(null);
        this.b.a(obj);
    }
}
