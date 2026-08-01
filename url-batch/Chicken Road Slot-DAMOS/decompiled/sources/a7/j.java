package a7;

import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import b7.m0;
import b7.s0;
import c7.c0;
import com.google.android.gms.internal.measurement.z5;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f328a;

    /* renamed from: b, reason: collision with root package name */
    public final String f329b;

    /* renamed from: c, reason: collision with root package name */
    public final d9.c f330c;

    /* renamed from: d, reason: collision with root package name */
    public final d f331d;

    /* renamed from: e, reason: collision with root package name */
    public final b f332e;

    /* renamed from: f, reason: collision with root package name */
    public final b7.a f333f;
    public final Looper g;

    /* renamed from: h, reason: collision with root package name */
    public final int f334h;

    /* renamed from: i, reason: collision with root package name */
    public final u8.d f335i;
    public final b7.d j;

    public j(Context context, d dVar, b bVar, i iVar) {
        AttributionSource attributionSource;
        c0.h(context, "Null context is not permitted.");
        c0.h(dVar, "Api must not be null.");
        c0.h(iVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        c0.h(applicationContext, "The provided context did not have an application context.");
        this.f328a = applicationContext;
        int i3 = Build.VERSION.SDK_INT;
        d9.c cVar = null;
        String b10 = (i3 < 30 || i3 < 30) ? null : f2.b.b(context);
        this.f329b = b10;
        if (i3 >= 31) {
            attributionSource = context.getAttributionSource();
            cVar = new d9.c(24, attributionSource);
        }
        this.f330c = cVar;
        this.f331d = dVar;
        this.f332e = bVar;
        this.g = iVar.f327b;
        this.f333f = new b7.a(dVar, bVar, b10);
        b7.d d10 = b7.d.d(applicationContext);
        this.j = d10;
        this.f334h = d10.f1269h.getAndIncrement();
        this.f335i = iVar.f326a;
        z5 z5Var = d10.f1273m;
        z5Var.sendMessage(z5Var.obtainMessage(7, this));
    }

    public final a1.n a() {
        a1.n nVar = new a1.n(6, false);
        Set set = Collections.EMPTY_SET;
        if (((s.f) nVar.f41i) == null) {
            nVar.f41i = new s.f(0);
        }
        ((s.f) nVar.f41i).addAll(set);
        Context context = this.f328a;
        nVar.f42r = context.getClass().getName();
        nVar.f40e = context.getPackageName();
        return nVar;
    }

    public final w7.n b(int i3, a8.l lVar) {
        w7.g gVar = new w7.g();
        b7.d dVar = this.j;
        dVar.getClass();
        dVar.b(gVar, lVar.f357b, this);
        m0 m0Var = new m0(new s0(i3, lVar, gVar, this.f335i), dVar.f1270i.get(), this);
        z5 z5Var = dVar.f1273m;
        z5Var.sendMessage(z5Var.obtainMessage(4, m0Var));
        return gVar.f10117a;
    }
}
