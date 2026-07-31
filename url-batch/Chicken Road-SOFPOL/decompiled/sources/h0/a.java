package h0;

import a0.e0;
import a0.q;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.Layout;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import c5.x;
import c6.f;
import d4.p;
import e1.b;
import f1.s;
import h2.k;
import i2.d;
import j0.l;
import j0.o0;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import l.q1;
import l1.e;
import l1.h;
import l1.m;
import l1.n;
import m0.i2;
import m0.t1;
import o.j0;
import o.k0;
import o.r0;
import o4.o;
import o4.v;
import o4.w;
import o4.z;
import p6.c;
import q6.i;
import q6.t;
import r2.j;
import r2.r;
import x6.g;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static e f3069a;

    public a() {
        new ConcurrentHashMap();
    }

    public static int A(Context context, int i, int i8) {
        Integer num;
        TypedValue P = r.P(context, i);
        if (P != null) {
            int i9 = P.resourceId;
            num = Integer.valueOf(i9 != 0 ? context.getColor(i9) : P.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i8;
    }

    public static int B(View view, int i) {
        Context context = view.getContext();
        TypedValue S = r.S(view.getContext(), i, view.getClass().getCanonicalName());
        int i8 = S.resourceId;
        return i8 != 0 ? context.getColor(i8) : S.data;
    }

    public static String C(p pVar, int i) {
        i.e(pVar, "context");
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            Context context = pVar.f2282a;
            i.b(context);
            String resourceName = context.getResources().getResourceName(i);
            i.b(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static Drawable D(Context context, int i) {
        return q1.b().c(context, i);
    }

    public static final float E(Layout layout, int i, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        h2.i iVar = k.f3118a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : d.f3394a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float F(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        h2.i iVar = k.f3118a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? d.f3394a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static x6.e G(o oVar) {
        i.e(oVar, "<this>");
        return g.b0(oVar, new l(10));
    }

    public static int K(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(q.h("type needs to be >= FIRST and <= LAST, type=", i));
    }

    public static final int L(int i, int i8) {
        return (i >> i8) & 31;
    }

    public static int M(float f6, int i, int i8) {
        return i3.a.b(i3.a.d(i8, Math.round(Color.alpha(i8) * f6)), i);
    }

    public static final ArrayList N(Map map, c cVar) {
        i.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() != null) {
                throw new ClassCastException();
            }
            i.b(null);
            throw null;
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) cVar.i((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final long O(long j7, float f6) {
        return (Float.isNaN(f6) || f6 >= 1.0f) ? j7 : s.b(j7, s.d(j7) * f6);
    }

    public static final v P(c cVar) {
        w wVar = new w();
        cVar.i(wVar);
        boolean z3 = wVar.f5699b;
        boolean z7 = wVar.f5700c;
        int i = wVar.f5701d;
        boolean z8 = wVar.f5702e;
        o0 o0Var = wVar.f5698a;
        return new v(z3, z7, i, false, z8, o0Var.f3809a, o0Var.f3810b);
    }

    public static void Q(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final long R(q1.k kVar, boolean z3) {
        long d8 = b.d(kVar.f5996c, kVar.f6000g);
        if (z3 || !kVar.b()) {
            return d8;
        }
        return 0L;
    }

    public static final void S(i2 i2Var, m0.c cVar, int i) {
        while (true) {
            int i8 = i2Var.f4972v;
            if (i > i8 && i < i2Var.f4971u) {
                return;
            }
            if (i8 == 0 && i == 0) {
                return;
            }
            i2Var.L();
            if (i2Var.x(i2Var.f4972v)) {
                cVar.n();
            }
            i2Var.j();
        }
    }

    public static final boolean T(j0 j0Var, Object obj, Object obj2) {
        Object g3 = j0Var.g(obj);
        if (g3 == null) {
            return false;
        }
        if (!(g3 instanceof k0)) {
            if (!g3.equals(obj2)) {
                return false;
            }
            j0Var.k(obj);
            return true;
        }
        k0 k0Var = (k0) g3;
        boolean l3 = k0Var.l(obj2);
        if (l3 && k0Var.g()) {
            j0Var.k(obj);
        }
        return l3;
    }

    public static final void U(j0 j0Var, Object obj) {
        boolean z3;
        long[] jArr = j0Var.f5482a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i << 3) + i9;
                        Object obj2 = j0Var.f5483b[i10];
                        Object obj3 = j0Var.f5484c[i10];
                        if (obj3 instanceof k0) {
                            k0 k0Var = (k0) obj3;
                            k0Var.l(obj);
                            z3 = k0Var.g();
                        } else {
                            z3 = obj3 == obj;
                        }
                        if (z3) {
                            j0Var.l(i10);
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final j V(e1.c cVar) {
        return new j(Math.round(cVar.f2457a), Math.round(cVar.f2458b), Math.round(cVar.f2459c), Math.round(cVar.f2460d));
    }

    public static final void W(List list, f1.j jVar) {
        l1.s sVar;
        float f6;
        float f8;
        float f9;
        float f10;
        float f11;
        Path path = jVar.f2669a;
        Path path2 = jVar.f2669a;
        Path.FillType fillType = path.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z3 = fillType == fillType2;
        path2.rewind();
        if (!z3) {
            fillType2 = Path.FillType.WINDING;
        }
        path2.setFillType(fillType2);
        l1.s sVar2 = list.isEmpty() ? h.f4778b : (l1.s) list.get(0);
        int size = list.size();
        float f12 = 0.0f;
        int i = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (i < size) {
            l1.s sVar3 = (l1.s) list.get(i);
            if (sVar3 instanceof h) {
                path2.close();
                sVar = sVar3;
                f13 = f15;
                f17 = f13;
                f14 = f16;
                f18 = f14;
            } else if (sVar3 instanceof l1.l) {
                l1.l lVar = (l1.l) sVar3;
                f15 = lVar.f4788b;
                f16 = lVar.f4789c;
                path2.moveTo(f15, f16);
                sVar = sVar3;
                f17 = f15;
                f18 = f16;
            } else {
                if (sVar3 instanceof l1.p) {
                    l1.p pVar = (l1.p) sVar3;
                    float f19 = pVar.f4802c;
                    float f20 = pVar.f4801b;
                    path2.rLineTo(f20, f19);
                    f17 += f20;
                    f18 += f19;
                } else if (sVar3 instanceof l1.k) {
                    l1.k kVar = (l1.k) sVar3;
                    float f21 = kVar.f4787c;
                    float f22 = kVar.f4786b;
                    path2.lineTo(f22, f21);
                    f17 = f22;
                    sVar = sVar3;
                    f18 = f21;
                } else if (sVar3 instanceof l1.o) {
                    float f23 = ((l1.o) sVar3).f4800b;
                    path2.rLineTo(f23, f12);
                    f17 += f23;
                } else if (sVar3 instanceof l1.j) {
                    float f24 = ((l1.j) sVar3).f4785b;
                    path2.lineTo(f24, f18);
                    f17 = f24;
                } else if (sVar3 instanceof l1.r) {
                    float f25 = ((l1.r) sVar3).f4807b;
                    path2.rLineTo(f12, f25);
                    f18 += f25;
                } else {
                    if (sVar3 instanceof n) {
                        n nVar = (n) sVar3;
                        sVar = sVar3;
                        path2.rCubicTo(nVar.f4794b, nVar.f4795c, nVar.f4796d, nVar.f4797e, nVar.f4798f, nVar.f4799g);
                        f13 = nVar.f4796d + f17;
                        f14 = nVar.f4797e + f18;
                        f17 += nVar.f4798f;
                        f11 = nVar.f4799g;
                    } else {
                        sVar = sVar3;
                        if (sVar instanceof l1.i) {
                            l1.i iVar = (l1.i) sVar;
                            path2.cubicTo(iVar.f4779b, iVar.f4780c, iVar.f4781d, iVar.f4782e, iVar.f4783f, iVar.f4784g);
                            f13 = iVar.f4781d;
                            f14 = iVar.f4782e;
                            f6 = iVar.f4783f;
                            f8 = iVar.f4784g;
                        } else if (sVar instanceof l1.q) {
                            if (sVar2.f4808a) {
                                f10 = f18 - f14;
                                f9 = f17 - f13;
                            } else {
                                f9 = 0.0f;
                                f10 = 0.0f;
                            }
                            l1.q qVar = (l1.q) sVar;
                            path2.rCubicTo(f9, f10, qVar.f4803b, qVar.f4804c, qVar.f4805d, qVar.f4806e);
                            f13 = qVar.f4803b + f17;
                            f14 = qVar.f4804c + f18;
                            f17 += qVar.f4805d;
                            f11 = qVar.f4806e;
                        } else {
                            if (!(sVar instanceof m)) {
                                throw new a5.c();
                            }
                            if (sVar2.f4808a) {
                                float f26 = 2;
                                f17 = (f17 * f26) - f13;
                                f18 = (f26 * f18) - f14;
                            }
                            m mVar = (m) sVar;
                            path2.cubicTo(f17, f18, mVar.f4790b, mVar.f4791c, mVar.f4792d, mVar.f4793e);
                            f13 = mVar.f4790b;
                            f14 = mVar.f4791c;
                            f6 = mVar.f4792d;
                            f8 = mVar.f4793e;
                        }
                        f18 = f8;
                        f17 = f6;
                    }
                    f18 += f11;
                }
                sVar = sVar3;
            }
            i++;
            sVar2 = sVar;
            f12 = 0.0f;
        }
    }

    public static final r2.e a(Context context) {
        float f6 = context.getResources().getConfiguration().fontScale;
        float f8 = context.getResources().getDisplayMetrics().density;
        s2.a a8 = s2.b.a(f6);
        if (a8 == null) {
            a8 = new r2.m(f6);
        }
        return new r2.e(f8, f6, a8);
    }

    public static r2.d b() {
        return new r2.d(1.0f, 1.0f);
    }

    public static final long c(int i) {
        long j7 = (i << 32) | (0 & 4294967295L);
        int i8 = o1.a.f5596p;
        return j7;
    }

    public static final void d(o4.d dVar, v0.c cVar, u0.c cVar2, m0.s sVar, int i) {
        sVar.W(233973821);
        if ((((sVar.h(dVar) ? 4 : 2) | i | (sVar.h(cVar) ? 32 : 16)) & 147) == 146 && sVar.z()) {
            sVar.Q();
        } else {
            m0.b.b(new l.q[]{m4.a.f5222a.a(dVar), j4.e.f4019a.a(dVar), y4.a.f8975a.a(dVar)}, u0.h.d(1808964477, new a0.v(7, cVar, cVar2), sVar), sVar, 56);
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new b6.c(dVar, cVar, cVar2, i, 2);
        }
    }

    public static final void e(v0.c cVar, u0.c cVar2, m0.s sVar, int i) {
        sVar.W(832919318);
        int i8 = (sVar.h(cVar) ? 4 : 2) | i | (sVar.h(cVar2) ? 32 : 16);
        if ((i8 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            Object K = sVar.K();
            if (K == m0.n.f5019a) {
                K = new l(12);
                sVar.f0(K);
            }
            c cVar3 = (c) K;
            x0 a8 = m4.a.a(sVar);
            if (a8 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            q6.e a9 = t.a(p4.a.class);
            l4.d dVar = new l4.d(0);
            dVar.a(t.a(p4.a.class), cVar3);
            l4.c b8 = dVar.b();
            l4.b e8 = a8 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a8).e() : l4.a.f4828b;
            w0 f6 = a8.f();
            i.e(f6, "store");
            i.e(e8, "extras");
            x xVar = new x(f6, b8, e8);
            String x7 = m.a.x(a9);
            if (x7 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            p4.a aVar = (p4.a) xVar.n(a9, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(x7));
            aVar.f5741d = new q3.k(cVar);
            cVar.b(aVar.f5740c, cVar2, sVar, ((i8 << 6) & 896) | (i8 & 112));
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new e0(i, 11, cVar, cVar2);
        }
    }

    public static final Object[] f(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        d6.l.J(objArr, objArr2, 0, i, 6);
        d6.l.H(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] g(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        d6.l.J(objArr, objArr2, 0, i, 6);
        d6.l.H(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] h(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        d6.l.J(objArr, objArr2, 0, i, 6);
        d6.l.H(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final void i(j0 j0Var, Object obj, Object obj2) {
        int f6 = j0Var.f(obj);
        boolean z3 = f6 < 0;
        Object obj3 = z3 ? null : j0Var.f5484c[f6];
        if (obj3 != null) {
            if (obj3 instanceof k0) {
                ((k0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                k0 k0Var = new k0();
                k0Var.a(obj3);
                k0Var.a(obj2);
                obj2 = k0Var;
            }
            obj2 = obj3;
        }
        if (!z3) {
            j0Var.f5484c[f6] = obj2;
            return;
        }
        int i = ~f6;
        j0Var.f5483b[i] = obj;
        j0Var.f5484c[i] = obj2;
    }

    public static final Bundle j(f... fVarArr) {
        Bundle bundle = new Bundle(fVarArr.length);
        for (f fVar : fVarArr) {
            String str = (String) fVar.f1747d;
            Object obj = fVar.f1748e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                i.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final boolean k(q1.k kVar) {
        return !kVar.f6001h && kVar.f5997d;
    }

    public static final boolean l(q1.k kVar) {
        return kVar.f6001h && !kVar.f5997d;
    }

    public static void m(String str, boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void n(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int p(int i, int i8, int i9) {
        return i < i8 ? i8 : i > i9 ? i9 : i;
    }

    public static j0 q() {
        long[] jArr = r0.f5528a;
        return new j0();
    }

    public static final j2.e r(Context context) {
        w5.f fVar = new w5.f(21);
        context.getApplicationContext();
        return new j2.e(fVar, new j2.a(Build.VERSION.SDK_INT >= 31 ? j2.l.f3999a.a(context) : 0));
    }

    public static final o4.t x(Context context) {
        i.e(context, "context");
        o4.t tVar = new o4.t(context);
        r4.g gVar = tVar.f5685b;
        z zVar = gVar.f6601s;
        zVar.a(new p4.g(zVar));
        z zVar2 = gVar.f6601s;
        zVar2.a(new p4.i());
        zVar2.a(new p4.p());
        return tVar;
    }

    public static androidx.lifecycle.r0 y(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                i.b(newInstance);
                return (androidx.lifecycle.r0) newInstance;
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            } catch (InstantiationException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            }
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        }
    }

    public abstract int H(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int I();

    public abstract ViewPropertyAnimator J(View view, int i);

    public abstract Typeface s(Context context, h3.e eVar, Resources resources, int i);

    public abstract Typeface t(Context context, n3.h[] hVarArr, int i);

    public Typeface u(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface v(Context context, InputStream inputStream) {
        File D = m.a.D(context);
        if (D == null) {
            return null;
        }
        try {
            if (m.a.m(D, inputStream)) {
                return Typeface.createFromFile(D.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            D.delete();
        }
    }

    public Typeface w(Context context, Resources resources, int i, String str, int i8) {
        File D = m.a.D(context);
        if (D == null) {
            return null;
        }
        try {
            if (m.a.l(D, resources, i)) {
                return Typeface.createFromFile(D.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            D.delete();
        }
    }

    public n3.h z(n3.h[] hVarArr, int i) {
        new w5.f(20);
        int i8 = (i & 1) == 0 ? 400 : 700;
        boolean z3 = (i & 2) != 0;
        n3.h hVar = null;
        int i9 = Integer.MAX_VALUE;
        for (n3.h hVar2 : hVarArr) {
            int abs = (Math.abs(hVar2.f5361c - i8) * 2) + (hVar2.f5362d == z3 ? 0 : 1);
            if (hVar == null || i9 > abs) {
                hVar = hVar2;
                i9 = abs;
            }
        }
        return hVar;
    }
}
