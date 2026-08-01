package androidx.lifecycle;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0071e implements InterfaceC0082p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1568a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1569b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1570c;

    public /* synthetic */ C0071e(Object obj, int i, Object obj2) {
        this.f1568a = i;
        this.f1569b = obj;
        this.f1570c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0082p
    public final void g(r rVar, EnumC0078l enumC0078l) {
        switch (this.f1568a) {
            case 0:
                int i = AbstractC0070d.f1567a[enumC0078l.ordinal()];
                V.k kVar = (V.k) this.f1569b;
                if (i == 3) {
                    kVar.f906b.getClass();
                    (Build.VERSION.SDK_INT >= 28 ? V.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new V.n(), 500L);
                    kVar.f905a.f(kVar);
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0082p interfaceC0082p = (InterfaceC0082p) this.f1570c;
                if (interfaceC0082p != null) {
                    interfaceC0082p.g(rVar, enumC0078l);
                    return;
                }
                return;
            case 1:
                if (enumC0078l == EnumC0078l.ON_START) {
                    ((t) this.f1569b).f(this);
                    ((j0.d) this.f1570c).f();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0067a) this.f1570c).f1560a;
                List list = (List) hashMap.get(enumC0078l);
                q qVar = (q) this.f1569b;
                C0067a.a(list, rVar, enumC0078l, qVar);
                C0067a.a((List) hashMap.get(EnumC0078l.ON_ANY), rVar, enumC0078l, qVar);
                return;
        }
    }

    public C0071e(q qVar) {
        this.f1568a = 2;
        this.f1569b = qVar;
        C0069c c0069c = C0069c.f1564c;
        Class<?> cls = qVar.getClass();
        C0067a c0067a = (C0067a) c0069c.f1565a.get(cls);
        this.f1570c = c0067a == null ? c0069c.a(cls, null) : c0067a;
    }
}
