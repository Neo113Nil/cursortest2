package androidx.lifecycle;

import V.AbstractC0036b;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1930a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1931b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1932c;

    public /* synthetic */ C0070e(Object obj, int i, Object obj2) {
        this.f1930a = i;
        this.f1931b = obj;
        this.f1932c = obj2;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, EnumC0077l enumC0077l) {
        switch (this.f1930a) {
            case 0:
                int i = AbstractC0069d.f1929a[enumC0077l.ordinal()];
                V.k kVar = (V.k) this.f1931b;
                if (i == 3) {
                    kVar.f1283b.getClass();
                    (Build.VERSION.SDK_INT >= 28 ? AbstractC0036b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new V.n(), 500L);
                    kVar.f1282a.f(kVar);
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                r rVar = (r) this.f1932c;
                if (rVar != null) {
                    rVar.a(tVar, enumC0077l);
                    return;
                }
                return;
            case 1:
                if (enumC0077l == EnumC0077l.ON_START) {
                    ((v) this.f1931b).f(this);
                    ((j0.d) this.f1932c).f();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0066a) this.f1932c).f1922a;
                List list = (List) hashMap.get(enumC0077l);
                InterfaceC0083s interfaceC0083s = (InterfaceC0083s) this.f1931b;
                C0066a.a(list, tVar, enumC0077l, interfaceC0083s);
                C0066a.a((List) hashMap.get(EnumC0077l.ON_ANY), tVar, enumC0077l, interfaceC0083s);
                return;
        }
    }

    public C0070e(InterfaceC0083s interfaceC0083s) {
        this.f1930a = 2;
        this.f1931b = interfaceC0083s;
        C0068c c0068c = C0068c.f1926c;
        Class<?> cls = interfaceC0083s.getClass();
        C0066a c0066a = (C0066a) c0068c.f1927a.get(cls);
        this.f1932c = c0066a == null ? c0068c.a(cls, null) : c0066a;
    }
}
