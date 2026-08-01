package androidx.lifecycle;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import h0.C0133d;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062e implements InterfaceC0073p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1359a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1360b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1361c;

    public /* synthetic */ C0062e(Object obj, int i, Object obj2) {
        this.f1359a = i;
        this.f1360b = obj;
        this.f1361c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0073p
    public final void e(r rVar, EnumC0069l enumC0069l) {
        switch (this.f1359a) {
            case 0:
                int i = AbstractC0061d.f1358a[enumC0069l.ordinal()];
                T.k kVar = (T.k) this.f1360b;
                if (i == 3) {
                    kVar.f733b.getClass();
                    (Build.VERSION.SDK_INT >= 28 ? T.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new T.n(), 500L);
                    kVar.f732a.f(kVar);
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0073p interfaceC0073p = (InterfaceC0073p) this.f1361c;
                if (interfaceC0073p != null) {
                    interfaceC0073p.e(rVar, enumC0069l);
                    return;
                }
                return;
            case 1:
                if (enumC0069l == EnumC0069l.ON_START) {
                    ((t) this.f1360b).f(this);
                    ((C0133d) this.f1361c).f();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0058a) this.f1361c).f1351a;
                List list = (List) hashMap.get(enumC0069l);
                q qVar = (q) this.f1360b;
                C0058a.a(list, rVar, enumC0069l, qVar);
                C0058a.a((List) hashMap.get(EnumC0069l.ON_ANY), rVar, enumC0069l, qVar);
                return;
        }
    }

    public C0062e(q qVar) {
        this.f1359a = 2;
        this.f1360b = qVar;
        C0060c c0060c = C0060c.f1355c;
        Class<?> cls = qVar.getClass();
        C0058a c0058a = (C0058a) c0060c.f1356a.get(cls);
        this.f1361c = c0058a == null ? c0060c.a(cls, null) : c0058a;
    }
}
