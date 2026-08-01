package androidx.lifecycle;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import h0.C0132d;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061e implements InterfaceC0072p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1357a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1358b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1359c;

    public /* synthetic */ C0061e(Object obj, int i, Object obj2) {
        this.f1357a = i;
        this.f1358b = obj;
        this.f1359c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0072p
    public final void e(r rVar, EnumC0068l enumC0068l) {
        switch (this.f1357a) {
            case 0:
                int i = AbstractC0060d.f1356a[enumC0068l.ordinal()];
                T.k kVar = (T.k) this.f1358b;
                if (i == 3) {
                    kVar.f732b.getClass();
                    (Build.VERSION.SDK_INT >= 28 ? T.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new T.m(), 500L);
                    kVar.f731a.f(kVar);
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0072p interfaceC0072p = (InterfaceC0072p) this.f1359c;
                if (interfaceC0072p != null) {
                    interfaceC0072p.e(rVar, enumC0068l);
                    return;
                }
                return;
            case 1:
                if (enumC0068l == EnumC0068l.ON_START) {
                    ((t) this.f1358b).f(this);
                    ((C0132d) this.f1359c).f();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0057a) this.f1359c).f1349a;
                List list = (List) hashMap.get(enumC0068l);
                q qVar = (q) this.f1358b;
                C0057a.a(list, rVar, enumC0068l, qVar);
                C0057a.a((List) hashMap.get(EnumC0068l.ON_ANY), rVar, enumC0068l, qVar);
                return;
        }
    }

    public C0061e(q qVar) {
        this.f1357a = 2;
        this.f1358b = qVar;
        C0059c c0059c = C0059c.f1353c;
        Class<?> cls = qVar.getClass();
        C0057a c0057a = (C0057a) c0059c.f1354a.get(cls);
        this.f1359c = c0057a == null ? c0059c.a(cls, null) : c0057a;
    }
}
