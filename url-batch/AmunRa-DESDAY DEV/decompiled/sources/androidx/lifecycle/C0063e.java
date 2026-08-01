package androidx.lifecycle;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063e implements InterfaceC0074p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1392a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1393b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1394c;

    public /* synthetic */ C0063e(Object obj, int i, Object obj2) {
        this.f1392a = i;
        this.f1393b = obj;
        this.f1394c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0074p
    public final void f(r rVar, EnumC0070l enumC0070l) {
        switch (this.f1392a) {
            case 0:
                int i = AbstractC0062d.f1391a[enumC0070l.ordinal()];
                T.k kVar = (T.k) this.f1393b;
                if (i == 3) {
                    kVar.f772b.getClass();
                    (Build.VERSION.SDK_INT >= 28 ? T.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new T.n(), 500L);
                    kVar.f771a.f(kVar);
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0074p interfaceC0074p = (InterfaceC0074p) this.f1394c;
                if (interfaceC0074p != null) {
                    interfaceC0074p.f(rVar, enumC0070l);
                    return;
                }
                return;
            case 1:
                if (enumC0070l == EnumC0070l.ON_START) {
                    ((t) this.f1393b).f(this);
                    ((h0.d) this.f1394c).f();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0059a) this.f1394c).f1384a;
                List list = (List) hashMap.get(enumC0070l);
                q qVar = (q) this.f1393b;
                C0059a.a(list, rVar, enumC0070l, qVar);
                C0059a.a((List) hashMap.get(EnumC0070l.ON_ANY), rVar, enumC0070l, qVar);
                return;
        }
    }

    public C0063e(q qVar) {
        this.f1392a = 2;
        this.f1393b = qVar;
        C0061c c0061c = C0061c.f1388c;
        Class<?> cls = qVar.getClass();
        C0059a c0059a = (C0059a) c0061c.f1389a.get(cls);
        this.f1394c = c0059a == null ? c0061c.a(cls, null) : c0059a;
    }
}
