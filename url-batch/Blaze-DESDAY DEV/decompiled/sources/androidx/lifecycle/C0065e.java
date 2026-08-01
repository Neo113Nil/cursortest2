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
    public final /* synthetic */ int f1507a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1508b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1509c;

    public /* synthetic */ C0065e(Object obj, int i, Object obj2) {
        this.f1507a = i;
        this.f1508b = obj;
        this.f1509c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0076p
    public final void g(r rVar, EnumC0072l enumC0072l) {
        switch (this.f1507a) {
            case 0:
                int i = AbstractC0064d.f1506a[enumC0072l.ordinal()];
                U.k kVar = (U.k) this.f1508b;
                if (i == 3) {
                    kVar.f864b.getClass();
                    (Build.VERSION.SDK_INT >= 28 ? U.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new U.n(), 500L);
                    kVar.f863a.f(kVar);
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0076p interfaceC0076p = (InterfaceC0076p) this.f1509c;
                if (interfaceC0076p != null) {
                    interfaceC0076p.g(rVar, enumC0072l);
                    return;
                }
                return;
            case 1:
                if (enumC0072l == EnumC0072l.ON_START) {
                    ((t) this.f1508b).f(this);
                    ((i0.d) this.f1509c).f();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0061a) this.f1509c).f1499a;
                List list = (List) hashMap.get(enumC0072l);
                q qVar = (q) this.f1508b;
                C0061a.a(list, rVar, enumC0072l, qVar);
                C0061a.a((List) hashMap.get(EnumC0072l.ON_ANY), rVar, enumC0072l, qVar);
                return;
        }
    }

    public C0065e(q qVar) {
        this.f1507a = 2;
        this.f1508b = qVar;
        C0063c c0063c = C0063c.f1503c;
        Class<?> cls = qVar.getClass();
        C0061a c0061a = (C0061a) c0063c.f1504a.get(cls);
        this.f1509c = c0061a == null ? c0063c.a(cls, null) : c0061a;
    }
}
