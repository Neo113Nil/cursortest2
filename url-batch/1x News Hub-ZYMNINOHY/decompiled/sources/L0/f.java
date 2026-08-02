package L0;

import E1.B;
import M0.m;
import M0.s;
import M0.u;
import M0.w;
import N0.C0064c;
import N0.r;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Set;
import p.C1170f;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f879a;

    /* renamed from: b, reason: collision with root package name */
    public final String f880b;

    /* renamed from: c, reason: collision with root package name */
    public final V0.e f881c;

    /* renamed from: d, reason: collision with root package name */
    public final b f882d;

    /* renamed from: e, reason: collision with root package name */
    public final M0.a f883e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final K0.j f884g;

    /* renamed from: h, reason: collision with root package name */
    public final M0.c f885h;

    public f(Context context, V0.e eVar, b bVar, e eVar2) {
        r.d(context, "Null context is not permitted.");
        r.d(eVar, "Api must not be null.");
        r.d(eVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        r.d(applicationContext, "The provided context did not have an application context.");
        this.f879a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f880b = attributionTag;
        this.f881c = eVar;
        this.f882d = bVar;
        this.f883e = new M0.a(eVar, bVar, attributionTag);
        M0.c e3 = M0.c.e(applicationContext);
        this.f885h = e3;
        this.f = e3.f918h.getAndIncrement();
        this.f884g = eVar2.f878a;
        W0.e eVar3 = e3.f923m;
        eVar3.sendMessage(eVar3.obtainMessage(7, this));
    }

    public final A0.f a() {
        A0.f fVar = new A0.f(3, false);
        Set set = Collections.EMPTY_SET;
        if (((C1170f) fVar.f23b) == null) {
            fVar.f23b = new C1170f(0);
        }
        ((C1170f) fVar.f23b).addAll(set);
        Context context = this.f879a;
        fVar.f25d = context.getClass().getName();
        fVar.f24c = context.getPackageName();
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d1.k b(int i3, B b3) {
        s sVar;
        d1.e eVar = new d1.e();
        M0.c cVar = this.f885h;
        cVar.getClass();
        int i4 = b3.f311b;
        W0.e eVar2 = cVar.f923m;
        d1.k kVar = eVar.f4931a;
        if (i4 != 0) {
            if (cVar.a()) {
                N0.h hVar = (N0.h) N0.g.b().f1026a;
                M0.a aVar = this.f883e;
                boolean z = true;
                if (hVar != null) {
                    if (hVar.f1028b) {
                        m mVar = (m) cVar.f920j.get(aVar);
                        if (mVar != null) {
                            c cVar2 = mVar.f931c;
                            if (cVar2 instanceof com.google.android.gms.common.internal.a) {
                                com.google.android.gms.common.internal.a aVar2 = (com.google.android.gms.common.internal.a) cVar2;
                                if (aVar2.f2700u != null && !aVar2.h()) {
                                    C0064c a3 = s.a(mVar, aVar2, i4);
                                    if (a3 != null) {
                                        mVar.f940m++;
                                        z = a3.f999c;
                                    }
                                }
                            }
                        }
                        z = hVar.f1029c;
                    }
                }
                sVar = new s(cVar, i4, aVar, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
                if (sVar != null) {
                    eVar2.getClass();
                    M0.j jVar = new M0.j(0, eVar2);
                    kVar.getClass();
                    kVar.f4943b.d(new d1.g(jVar, sVar));
                    kVar.g();
                }
            }
            sVar = null;
            if (sVar != null) {
            }
        }
        eVar2.sendMessage(eVar2.obtainMessage(4, new u(new w(i3, b3, eVar, this.f884g), cVar.f919i.get(), this)));
        return kVar;
    }
}
