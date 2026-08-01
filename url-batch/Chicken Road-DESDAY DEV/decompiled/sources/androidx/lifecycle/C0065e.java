package androidx.lifecycle;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065e implements InterfaceC0076p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1417a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1418b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1419c;

    public /* synthetic */ C0065e(Object obj, int i, Object obj2) {
        this.f1417a = i;
        this.f1418b = obj;
        this.f1419c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0076p
    public final void g(r rVar, EnumC0072l enumC0072l) {
        switch (this.f1417a) {
            case 0:
                int i = AbstractC0064d.f1416a[enumC0072l.ordinal()];
                T.k kVar = (T.k) this.f1418b;
                if (i == 3) {
                    kVar.f782b.getClass();
                    (Build.VERSION.SDK_INT >= 28 ? T.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new T.n(), 500L);
                    kVar.f781a.f(kVar);
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0076p interfaceC0076p = (InterfaceC0076p) this.f1419c;
                if (interfaceC0076p != null) {
                    interfaceC0076p.g(rVar, enumC0072l);
                    return;
                }
                return;
            case 1:
                if (enumC0072l == EnumC0072l.ON_START) {
                    ((t) this.f1418b).f(this);
                    ((h0.d) this.f1419c).f();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0061a) this.f1419c).f1409a;
                List list = (List) hashMap.get(enumC0072l);
                q qVar = (q) this.f1418b;
                C0061a.a(list, rVar, enumC0072l, qVar);
                C0061a.a((List) hashMap.get(EnumC0072l.ON_ANY), rVar, enumC0072l, qVar);
                return;
        }
    }

    public C0065e(q qVar) {
        this.f1417a = 2;
        this.f1418b = qVar;
        C0063c c0063c = C0063c.f1413c;
        Class<?> cls = qVar.getClass();
        C0061a c0061a = (C0061a) c0063c.f1414a.get(cls);
        this.f1419c = c0061a == null ? c0063c.a(cls, null) : c0061a;
    }
}
