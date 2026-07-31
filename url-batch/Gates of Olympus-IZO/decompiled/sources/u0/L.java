package u0;

import a0.AbstractC0158a;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import b0.AbstractC0257H;
import b0.AbstractC0259J;
import b0.C0254E;
import b0.C0255F;
import b0.C0256G;
import b0.C0278k;
import b0.InterfaceC0258I;
import e2.AbstractC0381e;
import j.AbstractC0491i;
import j.C0498p;
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
import r0.InterfaceC0838k;
import t0.AbstractC0898f;
import z0.C1076a;

/* loaded from: classes.dex */
public abstract class L implements C0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f8186a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: b, reason: collision with root package name */
    public static final a0.d f8187b = new a0.d(0.0f, 0.0f, 10.0f, 10.0f);

    public static final boolean h(z0.n nVar) {
        z0.i i3 = nVar.i();
        return !i3.f8982d.containsKey(z0.q.f9018i);
    }

    public static final boolean i(z0.n nVar) {
        return nVar.f8990c.f7731t == M0.j.f2776e;
    }

    public static final boolean j(Object obj) {
        if (obj instanceof S.r) {
            S.r rVar = (S.r) obj;
            if (rVar.a() != I.X.f2225f && rVar.a() != I.X.f2228i && rVar.a() != I.X.f2226g) {
                return false;
            }
            Object value = rVar.getValue();
            if (value == null) {
                return true;
            }
            return j(value);
        }
        if ((obj instanceof L1.e) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = f8186a;
        for (int i3 = 0; i3 < 7; i3++) {
            if (clsArr[i3].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static final float k(float[] fArr, int i3, float[] fArr2, int i4) {
        int i5 = i3 * 4;
        return (fArr[i5 + 3] * fArr2[12 + i4]) + (fArr[i5 + 2] * fArr2[8 + i4]) + (fArr[i5 + 1] * fArr2[4 + i4]) + (fArr[i5] * fArr2[i4]);
    }

    public static final C0498p l(z0.o oVar) {
        z0.n a3 = oVar.a();
        C0498p c0498p = AbstractC0491i.f5166a;
        C0498p c0498p2 = new C0498p();
        t0.D d3 = a3.f8990c;
        if (d3.C() && d3.B()) {
            a0.d e3 = a3.e();
            m(new Region(Math.round(e3.f3491a), Math.round(e3.f3492b), Math.round(e3.f3493c), Math.round(e3.f3494d)), a3, c0498p2, a3, new Region());
        }
        return c0498p2;
    }

    public static final void m(Region region, z0.n nVar, C0498p c0498p, z0.n nVar2, Region region2) {
        t0.D d3;
        Object E3;
        boolean C = nVar2.f8990c.C();
        t0.D d4 = nVar2.f8990c;
        boolean z3 = (C && d4.B()) ? false : true;
        boolean isEmpty = region.isEmpty();
        int i3 = nVar.f8994g;
        int i4 = nVar2.f8994g;
        if (!isEmpty || i4 == i3) {
            if (!z3 || nVar2.f8992e) {
                z0.i iVar = nVar2.f8991d;
                boolean z4 = iVar.f8983e;
                Object obj = nVar2.f8988a;
                if (z4 && (E3 = AbstractC0381e.E(d4)) != null) {
                    obj = E3;
                }
                U.k kVar = ((U.k) obj).f3303d;
                Object obj2 = iVar.f8982d.get(z0.h.f8958b);
                if (obj2 == null) {
                    obj2 = null;
                }
                boolean z5 = obj2 != null;
                boolean z6 = kVar.f3303d.p;
                a0.d dVar = a0.d.f3490e;
                if (z6) {
                    if (z5) {
                        t0.a0 r3 = AbstractC0898f.r(kVar, 8);
                        if (r3.B0().p) {
                            InterfaceC0838k g3 = r0.M.g(r3);
                            a0.b bVar = r3.B;
                            if (bVar == null) {
                                bVar = new a0.b();
                                bVar.f3485a = 0.0f;
                                bVar.f3486b = 0.0f;
                                bVar.f3487c = 0.0f;
                                bVar.f3488d = 0.0f;
                                r3.B = bVar;
                            }
                            long r02 = r3.r0(r3.A0());
                            bVar.f3485a = -a0.f.d(r02);
                            bVar.f3486b = -a0.f.b(r02);
                            bVar.f3487c = a0.f.d(r02) + r3.N();
                            bVar.f3488d = a0.f.b(r02) + ((int) (r3.f7116f & 4294967295L));
                            while (true) {
                                if (r3 == g3) {
                                    dVar = new a0.d(bVar.f3485a, bVar.f3486b, bVar.f3487c, bVar.f3488d);
                                    break;
                                }
                                r3.Q0(bVar, false, true);
                                if (bVar.b()) {
                                    break;
                                }
                                r3 = r3.f7878q;
                                Z1.i.c(r3);
                            }
                        }
                    } else {
                        t0.a0 r4 = AbstractC0898f.r(kVar, 8);
                        dVar = r0.M.g(r4).u(r4, true);
                    }
                }
                int round = Math.round(dVar.f3491a);
                int round2 = Math.round(dVar.f3492b);
                int round3 = Math.round(dVar.f3493c);
                int round4 = Math.round(dVar.f3494d);
                region2.set(round, round2, round3, round4);
                if (i4 == i3) {
                    i4 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (nVar2.f8992e) {
                        z0.n j3 = nVar2.j();
                        a0.d e3 = (j3 == null || (d3 = j3.f8990c) == null || !d3.C()) ? f8187b : j3.e();
                        c0498p.i(i4, new C1010z0(nVar2, new Rect(Math.round(e3.f3491a), Math.round(e3.f3492b), Math.round(e3.f3493c), Math.round(e3.f3494d))));
                        return;
                    } else {
                        if (i4 == -1) {
                            c0498p.i(i4, new C1010z0(nVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                c0498p.i(i4, new C1010z0(nVar2, region2.getBounds()));
                List h3 = z0.n.h(nVar2, true, 4);
                for (int size = h3.size() - 1; -1 < size; size--) {
                    m(region, nVar, c0498p, (z0.n) h3.get(size), region2);
                }
                if (p(nVar2)) {
                    region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final B0.z n(z0.i iVar) {
        Y1.c cVar;
        ArrayList arrayList = new ArrayList();
        Object obj = iVar.f8982d.get(z0.h.f8957a);
        if (obj == null) {
            obj = null;
        }
        C1076a c1076a = (C1076a) obj;
        if (c1076a == null || (cVar = (Y1.c) c1076a.f8943b) == null || !((Boolean) cVar.j(arrayList)).booleanValue()) {
            return null;
        }
        return (B0.z) arrayList.get(0);
    }

    public static final boolean o(float[] fArr, float[] fArr2) {
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

    public static final boolean p(z0.n nVar) {
        z0.i iVar = nVar.f8991d;
        if (!iVar.f8983e) {
            Set keySet = iVar.f8982d.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    if (((z0.t) it.next()).f9039c) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean q(AbstractC0257H abstractC0257H, float f3, float f4, InterfaceC0258I interfaceC0258I, InterfaceC0258I interfaceC0258I2) {
        boolean s3;
        if (!(abstractC0257H instanceof C0255F)) {
            if (!(abstractC0257H instanceof C0256G)) {
                if (abstractC0257H instanceof C0254E) {
                    return r(((C0254E) abstractC0257H).f4211a, f3, f4, interfaceC0258I, interfaceC0258I2);
                }
                throw new L1.f();
            }
            a0.e eVar = ((C0256G) abstractC0257H).f4213a;
            float f5 = eVar.f3495a;
            if (f3 < f5) {
                return false;
            }
            float f6 = eVar.f3497c;
            if (f3 >= f6) {
                return false;
            }
            float f7 = eVar.f3496b;
            if (f4 < f7) {
                return false;
            }
            float f8 = eVar.f3498d;
            if (f4 >= f8) {
                return false;
            }
            long j3 = eVar.f3499e;
            float b2 = AbstractC0158a.b(j3);
            long j4 = eVar.f3500f;
            if (AbstractC0158a.b(j4) + b2 <= eVar.b()) {
                long j5 = eVar.f3502h;
                float b3 = AbstractC0158a.b(j5);
                long j6 = eVar.f3501g;
                if (AbstractC0158a.b(j6) + b3 <= eVar.b()) {
                    if (AbstractC0158a.c(j5) + AbstractC0158a.c(j3) <= eVar.a()) {
                        if (AbstractC0158a.c(j6) + AbstractC0158a.c(j4) <= eVar.a()) {
                            float b4 = AbstractC0158a.b(j3) + f5;
                            float c3 = AbstractC0158a.c(j3) + f7;
                            float b5 = f6 - AbstractC0158a.b(j4);
                            float c4 = f7 + AbstractC0158a.c(j4);
                            float b6 = f6 - AbstractC0158a.b(j6);
                            float c5 = f8 - AbstractC0158a.c(j6);
                            float c6 = f8 - AbstractC0158a.c(j5);
                            float b7 = AbstractC0158a.b(j5) + f5;
                            if (f3 < b4 && f4 < c3) {
                                s3 = s(f3, f4, eVar.f3499e, b4, c3);
                            } else if (f3 < b7 && f4 > c6) {
                                s3 = s(f3, f4, eVar.f3502h, b7, c6);
                            } else if (f3 > b5 && f4 < c4) {
                                s3 = s(f3, f4, eVar.f3500f, b5, c4);
                            } else if (f3 > b6 && f4 > c5) {
                                s3 = s(f3, f4, eVar.f3501g, b6, c5);
                            }
                            return s3;
                        }
                    }
                }
            }
            InterfaceC0258I g3 = interfaceC0258I2 == null ? AbstractC0259J.g() : interfaceC0258I2;
            InterfaceC0258I.a(g3, eVar);
            return r(g3, f3, f4, interfaceC0258I, interfaceC0258I2);
        }
        a0.d dVar = ((C0255F) abstractC0257H).f4212a;
        if (dVar.f3491a > f3 || f3 >= dVar.f3493c || dVar.f3492b > f4 || f4 >= dVar.f3494d) {
            return false;
        }
        return true;
    }

    public static final boolean r(InterfaceC0258I interfaceC0258I, float f3, float f4, InterfaceC0258I interfaceC0258I2, InterfaceC0258I interfaceC0258I3) {
        a0.d dVar = new a0.d(f3 - 0.005f, f4 - 0.005f, f3 + 0.005f, f4 + 0.005f);
        if (interfaceC0258I2 == null) {
            interfaceC0258I2 = AbstractC0259J.g();
        }
        InterfaceC0258I.b(interfaceC0258I2, dVar);
        if (interfaceC0258I3 == null) {
            interfaceC0258I3 = AbstractC0259J.g();
        }
        C0278k c0278k = (C0278k) interfaceC0258I3;
        c0278k.g(interfaceC0258I, interfaceC0258I2, 1);
        boolean isEmpty = c0278k.f4278a.isEmpty();
        c0278k.h();
        ((C0278k) interfaceC0258I2).h();
        return !isEmpty;
    }

    public static final boolean s(float f3, float f4, long j3, float f5, float f6) {
        float f7 = f3 - f5;
        float f8 = f4 - f6;
        float b2 = AbstractC0158a.b(j3);
        float c3 = AbstractC0158a.c(j3);
        return ((f8 * f8) / (c3 * c3)) + ((f7 * f7) / (b2 * b2)) <= 1.0f;
    }

    public static final void t(float[] fArr, float[] fArr2) {
        float k3 = k(fArr2, 0, fArr, 0);
        float k4 = k(fArr2, 0, fArr, 1);
        float k5 = k(fArr2, 0, fArr, 2);
        float k6 = k(fArr2, 0, fArr, 3);
        float k7 = k(fArr2, 1, fArr, 0);
        float k8 = k(fArr2, 1, fArr, 1);
        float k9 = k(fArr2, 1, fArr, 2);
        float k10 = k(fArr2, 1, fArr, 3);
        float k11 = k(fArr2, 2, fArr, 0);
        float k12 = k(fArr2, 2, fArr, 1);
        float k13 = k(fArr2, 2, fArr, 2);
        float k14 = k(fArr2, 2, fArr, 3);
        float k15 = k(fArr2, 3, fArr, 0);
        float k16 = k(fArr2, 3, fArr, 1);
        float k17 = k(fArr2, 3, fArr, 2);
        float k18 = k(fArr2, 3, fArr, 3);
        fArr[0] = k3;
        fArr[1] = k4;
        fArr[2] = k5;
        fArr[3] = k6;
        fArr[4] = k7;
        fArr[5] = k8;
        fArr[6] = k9;
        fArr[7] = k10;
        fArr[8] = k11;
        fArr[9] = k12;
        fArr[10] = k13;
        fArr[11] = k14;
        fArr[12] = k15;
        fArr[13] = k16;
        fArr[14] = k17;
        fArr[15] = k18;
    }

    public static final void u(V v3, int i3) {
        Object obj;
        Iterator<T> it = v3.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((t0.D) ((Map.Entry) obj).getKey()).f7717e == i3) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null && entry.getValue() != null) {
            throw new ClassCastException();
        }
    }

    public static final String v(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String w(int i3) {
        if (z0.f.a(i3, 0)) {
            return "android.widget.Button";
        }
        if (z0.f.a(i3, 1)) {
            return "android.widget.CheckBox";
        }
        if (z0.f.a(i3, 3)) {
            return "android.widget.RadioButton";
        }
        if (z0.f.a(i3, 5)) {
            return "android.widget.ImageView";
        }
        if (z0.f.a(i3, 6)) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static void x(View view) {
        try {
            if (!F0.f8161v) {
                F0.f8161v = true;
                if (Build.VERSION.SDK_INT < 28) {
                    F0.f8159t = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    F0.f8160u = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    F0.f8159t = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    F0.f8160u = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = F0.f8159t;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = F0.f8160u;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = F0.f8160u;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = F0.f8159t;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            F0.f8162w = true;
        }
    }
}
