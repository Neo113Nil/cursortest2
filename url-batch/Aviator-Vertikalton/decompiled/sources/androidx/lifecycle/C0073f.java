package androidx.lifecycle;

import T.AbstractC0037b;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073f implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1484a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1485b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1486c;

    public /* synthetic */ C0073f(Object obj, int i, Object obj2) {
        this.f1484a = i;
        this.f1485b = obj;
        this.f1486c = obj2;
    }

    @Override // androidx.lifecycle.r
    public final void g(InterfaceC0086t interfaceC0086t, EnumC0080m enumC0080m) {
        switch (this.f1484a) {
            case 0:
                int i = AbstractC0072e.f1483a[enumC0080m.ordinal()];
                T.k kVar = (T.k) this.f1485b;
                if (i == 3) {
                    kVar.f797b.getClass();
                    (Build.VERSION.SDK_INT >= 28 ? AbstractC0037b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new T.n(), 500L);
                    kVar.f796a.b(kVar);
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                r rVar = (r) this.f1486c;
                if (rVar != null) {
                    rVar.g(interfaceC0086t, enumC0080m);
                    return;
                }
                return;
            case 1:
                if (enumC0080m == EnumC0080m.ON_START) {
                    ((AbstractC0082o) this.f1485b).b(this);
                    ((g0.d) this.f1486c).d();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0069b) this.f1486c).f1476a;
                List list = (List) hashMap.get(enumC0080m);
                InterfaceC0085s interfaceC0085s = (InterfaceC0085s) this.f1485b;
                C0069b.a(list, interfaceC0086t, enumC0080m, interfaceC0085s);
                C0069b.a((List) hashMap.get(EnumC0080m.ON_ANY), interfaceC0086t, enumC0080m, interfaceC0085s);
                return;
        }
    }

    public C0073f(InterfaceC0085s interfaceC0085s) {
        this.f1484a = 2;
        this.f1485b = interfaceC0085s;
        C0071d c0071d = C0071d.f1480c;
        Class<?> cls = interfaceC0085s.getClass();
        C0069b c0069b = (C0069b) c0071d.f1481a.get(cls);
        this.f1486c = c0069b == null ? c0071d.a(cls, null) : c0069b;
    }
}
