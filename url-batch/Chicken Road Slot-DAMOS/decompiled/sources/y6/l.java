package y6;

import a2.r;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.cg;
import com.google.android.gms.internal.measurement.dd;
import com.google.android.gms.internal.measurement.ib;
import com.google.android.gms.internal.measurement.mf;
import com.google.android.gms.internal.measurement.o0;
import com.google.common.util.concurrent.ListenableFuture;
import f8.d0;
import f8.l0;
import f8.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import k1.v;
import kotlin.Pair;
import kotlin.collections.i0;
import kotlin.collections.k0;
import n4.f0;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l implements y {

    /* renamed from: s, reason: collision with root package name */
    public static l f10658s;

    /* renamed from: d, reason: collision with root package name */
    public int f10659d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10660e;

    /* renamed from: i, reason: collision with root package name */
    public Object f10661i;

    /* renamed from: r, reason: collision with root package name */
    public Object f10662r;

    public l(n4.h hVar, int i3) {
        this.f10660e = hVar.f7067t;
        this.f10659d = i3;
        q4.c cVar = hVar.f7069v;
        this.f10661i = cVar.a();
        k0.f5575d.getClass();
        Bundle h10 = w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
        this.f10662r = h10;
        cVar.f7976h.h(h10);
    }

    public static Object d(l lVar, re.e eVar, int i3, pe.a aVar) {
        eVar.getClass();
        aVar.getClass();
        return lVar.e();
    }

    public static synchronized l k(Context context) {
        l lVar;
        synchronized (l.class) {
            try {
                if (f10658s == null) {
                    f10658s = new l(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new h7.a("MessengerIpcClient"))));
                }
                lVar = f10658s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    public int a(re.e eVar) {
        String d10;
        c6.l lVar;
        eVar.getClass();
        int i3 = this.f10659d;
        do {
            i3++;
            if (i3 >= eVar.c()) {
                return -1;
            }
            d10 = eVar.d(i3);
            lVar = (c6.l) this.f10660e;
            lVar.getClass();
            d10.getClass();
        } while (!((Bundle) lVar.f1829e).containsKey(d10));
        this.f10659d = i3;
        this.f10661i = d10;
        return i3;
    }

    public l b(re.e eVar) {
        eVar.getClass();
        if (r4.d.e(eVar)) {
            this.f10661i = eVar.d(0);
            this.f10659d = 0;
        }
        return this;
    }

    public int c() {
        return ((Integer) e()).intValue();
    }

    @Override // f8.y
    public ListenableFuture call() {
        dd ddVar = (dd) this.f10660e;
        o0 o0Var = (o0) this.f10661i;
        int i3 = this.f10659d;
        ArrayList arrayList = (ArrayList) this.f10662r;
        ListenableFuture d10 = l0.d(o0Var);
        for (int i10 = 0; i10 < i3; i10++) {
            if (((Boolean) l0.b((Future) arrayList.get(i10))).booleanValue()) {
                if (((List) ddVar.f2233b).get(i10) != null) {
                    i0.j();
                    return null;
                }
                ib ibVar = new ib(1);
                int i11 = cg.f2205a;
                d10 = l0.g(d10, new dd(4, mf.a(), ibVar), d0.f4128d);
            }
        }
        return d10;
    }

    public Object e() {
        c6.l lVar = (c6.l) this.f10660e;
        String str = (String) this.f10661i;
        lVar.getClass();
        str.getClass();
        f0 f0Var = (f0) ((LinkedHashMap) lVar.f1830i).get(str);
        Object a9 = f0Var != null ? f0Var.a(str, (Bundle) lVar.f1829e) : null;
        if (a9 != null) {
            return a9;
        }
        r.q((String) this.f10661i, "Unexpected null value for non-nullable argument ");
        return null;
    }

    public void f(float f3) {
        ((Paint) this.f10660e).setAlpha((int) Math.rint(f3 * 255.0f));
    }

    public void g(int i3) {
        if (this.f10659d == i3) {
            return;
        }
        this.f10659d = i3;
        Paint paint = (Paint) this.f10660e;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(v.q(i3));
        } else {
            paint.setXfermode(new PorterDuffXfermode(v.t(i3)));
        }
    }

    public void h(long j) {
        ((Paint) this.f10660e).setColor(v.r(j));
    }

    public void i(k1.j jVar) {
        this.f10662r = jVar;
        ((Paint) this.f10660e).setColorFilter(jVar != null ? jVar.f5329a : null);
    }

    public void j(int i3) {
        ((Paint) this.f10660e).setStyle(i3 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public synchronized w7.n l(k kVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(kVar.toString()));
            }
            if (!((j) this.f10662r).a(kVar)) {
                j jVar = new j(this);
                this.f10662r = jVar;
                jVar.a(kVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return kVar.f10654b.f10117a;
    }

    public l(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f10662r = new j(this);
        this.f10659d = 1;
        this.f10661i = scheduledExecutorService;
        this.f10660e = context.getApplicationContext();
    }

    public l(Bundle bundle, LinkedHashMap linkedHashMap) {
        this.f10659d = -1;
        this.f10661i = "";
        this.f10662r = ue.a.f9716a;
        this.f10660e = new c6.l(10, bundle, linkedHashMap);
    }

    public /* synthetic */ l(dd ddVar, o0 o0Var, int i3, ArrayList arrayList) {
        this.f10660e = ddVar;
        this.f10661i = o0Var;
        this.f10659d = i3;
        this.f10662r = arrayList;
    }

    public l(Bundle bundle) {
        bundle.getClass();
        bundle.getClass();
        this.f10660e = a.a.J("nav-entry-state:id", bundle);
        this.f10659d = a.a.C("nav-entry-state:destination-id", bundle);
        this.f10661i = a.a.H("nav-entry-state:args", bundle);
        this.f10662r = a.a.H("nav-entry-state:saved-state", bundle);
    }

    public l(Paint paint) {
        this.f10660e = paint;
        this.f10659d = 3;
    }
}
