package x1;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.snovikpovik.vuevnxsj.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a0 extends q3.b {
    public static final o.w Q;
    public boolean A;
    public x B;
    public o.x C;
    public final o.y D;
    public final o.v E;
    public final o.v F;
    public final String G;
    public final String H;
    public final a0.g1 I;
    public final o.x J;
    public p1 K;
    public boolean L;
    public final o.v M;
    public final a1.a N;
    public final ArrayList O;
    public final z P;

    /* renamed from: d, reason: collision with root package name */
    public final t f8330d;

    /* renamed from: e, reason: collision with root package name */
    public int f8331e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public final z f8332f;

    /* renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f8333g;

    /* renamed from: h, reason: collision with root package name */
    public long f8334h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final v f8335j;

    /* renamed from: k, reason: collision with root package name */
    public List f8336k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f8337l;

    /* renamed from: m, reason: collision with root package name */
    public final w f8338m;

    /* renamed from: n, reason: collision with root package name */
    public int f8339n;

    /* renamed from: o, reason: collision with root package name */
    public int f8340o;

    /* renamed from: p, reason: collision with root package name */
    public r3.f f8341p;

    /* renamed from: q, reason: collision with root package name */
    public r3.f f8342q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8343r;

    /* renamed from: s, reason: collision with root package name */
    public final o.x f8344s;

    /* renamed from: t, reason: collision with root package name */
    public final o.x f8345t;

    /* renamed from: u, reason: collision with root package name */
    public final o.u0 f8346u;

    /* renamed from: v, reason: collision with root package name */
    public final o.u0 f8347v;

    /* renamed from: w, reason: collision with root package name */
    public int f8348w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f8349x;

    /* renamed from: y, reason: collision with root package name */
    public final o.f f8350y;

    /* renamed from: z, reason: collision with root package name */
    public final c7.c f8351z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        o.w wVar = o.k.f5488a;
        o.w wVar2 = new o.w(32);
        int i = wVar2.f5560b;
        if (i < 0) {
            p.a.d("");
            throw null;
        }
        int i8 = i + 32;
        int[] iArr2 = wVar2.f5559a;
        if (iArr2.length < i8) {
            int[] copyOf = Arrays.copyOf(iArr2, Math.max(i8, (iArr2.length * 3) / 2));
            q6.i.d(copyOf, "copyOf(...)");
            wVar2.f5559a = copyOf;
        }
        int[] iArr3 = wVar2.f5559a;
        int i9 = wVar2.f5560b;
        if (i != i9) {
            d6.l.F(i8, i, i9, iArr3, iArr3);
        }
        d6.l.I(i, 0, 12, iArr, iArr3);
        wVar2.f5560b += 32;
        Q = wVar2;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [x1.u] */
    public a0(t tVar) {
        this.f8330d = tVar;
        int i = 0;
        this.f8332f = new z(this, i);
        Object systemService = tVar.getContext().getSystemService("accessibility");
        q6.i.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f8333g = accessibilityManager;
        this.f8334h = 100L;
        this.i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: x1.u
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z3) {
                a0 a0Var = a0.this;
                a0Var.f8336k = z3 ? a0Var.f8333g.getEnabledAccessibilityServiceList(-1) : d6.u.f2326d;
            }
        };
        this.f8335j = new v(i, this);
        this.f8336k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f8337l = new Handler(Looper.getMainLooper());
        this.f8338m = new w(this, i);
        this.f8339n = Integer.MIN_VALUE;
        this.f8340o = Integer.MIN_VALUE;
        this.f8344s = new o.x();
        this.f8345t = new o.x();
        this.f8346u = new o.u0(0);
        this.f8347v = new o.u0(0);
        this.f8348w = -1;
        this.f8350y = new o.f();
        this.f8351z = c7.j.a(1, null, 6);
        this.A = true;
        o.x xVar = o.m.f5510a;
        q6.i.c(xVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.C = xVar;
        this.D = new o.y();
        this.E = new o.v();
        this.F = new o.v();
        this.G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.I = new a0.g1(7);
        this.J = new o.x();
        d2.n a8 = tVar.getSemanticsOwner().a();
        q6.i.c(xVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.K = new p1(a8, xVar);
        int i8 = o.j.f5481a;
        this.M = new o.v();
        tVar.addOnAttachStateChangeListener(new f1.e(5, this));
        this.N = new a1.a(12, this);
        this.O = new ArrayList();
        this.P = new z(this, 1);
    }

    public static /* synthetic */ void E(a0 a0Var, int i, int i8, Integer num, int i9) {
        if ((i9 & 4) != 0) {
            num = null;
        }
        a0Var.D(i, i8, num, null);
    }

    public static Rect L(f1.p pVar) {
        if (!(pVar instanceof f1.d0) && !(pVar instanceof f1.e0)) {
            return null;
        }
        e1.c k3 = pVar.k();
        return new Rect((int) k3.f2457a, (int) k3.f2458b, (int) k3.f2459c, (int) k3.f2460d);
    }

    public static float[] M(f1.p pVar) {
        if (!(pVar instanceof f1.e0)) {
            return null;
        }
        e1.d dVar = ((f1.e0) pVar).f2635e;
        long j7 = dVar.f2468h;
        long j8 = dVar.f2467g;
        long j9 = dVar.f2466f;
        long j10 = dVar.f2465e;
        return new float[]{Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)), Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)), Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L))};
    }

    public static Region N(f1.p pVar) {
        if (!(pVar instanceof f1.c0)) {
            return null;
        }
        f1.c0 c0Var = (f1.c0) pVar;
        e1.c k3 = c0Var.k();
        Region region = new Region(new Rect((int) k3.f2457a, (int) k3.f2458b, (int) k3.f2459c, (int) k3.f2460d));
        Region region2 = new Region();
        f1.j jVar = c0Var.f2630e;
        if (!(jVar instanceof f1.j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(jVar.f2669a, region);
        return region2;
    }

    public static CharSequence O(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                q6.i.c(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String u(d2.n nVar) {
        g2.e eVar;
        if (nVar != null) {
            d2.j jVar = nVar.f2159d;
            o.j0 j0Var = jVar.f2150d;
            d2.v vVar = d2.s.f2188a;
            if (j0Var.c(vVar)) {
                return t2.a.a((List) jVar.b(vVar), ",", null, 62);
            }
            d2.v vVar2 = d2.s.D;
            if (j0Var.c(vVar2)) {
                Object g3 = j0Var.g(vVar2);
                if (g3 == null) {
                    g3 = null;
                }
                g2.e eVar2 = (g2.e) g3;
                if (eVar2 != null) {
                    return eVar2.f2928e;
                }
            } else {
                Object g7 = j0Var.g(d2.s.f2212z);
                if (g7 == null) {
                    g7 = null;
                }
                List list = (List) g7;
                if (list != null && (eVar = (g2.e) d6.m.S(list)) != null) {
                    return eVar.f2928e;
                }
            }
        }
        return null;
    }

    public static final boolean x(d2.h hVar, float f6) {
        p6.a aVar = hVar.f2123a;
        if (f6 >= 0.0f || ((Number) aVar.b()).floatValue() <= 0.0f) {
            return f6 > 0.0f && ((Number) aVar.b()).floatValue() < ((Number) hVar.f2124b.b()).floatValue();
        }
        return true;
    }

    public static final boolean y(d2.h hVar) {
        p6.a aVar = hVar.f2123a;
        if (((Number) aVar.b()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) aVar.b()).floatValue();
        ((Number) hVar.f2124b.b()).floatValue();
        return false;
    }

    public static final boolean z(d2.h hVar) {
        p6.a aVar = hVar.f2123a;
        if (((Number) aVar.b()).floatValue() < ((Number) hVar.f2124b.b()).floatValue()) {
            return true;
        }
        ((Number) aVar.b()).floatValue();
        return false;
    }

    public final int A(int i) {
        if (i == this.f8330d.getSemanticsOwner().a().f2162g) {
            return -1;
        }
        return i;
    }

    public final void B(d2.n nVar, p1 p1Var) {
        int[] iArr = o.n.f5513a;
        o.y yVar = new o.y();
        List j7 = d2.n.j(4, nVar);
        w1.f0 f0Var = nVar.f2158c;
        int size = j7.size();
        for (int i = 0; i < size; i++) {
            d2.n nVar2 = (d2.n) j7.get(i);
            o.l t3 = t();
            int i8 = nVar2.f2162g;
            if (t3.a(i8)) {
                if (!p1Var.f8528b.b(i8)) {
                    w(f0Var);
                    return;
                }
                yVar.a(i8);
            }
        }
        o.y yVar2 = p1Var.f8528b;
        int[] iArr2 = yVar2.f5565b;
        long[] jArr = yVar2.f5564a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j8 = jArr[i9];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j8) < 128 && !yVar.b(iArr2[(i9 << 3) + i11])) {
                            w(f0Var);
                            return;
                        }
                        j8 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i9 == length) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        List j9 = d2.n.j(4, nVar);
        int size2 = j9.size();
        for (int i12 = 0; i12 < size2; i12++) {
            d2.n nVar3 = (d2.n) j9.get(i12);
            p1 p1Var2 = (p1) this.J.b(nVar3.f2162g);
            if (p1Var2 != null && t().a(nVar3.f2162g)) {
                B(nVar3, p1Var2);
            }
        }
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f8343r = true;
        }
        try {
            return ((Boolean) this.f8332f.i(accessibilityEvent)).booleanValue();
        } finally {
            this.f8343r = false;
        }
    }

    public final boolean D(int i, int i8, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent o2 = o(i, i8);
        if (num != null) {
            o2.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            o2.setContentDescription(t2.a.a(list, ",", null, 62));
        }
        return C(o2);
    }

    public final void F(int i, int i8, String str) {
        AccessibilityEvent o2 = o(A(i), 32);
        o2.setContentChangeTypes(i8);
        if (str != null) {
            o2.getText().add(str);
        }
        C(o2);
    }

    public final void G(int i) {
        x xVar = this.B;
        if (xVar != null) {
            d2.n nVar = xVar.f8598a;
            if (i != nVar.f2162g) {
                return;
            }
            if (SystemClock.uptimeMillis() - xVar.f8603f <= 1000) {
                AccessibilityEvent o2 = o(A(nVar.f2162g), 131072);
                o2.setFromIndex(xVar.f8601d);
                o2.setToIndex(xVar.f8602e);
                o2.setAction(xVar.f8599b);
                o2.setMovementGranularity(xVar.f8600c);
                o2.getText().add(u(nVar));
                C(o2);
            }
        }
        this.B = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x04d8, code lost:
    
        if (r1.isEmpty() == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0507, code lost:
    
        if (r12 != null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x050c, code lost:
    
        if (r12 == null) goto L243;
     */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0515  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(o.l lVar) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num;
        int i8;
        int i9;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i10;
        int i11;
        int i12;
        Integer num2;
        d2.j jVar;
        d2.n nVar;
        int i13;
        int i14;
        int i15;
        int i16;
        o.j0 j0Var;
        w1.f0 f0Var;
        int i17;
        d2.j jVar2;
        ArrayList arrayList3;
        long j7;
        int i18;
        int i19;
        int i20;
        w1.f0 f0Var2;
        Integer num3;
        int i21;
        o.j0 j0Var2;
        int i22;
        o1 o1Var;
        boolean z3;
        o1 o1Var2;
        boolean z7;
        int i23;
        String str;
        int i24;
        int i25;
        int i26;
        o.j0 j0Var3;
        Integer num4;
        AccessibilityEvent q4;
        Integer num5;
        o.l lVar2 = lVar;
        ArrayList arrayList4 = this.O;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = lVar2.f5495b;
        long[] jArr3 = lVar2.f5494a;
        int i27 = 2;
        int length = jArr3.length - 2;
        int i28 = 0;
        Integer num6 = 0;
        if (length < 0) {
            return;
        }
        int i29 = 0;
        while (true) {
            long j8 = jArr3[i29];
            int i30 = i27;
            int i31 = length;
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i32 = 8;
                int i33 = 8 - ((~(i29 - i31)) >>> 31);
                long j9 = j8;
                int i34 = i28;
                while (i34 < i33) {
                    if ((j9 & 255) < 128) {
                        int i35 = iArr3[(i29 << 3) + i34];
                        p1 p1Var = (p1) this.J.b(i35);
                        if (p1Var != null) {
                            d2.j jVar3 = p1Var.f8527a;
                            o.j0 j0Var4 = jVar3.f2150d;
                            d2.o oVar = (d2.o) lVar2.b(i35);
                            int i36 = i32;
                            d2.n nVar2 = oVar != null ? oVar.f2163a : null;
                            if (nVar2 == null) {
                                throw a0.q.f("no value for specified key");
                            }
                            w1.f0 f0Var3 = nVar2.f2158c;
                            d2.j jVar4 = nVar2.f2159d;
                            iArr2 = iArr3;
                            int i37 = nVar2.f2162g;
                            jArr2 = jArr3;
                            o.j0 j0Var5 = jVar4.f2150d;
                            i12 = i29;
                            Object[] objArr = j0Var5.f5483b;
                            Object[] objArr2 = j0Var5.f5484c;
                            long[] jArr4 = j0Var5.f5482a;
                            i9 = i34;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                w1.f0 f0Var4 = f0Var3;
                                i10 = i33;
                                int i38 = 0;
                                i15 = 0;
                                while (true) {
                                    long j10 = jArr4[i38];
                                    nVar = nVar2;
                                    int i39 = i38;
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i40 = 8 - ((~(i39 - length2)) >>> 31);
                                        int i41 = 0;
                                        while (i41 < i40) {
                                            if ((j10 & 255) < 128) {
                                                int i42 = (i39 << 3) + i41;
                                                Object obj = objArr[i42];
                                                int i43 = length2;
                                                Object obj2 = objArr2[i42];
                                                jVar2 = jVar3;
                                                d2.v vVar = (d2.v) obj;
                                                j7 = j10;
                                                d2.v vVar2 = d2.s.f2206t;
                                                if (q6.i.a(vVar, vVar2) || q6.i.a(vVar, d2.s.f2207u)) {
                                                    int size = arrayList5.size();
                                                    i19 = i41;
                                                    int i44 = 0;
                                                    while (true) {
                                                        if (i44 >= size) {
                                                            o1Var = null;
                                                            break;
                                                        }
                                                        int i45 = size;
                                                        if (((o1) arrayList5.get(i44)).f8519d == i35) {
                                                            o1Var = (o1) arrayList5.get(i44);
                                                            break;
                                                        } else {
                                                            i44++;
                                                            size = i45;
                                                        }
                                                    }
                                                    if (o1Var != null) {
                                                        z3 = false;
                                                    } else {
                                                        o1Var = new o1(i35, arrayList4);
                                                        z3 = true;
                                                    }
                                                    arrayList4.add(o1Var);
                                                } else {
                                                    i19 = i41;
                                                    z3 = false;
                                                }
                                                if (!z3) {
                                                    Object g3 = j0Var4.g(vVar);
                                                    if (g3 == null) {
                                                        g3 = null;
                                                    }
                                                    if (q6.i.a(obj2, g3)) {
                                                        i21 = i35;
                                                        arrayList3 = arrayList5;
                                                        i18 = i40;
                                                        i20 = i36;
                                                        f0Var2 = f0Var4;
                                                        num3 = num6;
                                                        j0Var2 = j0Var4;
                                                        i22 = i43;
                                                    }
                                                }
                                                d2.v vVar3 = d2.s.f2191d;
                                                if (q6.i.a(vVar, vVar3)) {
                                                    q6.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                                                    String str2 = (String) obj2;
                                                    if (j0Var4.c(vVar3)) {
                                                        F(i35, i36, str2);
                                                    }
                                                    i21 = i35;
                                                    arrayList3 = arrayList5;
                                                    i18 = i40;
                                                    f0Var2 = f0Var4;
                                                    i20 = 8;
                                                    num3 = num6;
                                                    j0Var2 = j0Var4;
                                                    i22 = i43;
                                                } else if (q6.i.a(vVar, d2.s.f2189b) || q6.i.a(vVar, d2.s.G)) {
                                                    i21 = i35;
                                                    arrayList3 = arrayList5;
                                                    i18 = i40;
                                                    f0Var2 = f0Var4;
                                                    num3 = num6;
                                                    j0Var2 = j0Var4;
                                                    i22 = i43;
                                                    i20 = 8;
                                                    E(this, A(i21), 2048, 64, 8);
                                                    E(this, A(i21), 2048, num3, 8);
                                                } else if (q6.i.a(vVar, d2.s.f2190c)) {
                                                    i20 = 8;
                                                    E(this, A(i35), 2048, 64, 8);
                                                    E(this, A(i35), 2048, num6, 8);
                                                    i21 = i35;
                                                    arrayList3 = arrayList5;
                                                    i18 = i40;
                                                    f0Var2 = f0Var4;
                                                    num3 = num6;
                                                    j0Var2 = j0Var4;
                                                    i22 = i43;
                                                } else {
                                                    d2.v vVar4 = d2.s.F;
                                                    arrayList3 = arrayList5;
                                                    if (q6.i.a(vVar, vVar4)) {
                                                        Object g7 = j0Var5.g(d2.s.f2209w);
                                                        if (g7 == null) {
                                                            g7 = null;
                                                        }
                                                        d2.g gVar = (d2.g) g7;
                                                        if (gVar != null && gVar.f2122a == 4) {
                                                            Object g8 = j0Var5.g(vVar4);
                                                            if (g8 == null) {
                                                                g8 = null;
                                                            }
                                                            if (q6.i.a(g8, Boolean.TRUE)) {
                                                                AccessibilityEvent o2 = o(A(i35), 4);
                                                                d2.n nVar3 = nVar;
                                                                f0Var2 = f0Var4;
                                                                d2.n nVar4 = new d2.n(nVar3.f2156a, true, f0Var2, jVar4);
                                                                Object g9 = nVar4.k().f2150d.g(d2.s.f2188a);
                                                                if (g9 == null) {
                                                                    g9 = null;
                                                                }
                                                                List list = (List) g9;
                                                                nVar = nVar3;
                                                                String a8 = list != null ? t2.a.a(list, ",", null, 62) : null;
                                                                Object g10 = nVar4.k().f2150d.g(d2.s.f2212z);
                                                                if (g10 == null) {
                                                                    g10 = null;
                                                                }
                                                                List list2 = (List) g10;
                                                                i18 = i40;
                                                                String a9 = list2 != null ? t2.a.a(list2, ",", null, 62) : null;
                                                                if (a8 != null) {
                                                                    o2.setContentDescription(a8);
                                                                }
                                                                if (a9 != null) {
                                                                    o2.getText().add(a9);
                                                                }
                                                                C(o2);
                                                            } else {
                                                                i18 = i40;
                                                                f0Var2 = f0Var4;
                                                                E(this, A(i35), 2048, num6, 8);
                                                            }
                                                        } else {
                                                            i18 = i40;
                                                            f0Var2 = f0Var4;
                                                            E(this, A(i35), 2048, 64, 8);
                                                            E(this, A(i35), 2048, num6, 8);
                                                        }
                                                        num3 = num6;
                                                        i21 = i35;
                                                        j0Var2 = j0Var4;
                                                        i22 = i43;
                                                        i20 = 8;
                                                    } else {
                                                        i18 = i40;
                                                        f0Var2 = f0Var4;
                                                        if (q6.i.a(vVar, d2.s.f2188a)) {
                                                            int A = A(i35);
                                                            q6.i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                            D(A, 2048, 4, (List) obj2);
                                                            num3 = num6;
                                                            i21 = i35;
                                                            j0Var2 = j0Var4;
                                                        } else {
                                                            d2.v vVar5 = d2.s.D;
                                                            String str3 = "";
                                                            if (!q6.i.a(vVar, vVar5)) {
                                                                Integer num7 = num6;
                                                                i21 = i35;
                                                                j0Var2 = j0Var4;
                                                                d2.v vVar6 = d2.s.E;
                                                                if (q6.i.a(vVar, vVar6)) {
                                                                    Object g11 = j0Var5.g(vVar5);
                                                                    if (g11 == null) {
                                                                        g11 = null;
                                                                    }
                                                                    g2.e eVar = (g2.e) g11;
                                                                    if (eVar != null && (str = eVar.f2928e) != null) {
                                                                        str3 = str;
                                                                    }
                                                                    long j11 = ((g2.h0) jVar4.b(vVar6)).f2960a;
                                                                    num3 = num7;
                                                                    C(q(A(i21), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) (j11 & 4294967295L)), Integer.valueOf(str3.length()), O(str3)));
                                                                    G(i37);
                                                                } else {
                                                                    i22 = i43;
                                                                    num3 = num7;
                                                                    if (q6.i.a(vVar, vVar2) || q6.i.a(vVar, d2.s.f2207u)) {
                                                                        w(f0Var2);
                                                                        int size2 = arrayList4.size();
                                                                        int i46 = 0;
                                                                        while (true) {
                                                                            if (i46 >= size2) {
                                                                                o1Var2 = null;
                                                                                break;
                                                                            } else {
                                                                                if (((o1) arrayList4.get(i46)).f8519d == i21) {
                                                                                    o1Var2 = (o1) arrayList4.get(i46);
                                                                                    break;
                                                                                }
                                                                                i46++;
                                                                            }
                                                                        }
                                                                        q6.i.b(o1Var2);
                                                                        Object g12 = j0Var5.g(vVar2);
                                                                        if (g12 == null) {
                                                                            g12 = null;
                                                                        }
                                                                        o1Var2.f8523h = (d2.h) g12;
                                                                        Object g13 = j0Var5.g(d2.s.f2207u);
                                                                        if (g13 == null) {
                                                                            g13 = null;
                                                                        }
                                                                        o1Var2.i = (d2.h) g13;
                                                                        if (o1Var2.f8520e.contains(o1Var2)) {
                                                                            this.f8330d.getSnapshotObserver().a(o1Var2, this.P, new a2.b(7, o1Var2, this));
                                                                        }
                                                                    } else if (q6.i.a(vVar, d2.s.f2197k)) {
                                                                        q6.i.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                                                        if (((Boolean) obj2).booleanValue()) {
                                                                            i23 = 8;
                                                                            C(o(A(i37), 8));
                                                                        } else {
                                                                            i23 = 8;
                                                                        }
                                                                        E(this, A(i37), 2048, num3, i23);
                                                                        i20 = i23;
                                                                    } else {
                                                                        d2.v vVar7 = d2.i.f2145v;
                                                                        if (q6.i.a(vVar, vVar7)) {
                                                                            List list3 = (List) jVar4.b(vVar7);
                                                                            Object g14 = j0Var2.g(vVar7);
                                                                            if (g14 == null) {
                                                                                g14 = null;
                                                                            }
                                                                            List list4 = (List) g14;
                                                                            if (list4 != null) {
                                                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                if (list3.size() > 0) {
                                                                                    list3.get(0).getClass();
                                                                                    throw new ClassCastException();
                                                                                }
                                                                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                if (list4.size() > 0) {
                                                                                    list4.get(0).getClass();
                                                                                    throw new ClassCastException();
                                                                                }
                                                                                i15 = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? 0 : 1;
                                                                            }
                                                                        } else {
                                                                            if (obj2 instanceof d2.a) {
                                                                                d2.a aVar = (d2.a) obj2;
                                                                                Object g15 = j0Var2.g(vVar);
                                                                                if (g15 == null) {
                                                                                    g15 = null;
                                                                                }
                                                                                if (aVar != g15) {
                                                                                    if (g15 instanceof d2.a) {
                                                                                        String str4 = aVar.f2108a;
                                                                                        d2.a aVar2 = (d2.a) g15;
                                                                                        c6.c cVar = aVar2.f2109b;
                                                                                        if (q6.i.a(str4, aVar2.f2108a)) {
                                                                                            c6.c cVar2 = aVar.f2109b;
                                                                                            if (cVar2 == null) {
                                                                                            }
                                                                                            if (cVar2 != null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z7 = false;
                                                                                    if (z7) {
                                                                                        i15 = 0;
                                                                                    }
                                                                                }
                                                                                z7 = true;
                                                                                if (z7) {
                                                                                }
                                                                            }
                                                                            i15 = 1;
                                                                        }
                                                                    }
                                                                    i20 = 8;
                                                                }
                                                            } else if (j0Var5.c(d2.i.f2133j)) {
                                                                Object g16 = j0Var4.g(vVar5);
                                                                if (g16 == null) {
                                                                    g16 = null;
                                                                }
                                                                g2.e eVar2 = (g2.e) g16;
                                                                if (eVar2 == null) {
                                                                    eVar2 = "";
                                                                }
                                                                Object g17 = j0Var5.g(vVar5);
                                                                if (g17 == null) {
                                                                    g17 = null;
                                                                }
                                                                CharSequence charSequence = (g2.e) g17;
                                                                if (charSequence == null) {
                                                                    charSequence = "";
                                                                }
                                                                CharSequence O = O(charSequence);
                                                                int length3 = eVar2.length();
                                                                int length4 = charSequence.length();
                                                                int i47 = length3 > length4 ? length4 : length3;
                                                                Integer num8 = num6;
                                                                int i48 = 0;
                                                                while (true) {
                                                                    i24 = length3;
                                                                    if (i48 >= i47) {
                                                                        i25 = length4;
                                                                        break;
                                                                    }
                                                                    i25 = length4;
                                                                    if (eVar2.charAt(i48) != charSequence.charAt(i48)) {
                                                                        break;
                                                                    }
                                                                    i48++;
                                                                    length3 = i24;
                                                                    length4 = i25;
                                                                }
                                                                int i49 = 0;
                                                                while (true) {
                                                                    if (i49 >= i47 - i48) {
                                                                        i26 = i49;
                                                                        break;
                                                                    }
                                                                    i26 = i49;
                                                                    if (eVar2.charAt((i24 - 1) - i49) != charSequence.charAt((i25 - 1) - i26)) {
                                                                        break;
                                                                    } else {
                                                                        i49 = i26 + 1;
                                                                    }
                                                                }
                                                                int i50 = (i24 - i26) - i48;
                                                                int i51 = (i25 - i26) - i48;
                                                                d2.v vVar8 = d2.s.H;
                                                                boolean c8 = j0Var4.c(vVar8);
                                                                boolean c9 = j0Var5.c(vVar8);
                                                                boolean c10 = j0Var4.c(d2.s.D);
                                                                boolean z8 = c10 && !c8 && c9;
                                                                boolean z9 = c10 && c8 && !c9;
                                                                if (z8 || z9) {
                                                                    j0Var3 = j0Var4;
                                                                    i21 = i35;
                                                                    num4 = num8;
                                                                    q4 = q(A(i35), num4, num8, Integer.valueOf(i25), O);
                                                                } else {
                                                                    j0Var3 = j0Var4;
                                                                    q4 = o(A(i35), 16);
                                                                    q4.setFromIndex(i48);
                                                                    q4.setRemovedCount(i50);
                                                                    q4.setAddedCount(i51);
                                                                    q4.setBeforeText(eVar2);
                                                                    q4.getText().add(O);
                                                                    i21 = i35;
                                                                    num4 = num8;
                                                                }
                                                                q4.setClassName("android.widget.EditText");
                                                                C(q4);
                                                                if (z8 || z9) {
                                                                    long j12 = ((g2.h0) jVar4.b(d2.s.E)).f2960a;
                                                                    num5 = num4;
                                                                    q4.setFromIndex((int) (j12 >> 32));
                                                                    q4.setToIndex((int) (j12 & 4294967295L));
                                                                    C(q4);
                                                                } else {
                                                                    num5 = num4;
                                                                }
                                                                i22 = i43;
                                                                num3 = num5;
                                                                j0Var2 = j0Var3;
                                                                i20 = 8;
                                                            } else {
                                                                Integer num9 = num6;
                                                                i21 = i35;
                                                                i20 = 8;
                                                                E(this, A(i21), 2048, Integer.valueOf(i30), 8);
                                                                i22 = i43;
                                                                num3 = num9;
                                                                j0Var2 = j0Var4;
                                                            }
                                                        }
                                                        i22 = i43;
                                                        i20 = 8;
                                                    }
                                                }
                                            } else {
                                                jVar2 = jVar3;
                                                arrayList3 = arrayList5;
                                                j7 = j10;
                                                i18 = i40;
                                                i19 = i41;
                                                i20 = i36;
                                                f0Var2 = f0Var4;
                                                num3 = num6;
                                                i21 = i35;
                                                j0Var2 = j0Var4;
                                                i22 = length2;
                                            }
                                            i36 = i20;
                                            j0Var4 = j0Var2;
                                            f0Var4 = f0Var2;
                                            i40 = i18;
                                            i41 = i19 + 1;
                                            length2 = i22;
                                            num6 = num3;
                                            arrayList5 = arrayList3;
                                            i35 = i21;
                                            j10 = j7 >> i20;
                                            jVar3 = jVar2;
                                        }
                                        i14 = i35;
                                        jVar = jVar3;
                                        arrayList2 = arrayList5;
                                        f0Var = f0Var4;
                                        i13 = 1;
                                        num2 = num6;
                                        i17 = length2;
                                        int i52 = i40;
                                        j0Var = j0Var4;
                                        i11 = 0;
                                        if (i52 != i36) {
                                            break;
                                        }
                                    } else {
                                        i14 = i35;
                                        jVar = jVar3;
                                        j0Var = j0Var4;
                                        arrayList2 = arrayList5;
                                        f0Var = f0Var4;
                                        i11 = 0;
                                        i13 = 1;
                                        num2 = num6;
                                        i17 = length2;
                                    }
                                    if (i39 == i17) {
                                        break;
                                    }
                                    i35 = i14;
                                    j0Var4 = j0Var;
                                    f0Var4 = f0Var;
                                    nVar2 = nVar;
                                    jVar3 = jVar;
                                    i36 = 8;
                                    i38 = i39 + 1;
                                    length2 = i17;
                                    num6 = num2;
                                    arrayList5 = arrayList2;
                                }
                            } else {
                                jVar = jVar3;
                                arrayList2 = arrayList5;
                                i10 = i33;
                                nVar = nVar2;
                                i11 = 0;
                                i13 = 1;
                                num2 = num6;
                                i14 = i35;
                                i15 = 0;
                            }
                            if (i15 == 0) {
                                Iterator it = jVar.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i16 = i11;
                                        break;
                                    } else {
                                        if (!nVar.k().f2150d.c((d2.v) ((Map.Entry) it.next()).getKey())) {
                                            i16 = i13;
                                            break;
                                        }
                                    }
                                }
                                i15 = i16;
                            }
                            if (i15 != 0) {
                                i32 = 8;
                                E(this, A(i14), 2048, num2, 8);
                            } else {
                                i32 = 8;
                            }
                            j9 >>= i32;
                            i34 = i9 + 1;
                            lVar2 = lVar;
                            i28 = i11;
                            num6 = num2;
                            iArr3 = iArr2;
                            jArr3 = jArr2;
                            i29 = i12;
                            i33 = i10;
                            arrayList5 = arrayList2;
                        }
                    }
                    i9 = i34;
                    arrayList2 = arrayList5;
                    iArr2 = iArr3;
                    jArr2 = jArr3;
                    i10 = i33;
                    i11 = i28;
                    i12 = i29;
                    num2 = num6;
                    j9 >>= i32;
                    i34 = i9 + 1;
                    lVar2 = lVar;
                    i28 = i11;
                    num6 = num2;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i29 = i12;
                    i33 = i10;
                    arrayList5 = arrayList2;
                }
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i28;
                int i53 = i29;
                num = num6;
                if (i33 != i32) {
                    return;
                } else {
                    i8 = i53;
                }
            } else {
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i28;
                num = num6;
                i8 = i29;
            }
            if (i8 == i31) {
                return;
            }
            i29 = i8 + 1;
            lVar2 = lVar;
            length = i31;
            i28 = i;
            num6 = num;
            i27 = i30;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
        }
    }

    public final void I(w1.f0 f0Var, o.y yVar) {
        d2.j u7;
        if (f0Var.G() && !this.f8330d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(f0Var)) {
            w1.f0 f0Var2 = null;
            if (!f0Var.F.d(8)) {
                f0Var = f0Var.s();
                while (true) {
                    if (f0Var == null) {
                        f0Var = null;
                        break;
                    } else if (f0Var.F.d(8)) {
                        break;
                    } else {
                        f0Var = f0Var.s();
                    }
                }
            }
            if (f0Var == null || (u7 = f0Var.u()) == null) {
                return;
            }
            if (!u7.f2152f) {
                w1.f0 s5 = f0Var.s();
                while (true) {
                    if (s5 != null) {
                        d2.j u8 = s5.u();
                        if (u8 != null && u8.f2152f) {
                            f0Var2 = s5;
                            break;
                        }
                        s5 = s5.s();
                    } else {
                        break;
                    }
                }
                if (f0Var2 != null) {
                    f0Var = f0Var2;
                }
            }
            int i = f0Var.f7640e;
            if (yVar.a(i)) {
                E(this, A(i), 2048, 1, 8);
            }
        }
    }

    public final void J(w1.f0 f0Var) {
        if (f0Var.G() && !this.f8330d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(f0Var)) {
            int i = f0Var.f7640e;
            d2.h hVar = (d2.h) this.f8344s.b(i);
            d2.h hVar2 = (d2.h) this.f8345t.b(i);
            if (hVar == null && hVar2 == null) {
                return;
            }
            AccessibilityEvent o2 = o(i, 4096);
            if (hVar != null) {
                o2.setScrollX((int) ((Number) hVar.f2123a.b()).floatValue());
                o2.setMaxScrollX((int) ((Number) hVar.f2124b.b()).floatValue());
            }
            if (hVar2 != null) {
                o2.setScrollY((int) ((Number) hVar2.f2123a.b()).floatValue());
                o2.setMaxScrollY((int) ((Number) hVar2.f2124b.b()).floatValue());
            }
            C(o2);
        }
    }

    public final boolean K(d2.n nVar, int i, int i8, boolean z3) {
        String u7;
        d2.j jVar = nVar.f2159d;
        int i9 = nVar.f2162g;
        d2.v vVar = d2.i.i;
        if (jVar.f2150d.c(vVar) && g0.a(nVar)) {
            p6.f fVar = (p6.f) ((d2.a) nVar.f2159d.b(vVar)).f2109b;
            if (fVar != null) {
                return ((Boolean) fVar.d(Integer.valueOf(i), Integer.valueOf(i8), Boolean.valueOf(z3))).booleanValue();
            }
        } else if ((i != i8 || i8 != this.f8348w) && (u7 = u(nVar)) != null) {
            if (i < 0 || i != i8 || i8 > u7.length()) {
                i = -1;
            }
            this.f8348w = i;
            boolean z7 = u7.length() > 0;
            C(q(A(i9), z7 ? Integer.valueOf(this.f8348w) : null, z7 ? Integer.valueOf(this.f8348w) : null, z7 ? Integer.valueOf(u7.length()) : null, u7));
            G(i9);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P() {
        long j7;
        long j8;
        long j9;
        char c8;
        long[] jArr;
        long[] jArr2;
        long j10;
        int i;
        int i8;
        int i9;
        char c9;
        o.y yVar = new o.y();
        o.y yVar2 = this.D;
        int[] iArr = yVar2.f5565b;
        long[] jArr3 = yVar2.f5564a;
        int length = jArr3.length - 2;
        o.x xVar = this.J;
        int i10 = 8;
        if (length >= 0) {
            int i11 = 0;
            j7 = 128;
            j8 = 255;
            while (true) {
                long j11 = jArr3[i11];
                char c10 = 7;
                j9 = -9187201950435737472L;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j11 & 255) < 128) {
                            int i14 = iArr[(i11 << 3) + i13];
                            c9 = c10;
                            d2.o oVar = (d2.o) t().b(i14);
                            d2.n nVar = oVar != null ? oVar.f2163a : null;
                            if (nVar != null) {
                                if (nVar.f2159d.f2150d.c(d2.s.f2191d)) {
                                }
                            }
                            yVar.a(i14);
                            p1 p1Var = (p1) xVar.b(i14);
                            if (p1Var != null) {
                                Object g3 = p1Var.f8527a.f2150d.g(d2.s.f2191d);
                                r23 = g3 != 0 ? g3 : null;
                            }
                            F(i14, 32, r23);
                        } else {
                            c9 = c10;
                        }
                        j11 >>= 8;
                        i13++;
                        c10 = c9;
                    }
                    c8 = c10;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    c8 = 7;
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        } else {
            j7 = 128;
            j8 = 255;
            j9 = -9187201950435737472L;
            c8 = 7;
        }
        int[] iArr2 = yVar.f5565b;
        long[] jArr4 = yVar.f5564a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i15 = 0;
            while (true) {
                long j12 = jArr4[i15];
                if ((((~j12) << c8) & j12 & j9) != j9) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j12 & j8) < j7) {
                            int i18 = iArr2[(i15 << 3) + i17];
                            int hashCode = Integer.hashCode(i18) * (-862048943);
                            int i19 = hashCode ^ (hashCode << 16);
                            int i20 = i19 & 127;
                            int i21 = yVar2.f5566c;
                            int i22 = (i19 >>> 7) & i21;
                            i = i10;
                            int i23 = 0;
                            while (true) {
                                long[] jArr5 = yVar2.f5564a;
                                int i24 = i22 >> 3;
                                jArr2 = jArr4;
                                int i25 = (i22 & 7) << 3;
                                j10 = j12;
                                long j13 = (jArr5[i24] >>> i25) | ((jArr5[i24 + 1] << (64 - i25)) & ((-i25) >> 63));
                                int i26 = i21;
                                long j14 = (i20 * 72340172838076673L) ^ j13;
                                long j15 = (j14 - 72340172838076673L) & (~j14) & j9;
                                while (true) {
                                    if (j15 == 0) {
                                        break;
                                    }
                                    i9 = (i22 + (Long.numberOfTrailingZeros(j15) >> 3)) & i26;
                                    int i27 = i26;
                                    if (yVar2.f5565b[i9] == i18) {
                                        break;
                                    }
                                    j15 &= j15 - 1;
                                    i26 = i27;
                                }
                                i23 += 8;
                                i22 = (i22 + i23) & i8;
                                jArr4 = jArr2;
                                i21 = i8;
                                j12 = j10;
                            }
                            int i28 = i9;
                            if (i28 >= 0) {
                                yVar2.f(i28);
                            }
                        } else {
                            jArr2 = jArr4;
                            j10 = j12;
                            i = i10;
                        }
                        j12 = j10 >> i;
                        i17++;
                        i10 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i16 != i10) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i15 == length2) {
                    break;
                }
                i15++;
                jArr4 = jArr;
                i10 = 8;
            }
        }
        xVar.c();
        o.l t3 = t();
        int[] iArr3 = t3.f5495b;
        Object[] objArr = t3.f5496c;
        long[] jArr6 = t3.f5494a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i29 = 0;
            while (true) {
                long j16 = jArr6[i29];
                if ((((~j16) << c8) & j16 & j9) != j9) {
                    int i30 = 8 - ((~(i29 - length3)) >>> 31);
                    for (int i31 = 0; i31 < i30; i31++) {
                        if ((j16 & j8) < j7) {
                            int i32 = (i29 << 3) + i31;
                            int i33 = iArr3[i32];
                            d2.n nVar2 = ((d2.o) objArr[i32]).f2163a;
                            d2.j jVar = nVar2.f2159d;
                            d2.v vVar = d2.s.f2191d;
                            if (jVar.f2150d.c(vVar) && yVar2.a(i33)) {
                                F(i33, 16, (String) nVar2.f2159d.b(vVar));
                            }
                            xVar.g(i33, new p1(nVar2, t()));
                        }
                        j16 >>= 8;
                    }
                    if (i30 != 8) {
                        break;
                    }
                }
                if (i29 == length3) {
                    break;
                } else {
                    i29++;
                }
            }
        }
        this.K = new p1(this.f8330d.getSemanticsOwner().a(), t());
    }

    @Override // q3.b
    public final q3.k b(View view) {
        return this.f8338m;
    }

    public final void j(int i, r3.f fVar, String str, Bundle bundle) {
        d2.n nVar;
        Region N;
        float[] M;
        Rect L;
        int i8;
        float h8;
        float h9;
        float g3;
        float g7;
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i9;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo2 = fVar.f6557a;
        d2.o oVar = (d2.o) t().b(i);
        if (oVar == null || (nVar = oVar.f2163a) == null) {
            return;
        }
        d2.j jVar = nVar.f2159d;
        o.j0 j0Var = jVar.f2150d;
        String u7 = u(nVar);
        if (q6.i.a(str, this.G)) {
            int d8 = this.E.d(i);
            if (d8 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, d8);
                return;
            }
            return;
        }
        if (q6.i.a(str, this.H)) {
            int d9 = this.F.d(i);
            if (d9 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, d9);
                return;
            }
            return;
        }
        boolean z3 = false;
        if (!j0Var.c(d2.i.f2125a) || bundle == null || !q6.i.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            d2.v vVar = d2.s.f2210x;
            if (j0Var.c(vVar) && bundle != null && q6.i.a(str, "androidx.compose.ui.semantics.testTag")) {
                Object g8 = j0Var.g(vVar);
                String str2 = (String) (g8 == null ? null : g8);
                if (str2 != null) {
                    accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (q6.i.a(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo2.getExtras().putInt(str, nVar.f2162g);
                return;
            }
            if (q6.i.a(str, "androidx.compose.ui.semantics.shapeType")) {
                Object g9 = j0Var.g(d2.s.M);
                f1.i0 i0Var = (f1.i0) (g9 == null ? null : g9);
                if (i0Var != null) {
                    f1.p p7 = p(i0Var, nVar);
                    if (p7 instanceof f1.d0) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(p7));
                        return;
                    } else if (p7 instanceof f1.e0) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(p7));
                        accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", M(p7));
                        return;
                    } else {
                        if (!(p7 instanceof f1.c0)) {
                            throw new a5.c();
                        }
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", N(p7));
                        return;
                    }
                }
                return;
            }
            if (q6.i.a(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object g10 = j0Var.g(d2.s.M);
                f1.i0 i0Var2 = (f1.i0) (g10 == null ? null : g10);
                if (i0Var2 == null || (L = L(p(i0Var2, nVar))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L);
                return;
            }
            if (q6.i.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object g11 = j0Var.g(d2.s.M);
                f1.i0 i0Var3 = (f1.i0) (g11 == null ? null : g11);
                if (i0Var3 == null || (M = M(p(i0Var3, nVar))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", M);
                return;
            }
            if (q6.i.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object g12 = j0Var.g(d2.s.M);
                f1.i0 i0Var4 = (f1.i0) (g12 == null ? null : g12);
                if (i0Var4 == null || (N = N(p(i0Var4, nVar))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", N);
                return;
            }
            return;
        }
        int i10 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i11 > 0 && i10 >= 0) {
            if (i10 < (u7 != null ? u7.length() : Integer.MAX_VALUE)) {
                g2.f0 m7 = g0.m(jVar);
                if (m7 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = i10 + i12;
                    if (i13 >= m7.f2941a.f2931a.f2928e.length()) {
                        arrayList.add(z3);
                        i8 = i10;
                        accessibilityNodeInfo = accessibilityNodeInfo2;
                        i9 = i11;
                    } else {
                        g2.l lVar = m7.f2942b;
                        g2.e eVar = (g2.e) ((g2.n) lVar.f2973c).f2979b;
                        if (i13 < 0 || i13 >= eVar.f2928e.length()) {
                            StringBuilder l3 = a0.q.l("offset(", i13, ") is out of bounds [0, ");
                            l3.append(eVar.f2928e.length());
                            l3.append(')');
                            l2.a.a(l3.toString());
                        }
                        ArrayList arrayList2 = (ArrayList) lVar.f2975e;
                        g2.o oVar2 = (g2.o) arrayList2.get(g2.a0.c(i13, arrayList2));
                        g2.a aVar = oVar2.f2983a;
                        int a8 = oVar2.a(i13);
                        CharSequence charSequence = aVar.f2898e;
                        if (a8 < 0 || a8 >= charSequence.length()) {
                            StringBuilder l7 = a0.q.l("offset(", a8, ") is out of bounds [0,");
                            l7.append(charSequence.length());
                            l7.append(')');
                            l2.a.a(l7.toString());
                        }
                        h2.j jVar2 = aVar.f2897d;
                        Layout layout = jVar2.f3107e;
                        int lineForOffset = layout.getLineForOffset(a8);
                        float f6 = jVar2.f(lineForOffset);
                        float d10 = jVar2.d(lineForOffset);
                        i8 = i10;
                        boolean z7 = layout.getParagraphDirection(lineForOffset) == 1;
                        boolean isRtlCharAt = layout.isRtlCharAt(a8);
                        if (!z7 || isRtlCharAt) {
                            if (z7 && isRtlCharAt) {
                                g3 = jVar2.h(a8, false);
                                g7 = jVar2.h(a8 + 1, true);
                            } else if (isRtlCharAt) {
                                g3 = jVar2.g(a8, false);
                                g7 = jVar2.g(a8 + 1, true);
                            } else {
                                h8 = jVar2.h(a8, false);
                                h9 = jVar2.h(a8 + 1, true);
                            }
                            float f8 = g3;
                            h8 = g7;
                            h9 = f8;
                        } else {
                            h8 = jVar2.g(a8, false);
                            h9 = jVar2.g(a8 + 1, true);
                        }
                        RectF rectF2 = new RectF(h8, f6, h9, d10);
                        accessibilityNodeInfo = accessibilityNodeInfo2;
                        i9 = i11;
                        long floatToRawIntBits = (Float.floatToRawIntBits(oVar2.f2988f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                        int i14 = (int) (floatToRawIntBits >> 32);
                        int i15 = (int) (floatToRawIntBits & 4294967295L);
                        e1.c cVar = new e1.c(Float.intBitsToFloat(i14) + rectF2.left, Float.intBitsToFloat(i15) + rectF2.top, Float.intBitsToFloat(i14) + rectF2.right, Float.intBitsToFloat(i15) + rectF2.bottom);
                        w1.d1 d11 = nVar.d();
                        long j7 = 0;
                        if (d11 != null) {
                            if (!d11.E0().f8718q) {
                                d11 = null;
                            }
                            if (d11 != null) {
                                j7 = d11.O0(0L);
                            }
                        }
                        e1.c e8 = cVar.e(j7);
                        e1.c g13 = nVar.g();
                        if ((((((e8.f2457a > g13.f2459c ? 1 : (e8.f2457a == g13.f2459c ? 0 : -1)) < 0) & ((g13.f2457a > e8.f2459c ? 1 : (g13.f2457a == e8.f2459c ? 0 : -1)) < 0)) & ((e8.f2458b > g13.f2460d ? 1 : (e8.f2458b == g13.f2460d ? 0 : -1)) < 0)) & ((g13.f2458b > e8.f2460d ? 1 : (g13.f2458b == e8.f2460d ? 0 : -1)) < 0) ? e8.c(g13) : null) != null) {
                            t tVar = this.f8330d;
                            long r7 = tVar.r((Float.floatToRawIntBits(r1.f2458b) & 4294967295L) | (Float.floatToRawIntBits(r1.f2457a) << 32));
                            long r8 = tVar.r((Float.floatToRawIntBits(r1.f2459c) << 32) | (Float.floatToRawIntBits(r1.f2460d) & 4294967295L));
                            int i16 = (int) (r7 >> 32);
                            int i17 = (int) (r8 >> 32);
                            int i18 = (int) (r7 & 4294967295L);
                            int i19 = (int) (r8 & 4294967295L);
                            rectF = new RectF(Math.min(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17)), Math.min(Float.intBitsToFloat(i18), Float.intBitsToFloat(i19)), Math.max(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17)), Math.max(Float.intBitsToFloat(i18), Float.intBitsToFloat(i19)));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i12++;
                    i11 = i9;
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    i10 = i8;
                    z3 = false;
                }
                accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect k(d2.o oVar) {
        r2.j jVar = oVar.f2164b;
        float f6 = jVar.f6524a;
        float f8 = jVar.f6525b;
        long floatToRawIntBits = (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
        t tVar = this.f8330d;
        long r7 = tVar.r(floatToRawIntBits);
        float f9 = jVar.f6526c;
        float f10 = jVar.f6527d;
        long r8 = tVar.r((Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
        int i = (int) (r7 >> 32);
        int i8 = (int) (r8 >> 32);
        int i9 = (int) (r7 & 4294967295L);
        int i10 = (int) (r8 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i8))), (int) Math.floor(Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i8))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f2, code lost:
    
        if (a7.x.c(r4, r2) == r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005d, B:21:0x006f, B:23:0x0077, B:25:0x0080, B:27:0x0086, B:29:0x0095, B:31:0x009d, B:53:0x0047, B:55:0x004e), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f2 -> B:14:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(i6.c cVar) {
        y yVar;
        int i;
        o.f fVar;
        o.f fVar2;
        o.y yVar2;
        c7.b bVar;
        o.y yVar3;
        c7.b bVar2;
        int i8;
        long j7;
        Object b8;
        try {
            if (cVar instanceof y) {
                yVar = (y) cVar;
                int i9 = yVar.f8608k;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    yVar.f8608k = i9 - Integer.MIN_VALUE;
                    Object obj = yVar.i;
                    i = yVar.f8608k;
                    fVar = this.f8350y;
                    h6.a aVar = h6.a.f3204d;
                    if (i != 0) {
                        s6.a.K(obj);
                        yVar2 = new o.y();
                        c7.c cVar2 = this.f8351z;
                        cVar2.getClass();
                        bVar = new c7.b(cVar2);
                        yVar.f8605g = yVar2;
                        yVar.f8606h = bVar;
                        yVar.f8608k = 1;
                        b8 = bVar.b(yVar);
                        if (b8 != aVar) {
                        }
                    } else if (i == 1) {
                        bVar2 = yVar.f8606h;
                        yVar3 = yVar.f8605g;
                        s6.a.K(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = yVar.f8606h;
                        yVar3 = yVar.f8605g;
                        s6.a.K(obj);
                        char c8 = 2;
                        fVar2 = fVar;
                        yVar2 = yVar3;
                        fVar = fVar2;
                        bVar = bVar2;
                        yVar.f8605g = yVar2;
                        yVar.f8606h = bVar;
                        yVar.f8608k = 1;
                        b8 = bVar.b(yVar);
                        if (b8 != aVar) {
                            return aVar;
                        }
                        c7.b bVar3 = bVar;
                        yVar3 = yVar2;
                        obj = b8;
                        bVar2 = bVar3;
                        if (((Boolean) obj).booleanValue()) {
                            fVar.clear();
                            return c6.m.f1757a;
                        }
                        bVar2.c();
                        if (v()) {
                            int i10 = fVar.f5446f;
                            for (int i11 = 0; i11 < i10; i11++) {
                                w1.f0 f0Var = (w1.f0) fVar.f5445e[i11];
                                I(f0Var, yVar3);
                                J(f0Var);
                            }
                            yVar3.f5567d = 0;
                            long[] jArr = yVar3.f5564a;
                            if (jArr != o.r0.f5528a) {
                                try {
                                    d6.l.M(jArr, -9187201950435737472L);
                                    long[] jArr2 = yVar3.f5564a;
                                    i8 = yVar3.f5566c;
                                    int i12 = i8 >> 3;
                                    jArr2[i12] = ((~j7) & jArr2[i12]) | j7;
                                } catch (Throwable th) {
                                    th = th;
                                    fVar2.clear();
                                    throw th;
                                }
                                j7 = 255 << ((i8 & 7) << 3);
                                fVar2 = fVar;
                            } else {
                                fVar2 = fVar;
                            }
                            yVar3.f5568e = o.r0.a(yVar3.f5566c) - yVar3.f5567d;
                            if (!this.L) {
                                this.L = true;
                                this.f8337l.post(this.N);
                            }
                        } else {
                            fVar2 = fVar;
                        }
                        fVar2.clear();
                        this.f8344s.c();
                        this.f8345t.c();
                        long j8 = this.f8334h;
                        yVar.f8605g = yVar3;
                        yVar.f8606h = bVar2;
                        c8 = 2;
                        yVar.f8608k = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            fVar2 = fVar;
        }
        yVar = new y(this, cVar);
        Object obj2 = yVar.i;
        i = yVar.f8608k;
        fVar = this.f8350y;
        h6.a aVar2 = h6.a.f3204d;
    }

    public final boolean m(boolean z3, int i, long j7) {
        d2.v vVar;
        int i8;
        if (!q6.i.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        o.l t3 = t();
        if (e1.b.b(j7, 9205357640488583168L) || (((9223372034707292159L & j7) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z3) {
            vVar = d2.s.f2207u;
        } else {
            if (z3) {
                throw new a5.c();
            }
            vVar = d2.s.f2206t;
        }
        Object[] objArr = t3.f5496c;
        long[] jArr = t3.f5494a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i9 = 0;
        boolean z7 = false;
        while (true) {
            long j8 = jArr[i9];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8;
                int i11 = 8 - ((~(i9 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((255 & j8) < 128) {
                        d2.o oVar = (d2.o) objArr[(i9 << 3) + i12];
                        r2.j jVar = oVar.f2164b;
                        float f6 = jVar.f6524a;
                        i8 = i10;
                        float f8 = jVar.f6525b;
                        float f9 = jVar.f6526c;
                        float f10 = jVar.f6527d;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                        if ((intBitsToFloat2 < f10) & (intBitsToFloat >= f6) & (intBitsToFloat < f9) & (intBitsToFloat2 >= f8)) {
                            Object g3 = oVar.f2163a.f2159d.f2150d.g(vVar);
                            if (g3 == null) {
                                g3 = null;
                            }
                            d2.h hVar = (d2.h) g3;
                            if (hVar != null) {
                                p6.a aVar = hVar.f2123a;
                                if (i < 0) {
                                    if (((Number) aVar.b()).floatValue() <= 0.0f) {
                                    }
                                    z7 = true;
                                } else {
                                    if (((Number) aVar.b()).floatValue() >= ((Number) hVar.f2124b.b()).floatValue()) {
                                    }
                                    z7 = true;
                                }
                            }
                        }
                    } else {
                        i8 = i10;
                    }
                    j8 >>= i8;
                    i12++;
                    i10 = i8;
                }
                if (i11 != i10) {
                    return z7;
                }
            }
            if (i9 == length) {
                return z7;
            }
            i9++;
        }
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.f8330d.getSemanticsOwner().a(), this.K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                H(t());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    P();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent o(int i, int i8) {
        d2.o oVar;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i8);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        t tVar = this.f8330d;
        obtain.setPackageName(tVar.getContext().getPackageName());
        obtain.setSource(tVar, i);
        if (v() && (oVar = (d2.o) t().b(i)) != null) {
            d2.n nVar = oVar.f2163a;
            obtain.setPassword(nVar.f2159d.f2150d.c(d2.s.H));
            Object g3 = nVar.f2159d.f2150d.g(d2.s.f2200n);
            if (g3 == null) {
                g3 = null;
            }
            boolean a8 = q6.i.a(g3, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                q3.v.i(obtain, a8);
            }
        }
        return obtain;
    }

    public final f1.p p(f1.i0 i0Var, d2.n nVar) {
        w1.d1 d8 = nVar.d();
        return i0Var.a(m.a.R(d8 != null ? d8.f7232f : 0L), nVar.f2158c.f7660z, this.f8330d.getDensity());
    }

    public final AccessibilityEvent q(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent o2 = o(i, 8192);
        if (num != null) {
            o2.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            o2.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            o2.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            o2.getText().add(charSequence);
        }
        return o2;
    }

    public final int r(d2.n nVar) {
        d2.j jVar = nVar.f2159d;
        d2.j jVar2 = nVar.f2159d;
        d2.v vVar = d2.s.f2188a;
        if (!jVar.f2150d.c(d2.s.f2188a)) {
            d2.v vVar2 = d2.s.E;
            if (jVar2.f2150d.c(vVar2)) {
                return (int) (((g2.h0) jVar2.b(vVar2)).f2960a & 4294967295L);
            }
        }
        return this.f8348w;
    }

    public final int s(d2.n nVar) {
        d2.j jVar = nVar.f2159d;
        d2.j jVar2 = nVar.f2159d;
        d2.v vVar = d2.s.f2188a;
        if (!jVar.f2150d.c(d2.s.f2188a)) {
            d2.v vVar2 = d2.s.E;
            if (jVar2.f2150d.c(vVar2)) {
                return (int) (((g2.h0) jVar2.b(vVar2)).f2960a >> 32);
            }
        }
        return this.f8348w;
    }

    public final o.l t() {
        if (this.A) {
            this.A = false;
            t tVar = this.f8330d;
            this.C = d2.q.b(tVar.getSemanticsOwner());
            if (v()) {
                o.x xVar = this.C;
                Resources resources = tVar.getContext().getResources();
                o.v vVar = this.E;
                vVar.a();
                o.v vVar2 = this.F;
                vVar2.a();
                d2.o oVar = (d2.o) xVar.b(-1);
                d2.n nVar = oVar != null ? oVar.f2163a : null;
                q6.i.b(nVar);
                ArrayList b8 = d2.y.b(nVar, new b1.e(14, xVar), new b1.e(15, resources), s6.a.x(nVar));
                int t3 = s6.a.t(b8);
                int i = 1;
                if (1 <= t3) {
                    while (true) {
                        int i8 = ((d2.n) b8.get(i - 1)).f2162g;
                        int i9 = ((d2.n) b8.get(i)).f2162g;
                        vVar.f(i8, i9);
                        vVar2.f(i9, i8);
                        if (i == t3) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.C;
    }

    public final boolean v() {
        return this.f8333g.isEnabled() && !this.f8336k.isEmpty();
    }

    public final void w(w1.f0 f0Var) {
        if (this.f8350y.add(f0Var)) {
            this.f8351z.t(c6.m.f1757a);
        }
    }
}
