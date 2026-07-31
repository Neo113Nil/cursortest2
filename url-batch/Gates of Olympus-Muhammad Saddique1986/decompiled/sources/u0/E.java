package u0;

import C0.C0031g;
import a0.C0238c;
import a0.C0239d;
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
import c1.AbstractC0378b;
import com.gatesof.olympus.martu.marku.R;
import e2.InterfaceC0427f;
import h2.AbstractC0508a;
import j.AbstractC0534h;
import j.AbstractC0535i;
import j.AbstractC0536j;
import j.C0525G;
import j.C0532f;
import j.C0540n;
import j.C0541o;
import j.C0542p;
import j.C0543q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import q2.AbstractC0837y;
import s2.C0969c;
import z.C1256t;

/* loaded from: classes.dex */
public final class E extends AbstractC0378b {

    /* renamed from: N, reason: collision with root package name */
    public static final C0541o f9139N;

    /* renamed from: A, reason: collision with root package name */
    public C0542p f9140A;

    /* renamed from: B, reason: collision with root package name */
    public final C0543q f9141B;
    public final C0540n C;
    public final C0540n D;

    /* renamed from: E, reason: collision with root package name */
    public final String f9142E;

    /* renamed from: F, reason: collision with root package name */
    public final String f9143F;

    /* renamed from: G, reason: collision with root package name */
    public final G1.m f9144G;

    /* renamed from: H, reason: collision with root package name */
    public final C0542p f9145H;

    /* renamed from: I, reason: collision with root package name */
    public I0 f9146I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f9147J;

    /* renamed from: K, reason: collision with root package name */
    public final E.t f9148K;

    /* renamed from: L, reason: collision with root package name */
    public final ArrayList f9149L;

    /* renamed from: M, reason: collision with root package name */
    public final C1085B f9150M;

    /* renamed from: d, reason: collision with root package name */
    public final C1123s f9151d;

    /* renamed from: e, reason: collision with root package name */
    public int f9152e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public final C1085B f9153f = new C1085B(this, 0);

    /* renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f9154g;

    /* renamed from: h, reason: collision with root package name */
    public long f9155h;

    /* renamed from: i, reason: collision with root package name */
    public final AccessibilityManagerAccessibilityStateChangeListenerC1125t f9156i;

    /* renamed from: j, reason: collision with root package name */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC1127u f9157j;

    /* renamed from: k, reason: collision with root package name */
    public List f9158k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f9159l;

    /* renamed from: m, reason: collision with root package name */
    public final C1256t f9160m;

    /* renamed from: n, reason: collision with root package name */
    public int f9161n;

    /* renamed from: o, reason: collision with root package name */
    public d1.h f9162o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9163p;

    /* renamed from: q, reason: collision with root package name */
    public final C0542p f9164q;

    /* renamed from: r, reason: collision with root package name */
    public final C0542p f9165r;

    /* renamed from: s, reason: collision with root package name */
    public final C0525G f9166s;

    /* renamed from: t, reason: collision with root package name */
    public final C0525G f9167t;

    /* renamed from: u, reason: collision with root package name */
    public int f9168u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f9169v;

    /* renamed from: w, reason: collision with root package name */
    public final C0532f f9170w;

    /* renamed from: x, reason: collision with root package name */
    public final s2.g f9171x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9172y;

