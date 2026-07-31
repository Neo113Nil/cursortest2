package x1;

import android.R;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class g0 implements t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f8413a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(d2.n nVar) {
        d2.j k3 = nVar.k();
        return !k3.f2150d.c(d2.s.i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final View b(View view, View view2, int i) {
        int nextFocusForwardId;
        View h8;
        if (i != 1) {
            if (i == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
                q qVar = new q(nextFocusForwardId, 1);
                View view3 = null;
                while (true) {
                    h8 = h(view, qVar, view3);
                    if (h8 != null || view == view2) {
                        break;
                    }
                    Object parent = view.getParent();
                    if (parent == null || !(parent instanceof View)) {
                        break;
                    }
                    View view4 = (View) parent;
                    view3 = view;
                    view = view4;
                }
                return h8;
            }
        } else if (view.getId() != -1) {
            f1.n nVar = new f1.n(8, view2, view);
            View view5 = null;
            while (true) {
                View h9 = h(view, nVar, view5);
                if (h9 != null || view == view2) {
                    break;
                }
                Object parent2 = view.getParent();
                if (parent2 == null || !(parent2 instanceof View)) {
                    break;
                }
                View view6 = (View) parent2;
                view5 = view;
                view = view6;
            }
            return null;
        }
        return null;
    }

    public static final boolean c(d2.n nVar, Resources resources) {
        Object g3 = nVar.f2159d.f2150d.g(d2.s.f2188a);
        if (g3 == null) {
            g3 = null;
        }
        List list = (List) g3;
        return !d2.q.e(nVar) && (nVar.f2159d.f2152f || (nVar.o() && ((list != null ? (String) d6.m.S(list) : null) != null || k(nVar) != null || j(nVar, resources) != null || i(nVar))));
    }

    public static final void d(View view, ArrayList arrayList, boolean z3) {
        int i;
        boolean z7 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z3 || view.isFocusableInTouchMode());
        if (!(view instanceof ViewGroup)) {
            if (z7) {
                arrayList.add(view);
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z8 = viewGroup.getDescendantFocusability() == 131072;
        if (z7 && z8) {
            arrayList.add(view);
        }
        if (viewGroup.getDescendantFocusability() != 393216) {
            int childCount = viewGroup.getChildCount();
            View[] viewArr = new View[childCount];
            for (int i8 = 0; i8 < childCount; i8++) {
                viewArr[i8] = viewGroup.getChildAt(i8);
            }
            o.e0 e0Var = h1.f8444a;
            boolean z9 = viewGroup.getLayoutDirection() == 1;
            a0.a aVar = h1.f8449f;
            o.e0 e0Var2 = h1.f8444a;
            o.j0 j0Var = h1.f8447d;
            if (childCount < 2) {
                i = 0;
            } else {
                int i9 = childCount - e0Var2.f5443b;
                i = 0;
                for (int i10 = 0; i10 < i9; i10++) {
                    e0Var2.a(new Rect());
                }
                for (int i11 = 0; i11 < childCount; i11++) {
                    View view2 = viewArr[i11];
                    int i12 = h1.f8445b;
                    h1.f8445b = i12 + 1;
                    Rect rect = (Rect) e0Var2.e(i12);
                    view2.getDrawingRect(rect);
                    viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                    j0Var.m(view2, rect);
                }
                a0.a aVar2 = h1.f8448e;
                q6.i.e(aVar2, "comparator");
                if (childCount > 1) {
                    Arrays.sort(viewArr, aVar2);
                }
                Object g3 = j0Var.g(viewArr[0]);
                q6.i.b(g3);
                int i13 = ((Rect) g3).bottom;
                h1.f8446c = z9 ? -1 : 1;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    Object g7 = j0Var.g(viewArr[i15]);
                    q6.i.b(g7);
                    Rect rect2 = (Rect) g7;
                    if (rect2.top >= i13) {
                        if (i15 - i14 > 1) {
                            d6.l.Q(viewArr, aVar, i14, i15);
                        }
                        i13 = rect2.bottom;
                        i14 = i15;
                    } else {
                        i13 = Math.max(i13, rect2.bottom);
                    }
                }
                if (childCount - i14 > 1) {
                    d6.l.Q(viewArr, aVar, i14, childCount);
                }
                h1.f8445b = 0;
                j0Var.a();
            }
            for (int i16 = i; i16 < childCount; i16++) {
                d(viewArr[i16], arrayList, z3);
            }
        }
        if (z7 && !z8 && size == arrayList.size()) {
            arrayList.add(view);
        }
    }

    public static final void e(d2.n nVar, r3.f fVar) {
        d2.j jVar = nVar.f2159d;
        o.j0 j0Var = jVar.f2150d;
        Object g3 = jVar.f2150d.g(d2.s.f2209w);
        if (g3 == null) {
            g3 = null;
        }
        d2.g gVar = (d2.g) g3;
        if (a(nVar)) {
            if (gVar != null && gVar.f2122a == 8) {
                return;
            }
            Object g7 = j0Var.g(d2.i.f2146w);
            if (g7 == null) {
                g7 = null;
            }
            d2.a aVar = (d2.a) g7;
            if (aVar != null) {
                fVar.b(new r3.d(aVar.f2108a, R.id.accessibilityActionPageUp));
            }
            Object g8 = j0Var.g(d2.i.f2148y);
            if (g8 == null) {
                g8 = null;
            }
            d2.a aVar2 = (d2.a) g8;
            if (aVar2 != null) {
                fVar.b(new r3.d(aVar2.f2108a, R.id.accessibilityActionPageDown));
            }
            Object g9 = j0Var.g(d2.i.f2147x);
            if (g9 == null) {
                g9 = null;
            }
            d2.a aVar3 = (d2.a) g9;
            if (aVar3 != null) {
                fVar.b(new r3.d(aVar3.f2108a, R.id.accessibilityActionPageLeft));
            }
            Object g10 = j0Var.g(d2.i.f2149z);
            d2.a aVar4 = (d2.a) (g10 != null ? g10 : null);
            if (aVar4 != null) {
                fVar.b(new r3.d(aVar4.f2108a, R.id.accessibilityActionPageRight));
            }
        }
    }

    public static final boolean f(Object obj) {
        if (obj instanceof w0.n) {
            w0.n nVar = (w0.n) obj;
            if (nVar.d() == m0.v0.f5133f || nVar.d() == m0.v0.i || nVar.d() == m0.v0.f5134g) {
                Object value = nVar.getValue();
                if (value == null) {
                    return true;
                }
                return f(value);
            }
        } else {
            if ((obj instanceof c6.c) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i = 0; i < 7; i++) {
                if (f8413a[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final float g(float[] fArr, int i, float[] fArr2, int i8) {
        int i9 = i * 4;
        return (fArr[i9 + 3] * fArr2[12 + i8]) + (fArr[i9 + 2] * fArr2[8 + i8]) + (fArr[i9 + 1] * fArr2[4 + i8]) + (fArr[i9] * fArr2[i8]);
    }

    public static final View h(View view, p6.c cVar, View view2) {
        View h8;
        if (((Boolean) cVar.i(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (h8 = h(childAt, cVar, view2)) != null) {
                return h8;
            }
        }
        return null;
    }

    public static final boolean i(d2.n nVar) {
        Object g3 = nVar.f2159d.f2150d.g(d2.s.G);
        if (g3 == null) {
            g3 = null;
        }
        f2.a aVar = (f2.a) g3;
        o.j0 j0Var = nVar.f2159d.f2150d;
        Object g7 = j0Var.g(d2.s.f2209w);
        if (g7 == null) {
            g7 = null;
        }
        d2.g gVar = (d2.g) g7;
        boolean z3 = aVar != null;
        Object g8 = j0Var.g(d2.s.F);
        if (((Boolean) (g8 != null ? g8 : null)) == null || (gVar != null && gVar.f2122a == 4)) {
            return z3;
        }
        return true;
    }

    public static final String j(d2.n nVar, Resources resources) {
        d2.j jVar = nVar.f2159d;
        d2.j jVar2 = nVar.f2159d;
        Object g3 = jVar.f2150d.g(d2.s.f2189b);
        String str = null;
        if (g3 == null) {
            g3 = null;
        }
        o.j0 j0Var = jVar2.f2150d;
        Object g7 = j0Var.g(d2.s.G);
        if (g7 == null) {
            g7 = null;
        }
        f2.a aVar = (f2.a) g7;
        Object g8 = j0Var.g(d2.s.f2209w);
        if (g8 == null) {
            g8 = null;
        }
        d2.g gVar = (d2.g) g8;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new a5.c();
                    }
                    if (g3 == null) {
                        g3 = resources.getString(com.snovikpovik.vuevnxsj.R.string.indeterminate);
                    }
                } else if (gVar != null && gVar.f2122a == 2 && g3 == null) {
                    g3 = resources.getString(com.snovikpovik.vuevnxsj.R.string.state_off);
                }
            } else if (gVar != null && gVar.f2122a == 2 && g3 == null) {
                g3 = resources.getString(com.snovikpovik.vuevnxsj.R.string.state_on);
            }
        }
        Object g9 = j0Var.g(d2.s.F);
        if (g9 == null) {
            g9 = null;
        }
        Boolean bool = (Boolean) g9;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((gVar == null || gVar.f2122a != 4) && g3 == null) {
                g3 = booleanValue ? resources.getString(com.snovikpovik.vuevnxsj.R.string.selected) : resources.getString(com.snovikpovik.vuevnxsj.R.string.not_selected);
            }
        }
        Object g10 = j0Var.g(d2.s.f2190c);
        if (g10 == null) {
            g10 = null;
        }
        d2.f fVar = (d2.f) g10;
        if (fVar != null) {
            if (fVar != d2.f.f2119c) {
                if (g3 == null) {
                    float f6 = fVar.f2121b.f7491a;
                    float f8 = f6 - 0.0f == 0.0f ? 0.0f : (fVar.f2120a - 0.0f) / (f6 - 0.0f);
                    if (f8 < 0.0f) {
                        f8 = 0.0f;
                    }
                    if (f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                    g3 = resources.getString(com.snovikpovik.vuevnxsj.R.string.template_percent, Integer.valueOf(f8 == 0.0f ? 0 : f8 == 1.0f ? 100 : r2.o.t(Math.round(f8 * 100), 1, 99)));
                }
            } else if (g3 == null) {
                g3 = resources.getString(com.snovikpovik.vuevnxsj.R.string.in_progress);
            }
        }
        d2.v vVar = d2.s.D;
        if (j0Var.c(vVar)) {
            o.j0 j0Var2 = new d2.n(nVar.f2156a, true, nVar.f2158c, jVar2).k().f2150d;
            Object g11 = j0Var2.g(d2.s.f2188a);
            if (g11 == null) {
                g11 = null;
            }
            Collection collection = (Collection) g11;
            if (collection == null || collection.isEmpty()) {
                Object g12 = j0Var2.g(d2.s.f2212z);
                if (g12 == null) {
                    g12 = null;
                }
                Collection collection2 = (Collection) g12;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g13 = j0Var2.g(vVar);
                    if (g13 == null) {
                        g13 = null;
                    }
                    CharSequence charSequence = (CharSequence) g13;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(com.snovikpovik.vuevnxsj.R.string.state_empty);
                    }
                }
            }
            g3 = str;
        }
        return (String) g3;
    }

    public static final g2.e k(d2.n nVar) {
        d2.j jVar = nVar.f2159d;
        d2.v vVar = d2.s.f2188a;
        g2.e eVar = (g2.e) d2.q.d(jVar, d2.s.D);
        List list = (List) d2.q.d(nVar.f2159d, d2.s.f2212z);
        return eVar == null ? list != null ? (g2.e) d6.m.S(list) : null : eVar;
    }

    public static boolean l() {
        try {
            if (t.I0 == null) {
                t.I0 = Class.forName("android.os.SystemProperties");
            }
            if (t.J0 == null) {
                Class cls = t.I0;
                t.J0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = t.J0;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return q6.i.a(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final g2.f0 m(d2.j jVar) {
        p6.c cVar;
        ArrayList arrayList = new ArrayList();
        Object g3 = jVar.f2150d.g(d2.i.f2125a);
        if (g3 == null) {
            g3 = null;
        }
        d2.a aVar = (d2.a) g3;
        if (aVar == null || (cVar = (p6.c) aVar.f2109b) == null || !((Boolean) cVar.i(arrayList)).booleanValue()) {
            return null;
        }
        return (g2.f0) arrayList.get(0);
    }

    public static final boolean n(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f6 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float f10 = fArr[3];
        float f11 = fArr[4];
        float f12 = fArr[5];
        float f13 = fArr[6];
        float f14 = fArr[7];
        float f15 = fArr[8];
        float f16 = fArr[9];
        float f17 = fArr[10];
        float f18 = fArr[11];
        float f19 = fArr[12];
        float f20 = fArr[13];
        float f21 = fArr[14];
        float f22 = fArr[15];
        float f23 = (f6 * f12) - (f8 * f11);
        float f24 = (f6 * f13) - (f9 * f11);
        float f25 = (f6 * f14) - (f10 * f11);
        float f26 = (f8 * f13) - (f9 * f12);
        float f27 = (f8 * f14) - (f10 * f12);
        float f28 = (f9 * f14) - (f10 * f13);
        float f29 = (f15 * f20) - (f16 * f19);
        float f30 = (f15 * f21) - (f17 * f19);
        float f31 = (f15 * f22) - (f18 * f19);
        float f32 = (f16 * f21) - (f17 * f20);
        float f33 = (f16 * f22) - (f18 * f20);
        float f34 = (f17 * f22) - (f18 * f21);
        float f35 = (f28 * f29) + (((f26 * f31) + ((f25 * f32) + ((f23 * f34) - (f24 * f33)))) - (f27 * f30));
        if (f35 != 0.0f) {
            float f36 = 1.0f / f35;
            fArr2[0] = ((f14 * f32) + ((f12 * f34) - (f13 * f33))) * f36;
            fArr2[1] = (((f9 * f33) + ((-f8) * f34)) - (f10 * f32)) * f36;
            fArr2[2] = ((f22 * f26) + ((f20 * f28) - (f21 * f27))) * f36;
            fArr2[3] = (((f17 * f27) + ((-f16) * f28)) - (f18 * f26)) * f36;
            float f37 = -f11;
            fArr2[4] = (((f13 * f31) + (f37 * f34)) - (f14 * f30)) * f36;
            fArr2[5] = ((f10 * f30) + ((f34 * f6) - (f9 * f31))) * f36;
            float f38 = -f19;
            fArr2[6] = (((f21 * f25) + (f38 * f28)) - (f22 * f24)) * f36;
            fArr2[7] = ((f18 * f24) + ((f28 * f15) - (f17 * f25))) * f36;
            fArr2[8] = ((f14 * f29) + ((f11 * f33) - (f12 * f31))) * f36;
            fArr2[9] = (((f31 * f8) + ((-f6) * f33)) - (f10 * f29)) * f36;
            fArr2[10] = ((f22 * f23) + ((f19 * f27) - (f20 * f25))) * f36;
            fArr2[11] = (((f25 * f16) + ((-f15) * f27)) - (f18 * f23)) * f36;
            fArr2[12] = (((f12 * f30) + (f37 * f32)) - (f13 * f29)) * f36;
            fArr2[13] = ((f9 * f29) + ((f6 * f32) - (f8 * f30))) * f36;
            fArr2[14] = (((f20 * f24) + (f38 * f26)) - (f21 * f23)) * f36;
            fArr2[15] = ((f17 * f23) + ((f15 * f26) - (f16 * f24))) * f36;
        }
        return !(f35 == 0.0f);
    }

    public static final boolean o(float f6, float f8, f1.j jVar) {
        float f9 = f6 - 0.005f;
        float f10 = f8 - 0.005f;
        float f11 = f6 + 0.005f;
        float f12 = f8 + 0.005f;
        f1.j a8 = f1.l.a();
        if (Float.isNaN(f9) || Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12)) {
            f1.l.b("Invalid rectangle, make sure no value is NaN");
        }
        if (a8.f2670b == null) {
            a8.f2670b = new RectF();
        }
        RectF rectF = a8.f2670b;
        q6.i.b(rectF);
        rectF.set(f9, f10, f11, f12);
        Path path = a8.f2669a;
        RectF rectF2 = a8.f2670b;
        q6.i.b(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
        f1.j a9 = f1.l.a();
        a9.c(jVar, a8, 1);
        boolean isEmpty = a9.f2669a.isEmpty();
        a9.d();
        a8.d();
        return !isEmpty;
    }

    public static final boolean p(float f6, float f8, float f9, float f10, long j7) {
        float f11 = f6 - f9;
        float f12 = f8 - f10;
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        return ((f12 * f12) / (intBitsToFloat2 * intBitsToFloat2)) + ((f11 * f11) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static final void q(float[] fArr, float[] fArr2) {
        float g3 = g(fArr2, 0, fArr, 0);
        float g7 = g(fArr2, 0, fArr, 1);
        float g8 = g(fArr2, 0, fArr, 2);
        float g9 = g(fArr2, 0, fArr, 3);
        float g10 = g(fArr2, 1, fArr, 0);
        float g11 = g(fArr2, 1, fArr, 1);
        float g12 = g(fArr2, 1, fArr, 2);
        float g13 = g(fArr2, 1, fArr, 3);
        float g14 = g(fArr2, 2, fArr, 0);
        float g15 = g(fArr2, 2, fArr, 1);
        float g16 = g(fArr2, 2, fArr, 2);
        float g17 = g(fArr2, 2, fArr, 3);
        float g18 = g(fArr2, 3, fArr, 0);
        float g19 = g(fArr2, 3, fArr, 1);
        float g20 = g(fArr2, 3, fArr, 2);
        float g21 = g(fArr2, 3, fArr, 3);
        fArr[0] = g3;
        fArr[1] = g7;
        fArr[2] = g8;
        fArr[3] = g9;
        fArr[4] = g10;
        fArr[5] = g11;
        fArr[6] = g12;
        fArr[7] = g13;
        fArr[8] = g14;
        fArr[9] = g15;
        fArr[10] = g16;
        fArr[11] = g17;
        fArr[12] = g18;
        fArr[13] = g19;
        fArr[14] = g20;
        fArr[15] = g21;
    }

    public static final void r(q0 q0Var, int i) {
        Object obj;
        Iterator<T> it = q0Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((w1.f0) ((Map.Entry) obj).getKey()).f7640e == i) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null && entry.getValue() != null) {
            throw new ClassCastException();
        }
    }

    public static final String s(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String t(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
