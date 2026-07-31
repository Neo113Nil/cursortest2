package W0;

import D3.M;
import T0.C0166a;
import T0.C0169d;
import T0.K;
import T0.N;
import U0.h;
import U0.j;
import U0.k;
import U0.t;
import android.content.Context;
import android.os.Build;
import c1.AbstractC0278c;
import c1.e;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import k1.n;
import q.C0583c;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final S0.c f2789i = new S0.c("ClientTelemetry.API", new b(0), new S0.b());

    /* renamed from: a, reason: collision with root package name */
    public final Context f2790a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2791b;

    /* renamed from: c, reason: collision with root package name */
    public final S0.c f2792c;

    /* renamed from: d, reason: collision with root package name */
    public final k f2793d;

    /* renamed from: e, reason: collision with root package name */
    public final C0166a f2794e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2795f;

    /* renamed from: g, reason: collision with root package name */
    public final h f2796g;

    /* renamed from: h, reason: collision with root package name */
    public final C0169d f2797h;

    public c(Context context, S0.c cVar, S0.d dVar) {
        t.g(context, "Null context is not permitted.");
        t.g(cVar, "Api must not be null.");
        t.g(dVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f2790a = context.getApplicationContext();
        String str = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f2791b = str;
        this.f2792c = cVar;
        this.f2793d = k.f2549a;
        this.f2794e = new C0166a(cVar, str);
        C0169d d7 = C0169d.d(this.f2790a);
        this.f2797h = d7;
        this.f2795f = d7.f2288h.getAndIncrement();
        this.f2796g = dVar.f2204a;
        e eVar = d7.f2293m;
        eVar.sendMessage(eVar.obtainMessage(7, this));
    }

    public final B0.c a() {
        B0.c cVar = new B0.c(14, false);
        Set set = Collections.EMPTY_SET;
        if (((C0583c) cVar.f72h) == null) {
            cVar.f72h = new C0583c(0);
        }
        ((C0583c) cVar.f72h).addAll(set);
        Context context = this.f2790a;
        cVar.f73i = context.getClass().getName();
        cVar.f71g = context.getPackageName();
        return cVar;
    }

    public final n b(j jVar) {
        J1.c cVar = new J1.c(24);
        R0.c[] cVarArr = {AbstractC0278c.f3776a};
        cVar.f1289g = new M(28, jVar);
        T0.M m4 = new T0.M(cVar, cVarArr, false);
        k1.h hVar = new k1.h();
        C0169d c0169d = this.f2797h;
        c0169d.getClass();
        N n7 = new N(m4, hVar, this.f2796g);
        e eVar = c0169d.f2293m;
        eVar.sendMessage(eVar.obtainMessage(4, new K(n7, c0169d.f2289i.get(), this)));
        return hVar.f5157a;
    }
}
