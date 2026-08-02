package K;

import a.AbstractC0129a;
import b0.C0178i;
import b2.C0190d;
import b2.C0192f;
import b2.C0193g;
import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import f2.AbstractC0326c;
import java.util.List;
import t2.AbstractC1212w;
import t2.C1202l;
import t2.C1204n;
import t2.C1209t;
import t2.C1215z;
import t2.InterfaceC1201k;
import t2.InterfaceC1210u;

/* loaded from: classes.dex */
public final class N implements InterfaceC0044h {

    /* renamed from: a, reason: collision with root package name */
    public final T f695a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.j f696b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1210u f697c;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public C1215z f700g;

    /* renamed from: i, reason: collision with root package name */
    public final B0.p f702i;

    /* renamed from: j, reason: collision with root package name */
    public final C0193g f703j;

    /* renamed from: k, reason: collision with root package name */
    public final C0193g f704k;

    /* renamed from: l, reason: collision with root package name */
    public final B0.p f705l;

    /* renamed from: d, reason: collision with root package name */
    public final b0.r f698d = new b0.r((l2.p) new C0055t(this, null));

    /* renamed from: e, reason: collision with root package name */
    public final B2.d f699e = new B2.d();

    /* renamed from: h, reason: collision with root package name */
    public final C0178i f701h = new C0178i(8);

