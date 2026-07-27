package s0;

import Z.C0313j;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import p0.AbstractC0960V;
import p0.InterfaceC0980p;
import r0.AbstractC1065f;
import r0.InterfaceC1072m;
import y0.C1317a;
import y2.C1338m;
import y2.InterfaceC1332g;

/* renamed from: s0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1125K implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f10065a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: b, reason: collision with root package name */
    public static final Y.d f10066b = new Y.d(0.0f, 0.0f, 10.0f, 10.0f);

    public static final boolean a(y0.n nVar) {
        y0.i i2 = nVar.i();
        return !i2.f11576d.containsKey(y0.q.f11620i);
    }

    public static final boolean b(y0.n nVar) {
        return nVar.f11586c.f9611x == M0.k.f3556e;
    }

    public static final boolean c(Object obj) {
        if (obj instanceof Q.s) {
            Q.s sVar = (Q.s) obj;
            if (sVar.a() != G.W.f2776i && sVar.a() != G.W.f2779l && sVar.a() != G.W.f2777j) {
                return false;
            }
            Object value = sVar.getValue();
            if (value == null) {
                return true;
            }
            return c(value);
        }
        if ((obj instanceof InterfaceC1332g) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = f10065a;
        for (int i2 = 0; i2 < 7; i2++) {
            if (clsArr[i2].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static final float d(float[] fArr, int i2, float[] fArr2, int i4) {
        int i5 = i2 * 4;
        return (fArr[i5 + 3] * fArr2[12 + i4]) + (fArr[i5 + 2] * fArr2[8 + i4]) + (fArr[i5 + 1] * fArr2[4 + i4]) + (fArr[i5] * fArr2[i4]);
    }

    public static final i.q e(y0.o oVar) {
        y0.n a4 = oVar.a();
        i.q qVar = i.j.f6922a;
        i.q qVar2 = new i.q();
        r0.E e4 = a4.f11586c;
        if (e4.E() && e4.D()) {
            Y.d e5 = a4.e();
            f(new Region(Math.round(e5.f4374a), Math.round(e5.f4375b), Math.round(e5.f4376c), Math.round(e5.f4377d)), a4, qVar2, a4, new Region());
        }
        return qVar2;
    }

    public static final void f(Region region, y0.n nVar, i.q qVar, y0.n nVar2, Region region2) {
        r0.E e4;
        InterfaceC1072m v4;
        boolean E3 = nVar2.f11586c.E();
        r0.E e5 = nVar2.f11586c;
        boolean z4 = (E3 && e5.D()) ? false : true;
        boolean isEmpty = region.isEmpty();
        int i2 = nVar.f11590g;
        int i4 = nVar2.f11590g;
        if (!isEmpty || i4 == i2) {
            if (!z4 || nVar2.f11588e) {
                y0.i iVar = nVar2.f11587d;
                boolean z5 = iVar.f11577e;
                InterfaceC1072m interfaceC1072m = nVar2.f11584a;
                if (z5 && (v4 = AbstractC0864b.v(e5)) != null) {
                    interfaceC1072m = v4;
                }
                S.n nVar3 = ((S.n) interfaceC1072m).f3978d;
                Object obj = iVar.f11576d.get(y0.h.f11551b);
                if (obj == null) {
                    obj = null;
                }
                boolean z6 = obj != null;
                boolean z7 = nVar3.f3978d.f3990s;
                Y.d dVar = Y.d.f4373e;
                if (z7) {
                    if (z6) {
                        r0.a0 t4 = AbstractC1065f.t(nVar3, 8);
                        if (t4.O0().f3990s) {
                            InterfaceC0980p g4 = AbstractC0960V.g(t4);
                            Y.b bVar = t4.f9756E;
                            if (bVar == null) {
                                bVar = new Y.b();
                                bVar.f4368a = 0.0f;
                                bVar.f4369b = 0.0f;
                                bVar.f4370c = 0.0f;
                                bVar.f4371d = 0.0f;
                                t4.f9756E = bVar;
                            }
                            long E02 = t4.E0(t4.N0());
                            bVar.f4368a = -Y.f.d(E02);
                            bVar.f4369b = -Y.f.b(E02);
                            bVar.f4370c = Y.f.d(E02) + t4.g0();
                            bVar.f4371d = Y.f.b(E02) + t4.f0();
                            while (true) {
                                if (t4 == g4) {
                                    dVar = new Y.d(bVar.f4368a, bVar.f4369b, bVar.f4370c, bVar.f4371d);
                                    break;
                                }
                                t4.c1(bVar, false, true);
                                if (bVar.b()) {
                                    break;
                                }
                                t4 = t4.f9764t;
                                Intrinsics.c(t4);
                            }
                        }
                    } else {
                        r0.a0 t5 = AbstractC1065f.t(nVar3, 8);
                        dVar = AbstractC0960V.g(t5).n(t5, true);
                    }
                }
                int round = Math.round(dVar.f4374a);
                int round2 = Math.round(dVar.f4375b);
                int round3 = Math.round(dVar.f4376c);
                int round4 = Math.round(dVar.f4377d);
                region2.set(round, round2, round3, round4);
                if (i4 == i2) {
                    i4 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (nVar2.f11588e) {
                        y0.n j4 = nVar2.j();
                        Y.d e6 = (j4 == null || (e4 = j4.f11586c) == null || !e4.E()) ? f10066b : j4.e();
                        qVar.i(i4, new K0(nVar2, new Rect(Math.round(e6.f4374a), Math.round(e6.f4375b), Math.round(e6.f4376c), Math.round(e6.f4377d))));
                        return;
                    } else {
                        if (i4 == -1) {
                            qVar.i(i4, new K0(nVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                qVar.i(i4, new K0(nVar2, region2.getBounds()));
                List h4 = y0.n.h(nVar2, true, 4);
                for (int size = h4.size() - 1; -1 < size; size--) {
                    f(region, nVar, qVar, (y0.n) h4.get(size), region2);
                }
                if (i(nVar2)) {
                    region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final A0.I g(y0.i iVar) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        Object obj = iVar.f11576d.get(y0.h.f11550a);
        if (obj == null) {
            obj = null;
        }
        C1317a c1317a = (C1317a) obj;
        if (c1317a == null || (function1 = (Function1) c1317a.f11536b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (A0.I) arrayList.get(0);
    }

    public static final boolean h(float[] fArr, float[] fArr2) {
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[3];
        float f8 = fArr[4];
        float f9 = fArr[5];
        float f10 = fArr[6];
        float f11 = fArr[7];
        float f12 = fArr[8];
        float f13 = fArr[9];
        float f14 = fArr[10];
        float f15 = fArr[11];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[14];
        float f19 = fArr[15];
        float f20 = (f4 * f9) - (f5 * f8);
        float f21 = (f4 * f10) - (f6 * f8);
        float f22 = (f4 * f11) - (f7 * f8);
        float f23 = (f5 * f10) - (f6 * f9);
        float f24 = (f5 * f11) - (f7 * f9);
        float f25 = (f6 * f11) - (f7 * f10);
        float f26 = (f12 * f17) - (f13 * f16);
        float f27 = (f12 * f18) - (f14 * f16);
        float f28 = (f12 * f19) - (f15 * f16);
        float f29 = (f13 * f18) - (f14 * f17);
        float f30 = (f13 * f19) - (f15 * f17);
        float f31 = (f14 * f19) - (f15 * f18);
        float f32 = (f25 * f26) + (((f23 * f28) + ((f22 * f29) + ((f20 * f31) - (f21 * f30)))) - (f24 * f27));
        if (f32 == 0.0f) {
            return false;
        }
        float f33 = 1.0f / f32;
        fArr2[0] = ((f11 * f29) + ((f9 * f31) - (f10 * f30))) * f33;
        fArr2[1] = (((f6 * f30) + ((-f5) * f31)) - (f7 * f29)) * f33;
        fArr2[2] = ((f19 * f23) + ((f17 * f25) - (f18 * f24))) * f33;
        fArr2[3] = (((f14 * f24) + ((-f13) * f25)) - (f15 * f23)) * f33;
        float f34 = -f8;
        fArr2[4] = (((f10 * f28) + (f34 * f31)) - (f11 * f27)) * f33;
        fArr2[5] = ((f7 * f27) + ((f31 * f4) - (f6 * f28))) * f33;
        float f35 = -f16;
        fArr2[6] = (((f18 * f22) + (f35 * f25)) - (f19 * f21)) * f33;
        fArr2[7] = ((f15 * f21) + ((f25 * f12) - (f14 * f22))) * f33;
        fArr2[8] = ((f11 * f26) + ((f8 * f30) - (f9 * f28))) * f33;
        fArr2[9] = (((f28 * f5) + ((-f4) * f30)) - (f7 * f26)) * f33;
        fArr2[10] = ((f19 * f20) + ((f16 * f24) - (f17 * f22))) * f33;
        fArr2[11] = (((f22 * f13) + ((-f12) * f24)) - (f15 * f20)) * f33;
        fArr2[12] = (((f9 * f27) + (f34 * f29)) - (f10 * f26)) * f33;
        fArr2[13] = ((f6 * f26) + ((f4 * f29) - (f5 * f27))) * f33;
        fArr2[14] = (((f17 * f21) + (f35 * f23)) - (f18 * f20)) * f33;
        fArr2[15] = ((f14 * f20) + ((f12 * f23) - (f13 * f21))) * f33;
        return true;
    }

    public static final boolean i(y0.n nVar) {
        y0.i iVar = nVar.f11587d;
        if (!iVar.f11577e) {
            Set keySet = iVar.f11576d.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    if (((y0.t) it.next()).f11642c) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean j(Z.I i2, float f4, float f5, Z.J j4, Z.J j5) {
        boolean l4;
        if (!(i2 instanceof Z.G)) {
            if (!(i2 instanceof Z.H)) {
                if (i2 instanceof Z.F) {
                    return k(((Z.F) i2).f4457a, f4, f5, j4, j5);
                }
                throw new C1338m();
            }
            Y.e eVar = ((Z.H) i2).f4459a;
            float f6 = eVar.f4378a;
            if (f4 < f6) {
                return false;
            }
            float f7 = eVar.f4380c;
            if (f4 >= f7) {
                return false;
            }
            float f8 = eVar.f4379b;
            if (f5 < f8) {
                return false;
            }
            float f9 = eVar.f4381d;
            if (f5 >= f9) {
                return false;
            }
            long j6 = eVar.f4382e;
            float b4 = Y.a.b(j6);
            long j7 = eVar.f4383f;
            if (Y.a.b(j7) + b4 <= eVar.b()) {
                long j8 = eVar.f4385h;
                float b5 = Y.a.b(j8);
                long j9 = eVar.f4384g;
                if (Y.a.b(j9) + b5 <= eVar.b()) {
                    if (Y.a.c(j8) + Y.a.c(j6) <= eVar.a()) {
                        if (Y.a.c(j9) + Y.a.c(j7) <= eVar.a()) {
                            float b6 = Y.a.b(j6) + f6;
                            float c4 = Y.a.c(j6) + f8;
                            float b7 = f7 - Y.a.b(j7);
                            float c5 = f8 + Y.a.c(j7);
                            float b8 = f7 - Y.a.b(j9);
                            float c6 = f9 - Y.a.c(j9);
                            float c7 = f9 - Y.a.c(j8);
                            float b9 = Y.a.b(j8) + f6;
                            if (f4 < b6 && f5 < c4) {
                                l4 = l(f4, f5, eVar.f4382e, b6, c4);
                            } else if (f4 < b9 && f5 > c7) {
                                l4 = l(f4, f5, eVar.f4385h, b9, c7);
                            } else if (f4 > b7 && f5 < c5) {
                                l4 = l(f4, f5, eVar.f4383f, b7, c5);
                            } else if (f4 > b8 && f5 > c6) {
                                l4 = l(f4, f5, eVar.f4384g, b8, c6);
                            }
                            return l4;
                        }
                    }
                }
            }
            Z.J h4 = j5 == null ? Z.K.h() : j5;
            Z.J.a(h4, eVar);
            return k(h4, f4, f5, j4, j5);
        }
        Y.d dVar = ((Z.G) i2).f4458a;
        if (dVar.f4374a > f4 || f4 >= dVar.f4376c || dVar.f4375b > f5 || f5 >= dVar.f4377d) {
            return false;
        }
        return true;
    }

    public static final boolean k(Z.J j4, float f4, float f5, Z.J j5, Z.J j6) {
        Y.d dVar = new Y.d(f4 - 0.005f, f5 - 0.005f, f4 + 0.005f, f5 + 0.005f);
        if (j5 == null) {
            j5 = Z.K.h();
        }
        Z.J.b(j5, dVar);
        if (j6 == null) {
            j6 = Z.K.h();
        }
        C0313j c0313j = (C0313j) j6;
        c0313j.d(j4, j5, 1);
        boolean isEmpty = c0313j.f4530a.isEmpty();
        c0313j.e();
        ((C0313j) j5).e();
        return !isEmpty;
    }

    public static final boolean l(float f4, float f5, long j4, float f6, float f7) {
        float f8 = f4 - f6;
        float f9 = f5 - f7;
        float b4 = Y.a.b(j4);
        float c4 = Y.a.c(j4);
        return ((f9 * f9) / (c4 * c4)) + ((f8 * f8) / (b4 * b4)) <= 1.0f;
    }

    public static final void m(float[] fArr, float[] fArr2) {
        float d4 = d(fArr2, 0, fArr, 0);
        float d5 = d(fArr2, 0, fArr, 1);
        float d6 = d(fArr2, 0, fArr, 2);
        float d7 = d(fArr2, 0, fArr, 3);
        float d8 = d(fArr2, 1, fArr, 0);
        float d9 = d(fArr2, 1, fArr, 1);
        float d10 = d(fArr2, 1, fArr, 2);
        float d11 = d(fArr2, 1, fArr, 3);
        float d12 = d(fArr2, 2, fArr, 0);
        float d13 = d(fArr2, 2, fArr, 1);
        float d14 = d(fArr2, 2, fArr, 2);
        float d15 = d(fArr2, 2, fArr, 3);
        float d16 = d(fArr2, 3, fArr, 0);
        float d17 = d(fArr2, 3, fArr, 1);
        float d18 = d(fArr2, 3, fArr, 2);
        float d19 = d(fArr2, 3, fArr, 3);
        fArr[0] = d4;
        fArr[1] = d5;
        fArr[2] = d6;
        fArr[3] = d7;
        fArr[4] = d8;
        fArr[5] = d9;
        fArr[6] = d10;
        fArr[7] = d11;
        fArr[8] = d12;
        fArr[9] = d13;
        fArr[10] = d14;
        fArr[11] = d15;
        fArr[12] = d16;
        fArr[13] = d17;
        fArr[14] = d18;
        fArr[15] = d19;
    }

    public static final void n(C1132a0 c1132a0, int i2) {
        Object obj;
        Iterator<T> it = c1132a0.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r0.E) ((Map.Entry) obj).getKey()).f9595e == i2) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null && entry.getValue() != null) {
            throw new ClassCastException();
        }
    }

    public static final String o(Object obj) {
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append('@');
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }

    public static final String p(int i2) {
        if (y0.f.a(i2, 0)) {
            return "android.widget.Button";
        }
        if (y0.f.a(i2, 1)) {
            return "android.widget.CheckBox";
        }
        if (y0.f.a(i2, 3)) {
            return "android.widget.RadioButton";
        }
        if (y0.f.a(i2, 5)) {
            return "android.widget.ImageView";
        }
        if (y0.f.a(i2, 6)) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static void q(View view) {
        try {
            if (!R0.f10115y) {
                R0.f10115y = true;
                if (Build.VERSION.SDK_INT < 28) {
                    R0.f10113w = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    R0.f10114x = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    R0.f10113w = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    R0.f10114x = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = R0.f10113w;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = R0.f10114x;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = R0.f10114x;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = R0.f10113w;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            R0.f10116z = true;
        }
    }
}
