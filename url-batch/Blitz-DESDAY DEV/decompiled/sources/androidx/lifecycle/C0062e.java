package androidx.lifecycle;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062e implements InterfaceC0073p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1564a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1565b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1566c;

    public /* synthetic */ C0062e(Object obj, int i, Object obj2) {
        this.f1564a = i;
        this.f1565b = obj;
        this.f1566c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0073p
    public final void g(r rVar, EnumC0069l enumC0069l) {
        switch (this.f1564a) {
            case 0:
                int i = AbstractC0061d.f1563a[enumC0069l.ordinal()];
                V.k kVar = (V.k) this.f1565b;
                if (i == 3) {
                    kVar.f895b.getClass();
                    (Build.VERSION.SDK_INT >= 28 ? V.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new V.m(), 500L);
                    kVar.f894a.f(kVar);
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0073p interfaceC0073p = (InterfaceC0073p) this.f1566c;
                if (interfaceC0073p != null) {
                    interfaceC0073p.g(rVar, enumC0069l);
                    return;
                }
                return;
            case 1:
                if (enumC0069l == EnumC0069l.ON_START) {
                    ((t) this.f1565b).f(this);
                    ((j0.d) this.f1566c).f();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0058a) this.f1566c).f1556a;
                List list = (List) hashMap.get(enumC0069l);
                q qVar = (q) this.f1565b;
                C0058a.a(list, rVar, enumC0069l, qVar);
                C0058a.a((List) hashMap.get(EnumC0069l.ON_ANY), rVar, enumC0069l, qVar);
                return;
        }
    }

    public C0062e(q qVar) {
        this.f1564a = 2;
        this.f1565b = qVar;
        C0060c c0060c = C0060c.f1560c;
        Class<?> cls = qVar.getClass();
        C0058a c0058a = (C0058a) c0060c.f1561a.get(cls);
        this.f1566c = c0058a == null ? c0060c.a(cls, null) : c0058a;
    }
}
