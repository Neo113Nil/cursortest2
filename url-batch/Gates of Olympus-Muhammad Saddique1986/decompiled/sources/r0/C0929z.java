package r0;

import B.InterfaceC0013n;
import C0.C0025a;
import I.C0148f0;
import R0.C0212a;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import d0.InterfaceC0403d;
import e0.C0416b;
import e2.InterfaceC0424c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import n.t0;
import r.AbstractC0856c;
import s.C0943l;
import s.C0951t;
import t0.InterfaceC0988a;
import t0.b0;
import t1.AbstractC1019G;
import t1.C1013A;
import t1.C1016D;
import t1.C1028h;
import t1.C1029i;
import u0.AbstractC1117o0;
import u0.C1107j0;
import u0.C1119p0;
import u0.C1122r0;
import x.EnumC1187E;
import x.n0;
import z.InputConnectionC1234B;

/* renamed from: r0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0929z extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8199f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0929z(int i3, Object obj) {
        super(1);
        this.f8198e = i3;
        this.f8199f = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a0  */
    /* JADX WARN: Type inference failed for: r0v18, types: [r0.O, t0.a] */
    @Override // e2.InterfaceC0424c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj) {
        boolean z3;
        int i3;
        K.d dVar;
        Object[] objArr;
        switch (this.f8198e) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                InterfaceC0899V interfaceC0899V = (InterfaceC0899V) entry.getValue();
                C0881C c0881c = (C0881C) this.f8199f;
                int k3 = c0881c.f8112p.k(key);
                if (k3 < 0 || k3 >= c0881c.f8104h) {
                    interfaceC0899V.a();
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 1:
                float f3 = -((Number) obj).floatValue();
                C0951t c0951t = (C0951t) this.f8199f;
                if ((f3 < 0.0f && !c0951t.a()) || (f3 > 0.0f && !c0951t.c())) {
                    f3 = 0.0f;
                } else {
                    if (Math.abs(c0951t.f8323g) > 0.5f) {
                        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + c0951t.f8323g).toString());
                    }
                    float f4 = c0951t.f8323g + f3;
                    c0951t.f8323g = f4;
                    if (Math.abs(f4) > 0.5f) {
                        C0943l c0943l = (C0943l) c0951t.f8321e.getValue();
                        float f5 = c0951t.f8323g;
                        int round = Math.round(f5);
                        C0943l c0943l2 = c0951t.f8319c;
                        boolean a3 = c0943l.a(round, !c0951t.f8318b);
                        if (a3 && c0943l2 != null) {
                            a3 = c0943l2.a(round, true);
                        }
                        if (a3) {
                            c0951t.f(c0943l, c0951t.f8318b, true);
                            c0951t.f8337u.setValue(R1.y.f4171a);
                            c0951t.h(f5 - c0951t.f8323g, c0943l);
                        } else {
                            t0.E e3 = c0951t.f8326j;
                            if (e3 != null) {
                                e3.k();
                            }
                            c0951t.h(f5 - c0951t.f8323g, c0951t.g());
                        }
                    }
                    if (Math.abs(c0951t.f8323g) > 0.5f) {
                        f3 -= c0951t.f8323g;
                        c0951t.f8323g = 0.0f;
                    }
                }
                return Float.valueOf(-f3);
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0212a(3, (t.q) this.f8199f);
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0212a(5, (t.w) this.f8199f);
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                InterfaceC0988a interfaceC0988a = (InterfaceC0988a) obj;
                if (interfaceC0988a.j()) {
                    if (interfaceC0988a.i().f8564b) {
                        interfaceC0988a.h();
                    }
                    Iterator it = interfaceC0988a.i().f8571i.entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        t0.F f6 = (t0.F) this.f8199f;
                        if (hasNext) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            t0.F.a(f6, (C0915l) entry2.getKey(), ((Number) entry2.getValue()).intValue(), interfaceC0988a.Q());
                        } else {
                            b0 b0Var = interfaceC0988a.Q().f8713q;
                            f2.j.c(b0Var);
                            while (!b0Var.equals(f6.f8563a.Q())) {
                                for (C0915l c0915l : f6.b(b0Var).keySet()) {
                                    t0.F.a(f6, c0915l, f6.c(b0Var, c0915l), b0Var);
                                }
                                b0Var = b0Var.f8713q;
                                f2.j.c(b0Var);
                            }
                        }
                    }
                }
                return R1.y.f4171a;
            case 5:
                ((K.d) this.f8199f).b((U.o) obj);
                return Boolean.TRUE;
            case 6:
                C1028h c1028h = (C1028h) obj;
                f2.j.f(c1028h, "backStackEntry");
                t1.u uVar = c1028h.f8874e;
                if (uVar == null) {
                    uVar = null;
                }
                if (uVar == null) {
                    return null;
                }
                c1028h.g();
                AbstractC1019G abstractC1019G = (AbstractC1019G) this.f8199f;
                t1.u c2 = abstractC1019G.c(uVar);
                if (c2 == null) {
                    c1028h = null;
                } else if (!c2.equals(uVar)) {
                    t1.k b3 = abstractC1019G.b();
                    Bundle b4 = c2.b(c1028h.g());
                    C1013A c1013a = b3.f8898h;
                    c1028h = m1.w.a(c1013a.f8806a, c2, b4, c1013a.g(), c1013a.f8821p);
                }
                return c1028h;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0212a(6, (C1107j0) this.f8199f);
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                boolean compareAndSet = AbstractC1117o0.f9416b.compareAndSet(false, true);
                R1.y yVar = R1.y.f4171a;
                if (compareAndSet) {
                    ((s2.g) this.f8199f).p(yVar);
                }
                return yVar;
            case AbstractC0856c.f8037c /* 9 */:
                InterfaceC0403d interfaceC0403d = (InterfaceC0403d) obj;
                b0.r h3 = interfaceC0403d.S().h();
                C0025a c0025a = ((C1119p0) this.f8199f).f9421g;
                if (c0025a != null) {
                    c0025a.h(h3, (C0416b) interfaceC0403d.S().f2117c);
                }
                return R1.y.f4171a;
            case AbstractC0856c.f8039e /* 10 */:
                I0.p pVar = (I0.p) obj;
                InputConnectionC1234B inputConnectionC1234B = pVar.f3081b;
                if (inputConnectionC1234B != null) {
                    pVar.a(inputConnectionC1234B);
                    pVar.f3081b = null;
                }
                C1122r0 c1122r0 = (C1122r0) this.f8199f;
                K.d dVar2 = c1122r0.f9448d;
                int i4 = dVar2.f3216f;
                if (i4 > 0) {
                    Object[] objArr2 = dVar2.f3214d;
                    i3 = 0;
                    while (!f2.j.a((WeakReference) objArr2[i3], pVar)) {
                        i3++;
                        if (i3 >= i4) {
                        }
                    }
                    dVar = c1122r0.f9448d;
                    if (i3 >= 0) {
                        dVar.o(i3);
                    }
                    if (dVar.l()) {
                        c1122r0.f9446b.b();
                    }
                    return R1.y.f4171a;
                }
                i3 = -1;
                dVar = c1122r0.f9448d;
                if (i3 >= 0) {
                }
                if (dVar.l()) {
                }
                return R1.y.f4171a;
            case 11:
                ((C0025a) this.f8199f).h((b0.r) obj, null);
                return R1.y.f4171a;
            case 12:
                Bundle bundle = (Bundle) obj;
                C1013A b5 = t0.b((Context) this.f8199f);
                if (bundle != null) {
                    bundle.setClassLoader(b5.f8806a.getClassLoader());
                    b5.f8809d = bundle.getBundle("android-support-nav:controller:navigatorState");
                    b5.f8810e = bundle.getParcelableArray("android-support-nav:controller:backStack");
                    LinkedHashMap linkedHashMap = b5.f8819n;
                    linkedHashMap.clear();
                    int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < length) {
                            b5.f8818m.put(Integer.valueOf(intArray[i5]), stringArrayList.get(i6));
                            i5++;
                            i6++;
                        }
                    }
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        for (String str : stringArrayList2) {
                            Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                            if (parcelableArray != null) {
                                f2.j.e(str, "id");
                                int length2 = parcelableArray.length;
                                S1.j jVar = new S1.j();
                                if (length2 == 0) {
                                    objArr = S1.j.f4313g;
                                } else {
                                    if (length2 <= 0) {
                                        throw new IllegalArgumentException(A.k.h("Illegal Capacity: ", length2));
                                    }
                                    objArr = new Object[length2];
                                }
                                jVar.f4315e = objArr;
                                R1.p h4 = f2.j.h(parcelableArray);
                                while (h4.hasNext()) {
                                    Parcelable parcelable = (Parcelable) h4.next();
                                    f2.j.d(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                    jVar.addLast((C1029i) parcelable);
                                }
                                linkedHashMap.put(str, jVar);
                            }
                        }
                    }
                    b5.f8811f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                return b5;
            case 13:
                ((A0.i) obj).c(B.F.f280c, new B.E(EnumC1187E.f9940d, ((InterfaceC0013n) this.f8199f).a(), 2, true));
                return R1.y.f4171a;
            case 14:
                float[] fArr = ((b0.G) obj).f5350a;
                InterfaceC0919p interfaceC0919p = (InterfaceC0919p) this.f8199f;
                if (interfaceC0919p.o()) {
                    AbstractC0898U.g(interfaceC0919p).w(interfaceC0919p, fArr);
                }
                return R1.y.f4171a;
            case AbstractC0856c.f8041g /* 15 */:
                float floatValue = ((Number) obj).floatValue();
                n0 n0Var = (n0) this.f8199f;
                float g3 = n0Var.f10182a.g() + floatValue;
                C0148f0 c0148f0 = n0Var.f10183b;
                float g4 = c0148f0.g();
                C0148f0 c0148f02 = n0Var.f10182a;
                if (g3 > g4) {
                    floatValue = c0148f0.g() - c0148f02.g();
                } else if (g3 < 0.0f) {
                    floatValue = -c0148f02.g();
                }
                c0148f02.h(c0148f02.g() + floatValue);
                return Float.valueOf(floatValue);
            case 16:
                ((InputConnectionC1234B) this.f8199f).a((I0.i) obj);
                return R1.y.f4171a;
            default:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.f8199f).cancel();
                }
                return R1.y.f4171a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0929z(AbstractC1019G abstractC1019G, C1016D c1016d) {
        super(1);
        this.f8198e = 6;
        this.f8199f = abstractC1019G;
    }
}
