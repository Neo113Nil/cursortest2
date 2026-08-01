package d2;

import android.R;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class h0 implements b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f3416a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(j2.m mVar) {
        j2.j k10 = mVar.k();
        return !k10.f4975d.c(j2.q.j);
    }

    public static final boolean c(j2.m mVar, Resources resources) {
        Object g = mVar.f4983d.f4975d.g(j2.q.f4993a);
        if (g == null) {
            g = null;
        }
        List list = (List) g;
        return !j2.p.g(mVar) && (mVar.f4983d.f4977i || (mVar.q() && ((list != null ? (String) CollectionsKt.firstOrNull(list) : null) != null || l(mVar) != null || k(mVar, resources) != null || j(mVar))));
    }

    public static final void d(p3.f fVar, j2.m mVar) {
        j2.j jVar = mVar.f4983d;
        s.h0 h0Var = jVar.f4975d;
        Object g = jVar.f4975d.g(j2.q.f5014x);
        if (g == null) {
            g = null;
        }
        j2.g gVar = (j2.g) g;
        if (b(mVar)) {
            if (gVar != null && gVar.f4938a == 8) {
                return;
            }
            Object g2 = h0Var.g(j2.i.f4971w);
            if (g2 == null) {
                g2 = null;
            }
            j2.a aVar = (j2.a) g2;
            if (aVar != null) {
                fVar.a(new p3.d(null, R.id.accessibilityActionPageUp, aVar.f4928a, null));
            }
            Object g10 = h0Var.g(j2.i.f4973y);
            if (g10 == null) {
                g10 = null;
            }
            j2.a aVar2 = (j2.a) g10;
            if (aVar2 != null) {
                fVar.a(new p3.d(null, R.id.accessibilityActionPageDown, aVar2.f4928a, null));
            }
            Object g11 = h0Var.g(j2.i.f4972x);
            if (g11 == null) {
                g11 = null;
            }
            j2.a aVar3 = (j2.a) g11;
            if (aVar3 != null) {
                fVar.a(new p3.d(null, R.id.accessibilityActionPageLeft, aVar3.f4928a, null));
            }
            Object g12 = h0Var.g(j2.i.f4974z);
            if (g12 == null) {
                g12 = null;
            }
            j2.a aVar4 = (j2.a) g12;
            if (aVar4 != null) {
                fVar.a(new p3.d(null, R.id.accessibilityActionPageRight, aVar4.f4928a, null));
            }
        }
    }

    public static final boolean e(Object obj) {
        if (obj instanceof b1.s) {
            b1.s sVar = (b1.s) obj;
            if (sVar.d() == n0.e.f6660r || sVar.d() == n0.e.f6663u || sVar.d() == n0.e.f6661s) {
                Object value = sVar.getValue();
                if (value == null) {
                    return true;
                }
                return e(value);
            }
        } else {
            if ((obj instanceof hd.c) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i3 = 0; i3 < 7; i3++) {
                if (f3416a[i3].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final float f(float[] fArr, int i3, float[] fArr2, int i10) {
        int i11 = i3 * 4;
        return (fArr[i11 + 3] * fArr2[12 + i10]) + (fArr[i11 + 2] * fArr2[8 + i10]) + (fArr[i11 + 1] * fArr2[4 + i10]) + (fArr[i11] * fArr2[i10]);
    }

    public static final int g(View view, int i3) {
        int i10 = 0;
        int i11 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i3);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i11 = i10;
            }
            i10++;
            Object z10 = z4.w.z(view);
            view = z10 instanceof View ? (View) z10 : null;
        }
        return i11;
    }

    public static final View h(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int min = Math.min(g(view, com.appsflyer.R.id.view_tree_lifecycle_owner), g(view, com.appsflyer.R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i3 = 0;
        View view3 = view2;
        while (view != null) {
            if (i3 == min) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (i(view) == null) {
                i3++;
                Object z10 = z4.w.z(view);
                View view4 = view2;
                view2 = view;
                view = z10 instanceof View ? (View) z10 : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final c1 i(View view) {
        Object tag = view.getTag(com.appsflyer.R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (c1) weakReference.get();
        }
        return null;
    }

    public static final boolean j(j2.m mVar) {
        Object g = mVar.f4983d.f4975d.g(j2.q.H);
        if (g == null) {
            g = null;
        }
        l2.a aVar = (l2.a) g;
        s.h0 h0Var = mVar.f4983d.f4975d;
        Object g2 = h0Var.g(j2.q.f5014x);
        if (g2 == null) {
            g2 = null;
        }
        j2.g gVar = (j2.g) g2;
        boolean z10 = aVar != null;
        Object g10 = h0Var.g(j2.q.G);
        if (((Boolean) (g10 != null ? g10 : null)) == null || (gVar != null && gVar.f4938a == 4)) {
            return z10;
        }
        return true;
    }

    public static final String k(j2.m mVar, Resources resources) {
        j2.j jVar = mVar.f4983d;
        j2.j jVar2 = mVar.f4983d;
        Object g = jVar.f4975d.g(j2.q.f4994b);
        String str = null;
        if (g == null) {
            g = null;
        }
        s.h0 h0Var = jVar2.f4975d;
        Object g2 = h0Var.g(j2.q.H);
        if (g2 == null) {
            g2 = null;
        }
        l2.a aVar = (l2.a) g2;
        Object g10 = h0Var.g(j2.q.f5014x);
        if (g10 == null) {
            g10 = null;
        }
        j2.g gVar = (j2.g) g10;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        a2.r.p();
                        return null;
                    }
                    if (g == null) {
                        g = resources.getString(com.appsflyer.R.string.indeterminate);
                    }
                } else if (gVar != null && gVar.f4938a == 2 && g == null) {
                    g = resources.getString(com.appsflyer.R.string.state_off);
                }
            } else if (gVar != null && gVar.f4938a == 2 && g == null) {
                g = resources.getString(com.appsflyer.R.string.state_on);
            }
        }
        Object g11 = h0Var.g(j2.q.G);
        if (g11 == null) {
            g11 = null;
        }
        Boolean bool = (Boolean) g11;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((gVar == null || gVar.f4938a != 4) && g == null) {
                g = booleanValue ? resources.getString(com.appsflyer.R.string.selected) : resources.getString(com.appsflyer.R.string.not_selected);
            }
        }
        Object g12 = h0Var.g(j2.q.f4995c);
        if (g12 == null) {
            g12 = null;
        }
        j2.f fVar = (j2.f) g12;
        if (fVar != null) {
            if (fVar != j2.f.f4936b) {
                if (g == null) {
                    g = resources.getString(com.appsflyer.R.string.template_percent, 0);
                }
            } else if (g == null) {
                g = resources.getString(com.appsflyer.R.string.in_progress);
            }
        }
        j2.t tVar = j2.q.E;
        if (h0Var.c(tVar)) {
            s.h0 h0Var2 = new j2.m(mVar.f4980a, true, mVar.f4982c, jVar2).k().f4975d;
            Object g13 = h0Var2.g(j2.q.f4993a);
            if (g13 == null) {
                g13 = null;
            }
            Collection collection = (Collection) g13;
            if (collection == null || collection.isEmpty()) {
                Object g14 = h0Var2.g(j2.q.A);
                if (g14 == null) {
                    g14 = null;
                }
                Collection collection2 = (Collection) g14;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g15 = h0Var2.g(tVar);
                    if (g15 == null) {
                        g15 = null;
                    }
                    CharSequence charSequence = (CharSequence) g15;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(com.appsflyer.R.string.state_empty);
                    }
                }
            }
            g = str;
        }
        return (String) g;
    }

    public static final m2.e l(j2.m mVar) {
        Object g = mVar.f4983d.f4975d.g(j2.q.E);
        if (g == null) {
            g = null;
        }
        m2.e eVar = (m2.e) g;
        Object g2 = mVar.f4983d.f4975d.g(j2.q.A);
        if (g2 == null) {
            g2 = null;
        }
        List list = (List) g2;
        return eVar == null ? list != null ? (m2.e) CollectionsKt.firstOrNull(list) : null : eVar;
    }

    public static boolean m() {
        try {
            if (v.Z0 == null) {
                v.Z0 = Class.forName("android.os.SystemProperties");
            }
            if (v.f3545a1 == null) {
                Class cls = v.Z0;
                v.f3545a1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = v.f3545a1;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return Intrinsics.a(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final m2.e0 n(j2.j jVar) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        Object g = jVar.f4975d.g(j2.i.f4951a);
        if (g == null) {
            g = null;
        }
        j2.a aVar = (j2.a) g;
        if (aVar == null || (function1 = (Function1) aVar.f4929b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (m2.e0) arrayList.get(0);
    }

    public static final boolean o(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f3 = fArr[0];
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
        float f25 = (f3 * f14) - (f10 * f13);
        float f26 = (f3 * f15) - (f11 * f13);
        float f27 = (f3 * f16) - (f12 * f13);
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
        if (f37 != 0.0f) {
            float f38 = 1.0f / f37;
            fArr2[0] = ((f16 * f34) + ((f14 * f36) - (f15 * f35))) * f38;
            fArr2[1] = (((f11 * f35) + ((-f10) * f36)) - (f12 * f34)) * f38;
            fArr2[2] = ((f24 * f28) + ((f22 * f30) - (f23 * f29))) * f38;
            fArr2[3] = (((f19 * f29) + ((-f18) * f30)) - (f20 * f28)) * f38;
            float f39 = -f13;
            fArr2[4] = (((f15 * f33) + (f39 * f36)) - (f16 * f32)) * f38;
            fArr2[5] = ((f12 * f32) + ((f36 * f3) - (f11 * f33))) * f38;
            float f40 = -f21;
            fArr2[6] = (((f23 * f27) + (f40 * f30)) - (f24 * f26)) * f38;
            fArr2[7] = ((f20 * f26) + ((f30 * f17) - (f19 * f27))) * f38;
            fArr2[8] = ((f16 * f31) + ((f13 * f35) - (f14 * f33))) * f38;
            fArr2[9] = (((f33 * f10) + ((-f3) * f35)) - (f12 * f31)) * f38;
            fArr2[10] = ((f24 * f25) + ((f21 * f29) - (f22 * f27))) * f38;
            fArr2[11] = (((f27 * f18) + ((-f17) * f29)) - (f20 * f25)) * f38;
            fArr2[12] = (((f14 * f32) + (f39 * f34)) - (f15 * f31)) * f38;
            fArr2[13] = ((f11 * f31) + ((f3 * f34) - (f10 * f32))) * f38;
            fArr2[14] = (((f22 * f26) + (f40 * f28)) - (f23 * f25)) * f38;
            fArr2[15] = ((f19 * f25) + ((f17 * f28) - (f18 * f26))) * f38;
        }
        return !(f37 == 0.0f);
    }

    public static final boolean p(float f3, float f10, k1.g gVar) {
        float f11 = f3 - 0.005f;
        float f12 = f10 - 0.005f;
        float f13 = f3 + 0.005f;
        float f14 = f10 + 0.005f;
        k1.g a9 = k1.i.a();
        Path path = a9.f5321a;
        k1.b0 b0Var = k1.b0.f5299d;
        if (Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13) || Float.isNaN(f14)) {
            k1.i.b("Invalid rectangle, make sure no value is NaN");
        }
        if (a9.f5322b == null) {
            a9.f5322b = new RectF();
        }
        RectF rectF = a9.f5322b;
        rectF.getClass();
        rectF.set(f11, f12, f13, f14);
        RectF rectF2 = a9.f5322b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        Path path2 = k1.i.a().f5321a;
        Path.Op op = Path.Op.INTERSECT;
        if (!(gVar instanceof k1.g)) {
            a2.r.r("Unable to obtain android.graphics.Path");
            return false;
        }
        path2.op(gVar.f5321a, path, op);
        boolean isEmpty = path2.isEmpty();
        path2.reset();
        path.reset();
        return !isEmpty;
    }

    public static final boolean q(float f3, float f10, float f11, float f12, long j) {
        float f13 = f3 - f11;
        float f14 = f10 - f12;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f14 * f14) / (intBitsToFloat2 * intBitsToFloat2)) + ((f13 * f13) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static final void r(float[] fArr, float[] fArr2) {
        float f3 = f(fArr2, 0, fArr, 0);
        float f10 = f(fArr2, 0, fArr, 1);
        float f11 = f(fArr2, 0, fArr, 2);
        float f12 = f(fArr2, 0, fArr, 3);
        float f13 = f(fArr2, 1, fArr, 0);
        float f14 = f(fArr2, 1, fArr, 1);
        float f15 = f(fArr2, 1, fArr, 2);
        float f16 = f(fArr2, 1, fArr, 3);
        float f17 = f(fArr2, 2, fArr, 0);
        float f18 = f(fArr2, 2, fArr, 1);
        float f19 = f(fArr2, 2, fArr, 2);
        float f20 = f(fArr2, 2, fArr, 3);
        float f21 = f(fArr2, 3, fArr, 0);
        float f22 = f(fArr2, 3, fArr, 1);
        float f23 = f(fArr2, 3, fArr, 2);
        float f24 = f(fArr2, 3, fArr, 3);
        fArr[0] = f3;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f12;
        fArr[4] = f13;
        fArr[5] = f14;
        fArr[6] = f15;
        fArr[7] = f16;
        fArr[8] = f17;
        fArr[9] = f18;
        fArr[10] = f19;
        fArr[11] = f20;
        fArr[12] = f21;
        fArr[13] = f22;
        fArr[14] = f23;
        fArr[15] = f24;
    }

    public static final a3.n s(p0 p0Var, int i3) {
        Object obj;
        Iterator<T> it = p0Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((c2.g0) ((Map.Entry) obj).getKey()).f1550e == i3) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (a3.n) entry.getValue();
        }
        return null;
    }

    public static final String t(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String u(int i3) {
        if (i3 == 0) {
            return "android.widget.Button";
        }
        if (i3 == 1) {
            return "android.widget.CheckBox";
        }
        if (i3 == 3) {
            return "android.widget.RadioButton";
        }
        if (i3 == 5) {
            return "android.widget.ImageView";
        }
        if (i3 == 6) {
            return "android.widget.Spinner";
        }
        if (i3 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
