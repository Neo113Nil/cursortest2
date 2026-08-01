package androidx.lifecycle;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064e implements InterfaceC0075p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1476a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1477b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1478c;

    public /* synthetic */ C0064e(Object obj, int i, Object obj2) {
        this.f1476a = i;
        this.f1477b = obj;
        this.f1478c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0075p
    public final void g(r rVar, EnumC0071l enumC0071l) {
        switch (this.f1476a) {
            case 0:
                int i = AbstractC0063d.f1475a[enumC0071l.ordinal()];
                U.k kVar = (U.k) this.f1477b;
                if (i == 3) {
                    kVar.f855b.getClass();
                    (Build.VERSION.SDK_INT >= 28 ? U.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new U.n(), 500L);
                    kVar.f854a.f(kVar);
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0075p interfaceC0075p = (InterfaceC0075p) this.f1478c;
                if (interfaceC0075p != null) {
                    interfaceC0075p.g(rVar, enumC0071l);
                    return;
                }
                return;
            case 1:
                if (enumC0071l == EnumC0071l.ON_START) {
                    ((t) this.f1477b).f(this);
                    ((i0.d) this.f1478c).f();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0060a) this.f1478c).f1468a;
                List list = (List) hashMap.get(enumC0071l);
                q qVar = (q) this.f1477b;
                C0060a.a(list, rVar, enumC0071l, qVar);
                C0060a.a((List) hashMap.get(EnumC0071l.ON_ANY), rVar, enumC0071l, qVar);
                return;
        }
    }

    public C0064e(q qVar) {
        this.f1476a = 2;
        this.f1477b = qVar;
        C0062c c0062c = C0062c.f1472c;
        Class<?> cls = qVar.getClass();
        C0060a c0060a = (C0060a) c0062c.f1473a.get(cls);
        this.f1478c = c0060a == null ? c0062c.a(cls, null) : c0060a;
    }
}
