package defpackage;

import android.R;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.appsflyer.internal.l;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class f4 extends s40 {
    public final /* synthetic */ k4 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(k4 k4Var) {
        super(4);
        this.l = k4Var;
    }

    @Override // defpackage.s40
    public final void l(int i, o1 o1Var, String str, Bundle bundle) {
        this.l.c(i, o1Var, str, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:390:0x07e6, code lost:
    
        if (r4 == false) goto L400;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0c9c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x07cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0b26  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0c50  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0c94  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0c6c  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0ca9  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017c  */
    /* JADX WARN: Type inference failed for: r2v102, types: [nv] */
    /* JADX WARN: Type inference failed for: r2v103, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v104, types: [nv] */
    /* JADX WARN: Type inference failed for: r2v105, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v106, types: [nv] */
    /* JADX WARN: Type inference failed for: r2v107, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v108, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v109, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v110, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r45v1 */
    /* JADX WARN: Type inference failed for: r45v2, types: [o1] */
    /* JADX WARN: Type inference failed for: r45v3 */
    @Override // defpackage.s40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o1 m(int i) {
        ?? r45;
        vn0 vn0Var;
        Object g;
        int size;
        int i2;
        int i3;
        y7 H;
        k4 k4Var;
        d4 d4Var;
        lc1 lc1Var;
        jd0 jd0Var;
        vn0 vn0Var2;
        AccessibilityNodeInfo accessibilityNodeInfo;
        o1 o1Var;
        h81 h81Var;
        Resources resources;
        cn0 cn0Var;
        SpannableString spannableString;
        t81 t81Var;
        vn0 vn0Var3;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        Object g2;
        pi1 pi1Var;
        Object g3;
        Boolean bool;
        h81 h81Var2;
        Object g4;
        Object g5;
        String str;
        Object g6;
        int i4;
        Object g7;
        k4 k4Var2;
        boolean z;
        Object g8;
        o1 o1Var2;
        Object g9;
        z0 z0Var;
        z0 z0Var2;
        String m;
        ArrayList arrayList;
        CharSequence e;
        qz0 qz0Var;
        Object g10;
        xh xhVar;
        float f;
        Object g11;
        z61 z61Var;
        z61 z61Var2;
        boolean z2;
        int d;
        d4 d4Var2;
        Bundle bundle;
        int d2;
        String str2;
        o1 o1Var3;
        c7 M;
        Object g12;
        jd0 jd0Var2;
        z0 z0Var3;
        List list;
        jd0 s;
        boolean z3;
        boolean z4;
        ?? r2;
        ?? r22;
        ?? r23;
        int i5;
        boolean z5;
        l81 l81Var;
        xg0 f2;
        k4 k4Var3 = this.l;
        AccessibilityManager accessibilityManager = k4Var3.k;
        d4 d4Var3 = k4Var3.h;
        s3 viewTreeOwners = d4Var3.getViewTreeOwners();
        if (((viewTreeOwners == null || (f2 = viewTreeOwners.a.f()) == null) ? null : f2.c) == og0.d) {
            if (!accessibilityManager.isEnabled()) {
                o1Var3 = new o1(AccessibilityNodeInfo.obtain());
                k4Var2 = k4Var3;
                i4 = i;
                if (k4Var2.t) {
                    if (i4 == k4Var2.p) {
                        k4Var2.r = o1Var3;
                    }
                    if (i4 == k4Var2.q) {
                        k4Var2.s = o1Var3;
                    }
                }
                return o1Var3;
            }
            o1Var3 = null;
            k4Var2 = k4Var3;
            i4 = i;
            if (k4Var2.t) {
            }
            return o1Var3;
        }
        n81 n81Var = (n81) k4Var3.l().b(i);
        if (n81Var == null) {
            if (!accessibilityManager.isEnabled()) {
                o1Var3 = new o1(AccessibilityNodeInfo.obtain());
                k4Var2 = k4Var3;
                i4 = i;
                if (k4Var2.t) {
                }
                return o1Var3;
            }
            o1Var3 = null;
            k4Var2 = k4Var3;
            i4 = i;
            if (k4Var2.t) {
            }
            return o1Var3;
        }
        l81 l81Var2 = n81Var.a;
        h81 k = l81Var2.k();
        jd0 jd0Var3 = l81Var2.c;
        Object g13 = k.d.g(p81.n);
        if (g13 == null) {
            g13 = null;
        }
        boolean a = Intrinsics.a(g13, Boolean.TRUE);
        if (a) {
            if (!(Build.VERSION.SDK_INT >= 34 ? d1.e(accessibilityManager) : true)) {
                k4Var2 = k4Var3;
                i4 = i;
                o1Var3 = null;
                if (k4Var2.t) {
                }
                return o1Var3;
            }
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        o1 o1Var4 = new o1(obtain);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            d1.g(obtain, a);
        } else {
            Bundle extras = obtain.getExtras();
            if (extras != null) {
                r45 = 0;
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65)) | (a ? 64 : 0));
                if (i != -1) {
                    Object parentForAccessibility = d4Var3.getParentForAccessibility();
                    View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : r45;
                    o1Var4.b = -1;
                    obtain.setParent(view);
                } else {
                    l81 l = l81Var2.l();
                    Integer valueOf = l != null ? Integer.valueOf(l.g) : r45;
                    if (valueOf == null) {
                        o80.c("semanticsNode " + i + " has null parent");
                        throw new kc0();
                    }
                    int intValue = valueOf.intValue();
                    if (intValue == d4Var3.getSemanticsOwner().a().g) {
                        intValue = -1;
                    }
                    o1Var4.b = intValue;
                    obtain.setParent(d4Var3, intValue);
                }
                o1Var4.c = i;
                obtain.setSource(d4Var3, i);
                obtain.setBoundsInScreen(k4Var3.d(n81Var));
                cn0 cn0Var2 = k4Var3.O;
                lc1 lc1Var2 = k4Var3.x;
                Resources resources2 = d4Var3.getContext().getResources();
                o1Var4.f("android.view.View");
                h81 h81Var3 = l81Var2.d;
                vn0Var = h81Var3.d;
                if (vn0Var.c(p81.D)) {
                    o1Var4.f("android.widget.EditText");
                }
                if (vn0Var.c(p81.z)) {
                    o1Var4.f("android.widget.TextView");
                }
                g = vn0Var.g(p81.w);
                if (g == null) {
                    g = r45;
                }
                if (((e41) g) != null && ((l81Var2.e || l81.j(4, l81Var2).isEmpty()) && (l81Var2.n() || h81Var3.g))) {
                    o1Var4.f("android.widget.ImageView");
                }
                obtain.setPackageName(d4Var3.getContext().getPackageName());
                obtain.setImportantForAccessibility(m90.C(l81Var2));
                boolean e2 = i6 < 34 ? d1.e(accessibilityManager) : true;
                List j = l81.j(4, l81Var2);
                size = j.size();
                boolean z6 = e2;
                int i7 = 0;
                i2 = 0;
                while (i2 < size) {
                    List list2 = j;
                    l81 l81Var3 = (l81) j.get(i2);
                    int i8 = i2;
                    q90 l2 = k4Var3.l();
                    int i9 = size;
                    int i10 = l81Var3.g;
                    if (l2.a(i10)) {
                        c7 c7Var = d4Var3.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(l81Var3.c);
                        if (i10 != -1) {
                            if (c7Var != null) {
                                obtain.addChild(c7Var);
                            } else {
                                n81 n81Var2 = (n81) k4Var3.l().b(i10);
                                if (n81Var2 == null || (l81Var = n81Var2.a) == null) {
                                    z5 = false;
                                } else {
                                    Object g14 = l81Var.k().d.g(p81.n);
                                    if (g14 == null) {
                                        g14 = r45;
                                    }
                                    z5 = Intrinsics.a(g14, Boolean.TRUE);
                                }
                                if (z6 || !z5) {
                                    obtain.addChild(d4Var3, i10);
                                }
                            }
                            cn0Var2.f(i10, i7);
                            i7++;
                        }
                    }
                    i2 = i8 + 1;
                    j = list2;
                    size = i9;
                }
                i3 = k4Var3.p;
                AccessibilityNodeInfo accessibilityNodeInfo3 = o1Var4.a;
                if (i != i3) {
                    accessibilityNodeInfo3.setAccessibilityFocused(true);
                    o1Var4.a(m1.d);
                } else {
                    accessibilityNodeInfo3.setAccessibilityFocused(false);
                    o1Var4.a(m1.c);
                }
                H = la0.H(l81Var2);
                if (H == null) {
                    d4Var3.getFontFamilyResolver();
                    nr density = d4Var3.getDensity();
                    i8 i8Var = k4Var3.K;
                    d4Var = d4Var3;
                    String str3 = H.e;
                    lc1Var = lc1Var2;
                    List list3 = H.d;
                    SpannableString spannableString2 = new SpannableString(str3);
                    ArrayList arrayList2 = H.g;
                    if (arrayList2 != null) {
                        int size2 = arrayList2.size();
                        jd0Var = jd0Var3;
                        int i11 = 0;
                        while (i11 < size2) {
                            ArrayList arrayList3 = arrayList2;
                            x7 x7Var = (x7) arrayList2.get(i11);
                            int i12 = size2;
                            jc1 jc1Var = (jc1) x7Var.a;
                            int i13 = i11;
                            int i14 = x7Var.b;
                            int i15 = x7Var.c;
                            o1 o1Var5 = o1Var4;
                            k4 k4Var4 = k4Var3;
                            long c = jc1Var.a.c();
                            h81 h81Var4 = h81Var3;
                            Resources resources3 = resources2;
                            long j2 = jc1Var.b;
                            x20 x20Var = jc1Var.c;
                            t20 t20Var = jc1Var.d;
                            ah1 ah1Var = jc1Var.j;
                            mi0 mi0Var = jc1Var.k;
                            vn0 vn0Var4 = vn0Var;
                            AccessibilityNodeInfo accessibilityNodeInfo4 = obtain;
                            long j3 = jc1Var.l;
                            wg1 wg1Var = jc1Var.m;
                            zg1 zg1Var = jc1Var.a;
                            cn0 cn0Var3 = cn0Var2;
                            ka0.D(spannableString2, (hi.c(c, zg1Var.c()) ? zg1Var : c != 16 ? new ui(c) : j50.C).c(), i14, i15);
                            SpannableString spannableString3 = spannableString2;
                            ka0.E(spannableString3, j2, density, i14, i15);
                            if (x20Var == null && t20Var == null) {
                                i5 = 33;
                            } else {
                                x20 x20Var2 = x20Var == null ? x20.i : x20Var;
                                int i16 = t20Var != null ? t20Var.a : 0;
                                boolean z7 = x20Var2.compareTo(x20.h) >= 0;
                                boolean z8 = i16 == 1;
                                StyleSpan styleSpan = new StyleSpan((z8 && z7) ? 3 : z7 ? 1 : z8 ? 2 : 0);
                                i5 = 33;
                                spannableString3.setSpan(styleSpan, i14, i15, 33);
                            }
                            if (wg1Var != null) {
                                int i17 = wg1Var.a;
                                if ((i17 | 1) == i17) {
                                    spannableString3.setSpan(new UnderlineSpan(), i14, i15, i5);
                                }
                                if ((i17 | 2) == i17) {
                                    spannableString3.setSpan(new StrikethroughSpan(), i14, i15, i5);
                                }
                            }
                            if (ah1Var != null) {
                                spannableString3.setSpan(new ScaleXSpan(ah1Var.a), i14, i15, i5);
                            }
                            ka0.F(spannableString3, mi0Var, i14, i15);
                            if (j3 != 16) {
                                spannableString3.setSpan(new BackgroundColorSpan(la0.W(j3)), i14, i15, i5);
                            }
                            i11 = i13 + 1;
                            spannableString2 = spannableString3;
                            cn0Var2 = cn0Var3;
                            arrayList2 = arrayList3;
                            size2 = i12;
                            o1Var4 = o1Var5;
                            k4Var3 = k4Var4;
                            h81Var3 = h81Var4;
                            resources2 = resources3;
                            obtain = accessibilityNodeInfo4;
                            vn0Var = vn0Var4;
                        }
                    } else {
                        jd0Var = jd0Var3;
                    }
                    k4Var = k4Var3;
                    SpannableString spannableString4 = spannableString2;
                    vn0Var2 = vn0Var;
                    accessibilityNodeInfo = obtain;
                    o1Var = o1Var4;
                    h81Var = h81Var3;
                    resources = resources2;
                    cn0Var = cn0Var2;
                    int length = str3.length();
                    if (list3 != null) {
                        r2 = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int i18 = 0; i18 < size3; i18++) {
                            Object obj = list3.get(i18);
                            x7 x7Var2 = (x7) obj;
                            if ((x7Var2.a instanceof an1) && z7.a(0, length, x7Var2.b, x7Var2.c)) {
                                r2.add(obj);
                            }
                        }
                    } else {
                        r2 = nv.d;
                    }
                    r2.getClass();
                    int size4 = r2.size();
                    for (int i19 = 0; i19 < size4; i19++) {
                        x7 x7Var3 = (x7) r2.get(i19);
                        an1 an1Var = (an1) x7Var3.a;
                        int i20 = x7Var3.b;
                        int i21 = x7Var3.c;
                        if (!(an1Var instanceof an1)) {
                            l.a();
                            return r45;
                        }
                        spannableString4.setSpan(new TtsSpan.VerbatimBuilder(an1Var.a).build(), i20, i21, 33);
                    }
                    int length2 = str3.length();
                    if (list3 != null) {
                        r22 = new ArrayList(list3.size());
                        int size5 = list3.size();
                        for (int i22 = 0; i22 < size5; i22++) {
                            Object obj2 = list3.get(i22);
                            x7 x7Var4 = (x7) obj2;
                            if ((x7Var4.a instanceof yl1) && z7.a(0, length2, x7Var4.b, x7Var4.c)) {
                                r22.add(obj2);
                            }
                        }
                    } else {
                        r22 = nv.d;
                    }
                    r22.getClass();
                    int size6 = r22.size();
                    for (int i23 = 0; i23 < size6; i23++) {
                        x7 x7Var5 = (x7) r22.get(i23);
                        yl1 yl1Var = (yl1) x7Var5.a;
                        int i24 = x7Var5.b;
                        int i25 = x7Var5.c;
                        WeakHashMap weakHashMap = (WeakHashMap) i8Var.e;
                        Object obj3 = weakHashMap.get(yl1Var);
                        if (obj3 == null) {
                            obj3 = new URLSpan(yl1Var.a);
                            weakHashMap.put(yl1Var, obj3);
                        }
                        spannableString4.setSpan((URLSpan) obj3, i24, i25, 33);
                    }
                    int length3 = str3.length();
                    if (list3 != null) {
                        r23 = new ArrayList(list3.size());
                        int size7 = list3.size();
                        for (int i26 = 0; i26 < size7; i26++) {
                            Object obj4 = list3.get(i26);
                            x7 x7Var6 = (x7) obj4;
                            if ((x7Var6.a instanceof rh0) && z7.a(0, length3, x7Var6.b, x7Var6.c)) {
                                r23.add(obj4);
                            }
                        }
                    } else {
                        r23 = nv.d;
                    }
                    r23.getClass();
                    int size8 = r23.size();
                    for (int i27 = 0; i27 < size8; i27++) {
                        x7 x7Var7 = (x7) r23.get(i27);
                        int i28 = x7Var7.b;
                        Object obj5 = x7Var7.a;
                        int i29 = x7Var7.c;
                        if (i28 != i29) {
                            rh0 rh0Var = (rh0) obj5;
                            if (rh0Var instanceof qh0) {
                                obj5.getClass();
                                qh0 qh0Var = (qh0) obj5;
                                x7 x7Var8 = new x7(i28, i29, qh0Var);
                                WeakHashMap weakHashMap2 = (WeakHashMap) i8Var.g;
                                Object obj6 = weakHashMap2.get(x7Var8);
                                if (obj6 == null) {
                                    obj6 = new URLSpan(qh0Var.a);
                                    weakHashMap2.put(x7Var8, obj6);
                                }
                                spannableString4.setSpan((URLSpan) obj6, i28, i29, 33);
                            } else {
                                WeakHashMap weakHashMap3 = (WeakHashMap) i8Var.h;
                                Object obj7 = weakHashMap3.get(x7Var7);
                                if (obj7 == null) {
                                    obj7 = new lk(rh0Var);
                                    weakHashMap3.put(x7Var7, obj7);
                                }
                                spannableString4.setSpan((ClickableSpan) obj7, i28, i29, 33);
                            }
                        }
                    }
                    spannableString = (SpannableString) k4.I(spannableString4);
                } else {
                    k4Var = k4Var3;
                    d4Var = d4Var3;
                    lc1Var = lc1Var2;
                    jd0Var = jd0Var3;
                    vn0Var2 = vn0Var;
                    accessibilityNodeInfo = obtain;
                    o1Var = o1Var4;
                    h81Var = h81Var3;
                    resources = resources2;
                    cn0Var = cn0Var2;
                    spannableString = r45;
                }
                accessibilityNodeInfo3.setText(spannableString);
                t81Var = p81.I;
                vn0Var3 = vn0Var2;
                if (vn0Var3.c(t81Var)) {
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                } else {
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    accessibilityNodeInfo2.setContentInvalid(true);
                    Object g15 = vn0Var3.g(t81Var);
                    if (g15 == null) {
                        g15 = r45;
                    }
                    accessibilityNodeInfo2.setError((CharSequence) g15);
                }
                Resources resources4 = resources;
                accessibilityNodeInfo3.setStateDescription(la0.G(l81Var2, resources4));
                accessibilityNodeInfo2.setCheckable(la0.F(l81Var2));
                g2 = vn0Var3.g(p81.G);
                if (g2 == null) {
                    g2 = r45;
                }
                pi1Var = (pi1) g2;
                if (pi1Var != null) {
                    if (pi1Var == pi1.d) {
                        accessibilityNodeInfo3.setChecked(true);
                    } else if (pi1Var == pi1.e) {
                        accessibilityNodeInfo3.setChecked(false);
                    }
                }
                g3 = vn0Var3.g(p81.F);
                if (g3 == null) {
                    g3 = r45;
                }
                bool = (Boolean) g3;
                if (bool != null) {
                    accessibilityNodeInfo3.setChecked(bool.booleanValue());
                }
                h81Var2 = h81Var;
                if (h81Var2.g || l81.j(4, l81Var2).isEmpty()) {
                    g4 = vn0Var3.g(p81.a);
                    if (g4 == null) {
                        g4 = r45;
                    }
                    List list4 = (List) g4;
                    accessibilityNodeInfo2.setContentDescription(list4 == null ? (String) CollectionsKt.firstOrNull(list4) : r45);
                }
                g5 = vn0Var3.g(p81.x);
                if (g5 == null) {
                    g5 = r45;
                }
                str = (String) g5;
                if (str != null) {
                    l81 l81Var4 = l81Var2;
                    while (true) {
                        if (l81Var4 == null) {
                            z4 = false;
                            break;
                        }
                        h81 h81Var5 = l81Var4.d;
                        t81 t81Var2 = q81.a;
                        if (h81Var5.d.c(t81Var2)) {
                            z4 = ((Boolean) h81Var5.d(t81Var2)).booleanValue();
                            break;
                        }
                        l81Var4 = l81Var4.l();
                    }
                    if (z4) {
                        accessibilityNodeInfo2.setViewIdResourceName(str);
                    }
                }
                g6 = vn0Var3.g(p81.h);
                if (g6 == null) {
                    g6 = r45;
                }
                if (((Unit) g6) != null) {
                    accessibilityNodeInfo3.setHeading(true);
                }
                i4 = i;
                if (i4 != -1) {
                    int d3 = cn0Var.d(l81Var2.g);
                    if (d3 != -1) {
                        accessibilityNodeInfo2.setDrawingOrder(d3);
                    } else {
                        Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                    }
                }
                accessibilityNodeInfo2.setPassword(vn0Var3.c(p81.H));
                accessibilityNodeInfo2.setEditable(vn0Var3.c(p81.K));
                g7 = vn0Var3.g(p81.L);
                if (g7 == null) {
                    g7 = r45;
                }
                Integer num = (Integer) g7;
                accessibilityNodeInfo2.setMaxTextLength(num == null ? num.intValue() : -1);
                accessibilityNodeInfo2.setEnabled(la0.q(l81Var2));
                t81 t81Var3 = p81.k;
                accessibilityNodeInfo2.setFocusable(vn0Var3.c(t81Var3));
                if (accessibilityNodeInfo2.isFocusable()) {
                    k4Var2 = k4Var;
                } else {
                    accessibilityNodeInfo2.setFocused(((Boolean) h81Var2.d(t81Var3)).booleanValue());
                    if (!accessibilityNodeInfo2.isFocused()) {
                        k4Var2 = k4Var;
                        z = true;
                        accessibilityNodeInfo3.addAction(1);
                        accessibilityNodeInfo3.setVisibleToUser(m90.B(l81Var2) ^ z);
                        g8 = vn0Var3.g(p81.j);
                        if (g8 == null) {
                            g8 = r45;
                        }
                        if (g8 != null) {
                            af.c();
                            return null;
                        }
                        accessibilityNodeInfo3.setClickable(false);
                        Object g16 = vn0Var3.g(g81.b);
                        if (g16 == null) {
                            g16 = r45;
                        }
                        z0 z0Var4 = (z0) g16;
                        if (z0Var4 != null) {
                            Object g17 = vn0Var3.g(p81.F);
                            if (g17 == null) {
                                g17 = r45;
                            }
                            Intrinsics.a(g17, Boolean.TRUE);
                            accessibilityNodeInfo3.setClickable(true);
                            if (la0.q(l81Var2) && accessibilityNodeInfo2.isClickable()) {
                                Class cls = r45;
                                m1 m1Var = new m1(cls, 16, z0Var4.a, cls);
                                o1Var2 = o1Var;
                                o1Var2.a(m1Var);
                                accessibilityNodeInfo3.setLongClickable(false);
                                g9 = vn0Var3.g(g81.c);
                                if (g9 == null) {
                                    g9 = null;
                                }
                                z0Var = (z0) g9;
                                if (z0Var != null) {
                                    accessibilityNodeInfo3.setLongClickable(true);
                                    if (la0.q(l81Var2)) {
                                        o1Var2.a(new m1(32, z0Var.a));
                                    }
                                }
                                z0Var2 = (z0) ca0.o(h81Var2, g81.p);
                                if (z0Var2 != null) {
                                    o1Var2.a(new m1(16384, z0Var2.a));
                                }
                                if (la0.q(l81Var2)) {
                                    z0 z0Var5 = (z0) ca0.o(h81Var2, g81.k);
                                    if (z0Var5 != null) {
                                        o1Var2.a(new m1(2097152, z0Var5.a));
                                    }
                                    z0 z0Var6 = (z0) ca0.o(h81Var2, g81.o);
                                    if (z0Var6 != null) {
                                        o1Var2.a(new m1(R.id.accessibilityActionImeEnter, z0Var6.a));
                                    }
                                    z0 z0Var7 = (z0) ca0.o(h81Var2, g81.q);
                                    if (z0Var7 != null) {
                                        o1Var2.a(new m1(65536, z0Var7.a));
                                    }
                                    z0 z0Var8 = (z0) ca0.o(h81Var2, g81.r);
                                    if (z0Var8 != null && accessibilityNodeInfo2.isFocused()) {
                                        ClipDescription primaryClipDescription = d4Var.getClipboardManager().a.getPrimaryClipDescription();
                                        if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                            o1Var2.a(new m1(32768, z0Var8.a));
                                        }
                                    }
                                }
                                m = k4.m(l81Var2);
                                if (m != null && m.length() != 0) {
                                    accessibilityNodeInfo2.setTextSelection(k4Var2.k(l81Var2), k4Var2.j(l81Var2));
                                    z0 z0Var9 = (z0) ca0.o(h81Var2, g81.j);
                                    o1Var2.a(new m1(131072, z0Var9 == null ? z0Var9.a : null));
                                    accessibilityNodeInfo3.addAction(256);
                                    accessibilityNodeInfo3.addAction(512);
                                    accessibilityNodeInfo3.setMovementGranularities(11);
                                    list = (List) ca0.o(h81Var2, p81.a);
                                    if ((list != null || list.isEmpty()) && vn0Var3.c(g81.a) && (!vn0Var3.c(p81.D) || Intrinsics.a(ca0.o(h81Var2, t81Var3), Boolean.TRUE))) {
                                        s = jd0Var.s();
                                        while (true) {
                                            if (s == null) {
                                                s = null;
                                                break;
                                            }
                                            h81 v = s.v();
                                            if (v != null && v.g) {
                                                if (v.d.c(p81.D)) {
                                                    break;
                                                }
                                            }
                                            s = s.s();
                                        }
                                        if (s != null) {
                                            h81 v2 = s.v();
                                            if (v2 != null) {
                                                Object g18 = v2.d.g(t81Var3);
                                                if (g18 == null) {
                                                    g18 = null;
                                                }
                                                z3 = Intrinsics.a(g18, Boolean.TRUE);
                                            } else {
                                                z3 = false;
                                            }
                                        }
                                        accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                    }
                                }
                                arrayList = new ArrayList();
                                arrayList.add("androidx.compose.ui.semantics.id");
                                e = o1Var2.e();
                                if (e != null && e.length() != 0 && vn0Var3.c(g81.a)) {
                                    arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                }
                                if (vn0Var3.c(p81.x)) {
                                    arrayList.add("androidx.compose.ui.semantics.testTag");
                                }
                                if (vn0Var3.c(p81.M)) {
                                    arrayList.add("androidx.compose.ui.semantics.shapeType");
                                    arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                    arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                    arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                }
                                accessibilityNodeInfo2.setAvailableExtraData(arrayList);
                                qz0Var = (qz0) ca0.o(h81Var2, p81.c);
                                float f3 = 0.0f;
                                if (qz0Var != null) {
                                    float f4 = qz0Var.a;
                                    float f5 = qz0Var.b.a;
                                    t81 t81Var4 = g81.i;
                                    if (vn0Var3.c(t81Var4)) {
                                        o1Var2.f("android.widget.SeekBar");
                                    } else {
                                        o1Var2.f("android.widget.ProgressBar");
                                    }
                                    if (qz0Var != qz0.c) {
                                        accessibilityNodeInfo2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, f5, f4));
                                    }
                                    if (vn0Var3.c(t81Var4) && la0.q(l81Var2)) {
                                        if (f4 < (f5 < 0.0f ? 0.0f : f5)) {
                                            o1Var2.a(m1.e);
                                        }
                                        if (0.0f <= f5) {
                                            f5 = 0.0f;
                                        }
                                        if (f4 > f5) {
                                            o1Var2.a(m1.f);
                                        }
                                    }
                                }
                                if (la0.q(l81Var2) && (z0Var3 = (z0) ca0.o(h81Var2, g81.i)) != null) {
                                    o1Var2.a(new m1(R.id.accessibilityActionSetProgress, z0Var3.a));
                                }
                                g10 = l81Var2.k().d.g(p81.f);
                                if (g10 == null) {
                                    g10 = null;
                                }
                                xhVar = (xh) g10;
                                if (xhVar == null) {
                                    accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(xhVar.a, xhVar.b, false, 0));
                                    f = 0.0f;
                                } else {
                                    ArrayList arrayList4 = new ArrayList();
                                    Object g19 = l81Var2.k().d.g(p81.e);
                                    if (g19 == null) {
                                        g19 = null;
                                    }
                                    if (g19 != null) {
                                        List j4 = l81.j(4, l81Var2);
                                        int size9 = j4.size();
                                        int i30 = 0;
                                        while (i30 < size9) {
                                            l81 l81Var5 = (l81) j4.get(i30);
                                            float f6 = f3;
                                            if (l81Var5.k().d.c(p81.F)) {
                                                arrayList4.add(l81Var5);
                                            }
                                            i30++;
                                            f3 = f6;
                                        }
                                    }
                                    f = f3;
                                    if (!arrayList4.isEmpty()) {
                                        boolean r = m90.r(arrayList4);
                                        accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(r ? 1 : arrayList4.size(), r ? arrayList4.size() : 1, false, 0));
                                    }
                                }
                                g11 = l81Var2.k().d.g(p81.g);
                                if (g11 == null) {
                                    g11 = null;
                                }
                                if (g11 != null) {
                                    l81 l3 = l81Var2.l();
                                    if (l3 != null) {
                                        Object g20 = l3.k().d.g(p81.e);
                                        if (g20 == null) {
                                            g20 = null;
                                        }
                                        if (g20 != null) {
                                            Object g21 = l3.k().d.g(p81.f);
                                            if (g21 == null) {
                                                g21 = null;
                                            }
                                            xh xhVar2 = (xh) g21;
                                            if (xhVar2 == null || (xhVar2.a >= 0 && xhVar2.b >= 0)) {
                                                if (l81Var2.k().d.c(p81.F)) {
                                                    ArrayList arrayList5 = new ArrayList();
                                                    List j5 = l81.j(4, l3);
                                                    int size10 = j5.size();
                                                    int i31 = 0;
                                                    for (int i32 = 0; i32 < size10; i32++) {
                                                        l81 l81Var6 = (l81) j5.get(i32);
                                                        if (l81Var6.k().d.c(p81.F)) {
                                                            arrayList5.add(l81Var6);
                                                            if (l81Var6.c.u() < l81Var2.c.u()) {
                                                                i31++;
                                                            }
                                                        }
                                                    }
                                                    if (!arrayList5.isEmpty()) {
                                                        boolean r3 = m90.r(arrayList5);
                                                        int i33 = r3 ? 0 : i31;
                                                        int i34 = r3 ? i31 : 0;
                                                        Object g22 = l81Var2.k().d.g(p81.F);
                                                        if (g22 == null) {
                                                            g22 = Boolean.FALSE;
                                                        }
                                                        accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i33, 1, i34, 1, false, ((Boolean) g22).booleanValue()));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    af.c();
                                }
                                z61Var = (z61) ca0.o(h81Var2, p81.u);
                                z0 z0Var10 = (z0) ca0.o(h81Var2, g81.d);
                                if (z61Var != null && z0Var10 != null) {
                                    g12 = l81Var2.k().d.g(p81.f);
                                    if (g12 == null) {
                                        g12 = null;
                                    }
                                    if (g12 == null) {
                                        Object g23 = l81Var2.k().d.g(p81.e);
                                        if (g23 == null) {
                                            g23 = null;
                                        }
                                        if (g23 == null) {
                                            o1Var2.f("android.widget.HorizontalScrollView");
                                        }
                                    }
                                    if (((Number) z61Var.b.invoke()).floatValue() > f) {
                                        accessibilityNodeInfo3.setScrollable(true);
                                    }
                                    if (la0.q(l81Var2)) {
                                        if (k4.s(z61Var)) {
                                            o1Var2.a(m1.e);
                                            jd0Var2 = jd0Var;
                                            o1Var2.a(jd0Var2.D == vc0.e ? m1.h : m1.j);
                                        } else {
                                            jd0Var2 = jd0Var;
                                        }
                                        if (k4.r(z61Var)) {
                                            o1Var2.a(m1.f);
                                            o1Var2.a(jd0Var2.D == vc0.e ? m1.j : m1.h);
                                        }
                                    }
                                }
                                z61Var2 = (z61) ca0.o(h81Var2, p81.v);
                                if (z61Var2 != null || z0Var10 == null) {
                                    z2 = true;
                                } else {
                                    Object g24 = l81Var2.k().d.g(p81.f);
                                    if (g24 == null) {
                                        g24 = null;
                                    }
                                    if (g24 == null) {
                                        Object g25 = l81Var2.k().d.g(p81.e);
                                        if (g25 == null) {
                                            g25 = null;
                                        }
                                        if (g25 == null) {
                                            o1Var2.f("android.widget.ScrollView");
                                        }
                                    }
                                    z2 = true;
                                    if (((Number) z61Var2.b.invoke()).floatValue() > f) {
                                        accessibilityNodeInfo3.setScrollable(true);
                                    }
                                    if (la0.q(l81Var2)) {
                                        if (k4.s(z61Var2)) {
                                            o1Var2.a(m1.e);
                                            o1Var2.a(m1.i);
                                        }
                                        if (k4.r(z61Var2)) {
                                            o1Var2.a(m1.f);
                                            o1Var2.a(m1.g);
                                        }
                                    }
                                }
                                m90.l(o1Var2, l81Var2);
                                accessibilityNodeInfo3.setPaneTitle((CharSequence) ca0.o(h81Var2, p81.d));
                                if (la0.q(l81Var2)) {
                                    z0 z0Var11 = (z0) ca0.o(h81Var2, g81.s);
                                    if (z0Var11 != null) {
                                        o1Var2.a(new m1(262144, z0Var11.a));
                                    }
                                    z0 z0Var12 = (z0) ca0.o(h81Var2, g81.t);
                                    if (z0Var12 != null) {
                                        o1Var2.a(new m1(524288, z0Var12.a));
                                    }
                                    z0 z0Var13 = (z0) ca0.o(h81Var2, g81.u);
                                    if (z0Var13 != null) {
                                        o1Var2.a(new m1(1048576, z0Var13.a));
                                    }
                                    t81 t81Var5 = g81.w;
                                    if (vn0Var3.c(t81Var5)) {
                                        List list5 = (List) h81Var2.d(t81Var5);
                                        int size11 = list5.size();
                                        dn0 dn0Var = k4.S;
                                        if (size11 >= dn0Var.b) {
                                            throw new IllegalStateException("Can't have more than " + dn0Var.b + " custom actions for one widget");
                                        }
                                        lc1 lc1Var3 = new lc1();
                                        ln0 a2 = qq0.a();
                                        lc1 lc1Var4 = lc1Var;
                                        if (p4.o(lc1Var4.d, lc1Var4.g, i4) < 0) {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            ln0 ln0Var = (ln0) lc1Var4.b(i4);
                                            int[] iArr = dn0Var.a;
                                            int i35 = dn0Var.b;
                                            int[] iArr2 = new int[16];
                                            int i36 = 0;
                                            int i37 = 0;
                                            while (i36 < i35) {
                                                int i38 = iArr[i36];
                                                int i39 = i35;
                                                int i40 = i37 + 1;
                                                int i41 = i36;
                                                if (iArr2.length < i40) {
                                                    iArr2 = Arrays.copyOf(iArr2, Math.max(i40, (iArr2.length * 3) / 2));
                                                }
                                                iArr2[i37] = i38;
                                                i36 = i41 + 1;
                                                i37 = i40;
                                                i35 = i39;
                                            }
                                            ArrayList arrayList6 = new ArrayList();
                                            if (list5.size() > 0) {
                                                qy0.u(list5.get(0));
                                                ln0Var.getClass();
                                                throw null;
                                            }
                                            if (arrayList6.size() > 0) {
                                                qy0.u(arrayList6.get(0));
                                                if (i37 <= 0) {
                                                    throw new IndexOutOfBoundsException("Index must be between 0 and size");
                                                }
                                                int i42 = iArr2[0];
                                                throw null;
                                            }
                                        } else if (list5.size() > 0) {
                                            qy0.u(list5.get(0));
                                            dn0Var.c(0);
                                            throw null;
                                        }
                                        k4Var2.w.c(i4, lc1Var3);
                                        lc1Var4.c(i4, a2);
                                    }
                                }
                                accessibilityNodeInfo3.setScreenReaderFocusable(la0.s(l81Var2, resources4));
                                d = k4Var2.G.d(i4);
                                if (d == -1) {
                                    c7 M2 = gb0.M(d4Var.getAndroidViewsHandler$ui(), d);
                                    if (M2 != null) {
                                        accessibilityNodeInfo3.setTraversalBefore(M2);
                                        d4Var2 = d4Var;
                                    } else {
                                        d4Var2 = d4Var;
                                        accessibilityNodeInfo3.setTraversalBefore(d4Var2, d);
                                    }
                                    bundle = null;
                                    k4Var2.c(i4, o1Var2, k4Var2.I, null);
                                } else {
                                    d4Var2 = d4Var;
                                    bundle = null;
                                }
                                d2 = k4Var2.H.d(i4);
                                if (d2 != -1 && (M = gb0.M(d4Var2.getAndroidViewsHandler$ui(), d2)) != null) {
                                    accessibilityNodeInfo3.setTraversalAfter(M);
                                    k4Var2.c(i4, o1Var2, k4Var2.J, bundle);
                                }
                                str2 = (String) ca0.o(h81Var2, q81.b);
                                if (str2 != null) {
                                    o1Var2.f(str2);
                                }
                                o1Var3 = o1Var2;
                                if (k4Var2.t) {
                                }
                                return o1Var3;
                            }
                        }
                        o1Var2 = o1Var;
                        accessibilityNodeInfo3.setLongClickable(false);
                        g9 = vn0Var3.g(g81.c);
                        if (g9 == null) {
                        }
                        z0Var = (z0) g9;
                        if (z0Var != null) {
                        }
                        z0Var2 = (z0) ca0.o(h81Var2, g81.p);
                        if (z0Var2 != null) {
                        }
                        if (la0.q(l81Var2)) {
                        }
                        m = k4.m(l81Var2);
                        if (m != null) {
                            accessibilityNodeInfo2.setTextSelection(k4Var2.k(l81Var2), k4Var2.j(l81Var2));
                            z0 z0Var92 = (z0) ca0.o(h81Var2, g81.j);
                            o1Var2.a(new m1(131072, z0Var92 == null ? z0Var92.a : null));
                            accessibilityNodeInfo3.addAction(256);
                            accessibilityNodeInfo3.addAction(512);
                            accessibilityNodeInfo3.setMovementGranularities(11);
                            list = (List) ca0.o(h81Var2, p81.a);
                            if (list != null) {
                            }
                            s = jd0Var.s();
                            while (true) {
                                if (s == null) {
                                }
                                s = s.s();
                            }
                            if (s != null) {
                            }
                            accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        e = o1Var2.e();
                        if (e != null) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (vn0Var3.c(p81.x)) {
                        }
                        if (vn0Var3.c(p81.M)) {
                        }
                        accessibilityNodeInfo2.setAvailableExtraData(arrayList);
                        qz0Var = (qz0) ca0.o(h81Var2, p81.c);
                        float f32 = 0.0f;
                        if (qz0Var != null) {
                        }
                        if (la0.q(l81Var2)) {
                            o1Var2.a(new m1(R.id.accessibilityActionSetProgress, z0Var3.a));
                        }
                        g10 = l81Var2.k().d.g(p81.f);
                        if (g10 == null) {
                        }
                        xhVar = (xh) g10;
                        if (xhVar == null) {
                        }
                        g11 = l81Var2.k().d.g(p81.g);
                        if (g11 == null) {
                        }
                        if (g11 != null) {
                        }
                        z61Var = (z61) ca0.o(h81Var2, p81.u);
                        z0 z0Var102 = (z0) ca0.o(h81Var2, g81.d);
                        if (z61Var != null) {
                            g12 = l81Var2.k().d.g(p81.f);
                            if (g12 == null) {
                            }
                            if (g12 == null) {
                            }
                            if (((Number) z61Var.b.invoke()).floatValue() > f) {
                            }
                            if (la0.q(l81Var2)) {
                            }
                        }
                        z61Var2 = (z61) ca0.o(h81Var2, p81.v);
                        if (z61Var2 != null) {
                        }
                        z2 = true;
                        m90.l(o1Var2, l81Var2);
                        accessibilityNodeInfo3.setPaneTitle((CharSequence) ca0.o(h81Var2, p81.d));
                        if (la0.q(l81Var2)) {
                        }
                        accessibilityNodeInfo3.setScreenReaderFocusable(la0.s(l81Var2, resources4));
                        d = k4Var2.G.d(i4);
                        if (d == -1) {
                        }
                        d2 = k4Var2.H.d(i4);
                        if (d2 != -1) {
                            accessibilityNodeInfo3.setTraversalAfter(M);
                            k4Var2.c(i4, o1Var2, k4Var2.J, bundle);
                        }
                        str2 = (String) ca0.o(h81Var2, q81.b);
                        if (str2 != null) {
                        }
                        o1Var3 = o1Var2;
                        if (k4Var2.t) {
                        }
                        return o1Var3;
                    }
                    accessibilityNodeInfo3.addAction(2);
                    k4Var2 = k4Var;
                    k4Var2.q = i4;
                }
                z = true;
                accessibilityNodeInfo3.setVisibleToUser(m90.B(l81Var2) ^ z);
                g8 = vn0Var3.g(p81.j);
                if (g8 == null) {
                }
                if (g8 != null) {
                }
            }
        }
        r45 = 0;
        if (i != -1) {
        }
        o1Var4.c = i;
        obtain.setSource(d4Var3, i);
        obtain.setBoundsInScreen(k4Var3.d(n81Var));
        cn0 cn0Var22 = k4Var3.O;
        lc1 lc1Var22 = k4Var3.x;
        Resources resources22 = d4Var3.getContext().getResources();
        o1Var4.f("android.view.View");
        h81 h81Var32 = l81Var2.d;
        vn0Var = h81Var32.d;
        if (vn0Var.c(p81.D)) {
        }
        if (vn0Var.c(p81.z)) {
        }
        g = vn0Var.g(p81.w);
        if (g == null) {
        }
        if (((e41) g) != null) {
            o1Var4.f("android.widget.ImageView");
        }
        obtain.setPackageName(d4Var3.getContext().getPackageName());
        obtain.setImportantForAccessibility(m90.C(l81Var2));
        if (i6 < 34) {
        }
        List j6 = l81.j(4, l81Var2);
        size = j6.size();
        boolean z62 = e2;
        int i72 = 0;
        i2 = 0;
        while (i2 < size) {
        }
        i3 = k4Var3.p;
        AccessibilityNodeInfo accessibilityNodeInfo32 = o1Var4.a;
        if (i != i3) {
        }
        H = la0.H(l81Var2);
        if (H == null) {
        }
        accessibilityNodeInfo32.setText(spannableString);
        t81Var = p81.I;
        vn0Var3 = vn0Var2;
        if (vn0Var3.c(t81Var)) {
        }
        Resources resources42 = resources;
        accessibilityNodeInfo32.setStateDescription(la0.G(l81Var2, resources42));
        accessibilityNodeInfo2.setCheckable(la0.F(l81Var2));
        g2 = vn0Var3.g(p81.G);
        if (g2 == null) {
        }
        pi1Var = (pi1) g2;
        if (pi1Var != null) {
        }
        g3 = vn0Var3.g(p81.F);
        if (g3 == null) {
        }
        bool = (Boolean) g3;
        if (bool != null) {
        }
        h81Var2 = h81Var;
        if (h81Var2.g) {
        }
        g4 = vn0Var3.g(p81.a);
        if (g4 == null) {
        }
        List list42 = (List) g4;
        accessibilityNodeInfo2.setContentDescription(list42 == null ? (String) CollectionsKt.firstOrNull(list42) : r45);
        g5 = vn0Var3.g(p81.x);
        if (g5 == null) {
        }
        str = (String) g5;
        if (str != null) {
        }
        g6 = vn0Var3.g(p81.h);
        if (g6 == null) {
        }
        if (((Unit) g6) != null) {
        }
        i4 = i;
        if (i4 != -1) {
        }
        accessibilityNodeInfo2.setPassword(vn0Var3.c(p81.H));
        accessibilityNodeInfo2.setEditable(vn0Var3.c(p81.K));
        g7 = vn0Var3.g(p81.L);
        if (g7 == null) {
        }
        Integer num2 = (Integer) g7;
        accessibilityNodeInfo2.setMaxTextLength(num2 == null ? num2.intValue() : -1);
        accessibilityNodeInfo2.setEnabled(la0.q(l81Var2));
        t81 t81Var32 = p81.k;
        accessibilityNodeInfo2.setFocusable(vn0Var3.c(t81Var32));
        if (accessibilityNodeInfo2.isFocusable()) {
        }
        z = true;
        accessibilityNodeInfo32.setVisibleToUser(m90.B(l81Var2) ^ z);
        g8 = vn0Var3.g(p81.j);
        if (g8 == null) {
        }
        if (g8 != null) {
        }
    }

    @Override // defpackage.s40
    public final o1 o(int i) {
        k4 k4Var = this.l;
        if (i != 1) {
            if (i == 2) {
                return m(k4Var.p);
            }
            dd0.e(qy0.i(i, "Unknown focus type: "));
            return null;
        }
        int i2 = k4Var.q;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return m(i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 34 ? defpackage.d1.e(r4) : true) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01a5, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x06c1, code lost:
    
        if (r0 != 16) goto L510;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0771  */
    @Override // defpackage.s40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(int i, int i2, Bundle bundle) {
        l81 l81Var;
        int i3;
        e1 e1Var;
        int i4;
        int i5;
        hh1 y;
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        long j;
        z0 z0Var;
        Function0 function05;
        float intBitsToFloat;
        z0 z0Var2;
        Function0 function06;
        Function1 function1;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        Function0 function010;
        Function0 function011;
        Function1 function12;
        z0 z0Var3;
        long j2;
        Object g;
        float f;
        float f2;
        Function2 function2;
        Function1 function13;
        Function0 function012;
        Function0 function013;
        Function0 function014;
        Function0 function015;
        Function0 function016;
        k4 k4Var = this.l;
        AccessibilityManager accessibilityManager = k4Var.k;
        Float valueOf = Float.valueOf(0.0f);
        d4 d4Var = k4Var.h;
        n81 n81Var = (n81) k4Var.l().b(i);
        if (n81Var != null && (l81Var = n81Var.a) != null) {
            jd0 jd0Var = l81Var.c;
            int i6 = l81Var.g;
            h81 h81Var = l81Var.d;
            vn0 vn0Var = h81Var.d;
            Object g2 = vn0Var.g(p81.n);
            if (g2 == null) {
                g2 = null;
            }
            Boolean bool = Boolean.TRUE;
            boolean z = true;
            if (Intrinsics.a(g2, bool)) {
            }
            if (i2 == 64) {
                if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = k4Var.p) == i) {
                    return false;
                }
                if (i3 != Integer.MIN_VALUE) {
                    k4.x(k4Var, i3, 65536, null, 12);
                }
                k4Var.p = i;
                d4Var.invalidate();
                k4.x(k4Var, i, 32768, null, 12);
                return true;
            }
            if (i2 == 128) {
                if (k4Var.p != i) {
                    return false;
                }
                k4Var.p = Integer.MIN_VALUE;
                k4Var.r = null;
                d4Var.invalidate();
                k4.x(k4Var, i, 65536, null, 12);
                return true;
            }
            if (i2 == 256 || i2 == 512) {
                if (bundle != null) {
                    int i7 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                    boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                    boolean z3 = i2 == 256;
                    Integer num = k4Var.z;
                    if (num == null || i6 != num.intValue()) {
                        k4Var.y = -1;
                        k4Var.z = Integer.valueOf(i6);
                    }
                    String m = k4.m(l81Var);
                    if (m != null && m.length() != 0) {
                        String m2 = k4.m(l81Var);
                        if (m2 != null && m2.length() != 0) {
                            if (i7 == 1) {
                                Locale locale = d4Var.getContext().getResources().getConfiguration().locale;
                                if (f1.e == null) {
                                    f1 f1Var = new f1(0);
                                    f1Var.d = BreakIterator.getCharacterInstance(locale);
                                    f1.e = f1Var;
                                }
                                f1 f1Var2 = f1.e;
                                f1Var2.getClass();
                                f1Var2.e(m2);
                                e1Var = f1Var2;
                            } else if (i7 != 2) {
                                if (i7 != 4) {
                                    if (i7 == 8) {
                                        if (i1.c == null) {
                                            i1.c = new i1();
                                        }
                                        i1 i1Var = i1.c;
                                        i1Var.getClass();
                                        i1Var.a = m2;
                                        e1Var = i1Var;
                                    }
                                }
                                if (vn0Var.c(g81.a) && (y = gb0.y(h81Var)) != null) {
                                    if (i7 == 4) {
                                        if (g1.d == null) {
                                            g1.d = new g1();
                                        }
                                        g1 g1Var = g1.d;
                                        g1Var.getClass();
                                        g1Var.a = m2;
                                        g1Var.c = y;
                                        e1Var = g1Var;
                                    } else {
                                        if (h1.e == null) {
                                            h1 h1Var = new h1();
                                            new Rect();
                                            h1.e = h1Var;
                                        }
                                        h1 h1Var2 = h1.e;
                                        h1Var2.getClass();
                                        h1Var2.a = m2;
                                        h1Var2.c = y;
                                        h1Var2.d = l81Var;
                                        e1Var = h1Var2;
                                    }
                                }
                            } else {
                                Locale locale2 = d4Var.getContext().getResources().getConfiguration().locale;
                                if (f1.f == null) {
                                    f1 f1Var3 = new f1(1);
                                    f1Var3.d = BreakIterator.getWordInstance(locale2);
                                    f1.f = f1Var3;
                                }
                                f1 f1Var4 = f1.f;
                                f1Var4.getClass();
                                f1Var4.e(m2);
                                e1Var = f1Var4;
                            }
                            if (e1Var != null) {
                                int j3 = k4Var.j(l81Var);
                                if (j3 == -1) {
                                    j3 = z3 ? 0 : m.length();
                                }
                                int[] a = z3 ? e1Var.a(j3) : e1Var.d(j3);
                                if (a != null) {
                                    int i8 = a[0];
                                    int i9 = a[1];
                                    if (z2 && !vn0Var.c(p81.a) && vn0Var.c(p81.D)) {
                                        i4 = k4Var.k(l81Var);
                                        if (i4 == -1) {
                                            i4 = z3 ? i8 : i9;
                                        }
                                        i5 = z3 ? i9 : i8;
                                    } else {
                                        i4 = z3 ? i9 : i8;
                                        i5 = i4;
                                    }
                                    k4Var.D = new g4(l81Var, z3 ? 256 : 512, i7, i8, i9, SystemClock.uptimeMillis());
                                    k4Var.D(l81Var, i4, i5, true);
                                    return true;
                                }
                            }
                        }
                        e1Var = null;
                        if (e1Var != null) {
                        }
                    }
                }
            } else if (i2 == 16384) {
                Object g3 = vn0Var.g(g81.p);
                z0 z0Var4 = (z0) (g3 == null ? null : g3);
                if (z0Var4 != null && (function0 = (Function0) z0Var4.b) != null) {
                    return ((Boolean) function0.invoke()).booleanValue();
                }
            } else {
                if (i2 == 131072) {
                    boolean D = k4Var.D(l81Var, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                    if (D) {
                        k4.x(k4Var, k4Var.t(i6), 0, null, 12);
                    }
                    return D;
                }
                if (la0.q(l81Var)) {
                    if (i2 == 1) {
                        if (d4Var.isInTouchMode()) {
                            d4Var.requestFocusFromTouch();
                        }
                        Object g4 = vn0Var.g(g81.v);
                        z0 z0Var5 = (z0) (g4 == null ? null : g4);
                        if (z0Var5 != null && (function02 = (Function0) z0Var5.b) != null) {
                            return ((Boolean) function02.invoke()).booleanValue();
                        }
                    } else if (i2 != 2) {
                        switch (i2) {
                            case 16:
                                Object g5 = vn0Var.g(g81.b);
                                if (g5 == null) {
                                    g5 = null;
                                }
                                z0 z0Var6 = (z0) g5;
                                Boolean bool2 = (z0Var6 == null || (function03 = (Function0) z0Var6.b) == null) ? null : (Boolean) function03.invoke();
                                k4.x(k4Var, i, 1, null, 12);
                                if (bool2 != null) {
                                    return bool2.booleanValue();
                                }
                                break;
                            case 32:
                                Object g6 = vn0Var.g(g81.c);
                                z0 z0Var7 = (z0) (g6 == null ? null : g6);
                                if (z0Var7 != null && (function04 = (Function0) z0Var7.b) != null) {
                                    return ((Boolean) function04.invoke()).booleanValue();
                                }
                                break;
                            case 4096:
                            case 8192:
                                boolean z4 = i2 == 4096;
                                boolean z5 = i2 == 8192;
                                boolean z6 = i2 == 16908345;
                                boolean z7 = i2 == 16908347;
                                boolean z8 = i2 == 16908344;
                                boolean z9 = i2 == 16908346;
                                boolean z10 = z6 || z7 || z4 || z5;
                                if (!z8 && !z9 && !z4 && !z5) {
                                    z = false;
                                }
                                if (z4 || z5) {
                                    Object g7 = vn0Var.g(p81.c);
                                    if (g7 == null) {
                                        g7 = null;
                                    }
                                    qz0 qz0Var = (qz0) g7;
                                    Object g8 = vn0Var.g(g81.i);
                                    if (g8 == null) {
                                        g8 = null;
                                    }
                                    z0 z0Var8 = (z0) g8;
                                    if (qz0Var != null) {
                                        nh nhVar = qz0Var.b;
                                        if (z0Var8 != null) {
                                            float f3 = nhVar.a;
                                            float f4 = ((f3 < 0.0f ? 0.0f : f3) - (0.0f > f3 ? f3 : 0.0f)) / 20.0f;
                                            if (z5) {
                                                f4 = -f4;
                                            }
                                            Function1 function14 = (Function1) z0Var8.b;
                                            if (function14 != null) {
                                                return ((Boolean) function14.invoke(Float.valueOf(qz0Var.a + f4))).booleanValue();
                                            }
                                        }
                                    }
                                }
                                long b = t80.f((v80) jd0Var.J.d).b();
                                ArrayList arrayList = new ArrayList();
                                Object g9 = vn0Var.g(g81.B);
                                if (g9 == null) {
                                    g9 = null;
                                }
                                z0 z0Var9 = (z0) g9;
                                Float f5 = (z0Var9 == null || (function1 = (Function1) z0Var9.b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                Object g10 = vn0Var.g(g81.d);
                                if (g10 == null) {
                                    g10 = null;
                                }
                                z0 z0Var10 = (z0) g10;
                                if (z0Var10 != null) {
                                    z30 z30Var = z0Var10.b;
                                    Object g11 = vn0Var.g(p81.u);
                                    if (g11 == null) {
                                        g11 = null;
                                    }
                                    z61 z61Var = (z61) g11;
                                    if (z61Var == null || !z10) {
                                        j = b;
                                    } else {
                                        if (f5 != null) {
                                            intBitsToFloat = f5.floatValue();
                                            j = b;
                                        } else {
                                            j = b;
                                            intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                        }
                                        if (z6 || z5) {
                                            intBitsToFloat = -intBitsToFloat;
                                        }
                                        if (jd0Var.D == vc0.e && (z6 || z7)) {
                                            intBitsToFloat = -intBitsToFloat;
                                        }
                                        if (k4.q(z61Var, intBitsToFloat)) {
                                            t81 t81Var = g81.y;
                                            if (vn0Var.c(t81Var) || vn0Var.c(g81.A)) {
                                                if (intBitsToFloat > 0.0f) {
                                                    Object g12 = vn0Var.g(g81.A);
                                                    z0Var2 = (z0) (g12 == null ? null : g12);
                                                } else {
                                                    Object g13 = vn0Var.g(t81Var);
                                                    z0Var2 = (z0) (g13 == null ? null : g13);
                                                }
                                                if (z0Var2 != null && (function06 = (Function0) z0Var2.b) != null) {
                                                    return ((Boolean) function06.invoke()).booleanValue();
                                                }
                                            } else {
                                                Function2 function22 = (Function2) z30Var;
                                                if (function22 != null) {
                                                    return ((Boolean) function22.b(Float.valueOf(intBitsToFloat), valueOf)).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                    Object g14 = vn0Var.g(p81.v);
                                    if (g14 == null) {
                                        g14 = null;
                                    }
                                    z61 z61Var2 = (z61) g14;
                                    if (z61Var2 != null && z) {
                                        float floatValue = f5 != null ? f5.floatValue() : Float.intBitsToFloat((int) (j & 4294967295L));
                                        if (z8 || z5) {
                                            floatValue = -floatValue;
                                        }
                                        if (k4.q(z61Var2, floatValue)) {
                                            t81 t81Var2 = g81.x;
                                            if (vn0Var.c(t81Var2) || vn0Var.c(g81.z)) {
                                                if (floatValue > 0.0f) {
                                                    Object g15 = vn0Var.g(g81.z);
                                                    z0Var = (z0) (g15 == null ? null : g15);
                                                } else {
                                                    Object g16 = vn0Var.g(t81Var2);
                                                    z0Var = (z0) (g16 == null ? null : g16);
                                                }
                                                if (z0Var != null && (function05 = (Function0) z0Var.b) != null) {
                                                    return ((Boolean) function05.invoke()).booleanValue();
                                                }
                                            } else {
                                                Function2 function23 = (Function2) z30Var;
                                                if (function23 != null) {
                                                    return ((Boolean) function23.b(valueOf, Float.valueOf(floatValue))).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 32768:
                                Object g17 = vn0Var.g(g81.r);
                                z0 z0Var11 = (z0) (g17 == null ? null : g17);
                                if (z0Var11 != null && (function07 = (Function0) z0Var11.b) != null) {
                                    return ((Boolean) function07.invoke()).booleanValue();
                                }
                                break;
                            case 65536:
                                Object g18 = vn0Var.g(g81.q);
                                z0 z0Var12 = (z0) (g18 == null ? null : g18);
                                if (z0Var12 != null && (function08 = (Function0) z0Var12.b) != null) {
                                    return ((Boolean) function08.invoke()).booleanValue();
                                }
                                break;
                            case 262144:
                                Object g19 = vn0Var.g(g81.s);
                                z0 z0Var13 = (z0) (g19 == null ? null : g19);
                                if (z0Var13 != null && (function09 = (Function0) z0Var13.b) != null) {
                                    return ((Boolean) function09.invoke()).booleanValue();
                                }
                                break;
                            case 524288:
                                Object g20 = vn0Var.g(g81.t);
                                z0 z0Var14 = (z0) (g20 == null ? null : g20);
                                if (z0Var14 != null && (function010 = (Function0) z0Var14.b) != null) {
                                    return ((Boolean) function010.invoke()).booleanValue();
                                }
                                break;
                            case 1048576:
                                Object g21 = vn0Var.g(g81.u);
                                z0 z0Var15 = (z0) (g21 == null ? null : g21);
                                if (z0Var15 != null && (function011 = (Function0) z0Var15.b) != null) {
                                    return ((Boolean) function011.invoke()).booleanValue();
                                }
                                break;
                            case 2097152:
                                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                Object g22 = vn0Var.g(g81.k);
                                z0 z0Var16 = (z0) (g22 == null ? null : g22);
                                if (z0Var16 != null && (function12 = (Function1) z0Var16.b) != null) {
                                    if (string == null) {
                                        string = "";
                                    }
                                    return ((Boolean) function12.invoke(new y7(string))).booleanValue();
                                }
                                break;
                            case R.id.accessibilityActionShowOnScreen:
                                l81 l = l81Var.l();
                                if (l != null) {
                                    Object g23 = l.d.d.g(g81.d);
                                    if (g23 == null) {
                                        g23 = null;
                                    }
                                    z0Var3 = (z0) g23;
                                    while (l != null && z0Var3 == null) {
                                        l = l.l();
                                        if (l != null) {
                                            Object g24 = l.d.d.g(g81.d);
                                            if (g24 == null) {
                                                g24 = null;
                                            }
                                            z0Var3 = (z0) g24;
                                        }
                                    }
                                    if (l == null) {
                                        s11 g25 = l81Var.g();
                                        return d4Var.requestRectangleOnScreen(new Rect((int) Math.floor(g25.a), (int) Math.floor(g25.b), pk0.a((float) Math.ceil(g25.c)), pk0.a((float) Math.ceil(g25.d))));
                                    }
                                    vn0 vn0Var2 = l.d.d;
                                    jd0 jd0Var2 = l.c;
                                    s11 f6 = t80.f((v80) jd0Var2.J.d);
                                    uc0 l2 = ((v80) jd0Var2.J.d).l();
                                    s11 e = f6.e(l2 != null ? ((qp0) l2).M(0L) : 0L);
                                    qp0 d = l81Var.d();
                                    if (d != null) {
                                        if (!d.J0().r) {
                                            d = null;
                                        }
                                        if (d != null) {
                                            j2 = d.M(0L);
                                            qp0 d2 = l81Var.d();
                                            s11 c = t90.c(j2, ca0.x(d2 != null ? d2.g : 0L));
                                            g = vn0Var2.g(p81.u);
                                            if (g == null) {
                                                g = null;
                                            }
                                            Object g26 = vn0Var2.g(p81.v);
                                            f = c.a - e.a;
                                            f2 = c.c - e.c;
                                            if (Math.signum(f) == Math.signum(f2)) {
                                                f = 0.0f;
                                            } else if (Math.abs(f) >= Math.abs(f2)) {
                                                f = f2;
                                            }
                                            if (jd0Var.D == vc0.e) {
                                                f = -f;
                                            }
                                            float f7 = c.b - e.b;
                                            float f8 = c.d - e.d;
                                            float f9 = Math.signum(f7) != Math.signum(f8) ? Math.abs(f7) < Math.abs(f8) ? f7 : f8 : 0.0f;
                                            if (z0Var3 == null && (function2 = (Function2) z0Var3.b) != null && ((Boolean) function2.b(Float.valueOf(f), Float.valueOf(f9))).booleanValue()) {
                                                return true;
                                            }
                                        }
                                    }
                                    j2 = 0;
                                    qp0 d22 = l81Var.d();
                                    s11 c2 = t90.c(j2, ca0.x(d22 != null ? d22.g : 0L));
                                    g = vn0Var2.g(p81.u);
                                    if (g == null) {
                                    }
                                    Object g262 = vn0Var2.g(p81.v);
                                    f = c2.a - e.a;
                                    f2 = c2.c - e.c;
                                    if (Math.signum(f) == Math.signum(f2)) {
                                    }
                                    if (jd0Var.D == vc0.e) {
                                    }
                                    float f72 = c2.b - e.b;
                                    float f82 = c2.d - e.d;
                                    if (Math.signum(f72) != Math.signum(f82)) {
                                    }
                                    if (z0Var3 == null) {
                                    }
                                }
                                z0Var3 = null;
                                break;
                            case R.id.accessibilityActionSetProgress:
                                if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                    Object g27 = vn0Var.g(g81.i);
                                    z0 z0Var17 = (z0) (g27 == null ? null : g27);
                                    if (z0Var17 != null && (function13 = (Function1) z0Var17.b) != null) {
                                        return ((Boolean) function13.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                    }
                                }
                                break;
                            case R.id.accessibilityActionImeEnter:
                                Object g28 = vn0Var.g(g81.o);
                                z0 z0Var18 = (z0) (g28 == null ? null : g28);
                                if (z0Var18 != null && (function012 = (Function0) z0Var18.b) != null) {
                                    return ((Boolean) function012.invoke()).booleanValue();
                                }
                                break;
                            default:
                                switch (i2) {
                                    case R.id.accessibilityActionScrollUp:
                                    case R.id.accessibilityActionScrollLeft:
                                    case R.id.accessibilityActionScrollDown:
                                    case R.id.accessibilityActionScrollRight:
                                        break;
                                    default:
                                        switch (i2) {
                                            case R.id.accessibilityActionPageUp:
                                                Object g29 = vn0Var.g(g81.x);
                                                z0 z0Var19 = (z0) (g29 == null ? null : g29);
                                                if (z0Var19 != null && (function013 = (Function0) z0Var19.b) != null) {
                                                    return ((Boolean) function013.invoke()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageDown:
                                                Object g30 = vn0Var.g(g81.z);
                                                z0 z0Var20 = (z0) (g30 == null ? null : g30);
                                                if (z0Var20 != null && (function014 = (Function0) z0Var20.b) != null) {
                                                    return ((Boolean) function014.invoke()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageLeft:
                                                Object g31 = vn0Var.g(g81.y);
                                                z0 z0Var21 = (z0) (g31 == null ? null : g31);
                                                if (z0Var21 != null && (function015 = (Function0) z0Var21.b) != null) {
                                                    return ((Boolean) function015.invoke()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageRight:
                                                Object g32 = vn0Var.g(g81.A);
                                                z0 z0Var22 = (z0) (g32 == null ? null : g32);
                                                if (z0Var22 != null && (function016 = (Function0) z0Var22.b) != null) {
                                                    return ((Boolean) function016.invoke()).booleanValue();
                                                }
                                                break;
                                            default:
                                                lc1 lc1Var = (lc1) k4Var.w.b(i);
                                                if (lc1Var != null && ((CharSequence) lc1Var.b(i2)) != null) {
                                                    Object g33 = vn0Var.g(g81.w);
                                                    List list = (List) (g33 == null ? null : g33);
                                                    if (list != null && list.size() > 0) {
                                                        list.get(0).getClass();
                                                        af.c();
                                                        return false;
                                                    }
                                                }
                                                break;
                                        }
                                }
                        }
                    } else {
                        Object g34 = vn0Var.g(p81.k);
                        if (g34 == null) {
                            g34 = null;
                        }
                        if (Intrinsics.a(g34, bool)) {
                            ((e10) d4Var.getFocusOwner()).b(8, false, true);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
