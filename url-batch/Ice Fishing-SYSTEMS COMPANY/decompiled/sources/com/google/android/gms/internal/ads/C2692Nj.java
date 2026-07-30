package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Nj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2692Nj implements s2.l {

    /* renamed from: n, reason: collision with root package name */
    public final C2557Fk f26594n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f26595u = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f26596v = new AtomicBoolean(false);

    public C2692Nj(C2557Fk c2557Fk) {
        this.f26594n = c2557Fk;
    }

    @Override // s2.l
    public final void D0() {
    }

    @Override // s2.l
    public final void G2() {
        AtomicBoolean atomicBoolean = this.f26596v;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f26594n.u1(C2943ak.f29273C);
    }

    @Override // s2.l
    public final void K1() {
    }

    @Override // s2.l
    public final void K2() {
    }

    @Override // s2.l
    public final void R0(int i) {
        this.f26595u.set(true);
        AtomicBoolean atomicBoolean = this.f26596v;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f26594n.u1(C2943ak.f29273C);
    }

    @Override // s2.l
    public final void Y1() {
    }

    @Override // s2.l
    public final void f1() {
    }

    @Override // s2.l
    public final void g() {
        this.f26594n.u1(C2943ak.f29297z);
    }

    @Override // s2.l
    public final void o1() {
    }

    @Override // s2.l
    public final void u0() {
    }

    @Override // s2.l
    public final void y1() {
    }
}
