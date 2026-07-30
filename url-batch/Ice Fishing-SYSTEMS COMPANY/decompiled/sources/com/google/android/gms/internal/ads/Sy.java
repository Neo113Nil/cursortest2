package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Sy implements Ny {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f27656a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3901sN f27657b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3901sN f27658c;

    /* renamed from: d, reason: collision with root package name */
    public final C3619nA f27659d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3901sN f27660e;

    /* renamed from: f, reason: collision with root package name */
    public final C3120dy f27661f;

    /* renamed from: g, reason: collision with root package name */
    public final C3066cy f27662g;

    public Sy(ExecutorService executorService, InterfaceC3901sN interfaceC3901sN, InterfaceC3901sN interfaceC3901sN2, C3619nA c3619nA, InterfaceC3901sN interfaceC3901sN3, C3120dy c3120dy, C3066cy c3066cy) {
        this.f27656a = executorService;
        this.f27657b = interfaceC3901sN;
        this.f27658c = interfaceC3901sN2;
        this.f27659d = c3619nA;
        this.f27660e = interfaceC3901sN3;
        this.f27661f = c3120dy;
        this.f27662g = c3066cy;
    }

    @Override // com.google.android.gms.internal.ads.Ny
    public final String a() {
        return "1.893135394";
    }

    @Override // com.google.android.gms.internal.ads.Ny
    public final J3.a b(Context context) {
        C3390iy c3390iy = (C3390iy) this.f27661f.d();
        c3390iy.f32035c = context;
        c3390iy.f32039g = this.f27659d.a();
        C3830r6 C0 = D6.C0();
        C0.getClass();
        c3390iy.f32040h = C0;
        c3390iy.i = EnumC3714oy.f33238n;
        return ((Yy) ((C4009uN) c3390iy.a().f26395u).d()).a();
    }

    @Override // com.google.android.gms.internal.ads.Ny
    public final void c(MotionEvent motionEvent) {
        if (motionEvent != null) {
            Wy wy = (Wy) this.f27660e.d();
            synchronized (wy) {
                try {
                    if (motionEvent.getAction() == 1) {
                        wy.f28537b = MotionEvent.obtain(motionEvent);
                    }
                    wy.f28538c.a(motionEvent);
                    ArrayDeque arrayDeque = wy.f28536a;
                    if (arrayDeque.size() >= 6) {
                        arrayDeque.remove();
                    }
                    arrayDeque.add(new Uy(motionEvent));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ny
    public final J3.a d() {
        return C3686oN.p(new Vs(6, this), this.f27656a);
    }

    @Override // com.google.android.gms.internal.ads.Ny
    public final int e() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.Ny
    public final J3.a f(Context context, View view, Activity activity) {
        C3390iy c3390iy = (C3390iy) this.f27661f.d();
        context.getClass();
        c3390iy.f32035c = context;
        c3390iy.f32036d = view;
        c3390iy.f32037e = activity;
        c3390iy.f32038f = true != this.f27662g.U() ? "" : null;
        c3390iy.f32039g = this.f27659d.b(context, view);
        C3830r6 C0 = D6.C0();
        C0.getClass();
        c3390iy.f32040h = C0;
        c3390iy.i = EnumC3714oy.f33239u;
        return ((Yy) ((C4009uN) c3390iy.a().f26395u).d()).a();
    }

    @Override // com.google.android.gms.internal.ads.Ny
    public final J3.a g(Context context, String str, View view) {
        InterfaceC3901sN interfaceC3901sN = this.f27660e;
        HashMap c4 = this.f27659d.c();
        Wy wy = (Wy) interfaceC3901sN.d();
        synchronized (wy) {
            try {
                MotionEvent motionEvent = wy.f28537b;
                if (motionEvent != null) {
                    c4.put("nv", motionEvent);
                }
                c4.put("oe", wy.f28538c);
                ArrayDeque arrayDeque = wy.f28536a;
                c4.put("ro", arrayDeque.toArray(new Uy[arrayDeque.size()]));
                wy.f28538c = new Ty();
                arrayDeque.clear();
                MotionEvent motionEvent2 = wy.f28537b;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    wy.f28537b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C3390iy c3390iy = (C3390iy) this.f27661f.d();
        context.getClass();
        c3390iy.f32035c = context;
        c3390iy.f32036d = view;
        c3390iy.f32037e = null;
        c3390iy.f32038f = str;
        c3390iy.f32039g = c4;
        c3390iy.i = EnumC3714oy.f33240v;
        C3830r6 C0 = D6.C0();
        C0.getClass();
        c3390iy.f32040h = C0;
        return ((Yy) ((C4009uN) c3390iy.a().f26395u).d()).a();
    }
}
