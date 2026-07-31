package u0;

import B0.C0004a;
import B0.C0007d;
import D1.C0014b;
import H2.AbstractC0080b;
import I.C0125v0;
import a.AbstractC0157a;
import a1.AbstractC0164b;
import android.graphics.Rect;
import android.graphics.RectF;
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
import com.gates.olympus.miruv.R;
import e2.AbstractC0381e;
import e2.C0377a;
import j.AbstractC0490h;
import j.AbstractC0491i;
import j.AbstractC0492j;
import j.C0481G;
import j.C0488f;
import j.C0496n;
import j.C0497o;
import j.C0498p;
import j.C0499q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import k2.AbstractC0552y;
import m2.C0628c;
import z0.C1076a;

/* renamed from: u0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0959F extends AbstractC0164b {

    /* renamed from: N, reason: collision with root package name */
    public static final C0497o f8125N;

    /* renamed from: A, reason: collision with root package name */
    public C0498p f8126A;
    public final C0499q B;
    public final C0496n C;
    public final C0496n D;

    /* renamed from: E, reason: collision with root package name */
    public final String f8127E;

    /* renamed from: F, reason: collision with root package name */
    public final String f8128F;

    /* renamed from: G, reason: collision with root package name */
    public final C0014b f8129G;

    /* renamed from: H, reason: collision with root package name */
    public final C0498p f8130H;

    /* renamed from: I, reason: collision with root package name */
    public C1008y0 f8131I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f8132J;

    /* renamed from: K, reason: collision with root package name */
    public final E.u f8133K;

    /* renamed from: L, reason: collision with root package name */
    public final ArrayList f8134L;

    /* renamed from: M, reason: collision with root package name */
    public final C0956C f8135M;

    /* renamed from: d, reason: collision with root package name */
    public final C0997t f8136d;

    /* renamed from: e, reason: collision with root package name */
    public int f8137e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public final C0956C f8138f = new C0956C(this, 0);

    /* renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f8139g;

    /* renamed from: h, reason: collision with root package name */
    public long f8140h;

    /* renamed from: i, reason: collision with root package name */
    public final AccessibilityManagerAccessibilityStateChangeListenerC0999u f8141i;

    /* renamed from: j, reason: collision with root package name */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC1001v f8142j;

    /* renamed from: k, reason: collision with root package name */
    public List f8143k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f8144l;

    /* renamed from: m, reason: collision with root package name */
    public final C2.c f8145m;

    /* renamed from: n, reason: collision with root package name */
    public int f8146n;

    /* renamed from: o, reason: collision with root package name */
    public b1.h f8147o;
    public boolean p;

    /* renamed from: q, reason: collision with root package name */
    public final C0498p f8148q;

    /* renamed from: r, reason: collision with root package name */
    public final C0498p f8149r;

    /* renamed from: s, reason: collision with root package name */
    public final C0481G f8150s;

    /* renamed from: t, reason: collision with root package name */
    public final C0481G f8151t;

    /* renamed from: u, reason: collision with root package name */
    public int f8152u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f8153v;

    /* renamed from: w, reason: collision with root package name */
    public final C0488f f8154w;

    /* renamed from: x, reason: collision with root package name */
    public final m2.e f8155x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8156y;

    /* renamed from: z, reason: collision with root package name */
    public C0954A f8157z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i3 = AbstractC0490h.f5165a;
        C0497o c0497o = new C0497o(32);
        int i4 = c0497o.f5183b;
        if (i4 < 0) {
            StringBuilder l3 = AbstractC0080b.l("Index ", i4, " must be in 0..");
            l3.append(c0497o.f5183b);
            throw new IndexOutOfBoundsException(l3.toString());
        }
        int i5 = i4 + 32;
        int[] iArr2 = c0497o.f5182a;
        if (iArr2.length < i5) {
            int[] copyOf = Arrays.copyOf(iArr2, Math.max(i5, (iArr2.length * 3) / 2));
            Z1.i.e(copyOf, "copyOf(this, newSize)");
            c0497o.f5182a = copyOf;
        }
        int[] iArr3 = c0497o.f5182a;
        int i6 = c0497o.f5183b;
        if (i4 != i6) {
            M1.k.W(iArr3, iArr3, i5, i4, i6);
        }
        M1.k.Y(iArr, iArr3, i4, 0, 12);
        c0497o.f5183b += 32;
        f8125N = c0497o;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [u0.u] */
    /* JADX WARN: Type inference failed for: r2v5, types: [u0.v] */
    public C0959F(C0997t c0997t) {
        this.f8136d = c0997t;
        Object systemService = c0997t.getContext().getSystemService("accessibility");
        Z1.i.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f8139g = accessibilityManager;
        this.f8140h = 100L;
        this.f8141i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: u0.u
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z3) {
                C0959F c0959f = C0959F.this;
                c0959f.f8143k = z3 ? c0959f.f8139g.getEnabledAccessibilityServiceList(-1) : M1.u.f2803d;
            }
        };
        this.f8142j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: u0.v
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z3) {
                C0959F c0959f = C0959F.this;
                c0959f.f8143k = c0959f.f8139g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f8143k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f8144l = new Handler(Looper.getMainLooper());
        this.f8145m = new C2.c(this);
        this.f8146n = Integer.MIN_VALUE;
        this.f8148q = new C0498p();
        this.f8149r = new C0498p();
        this.f8150s = new C0481G();
        this.f8151t = new C0481G();
        this.f8152u = -1;
        this.f8154w = new C0488f();
        this.f8155x = m2.l.a(1, 6, null);
        this.f8156y = true;
        C0498p c0498p = AbstractC0491i.f5166a;
        Z1.i.d(c0498p, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f8126A = c0498p;
        this.B = new C0499q();
        this.C = new C0496n();
        this.D = new C0496n();
        this.f8127E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f8128F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f8129G = new C0014b(4);
        this.f8130H = new C0498p();
        z0.n a3 = c0997t.getSemanticsOwner().a();
        Z1.i.d(c0498p, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f8131I = new C1008y0(a3, c0498p);
        c0997t.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1003w(0, this));
        this.f8133K = new E.u(9, this);
        this.f8134L = new ArrayList();
        this.f8135M = new C0956C(this, 1);
    }

    public static /* synthetic */ void A(C0959F c0959f, int i3, int i4, Integer num, int i5) {
        if ((i5 & 4) != 0) {
            num = null;
        }
        c0959f.z(i3, i4, num, null);
    }

    public static CharSequence I(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i3 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i3 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i3);
                Z1.i.d(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    public static boolean m(z0.n nVar) {
        Object obj = nVar.f8991d.f8982d.get(z0.q.f9034z);
        if (obj == null) {
            obj = null;
        }
        A0.a aVar = (A0.a) obj;
        z0.t tVar = z0.q.f9026r;
        LinkedHashMap linkedHashMap = nVar.f8991d.f8982d;
        Object obj2 = linkedHashMap.get(tVar);
        if (obj2 == null) {
            obj2 = null;
        }
        z0.f fVar = (z0.f) obj2;
        boolean z3 = aVar != null;
        Object obj3 = linkedHashMap.get(z0.q.f9033y);
        if (((Boolean) (obj3 != null ? obj3 : null)) != null) {
            return fVar != null ? z0.f.a(fVar.f8953a, 4) : false ? z3 : true;
        }
        return z3;
    }

    public static C0007d o(z0.n nVar) {
        Object obj = nVar.f8991d.f8982d.get(z0.q.f9031w);
        if (obj == null) {
            obj = null;
        }
        C0007d c0007d = (C0007d) obj;
        Object obj2 = nVar.f8991d.f8982d.get(z0.q.f9028t);
        if (obj2 == null) {
            obj2 = null;
        }
        List list = (List) obj2;
        return c0007d == null ? list != null ? (C0007d) M1.l.n0(list) : null : c0007d;
    }

    public static String p(z0.n nVar) {
        C0007d c0007d;
        if (nVar == null) {
            return null;
        }
        z0.t tVar = z0.q.f9010a;
        z0.i iVar = nVar.f8991d;
        LinkedHashMap linkedHashMap = iVar.f8982d;
        if (linkedHashMap.containsKey(tVar)) {
            return I2.d.w((List) iVar.c(tVar), ",");
        }
        z0.t tVar2 = z0.q.f9031w;
        if (linkedHashMap.containsKey(tVar2)) {
            Object obj = linkedHashMap.get(tVar2);
            if (obj == null) {
                obj = null;
            }
            C0007d c0007d2 = (C0007d) obj;
            if (c0007d2 != null) {
                return c0007d2.f251a;
            }
            return null;
        }
        Object obj2 = linkedHashMap.get(z0.q.f9028t);
        if (obj2 == null) {
            obj2 = null;
        }
        List list = (List) obj2;
        if (list == null || (c0007d = (C0007d) M1.l.n0(list)) == null) {
            return null;
        }
        return c0007d.f251a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y1.a, Z1.j] */
    /* JADX WARN: Type inference failed for: r3v2, types: [Y1.a, Z1.j] */
    public static final boolean t(z0.g gVar, float f3) {
        ?? r22 = gVar.f8954a;
        return (f3 < 0.0f && ((Number) r22.b()).floatValue() > 0.0f) || (f3 > 0.0f && ((Number) r22.b()).floatValue() < ((Number) gVar.f8955b.b()).floatValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y1.a, Z1.j] */
    /* JADX WARN: Type inference failed for: r3v1, types: [Y1.a, Z1.j] */
    public static final boolean u(z0.g gVar) {
        ?? r02 = gVar.f8954a;
        float floatValue = ((Number) r02.b()).floatValue();
        boolean z3 = gVar.f8956c;
        return (floatValue > 0.0f && !z3) || (((Number) r02.b()).floatValue() < ((Number) gVar.f8955b.b()).floatValue() && z3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y1.a, Z1.j] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Y1.a, Z1.j] */
    public static final boolean v(z0.g gVar) {
        ?? r02 = gVar.f8954a;
        float floatValue = ((Number) r02.b()).floatValue();
        float floatValue2 = ((Number) gVar.f8955b.b()).floatValue();
        boolean z3 = gVar.f8956c;
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
        C0954A c0954a = this.f8157z;
        if (c0954a != null) {
            z0.n nVar = c0954a.f8104a;
            if (i3 != nVar.f8994g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c0954a.f8109f <= 1000) {
                AccessibilityEvent g3 = g(w(nVar.f8994g), 131072);
                g3.setFromIndex(c0954a.f8107d);
                g3.setToIndex(c0954a.f8108e);
                g3.setAction(c0954a.f8105b);
                g3.setMovementGranularity(c0954a.f8106c);
                g3.getText().add(p(nVar));
                y(g3);
            }
        }
        this.f8157z = null;
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
    public final void D(C0498p c0498p) {
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
        C1006x0 c1006x0;
        boolean z3;
        z0.t tVar;
        z0.t tVar2;
        int i9;
        ArrayList arrayList3;
        int[] iArr3;
        long[] jArr3;
        int i10;
        C1008y0 c1008y0;
        int i11;
        z0.n nVar;
        char c3;
        int i12;
        char c4;
        char c5;
        C1008y0 c1008y02;
        int i13;
        AccessibilityEvent h3;
        String str;
        C1006x0 c1006x02;
        boolean z4;
        C0498p c0498p2 = c0498p;
        ArrayList arrayList4 = this.f8134L;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr4 = c0498p2.f5185b;
        long[] jArr4 = c0498p2.f5184a;
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
                        C1008y0 c1008y03 = (C1008y0) this.f8130H.f(i18);
                        if (c1008y03 != null) {
                            C1010z0 c1010z0 = (C1010z0) c0498p2.f(i18);
                            z0.n nVar2 = c1010z0 != null ? c1010z0.f8507a : null;
                            if (nVar2 == null) {
                                AbstractC0381e.O("no value for specified key");
                                throw null;
                            }
                            z0.i iVar = nVar2.f8991d;
                            Iterator it = iVar.iterator();
                            boolean z5 = false;
                            while (true) {
                                boolean hasNext = it.hasNext();
                                z0.i iVar2 = c1008y03.f8501a;
                                if (hasNext) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    Object key = entry.getKey();
                                    C1008y0 c1008y04 = c1008y03;
                                    z0.t tVar3 = z0.q.f9024o;
                                    if (Z1.i.a(key, tVar3)) {
                                        i8 = i17;
                                    } else {
                                        i8 = i17;
                                        if (!Z1.i.a(entry.getKey(), z0.q.p)) {
                                            z3 = false;
                                            LinkedHashMap linkedHashMap = iVar2.f8982d;
                                            if (!z3) {
                                                Object value = entry.getValue();
                                                Object obj = linkedHashMap.get((z0.t) entry.getKey());
                                                if (obj == null) {
                                                    obj = null;
                                                }
                                                if (Z1.i.a(value, obj)) {
                                                    i9 = i18;
                                                    arrayList3 = arrayList5;
                                                    iArr3 = iArr4;
                                                    jArr3 = jArr4;
                                                    i10 = length;
                                                    c1008y0 = c1008y04;
                                                    i11 = i8;
                                                    c3 = '\b';
                                                    nVar = nVar2;
                                                    i12 = i16;
                                                    i16 = i12;
                                                    nVar2 = nVar;
                                                    i18 = i9;
                                                    c1008y03 = c1008y0;
                                                    i17 = i11;
                                                    arrayList5 = arrayList3;
                                                    iArr4 = iArr3;
                                                    jArr4 = jArr3;
                                                    length = i10;
                                                }
                                            }
                                            tVar = (z0.t) entry.getKey();
                                            tVar2 = z0.q.f9013d;
                                            if (Z1.i.a(tVar, tVar2)) {
                                                if (Z1.i.a(tVar, z0.q.f9011b) ? true : Z1.i.a(tVar, z0.q.f9034z)) {
                                                    A(this, w(i18), 2048, 64, 8);
                                                    A(this, w(i18), 2048, 0, 8);
                                                    arrayList3 = arrayList5;
                                                    iArr3 = iArr4;
                                                    jArr3 = jArr4;
                                                    i10 = length;
                                                    c3 = '\b';
                                                    c1008y0 = c1008y04;
                                                    i11 = i8;
                                                    nVar = nVar2;
                                                    i9 = i18;
                                                } else {
                                                    int i19 = i16;
                                                    if (Z1.i.a(tVar, z0.q.f9012c)) {
                                                        A(this, w(i18), 2048, 64, 8);
                                                        A(this, w(i18), 2048, 0, 8);
                                                        arrayList3 = arrayList5;
                                                        iArr3 = iArr4;
                                                        jArr3 = jArr4;
                                                        i10 = length;
                                                        c3 = '\b';
                                                        c1008y0 = c1008y04;
                                                        i11 = i8;
                                                        nVar = nVar2;
                                                        i9 = i18;
                                                    } else {
                                                        z0.t tVar4 = z0.q.f9033y;
                                                        boolean a3 = Z1.i.a(tVar, tVar4);
                                                        t0.D d3 = nVar2.f8990c;
                                                        arrayList3 = arrayList5;
                                                        LinkedHashMap linkedHashMap2 = iVar.f8982d;
                                                        iArr3 = iArr4;
                                                        if (a3) {
                                                            Object obj2 = linkedHashMap2.get(z0.q.f9026r);
                                                            if (obj2 == null) {
                                                                obj2 = null;
                                                            }
                                                            z0.f fVar = (z0.f) obj2;
                                                            if (fVar == null ? false : z0.f.a(fVar.f8953a, 4)) {
                                                                Object obj3 = linkedHashMap2.get(tVar4);
                                                                if (obj3 == null) {
                                                                    obj3 = null;
                                                                }
                                                                if (Z1.i.a(obj3, Boolean.TRUE)) {
                                                                    AccessibilityEvent g3 = g(w(i18), 4);
                                                                    z0.n nVar3 = new z0.n(nVar2.f8988a, true, d3, iVar);
                                                                    Object obj4 = nVar3.i().f8982d.get(z0.q.f9010a);
                                                                    if (obj4 == null) {
                                                                        obj4 = null;
                                                                    }
                                                                    List list = (List) obj4;
                                                                    String w3 = list != null ? I2.d.w(list, ",") : null;
                                                                    Object obj5 = nVar3.i().f8982d.get(z0.q.f9028t);
                                                                    if (obj5 == null) {
                                                                        obj5 = null;
                                                                    }
                                                                    List list2 = (List) obj5;
                                                                    String w4 = list2 != null ? I2.d.w(list2, ",") : null;
                                                                    if (w3 != null) {
                                                                        g3.setContentDescription(w3);
                                                                    }
                                                                    if (w4 != null) {
                                                                        g3.getText().add(w4);
                                                                    }
                                                                    y(g3);
                                                                    nVar = nVar2;
                                                                    i9 = i18;
                                                                    jArr3 = jArr4;
                                                                    i10 = length;
                                                                    c1008y0 = c1008y04;
                                                                    i11 = i8;
                                                                    i12 = i19;
                                                                    c3 = '\b';
                                                                } else {
                                                                    c4 = '\b';
                                                                    A(this, w(i18), 2048, 0, 8);
                                                                }
                                                            } else {
                                                                c4 = '\b';
                                                                A(this, w(i18), 2048, 64, 8);
                                                                A(this, w(i18), 2048, 0, 8);
                                                            }
                                                            nVar = nVar2;
                                                            i9 = i18;
                                                            jArr3 = jArr4;
                                                            i10 = length;
                                                            c1008y0 = c1008y04;
                                                            i11 = i8;
                                                            i12 = i19;
                                                            c3 = c4;
                                                        } else if (Z1.i.a(tVar, z0.q.f9010a)) {
                                                            int w5 = w(i18);
                                                            Object value2 = entry.getValue();
                                                            Z1.i.d(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                            z(w5, 2048, 4, (List) value2);
                                                            nVar = nVar2;
                                                            i9 = i18;
                                                            jArr3 = jArr4;
                                                            i10 = length;
                                                            c3 = '\b';
                                                            c1008y0 = c1008y04;
                                                            i11 = i8;
                                                        } else {
                                                            z0.t tVar5 = z0.q.f9031w;
                                                            String str2 = "";
                                                            if (Z1.i.a(tVar, tVar5)) {
                                                                if (linkedHashMap2.containsKey(z0.h.f8965i)) {
                                                                    Object obj6 = linkedHashMap.get(tVar5);
                                                                    if (obj6 == null) {
                                                                        obj6 = null;
                                                                    }
                                                                    C0007d c0007d = (C0007d) obj6;
                                                                    if (c0007d == null) {
                                                                        c0007d = "";
                                                                    }
                                                                    Object obj7 = linkedHashMap2.get(tVar5);
                                                                    if (obj7 == null) {
                                                                        obj7 = null;
                                                                    }
                                                                    CharSequence charSequence = (C0007d) obj7;
                                                                    if (charSequence == null) {
                                                                        charSequence = "";
                                                                    }
                                                                    CharSequence I3 = I(charSequence);
                                                                    int length2 = c0007d.length();
                                                                    int length3 = charSequence.length();
                                                                    int i20 = length2 > length3 ? length3 : length2;
                                                                    z0.n nVar4 = nVar2;
                                                                    int i21 = 0;
                                                                    while (true) {
                                                                        jArr3 = jArr4;
                                                                        if (i21 >= i20) {
                                                                            i10 = length;
                                                                            break;
                                                                        }
                                                                        i10 = length;
                                                                        if (c0007d.charAt(i21) != charSequence.charAt(i21)) {
                                                                            break;
                                                                        }
                                                                        i21++;
                                                                        jArr4 = jArr3;
                                                                        length = i10;
                                                                    }
                                                                    int i22 = 0;
                                                                    while (i22 < i20 - i21) {
                                                                        int i23 = i20;
                                                                        if (c0007d.charAt((length2 - 1) - i22) != charSequence.charAt((length3 - 1) - i22)) {
                                                                            break;
                                                                        }
                                                                        i22++;
                                                                        i20 = i23;
                                                                    }
                                                                    int i24 = (length2 - i22) - i21;
                                                                    int i25 = (length3 - i22) - i21;
                                                                    z0.t tVar6 = z0.q.f9008A;
                                                                    boolean containsKey = linkedHashMap.containsKey(tVar6);
                                                                    boolean containsKey2 = linkedHashMap2.containsKey(tVar6);
                                                                    boolean containsKey3 = linkedHashMap.containsKey(z0.q.f9031w);
                                                                    boolean z6 = containsKey3 && !containsKey && containsKey2;
                                                                    boolean z7 = containsKey3 && containsKey && !containsKey2;
                                                                    if (z6 || z7) {
                                                                        int w6 = w(i18);
                                                                        Integer valueOf = Integer.valueOf(length3);
                                                                        nVar = nVar4;
                                                                        c1008y02 = c1008y04;
                                                                        i9 = i18;
                                                                        i11 = i8;
                                                                        i13 = i19;
                                                                        c5 = '\b';
                                                                        h3 = h(w6, 0, 0, valueOf, I3);
                                                                    } else {
                                                                        h3 = g(w(i18), 16);
                                                                        h3.setFromIndex(i21);
                                                                        h3.setRemovedCount(i24);
                                                                        h3.setAddedCount(i25);
                                                                        h3.setBeforeText(c0007d);
                                                                        h3.getText().add(I3);
                                                                        i9 = i18;
                                                                        c5 = '\b';
                                                                        c1008y02 = c1008y04;
                                                                        i11 = i8;
                                                                        i13 = i19;
                                                                        nVar = nVar4;
                                                                    }
                                                                    h3.setClassName("android.widget.EditText");
                                                                    y(h3);
                                                                    if (z6 || z7) {
                                                                        long j5 = ((B0.B) iVar.c(z0.q.f9032x)).f233a;
                                                                        h3.setFromIndex((int) (j5 >> 32));
                                                                        h3.setToIndex((int) (j5 & 4294967295L));
                                                                        y(h3);
                                                                    }
                                                                } else {
                                                                    nVar = nVar2;
                                                                    i9 = i18;
                                                                    jArr3 = jArr4;
                                                                    i10 = length;
                                                                    c5 = '\b';
                                                                    c1008y02 = c1008y04;
                                                                    i11 = i8;
                                                                    i13 = i19;
                                                                    A(this, w(i9), 2048, 2, 8);
                                                                }
                                                                i12 = i13;
                                                                c1008y0 = c1008y02;
                                                                c3 = c5;
                                                            } else {
                                                                nVar = nVar2;
                                                                i9 = i18;
                                                                jArr3 = jArr4;
                                                                i10 = length;
                                                                i11 = i8;
                                                                i12 = i19;
                                                                z0.t tVar7 = z0.q.f9032x;
                                                                boolean a4 = Z1.i.a(tVar, tVar7);
                                                                int i26 = nVar.f8994g;
                                                                if (a4) {
                                                                    Object obj8 = linkedHashMap2.get(tVar5);
                                                                    if (obj8 == null) {
                                                                        obj8 = null;
                                                                    }
                                                                    C0007d c0007d2 = (C0007d) obj8;
                                                                    if (c0007d2 != null && (str = c0007d2.f251a) != null) {
                                                                        str2 = str;
                                                                    }
                                                                    B0.B b2 = (B0.B) iVar.c(tVar7);
                                                                    int w7 = w(i9);
                                                                    long j6 = b2.f233a;
                                                                    c1008y0 = c1008y04;
                                                                    c3 = '\b';
                                                                    y(h(w7, Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str2.length()), I(str2)));
                                                                    C(i26);
                                                                    i12 = i12;
                                                                } else {
                                                                    c1008y0 = c1008y04;
                                                                    c3 = '\b';
                                                                    if (Z1.i.a(tVar, tVar3) ? true : Z1.i.a(tVar, z0.q.p)) {
                                                                        s(d3);
                                                                        int size = arrayList4.size();
                                                                        int i27 = 0;
                                                                        while (true) {
                                                                            if (i27 >= size) {
                                                                                c1006x02 = null;
                                                                                break;
                                                                            } else {
                                                                                if (((C1006x0) arrayList4.get(i27)).f8495d == i9) {
                                                                                    c1006x02 = (C1006x0) arrayList4.get(i27);
                                                                                    break;
                                                                                }
                                                                                i27++;
                                                                            }
                                                                        }
                                                                        Z1.i.c(c1006x02);
                                                                        Object obj9 = linkedHashMap2.get(tVar3);
                                                                        if (obj9 == null) {
                                                                            obj9 = null;
                                                                        }
                                                                        c1006x02.f8499h = (z0.g) obj9;
                                                                        Object obj10 = linkedHashMap2.get(z0.q.p);
                                                                        if (obj10 == null) {
                                                                            obj10 = null;
                                                                        }
                                                                        c1006x02.f8500i = (z0.g) obj10;
                                                                        if (c1006x02.f8496e.contains(c1006x02)) {
                                                                            this.f8136d.getSnapshotObserver().a(c1006x02, this.f8135M, new C0125v0(c1006x02, 12, this));
                                                                        }
                                                                    } else if (Z1.i.a(tVar, z0.q.f9020k)) {
                                                                        Object value3 = entry.getValue();
                                                                        Z1.i.d(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                                                        if (((Boolean) value3).booleanValue()) {
                                                                            y(g(w(i26), 8));
                                                                        }
                                                                        A(this, w(i26), 2048, 0, 8);
                                                                    } else {
                                                                        z0.t tVar8 = z0.h.f8976u;
                                                                        if (Z1.i.a(tVar, tVar8)) {
                                                                            List list3 = (List) iVar.c(tVar8);
                                                                            Object obj11 = linkedHashMap.get(tVar8);
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
                                                                                nVar2 = nVar;
                                                                                i18 = i9;
                                                                                c1008y03 = c1008y0;
                                                                                i17 = i11;
                                                                                arrayList5 = arrayList3;
                                                                                iArr4 = iArr3;
                                                                                jArr4 = jArr3;
                                                                                length = i10;
                                                                                z5 = true;
                                                                            }
                                                                        } else {
                                                                            if (entry.getValue() instanceof C1076a) {
                                                                                Object value4 = entry.getValue();
                                                                                Z1.i.d(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                                                C1076a c1076a = (C1076a) value4;
                                                                                Object obj12 = linkedHashMap.get((z0.t) entry.getKey());
                                                                                if (obj12 == null) {
                                                                                    obj12 = null;
                                                                                }
                                                                                if (c1076a != obj12) {
                                                                                    if (obj12 instanceof C1076a) {
                                                                                        C1076a c1076a2 = (C1076a) obj12;
                                                                                        if (Z1.i.a(c1076a.f8942a, c1076a2.f8942a)) {
                                                                                            L1.e eVar = c1076a2.f8943b;
                                                                                            L1.e eVar2 = c1076a.f8943b;
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
                                                        nVar2 = nVar;
                                                        i18 = i9;
                                                        c1008y03 = c1008y0;
                                                        i17 = i11;
                                                        arrayList5 = arrayList3;
                                                        iArr4 = iArr3;
                                                        jArr4 = jArr3;
                                                        length = i10;
                                                    }
                                                    i12 = i19;
                                                    i16 = i12;
                                                    nVar2 = nVar;
                                                    i18 = i9;
                                                    c1008y03 = c1008y0;
                                                    i17 = i11;
                                                    arrayList5 = arrayList3;
                                                    iArr4 = iArr3;
                                                    jArr4 = jArr3;
                                                    length = i10;
                                                }
                                            } else {
                                                Object value5 = entry.getValue();
                                                Z1.i.d(value5, "null cannot be cast to non-null type kotlin.String");
                                                String str3 = (String) value5;
                                                if (linkedHashMap.containsKey(tVar2)) {
                                                    B(i18, 8, str3);
                                                    i9 = i18;
                                                    arrayList3 = arrayList5;
                                                    iArr3 = iArr4;
                                                    jArr3 = jArr4;
                                                    i10 = length;
                                                    c1008y0 = c1008y04;
                                                    i11 = i8;
                                                    nVar = nVar2;
                                                    c3 = '\b';
                                                }
                                                i9 = i18;
                                                arrayList3 = arrayList5;
                                                iArr3 = iArr4;
                                                jArr3 = jArr4;
                                                i10 = length;
                                                c1008y0 = c1008y04;
                                                i11 = i8;
                                                c3 = '\b';
                                                nVar = nVar2;
                                            }
                                            i12 = i16;
                                            i16 = i12;
                                            nVar2 = nVar;
                                            i18 = i9;
                                            c1008y03 = c1008y0;
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
                                            c1006x0 = null;
                                            break;
                                        }
                                        int i29 = size2;
                                        if (((C1006x0) arrayList5.get(i28)).f8495d == i18) {
                                            c1006x0 = (C1006x0) arrayList5.get(i28);
                                            break;
                                        } else {
                                            i28++;
                                            size2 = i29;
                                        }
                                    }
                                    if (c1006x0 != null) {
                                        z3 = false;
                                    } else {
                                        c1006x0 = new C1006x0(i18, arrayList4);
                                        z3 = true;
                                    }
                                    arrayList4.add(c1006x0);
                                    LinkedHashMap linkedHashMap3 = iVar2.f8982d;
                                    if (!z3) {
                                    }
                                    tVar = (z0.t) entry.getKey();
                                    tVar2 = z0.q.f9013d;
                                    if (Z1.i.a(tVar, tVar2)) {
                                    }
                                    i12 = i16;
                                    i16 = i12;
                                    nVar2 = nVar;
                                    i18 = i9;
                                    c1008y03 = c1008y0;
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
                                    z0.n nVar5 = nVar2;
                                    i5 = i16;
                                    if (!z5) {
                                        Iterator it2 = iVar2.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                z5 = false;
                                                break;
                                            }
                                            if (!nVar5.i().f8982d.containsKey((z0.t) ((Map.Entry) it2.next()).getKey())) {
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
                    c0498p2 = c0498p;
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
            c0498p2 = c0498p;
            length = i3;
            arrayList5 = arrayList;
            iArr4 = iArr;
            jArr4 = jArr;
        }
    }

    public final void E(t0.D d3, C0499q c0499q) {
        z0.i n3;
        if (d3.B() && !this.f8136d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(d3)) {
            t0.D d4 = null;
            if (!d3.f7735x.f(8)) {
                d3 = d3.q();
                while (true) {
                    if (d3 == null) {
                        d3 = null;
                        break;
                    } else if (d3.f7735x.f(8)) {
                        break;
                    } else {
                        d3 = d3.q();
                    }
                }
            }
            if (d3 == null || (n3 = d3.n()) == null) {
                return;
            }
            if (!n3.f8983e) {
                t0.D q2 = d3.q();
                while (true) {
                    if (q2 != null) {
                        z0.i n4 = q2.n();
                        if (n4 != null && n4.f8983e) {
                            d4 = q2;
                            break;
                        }
                        q2 = q2.q();
                    } else {
                        break;
                    }
                }
                if (d4 != null) {
                    d3 = d4;
                }
            }
            int i3 = d3.f7717e;
            if (c0499q.a(i3)) {
                A(this, w(i3), 2048, 1, 8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [Y1.a, Z1.j] */
    /* JADX WARN: Type inference failed for: r0v18, types: [Y1.a, Z1.j] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Y1.a, Z1.j] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Y1.a, Z1.j] */
    public final void F(t0.D d3) {
        if (d3.B() && !this.f8136d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(d3)) {
            int i3 = d3.f7717e;
            z0.g gVar = (z0.g) this.f8148q.f(i3);
            z0.g gVar2 = (z0.g) this.f8149r.f(i3);
            if (gVar == null && gVar2 == null) {
                return;
            }
            AccessibilityEvent g3 = g(i3, 4096);
            if (gVar != null) {
                g3.setScrollX((int) ((Number) gVar.f8954a.b()).floatValue());
                g3.setMaxScrollX((int) ((Number) gVar.f8955b.b()).floatValue());
            }
            if (gVar2 != null) {
                g3.setScrollY((int) ((Number) gVar2.f8954a.b()).floatValue());
                g3.setMaxScrollY((int) ((Number) gVar2.f8955b.b()).floatValue());
            }
            y(g3);
        }
    }

    public final boolean G(z0.n nVar, int i3, int i4, boolean z3) {
        String p;
        z0.i iVar = nVar.f8991d;
        z0.t tVar = z0.h.f8964h;
        if (iVar.f8982d.containsKey(tVar) && L.h(nVar)) {
            Y1.f fVar = (Y1.f) ((C1076a) nVar.f8991d.c(tVar)).f8943b;
            if (fVar != null) {
                return ((Boolean) fVar.f(Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(z3))).booleanValue();
            }
            return false;
        }
        if ((i3 == i4 && i4 == this.f8152u) || (p = p(nVar)) == null) {
            return false;
        }
        if (i3 < 0 || i3 != i4 || i4 > p.length()) {
            i3 = -1;
        }
        this.f8152u = i3;
        boolean z4 = p.length() > 0;
        int i5 = nVar.f8994g;
        y(h(w(i5), z4 ? Integer.valueOf(this.f8152u) : null, z4 ? Integer.valueOf(this.f8152u) : null, z4 ? Integer.valueOf(p.length()) : null, p));
        C(i5);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce A[LOOP:1: B:8:0x002f->B:26:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1 A[EDGE_INSN: B:27:0x00d1->B:34:0x00d1 BREAK  A[LOOP:1: B:8:0x002f->B:26:0x00ce], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList H(boolean z3, ArrayList arrayList) {
        C0498p c0498p = AbstractC0491i.f5166a;
        C0498p c0498p2 = new C0498p();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            i((z0.n) arrayList.get(i3), arrayList2, c0498p2);
        }
        ArrayList arrayList3 = new ArrayList();
        int b02 = M1.m.b0(arrayList2);
        if (b02 >= 0) {
            int i4 = 0;
            while (true) {
                z0.n nVar = (z0.n) arrayList2.get(i4);
                if (i4 != 0) {
                    a0.d f3 = nVar.f();
                    a0.d f4 = nVar.f();
                    float f5 = f3.f3492b;
                    float f6 = f4.f3494d;
                    boolean z4 = f5 >= f6;
                    int b03 = M1.m.b0(arrayList3);
                    if (b03 >= 0) {
                        int i5 = 0;
                        while (true) {
                            a0.d dVar = (a0.d) ((L1.j) arrayList3.get(i5)).f2708d;
                            float f7 = dVar.f3492b;
                            float f8 = dVar.f3494d;
                            boolean z5 = f7 >= f8;
                            if (!z4 && !z5 && Math.max(f5, f7) < Math.min(f6, f8)) {
                                arrayList3.set(i5, new L1.j(new a0.d(Math.max(dVar.f3491a, 0.0f), Math.max(dVar.f3492b, f5), Math.min(dVar.f3493c, Float.POSITIVE_INFINITY), Math.min(f8, f6)), ((L1.j) arrayList3.get(i5)).f2709e));
                                ((List) ((L1.j) arrayList3.get(i5)).f2709e).add(nVar);
                                break;
                            }
                            if (i5 == b03) {
                                break;
                            }
                            i5++;
                        }
                        if (i4 != b02) {
                            break;
                        }
                        i4++;
                    }
                }
                arrayList3.add(new L1.j(nVar.f(), M1.m.e0(nVar)));
                if (i4 != b02) {
                }
            }
        }
        M1.q.h0(arrayList3, C1009z.f8505d);
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            L1.j jVar = (L1.j) arrayList3.get(i6);
            M1.q.h0((List) jVar.f2709e, new C0957D(new C0957D(z3 ? C1009z.f8504c : C1009z.f8503b)));
            arrayList4.addAll((Collection) jVar.f2709e);
        }
        M1.q.h0(arrayList4, new C0.q(4));
        int i7 = 0;
        while (i7 <= M1.m.b0(arrayList4)) {
            List list = (List) c0498p2.f(((z0.n) arrayList4.get(i7)).f8994g);
            if (list != null) {
                if (r((z0.n) arrayList4.get(i7))) {
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
        C0959F c0959f;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int i3;
        int i4;
        int[] iArr2;
        int i5;
        int i6;
        C0499q c0499q = new C0499q();
        C0499q c0499q2 = this.B;
        int[] iArr3 = c0499q2.f5191b;
        long[] jArr3 = c0499q2.f5190a;
        int length = jArr3.length - 2;
        C0498p c0498p = this.f8130H;
        char c3 = 7;
        long j3 = -9187201950435737472L;
        int i7 = 8;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j4 = jArr3[i8];
                if ((((~j4) << c3) & j4 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((j4 & 255) < 128) {
                            int i11 = iArr3[(i8 << 3) + i10];
                            C1010z0 c1010z0 = (C1010z0) l().f(i11);
                            z0.n nVar = c1010z0 != null ? c1010z0.f8507a : null;
                            if (nVar != null) {
                                if (nVar.f8991d.f8982d.containsKey(z0.q.f9013d)) {
                                }
                            }
                            c0499q.a(i11);
                            C1008y0 c1008y0 = (C1008y0) c0498p.f(i11);
                            if (c1008y0 != null) {
                                Object obj = c1008y0.f8501a.f8982d.get(z0.q.f9013d);
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
                c3 = 7;
                j3 = -9187201950435737472L;
            }
        }
        int[] iArr4 = c0499q.f5191b;
        long[] jArr4 = c0499q.f5190a;
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
                            int i18 = c0499q2.f5192c;
                            int i19 = (i16 >>> 7) & i18;
                            int i20 = 0;
                            while (true) {
                                long[] jArr5 = c0499q2.f5190a;
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
                                    if (c0499q2.f5191b[i6] == i15) {
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
                                c0499q2.f(i24);
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
        c0498p.a();
        C0498p l3 = l();
        int[] iArr5 = l3.f5185b;
        Object[] objArr = l3.f5186c;
        long[] jArr6 = l3.f5184a;
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
                            C1010z0 c1010z02 = (C1010z0) objArr[i30];
                            z0.i iVar = c1010z02.f8507a.f8991d;
                            z0.t tVar = z0.q.f9013d;
                            boolean containsKey = iVar.f8982d.containsKey(tVar);
                            z0.n nVar2 = c1010z02.f8507a;
                            if (containsKey && c0499q2.a(i31)) {
                                B(i31, 16, (String) nVar2.f8991d.c(tVar));
                            }
                            c0498p.i(i31, new C1008y0(nVar2, l()));
                        }
                        j9 >>= 8;
                    }
                    c0959f = this;
                    if (i28 != 8) {
                        break;
                    }
                } else {
                    c0959f = this;
                }
                if (i27 == length3) {
                    break;
                } else {
                    i27++;
                }
            }
        } else {
            c0959f = this;
        }
        c0959f.f8131I = new C1008y0(c0959f.f8136d.getSemanticsOwner().a(), l());
    }

    @Override // a1.AbstractC0164b
    public final C2.c a(View view) {
        return this.f8145m;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i3, b1.h hVar, String str, Bundle bundle) {
        z0.n nVar;
        int i4;
        float h3;
        float h4;
        float g3;
        float g4;
        int i5;
        a0.d dVar;
        RectF rectF;
        C1010z0 c1010z0 = (C1010z0) l().f(i3);
        if (c1010z0 == null || (nVar = c1010z0.f8507a) == null) {
            return;
        }
        String p = p(nVar);
        boolean a3 = Z1.i.a(str, this.f8127E);
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f4317a;
        if (a3) {
            C0496n c0496n = this.C;
            int c3 = c0496n.c(i3);
            int i6 = c3 >= 0 ? c0496n.f5178c[c3] : -1;
            if (i6 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, i6);
                return;
            }
            return;
        }
        if (Z1.i.a(str, this.f8128F)) {
            C0496n c0496n2 = this.D;
            int c4 = c0496n2.c(i3);
            int i7 = c4 >= 0 ? c0496n2.f5178c[c4] : -1;
            if (i7 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, i7);
                return;
            }
            return;
        }
        z0.t tVar = z0.h.f8957a;
        z0.i iVar = nVar.f8991d;
        LinkedHashMap linkedHashMap = iVar.f8982d;
        boolean z3 = false;
        if (!linkedHashMap.containsKey(tVar) || bundle == null || !Z1.i.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            z0.t tVar2 = z0.q.f9027s;
            if (!linkedHashMap.containsKey(tVar2) || bundle == null || !Z1.i.a(str, "androidx.compose.ui.semantics.testTag")) {
                if (Z1.i.a(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, nVar.f8994g);
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
        int i8 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i9 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i9 > 0 && i8 >= 0) {
            if (i8 < (p != null ? p.length() : Integer.MAX_VALUE)) {
                B0.z n3 = L.n(iVar);
                if (n3 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = i8 + i10;
                    if (i11 >= n3.f394a.f384a.f251a.length()) {
                        arrayList.add(z3);
                        i4 = i8;
                        i5 = i9;
                    } else {
                        B0.j jVar = n3.f395b;
                        C0007d c0007d = (C0007d) jVar.f268a.f193b;
                        if (i11 < 0 || i11 >= c0007d.f251a.length()) {
                            StringBuilder l3 = AbstractC0080b.l("offset(", i11, ") is out of bounds [0, ");
                            l3.append(c0007d.f251a.length());
                            l3.append(')');
                            throw new IllegalArgumentException(l3.toString().toString());
                        }
                        ArrayList arrayList2 = jVar.f275h;
                        B0.l lVar = (B0.l) arrayList2.get(AbstractC0157a.A(i11, arrayList2));
                        C0004a c0004a = lVar.f278a;
                        int a4 = lVar.a(i11);
                        CharSequence charSequence = c0004a.f244e;
                        if (a4 < 0 || a4 >= charSequence.length()) {
                            StringBuilder l4 = AbstractC0080b.l("offset(", a4, ") is out of bounds [0,");
                            l4.append(charSequence.length());
                            l4.append(')');
                            throw new IllegalArgumentException(l4.toString().toString());
                        }
                        C0.C c5 = c0004a.f243d;
                        Layout layout = c5.f429e;
                        int lineForOffset = layout.getLineForOffset(a4);
                        float f3 = c5.f(lineForOffset);
                        float d3 = c5.d(lineForOffset);
                        i4 = i8;
                        boolean z4 = layout.getParagraphDirection(lineForOffset) == 1;
                        boolean isRtlCharAt = layout.isRtlCharAt(a4);
                        if (!z4 || isRtlCharAt) {
                            if (z4 && isRtlCharAt) {
                                g3 = c5.h(a4, false);
                                g4 = c5.h(a4 + 1, true);
                            } else if (isRtlCharAt) {
                                g3 = c5.g(a4, false);
                                g4 = c5.g(a4 + 1, true);
                            } else {
                                h3 = c5.h(a4, false);
                                h4 = c5.h(a4 + 1, true);
                            }
                            float f4 = g3;
                            h3 = g4;
                            h4 = f4;
                        } else {
                            h3 = c5.g(a4, false);
                            h4 = c5.g(a4 + 1, true);
                        }
                        RectF rectF2 = new RectF(h3, f3, h4, d3);
                        float f5 = rectF2.left;
                        float f6 = rectF2.top;
                        float f7 = rectF2.right;
                        float f8 = rectF2.bottom;
                        long f9 = I2.l.f(0.0f, lVar.f283f);
                        float d4 = a0.c.d(f9) + f5;
                        float e3 = a0.c.e(f9) + f6;
                        float d5 = a0.c.d(f9) + f7;
                        float e4 = a0.c.e(f9) + f8;
                        t0.a0 c6 = nVar.c();
                        long j3 = 0;
                        if (c6 != null) {
                            if (!c6.B0().p) {
                                c6 = null;
                            }
                            if (c6 != null) {
                                j3 = c6.K0(0L);
                            }
                        }
                        float d6 = a0.c.d(j3) + d4;
                        float e5 = a0.c.e(j3) + e3;
                        float d7 = a0.c.d(j3) + d5;
                        float e6 = a0.c.e(j3) + e4;
                        a0.d e7 = nVar.e();
                        float f10 = e7.f3491a;
                        if (d7 > f10) {
                            float f11 = e7.f3493c;
                            if (f11 > d6) {
                                float f12 = e7.f3492b;
                                if (e6 > f12) {
                                    float f13 = e7.f3494d;
                                    if (f13 > e5) {
                                        i5 = i9;
                                        dVar = new a0.d(Math.max(d6, f10), Math.max(e5, f12), Math.min(d7, f11), Math.min(e6, f13));
                                        if (dVar == null) {
                                            long f14 = I2.l.f(dVar.f3491a, dVar.f3492b);
                                            C0997t c0997t = this.f8136d;
                                            long r3 = c0997t.r(f14);
                                            long r4 = c0997t.r(I2.l.f(dVar.f3493c, dVar.f3494d));
                                            rectF = new RectF(a0.c.d(r3), a0.c.e(r3), a0.c.d(r4), a0.c.e(r4));
                                        } else {
                                            rectF = null;
                                        }
                                        arrayList.add(rectF);
                                    }
                                }
                            }
                        }
                        i5 = i9;
                        dVar = null;
                        if (dVar == null) {
                        }
                        arrayList.add(rectF);
                    }
                    i10++;
                    i8 = i4;
                    i9 = i5;
                    z3 = false;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect c(C1010z0 c1010z0) {
        Rect rect = c1010z0.f8508b;
        long f3 = I2.l.f(rect.left, rect.top);
        C0997t c0997t = this.f8136d;
        long r3 = c0997t.r(f3);
        long r4 = c0997t.r(I2.l.f(rect.right, rect.bottom));
        return new Rect((int) Math.floor(a0.c.d(r3)), (int) Math.floor(a0.c.e(r3)), (int) Math.ceil(a0.c.d(r4)), (int) Math.ceil(a0.c.e(r4)));
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
    public final Object d(R1.c cVar) {
        C0955B c0955b;
        int i3;
        C0959F c0959f;
        C0499q c0499q;
        C0628c c0628c;
        C0499q c0499q2;
        C0628c c0628c2;
        Object b2;
        try {
            if (cVar instanceof C0955B) {
                c0955b = (C0955B) cVar;
                int i4 = c0955b.f8115i;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0955b.f8115i = i4 - Integer.MIN_VALUE;
                    Object obj = c0955b.f8113g;
                    Q1.a aVar = Q1.a.f3113d;
                    i3 = c0955b.f8115i;
                    if (i3 != 0) {
                        I2.l.Q(obj);
                        try {
                            c0499q = new C0499q();
                            m2.e eVar = this.f8155x;
                            eVar.getClass();
                            c0628c = new C0628c(eVar);
                            c0959f = this;
                            c0955b.f8110d = c0959f;
                            c0955b.f8111e = c0499q;
                            c0955b.f8112f = c0628c;
                            c0955b.f8115i = 1;
                            b2 = c0628c.b(c0955b);
                            if (b2 == aVar) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            c0959f = this;
                            c0959f.f8154w.clear();
                            throw th;
                        }
                    } else if (i3 == 1) {
                        c0628c2 = c0955b.f8112f;
                        c0499q2 = c0955b.f8111e;
                        c0959f = c0955b.f8110d;
                        I2.l.Q(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0628c2 = c0955b.f8112f;
                        c0499q2 = c0955b.f8111e;
                        c0959f = c0955b.f8110d;
                        I2.l.Q(obj);
                        c0499q = c0499q2;
                        c0628c = c0628c2;
                        c0955b.f8110d = c0959f;
                        c0955b.f8111e = c0499q;
                        c0955b.f8112f = c0628c;
                        c0955b.f8115i = 1;
                        b2 = c0628c.b(c0955b);
                        if (b2 == aVar) {
                            return aVar;
                        }
                        C0628c c0628c3 = c0628c;
                        c0499q2 = c0499q;
                        obj = b2;
                        c0628c2 = c0628c3;
                        if (((Boolean) obj).booleanValue()) {
                            c0959f.f8154w.clear();
                            return L1.z.f2729a;
                        }
                        c0628c2.c();
                        boolean q2 = c0959f.q();
                        C0488f c0488f = c0959f.f8154w;
                        if (q2) {
                            int i5 = c0488f.f5163f;
                            for (int i6 = 0; i6 < i5; i6++) {
                                t0.D d3 = (t0.D) c0488f.f5162e[i6];
                                c0959f.E(d3, c0499q2);
                                c0959f.F(d3);
                            }
                            c0499q2.b();
                            if (!c0959f.f8132J) {
                                c0959f.f8132J = true;
                                c0959f.f8144l.post(c0959f.f8133K);
                            }
                            c0488f.clear();
                            c0959f.f8148q.a();
                            c0959f.f8149r.a();
                            long j3 = c0959f.f8140h;
                            c0955b.f8110d = c0959f;
                            c0955b.f8111e = c0499q2;
                            c0955b.f8112f = c0628c2;
                            c0955b.f8115i = 2;
                            if (AbstractC0552y.e(j3, c0955b) == aVar) {
                                return aVar;
                            }
                        }
                        c0499q = c0499q2;
                        c0628c = c0628c2;
                        c0955b.f8110d = c0959f;
                        c0955b.f8111e = c0499q;
                        c0955b.f8112f = c0628c;
                        c0955b.f8115i = 1;
                        b2 = c0628c.b(c0955b);
                        if (b2 == aVar) {
                        }
                    }
                }
            }
            if (i3 != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        c0955b = new C0955B(this, cVar);
        Object obj2 = c0955b.f8113g;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0955b.f8115i;
    }

    /* JADX WARN: Type inference failed for: r2v24, types: [Y1.a, Z1.j] */
    /* JADX WARN: Type inference failed for: r3v10, types: [Y1.a, Z1.j] */
    public final boolean e(boolean z3, int i3, long j3) {
        z0.t tVar;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int i4;
        int i5 = 0;
        if (!Z1.i.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        C0498p l3 = l();
        if (!a0.c.b(j3, 9205357640488583168L) && a0.c.f(j3)) {
            if (z3) {
                tVar = z0.q.p;
            } else {
                if (z3) {
                    throw new L1.f();
                }
                tVar = z0.q.f9024o;
            }
            Object[] objArr3 = l3.f5186c;
            long[] jArr3 = l3.f5184a;
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
                                C1010z0 c1010z0 = (C1010z0) objArr3[(i6 << 3) + i9];
                                Rect rect = c1010z0.f8508b;
                                float f3 = rect.left;
                                jArr2 = jArr3;
                                float f4 = rect.top;
                                objArr2 = objArr3;
                                float f5 = rect.right;
                                float f6 = rect.bottom;
                                if (a0.c.d(j3) >= f3 && a0.c.d(j3) < f5 && a0.c.e(j3) >= f4 && a0.c.e(j3) < f6) {
                                    Object obj = c1010z0.f8507a.f8991d.f8982d.get(tVar);
                                    if (obj == null) {
                                        obj = null;
                                    }
                                    z0.g gVar = (z0.g) obj;
                                    if (gVar != null) {
                                        boolean z5 = gVar.f8956c;
                                        int i10 = z5 ? -i3 : i3;
                                        if (i3 == 0 && z5) {
                                            i10 = -1;
                                        }
                                        ?? r3 = gVar.f8954a;
                                        if (i10 >= 0 ? ((Number) r3.b()).floatValue() < ((Number) gVar.f8955b.b()).floatValue() : ((Number) r3.b()).floatValue() > 0.0f) {
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
                x(this.f8136d.getSemanticsOwner().a(), this.f8131I);
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
        C1010z0 c1010z0;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i4);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        C0997t c0997t = this.f8136d;
        obtain.setPackageName(c0997t.getContext().getPackageName());
        obtain.setSource(c0997t, i3);
        if (q() && (c1010z0 = (C1010z0) l().f(i3)) != null) {
            obtain.setPassword(c1010z0.f8507a.f8991d.f8982d.containsKey(z0.q.f9008A));
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

    public final void i(z0.n nVar, ArrayList arrayList, C0498p c0498p) {
        boolean i3 = L.i(nVar);
        Object obj = nVar.f8991d.f8982d.get(z0.q.f9021l);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i4 = nVar.f8994g;
        if ((booleanValue || r(nVar)) && l().c(i4)) {
            arrayList.add(nVar);
        }
        if (booleanValue) {
            c0498p.i(i4, H(i3, M1.l.D0(z0.n.h(nVar, false, 7))));
            return;
        }
        List h3 = z0.n.h(nVar, false, 7);
        int size = h3.size();
        for (int i5 = 0; i5 < size; i5++) {
            i((z0.n) h3.get(i5), arrayList, c0498p);
        }
    }

    public final int j(z0.n nVar) {
        z0.i iVar = nVar.f8991d;
        if (!iVar.f8982d.containsKey(z0.q.f9010a)) {
            z0.t tVar = z0.q.f9032x;
            z0.i iVar2 = nVar.f8991d;
            if (iVar2.f8982d.containsKey(tVar)) {
                return (int) (4294967295L & ((B0.B) iVar2.c(tVar)).f233a);
            }
        }
        return this.f8152u;
    }

    public final int k(z0.n nVar) {
        z0.i iVar = nVar.f8991d;
        if (!iVar.f8982d.containsKey(z0.q.f9010a)) {
            z0.t tVar = z0.q.f9032x;
            z0.i iVar2 = nVar.f8991d;
            if (iVar2.f8982d.containsKey(tVar)) {
                return (int) (((B0.B) iVar2.c(tVar)).f233a >> 32);
            }
        }
        return this.f8152u;
    }

    public final C0498p l() {
        if (this.f8156y) {
            this.f8156y = false;
            this.f8126A = L.l(this.f8136d.getSemanticsOwner());
            if (q()) {
                C0496n c0496n = this.C;
                c0496n.a();
                C0496n c0496n2 = this.D;
                c0496n2.a();
                C1010z0 c1010z0 = (C1010z0) l().f(-1);
                z0.n nVar = c1010z0 != null ? c1010z0.f8507a : null;
                Z1.i.c(nVar);
                ArrayList H3 = H(L.i(nVar), M1.m.e0(nVar));
                int b02 = M1.m.b0(H3);
                int i3 = 1;
                if (1 <= b02) {
                    while (true) {
                        int i4 = ((z0.n) H3.get(i3 - 1)).f8994g;
                        int i5 = ((z0.n) H3.get(i3)).f8994g;
                        c0496n.f(i4, i5);
                        c0496n2.f(i5, i4);
                        if (i3 == b02) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return this.f8126A;
    }

    public final String n(z0.n nVar) {
        Object obj = nVar.f8991d.f8982d.get(z0.q.f9011b);
        String str = null;
        if (obj == null) {
            obj = null;
        }
        z0.t tVar = z0.q.f9034z;
        z0.i iVar = nVar.f8991d;
        LinkedHashMap linkedHashMap = iVar.f8982d;
        Object obj2 = linkedHashMap.get(tVar);
        if (obj2 == null) {
            obj2 = null;
        }
        A0.a aVar = (A0.a) obj2;
        Object obj3 = linkedHashMap.get(z0.q.f9026r);
        if (obj3 == null) {
            obj3 = null;
        }
        z0.f fVar = (z0.f) obj3;
        C0997t c0997t = this.f8136d;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                if ((fVar == null ? false : z0.f.a(fVar.f8953a, 2)) && obj == null) {
                    obj = c0997t.getContext().getResources().getString(R.string.state_on);
                }
            } else if (ordinal == 1) {
                if ((fVar == null ? false : z0.f.a(fVar.f8953a, 2)) && obj == null) {
                    obj = c0997t.getContext().getResources().getString(R.string.state_off);
                }
            } else if (ordinal == 2 && obj == null) {
                obj = c0997t.getContext().getResources().getString(R.string.indeterminate);
            }
        }
        Object obj4 = linkedHashMap.get(z0.q.f9033y);
        if (obj4 == null) {
            obj4 = null;
        }
        Boolean bool = (Boolean) obj4;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!(fVar == null ? false : z0.f.a(fVar.f8953a, 4)) && obj == null) {
                obj = booleanValue ? c0997t.getContext().getResources().getString(R.string.selected) : c0997t.getContext().getResources().getString(R.string.not_selected);
            }
        }
        Object obj5 = linkedHashMap.get(z0.q.f9012c);
        if (obj5 == null) {
            obj5 = null;
        }
        z0.e eVar = (z0.e) obj5;
        if (eVar != null) {
            if (eVar != z0.e.f8949d) {
                if (obj == null) {
                    C0377a c0377a = eVar.f8951b;
                    float f3 = c0377a.f4767b;
                    float f4 = c0377a.f4766a;
                    float f5 = ((f3 - f4) > 0.0f ? 1 : ((f3 - f4) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (eVar.f8950a - f4) / (f3 - f4);
                    if (f5 < 0.0f) {
                        f5 = 0.0f;
                    }
                    if (f5 > 1.0f) {
                        f5 = 1.0f;
                    }
                    if (!(f5 == 0.0f)) {
                        r7 = (f5 == 1.0f ? 1 : 0) != 0 ? 100 : AbstractC0381e.r(Math.round(f5 * 100), 1, 99);
                    }
                    obj = c0997t.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(r7));
                }
            } else if (obj == null) {
                obj = c0997t.getContext().getResources().getString(R.string.in_progress);
            }
        }
        z0.t tVar2 = z0.q.f9031w;
        if (linkedHashMap.containsKey(tVar2)) {
            z0.i i3 = new z0.n(nVar.f8988a, true, nVar.f8990c, iVar).i();
            z0.t tVar3 = z0.q.f9010a;
            LinkedHashMap linkedHashMap2 = i3.f8982d;
            Object obj6 = linkedHashMap2.get(tVar3);
            if (obj6 == null) {
                obj6 = null;
            }
            Collection collection = (Collection) obj6;
            if (collection == null || collection.isEmpty()) {
                Object obj7 = linkedHashMap2.get(z0.q.f9028t);
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
                        str = c0997t.getContext().getResources().getString(R.string.state_empty);
                    }
                }
            }
            obj = str;
        }
        return (String) obj;
    }

    public final boolean q() {
        return this.f8139g.isEnabled() && !this.f8143k.isEmpty();
    }

    public final boolean r(z0.n nVar) {
        Object obj = nVar.f8991d.f8982d.get(z0.q.f9010a);
        if (obj == null) {
            obj = null;
        }
        List list = (List) obj;
        boolean z3 = ((list != null ? (String) M1.l.n0(list) : null) == null && o(nVar) == null && n(nVar) == null && !m(nVar)) ? false : true;
        if (nVar.f8991d.f8983e) {
            return true;
        }
        return nVar.m() && z3;
    }

    public final void s(t0.D d3) {
        if (this.f8154w.add(d3)) {
            this.f8155x.g(L1.z.f2729a);
        }
    }

    public final int w(int i3) {
        if (i3 == this.f8136d.getSemanticsOwner().a().f8994g) {
            return -1;
        }
        return i3;
    }

    public final void x(z0.n nVar, C1008y0 c1008y0) {
        int[] iArr = AbstractC0492j.f5167a;
        C0499q c0499q = new C0499q();
        List h3 = z0.n.h(nVar, true, 4);
        int size = h3.size();
        int i3 = 0;
        while (true) {
            t0.D d3 = nVar.f8990c;
            if (i3 >= size) {
                C0499q c0499q2 = c1008y0.f8502b;
                int[] iArr2 = c0499q2.f5191b;
                long[] jArr = c0499q2.f5190a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j3 = jArr[i4];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j3 & 255) < 128 && !c0499q.c(iArr2[(i4 << 3) + i6])) {
                                    s(d3);
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
                List h4 = z0.n.h(nVar, true, 4);
                int size2 = h4.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    z0.n nVar2 = (z0.n) h4.get(i7);
                    if (l().b(nVar2.f8994g)) {
                        Object f3 = this.f8130H.f(nVar2.f8994g);
                        Z1.i.c(f3);
                        x(nVar2, (C1008y0) f3);
                    }
                }
                return;
            }
            z0.n nVar3 = (z0.n) h3.get(i3);
            if (l().b(nVar3.f8994g)) {
                C0499q c0499q3 = c1008y0.f8502b;
                int i8 = nVar3.f8994g;
                if (!c0499q3.c(i8)) {
                    s(d3);
                    return;
                }
                c0499q.a(i8);
            }
            i3++;
        }
    }

    public final boolean y(AccessibilityEvent accessibilityEvent) {
        if (!q()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.p = true;
        }
        try {
            return ((Boolean) this.f8138f.j(accessibilityEvent)).booleanValue();
        } finally {
            this.p = false;
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
            g3.setContentDescription(I2.d.w(list, ","));
        }
        Trace.beginSection("sendEvent");
        try {
            return y(g3);
        } finally {
            Trace.endSection();
        }
    }
}
