package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
final class lr1 implements yu, s60, z2.q, u60, z2.y {

    /* renamed from: f, reason: collision with root package name */
    private yu f8058f;

    /* renamed from: g, reason: collision with root package name */
    private s60 f8059g;

    /* renamed from: h, reason: collision with root package name */
    private z2.q f8060h;

    /* renamed from: i, reason: collision with root package name */
    private u60 f8061i;

    /* renamed from: j, reason: collision with root package name */
    private z2.y f8062j;

    /* synthetic */ lr1(kr1 kr1Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void d(yu yuVar, s60 s60Var, z2.q qVar, u60 u60Var, z2.y yVar) {
        this.f8058f = yuVar;
        this.f8059g = s60Var;
        this.f8060h = qVar;
        this.f8061i = u60Var;
        this.f8062j = yVar;
    }

    @Override // z2.q
    public final synchronized void B3() {
        z2.q qVar = this.f8060h;
        if (qVar != null) {
            qVar.B3();
        }
    }

    @Override // z2.q
    public final synchronized void E(int i7) {
        z2.q qVar = this.f8060h;
        if (qVar != null) {
            qVar.E(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final synchronized void M() {
        yu yuVar = this.f8058f;
        if (yuVar != null) {
            yuVar.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.u60
    public final synchronized void Q(String str, String str2) {
        u60 u60Var = this.f8061i;
        if (u60Var != null) {
            u60Var.Q(str, str2);
        }
    }

    @Override // z2.q
    public final synchronized void a() {
        z2.q qVar = this.f8060h;
        if (qVar != null) {
            qVar.a();
        }
    }

    @Override // z2.q
    public final synchronized void b() {
        z2.q qVar = this.f8060h;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // z2.y
    public final synchronized void e() {
        z2.y yVar = this.f8062j;
        if (yVar != null) {
            ((mr1) yVar).f8693f.a();
        }
    }

    @Override // z2.q
    public final synchronized void k6() {
        z2.q qVar = this.f8060h;
        if (qVar != null) {
            qVar.k6();
        }
    }

    @Override // z2.q
    public final synchronized void o4() {
        z2.q qVar = this.f8060h;
        if (qVar != null) {
            qVar.o4();
        }
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final synchronized void t(String str, Bundle bundle) {
        s60 s60Var = this.f8059g;
        if (s60Var != null) {
            s60Var.t(str, bundle);
        }
    }
}
