package androidx.lifecycle;

import T.AbstractC0030b;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1499a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1500b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1501c;

    public /* synthetic */ C0064e(Object obj, int i, Object obj2) {
        this.f1499a = i;
        this.f1500b = obj;
        this.f1501c = obj2;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, EnumC0071l enumC0071l) {
        switch (this.f1499a) {
            case 0:
                int i = AbstractC0063d.f1498a[enumC0071l.ordinal()];
                T.l lVar = (T.l) this.f1500b;
                if (i == 3) {
                    lVar.f824b.getClass();
                    (Build.VERSION.SDK_INT >= 28 ? AbstractC0030b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new T.o(), 500L);
                    lVar.f823a.f(lVar);
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                r rVar = (r) this.f1501c;
                if (rVar != null) {
                    rVar.a(tVar, enumC0071l);
                    return;
                }
                return;
            case 1:
                if (enumC0071l == EnumC0071l.ON_START) {
                    ((v) this.f1500b).f(this);
                    ((h0.d) this.f1501c).f();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0060a) this.f1501c).f1491a;
                List list = (List) hashMap.get(enumC0071l);
                InterfaceC0077s interfaceC0077s = (InterfaceC0077s) this.f1500b;
                C0060a.a(list, tVar, enumC0071l, interfaceC0077s);
                C0060a.a((List) hashMap.get(EnumC0071l.ON_ANY), tVar, enumC0071l, interfaceC0077s);
                return;
        }
    }

    public C0064e(InterfaceC0077s interfaceC0077s) {
        this.f1499a = 2;
        this.f1500b = interfaceC0077s;
        C0062c c0062c = C0062c.f1495c;
        Class<?> cls = interfaceC0077s.getClass();
        C0060a c0060a = (C0060a) c0062c.f1496a.get(cls);
        this.f1501c = c0060a == null ? c0062c.a(cls, null) : c0060a;
    }
}
