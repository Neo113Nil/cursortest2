package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class vr1 implements yu, s60, z2.q, u60, z2.y, pi1 {

    /* renamed from: f, reason: collision with root package name */
    private yu f13483f;

    /* renamed from: g, reason: collision with root package name */
    private s60 f13484g;

    /* renamed from: h, reason: collision with root package name */
    private z2.q f13485h;

    /* renamed from: i, reason: collision with root package name */
    private u60 f13486i;

    /* renamed from: j, reason: collision with root package name */
    private z2.y f13487j;

    /* renamed from: k, reason: collision with root package name */
    private pi1 f13488k;

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void d(yu yuVar, s60 s60Var, z2.q qVar, u60 u60Var, z2.y yVar, pi1 pi1Var) {
        this.f13483f = yuVar;
        this.f13484g = s60Var;
        this.f13485h = qVar;
        this.f13486i = u60Var;
        this.f13487j = yVar;
        this.f13488k = pi1Var;
    }

    @Override // z2.q
    public final synchronized void B3() {
        z2.q qVar = this.f13485h;
        if (qVar != null) {
            qVar.B3();
        }
    }

    @Override // z2.q
    public final synchronized void E(int i7) {
        z2.q qVar = this.f13485h;
        if (qVar != null) {
            qVar.E(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final synchronized void M() {
        yu yuVar = this.f13483f;
        if (yuVar != null) {
            yuVar.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.u60
    public final synchronized void Q(String str, String str2) {
        u60 u60Var = this.f13486i;
        if (u60Var != null) {
            u60Var.Q(str, str2);
        }
    }

    @Override // z2.q
    public final synchronized void a() {
        z2.q qVar = this.f13485h;
        if (qVar != null) {
            qVar.a();
        }
    }

    @Override // z2.q
    public final synchronized void b() {
        z2.q qVar = this.f13485h;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // z2.y
    public final synchronized void e() {
        z2.y yVar = this.f13487j;
        if (yVar != null) {
            ((wr1) yVar).f13925f.a();
        }
    }

    @Override // z2.q
    public final synchronized void k6() {
        z2.q qVar = this.f13485h;
        if (qVar != null) {
            qVar.k6();
        }
    }

    @Override // z2.q
    public final synchronized void o4() {
        z2.q qVar = this.f13485h;
        if (qVar != null) {
            qVar.o4();
        }
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final synchronized void r() {
        pi1 pi1Var = this.f13488k;
        if (pi1Var != null) {
            pi1Var.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final synchronized void t(String str, Bundle bundle) {
        s60 s60Var = this.f13484g;
        if (s60Var != null) {
            s60Var.t(str, bundle);
        }
    }
}
