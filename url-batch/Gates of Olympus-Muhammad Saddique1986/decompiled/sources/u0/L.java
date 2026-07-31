package u0;

import a0.AbstractC0236a;
import a0.C0237b;
import a0.C0239d;
import a0.C0240e;
import a0.C0241f;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import b0.C0341j;
import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import j.AbstractC0535i;
import j.C0542p;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r0.AbstractC0898U;
import r0.InterfaceC0919p;
import t0.AbstractC0993f;

/* loaded from: classes.dex */
public abstract class L implements N0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f9205a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: b, reason: collision with root package name */
    public static final C0239d f9206b = new C0239d(0.0f, 0.0f, 10.0f, 10.0f);

    public static final String A(int i3) {
        if (A0.f.a(i3, 0)) {
            return "android.widget.Button";
        }
        if (A0.f.a(i3, 1)) {
            return "android.widget.CheckBox";
        }
        if (A0.f.a(i3, 3)) {
            return "android.widget.RadioButton";
        }
        if (A0.f.a(i3, 5)) {
            return "android.widget.ImageView";
        }
        if (A0.f.a(i3, 6)) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static void B(View view) {
        try {
            if (!Q0.f9248v) {
                Q0.f9248v = true;
                if (Build.VERSION.SDK_INT < 28) {
                    Q0.f9246t = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    Q0.f9247u = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    Q0.f9246t = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    Q0.f9247u = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = Q0.f9246t;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = Q0.f9247u;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = Q0.f9247u;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = Q0.f9246t;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            Q0.f9249w = true;
        }
    }

    public static final boolean l(A0.p pVar) {
        A0.i i3 = pVar.i();
        return !i3.f129d.containsKey(A0.s.f174i);
    }

    public static final boolean m(A0.p pVar) {
        return pVar.f141c.f8557u == O0.k.f3742e;
    }

    public static final boolean n(Object obj) {
        if (obj instanceof S.q) {
            S.q qVar = (S.q) obj;
            if (qVar.a() != I.W.f2780f && qVar.a() != I.W.f2783i && qVar.a() != I.W.f2781g) {
                return false;
            }
            Object value = qVar.getValue();
            if (value == null) {
                return true;
            }
            return n(value);
        }
        if ((obj instanceof R1.e) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = f9205a;
        for (int i3 = 0; i3 < 7; i3++) {
            if (clsArr[i3].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static final float o(float[] fArr, int i3, float[] fArr2, int i4) {
        int i5 = i3 * 4;
        return (fArr[i5 + 3] * fArr2[12 + i4]) + (fArr[i5 + 2] * fArr2[8 + i4]) + (fArr[i5 + 1] * fArr2[4 + i4]) + (fArr[i5] * fArr2[i4]);
    }

    public static final C0542p p(A0.q qVar) {
        A0.p a3 = qVar.a();
        C0542p c0542p = AbstractC0535i.f6284a;
        C0542p c0542p2 = new C0542p();
        t0.E e3 = a3.f141c;
        if (e3.E() && e3.D()) {
            C0239d e4 = a3.e();
            q(new Region(Math.round(e4.f4724a), Math.round(e4.f4725b), Math.round(e4.f4726c), Math.round(e4.f4727d)), a3, c0542p2, a3, new Region());
        }
        return c0542p2;
    }

    public static final void q(Region region, A0.p pVar, C0542p c0542p, A0.p pVar2, Region region2) {
        t0.E e3;
        Object G3;
        boolean E3 = pVar2.f141c.E();
        t0.E e4 = pVar2.f141c;
        boolean z3 = (E3 && e4.D()) ? false : true;
        boolean isEmpty = region.isEmpty();
        int i3 = pVar.f145g;
        int i4 = pVar2.f145g;
        if (!isEmpty || i4 == i3) {
            if (!z3 || pVar2.f143e) {
                A0.i iVar = pVar2.f142d;
                boolean z4 = iVar.f130e;
                Object obj = pVar2.f139a;
                if (z4 && (G3 = AbstractC0508a.G(e4)) != null) {
                    obj = G3;
                }
                U.p pVar3 = ((U.p) obj).f4489d;
                Object obj2 = iVar.f129d.get(A0.h.f104b);
                if (obj2 == null) {
                    obj2 = null;
                }
                boolean z5 = obj2 != null;
                boolean z6 = pVar3.f4489d.f4501p;
                C0239d c0239d = C0239d.f4723e;
                if (z6) {
                    if (z5) {
                        t0.b0 r3 = AbstractC0993f.r(pVar3, 8);
                        if (r3.K0().f4501p) {
                            InterfaceC0919p g3 = AbstractC0898U.g(r3);
                            C0237b c0237b = r3.f8707B;
                            if (c0237b == null) {
                                c0237b = new C0237b();
                                c0237b.f4718a = 0.0f;
                                c0237b.f4719b = 0.0f;
                                c0237b.f4720c = 0.0f;
                                c0237b.f4721d = 0.0f;
                                r3.f8707B = c0237b;
                            }
                            long A02 = r3.A0(r3.J0());
                            c0237b.f4718a = -C0241f.d(A02);
                            c0237b.f4719b = -C0241f.b(A02);
                            c0237b.f4720c = C0241f.d(A02) + r3.c0();
                            c0237b.f4721d = C0241f.b(A02) + ((int) (r3.f8128f & 4294967295L));
                            while (true) {
                                if (r3 == g3) {
                                    c0239d = new C0239d(c0237b.f4718a, c0237b.f4719b, c0237b.f4720c, c0237b.f4721d);
                                    break;
                                }
                                r3.Y0(c0237b, false, true);
                                if (c0237b.b()) {
                                    break;
                                }
                                r3 = r3.f8713q;
                                f2.j.c(r3);
                            }
                        }
                    } else {
                        t0.b0 r4 = AbstractC0993f.r(pVar3, 8);
                        c0239d = AbstractC0898U.g(r4).B(r4, true);
                    }
                }
                int round = Math.round(c0239d.f4724a);
                int round2 = Math.round(c0239d.f4725b);
                int round3 = Math.round(c0239d.f4726c);
                int round4 = Math.round(c0239d.f4727d);
                region2.set(round, round2, round3, round4);
                if (i4 == i3) {
                    i4 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (pVar2.f143e) {
                        A0.p j3 = pVar2.j();
                        C0239d e5 = (j3 == null || (e3 = j3.f141c) == null || !e3.E()) ? f9206b : j3.e();
                        c0542p.i(i4, new J0(pVar2, new Rect(Math.round(e5.f4724a), Math.round(e5.f4725b), Math.round(e5.f4726c), Math.round(e5.f4727d))));
                        return;
                    } else {
                        if (i4 == -1) {
                            c0542p.i(i4, new J0(pVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                c0542p.i(i4, new J0(pVar2, region2.getBounds()));
                List h3 = A0.p.h(pVar2, true, 4);
                for (int size = h3.size() - 1; -1 < size; size--) {
                    q(region, pVar, c0542p, (A0.p) h3.get(size), region2);
                }
                if (t(pVar2)) {
                    region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final C0.H r(A0.i iVar) {
        InterfaceC0424c interfaceC0424c;
        ArrayList arrayList = new ArrayList();
        Object obj = iVar.f129d.get(A0.h.f103a);
        if (obj == null) {
            obj = null;
        }
        A0.a aVar = (A0.a) obj;
        if (aVar == null || (interfaceC0424c = (InterfaceC0424c) aVar.f89b) == null || !((Boolean) interfaceC0424c.n(arrayList)).booleanValue()) {
            return null;
        }
        return (C0.H) arrayList.get(0);
    }

    public static final boolean s(float[] fArr, float[] fArr2) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float f9 = fArr[6];
        float f10 = fArr[7];
        float f11 = fArr[8];
        float f12 = fArr[9];
        float f13 = fArr[10];
        float f14 = fArr[11];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[14];
        float f18 = fArr[15];
        float f19 = (f3 * f8) - (f4 * f7);
        float f20 = (f3 * f9) - (f5 * f7);
        float f21 = (f3 * f10) - (f6 * f7);
        float f22 = (f4 * f9) - (f5 * f8);
        float f23 = (f4 * f10) - (f6 * f8);
        float f24 = (f5 * f10) - (f6 * f9);
        float f25 = (f11 * f16) - (f12 * f15);
        float f26 = (f11 * f17) - (f13 * f15);
        float f27 = (f11 * f18) - (f14 * f15);
        float f28 = (f12 * f17) - (f13 * f16);
        float f29 = (f12 * f18) - (f14 * f16);
        float f30 = (f13 * f18) - (f14 * f17);
        float f31 = (f24 * f25) + (((f22 * f27) + ((f21 * f28) + ((f19 * f30) - (f20 * f29)))) - (f23 * f26));
        if (f31 == 0.0f) {
            return false;
        }
        float f32 = 1.0f / f31;
        fArr2[0] = ((f10 * f28) + ((f8 * f30) - (f9 * f29))) * f32;
        fArr2[1] = (((f5 * f29) + ((-f4) * f30)) - (f6 * f28)) * f32;
        fArr2[2] = ((f18 * f22) + ((f16 * f24) - (f17 * f23))) * f32;
        fArr2[3] = (((f13 * f23) + ((-f12) * f24)) - (f14 * f22)) * f32;
        float f33 = -f7;
        fArr2[4] = (((f9 * f27) + (f33 * f30)) - (f10 * f26)) * f32;
        fArr2[5] = ((f6 * f26) + ((f30 * f3) - (f5 * f27))) * f32;
        float f34 = -f15;
        fArr2[6] = (((f17 * f21) + (f34 * f24)) - (f18 * f20)) * f32;
        fArr2[7] = ((f14 * f20) + ((f24 * f11) - (f13 * f21))) * f32;
        fArr2[8] = ((f10 * f25) + ((f7 * f29) - (f8 * f27))) * f32;
        fArr2[9] = (((f27 * f4) + ((-f3) * f29)) - (f6 * f25)) * f32;
        fArr2[10] = ((f18 * f19) + ((f15 * f23) - (f16 * f21))) * f32;
        fArr2[11] = (((f21 * f12) + ((-f11) * f23)) - (f14 * f19)) * f32;
        fArr2[12] = (((f8 * f26) + (f33 * f28)) - (f9 * f25)) * f32;
        fArr2[13] = ((f5 * f25) + ((f3 * f28) - (f4 * f26))) * f32;
        fArr2[14] = (((f16 * f20) + (f34 * f22)) - (f17 * f19)) * f32;
        fArr2[15] = ((f13 * f19) + ((f11 * f22) - (f12 * f20))) * f32;
        return true;
    }

    public static final boolean t(A0.p pVar) {
        A0.i iVar = pVar.f142d;
        if (!iVar.f130e) {
            Set keySet = iVar.f129d.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    if (((A0.v) it.next()).f196c) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean u(b0.K k3, float f3, float f4, b0.L l3, b0.L l4) {
        boolean w2;
        if (!(k3 instanceof b0.I)) {
            if (!(k3 instanceof b0.J)) {
                if (k3 instanceof b0.H) {
                    return v(((b0.H) k3).f5351a, f3, f4, l3, l4);
                }
                throw new C1.c();
            }
            C0240e c0240e = ((b0.J) k3).f5353a;
            float f5 = c0240e.f4728a;
            if (f3 < f5) {
                return false;
            }
            float f6 = c0240e.f4730c;
            if (f3 >= f6) {
                return false;
            }
            float f7 = c0240e.f4729b;
            if (f4 < f7) {
                return false;
            }
            float f8 = c0240e.f4731d;
            if (f4 >= f8) {
                return false;
            }
            long j3 = c0240e.f4732e;
            float b3 = AbstractC0236a.b(j3);
            long j4 = c0240e.f4733f;
            if (AbstractC0236a.b(j4) + b3 <= c0240e.b()) {
                long j5 = c0240e.f4735h;
                float b4 = AbstractC0236a.b(j5);
                long j6 = c0240e.f4734g;
                if (AbstractC0236a.b(j6) + b4 <= c0240e.b()) {
                    if (AbstractC0236a.c(j5) + AbstractC0236a.c(j3) <= c0240e.a()) {
                        if (AbstractC0236a.c(j6) + AbstractC0236a.c(j4) <= c0240e.a()) {
                            float b5 = AbstractC0236a.b(j3) + f5;
                            float c2 = AbstractC0236a.c(j3) + f7;
                            float b6 = f6 - AbstractC0236a.b(j4);
                            float c3 = f7 + AbstractC0236a.c(j4);
                            float b7 = f6 - AbstractC0236a.b(j6);
                            float c4 = f8 - AbstractC0236a.c(j6);
                            float c5 = f8 - AbstractC0236a.c(j5);
                            float b8 = AbstractC0236a.b(j5) + f5;
                            if (f3 < b5 && f4 < c2) {
                                w2 = w(f3, f4, c0240e.f4732e, b5, c2);
                            } else if (f3 < b8 && f4 > c5) {
                                w2 = w(f3, f4, c0240e.f4735h, b8, c5);
                            } else if (f3 > b6 && f4 < c3) {
                                w2 = w(f3, f4, c0240e.f4733f, b6, c3);
                            } else if (f3 > b7 && f4 > c4) {
                                w2 = w(f3, f4, c0240e.f4734g, b7, c4);
                            }
                            return w2;
                        }
                    }
                }
            }
            b0.L h3 = l4 == null ? b0.M.h() : l4;
            b0.L.a(h3, c0240e);
            return v(h3, f3, f4, l3, l4);
        }
        C0239d c0239d = ((b0.I) k3).f5352a;
        if (c0239d.f4724a > f3 || f3 >= c0239d.f4726c || c0239d.f4725b > f4 || f4 >= c0239d.f4727d) {
            return false;
        }
        return true;
    }

    public static final boolean v(b0.L l3, float f3, float f4, b0.L l4, b0.L l5) {
        C0239d c0239d = new C0239d(f3 - 0.005f, f4 - 0.005f, f3 + 0.005f, f4 + 0.005f);
        if (l4 == null) {
            l4 = b0.M.h();
        }
        b0.L.b(l4, c0239d);
        if (l5 == null) {
            l5 = b0.M.h();
        }
        C0341j c0341j = (C0341j) l5;
        c0341j.d(l3, l4, 1);
        boolean isEmpty = c0341j.f5420a.isEmpty();
        c0341j.e();
        ((C0341j) l4).e();
        return !isEmpty;
    }

    public static final boolean w(float f3, float f4, long j3, float f5, float f6) {
        float f7 = f3 - f5;
        float f8 = f4 - f6;
        float b3 = AbstractC0236a.b(j3);
        float c2 = AbstractC0236a.c(j3);
        return ((f8 * f8) / (c2 * c2)) + ((f7 * f7) / (b3 * b3)) <= 1.0f;
    }

    public static final void x(float[] fArr, float[] fArr2) {
        float o3 = o(fArr2, 0, fArr, 0);
        float o4 = o(fArr2, 0, fArr, 1);
        float o5 = o(fArr2, 0, fArr, 2);
        float o6 = o(fArr2, 0, fArr, 3);
        float o7 = o(fArr2, 1, fArr, 0);
        float o8 = o(fArr2, 1, fArr, 1);
        float o9 = o(fArr2, 1, fArr, 2);
        float o10 = o(fArr2, 1, fArr, 3);
        float o11 = o(fArr2, 2, fArr, 0);
        float o12 = o(fArr2, 2, fArr, 1);
        float o13 = o(fArr2, 2, fArr, 2);
        float o14 = o(fArr2, 2, fArr, 3);
        float o15 = o(fArr2, 3, fArr, 0);
        float o16 = o(fArr2, 3, fArr, 1);
        float o17 = o(fArr2, 3, fArr, 2);
        float o18 = o(fArr2, 3, fArr, 3);
        fArr[0] = o3;
        fArr[1] = o4;
        fArr[2] = o5;
        fArr[3] = o6;
        fArr[4] = o7;
        fArr[5] = o8;
        fArr[6] = o9;
        fArr[7] = o10;
        fArr[8] = o11;
        fArr[9] = o12;
        fArr[10] = o13;
        fArr[11] = o14;
        fArr[12] = o15;
        fArr[13] = o16;
        fArr[14] = o17;
        fArr[15] = o18;
    }

    public static final void y(C1089a0 c1089a0, int i3) {
        Object obj;
        Iterator<T> it = c1089a0.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((t0.E) ((Map.Entry) obj).getKey()).f8541e == i3) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null && entry.getValue() != null) {
            throw new ClassCastException();
        }
    }

    public static final String z(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }
}
