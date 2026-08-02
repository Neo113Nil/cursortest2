package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifz {
    private static final hkh a = hkh.l("com/google/frameworks/client/data/android/server/Endpoint");
    private final aeu b;
    private final ScheduledExecutorService c;
    private final jyf d;
    private final gzp e;
    private final kcd f;

    public ifz(Service service, ScheduledExecutorService scheduledExecutorService, jyf jyfVar, gzp gzpVar) {
        hoq.y(service instanceof aeu, "A service hosting an Endpoint must be a LifecycleService");
        this.b = (aeu) service;
        this.c = scheduledExecutorService;
        this.d = jyfVar;
        this.e = gzpVar;
        this.f = new kcd();
        ((hkf) ((hkf) a.e()).i("com/google/frameworks/client/data/android/server/Endpoint", "<init>", 59, "Endpoint.java")).u("Created gRPC endpoint for service %s", service.getClass());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.IBinder, java.lang.Object] */
    public final IBinder a() {
        ?? r0 = this.f.a;
        r0.getClass();
        return r0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(kuq kuqVar, kcf kcfVar) {
        klw klwVar;
        kbk kbkVar;
        kbk kbkVar2;
        djv.a();
        aeu aeuVar = this.b;
        jyc jycVar = new jyc(new kca(new Intent("grpc.io.action.BIND").setComponent(new ComponentName(aeuVar, aeuVar.getClass())), null), this.f);
        kcn kcnVar = jycVar.b;
        kcnVar.g = kuqVar;
        kcfVar.getClass();
        kcnVar.e = kcfVar;
        kly klyVar = jycVar.a;
        ScheduledExecutorService scheduledExecutorService = this.c;
        klyVar.i = scheduledExecutorService != null ? new kmj(scheduledExecutorService, 1) : kly.b;
        scheduledExecutorService.getClass();
        kcnVar.d = new kmj(scheduledExecutorService, 1);
        jyf jyfVar = this.d;
        if (jyfVar == null) {
            jyfVar = kly.c;
        }
        klyVar.h = jyfVar;
        klyVar.j = new jxv();
        klyVar.k = new jxf(new jxe[0]);
        Iterator it = ((List) ((gzs) this.e).a).iterator();
        while (it.hasNext()) {
            jycVar.a((kbi) it.next());
        }
        hoq.I(!jycVar.c, "BinderServerBuilder can only be used to build one server instance.");
        jycVar.c = true;
        jycVar.a(new kcu());
        kcnVar.c = klyVar.i;
        new kjk(klyVar.g, kaf.a());
        khq khqVar = klyVar.s;
        ixa.a();
        ArrayList arrayList = new ArrayList();
        if (klyVar.m) {
            try {
                Class<?> cls = Class.forName("kdy");
                Class<?> cls2 = Boolean.TYPE;
                kbkVar = (kbk) cls.getDeclaredMethod("getServerStreamTracerFactory", cls2, cls2, cls2).invoke(null, Boolean.valueOf(klyVar.n), Boolean.valueOf(klyVar.o), false);
            } catch (ClassNotFoundException e) {
                kly.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", (Throwable) e);
                kbkVar = null;
                if (kbkVar != null) {
                }
                if (klyVar.p) {
                }
                arrayList.addAll(klyVar.f);
                arrayList.trimToSize();
                List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                Object obj = khqVar.a;
                Object obj2 = khqVar.b;
                kcn kcnVar2 = ((jyc) obj).b;
                kcnVar2.b = unmodifiableList;
                kcp kcpVar = new kcp(kcnVar2);
                ((kcd) obj2).a = kcpVar.c;
                klwVar = new klw(klyVar, kcpVar, jxr.d);
                synchronized (klwVar.p) {
                }
            } catch (IllegalAccessException e2) {
                kly.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", (Throwable) e2);
                kbkVar = null;
                if (kbkVar != null) {
                }
                if (klyVar.p) {
                }
                arrayList.addAll(klyVar.f);
                arrayList.trimToSize();
                List unmodifiableList2 = DesugarCollections.unmodifiableList(arrayList);
                Object obj3 = khqVar.a;
                Object obj22 = khqVar.b;
                kcn kcnVar22 = ((jyc) obj3).b;
                kcnVar22.b = unmodifiableList2;
                kcp kcpVar2 = new kcp(kcnVar22);
                ((kcd) obj22).a = kcpVar2.c;
                klwVar = new klw(klyVar, kcpVar2, jxr.d);
                synchronized (klwVar.p) {
                }
            } catch (NoSuchMethodException e3) {
                kly.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", (Throwable) e3);
                kbkVar = null;
                if (kbkVar != null) {
                }
                if (klyVar.p) {
                }
                arrayList.addAll(klyVar.f);
                arrayList.trimToSize();
                List unmodifiableList22 = DesugarCollections.unmodifiableList(arrayList);
                Object obj32 = khqVar.a;
                Object obj222 = khqVar.b;
                kcn kcnVar222 = ((jyc) obj32).b;
                kcnVar222.b = unmodifiableList22;
                kcp kcpVar22 = new kcp(kcnVar222);
                ((kcd) obj222).a = kcpVar22.c;
                klwVar = new klw(klyVar, kcpVar22, jxr.d);
                synchronized (klwVar.p) {
                }
            } catch (InvocationTargetException e4) {
                kly.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", (Throwable) e4);
                kbkVar = null;
                if (kbkVar != null) {
                }
                if (klyVar.p) {
                }
                arrayList.addAll(klyVar.f);
                arrayList.trimToSize();
                List unmodifiableList222 = DesugarCollections.unmodifiableList(arrayList);
                Object obj322 = khqVar.a;
                Object obj2222 = khqVar.b;
                kcn kcnVar2222 = ((jyc) obj322).b;
                kcnVar2222.b = unmodifiableList222;
                kcp kcpVar222 = new kcp(kcnVar2222);
                ((kcd) obj2222).a = kcpVar222.c;
                klwVar = new klw(klyVar, kcpVar222, jxr.d);
                synchronized (klwVar.p) {
                }
            }
            if (kbkVar != null) {
                arrayList.add(kbkVar);
            }
        }
        if (klyVar.p) {
            try {
                kbkVar2 = (kbk) Class.forName("kdz").getDeclaredMethod("getServerStreamTracerFactory", null).invoke(null, null);
            } catch (ClassNotFoundException e5) {
                kly.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", (Throwable) e5);
                kbkVar2 = null;
                if (kbkVar2 != null) {
                }
                arrayList.addAll(klyVar.f);
                arrayList.trimToSize();
                List unmodifiableList2222 = DesugarCollections.unmodifiableList(arrayList);
                Object obj3222 = khqVar.a;
                Object obj22222 = khqVar.b;
                kcn kcnVar22222 = ((jyc) obj3222).b;
                kcnVar22222.b = unmodifiableList2222;
                kcp kcpVar2222 = new kcp(kcnVar22222);
                ((kcd) obj22222).a = kcpVar2222.c;
                klwVar = new klw(klyVar, kcpVar2222, jxr.d);
                synchronized (klwVar.p) {
                }
            } catch (IllegalAccessException e6) {
                kly.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", (Throwable) e6);
                kbkVar2 = null;
                if (kbkVar2 != null) {
                }
                arrayList.addAll(klyVar.f);
                arrayList.trimToSize();
                List unmodifiableList22222 = DesugarCollections.unmodifiableList(arrayList);
                Object obj32222 = khqVar.a;
                Object obj222222 = khqVar.b;
                kcn kcnVar222222 = ((jyc) obj32222).b;
                kcnVar222222.b = unmodifiableList22222;
                kcp kcpVar22222 = new kcp(kcnVar222222);
                ((kcd) obj222222).a = kcpVar22222.c;
                klwVar = new klw(klyVar, kcpVar22222, jxr.d);
                synchronized (klwVar.p) {
                }
            } catch (NoSuchMethodException e7) {
                kly.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", (Throwable) e7);
                kbkVar2 = null;
                if (kbkVar2 != null) {
                }
                arrayList.addAll(klyVar.f);
                arrayList.trimToSize();
                List unmodifiableList222222 = DesugarCollections.unmodifiableList(arrayList);
                Object obj322222 = khqVar.a;
                Object obj2222222 = khqVar.b;
                kcn kcnVar2222222 = ((jyc) obj322222).b;
                kcnVar2222222.b = unmodifiableList222222;
                kcp kcpVar222222 = new kcp(kcnVar2222222);
                ((kcd) obj2222222).a = kcpVar222222.c;
                klwVar = new klw(klyVar, kcpVar222222, jxr.d);
                synchronized (klwVar.p) {
                }
            } catch (InvocationTargetException e8) {
                kly.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", (Throwable) e8);
                kbkVar2 = null;
                if (kbkVar2 != null) {
                }
                arrayList.addAll(klyVar.f);
                arrayList.trimToSize();
                List unmodifiableList2222222 = DesugarCollections.unmodifiableList(arrayList);
                Object obj3222222 = khqVar.a;
                Object obj22222222 = khqVar.b;
                kcn kcnVar22222222 = ((jyc) obj3222222).b;
                kcnVar22222222.b = unmodifiableList2222222;
                kcp kcpVar2222222 = new kcp(kcnVar22222222);
                ((kcd) obj22222222).a = kcpVar2222222.c;
                klwVar = new klw(klyVar, kcpVar2222222, jxr.d);
                synchronized (klwVar.p) {
                }
            }
            if (kbkVar2 != null) {
                arrayList.add(kbkVar2);
            }
        }
        arrayList.addAll(klyVar.f);
        arrayList.trimToSize();
        List unmodifiableList22222222 = DesugarCollections.unmodifiableList(arrayList);
        Object obj32222222 = khqVar.a;
        Object obj222222222 = khqVar.b;
        kcn kcnVar222222222 = ((jyc) obj32222222).b;
        kcnVar222222222.b = unmodifiableList22222222;
        kcp kcpVar22222222 = new kcp(kcnVar222222222);
        ((kcd) obj222222222).a = kcpVar22222222.c;
        klwVar = new klw(klyVar, kcpVar22222222, jxr.d);
        try {
            synchronized (klwVar.p) {
                hoq.I(!klwVar.k, "Already started");
                hoq.I(!klwVar.l, "Shutting down");
                klwVar.o.d(new klr(klwVar));
                ?? a2 = klwVar.d.a();
                a2.getClass();
                klwVar.e = a2;
                klwVar.k = true;
            }
            ael L = this.b.L();
            if (L.c == aek.a) {
                klwVar.b();
            } else {
                L.a(new na(klwVar, 5, null));
            }
        } catch (IOException e9) {
            throw new IllegalStateException("Failed to start Server for Endpoint Service ".concat(String.valueOf(String.valueOf(this.b.getClass()))), e9);
        }
    }
}
