package M2;

import N2.A;
import N2.C;
import N2.C0315a;
import N2.C0318d;
import N2.K;
import N2.M;
import N2.O;
import O2.AbstractC0369f;
import O2.C0370g;
import O2.C0375l;
import O2.m;
import O2.w;
import android.content.Context;
import android.os.SystemClock;
import h3.n;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: A, reason: collision with root package name */
    public final C0318d f1887A;

    /* renamed from: n, reason: collision with root package name */
    public final Context f1888n;

    /* renamed from: u, reason: collision with root package name */
    public final String f1889u;

    /* renamed from: v, reason: collision with root package name */
    public final e f1890v;

    /* renamed from: w, reason: collision with root package name */
    public final b f1891w;

    /* renamed from: x, reason: collision with root package name */
    public final C0315a f1892x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1893y;

    /* renamed from: z, reason: collision with root package name */
    public final C3.e f1894z;

    public h(Context context, e eVar, b bVar, g gVar) {
        w.i(context, "Null context is not permitted.");
        w.i(eVar, "Api must not be null.");
        w.i(gVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f1888n = context.getApplicationContext();
        String str = null;
        if (S2.b.g()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f1889u = str;
        this.f1890v = eVar;
        this.f1891w = bVar;
        this.f1892x = new C0315a(eVar, bVar, str);
        C0318d e6 = C0318d.e(this.f1888n);
        this.f1887A = e6;
        this.f1893y = e6.f2047A.getAndIncrement();
        this.f1894z = gVar.f1886a;
        Z2.e eVar2 = e6.f2052F;
        eVar2.sendMessage(eVar2.obtainMessage(7, this));
    }

    public final Y2.e b() {
        Y2.e eVar = new Y2.e(11, false);
        Set set = Collections.EMPTY_SET;
        if (((s.c) eVar.f3963u) == null) {
            eVar.f3963u = new s.c(0);
        }
        ((s.c) eVar.f3963u).addAll(set);
        Context context = this.f1888n;
        eVar.f3965w = context.getClass().getName();
        eVar.f3964v = context.getPackageName();
        return eVar;
    }

    public final n c(int i, D3.f fVar) {
        h3.h hVar = new h3.h();
        C0318d c0318d = this.f1887A;
        c0318d.getClass();
        int i4 = fVar.f697c;
        Z2.e eVar = c0318d.f2052F;
        n nVar = hVar.f38206a;
        if (i4 != 0) {
            K k6 = null;
            if (c0318d.a()) {
                m mVar = (m) C0375l.a().f2443n;
                C0315a c0315a = this.f1892x;
                boolean z8 = true;
                if (mVar != null) {
                    if (mVar.f2445u) {
                        C c4 = (C) c0318d.f2049C.get(c0315a);
                        if (c4 != null) {
                            Object obj = c4.f1989u;
                            if (obj instanceof AbstractC0369f) {
                                AbstractC0369f abstractC0369f = (AbstractC0369f) obj;
                                if (abstractC0369f.f2400T != null && !abstractC0369f.d()) {
                                    C0370g a9 = K.a(c4, abstractC0369f, i4);
                                    if (a9 != null) {
                                        c4.f1986E++;
                                        z8 = a9.f2411v;
                                    }
                                }
                            }
                        }
                        z8 = mVar.f2446v;
                    }
                    k6 = null;
                }
                k6 = new K(c0318d, i4, c0315a, z8 ? System.currentTimeMillis() : 0L, z8 ? SystemClock.elapsedRealtime() : 0L);
            }
            if (k6 != null) {
                eVar.getClass();
                nVar.a(new A(0, eVar), k6);
            }
        }
        eVar.sendMessage(eVar.obtainMessage(4, new M(new O(i, fVar, hVar, this.f1894z), c0318d.f2048B.get(), this)));
        return nVar;
    }
}
