package I;

import B0.C0023a;
import Y0.C0118l;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import n.C0268a;
import w0.C0315a;
import w0.InterfaceC0316b;
import w0.InterfaceC0317c;
import w0.InterfaceC0320f;

/* renamed from: I.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079n implements i0.c {

    /* renamed from: e, reason: collision with root package name */
    public Object f689e;

    /* renamed from: f, reason: collision with root package name */
    public Object f690f;

    /* renamed from: g, reason: collision with root package name */
    public Object f691g;

    /* renamed from: h, reason: collision with root package name */
    public Object f692h;

    public /* synthetic */ C0079n(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f689e = obj;
        this.f690f = obj2;
        this.f691g = obj3;
        this.f692h = obj4;
    }

    public static boolean e(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public Object a(int i2, int i3) {
        return ((C0268a) this.f692h).f3256f[(i2 << 1) + i3];
    }

    public void b(int i2) {
        ((C0268a) this.f692h).g(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(J0.b bVar) {
        C0075j c0075j;
        int i2;
        C0079n c0079n;
        C0069d c0069d;
        if (bVar instanceof C0075j) {
            c0075j = (C0075j) bVar;
            int i3 = c0075j.f661k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0075j.f661k = i3 - Integer.MIN_VALUE;
                Object obj = c0075j.f659i;
                I0.a aVar = I0.a.f733e;
                i2 = c0075j.f661k;
                if (i2 != 0) {
                    i1.a.G(obj);
                    List list = (List) this.f691g;
                    P p2 = (P) this.f692h;
                    if (list == null || list.isEmpty()) {
                        c0075j.f658h = this;
                        c0075j.f661k = 1;
                        obj = P.f(p2, false, c0075j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c0079n = this;
                        c0069d = (C0069d) obj;
                    } else {
                        j0 g2 = p2.g();
                        C0078m c0078m = new C0078m(p2, this, null);
                        c0075j.f658h = this;
                        c0075j.f661k = 2;
                        obj = g2.b(c0078m, c0075j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c0079n = this;
                        c0069d = (C0069d) obj;
                    }
                } else if (i2 == 1) {
                    c0079n = c0075j.f658h;
                    i1.a.G(obj);
                    c0069d = (C0069d) obj;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0079n = c0075j.f658h;
                    i1.a.G(obj);
                    c0069d = (C0069d) obj;
                }
                ((P) c0079n.f692h).f576l.t(c0069d);
                return F0.h.f469a;
            }
        }
        c0075j = new C0075j(this, bVar);
        Object obj2 = c0075j.f659i;
        I0.a aVar2 = I0.a.f733e;
        i2 = c0075j.f661k;
        if (i2 != 0) {
        }
        ((P) c0079n.f692h).f576l.t(c0069d);
        return F0.h.f469a;
    }

    @Override // i0.c
    public void d(String str, HashMap hashMap) {
        this.f690f = "sqlite_error";
        this.f691g = str;
        this.f692h = hashMap;
    }

    public void f(String str, Object obj, v0.i iVar) {
        ((InterfaceC0320f) this.f689e).c((String) this.f690f, ((w0.m) this.f691g).e(new P.O(23, str, obj)), iVar == null ? null : new C0315a(1, this, iVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:25:0x0066, B:29:0x0078), top: B:24:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v6, types: [g1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(J0.b bVar) {
        e0 e0Var;
        int i2;
        g1.d dVar;
        C0079n c0079n;
        g1.a aVar;
        Throwable th;
        C0079n c0079n2;
        try {
            if (bVar instanceof e0) {
                e0Var = (e0) bVar;
                int i3 = e0Var.f633l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    e0Var.f633l = i3 - Integer.MIN_VALUE;
                    Object obj = e0Var.f631j;
                    I0.a aVar2 = I0.a.f733e;
                    i2 = e0Var.f633l;
                    F0.h hVar = F0.h.f469a;
                    if (i2 != 0) {
                        i1.a.G(obj);
                        if (!(((C0118l) this.f690f).E() instanceof Y0.L)) {
                            return hVar;
                        }
                        e0Var.f629h = this;
                        dVar = (g1.d) this.f689e;
                        e0Var.f630i = dVar;
                        e0Var.f633l = 1;
                        if (dVar.c(e0Var) == aVar2) {
                            return aVar2;
                        }
                        c0079n = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = e0Var.f630i;
                            c0079n2 = e0Var.f629h;
                            try {
                                i1.a.G(obj);
                                ((C0118l) c0079n2.f690f).K(hVar);
                                ((g1.d) aVar).e(null);
                                return hVar;
                            } catch (Throwable th2) {
                                th = th2;
                                ((g1.d) aVar).e(null);
                                throw th;
                            }
                        }
                        ?? r2 = e0Var.f630i;
                        c0079n = e0Var.f629h;
                        i1.a.G(obj);
                        dVar = r2;
                    }
                    if (((C0118l) c0079n.f690f).E() instanceof Y0.L) {
                        dVar.e(null);
                        return hVar;
                    }
                    e0Var.f629h = c0079n;
                    e0Var.f630i = dVar;
                    e0Var.f633l = 2;
                    if (c0079n.c(e0Var) == aVar2) {
                        return aVar2;
                    }
                    aVar = dVar;
                    c0079n2 = c0079n;
                    ((C0118l) c0079n2.f690f).K(hVar);
                    ((g1.d) aVar).e(null);
                    return hVar;
                }
            }
            if (((C0118l) c0079n.f690f).E() instanceof Y0.L) {
            }
        } catch (Throwable th3) {
            aVar = dVar;
            th = th3;
            ((g1.d) aVar).e(null);
            throw th;
        }
        e0Var = new e0(this, bVar);
        Object obj2 = e0Var.f631j;
        I0.a aVar22 = I0.a.f733e;
        i2 = e0Var.f633l;
        F0.h hVar2 = F0.h.f469a;
        if (i2 != 0) {
        }
    }

    public void h(Object obj, InterfaceC0317c interfaceC0317c) {
        ((InterfaceC0320f) this.f689e).c((String) this.f690f, ((w0.k) this.f691g).b(obj), interfaceC0317c == null ? null : new C0315a(0, this, interfaceC0317c));
    }

    public void i(InterfaceC0316b interfaceC0316b) {
        String str = (String) this.f690f;
        InterfaceC0320f interfaceC0320f = (InterfaceC0320f) this.f689e;
        C0023a c0023a = (C0023a) this.f692h;
        if (c0023a != null) {
            interfaceC0320f.a(str, interfaceC0316b != null ? new P.O(this, interfaceC0316b, 22, false) : null, c0023a);
        } else {
            interfaceC0320f.f(str, interfaceC0316b != null ? new P.O(this, interfaceC0316b, 22, false) : null);
        }
    }

    public void j(w0.l lVar) {
        String str = (String) this.f690f;
        InterfaceC0320f interfaceC0320f = (InterfaceC0320f) this.f689e;
        C0023a c0023a = (C0023a) this.f692h;
        if (c0023a != null) {
            interfaceC0320f.a(str, lVar != null ? new P.O(this, lVar, 24, false) : null, c0023a);
        } else {
            interfaceC0320f.f(str, lVar != null ? new P.O(this, lVar, 24, false) : null);
        }
    }

    public Object[] k(int i2, Object[] objArr) {
        int i3 = ((C0268a) this.f692h).f3257g;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = a(i4, i2);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // i0.c
    public void l(Serializable serializable) {
        this.f689e = serializable;
    }

    public C0079n(C0268a c0268a) {
        this.f692h = c0268a;
    }

    public C0079n(InterfaceC0320f interfaceC0320f, String str) {
        this(interfaceC0320f, str, w0.p.f3564a, null);
    }
}
