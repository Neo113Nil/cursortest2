package b2;

import a0.C0144j;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import c2.C0284a;
import c2.C0286c;
import c2.m;
import c2.r;
import c2.t;
import c2.v;
import d2.C0385c;
import d2.s;
import java.util.Collections;
import java.util.Set;
import m2.HandlerC1312d;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5387a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5388b;

    /* renamed from: c, reason: collision with root package name */
    public final l2.e f5389c;

    /* renamed from: d, reason: collision with root package name */
    public final b f5390d;

    /* renamed from: e, reason: collision with root package name */
    public final C0284a f5391e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5392f;

    /* renamed from: g, reason: collision with root package name */
    public final C0144j f5393g;

    /* renamed from: h, reason: collision with root package name */
    public final C0286c f5394h;

    public f(Context context, l2.e eVar, b bVar, e eVar2) {
        s.d(context, "Null context is not permitted.");
        s.d(eVar, "Api must not be null.");
        s.d(eVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        s.d(applicationContext, "The provided context did not have an application context.");
        this.f5387a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f5388b = attributionTag;
        this.f5389c = eVar;
        this.f5390d = bVar;
        this.f5391e = new C0284a(eVar, bVar, attributionTag);
        C0286c e4 = C0286c.e(applicationContext);
        this.f5394h = e4;
        this.f5392f = e4.f5669h.getAndIncrement();
        this.f5393g = eVar2.f5386a;
        HandlerC1312d handlerC1312d = e4.f5674m;
        handlerC1312d.sendMessage(handlerC1312d.obtainMessage(7, this));
    }

    public final B1.j a() {
        B1.j jVar = new B1.j(15, false);
        Set set = Collections.EMPTY_SET;
        if (((p.f) jVar.f201b) == null) {
            jVar.f201b = new p.f(0);
        }
        ((p.f) jVar.f201b).addAll(set);
        Context context = this.f5387a;
        jVar.f203d = context.getClass().getName();
        jVar.f202c = context.getPackageName();
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t2.j b(int i4, c2.i iVar) {
        r rVar;
        t2.d dVar = new t2.d();
        t2.j jVar = dVar.f15407a;
        C0144j c0144j = this.f5393g;
        C0286c c0286c = this.f5394h;
        HandlerC1312d handlerC1312d = c0286c.f5674m;
        int i5 = iVar.f5677c;
        if (i5 != 0) {
            C0284a c0284a = this.f5391e;
            if (c0286c.a()) {
                d2.i iVar2 = (d2.i) d2.h.b().f8268a;
                boolean z = true;
                if (iVar2 != null) {
                    if (iVar2.f8270b) {
                        boolean z4 = iVar2.f8271c;
                        m mVar = (m) c0286c.f5671j.get(c0284a);
                        if (mVar != null) {
                            c cVar = mVar.f5683b;
                            if (cVar instanceof com.google.android.gms.common.internal.a) {
                                com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) cVar;
                                if (aVar.f5796u != null && !aVar.c()) {
                                    C0385c e4 = r.e(mVar, aVar, i5);
                                    if (e4 != null) {
                                        mVar.f5693l++;
                                        z = e4.f8236c;
                                    }
                                }
                            }
                        }
                        z = z4;
                    }
                }
                rVar = new r(c0286c, i5, c0284a, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
                if (rVar != null) {
                    handlerC1312d.getClass();
                    A.c cVar2 = new A.c(handlerC1312d, 2);
                    jVar.getClass();
                    jVar.f15419b.b(new t2.f(cVar2, rVar));
                    jVar.g();
                }
            }
            rVar = null;
            if (rVar != null) {
            }
        }
        handlerC1312d.sendMessage(handlerC1312d.obtainMessage(4, new t(new v(i4, iVar, dVar, c0144j), c0286c.f5670i.get(), this)));
        return jVar;
    }
}
