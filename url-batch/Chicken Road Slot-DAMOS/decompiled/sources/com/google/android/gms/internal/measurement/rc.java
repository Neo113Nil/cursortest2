package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class rc implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc f2745e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f8.t f2746i;

    public /* synthetic */ rc(vc vcVar, f8.t tVar, int i3) {
        this.f2744d = i3;
        this.f2745e = vcVar;
        this.f2746i = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: CancellationException -> 0x0024, ExecutionException -> 0x0027, TryCatch #4 {CancellationException -> 0x0024, ExecutionException -> 0x0027, blocks: (B:5:0x0009, B:7:0x001f, B:10:0x0033, B:12:0x0041, B:14:0x004d, B:18:0x005f, B:20:0x0063, B:23:0x002a, B:34:0x009d), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[Catch: CancellationException -> 0x0024, ExecutionException -> 0x0027, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0024, ExecutionException -> 0x0027, blocks: (B:5:0x0009, B:7:0x001f, B:10:0x0033, B:12:0x0041, B:14:0x004d, B:18:0x005f, B:20:0x0063, B:23:0x002a, B:34:0x009d), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        b7.h hVar;
        switch (this.f2744d) {
            case 0:
                vc vcVar = this.f2745e;
                try {
                    f8.l0.b(this.f2746i);
                    return;
                } catch (Exception e2) {
                    String str = vcVar.f2887c;
                    Log.w("FlagStore", v4.a.p(new StringBuilder(String.valueOf(str).length() + 73), "Failed to store account on flag read for: ", str, " which may lead to stale flags."), e2);
                    return;
                }
            default:
                vc vcVar2 = this.f2745e;
                try {
                    od odVar = (od) f8.l0.b(this.f2746i);
                    b7.h hVar2 = new b7.h(odVar, new md(6, 2));
                    boolean z10 = vcVar2.f2889e;
                    if (!z10) {
                        hVar = vcVar2.f2885a;
                        if (hVar == null) {
                        }
                        if (!((b8.x) hVar.f1295d).equals((b8.x) hVar2.f1295d)) {
                            jd jdVar = (jd) vcVar2.f2886b.f2790e.get();
                            if (jdVar != null) {
                                jdVar.a();
                                return;
                            }
                            return;
                        }
                        if (vcVar2.f2889e) {
                            return;
                        }
                        sa saVar = vcVar2.f2886b;
                        jb jbVar = (jb) saVar.f2789d.get();
                        String t6 = odVar.t();
                        jbVar.getClass();
                        t6.getClass();
                        f8.a b10 = jb.b(jbVar.f2428a.c(t6));
                        tc tcVar = new tc(0, vcVar2);
                        f8.u0 a9 = saVar.a();
                        int i3 = f8.c.f4119z;
                        f8.b bVar = new f8.b(b10, Throwable.class, tcVar);
                        b10.a(bVar, z4.w.I(a9, bVar));
                        return;
                    }
                    synchronized (vcVar2) {
                        if (!z10) {
                            hVar = vcVar2.f2885a;
                            if (hVar != null) {
                                if (!((b8.x) hVar.f1295d).equals((b8.x) hVar2.f1295d)) {
                                }
                            }
                        }
                        vcVar2.f2885a = hVar2;
                        ((AtomicInteger) vcVar2.g.f2870e).incrementAndGet();
                    }
                    if (vcVar2.f2889e) {
                    }
                } catch (CancellationException e9) {
                    e = e9;
                    if (e.getCause() instanceof SecurityException) {
                        String str2 = vcVar2.f2887c;
                        Log.w("FlagStore", v4.a.p(new StringBuilder(String.valueOf(str2).length() + 64), "Unable to update local snapshot for ", str2, ", may result in stale flags."), e);
                        return;
                    }
                    return;
                } catch (ExecutionException e10) {
                    e = e10;
                    if (e.getCause() instanceof SecurityException) {
                    }
                }
        }
    }
}
