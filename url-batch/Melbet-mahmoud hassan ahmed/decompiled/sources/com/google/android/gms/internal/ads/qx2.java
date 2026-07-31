package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class qx2 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    static Boolean f10888n;

    /* renamed from: f, reason: collision with root package name */
    private final Context f10889f;

    /* renamed from: g, reason: collision with root package name */
    private final po0 f10890g;

    /* renamed from: i, reason: collision with root package name */
    private String f10892i;

    /* renamed from: j, reason: collision with root package name */
    private int f10893j;

    /* renamed from: l, reason: collision with root package name */
    private final r22 f10895l;

    /* renamed from: m, reason: collision with root package name */
    private final ij0 f10896m;

    /* renamed from: h, reason: collision with root package name */
    private final vx2 f10891h = yx2.G();

    /* renamed from: k, reason: collision with root package name */
    private boolean f10894k = false;

    public qx2(Context context, po0 po0Var, r22 r22Var, ij0 ij0Var, byte[] bArr) {
        this.f10889f = context;
        this.f10890g = po0Var;
        this.f10895l = r22Var;
        this.f10896m = ij0Var;
    }

    public static synchronized boolean b() {
        boolean booleanValue;
        Boolean valueOf;
        synchronized (qx2.class) {
            if (f10888n == null) {
                if (v20.f13080b.e().booleanValue()) {
                    valueOf = Boolean.valueOf(Math.random() < v20.f13079a.e().doubleValue());
                } else {
                    valueOf = Boolean.FALSE;
                }
                f10888n = valueOf;
            }
            booleanValue = f10888n.booleanValue();
        }
        return booleanValue;
    }

    private final synchronized void c() {
        if (this.f10894k) {
            return;
        }
        this.f10894k = true;
        if (b()) {
            y2.t.q();
            this.f10892i = a3.g2.d0(this.f10889f);
            this.f10893j = o3.f.f().a(this.f10889f);
            long intValue = ((Integer) sw.c().b(m10.v6)).intValue();
            wo0.f13897d.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
        }
    }

    private final synchronized void d() {
        try {
            new q22(this.f10889f, this.f10890g.f10301f, this.f10896m, Binder.getCallingUid(), null).c(new o22((String) sw.c().b(m10.u6), 60000, new HashMap(), this.f10891h.o().d(), "application/x-protobuf"));
        } catch (Exception e7) {
            if ((e7 instanceof fz1) && ((fz1) e7).a() == 3) {
                this.f10891h.t();
            } else {
                y2.t.p().r(e7, "CuiMonitor.sendCuiPing");
            }
        }
    }

    public final synchronized void a(px2 px2Var) {
        if (!this.f10894k) {
            c();
        }
        if (b()) {
            if (px2Var == null) {
                return;
            }
            vx2 vx2Var = this.f10891h;
            wx2 F = xx2.F();
            sx2 F2 = tx2.F();
            F2.F(7);
            F2.C(px2Var.h());
            F2.v(px2Var.b());
            F2.H(3);
            F2.B(this.f10890g.f10301f);
            F2.r(this.f10892i);
            F2.z(Build.VERSION.RELEASE);
            F2.D(Build.VERSION.SDK_INT);
            F2.G(px2Var.j());
            F2.y(px2Var.a());
            F2.t(this.f10893j);
            F2.E(px2Var.i());
            F2.s(px2Var.c());
            F2.u(px2Var.d());
            F2.w(px2Var.e());
            F2.x(px2Var.f());
            F2.A(px2Var.g());
            F.r(F2);
            vx2Var.s(F);
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (b()) {
            if (this.f10891h.r() == 0) {
                return;
            }
            d();
        }
    }
}
