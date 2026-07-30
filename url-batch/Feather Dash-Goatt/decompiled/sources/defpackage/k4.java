package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
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
import com.appsflyer.internal.l;
import com.feathherdashh.dashgame.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class k4 extends c1 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final dn0 S;
    public final t9 A;
    public final we B;
    public boolean C;
    public g4 D;
    public en0 E;
    public final fn0 F;
    public final cn0 G;
    public final cn0 H;
    public final String I;
    public final String J;
    public final i8 K;
    public final en0 L;
    public m81 M;
    public boolean N;
    public final cn0 O;
    public final e4 P;
    public final ArrayList Q;
    public final j4 R;
    public final d4 h;
    public int i = Integer.MIN_VALUE;
    public final j4 j;
    public final AccessibilityManager k;
    public long l;
    public List m;
    public final Handler n;
    public final f4 o;
    public int p;
    public int q;
    public o1 r;
    public o1 s;
    public boolean t;
    public final en0 u;
    public final en0 v;
    public final lc1 w;
    public final lc1 x;
    public int y;
    public Integer z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        dn0 dn0Var = p90.a;
        dn0 dn0Var2 = new dn0(32);
        int i = dn0Var2.b;
        if (i < 0) {
            throw new IndexOutOfBoundsException("");
        }
        int i2 = i + 32;
        dn0Var2.b(i2);
        int[] iArr2 = dn0Var2.a;
        int i3 = dn0Var2.b;
        if (i != i3) {
            w9.a(iArr2, iArr2, i2, i, i3);
        }
        w9.d(iArr, iArr2, i, 0, 12);
        dn0Var2.b += 32;
        S = dn0Var2;
    }

    public k4(d4 d4Var) {
        this.h = d4Var;
        int i = 0;
        this.j = new j4(this, i);
        Object systemService = d4Var.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.k = (AccessibilityManager) systemService;
        this.l = 100L;
        this.n = new Handler(Looper.getMainLooper());
        this.o = new f4(this);
        this.p = Integer.MIN_VALUE;
        this.q = Integer.MIN_VALUE;
        this.u = new en0();
        this.v = new en0();
        this.w = new lc1();
        this.x = new lc1();
        this.y = -1;
        this.A = new t9(0);
        this.B = yr1.i(1, 6, null);
        this.C = true;
        en0 en0Var = r90.a;
        en0Var.getClass();
        this.E = en0Var;
        this.F = new fn0();
        this.G = new cn0();
        this.H = new cn0();
        this.I = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.J = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.K = new i8(25);
        this.L = new en0();
        this.M = new m81(d4Var.getSemanticsOwner().a(), en0Var);
        int i2 = n90.a;
        this.O = new cn0();
        d4Var.addOnAttachStateChangeListener(this);
        this.P = new e4(i, this);
        this.Q = new ArrayList();
        this.R = new j4(this, 1);
    }

    public static Rect E(ka0 ka0Var, float f, float f2) {
        if (!(ka0Var instanceof ht0) && !(ka0Var instanceof it0)) {
            return null;
        }
        s11 p = ka0Var.p();
        return new Rect((int) (p.a + f), (int) (p.b + f2), (int) (p.c + f), (int) (p.d + f2));
    }

    public static float[] G(ka0 ka0Var) {
        if (!(ka0Var instanceof it0)) {
            return null;
        }
        l41 l41Var = ((it0) ka0Var).a;
        long j = l41Var.h;
        long j2 = l41Var.g;
        long j3 = l41Var.f;
        long j4 = l41Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region H(ka0 ka0Var, float f, float f2) {
        if (!(ka0Var instanceof gt0)) {
            return null;
        }
        gt0 gt0Var = (gt0) ka0Var;
        s11 d = gt0Var.p().d(f, f2);
        Region region = new Region(new Rect((int) (d.a + 0.0f), (int) (d.b + 0.0f), (int) (d.c + 0.0f), (int) (d.d + 0.0f)));
        Region region2 = new Region();
        c6 c6Var = gt0Var.a;
        if (!(c6Var instanceof c6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = c6Var.a;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence I(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String m(l81 l81Var) {
        y7 y7Var;
        if (l81Var != null) {
            h81 h81Var = l81Var.d;
            vn0 vn0Var = h81Var.d;
            t81 t81Var = p81.a;
            if (vn0Var.c(t81Var)) {
                return zh0.a((List) h81Var.d(t81Var), ",", null, 62);
            }
            t81 t81Var2 = p81.D;
            if (vn0Var.c(t81Var2)) {
                Object g = vn0Var.g(t81Var2);
                if (g == null) {
                    g = null;
                }
                y7 y7Var2 = (y7) g;
                if (y7Var2 != null) {
                    return y7Var2.e;
                }
            } else {
                Object g2 = vn0Var.g(p81.z);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null && (y7Var = (y7) CollectionsKt.firstOrNull(list)) != null) {
                    return y7Var.e;
                }
            }
        }
        return null;
    }

    public static final boolean q(z61 z61Var, float f) {
        Function0 function0 = z61Var.a;
        if (f >= 0.0f || ((Number) function0.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) function0.invoke()).floatValue() < ((Number) z61Var.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean r(z61 z61Var) {
        Function0 function0 = z61Var.a;
        if (((Number) function0.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        ((Number) z61Var.b.invoke()).floatValue();
        return false;
    }

    public static final boolean s(z61 z61Var) {
        Function0 function0 = z61Var.a;
        if (((Number) function0.invoke()).floatValue() < ((Number) z61Var.b.invoke()).floatValue()) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        return false;
    }

    public static /* synthetic */ void x(k4 k4Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        k4Var.w(i, i2, num, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x042b, code lost:
    
        if (r1.isEmpty() == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x045d, code lost:
    
        if (r5 != null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0462, code lost:
    
        if (r5 == null) goto L191;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(q90 q90Var) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i2;
        int i3;
        Integer num2;
        h81 h81Var;
        l81 l81Var;
        int i4;
        boolean z;
        vn0 vn0Var;
        int i5;
        int i6;
        h81 h81Var2;
        ArrayList arrayList3;
        int i7;
        long j;
        int i8;
        Integer num3;
        int i9;
        vn0 vn0Var2;
        int i10;
        int i11;
        l81 l81Var2;
        e71 e71Var;
        boolean z2;
        t81 t81Var;
        e71 e71Var2;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        Integer num4;
        AccessibilityEvent i16;
        Integer num5;
        q90 q90Var2 = q90Var;
        ArrayList arrayList4 = this.Q;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = q90Var2.b;
        long[] jArr3 = q90Var2.a;
        int i17 = 2;
        int length = jArr3.length - 2;
        int i18 = 0;
        Integer num6 = 0;
        if (length < 0) {
            return;
        }
        int i19 = 0;
        while (true) {
            long j2 = jArr3[i19];
            int i20 = i17;
            int i21 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i22 = 8;
                int i23 = 8 - ((~(i19 - i21)) >>> 31);
                long j3 = j2;
                int i24 = i18;
                while (i24 < i23) {
                    if ((j3 & 255) < 128) {
                        int i25 = iArr3[(i19 << 3) + i24];
                        m81 m81Var = (m81) this.L.b(i25);
                        if (m81Var != null) {
                            h81 h81Var3 = m81Var.a;
                            vn0 vn0Var3 = h81Var3.d;
                            n81 n81Var = (n81) q90Var2.b(i25);
                            l81 l81Var3 = n81Var != null ? n81Var.a : null;
                            if (l81Var3 == null) {
                                throw qy0.g("no value for specified key");
                            }
                            int i26 = i22;
                            int i27 = l81Var3.g;
                            h81 h81Var4 = l81Var3.d;
                            iArr2 = iArr3;
                            vn0 vn0Var4 = h81Var4.d;
                            jArr2 = jArr3;
                            Object[] objArr = vn0Var4.b;
                            Object[] objArr2 = vn0Var4.c;
                            long[] jArr4 = vn0Var4.a;
                            i = i24;
                            int length2 = jArr4.length - 2;
                            boolean z3 = true;
                            if (length2 >= 0) {
                                i3 = i23;
                                l81 l81Var4 = l81Var3;
                                int i28 = 0;
                                z = false;
                                while (true) {
                                    long j4 = jArr4[i28];
                                    int i29 = i28;
                                    int i30 = i27;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i31 = 8 - ((~(i29 - length2)) >>> 31);
                                        int i32 = 0;
                                        while (i32 < i31) {
                                            if ((j4 & 255) < 128) {
                                                int i33 = (i29 << 3) + i32;
                                                Object obj = objArr[i33];
                                                int i34 = length2;
                                                Object obj2 = objArr2[i33];
                                                h81Var2 = h81Var3;
                                                t81 t81Var2 = (t81) obj;
                                                i7 = i32;
                                                t81 t81Var3 = p81.u;
                                                if (Intrinsics.a(t81Var2, t81Var3)) {
                                                    j = j4;
                                                } else {
                                                    j = j4;
                                                    if (!Intrinsics.a(t81Var2, p81.v)) {
                                                        z2 = false;
                                                        if (!z2) {
                                                            Object g = vn0Var3.g(t81Var2);
                                                            if (g == null) {
                                                                g = null;
                                                            }
                                                            if (Intrinsics.a(obj2, g)) {
                                                                num3 = num6;
                                                                vn0Var2 = vn0Var3;
                                                                arrayList3 = arrayList5;
                                                                i8 = i26;
                                                                i10 = i30;
                                                                i9 = i25;
                                                                l81Var2 = l81Var4;
                                                                i11 = i34;
                                                                long j5 = j >> i8;
                                                                i26 = i8;
                                                                l81Var4 = l81Var2;
                                                                i20 = 2;
                                                                i32 = i7 + 1;
                                                                i30 = i10;
                                                                length2 = i11;
                                                                i25 = i9;
                                                                num6 = num3;
                                                                arrayList5 = arrayList3;
                                                                vn0Var3 = vn0Var2;
                                                                j4 = j5;
                                                                h81Var3 = h81Var2;
                                                            }
                                                        }
                                                        t81Var = p81.d;
                                                        if (Intrinsics.a(t81Var2, t81Var)) {
                                                            if (Intrinsics.a(t81Var2, p81.b) || Intrinsics.a(t81Var2, p81.G)) {
                                                                num3 = num6;
                                                                vn0Var2 = vn0Var3;
                                                                arrayList3 = arrayList5;
                                                                i10 = i30;
                                                                i9 = i25;
                                                                l81Var2 = l81Var4;
                                                                i11 = i34;
                                                                i8 = 8;
                                                                x(this, t(i9), 2048, 64, 8);
                                                                x(this, t(i9), 2048, num3, 8);
                                                            } else {
                                                                if (Intrinsics.a(t81Var2, p81.c)) {
                                                                    i8 = 8;
                                                                    x(this, t(i25), 2048, 64, 8);
                                                                    x(this, t(i25), 2048, num6, 8);
                                                                    num3 = num6;
                                                                } else if (Intrinsics.a(t81Var2, p81.F)) {
                                                                    Object g2 = vn0Var4.g(p81.w);
                                                                    if (g2 == null) {
                                                                        g2 = null;
                                                                    }
                                                                    x(this, t(i25), 2048, 64, 8);
                                                                    x(this, t(i25), 2048, num6, 8);
                                                                    num3 = num6;
                                                                    i8 = 8;
                                                                } else if (Intrinsics.a(t81Var2, p81.a)) {
                                                                    int t = t(i25);
                                                                    obj2.getClass();
                                                                    w(t, 2048, 4, (List) obj2);
                                                                } else {
                                                                    t81 t81Var4 = p81.D;
                                                                    String str2 = "";
                                                                    if (!Intrinsics.a(t81Var2, t81Var4)) {
                                                                        Integer num7 = num6;
                                                                        vn0Var2 = vn0Var3;
                                                                        arrayList3 = arrayList5;
                                                                        i9 = i25;
                                                                        t81 t81Var5 = p81.E;
                                                                        if (Intrinsics.a(t81Var2, t81Var5)) {
                                                                            Object g3 = vn0Var4.g(t81Var4);
                                                                            if (g3 == null) {
                                                                                g3 = null;
                                                                            }
                                                                            y7 y7Var = (y7) g3;
                                                                            if (y7Var != null && (str = y7Var.e) != null) {
                                                                                str2 = str;
                                                                            }
                                                                            long j6 = ((mh1) h81Var4.d(t81Var5)).a;
                                                                            num3 = num7;
                                                                            v(i(t(i9), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str2.length()), I(str2)));
                                                                            i10 = i30;
                                                                            z(i10);
                                                                            l81Var2 = l81Var4;
                                                                            i11 = i34;
                                                                        } else {
                                                                            i10 = i30;
                                                                            i11 = i34;
                                                                            num3 = num7;
                                                                            if (Intrinsics.a(t81Var2, t81Var3) || Intrinsics.a(t81Var2, p81.v)) {
                                                                                l81 l81Var5 = l81Var4;
                                                                                p(l81Var5.c);
                                                                                int size = arrayList4.size();
                                                                                int i35 = 0;
                                                                                while (true) {
                                                                                    if (i35 >= size) {
                                                                                        l81Var2 = l81Var5;
                                                                                        e71Var2 = null;
                                                                                        break;
                                                                                    }
                                                                                    l81Var2 = l81Var5;
                                                                                    if (((e71) arrayList4.get(i35)).d == i9) {
                                                                                        e71Var2 = (e71) arrayList4.get(i35);
                                                                                        break;
                                                                                    } else {
                                                                                        i35++;
                                                                                        l81Var5 = l81Var2;
                                                                                    }
                                                                                }
                                                                                e71Var2.getClass();
                                                                                Object g4 = vn0Var4.g(t81Var3);
                                                                                if (g4 == null) {
                                                                                    g4 = null;
                                                                                }
                                                                                e71Var2.i = (z61) g4;
                                                                                Object g5 = vn0Var4.g(p81.v);
                                                                                if (g5 == null) {
                                                                                    g5 = null;
                                                                                }
                                                                                e71Var2.j = (z61) g5;
                                                                                if (e71Var2.e.contains(e71Var2)) {
                                                                                    this.h.getSnapshotObserver().a.b(e71Var2, this.R, new w3(e71Var2, i20, this));
                                                                                }
                                                                            } else if (Intrinsics.a(t81Var2, p81.k)) {
                                                                                obj2.getClass();
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i12 = 8;
                                                                                    v(h(t(i10), 8));
                                                                                } else {
                                                                                    i12 = 8;
                                                                                }
                                                                                x(this, t(i10), 2048, num3, i12);
                                                                                i8 = i12;
                                                                            } else {
                                                                                t81 t81Var6 = g81.w;
                                                                                if (Intrinsics.a(t81Var2, t81Var6)) {
                                                                                    List list = (List) h81Var4.d(t81Var6);
                                                                                    Object g6 = vn0Var2.g(t81Var6);
                                                                                    if (g6 == null) {
                                                                                        g6 = null;
                                                                                    }
                                                                                    List list2 = (List) g6;
                                                                                    if (list2 != null) {
                                                                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                        if (list.size() > 0) {
                                                                                            list.get(0).getClass();
                                                                                            af.c();
                                                                                            return;
                                                                                        }
                                                                                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                        if (list2.size() > 0) {
                                                                                            list2.get(0).getClass();
                                                                                            af.c();
                                                                                            return;
                                                                                        }
                                                                                        z = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                                                                    }
                                                                                    l81Var2 = l81Var4;
                                                                                } else {
                                                                                    if (obj2 instanceof z0) {
                                                                                        z0 z0Var = (z0) obj2;
                                                                                        Object g7 = vn0Var2.g(t81Var2);
                                                                                        if (g7 == null) {
                                                                                            g7 = null;
                                                                                        }
                                                                                        if (z0Var != g7) {
                                                                                            if (g7 instanceof z0) {
                                                                                                String str3 = z0Var.a;
                                                                                                z0 z0Var2 = (z0) g7;
                                                                                                z30 z30Var = z0Var2.b;
                                                                                                if (Intrinsics.a(str3, z0Var2.a)) {
                                                                                                    z30 z30Var2 = z0Var.b;
                                                                                                    if (z30Var2 == null) {
                                                                                                    }
                                                                                                    if (z30Var2 != null) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        z = false;
                                                                                        l81Var2 = l81Var4;
                                                                                    }
                                                                                    z = true;
                                                                                    l81Var2 = l81Var4;
                                                                                }
                                                                            }
                                                                        }
                                                                        i8 = 8;
                                                                    } else if (vn0Var4.c(g81.k)) {
                                                                        Object g8 = vn0Var3.g(t81Var4);
                                                                        if (g8 == null) {
                                                                            g8 = null;
                                                                        }
                                                                        y7 y7Var2 = (y7) g8;
                                                                        if (y7Var2 == null) {
                                                                            y7Var2 = "";
                                                                        }
                                                                        Object g9 = vn0Var4.g(t81Var4);
                                                                        if (g9 == null) {
                                                                            g9 = null;
                                                                        }
                                                                        CharSequence charSequence = (y7) g9;
                                                                        if (charSequence == null) {
                                                                            charSequence = "";
                                                                        }
                                                                        CharSequence I = I(charSequence);
                                                                        int length3 = y7Var2.length();
                                                                        int length4 = charSequence.length();
                                                                        Integer num8 = num6;
                                                                        int i36 = length3 > length4 ? length4 : length3;
                                                                        arrayList3 = arrayList5;
                                                                        int i37 = 0;
                                                                        while (true) {
                                                                            i13 = i36;
                                                                            if (i37 >= i36) {
                                                                                i14 = length3;
                                                                                break;
                                                                            }
                                                                            i14 = length3;
                                                                            if (y7Var2.charAt(i37) != charSequence.charAt(i37)) {
                                                                                break;
                                                                            }
                                                                            i37++;
                                                                            i36 = i13;
                                                                            length3 = i14;
                                                                        }
                                                                        int i38 = 0;
                                                                        while (true) {
                                                                            if (i38 >= i13 - i37) {
                                                                                i15 = i38;
                                                                                break;
                                                                            }
                                                                            i15 = i38;
                                                                            if (y7Var2.charAt((i14 - 1) - i38) != charSequence.charAt((length4 - 1) - i15)) {
                                                                                break;
                                                                            } else {
                                                                                i38 = i15 + 1;
                                                                            }
                                                                        }
                                                                        int i39 = (i14 - i15) - i37;
                                                                        int i40 = (length4 - i15) - i37;
                                                                        t81 t81Var7 = p81.H;
                                                                        boolean c = vn0Var3.c(t81Var7);
                                                                        boolean c2 = vn0Var4.c(t81Var7);
                                                                        boolean c3 = vn0Var3.c(p81.D);
                                                                        boolean z4 = c3 && !c && c2;
                                                                        boolean z5 = c3 && c && !c2;
                                                                        if (z4 || z5) {
                                                                            int t2 = t(i25);
                                                                            Integer valueOf = Integer.valueOf(length4);
                                                                            i9 = i25;
                                                                            vn0Var2 = vn0Var3;
                                                                            num4 = num8;
                                                                            i16 = i(t2, num4, num8, valueOf, I);
                                                                        } else {
                                                                            i16 = h(t(i25), 16);
                                                                            i16.setFromIndex(i37);
                                                                            i16.setRemovedCount(i39);
                                                                            i16.setAddedCount(i40);
                                                                            i16.setBeforeText(y7Var2);
                                                                            i16.getText().add(I);
                                                                            i9 = i25;
                                                                            vn0Var2 = vn0Var3;
                                                                            num4 = num8;
                                                                        }
                                                                        i16.setClassName("android.widget.EditText");
                                                                        v(i16);
                                                                        if (z4 || z5) {
                                                                            num5 = num4;
                                                                            long j7 = ((mh1) h81Var4.d(p81.E)).a;
                                                                            i16.setFromIndex((int) (j7 >> 32));
                                                                            i16.setToIndex((int) (j7 & 4294967295L));
                                                                            v(i16);
                                                                        } else {
                                                                            num5 = num4;
                                                                        }
                                                                        i10 = i30;
                                                                        i11 = i34;
                                                                        num3 = num5;
                                                                        i8 = 8;
                                                                    } else {
                                                                        Integer num9 = num6;
                                                                        vn0Var2 = vn0Var3;
                                                                        arrayList3 = arrayList5;
                                                                        i9 = i25;
                                                                        i8 = 8;
                                                                        x(this, t(i9), 2048, Integer.valueOf(i20), 8);
                                                                        i10 = i30;
                                                                        i11 = i34;
                                                                        num3 = num9;
                                                                    }
                                                                }
                                                                vn0Var2 = vn0Var3;
                                                                arrayList3 = arrayList5;
                                                                i10 = i30;
                                                                i9 = i25;
                                                                l81Var2 = l81Var4;
                                                                i11 = i34;
                                                            }
                                                            long j52 = j >> i8;
                                                            i26 = i8;
                                                            l81Var4 = l81Var2;
                                                            i20 = 2;
                                                            i32 = i7 + 1;
                                                            i30 = i10;
                                                            length2 = i11;
                                                            i25 = i9;
                                                            num6 = num3;
                                                            arrayList5 = arrayList3;
                                                            vn0Var3 = vn0Var2;
                                                            j4 = j52;
                                                            h81Var3 = h81Var2;
                                                        } else {
                                                            obj2.getClass();
                                                            String str4 = (String) obj2;
                                                            if (vn0Var3.c(t81Var)) {
                                                                y(str4, i25, i26);
                                                            }
                                                        }
                                                        num3 = num6;
                                                        vn0Var2 = vn0Var3;
                                                        arrayList3 = arrayList5;
                                                        i10 = i30;
                                                        i8 = 8;
                                                        i9 = i25;
                                                        l81Var2 = l81Var4;
                                                        i11 = i34;
                                                        long j522 = j >> i8;
                                                        i26 = i8;
                                                        l81Var4 = l81Var2;
                                                        i20 = 2;
                                                        i32 = i7 + 1;
                                                        i30 = i10;
                                                        length2 = i11;
                                                        i25 = i9;
                                                        num6 = num3;
                                                        arrayList5 = arrayList3;
                                                        vn0Var3 = vn0Var2;
                                                        j4 = j522;
                                                        h81Var3 = h81Var2;
                                                    }
                                                }
                                                int size2 = arrayList5.size();
                                                int i41 = 0;
                                                while (true) {
                                                    if (i41 >= size2) {
                                                        e71Var = null;
                                                        break;
                                                    }
                                                    int i42 = size2;
                                                    if (((e71) arrayList5.get(i41)).d == i25) {
                                                        e71Var = (e71) arrayList5.get(i41);
                                                        break;
                                                    } else {
                                                        i41++;
                                                        size2 = i42;
                                                    }
                                                }
                                                if (e71Var != null) {
                                                    z2 = false;
                                                } else {
                                                    e71Var = new e71(i25, arrayList4);
                                                    z2 = true;
                                                }
                                                arrayList4.add(e71Var);
                                                if (!z2) {
                                                }
                                                t81Var = p81.d;
                                                if (Intrinsics.a(t81Var2, t81Var)) {
                                                }
                                                num3 = num6;
                                                vn0Var2 = vn0Var3;
                                                arrayList3 = arrayList5;
                                                i10 = i30;
                                                i8 = 8;
                                                i9 = i25;
                                                l81Var2 = l81Var4;
                                                i11 = i34;
                                                long j5222 = j >> i8;
                                                i26 = i8;
                                                l81Var4 = l81Var2;
                                                i20 = 2;
                                                i32 = i7 + 1;
                                                i30 = i10;
                                                length2 = i11;
                                                i25 = i9;
                                                num6 = num3;
                                                arrayList5 = arrayList3;
                                                vn0Var3 = vn0Var2;
                                                j4 = j5222;
                                                h81Var3 = h81Var2;
                                            } else {
                                                h81Var2 = h81Var3;
                                                arrayList3 = arrayList5;
                                                i7 = i32;
                                                j = j4;
                                                i8 = i26;
                                                num3 = num6;
                                                i9 = i25;
                                                vn0Var2 = vn0Var3;
                                                i10 = i30;
                                                i11 = length2;
                                            }
                                            l81Var2 = l81Var4;
                                            long j52222 = j >> i8;
                                            i26 = i8;
                                            l81Var4 = l81Var2;
                                            i20 = 2;
                                            i32 = i7 + 1;
                                            i30 = i10;
                                            length2 = i11;
                                            i25 = i9;
                                            num6 = num3;
                                            arrayList5 = arrayList3;
                                            vn0Var3 = vn0Var2;
                                            j4 = j52222;
                                            h81Var3 = h81Var2;
                                        }
                                        num2 = num6;
                                        h81Var = h81Var3;
                                        vn0Var = vn0Var3;
                                        arrayList2 = arrayList5;
                                        i5 = i30;
                                        i4 = i25;
                                        l81Var = l81Var4;
                                        i6 = length2;
                                        if (i31 != i26) {
                                            break;
                                        }
                                    } else {
                                        num2 = num6;
                                        h81Var = h81Var3;
                                        vn0Var = vn0Var3;
                                        arrayList2 = arrayList5;
                                        i5 = i30;
                                        i4 = i25;
                                        l81Var = l81Var4;
                                        i6 = length2;
                                    }
                                    if (i29 == i6) {
                                        break;
                                    }
                                    i28 = i29 + 1;
                                    i27 = i5;
                                    length2 = i6;
                                    i25 = i4;
                                    num6 = num2;
                                    vn0Var3 = vn0Var;
                                    l81Var4 = l81Var;
                                    h81Var3 = h81Var;
                                    arrayList5 = arrayList2;
                                    i20 = 2;
                                    i26 = 8;
                                }
                            } else {
                                h81Var = h81Var3;
                                arrayList2 = arrayList5;
                                i3 = i23;
                                l81Var = l81Var3;
                                num2 = num6;
                                i4 = i25;
                                z = false;
                            }
                            if (!z) {
                                Iterator it = h81Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z3 = false;
                                        break;
                                    } else {
                                        if (!l81Var.k().d.c((t81) ((Map.Entry) it.next()).getKey())) {
                                            break;
                                        }
                                    }
                                }
                                z = z3;
                            }
                            if (z) {
                                i2 = 8;
                                x(this, t(i4), 2048, num2, 8);
                            } else {
                                i2 = 8;
                            }
                            j3 >>= i2;
                            i24 = i + 1;
                            q90Var2 = q90Var;
                            i22 = i2;
                            num6 = num2;
                            iArr3 = iArr2;
                            jArr3 = jArr2;
                            i23 = i3;
                            arrayList5 = arrayList2;
                            i20 = 2;
                        }
                    }
                    i = i24;
                    arrayList2 = arrayList5;
                    iArr2 = iArr3;
                    jArr2 = jArr3;
                    i2 = i22;
                    i3 = i23;
                    num2 = num6;
                    j3 >>= i2;
                    i24 = i + 1;
                    q90Var2 = q90Var;
                    i22 = i2;
                    num6 = num2;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i23 = i3;
                    arrayList5 = arrayList2;
                    i20 = 2;
                }
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i43 = i22;
                int i44 = i23;
                num = num6;
                if (i44 != i43) {
                    return;
                }
            } else {
                num = num6;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
            }
            if (i19 == i21) {
                return;
            }
            i19++;
            q90Var2 = q90Var;
            num6 = num;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            i17 = 2;
            i18 = 0;
            length = i21;
        }
    }

    public final void B(jd0 jd0Var, fn0 fn0Var) {
        h81 v;
        if (jd0Var.F() && !this.h.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(jd0Var)) {
            jd0 jd0Var2 = null;
            if (!jd0Var.J.g(8)) {
                jd0Var = jd0Var.s();
                while (true) {
                    if (jd0Var == null) {
                        jd0Var = null;
                        break;
                    } else if (jd0Var.J.g(8)) {
                        break;
                    } else {
                        jd0Var = jd0Var.s();
                    }
                }
            }
            if (jd0Var == null || (v = jd0Var.v()) == null) {
                return;
            }
            if (!v.g) {
                jd0 s = jd0Var.s();
                while (true) {
                    if (s != null) {
                        h81 v2 = s.v();
                        if (v2 != null && v2.g) {
                            jd0Var2 = s;
                            break;
                        }
                        s = s.s();
                    } else {
                        break;
                    }
                }
                if (jd0Var2 != null) {
                    jd0Var = jd0Var2;
                }
            }
            int i = jd0Var.e;
            if (fn0Var.a(i)) {
                x(this, t(i), 2048, 1, 8);
            }
        }
    }

    public final void C(jd0 jd0Var) {
        if (jd0Var.F() && !this.h.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(jd0Var)) {
            int i = jd0Var.e;
            z61 z61Var = (z61) this.u.b(i);
            z61 z61Var2 = (z61) this.v.b(i);
            if (z61Var == null && z61Var2 == null) {
                return;
            }
            AccessibilityEvent h = h(i, 4096);
            if (z61Var != null) {
                h.setScrollX((int) ((Number) z61Var.a.invoke()).floatValue());
                h.setMaxScrollX((int) ((Number) z61Var.b.invoke()).floatValue());
            }
            if (z61Var2 != null) {
                h.setScrollY((int) ((Number) z61Var2.a.invoke()).floatValue());
                h.setMaxScrollY((int) ((Number) z61Var2.b.invoke()).floatValue());
            }
            v(h);
        }
    }

    public final boolean D(l81 l81Var, int i, int i2, boolean z) {
        String m;
        h81 h81Var = l81Var.d;
        int i3 = l81Var.g;
        t81 t81Var = g81.j;
        if (h81Var.d.c(t81Var) && la0.q(l81Var)) {
            s30 s30Var = (s30) ((z0) l81Var.d.d(t81Var)).b;
            if (s30Var != null) {
                return ((Boolean) s30Var.a(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.y) && (m = m(l81Var)) != null) {
            if (i < 0 || i != i2 || i2 > m.length()) {
                i = -1;
            }
            this.y = i;
            boolean z2 = m.length() > 0;
            v(i(t(i3), z2 ? Integer.valueOf(this.y) : null, z2 ? Integer.valueOf(this.y) : null, z2 ? Integer.valueOf(m.length()) : null, m));
            z(i3);
            return true;
        }
        return false;
    }

    public final Rect F(float f, float f2, float f3, float f4) {
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        d4 d4Var = this.h;
        long s = d4Var.s((Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32));
        long s2 = d4Var.s((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (s >> 32);
        int i2 = (int) (s2 >> 32);
        int i3 = (int) (s & 4294967295L);
        int i4 = (int) (s2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
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
    public final void J() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int i3;
        char c2;
        fn0 fn0Var = new fn0();
        fn0 fn0Var2 = this.F;
        int[] iArr = fn0Var2.b;
        long[] jArr3 = fn0Var2.a;
        int length = jArr3.length - 2;
        en0 en0Var = this.L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i5];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            int i8 = iArr[(i5 << 3) + i7];
                            c2 = c3;
                            n81 n81Var = (n81) l().b(i8);
                            l81 l81Var = n81Var != null ? n81Var.a : null;
                            if (l81Var != null) {
                                if (l81Var.d.d.c(p81.d)) {
                                }
                            }
                            fn0Var.a(i8);
                            m81 m81Var = (m81) en0Var.b(i8);
                            if (m81Var != null) {
                                Object g = m81Var.a.d.g(p81.d);
                                r23 = g != 0 ? g : null;
                            }
                            y(r23, i8, 32);
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i7++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = fn0Var.b;
        long[] jArr4 = fn0Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr4[i9];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & j2) < j) {
                            int i12 = iArr2[(i9 << 3) + i11];
                            int hashCode = Integer.hashCode(i12) * (-862048943);
                            int i13 = hashCode ^ (hashCode << 16);
                            int i14 = i13 & 127;
                            int i15 = fn0Var2.c;
                            int i16 = (i13 >>> 7) & i15;
                            i = i4;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = fn0Var2.a;
                                int i18 = i16 >> 3;
                                jArr2 = jArr4;
                                int i19 = (i16 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i18] >>> i19) | ((jArr5[i18 + 1] << (64 - i19)) & ((-i19) >> 63));
                                int i20 = i15;
                                long j8 = (i14 * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    i3 = (i16 + (Long.numberOfTrailingZeros(j9) >> 3)) & i20;
                                    int i21 = i20;
                                    if (fn0Var2.b[i3] == i12) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i20 = i21;
                                }
                                i17 += 8;
                                i16 = (i16 + i17) & i2;
                                jArr4 = jArr2;
                                i15 = i2;
                                j6 = j4;
                            }
                            int i22 = i3;
                            if (i22 >= 0) {
                                fn0Var2.f(i22);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i4;
                        }
                        j6 = j4 >> i;
                        i11++;
                        i4 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i10 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                jArr4 = jArr;
                i4 = 8;
            }
        }
        en0Var.c();
        q90 l = l();
        int[] iArr3 = l.b;
        Object[] objArr = l.c;
        long[] jArr6 = l.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j10 = jArr6[i23];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j10 & j2) < j) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr3[i26];
                            l81 l81Var2 = ((n81) objArr[i26]).a;
                            h81 h81Var = l81Var2.d;
                            t81 t81Var = p81.d;
                            if (h81Var.d.c(t81Var) && fn0Var2.a(i27)) {
                                y((String) l81Var2.d.d(t81Var), i27, 16);
                            }
                            en0Var.h(i27, new m81(l81Var2, l()));
                        }
                        j10 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.M = new m81(this.h.getSemanticsOwner().a(), l());
    }

    @Override // defpackage.c1
    public final s40 a(View view) {
        return this.o;
    }

    public final void c(int i, o1 o1Var, String str, Bundle bundle) {
        l81 l81Var;
        int i2;
        float h;
        float h2;
        float g;
        float g2;
        int i3;
        d4 d4Var;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = o1Var.a;
        n81 n81Var = (n81) l().b(i);
        if (n81Var == null || (l81Var = n81Var.a) == null) {
            return;
        }
        jd0 jd0Var = l81Var.c;
        h81 h81Var = l81Var.d;
        vn0 vn0Var = h81Var.d;
        String m = m(l81Var);
        if (Intrinsics.a(str, this.I)) {
            int d = this.G.d(i);
            if (d != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d);
                return;
            }
            return;
        }
        if (Intrinsics.a(str, this.J)) {
            int d2 = this.H.d(i);
            if (d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d2);
                return;
            }
            return;
        }
        boolean c = vn0Var.c(g81.a);
        d4 d4Var2 = this.h;
        boolean z = false;
        if (!c || bundle == null || !Intrinsics.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            t81 t81Var = p81.x;
            if (vn0Var.c(t81Var) && bundle != null && Intrinsics.a(str, "androidx.compose.ui.semantics.testTag")) {
                Object g3 = vn0Var.g(t81Var);
                String str2 = (String) (g3 == null ? null : g3);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (Intrinsics.a(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo.getExtras().putInt(str, l81Var.g);
                return;
            }
            if (Intrinsics.a(str, "androidx.compose.ui.semantics.shapeType")) {
                Object g4 = vn0Var.g(p81.M);
                u91 u91Var = (u91) (g4 == null ? null : g4);
                if (u91Var != null) {
                    Rect rect = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect);
                    s11 n = n(l81Var, rect, u91Var);
                    float f = n.b;
                    float f2 = n.a;
                    ka0 a = u91Var.a(n.b(), jd0Var.D, d4Var2.getDensity());
                    if (a instanceof ht0) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", E(a, f2, f));
                        return;
                    } else if (a instanceof it0) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", E(a, f2, f));
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", G(a));
                        return;
                    } else if (!(a instanceof gt0)) {
                        l.a();
                        return;
                    } else {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", H(a, f2, f));
                        return;
                    }
                }
                return;
            }
            if (Intrinsics.a(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object g5 = vn0Var.g(p81.M);
                u91 u91Var2 = (u91) (g5 == null ? null : g5);
                if (u91Var2 != null) {
                    Rect rect2 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect2);
                    s11 n2 = n(l81Var, rect2, u91Var2);
                    Rect E = E(u91Var2.a(n2.b(), jd0Var.D, d4Var2.getDensity()), n2.a, n2.b);
                    if (E != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", E);
                        return;
                    }
                    return;
                }
                return;
            }
            if (Intrinsics.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object g6 = vn0Var.g(p81.M);
                u91 u91Var3 = (u91) (g6 == null ? null : g6);
                if (u91Var3 != null) {
                    Rect rect3 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect3);
                    float[] G = G(u91Var3.a(n(l81Var, rect3, u91Var3).b(), jd0Var.D, d4Var2.getDensity()));
                    if (G != null) {
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", G);
                        return;
                    }
                    return;
                }
                return;
            }
            if (Intrinsics.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object g7 = vn0Var.g(p81.M);
                u91 u91Var4 = (u91) (g7 == null ? null : g7);
                if (u91Var4 != null) {
                    Rect rect4 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect4);
                    s11 n3 = n(l81Var, rect4, u91Var4);
                    Region H = H(u91Var4.a(n3.b(), jd0Var.D, d4Var2.getDensity()), n3.a, n3.b);
                    if (H != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", H);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i5 > 0 && i4 >= 0) {
            if (i4 < (m != null ? m.length() : Integer.MAX_VALUE)) {
                hh1 y = gb0.y(h81Var);
                if (y == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i6 = 0;
                while (i6 < i5) {
                    int i7 = i4 + i6;
                    if (i7 >= y.a.a.e.length()) {
                        arrayList.add(z);
                        i2 = i4;
                        i3 = i5;
                        d4Var = d4Var2;
                    } else {
                        pl0 pl0Var = y.b;
                        y7 y7Var = (y7) ((o91) pl0Var.c).d;
                        if (i7 < 0 || i7 >= y7Var.e.length()) {
                            StringBuilder n4 = qy0.n("offset(", i7, ") is out of bounds [0, ");
                            n4.append(y7Var.e.length());
                            n4.append(')');
                            p80.a(n4.toString());
                        }
                        ArrayList arrayList2 = (ArrayList) pl0Var.e;
                        qu0 qu0Var = (qu0) arrayList2.get(ca0.k(i7, arrayList2));
                        x5 x5Var = qu0Var.a;
                        int a2 = qu0Var.a(i7);
                        CharSequence charSequence = x5Var.e;
                        if (a2 < 0 || a2 >= charSequence.length()) {
                            StringBuilder n5 = qy0.n("offset(", a2, ") is out of bounds [0,");
                            n5.append(charSequence.length());
                            n5.append(')');
                            p80.a(n5.toString());
                        }
                        fh1 fh1Var = x5Var.d;
                        Layout layout = fh1Var.e;
                        int lineForOffset = layout.getLineForOffset(a2);
                        float f3 = fh1Var.f(lineForOffset);
                        float d3 = fh1Var.d(lineForOffset);
                        i2 = i4;
                        boolean z2 = layout.getParagraphDirection(lineForOffset) == 1;
                        boolean isRtlCharAt = layout.isRtlCharAt(a2);
                        if (!z2 || isRtlCharAt) {
                            if (z2 && isRtlCharAt) {
                                g = fh1Var.h(a2, false);
                                g2 = fh1Var.h(a2 + 1, true);
                            } else if (isRtlCharAt) {
                                g = fh1Var.g(a2, false);
                                g2 = fh1Var.g(a2 + 1, true);
                            } else {
                                h = fh1Var.h(a2, false);
                                h2 = fh1Var.h(a2 + 1, true);
                            }
                            float f4 = g;
                            h = g2;
                            h2 = f4;
                        } else {
                            h = fh1Var.g(a2, false);
                            h2 = fh1Var.g(a2 + 1, true);
                        }
                        RectF rectF2 = new RectF(h, f3, h2, d3);
                        float f5 = rectF2.left;
                        float f6 = rectF2.top;
                        float f7 = rectF2.right;
                        float f8 = rectF2.bottom;
                        i3 = i5;
                        long floatToRawIntBits = (Float.floatToRawIntBits(qu0Var.f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                        d4Var = d4Var2;
                        int i8 = (int) (floatToRawIntBits >> 32);
                        int i9 = (int) (floatToRawIntBits & 4294967295L);
                        s11 s11Var = new s11(Float.intBitsToFloat(i8) + f5, Float.intBitsToFloat(i9) + f6, Float.intBitsToFloat(i8) + f7, Float.intBitsToFloat(i9) + f8);
                        qp0 d4 = l81Var.d();
                        long j = 0;
                        if (d4 != null) {
                            if (!d4.J0().r) {
                                d4 = null;
                            }
                            if (d4 != null) {
                                j = d4.M(0L);
                            }
                        }
                        s11 e = s11Var.e(j);
                        s11 g8 = l81Var.g();
                        if ((((((e.a > g8.c ? 1 : (e.a == g8.c ? 0 : -1)) < 0) & ((g8.a > e.c ? 1 : (g8.a == e.c ? 0 : -1)) < 0)) & ((e.b > g8.d ? 1 : (e.b == g8.d ? 0 : -1)) < 0)) & ((g8.b > e.d ? 1 : (g8.b == e.d ? 0 : -1)) < 0) ? e.c(g8) : null) != null) {
                            long s = d4Var.s((Float.floatToRawIntBits(r0.a) << 32) | (Float.floatToRawIntBits(r0.b) & 4294967295L));
                            long s2 = d4Var.s((Float.floatToRawIntBits(r0.d) & 4294967295L) | (Float.floatToRawIntBits(r0.c) << 32));
                            int i10 = (int) (s >> 32);
                            int i11 = (int) (s2 >> 32);
                            int i12 = (int) (s & 4294967295L);
                            int i13 = (int) (s2 & 4294967295L);
                            rectF = new RectF(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i6++;
                    i4 = i2;
                    i5 = i3;
                    d4Var2 = d4Var;
                    z = false;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect d(n81 n81Var) {
        x90 x90Var = n81Var.b;
        return F(x90Var.a, x90Var.b, x90Var.c, x90Var.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
    
        if (defpackage.mo.l(r5, r2) == r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005c, B:21:0x006e, B:23:0x0076, B:25:0x007f, B:27:0x0085, B:29:0x0094, B:31:0x009c, B:53:0x0046, B:55:0x004d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f1 -> B:14:0x00f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(fn fnVar) {
        h4 h4Var;
        int i;
        t9 t9Var;
        t9 t9Var2;
        fn0 fn0Var;
        ve veVar;
        fn0 fn0Var2;
        ve veVar2;
        int i2;
        long j;
        Object b;
        try {
            if (fnVar instanceof h4) {
                h4Var = (h4) fnVar;
                int i3 = h4Var.l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    h4Var.l = i3 - Integer.MIN_VALUE;
                    Object obj = h4Var.j;
                    tn tnVar = tn.d;
                    i = h4Var.l;
                    t9Var = this.A;
                    if (i != 0) {
                        ca0.v(obj);
                        fn0Var = new fn0();
                        we weVar = this.B;
                        weVar.getClass();
                        veVar = new ve(weVar);
                        h4Var.h = fn0Var;
                        h4Var.i = veVar;
                        h4Var.l = 1;
                        b = veVar.b(h4Var);
                        if (b != tnVar) {
                        }
                    } else if (i == 1) {
                        veVar2 = h4Var.i;
                        fn0Var2 = h4Var.h;
                        ca0.v(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        veVar2 = h4Var.i;
                        fn0Var2 = h4Var.h;
                        ca0.v(obj);
                        char c = 2;
                        t9Var2 = t9Var;
                        fn0Var = fn0Var2;
                        t9Var = t9Var2;
                        veVar = veVar2;
                        h4Var.h = fn0Var;
                        h4Var.i = veVar;
                        h4Var.l = 1;
                        b = veVar.b(h4Var);
                        if (b != tnVar) {
                            return tnVar;
                        }
                        ve veVar3 = veVar;
                        fn0Var2 = fn0Var;
                        obj = b;
                        veVar2 = veVar3;
                        if (((Boolean) obj).booleanValue()) {
                            t9Var.clear();
                            return Unit.a;
                        }
                        veVar2.c();
                        if (o()) {
                            int i4 = t9Var.g;
                            for (int i5 = 0; i5 < i4; i5++) {
                                jd0 jd0Var = (jd0) t9Var.e[i5];
                                B(jd0Var, fn0Var2);
                                C(jd0Var);
                            }
                            fn0Var2.d = 0;
                            long[] jArr = fn0Var2.a;
                            if (jArr != q61.a) {
                                try {
                                    w9.h(jArr, -9187201950435737472L);
                                    long[] jArr2 = fn0Var2.a;
                                    i2 = fn0Var2.c;
                                    int i6 = i2 >> 3;
                                    jArr2[i6] = ((~j) & jArr2[i6]) | j;
                                } catch (Throwable th) {
                                    th = th;
                                    t9Var2.clear();
                                    throw th;
                                }
                                j = 255 << ((i2 & 7) << 3);
                                t9Var2 = t9Var;
                            } else {
                                t9Var2 = t9Var;
                            }
                            fn0Var2.e = q61.a(fn0Var2.c) - fn0Var2.d;
                            if (!this.N) {
                                this.N = true;
                                this.n.post(this.P);
                            }
                        } else {
                            t9Var2 = t9Var;
                        }
                        t9Var2.clear();
                        this.u.c();
                        this.v.c();
                        long j2 = this.l;
                        h4Var.h = fn0Var2;
                        h4Var.i = veVar2;
                        c = 2;
                        h4Var.l = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            t9Var2 = t9Var;
        }
        h4Var = new h4(this, fnVar);
        Object obj2 = h4Var.j;
        tn tnVar2 = tn.d;
        i = h4Var.l;
        t9Var = this.A;
    }

    public final boolean f(boolean z, int i, long j) {
        t81 t81Var;
        int i2;
        if (Intrinsics.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            q90 l = l();
            if (!wq0.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    t81Var = p81.v;
                } else {
                    if (z) {
                        l.a();
                        return false;
                    }
                    t81Var = p81.u;
                }
                Object[] objArr = l.c;
                long[] jArr = l.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    n81 n81Var = (n81) objArr[(i3 << 3) + i6];
                                    x90 x90Var = n81Var.b;
                                    float f = x90Var.a;
                                    i2 = i4;
                                    float f2 = x90Var.b;
                                    float f3 = x90Var.c;
                                    float f4 = x90Var.d;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((intBitsToFloat2 < f4) & (intBitsToFloat >= f) & (intBitsToFloat < f3) & (intBitsToFloat2 >= f2)) {
                                        Object g = n81Var.a.d.d.g(t81Var);
                                        if (g == null) {
                                            g = null;
                                        }
                                        z61 z61Var = (z61) g;
                                        if (z61Var != null) {
                                            Function0 function0 = z61Var.a;
                                            if (i < 0) {
                                                if (((Number) function0.invoke()).floatValue() <= 0.0f) {
                                                }
                                                z2 = true;
                                            } else {
                                                if (((Number) function0.invoke()).floatValue() >= ((Number) z61Var.b.invoke()).floatValue()) {
                                                }
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void g() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (o()) {
                u(this.h.getSemanticsOwner().a(), this.M);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                A(l());
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

    public final AccessibilityEvent h(int i, int i2) {
        n81 n81Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        d4 d4Var = this.h;
        obtain.setPackageName(d4Var.getContext().getPackageName());
        obtain.setSource(d4Var, i);
        if (o() && (n81Var = (n81) l().b(i)) != null) {
            l81 l81Var = n81Var.a;
            obtain.setPassword(l81Var.d.d.c(p81.H));
            Object g = l81Var.d.d.g(p81.n);
            if (g == null) {
                g = null;
            }
            boolean a = Intrinsics.a(g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                d1.f(obtain, a);
            }
        }
        return obtain;
    }

    public final AccessibilityEvent i(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent h = h(i, 8192);
        if (num != null) {
            h.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            h.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            h.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            h.getText().add(charSequence);
        }
        return h;
    }

    public final int j(l81 l81Var) {
        h81 h81Var = l81Var.d;
        if (!h81Var.d.c(p81.a)) {
            t81 t81Var = p81.E;
            if (h81Var.d.c(t81Var)) {
                return (int) (((mh1) h81Var.d(t81Var)).a & 4294967295L);
            }
        }
        return this.y;
    }

    public final int k(l81 l81Var) {
        h81 h81Var = l81Var.d;
        if (!h81Var.d.c(p81.a)) {
            t81 t81Var = p81.E;
            if (h81Var.d.c(t81Var)) {
                return (int) (((mh1) h81Var.d(t81Var)).a >> 32);
            }
        }
        return this.y;
    }

    public final q90 l() {
        if (this.C) {
            this.C = false;
            d4 d4Var = this.h;
            this.E = m90.v(d4Var.getSemanticsOwner(), y3.g);
            if (o()) {
                en0 en0Var = this.E;
                Resources resources = d4Var.getContext().getResources();
                cn0 cn0Var = this.G;
                cn0Var.a();
                cn0 cn0Var2 = this.H;
                cn0Var2.a();
                n81 n81Var = (n81) en0Var.b(-1);
                l81 l81Var = n81Var != null ? n81Var.a : null;
                l81Var.getClass();
                ArrayList b = w81.b(l81Var, new a3(3, en0Var), new a3(4, resources), yh.b(l81Var));
                int i = 1;
                int size = b.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((l81) b.get(i - 1)).g;
                        int i3 = ((l81) b.get(i)).g;
                        cn0Var.f(i2, i3);
                        cn0Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.E;
    }

    public final s11 n(l81 l81Var, Rect rect, u91 u91Var) {
        i4 i4Var = new i4(u91Var);
        jd0 jd0Var = l81Var.c;
        zl0 zl0Var = (zl0) jd0Var.J.g;
        yq yqVar = null;
        if ((zl0Var.h & 8) != 0) {
            loop0: while (true) {
                if (zl0Var == null) {
                    break;
                }
                if ((zl0Var.g & 8) != 0) {
                    zl0 zl0Var2 = zl0Var;
                    eo0 eo0Var = null;
                    while (zl0Var2 != null) {
                        if (zl0Var2 instanceof j81) {
                            ((j81) zl0Var2).W(i4Var);
                            if (i4Var.d) {
                                yqVar = zl0Var2;
                                break loop0;
                            }
                        } else if ((zl0Var2.g & 8) != 0 && (zl0Var2 instanceof zq)) {
                            int i = 0;
                            for (zl0 zl0Var3 = ((zq) zl0Var2).t; zl0Var3 != null; zl0Var3 = zl0Var3.j) {
                                if ((zl0Var3.g & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        zl0Var2 = zl0Var3;
                                    } else {
                                        if (eo0Var == null) {
                                            eo0Var = new eo0(new zl0[16]);
                                        }
                                        if (zl0Var2 != null) {
                                            eo0Var.b(zl0Var2);
                                            zl0Var2 = null;
                                        }
                                        eo0Var.b(zl0Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        zl0Var2 = op.o(eo0Var);
                    }
                }
                if ((zl0Var.h & 8) == 0) {
                    break;
                }
                zl0Var = zl0Var.j;
            }
        }
        yq yqVar2 = (j81) yqVar;
        if (yqVar2 == null || !((zl0) yqVar2).d.r) {
            return t80.g((qp0) jd0Var.J.e, false);
        }
        qp0 H = op.H(yqVar2);
        s11 J = t80.n(H).J(H, true);
        Rect F = F(J.a, J.b, J.c, J.d);
        float f = F.left - rect.left;
        float f2 = F.top - rect.top;
        return new s11(f, f2, F.width() + f, F.height() + f2);
    }

    public final boolean o() {
        AccessibilityManager accessibilityManager = this.k;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> list = this.m;
        if (list == null) {
            list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.m = list;
        }
        return !list.isEmpty();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.m = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.m = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.k;
        if (accessibilityManager.isEnabled()) {
            this.m = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.n.removeCallbacks(this.P);
        AccessibilityManager accessibilityManager = this.k;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final void p(jd0 jd0Var) {
        if (this.A.add(jd0Var)) {
            this.B.s(Unit.a);
        }
    }

    public final int t(int i) {
        if (i == this.h.getSemanticsOwner().a().g) {
            return -1;
        }
        return i;
    }

    public final void u(l81 l81Var, m81 m81Var) {
        int[] iArr = aa0.a;
        fn0 fn0Var = new fn0();
        List j = l81.j(4, l81Var);
        jd0 jd0Var = l81Var.c;
        int size = j.size();
        for (int i = 0; i < size; i++) {
            l81 l81Var2 = (l81) j.get(i);
            q90 l = l();
            int i2 = l81Var2.g;
            if (l.a(i2)) {
                if (!m81Var.b.b(i2)) {
                    p(jd0Var);
                    return;
                }
                fn0Var.a(i2);
            }
        }
        fn0 fn0Var2 = m81Var.b;
        int[] iArr2 = fn0Var2.b;
        long[] jArr = fn0Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128 && !fn0Var.b(iArr2[(i3 << 3) + i5])) {
                            p(jd0Var);
                            return;
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List j3 = l81.j(4, l81Var);
        int size2 = j3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            l81 l81Var3 = (l81) j3.get(i6);
            m81 m81Var2 = (m81) this.L.b(l81Var3.g);
            if (m81Var2 != null && l().a(l81Var3.g)) {
                u(l81Var3, m81Var2);
            }
        }
    }

    public final boolean v(AccessibilityEvent accessibilityEvent) {
        if (!o()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.t = true;
        }
        try {
            return ((Boolean) this.j.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.t = false;
        }
    }

    public final boolean w(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !o()) {
            return false;
        }
        AccessibilityEvent h = h(i, i2);
        if (num != null) {
            h.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            h.setContentDescription(zh0.a(list, ",", null, 62));
        }
        return v(h);
    }

    public final void y(String str, int i, int i2) {
        AccessibilityEvent h = h(t(i), 32);
        h.setContentChangeTypes(i2);
        if (str != null) {
            h.getText().add(str);
        }
        v(h);
    }

    public final void z(int i) {
        g4 g4Var = this.D;
        if (g4Var != null) {
            l81 l81Var = g4Var.a;
            if (i != l81Var.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - g4Var.f <= 1000) {
                AccessibilityEvent h = h(t(l81Var.g), 131072);
                h.setFromIndex(g4Var.d);
                h.setToIndex(g4Var.e);
                h.setAction(g4Var.b);
                h.setMovementGranularity(g4Var.c);
                h.getText().add(m(l81Var));
                v(h);
            }
        }
        this.D = null;
    }
}
