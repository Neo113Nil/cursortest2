package r1;

import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import h4.w;
import i.C0511M;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import s1.C0860B;
import s1.C0863E;
import s1.C0865G;
import s1.C0870a;
import s1.C0873d;
import s1.v;
import t1.C0917d;
import t1.C0921h;
import t1.C0922i;
import t1.u;
import u.C0935f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7449a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7450b;

    /* renamed from: c, reason: collision with root package name */
    public final C0511M f7451c;

    /* renamed from: d, reason: collision with root package name */
    public final e f7452d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0843b f7453e;

    /* renamed from: f, reason: collision with root package name */
    public final C0870a f7454f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7455g;

    /* renamed from: h, reason: collision with root package name */
    public final r4.b f7456h;

    /* renamed from: i, reason: collision with root package name */
    public final C0873d f7457i;

    public j(Context context, e eVar, InterfaceC0843b interfaceC0843b, i iVar) {
        AttributionSource attributionSource;
        u.g(context, "Null context is not permitted.");
        u.g(eVar, "Api must not be null.");
        u.g(iVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        u.g(applicationContext, "The provided context did not have an application context.");
        this.f7449a = applicationContext;
        int i2 = Build.VERSION.SDK_INT;
        C0511M c0511m = null;
        String b7 = (i2 < 30 || i2 < 30) ? null : C.c.b(context);
        this.f7450b = b7;
        if (i2 >= 31) {
            attributionSource = context.getAttributionSource();
            c0511m = new C0511M(25, attributionSource);
        }
        this.f7451c = c0511m;
        this.f7452d = eVar;
        this.f7453e = interfaceC0843b;
        this.f7454f = new C0870a(eVar, interfaceC0843b, b7);
        C0873d c7 = C0873d.c(applicationContext);
        this.f7457i = c7;
        this.f7455g = c7.f7654h.getAndIncrement();
        this.f7456h = iVar.f7448a;
        C1.e eVar2 = c7.f7658m;
        eVar2.sendMessage(eVar2.obtainMessage(7, this));
    }

    public final D0.j a() {
        D0.j jVar = new D0.j(28, false);
        Set set = Collections.EMPTY_SET;
        if (((C0935f) jVar.f330e) == null) {
            jVar.f330e = new C0935f(0);
        }
        ((C0935f) jVar.f330e).addAll(set);
        Context context = this.f7449a;
        jVar.f332l = context.getClass().getName();
        jVar.f331i = context.getPackageName();
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final K1.p b(int i2, w wVar) {
        C0860B c0860b;
        K1.h hVar = new K1.h();
        K1.p pVar = hVar.f1428a;
        r4.b bVar = this.f7456h;
        C0873d c0873d = this.f7457i;
        C1.e eVar = c0873d.f7658m;
        int i5 = wVar.f5279b;
        if (i5 != 0) {
            C0870a c0870a = this.f7454f;
            if (c0873d.d()) {
                C0922i c0922i = (C0922i) C0921h.a().f7958a;
                boolean z7 = true;
                if (c0922i != null) {
                    if (c0922i.f7960e) {
                        boolean z8 = c0922i.f7961i;
                        v vVar = (v) c0873d.j.get(c0870a);
                        if (vVar != null) {
                            InterfaceC0844c interfaceC0844c = vVar.f7736f;
                            if (interfaceC0844c instanceof com.google.android.gms.common.internal.a) {
                                com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) interfaceC0844c;
                                if (aVar.f4374A != null && !aVar.n()) {
                                    C0917d a7 = C0860B.a(vVar, aVar, i5);
                                    if (a7 != null) {
                                        vVar.f7745p++;
                                        z7 = a7.f7927i;
                                    }
                                }
                            }
                        }
                        z7 = z8;
                    }
                }
                c0860b = new C0860B(c0873d, i5, c0870a, z7 ? System.currentTimeMillis() : 0L, z7 ? SystemClock.elapsedRealtime() : 0L);
                if (c0860b != null) {
                    Objects.requireNonNull(eVar);
                    pVar.b(new E.e(eVar, 2), c0860b);
                }
            }
            c0860b = null;
            if (c0860b != null) {
            }
        }
        eVar.sendMessage(eVar.obtainMessage(4, new C0863E(new C0865G(i2, wVar, hVar, bVar), c0873d.f7655i.get(), this)));
        return pVar;
    }
}
