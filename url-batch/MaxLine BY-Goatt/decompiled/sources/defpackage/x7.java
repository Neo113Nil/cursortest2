package defpackage;

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
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.google.firebase.encoders.json.BuildConfig;
import com.majelw.libystne.R;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x7 extends ar0 {
    public final /* synthetic */ b8 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(b8 b8Var) {
        super(4);
        this.r = b8Var;
    }

    @Override // defpackage.ar0
    public final void q(int i, g2 g2Var, String str, Bundle bundle) {
        this.r.e(i, g2Var, str, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:404:0x085f, code lost:
    
        if (r7 == false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013c, code lost:
    
        if (defpackage.ai2.j(4, r8).isEmpty() != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0ca2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0caf  */
    /* JADX WARN: Type inference failed for: r2v89, types: [ah0] */
    /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v91, types: [ah0] */
    /* JADX WARN: Type inference failed for: r2v92, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v93, types: [ah0] */
    /* JADX WARN: Type inference failed for: r2v94, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v95, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v96, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v97, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r48v1 */
    /* JADX WARN: Type inference failed for: r48v2, types: [g2] */
    /* JADX WARN: Type inference failed for: r48v3 */
    @Override // defpackage.ar0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g2 r(int i) {
        ?? r48;
        AccessibilityManager accessibilityManager;
        yn2 yn2Var;
        b8 b8Var;
        t7 t7Var;
        xm1 xm1Var;
        ai2 ai2Var;
        Resources resources;
        i91 i91Var;
        fb2 fb2Var;
        sh2 sh2Var;
        AccessibilityNodeInfo accessibilityNodeInfo;
        g2 g2Var;
        tn1 tn1Var;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        fb2 fb2Var2;
        int i2;
        g2 g2Var2;
        int i3;
        b8 b8Var2;
        boolean z;
        Object g;
        boolean z2;
        t7 t7Var2;
        g2 g2Var3;
        i91 i91Var2;
        boolean z3;
        boolean z4;
        ?? r2;
        ?? r22;
        ?? r23;
        int i4;
        boolean z5;
        ai2 ai2Var2;
        int i5;
        ad1 lifecycle;
        Float valueOf = Float.valueOf(0.0f);
        b8 b8Var3 = this.r;
        AccessibilityManager accessibilityManager2 = b8Var3.g;
        t7 t7Var3 = b8Var3.d;
        h7 viewTreeOwners = t7Var3.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycle = viewTreeOwners.a.getLifecycle()) == null) ? null : lifecycle.b()) == zc1.m) {
            if (!accessibilityManager2.isEnabled()) {
                g2Var3 = new g2(AccessibilityNodeInfo.obtain());
                i3 = i;
                b8Var2 = b8Var3;
                if (b8Var2.r) {
                    if (i3 == b8Var2.n) {
                        b8Var2.p = g2Var3;
                    }
                    if (i3 == b8Var2.o) {
                        b8Var2.q = g2Var3;
                    }
                }
                return g2Var3;
            }
            g2Var3 = null;
            i3 = i;
            b8Var2 = b8Var3;
            if (b8Var2.r) {
            }
            return g2Var3;
        }
        di2 di2Var = (di2) b8Var3.o().b(i);
        if (di2Var == null) {
            if (!accessibilityManager2.isEnabled()) {
                g2Var3 = new g2(AccessibilityNodeInfo.obtain());
                i3 = i;
                b8Var2 = b8Var3;
                if (b8Var2.r) {
                }
                return g2Var3;
            }
            g2Var3 = null;
            i3 = i;
            b8Var2 = b8Var3;
            if (b8Var2.r) {
            }
            return g2Var3;
        }
        ai2 ai2Var3 = di2Var.a;
        sh2 k = ai2Var3.k();
        i91 i91Var3 = ai2Var3.c;
        Object g2 = k.m.g(gi2.n);
        if (g2 == null) {
            g2 = null;
        }
        boolean b = Intrinsics.b(g2, Boolean.TRUE);
        if (b) {
            if (!(Build.VERSION.SDK_INT >= 34 ? v1.l(accessibilityManager2) : true)) {
                i3 = i;
                b8Var2 = b8Var3;
                g2Var3 = null;
                if (b8Var2.r) {
                }
                return g2Var3;
            }
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        g2 g2Var4 = new g2(obtain);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            v1.o(obtain, b);
        } else {
            g2Var4.g(64, b);
        }
        if (i == -1) {
            Object parentForAccessibility = t7Var3.getParentForAccessibility();
            r48 = 0;
            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
            g2Var4.b = -1;
            obtain.setParent(view);
        } else {
            r48 = 0;
            ai2 l = ai2Var3.l();
            Integer valueOf2 = l != null ? Integer.valueOf(l.g) : null;
            if (valueOf2 == null) {
                h21.c("semanticsNode " + i + " has null parent");
                throw new k81();
            }
            int intValue = valueOf2.intValue();
            if (intValue == t7Var3.getSemanticsOwner().a().g) {
                intValue = -1;
            }
            g2Var4.b = intValue;
            obtain.setParent(t7Var3, intValue);
        }
        g2Var4.c = i;
        obtain.setSource(t7Var3, i);
        obtain.setBoundsInScreen(b8Var3.f(di2Var));
        xm1 xm1Var2 = b8Var3.M;
        yn2 yn2Var2 = b8Var3.v;
        Resources resources2 = t7Var3.getContext().getResources();
        g2Var4.h("android.view.View");
        sh2 sh2Var2 = ai2Var3.d;
        tn1 tn1Var2 = sh2Var2.m;
        if (tn1Var2.c(gi2.E)) {
            g2Var4.h("android.widget.EditText");
        }
        if (tn1Var2.c(gi2.A)) {
            g2Var4.h("android.widget.TextView");
        }
        Object g3 = tn1Var2.g(gi2.x);
        if (g3 == null) {
            g3 = r48;
        }
        fb2 fb2Var3 = (fb2) g3;
        if (fb2Var3 != null) {
            int i7 = fb2Var3.a;
            accessibilityManager = accessibilityManager2;
            if (ai2Var3.e) {
                i5 = 4;
                yn2Var = yn2Var2;
            } else {
                i5 = 4;
                yn2Var = yn2Var2;
            }
            if (i7 == i5) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.tab));
            } else if (i7 == 2) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.switch_role));
            } else {
                String q = mi2.q(i7);
                if (i7 != 5 || ai2Var3.o() || sh2Var2.o) {
                    g2Var4.h(q);
                }
            }
            Unit unit = Unit.a;
        } else {
            accessibilityManager = accessibilityManager2;
            yn2Var = yn2Var2;
        }
        obtain.setPackageName(t7Var3.getContext().getPackageName());
        obtain.setImportantForAccessibility(s03.D(ai2Var3));
        boolean l2 = i6 >= 34 ? v1.l(accessibilityManager) : true;
        List j = ai2.j(4, ai2Var3);
        int size = j.size();
        boolean z6 = l2;
        int i8 = 0;
        int i9 = 0;
        while (i9 < size) {
            int i10 = size;
            ai2 ai2Var4 = (ai2) j.get(i9);
            List list = j;
            q31 o = b8Var3.o();
            int i11 = i9;
            int i12 = ai2Var4.g;
            if (o.a(i12)) {
                if (t7Var3.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(ai2Var4.c) != null) {
                    b71.o();
                    return r48;
                }
                if (i12 != -1) {
                    di2 di2Var2 = (di2) b8Var3.o().b(i12);
                    if (di2Var2 == null || (ai2Var2 = di2Var2.a) == null) {
                        z5 = false;
                    } else {
                        Object g4 = ai2Var2.k().m.g(gi2.n);
                        if (g4 == null) {
                            g4 = r48;
                        }
                        z5 = Intrinsics.b(g4, Boolean.TRUE);
                    }
                    if (z6 || !z5) {
                        obtain.addChild(t7Var3, i12);
                    }
                    xm1Var2.f(i12, i8);
                    i8++;
                }
            }
            i9 = i11 + 1;
            j = list;
            size = i10;
        }
        int i13 = b8Var3.n;
        AccessibilityNodeInfo accessibilityNodeInfo3 = g2Var4.a;
        if (i == i13) {
            accessibilityNodeInfo3.setAccessibilityFocused(true);
            g2Var4.a(b2.d);
        } else {
            accessibilityNodeInfo3.setAccessibilityFocused(false);
            g2Var4.a(b2.c);
        }
        yd H = ll3.H(ai2Var3);
        if (H != null) {
            t7Var3.getFontFamilyResolver();
            ca0 density = t7Var3.getDensity();
            mh mhVar = b8Var3.I;
            t7Var = t7Var3;
            String str = H.n;
            i91Var = i91Var3;
            List list2 = H.m;
            SpannableString spannableString2 = new SpannableString(str);
            ArrayList arrayList = H.o;
            if (arrayList != null) {
                int size2 = arrayList.size();
                b8Var = b8Var3;
                int i14 = 0;
                while (i14 < size2) {
                    ArrayList arrayList2 = arrayList;
                    xd xdVar = (xd) arrayList.get(i14);
                    int i15 = i14;
                    un2 un2Var = (un2) xdVar.a;
                    int i16 = size2;
                    int i17 = xdVar.b;
                    int i18 = xdVar.c;
                    xm1 xm1Var3 = xm1Var2;
                    fb2 fb2Var4 = fb2Var3;
                    sh2 sh2Var3 = sh2Var2;
                    long b2 = un2Var.a.b();
                    ai2 ai2Var5 = ai2Var3;
                    Resources resources3 = resources2;
                    long j2 = un2Var.b;
                    jq0 jq0Var = un2Var.c;
                    fq0 fq0Var = un2Var.d;
                    qv2 qv2Var = un2Var.j;
                    sf1 sf1Var = un2Var.k;
                    AccessibilityNodeInfo accessibilityNodeInfo4 = obtain;
                    g2 g2Var5 = g2Var4;
                    long j3 = un2Var.l;
                    xt2 xt2Var = un2Var.m;
                    pv2 pv2Var = un2Var.a;
                    tn1 tn1Var3 = tn1Var2;
                    if (!aw.c(b2, pv2Var.b())) {
                        pv2Var = b2 != 16 ? new mw(b2) : ov2.a;
                    }
                    hl2.m(spannableString2, pv2Var.b(), i17, i18);
                    SpannableString spannableString3 = spannableString2;
                    hl2.n(spannableString3, j2, density, i17, i18);
                    if (jq0Var == null && fq0Var == null) {
                        i4 = 33;
                    } else {
                        i4 = 33;
                        spannableString3.setSpan(new StyleSpan(o70.w(fq0Var != null ? fq0Var.a : 0, jq0Var == null ? jq0.q : jq0Var)), i17, i18, 33);
                    }
                    if (xt2Var != null) {
                        int i19 = xt2Var.a;
                        if ((i19 | 1) == i19) {
                            spannableString3.setSpan(new UnderlineSpan(), i17, i18, i4);
                        }
                        if ((i19 | 2) == i19) {
                            spannableString3.setSpan(new StrikethroughSpan(), i17, i18, i4);
                        }
                    }
                    if (qv2Var != null) {
                        spannableString3.setSpan(new ScaleXSpan(qv2Var.a), i17, i18, i4);
                    }
                    hl2.o(spannableString3, sf1Var, i17, i18);
                    if (j3 != 16) {
                        spannableString3.setSpan(new BackgroundColorSpan(ap.H(j3)), i17, i18, i4);
                    }
                    i14 = i15 + 1;
                    spannableString2 = spannableString3;
                    tn1Var2 = tn1Var3;
                    arrayList = arrayList2;
                    size2 = i16;
                    xm1Var2 = xm1Var3;
                    sh2Var2 = sh2Var3;
                    fb2Var3 = fb2Var4;
                    resources2 = resources3;
                    ai2Var3 = ai2Var5;
                    obtain = accessibilityNodeInfo4;
                    g2Var4 = g2Var5;
                }
            } else {
                b8Var = b8Var3;
            }
            xm1Var = xm1Var2;
            ai2Var = ai2Var3;
            resources = resources2;
            fb2Var = fb2Var3;
            sh2Var = sh2Var2;
            accessibilityNodeInfo = obtain;
            g2Var = g2Var4;
            SpannableString spannableString4 = spannableString2;
            tn1Var = tn1Var2;
            int length = str.length();
            if (list2 != null) {
                r2 = new ArrayList(list2.size());
                int size3 = list2.size();
                for (int i20 = 0; i20 < size3; i20++) {
                    Object obj = list2.get(i20);
                    xd xdVar2 = (xd) obj;
                    if ((xdVar2.a instanceof l43) && ae.b(0, length, xdVar2.b, xdVar2.c)) {
                        r2.add(obj);
                    }
                }
            } else {
                r2 = ah0.m;
            }
            r2.getClass();
            int size4 = r2.size();
            for (int i21 = 0; i21 < size4; i21++) {
                xd xdVar3 = (xd) r2.get(i21);
                l43 l43Var = (l43) xdVar3.a;
                int i22 = xdVar3.b;
                int i23 = xdVar3.c;
                if (!(l43Var instanceof l43)) {
                    a.b();
                    return r48;
                }
                spannableString4.setSpan(new TtsSpan.VerbatimBuilder(l43Var.a).build(), i22, i23, 33);
            }
            int length2 = str.length();
            if (list2 != null) {
                r22 = new ArrayList(list2.size());
                int size5 = list2.size();
                for (int i24 = 0; i24 < size5; i24++) {
                    Object obj2 = list2.get(i24);
                    xd xdVar4 = (xd) obj2;
                    if ((xdVar4.a instanceof h33) && ae.b(0, length2, xdVar4.b, xdVar4.c)) {
                        r22.add(obj2);
                    }
                }
            } else {
                r22 = ah0.m;
            }
            r22.getClass();
            int size6 = r22.size();
            for (int i25 = 0; i25 < size6; i25++) {
                xd xdVar5 = (xd) r22.get(i25);
                h33 h33Var = (h33) xdVar5.a;
                int i26 = xdVar5.b;
                int i27 = xdVar5.c;
                WeakHashMap weakHashMap = (WeakHashMap) mhVar.n;
                Object obj3 = weakHashMap.get(h33Var);
                if (obj3 == null) {
                    obj3 = new URLSpan(h33Var.a);
                    weakHashMap.put(h33Var, obj3);
                }
                spannableString4.setSpan((URLSpan) obj3, i26, i27, 33);
            }
            int length3 = str.length();
            if (list2 != null) {
                r23 = new ArrayList(list2.size());
                int size7 = list2.size();
                for (int i28 = 0; i28 < size7; i28++) {
                    Object obj4 = list2.get(i28);
                    xd xdVar6 = (xd) obj4;
                    if ((xdVar6.a instanceof ee1) && ae.b(0, length3, xdVar6.b, xdVar6.c)) {
                        r23.add(obj4);
                    }
                }
            } else {
                r23 = ah0.m;
            }
            r23.getClass();
            int size8 = r23.size();
            for (int i29 = 0; i29 < size8; i29++) {
                xd xdVar7 = (xd) r23.get(i29);
                int i30 = xdVar7.b;
                Object obj5 = xdVar7.a;
                int i31 = xdVar7.c;
                if (i30 != i31) {
                    ee1 ee1Var = (ee1) obj5;
                    if (ee1Var instanceof de1) {
                        obj5.getClass();
                        de1 de1Var = (de1) obj5;
                        xd xdVar8 = new xd(i30, i31, de1Var);
                        WeakHashMap weakHashMap2 = (WeakHashMap) mhVar.o;
                        Object obj6 = weakHashMap2.get(xdVar8);
                        if (obj6 == null) {
                            obj6 = new URLSpan(de1Var.a);
                            weakHashMap2.put(xdVar8, obj6);
                        }
                        spannableString4.setSpan((URLSpan) obj6, i30, i31, 33);
                    } else {
                        WeakHashMap weakHashMap3 = (WeakHashMap) mhVar.p;
                        Object obj7 = weakHashMap3.get(xdVar7);
                        if (obj7 == null) {
                            obj7 = new zy(ee1Var);
                            weakHashMap3.put(xdVar7, obj7);
                        }
                        spannableString4.setSpan((ClickableSpan) obj7, i30, i31, 33);
                    }
                }
            }
            spannableString = (SpannableString) b8.J(spannableString4);
        } else {
            b8Var = b8Var3;
            t7Var = t7Var3;
            xm1Var = xm1Var2;
            ai2Var = ai2Var3;
            resources = resources2;
            i91Var = i91Var3;
            fb2Var = fb2Var3;
            sh2Var = sh2Var2;
            accessibilityNodeInfo = obtain;
            g2Var = g2Var4;
            tn1Var = tn1Var2;
            spannableString = r48;
        }
        accessibilityNodeInfo3.setText(spannableString);
        ji2 ji2Var = gi2.K;
        if (tn1Var.c(ji2Var)) {
            accessibilityNodeInfo2 = accessibilityNodeInfo;
            accessibilityNodeInfo2.setContentInvalid(true);
            Object g5 = tn1Var.g(ji2Var);
            if (g5 == null) {
                g5 = r48;
            }
            accessibilityNodeInfo2.setError((CharSequence) g5);
        } else {
            accessibilityNodeInfo2 = accessibilityNodeInfo;
        }
        Resources resources4 = resources;
        ai2 ai2Var6 = ai2Var;
        String G = ll3.G(ai2Var6, resources4);
        if (Build.VERSION.SDK_INT >= 30) {
            c2.p(accessibilityNodeInfo3, G);
        } else {
            accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", G);
        }
        accessibilityNodeInfo2.setCheckable(ll3.F(ai2Var6));
        Object g6 = tn1Var.g(gi2.I);
        if (g6 == null) {
            g6 = r48;
        }
        zx2 zx2Var = (zx2) g6;
        if (zx2Var != null) {
            if (zx2Var == zx2.m) {
                accessibilityNodeInfo3.setChecked(true);
            } else if (zx2Var == zx2.n) {
                accessibilityNodeInfo3.setChecked(false);
            }
            Unit unit2 = Unit.a;
        }
        Object g7 = tn1Var.g(gi2.H);
        if (g7 == null) {
            g7 = r48;
        }
        Boolean bool = (Boolean) g7;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (fb2Var == null) {
                fb2Var2 = fb2Var;
                i2 = 4;
            } else {
                fb2Var2 = fb2Var;
                i2 = 4;
                if (fb2Var2.a == 4) {
                    accessibilityNodeInfo2.setSelected(booleanValue);
                    Unit unit3 = Unit.a;
                }
            }
            accessibilityNodeInfo3.setChecked(booleanValue);
            Unit unit32 = Unit.a;
        } else {
            fb2Var2 = fb2Var;
            i2 = 4;
        }
        sh2 sh2Var4 = sh2Var;
        if (!sh2Var4.o || ai2.j(i2, ai2Var6).isEmpty()) {
            Object g8 = tn1Var.g(gi2.a);
            if (g8 == null) {
                g8 = r48;
            }
            List list3 = (List) g8;
            accessibilityNodeInfo2.setContentDescription(list3 != null ? (String) zv.v(list3) : r48);
        }
        Object g9 = tn1Var.g(gi2.y);
        if (g9 == null) {
            g9 = r48;
        }
        String str2 = (String) g9;
        if (str2 != null) {
            ai2 ai2Var7 = ai2Var6;
            while (true) {
                if (ai2Var7 == null) {
                    z4 = false;
                    break;
                }
                sh2 sh2Var5 = ai2Var7.d;
                ji2 ji2Var2 = hi2.a;
                if (sh2Var5.m.c(ji2Var2)) {
                    z4 = ((Boolean) sh2Var5.b(ji2Var2)).booleanValue();
                    break;
                }
                ai2Var7 = ai2Var7.l();
            }
            if (z4) {
                accessibilityNodeInfo2.setViewIdResourceName(str2);
            }
        }
        Object g10 = tn1Var.g(gi2.h);
        if (g10 == null) {
            g10 = r48;
        }
        if (((Unit) g10) != null) {
            g2Var2 = g2Var;
            g2Var2.i(true);
            Unit unit4 = Unit.a;
        } else {
            g2Var2 = g2Var;
        }
        i3 = i;
        if (i3 != -1) {
            int d = xm1Var.d(ai2Var6.g);
            if (d != -1) {
                accessibilityNodeInfo2.setDrawingOrder(d);
                Unit unit5 = Unit.a;
            } else {
                Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
            }
        }
        accessibilityNodeInfo2.setPassword(tn1Var.c(gi2.J));
        accessibilityNodeInfo2.setEditable(tn1Var.c(gi2.M));
        Object g11 = tn1Var.g(gi2.N);
        if (g11 == null) {
            g11 = r48;
        }
        Integer num = (Integer) g11;
        accessibilityNodeInfo2.setMaxTextLength(num != null ? num.intValue() : -1);
        accessibilityNodeInfo2.setEnabled(ll3.f(ai2Var6));
        ji2 ji2Var3 = gi2.k;
        accessibilityNodeInfo2.setFocusable(tn1Var.c(ji2Var3));
        if (accessibilityNodeInfo2.isFocusable()) {
            accessibilityNodeInfo2.setFocused(((Boolean) sh2Var4.b(ji2Var3)).booleanValue());
            if (!accessibilityNodeInfo2.isFocused()) {
                b8Var2 = b8Var;
                z = true;
                accessibilityNodeInfo3.addAction(1);
                accessibilityNodeInfo2.setVisibleToUser(s03.C(ai2Var6) ^ z);
                g = tn1Var.g(gi2.j);
                if (g == null) {
                    g = r48;
                }
                if (g == null) {
                    b71.o();
                    return null;
                }
                accessibilityNodeInfo3.setClickable(false);
                Object g12 = tn1Var.g(rh2.b);
                if (g12 == null) {
                    g12 = r48;
                }
                r1 r1Var = (r1) g12;
                if (r1Var != null) {
                    Object g13 = tn1Var.g(gi2.H);
                    if (g13 == null) {
                        g13 = r48;
                    }
                    boolean b3 = Intrinsics.b(g13, Boolean.TRUE);
                    boolean z7 = (fb2Var2 != null && fb2Var2.a == 4) || (fb2Var2 != null && fb2Var2.a == 3);
                    accessibilityNodeInfo3.setClickable(!z7 || (z7 && !b3));
                    if (ll3.f(ai2Var6) && accessibilityNodeInfo2.isClickable()) {
                        Class cls = r48;
                        g2Var2.a(new b2(cls, 16, r1Var.a, cls));
                    }
                    Unit unit6 = Unit.a;
                }
                accessibilityNodeInfo3.setLongClickable(false);
                Object g14 = tn1Var.g(rh2.c);
                if (g14 == null) {
                    g14 = null;
                }
                r1 r1Var2 = (r1) g14;
                if (r1Var2 != null) {
                    accessibilityNodeInfo3.setLongClickable(true);
                    if (ll3.f(ai2Var6)) {
                        g2Var2.a(new b2(null, 32, r1Var2.a, null));
                    }
                    Unit unit7 = Unit.a;
                }
                Object g15 = tn1Var.g(rh2.p);
                if (g15 == null) {
                    g15 = null;
                }
                r1 r1Var3 = (r1) g15;
                if (r1Var3 != null) {
                    g2Var2.a(new b2(null, 16384, r1Var3.a, null));
                    Unit unit8 = Unit.a;
                }
                if (ll3.f(ai2Var6)) {
                    Object g16 = tn1Var.g(rh2.j);
                    if (g16 == null) {
                        g16 = null;
                    }
                    r1 r1Var4 = (r1) g16;
                    if (r1Var4 != null) {
                        g2Var2.a(new b2(null, 2097152, r1Var4.a, null));
                        Unit unit9 = Unit.a;
                    }
                    r1 r1Var5 = (r1) th2.l(sh2Var4, rh2.o);
                    if (r1Var5 != null) {
                        g2Var2.a(new b2(null, android.R.id.accessibilityActionImeEnter, r1Var5.a, null));
                        Unit unit10 = Unit.a;
                    }
                    r1 r1Var6 = (r1) th2.l(sh2Var4, rh2.q);
                    if (r1Var6 != null) {
                        g2Var2.a(new b2(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, r1Var6.a));
                        Unit unit11 = Unit.a;
                    }
                    r1 r1Var7 = (r1) th2.l(sh2Var4, rh2.r);
                    if (r1Var7 != null) {
                        if (accessibilityNodeInfo2.isFocused()) {
                            ClipDescription primaryClipDescription = t7Var.m18getClipboardManager().a.getPrimaryClipDescription();
                            if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                g2Var2.a(new b2(32768, r1Var7.a));
                            }
                        }
                        Unit unit12 = Unit.a;
                    }
                }
                String p = b8.p(ai2Var6);
                if (p != null && p.length() != 0) {
                    accessibilityNodeInfo2.setTextSelection(b8Var2.n(ai2Var6), b8Var2.m(ai2Var6));
                    r1 r1Var8 = (r1) th2.l(sh2Var4, rh2.i);
                    g2Var2.a(new b2(131072, r1Var8 != null ? r1Var8.a : null));
                    accessibilityNodeInfo3.addAction(256);
                    accessibilityNodeInfo3.addAction(512);
                    accessibilityNodeInfo3.setMovementGranularities(11);
                    List list4 = (List) th2.l(sh2Var4, gi2.a);
                    if ((list4 == null || list4.isEmpty()) && tn1Var.c(rh2.a) && (!tn1Var.c(gi2.E) || Intrinsics.b(th2.l(sh2Var4, ji2Var3), Boolean.TRUE))) {
                        i91 u = i91Var.u();
                        while (true) {
                            if (u == null) {
                                u = null;
                                break;
                            }
                            sh2 w = u.w();
                            if (w != null && w.o) {
                                if (w.m.c(gi2.E)) {
                                    break;
                                }
                            }
                            u = u.u();
                        }
                        if (u != null) {
                            sh2 w2 = u.w();
                            if (w2 != null) {
                                Object g17 = w2.m.g(ji2Var3);
                                if (g17 == null) {
                                    g17 = null;
                                }
                                z3 = Intrinsics.b(g17, Boolean.TRUE);
                            } else {
                                z3 = false;
                            }
                        }
                        accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                    }
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add("androidx.compose.ui.semantics.id");
                    CharSequence e = g2Var2.e();
                    if (e != null && e.length() != 0 && tn1Var.c(rh2.a)) {
                        arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (tn1Var.c(gi2.y)) {
                        arrayList3.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (tn1Var.c(gi2.O)) {
                        arrayList3.add("androidx.compose.ui.semantics.shapeType");
                        arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                        arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                        arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                    }
                    g2Var2.f(arrayList3);
                }
                j52 j52Var = (j52) th2.l(sh2Var4, gi2.c);
                if (j52Var != null) {
                    ji2 ji2Var4 = rh2.h;
                    if (tn1Var.c(ji2Var4)) {
                        g2Var2.h("android.widget.SeekBar");
                    } else {
                        g2Var2.h("android.widget.ProgressBar");
                    }
                    if (j52Var != j52.b) {
                        accessibilityNodeInfo2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                    }
                    if (tn1Var.c(ji2Var4) && ll3.f(ai2Var6)) {
                        float floatValue = valueOf.floatValue();
                        float floatValue2 = valueOf.floatValue();
                        if (floatValue > floatValue2) {
                            floatValue = floatValue2;
                        }
                        if (0.0f > floatValue) {
                            g2Var2.a(b2.f);
                        }
                    }
                }
                tk3.x(g2Var2, ai2Var6);
                j8.W(g2Var2, ai2Var6);
                Object g18 = ai2Var6.k().m.g(gi2.g);
                if (g18 == null) {
                    g18 = null;
                }
                if (g18 == null) {
                    ai2 l3 = ai2Var6.l();
                    if (l3 != null) {
                        Object g19 = l3.k().m.g(gi2.e);
                        if (g19 == null) {
                            g19 = null;
                        }
                        if (g19 != null) {
                            Object g20 = l3.k().m.g(gi2.f);
                            if (g20 == null) {
                                g20 = null;
                            }
                            nv nvVar = (nv) g20;
                            if (nvVar == null || (nvVar.a >= 0 && nvVar.b >= 0)) {
                                if (ai2Var6.k().m.c(gi2.H)) {
                                    ArrayList arrayList4 = new ArrayList();
                                    List j4 = ai2.j(4, l3);
                                    int size9 = j4.size();
                                    int i32 = 0;
                                    for (int i33 = 0; i33 < size9; i33++) {
                                        ai2 ai2Var8 = (ai2) j4.get(i33);
                                        if (ai2Var8.k().m.c(gi2.H)) {
                                            arrayList4.add(ai2Var8);
                                            if (ai2Var8.c.v() < ai2Var6.c.v()) {
                                                i32++;
                                            }
                                        }
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        boolean l4 = j8.l(arrayList4);
                                        int i34 = l4 ? 0 : i32;
                                        int i35 = l4 ? i32 : 0;
                                        Object g21 = ai2Var6.k().m.g(gi2.H);
                                        if (g21 == null) {
                                            g21 = Boolean.FALSE;
                                        }
                                        accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i34, 1, i35, 1, false, ((Boolean) g21).booleanValue()));
                                    }
                                }
                            }
                        }
                    }
                } else {
                    b71.o();
                }
                ye2 ye2Var = (ye2) th2.l(ai2Var6.m(), gi2.t);
                r1 r1Var9 = (r1) th2.l(ai2Var6.m(), rh2.d);
                if (ye2Var != null && r1Var9 != null) {
                    Object g22 = ai2Var6.k().m.g(gi2.f);
                    if (g22 == null) {
                        g22 = null;
                    }
                    if (g22 == null) {
                        Object g23 = ai2Var6.k().m.g(gi2.e);
                        if (g23 == null) {
                            g23 = null;
                        }
                        if (g23 == null) {
                            g2Var2.h("android.widget.HorizontalScrollView");
                        }
                    }
                    if (((Number) ye2Var.b.invoke()).floatValue() > 0.0f) {
                        accessibilityNodeInfo3.setScrollable(true);
                    }
                    if (ll3.f(ai2Var6)) {
                        if (b8.u(ye2Var)) {
                            g2Var2.a(b2.e);
                            i91Var2 = i91Var;
                            g2Var2.a(i91Var2.J == u81.n ? b2.h : b2.j);
                        } else {
                            i91Var2 = i91Var;
                        }
                        if (b8.t(ye2Var)) {
                            g2Var2.a(b2.f);
                            g2Var2.a(i91Var2.J == u81.n ? b2.j : b2.h);
                        }
                    }
                }
                ye2 ye2Var2 = (ye2) th2.l(ai2Var6.m(), gi2.u);
                if (ye2Var2 == null || r1Var9 == null) {
                    z2 = true;
                } else {
                    Object g24 = ai2Var6.k().m.g(gi2.f);
                    if (g24 == null) {
                        g24 = null;
                    }
                    if (g24 == null) {
                        Object g25 = ai2Var6.k().m.g(gi2.e);
                        if (g25 == null) {
                            g25 = null;
                        }
                        if (g25 == null) {
                            g2Var2.h("android.widget.ScrollView");
                        }
                    }
                    z2 = true;
                    if (((Number) ye2Var2.b.invoke()).floatValue() > 0.0f) {
                        accessibilityNodeInfo3.setScrollable(true);
                    }
                    if (ll3.f(ai2Var6)) {
                        if (b8.u(ye2Var2)) {
                            g2Var2.a(b2.e);
                            g2Var2.a(b2.i);
                        }
                        if (b8.t(ye2Var2)) {
                            g2Var2.a(b2.f);
                            g2Var2.a(b2.g);
                        }
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    yk3.m(g2Var2, ai2Var6);
                }
                g2Var2.j((CharSequence) th2.l(ai2Var6.m(), gi2.d));
                if (ll3.f(ai2Var6)) {
                    r1 r1Var10 = (r1) th2.l(ai2Var6.m(), rh2.s);
                    if (r1Var10 != null) {
                        g2Var2.a(new b2(262144, r1Var10.a));
                        Unit unit13 = Unit.a;
                    }
                    r1 r1Var11 = (r1) th2.l(ai2Var6.m(), rh2.t);
                    if (r1Var11 != null) {
                        g2Var2.a(new b2(524288, r1Var11.a));
                        Unit unit14 = Unit.a;
                    }
                    r1 r1Var12 = (r1) th2.l(ai2Var6.m(), rh2.u);
                    if (r1Var12 != null) {
                        g2Var2.a(new b2(1048576, r1Var12.a));
                        Unit unit15 = Unit.a;
                    }
                    sh2 m = ai2Var6.m();
                    ji2 ji2Var5 = rh2.w;
                    if (m.m.c(rh2.w)) {
                        List list5 = (List) ai2Var6.m().b(ji2Var5);
                        int size10 = list5.size();
                        ym1 ym1Var = b8.Q;
                        if (size10 >= ym1Var.b) {
                            throw new IllegalStateException("Can't have more than " + ym1Var.b + " custom actions for one widget");
                        }
                        yn2 yn2Var3 = new yn2(0);
                        hn1 a = nt1.a();
                        yn2 yn2Var4 = yn2Var;
                        if (yn2Var4.m) {
                            ll3.g(yn2Var4);
                        }
                        if (yk3.o(yn2Var4.p, i3, yn2Var4.n) < 0) {
                            z2 = false;
                        }
                        if (z2) {
                            hn1 hn1Var = (hn1) yn2Var4.c(i3);
                            int[] iArr = ym1Var.a;
                            int i36 = ym1Var.b;
                            int[] iArr2 = new int[16];
                            int i37 = 0;
                            int i38 = 0;
                            while (i37 < i36) {
                                int i39 = iArr[i37];
                                int i40 = i36;
                                int i41 = i38 + 1;
                                hn1 hn1Var2 = hn1Var;
                                if (iArr2.length < i41) {
                                    iArr2 = Arrays.copyOf(iArr2, Math.max(i41, (iArr2.length * 3) / 2));
                                }
                                iArr2[i38] = i39;
                                i37++;
                                i38 = i41;
                                i36 = i40;
                                hn1Var = hn1Var2;
                            }
                            hn1 hn1Var3 = hn1Var;
                            ArrayList arrayList5 = new ArrayList();
                            if (list5.size() > 0) {
                                q40.t(list5.get(0));
                                hn1Var3.getClass();
                                throw null;
                            }
                            if (arrayList5.size() > 0) {
                                q40.t(arrayList5.get(0));
                                if (i38 <= 0) {
                                    a.c("Index must be between 0 and size");
                                    return null;
                                }
                                int i42 = iArr2[0];
                                throw null;
                            }
                        } else if (list5.size() > 0) {
                            q40.t(list5.get(0));
                            ym1Var.c(0);
                            throw null;
                        }
                        b8Var2.u.e(i3, yn2Var3);
                        yn2Var4.e(i3, a);
                    }
                }
                g2Var2.k(ll3.h(ai2Var6, resources4));
                int d2 = b8Var2.E.d(i3);
                if (d2 != -1) {
                    mi2.o(t7Var.getAndroidViewsHandler$ui_release(), d2);
                    t7Var2 = t7Var;
                    accessibilityNodeInfo3.setTraversalBefore(t7Var2, d2);
                    b8Var2.e(i3, g2Var2, b8Var2.G, null);
                } else {
                    t7Var2 = t7Var;
                }
                int d3 = b8Var2.F.d(i3);
                if (d3 != -1) {
                    mi2.o(t7Var2.getAndroidViewsHandler$ui_release(), d3);
                }
                String str3 = (String) th2.l(ai2Var6.m(), hi2.b);
                if (str3 != null) {
                    g2Var2.h(str3);
                    Unit unit16 = Unit.a;
                }
                g2Var3 = g2Var2;
                if (b8Var2.r) {
                }
                return g2Var3;
            }
            accessibilityNodeInfo3.addAction(2);
            b8Var2 = b8Var;
            b8Var2.o = i3;
        } else {
            b8Var2 = b8Var;
        }
        z = true;
        accessibilityNodeInfo2.setVisibleToUser(s03.C(ai2Var6) ^ z);
        g = tn1Var.g(gi2.j);
        if (g == null) {
        }
        if (g == null) {
        }
    }

    @Override // defpackage.ar0
    public final g2 t(int i) {
        b8 b8Var = this.r;
        if (i != 1) {
            if (i == 2) {
                return r(b8Var.n);
            }
            lh.e(in1.k(i, "Unknown focus type: "));
            return null;
        }
        int i2 = b8Var.o;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return r(i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 34 ? defpackage.v1.l(r4) : true) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01a5, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x06a6, code lost:
    
        if (r0 != 16) goto L501;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0756  */
    @Override // defpackage.ar0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(int i, int i2, Bundle bundle) {
        ai2 ai2Var;
        int i3;
        b90 b90Var;
        int i4;
        int i5;
        bw2 m;
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        long j;
        r1 r1Var;
        Function0 function05;
        float intBitsToFloat;
        r1 r1Var2;
        Function0 function06;
        Function1 function1;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        Function0 function010;
        Function0 function011;
        Function1 function12;
        r1 r1Var3;
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
        b8 b8Var = this.r;
        AccessibilityManager accessibilityManager = b8Var.g;
        Float valueOf = Float.valueOf(0.0f);
        t7 t7Var = b8Var.d;
        di2 di2Var = (di2) b8Var.o().b(i);
        if (di2Var != null && (ai2Var = di2Var.a) != null) {
            i91 i91Var = ai2Var.c;
            int i6 = ai2Var.g;
            sh2 sh2Var = ai2Var.d;
            tn1 tn1Var = sh2Var.m;
            Object g2 = tn1Var.g(gi2.n);
            if (g2 == null) {
                g2 = null;
            }
            Boolean bool = Boolean.TRUE;
            boolean z = true;
            if (Intrinsics.b(g2, bool)) {
            }
            if (i2 == 64) {
                if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = b8Var.n) == i) {
                    return false;
                }
                if (i3 != Integer.MIN_VALUE) {
                    b8.z(b8Var, i3, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, null, 12);
                }
                b8Var.n = i;
                t7Var.invalidate();
                b8.z(b8Var, i, 32768, null, 12);
                return true;
            }
            if (i2 == 128) {
                if (b8Var.n != i) {
                    return false;
                }
                b8Var.n = Integer.MIN_VALUE;
                b8Var.p = null;
                t7Var.invalidate();
                b8.z(b8Var, i, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, null, 12);
                return true;
            }
            if (i2 == 256 || i2 == 512) {
                if (bundle != null) {
                    int i7 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                    boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                    boolean z3 = i2 == 256;
                    Integer num = b8Var.x;
                    if (num == null || i6 != num.intValue()) {
                        b8Var.w = -1;
                        b8Var.x = Integer.valueOf(i6);
                    }
                    String p = b8.p(ai2Var);
                    if (p != null && p.length() != 0) {
                        String p2 = b8.p(ai2Var);
                        if (p2 != null && p2.length() != 0) {
                            if (i7 == 1) {
                                Locale locale = t7Var.getContext().getResources().getConfiguration().locale;
                                if (w1.e == null) {
                                    w1 w1Var = new w1(0);
                                    w1Var.d = BreakIterator.getCharacterInstance(locale);
                                    w1.e = w1Var;
                                }
                                w1 w1Var2 = w1.e;
                                w1Var2.getClass();
                                w1Var2.o(p2);
                                b90Var = w1Var2;
                            } else if (i7 != 2) {
                                if (i7 != 4) {
                                    if (i7 == 8) {
                                        if (z1.c == null) {
                                            z1.c = new z1();
                                        }
                                        z1 z1Var = z1.c;
                                        z1Var.getClass();
                                        z1Var.a = p2;
                                        b90Var = z1Var;
                                    }
                                }
                                if (tn1Var.c(rh2.a) && (m = mi2.m(sh2Var)) != null) {
                                    if (i7 == 4) {
                                        if (x1.d == null) {
                                            x1.d = new x1();
                                        }
                                        x1 x1Var = x1.d;
                                        x1Var.getClass();
                                        x1Var.a = p2;
                                        x1Var.c = m;
                                        b90Var = x1Var;
                                    } else {
                                        if (y1.e == null) {
                                            y1 y1Var = new y1();
                                            new Rect();
                                            y1.e = y1Var;
                                        }
                                        y1 y1Var2 = y1.e;
                                        y1Var2.getClass();
                                        y1Var2.a = p2;
                                        y1Var2.c = m;
                                        y1Var2.d = ai2Var;
                                        b90Var = y1Var2;
                                    }
                                }
                            } else {
                                Locale locale2 = t7Var.getContext().getResources().getConfiguration().locale;
                                if (w1.f == null) {
                                    w1 w1Var3 = new w1(1);
                                    w1Var3.d = BreakIterator.getWordInstance(locale2);
                                    w1.f = w1Var3;
                                }
                                w1 w1Var4 = w1.f;
                                w1Var4.getClass();
                                w1Var4.o(p2);
                                b90Var = w1Var4;
                            }
                            if (b90Var != null) {
                                int m2 = b8Var.m(ai2Var);
                                if (m2 == -1) {
                                    m2 = z3 ? 0 : p.length();
                                }
                                int[] f3 = z3 ? b90Var.f(m2) : b90Var.m(m2);
                                if (f3 != null) {
                                    int i8 = f3[0];
                                    int i9 = f3[1];
                                    if (z2 && !tn1Var.c(gi2.a) && tn1Var.c(gi2.E)) {
                                        i4 = b8Var.n(ai2Var);
                                        if (i4 == -1) {
                                            i4 = z3 ? i8 : i9;
                                        }
                                        i5 = z3 ? i9 : i8;
                                    } else {
                                        i4 = z3 ? i9 : i8;
                                        i5 = i4;
                                    }
                                    b8Var.B = new y7(ai2Var, z3 ? 256 : 512, i7, i8, i9, SystemClock.uptimeMillis());
                                    b8Var.F(ai2Var, i4, i5, true);
                                    return true;
                                }
                            }
                        }
                        b90Var = null;
                        if (b90Var != null) {
                        }
                    }
                }
            } else if (i2 == 16384) {
                Object g3 = tn1Var.g(rh2.p);
                r1 r1Var4 = (r1) (g3 == null ? null : g3);
                if (r1Var4 != null && (function0 = (Function0) r1Var4.b) != null) {
                    return ((Boolean) function0.invoke()).booleanValue();
                }
            } else {
                if (i2 == 131072) {
                    boolean F = b8Var.F(ai2Var, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                    if (F) {
                        b8.z(b8Var, b8Var.v(i6), 0, null, 12);
                    }
                    return F;
                }
                if (ll3.f(ai2Var)) {
                    if (i2 == 1) {
                        if (t7Var.isInTouchMode()) {
                            t7Var.requestFocusFromTouch();
                        }
                        Object g4 = tn1Var.g(rh2.v);
                        r1 r1Var5 = (r1) (g4 == null ? null : g4);
                        if (r1Var5 != null && (function02 = (Function0) r1Var5.b) != null) {
                            return ((Boolean) function02.invoke()).booleanValue();
                        }
                    } else if (i2 != 2) {
                        switch (i2) {
                            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                                Object g5 = tn1Var.g(rh2.b);
                                if (g5 == null) {
                                    g5 = null;
                                }
                                r1 r1Var6 = (r1) g5;
                                Boolean bool2 = (r1Var6 == null || (function03 = (Function0) r1Var6.b) == null) ? null : (Boolean) function03.invoke();
                                b8.z(b8Var, i, 1, null, 12);
                                if (bool2 != null) {
                                    return bool2.booleanValue();
                                }
                                break;
                            case 32:
                                Object g6 = tn1Var.g(rh2.c);
                                r1 r1Var7 = (r1) (g6 == null ? null : g6);
                                if (r1Var7 != null && (function04 = (Function0) r1Var7.b) != null) {
                                    return ((Boolean) function04.invoke()).booleanValue();
                                }
                                break;
                            case 4096:
                            case Utility.DEFAULT_STREAM_BUFFER_SIZE /* 8192 */:
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
                                    Object g7 = tn1Var.g(gi2.c);
                                    if (g7 == null) {
                                        g7 = null;
                                    }
                                    j52 j52Var = (j52) g7;
                                    Object g8 = tn1Var.g(rh2.h);
                                    if (g8 == null) {
                                        g8 = null;
                                    }
                                    r1 r1Var8 = (r1) g8;
                                    if (j52Var != null && r1Var8 != null) {
                                        float f4 = z5 ? -0.0f : 0.0f;
                                        Function1 function14 = (Function1) r1Var8.b;
                                        if (function14 != null) {
                                            return ((Boolean) function14.invoke(Float.valueOf(0.0f + f4))).booleanValue();
                                        }
                                    }
                                }
                                long b = yk3.q(i91Var.P.c).b();
                                ArrayList arrayList = new ArrayList();
                                Object g9 = tn1Var.g(rh2.B);
                                if (g9 == null) {
                                    g9 = null;
                                }
                                r1 r1Var9 = (r1) g9;
                                Float f5 = (r1Var9 == null || (function1 = (Function1) r1Var9.b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                Object g10 = tn1Var.g(rh2.d);
                                if (g10 == null) {
                                    g10 = null;
                                }
                                r1 r1Var10 = (r1) g10;
                                if (r1Var10 != null) {
                                    tt0 tt0Var = r1Var10.b;
                                    Object g11 = tn1Var.g(gi2.t);
                                    if (g11 == null) {
                                        g11 = null;
                                    }
                                    ye2 ye2Var = (ye2) g11;
                                    if (ye2Var == null || !z10) {
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
                                        if (i91Var.J == u81.n && (z6 || z7)) {
                                            intBitsToFloat = -intBitsToFloat;
                                        }
                                        if (b8.s(ye2Var, intBitsToFloat)) {
                                            ji2 ji2Var = rh2.y;
                                            if (tn1Var.c(ji2Var) || tn1Var.c(rh2.A)) {
                                                if (intBitsToFloat > 0.0f) {
                                                    Object g12 = tn1Var.g(rh2.A);
                                                    r1Var2 = (r1) (g12 == null ? null : g12);
                                                } else {
                                                    Object g13 = tn1Var.g(ji2Var);
                                                    r1Var2 = (r1) (g13 == null ? null : g13);
                                                }
                                                if (r1Var2 != null && (function06 = (Function0) r1Var2.b) != null) {
                                                    return ((Boolean) function06.invoke()).booleanValue();
                                                }
                                            } else {
                                                Function2 function22 = (Function2) tt0Var;
                                                if (function22 != null) {
                                                    return ((Boolean) function22.invoke(Float.valueOf(intBitsToFloat), valueOf)).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                    Object g14 = tn1Var.g(gi2.u);
                                    if (g14 == null) {
                                        g14 = null;
                                    }
                                    ye2 ye2Var2 = (ye2) g14;
                                    if (ye2Var2 != null && z) {
                                        float floatValue = f5 != null ? f5.floatValue() : Float.intBitsToFloat((int) (j & 4294967295L));
                                        if (z8 || z5) {
                                            floatValue = -floatValue;
                                        }
                                        if (b8.s(ye2Var2, floatValue)) {
                                            ji2 ji2Var2 = rh2.x;
                                            if (tn1Var.c(ji2Var2) || tn1Var.c(rh2.z)) {
                                                if (floatValue > 0.0f) {
                                                    Object g15 = tn1Var.g(rh2.z);
                                                    r1Var = (r1) (g15 == null ? null : g15);
                                                } else {
                                                    Object g16 = tn1Var.g(ji2Var2);
                                                    r1Var = (r1) (g16 == null ? null : g16);
                                                }
                                                if (r1Var != null && (function05 = (Function0) r1Var.b) != null) {
                                                    return ((Boolean) function05.invoke()).booleanValue();
                                                }
                                            } else {
                                                Function2 function23 = (Function2) tt0Var;
                                                if (function23 != null) {
                                                    return ((Boolean) function23.invoke(valueOf, Float.valueOf(floatValue))).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 32768:
                                Object g17 = tn1Var.g(rh2.r);
                                r1 r1Var11 = (r1) (g17 == null ? null : g17);
                                if (r1Var11 != null && (function07 = (Function0) r1Var11.b) != null) {
                                    return ((Boolean) function07.invoke()).booleanValue();
                                }
                                break;
                            case NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST /* 65536 */:
                                Object g18 = tn1Var.g(rh2.q);
                                r1 r1Var12 = (r1) (g18 == null ? null : g18);
                                if (r1Var12 != null && (function08 = (Function0) r1Var12.b) != null) {
                                    return ((Boolean) function08.invoke()).booleanValue();
                                }
                                break;
                            case 262144:
                                Object g19 = tn1Var.g(rh2.s);
                                r1 r1Var13 = (r1) (g19 == null ? null : g19);
                                if (r1Var13 != null && (function09 = (Function0) r1Var13.b) != null) {
                                    return ((Boolean) function09.invoke()).booleanValue();
                                }
                                break;
                            case 524288:
                                Object g20 = tn1Var.g(rh2.t);
                                r1 r1Var14 = (r1) (g20 == null ? null : g20);
                                if (r1Var14 != null && (function010 = (Function0) r1Var14.b) != null) {
                                    return ((Boolean) function010.invoke()).booleanValue();
                                }
                                break;
                            case 1048576:
                                Object g21 = tn1Var.g(rh2.u);
                                r1 r1Var15 = (r1) (g21 == null ? null : g21);
                                if (r1Var15 != null && (function011 = (Function0) r1Var15.b) != null) {
                                    return ((Boolean) function011.invoke()).booleanValue();
                                }
                                break;
                            case 2097152:
                                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                Object g22 = tn1Var.g(rh2.j);
                                r1 r1Var16 = (r1) (g22 == null ? null : g22);
                                if (r1Var16 != null && (function12 = (Function1) r1Var16.b) != null) {
                                    if (string == null) {
                                        string = BuildConfig.FLAVOR;
                                    }
                                    return ((Boolean) function12.invoke(new yd(string))).booleanValue();
                                }
                                break;
                            case android.R.id.accessibilityActionShowOnScreen:
                                ai2 l = ai2Var.l();
                                if (l != null) {
                                    Object g23 = l.d.m.g(rh2.d);
                                    if (g23 == null) {
                                        g23 = null;
                                    }
                                    r1Var3 = (r1) g23;
                                    while (l != null && r1Var3 == null) {
                                        l = l.l();
                                        if (l != null) {
                                            Object g24 = l.d.m.g(rh2.d);
                                            if (g24 == null) {
                                                g24 = null;
                                            }
                                            r1Var3 = (r1) g24;
                                        }
                                    }
                                    if (l == null) {
                                        w72 g25 = ai2Var.g();
                                        return t7Var.requestRectangleOnScreen(new Rect((int) Math.floor(g25.a), (int) Math.floor(g25.b), si1.b((float) Math.ceil(g25.c)), si1.b((float) Math.ceil(g25.d))));
                                    }
                                    tn1 tn1Var2 = l.d.m;
                                    i91 i91Var2 = l.c;
                                    w72 q = yk3.q(i91Var2.P.c);
                                    t81 j3 = i91Var2.P.c.j();
                                    w72 g26 = q.g(j3 != null ? ((ks1) j3).T(0L) : 0L);
                                    ks1 d = ai2Var.d();
                                    if (d != null) {
                                        if (!d.Q0().z) {
                                            d = null;
                                        }
                                        if (d != null) {
                                            j2 = d.T(0L);
                                            ks1 d2 = ai2Var.d();
                                            w72 p3 = tk3.p(j2, zm3.Q(d2 != null ? d2.o : 0L));
                                            g = tn1Var2.g(gi2.t);
                                            if (g == null) {
                                                g = null;
                                            }
                                            Object g27 = tn1Var2.g(gi2.u);
                                            f = p3.a - g26.a;
                                            f2 = p3.c - g26.c;
                                            if (Math.signum(f) == Math.signum(f2)) {
                                                f = 0.0f;
                                            } else if (Math.abs(f) >= Math.abs(f2)) {
                                                f = f2;
                                            }
                                            if (i91Var.J == u81.n) {
                                                f = -f;
                                            }
                                            float f6 = p3.b - g26.b;
                                            float f7 = p3.d - g26.d;
                                            float f8 = Math.signum(f6) != Math.signum(f7) ? Math.abs(f6) < Math.abs(f7) ? f6 : f7 : 0.0f;
                                            if (r1Var3 == null && (function2 = (Function2) r1Var3.b) != null && ((Boolean) function2.invoke(Float.valueOf(f), Float.valueOf(f8))).booleanValue()) {
                                                return true;
                                            }
                                        }
                                    }
                                    j2 = 0;
                                    ks1 d22 = ai2Var.d();
                                    w72 p32 = tk3.p(j2, zm3.Q(d22 != null ? d22.o : 0L));
                                    g = tn1Var2.g(gi2.t);
                                    if (g == null) {
                                    }
                                    Object g272 = tn1Var2.g(gi2.u);
                                    f = p32.a - g26.a;
                                    f2 = p32.c - g26.c;
                                    if (Math.signum(f) == Math.signum(f2)) {
                                    }
                                    if (i91Var.J == u81.n) {
                                    }
                                    float f62 = p32.b - g26.b;
                                    float f72 = p32.d - g26.d;
                                    if (Math.signum(f62) != Math.signum(f72)) {
                                    }
                                    if (r1Var3 == null) {
                                    }
                                }
                                r1Var3 = null;
                                break;
                            case android.R.id.accessibilityActionSetProgress:
                                if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                    Object g28 = tn1Var.g(rh2.h);
                                    r1 r1Var17 = (r1) (g28 == null ? null : g28);
                                    if (r1Var17 != null && (function13 = (Function1) r1Var17.b) != null) {
                                        return ((Boolean) function13.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                    }
                                }
                                break;
                            case android.R.id.accessibilityActionImeEnter:
                                Object g29 = tn1Var.g(rh2.o);
                                r1 r1Var18 = (r1) (g29 == null ? null : g29);
                                if (r1Var18 != null && (function012 = (Function0) r1Var18.b) != null) {
                                    return ((Boolean) function012.invoke()).booleanValue();
                                }
                                break;
                            default:
                                switch (i2) {
                                    case android.R.id.accessibilityActionScrollUp:
                                    case android.R.id.accessibilityActionScrollLeft:
                                    case android.R.id.accessibilityActionScrollDown:
                                    case android.R.id.accessibilityActionScrollRight:
                                        break;
                                    default:
                                        switch (i2) {
                                            case android.R.id.accessibilityActionPageUp:
                                                Object g30 = tn1Var.g(rh2.x);
                                                r1 r1Var19 = (r1) (g30 == null ? null : g30);
                                                if (r1Var19 != null && (function013 = (Function0) r1Var19.b) != null) {
                                                    return ((Boolean) function013.invoke()).booleanValue();
                                                }
                                                break;
                                            case android.R.id.accessibilityActionPageDown:
                                                Object g31 = tn1Var.g(rh2.z);
                                                r1 r1Var20 = (r1) (g31 == null ? null : g31);
                                                if (r1Var20 != null && (function014 = (Function0) r1Var20.b) != null) {
                                                    return ((Boolean) function014.invoke()).booleanValue();
                                                }
                                                break;
                                            case android.R.id.accessibilityActionPageLeft:
                                                Object g32 = tn1Var.g(rh2.y);
                                                r1 r1Var21 = (r1) (g32 == null ? null : g32);
                                                if (r1Var21 != null && (function015 = (Function0) r1Var21.b) != null) {
                                                    return ((Boolean) function015.invoke()).booleanValue();
                                                }
                                                break;
                                            case android.R.id.accessibilityActionPageRight:
                                                Object g33 = tn1Var.g(rh2.A);
                                                r1 r1Var22 = (r1) (g33 == null ? null : g33);
                                                if (r1Var22 != null && (function016 = (Function0) r1Var22.b) != null) {
                                                    return ((Boolean) function016.invoke()).booleanValue();
                                                }
                                                break;
                                            default:
                                                yn2 yn2Var = (yn2) b8Var.u.c(i);
                                                if (yn2Var != null && ((CharSequence) yn2Var.c(i2)) != null) {
                                                    Object g34 = tn1Var.g(rh2.w);
                                                    List list = (List) (g34 == null ? null : g34);
                                                    if (list != null && list.size() > 0) {
                                                        list.get(0).getClass();
                                                        b71.o();
                                                        return false;
                                                    }
                                                }
                                                break;
                                        }
                                }
                        }
                    } else {
                        Object g35 = tn1Var.g(gi2.k);
                        if (g35 == null) {
                            g35 = null;
                        }
                        if (Intrinsics.b(g35, bool)) {
                            ((po0) t7Var.getFocusOwner()).b(8, false, true);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
