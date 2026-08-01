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
    public final /* synthetic */ int f1434a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1435b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1436c;

    public /* synthetic */ C0064e(Object obj, int i, Object obj2) {
        this.f1434a = i;
        this.f1435b = obj;
        this.f1436c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0075p
    public final void g(r rVar, EnumC0071l enumC0071l) {
        switch (this.f1434a) {
            case 0:
                int i = AbstractC0063d.f1433a[enumC0071l.ordinal()];
                T.k kVar = (T.k) this.f1435b;
                if (i == 3) {
                    kVar.f797b.getClass();
                    (Build.VERSION.SDK_INT >= 28 ? T.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new T.n(), 500L);
                    kVar.f796a.f(kVar);
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0075p interfaceC0075p = (InterfaceC0075p) this.f1436c;
                if (interfaceC0075p != null) {
                    interfaceC0075p.g(rVar, enumC0071l);
                    return;
                }
                return;
            case 1:
                if (enumC0071l == EnumC0071l.ON_START) {
                    ((t) this.f1435b).f(this);
                    ((h0.d) this.f1436c).f();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0060a) this.f1436c).f1426a;
                List list = (List) hashMap.get(enumC0071l);
                q qVar = (q) this.f1435b;
                C0060a.a(list, rVar, enumC0071l, qVar);
                C0060a.a((List) hashMap.get(EnumC0071l.ON_ANY), rVar, enumC0071l, qVar);
                return;
        }
    }

    public C0064e(q qVar) {
        this.f1434a = 2;
        this.f1435b = qVar;
        C0062c c0062c = C0062c.f1430c;
        Class<?> cls = qVar.getClass();
        C0060a c0060a = (C0060a) c0062c.f1431a.get(cls);
        this.f1436c = c0060a == null ? c0062c.a(cls, null) : c0060a;
    }
}
