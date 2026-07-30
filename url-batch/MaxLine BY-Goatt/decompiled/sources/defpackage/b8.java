package defpackage;

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
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.internal.Utility;
import com.google.firebase.encoders.json.BuildConfig;
import com.majelw.libystne.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b8 extends u1 {
    public static final ym1 Q;
    public boolean A;
    public y7 B;
    public zm1 C;
    public final an1 D;
    public final xm1 E;
    public final xm1 F;
    public final String G;
    public final String H;
    public final mh I;
    public final zm1 J;
    public bi2 K;
    public boolean L;
    public final xm1 M;
    public final k3 N;
    public final ArrayList O;
    public final a8 P;
    public final t7 d;
    public int e = Integer.MIN_VALUE;
    public final a8 f;
    public final AccessibilityManager g;
    public long h;
    public final u7 i;
    public final v7 j;
    public List k;
    public final Handler l;
    public final x7 m;
    public int n;
    public int o;
    public g2 p;
    public g2 q;
    public boolean r;
    public final zm1 s;
    public final zm1 t;
    public final yn2 u;
    public final yn2 v;
    public int w;
    public Integer x;
    public final ii y;
    public final lq z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i = p31.a;
        ym1 ym1Var = new ym1(32);
        int i2 = ym1Var.b;
        if (i2 < 0) {
            a.c(BuildConfig.FLAVOR);
            return;
        }
        int i3 = i2 + 32;
        ym1Var.b(i3);
        int[] iArr2 = ym1Var.a;
        int i4 = ym1Var.b;
        if (i2 != i4) {
            ni.d(i3, i2, i4, iArr2, iArr2);
        }
        ni.h(i2, 0, 12, iArr, iArr2);
        ym1Var.b += 32;
        Q = ym1Var;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [u7] */
    /* JADX WARN: Type inference failed for: r3v3, types: [v7] */
    public b8(t7 t7Var) {
        this.d = t7Var;
        int i = 0;
        this.f = new a8(this, i);
        Object systemService = t7Var.getContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.g = accessibilityManager;
        this.h = 100L;
        this.i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: u7
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                b8 b8Var = b8.this;
                b8Var.k = z ? b8Var.g.getEnabledAccessibilityServiceList(-1) : ah0.m;
            }
        };
        this.j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: v7
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                b8 b8Var = b8.this;
                b8Var.k = b8Var.g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.l = new Handler(Looper.getMainLooper());
        this.m = new x7(this);
        this.n = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.s = new zm1();
        this.t = new zm1();
        this.u = new yn2(0);
        this.v = new yn2(0);
        this.w = -1;
        this.y = new ii(0);
        this.z = s93.g(1, 6, null);
        this.A = true;
        zm1 zm1Var = r31.a;
        zm1Var.getClass();
        this.C = zm1Var;
        this.D = new an1();
        this.E = new xm1();
        this.F = new xm1();
        this.G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.I = new mh(29);
        this.J = new zm1();
        this.K = new bi2(t7Var.getSemanticsOwner().a(), zm1Var);
        int i2 = m31.a;
        this.M = new xm1();
        t7Var.addOnAttachStateChangeListener(new w7(i, this));
        this.N = new k3(3, this);
        this.O = new ArrayList();
        this.P = new a8(this, 1);
    }

    public static Rect G(bx1 bx1Var) {
        if (!(bx1Var instanceof zw1) && !(bx1Var instanceof ax1)) {
            return null;
        }
        w72 a = bx1Var.a();
        return new Rect((int) a.a, (int) a.b, (int) a.c, (int) a.d);
    }

    public static float[] H(bx1 bx1Var) {
        if (!(bx1Var instanceof ax1)) {
            return null;
        }
        ub2 ub2Var = ((ax1) bx1Var).a;
        long j = ub2Var.h;
        long j2 = ub2Var.g;
        long j3 = ub2Var.f;
        long j4 = ub2Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region I(bx1 bx1Var) {
        if (bx1Var instanceof yw1) {
            yw1 yw1Var = (yw1) bx1Var;
            w72 a = yw1Var.a();
            Region region = new Region(new Rect((int) a.a, (int) a.b, (int) a.c, (int) a.d));
            Region region2 = new Region();
            oa oaVar = yw1Var.a;
            if (oaVar instanceof oa) {
                region2.setPath(oaVar.a, region);
                return region2;
            }
            ch2.h("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence J(CharSequence charSequence) {
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

    public static String p(ai2 ai2Var) {
        yd ydVar;
        if (ai2Var != null) {
            sh2 sh2Var = ai2Var.d;
            tn1 tn1Var = sh2Var.m;
            ji2 ji2Var = gi2.a;
            if (tn1Var.c(ji2Var)) {
                return ze1.a((List) sh2Var.b(ji2Var), ",", null, 62);
            }
            ji2 ji2Var2 = gi2.E;
            if (tn1Var.c(ji2Var2)) {
                Object g = tn1Var.g(ji2Var2);
                if (g == null) {
                    g = null;
                }
                yd ydVar2 = (yd) g;
                if (ydVar2 != null) {
                    return ydVar2.n;
                }
            } else {
                Object g2 = tn1Var.g(gi2.A);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null && (ydVar = (yd) zv.v(list)) != null) {
                    return ydVar.n;
                }
            }
        }
        return null;
    }

    public static final boolean s(ye2 ye2Var, float f) {
        Function0 function0 = ye2Var.a;
        if (f >= 0.0f || ((Number) function0.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) function0.invoke()).floatValue() < ((Number) ye2Var.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean t(ye2 ye2Var) {
        Function0 function0 = ye2Var.a;
        if (((Number) function0.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        ((Number) ye2Var.b.invoke()).floatValue();
        return false;
    }

    public static final boolean u(ye2 ye2Var) {
        Function0 function0 = ye2Var.a;
        if (((Number) function0.invoke()).floatValue() < ((Number) ye2Var.b.invoke()).floatValue()) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        return false;
    }

    public static /* synthetic */ void z(b8 b8Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        b8Var.y(i, i2, num, null);
    }

    public final void A(String str, int i, int i2) {
        AccessibilityEvent j = j(v(i), 32);
        j.setContentChangeTypes(i2);
        if (str != null) {
            j.getText().add(str);
        }
        x(j);
    }

    public final void B(int i) {
        y7 y7Var = this.B;
        if (y7Var != null) {
            ai2 ai2Var = y7Var.a;
            if (i != ai2Var.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - y7Var.f <= 1000) {
                AccessibilityEvent j = j(v(ai2Var.g), 131072);
                j.setFromIndex(y7Var.d);
                j.setToIndex(y7Var.e);
                j.setAction(y7Var.b);
                j.setMovementGranularity(y7Var.c);
                j.getText().add(p(ai2Var));
                x(j);
            }
        }
        this.B = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x0515, code lost:
    
        if (r12 != null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x051a, code lost:
    
        if (r12 == null) goto L242;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(q31 q31Var) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        Integer num;
        int i;
        int i2;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        int i5;
        int i6;
        Integer num2;
        sh2 sh2Var;
        ai2 ai2Var;
        boolean z;
        int i7;
        boolean z2;
        boolean z3;
        tn1 tn1Var;
        i91 i91Var;
        int i8;
        sh2 sh2Var2;
        ArrayList arrayList3;
        long j;
        int i9;
        int i10;
        int i11;
        i91 i91Var2;
        Integer num3;
        int i12;
        tn1 tn1Var2;
        int i13;
        int i14;
        ef2 ef2Var;
        boolean z4;
        ef2 ef2Var2;
        int i15;
        String str;
        int i16;
        int i17;
        int i18;
        tn1 tn1Var3;
        Integer num4;
        AccessibilityEvent l;
        Integer num5;
        q31 q31Var2 = q31Var;
        ArrayList arrayList4 = this.O;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = q31Var2.b;
        long[] jArr3 = q31Var2.a;
        int i19 = 2;
        int length = jArr3.length - 2;
        int i20 = 0;
        Integer num6 = 0;
        if (length < 0) {
            return;
        }
        int i21 = 0;
        while (true) {
            long j2 = jArr3[i21];
            int i22 = i19;
            int i23 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i24 = 8;
                int i25 = 8 - ((~(i21 - i23)) >>> 31);
                long j3 = j2;
                int i26 = i20;
                while (i26 < i25) {
                    if ((j3 & 255) < 128) {
                        int i27 = iArr3[(i21 << 3) + i26];
                        bi2 bi2Var = (bi2) this.J.b(i27);
                        if (bi2Var != null) {
                            sh2 sh2Var3 = bi2Var.a;
                            tn1 tn1Var4 = sh2Var3.m;
                            di2 di2Var = (di2) q31Var2.b(i27);
                            int i28 = i24;
                            ai2 ai2Var2 = di2Var != null ? di2Var.a : null;
                            if (ai2Var2 == null) {
                                throw q40.f("no value for specified key");
                            }
                            i91 i91Var3 = ai2Var2.c;
                            sh2 sh2Var4 = ai2Var2.d;
                            iArr2 = iArr3;
                            int i29 = ai2Var2.g;
                            jArr2 = jArr3;
                            tn1 tn1Var5 = sh2Var4.m;
                            i5 = i21;
                            Object[] objArr = tn1Var5.b;
                            Object[] objArr2 = tn1Var5.c;
                            long[] jArr4 = tn1Var5.a;
                            i2 = i26;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                i91 i91Var4 = i91Var3;
                                i4 = i25;
                                int i30 = 0;
                                z2 = false;
                                while (true) {
                                    long j4 = jArr4[i30];
                                    ai2Var = ai2Var2;
                                    int i31 = i30;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i32 = 8 - ((~(i31 - length2)) >>> 31);
                                        int i33 = 0;
                                        while (i33 < i32) {
                                            if ((j4 & 255) < 128) {
                                                int i34 = (i31 << 3) + i33;
                                                Object obj = objArr[i34];
                                                int i35 = length2;
                                                Object obj2 = objArr2[i34];
                                                sh2Var2 = sh2Var3;
                                                ji2 ji2Var = (ji2) obj;
                                                j = j4;
                                                ji2 ji2Var2 = gi2.t;
                                                if (Intrinsics.b(ji2Var, ji2Var2) || Intrinsics.b(ji2Var, gi2.u)) {
                                                    int size = arrayList5.size();
                                                    i10 = i33;
                                                    int i36 = 0;
                                                    while (true) {
                                                        if (i36 >= size) {
                                                            ef2Var = null;
                                                            break;
                                                        }
                                                        int i37 = size;
                                                        if (((ef2) arrayList5.get(i36)).m == i27) {
                                                            ef2Var = (ef2) arrayList5.get(i36);
                                                            break;
                                                        } else {
                                                            i36++;
                                                            size = i37;
                                                        }
                                                    }
                                                    if (ef2Var != null) {
                                                        z4 = false;
                                                    } else {
                                                        ef2Var = new ef2(i27, arrayList4);
                                                        z4 = true;
                                                    }
                                                    arrayList4.add(ef2Var);
                                                } else {
                                                    i10 = i33;
                                                    z4 = false;
                                                }
                                                if (!z4) {
                                                    Object g = tn1Var4.g(ji2Var);
                                                    if (g == null) {
                                                        g = null;
                                                    }
                                                    if (Intrinsics.b(obj2, g)) {
                                                        i12 = i27;
                                                        arrayList3 = arrayList5;
                                                        i9 = i32;
                                                        i11 = i22;
                                                        i13 = i28;
                                                        i91Var2 = i91Var4;
                                                        num3 = num6;
                                                        tn1Var2 = tn1Var4;
                                                        i14 = i35;
                                                    }
                                                }
                                                ji2 ji2Var3 = gi2.d;
                                                if (Intrinsics.b(ji2Var, ji2Var3)) {
                                                    obj2.getClass();
                                                    String str2 = (String) obj2;
                                                    if (tn1Var4.c(ji2Var3)) {
                                                        A(str2, i27, i28);
                                                    }
                                                    Unit unit = Unit.a;
                                                    i12 = i27;
                                                    arrayList3 = arrayList5;
                                                    i9 = i32;
                                                    i11 = i22;
                                                    i91Var2 = i91Var4;
                                                    i13 = 8;
                                                    num3 = num6;
                                                    tn1Var2 = tn1Var4;
                                                    i14 = i35;
                                                } else if (Intrinsics.b(ji2Var, gi2.b) || Intrinsics.b(ji2Var, gi2.I)) {
                                                    i12 = i27;
                                                    arrayList3 = arrayList5;
                                                    i9 = i32;
                                                    i11 = i22;
                                                    i91Var2 = i91Var4;
                                                    num3 = num6;
                                                    tn1Var2 = tn1Var4;
                                                    i14 = i35;
                                                    i13 = 8;
                                                    z(this, v(i12), 2048, 64, 8);
                                                    z(this, v(i12), 2048, num3, 8);
                                                } else if (Intrinsics.b(ji2Var, gi2.c)) {
                                                    z(this, v(i27), 2048, 64, 8);
                                                    z(this, v(i27), 2048, num6, 8);
                                                    i12 = i27;
                                                    arrayList3 = arrayList5;
                                                    i13 = 8;
                                                    i9 = i32;
                                                    i11 = i22;
                                                    i91Var2 = i91Var4;
                                                    num3 = num6;
                                                    tn1Var2 = tn1Var4;
                                                    i14 = i35;
                                                } else {
                                                    ji2 ji2Var4 = gi2.H;
                                                    arrayList3 = arrayList5;
                                                    if (Intrinsics.b(ji2Var, ji2Var4)) {
                                                        Object g2 = tn1Var5.g(gi2.x);
                                                        if (g2 == null) {
                                                            g2 = null;
                                                        }
                                                        fb2 fb2Var = (fb2) g2;
                                                        if (fb2Var != null && fb2Var.a == 4) {
                                                            Object g3 = tn1Var5.g(ji2Var4);
                                                            if (g3 == null) {
                                                                g3 = null;
                                                            }
                                                            if (Intrinsics.b(g3, Boolean.TRUE)) {
                                                                AccessibilityEvent j5 = j(v(i27), 4);
                                                                ai2 ai2Var3 = ai2Var;
                                                                i91Var2 = i91Var4;
                                                                ai2 ai2Var4 = new ai2(ai2Var3.a, true, i91Var2, sh2Var4);
                                                                Object g4 = ai2Var4.k().m.g(gi2.a);
                                                                if (g4 == null) {
                                                                    g4 = null;
                                                                }
                                                                List list = (List) g4;
                                                                ai2Var = ai2Var3;
                                                                String a = list != null ? ze1.a(list, ",", null, 62) : null;
                                                                Object g5 = ai2Var4.k().m.g(gi2.A);
                                                                if (g5 == null) {
                                                                    g5 = null;
                                                                }
                                                                List list2 = (List) g5;
                                                                i9 = i32;
                                                                String a2 = list2 != null ? ze1.a(list2, ",", null, 62) : null;
                                                                if (a != null) {
                                                                    j5.setContentDescription(a);
                                                                    Unit unit2 = Unit.a;
                                                                }
                                                                if (a2 != null) {
                                                                    j5.getText().add(a2);
                                                                }
                                                                x(j5);
                                                            } else {
                                                                i9 = i32;
                                                                i91Var2 = i91Var4;
                                                                z(this, v(i27), 2048, num6, 8);
                                                            }
                                                        } else {
                                                            i9 = i32;
                                                            i91Var2 = i91Var4;
                                                            z(this, v(i27), 2048, 64, 8);
                                                            z(this, v(i27), 2048, num6, 8);
                                                        }
                                                        num3 = num6;
                                                        i12 = i27;
                                                        tn1Var2 = tn1Var4;
                                                        i11 = i22;
                                                        i14 = i35;
                                                        i13 = 8;
                                                    } else {
                                                        i9 = i32;
                                                        i91Var2 = i91Var4;
                                                        if (Intrinsics.b(ji2Var, gi2.a)) {
                                                            int v = v(i27);
                                                            obj2.getClass();
                                                            y(v, 2048, 4, (List) obj2);
                                                            num3 = num6;
                                                            i12 = i27;
                                                            tn1Var2 = tn1Var4;
                                                        } else {
                                                            ji2 ji2Var5 = gi2.E;
                                                            boolean b = Intrinsics.b(ji2Var, ji2Var5);
                                                            String str3 = BuildConfig.FLAVOR;
                                                            if (!b) {
                                                                Integer num7 = num6;
                                                                i12 = i27;
                                                                tn1Var2 = tn1Var4;
                                                                ji2 ji2Var6 = gi2.F;
                                                                if (Intrinsics.b(ji2Var, ji2Var6)) {
                                                                    Object g6 = tn1Var5.g(ji2Var5);
                                                                    if (g6 == null) {
                                                                        g6 = null;
                                                                    }
                                                                    yd ydVar = (yd) g6;
                                                                    if (ydVar != null && (str = ydVar.n) != null) {
                                                                        str3 = str;
                                                                    }
                                                                    long j6 = ((jw2) sh2Var4.b(ji2Var6)).a;
                                                                    num3 = num7;
                                                                    x(l(v(i12), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str3.length()), J(str3)));
                                                                    B(i29);
                                                                    Unit unit3 = Unit.a;
                                                                } else {
                                                                    i14 = i35;
                                                                    num3 = num7;
                                                                    if (Intrinsics.b(ji2Var, ji2Var2) || Intrinsics.b(ji2Var, gi2.u)) {
                                                                        r(i91Var2);
                                                                        int size2 = arrayList4.size();
                                                                        int i38 = 0;
                                                                        while (true) {
                                                                            if (i38 >= size2) {
                                                                                ef2Var2 = null;
                                                                                break;
                                                                            } else {
                                                                                if (((ef2) arrayList4.get(i38)).m == i12) {
                                                                                    ef2Var2 = (ef2) arrayList4.get(i38);
                                                                                    break;
                                                                                }
                                                                                i38++;
                                                                            }
                                                                        }
                                                                        ef2Var2.getClass();
                                                                        Object g7 = tn1Var5.g(ji2Var2);
                                                                        if (g7 == null) {
                                                                            g7 = null;
                                                                        }
                                                                        ef2Var2.q = (ye2) g7;
                                                                        Object g8 = tn1Var5.g(gi2.u);
                                                                        if (g8 == null) {
                                                                            g8 = null;
                                                                        }
                                                                        ef2Var2.r = (ye2) g8;
                                                                        if (ef2Var2.n.contains(ef2Var2)) {
                                                                            i11 = i22;
                                                                            this.d.getSnapshotObserver().a(ef2Var2, this.P, new k7(i11, ef2Var2, this));
                                                                        } else {
                                                                            i11 = i22;
                                                                        }
                                                                        Unit unit4 = Unit.a;
                                                                    } else if (Intrinsics.b(ji2Var, gi2.k)) {
                                                                        obj2.getClass();
                                                                        if (((Boolean) obj2).booleanValue()) {
                                                                            i15 = 8;
                                                                            x(j(v(i29), 8));
                                                                        } else {
                                                                            i15 = 8;
                                                                        }
                                                                        z(this, v(i29), 2048, num3, i15);
                                                                        i13 = i15;
                                                                        i11 = i22;
                                                                    } else {
                                                                        ji2 ji2Var7 = rh2.w;
                                                                        if (Intrinsics.b(ji2Var, ji2Var7)) {
                                                                            List list3 = (List) sh2Var4.b(ji2Var7);
                                                                            Object g9 = tn1Var2.g(ji2Var7);
                                                                            if (g9 == null) {
                                                                                g9 = null;
                                                                            }
                                                                            List list4 = (List) g9;
                                                                            if (list4 != null) {
                                                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                if (list3.size() > 0) {
                                                                                    list3.get(0).getClass();
                                                                                    b71.o();
                                                                                    return;
                                                                                }
                                                                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                if (list4.size() > 0) {
                                                                                    list4.get(0).getClass();
                                                                                    b71.o();
                                                                                    return;
                                                                                }
                                                                                z2 = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                                                            } else if (!list3.isEmpty()) {
                                                                                z2 = true;
                                                                            }
                                                                            Unit unit5 = Unit.a;
                                                                        } else {
                                                                            if (obj2 instanceof r1) {
                                                                                r1 r1Var = (r1) obj2;
                                                                                Object g10 = tn1Var2.g(ji2Var);
                                                                                if (g10 == null) {
                                                                                    g10 = null;
                                                                                }
                                                                                if (r1Var != g10) {
                                                                                    if (g10 instanceof r1) {
                                                                                        String str4 = r1Var.a;
                                                                                        r1 r1Var2 = (r1) g10;
                                                                                        tt0 tt0Var = r1Var2.b;
                                                                                        if (Intrinsics.b(str4, r1Var2.a)) {
                                                                                            tt0 tt0Var2 = r1Var.b;
                                                                                            if (tt0Var2 == null) {
                                                                                            }
                                                                                            if (tt0Var2 != null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                z2 = false;
                                                                                Unit unit6 = Unit.a;
                                                                            }
                                                                            z2 = true;
                                                                            Unit unit62 = Unit.a;
                                                                        }
                                                                        i11 = i22;
                                                                    }
                                                                    i13 = 8;
                                                                }
                                                            } else if (tn1Var5.c(rh2.j)) {
                                                                Object g11 = tn1Var4.g(ji2Var5);
                                                                if (g11 == null) {
                                                                    g11 = null;
                                                                }
                                                                yd ydVar2 = (yd) g11;
                                                                if (ydVar2 == null) {
                                                                    ydVar2 = BuildConfig.FLAVOR;
                                                                }
                                                                Object g12 = tn1Var5.g(ji2Var5);
                                                                if (g12 == null) {
                                                                    g12 = null;
                                                                }
                                                                CharSequence charSequence = (yd) g12;
                                                                if (charSequence == null) {
                                                                    charSequence = BuildConfig.FLAVOR;
                                                                }
                                                                CharSequence J = J(charSequence);
                                                                int length3 = ydVar2.length();
                                                                int length4 = charSequence.length();
                                                                int i39 = length3 > length4 ? length4 : length3;
                                                                Integer num8 = num6;
                                                                int i40 = 0;
                                                                while (true) {
                                                                    i16 = length3;
                                                                    if (i40 >= i39) {
                                                                        i17 = length4;
                                                                        break;
                                                                    }
                                                                    i17 = length4;
                                                                    if (ydVar2.charAt(i40) != charSequence.charAt(i40)) {
                                                                        break;
                                                                    }
                                                                    i40++;
                                                                    length3 = i16;
                                                                    length4 = i17;
                                                                }
                                                                int i41 = 0;
                                                                while (true) {
                                                                    if (i41 >= i39 - i40) {
                                                                        i18 = i41;
                                                                        break;
                                                                    }
                                                                    i18 = i41;
                                                                    if (ydVar2.charAt((i16 - 1) - i41) != charSequence.charAt((i17 - 1) - i18)) {
                                                                        break;
                                                                    } else {
                                                                        i41 = i18 + 1;
                                                                    }
                                                                }
                                                                int i42 = (i16 - i18) - i40;
                                                                int i43 = (i17 - i18) - i40;
                                                                ji2 ji2Var8 = gi2.J;
                                                                boolean c = tn1Var4.c(ji2Var8);
                                                                boolean c2 = tn1Var5.c(ji2Var8);
                                                                boolean c3 = tn1Var4.c(gi2.E);
                                                                boolean z5 = c3 && !c && c2;
                                                                boolean z6 = c3 && c && !c2;
                                                                if (z5 || z6) {
                                                                    tn1Var3 = tn1Var4;
                                                                    i12 = i27;
                                                                    num4 = num8;
                                                                    l = l(v(i27), num4, num8, Integer.valueOf(i17), J);
                                                                } else {
                                                                    tn1Var3 = tn1Var4;
                                                                    l = j(v(i27), 16);
                                                                    l.setFromIndex(i40);
                                                                    l.setRemovedCount(i42);
                                                                    l.setAddedCount(i43);
                                                                    l.setBeforeText(ydVar2);
                                                                    l.getText().add(J);
                                                                    i12 = i27;
                                                                    num4 = num8;
                                                                }
                                                                l.setClassName("android.widget.EditText");
                                                                x(l);
                                                                if (z5 || z6) {
                                                                    long j7 = ((jw2) sh2Var4.b(gi2.F)).a;
                                                                    num5 = num4;
                                                                    l.setFromIndex((int) (j7 >> 32));
                                                                    l.setToIndex((int) (j7 & 4294967295L));
                                                                    x(l);
                                                                } else {
                                                                    num5 = num4;
                                                                }
                                                                Unit unit7 = Unit.a;
                                                                i11 = i22;
                                                                i14 = i35;
                                                                num3 = num5;
                                                                tn1Var2 = tn1Var3;
                                                                i13 = 8;
                                                            } else {
                                                                Integer num9 = num6;
                                                                i12 = i27;
                                                                z(this, v(i12), 2048, Integer.valueOf(i22), 8);
                                                                i13 = 8;
                                                                i11 = i22;
                                                                i14 = i35;
                                                                num3 = num9;
                                                                tn1Var2 = tn1Var4;
                                                            }
                                                        }
                                                        i11 = i22;
                                                        i14 = i35;
                                                        i13 = 8;
                                                    }
                                                }
                                            } else {
                                                sh2Var2 = sh2Var3;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i9 = i32;
                                                i10 = i33;
                                                i11 = i22;
                                                i91Var2 = i91Var4;
                                                num3 = num6;
                                                i12 = i27;
                                                tn1Var2 = tn1Var4;
                                                i13 = i28;
                                                i14 = length2;
                                            }
                                            long j8 = j >> i13;
                                            i28 = i13;
                                            i22 = i11;
                                            i27 = i12;
                                            i91Var4 = i91Var2;
                                            i33 = i10 + 1;
                                            length2 = i14;
                                            j4 = j8;
                                            num6 = num3;
                                            tn1Var4 = tn1Var2;
                                            i32 = i9;
                                            sh2Var3 = sh2Var2;
                                            arrayList5 = arrayList3;
                                        }
                                        i7 = i27;
                                        sh2Var = sh2Var3;
                                        arrayList2 = arrayList5;
                                        i6 = i22;
                                        i91Var = i91Var4;
                                        z = true;
                                        num2 = num6;
                                        i8 = length2;
                                        int i44 = i32;
                                        tn1Var = tn1Var4;
                                        if (i44 != i28) {
                                            break;
                                        }
                                    } else {
                                        i7 = i27;
                                        sh2Var = sh2Var3;
                                        tn1Var = tn1Var4;
                                        arrayList2 = arrayList5;
                                        i6 = i22;
                                        i91Var = i91Var4;
                                        z = true;
                                        num2 = num6;
                                        i8 = length2;
                                    }
                                    if (i31 == i8) {
                                        break;
                                    }
                                    i22 = i6;
                                    i27 = i7;
                                    tn1Var4 = tn1Var;
                                    i91Var4 = i91Var;
                                    ai2Var2 = ai2Var;
                                    sh2Var3 = sh2Var;
                                    i28 = 8;
                                    i30 = i31 + 1;
                                    length2 = i8;
                                    num6 = num2;
                                    arrayList5 = arrayList2;
                                }
                            } else {
                                sh2Var = sh2Var3;
                                arrayList2 = arrayList5;
                                i4 = i25;
                                ai2Var = ai2Var2;
                                i6 = i22;
                                z = true;
                                num2 = num6;
                                i7 = i27;
                                z2 = false;
                            }
                            if (!z2) {
                                Iterator it = sh2Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z3 = false;
                                        break;
                                    } else {
                                        if (!ai2Var.k().m.c((ji2) ((Map.Entry) it.next()).getKey())) {
                                            z3 = z;
                                            break;
                                        }
                                    }
                                }
                                z2 = z3;
                            }
                            if (z2) {
                                i3 = 8;
                                z(this, v(i7), 2048, num2, 8);
                            } else {
                                i3 = 8;
                            }
                            j3 >>= i3;
                            i26 = i2 + 1;
                            q31Var2 = q31Var;
                            num6 = num2;
                            i22 = i6;
                            iArr3 = iArr2;
                            jArr3 = jArr2;
                            i21 = i5;
                            i25 = i4;
                            arrayList5 = arrayList2;
                            i24 = i3;
                        }
                    }
                    i2 = i26;
                    arrayList2 = arrayList5;
                    iArr2 = iArr3;
                    jArr2 = jArr3;
                    i3 = i24;
                    i4 = i25;
                    i5 = i21;
                    i6 = i22;
                    num2 = num6;
                    j3 >>= i3;
                    i26 = i2 + 1;
                    q31Var2 = q31Var;
                    num6 = num2;
                    i22 = i6;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i21 = i5;
                    i25 = i4;
                    arrayList5 = arrayList2;
                    i24 = i3;
                }
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i45 = i24;
                int i46 = i21;
                i19 = i22;
                num = num6;
                if (i25 != i45) {
                    return;
                } else {
                    i = i46;
                }
            } else {
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i19 = i22;
                num = num6;
                i = i21;
            }
            if (i == i23) {
                return;
            }
            i21 = i + 1;
            q31Var2 = q31Var;
            length = i23;
            num6 = num;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            i20 = 0;
        }
    }

    public final void D(i91 i91Var, an1 an1Var) {
        sh2 w;
        if (i91Var.I() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(i91Var)) {
            i91 i91Var2 = null;
            if (!i91Var.P.d(8)) {
                i91Var = i91Var.u();
                while (true) {
                    if (i91Var == null) {
                        i91Var = null;
                        break;
                    } else if (i91Var.P.d(8)) {
                        break;
                    } else {
                        i91Var = i91Var.u();
                    }
                }
            }
            if (i91Var == null || (w = i91Var.w()) == null) {
                return;
            }
            if (!w.o) {
                i91 u = i91Var.u();
                while (true) {
                    if (u != null) {
                        sh2 w2 = u.w();
                        if (w2 != null && w2.o) {
                            i91Var2 = u;
                            break;
                        }
                        u = u.u();
                    } else {
                        break;
                    }
                }
                if (i91Var2 != null) {
                    i91Var = i91Var2;
                }
            }
            int i = i91Var.n;
            if (an1Var.a(i)) {
                z(this, v(i), 2048, 1, 8);
            }
        }
    }

    public final void E(i91 i91Var) {
        if (i91Var.I() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(i91Var)) {
            int i = i91Var.n;
            ye2 ye2Var = (ye2) this.s.b(i);
            ye2 ye2Var2 = (ye2) this.t.b(i);
            if (ye2Var == null && ye2Var2 == null) {
                return;
            }
            AccessibilityEvent j = j(i, 4096);
            if (ye2Var != null) {
                j.setScrollX((int) ((Number) ye2Var.a.invoke()).floatValue());
                j.setMaxScrollX((int) ((Number) ye2Var.b.invoke()).floatValue());
            }
            if (ye2Var2 != null) {
                j.setScrollY((int) ((Number) ye2Var2.a.invoke()).floatValue());
                j.setMaxScrollY((int) ((Number) ye2Var2.b.invoke()).floatValue());
            }
            x(j);
        }
    }

    public final boolean F(ai2 ai2Var, int i, int i2, boolean z) {
        String p;
        sh2 sh2Var = ai2Var.d;
        int i3 = ai2Var.g;
        ji2 ji2Var = rh2.i;
        if (sh2Var.m.c(ji2Var) && ll3.f(ai2Var)) {
            xt0 xt0Var = (xt0) ((r1) ai2Var.d.b(ji2Var)).b;
            if (xt0Var != null) {
                return ((Boolean) xt0Var.a(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.w) && (p = p(ai2Var)) != null) {
            if (i < 0 || i != i2 || i2 > p.length()) {
                i = -1;
            }
            this.w = i;
            boolean z2 = p.length() > 0;
            x(l(v(i3), z2 ? Integer.valueOf(this.w) : null, z2 ? Integer.valueOf(this.w) : null, z2 ? Integer.valueOf(p.length()) : null, p));
            B(i3);
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
    public final void K() {
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
        an1 an1Var = new an1();
        an1 an1Var2 = this.D;
        int[] iArr = an1Var2.b;
        long[] jArr3 = an1Var2.a;
        int length = jArr3.length - 2;
        zm1 zm1Var = this.J;
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
                            di2 di2Var = (di2) o().b(i8);
                            ai2 ai2Var = di2Var != null ? di2Var.a : null;
                            if (ai2Var != null) {
                                if (ai2Var.d.m.c(gi2.d)) {
                                }
                            }
                            an1Var.a(i8);
                            bi2 bi2Var = (bi2) zm1Var.b(i8);
                            if (bi2Var != null) {
                                Object g = bi2Var.a.m.g(gi2.d);
                                r23 = g != 0 ? g : null;
                            }
                            A(r23, i8, 32);
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
        int[] iArr2 = an1Var.b;
        long[] jArr4 = an1Var.a;
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
                            int i15 = an1Var2.c;
                            int i16 = (i13 >>> 7) & i15;
                            i = i4;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = an1Var2.a;
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
                                    if (an1Var2.b[i3] == i12) {
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
                                an1Var2.f(i22);
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
        zm1Var.c();
        q31 o = o();
        int[] iArr3 = o.b;
        Object[] objArr = o.c;
        long[] jArr6 = o.a;
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
                            ai2 ai2Var2 = ((di2) objArr[i26]).a;
                            sh2 sh2Var = ai2Var2.d;
                            ji2 ji2Var = gi2.d;
                            if (sh2Var.m.c(ji2Var) && an1Var2.a(i27)) {
                                A((String) ai2Var2.d.b(ji2Var), i27, 16);
                            }
                            zm1Var.h(i27, new bi2(ai2Var2, o()));
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
        this.K = new bi2(this.d.getSemanticsOwner().a(), o());
    }

    @Override // defpackage.u1
    public final ar0 a(View view) {
        return this.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i, g2 g2Var, String str, Bundle bundle) {
        ai2 ai2Var;
        Region I;
        float[] H;
        Rect G;
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i2;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo2 = g2Var.a;
        di2 di2Var = (di2) o().b(i);
        if (di2Var == null || (ai2Var = di2Var.a) == null) {
            return;
        }
        sh2 sh2Var = ai2Var.d;
        tn1 tn1Var = sh2Var.m;
        String p = p(ai2Var);
        if (Intrinsics.b(str, this.G)) {
            int d = this.E.d(i);
            if (d != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, d);
                return;
            }
            return;
        }
        if (Intrinsics.b(str, this.H)) {
            int d2 = this.F.d(i);
            if (d2 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, d2);
                return;
            }
            return;
        }
        ks1 ks1Var = null;
        if (tn1Var.c(rh2.a) && bundle != null && Intrinsics.b(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i4 > 0 && i3 >= 0) {
                if (i3 < (p != null ? p.length() : Integer.MAX_VALUE)) {
                    bw2 m = mi2.m(sh2Var);
                    if (m == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i3 + i5;
                        if (i6 >= m.a.a.n.length()) {
                            arrayList.add(ks1Var);
                            accessibilityNodeInfo = accessibilityNodeInfo2;
                            i2 = i4;
                        } else {
                            w72 b = m.b(i6);
                            ks1 d3 = ai2Var.d();
                            long j = 0;
                            if (d3 != null) {
                                if (!d3.Q0().z) {
                                    d3 = ks1Var;
                                }
                                if (d3 != null) {
                                    j = d3.T(0L);
                                }
                            }
                            w72 g = b.g(j);
                            w72 g2 = ai2Var.g();
                            if ((g.e(g2) ? g.c(g2) : ks1Var) != 0) {
                                t7 t7Var = this.d;
                                long u = t7Var.u((Float.floatToRawIntBits(r10.b) & 4294967295L) | (Float.floatToRawIntBits(r10.a) << 32));
                                long u2 = t7Var.u((Float.floatToRawIntBits(r10.c) << 32) | (Float.floatToRawIntBits(r10.d) & 4294967295L));
                                int i7 = (int) (u >> 32);
                                int i8 = (int) (u2 >> 32);
                                accessibilityNodeInfo = accessibilityNodeInfo2;
                                i2 = i4;
                                int i9 = (int) (u & 4294967295L);
                                int i10 = (int) (u2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)));
                            } else {
                                accessibilityNodeInfo = accessibilityNodeInfo2;
                                i2 = i4;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i5++;
                        i4 = i2;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        ks1Var = null;
                    }
                    accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        ji2 ji2Var = gi2.y;
        if (tn1Var.c(ji2Var) && bundle != null && Intrinsics.b(str, "androidx.compose.ui.semantics.testTag")) {
            Object g3 = tn1Var.g(ji2Var);
            String str2 = (String) (g3 == null ? null : g3);
            if (str2 != null) {
                accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (Intrinsics.b(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo2.getExtras().putInt(str, ai2Var.g);
            return;
        }
        if (Intrinsics.b(str, "androidx.compose.ui.semantics.shapeType")) {
            Object g4 = tn1Var.g(gi2.O);
            fk2 fk2Var = (fk2) (g4 == null ? null : g4);
            if (fk2Var != null) {
                bx1 k = k(fk2Var, ai2Var);
                if (k instanceof zw1) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(k));
                    return;
                } else if (k instanceof ax1) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(k));
                    accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", H(k));
                    return;
                } else if (!(k instanceof yw1)) {
                    a.b();
                    return;
                } else {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", I(k));
                    return;
                }
            }
            return;
        }
        if (Intrinsics.b(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object g5 = tn1Var.g(gi2.O);
            fk2 fk2Var2 = (fk2) (g5 == null ? null : g5);
            if (fk2Var2 == null || (G = G(k(fk2Var2, ai2Var))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G);
            return;
        }
        if (Intrinsics.b(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object g6 = tn1Var.g(gi2.O);
            fk2 fk2Var3 = (fk2) (g6 == null ? null : g6);
            if (fk2Var3 == null || (H = H(k(fk2Var3, ai2Var))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", H);
            return;
        }
        if (Intrinsics.b(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object g7 = tn1Var.g(gi2.O);
            fk2 fk2Var4 = (fk2) (g7 == null ? null : g7);
            if (fk2Var4 == null || (I = I(k(fk2Var4, ai2Var))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", I);
        }
    }

    public final Rect f(di2 di2Var) {
        u31 u31Var = di2Var.b;
        float f = u31Var.a;
        float f2 = u31Var.b;
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        t7 t7Var = this.d;
        long u = t7Var.u((Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32));
        float f3 = u31Var.c;
        float f4 = u31Var.d;
        long u2 = t7Var.u((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        int i = (int) (u >> 32);
        int i2 = (int) (u2 >> 32);
        int i3 = (int) (u & 4294967295L);
        int i4 = (int) (u2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
    
        if (defpackage.n90.a(r5, r2) == r3) goto L49;
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
    public final Object g(r30 r30Var) {
        z7 z7Var;
        int i;
        ii iiVar;
        ii iiVar2;
        an1 an1Var;
        iq iqVar;
        an1 an1Var2;
        iq iqVar2;
        int i2;
        long j;
        Object b;
        try {
            if (r30Var instanceof z7) {
                z7Var = (z7) r30Var;
                int i3 = z7Var.q;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    z7Var.q = i3 - Integer.MIN_VALUE;
                    Object obj = z7Var.o;
                    b50 b50Var = b50.m;
                    i = z7Var.q;
                    iiVar = this.y;
                    if (i != 0) {
                        ca2.b(obj);
                        an1Var = new an1();
                        lq lqVar = this.z;
                        lqVar.getClass();
                        iqVar = new iq(lqVar);
                        z7Var.m = an1Var;
                        z7Var.n = iqVar;
                        z7Var.q = 1;
                        b = iqVar.b(z7Var);
                        if (b != b50Var) {
                        }
                    } else if (i == 1) {
                        iqVar2 = z7Var.n;
                        an1Var2 = z7Var.m;
                        ca2.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iqVar2 = z7Var.n;
                        an1Var2 = z7Var.m;
                        ca2.b(obj);
                        char c = 2;
                        iiVar2 = iiVar;
                        an1Var = an1Var2;
                        iiVar = iiVar2;
                        iqVar = iqVar2;
                        z7Var.m = an1Var;
                        z7Var.n = iqVar;
                        z7Var.q = 1;
                        b = iqVar.b(z7Var);
                        if (b != b50Var) {
                            return b50Var;
                        }
                        iq iqVar3 = iqVar;
                        an1Var2 = an1Var;
                        obj = b;
                        iqVar2 = iqVar3;
                        if (((Boolean) obj).booleanValue()) {
                            iiVar.clear();
                            return Unit.a;
                        }
                        iqVar2.c();
                        if (q()) {
                            int i4 = iiVar.o;
                            for (int i5 = 0; i5 < i4; i5++) {
                                i91 i91Var = (i91) iiVar.n[i5];
                                D(i91Var, an1Var2);
                                E(i91Var);
                            }
                            an1Var2.d = 0;
                            long[] jArr = an1Var2.a;
                            if (jArr != oe2.a) {
                                try {
                                    ni.l(jArr, -9187201950435737472L);
                                    long[] jArr2 = an1Var2.a;
                                    i2 = an1Var2.c;
                                    int i6 = i2 >> 3;
                                    jArr2[i6] = ((~j) & jArr2[i6]) | j;
                                } catch (Throwable th) {
                                    th = th;
                                    iiVar2.clear();
                                    throw th;
                                }
                                j = 255 << ((i2 & 7) << 3);
                                iiVar2 = iiVar;
                            } else {
                                iiVar2 = iiVar;
                            }
                            an1Var2.e = oe2.a(an1Var2.c) - an1Var2.d;
                            if (!this.L) {
                                this.L = true;
                                this.l.post(this.N);
                            }
                        } else {
                            iiVar2 = iiVar;
                        }
                        iiVar2.clear();
                        this.s.c();
                        this.t.c();
                        long j2 = this.h;
                        z7Var.m = an1Var2;
                        z7Var.n = iqVar2;
                        c = 2;
                        z7Var.q = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            iiVar2 = iiVar;
        }
        z7Var = new z7(this, r30Var);
        Object obj2 = z7Var.o;
        b50 b50Var2 = b50.m;
        i = z7Var.q;
        iiVar = this.y;
    }

    public final boolean h(boolean z, int i, long j) {
        ji2 ji2Var;
        int i2;
        if (Intrinsics.b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            q31 o = o();
            if (!au1.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    ji2Var = gi2.u;
                } else {
                    if (z) {
                        a.b();
                        return false;
                    }
                    ji2Var = gi2.t;
                }
                Object[] objArr = o.c;
                long[] jArr = o.a;
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
                                    di2 di2Var = (di2) objArr[(i3 << 3) + i6];
                                    u31 u31Var = di2Var.b;
                                    float f = u31Var.a;
                                    i2 = i4;
                                    float f2 = u31Var.b;
                                    float f3 = u31Var.c;
                                    float f4 = u31Var.d;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((intBitsToFloat2 < f4) & (intBitsToFloat >= f) & (intBitsToFloat < f3) & (intBitsToFloat2 >= f2)) {
                                        Object g = di2Var.a.d.m.g(ji2Var);
                                        if (g == null) {
                                            g = null;
                                        }
                                        ye2 ye2Var = (ye2) g;
                                        if (ye2Var != null) {
                                            Function0 function0 = ye2Var.a;
                                            if (i < 0) {
                                                if (((Number) function0.invoke()).floatValue() <= 0.0f) {
                                                }
                                                z2 = true;
                                            } else {
                                                if (((Number) function0.invoke()).floatValue() >= ((Number) ye2Var.b.invoke()).floatValue()) {
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

    public final void i() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (q()) {
                w(this.d.getSemanticsOwner().a(), this.K);
            }
            Unit unit = Unit.a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                C(o());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    K();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent j(int i, int i2) {
        di2 di2Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        t7 t7Var = this.d;
        obtain.setPackageName(t7Var.getContext().getPackageName());
        obtain.setSource(t7Var, i);
        if (q() && (di2Var = (di2) o().b(i)) != null) {
            ai2 ai2Var = di2Var.a;
            obtain.setPassword(ai2Var.d.m.c(gi2.J));
            Object g = ai2Var.d.m.g(gi2.n);
            if (g == null) {
                g = null;
            }
            boolean b = Intrinsics.b(g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                v1.n(obtain, b);
            }
        }
        return obtain;
    }

    public final bx1 k(fk2 fk2Var, ai2 ai2Var) {
        ks1 d = ai2Var.d();
        return fk2Var.a(zm3.Q(d != null ? d.o : 0L), ai2Var.c.J, this.d.getDensity());
    }

    public final AccessibilityEvent l(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent j = j(i, Utility.DEFAULT_STREAM_BUFFER_SIZE);
        if (num != null) {
            j.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            j.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            j.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            j.getText().add(charSequence);
        }
        return j;
    }

    public final int m(ai2 ai2Var) {
        sh2 sh2Var = ai2Var.d;
        if (!sh2Var.m.c(gi2.a)) {
            ji2 ji2Var = gi2.F;
            if (sh2Var.m.c(ji2Var)) {
                return (int) (((jw2) sh2Var.b(ji2Var)).a & 4294967295L);
            }
        }
        return this.w;
    }

    public final int n(ai2 ai2Var) {
        sh2 sh2Var = ai2Var.d;
        if (!sh2Var.m.c(gi2.a)) {
            ji2 ji2Var = gi2.F;
            if (sh2Var.m.c(ji2Var)) {
                return (int) (((jw2) sh2Var.b(ji2Var)).a >> 32);
            }
        }
        return this.w;
    }

    public final q31 o() {
        if (this.A) {
            this.A = false;
            t7 t7Var = this.d;
            this.C = s03.r(t7Var.getSemanticsOwner());
            if (q()) {
                zm1 zm1Var = this.C;
                Resources resources = t7Var.getContext().getResources();
                xm1 xm1Var = this.E;
                xm1Var.a();
                xm1 xm1Var2 = this.F;
                xm1Var2.a();
                di2 di2Var = (di2) zm1Var.b(-1);
                ai2 ai2Var = di2Var != null ? di2Var.a : null;
                ai2Var.getClass();
                int i = 1;
                ArrayList b = li2.b(ai2Var, new j6(i, zm1Var), new j6(2, resources), pv.c(ai2Var));
                int size = b.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((ai2) b.get(i - 1)).g;
                        int i3 = ((ai2) b.get(i)).g;
                        xm1Var.f(i2, i3);
                        xm1Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.C;
    }

    public final boolean q() {
        return this.g.isEnabled() && !this.k.isEmpty();
    }

    public final void r(i91 i91Var) {
        if (this.y.add(i91Var)) {
            this.z.d(Unit.a);
        }
    }

    public final int v(int i) {
        if (i == this.d.getSemanticsOwner().a().g) {
            return -1;
        }
        return i;
    }

    public final void w(ai2 ai2Var, bi2 bi2Var) {
        int[] iArr = w31.a;
        an1 an1Var = new an1();
        List j = ai2.j(4, ai2Var);
        i91 i91Var = ai2Var.c;
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ai2 ai2Var2 = (ai2) j.get(i);
            q31 o = o();
            int i2 = ai2Var2.g;
            if (o.a(i2)) {
                if (!bi2Var.b.b(i2)) {
                    r(i91Var);
                    return;
                }
                an1Var.a(i2);
            }
        }
        an1 an1Var2 = bi2Var.b;
        int[] iArr2 = an1Var2.b;
        long[] jArr = an1Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128 && !an1Var.b(iArr2[(i3 << 3) + i5])) {
                            r(i91Var);
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
        List j3 = ai2.j(4, ai2Var);
        int size2 = j3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ai2 ai2Var3 = (ai2) j3.get(i6);
            bi2 bi2Var2 = (bi2) this.J.b(ai2Var3.g);
            if (bi2Var2 != null && o().a(ai2Var3.g)) {
                w(ai2Var3, bi2Var2);
            }
        }
    }

    public final boolean x(AccessibilityEvent accessibilityEvent) {
        if (!q()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.r = true;
        }
        try {
            return ((Boolean) this.f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.r = false;
        }
    }

    public final boolean y(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !q()) {
            return false;
        }
        AccessibilityEvent j = j(i, i2);
        if (num != null) {
            j.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            j.setContentDescription(ze1.a(list, ",", null, 62));
        }
        return x(j);
    }
}