    /* renamed from: z, reason: collision with root package name */
    public C1137z f9173z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i3 = AbstractC0534h.f6283a;
        C0541o c0541o = new C0541o(32);
        int i4 = c0541o.f6301b;
        if (i4 < 0) {
            StringBuilder k3 = A.k.k(i4, "Index ", " must be in 0..");
            k3.append(c0541o.f6301b);
            throw new IndexOutOfBoundsException(k3.toString());
        }
        int i5 = i4 + 32;
        c0541o.b(i5);
        int[] iArr2 = c0541o.f6300a;
        int i6 = c0541o.f6301b;
        if (i4 != i6) {
            S1.k.l0(iArr2, iArr2, i5, i4, i6);
        }
        S1.k.n0(iArr, iArr2, i4, 0, 12);
        c0541o.f6301b += 32;
        f9139N = c0541o;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [u0.t] */
    /* JADX WARN: Type inference failed for: r2v5, types: [u0.u] */
    public E(C1123s c1123s) {
        this.f9151d = c1123s;
        Object systemService = c1123s.getContext().getSystemService("accessibility");
        f2.j.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f9154g = accessibilityManager;
        this.f9155h = 100L;
        this.f9156i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: u0.t
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z3) {
                E e3 = E.this;
                e3.f9158k = z3 ? e3.f9154g.getEnabledAccessibilityServiceList(-1) : S1.u.f4320d;
            }
        };
        this.f9157j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: u0.u
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z3) {
                E e3 = E.this;
                e3.f9158k = e3.f9154g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f9158k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f9159l = new Handler(Looper.getMainLooper());
        this.f9160m = new C1256t(this);
        this.f9161n = Integer.MIN_VALUE;
        this.f9164q = new C0542p();
        this.f9165r = new C0542p();
        this.f9166s = new C0525G();
        this.f9167t = new C0525G();
        this.f9168u = -1;
        this.f9170w = new C0532f();
        this.f9171x = n.r.a(1, 6, null);
        this.f9172y = true;
        C0542p c0542p = AbstractC0535i.f6284a;
        f2.j.d(c0542p, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f9140A = c0542p;
        this.f9141B = new C0543q();
        this.C = new C0540n();
        this.D = new C0540n();
        this.f9142E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f9143F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f9144G = new G1.m(5);
        this.f9145H = new C0542p();
        A0.p a3 = c1123s.getSemanticsOwner().a();
        f2.j.d(c0542p, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f9146I = new I0(a3, c0542p);
        c1123s.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1129v(0, this));
        this.f9148K = new E.t(10, this);
        this.f9149L = new ArrayList();
        this.f9150M = new C1085B(this, 1);
    }

    public static /* synthetic */ void A(E e3, int i3, int i4, Integer num, int i5) {
        if ((i5 & 4) != 0) {
            num = null;
        }
        e3.z(i3, i4, num, null);
    }

    public static CharSequence I(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i3 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i3 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i3);
                f2.j.d(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    public static boolean m(A0.p pVar) {
        Object obj = pVar.f142d.f129d.get(A0.s.f162B);
        if (obj == null) {
            obj = null;
        }
        B0.a aVar = (B0.a) obj;
        A0.v vVar = A0.s.f184s;
        LinkedHashMap linkedHashMap = pVar.f142d.f129d;
        Object obj2 = linkedHashMap.get(vVar);
        if (obj2 == null) {
            obj2 = null;
        }
        A0.f fVar = (A0.f) obj2;
        boolean z3 = aVar != null;
        Object obj3 = linkedHashMap.get(A0.s.f161A);
        if (((Boolean) (obj3 != null ? obj3 : null)) != null) {
            return fVar != null ? A0.f.a(fVar.f98a, 4) : false ? z3 : true;
        }
        return z3;
    }

    public static C0031g o(A0.p pVar) {
        Object obj = pVar.f142d.f129d.get(A0.s.f189x);
        if (obj == null) {
            obj = null;
        }
        C0031g c0031g = (C0031g) obj;
        Object obj2 = pVar.f142d.f129d.get(A0.s.f186u);
        if (obj2 == null) {
            obj2 = null;
        }
        List list = (List) obj2;
        return c0031g == null ? list != null ? (C0031g) S1.l.L0(list) : null : c0031g;
    }

    public static String p(A0.p pVar) {
        C0031g c0031g;
        if (pVar == null) {
            return null;
        }
        A0.v vVar = A0.s.f166a;
        A0.i iVar = pVar.f142d;
        LinkedHashMap linkedHashMap = iVar.f129d;
        if (linkedHashMap.containsKey(vVar)) {
            return AbstractC0508a.z((List) iVar.b(vVar), ",");
        }
        A0.v vVar2 = A0.s.f189x;
        if (linkedHashMap.containsKey(vVar2)) {
            Object obj = linkedHashMap.get(vVar2);
            if (obj == null) {
                obj = null;
            }
            C0031g c0031g2 = (C0031g) obj;
            if (c0031g2 != null) {
                return c0031g2.f596a;
            }
            return null;
        }
        Object obj2 = linkedHashMap.get(A0.s.f186u);
        if (obj2 == null) {
            obj2 = null;
        }
        List list = (List) obj2;
        if (list == null || (c0031g = (C0031g) S1.l.L0(list)) == null) {
            return null;
        }
        return c0031g.f596a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [e2.a, f2.k] */
    /* JADX WARN: Type inference failed for: r3v2, types: [e2.a, f2.k] */
    public static final boolean t(A0.g gVar, float f3) {
        ?? r22 = gVar.f99a;
        return (f3 < 0.0f && ((Number) r22.b()).floatValue() > 0.0f) || (f3 > 0.0f && ((Number) r22.b()).floatValue() < ((Number) gVar.f100b.b()).floatValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e2.a, f2.k] */
    /* JADX WARN: Type inference failed for: r3v1, types: [e2.a, f2.k] */
    public static final boolean u(A0.g gVar) {
        ?? r02 = gVar.f99a;
        float floatValue = ((Number) r02.b()).floatValue();
        boolean z3 = gVar.f101c;
        return (floatValue > 0.0f && !z3) || (((Number) r02.b()).floatValue() < ((Number) gVar.f100b.b()).floatValue() && z3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e2.a, f2.k] */
    /* JADX WARN: Type inference failed for: r2v0, types: [e2.a, f2.k] */
    public static final boolean v(A0.g gVar) {
        ?? r02 = gVar.f99a;
        float floatValue = ((Number) r02.b()).floatValue();
        float floatValue2 = ((Number) gVar.f100b.b()).floatValue();
        boolean z3 = gVar.f101c;
        return (floatValue < floatValue2 && !z3) || (((Number) r02.b()).floatValue() > 0.0f && z3);
    }

    public final void B(int i3, int i4, String str) {
        AccessibilityEvent g3 = g(w(i3), 32);
        g3.setContentChangeTypes(i4);
        if (str != null) {
            g3.getText().add(str);
        }
        y(g3);
    }

    public final void C(int i3) {
        C1137z c1137z = this.f9173z;
        if (c1137z != null) {
            A0.p pVar = c1137z.f9557a;
            if (i3 != pVar.f145g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c1137z.f9562f <= 1000) {
                AccessibilityEvent g3 = g(w(pVar.f145g), 131072);
                g3.setFromIndex(c1137z.f9560d);
                g3.setToIndex(c1137z.f9561e);
                g3.setAction(c1137z.f9558b);
                g3.setMovementGranularity(c1137z.f9559c);
                g3.getText().add(p(pVar));
                y(g3);
            }
        }
        this.f9173z = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x05d3, code lost:
    
        if (r2 != null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x05d8, code lost:
    
        if (r2 == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0541, code lost:
    
        if (r2.containsAll(r3) != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0544, code lost:
    
        r21 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x05db, code lost:
    
        if (r1 != false) goto L221;
     */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(C0542p c0542p) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i6;
        int i7;
        int i8;
        H0 h02;
        boolean z3;
        A0.v vVar;
        A0.v vVar2;
        int i9;
        ArrayList arrayList3;
        int[] iArr3;
        long[] jArr3;
        int i10;
        I0 i02;
        int i11;
        A0.p pVar;
        char c2;
        int i12;
        char c3;
        char c4;
        I0 i03;
        int i13;
        AccessibilityEvent h3;
        String str;
        H0 h03;
        boolean z4;
        C0542p c0542p2 = c0542p;
        ArrayList arrayList4 = this.f9149L;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr4 = c0542p2.f6303b;
        long[] jArr4 = c0542p2.f6302a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j3 = jArr4[i14];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8;
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                long j4 = j3;
                int i17 = 0;
                while (i17 < i16) {
                    if ((j4 & 255) < 128) {
                        int i18 = iArr4[(i14 << 3) + i17];
                        I0 i04 = (I0) this.f9145H.f(i18);
                        if (i04 != null) {
                            J0 j02 = (J0) c0542p2.f(i18);
                            A0.p pVar2 = j02 != null ? j02.f9202a : null;
                            if (pVar2 == null) {
                                n.z0.p("no value for specified key");
                                throw null;
                            }
                            A0.i iVar = pVar2.f142d;
                            Iterator it = iVar.iterator();
                            boolean z5 = false;
                            while (true) {
                                boolean hasNext = it.hasNext();
                                A0.i iVar2 = i04.f9199a;
                                if (hasNext) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    Object key = entry.getKey();
                                    I0 i05 = i04;
                                    A0.v vVar3 = A0.s.f180o;
                                    if (f2.j.a(key, vVar3)) {
                                        i8 = i17;
                                    } else {
                                        i8 = i17;
                                        if (!f2.j.a(entry.getKey(), A0.s.f181p)) {
                                            z3 = false;
                                            LinkedHashMap linkedHashMap = iVar2.f129d;
                                            if (!z3) {
                                                Object value = entry.getValue();
                                                Object obj = linkedHashMap.get((A0.v) entry.getKey());
                                                if (obj == null) {
                                                    obj = null;
                                                }
                                                if (f2.j.a(value, obj)) {
                                                    i9 = i18;
                                                    arrayList3 = arrayList5;
                                                    iArr3 = iArr4;
                                                    jArr3 = jArr4;
                                                    i10 = length;
                                                    i02 = i05;
                                                    i11 = i8;
                                                    c2 = '\b';
                                                    pVar = pVar2;
                                                    i12 = i16;
                                                    i16 = i12;
                                                    pVar2 = pVar;
                                                    i18 = i9;
                                                    i04 = i02;
                                                    i17 = i11;
                                                    arrayList5 = arrayList3;
                                                    iArr4 = iArr3;
                                                    jArr4 = jArr3;
                                                    length = i10;
                                                }
                                            }
                                            vVar = (A0.v) entry.getKey();
                                            vVar2 = A0.s.f169d;
                                            if (f2.j.a(vVar, vVar2)) {
                                                if (f2.j.a(vVar, A0.s.f167b) ? true : f2.j.a(vVar, A0.s.f162B)) {
                                                    A(this, w(i18), 2048, 64, 8);
                                                    A(this, w(i18), 2048, 0, 8);
                                                    arrayList3 = arrayList5;
                                                    iArr3 = iArr4;
                                                    jArr3 = jArr4;
                                                    i10 = length;
                                                    c2 = '\b';
                                                    i02 = i05;
                                                    i11 = i8;
                                                    pVar = pVar2;
                                                    i9 = i18;
                                                } else {
                                                    int i19 = i16;
                                                    if (f2.j.a(vVar, A0.s.f168c)) {
                                                        A(this, w(i18), 2048, 64, 8);
                                                        A(this, w(i18), 2048, 0, 8);
                                                        arrayList3 = arrayList5;
                                                        iArr3 = iArr4;
                                                        jArr3 = jArr4;
                                                        i10 = length;
                                                        c2 = '\b';
                                                        i02 = i05;
                                                        i11 = i8;
                                                        pVar = pVar2;
                                                        i9 = i18;
                                                    } else {
                                                        A0.v vVar4 = A0.s.f161A;
                                                        boolean a3 = f2.j.a(vVar, vVar4);
                                                        t0.E e3 = pVar2.f141c;
                                                        arrayList3 = arrayList5;
                                                        LinkedHashMap linkedHashMap2 = iVar.f129d;
                                                        iArr3 = iArr4;
                                                        if (a3) {
                                                            Object obj2 = linkedHashMap2.get(A0.s.f184s);
                                                            if (obj2 == null) {
                                                                obj2 = null;
                                                            }
                                                            A0.f fVar = (A0.f) obj2;
                                                            if (fVar == null ? false : A0.f.a(fVar.f98a, 4)) {
                                                                Object obj3 = linkedHashMap2.get(vVar4);
                                                                if (obj3 == null) {
                                                                    obj3 = null;
                                                                }
                                                                if (f2.j.a(obj3, Boolean.TRUE)) {
                                                                    AccessibilityEvent g3 = g(w(i18), 4);
                                                                    A0.p pVar3 = new A0.p(pVar2.f139a, true, e3, iVar);
                                                                    Object obj4 = pVar3.i().f129d.get(A0.s.f166a);
                                                                    if (obj4 == null) {
                                                                        obj4 = null;
                                                                    }
                                                                    List list = (List) obj4;
                                                                    String z6 = list != null ? AbstractC0508a.z(list, ",") : null;
                                                                    Object obj5 = pVar3.i().f129d.get(A0.s.f186u);
                                                                    if (obj5 == null) {
                                                                        obj5 = null;
                                                                    }
                                                                    List list2 = (List) obj5;
                                                                    String z7 = list2 != null ? AbstractC0508a.z(list2, ",") : null;
                                                                    if (z6 != null) {
                                                                        g3.setContentDescription(z6);
                                                                    }
                                                                    if (z7 != null) {
                                                                        g3.getText().add(z7);
                                                                    }
                                                                    y(g3);
                                                                    pVar = pVar2;
                                                                    i9 = i18;
                                                                    jArr3 = jArr4;
                                                                    i10 = length;
                                                                    i02 = i05;
                                                                    i11 = i8;
                                                                    i12 = i19;
                                                                    c2 = '\b';
                                                                } else {
                                                                    c3 = '\b';
                                                                    A(this, w(i18), 2048, 0, 8);
                                                                }
                                                            } else {
                                                                c3 = '\b';
                                                                A(this, w(i18), 2048, 64, 8);
                                                                A(this, w(i18), 2048, 0, 8);
                                                            }
                                                            pVar = pVar2;
                                                            i9 = i18;
                                                            jArr3 = jArr4;
                                                            i10 = length;
                                                            i02 = i05;
                                                            i11 = i8;
                                                            i12 = i19;
                                                            c2 = c3;
                                                        } else if (f2.j.a(vVar, A0.s.f166a)) {
                                                            int w2 = w(i18);
                                                            Object value2 = entry.getValue();
                                                            f2.j.d(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                            z(w2, 2048, 4, (List) value2);
                                                            pVar = pVar2;
                                                            i9 = i18;
                                                            jArr3 = jArr4;
                                                            i10 = length;
                                                            c2 = '\b';
                                                            i02 = i05;
                                                            i11 = i8;
                                                        } else {
                                                            A0.v vVar5 = A0.s.f189x;
                                                            String str2 = "";
                                                            if (f2.j.a(vVar, vVar5)) {
                                                                if (linkedHashMap2.containsKey(A0.h.f111i)) {
                                                                    Object obj6 = linkedHashMap.get(vVar5);
                                                                    if (obj6 == null) {
                                                                        obj6 = null;
                                                                    }
                                                                    C0031g c0031g = (C0031g) obj6;
                                                                    if (c0031g == null) {
                                                                        c0031g = "";
                                                                    }
                                                                    Object obj7 = linkedHashMap2.get(vVar5);
                                                                    if (obj7 == null) {
                                                                        obj7 = null;
                                                                    }
                                                                    CharSequence charSequence = (C0031g) obj7;
                                                                    if (charSequence == null) {
                                                                        charSequence = "";
                                                                    }
                                                                    CharSequence I3 = I(charSequence);
                                                                    int length2 = c0031g.length();
                                                                    int length3 = charSequence.length();
                                                                    int i20 = length2 > length3 ? length3 : length2;
                                                                    A0.p pVar4 = pVar2;
                                                                    int i21 = 0;
                                                                    while (true) {
                                                                        jArr3 = jArr4;
                                                                        if (i21 >= i20) {
                                                                            i10 = length;
                                                                            break;
                                                                        }
                                                                        i10 = length;
                                                                        if (c0031g.charAt(i21) != charSequence.charAt(i21)) {
                                                                            break;
                                                                        }
                                                                        i21++;
                                                                        jArr4 = jArr3;
                                                                        length = i10;
                                                                    }
                                                                    int i22 = 0;
                                                                    while (i22 < i20 - i21) {
                                                                        int i23 = i20;
                                                                        if (c0031g.charAt((length2 - 1) - i22) != charSequence.charAt((length3 - 1) - i22)) {
                                                                            break;
                                                                        }
                                                                        i22++;
                                                                        i20 = i23;
                                                                    }
                                                                    int i24 = (length2 - i22) - i21;
                                                                    int i25 = (length3 - i22) - i21;
                                                                    A0.v vVar6 = A0.s.C;
                                                                    boolean containsKey = linkedHashMap.containsKey(vVar6);
                                                                    boolean containsKey2 = linkedHashMap2.containsKey(vVar6);
                                                                    boolean containsKey3 = linkedHashMap.containsKey(A0.s.f189x);
                                                                    boolean z8 = containsKey3 && !containsKey && containsKey2;
                                                                    boolean z9 = containsKey3 && containsKey && !containsKey2;
                                                                    if (z8 || z9) {
                                                                        int w3 = w(i18);
                                                                        Integer valueOf = Integer.valueOf(length3);
                                                                        pVar = pVar4;
                                                                        i03 = i05;
                                                                        i9 = i18;
                                                                        i11 = i8;
                                                                        i13 = i19;
                                                                        c4 = '\b';
                                                                        h3 = h(w3, 0, 0, valueOf, I3);
                                                                    } else {
                                                                        h3 = g(w(i18), 16);
                                                                        h3.setFromIndex(i21);
                                                                        h3.setRemovedCount(i24);
                                                                        h3.setAddedCount(i25);
                                                                        h3.setBeforeText(c0031g);
                                                                        h3.getText().add(I3);
                                                                        i9 = i18;
                                                                        c4 = '\b';
                                                                        i03 = i05;
                                                                        i11 = i8;
                                                                        i13 = i19;
                                                                        pVar = pVar4;
                                                                    }
                                                                    h3.setClassName("android.widget.EditText");
                                                                    y(h3);
                                                                    if (z8 || z9) {
                                                                        long j5 = ((C0.J) iVar.b(A0.s.f190y)).f569a;
                                                                        h3.setFromIndex((int) (j5 >> 32));
                                                                        h3.setToIndex((int) (j5 & 4294967295L));
                                                                        y(h3);
                                                                    }
                                                                } else {
                                                                    pVar = pVar2;
                                                                    i9 = i18;
                                                                    jArr3 = jArr4;
                                                                    i10 = length;
                                                                    c4 = '\b';
                                                                    i03 = i05;
                                                                    i11 = i8;
                                                                    i13 = i19;
                                                                    A(this, w(i9), 2048, 2, 8);
                                                                }
                                                                i12 = i13;
                                                                i02 = i03;
                                                                c2 = c4;
                                                            } else {
                                                                pVar = pVar2;
                                                                i9 = i18;
                                                                jArr3 = jArr4;
                                                                i10 = length;
                                                                i11 = i8;
                                                                i12 = i19;
                                                                A0.v vVar7 = A0.s.f190y;
                                                                boolean a4 = f2.j.a(vVar, vVar7);
                                                                int i26 = pVar.f145g;
                                                                if (a4) {
                                                                    Object obj8 = linkedHashMap2.get(vVar5);
                                                                    if (obj8 == null) {
                                                                        obj8 = null;
                                                                    }
                                                                    C0031g c0031g2 = (C0031g) obj8;
                                                                    if (c0031g2 != null && (str = c0031g2.f596a) != null) {
                                                                        str2 = str;
                                                                    }
                                                                    C0.J j6 = (C0.J) iVar.b(vVar7);
                                                                    int w4 = w(i9);
                                                                    long j7 = j6.f569a;
                                                                    i02 = i05;
                                                                    c2 = '\b';
                                                                    y(h(w4, Integer.valueOf((int) (j7 >> 32)), Integer.valueOf((int) (j7 & 4294967295L)), Integer.valueOf(str2.length()), I(str2)));
                                                                    C(i26);
                                                                    i12 = i12;
                                                                } else {
                                                                    i02 = i05;
                                                                    c2 = '\b';
                                                                    if (f2.j.a(vVar, vVar3) ? true : f2.j.a(vVar, A0.s.f181p)) {
                                                                        s(e3);
                                                                        int size = arrayList4.size();
                                                                        int i27 = 0;
                                                                        while (true) {
                                                                            if (i27 >= size) {
                                                                                h03 = null;
                                                                                break;
                                                                            } else {
                                                                                if (((H0) arrayList4.get(i27)).f9192d == i9) {
                                                                                    h03 = (H0) arrayList4.get(i27);
                                                                                    break;
                                                                                }
                                                                                i27++;
                                                                            }
                                                                        }
                                                                        f2.j.c(h03);
                                                                        Object obj9 = linkedHashMap2.get(vVar3);
                                                                        if (obj9 == null) {
                                                                            obj9 = null;
                                                                        }
                                                                        h03.f9196h = (A0.g) obj9;
                                                                        Object obj10 = linkedHashMap2.get(A0.s.f181p);
                                                                        if (obj10 == null) {
                                                                            obj10 = null;
                                                                        }
                                                                        h03.f9197i = (A0.g) obj10;
                                                                        if (h03.f9193e.contains(h03)) {
                                                                            this.f9151d.getSnapshotObserver().a(h03, this.f9150M, new B.f0(h03, 12, this));
                                                                        }
                                                                    } else if (f2.j.a(vVar, A0.s.f176k)) {
                                                                        Object value3 = entry.getValue();
                                                                        f2.j.d(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                                                        if (((Boolean) value3).booleanValue()) {
                                                                            y(g(w(i26), 8));
                                                                        }
                                                                        A(this, w(i26), 2048, 0, 8);
                                                                    } else {
                                                                        A0.v vVar8 = A0.h.f124v;
                                                                        if (f2.j.a(vVar, vVar8)) {
                                                                            List list3 = (List) iVar.b(vVar8);
                                                                            Object obj11 = linkedHashMap.get(vVar8);
                                                                            if (obj11 == null) {
                                                                                obj11 = null;
                                                                            }
                                                                            List list4 = (List) obj11;
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
                                                                                z5 = true;
                                                                            } else if (!list3.isEmpty()) {
                                                                                i16 = i12;
                                                                                pVar2 = pVar;
                                                                                i18 = i9;
                                                                                i04 = i02;
                                                                                i17 = i11;
                                                                                arrayList5 = arrayList3;
                                                                                iArr4 = iArr3;
                                                                                jArr4 = jArr3;
                                                                                length = i10;
                                                                                z5 = true;
                                                                            }
                                                                        } else {
                                                                            if (entry.getValue() instanceof A0.a) {
                                                                                Object value4 = entry.getValue();
                                                                                f2.j.d(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                                                A0.a aVar = (A0.a) value4;
                                                                                Object obj12 = linkedHashMap.get((A0.v) entry.getKey());
                                                                                if (obj12 == null) {
                                                                                    obj12 = null;
                                                                                }
                                                                                if (aVar != obj12) {
                                                                                    if (obj12 instanceof A0.a) {
                                                                                        A0.a aVar2 = (A0.a) obj12;
                                                                                        if (f2.j.a(aVar.f88a, aVar2.f88a)) {
                                                                                            R1.e eVar = aVar2.f89b;
                                                                                            R1.e eVar2 = aVar.f89b;
                                                                                            if (eVar2 == null) {
                                                                                            }
                                                                                            if (eVar2 != null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z4 = false;
                                                                                }
                                                                                z4 = true;
                                                                            }
                                                                            z5 = true;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i16 = i12;
                                                        pVar2 = pVar;
                                                        i18 = i9;
                                                        i04 = i02;
                                                        i17 = i11;
                                                        arrayList5 = arrayList3;
                                                        iArr4 = iArr3;
                                                        jArr4 = jArr3;
                                                        length = i10;
                                                    }
                                                    i12 = i19;
                                                    i16 = i12;
                                                    pVar2 = pVar;
                                                    i18 = i9;
                                                    i04 = i02;
                                                    i17 = i11;
                                                    arrayList5 = arrayList3;
                                                    iArr4 = iArr3;
                                                    jArr4 = jArr3;
                                                    length = i10;
                                                }
                                            } else {
                                                Object value5 = entry.getValue();
                                                f2.j.d(value5, "null cannot be cast to non-null type kotlin.String");
                                                String str3 = (String) value5;
                                                if (linkedHashMap.containsKey(vVar2)) {
                                                    B(i18, 8, str3);
                                                    i9 = i18;
                                                    arrayList3 = arrayList5;
                                                    iArr3 = iArr4;
                                                    jArr3 = jArr4;
                                                    i10 = length;
                                                    i02 = i05;
                                                    i11 = i8;
                                                    pVar = pVar2;
                                                    c2 = '\b';
                                                }
                                                i9 = i18;
                                                arrayList3 = arrayList5;
                                                iArr3 = iArr4;
                                                jArr3 = jArr4;
                                                i10 = length;
                                                i02 = i05;
                                                i11 = i8;
                                                c2 = '\b';
                                                pVar = pVar2;
                                            }
                                            i12 = i16;
                                            i16 = i12;
                                            pVar2 = pVar;
                                            i18 = i9;
                                            i04 = i02;
                                            i17 = i11;
                                            arrayList5 = arrayList3;
                                            iArr4 = iArr3;
                                            jArr4 = jArr3;
                                            length = i10;
                                        }
                                    }
                                    int size2 = arrayList5.size();
                                    int i28 = 0;
                                    while (true) {
                                        if (i28 >= size2) {
                                            h02 = null;
                                            break;
                                        }
                                        int i29 = size2;
                                        if (((H0) arrayList5.get(i28)).f9192d == i18) {
                                            h02 = (H0) arrayList5.get(i28);
                                            break;
                                        } else {
                                            i28++;
                                            size2 = i29;
                                        }
                                    }
                                    if (h02 != null) {
                                        z3 = false;
                                    } else {
                                        h02 = new H0(i18, arrayList4);
                                        z3 = true;
                                    }
                                    arrayList4.add(h02);
                                    LinkedHashMap linkedHashMap3 = iVar2.f129d;
                                    if (!z3) {
                                    }
                                    vVar = (A0.v) entry.getKey();
                                    vVar2 = A0.s.f169d;
                                    if (f2.j.a(vVar, vVar2)) {
                                    }
                                    i12 = i16;
                                    i16 = i12;
                                    pVar2 = pVar;
                                    i18 = i9;
                                    i04 = i02;
                                    i17 = i11;
                                    arrayList5 = arrayList3;
                                    iArr4 = iArr3;
                                    jArr4 = jArr3;
                                    length = i10;
                                } else {
                                    int i30 = i18;
                                    i4 = i17;
                                    arrayList2 = arrayList5;
                                    iArr2 = iArr4;
                                    jArr2 = jArr4;
                                    i6 = length;
                                    i7 = 8;
                                    A0.p pVar5 = pVar2;
                                    i5 = i16;
                                    if (!z5) {
                                        Iterator it2 = iVar2.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                z5 = false;
                                                break;
                                            }
                                            if (!pVar5.i().f129d.containsKey((A0.v) ((Map.Entry) it2.next()).getKey())) {
                                                z5 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (z5) {
                                        A(this, w(i30), 2048, 0, 8);
                                    }
                                }
                            }
                        }
                    }
                    i4 = i17;
                    i5 = i16;
                    arrayList2 = arrayList5;
                    iArr2 = iArr4;
                    jArr2 = jArr4;
                    i6 = length;
                    i7 = i15;
                    j4 >>= i7;
                    i17 = i4 + 1;
                    c0542p2 = c0542p;
                    i16 = i5;
                    i15 = i7;
                    arrayList5 = arrayList2;
                    iArr4 = iArr2;
                    jArr4 = jArr2;
                    length = i6;
                }
                arrayList = arrayList5;
                iArr = iArr4;
                jArr = jArr4;
                int i31 = length;
                if (i16 != i15) {
                    return;
                } else {
                    i3 = i31;
                }
            } else {
                arrayList = arrayList5;
                iArr = iArr4;
                jArr = jArr4;
                i3 = length;
            }
            if (i14 == i3) {
                return;
            }
            i14++;
            c0542p2 = c0542p;
            length = i3;
            arrayList5 = arrayList;
            iArr4 = iArr;
            jArr4 = jArr;
        }
    }

    public final void E(t0.E e3, C0543q c0543q) {
        A0.i o3;
        if (e3.D() && !this.f9151d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(e3)) {
            t0.E e4 = null;
            if (!e3.f8561y.f(8)) {
                e3 = e3.s();
                while (true) {
                    if (e3 == null) {
                        e3 = null;
                        break;
                    } else if (e3.f8561y.f(8)) {
                        break;
                    } else {
                        e3 = e3.s();
                    }
                }
            }
            if (e3 == null || (o3 = e3.o()) == null) {
                return;
            }
            if (!o3.f130e) {
                t0.E s3 = e3.s();
                while (true) {
                    if (s3 != null) {
                        A0.i o4 = s3.o();
                        if (o4 != null && o4.f130e) {
                            e4 = s3;
                            break;
                        }
                        s3 = s3.s();
                    } else {
                        break;
                    }
                }
                if (e4 != null) {
                    e3 = e4;
                }
            }
            int i3 = e3.f8541e;
            if (c0543q.a(i3)) {
                A(this, w(i3), 2048, 1, 8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [e2.a, f2.k] */
    /* JADX WARN: Type inference failed for: r0v18, types: [e2.a, f2.k] */
    /* JADX WARN: Type inference failed for: r0v8, types: [e2.a, f2.k] */
    /* JADX WARN: Type inference failed for: r2v1, types: [e2.a, f2.k] */
    public final void F(t0.E e3) {
        if (e3.D() && !this.f9151d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(e3)) {
            int i3 = e3.f8541e;
            A0.g gVar = (A0.g) this.f9164q.f(i3);
            A0.g gVar2 = (A0.g) this.f9165r.f(i3);
            if (gVar == null && gVar2 == null) {
                return;
            }
            AccessibilityEvent g3 = g(i3, 4096);
            if (gVar != null) {
                g3.setScrollX((int) ((Number) gVar.f99a.b()).floatValue());
                g3.setMaxScrollX((int) ((Number) gVar.f100b.b()).floatValue());
            }
            if (gVar2 != null) {
                g3.setScrollY((int) ((Number) gVar2.f99a.b()).floatValue());
                g3.setMaxScrollY((int) ((Number) gVar2.f100b.b()).floatValue());
            }
            y(g3);
        }
    }

    public final boolean G(A0.p pVar, int i3, int i4, boolean z3) {
        String p3;
        A0.i iVar = pVar.f142d;
        A0.v vVar = A0.h.f110h;
        if (iVar.f129d.containsKey(vVar) && L.l(pVar)) {
            InterfaceC0427f interfaceC0427f = (InterfaceC0427f) ((A0.a) pVar.f142d.b(vVar)).f89b;
            if (interfaceC0427f != null) {
                return ((Boolean) interfaceC0427f.g(Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(z3))).booleanValue();
            }
            return false;
        }
        if ((i3 == i4 && i4 == this.f9168u) || (p3 = p(pVar)) == null) {
            return false;
        }
        if (i3 < 0 || i3 != i4 || i4 > p3.length()) {
            i3 = -1;
        }
        this.f9168u = i3;
        boolean z4 = p3.length() > 0;
        int i5 = pVar.f145g;
        y(h(w(i5), z4 ? Integer.valueOf(this.f9168u) : null, z4 ? Integer.valueOf(this.f9168u) : null, z4 ? Integer.valueOf(p3.length()) : null, p3));
        C(i5);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce A[LOOP:1: B:8:0x002f->B:26:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1 A[EDGE_INSN: B:27:0x00d1->B:34:0x00d1 BREAK  A[LOOP:1: B:8:0x002f->B:26:0x00ce], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList H(boolean z3, ArrayList arrayList) {
        C0542p c0542p = AbstractC0535i.f6284a;
        C0542p c0542p2 = new C0542p();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            i((A0.p) arrayList.get(i3), arrayList2, c0542p2);
        }
        ArrayList arrayList3 = new ArrayList();
        int z02 = S1.m.z0(arrayList2);
        if (z02 >= 0) {
            int i4 = 0;
            while (true) {
                A0.p pVar = (A0.p) arrayList2.get(i4);
                if (i4 != 0) {
                    C0239d f3 = pVar.f();
                    C0239d f4 = pVar.f();
                    float f5 = f3.f4725b;
                    float f6 = f4.f4727d;
                    boolean z4 = f5 >= f6;
                    int z03 = S1.m.z0(arrayList3);
                    if (z03 >= 0) {
                        int i5 = 0;
                        while (true) {
                            C0239d c0239d = (C0239d) ((R1.i) arrayList3.get(i5)).f4150d;
                            float f7 = c0239d.f4725b;
                            float f8 = c0239d.f4727d;
                            boolean z5 = f7 >= f8;
                            if (!z4 && !z5 && Math.max(f5, f7) < Math.min(f6, f8)) {
                                arrayList3.set(i5, new R1.i(new C0239d(Math.max(c0239d.f4724a, 0.0f), Math.max(c0239d.f4725b, f5), Math.min(c0239d.f4726c, Float.POSITIVE_INFINITY), Math.min(f8, f6)), ((R1.i) arrayList3.get(i5)).f4151e));
                                ((List) ((R1.i) arrayList3.get(i5)).f4151e).add(pVar);
                                break;
                            }
                            if (i5 == z03) {
                                break;
                            }
                            i5++;
                        }
                        if (i4 != z02) {
                            break;
                        }
                        i4++;
                    }
                }
                arrayList3.add(new R1.i(pVar.f(), S1.m.C0(pVar)));
                if (i4 != z02) {
                }
            }
        }
        S1.q.F0(arrayList3, C1135y.f9553d);
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            R1.i iVar = (R1.i) arrayList3.get(i6);
            S1.q.F0((List) iVar.f4151e, new C1086C(new C1086C(z3 ? C1135y.f9552c : C1135y.f9551b)));
            arrayList4.addAll((Collection) iVar.f4151e);
        }
        S1.q.F0(arrayList4, new D0.u(4));
        int i7 = 0;
        while (i7 <= S1.m.z0(arrayList4)) {
            List list = (List) c0542p2.f(((A0.p) arrayList4.get(i7)).f145g);
            if (list != null) {
                if (r((A0.p) arrayList4.get(i7))) {
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

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0140, code lost:
    
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014e, code lost:
    
        if (((r0 & ((~r0) << 6)) & (-9187201950435737472L)) == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0150, code lost:
    
        r24 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        E e3;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int i3;
        int i4;
        int[] iArr2;
        int i5;
        int i6;
        C0543q c0543q = new C0543q();
        C0543q c0543q2 = this.f9141B;
        int[] iArr3 = c0543q2.f6309b;
        long[] jArr3 = c0543q2.f6308a;
        int length = jArr3.length - 2;
        C0542p c0542p = this.f9145H;
        char c2 = 7;
        long j3 = -9187201950435737472L;
        int i7 = 8;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j4 = jArr3[i8];
                if ((((~j4) << c2) & j4 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((j4 & 255) < 128) {
                            int i11 = iArr3[(i8 << 3) + i10];
                            J0 j02 = (J0) l().f(i11);
                            A0.p pVar = j02 != null ? j02.f9202a : null;
                            if (pVar != null) {
                                if (pVar.f142d.f129d.containsKey(A0.s.f169d)) {
                                }
                            }
                            c0543q.a(i11);
                            I0 i02 = (I0) c0542p.f(i11);
                            if (i02 != null) {
                                Object obj = i02.f9199a.f129d.get(A0.s.f169d);
                                r20 = obj != 0 ? obj : null;
                            }
                            B(i11, 32, r20);
                        }
                        j4 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                c2 = 7;
                j3 = -9187201950435737472L;
            }
        }
        int[] iArr4 = c0543q.f6309b;
        long[] jArr4 = c0543q.f6308a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i12 = 0;
            while (true) {
                long j5 = jArr4[i12];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j5 & 255) < 128) {
                            int i15 = iArr4[(i12 << 3) + i14];
                            int hashCode = Integer.hashCode(i15) * (-862048943);
                            int i16 = hashCode ^ (hashCode << 16);
                            int i17 = i16 & 127;
                            int i18 = c0543q2.f6310c;
                            int i19 = (i16 >>> 7) & i18;
                            int i20 = 0;
                            while (true) {
                                long[] jArr5 = c0543q2.f6308a;
                                int i21 = i19 >> 3;
                                jArr2 = jArr4;
                                int i22 = (i19 & 7) << 3;
                                long j6 = (jArr5[i21] >>> i22) | ((jArr5[i21 + 1] << (64 - i22)) & ((-i22) >> 63));
                                iArr2 = iArr4;
                                i3 = length2;
                                long j7 = (i17 * 72340172838076673L) ^ j6;
                                long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
                                while (true) {
                                    if (j8 == 0) {
                                        break;
                                    }
                                    i6 = (i19 + (Long.numberOfTrailingZeros(j8) >> 3)) & i18;
                                    int i23 = i17;
                                    if (c0543q2.f6309b[i6] == i15) {
                                        break;
                                    }
                                    j8 &= j8 - 1;
                                    i17 = i23;
                                }
                                i20 += 8;
                                i19 = (i19 + i20) & i18;
                                iArr4 = iArr2;
                                length2 = i3;
                                jArr4 = jArr2;
                                i17 = i5;
                            }
                            int i24 = i6;
                            if (i24 >= 0) {
                                c0543q2.f(i24);
                            }
                            i4 = 8;
                        } else {
                            jArr2 = jArr4;
                            i3 = length2;
                            i4 = i7;
                            iArr2 = iArr4;
                        }
                        j5 >>= i4;
                        i14++;
                        iArr4 = iArr2;
                        length2 = i3;
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
        c0542p.a();
        C0542p l3 = l();
        int[] iArr5 = l3.f6303b;
        Object[] objArr = l3.f6304c;
        long[] jArr6 = l3.f6302a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i27 = 0;
            while (true) {
                long j9 = jArr6[i27];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i28 = 8 - ((~(i27 - length3)) >>> 31);
                    for (int i29 = 0; i29 < i28; i29++) {
                        if ((j9 & 255) < 128) {
                            int i30 = (i27 << 3) + i29;
                            int i31 = iArr5[i30];
                            J0 j03 = (J0) objArr[i30];
                            A0.i iVar = j03.f9202a.f142d;
                            A0.v vVar = A0.s.f169d;
                            boolean containsKey = iVar.f129d.containsKey(vVar);
                            A0.p pVar2 = j03.f9202a;
                            if (containsKey && c0543q2.a(i31)) {
                                B(i31, 16, (String) pVar2.f142d.b(vVar));
                            }
                            c0542p.i(i31, new I0(pVar2, l()));
                        }
                        j9 >>= 8;
                    }
                    e3 = this;
                    if (i28 != 8) {
                        break;
                    }
                } else {
                    e3 = this;
                }
                if (i27 == length3) {
                    break;
                } else {
                    i27++;
                }
            }
        } else {
            e3 = this;
        }
        e3.f9146I = new I0(e3.f9151d.getSemanticsOwner().a(), l());
    }

    @Override // c1.AbstractC0378b
    public final C1256t a(View view) {
        return this.f9160m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i3, d1.h hVar, String str, Bundle bundle) {
        A0.p pVar;
        RectF rectF;
        J0 j02 = (J0) l().f(i3);
        if (j02 == null || (pVar = j02.f9202a) == null) {
            return;
        }
        String p3 = p(pVar);
        boolean a3 = f2.j.a(str, this.f9142E);
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f5672a;
        if (a3) {
            C0540n c0540n = this.C;
            int c2 = c0540n.c(i3);
            int i4 = c2 >= 0 ? c0540n.f6296c[c2] : -1;
            if (i4 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, i4);
                return;
            }
            return;
        }
        if (f2.j.a(str, this.f9143F)) {
            C0540n c0540n2 = this.D;
            int c3 = c0540n2.c(i3);
            int i5 = c3 >= 0 ? c0540n2.f6296c[c3] : -1;
            if (i5 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, i5);
                return;
            }
            return;
        }
        A0.v vVar = A0.h.f103a;
        A0.i iVar = pVar.f142d;
        LinkedHashMap linkedHashMap = iVar.f129d;
        t0.b0 b0Var = null;
        if (!linkedHashMap.containsKey(vVar) || bundle == null || !f2.j.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            A0.v vVar2 = A0.s.f185t;
            if (!linkedHashMap.containsKey(vVar2) || bundle == null || !f2.j.a(str, "androidx.compose.ui.semantics.testTag")) {
                if (f2.j.a(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, pVar.f145g);
                    return;
                }
                return;
            } else {
                Object obj = linkedHashMap.get(vVar2);
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
            if (i6 < (p3 != null ? p3.length() : Integer.MAX_VALUE)) {
                C0.H r3 = L.r(iVar);
                if (r3 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i8 = 0;
                while (i8 < i7) {
                    int i9 = i6 + i8;
                    if (i9 >= r3.f557a.f547a.f596a.length()) {
                        arrayList.add(b0Var);
                    } else {
                        C0239d b3 = r3.b(i9);
                        t0.b0 c4 = pVar.c();
                        long j3 = 0;
                        if (c4 != null) {
                            if (!c4.K0().f4501p) {
                                c4 = b0Var;
                            }
                            if (c4 != null) {
                                j3 = c4.N(0L);
                            }
                        }
                        C0239d h3 = b3.h(j3);
                        C0239d e3 = pVar.e();
                        C0239d d3 = h3.f(e3) ? h3.d(e3) : b0Var;
                        if (d3 != 0) {
                            long e4 = l0.c.e(d3.f4724a, d3.f4725b);
                            C1123s c1123s = this.f9151d;
                            long r4 = c1123s.r(e4);
                            long r5 = c1123s.r(l0.c.e(d3.f4726c, d3.f4727d));
                            rectF = new RectF(C0238c.d(r4), C0238c.e(r4), C0238c.d(r5), C0238c.e(r5));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i8++;
                    b0Var = null;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect c(J0 j02) {
        Rect rect = j02.f9203b;
        long e3 = l0.c.e(rect.left, rect.top);
        C1123s c1123s = this.f9151d;
        long r3 = c1123s.r(e3);
        long r4 = c1123s.r(l0.c.e(rect.right, rect.bottom));
        return new Rect((int) Math.floor(C0238c.d(r3)), (int) Math.floor(C0238c.e(r3)), (int) Math.ceil(C0238c.d(r4)), (int) Math.ceil(C0238c.e(r4)));
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
    public final Object d(X1.c cVar) {
        C1084A c1084a;
        int i3;
        E e3;
        C0543q c0543q;
        C0969c c0969c;
        C0543q c0543q2;
        C0969c c0969c2;
        Object b3;
        try {
            if (cVar instanceof C1084A) {
                c1084a = (C1084A) cVar;
                int i4 = c1084a.f9120l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c1084a.f9120l = i4 - Integer.MIN_VALUE;
                    Object obj = c1084a.f9118j;
                    W1.a aVar = W1.a.f4608d;
                    i3 = c1084a.f9120l;
                    if (i3 != 0) {
                        R1.a.e(obj);
                        try {
                            c0543q = new C0543q();
                            s2.g gVar = this.f9171x;
                            gVar.getClass();
                            c0969c = new C0969c(gVar);
                            e3 = this;
                            c1084a.f9115g = e3;
                            c1084a.f9116h = c0543q;
                            c1084a.f9117i = c0969c;
                            c1084a.f9120l = 1;
                            b3 = c0969c.b(c1084a);
                            if (b3 == aVar) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            e3 = this;
                            e3.f9170w.clear();
                            throw th;
                        }
                    } else if (i3 == 1) {
                        c0969c2 = c1084a.f9117i;
                        c0543q2 = c1084a.f9116h;
                        e3 = c1084a.f9115g;
                        R1.a.e(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0969c2 = c1084a.f9117i;
                        c0543q2 = c1084a.f9116h;
                        e3 = c1084a.f9115g;
                        R1.a.e(obj);
                        c0543q = c0543q2;
                        c0969c = c0969c2;
                        c1084a.f9115g = e3;
                        c1084a.f9116h = c0543q;
                        c1084a.f9117i = c0969c;
                        c1084a.f9120l = 1;
                        b3 = c0969c.b(c1084a);
                        if (b3 == aVar) {
                            return aVar;
                        }
                        C0969c c0969c3 = c0969c;
                        c0543q2 = c0543q;
                        obj = b3;
                        c0969c2 = c0969c3;
                        if (((Boolean) obj).booleanValue()) {
                            e3.f9170w.clear();
                            return R1.y.f4171a;
                        }
                        c0969c2.c();
                        boolean q3 = e3.q();
                        C0532f c0532f = e3.f9170w;
                        if (q3) {
                            int i5 = c0532f.f6281f;
                            for (int i6 = 0; i6 < i5; i6++) {
                                t0.E e4 = (t0.E) c0532f.f6280e[i6];
                                e3.E(e4, c0543q2);
                                e3.F(e4);
                            }
                            c0543q2.b();
                            if (!e3.f9147J) {
                                e3.f9147J = true;
                                e3.f9159l.post(e3.f9148K);
                            }
                            c0532f.clear();
                            e3.f9164q.a();
                            e3.f9165r.a();
                            long j3 = e3.f9155h;
                            c1084a.f9115g = e3;
                            c1084a.f9116h = c0543q2;
                            c1084a.f9117i = c0969c2;
                            c1084a.f9120l = 2;
                            if (AbstractC0837y.f(j3, c1084a) == aVar) {
                                return aVar;
                            }
                        }
                        c0543q = c0543q2;
                        c0969c = c0969c2;
                        c1084a.f9115g = e3;
                        c1084a.f9116h = c0543q;
                        c1084a.f9117i = c0969c;
                        c1084a.f9120l = 1;
                        b3 = c0969c.b(c1084a);
                        if (b3 == aVar) {
                        }
                    }
                }
            }
            if (i3 != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        c1084a = new C1084A(this, cVar);
        Object obj2 = c1084a.f9118j;
        W1.a aVar2 = W1.a.f4608d;
        i3 = c1084a.f9120l;
    }

    /* JADX WARN: Type inference failed for: r2v23, types: [e2.a, f2.k] */
    /* JADX WARN: Type inference failed for: r3v10, types: [e2.a, f2.k] */
    public final boolean e(boolean z3, int i3, long j3) {
        A0.v vVar;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int i4;
        int i5 = 0;
        if (!f2.j.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        C0542p l3 = l();
        if (!C0238c.b(j3, 9205357640488583168L) && C0238c.f(j3)) {
            if (z3) {
                vVar = A0.s.f181p;
            } else {
                if (z3) {
                    throw new C1.c();
                }
                vVar = A0.s.f180o;
            }
            Object[] objArr3 = l3.f6304c;
            long[] jArr3 = l3.f6302a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                boolean z4 = false;
                while (true) {
                    long j4 = jArr3[i6];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8;
                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                        int i9 = i5;
                        while (i9 < i8) {
                            if ((j4 & 255) < 128) {
                                J0 j02 = (J0) objArr3[(i6 << 3) + i9];
                                Rect rect = j02.f9203b;
                                jArr2 = jArr3;
                                objArr2 = objArr3;
                                if (C0238c.d(j3) >= ((float) rect.left) && C0238c.d(j3) < ((float) rect.right) && C0238c.e(j3) >= ((float) rect.top) && C0238c.e(j3) < ((float) rect.bottom)) {
                                    Object obj = j02.f9202a.f142d.f129d.get(vVar);
                                    if (obj == null) {
                                        obj = null;
                                    }
                                    A0.g gVar = (A0.g) obj;
                                    if (gVar != null) {
                                        boolean z5 = gVar.f101c;
                                        int i10 = z5 ? -i3 : i3;
                                        if (i3 == 0 && z5) {
                                            i10 = -1;
                                        }
                                        ?? r3 = gVar.f99a;
                                        if (i10 >= 0 ? ((Number) r3.b()).floatValue() < ((Number) gVar.f100b.b()).floatValue() : ((Number) r3.b()).floatValue() > 0.0f) {
                                            z4 = true;
                                        }
                                    }
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                objArr2 = objArr3;
                                i4 = i7;
                            }
                            j4 >>= i4;
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
                return z4;
            }
        }
        return false;
    }

    public final void f() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (q()) {
                x(this.f9151d.getSemanticsOwner().a(), this.f9146I);
            }
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
        } finally {
        }
    }

    public final AccessibilityEvent g(int i3, int i4) {
        J0 j02;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i4);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        C1123s c1123s = this.f9151d;
        obtain.setPackageName(c1123s.getContext().getPackageName());
        obtain.setSource(c1123s, i3);
        if (q() && (j02 = (J0) l().f(i3)) != null) {
            obtain.setPassword(j02.f9202a.f142d.f129d.containsKey(A0.s.C));
        }
        return obtain;
    }

    public final AccessibilityEvent h(int i3, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent g3 = g(i3, 8192);
        if (num != null) {
            g3.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            g3.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            g3.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            g3.getText().add(charSequence);
        }
        return g3;
    }

    public final void i(A0.p pVar, ArrayList arrayList, C0542p c0542p) {
        boolean m3 = L.m(pVar);
        Object obj = pVar.f142d.f129d.get(A0.s.f177l);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i3 = pVar.f145g;
        if ((booleanValue || r(pVar)) && l().c(i3)) {
            arrayList.add(pVar);
        }
        if (booleanValue) {
            c0542p.i(i3, H(m3, S1.l.b1(A0.p.h(pVar, false, 7))));
            return;
        }
        List h3 = A0.p.h(pVar, false, 7);
        int size = h3.size();
        for (int i4 = 0; i4 < size; i4++) {
            i((A0.p) h3.get(i4), arrayList, c0542p);
        }
    }

    public final int j(A0.p pVar) {
        A0.i iVar = pVar.f142d;
        if (!iVar.f129d.containsKey(A0.s.f166a)) {
            A0.v vVar = A0.s.f190y;
            A0.i iVar2 = pVar.f142d;
            if (iVar2.f129d.containsKey(vVar)) {
                return (int) (4294967295L & ((C0.J) iVar2.b(vVar)).f569a);
            }
        }
        return this.f9168u;
    }

    public final int k(A0.p pVar) {
        A0.i iVar = pVar.f142d;
        if (!iVar.f129d.containsKey(A0.s.f166a)) {
            A0.v vVar = A0.s.f190y;
            A0.i iVar2 = pVar.f142d;
            if (iVar2.f129d.containsKey(vVar)) {
                return (int) (((C0.J) iVar2.b(vVar)).f569a >> 32);
            }
        }
        return this.f9168u;
    }

    public final C0542p l() {
        if (this.f9172y) {
            this.f9172y = false;
            this.f9140A = L.p(this.f9151d.getSemanticsOwner());
            if (q()) {
                C0540n c0540n = this.C;
                c0540n.a();
                C0540n c0540n2 = this.D;
                c0540n2.a();
                J0 j02 = (J0) l().f(-1);
                A0.p pVar = j02 != null ? j02.f9202a : null;
                f2.j.c(pVar);
                ArrayList H3 = H(L.m(pVar), S1.m.C0(pVar));
                int z02 = S1.m.z0(H3);
                int i3 = 1;
                if (1 <= z02) {
                    while (true) {
                        int i4 = ((A0.p) H3.get(i3 - 1)).f145g;
                        int i5 = ((A0.p) H3.get(i3)).f145g;
                        c0540n.f(i4, i5);
                        c0540n2.f(i5, i4);
                        if (i3 == z02) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return this.f9140A;
    }

    public final String n(A0.p pVar) {
        Object obj = pVar.f142d.f129d.get(A0.s.f167b);
        String str = null;
        if (obj == null) {
            obj = null;
        }
        A0.v vVar = A0.s.f162B;
        A0.i iVar = pVar.f142d;
        LinkedHashMap linkedHashMap = iVar.f129d;
        Object obj2 = linkedHashMap.get(vVar);
        if (obj2 == null) {
            obj2 = null;
        }
        B0.a aVar = (B0.a) obj2;
        Object obj3 = linkedHashMap.get(A0.s.f184s);
        if (obj3 == null) {
            obj3 = null;
        }
        A0.f fVar = (A0.f) obj3;
        C1123s c1123s = this.f9151d;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                if ((fVar == null ? false : A0.f.a(fVar.f98a, 2)) && obj == null) {
                    obj = c1123s.getContext().getResources().getString(R.string.state_on);
                }
            } else if (ordinal == 1) {
                if ((fVar == null ? false : A0.f.a(fVar.f98a, 2)) && obj == null) {
                    obj = c1123s.getContext().getResources().getString(R.string.state_off);
                }
            } else if (ordinal == 2 && obj == null) {
                obj = c1123s.getContext().getResources().getString(R.string.indeterminate);
            }
        }
        Object obj4 = linkedHashMap.get(A0.s.f161A);
        if (obj4 == null) {
            obj4 = null;
        }
        Boolean bool = (Boolean) obj4;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!(fVar == null ? false : A0.f.a(fVar.f98a, 4)) && obj == null) {
                obj = booleanValue ? c1123s.getContext().getResources().getString(R.string.selected) : c1123s.getContext().getResources().getString(R.string.not_selected);
            }
        }
        Object obj5 = linkedHashMap.get(A0.s.f168c);
        if (obj5 == null) {
            obj5 = null;
        }
        A0.e eVar = (A0.e) obj5;
        if (eVar != null) {
            if (eVar != A0.e.f95c) {
                if (obj == null) {
                    obj = c1123s.getContext().getResources().getString(R.string.template_percent, 0);
                }
            } else if (obj == null) {
                obj = c1123s.getContext().getResources().getString(R.string.in_progress);
            }
        }
        A0.v vVar2 = A0.s.f189x;
        if (linkedHashMap.containsKey(vVar2)) {
            A0.i i3 = new A0.p(pVar.f139a, true, pVar.f141c, iVar).i();
            A0.v vVar3 = A0.s.f166a;
            LinkedHashMap linkedHashMap2 = i3.f129d;
            Object obj6 = linkedHashMap2.get(vVar3);
            if (obj6 == null) {
                obj6 = null;
            }
            Collection collection = (Collection) obj6;
            if (collection == null || collection.isEmpty()) {
                Object obj7 = linkedHashMap2.get(A0.s.f186u);
                if (obj7 == null) {
                    obj7 = null;
                }
                Collection collection2 = (Collection) obj7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object obj8 = linkedHashMap2.get(vVar2);
                    if (obj8 == null) {
                        obj8 = null;
                    }
                    CharSequence charSequence = (CharSequence) obj8;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = c1123s.getContext().getResources().getString(R.string.state_empty);
                    }
                }
            }
            obj = str;
        }
        return (String) obj;
    }

    public final boolean q() {
        return this.f9154g.isEnabled() && !this.f9158k.isEmpty();
    }

    public final boolean r(A0.p pVar) {
        Object obj = pVar.f142d.f129d.get(A0.s.f166a);
        if (obj == null) {
            obj = null;
        }
        List list = (List) obj;
        boolean z3 = ((list != null ? (String) S1.l.L0(list) : null) == null && o(pVar) == null && n(pVar) == null && !m(pVar)) ? false : true;
        if (pVar.f142d.f130e) {
            return true;
        }
        return pVar.m() && z3;
    }

    public final void s(t0.E e3) {
        if (this.f9170w.add(e3)) {
            this.f9171x.p(R1.y.f4171a);
        }
    }

    public final int w(int i3) {
        if (i3 == this.f9151d.getSemanticsOwner().a().f145g) {
            return -1;
        }
        return i3;
    }

    public final void x(A0.p pVar, I0 i02) {
        int[] iArr = AbstractC0536j.f6285a;
        C0543q c0543q = new C0543q();
        List h3 = A0.p.h(pVar, true, 4);
        int size = h3.size();
        int i3 = 0;
        while (true) {
            t0.E e3 = pVar.f141c;
            if (i3 >= size) {
                C0543q c0543q2 = i02.f9200b;
                int[] iArr2 = c0543q2.f6309b;
                long[] jArr = c0543q2.f6308a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j3 = jArr[i4];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j3 & 255) < 128 && !c0543q.c(iArr2[(i4 << 3) + i6])) {
                                    s(e3);
                                    return;
                                }
                                j3 >>= 8;
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
                List h4 = A0.p.h(pVar, true, 4);
                int size2 = h4.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    A0.p pVar2 = (A0.p) h4.get(i7);
                    if (l().b(pVar2.f145g)) {
                        Object f3 = this.f9145H.f(pVar2.f145g);
                        f2.j.c(f3);
                        x(pVar2, (I0) f3);
                    }
                }
                return;
            }
            A0.p pVar3 = (A0.p) h3.get(i3);
            if (l().b(pVar3.f145g)) {
                C0543q c0543q3 = i02.f9200b;
                int i8 = pVar3.f145g;
                if (!c0543q3.c(i8)) {
                    s(e3);
                    return;
                }
                c0543q.a(i8);
            }
            i3++;
        }
    }

    public final boolean y(AccessibilityEvent accessibilityEvent) {
        if (!q()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f9163p = true;
        }
        try {
            return ((Boolean) this.f9153f.n(accessibilityEvent)).booleanValue();
        } finally {
            this.f9163p = false;
        }
    }

    public final boolean z(int i3, int i4, Integer num, List list) {
        if (i3 == Integer.MIN_VALUE || !q()) {
            return false;
        }
        AccessibilityEvent g3 = g(i3, i4);
        if (num != null) {
            g3.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            g3.setContentDescription(AbstractC0508a.z(list, ","));
        }
        Trace.beginSection("sendEvent");
        try {
            return y(g3);
        } finally {
            Trace.endSection();
        }
    }
}