    public N(T t3, List list, K0.j jVar, InterfaceC1210u interfaceC1210u) {
        this.f695a = t3;
        this.f696b = jVar;
        this.f697c = interfaceC1210u;
        B0.p pVar = new B0.p();
        pVar.f165d = this;
        pVar.f162a = new B2.d();
        C1202l c1202l = new C1202l(true);
        c1202l.G(null);
        pVar.f163b = c1202l;
        pVar.f164c = c2.e.Y(list);
        this.f702i = pVar;
        this.f703j = new C0193g(new C0049m(this, 1));
        this.f704k = new C0193g(new C0049m(this, 0));
        B2.g gVar = new B2.g(1, this);
        K k3 = new K(this, null);
        B0.p pVar2 = new B0.p();
        pVar2.f162a = interfaceC1210u;
        pVar2.f163b = k3;
        pVar2.f164c = v2.j.a(Integer.MAX_VALUE, null, 6);
        pVar2.f165d = new C0178i(7);
        t2.U u3 = (t2.U) interfaceC1210u.e().h(C1209t.f10441b);
        if (u3 != null) {
            ((t2.e0) u3).H(false, true, new t2.P(new B2.b(gVar, 2, pVar2)));
        }
        this.f705l = pVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x004b, B:14:0x0053, B:16:0x0057, B:17:0x005a), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(N n3, AbstractC0326c abstractC0326c) {
        C0056u c0056u;
        int i3;
        B2.d dVar;
        int i4;
        n3.getClass();
        try {
            if (abstractC0326c instanceof C0056u) {
                c0056u = (C0056u) abstractC0326c;
                int i5 = c0056u.f818h;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c0056u.f818h = i5 - Integer.MIN_VALUE;
                    Object obj = c0056u.f;
                    EnumC0317a enumC0317a = EnumC0317a.f4969a;
                    i3 = c0056u.f818h;
                    if (i3 != 0) {
                        android.support.v4.media.session.a.T(obj);
                        c0056u.f815d = n3;
                        dVar = n3.f699e;
                        c0056u.f816e = dVar;
                        c0056u.f818h = 1;
                        if (dVar.c(c0056u) == enumC0317a) {
                            return enumC0317a;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        B2.d dVar2 = c0056u.f816e;
                        N n4 = c0056u.f815d;
                        android.support.v4.media.session.a.T(obj);
                        dVar = dVar2;
                        n3 = n4;
                    }
                    i4 = n3.f - 1;
                    n3.f = i4;
                    if (i4 == 0) {
                        C1215z c1215z = n3.f700g;
                        if (c1215z != null) {
                            c1215z.b(null);
                        }
                        n3.f700g = null;
                    }
                    dVar.e(null);
                    return C0195i.f2555a;
                }
            }
            i4 = n3.f - 1;
            n3.f = i4;
            if (i4 == 0) {
            }
            dVar.e(null);
            return C0195i.f2555a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0056u = new C0056u(n3, abstractC0326c);
        Object obj2 = c0056u.f;
        EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
        i3 = c0056u.f818h;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|(7:55|(1:(1:(1:59)(2:61|62))(3:63|64|65))(1:66)|60|17|(1:19)(1:23)|20|21)(5:8|9|10|(3:12|13|14)(3:30|(1:32)(1:53)|(2:34|(2:36|(1:38))(2:45|46))(2:47|(2:49|50)(2:51|52)))|24)|39|40|41))|68|6|(0)(0)|39|40|41|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /* JADX WARN: Type inference failed for: r2v3, types: [f2.i, l2.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [f2.i, l2.p] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(N n3, a0 a0Var, AbstractC0326c abstractC0326c) {
        C0058w c0058w;
        int i3;
        InterfaceC1201k interfaceC1201k;
        C1202l c1202l;
        N n4;
        Object b3;
        InterfaceC1201k interfaceC1201k2;
        Throwable a3;
        n3.getClass();
        if (abstractC0326c instanceof C0058w) {
            c0058w = (C0058w) abstractC0326c;
            int i4 = c0058w.f824i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0058w.f824i = i4 - Integer.MIN_VALUE;
                Object obj = c0058w.f822g;
                EnumC0317a enumC0317a = EnumC0317a.f4969a;
                i3 = c0058w.f824i;
                boolean z = true;
                if (i3 == 0) {
                    try {
                        if (i3 == 1) {
                            interfaceC1201k = (InterfaceC1201k) c0058w.f820d;
                        } else if (i3 == 2) {
                            C1202l c1202l2 = c0058w.f;
                            N n5 = c0058w.f821e;
                            a0 a0Var2 = (a0) c0058w.f820d;
                            android.support.v4.media.session.a.T(obj);
                            c1202l = c1202l2;
                            n4 = n5;
                            a0Var = a0Var2;
                        } else {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC1201k = (InterfaceC1201k) c0058w.f820d;
                        }
                        android.support.v4.media.session.a.T(obj);
                        interfaceC1201k2 = interfaceC1201k;
                    } catch (Throwable th) {
                        th = th;
                        obj = android.support.v4.media.session.a.k(th);
                        interfaceC1201k2 = n3;
                        a3 = C0192f.a(obj);
                        C1202l c1202l3 = (C1202l) interfaceC1201k2;
                        if (a3 == null) {
                        }
                        return C0195i.f2555a;
                    }
                    a3 = C0192f.a(obj);
                    C1202l c1202l32 = (C1202l) interfaceC1201k2;
                    if (a3 == null) {
                        c1202l32.J(obj);
                    } else {
                        c1202l32.getClass();
                        c1202l32.J(new C1204n(a3, false));
                    }
                    return C0195i.f2555a;
                }
                android.support.v4.media.session.a.T(obj);
                c1202l = a0Var.f740b;
                try {
                    i0 s3 = n3.f701h.s();
                    if (s3 instanceof C0039c) {
                        ?? r22 = a0Var.f739a;
                        d2.h hVar = a0Var.f742d;
                        c0058w.f820d = c1202l;
                        c0058w.f824i = 1;
                        try {
                            b3 = n3.g().b(new G(n3, hVar, (l2.p) r22, (InterfaceC0300c) null), c0058w);
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            n3 = c1202l;
                            obj = android.support.v4.media.session.a.k(th);
                            interfaceC1201k2 = n3;
                            a3 = C0192f.a(obj);
                            C1202l c1202l322 = (C1202l) interfaceC1201k2;
                            if (a3 == null) {
                            }
                            return C0195i.f2555a;
                        }
                    } else {
                        if (!(s3 instanceof b0)) {
                            z = s3 instanceof j0;
                        }
                        if (!z) {
                            if (s3 instanceof Z) {
                                throw ((Z) s3).f738b;
                            }
                            throw new O0.b();
                        }
                        if (s3 != a0Var.f741c) {
                            kotlin.jvm.internal.j.c(s3, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                            throw ((b0) s3).f743b;
                        }
                        c0058w.f820d = a0Var;
                        c0058w.f821e = n3;
                        c0058w.f = c1202l;
                        c0058w.f824i = 2;
                        Object h3 = n3.h(c0058w);
                        n4 = n3;
                        if (h3 == enumC0317a) {
                        }
                    }
                    return enumC0317a;
                } catch (Throwable th3) {
                    th = th3;
                    n3 = c1202l;
                    obj = android.support.v4.media.session.a.k(th);
                    interfaceC1201k2 = n3;
                    a3 = C0192f.a(obj);
                    C1202l c1202l3222 = (C1202l) interfaceC1201k2;
                    if (a3 == null) {
                    }
                    return C0195i.f2555a;
                }
                ?? r23 = a0Var.f739a;
                d2.h hVar2 = a0Var.f742d;
                c0058w.f820d = c1202l;
                c0058w.f821e = null;
                c0058w.f = null;
                c0058w.f824i = 3;
                b3 = n4.g().b(new G(n4, hVar2, (l2.p) r23, (InterfaceC0300c) null), c0058w);
            }
        }
        c0058w = new C0058w(n3, abstractC0326c);
        Object obj2 = c0058w.f822g;
        EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
        i3 = c0058w.f824i;
        boolean z2 = true;
        if (i3 == 0) {
        }
        ?? r232 = a0Var.f739a;
        d2.h hVar22 = a0Var.f742d;
        c0058w.f820d = c1202l;
        c0058w.f821e = null;
        c0058w.f = null;
        c0058w.f824i = 3;
        b3 = n4.g().b(new G(n4, hVar22, (l2.p) r232, (InterfaceC0300c) null), c0058w);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:12:0x004b, B:14:0x0052), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(N n3, AbstractC0326c abstractC0326c) {
        C0059x c0059x;
        int i3;
        B2.d dVar;
        int i4;
        n3.getClass();
        try {
            if (abstractC0326c instanceof C0059x) {
                c0059x = (C0059x) abstractC0326c;
                int i5 = c0059x.f828h;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c0059x.f828h = i5 - Integer.MIN_VALUE;
                    Object obj = c0059x.f;
                    EnumC0317a enumC0317a = EnumC0317a.f4969a;
                    i3 = c0059x.f828h;
                    if (i3 != 0) {
                        android.support.v4.media.session.a.T(obj);
                        c0059x.f825d = n3;
                        dVar = n3.f699e;
                        c0059x.f826e = dVar;
                        c0059x.f828h = 1;
                        if (dVar.c(c0059x) == enumC0317a) {
                            return enumC0317a;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        B2.d dVar2 = c0059x.f826e;
                        N n4 = c0059x.f825d;
                        android.support.v4.media.session.a.T(obj);
                        dVar = dVar2;
                        n3 = n4;
                    }
                    i4 = n3.f + 1;
                    n3.f = i4;
                    if (i4 == 1) {
                        n3.f700g = AbstractC1212w.g(n3.f697c, null, new C0061z(n3, null), 3);
                    }
                    dVar.e(null);
                    return C0195i.f2555a;
                }
            }
            i4 = n3.f + 1;
            n3.f = i4;
            if (i4 == 1) {
            }
            dVar.e(null);
            return C0195i.f2555a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0059x = new C0059x(n3, abstractC0326c);
        Object obj2 = c0059x.f;
        EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
        i3 = c0059x.f828h;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(N n3, boolean z, InterfaceC0300c interfaceC0300c) {
        B b3;
        EnumC0317a enumC0317a;
        int i3;
        N n4;
        i0 i0Var;
        boolean z2;
        N n5;
        C0190d c0190d;
        n3.getClass();
        if (interfaceC0300c instanceof B) {
            b3 = (B) interfaceC0300c;
            int i4 = b3.f654i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                b3.f654i = i4 - Integer.MIN_VALUE;
                Object obj = b3.f652g;
                enumC0317a = EnumC0317a.f4969a;
                i3 = b3.f654i;
                if (i3 != 0) {
                    android.support.v4.media.session.a.T(obj);
                    i0 s3 = n3.f701h.s();
                    if (s3 instanceof j0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    h0 g3 = n3.g();
                    b3.f650d = n3;
                    b3.f651e = s3;
                    b3.f = z;
                    b3.f654i = 1;
                    Integer a3 = g3.a();
                    if (a3 != enumC0317a) {
                        n4 = n3;
                        i0Var = s3;
                        obj = a3;
                    }
                    return enumC0317a;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        n5 = b3.f650d;
                        android.support.v4.media.session.a.T(obj);
                        c0190d = (C0190d) obj;
                        i0 i0Var2 = (i0) c0190d.f2547a;
                        if (((Boolean) c0190d.f2548b).booleanValue()) {
                        }
                        return i0Var2;
                    }
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n5 = b3.f650d;
                    android.support.v4.media.session.a.T(obj);
                    c0190d = (C0190d) obj;
                    i0 i0Var22 = (i0) c0190d.f2547a;
                    if (((Boolean) c0190d.f2548b).booleanValue()) {
                        n5.f701h.w(i0Var22);
                    }
                    return i0Var22;
                }
                z = b3.f;
                i0Var = b3.f651e;
                n4 = b3.f650d;
                android.support.v4.media.session.a.T(obj);
                int intValue = ((Number) obj).intValue();
                z2 = i0Var instanceof C0039c;
                int i5 = !z2 ? i0Var.f777a : -1;
                if (!z2 && intValue == i5) {
                    return i0Var;
                }
                if (z) {
                    h0 g4 = n4.g();
                    D d3 = new D(n4, i5, null);
                    b3.f650d = n4;
                    b3.f651e = null;
                    b3.f654i = 3;
                    obj = g4.c(d3, b3);
                    if (obj != enumC0317a) {
                        n5 = n4;
                        c0190d = (C0190d) obj;
                        i0 i0Var222 = (i0) c0190d.f2547a;
                        if (((Boolean) c0190d.f2548b).booleanValue()) {
                        }
                        return i0Var222;
                    }
                } else {
                    h0 g5 = n4.g();
                    C c3 = new C(n4, null);
                    b3.f650d = n4;
                    b3.f651e = null;
                    b3.f654i = 2;
                    obj = g5.b(c3, b3);
                    if (obj != enumC0317a) {
                        n5 = n4;
                        c0190d = (C0190d) obj;
                        i0 i0Var2222 = (i0) c0190d.f2547a;
                        if (((Boolean) c0190d.f2548b).booleanValue()) {
                        }
                        return i0Var2222;
                    }
                }
                return enumC0317a;
            }
        }
        b3 = new B(n3, interfaceC0300c);
        Object obj2 = b3.f652g;
        enumC0317a = EnumC0317a.f4969a;
        i3 = b3.f654i;
        if (i3 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z2 = i0Var instanceof C0039c;
        if (!z2) {
        }
        if (!z2) {
        }
        if (z) {
        }
        return enumC0317a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x013f, code lost:
    
        if (r10 != r1) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9 A[Catch: b -> 0x00aa, TryCatch #3 {b -> 0x00aa, blocks: (B:36:0x00a5, B:37:0x0142, B:40:0x00b3, B:41:0x0125, B:54:0x00d0, B:56:0x00e9, B:57:0x00ed, B:62:0x00d9, B:65:0x0113), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(N n3, boolean z, AbstractC0326c abstractC0326c) {
        E e3;
        Integer a3;
        Object obj;
        N n4;
        int i3;
        C0038b c0038b;
        Object b3;
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.q qVar;
        n3.getClass();
        try {
            if (abstractC0326c instanceof E) {
                e3 = (E) abstractC0326c;
                int i4 = e3.f668l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    e3.f668l = i4 - Integer.MIN_VALUE;
                    Object obj2 = e3.f666j;
                    EnumC0317a enumC0317a = EnumC0317a.f4969a;
                    switch (e3.f668l) {
                        case 0:
                            android.support.v4.media.session.a.T(obj2);
                            if (!z) {
                                h0 g3 = n3.g();
                                e3.f661d = n3;
                                e3.f664h = z;
                                e3.f668l = 3;
                                obj2 = g3.a();
                                if (obj2 == enumC0317a) {
                                }
                                int intValue = ((Number) obj2).intValue();
                                h0 g4 = n3.g();
                                F f = new F(n3, intValue, null);
                                e3.f661d = n3;
                                e3.f664h = z;
                                e3.f668l = 4;
                                obj2 = g4.c(f, e3);
                                break;
                            } else {
                                e3.f661d = n3;
                                e3.f664h = z;
                                e3.f668l = 1;
                                obj2 = n3.i(e3);
                                if (obj2 == enumC0317a) {
                                }
                                int hashCode = obj2 != null ? obj2.hashCode() : 0;
                                h0 g5 = n3.g();
                                e3.f661d = n3;
                                e3.f662e = obj2;
                                e3.f664h = z;
                                e3.f665i = hashCode;
                                e3.f668l = 2;
                                a3 = g5.a();
                                if (a3 != enumC0317a) {
                                    obj = obj2;
                                    obj2 = a3;
                                    n4 = n3;
                                    i3 = hashCode;
                                    return new C0039c(i3, ((Number) obj2).intValue(), obj);
                                }
                            }
                            return enumC0317a;
                        case 1:
                            z = e3.f664h;
                            n3 = (N) e3.f661d;
                            android.support.v4.media.session.a.T(obj2);
                            if (obj2 != null) {
                            }
                            h0 g52 = n3.g();
                            e3.f661d = n3;
                            e3.f662e = obj2;
                            e3.f664h = z;
                            e3.f665i = hashCode;
                            e3.f668l = 2;
                            a3 = g52.a();
                            if (a3 != enumC0317a) {
                            }
                            return enumC0317a;
                        case 2:
                            i3 = e3.f665i;
                            z = e3.f664h;
                            obj = e3.f662e;
                            n4 = (N) e3.f661d;
                            try {
                                android.support.v4.media.session.a.T(obj2);
                                return new C0039c(i3, ((Number) obj2).intValue(), obj);
                            } catch (C0038b e4) {
                                e = e4;
                                n3 = n4;
                                kotlin.jvm.internal.q qVar2 = new kotlin.jvm.internal.q();
                                K0.j jVar = n3.f696b;
                                e3.f661d = n3;
                                e3.f662e = e;
                                e3.f = qVar2;
                                e3.f663g = qVar2;
                                e3.f664h = z;
                                e3.f668l = 5;
                                throw e;
                            }
                        case 3:
                            z = e3.f664h;
                            n3 = (N) e3.f661d;
                            android.support.v4.media.session.a.T(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            h0 g42 = n3.g();
                            F f3 = new F(n3, intValue2, null);
                            e3.f661d = n3;
                            e3.f664h = z;
                            e3.f668l = 4;
                            obj2 = g42.c(f3, e3);
                            break;
                        case 4:
                            boolean z2 = e3.f664h;
                            android.support.v4.media.session.a.T(obj2);
                            return (C0039c) obj2;
                        case 5:
                            boolean z3 = e3.f664h;
                            kotlin.jvm.internal.q qVar3 = e3.f663g;
                            kotlin.jvm.internal.q qVar4 = (kotlin.jvm.internal.q) e3.f;
                            C0038b c0038b2 = (C0038b) e3.f662e;
                            N n5 = (N) e3.f661d;
                            android.support.v4.media.session.a.T(obj2);
                            qVar3.f9692a = obj2;
                            kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                            try {
                                G g6 = new G(qVar4, n5, pVar2, (InterfaceC0300c) null);
                                e3.f661d = c0038b2;
                                e3.f662e = qVar4;
                                e3.f = pVar2;
                                e3.f663g = null;
                                e3.f668l = 6;
                                if (z3) {
                                    n5.getClass();
                                    b3 = g6.invoke(e3);
                                } else {
                                    b3 = n5.g().b(new C0057v(g6, null), e3);
                                }
                                if (b3 != enumC0317a) {
                                    pVar = pVar2;
                                    qVar = qVar4;
                                    Object obj3 = qVar.f9692a;
                                    return new C0039c(obj3 != null ? obj3.hashCode() : 0, pVar.f9691a, obj3);
                                }
                                return enumC0317a;
                            } catch (Throwable th) {
                                th = th;
                                c0038b = c0038b2;
                                AbstractC0129a.e(c0038b, th);
                                throw c0038b;
                            }
                        case 6:
                            pVar = (kotlin.jvm.internal.p) e3.f;
                            qVar = (kotlin.jvm.internal.q) e3.f662e;
                            c0038b = (C0038b) e3.f661d;
                            try {
                                android.support.v4.media.session.a.T(obj2);
                                Object obj32 = qVar.f9692a;
                                return new C0039c(obj32 != null ? obj32.hashCode() : 0, pVar.f9691a, obj32);
                            } catch (Throwable th2) {
                                th = th2;
                                AbstractC0129a.e(c0038b, th);
                                throw c0038b;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (e3.f668l) {
            }
        } catch (C0038b e5) {
            e = e5;
        }
        e3 = new E(n3, abstractC0326c);
        Object obj22 = e3.f666j;
        EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
    }

    @Override // K.InterfaceC0044h
    public final Object a(l2.p pVar, f2.i iVar) {
        d2.h hVar = iVar.f4981b;
        kotlin.jvm.internal.j.b(hVar);
        m0 m0Var = (m0) hVar.h(l0.f799a);
        if (m0Var != null) {
            m0Var.c(this);
        }
        return AbstractC1212w.o(new m0(m0Var, this), new J(this, pVar, null), iVar);
    }

    public final h0 g() {
        return (h0) this.f704k.a();
    }

    @Override // K.InterfaceC0044h
    public final w2.d getData() {
        return this.f698d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.g(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(AbstractC0326c abstractC0326c) {
        A a3;
        int i3;
        N n3;
        int intValue;
        int i4;
        Throwable th;
        N n4;
        try {
            if (abstractC0326c instanceof A) {
                a3 = (A) abstractC0326c;
                int i5 = a3.f649h;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    a3.f649h = i5 - Integer.MIN_VALUE;
                    Object obj = a3.f;
                    Object obj2 = EnumC0317a.f4969a;
                    i3 = a3.f649h;
                    if (i3 != 0) {
                        android.support.v4.media.session.a.T(obj);
                        h0 g3 = g();
                        a3.f646d = this;
                        a3.f649h = 1;
                        obj = g3.a();
                        if (obj != obj2) {
                            n3 = this;
                        }
                        return obj2;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i4 = a3.f647e;
                        n4 = a3.f646d;
                        try {
                            android.support.v4.media.session.a.T(obj);
                            return C0195i.f2555a;
                        } catch (Throwable th2) {
                            th = th2;
                            n4.f701h.w(new b0(th, i4));
                            throw th;
                        }
                    }
                    n3 = a3.f646d;
                    android.support.v4.media.session.a.T(obj);
                    intValue = ((Number) obj).intValue();
                    B0.p pVar = n3.f702i;
                    a3.f646d = n3;
                    a3.f647e = intValue;
                    a3.f649h = 2;
                }
            }
            B0.p pVar2 = n3.f702i;
            a3.f646d = n3;
            a3.f647e = intValue;
            a3.f649h = 2;
        } catch (Throwable th3) {
            i4 = intValue;
            th = th3;
            n4 = n3;
            n4.f701h.w(new b0(th, i4));
            throw th;
        }
        a3 = new A(this, abstractC0326c);
        Object obj3 = a3.f;
        Object obj22 = EnumC0317a.f4969a;
        i3 = a3.f649h;
        if (i3 != 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    public final Object i(AbstractC0326c abstractC0326c) {
        return ((W) this.f703j.a()).a(new C0053q(3, (InterfaceC0300c) null), abstractC0326c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z, AbstractC0326c abstractC0326c) {
        L l3;
        int i3;
        kotlin.jvm.internal.p pVar;
        if (abstractC0326c instanceof L) {
            l3 = (L) abstractC0326c;
            int i4 = l3.f688g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                l3.f688g = i4 - Integer.MIN_VALUE;
                Object obj2 = l3.f687e;
                EnumC0317a enumC0317a = EnumC0317a.f4969a;
                i3 = l3.f688g;
                if (i3 != 0) {
                    android.support.v4.media.session.a.T(obj2);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    W w3 = (W) this.f703j.a();
                    M m3 = new M(pVar2, this, obj, z, null);
                    l3.f686d = pVar2;
                    l3.f688g = 1;
                    if (w3.b(m3, l3) == enumC0317a) {
                        return enumC0317a;
                    }
                    pVar = pVar2;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = l3.f686d;
                    android.support.v4.media.session.a.T(obj2);
                }
                return new Integer(pVar.f9691a);
            }
        }
        l3 = new L(this, abstractC0326c);
        Object obj22 = l3.f687e;
        EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
        i3 = l3.f688g;
        if (i3 != 0) {
        }
        return new Integer(pVar.f9691a);
    }
}
