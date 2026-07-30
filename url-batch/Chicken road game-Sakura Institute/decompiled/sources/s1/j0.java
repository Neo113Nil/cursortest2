package s1;

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

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class j0 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f8245a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: b, reason: collision with root package name */
    public static final y0.d f8246b = new y0.d(0.0f, 0.0f, 10.0f, 10.0f);

    public static final String A(int i7) {
        if (i7 == 0) {
            return "android.widget.Button";
        }
        if (i7 == 1) {
            return "android.widget.CheckBox";
        }
        if (i7 == 3) {
            return "android.widget.RadioButton";
        }
        if (i7 == 5) {
            return "android.widget.ImageView";
        }
        if (i7 == 6) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static void B(View view) {
        try {
            if (!n2.f8315x) {
                n2.f8315x = true;
                if (Build.VERSION.SDK_INT < 28) {
                    n2.f8313v = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    n2.f8314w = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    n2.f8313v = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    n2.f8314w = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = n2.f8313v;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = n2.f8314w;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = n2.f8314w;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = n2.f8313v;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            n2.f8316y = true;
        }
    }

    public static final boolean l(y1.m mVar) {
        y1.i i7 = mVar.i();
        return !i7.f9832f.containsKey(y1.p.f9867i);
    }

    public static final boolean m(y1.m mVar) {
        return mVar.f9839c.f7736w == m2.k.f6323g;
    }

    public static final boolean n(Object obj) {
        if (obj instanceof q0.o) {
            q0.o oVar = (q0.o) obj;
            if (oVar.b() == g0.t0.f3900h || oVar.b() == g0.t0.f3903k || oVar.b() == g0.t0.f3901i) {
                Object value = oVar.getValue();
                if (value == null) {
                    return true;
                }
                return n(value);
            }
        } else {
            if ((obj instanceof d6.e) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i7 = 0; i7 < 7; i7++) {
                if (f8245a[i7].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final float o(float[] fArr, int i7, float[] fArr2, int i8) {
        int i9 = i7 * 4;
        return (fArr[i9 + 3] * fArr2[12 + i8]) + (fArr[i9 + 2] * fArr2[8 + i8]) + (fArr[i9 + 1] * fArr2[4 + i8]) + (fArr[i9] * fArr2[i8]);
    }

    public static final i.p p(y1.n nVar) {
        y1.m a3 = nVar.a();
        i.p pVar = i.i.f4750a;
        i.p pVar2 = new i.p();
        r1.d0 d0Var = a3.f9839c;
        if (d0Var.F() && d0Var.E()) {
            y0.d e9 = a3.e();
            q(new Region(Math.round(e9.f9780a), Math.round(e9.f9781b), Math.round(e9.f9782c), Math.round(e9.f9783d)), a3, pVar2, a3, new Region());
        }
        return pVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(Region region, y1.m mVar, i.p pVar, y1.m mVar2, Region region2) {
        y0.d dVar;
        r1.d0 d0Var;
        r1.l h3;
        int i7 = mVar.f9843g;
        r1.d0 d0Var2 = mVar2.f9839c;
        int i8 = mVar2.f9843g;
        boolean z8 = (d0Var2.F() && d0Var2.E()) ? false : true;
        if (region.isEmpty() && i8 != i7) {
            return;
        }
        if (z8 && !mVar2.f9841e) {
            return;
        }
        r1.l lVar = mVar2.f9837a;
        y1.i iVar = mVar2.f9840d;
        if (iVar.f9833g && (h3 = u3.q.h(d0Var2)) != null) {
            lVar = h3;
        }
        s0.n nVar = ((s0.n) lVar).f8104f;
        Object obj = iVar.f9832f.get(y1.h.f9807b);
        if (obj == null) {
            obj = null;
        }
        boolean z9 = obj != null;
        if (nVar.f8104f.f8116r) {
            if (z9) {
                r1.a1 r8 = r1.f.r(nVar, 8);
                if (r8.M0().f8116r) {
                    p1.p f9 = p1.s0.f(r8);
                    y0.b bVar = r8.D;
                    if (bVar == null) {
                        bVar = new y0.b();
                        bVar.f9774a = 0.0f;
                        bVar.f9775b = 0.0f;
                        bVar.f9776c = 0.0f;
                        bVar.f9777d = 0.0f;
                        r8.D = bVar;
                    }
                    long C0 = r8.C0(r8.L0());
                    bVar.f9774a = -y0.f.d(C0);
                    bVar.f9775b = -y0.f.b(C0);
                    bVar.f9776c = y0.f.d(C0) + r8.h0();
                    bVar.f9777d = y0.f.b(C0) + ((int) (r8.f7065h & 4294967295L));
                    while (r8 != f9) {
                        r8.a1(bVar, false, true);
                        if (!bVar.b()) {
                            r8 = r8.f7702s;
                            r6.k.c(r8);
                        }
                    }
                    dVar = new y0.d(bVar.f9774a, bVar.f9775b, bVar.f9776c, bVar.f9777d);
                }
            } else {
                r1.a1 r9 = r1.f.r(nVar, 8);
                dVar = p1.s0.f(r9).h(r9, true);
            }
            int round = Math.round(dVar.f9780a);
            int round2 = Math.round(dVar.f9781b);
            int round3 = Math.round(dVar.f9782c);
            int round4 = Math.round(dVar.f9783d);
            region2.set(round, round2, round3, round4);
            if (i8 == i7) {
                i8 = -1;
            }
            if (region2.op(region, Region.Op.INTERSECT)) {
                if (mVar2.f9841e) {
                    y1.m j8 = mVar2.j();
                    y0.d e9 = (j8 == null || (d0Var = j8.f9839c) == null || !d0Var.F()) ? f8246b : j8.e();
                    pVar.i(i8, new g2(mVar2, new Rect(Math.round(e9.f9780a), Math.round(e9.f9781b), Math.round(e9.f9782c), Math.round(e9.f9783d))));
                    return;
                } else {
                    if (i8 == -1) {
                        pVar.i(i8, new g2(mVar2, region2.getBounds()));
                        return;
                    }
                    return;
                }
            }
            pVar.i(i8, new g2(mVar2, region2.getBounds()));
            List h8 = y1.m.h(mVar2, 4);
            for (int size = h8.size() - 1; -1 < size; size--) {
                q(region, mVar, pVar, (y1.m) h8.get(size), region2);
            }
            if (t(mVar2)) {
                region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                return;
            }
            return;
        }
        dVar = y0.d.f9779e;
        int round5 = Math.round(dVar.f9780a);
        int round22 = Math.round(dVar.f9781b);
        int round32 = Math.round(dVar.f9782c);
        int round42 = Math.round(dVar.f9783d);
        region2.set(round5, round22, round32, round42);
        if (i8 == i7) {
        }
        if (region2.op(region, Region.Op.INTERSECT)) {
        }
    }

    public static final a2.h0 r(y1.i iVar) {
        q6.c cVar;
        ArrayList arrayList = new ArrayList();
        Object obj = iVar.f9832f.get(y1.h.f9806a);
        if (obj == null) {
            obj = null;
        }
        y1.a aVar = (y1.a) obj;
        if (aVar == null || (cVar = (q6.c) aVar.f9794b) == null || !((Boolean) cVar.f(arrayList)).booleanValue()) {
            return null;
        }
        return (a2.h0) arrayList.get(0);
    }

    public static final boolean s(float[] fArr, float[] fArr2) {
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[9];
        float f19 = fArr[10];
        float f20 = fArr[11];
        float f21 = fArr[12];
        float f22 = fArr[13];
        float f23 = fArr[14];
        float f24 = fArr[15];
        float f25 = (f9 * f14) - (f10 * f13);
        float f26 = (f9 * f15) - (f11 * f13);
        float f27 = (f9 * f16) - (f12 * f13);
        float f28 = (f10 * f15) - (f11 * f14);
        float f29 = (f10 * f16) - (f12 * f14);
        float f30 = (f11 * f16) - (f12 * f15);
        float f31 = (f17 * f22) - (f18 * f21);
        float f32 = (f17 * f23) - (f19 * f21);
        float f33 = (f17 * f24) - (f20 * f21);
        float f34 = (f18 * f23) - (f19 * f22);
        float f35 = (f18 * f24) - (f20 * f22);
        float f36 = (f19 * f24) - (f20 * f23);
        float f37 = (f30 * f31) + (((f28 * f33) + ((f27 * f34) + ((f25 * f36) - (f26 * f35)))) - (f29 * f32));
        if (f37 == 0.0f) {
            return false;
        }
        float f38 = 1.0f / f37;
        fArr2[0] = ((f16 * f34) + ((f14 * f36) - (f15 * f35))) * f38;
        fArr2[1] = (((f11 * f35) + ((-f10) * f36)) - (f12 * f34)) * f38;
        fArr2[2] = ((f24 * f28) + ((f22 * f30) - (f23 * f29))) * f38;
        fArr2[3] = (((f19 * f29) + ((-f18) * f30)) - (f20 * f28)) * f38;
        float f39 = -f13;
        fArr2[4] = (((f15 * f33) + (f39 * f36)) - (f16 * f32)) * f38;
        fArr2[5] = ((f12 * f32) + ((f36 * f9) - (f11 * f33))) * f38;
        float f40 = -f21;
        fArr2[6] = (((f23 * f27) + (f40 * f30)) - (f24 * f26)) * f38;
        fArr2[7] = ((f20 * f26) + ((f30 * f17) - (f19 * f27))) * f38;
        fArr2[8] = ((f16 * f31) + ((f13 * f35) - (f14 * f33))) * f38;
        fArr2[9] = (((f33 * f10) + ((-f9) * f35)) - (f12 * f31)) * f38;
        fArr2[10] = ((f24 * f25) + ((f21 * f29) - (f22 * f27))) * f38;
        fArr2[11] = (((f27 * f18) + ((-f17) * f29)) - (f20 * f25)) * f38;
        fArr2[12] = (((f14 * f32) + (f39 * f34)) - (f15 * f31)) * f38;
        fArr2[13] = ((f11 * f31) + ((f9 * f34) - (f10 * f32))) * f38;
        fArr2[14] = (((f22 * f26) + (f40 * f28)) - (f23 * f25)) * f38;
        fArr2[15] = ((f19 * f25) + ((f17 * f28) - (f18 * f26))) * f38;
        return true;
    }

    public static final boolean t(y1.m mVar) {
        y1.i iVar = mVar.f9840d;
        if (iVar.f9833g) {
            return true;
        }
        Set keySet = iVar.f9832f.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return false;
        }
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            if (((y1.s) it.next()).f9889c) {
                return true;
            }
        }
        return false;
    }

    public static final boolean u(z0.j0 j0Var, float f9, float f10) {
        if (j0Var instanceof z0.h0) {
            y0.d dVar = ((z0.h0) j0Var).f9997a;
            return dVar.f9780a <= f9 && f9 < dVar.f9782c && dVar.f9781b <= f10 && f10 < dVar.f9783d;
        }
        if (!(j0Var instanceof z0.i0)) {
            if (j0Var instanceof z0.g0) {
                return v(((z0.g0) j0Var).f9995a, f9, f10);
            }
            throw new b4.c();
        }
        y0.e eVar = ((z0.i0) j0Var).f10000a;
        float f11 = eVar.f9784a;
        long j8 = eVar.f9789f;
        long j9 = eVar.f9791h;
        long j10 = eVar.f9790g;
        float f12 = eVar.f9787d;
        float f13 = eVar.f9785b;
        float f14 = eVar.f9786c;
        long j11 = eVar.f9788e;
        if (f9 < f11 || f9 >= f14 || f10 < f13 || f10 >= f12) {
            return false;
        }
        if (y0.a.b(j8) + y0.a.b(j11) <= eVar.b()) {
            if (y0.a.b(j10) + y0.a.b(j9) <= eVar.b()) {
                if (y0.a.c(j9) + y0.a.c(j11) <= eVar.a()) {
                    if (y0.a.c(j10) + y0.a.c(j8) <= eVar.a()) {
                        float b9 = y0.a.b(j11) + f11;
                        float c4 = y0.a.c(j11) + f13;
                        float b10 = f14 - y0.a.b(j8);
                        float c6 = y0.a.c(j8) + f13;
                        float b11 = f14 - y0.a.b(j10);
                        float c9 = f12 - y0.a.c(j10);
                        float c10 = f12 - y0.a.c(j9);
                        float b12 = y0.a.b(j9) + f11;
                        if (f9 < b9 && f10 < c4) {
                            return w(f9, f10, eVar.f9788e, b9, c4);
                        }
                        if (f9 < b12 && f10 > c10) {
                            return w(f9, f10, eVar.f9791h, b12, c10);
                        }
                        if (f9 > b10 && f10 < c6) {
                            return w(f9, f10, eVar.f9789f, b10, c6);
                        }
                        if (f9 <= b11 || f10 <= c9) {
                            return true;
                        }
                        return w(f9, f10, eVar.f9790g, b11, c9);
                    }
                }
            }
        }
        z0.j h3 = z0.l0.h();
        z0.k0.a(h3, eVar);
        return v(h3, f9, f10);
    }

    public static final boolean v(z0.k0 k0Var, float f9, float f10) {
        y0.d dVar = new y0.d(f9 - 0.005f, f10 - 0.005f, f9 + 0.005f, f10 + 0.005f);
        z0.j h3 = z0.l0.h();
        z0.k0.b(h3, dVar);
        z0.j h8 = z0.l0.h();
        h8.c(k0Var, h3, 1);
        boolean isEmpty = h8.f10002a.isEmpty();
        h8.d();
        h3.d();
        return !isEmpty;
    }

    public static final boolean w(float f9, float f10, long j8, float f11, float f12) {
        float f13 = f9 - f11;
        float f14 = f10 - f12;
        float b9 = y0.a.b(j8);
        float c4 = y0.a.c(j8);
        return ((f14 * f14) / (c4 * c4)) + ((f13 * f13) / (b9 * b9)) <= 1.0f;
    }

    public static final void x(float[] fArr, float[] fArr2) {
        float o2 = o(fArr2, 0, fArr, 0);
        float o6 = o(fArr2, 0, fArr, 1);
        float o8 = o(fArr2, 0, fArr, 2);
        float o9 = o(fArr2, 0, fArr, 3);
        float o10 = o(fArr2, 1, fArr, 0);
        float o11 = o(fArr2, 1, fArr, 1);
        float o12 = o(fArr2, 1, fArr, 2);
        float o13 = o(fArr2, 1, fArr, 3);
        float o14 = o(fArr2, 2, fArr, 0);
        float o15 = o(fArr2, 2, fArr, 1);
        float o16 = o(fArr2, 2, fArr, 2);
        float o17 = o(fArr2, 2, fArr, 3);
        float o18 = o(fArr2, 3, fArr, 0);
        float o19 = o(fArr2, 3, fArr, 1);
        float o20 = o(fArr2, 3, fArr, 2);
        float o21 = o(fArr2, 3, fArr, 3);
        fArr[0] = o2;
        fArr[1] = o6;
        fArr[2] = o8;
        fArr[3] = o9;
        fArr[4] = o10;
        fArr[5] = o11;
        fArr[6] = o12;
        fArr[7] = o13;
        fArr[8] = o14;
        fArr[9] = o15;
        fArr[10] = o16;
        fArr[11] = o17;
        fArr[12] = o18;
        fArr[13] = o19;
        fArr[14] = o20;
        fArr[15] = o21;
    }

    public static final void y(x0 x0Var, int i7) {
        Object obj;
        Iterator<T> it = x0Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r1.d0) ((Map.Entry) obj).getKey()).f7720g == i7) {
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
