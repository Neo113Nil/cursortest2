package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v5 implements e2, b7.i, f8.y, OnCompleteListener, a8.m {

    /* renamed from: i, reason: collision with root package name */
    public static volatile v5 f2866i;

    /* renamed from: r, reason: collision with root package name */
    public static final h1 f2867r = new h1(7);

    /* renamed from: s, reason: collision with root package name */
    public static final lg f2868s = new lg();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2869d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2870e;

    public v5(int i3) {
        this.f2869d = i3;
        switch (i3) {
            case 1:
                int i10 = q0.f2690a;
                this.f2870e = new v5(4, new e2[]{h1.f2355e, f2867r});
                break;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                this.f2870e = new HashMap();
                break;
            case 14:
                this.f2870e = new ConcurrentHashMap();
                break;
            case 15:
                this.f2870e = new AtomicInteger();
                break;
            default:
                this.f2870e = new CopyOnWriteArrayList();
                break;
        }
    }

    public static void d(String str, kg kgVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(kgVar.f2466b / 1000000)));
        sb2.append(": logging error [");
        rg rgVar = kgVar.f2468d;
        if (rgVar == null) {
            kotlin.collections.i0.l("cannot request log site information prior to postProcess()");
            return;
        }
        ia.d(1, rgVar, sb2);
        sb2.append("]: ");
        sb2.append(str);
        System.err.println(sb2);
        System.err.flush();
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public boolean a(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            if (((e2[]) this.f2870e)[i3].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // b7.i
    public void accept(Object obj, Object obj2) {
        int i3 = this.f2869d;
        Object obj3 = this.f2870e;
        w7.g gVar = (w7.g) obj2;
        fa faVar = (fa) obj;
        switch (i3) {
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                int i10 = da.f2231k;
                ba baVar = new ba(gVar);
                ea eaVar = (ea) faVar.m();
                byte[] a9 = ((cb) obj3).a();
                Parcel F = eaVar.F();
                r5.c(F, baVar);
                F.writeByteArray(a9);
                eaVar.G(F, 31);
                break;
            default:
                ea eaVar2 = (ea) faVar.m();
                ba baVar2 = new ba((da) obj3, gVar);
                Parcel F2 = eaVar2.F();
                r5.c(F2, baVar2);
                eaVar2.G(F2, 27);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public n2 b(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            e2 e2Var = ((e2[]) this.f2870e)[i3];
            if (e2Var.a(cls)) {
                return e2Var.b(cls);
            }
        }
        a2.r.r("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public gc c(String str, boolean z10) {
        return new gc(str, (z6.j) this.f2870e, z10);
    }

    @Override // f8.y
    public ListenableFuture call() {
        switch (this.f2869d) {
            case 9:
                f8.z0 z0Var = new f8.z0((Callable) this.f2870e);
                f8.d0.f4128d.execute(z0Var);
                return z0Var;
            default:
                return (f8.r) this.f2870e;
        }
    }

    public void e(int i3, Object obj, o2 o2Var) {
        b1 b1Var = (b1) this.f2870e;
        o0 o0Var = (o0) obj;
        b1Var.d(i3, 2);
        b1Var.r(o0Var.c(o2Var));
        o2Var.e(o0Var, this);
    }

    @Override // a8.m
    public Object get() {
        int i3 = this.f2869d;
        Object obj = this.f2870e;
        switch (i3) {
            case RequestError.STOP_TRACKING /* 11 */:
                Object obj2 = sa.j;
                return new zd((ArrayList) obj);
            default:
                rd rdVar = (rd) obj;
                f8.u0 u0Var = (f8.u0) rdVar.f2750c.get();
                u0Var.getClass();
                jb jbVar = (jb) rdVar.f2749b.get();
                jbVar.getClass();
                da daVar = jbVar.f2428a;
                a8.l b10 = a8.l.b();
                b10.f358c = new v5(8, daVar);
                b10.f359d = new z6.d[]{h.f2351c};
                b10.f356a = false;
                f8.a b11 = jb.b(daVar.b(0, b10.a()));
                e3 e3Var = e3.f2251s;
                int i10 = f8.c.f4119z;
                f8.b bVar = new f8.b(b11, hb.class, e3Var);
                b11.a(bVar, z4.w.I(u0Var, bVar));
                f8.t f3 = f8.l0.f(bVar, new tc(2, rdVar), u0Var);
                f3.a(new bd(4, f3), u0Var);
                return f3;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        ja jaVar = (ja) this.f2870e;
        if (task.i()) {
            jaVar.cancel(false);
            return;
        }
        if (task.isSuccessful()) {
            jaVar.l(task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            throw new IllegalStateException();
        }
        jaVar.m(exception);
    }

    public /* synthetic */ v5(int i3, Object obj) {
        this.f2869d = i3;
        this.f2870e = obj;
    }

    public v5(b1 b1Var) {
        this.f2869d = 3;
        this.f2870e = b1Var;
        b1Var.f2158a = this;
    }

    public v5(ba baVar, byte[] bArr) {
        this.f2869d = 6;
        this.f2870e = bArr;
    }
}
