package s0;

import A.AbstractC0017m;
import A0.C0036g;
import B1.C0097d;
import a.AbstractC0345a;
import a1.AbstractC0387b;
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
import b1.C0508h;
import com.chicken.road.kedro.laqer.R;
import i.AbstractC0674i;
import i.C0671f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import q.C0999C;
import y0.C1317a;
import y2.AbstractC1343r;
import y2.C1338m;
import y2.InterfaceC1332g;
import z2.C1399C;
import z2.C1403G;
import z2.C1405I;
import z2.C1436t;
import z2.C1441y;

/* renamed from: s0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1118D extends AbstractC0387b {

    /* renamed from: N, reason: collision with root package name */
    public static final i.p f9998N;

    /* renamed from: A, reason: collision with root package name */
    public i.q f9999A;
    public final i.r B;

    /* renamed from: C, reason: collision with root package name */
    public final i.o f10000C;

    /* renamed from: D, reason: collision with root package name */
    public final i.o f10001D;

    /* renamed from: E, reason: collision with root package name */
    public final String f10002E;

    /* renamed from: F, reason: collision with root package name */
    public final String f10003F;

    /* renamed from: G, reason: collision with root package name */
    public final C0097d f10004G;

    /* renamed from: H, reason: collision with root package name */
    public final i.q f10005H;

    /* renamed from: I, reason: collision with root package name */
    public J0 f10006I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f10007J;

    /* renamed from: K, reason: collision with root package name */
    public final C.t f10008K;

    /* renamed from: L, reason: collision with root package name */
    public final ArrayList f10009L;

    /* renamed from: M, reason: collision with root package name */
    public final C1115A f10010M;

    /* renamed from: d, reason: collision with root package name */
    public final C1166s f10011d;

    /* renamed from: e, reason: collision with root package name */
    public int f10012e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public final C1115A f10013f = new C1115A(this, 0);

    /* renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f10014g;

    /* renamed from: h, reason: collision with root package name */
    public long f10015h;

    /* renamed from: i, reason: collision with root package name */
    public final AccessibilityManagerAccessibilityStateChangeListenerC1168t f10016i;

    /* renamed from: j, reason: collision with root package name */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC1170u f10017j;

    /* renamed from: k, reason: collision with root package name */
    public List f10018k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f10019l;

    /* renamed from: m, reason: collision with root package name */
    public final l2.g f10020m;

    /* renamed from: n, reason: collision with root package name */
    public int f10021n;

    /* renamed from: o, reason: collision with root package name */
    public C0508h f10022o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10023p;

    /* renamed from: q, reason: collision with root package name */
    public final i.q f10024q;

    /* renamed from: r, reason: collision with root package name */
    public final i.q f10025r;

    /* renamed from: s, reason: collision with root package name */
    public final i.H f10026s;

    /* renamed from: t, reason: collision with root package name */
    public final i.H f10027t;

    /* renamed from: u, reason: collision with root package name */
    public int f10028u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f10029v;

    /* renamed from: w, reason: collision with root package name */
    public final C0671f f10030w;

    /* renamed from: x, reason: collision with root package name */
    public final Y2.e f10031x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10032y;

    /* renamed from: z, reason: collision with root package name */
    public C0999C f10033z;

    static {
        int i2;
        int[] elements = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i4 = AbstractC0674i.f6921a;
        Intrinsics.checkNotNullParameter(elements, "elements");
        i.p pVar = new i.p(32);
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i5 = pVar.f6939b;
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i5 < 0 || i5 > (i2 = pVar.f6939b)) {
            StringBuilder o4 = AbstractC0017m.o(i5, "Index ", " must be in 0..");
            o4.append(pVar.f6939b);
            throw new IndexOutOfBoundsException(o4.toString());
        }
        pVar.b(i2 + 32);
        int[] iArr = pVar.f6938a;
        int i6 = pVar.f6939b;
        if (i5 != i6) {
            C1436t.e(iArr, iArr, i5 + 32, i5, i6);
        }
        C1436t.g(elements, iArr, i5, 0, 12);
        pVar.f6939b += 32;
        f9998N = pVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [s0.t] */
    /* JADX WARN: Type inference failed for: r2v5, types: [s0.u] */
    public C1118D(C1166s c1166s) {
        this.f10011d = c1166s;
        Object systemService = c1166s.getContext().getSystemService("accessibility");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f10014g = accessibilityManager;
        this.f10015h = 100L;
        this.f10016i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: s0.t
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z4) {
                C1118D c1118d = C1118D.this;
                c1118d.f10018k = z4 ? c1118d.f10014g.getEnabledAccessibilityServiceList(-1) : C1405I.f11931d;
            }
        };
        this.f10017j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: s0.u
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z4) {
                C1118D c1118d = C1118D.this;
                c1118d.f10018k = c1118d.f10014g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f10018k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f10019l = new Handler(Looper.getMainLooper());
        this.f10020m = new l2.g(this);
        this.f10021n = Integer.MIN_VALUE;
        this.f10024q = new i.q();
        this.f10025r = new i.q();
        this.f10026s = new i.H();
        this.f10027t = new i.H();
        this.f10028u = -1;
        this.f10030w = new C0671f(0);
        this.f10031x = Y2.l.a(1, 6, null);
        this.f10032y = true;
        i.q qVar = i.j.f6922a;
        Intrinsics.d(qVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f9999A = qVar;
        this.B = new i.r();
        this.f10000C = new i.o();
        this.f10001D = new i.o();
        this.f10002E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f10003F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f10004G = new C0097d(7);
        this.f10005H = new i.q();
        y0.n a4 = c1166s.getSemanticsOwner().a();
        Intrinsics.d(qVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f10006I = new J0(a4, qVar);
        c1166s.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1172v(0, this));
        this.f10008K = new C.t(13, this);
        this.f10009L = new ArrayList();
        this.f10010M = new C1115A(this, 1);
    }

    public static /* synthetic */ void A(C1118D c1118d, int i2, int i4, Integer num, int i5) {
        if ((i5 & 4) != 0) {
            num = null;
        }
        c1118d.z(i2, i4, num, null);
    }

    public static CharSequence I(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i2 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i2 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i2);
                Intrinsics.d(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    public static boolean m(y0.n nVar) {
        Object obj = nVar.f11587d.f11576d.get(y0.q.B);
        if (obj == null) {
            obj = null;
        }
        z0.a aVar = (z0.a) obj;
        y0.t tVar = y0.q.f11630s;
        LinkedHashMap linkedHashMap = nVar.f11587d.f11576d;
        Object obj2 = linkedHashMap.get(tVar);
        if (obj2 == null) {
            obj2 = null;
        }
        y0.f fVar = (y0.f) obj2;
        boolean z4 = aVar != null;
        Object obj3 = linkedHashMap.get(y0.q.f11606A);
        if (((Boolean) (obj3 != null ? obj3 : null)) != null) {
            return fVar != null ? y0.f.a(fVar.f11545a, 4) : false ? z4 : true;
        }
        return z4;
    }

    public static C0036g o(y0.n nVar) {
        Object obj = nVar.f11587d.f11576d.get(y0.q.f11635x);
        if (obj == null) {
            obj = null;
        }
        C0036g c0036g = (C0036g) obj;
        Object obj2 = nVar.f11587d.f11576d.get(y0.q.f11632u);
        if (obj2 == null) {
            obj2 = null;
        }
        List list = (List) obj2;
        return c0036g == null ? list != null ? (C0036g) C1403G.r(list) : null : c0036g;
    }

    public static String p(y0.n nVar) {
        C0036g c0036g;
        if (nVar == null) {
            return null;
        }
        y0.t tVar = y0.q.f11612a;
        y0.i iVar = nVar.f11587d;
        LinkedHashMap linkedHashMap = iVar.f11576d;
        if (linkedHashMap.containsKey(tVar)) {
            return j0.c.x((List) iVar.h(tVar), ",");
        }
        y0.t tVar2 = y0.q.f11635x;
        if (linkedHashMap.containsKey(tVar2)) {
            Object obj = linkedHashMap.get(tVar2);
            if (obj == null) {
                obj = null;
            }
            C0036g c0036g2 = (C0036g) obj;
            if (c0036g2 != null) {
                return c0036g2.f328a;
            }
            return null;
        }
        Object obj2 = linkedHashMap.get(y0.q.f11632u);
        if (obj2 == null) {
            obj2 = null;
        }
        List list = (List) obj2;
        if (list == null || (c0036g = (C0036g) C1403G.r(list)) == null) {
            return null;
        }
        return c0036g.f328a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [M2.p, kotlin.jvm.functions.Function0] */
    public static final boolean t(y0.g gVar, float f4) {
        ?? r2 = gVar.f11546a;
        return (f4 < 0.0f && ((Number) r2.invoke()).floatValue() > 0.0f) || (f4 > 0.0f && ((Number) r2.invoke()).floatValue() < ((Number) gVar.f11547b.invoke()).floatValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [M2.p, kotlin.jvm.functions.Function0] */
    public static final boolean u(y0.g gVar) {
        ?? r02 = gVar.f11546a;
        float floatValue = ((Number) r02.invoke()).floatValue();
        boolean z4 = gVar.f11548c;
        return (floatValue > 0.0f && !z4) || (((Number) r02.invoke()).floatValue() < ((Number) gVar.f11547b.invoke()).floatValue() && z4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [M2.p, kotlin.jvm.functions.Function0] */
    public static final boolean v(y0.g gVar) {
        ?? r02 = gVar.f11546a;
        float floatValue = ((Number) r02.invoke()).floatValue();
        float floatValue2 = ((Number) gVar.f11547b.invoke()).floatValue();
        boolean z4 = gVar.f11548c;
        return (floatValue < floatValue2 && !z4) || (((Number) r02.invoke()).floatValue() > 0.0f && z4);
    }

    public final void B(String str, int i2, int i4) {
        AccessibilityEvent g4 = g(w(i2), 32);
        g4.setContentChangeTypes(i4);
        if (str != null) {
            g4.getText().add(str);
        }
        y(g4);
    }

    public final void C(int i2) {
        C0999C c0999c = this.f10033z;
        if (c0999c != null) {
            y0.n nVar = (y0.n) c0999c.f9146f;
            if (i2 != nVar.f11590g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c0999c.f9145e <= 1000) {
                AccessibilityEvent g4 = g(w(nVar.f11590g), 131072);
                g4.setFromIndex(c0999c.f9143c);
                g4.setToIndex(c0999c.f9144d);
                g4.setAction(c0999c.f9141a);
                g4.setMovementGranularity(c0999c.f9142b);
                g4.getText().add(p(nVar));
                y(g4);
            }
        }
        this.f10033z = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x0538, code lost:
    
        if (r1.containsAll(r2) != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x053b, code lost:
    
        r22 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x05cd, code lost:
    
        if (r2 != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x05c5, code lost:
    
        if (r1 != null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x05ca, code lost:
    
        if (r1 == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r4, r8) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(i.q qVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int[] iArr;
        long[] jArr;
        int i2;
        int i4;
        ArrayList arrayList3;
        int[] iArr2;
        long[] jArr2;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList4;
        int i9;
        int i10;
        I0 i02;
        boolean z4;
        y0.t tVar;
        y0.t tVar2;
        char c4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int[] iArr3;
        long[] jArr3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char c5;
        ArrayList arrayList7;
        boolean z5;
        I0 i03;
        String str;
        AccessibilityEvent h4;
        i.q qVar2 = qVar;
        ArrayList arrayList8 = this.f10009L;
        ArrayList arrayList9 = new ArrayList(arrayList8);
        arrayList8.clear();
        int[] iArr4 = qVar2.f6941b;
        long[] jArr4 = qVar2.f6940a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            long j4 = jArr4[i16];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i17 = 8;
                int i18 = 8 - ((~(i16 - length)) >>> 31);
                long j5 = j4;
                int i19 = 0;
                while (i19 < i18) {
                    if ((j5 & 255) < 128) {
                        int i20 = iArr4[(i16 << 3) + i19];
                        J0 j02 = (J0) this.f10005H.f(i20);
                        if (j02 != null) {
                            K0 k02 = (K0) qVar2.f(i20);
                            y0.n nVar = k02 != null ? k02.f10067a : null;
                            if (nVar == null) {
                                AbstractC0864b.E("no value for specified key");
                                throw null;
                            }
                            y0.i iVar = nVar.f11587d;
                            Iterator it = iVar.iterator();
                            boolean z6 = false;
                            while (true) {
                                boolean hasNext = it.hasNext();
                                y0.i iVar2 = j02.f10063a;
                                if (hasNext) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    Object key = entry.getKey();
                                    J0 j03 = j02;
                                    y0.t tVar3 = y0.q.f11626o;
                                    if (Intrinsics.a(key, tVar3)) {
                                        i10 = i19;
                                    } else {
                                        i10 = i19;
                                        if (!Intrinsics.a(entry.getKey(), y0.q.f11627p)) {
                                            z4 = false;
                                            LinkedHashMap linkedHashMap = iVar2.f11576d;
                                            if (!z4) {
                                                Object value = entry.getValue();
                                                Object obj = linkedHashMap.get((y0.t) entry.getKey());
                                                if (obj == null) {
                                                    obj = null;
                                                }
                                            }
                                            tVar = (y0.t) entry.getKey();
                                            tVar2 = y0.q.f11615d;
                                            if (Intrinsics.a(tVar, tVar2)) {
                                                if (Intrinsics.a(tVar, y0.q.f11613b) ? true : Intrinsics.a(tVar, y0.q.B)) {
                                                    c4 = '\b';
                                                    A(this, w(i20), 2048, 64, 8);
                                                    A(this, w(i20), 2048, 0, 8);
                                                    arrayList5 = arrayList9;
                                                    iArr3 = iArr4;
                                                    jArr3 = jArr4;
                                                    i11 = length;
                                                    i12 = i10;
                                                    i15 = i20;
                                                    i13 = i18;
                                                    i14 = i16;
                                                    arrayList7 = arrayList8;
                                                } else {
                                                    int i21 = i18;
                                                    c4 = '\b';
                                                    if (Intrinsics.a(tVar, y0.q.f11614c)) {
                                                        A(this, w(i20), 2048, 64, 8);
                                                        A(this, w(i20), 2048, 0, 8);
                                                        arrayList5 = arrayList9;
                                                        arrayList7 = arrayList8;
                                                        iArr3 = iArr4;
                                                        jArr3 = jArr4;
                                                        i11 = length;
                                                        i12 = i10;
                                                        i13 = i21;
                                                        i15 = i20;
                                                        i14 = i16;
                                                    } else {
                                                        y0.t tVar4 = y0.q.f11606A;
                                                        boolean a4 = Intrinsics.a(tVar, tVar4);
                                                        int i22 = i16;
                                                        r0.E e4 = nVar.f11586c;
                                                        LinkedHashMap linkedHashMap2 = iVar.f11576d;
                                                        arrayList5 = arrayList9;
                                                        if (a4) {
                                                            Object obj2 = linkedHashMap2.get(y0.q.f11630s);
                                                            if (obj2 == null) {
                                                                obj2 = null;
                                                            }
                                                            y0.f fVar = (y0.f) obj2;
                                                            if (fVar == null ? false : y0.f.a(fVar.f11545a, 4)) {
                                                                Object obj3 = linkedHashMap2.get(tVar4);
                                                                if (obj3 == null) {
                                                                    obj3 = null;
                                                                }
                                                                if (Intrinsics.a(obj3, Boolean.TRUE)) {
                                                                    AccessibilityEvent g4 = g(w(i20), 4);
                                                                    y0.n nVar2 = new y0.n(nVar.f11584a, true, e4, iVar);
                                                                    Object obj4 = nVar2.i().f11576d.get(y0.q.f11612a);
                                                                    if (obj4 == null) {
                                                                        obj4 = null;
                                                                    }
                                                                    List list = (List) obj4;
                                                                    String x2 = list != null ? j0.c.x(list, ",") : null;
                                                                    Object obj5 = nVar2.i().f11576d.get(y0.q.f11632u);
                                                                    if (obj5 == null) {
                                                                        obj5 = null;
                                                                    }
                                                                    List list2 = (List) obj5;
                                                                    String x3 = list2 != null ? j0.c.x(list2, ",") : null;
                                                                    if (x2 != null) {
                                                                        g4.setContentDescription(x2);
                                                                        Unit unit = Unit.f7487a;
                                                                    }
                                                                    if (x3 != null) {
                                                                        g4.getText().add(x3);
                                                                    }
                                                                    y(g4);
                                                                    arrayList7 = arrayList8;
                                                                    iArr3 = iArr4;
                                                                    jArr3 = jArr4;
                                                                    i11 = length;
                                                                    i12 = i10;
                                                                    i13 = i21;
                                                                    i14 = i22;
                                                                    c5 = '\b';
                                                                    i15 = i20;
                                                                } else {
                                                                    c4 = '\b';
                                                                    A(this, w(i20), 2048, 0, 8);
                                                                }
                                                            } else {
                                                                c4 = '\b';
                                                                A(this, w(i20), 2048, 64, 8);
                                                                A(this, w(i20), 2048, 0, 8);
                                                            }
                                                            arrayList7 = arrayList8;
                                                            iArr3 = iArr4;
                                                            jArr3 = jArr4;
                                                            i11 = length;
                                                            i12 = i10;
                                                            i13 = i21;
                                                            i14 = i22;
                                                            i15 = i20;
                                                        } else {
                                                            c4 = '\b';
                                                            if (Intrinsics.a(tVar, y0.q.f11612a)) {
                                                                int w4 = w(i20);
                                                                Object value2 = entry.getValue();
                                                                Intrinsics.d(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                z(w4, 2048, 4, (List) value2);
                                                                arrayList7 = arrayList8;
                                                                iArr3 = iArr4;
                                                                jArr3 = jArr4;
                                                                i11 = length;
                                                                i12 = i10;
                                                                i13 = i21;
                                                                i14 = i22;
                                                                i15 = i20;
                                                            } else {
                                                                y0.t tVar5 = y0.q.f11635x;
                                                                String str2 = "";
                                                                if (!Intrinsics.a(tVar, tVar5)) {
                                                                    arrayList6 = arrayList8;
                                                                    iArr3 = iArr4;
                                                                    jArr3 = jArr4;
                                                                    i11 = length;
                                                                    i12 = i10;
                                                                    i13 = i21;
                                                                    i14 = i22;
                                                                    i15 = i20;
                                                                    c5 = '\b';
                                                                    y0.t tVar6 = y0.q.f11636y;
                                                                    boolean a5 = Intrinsics.a(tVar, tVar6);
                                                                    int i23 = nVar.f11590g;
                                                                    if (a5) {
                                                                        Object obj6 = linkedHashMap2.get(tVar5);
                                                                        if (obj6 == null) {
                                                                            obj6 = null;
                                                                        }
                                                                        C0036g c0036g = (C0036g) obj6;
                                                                        if (c0036g != null && (str = c0036g.f328a) != null) {
                                                                            str2 = str;
                                                                        }
                                                                        A0.K k4 = (A0.K) iVar.h(tVar6);
                                                                        int w5 = w(i15);
                                                                        long j6 = k4.f301a;
                                                                        y(h(w5, Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str2.length()), I(str2)));
                                                                        C(i23);
                                                                    } else {
                                                                        if (Intrinsics.a(tVar, tVar3) ? true : Intrinsics.a(tVar, y0.q.f11627p)) {
                                                                            s(e4);
                                                                            int size = arrayList6.size();
                                                                            int i24 = 0;
                                                                            while (true) {
                                                                                if (i24 >= size) {
                                                                                    arrayList7 = arrayList6;
                                                                                    i03 = null;
                                                                                    break;
                                                                                }
                                                                                arrayList7 = arrayList6;
                                                                                if (((I0) arrayList7.get(i24)).f10056d == i15) {
                                                                                    i03 = (I0) arrayList7.get(i24);
                                                                                    break;
                                                                                } else {
                                                                                    i24++;
                                                                                    arrayList6 = arrayList7;
                                                                                }
                                                                            }
                                                                            Intrinsics.c(i03);
                                                                            Object obj7 = linkedHashMap2.get(tVar3);
                                                                            if (obj7 == null) {
                                                                                obj7 = null;
                                                                            }
                                                                            i03.f10060k = (y0.g) obj7;
                                                                            Object obj8 = linkedHashMap2.get(y0.q.f11627p);
                                                                            if (obj8 == null) {
                                                                                obj8 = null;
                                                                            }
                                                                            i03.f10061l = (y0.g) obj8;
                                                                            if (i03.f10057e.contains(i03)) {
                                                                                this.f10011d.getSnapshotObserver().a(i03, this.f10010M, new A.f0(i03, 11, this));
                                                                            }
                                                                        } else {
                                                                            arrayList7 = arrayList6;
                                                                            if (Intrinsics.a(tVar, y0.q.f11622k)) {
                                                                                Object value3 = entry.getValue();
                                                                                Intrinsics.d(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                                                                if (((Boolean) value3).booleanValue()) {
                                                                                    y(g(w(i23), 8));
                                                                                }
                                                                                A(this, w(i23), 2048, 0, 8);
                                                                            } else {
                                                                                y0.t tVar7 = y0.h.f11571v;
                                                                                if (Intrinsics.a(tVar, tVar7)) {
                                                                                    List list3 = (List) iVar.h(tVar7);
                                                                                    Object obj9 = linkedHashMap.get(tVar7);
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
                                                                                        if (linkedHashSet.containsAll(linkedHashSet2)) {
                                                                                        }
                                                                                        z6 = true;
                                                                                    } else if (!list3.isEmpty()) {
                                                                                        i16 = i14;
                                                                                        i20 = i15;
                                                                                        i19 = i12;
                                                                                        j02 = j03;
                                                                                        arrayList9 = arrayList5;
                                                                                        iArr4 = iArr3;
                                                                                        jArr4 = jArr3;
                                                                                        z6 = true;
                                                                                        arrayList8 = arrayList7;
                                                                                        i18 = i13;
                                                                                        length = i11;
                                                                                    }
                                                                                } else {
                                                                                    if (entry.getValue() instanceof C1317a) {
                                                                                        Object value4 = entry.getValue();
                                                                                        Intrinsics.d(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                                                        C1317a c1317a = (C1317a) value4;
                                                                                        Object obj10 = linkedHashMap.get((y0.t) entry.getKey());
                                                                                        if (obj10 == null) {
                                                                                            obj10 = null;
                                                                                        }
                                                                                        if (c1317a != obj10) {
                                                                                            if (obj10 instanceof C1317a) {
                                                                                                C1317a c1317a2 = (C1317a) obj10;
                                                                                                if (Intrinsics.a(c1317a.f11535a, c1317a2.f11535a)) {
                                                                                                    InterfaceC1332g interfaceC1332g = c1317a2.f11536b;
                                                                                                    InterfaceC1332g interfaceC1332g2 = c1317a.f11536b;
                                                                                                    if (interfaceC1332g2 == null) {
                                                                                                    }
                                                                                                    if (interfaceC1332g2 != null) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            z5 = false;
                                                                                        }
                                                                                        z5 = true;
                                                                                    }
                                                                                    z6 = true;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (linkedHashMap2.containsKey(y0.h.f11558i)) {
                                                                    Object obj11 = linkedHashMap.get(tVar5);
                                                                    if (obj11 == null) {
                                                                        obj11 = null;
                                                                    }
                                                                    C0036g c0036g2 = (C0036g) obj11;
                                                                    if (c0036g2 == null) {
                                                                        c0036g2 = "";
                                                                    }
                                                                    Object obj12 = linkedHashMap2.get(tVar5);
                                                                    if (obj12 == null) {
                                                                        obj12 = null;
                                                                    }
                                                                    CharSequence charSequence = (C0036g) obj12;
                                                                    if (charSequence == null) {
                                                                        charSequence = "";
                                                                    }
                                                                    CharSequence I3 = I(charSequence);
                                                                    int length2 = c0036g2.length();
                                                                    int length3 = charSequence.length();
                                                                    int i25 = length2 > length3 ? length3 : length2;
                                                                    iArr3 = iArr4;
                                                                    int i26 = 0;
                                                                    while (true) {
                                                                        jArr3 = jArr4;
                                                                        if (i26 >= i25) {
                                                                            i11 = length;
                                                                            break;
                                                                        }
                                                                        i11 = length;
                                                                        if (c0036g2.charAt(i26) != charSequence.charAt(i26)) {
                                                                            break;
                                                                        }
                                                                        i26++;
                                                                        jArr4 = jArr3;
                                                                        length = i11;
                                                                    }
                                                                    arrayList6 = arrayList8;
                                                                    int i27 = 0;
                                                                    while (i27 < i25 - i26 && c0036g2.charAt((length2 - 1) - i27) == charSequence.charAt((length3 - 1) - i27)) {
                                                                        i27++;
                                                                    }
                                                                    int i28 = (length2 - i27) - i26;
                                                                    int i29 = (length3 - i27) - i26;
                                                                    y0.t tVar8 = y0.q.f11607C;
                                                                    boolean containsKey = linkedHashMap.containsKey(tVar8);
                                                                    boolean containsKey2 = linkedHashMap2.containsKey(tVar8);
                                                                    boolean containsKey3 = linkedHashMap.containsKey(y0.q.f11635x);
                                                                    boolean z7 = containsKey3 && !containsKey && containsKey2;
                                                                    boolean z8 = containsKey3 && containsKey && !containsKey2;
                                                                    if (z7 || z8) {
                                                                        int w6 = w(i20);
                                                                        Integer valueOf = Integer.valueOf(length3);
                                                                        i15 = i20;
                                                                        i12 = i10;
                                                                        i13 = i21;
                                                                        c5 = '\b';
                                                                        i14 = i22;
                                                                        h4 = h(w6, 0, 0, valueOf, I3);
                                                                    } else {
                                                                        h4 = g(w(i20), 16);
                                                                        h4.setFromIndex(i26);
                                                                        h4.setRemovedCount(i28);
                                                                        h4.setAddedCount(i29);
                                                                        h4.setBeforeText(c0036g2);
                                                                        h4.getText().add(I3);
                                                                        i15 = i20;
                                                                        i12 = i10;
                                                                        i13 = i21;
                                                                        i14 = i22;
                                                                        c5 = '\b';
                                                                    }
                                                                    h4.setClassName("android.widget.EditText");
                                                                    y(h4);
                                                                    if (z7 || z8) {
                                                                        long j7 = ((A0.K) iVar.h(y0.q.f11636y)).f301a;
                                                                        h4.setFromIndex((int) (j7 >> 32));
                                                                        h4.setToIndex((int) (j7 & 4294967295L));
                                                                        y(h4);
                                                                    }
                                                                } else {
                                                                    arrayList6 = arrayList8;
                                                                    iArr3 = iArr4;
                                                                    jArr3 = jArr4;
                                                                    i11 = length;
                                                                    i12 = i10;
                                                                    i13 = i21;
                                                                    i14 = i22;
                                                                    i15 = i20;
                                                                    c5 = '\b';
                                                                    A(this, w(i15), 2048, 2, 8);
                                                                }
                                                                arrayList7 = arrayList6;
                                                            }
                                                        }
                                                    }
                                                }
                                                c5 = c4;
                                            } else {
                                                Object value5 = entry.getValue();
                                                Intrinsics.d(value5, "null cannot be cast to non-null type kotlin.String");
                                                String str3 = (String) value5;
                                                if (linkedHashMap.containsKey(tVar2)) {
                                                    B(str3, i20, 8);
                                                    arrayList5 = arrayList9;
                                                    iArr3 = iArr4;
                                                    jArr3 = jArr4;
                                                    i11 = length;
                                                    i12 = i10;
                                                    i15 = i20;
                                                    i13 = i18;
                                                    i14 = i16;
                                                    arrayList7 = arrayList8;
                                                    c5 = '\b';
                                                }
                                                arrayList5 = arrayList9;
                                                iArr3 = iArr4;
                                                jArr3 = jArr4;
                                                i11 = length;
                                                i12 = i10;
                                                i15 = i20;
                                                i13 = i18;
                                                i14 = i16;
                                                arrayList7 = arrayList8;
                                                c5 = '\b';
                                            }
                                            i16 = i14;
                                            i20 = i15;
                                            i19 = i12;
                                            j02 = j03;
                                            arrayList9 = arrayList5;
                                            iArr4 = iArr3;
                                            jArr4 = jArr3;
                                            arrayList8 = arrayList7;
                                            i18 = i13;
                                            length = i11;
                                        }
                                    }
                                    int size2 = arrayList9.size();
                                    int i30 = 0;
                                    while (true) {
                                        if (i30 >= size2) {
                                            i02 = null;
                                            break;
                                        }
                                        int i31 = size2;
                                        if (((I0) arrayList9.get(i30)).f10056d == i20) {
                                            i02 = (I0) arrayList9.get(i30);
                                            break;
                                        } else {
                                            i30++;
                                            size2 = i31;
                                        }
                                    }
                                    if (i02 != null) {
                                        z4 = false;
                                    } else {
                                        i02 = new I0(i20, arrayList8);
                                        z4 = true;
                                    }
                                    arrayList8.add(i02);
                                    LinkedHashMap linkedHashMap3 = iVar2.f11576d;
                                    if (!z4) {
                                    }
                                    tVar = (y0.t) entry.getKey();
                                    tVar2 = y0.q.f11615d;
                                    if (Intrinsics.a(tVar, tVar2)) {
                                    }
                                    i16 = i14;
                                    i20 = i15;
                                    i19 = i12;
                                    j02 = j03;
                                    arrayList9 = arrayList5;
                                    iArr4 = iArr3;
                                    jArr4 = jArr3;
                                    arrayList8 = arrayList7;
                                    i18 = i13;
                                    length = i11;
                                } else {
                                    arrayList3 = arrayList9;
                                    iArr2 = iArr4;
                                    jArr2 = jArr4;
                                    i5 = length;
                                    int i32 = i20;
                                    i6 = i19;
                                    i7 = i18;
                                    i8 = i16;
                                    arrayList4 = arrayList8;
                                    i9 = 8;
                                    if (!z6) {
                                        Iterator it2 = iVar2.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                z6 = false;
                                                break;
                                            }
                                            if (!nVar.i().f11576d.containsKey((y0.t) ((Map.Entry) it2.next()).getKey())) {
                                                z6 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (z6) {
                                        A(this, w(i32), 2048, 0, 8);
                                    }
                                }
                            }
                        }
                    }
                    arrayList3 = arrayList9;
                    iArr2 = iArr4;
                    jArr2 = jArr4;
                    i5 = length;
                    i6 = i19;
                    i7 = i18;
                    i8 = i16;
                    arrayList4 = arrayList8;
                    i9 = i17;
                    j5 >>= i9;
                    i19 = i6 + 1;
                    qVar2 = qVar;
                    i16 = i8;
                    i17 = i9;
                    arrayList9 = arrayList3;
                    iArr4 = iArr2;
                    jArr4 = jArr2;
                    arrayList8 = arrayList4;
                    i18 = i7;
                    length = i5;
                }
                arrayList = arrayList9;
                iArr = iArr4;
                jArr = jArr4;
                int i33 = length;
                int i34 = i18;
                i2 = i16;
                arrayList2 = arrayList8;
                if (i34 != i17) {
                    return;
                } else {
                    i4 = i33;
                }
            } else {
                arrayList = arrayList9;
                arrayList2 = arrayList8;
                iArr = iArr4;
                jArr = jArr4;
                i2 = i16;
                i4 = length;
            }
            if (i2 == i4) {
                return;
            }
            i16 = i2 + 1;
            qVar2 = qVar;
            length = i4;
            arrayList8 = arrayList2;
            arrayList9 = arrayList;
            iArr4 = iArr;
            jArr4 = jArr;
        }
    }

    public final void E(r0.E e4, i.r rVar) {
        y0.i o4;
        if (e4.D() && !this.f10011d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(e4)) {
            r0.E e5 = null;
            if (!e4.B.f(8)) {
                e4 = e4.s();
                while (true) {
                    if (e4 == null) {
                        e4 = null;
                        break;
                    } else if (e4.B.f(8)) {
                        break;
                    } else {
                        e4 = e4.s();
                    }
                }
            }
            if (e4 == null || (o4 = e4.o()) == null) {
                return;
            }
            if (!o4.f11577e) {
                r0.E s4 = e4.s();
                while (true) {
                    if (s4 != null) {
                        y0.i o5 = s4.o();
                        if (o5 != null && o5.f11577e) {
                            e5 = s4;
                            break;
                        }
                        s4 = s4.s();
                    } else {
                        break;
                    }
                }
                if (e5 != null) {
                    e4 = e5;
                }
            }
            int i2 = e4.f9595e;
            if (rVar.a(i2)) {
                A(this, w(i2), 2048, 1, 8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [M2.p, kotlin.jvm.functions.Function0] */
    public final void F(r0.E e4) {
        if (e4.D() && !this.f10011d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(e4)) {
            int i2 = e4.f9595e;
            y0.g gVar = (y0.g) this.f10024q.f(i2);
            y0.g gVar2 = (y0.g) this.f10025r.f(i2);
            if (gVar == null && gVar2 == null) {
                return;
            }
            AccessibilityEvent g4 = g(i2, 4096);
            if (gVar != null) {
                g4.setScrollX((int) ((Number) gVar.f11546a.invoke()).floatValue());
                g4.setMaxScrollX((int) ((Number) gVar.f11547b.invoke()).floatValue());
            }
            if (gVar2 != null) {
                g4.setScrollY((int) ((Number) gVar2.f11546a.invoke()).floatValue());
                g4.setMaxScrollY((int) ((Number) gVar2.f11547b.invoke()).floatValue());
            }
            y(g4);
        }
    }

    public final boolean G(y0.n nVar, int i2, int i4, boolean z4) {
        String p4;
        y0.i iVar = nVar.f11587d;
        y0.t tVar = y0.h.f11557h;
        if (iVar.f11576d.containsKey(tVar) && AbstractC1125K.a(nVar)) {
            L2.c cVar = (L2.c) ((C1317a) nVar.f11587d.h(tVar)).f11536b;
            if (cVar != null) {
                return ((Boolean) cVar.g(Integer.valueOf(i2), Integer.valueOf(i4), Boolean.valueOf(z4))).booleanValue();
            }
            return false;
        }
        if ((i2 == i4 && i4 == this.f10028u) || (p4 = p(nVar)) == null) {
            return false;
        }
        if (i2 < 0 || i2 != i4 || i4 > p4.length()) {
            i2 = -1;
        }
        this.f10028u = i2;
        boolean z5 = p4.length() > 0;
        int i5 = nVar.f11590g;
        y(h(w(i5), z5 ? Integer.valueOf(this.f10028u) : null, z5 ? Integer.valueOf(this.f10028u) : null, z5 ? Integer.valueOf(p4.length()) : null, p4));
        C(i5);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce A[LOOP:1: B:8:0x002f->B:26:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1 A[EDGE_INSN: B:27:0x00d1->B:34:0x00d1 BREAK  A[LOOP:1: B:8:0x002f->B:26:0x00ce], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList H(boolean z4, ArrayList arrayList) {
        i.q qVar = i.j.f6922a;
        i.q qVar2 = new i.q();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            i((y0.n) arrayList.get(i2), arrayList2, qVar2);
        }
        ArrayList arrayList3 = new ArrayList();
        int d4 = C1441y.d(arrayList2);
        if (d4 >= 0) {
            int i4 = 0;
            while (true) {
                y0.n nVar = (y0.n) arrayList2.get(i4);
                if (i4 != 0) {
                    Y.d f4 = nVar.f();
                    Y.d f5 = nVar.f();
                    float f6 = f4.f4375b;
                    float f7 = f5.f4377d;
                    boolean z5 = f6 >= f7;
                    int d5 = C1441y.d(arrayList3);
                    if (d5 >= 0) {
                        int i5 = 0;
                        while (true) {
                            Y.d dVar = (Y.d) ((Pair) arrayList3.get(i5)).f7485d;
                            float f8 = dVar.f4375b;
                            float f9 = dVar.f4377d;
                            boolean z6 = f8 >= f9;
                            if (!z5 && !z6 && Math.max(f6, f8) < Math.min(f7, f9)) {
                                arrayList3.set(i5, new Pair(new Y.d(Math.max(dVar.f4374a, 0.0f), Math.max(dVar.f4375b, f6), Math.min(dVar.f4376c, Float.POSITIVE_INFINITY), Math.min(f9, f7)), ((Pair) arrayList3.get(i5)).f7486e));
                                ((List) ((Pair) arrayList3.get(i5)).f7486e).add(nVar);
                                break;
                            }
                            if (i5 == d5) {
                                break;
                            }
                            i5++;
                        }
                        if (i4 != d4) {
                            break;
                        }
                        i4++;
                    }
                }
                arrayList3.add(new Pair(nVar.f(), C1441y.f(nVar)));
                if (i4 != d4) {
                }
            }
        }
        C1399C.i(arrayList3, C1178y.f10420d);
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Pair pair = (Pair) arrayList3.get(i6);
            C1399C.i((List) pair.f7486e, new C1116B(new C1116B(z4 ? C1178y.f10419c : C1178y.f10418b)));
            arrayList4.addAll((Collection) pair.f7486e);
        }
        C1399C.i(arrayList4, new B0.t(4));
        int i7 = 0;
        while (i7 <= C1441y.d(arrayList4)) {
            List list = (List) qVar2.f(((y0.n) arrayList4.get(i7)).f11590g);
            if (list != null) {
                if (r((y0.n) arrayList4.get(i7))) {
                    i7++;
                } else {
                    arrayList4.remove(i7);
                }
                arrayList4.addAll(i7, list);
                i7 += list.size();
            } else {
                i7++;
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0148, code lost:
    
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0156, code lost:
    
        if (((r0 & ((~r0) << 6)) & (-9187201950435737472L)) == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0158, code lost:
    
        r24 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        C1118D c1118d;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int i2;
        int i4;
        int[] iArr2;
        int i5;
        int i6;
        i.r elements = new i.r();
        i.r rVar = this.B;
        int[] iArr3 = rVar.f6947b;
        long[] jArr3 = rVar.f6946a;
        int length = jArr3.length - 2;
        i.q qVar = this.f10005H;
        char c4 = 7;
        long j4 = -9187201950435737472L;
        int i7 = 8;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr3[i8];
                if ((((~j5) << c4) & j5 & j4) != j4) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((j5 & 255) < 128) {
                            int i11 = iArr3[(i8 << 3) + i10];
                            K0 k02 = (K0) l().f(i11);
                            y0.n nVar = k02 != null ? k02.f10067a : null;
                            if (nVar != null) {
                                if (nVar.f11587d.f11576d.containsKey(y0.q.f11615d)) {
                                }
                            }
                            elements.a(i11);
                            J0 j02 = (J0) qVar.f(i11);
                            if (j02 != null) {
                                Object obj = j02.f10063a.f11576d.get(y0.q.f11615d);
                                r20 = obj != 0 ? obj : null;
                            }
                            B(r20, i11, 32);
                        }
                        j5 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                c4 = 7;
                j4 = -9187201950435737472L;
            }
        }
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int[] iArr4 = elements.f6947b;
        long[] jArr4 = elements.f6946a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr4[i12];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j6 & 255) < 128) {
                            int i15 = iArr4[(i12 << 3) + i14];
                            int hashCode = Integer.hashCode(i15) * (-862048943);
                            int i16 = hashCode ^ (hashCode << 16);
                            int i17 = i16 & 127;
                            int i18 = rVar.f6948c;
                            int i19 = (i16 >>> 7) & i18;
                            int i20 = 0;
                            while (true) {
                                long[] jArr5 = rVar.f6946a;
                                int i21 = i19 >> 3;
                                jArr2 = jArr4;
                                int i22 = (i19 & 7) << 3;
                                long j7 = (jArr5[i21] >>> i22) | ((jArr5[i21 + 1] << (64 - i22)) & ((-i22) >> 63));
                                iArr2 = iArr4;
                                i2 = length2;
                                long j8 = (i17 * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    i6 = (i19 + (Long.numberOfTrailingZeros(j9) >> 3)) & i18;
                                    int i23 = i17;
                                    if (rVar.f6947b[i6] == i15) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i17 = i23;
                                }
                                i20 += 8;
                                i19 = (i19 + i20) & i18;
                                iArr4 = iArr2;
                                length2 = i2;
                                jArr4 = jArr2;
                                i17 = i5;
                            }
                            int i24 = i6;
                            if (i24 >= 0) {
                                rVar.f(i24);
                            }
                            i4 = 8;
                        } else {
                            jArr2 = jArr4;
                            i2 = length2;
                            i4 = i7;
                            iArr2 = iArr4;
                        }
                        j6 >>= i4;
                        i14++;
                        iArr4 = iArr2;
                        length2 = i2;
                        jArr4 = jArr2;
                        i7 = i4;
                    }
                    jArr = jArr4;
                    int i25 = length2;
                    int i26 = i7;
                    iArr = iArr4;
                    if (i13 != i26) {
                        break;
                    } else {
                        length2 = i25;
                    }
                } else {
                    jArr = jArr4;
                    iArr = iArr4;
                }
                if (i12 == length2) {
                    break;
                }
                i12++;
                iArr4 = iArr;
                jArr4 = jArr;
                i7 = 8;
            }
        }
        qVar.a();
        i.q l4 = l();
        int[] iArr5 = l4.f6941b;
        Object[] objArr = l4.f6942c;
        long[] jArr6 = l4.f6940a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i27 = 0;
            while (true) {
                long j10 = jArr6[i27];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i28 = 8 - ((~(i27 - length3)) >>> 31);
                    for (int i29 = 0; i29 < i28; i29++) {
                        if ((j10 & 255) < 128) {
                            int i30 = (i27 << 3) + i29;
                            int i31 = iArr5[i30];
                            K0 k03 = (K0) objArr[i30];
                            y0.i iVar = k03.f10067a.f11587d;
                            y0.t tVar = y0.q.f11615d;
                            boolean containsKey = iVar.f11576d.containsKey(tVar);
                            y0.n nVar2 = k03.f10067a;
                            if (containsKey && rVar.a(i31)) {
                                B((String) nVar2.f11587d.h(tVar), i31, 16);
                            }
                            qVar.i(i31, new J0(nVar2, l()));
                        }
                        j10 >>= 8;
                    }
                    c1118d = this;
                    if (i28 != 8) {
                        break;
                    }
                } else {
                    c1118d = this;
                }
                if (i27 == length3) {
                    break;
                } else {
                    i27++;
                }
            }
        } else {
            c1118d = this;
        }
        c1118d.f10006I = new J0(c1118d.f10011d.getSemanticsOwner().a(), l());
    }

    @Override // a1.AbstractC0387b
    public final l2.g a(View view) {
        return this.f10020m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i2, C0508h c0508h, String str, Bundle bundle) {
        y0.n nVar;
        RectF rectF;
        K0 k02 = (K0) l().f(i2);
        if (k02 == null || (nVar = k02.f10067a) == null) {
            return;
        }
        String p4 = p(nVar);
        boolean a4 = Intrinsics.a(str, this.f10002E);
        AccessibilityNodeInfo accessibilityNodeInfo = c0508h.f5625a;
        if (a4) {
            i.o oVar = this.f10000C;
            int c4 = oVar.c(i2);
            int i4 = c4 >= 0 ? oVar.f6934c[c4] : -1;
            if (i4 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, i4);
                return;
            }
            return;
        }
        if (Intrinsics.a(str, this.f10003F)) {
            i.o oVar2 = this.f10001D;
            int c5 = oVar2.c(i2);
            int i5 = c5 >= 0 ? oVar2.f6934c[c5] : -1;
            if (i5 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, i5);
                return;
            }
            return;
        }
        y0.t tVar = y0.h.f11550a;
        y0.i iVar = nVar.f11587d;
        LinkedHashMap linkedHashMap = iVar.f11576d;
        r0.a0 a0Var = null;
        if (!linkedHashMap.containsKey(tVar) || bundle == null || !Intrinsics.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            y0.t tVar2 = y0.q.f11631t;
            if (!linkedHashMap.containsKey(tVar2) || bundle == null || !Intrinsics.a(str, "androidx.compose.ui.semantics.testTag")) {
                if (Intrinsics.a(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, nVar.f11590g);
                    return;
                }
                return;
            } else {
                Object obj = linkedHashMap.get(tVar2);
                String str2 = (String) (obj == null ? null : obj);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i6 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i7 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i7 > 0 && i6 >= 0) {
            if (i6 < (p4 != null ? p4.length() : Integer.MAX_VALUE)) {
                A0.I g4 = AbstractC1125K.g(iVar);
                if (g4 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i8 = 0;
                while (i8 < i7) {
                    int i9 = i6 + i8;
                    if (i9 >= g4.f289a.f279a.f328a.length()) {
                        arrayList.add(a0Var);
                    } else {
                        Y.d b4 = g4.b(i9);
                        r0.a0 c6 = nVar.c();
                        long j4 = 0;
                        if (c6 != null) {
                            if (!c6.O0().f3990s) {
                                c6 = a0Var;
                            }
                            if (c6 != null) {
                                j4 = c6.Q(0L);
                            }
                        }
                        Y.d h4 = b4.h(j4);
                        Y.d e4 = nVar.e();
                        Y.d d4 = h4.f(e4) ? h4.d(e4) : a0Var;
                        if (d4 != 0) {
                            long c7 = AbstractC0345a.c(d4.f4374a, d4.f4375b);
                            C1166s c1166s = this.f10011d;
                            long q2 = c1166s.q(c7);
                            long q4 = c1166s.q(AbstractC0345a.c(d4.f4376c, d4.f4377d));
                            rectF = new RectF(Y.c.d(q2), Y.c.e(q2), Y.c.d(q4), Y.c.e(q4));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i8++;
                    a0Var = null;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect c(K0 k02) {
        Rect rect = k02.f10068b;
        long c4 = AbstractC0345a.c(rect.left, rect.top);
        C1166s c1166s = this.f10011d;
        long q2 = c1166s.q(c4);
        long q4 = c1166s.q(AbstractC0345a.c(rect.right, rect.bottom));
        return new Rect((int) Math.floor(Y.c.d(q2)), (int) Math.floor(Y.c.e(q2)), (int) Math.ceil(Y.c.d(q4)), (int) Math.ceil(Y.c.e(q4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:14:0x0059, B:19:0x006c, B:21:0x0074, B:24:0x007f, B:26:0x0084, B:28:0x0093, B:30:0x009a, B:31:0x00a3, B:40:0x0042), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:13:0x00c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00be -> B:13:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(E2.c cVar) {
        C1180z c1180z;
        int i2;
        C1118D c1118d;
        i.r rVar;
        Y2.c cVar2;
        i.r rVar2;
        Y2.c cVar3;
        Object b4;
        try {
            if (cVar instanceof C1180z) {
                c1180z = (C1180z) cVar;
                int i4 = c1180z.f10429o;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c1180z.f10429o = i4 - Integer.MIN_VALUE;
                    Object obj = c1180z.f10427m;
                    D2.a aVar = D2.a.f2163d;
                    i2 = c1180z.f10429o;
                    if (i2 != 0) {
                        AbstractC1343r.b(obj);
                        try {
                            rVar = new i.r();
                            Y2.e eVar = this.f10031x;
                            eVar.getClass();
                            cVar2 = new Y2.c(eVar);
                            c1118d = this;
                            c1180z.f10424j = c1118d;
                            c1180z.f10425k = rVar;
                            c1180z.f10426l = cVar2;
                            c1180z.f10429o = 1;
                            b4 = cVar2.b(c1180z);
                            if (b4 == aVar) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            c1118d = this;
                            c1118d.f10030w.clear();
                            throw th;
                        }
                    } else if (i2 == 1) {
                        cVar3 = c1180z.f10426l;
                        rVar2 = c1180z.f10425k;
                        c1118d = c1180z.f10424j;
                        AbstractC1343r.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar3 = c1180z.f10426l;
                        rVar2 = c1180z.f10425k;
                        c1118d = c1180z.f10424j;
                        AbstractC1343r.b(obj);
                        rVar = rVar2;
                        cVar2 = cVar3;
                        c1180z.f10424j = c1118d;
                        c1180z.f10425k = rVar;
                        c1180z.f10426l = cVar2;
                        c1180z.f10429o = 1;
                        b4 = cVar2.b(c1180z);
                        if (b4 == aVar) {
                            return aVar;
                        }
                        Y2.c cVar4 = cVar2;
                        rVar2 = rVar;
                        obj = b4;
                        cVar3 = cVar4;
                        if (((Boolean) obj).booleanValue()) {
                            c1118d.f10030w.clear();
                            return Unit.f7487a;
                        }
                        cVar3.c();
                        boolean q2 = c1118d.q();
                        C0671f c0671f = c1118d.f10030w;
                        if (q2) {
                            int i5 = c0671f.f6918i;
                            for (int i6 = 0; i6 < i5; i6++) {
                                r0.E e4 = (r0.E) c0671f.f6917e[i6];
                                c1118d.E(e4, rVar2);
                                c1118d.F(e4);
                            }
                            rVar2.b();
                            if (!c1118d.f10007J) {
                                c1118d.f10007J = true;
                                c1118d.f10019l.post(c1118d.f10008K);
                            }
                            c0671f.clear();
                            c1118d.f10024q.a();
                            c1118d.f10025r.a();
                            long j4 = c1118d.f10015h;
                            c1180z.f10424j = c1118d;
                            c1180z.f10425k = rVar2;
                            c1180z.f10426l = cVar3;
                            c1180z.f10429o = 2;
                            if (W2.F.a(j4, c1180z) == aVar) {
                                return aVar;
                            }
                        }
                        rVar = rVar2;
                        cVar2 = cVar3;
                        c1180z.f10424j = c1118d;
                        c1180z.f10425k = rVar;
                        c1180z.f10426l = cVar2;
                        c1180z.f10429o = 1;
                        b4 = cVar2.b(c1180z);
                        if (b4 == aVar) {
                        }
                    }
                }
            }
            if (i2 != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        c1180z = new C1180z(this, cVar);
        Object obj2 = c1180z.f10427m;
        D2.a aVar2 = D2.a.f2163d;
        i2 = c1180z.f10429o;
    }

    /* JADX WARN: Type inference failed for: r2v23, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r3v10, types: [M2.p, kotlin.jvm.functions.Function0] */
    public final boolean e(boolean z4, int i2, long j4) {
        y0.t tVar;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int i4;
        int i5 = 0;
        if (!Intrinsics.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        i.q l4 = l();
        if (!Y.c.b(j4, 9205357640488583168L) && Y.c.f(j4)) {
            if (z4) {
                tVar = y0.q.f11627p;
            } else {
                if (z4) {
                    throw new C1338m();
                }
                tVar = y0.q.f11626o;
            }
            Object[] objArr3 = l4.f6942c;
            long[] jArr3 = l4.f6940a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                boolean z5 = false;
                while (true) {
                    long j5 = jArr3[i6];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8;
                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                        int i9 = i5;
                        while (i9 < i8) {
                            if ((j5 & 255) < 128) {
                                K0 k02 = (K0) objArr3[(i6 << 3) + i9];
                                Rect rect = k02.f10068b;
                                jArr2 = jArr3;
                                objArr2 = objArr3;
                                if (Y.c.d(j4) >= ((float) rect.left) && Y.c.d(j4) < ((float) rect.right) && Y.c.e(j4) >= ((float) rect.top) && Y.c.e(j4) < ((float) rect.bottom)) {
                                    Object obj = k02.f10067a.f11587d.f11576d.get(tVar);
                                    if (obj == null) {
                                        obj = null;
                                    }
                                    y0.g gVar = (y0.g) obj;
                                    if (gVar != null) {
                                        boolean z6 = gVar.f11548c;
                                        int i10 = z6 ? -i2 : i2;
                                        if (i2 == 0 && z6) {
                                            i10 = -1;
                                        }
                                        ?? r32 = gVar.f11546a;
                                        if (i10 >= 0 ? ((Number) r32.invoke()).floatValue() < ((Number) gVar.f11547b.invoke()).floatValue() : ((Number) r32.invoke()).floatValue() > 0.0f) {
                                            z5 = true;
                                        }
                                    }
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                objArr2 = objArr3;
                                i4 = i7;
                            }
                            j5 >>= i4;
                            i9++;
                            i7 = i4;
                            jArr3 = jArr2;
                            objArr3 = objArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr3;
                        if (i8 != i7) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        objArr = objArr3;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    i5 = 0;
                }
                return z5;
            }
        }
        return false;
    }

    public final void f() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (q()) {
                x(this.f10011d.getSemanticsOwner().a(), this.f10006I);
            }
            Unit unit = Unit.f7487a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                D(l());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    J();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final AccessibilityEvent g(int i2, int i4) {
        K0 k02;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i4);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        C1166s c1166s = this.f10011d;
        obtain.setPackageName(c1166s.getContext().getPackageName());
        obtain.setSource(c1166s, i2);
        if (q() && (k02 = (K0) l().f(i2)) != null) {
            obtain.setPassword(k02.f10067a.f11587d.f11576d.containsKey(y0.q.f11607C));
        }
        return obtain;
    }

    public final AccessibilityEvent h(int i2, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent g4 = g(i2, 8192);
        if (num != null) {
            g4.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            g4.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            g4.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            g4.getText().add(charSequence);
        }
        return g4;
    }

    public final void i(y0.n nVar, ArrayList arrayList, i.q qVar) {
        boolean b4 = AbstractC1125K.b(nVar);
        Object obj = nVar.f11587d.f11576d.get(y0.q.f11623l);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i2 = nVar.f11590g;
        if ((booleanValue || r(nVar)) && l().c(i2)) {
            arrayList.add(nVar);
        }
        if (booleanValue) {
            qVar.i(i2, H(b4, C1403G.I(y0.n.h(nVar, false, 7))));
            return;
        }
        List h4 = y0.n.h(nVar, false, 7);
        int size = h4.size();
        for (int i4 = 0; i4 < size; i4++) {
            i((y0.n) h4.get(i4), arrayList, qVar);
        }
    }

    public final int j(y0.n nVar) {
        y0.i iVar = nVar.f11587d;
        if (!iVar.f11576d.containsKey(y0.q.f11612a)) {
            y0.t tVar = y0.q.f11636y;
            y0.i iVar2 = nVar.f11587d;
            if (iVar2.f11576d.containsKey(tVar)) {
                return (int) (4294967295L & ((A0.K) iVar2.h(tVar)).f301a);
            }
        }
        return this.f10028u;
    }

    public final int k(y0.n nVar) {
        y0.i iVar = nVar.f11587d;
        if (!iVar.f11576d.containsKey(y0.q.f11612a)) {
            y0.t tVar = y0.q.f11636y;
            y0.i iVar2 = nVar.f11587d;
            if (iVar2.f11576d.containsKey(tVar)) {
                return (int) (((A0.K) iVar2.h(tVar)).f301a >> 32);
            }
        }
        return this.f10028u;
    }

    public final i.q l() {
        if (this.f10032y) {
            this.f10032y = false;
            this.f9999A = AbstractC1125K.e(this.f10011d.getSemanticsOwner());
            if (q()) {
                i.o oVar = this.f10000C;
                oVar.a();
                i.o oVar2 = this.f10001D;
                oVar2.a();
                K0 k02 = (K0) l().f(-1);
                y0.n nVar = k02 != null ? k02.f10067a : null;
                Intrinsics.c(nVar);
                ArrayList H3 = H(AbstractC1125K.b(nVar), C1441y.f(nVar));
                int d4 = C1441y.d(H3);
                int i2 = 1;
                if (1 <= d4) {
                    while (true) {
                        int i4 = ((y0.n) H3.get(i2 - 1)).f11590g;
                        int i5 = ((y0.n) H3.get(i2)).f11590g;
                        oVar.f(i4, i5);
                        oVar2.f(i5, i4);
                        if (i2 == d4) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return this.f9999A;
    }

    public final String n(y0.n nVar) {
        Object obj = nVar.f11587d.f11576d.get(y0.q.f11613b);
        String str = null;
        if (obj == null) {
            obj = null;
        }
        y0.t tVar = y0.q.B;
        y0.i iVar = nVar.f11587d;
        LinkedHashMap linkedHashMap = iVar.f11576d;
        Object obj2 = linkedHashMap.get(tVar);
        if (obj2 == null) {
            obj2 = null;
        }
        z0.a aVar = (z0.a) obj2;
        Object obj3 = linkedHashMap.get(y0.q.f11630s);
        if (obj3 == null) {
            obj3 = null;
        }
        y0.f fVar = (y0.f) obj3;
        C1166s c1166s = this.f10011d;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                if ((fVar == null ? false : y0.f.a(fVar.f11545a, 2)) && obj == null) {
                    obj = c1166s.getContext().getResources().getString(R.string.state_on);
                }
            } else if (ordinal == 1) {
                if ((fVar == null ? false : y0.f.a(fVar.f11545a, 2)) && obj == null) {
                    obj = c1166s.getContext().getResources().getString(R.string.state_off);
                }
            } else if (ordinal == 2 && obj == null) {
                obj = c1166s.getContext().getResources().getString(R.string.indeterminate);
            }
        }
        Object obj4 = linkedHashMap.get(y0.q.f11606A);
        if (obj4 == null) {
            obj4 = null;
        }
        Boolean bool = (Boolean) obj4;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!(fVar == null ? false : y0.f.a(fVar.f11545a, 4)) && obj == null) {
                obj = booleanValue ? c1166s.getContext().getResources().getString(R.string.selected) : c1166s.getContext().getResources().getString(R.string.not_selected);
            }
        }
        Object obj5 = linkedHashMap.get(y0.q.f11614c);
        if (obj5 == null) {
            obj5 = null;
        }
        y0.e eVar = (y0.e) obj5;
        if (eVar != null) {
            if (eVar != y0.e.f11542c) {
                if (obj == null) {
                    obj = c1166s.getContext().getResources().getString(R.string.template_percent, 0);
                }
            } else if (obj == null) {
                obj = c1166s.getContext().getResources().getString(R.string.in_progress);
            }
        }
        y0.t tVar2 = y0.q.f11635x;
        if (linkedHashMap.containsKey(tVar2)) {
            y0.i i2 = new y0.n(nVar.f11584a, true, nVar.f11586c, iVar).i();
            y0.t tVar3 = y0.q.f11612a;
            LinkedHashMap linkedHashMap2 = i2.f11576d;
            Object obj6 = linkedHashMap2.get(tVar3);
            if (obj6 == null) {
                obj6 = null;
            }
            Collection collection = (Collection) obj6;
            if (collection == null || collection.isEmpty()) {
                Object obj7 = linkedHashMap2.get(y0.q.f11632u);
                if (obj7 == null) {
                    obj7 = null;
                }
                Collection collection2 = (Collection) obj7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object obj8 = linkedHashMap2.get(tVar2);
                    if (obj8 == null) {
                        obj8 = null;
                    }
                    CharSequence charSequence = (CharSequence) obj8;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = c1166s.getContext().getResources().getString(R.string.state_empty);
                    }
                }
            }
            obj = str;
        }
        return (String) obj;
    }

    public final boolean q() {
        return this.f10014g.isEnabled() && !this.f10018k.isEmpty();
    }

    public final boolean r(y0.n nVar) {
        Object obj = nVar.f11587d.f11576d.get(y0.q.f11612a);
        if (obj == null) {
            obj = null;
        }
        List list = (List) obj;
        boolean z4 = ((list != null ? (String) C1403G.r(list) : null) == null && o(nVar) == null && n(nVar) == null && !m(nVar)) ? false : true;
        if (nVar.f11587d.f11577e) {
            return true;
        }
        return nVar.m() && z4;
    }

    public final void s(r0.E e4) {
        if (this.f10030w.add(e4)) {
            this.f10031x.o(Unit.f7487a);
        }
    }

    public final int w(int i2) {
        if (i2 == this.f10011d.getSemanticsOwner().a().f11590g) {
            return -1;
        }
        return i2;
    }

    public final void x(y0.n nVar, J0 j02) {
        int[] iArr = i.k.f6923a;
        i.r rVar = new i.r();
        List h4 = y0.n.h(nVar, true, 4);
        int size = h4.size();
        int i2 = 0;
        while (true) {
            r0.E e4 = nVar.f11586c;
            if (i2 >= size) {
                i.r rVar2 = j02.f10064b;
                int[] iArr2 = rVar2.f6947b;
                long[] jArr = rVar2.f6946a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j4 = jArr[i4];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j4 & 255) < 128 && !rVar.c(iArr2[(i4 << 3) + i6])) {
                                    s(e4);
                                    return;
                                }
                                j4 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                List h5 = y0.n.h(nVar, true, 4);
                int size2 = h5.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    y0.n nVar2 = (y0.n) h5.get(i7);
                    if (l().b(nVar2.f11590g)) {
                        Object f4 = this.f10005H.f(nVar2.f11590g);
                        Intrinsics.c(f4);
                        x(nVar2, (J0) f4);
                    }
                }
                return;
            }
            y0.n nVar3 = (y0.n) h4.get(i2);
            if (l().b(nVar3.f11590g)) {
                i.r rVar3 = j02.f10064b;
                int i8 = nVar3.f11590g;
                if (!rVar3.c(i8)) {
                    s(e4);
                    return;
                }
                rVar.a(i8);
            }
            i2++;
        }
    }

    public final boolean y(AccessibilityEvent accessibilityEvent) {
        if (!q()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f10023p = true;
        }
        try {
            return ((Boolean) this.f10013f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f10023p = false;
        }
    }

    public final boolean z(int i2, int i4, Integer num, List list) {
        if (i2 == Integer.MIN_VALUE || !q()) {
            return false;
        }
        AccessibilityEvent g4 = g(i2, i4);
        if (num != null) {
            g4.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            g4.setContentDescription(j0.c.x(list, ","));
        }
        Trace.beginSection("sendEvent");
        try {
            return y(g4);
        } finally {
            Trace.endSection();
        }
    }
}
