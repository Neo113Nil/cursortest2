package s1;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.installreferrer.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 extends b3.b {
    public static final i.o N;
    public i.p A;
    public final i.q B;
    public final i.n C;
    public final i.n D;
    public final String E;
    public final String F;
    public final b1.b G;
    public final i.p H;
    public f2 I;
    public boolean J;
    public final androidx.lifecycle.c0 K;
    public final ArrayList L;
    public final a0 M;

    /* renamed from: d, reason: collision with root package name */
    public final r f8160d;

    /* renamed from: e, reason: collision with root package name */
    public int f8161e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f8162f = new a0(this, 0);

    /* renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f8163g;

    /* renamed from: h, reason: collision with root package name */
    public long f8164h;

    /* renamed from: i, reason: collision with root package name */
    public final s f8165i;

    /* renamed from: j, reason: collision with root package name */
    public final t f8166j;

    /* renamed from: k, reason: collision with root package name */
    public List f8167k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f8168l;

    /* renamed from: m, reason: collision with root package name */
    public final q5.g f8169m;

    /* renamed from: n, reason: collision with root package name */
    public int f8170n;

    /* renamed from: o, reason: collision with root package name */
    public c3.i f8171o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8172p;

    /* renamed from: q, reason: collision with root package name */
    public final i.p f8173q;

    /* renamed from: r, reason: collision with root package name */
    public final i.p f8174r;

    /* renamed from: s, reason: collision with root package name */
    public final i.h0 f8175s;

    /* renamed from: t, reason: collision with root package name */
    public final i.h0 f8176t;

    /* renamed from: u, reason: collision with root package name */
    public int f8177u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f8178v;

    /* renamed from: w, reason: collision with root package name */
    public final i.f f8179w;

    /* renamed from: x, reason: collision with root package name */
    public final e7.e f8180x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8181y;

    /* renamed from: z, reason: collision with root package name */
    public y f8182z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i7 = i.h.f4745a;
        i.o oVar = new i.o(32);
        int i8 = oVar.f4769b;
        if (i8 < 0) {
            StringBuilder n8 = a0.m.n(i8, "Index ", " must be in 0..");
            n8.append(oVar.f4769b);
            throw new IndexOutOfBoundsException(n8.toString());
        }
        int i9 = i8 + 32;
        oVar.b(i9);
        int[] iArr2 = oVar.f4768a;
        int i10 = oVar.f4769b;
        if (i8 != i10) {
            e6.k.W(iArr2, iArr2, i9, i8, i10);
        }
        e6.k.Y(iArr, iArr2, i8, 0, 12);
        oVar.f4769b += 32;
        N = oVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [s1.s] */
    /* JADX WARN: Type inference failed for: r2v5, types: [s1.t] */
    public c0(r rVar) {
        this.f8160d = rVar;
        Object systemService = rVar.getContext().getSystemService("accessibility");
        r6.k.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f8163g = accessibilityManager;
        this.f8164h = 100L;
        this.f8165i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: s1.s
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z8) {
                c0 c0Var = c0.this;
                c0Var.f8167k = z8 ? c0Var.f8163g.getEnabledAccessibilityServiceList(-1) : e6.u.f2826f;
            }
        };
        this.f8166j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: s1.t
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z8) {
                c0 c0Var = c0.this;
                c0Var.f8167k = c0Var.f8163g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f8167k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f8168l = new Handler(Looper.getMainLooper());
        this.f8169m = new q5.g(this);
        this.f8170n = Integer.MIN_VALUE;
        this.f8173q = new i.p();
        this.f8174r = new i.p();
        this.f8175s = new i.h0();
        this.f8176t = new i.h0();
        this.f8177u = -1;
        this.f8179w = new i.f(0);
        this.f8180x = j1.c.C(1, 6, null);
        this.f8181y = true;
        i.p pVar = i.i.f4750a;
        r6.k.d(pVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A = pVar;
        this.B = new i.q();
        this.C = new i.n();
        this.D = new i.n();
        this.E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.G = new b1.b(8);
        this.H = new i.p();
        y1.m a3 = rVar.getSemanticsOwner().a();
        r6.k.d(pVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.I = new f2(a3, pVar);
        rVar.addOnAttachStateChangeListener(new u(0, this));
        this.K = new androidx.lifecycle.c0(11, this);
        this.L = new ArrayList();
        this.M = new a0(this, 1);
    }

    public static CharSequence H(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i7 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i7 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i7);
                r6.k.d(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    public static boolean m(y1.m mVar) {
        Object obj = mVar.f9840d.f9832f.get(y1.p.B);
        if (obj == null) {
            obj = null;
        }
        z1.a aVar = (z1.a) obj;
        LinkedHashMap linkedHashMap = mVar.f9840d.f9832f;
        Object obj2 = linkedHashMap.get(y1.p.f9877s);
        if (obj2 == null) {
            obj2 = null;
        }
        y1.f fVar = (y1.f) obj2;
        boolean z8 = aVar != null;
        Object obj3 = linkedHashMap.get(y1.p.A);
        if (((Boolean) (obj3 != null ? obj3 : null)) == null || (fVar != null && fVar.f9803a == 4)) {
            return z8;
        }
        return true;
    }

    public static String o(y1.m mVar) {
        a2.g gVar;
        if (mVar != null) {
            y1.i iVar = mVar.f9840d;
            LinkedHashMap linkedHashMap = iVar.f9832f;
            y1.s sVar = y1.p.f9859a;
            if (linkedHashMap.containsKey(sVar)) {
                return a8.d.E((List) iVar.g(sVar), ",");
            }
            y1.s sVar2 = y1.p.f9882x;
            if (linkedHashMap.containsKey(sVar2)) {
                Object obj = linkedHashMap.get(sVar2);
                if (obj == null) {
                    obj = null;
                }
                a2.g gVar2 = (a2.g) obj;
                if (gVar2 != null) {
                    return gVar2.f373f;
                }
            } else {
                Object obj2 = linkedHashMap.get(y1.p.f9879u);
                if (obj2 == null) {
                    obj2 = null;
                }
                List list = (List) obj2;
                if (list != null && (gVar = (a2.g) e6.l.i0(list)) != null) {
                    return gVar.f373f;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q6.a, r6.l] */
    /* JADX WARN: Type inference failed for: r3v2, types: [q6.a, r6.l] */
    public static final boolean s(y1.g gVar, float f9) {
        ?? r02 = gVar.f9804a;
        if (f9 >= 0.0f || ((Number) r02.a()).floatValue() <= 0.0f) {
            return f9 > 0.0f && ((Number) r02.a()).floatValue() < ((Number) gVar.f9805b.a()).floatValue();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q6.a, r6.l] */
    /* JADX WARN: Type inference failed for: r3v1, types: [q6.a, r6.l] */
    public static final boolean t(y1.g gVar) {
        ?? r02 = gVar.f9804a;
        if (((Number) r02.a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) r02.a()).floatValue();
        ((Number) gVar.f9805b.a()).floatValue();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q6.a, r6.l] */
    /* JADX WARN: Type inference failed for: r2v1, types: [q6.a, r6.l] */
    public static final boolean u(y1.g gVar) {
        ?? r02 = gVar.f9804a;
        if (((Number) r02.a()).floatValue() < ((Number) gVar.f9805b.a()).floatValue()) {
            return true;
        }
        ((Number) r02.a()).floatValue();
        return false;
    }

    public static /* synthetic */ void z(c0 c0Var, int i7, int i8, Integer num, int i9) {
        if ((i9 & 4) != 0) {
            num = null;
        }
        c0Var.y(i7, i8, num, null);
    }

    public final void A(int i7, int i8, String str) {
        AccessibilityEvent g9 = g(v(i7), 32);
        g9.setContentChangeTypes(i8);
        if (str != null) {
            g9.getText().add(str);
        }
        x(g9);
    }

    public final void B(int i7) {
        y yVar = this.f8182z;
        if (yVar != null) {
            y1.m mVar = yVar.f8470a;
            if (i7 != mVar.f9843g) {
                return;
            }
            if (SystemClock.uptimeMillis() - yVar.f8475f <= 1000) {
                AccessibilityEvent g9 = g(v(mVar.f9843g), 131072);
                g9.setFromIndex(yVar.f8473d);
                g9.setToIndex(yVar.f8474e);
                g9.setAction(yVar.f8471b);
                g9.setMovementGranularity(yVar.f8472c);
                g9.getText().add(o(mVar));
                x(g9);
            }
        }
        this.f8182z = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0541, code lost:
    
        if (r5 != null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0546, code lost:
    
        if (r5 == null) goto L250;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(i.p pVar) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i7;
        int i8;
        Integer num2;
        int i9;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i10;
        int i11;
        int i12;
        Integer num4;
        int i13;
        e2 e2Var;
        boolean z8;
        y1.s sVar;
        y1.s sVar2;
        ArrayList arrayList3;
        Integer num5;
        Integer num6;
        y1.m mVar;
        LinkedHashMap linkedHashMap;
        int i14;
        int i15;
        int i16;
        int i17;
        AccessibilityEvent h3;
        String str;
        e2 e2Var2;
        int i18;
        boolean z9;
        i.p pVar2 = pVar;
        Integer num7 = 64;
        ArrayList arrayList4 = this.L;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = pVar2.f4771b;
        long[] jArr3 = pVar2.f4770a;
        int i19 = 2;
        int length = jArr3.length - 2;
        int i20 = 0;
        Integer num8 = 0;
        if (length < 0) {
            return;
        }
        int i21 = 0;
        while (true) {
            long j8 = jArr3[i21];
            int i22 = i19;
            int i23 = length;
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i24 = 8;
                int i25 = 8 - ((~(i21 - i23)) >>> 31);
                long j9 = j8;
                int i26 = i20;
                while (i26 < i25) {
                    if ((j9 & 255) < 128) {
                        int i27 = iArr3[(i21 << 3) + i26];
                        f2 f2Var = (f2) this.H.f(i27);
                        if (f2Var != null) {
                            y1.i iVar = f2Var.f8232a;
                            LinkedHashMap linkedHashMap2 = iVar.f9832f;
                            g2 g2Var = (g2) pVar2.f(i27);
                            y1.m mVar2 = g2Var != null ? g2Var.f8236a : null;
                            if (mVar2 == null) {
                                a.a.N("no value for specified key");
                                throw null;
                            }
                            r1.d0 d0Var = mVar2.f9839c;
                            y1.i iVar2 = mVar2.f9840d;
                            iArr2 = iArr3;
                            int i28 = mVar2.f9843g;
                            jArr2 = jArr3;
                            LinkedHashMap linkedHashMap3 = iVar2.f9832f;
                            Iterator it = iVar2.iterator();
                            boolean z10 = false;
                            while (true) {
                                i9 = i26;
                                if (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    Object key = entry.getKey();
                                    y1.i iVar3 = iVar;
                                    y1.s sVar3 = y1.p.f9873o;
                                    if (r6.k.a(key, sVar3)) {
                                        i13 = i21;
                                    } else {
                                        i13 = i21;
                                        if (!r6.k.a(entry.getKey(), y1.p.f9874p)) {
                                            z8 = false;
                                            if (!z8) {
                                                Object value = entry.getValue();
                                                Object obj = linkedHashMap2.get((y1.s) entry.getKey());
                                                if (obj == null) {
                                                    obj = null;
                                                }
                                                if (r6.k.a(value, obj)) {
                                                    num5 = num8;
                                                    num6 = num7;
                                                    arrayList3 = arrayList5;
                                                    mVar = mVar2;
                                                    i14 = i27;
                                                    linkedHashMap = linkedHashMap2;
                                                    i27 = i14;
                                                    linkedHashMap2 = linkedHashMap;
                                                    num8 = num5;
                                                    i26 = i9;
                                                    mVar2 = mVar;
                                                    iVar = iVar3;
                                                    i21 = i13;
                                                    arrayList5 = arrayList3;
                                                    num7 = num6;
                                                }
                                            }
                                            sVar = (y1.s) entry.getKey();
                                            sVar2 = y1.p.f9862d;
                                            if (r6.k.a(sVar, sVar2)) {
                                                if (r6.k.a(sVar, y1.p.f9860b) ? true : r6.k.a(sVar, y1.p.B)) {
                                                    z(this, v(i27), 2048, num7, 8);
                                                    z(this, v(i27), 2048, num8, 8);
                                                } else {
                                                    arrayList3 = arrayList5;
                                                    if (r6.k.a(sVar, y1.p.f9861c)) {
                                                        z(this, v(i27), 2048, num7, 8);
                                                        z(this, v(i27), 2048, num8, 8);
                                                        num5 = num8;
                                                        num6 = num7;
                                                        mVar = mVar2;
                                                        i14 = i27;
                                                        linkedHashMap = linkedHashMap2;
                                                        i27 = i14;
                                                        linkedHashMap2 = linkedHashMap;
                                                        num8 = num5;
                                                        i26 = i9;
                                                        mVar2 = mVar;
                                                        iVar = iVar3;
                                                        i21 = i13;
                                                        arrayList5 = arrayList3;
                                                        num7 = num6;
                                                    } else {
                                                        y1.s sVar4 = y1.p.A;
                                                        if (r6.k.a(sVar, sVar4)) {
                                                            Object obj2 = linkedHashMap3.get(y1.p.f9877s);
                                                            if (obj2 == null) {
                                                                obj2 = null;
                                                            }
                                                            y1.f fVar = (y1.f) obj2;
                                                            if (fVar != null && fVar.f9803a == 4) {
                                                                Object obj3 = linkedHashMap3.get(sVar4);
                                                                if (obj3 == null) {
                                                                    obj3 = null;
                                                                }
                                                                if (r6.k.a(obj3, Boolean.TRUE)) {
                                                                    AccessibilityEvent g9 = g(v(i27), 4);
                                                                    y1.m mVar3 = new y1.m(mVar2.f9837a, true, d0Var, iVar2);
                                                                    Object obj4 = mVar3.i().f9832f.get(y1.p.f9859a);
                                                                    if (obj4 == null) {
                                                                        obj4 = null;
                                                                    }
                                                                    List list = (List) obj4;
                                                                    String E = list != null ? a8.d.E(list, ",") : null;
                                                                    mVar = mVar2;
                                                                    Object obj5 = mVar3.i().f9832f.get(y1.p.f9879u);
                                                                    if (obj5 == null) {
                                                                        obj5 = null;
                                                                    }
                                                                    List list2 = (List) obj5;
                                                                    String E2 = list2 != null ? a8.d.E(list2, ",") : null;
                                                                    if (E != null) {
                                                                        g9.setContentDescription(E);
                                                                    }
                                                                    if (E2 != null) {
                                                                        g9.getText().add(E2);
                                                                    }
                                                                    x(g9);
                                                                } else {
                                                                    mVar = mVar2;
                                                                    z(this, v(i27), 2048, num8, 8);
                                                                }
                                                            } else {
                                                                mVar = mVar2;
                                                                z(this, v(i27), 2048, num7, 8);
                                                                z(this, v(i27), 2048, num8, 8);
                                                            }
                                                        } else {
                                                            mVar = mVar2;
                                                            if (r6.k.a(sVar, y1.p.f9859a)) {
                                                                int v5 = v(i27);
                                                                Object value2 = entry.getValue();
                                                                r6.k.d(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                y(v5, 2048, 4, (List) value2);
                                                            } else {
                                                                y1.s sVar5 = y1.p.f9882x;
                                                                String str2 = "";
                                                                if (!r6.k.a(sVar, sVar5)) {
                                                                    num5 = num8;
                                                                    linkedHashMap = linkedHashMap2;
                                                                    num6 = num7;
                                                                    i14 = i27;
                                                                    y1.s sVar6 = y1.p.f9883y;
                                                                    if (r6.k.a(sVar, sVar6)) {
                                                                        Object obj6 = linkedHashMap3.get(sVar5);
                                                                        if (obj6 == null) {
                                                                            obj6 = null;
                                                                        }
                                                                        a2.g gVar = (a2.g) obj6;
                                                                        if (gVar != null && (str = gVar.f373f) != null) {
                                                                            str2 = str;
                                                                        }
                                                                        long j10 = ((a2.j0) iVar2.g(sVar6)).f408a;
                                                                        x(h(v(i14), Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) (j10 & 4294967295L)), Integer.valueOf(str2.length()), H(str2)));
                                                                        B(i28);
                                                                    } else {
                                                                        if (r6.k.a(sVar, sVar3) ? true : r6.k.a(sVar, y1.p.f9874p)) {
                                                                            r(d0Var);
                                                                            int size = arrayList4.size();
                                                                            int i29 = 0;
                                                                            while (true) {
                                                                                if (i29 >= size) {
                                                                                    e2Var2 = null;
                                                                                    break;
                                                                                } else {
                                                                                    if (((e2) arrayList4.get(i29)).f8204f == i14) {
                                                                                        e2Var2 = (e2) arrayList4.get(i29);
                                                                                        break;
                                                                                    }
                                                                                    i29++;
                                                                                }
                                                                            }
                                                                            r6.k.c(e2Var2);
                                                                            Object obj7 = linkedHashMap3.get(sVar3);
                                                                            if (obj7 == null) {
                                                                                obj7 = null;
                                                                            }
                                                                            e2Var2.f8208j = (y1.g) obj7;
                                                                            Object obj8 = linkedHashMap3.get(y1.p.f9874p);
                                                                            if (obj8 == null) {
                                                                                obj8 = null;
                                                                            }
                                                                            e2Var2.f8209k = (y1.g) obj8;
                                                                            if (e2Var2.f8205g.contains(e2Var2)) {
                                                                                this.f8160d.getSnapshotObserver().a(e2Var2, this.M, new a0.b1(e2Var2, 9, this));
                                                                            }
                                                                        } else if (r6.k.a(sVar, y1.p.f9869k)) {
                                                                            Object value3 = entry.getValue();
                                                                            r6.k.d(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                                                            if (((Boolean) value3).booleanValue()) {
                                                                                i18 = 8;
                                                                                x(g(v(i28), 8));
                                                                            } else {
                                                                                i18 = 8;
                                                                            }
                                                                            z(this, v(i28), 2048, num5, i18);
                                                                        } else {
                                                                            y1.s sVar7 = y1.h.f9827v;
                                                                            if (r6.k.a(sVar, sVar7)) {
                                                                                List list3 = (List) iVar2.g(sVar7);
                                                                                Object obj9 = linkedHashMap.get(sVar7);
                                                                                if (obj9 == null) {
                                                                                    obj9 = null;
                                                                                }
                                                                                List list4 = (List) obj9;
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
                                                                                    if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                        z10 = false;
                                                                                    }
                                                                                    z10 = true;
                                                                                } else if (!list3.isEmpty()) {
                                                                                    i27 = i14;
                                                                                    linkedHashMap2 = linkedHashMap;
                                                                                    num8 = num5;
                                                                                    i26 = i9;
                                                                                    mVar2 = mVar;
                                                                                    iVar = iVar3;
                                                                                    i21 = i13;
                                                                                    arrayList5 = arrayList3;
                                                                                    num7 = num6;
                                                                                    z10 = true;
                                                                                }
                                                                                i27 = i14;
                                                                                linkedHashMap2 = linkedHashMap;
                                                                                num8 = num5;
                                                                                i26 = i9;
                                                                                mVar2 = mVar;
                                                                                iVar = iVar3;
                                                                                i21 = i13;
                                                                                arrayList5 = arrayList3;
                                                                                num7 = num6;
                                                                            } else {
                                                                                if (entry.getValue() instanceof y1.a) {
                                                                                    Object value4 = entry.getValue();
                                                                                    r6.k.d(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                                                    y1.a aVar = (y1.a) value4;
                                                                                    Object obj10 = linkedHashMap.get((y1.s) entry.getKey());
                                                                                    if (obj10 == null) {
                                                                                        obj10 = null;
                                                                                    }
                                                                                    if (aVar != obj10) {
                                                                                        if (obj10 instanceof y1.a) {
                                                                                            String str3 = aVar.f9793a;
                                                                                            y1.a aVar2 = (y1.a) obj10;
                                                                                            d6.e eVar = aVar2.f9794b;
                                                                                            if (r6.k.a(str3, aVar2.f9793a)) {
                                                                                                d6.e eVar2 = aVar.f9794b;
                                                                                                if (eVar2 == null) {
                                                                                                }
                                                                                                if (eVar2 != null) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        z9 = false;
                                                                                        if (z9) {
                                                                                            z10 = false;
                                                                                            i27 = i14;
                                                                                            linkedHashMap2 = linkedHashMap;
                                                                                            num8 = num5;
                                                                                            i26 = i9;
                                                                                            mVar2 = mVar;
                                                                                            iVar = iVar3;
                                                                                            i21 = i13;
                                                                                            arrayList5 = arrayList3;
                                                                                            num7 = num6;
                                                                                        }
                                                                                    }
                                                                                    z9 = true;
                                                                                    if (z9) {
                                                                                    }
                                                                                }
                                                                                z10 = true;
                                                                                i27 = i14;
                                                                                linkedHashMap2 = linkedHashMap;
                                                                                num8 = num5;
                                                                                i26 = i9;
                                                                                mVar2 = mVar;
                                                                                iVar = iVar3;
                                                                                i21 = i13;
                                                                                arrayList5 = arrayList3;
                                                                                num7 = num6;
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (linkedHashMap3.containsKey(y1.h.f9814i)) {
                                                                    Object obj11 = linkedHashMap2.get(sVar5);
                                                                    if (obj11 == null) {
                                                                        obj11 = null;
                                                                    }
                                                                    a2.g gVar2 = (a2.g) obj11;
                                                                    if (gVar2 == null) {
                                                                        gVar2 = "";
                                                                    }
                                                                    Object obj12 = linkedHashMap3.get(sVar5);
                                                                    if (obj12 == null) {
                                                                        obj12 = null;
                                                                    }
                                                                    CharSequence charSequence = (a2.g) obj12;
                                                                    if (charSequence == null) {
                                                                        charSequence = "";
                                                                    }
                                                                    CharSequence H = H(charSequence);
                                                                    int length2 = gVar2.length();
                                                                    int length3 = charSequence.length();
                                                                    Integer num9 = num8;
                                                                    int i30 = length2 > length3 ? length3 : length2;
                                                                    num6 = num7;
                                                                    int i31 = 0;
                                                                    while (true) {
                                                                        i15 = i30;
                                                                        if (i31 >= i30) {
                                                                            i16 = length2;
                                                                            break;
                                                                        }
                                                                        i16 = length2;
                                                                        if (gVar2.charAt(i31) != charSequence.charAt(i31)) {
                                                                            break;
                                                                        }
                                                                        i31++;
                                                                        i30 = i15;
                                                                        length2 = i16;
                                                                    }
                                                                    int i32 = 0;
                                                                    while (true) {
                                                                        if (i32 >= i15 - i31) {
                                                                            i17 = i32;
                                                                            break;
                                                                        }
                                                                        i17 = i32;
                                                                        if (gVar2.charAt((i16 - 1) - i32) != charSequence.charAt((length3 - 1) - i17)) {
                                                                            break;
                                                                        } else {
                                                                            i32 = i17 + 1;
                                                                        }
                                                                    }
                                                                    int i33 = (i16 - i17) - i31;
                                                                    int i34 = (length3 - i17) - i31;
                                                                    y1.s sVar8 = y1.p.C;
                                                                    boolean containsKey = linkedHashMap2.containsKey(sVar8);
                                                                    boolean containsKey2 = linkedHashMap3.containsKey(sVar8);
                                                                    boolean containsKey3 = linkedHashMap2.containsKey(y1.p.f9882x);
                                                                    boolean z11 = containsKey3 && !containsKey && containsKey2;
                                                                    boolean z12 = containsKey3 && containsKey && !containsKey2;
                                                                    if (z11 || z12) {
                                                                        i14 = i27;
                                                                        linkedHashMap = linkedHashMap2;
                                                                        h3 = h(v(i27), num9, num9, Integer.valueOf(length3), H);
                                                                        num5 = num9;
                                                                    } else {
                                                                        h3 = g(v(i27), 16);
                                                                        h3.setFromIndex(i31);
                                                                        h3.setRemovedCount(i33);
                                                                        h3.setAddedCount(i34);
                                                                        h3.setBeforeText(gVar2);
                                                                        h3.getText().add(H);
                                                                        i14 = i27;
                                                                        linkedHashMap = linkedHashMap2;
                                                                        num5 = num9;
                                                                    }
                                                                    h3.setClassName("android.widget.EditText");
                                                                    x(h3);
                                                                    if (z11 || z12) {
                                                                        long j11 = ((a2.j0) iVar2.g(y1.p.f9883y)).f408a;
                                                                        h3.setFromIndex((int) (j11 >> 32));
                                                                        h3.setToIndex((int) (j11 & 4294967295L));
                                                                        x(h3);
                                                                    }
                                                                } else {
                                                                    num5 = num8;
                                                                    linkedHashMap = linkedHashMap2;
                                                                    num6 = num7;
                                                                    i14 = i27;
                                                                    z(this, v(i14), 2048, Integer.valueOf(i22), 8);
                                                                }
                                                                i27 = i14;
                                                                linkedHashMap2 = linkedHashMap;
                                                                num8 = num5;
                                                                i26 = i9;
                                                                mVar2 = mVar;
                                                                iVar = iVar3;
                                                                i21 = i13;
                                                                arrayList5 = arrayList3;
                                                                num7 = num6;
                                                            }
                                                        }
                                                        num5 = num8;
                                                        linkedHashMap = linkedHashMap2;
                                                        num6 = num7;
                                                        i14 = i27;
                                                        i27 = i14;
                                                        linkedHashMap2 = linkedHashMap;
                                                        num8 = num5;
                                                        i26 = i9;
                                                        mVar2 = mVar;
                                                        iVar = iVar3;
                                                        i21 = i13;
                                                        arrayList5 = arrayList3;
                                                        num7 = num6;
                                                    }
                                                }
                                            } else {
                                                Object value5 = entry.getValue();
                                                r6.k.d(value5, "null cannot be cast to non-null type kotlin.String");
                                                String str4 = (String) value5;
                                                if (linkedHashMap2.containsKey(sVar2)) {
                                                    A(i27, 8, str4);
                                                }
                                            }
                                            num5 = num8;
                                            num6 = num7;
                                            arrayList3 = arrayList5;
                                            mVar = mVar2;
                                            i14 = i27;
                                            linkedHashMap = linkedHashMap2;
                                            i27 = i14;
                                            linkedHashMap2 = linkedHashMap;
                                            num8 = num5;
                                            i26 = i9;
                                            mVar2 = mVar;
                                            iVar = iVar3;
                                            i21 = i13;
                                            arrayList5 = arrayList3;
                                            num7 = num6;
                                        }
                                    }
                                    int size2 = arrayList5.size();
                                    int i35 = 0;
                                    while (true) {
                                        if (i35 >= size2) {
                                            e2Var = null;
                                            break;
                                        }
                                        int i36 = size2;
                                        if (((e2) arrayList5.get(i35)).f8204f == i27) {
                                            e2Var = (e2) arrayList5.get(i35);
                                            break;
                                        } else {
                                            i35++;
                                            size2 = i36;
                                        }
                                    }
                                    if (e2Var != null) {
                                        z8 = false;
                                    } else {
                                        e2Var = new e2(i27, arrayList4);
                                        z8 = true;
                                    }
                                    arrayList4.add(e2Var);
                                    if (!z8) {
                                    }
                                    sVar = (y1.s) entry.getKey();
                                    sVar2 = y1.p.f9862d;
                                    if (r6.k.a(sVar, sVar2)) {
                                    }
                                    num5 = num8;
                                    num6 = num7;
                                    arrayList3 = arrayList5;
                                    mVar = mVar2;
                                    i14 = i27;
                                    linkedHashMap = linkedHashMap2;
                                    i27 = i14;
                                    linkedHashMap2 = linkedHashMap;
                                    num8 = num5;
                                    i26 = i9;
                                    mVar2 = mVar;
                                    iVar = iVar3;
                                    i21 = i13;
                                    arrayList5 = arrayList3;
                                    num7 = num6;
                                } else {
                                    y1.i iVar4 = iVar;
                                    num3 = num7;
                                    arrayList2 = arrayList5;
                                    y1.m mVar4 = mVar2;
                                    i12 = i21;
                                    num4 = num8;
                                    int i37 = i27;
                                    i11 = 0;
                                    if (!z10) {
                                        Iterator it2 = iVar4.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                z10 = false;
                                                break;
                                            }
                                            if (!mVar4.i().f9832f.containsKey((y1.s) ((Map.Entry) it2.next()).getKey())) {
                                                z10 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (z10) {
                                        i10 = 8;
                                        z(this, v(i37), 2048, num4, 8);
                                    } else {
                                        i10 = 8;
                                    }
                                }
                            }
                        }
                    }
                    i9 = i26;
                    num3 = num7;
                    arrayList2 = arrayList5;
                    iArr2 = iArr3;
                    jArr2 = jArr3;
                    i10 = i24;
                    i11 = i20;
                    i12 = i21;
                    num4 = num8;
                    j9 >>= i10;
                    i26 = i9 + 1;
                    pVar2 = pVar;
                    i20 = i11;
                    i24 = i10;
                    num8 = num4;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i21 = i12;
                    arrayList5 = arrayList2;
                    num7 = num3;
                }
                num = num7;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i7 = i20;
                i8 = i21;
                num2 = num8;
                if (i25 != i24) {
                    return;
                }
            } else {
                num = num7;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i7 = i20;
                i8 = i21;
                num2 = num8;
            }
            int i38 = i8;
            if (i38 == i23) {
                return;
            }
            Integer num10 = num2;
            i21 = i38 + 1;
            num8 = num10;
            pVar2 = pVar;
            length = i23;
            i20 = i7;
            i19 = i22;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num7 = num;
        }
    }

    public final void D(r1.d0 d0Var, i.q qVar) {
        y1.i o2;
        if (d0Var.E() && !this.f8160d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(d0Var)) {
            r1.d0 d0Var2 = null;
            if (!d0Var.A.f(8)) {
                d0Var = d0Var.s();
                while (true) {
                    if (d0Var == null) {
                        d0Var = null;
                        break;
                    } else if (d0Var.A.f(8)) {
                        break;
                    } else {
                        d0Var = d0Var.s();
                    }
                }
            }
            if (d0Var == null || (o2 = d0Var.o()) == null) {
                return;
            }
            if (!o2.f9833g) {
                r1.d0 s5 = d0Var.s();
                while (true) {
                    if (s5 != null) {
                        y1.i o6 = s5.o();
                        if (o6 != null && o6.f9833g) {
                            d0Var2 = s5;
                            break;
                        }
                        s5 = s5.s();
                    } else {
                        break;
                    }
                }
                if (d0Var2 != null) {
                    d0Var = d0Var2;
                }
            }
            int i7 = d0Var.f7720g;
            if (qVar.a(i7)) {
                z(this, v(i7), 2048, 1, 8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [q6.a, r6.l] */
    /* JADX WARN: Type inference failed for: r0v18, types: [q6.a, r6.l] */
    /* JADX WARN: Type inference failed for: r0v8, types: [q6.a, r6.l] */
    /* JADX WARN: Type inference failed for: r2v1, types: [q6.a, r6.l] */
    public final void E(r1.d0 d0Var) {
        if (d0Var.E() && !this.f8160d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(d0Var)) {
            int i7 = d0Var.f7720g;
            y1.g gVar = (y1.g) this.f8173q.f(i7);
            y1.g gVar2 = (y1.g) this.f8174r.f(i7);
            if (gVar == null && gVar2 == null) {
                return;
            }
            AccessibilityEvent g9 = g(i7, 4096);
            if (gVar != null) {
                g9.setScrollX((int) ((Number) gVar.f9804a.a()).floatValue());
                g9.setMaxScrollX((int) ((Number) gVar.f9805b.a()).floatValue());
            }
            if (gVar2 != null) {
                g9.setScrollY((int) ((Number) gVar2.f9804a.a()).floatValue());
                g9.setMaxScrollY((int) ((Number) gVar2.f9805b.a()).floatValue());
            }
            x(g9);
        }
    }

    public final boolean F(y1.m mVar, int i7, int i8, boolean z8) {
        String o2;
        y1.i iVar = mVar.f9840d;
        int i9 = mVar.f9843g;
        y1.s sVar = y1.h.f9813h;
        if (iVar.f9832f.containsKey(sVar) && j0.l(mVar)) {
            q6.f fVar = (q6.f) ((y1.a) mVar.f9840d.g(sVar)).f9794b;
            if (fVar != null) {
                return ((Boolean) fVar.c(Integer.valueOf(i7), Integer.valueOf(i8), Boolean.valueOf(z8))).booleanValue();
            }
        } else if ((i7 != i8 || i8 != this.f8177u) && (o2 = o(mVar)) != null) {
            if (i7 < 0 || i7 != i8 || i8 > o2.length()) {
                i7 = -1;
            }
            this.f8177u = i7;
            boolean z9 = o2.length() > 0;
            x(h(v(i9), z9 ? Integer.valueOf(this.f8177u) : null, z9 ? Integer.valueOf(this.f8177u) : null, z9 ? Integer.valueOf(o2.length()) : null, o2));
            B(i9);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0 A[LOOP:1: B:8:0x002f->B:26:0x00d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4 A[EDGE_INSN: B:27:0x00d4->B:34:0x00d4 BREAK  A[LOOP:1: B:8:0x002f->B:26:0x00d0], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList G(boolean z8, ArrayList arrayList) {
        i.p pVar = i.i.f4750a;
        i.p pVar2 = new i.p();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            i((y1.m) arrayList.get(i7), arrayList2, pVar2);
        }
        ArrayList arrayList3 = new ArrayList();
        int W = e6.m.W(arrayList2);
        if (W >= 0) {
            int i8 = 0;
            while (true) {
                y1.m mVar = (y1.m) arrayList2.get(i8);
                if (i8 != 0) {
                    float f9 = mVar.f().f9781b;
                    float f10 = mVar.f().f9783d;
                    boolean z9 = f9 >= f10;
                    int W2 = e6.m.W(arrayList3);
                    if (W2 >= 0) {
                        int i9 = 0;
                        while (true) {
                            y0.d dVar = (y0.d) ((d6.j) arrayList3.get(i9)).f2618f;
                            float f11 = dVar.f9781b;
                            float f12 = dVar.f9783d;
                            boolean z10 = f11 >= f12;
                            if (!z9 && !z10 && Math.max(f9, f11) < Math.min(f10, f12)) {
                                arrayList3.set(i9, new d6.j(new y0.d(Math.max(dVar.f9780a, 0.0f), Math.max(dVar.f9781b, f9), Math.min(dVar.f9782c, Float.POSITIVE_INFINITY), Math.min(f12, f10)), ((d6.j) arrayList3.get(i9)).f2619g));
                                ((List) ((d6.j) arrayList3.get(i9)).f2619g).add(mVar);
                                break;
                            }
                            if (i9 == W2) {
                                break;
                            }
                            i9++;
                        }
                        if (i8 != W) {
                            break;
                        }
                        i8++;
                    }
                }
                arrayList3.add(new d6.j(mVar.f(), e6.m.Y(mVar)));
                if (i8 != W) {
                }
            }
        }
        e6.q.b0(arrayList3, x.f8460d);
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        for (int i10 = 0; i10 < size2; i10++) {
            d6.j jVar = (d6.j) arrayList3.get(i10);
            e6.q.b0((List) jVar.f2619g, new b0(new b0(z8 ? x.f8459c : x.f8458b)));
            arrayList4.addAll((Collection) jVar.f2619g);
        }
        e6.q.b0(arrayList4, new b2.s(3));
        int i11 = 0;
        while (i11 <= e6.m.W(arrayList4)) {
            List list = (List) pVar2.f(((y1.m) arrayList4.get(i11)).f9843g);
            if (list != null) {
                if (q((y1.m) arrayList4.get(i11))) {
                    i11++;
                } else {
                    arrayList4.remove(i11);
                }
                arrayList4.addAll(i11, list);
                i11 += list.size();
            } else {
                i11++;
            }
        }
        return arrayList4;
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
    public final void I() {
        long j8;
        long j9;
        long j10;
        char c4;
        long[] jArr;
        long[] jArr2;
        long j11;
        int i7;
        int i8;
        int i9;
        char c6;
        i.q qVar = new i.q();
        i.q qVar2 = this.B;
        int[] iArr = qVar2.f4777b;
        long[] jArr3 = qVar2.f4776a;
        int length = jArr3.length - 2;
        i.p pVar = this.H;
        int i10 = 8;
        if (length >= 0) {
            int i11 = 0;
            j8 = 128;
            j9 = 255;
            while (true) {
                long j12 = jArr3[i11];
                char c9 = 7;
                j10 = -9187201950435737472L;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j12 & 255) < 128) {
                            int i14 = iArr[(i11 << 3) + i13];
                            c6 = c9;
                            g2 g2Var = (g2) l().f(i14);
                            y1.m mVar = g2Var != null ? g2Var.f8236a : null;
                            if (mVar != null) {
                                if (mVar.f9840d.f9832f.containsKey(y1.p.f9862d)) {
                                }
                            }
                            qVar.a(i14);
                            f2 f2Var = (f2) pVar.f(i14);
                            if (f2Var != null) {
                                Object obj = f2Var.f8232a.f9832f.get(y1.p.f9862d);
                                r23 = obj != 0 ? obj : null;
                            }
                            A(i14, 32, r23);
                        } else {
                            c6 = c9;
                        }
                        j12 >>= 8;
                        i13++;
                        c9 = c6;
                    }
                    c4 = c9;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    c4 = 7;
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        } else {
            j8 = 128;
            j9 = 255;
            j10 = -9187201950435737472L;
            c4 = 7;
        }
        int[] iArr2 = qVar.f4777b;
        long[] jArr4 = qVar.f4776a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i15 = 0;
            while (true) {
                long j13 = jArr4[i15];
                if ((((~j13) << c4) & j13 & j10) != j10) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j13 & j9) < j8) {
                            int i18 = iArr2[(i15 << 3) + i17];
                            int hashCode = Integer.hashCode(i18) * (-862048943);
                            int i19 = hashCode ^ (hashCode << 16);
                            int i20 = i19 & 127;
                            int i21 = qVar2.f4778c;
                            int i22 = (i19 >>> 7) & i21;
                            i7 = i10;
                            int i23 = 0;
                            while (true) {
                                long[] jArr5 = qVar2.f4776a;
                                int i24 = i22 >> 3;
                                jArr2 = jArr4;
                                int i25 = (i22 & 7) << 3;
                                j11 = j13;
                                long j14 = (jArr5[i24] >>> i25) | ((jArr5[i24 + 1] << (64 - i25)) & ((-i25) >> 63));
                                int i26 = i21;
                                long j15 = (i20 * 72340172838076673L) ^ j14;
                                long j16 = (j15 - 72340172838076673L) & (~j15) & j10;
                                while (true) {
                                    if (j16 == 0) {
                                        break;
                                    }
                                    i9 = (i22 + (Long.numberOfTrailingZeros(j16) >> 3)) & i26;
                                    int i27 = i26;
                                    if (qVar2.f4777b[i9] == i18) {
                                        break;
                                    }
                                    j16 &= j16 - 1;
                                    i26 = i27;
                                }
                                i23 += 8;
                                i22 = (i22 + i23) & i8;
                                jArr4 = jArr2;
                                i21 = i8;
                                j13 = j11;
                            }
                            int i28 = i9;
                            if (i28 >= 0) {
                                qVar2.f(i28);
                            }
                        } else {
                            jArr2 = jArr4;
                            j11 = j13;
                            i7 = i10;
                        }
                        j13 = j11 >> i7;
                        i17++;
                        i10 = i7;
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
        pVar.a();
        i.p l8 = l();
        int[] iArr3 = l8.f4771b;
        Object[] objArr = l8.f4772c;
        long[] jArr6 = l8.f4770a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i29 = 0;
            while (true) {
                long j17 = jArr6[i29];
                if ((((~j17) << c4) & j17 & j10) != j10) {
                    int i30 = 8 - ((~(i29 - length3)) >>> 31);
                    for (int i31 = 0; i31 < i30; i31++) {
                        if ((j17 & j9) < j8) {
                            int i32 = (i29 << 3) + i31;
                            int i33 = iArr3[i32];
                            y1.m mVar2 = ((g2) objArr[i32]).f8236a;
                            y1.i iVar = mVar2.f9840d;
                            y1.s sVar = y1.p.f9862d;
                            if (iVar.f9832f.containsKey(sVar) && qVar2.a(i33)) {
                                A(i33, 16, (String) mVar2.f9840d.g(sVar));
                            }
                            pVar.i(i33, new f2(mVar2, l()));
                        }
                        j17 >>= 8;
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
        this.I = new f2(this.f8160d.getSemanticsOwner().a(), l());
    }

    @Override // b3.b
    public final q5.g a(View view) {
        return this.f8169m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i7, c3.i iVar, String str, Bundle bundle) {
        y1.m mVar;
        int i8;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f1655a;
        g2 g2Var = (g2) l().f(i7);
        if (g2Var == null || (mVar = g2Var.f8236a) == null) {
            return;
        }
        y1.i iVar2 = mVar.f9840d;
        LinkedHashMap linkedHashMap = iVar2.f9832f;
        String o2 = o(mVar);
        if (r6.k.a(str, this.E)) {
            i.n nVar = this.C;
            int c4 = nVar.c(i7);
            int i9 = c4 >= 0 ? nVar.f4764c[c4] : -1;
            if (i9 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, i9);
                return;
            }
            return;
        }
        if (r6.k.a(str, this.F)) {
            i.n nVar2 = this.D;
            int c6 = nVar2.c(i7);
            int i10 = c6 >= 0 ? nVar2.f4764c[c6] : -1;
            if (i10 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, i10);
                return;
            }
            return;
        }
        r1.a1 a1Var = null;
        if (!linkedHashMap.containsKey(y1.h.f9806a) || bundle == null || !r6.k.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            y1.s sVar = y1.p.f9878t;
            if (!linkedHashMap.containsKey(sVar) || bundle == null || !r6.k.a(str, "androidx.compose.ui.semantics.testTag")) {
                if (r6.k.a(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, mVar.f9843g);
                    return;
                }
                return;
            } else {
                Object obj = linkedHashMap.get(sVar);
                String str2 = (String) (obj == null ? null : obj);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i12 > 0 && i11 >= 0) {
            if (i11 < (o2 != null ? o2.length() : Integer.MAX_VALUE)) {
                a2.h0 r8 = j0.r(iVar2);
                if (r8 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i13 = 0;
                while (i13 < i12) {
                    int i14 = i11 + i13;
                    if (i14 >= r8.f388a.f377a.f373f.length()) {
                        arrayList.add(a1Var);
                        i8 = i13;
                    } else {
                        y0.d b9 = r8.b(i14);
                        r1.a1 c9 = mVar.c();
                        long j8 = 0;
                        if (c9 != null) {
                            if (!c9.M0().f8116r) {
                                c9 = a1Var;
                            }
                            if (c9 != null) {
                                j8 = c9.W(0L);
                            }
                        }
                        y0.d h3 = b9.h(j8);
                        y0.d e9 = mVar.e();
                        y0.d d8 = h3.f(e9) ? h3.d(e9) : a1Var;
                        if (d8 != 0) {
                            long a3 = u3.r.a(d8.f9780a, d8.f9781b);
                            r rVar = this.f8160d;
                            long p6 = rVar.p(a3);
                            i8 = i13;
                            long p8 = rVar.p(u3.r.a(d8.f9782c, d8.f9783d));
                            rectF = new RectF(y0.c.d(p6), y0.c.e(p6), y0.c.d(p8), y0.c.e(p8));
                        } else {
                            i8 = i13;
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i13 = i8 + 1;
                    a1Var = null;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect c(g2 g2Var) {
        Rect rect = g2Var.f8237b;
        long a3 = u3.r.a(rect.left, rect.top);
        r rVar = this.f8160d;
        long p6 = rVar.p(a3);
        long p8 = rVar.p(u3.r.a(rect.right, rect.bottom));
        return new Rect((int) Math.floor(y0.c.d(p6)), (int) Math.floor(y0.c.e(p6)), (int) Math.ceil(y0.c.d(p8)), (int) Math.ceil(y0.c.e(p8)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (c7.a0.e(r7, r0) == r4) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:14:0x0059, B:20:0x006c, B:22:0x0074, B:25:0x007f, B:27:0x0084, B:29:0x0093, B:31:0x009a, B:32:0x00a3, B:40:0x0042), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007d -> B:13:0x00c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00be -> B:13:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(j6.c cVar) {
        z zVar;
        int i7;
        c0 c0Var;
        i.q qVar;
        e7.b bVar;
        i.q qVar2;
        e7.b bVar2;
        Object b9;
        try {
            if (cVar instanceof z) {
                zVar = (z) cVar;
                int i8 = zVar.f8489k;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    zVar.f8489k = i8 - Integer.MIN_VALUE;
                    Object obj = zVar.f8487i;
                    i7 = zVar.f8489k;
                    i6.a aVar = i6.a.f4956f;
                    if (i7 != 0) {
                        d6.a.e(obj);
                        try {
                            qVar = new i.q();
                            e7.e eVar = this.f8180x;
                            eVar.getClass();
                            bVar = new e7.b(eVar);
                            c0Var = this;
                            zVar.f8484f = c0Var;
                            zVar.f8485g = qVar;
                            zVar.f8486h = bVar;
                            zVar.f8489k = 1;
                            b9 = bVar.b(zVar);
                            if (b9 == aVar) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            c0Var = this;
                            c0Var.f8179w.clear();
                            throw th;
                        }
                    } else if (i7 == 1) {
                        bVar2 = zVar.f8486h;
                        qVar2 = zVar.f8485g;
                        c0Var = zVar.f8484f;
                        d6.a.e(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = zVar.f8486h;
                        qVar2 = zVar.f8485g;
                        c0Var = zVar.f8484f;
                        d6.a.e(obj);
                        qVar = qVar2;
                        bVar = bVar2;
                        zVar.f8484f = c0Var;
                        zVar.f8485g = qVar;
                        zVar.f8486h = bVar;
                        zVar.f8489k = 1;
                        b9 = bVar.b(zVar);
                        if (b9 == aVar) {
                            return aVar;
                        }
                        e7.b bVar3 = bVar;
                        qVar2 = qVar;
                        obj = b9;
                        bVar2 = bVar3;
                        if (((Boolean) obj).booleanValue()) {
                            c0Var.f8179w.clear();
                            return d6.z.f2639a;
                        }
                        bVar2.c();
                        boolean p6 = c0Var.p();
                        i.f fVar = c0Var.f8179w;
                        if (p6) {
                            int i9 = fVar.f4739h;
                            for (int i10 = 0; i10 < i9; i10++) {
                                r1.d0 d0Var = (r1.d0) fVar.f4738g[i10];
                                c0Var.D(d0Var, qVar2);
                                c0Var.E(d0Var);
                            }
                            qVar2.b();
                            if (!c0Var.J) {
                                c0Var.J = true;
                                c0Var.f8168l.post(c0Var.K);
                            }
                            fVar.clear();
                            c0Var.f8173q.a();
                            c0Var.f8174r.a();
                            long j8 = c0Var.f8164h;
                            zVar.f8484f = c0Var;
                            zVar.f8485g = qVar2;
                            zVar.f8486h = bVar2;
                            zVar.f8489k = 2;
                        }
                        qVar = qVar2;
                        bVar = bVar2;
                        zVar.f8484f = c0Var;
                        zVar.f8485g = qVar;
                        zVar.f8486h = bVar;
                        zVar.f8489k = 1;
                        b9 = bVar.b(zVar);
                        if (b9 == aVar) {
                        }
                    }
                }
            }
            if (i7 != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        zVar = new z(this, cVar);
        Object obj2 = zVar.f8487i;
        i7 = zVar.f8489k;
        i6.a aVar2 = i6.a.f4956f;
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [q6.a, r6.l] */
    /* JADX WARN: Type inference failed for: r2v4, types: [q6.a, r6.l] */
    public final boolean e(boolean z8, int i7, long j8) {
        y1.s sVar;
        long[] jArr;
        long[] jArr2;
        int i8;
        if (!r6.k.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        i.p l8 = l();
        if (y0.c.b(j8, 9205357640488583168L) || !y0.c.f(j8)) {
            return false;
        }
        if (z8) {
            sVar = y1.p.f9874p;
        } else {
            if (z8) {
                throw new b4.c();
            }
            sVar = y1.p.f9873o;
        }
        Object[] objArr = l8.f4772c;
        long[] jArr3 = l8.f4770a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return false;
        }
        int i9 = 0;
        boolean z9 = false;
        while (true) {
            long j9 = jArr3[i9];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8;
                int i11 = 8 - ((~(i9 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((255 & j9) < 128) {
                        g2 g2Var = (g2) objArr[(i9 << 3) + i12];
                        Rect rect = g2Var.f8237b;
                        i8 = i10;
                        jArr2 = jArr3;
                        if (y0.c.d(j8) >= ((float) rect.left) && y0.c.d(j8) < ((float) rect.right) && y0.c.e(j8) >= ((float) rect.top) && y0.c.e(j8) < ((float) rect.bottom)) {
                            Object obj = g2Var.f8236a.f9840d.f9832f.get(sVar);
                            if (obj == null) {
                                obj = null;
                            }
                            y1.g gVar = (y1.g) obj;
                            if (gVar != null) {
                                ?? r22 = gVar.f9804a;
                                if (i7 < 0) {
                                    if (((Number) r22.a()).floatValue() <= 0.0f) {
                                    }
                                    z9 = true;
                                } else {
                                    if (((Number) r22.a()).floatValue() >= ((Number) gVar.f9805b.a()).floatValue()) {
                                    }
                                    z9 = true;
                                }
                            }
                        }
                    } else {
                        jArr2 = jArr3;
                        i8 = i10;
                    }
                    j9 >>= i8;
                    i12++;
                    i10 = i8;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i11 != i10) {
                    return z9;
                }
            } else {
                jArr = jArr3;
            }
            if (i9 == length) {
                return z9;
            }
            i9++;
            jArr3 = jArr;
        }
    }

    public final void f() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (p()) {
                w(this.f8160d.getSemanticsOwner().a(), this.I);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                C(l());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    I();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent g(int i7, int i8) {
        g2 g2Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i8);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        r rVar = this.f8160d;
        obtain.setPackageName(rVar.getContext().getPackageName());
        obtain.setSource(rVar, i7);
        if (p() && (g2Var = (g2) l().f(i7)) != null) {
            obtain.setPassword(g2Var.f8236a.f9840d.f9832f.containsKey(y1.p.C));
        }
        return obtain;
    }

    public final AccessibilityEvent h(int i7, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent g9 = g(i7, 8192);
        if (num != null) {
            g9.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            g9.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            g9.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            g9.getText().add(charSequence);
        }
        return g9;
    }

    public final void i(y1.m mVar, ArrayList arrayList, i.p pVar) {
        boolean m8 = j0.m(mVar);
        int i7 = mVar.f9843g;
        y1.i iVar = mVar.f9840d;
        Object obj = iVar.f9832f.get(y1.p.f9870l);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if ((booleanValue || q(mVar)) && l().c(i7)) {
            arrayList.add(mVar);
        }
        if (booleanValue) {
            pVar.i(i7, G(m8, e6.l.x0(y1.m.h(mVar, 7))));
            return;
        }
        List h3 = y1.m.h(mVar, 7);
        int size = h3.size();
        for (int i8 = 0; i8 < size; i8++) {
            i((y1.m) h3.get(i8), arrayList, pVar);
        }
    }

    public final int j(y1.m mVar) {
        y1.i iVar = mVar.f9840d;
        if (!iVar.f9832f.containsKey(y1.p.f9859a)) {
            y1.s sVar = y1.p.f9883y;
            if (iVar.f9832f.containsKey(sVar)) {
                return (int) (((a2.j0) iVar.g(sVar)).f408a & 4294967295L);
            }
        }
        return this.f8177u;
    }

    public final int k(y1.m mVar) {
        y1.i iVar = mVar.f9840d;
        if (!iVar.f9832f.containsKey(y1.p.f9859a)) {
            y1.s sVar = y1.p.f9883y;
            if (iVar.f9832f.containsKey(sVar)) {
                return (int) (((a2.j0) iVar.g(sVar)).f408a >> 32);
            }
        }
        return this.f8177u;
    }

    public final i.p l() {
        if (this.f8181y) {
            this.f8181y = false;
            this.A = j0.p(this.f8160d.getSemanticsOwner());
            if (p()) {
                i.n nVar = this.C;
                nVar.a();
                i.n nVar2 = this.D;
                nVar2.a();
                g2 g2Var = (g2) l().f(-1);
                y1.m mVar = g2Var != null ? g2Var.f8236a : null;
                r6.k.c(mVar);
                ArrayList G = G(j0.m(mVar), e6.m.Y(mVar));
                int W = e6.m.W(G);
                int i7 = 1;
                if (1 <= W) {
                    while (true) {
                        int i8 = ((y1.m) G.get(i7 - 1)).f9843g;
                        int i9 = ((y1.m) G.get(i7)).f9843g;
                        nVar.f(i8, i9);
                        nVar2.f(i9, i8);
                        if (i7 == W) {
                            break;
                        }
                        i7++;
                    }
                }
            }
        }
        return this.A;
    }

    public final String n(y1.m mVar) {
        y1.i iVar = mVar.f9840d;
        y1.i iVar2 = mVar.f9840d;
        Object obj = iVar.f9832f.get(y1.p.f9860b);
        String str = null;
        if (obj == null) {
            obj = null;
        }
        LinkedHashMap linkedHashMap = iVar2.f9832f;
        Object obj2 = linkedHashMap.get(y1.p.B);
        if (obj2 == null) {
            obj2 = null;
        }
        z1.a aVar = (z1.a) obj2;
        Object obj3 = linkedHashMap.get(y1.p.f9877s);
        if (obj3 == null) {
            obj3 = null;
        }
        y1.f fVar = (y1.f) obj3;
        r rVar = this.f8160d;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2 && obj == null) {
                        obj = rVar.getContext().getResources().getString(R.string.indeterminate);
                    }
                } else if (fVar != null && fVar.f9803a == 2 && obj == null) {
                    obj = rVar.getContext().getResources().getString(R.string.state_off);
                }
            } else if (fVar != null && fVar.f9803a == 2 && obj == null) {
                obj = rVar.getContext().getResources().getString(R.string.state_on);
            }
        }
        Object obj4 = linkedHashMap.get(y1.p.A);
        if (obj4 == null) {
            obj4 = null;
        }
        Boolean bool = (Boolean) obj4;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((fVar == null || fVar.f9803a != 4) && obj == null) {
                obj = booleanValue ? rVar.getContext().getResources().getString(R.string.selected) : rVar.getContext().getResources().getString(R.string.not_selected);
            }
        }
        Object obj5 = linkedHashMap.get(y1.p.f9861c);
        if (obj5 == null) {
            obj5 = null;
        }
        y1.e eVar = (y1.e) obj5;
        if (eVar != null) {
            if (eVar != y1.e.f9800c) {
                if (obj == null) {
                    w6.a aVar2 = eVar.f9802b;
                    float f9 = aVar2.f9520b;
                    float f10 = aVar2.f9519a;
                    float f11 = f9 - f10 == 0.0f ? 0.0f : (eVar.f9801a - f10) / (f9 - f10);
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 > 1.0f) {
                        f11 = 1.0f;
                    }
                    obj = rVar.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(f11 == 0.0f ? 0 : f11 == 1.0f ? 100 : v1.g.e(Math.round(f11 * 100), 1, 99)));
                }
            } else if (obj == null) {
                obj = rVar.getContext().getResources().getString(R.string.in_progress);
            }
        }
        y1.s sVar = y1.p.f9882x;
        if (linkedHashMap.containsKey(sVar)) {
            LinkedHashMap linkedHashMap2 = new y1.m(mVar.f9837a, true, mVar.f9839c, iVar2).i().f9832f;
            Object obj6 = linkedHashMap2.get(y1.p.f9859a);
            if (obj6 == null) {
                obj6 = null;
            }
            Collection collection = (Collection) obj6;
            if (collection == null || collection.isEmpty()) {
                Object obj7 = linkedHashMap2.get(y1.p.f9879u);
                if (obj7 == null) {
                    obj7 = null;
                }
                Collection collection2 = (Collection) obj7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object obj8 = linkedHashMap2.get(sVar);
                    if (obj8 == null) {
                        obj8 = null;
                    }
                    CharSequence charSequence = (CharSequence) obj8;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = rVar.getContext().getResources().getString(R.string.state_empty);
                    }
                }
            }
            obj = str;
        }
        return (String) obj;
    }

    public final boolean p() {
        return this.f8163g.isEnabled() && !this.f8167k.isEmpty();
    }

    public final boolean q(y1.m mVar) {
        boolean z8;
        y1.i iVar = mVar.f9840d;
        y1.i iVar2 = mVar.f9840d;
        Object obj = iVar.f9832f.get(y1.p.f9859a);
        if (obj == null) {
            obj = null;
        }
        List list = (List) obj;
        if ((list != null ? (String) e6.l.i0(list) : null) == null) {
            Object obj2 = iVar2.f9832f.get(y1.p.f9882x);
            if (obj2 == null) {
                obj2 = null;
            }
            a2.g gVar = (a2.g) obj2;
            Object obj3 = iVar2.f9832f.get(y1.p.f9879u);
            if (obj3 == null) {
                obj3 = null;
            }
            List list2 = (List) obj3;
            a2.g gVar2 = list2 != null ? (a2.g) e6.l.i0(list2) : null;
            if (gVar == null) {
                gVar = gVar2;
            }
            if (gVar == null && n(mVar) == null && !m(mVar)) {
                z8 = false;
                return !iVar2.f9833g || (mVar.m() && z8);
            }
        }
        z8 = true;
        if (iVar2.f9833g) {
        }
    }

    public final void r(r1.d0 d0Var) {
        if (this.f8179w.add(d0Var)) {
            this.f8180x.e(d6.z.f2639a);
        }
    }

    public final int v(int i7) {
        if (i7 == this.f8160d.getSemanticsOwner().a().f9843g) {
            return -1;
        }
        return i7;
    }

    public final void w(y1.m mVar, f2 f2Var) {
        int[] iArr = i.j.f4753a;
        i.q qVar = new i.q();
        List h3 = y1.m.h(mVar, 4);
        r1.d0 d0Var = mVar.f9839c;
        int size = h3.size();
        for (int i7 = 0; i7 < size; i7++) {
            y1.m mVar2 = (y1.m) h3.get(i7);
            i.p l8 = l();
            int i8 = mVar2.f9843g;
            if (l8.b(i8)) {
                if (!f2Var.f8233b.c(i8)) {
                    r(d0Var);
                    return;
                }
                qVar.a(i8);
            }
        }
        i.q qVar2 = f2Var.f8233b;
        int[] iArr2 = qVar2.f4777b;
        long[] jArr = qVar2.f4776a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j8 = jArr[i9];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j8) < 128 && !qVar.c(iArr2[(i9 << 3) + i11])) {
                            r(d0Var);
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
        List h8 = y1.m.h(mVar, 4);
        int size2 = h8.size();
        for (int i12 = 0; i12 < size2; i12++) {
            y1.m mVar3 = (y1.m) h8.get(i12);
            if (l().b(mVar3.f9843g)) {
                Object f9 = this.H.f(mVar3.f9843g);
                r6.k.c(f9);
                w(mVar3, (f2) f9);
            }
        }
    }

    public final boolean x(AccessibilityEvent accessibilityEvent) {
        if (!p()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f8172p = true;
        }
        try {
            return ((Boolean) this.f8162f.f(accessibilityEvent)).booleanValue();
        } finally {
            this.f8172p = false;
        }
    }

    public final boolean y(int i7, int i8, Integer num, List list) {
        if (i7 == Integer.MIN_VALUE || !p()) {
            return false;
        }
        AccessibilityEvent g9 = g(i7, i8);
        if (num != null) {
            g9.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            g9.setContentDescription(a8.d.E(list, ","));
        }
        Trace.beginSection("sendEvent");
        try {
            return x(g9);
        } finally {
            Trace.endSection();
        }
    }
}
