package x1;

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
import com.google.android.material.chip.Chip;
import com.snovikpovik.vuevnxsj.R;
import java.lang.reflect.Field;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w extends q3.k {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q3.b f8597g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(q3.b bVar, int i) {
        super(6);
        this.f8596f = i;
        this.f8597g = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:399:0x084b, code lost:
    
        if (r6 == false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013e, code lost:
    
        if (d2.n.j(4, r9).isEmpty() != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0cd4  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x082a A[LOOP:9: B:381:0x080d->B:390:0x082a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0831 A[EDGE_INSN: B:391:0x0831->B:392:0x0831 BREAK  A[LOOP:9: B:381:0x080d->B:390:0x082a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0a25  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0a60  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0abd  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0ac1  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0ad9  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0aee  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0af8  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0b1c  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0b2f  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0b42  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0c98  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0cb8  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0ccd  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0cae  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0c8b  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0b33  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0995  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r2v80, types: [d6.u] */
    /* JADX WARN: Type inference failed for: r2v81, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v82, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final r3.f t(int i) {
        r3.f fVar;
        Bundle bundle;
        AccessibilityManager accessibilityManager;
        o.u0 u0Var;
        a0 a0Var;
        t tVar;
        o.v vVar;
        d2.j jVar;
        AccessibilityNodeInfo accessibilityNodeInfo;
        o.j0 j0Var;
        Resources resources;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        d2.g gVar;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        AccessibilityNodeInfo accessibilityNodeInfo4;
        int i8;
        int i9;
        a0 a0Var2;
        boolean z3;
        d2.a aVar;
        d2.a aVar2;
        d2.a aVar3;
        String u7;
        d2.f fVar2;
        int i10;
        Object g3;
        d2.b bVar;
        d2.h hVar;
        d2.h hVar2;
        int d8;
        t tVar2;
        int d9;
        String str;
        Object g7;
        boolean z7;
        Object g8;
        boolean z8;
        w1.f0 f0Var;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        boolean z14;
        d2.n nVar;
        int i12;
        r3.f fVar3;
        androidx.lifecycle.w g9;
        Float valueOf = Float.valueOf(0.0f);
        a0 a0Var3 = (a0) this.f8597g;
        AccessibilityManager accessibilityManager2 = a0Var3.f8333g;
        t tVar3 = a0Var3.f8330d;
        m viewTreeOwners = tVar3.getViewTreeOwners();
        if (((viewTreeOwners == null || (g9 = viewTreeOwners.f8496a.g()) == null) ? null : g9.f871c) == androidx.lifecycle.p.f847d) {
            if (!accessibilityManager2.isEnabled()) {
                fVar3 = new r3.f(AccessibilityNodeInfo.obtain());
                i9 = i;
                fVar = fVar3;
                a0Var2 = a0Var3;
                if (a0Var2.f8343r) {
                    if (i9 == a0Var2.f8339n) {
                        a0Var2.f8341p = fVar;
                    }
                    if (i9 == a0Var2.f8340o) {
                        a0Var2.f8342q = fVar;
                    }
                }
                return fVar;
            }
            fVar3 = null;
            i9 = i;
            fVar = fVar3;
            a0Var2 = a0Var3;
            if (a0Var2.f8343r) {
            }
            return fVar;
        }
        d2.o oVar = (d2.o) a0Var3.t().b(i);
        if (oVar == null) {
            if (!accessibilityManager2.isEnabled()) {
                fVar3 = new r3.f(AccessibilityNodeInfo.obtain());
                i9 = i;
                fVar = fVar3;
                a0Var2 = a0Var3;
                if (a0Var2.f8343r) {
                }
                return fVar;
            }
            fVar3 = null;
            i9 = i;
            fVar = fVar3;
            a0Var2 = a0Var3;
            if (a0Var2.f8343r) {
            }
            return fVar;
        }
        d2.n nVar2 = oVar.f2163a;
        d2.j k3 = nVar2.k();
        w1.f0 f0Var2 = nVar2.f2158c;
        Object g10 = k3.f2150d.g(d2.s.f2200n);
        if (g10 == null) {
            g10 = null;
        }
        boolean a8 = q6.i.a(g10, Boolean.TRUE);
        if (a8) {
            if (!(Build.VERSION.SDK_INT >= 34 ? q3.v.h(accessibilityManager2) : true)) {
                i9 = i;
                a0Var2 = a0Var3;
                fVar = null;
                if (a0Var2.f8343r) {
                }
                return fVar;
            }
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        fVar = new r3.f(obtain);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            q3.v.j(obtain, a8);
            bundle = 0;
        } else {
            bundle = 0;
            fVar.h(64, a8);
        }
        if (i == -1) {
            Object parentForAccessibility = tVar3.getParentForAccessibility();
            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : bundle;
            fVar.f6558b = -1;
            obtain.setParent(view);
        } else {
            d2.n l3 = nVar2.l();
            Integer valueOf2 = l3 != null ? Integer.valueOf(l3.f2162g) : bundle;
            if (valueOf2 == null) {
                t1.a.c("semanticsNode " + i + " has null parent");
                throw new a5.c();
            }
            int intValue = valueOf2.intValue();
            if (intValue == tVar3.getSemanticsOwner().a().f2162g) {
                intValue = -1;
            }
            fVar.f6558b = intValue;
            obtain.setParent(tVar3, intValue);
        }
        fVar.f6559c = i;
        obtain.setSource(tVar3, i);
        obtain.setBoundsInScreen(a0Var3.k(oVar));
        o.v vVar2 = a0Var3.M;
        o.u0 u0Var2 = a0Var3.f8347v;
        Resources resources2 = tVar3.getContext().getResources();
        fVar.i("android.view.View");
        d2.j jVar2 = nVar2.f2159d;
        o.j0 j0Var2 = jVar2.f2150d;
        if (j0Var2.c(d2.s.D)) {
            fVar.i("android.widget.EditText");
        }
        if (j0Var2.c(d2.s.f2212z)) {
            fVar.i("android.widget.TextView");
        }
        Object g11 = j0Var2.g(d2.s.f2209w);
        if (g11 == null) {
            g11 = bundle;
        }
        d2.g gVar2 = (d2.g) g11;
        if (gVar2 != null) {
            int i14 = gVar2.f2122a;
            accessibilityManager = accessibilityManager2;
            if (nVar2.f2160e) {
                i12 = 4;
                u0Var = u0Var2;
            } else {
                i12 = 4;
                u0Var = u0Var2;
            }
            if (i14 == i12) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.tab));
            } else if (i14 == 2) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.switch_role));
            } else {
                String t3 = g0.t(i14);
                if (i14 != 5 || nVar2.o() || jVar2.f2152f) {
                    fVar.i(t3);
                }
            }
        } else {
            accessibilityManager = accessibilityManager2;
            u0Var = u0Var2;
        }
        obtain.setPackageName(tVar3.getContext().getPackageName());
        obtain.setImportantForAccessibility(d2.q.f(nVar2));
        boolean h8 = i13 >= 34 ? q3.v.h(accessibilityManager) : true;
        List j7 = d2.n.j(4, nVar2);
        int size = j7.size();
        boolean z15 = h8;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            AccessibilityNodeInfo accessibilityNodeInfo5 = fVar.f6557a;
            if (i16 < size) {
                List list = j7;
                d2.n nVar3 = (d2.n) j7.get(i16);
                int i17 = size;
                o.l t7 = a0Var3.t();
                int i18 = i16;
                int i19 = nVar3.f2162g;
                if (t7.a(i19)) {
                    if (tVar3.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(nVar3.f2158c) != null) {
                        throw new ClassCastException();
                    }
                    if (i19 != -1) {
                        d2.o oVar2 = (d2.o) a0Var3.t().b(i19);
                        if (oVar2 == null || (nVar = oVar2.f2163a) == null) {
                            z14 = false;
                        } else {
                            Object g12 = nVar.k().f2150d.g(d2.s.f2200n);
                            if (g12 == null) {
                                g12 = bundle;
                            }
                            z14 = q6.i.a(g12, Boolean.TRUE);
                        }
                        if (z15 || !z14) {
                            accessibilityNodeInfo5.addChild(tVar3, i19);
                        }
                        vVar2.f(i19, i15);
                        i15++;
                    }
                }
                i16 = i18 + 1;
                size = i17;
                j7 = list;
            } else {
                if (i == a0Var3.f8339n) {
                    accessibilityNodeInfo5.setAccessibilityFocused(true);
                    fVar.b(r3.d.f6543g);
                } else {
                    accessibilityNodeInfo5.setAccessibilityFocused(false);
                    fVar.b(r3.d.f6542f);
                }
                g2.e k7 = g0.k(nVar2);
                if (k7 != null) {
                    tVar3.getFontFamilyResolver();
                    r2.c density = tVar3.getDensity();
                    a0.g1 g1Var = a0Var3.I;
                    String str2 = k7.f2928e;
                    tVar = tVar3;
                    List list2 = k7.f2927d;
                    SpannableString spannableString2 = new SpannableString(str2);
                    ArrayList arrayList3 = k7.f2929f;
                    if (arrayList3 != null) {
                        int size2 = arrayList3.size();
                        a0Var = a0Var3;
                        int i20 = 0;
                        while (i20 < size2) {
                            ArrayList arrayList4 = arrayList3;
                            g2.c cVar = (g2.c) arrayList3.get(i20);
                            int i21 = i20;
                            g2.b0 b0Var = (g2.b0) cVar.f2917a;
                            int i22 = size2;
                            int i23 = cVar.f2918b;
                            int i24 = cVar.f2919c;
                            o.v vVar3 = vVar2;
                            d2.j jVar3 = jVar2;
                            long b8 = b0Var.f2903a.b();
                            Resources resources3 = resources2;
                            AccessibilityNodeInfo accessibilityNodeInfo6 = obtain;
                            long j8 = b0Var.f2904b;
                            j2.k kVar = b0Var.f2905c;
                            j2.i iVar = b0Var.f2906d;
                            q2.p pVar = b0Var.f2911j;
                            m2.b bVar2 = b0Var.f2912k;
                            AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfo5;
                            o.j0 j0Var3 = j0Var2;
                            long j9 = b0Var.f2913l;
                            q2.l lVar = b0Var.f2914m;
                            q2.o oVar3 = b0Var.f2903a;
                            d2.g gVar3 = gVar2;
                            a0.g1 g1Var2 = g1Var;
                            if (!f1.s.c(b8, oVar3.b())) {
                                oVar3 = b8 != 16 ? new q2.c(b8) : q2.n.f6060a;
                            }
                            m.a.L(spannableString2, oVar3.b(), i23, i24);
                            SpannableString spannableString3 = spannableString2;
                            m.a.M(spannableString3, j8, density, i23, i24);
                            if (kVar == null && iVar == null) {
                                i11 = 33;
                            } else {
                                i11 = 33;
                                spannableString3.setSpan(new StyleSpan(m.a.w(kVar == null ? j2.k.f3995f : kVar, iVar != null ? iVar.f3992a : 0)), i23, i24, 33);
                            }
                            if (lVar != null) {
                                int i25 = lVar.f6058a;
                                if ((i25 | 1) == i25) {
                                    spannableString3.setSpan(new UnderlineSpan(), i23, i24, i11);
                                }
                                if ((i25 | 2) == i25) {
                                    spannableString3.setSpan(new StrikethroughSpan(), i23, i24, i11);
                                }
                            }
                            if (pVar != null) {
                                spannableString3.setSpan(new ScaleXSpan(pVar.f6062a), i23, i24, i11);
                            }
                            m.a.N(spannableString3, bVar2, i23, i24);
                            if (j9 != 16) {
                                spannableString3.setSpan(new BackgroundColorSpan(f1.p.u(j9)), i23, i24, i11);
                            }
                            i20 = i21 + 1;
                            spannableString2 = spannableString3;
                            gVar2 = gVar3;
                            arrayList3 = arrayList4;
                            size2 = i22;
                            vVar2 = vVar3;
                            jVar2 = jVar3;
                            obtain = accessibilityNodeInfo6;
                            resources2 = resources3;
                            j0Var2 = j0Var3;
                            accessibilityNodeInfo5 = accessibilityNodeInfo7;
                            g1Var = g1Var2;
                        }
                    } else {
                        a0Var = a0Var3;
                    }
                    a0.g1 g1Var3 = g1Var;
                    SpannableString spannableString4 = spannableString2;
                    vVar = vVar2;
                    jVar = jVar2;
                    accessibilityNodeInfo = accessibilityNodeInfo5;
                    j0Var = j0Var2;
                    resources = resources2;
                    accessibilityNodeInfo2 = obtain;
                    gVar = gVar2;
                    int length = str2.length();
                    ?? r22 = d6.u.f2326d;
                    if (list2 != null) {
                        arrayList = new ArrayList(list2.size());
                        int size3 = list2.size();
                        for (int i26 = 0; i26 < size3; i26++) {
                            Object obj = list2.get(i26);
                            g2.c cVar2 = (g2.c) obj;
                            if ((cVar2.f2917a instanceof g2.k0) && g2.f.a(0, length, cVar2.f2918b, cVar2.f2919c)) {
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        arrayList = r22;
                    }
                    int size4 = arrayList.size();
                    for (int i27 = 0; i27 < size4; i27++) {
                        g2.c cVar3 = (g2.c) arrayList.get(i27);
                        g2.k0 k0Var = (g2.k0) cVar3.f2917a;
                        int i28 = cVar3.f2918b;
                        int i29 = cVar3.f2919c;
                        if (!(k0Var instanceof g2.k0)) {
                            throw new a5.c();
                        }
                        spannableString4.setSpan(new TtsSpan.VerbatimBuilder(k0Var.f2970a).build(), i28, i29, 33);
                    }
                    int length2 = str2.length();
                    if (list2 != null) {
                        arrayList2 = new ArrayList(list2.size());
                        int size5 = list2.size();
                        for (int i30 = 0; i30 < size5; i30++) {
                            Object obj2 = list2.get(i30);
                            g2.c cVar4 = (g2.c) obj2;
                            if ((cVar4.f2917a instanceof g2.j0) && g2.f.a(0, length2, cVar4.f2918b, cVar4.f2919c)) {
                                arrayList2.add(obj2);
                            }
                        }
                    } else {
                        arrayList2 = r22;
                    }
                    int size6 = arrayList2.size();
                    int i31 = 0;
                    while (i31 < size6) {
                        g2.c cVar5 = (g2.c) arrayList2.get(i31);
                        g2.j0 j0Var4 = (g2.j0) cVar5.f2917a;
                        int i32 = cVar5.f2918b;
                        int i33 = cVar5.f2919c;
                        a0.g1 g1Var4 = g1Var3;
                        WeakHashMap weakHashMap = (WeakHashMap) g1Var4.f84b;
                        Object obj3 = weakHashMap.get(j0Var4);
                        if (obj3 == null) {
                            obj3 = new URLSpan(j0Var4.f2969a);
                            weakHashMap.put(j0Var4, obj3);
                        }
                        spannableString4.setSpan((URLSpan) obj3, i32, i33, 33);
                        i31++;
                        g1Var3 = g1Var4;
                    }
                    a0.g1 g1Var5 = g1Var3;
                    int length3 = str2.length();
                    if (list2 != null) {
                        r22 = new ArrayList(list2.size());
                        int size7 = list2.size();
                        for (int i34 = 0; i34 < size7; i34++) {
                            Object obj4 = list2.get(i34);
                            g2.c cVar6 = (g2.c) obj4;
                            if ((cVar6.f2917a instanceof g2.k) && g2.f.a(0, length3, cVar6.f2918b, cVar6.f2919c)) {
                                r22.add(obj4);
                            }
                        }
                    }
                    int size8 = r22.size();
                    for (int i35 = 0; i35 < size8; i35++) {
                        g2.c cVar7 = (g2.c) r22.get(i35);
                        int i36 = cVar7.f2918b;
                        Object obj5 = cVar7.f2917a;
                        int i37 = cVar7.f2919c;
                        if (i36 != i37) {
                            g2.k kVar2 = (g2.k) obj5;
                            if (kVar2 instanceof g2.j) {
                                q6.i.c(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                g2.j jVar4 = (g2.j) obj5;
                                g2.c cVar8 = new g2.c(i36, i37, jVar4);
                                WeakHashMap weakHashMap2 = (WeakHashMap) g1Var5.f85c;
                                Object obj6 = weakHashMap2.get(cVar8);
                                if (obj6 == null) {
                                    obj6 = new URLSpan(jVar4.f2967a);
                                    weakHashMap2.put(cVar8, obj6);
                                }
                                spannableString4.setSpan((URLSpan) obj6, i36, i37, 33);
                            } else {
                                WeakHashMap weakHashMap3 = (WeakHashMap) g1Var5.f86d;
                                Object obj7 = weakHashMap3.get(cVar7);
                                if (obj7 == null) {
                                    obj7 = new n2.f(kVar2);
                                    weakHashMap3.put(cVar7, obj7);
                                }
                                spannableString4.setSpan((ClickableSpan) obj7, i36, i37, 33);
                            }
                        }
                    }
                    spannableString = (SpannableString) a0.O(spannableString4);
                } else {
                    a0Var = a0Var3;
                    tVar = tVar3;
                    vVar = vVar2;
                    jVar = jVar2;
                    accessibilityNodeInfo = accessibilityNodeInfo5;
                    j0Var = j0Var2;
                    resources = resources2;
                    accessibilityNodeInfo2 = obtain;
                    gVar = gVar2;
                    spannableString = bundle;
                }
                fVar.k(spannableString);
                d2.v vVar4 = d2.s.I;
                o.j0 j0Var5 = j0Var;
                if (j0Var5.c(vVar4)) {
                    accessibilityNodeInfo3 = accessibilityNodeInfo2;
                    accessibilityNodeInfo3.setContentInvalid(true);
                    Object g13 = j0Var5.g(vVar4);
                    if (g13 == null) {
                        g13 = bundle;
                    }
                    accessibilityNodeInfo4 = accessibilityNodeInfo;
                    accessibilityNodeInfo4.setError((CharSequence) g13);
                } else {
                    accessibilityNodeInfo3 = accessibilityNodeInfo2;
                    accessibilityNodeInfo4 = accessibilityNodeInfo;
                }
                Resources resources4 = resources;
                String j10 = g0.j(nVar2, resources4);
                if (Build.VERSION.SDK_INT >= 30) {
                    q3.i.f(accessibilityNodeInfo4, j10);
                } else {
                    accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", j10);
                }
                accessibilityNodeInfo4.setCheckable(g0.i(nVar2));
                Object g14 = j0Var5.g(d2.s.G);
                if (g14 == null) {
                    g14 = bundle;
                }
                f2.a aVar4 = (f2.a) g14;
                if (aVar4 != null) {
                    if (aVar4 == f2.a.f2711d) {
                        accessibilityNodeInfo4.setChecked(true);
                    } else if (aVar4 == f2.a.f2712e) {
                        accessibilityNodeInfo4.setChecked(false);
                    }
                }
                Object g15 = j0Var5.g(d2.s.F);
                if (g15 == null) {
                    g15 = bundle;
                }
                Boolean bool = (Boolean) g15;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (gVar == null) {
                        i8 = 4;
                    } else {
                        i8 = 4;
                        if (gVar.f2122a == 4) {
                            accessibilityNodeInfo3.setSelected(booleanValue);
                        }
                    }
                    accessibilityNodeInfo4.setChecked(booleanValue);
                } else {
                    i8 = 4;
                }
                d2.j jVar5 = jVar;
                if (!jVar5.f2152f || d2.n.j(i8, nVar2).isEmpty()) {
                    Object g16 = j0Var5.g(d2.s.f2188a);
                    if (g16 == null) {
                        g16 = bundle;
                    }
                    List list3 = (List) g16;
                    accessibilityNodeInfo4.setContentDescription(list3 != null ? (String) d6.m.S(list3) : bundle);
                }
                Object g17 = j0Var5.g(d2.s.f2210x);
                if (g17 == null) {
                    g17 = bundle;
                }
                String str3 = (String) g17;
                if (str3 != null) {
                    d2.n nVar4 = nVar2;
                    while (true) {
                        if (nVar4 == null) {
                            z13 = false;
                            break;
                        }
                        d2.j jVar6 = nVar4.f2159d;
                        d2.v vVar5 = d2.t.f2213a;
                        if (jVar6.f2150d.c(vVar5)) {
                            z13 = ((Boolean) jVar6.b(vVar5)).booleanValue();
                            break;
                        }
                        nVar4 = nVar4.l();
                    }
                    if (z13) {
                        accessibilityNodeInfo3.setViewIdResourceName(str3);
                    }
                }
                Object g18 = j0Var5.g(d2.s.f2195h);
                if (g18 == null) {
                    g18 = bundle;
                }
                if (((c6.m) g18) != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo4.setHeading(true);
                    } else {
                        fVar.h(2, true);
                    }
                }
                i9 = i;
                if (i9 != -1) {
                    int d10 = vVar.d(nVar2.f2162g);
                    if (d10 != -1) {
                        accessibilityNodeInfo3.setDrawingOrder(d10);
                    } else {
                        Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                    }
                }
                accessibilityNodeInfo3.setPassword(j0Var5.c(d2.s.H));
                accessibilityNodeInfo3.setEditable(j0Var5.c(d2.s.K));
                Object g19 = j0Var5.g(d2.s.L);
                if (g19 == null) {
                    g19 = bundle;
                }
                Integer num = (Integer) g19;
                accessibilityNodeInfo4.setMaxTextLength(num != null ? num.intValue() : -1);
                accessibilityNodeInfo4.setEnabled(g0.a(nVar2));
                d2.v vVar6 = d2.s.f2197k;
                accessibilityNodeInfo4.setFocusable(j0Var5.c(vVar6));
                if (accessibilityNodeInfo3.isFocusable()) {
                    accessibilityNodeInfo4.setFocused(((Boolean) jVar5.b(vVar6)).booleanValue());
                    if (accessibilityNodeInfo3.isFocused()) {
                        fVar.a(2);
                        a0Var2 = a0Var;
                        a0Var2.f8340o = i9;
                    } else {
                        a0Var2 = a0Var;
                        z3 = true;
                        fVar.a(1);
                        accessibilityNodeInfo4.setVisibleToUser(d2.q.e(nVar2) ^ z3);
                        a0.q.q(d2.q.d(jVar5, d2.s.f2196j));
                        accessibilityNodeInfo4.setClickable(false);
                        aVar = (d2.a) d2.q.d(jVar5, d2.i.f2126b);
                        char c8 = 3;
                        if (aVar != null) {
                            boolean a9 = q6.i.a(d2.q.d(jVar5, d2.s.F), Boolean.TRUE);
                            if (!(gVar != null && gVar.f2122a == 4)) {
                                if (!(gVar != null && gVar.f2122a == 3)) {
                                    z12 = false;
                                    accessibilityNodeInfo4.setClickable(z12 || (z12 && !a9));
                                    if (g0.a(nVar2) && accessibilityNodeInfo3.isClickable()) {
                                        fVar.b(new r3.d(aVar.f2108a, 16));
                                    }
                                }
                            }
                            z12 = true;
                            accessibilityNodeInfo4.setClickable(z12 || (z12 && !a9));
                            if (g0.a(nVar2)) {
                                fVar.b(new r3.d(aVar.f2108a, 16));
                            }
                        }
                        accessibilityNodeInfo4.setLongClickable(false);
                        aVar2 = (d2.a) d2.q.d(jVar5, d2.i.f2127c);
                        if (aVar2 != null) {
                            accessibilityNodeInfo4.setLongClickable(true);
                            if (g0.a(nVar2)) {
                                fVar.b(new r3.d(aVar2.f2108a, 32));
                            }
                        }
                        aVar3 = (d2.a) d2.q.d(jVar5, d2.i.f2138o);
                        if (aVar3 != null) {
                            fVar.b(new r3.d(aVar3.f2108a, 16384));
                        }
                        if (g0.a(nVar2)) {
                            d2.a aVar5 = (d2.a) d2.q.d(jVar5, d2.i.f2133j);
                            if (aVar5 != null) {
                                fVar.b(new r3.d(aVar5.f2108a, 2097152));
                            }
                            d2.a aVar6 = (d2.a) d2.q.d(jVar5, d2.i.f2137n);
                            if (aVar6 != null) {
                                fVar.b(new r3.d(aVar6.f2108a, android.R.id.accessibilityActionImeEnter));
                            }
                            d2.a aVar7 = (d2.a) d2.q.d(jVar5, d2.i.f2139p);
                            if (aVar7 != null) {
                                fVar.b(new r3.d(aVar7.f2108a, 65536));
                            }
                            d2.a aVar8 = (d2.a) d2.q.d(jVar5, d2.i.f2140q);
                            if (aVar8 != null && accessibilityNodeInfo3.isFocused()) {
                                ClipDescription primaryClipDescription = tVar.m9getClipboardManager().f8422a.getPrimaryClipDescription();
                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                    fVar.b(new r3.d(aVar8.f2108a, 32768));
                                }
                            }
                        }
                        u7 = a0.u(nVar2);
                        if (!(u7 != null || u7.length() == 0)) {
                            accessibilityNodeInfo3.setTextSelection(a0Var2.s(nVar2), a0Var2.r(nVar2));
                            d2.a aVar9 = (d2.a) d2.q.d(jVar5, d2.i.i);
                            fVar.b(new r3.d(aVar9 != null ? aVar9.f2108a : bundle, 131072));
                            fVar.a(256);
                            fVar.a(512);
                            accessibilityNodeInfo4.setMovementGranularities(11);
                            List list4 = (List) d2.q.d(jVar5, d2.s.f2188a);
                            if ((list4 == null || list4.isEmpty()) && j0Var5.c(d2.i.f2125a)) {
                                if (!j0Var5.c(d2.s.D) || q6.i.a(d2.q.d(jVar5, vVar6), Boolean.TRUE)) {
                                    w1.f0 s5 = f0Var2.s();
                                    while (true) {
                                        if (s5 == null) {
                                            s5 = bundle;
                                            break;
                                        }
                                        d2.j u8 = s5.u();
                                        if (u8 != null && u8.f2152f) {
                                            if (u8.f2150d.c(d2.s.D)) {
                                                z11 = true;
                                                if (!z11) {
                                                    break;
                                                }
                                                s5 = s5.s();
                                            }
                                        }
                                        z11 = false;
                                        if (!z11) {
                                        }
                                    }
                                    if (s5 != null) {
                                        d2.j u9 = s5.u();
                                        if (u9 != null) {
                                            Object g20 = u9.f2150d.g(vVar6);
                                            if (g20 == null) {
                                                g20 = bundle;
                                            }
                                            z10 = q6.i.a(g20, Boolean.TRUE);
                                        } else {
                                            z10 = false;
                                        }
                                    }
                                    z9 = false;
                                    if (!z9) {
                                        accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                    }
                                }
                                z9 = true;
                                if (!z9) {
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add("androidx.compose.ui.semantics.id");
                            CharSequence g21 = fVar.g();
                            if (!(g21 == null || g21.length() == 0) && j0Var5.c(d2.i.f2125a)) {
                                arrayList5.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (j0Var5.c(d2.s.f2210x)) {
                                arrayList5.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (j0Var5.c(d2.s.M)) {
                                arrayList5.add("androidx.compose.ui.semantics.shapeType");
                                arrayList5.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList5.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList5.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                accessibilityNodeInfo3.setAvailableExtraData(arrayList5);
                            }
                        }
                        fVar2 = (d2.f) d2.q.d(jVar5, d2.s.f2190c);
                        if (fVar2 != null) {
                            float f6 = fVar2.f2120a;
                            v6.a aVar10 = fVar2.f2121b;
                            d2.v vVar7 = d2.i.f2132h;
                            if (j0Var5.c(vVar7)) {
                                fVar.i("android.widget.SeekBar");
                            } else {
                                fVar.i("android.widget.ProgressBar");
                            }
                            if (fVar2 != d2.f.f2119c) {
                                fVar.f6557a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new q0.e(AccessibilityNodeInfo.RangeInfo.obtain(1, valueOf.floatValue(), Float.valueOf(aVar10.f7491a).floatValue(), f6)).f5938a);
                            }
                            if (nVar2.m().f2150d.c(vVar7) && g0.a(nVar2)) {
                                float floatValue = Float.valueOf(aVar10.f7491a).floatValue();
                                float floatValue2 = valueOf.floatValue();
                                if (floatValue < floatValue2) {
                                    floatValue = floatValue2;
                                }
                                if (f6 < floatValue) {
                                    fVar.b(r3.d.f6544h);
                                }
                                float floatValue3 = valueOf.floatValue();
                                float floatValue4 = Float.valueOf(aVar10.f7491a).floatValue();
                                if (floatValue3 > floatValue4) {
                                    floatValue3 = floatValue4;
                                }
                                if (f6 > floatValue3) {
                                    fVar.b(r3.d.i);
                                }
                            }
                        }
                        i10 = Build.VERSION.SDK_INT;
                        if (g0.a(nVar2)) {
                            Object g22 = nVar2.f2159d.f2150d.g(d2.i.f2132h);
                            if (g22 == null) {
                                g22 = null;
                            }
                            d2.a aVar11 = (d2.a) g22;
                            if (aVar11 != null) {
                                fVar.b(new r3.d(aVar11.f2108a, android.R.id.accessibilityActionSetProgress));
                            }
                        }
                        g3 = nVar2.k().f2150d.g(d2.s.f2193f);
                        if (g3 == null) {
                            g3 = null;
                        }
                        bVar = (d2.b) g3;
                        AccessibilityNodeInfo accessibilityNodeInfo8 = fVar.f6557a;
                        if (bVar == null) {
                            accessibilityNodeInfo8.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bVar.f2110a, bVar.f2111b, false, 0));
                        } else {
                            ArrayList arrayList6 = new ArrayList();
                            Object g23 = nVar2.k().f2150d.g(d2.s.f2192e);
                            if ((g23 != null ? g23 : null) != null) {
                                List j11 = d2.n.j(4, nVar2);
                                int size9 = j11.size();
                                int i38 = 0;
                                while (i38 < size9) {
                                    d2.n nVar5 = (d2.n) j11.get(i38);
                                    char c9 = c8;
                                    if (nVar5.k().f2150d.c(d2.s.F)) {
                                        arrayList6.add(nVar5);
                                    }
                                    i38++;
                                    c8 = c9;
                                }
                            }
                            if (!arrayList6.isEmpty()) {
                                boolean k8 = r2.r.k(arrayList6);
                                accessibilityNodeInfo8.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(k8 ? 1 : arrayList6.size(), k8 ? arrayList6.size() : 1, false, 0));
                            }
                        }
                        r2.r.V(nVar2, fVar);
                        hVar = (d2.h) d2.q.d(nVar2.m(), d2.s.f2206t);
                        d2.a aVar12 = (d2.a) d2.q.d(nVar2.m(), d2.i.f2128d);
                        if (hVar != null && aVar12 != null) {
                            g8 = nVar2.k().f2150d.g(d2.s.f2193f);
                            if (g8 == null) {
                                g8 = bundle;
                            }
                            if (g8 == null) {
                                Object g24 = nVar2.k().f2150d.g(d2.s.f2192e);
                                if (g24 == null) {
                                    g24 = bundle;
                                }
                                if (g24 == null) {
                                    z8 = false;
                                    if (!z8) {
                                        fVar.i("android.widget.HorizontalScrollView");
                                    }
                                    if (((Number) hVar.f2124b.b()).floatValue() > 0.0f) {
                                        fVar.j(true);
                                    }
                                    if (g0.a(nVar2)) {
                                        boolean z16 = a0.z(hVar);
                                        r2.l lVar2 = r2.l.f6530e;
                                        if (z16) {
                                            fVar.b(r3.d.f6544h);
                                            f0Var = f0Var2;
                                            fVar.b(!(f0Var.f7660z == lVar2) ? r3.d.f6551p : r3.d.f6549n);
                                        } else {
                                            f0Var = f0Var2;
                                        }
                                        if (a0.y(hVar)) {
                                            fVar.b(r3.d.i);
                                            fVar.b(!(f0Var.f7660z == lVar2) ? r3.d.f6549n : r3.d.f6551p);
                                        }
                                    }
                                }
                            }
                            z8 = true;
                            if (!z8) {
                            }
                            if (((Number) hVar.f2124b.b()).floatValue() > 0.0f) {
                            }
                            if (g0.a(nVar2)) {
                            }
                        }
                        hVar2 = (d2.h) d2.q.d(nVar2.m(), d2.s.f2207u);
                        if (hVar2 != null && aVar12 != null) {
                            g7 = nVar2.k().f2150d.g(d2.s.f2193f);
                            if (g7 == null) {
                                g7 = bundle;
                            }
                            if (g7 == null) {
                                Object g25 = nVar2.k().f2150d.g(d2.s.f2192e);
                                if (g25 == null) {
                                    g25 = bundle;
                                }
                                if (g25 == null) {
                                    z7 = false;
                                    if (!z7) {
                                        fVar.i("android.widget.ScrollView");
                                    }
                                    if (((Number) hVar2.f2124b.b()).floatValue() > 0.0f) {
                                        fVar.j(true);
                                    }
                                    if (g0.a(nVar2)) {
                                        if (a0.z(hVar2)) {
                                            fVar.b(r3.d.f6544h);
                                            fVar.b(r3.d.f6550o);
                                        }
                                        if (a0.y(hVar2)) {
                                            fVar.b(r3.d.i);
                                            fVar.b(r3.d.f6548m);
                                        }
                                    }
                                }
                            }
                            z7 = true;
                            if (!z7) {
                            }
                            if (((Number) hVar2.f2124b.b()).floatValue() > 0.0f) {
                            }
                            if (g0.a(nVar2)) {
                            }
                        }
                        if (i10 >= 29) {
                            g0.e(nVar2, fVar);
                        }
                        CharSequence charSequence = (CharSequence) d2.q.d(nVar2.m(), d2.s.f2191d);
                        if (i10 < 28) {
                            accessibilityNodeInfo4.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (g0.a(nVar2)) {
                            d2.a aVar13 = (d2.a) d2.q.d(nVar2.m(), d2.i.f2141r);
                            if (aVar13 != null) {
                                fVar.b(new r3.d(aVar13.f2108a, 262144));
                            }
                            d2.a aVar14 = (d2.a) d2.q.d(nVar2.m(), d2.i.f2142s);
                            if (aVar14 != null) {
                                fVar.b(new r3.d(aVar14.f2108a, 524288));
                            }
                            d2.a aVar15 = (d2.a) d2.q.d(nVar2.m(), d2.i.f2143t);
                            if (aVar15 != null) {
                                fVar.b(new r3.d(aVar15.f2108a, 1048576));
                            }
                            d2.j m7 = nVar2.m();
                            d2.v vVar8 = d2.i.f2145v;
                            if (m7.f2150d.c(vVar8)) {
                                List list5 = (List) nVar2.m().b(vVar8);
                                int size10 = list5.size();
                                o.w wVar = a0.Q;
                                if (size10 >= wVar.f5560b) {
                                    throw new IllegalStateException("Can't have more than " + wVar.f5560b + " custom actions for one widget");
                                }
                                o.u0 u0Var3 = new o.u0(0);
                                o.d0 a10 = o.o0.a();
                                o.u0 u0Var4 = u0Var;
                                if (u0Var4.f5547d) {
                                    o.r.a(u0Var4);
                                }
                                if (p.a.a(u0Var4.f5550g, i9, u0Var4.f5548e) >= 0) {
                                    o.d0 d0Var = (o.d0) u0Var4.c(i9);
                                    int[] iArr = wVar.f5559a;
                                    int i39 = wVar.f5560b;
                                    int[] iArr2 = new int[16];
                                    int i40 = 0;
                                    int i41 = 0;
                                    while (i40 < i39) {
                                        int i42 = iArr[i40];
                                        int i43 = i39;
                                        int i44 = i41 + 1;
                                        o.d0 d0Var2 = d0Var;
                                        if (iArr2.length < i44) {
                                            int[] copyOf = Arrays.copyOf(iArr2, Math.max(i44, (iArr2.length * 3) / 2));
                                            q6.i.d(copyOf, "copyOf(...)");
                                            iArr2 = copyOf;
                                        }
                                        iArr2[i41] = i42;
                                        i40++;
                                        i41 = i44;
                                        i39 = i43;
                                        d0Var = d0Var2;
                                    }
                                    o.d0 d0Var3 = d0Var;
                                    ArrayList arrayList7 = new ArrayList();
                                    if (list5.size() > 0) {
                                        a0.q.q(list5.get(0));
                                        q6.i.b(d0Var3);
                                        throw bundle;
                                    }
                                    if (arrayList7.size() > 0) {
                                        a0.q.q(arrayList7.get(0));
                                        if (i41 > 0) {
                                            int i45 = iArr2[0];
                                            throw bundle;
                                        }
                                        p.a.d("Index must be between 0 and size");
                                        throw bundle;
                                    }
                                } else if (list5.size() > 0) {
                                    a0.q.q(list5.get(0));
                                    wVar.b(0);
                                    throw bundle;
                                }
                                a0Var2.f8346u.e(i9, u0Var3);
                                u0Var4.e(i9, a10);
                            }
                        }
                        boolean c10 = g0.c(nVar2, resources4);
                        if (Build.VERSION.SDK_INT < 28) {
                            accessibilityNodeInfo4.setScreenReaderFocusable(c10);
                        } else {
                            fVar.h(1, c10);
                        }
                        d8 = a0Var2.E.d(i9);
                        if (d8 == -1) {
                            g0.r(tVar.getAndroidViewsHandler$ui_release(), d8);
                            tVar2 = tVar;
                            fVar.f6557a.setTraversalBefore(tVar2, d8);
                            a0Var2.j(i9, fVar, a0Var2.G, bundle);
                        } else {
                            tVar2 = tVar;
                        }
                        d9 = a0Var2.F.d(i9);
                        if (d9 != -1) {
                            g0.r(tVar2.getAndroidViewsHandler$ui_release(), d9);
                        }
                        str = (String) d2.q.d(nVar2.m(), d2.t.f2214b);
                        if (str != null) {
                            fVar.i(str);
                        }
                    }
                } else {
                    a0Var2 = a0Var;
                }
                z3 = true;
                accessibilityNodeInfo4.setVisibleToUser(d2.q.e(nVar2) ^ z3);
                a0.q.q(d2.q.d(jVar5, d2.s.f2196j));
                accessibilityNodeInfo4.setClickable(false);
                aVar = (d2.a) d2.q.d(jVar5, d2.i.f2126b);
                char c82 = 3;
                if (aVar != null) {
                }
                accessibilityNodeInfo4.setLongClickable(false);
                aVar2 = (d2.a) d2.q.d(jVar5, d2.i.f2127c);
                if (aVar2 != null) {
                }
                aVar3 = (d2.a) d2.q.d(jVar5, d2.i.f2138o);
                if (aVar3 != null) {
                }
                if (g0.a(nVar2)) {
                }
                u7 = a0.u(nVar2);
                if (!(u7 != null || u7.length() == 0)) {
                }
                if (Build.VERSION.SDK_INT >= 26) {
                }
                fVar2 = (d2.f) d2.q.d(jVar5, d2.s.f2190c);
                if (fVar2 != null) {
                }
                i10 = Build.VERSION.SDK_INT;
                if (g0.a(nVar2)) {
                }
                g3 = nVar2.k().f2150d.g(d2.s.f2193f);
                if (g3 == null) {
                }
                bVar = (d2.b) g3;
                AccessibilityNodeInfo accessibilityNodeInfo82 = fVar.f6557a;
                if (bVar == null) {
                }
                r2.r.V(nVar2, fVar);
                hVar = (d2.h) d2.q.d(nVar2.m(), d2.s.f2206t);
                d2.a aVar122 = (d2.a) d2.q.d(nVar2.m(), d2.i.f2128d);
                if (hVar != null) {
                    g8 = nVar2.k().f2150d.g(d2.s.f2193f);
                    if (g8 == null) {
                    }
                    if (g8 == null) {
                    }
                    z8 = true;
                    if (!z8) {
                    }
                    if (((Number) hVar.f2124b.b()).floatValue() > 0.0f) {
                    }
                    if (g0.a(nVar2)) {
                    }
                }
                hVar2 = (d2.h) d2.q.d(nVar2.m(), d2.s.f2207u);
                if (hVar2 != null) {
                    g7 = nVar2.k().f2150d.g(d2.s.f2193f);
                    if (g7 == null) {
                    }
                    if (g7 == null) {
                    }
                    z7 = true;
                    if (!z7) {
                    }
                    if (((Number) hVar2.f2124b.b()).floatValue() > 0.0f) {
                    }
                    if (g0.a(nVar2)) {
                    }
                }
                if (i10 >= 29) {
                }
                CharSequence charSequence2 = (CharSequence) d2.q.d(nVar2.m(), d2.s.f2191d);
                if (i10 < 28) {
                }
                if (g0.a(nVar2)) {
                }
                boolean c102 = g0.c(nVar2, resources4);
                if (Build.VERSION.SDK_INT < 28) {
                }
                d8 = a0Var2.E.d(i9);
                if (d8 == -1) {
                }
                d9 = a0Var2.F.d(i9);
                if (d9 != -1) {
                }
                str = (String) d2.q.d(nVar2.m(), d2.t.f2214b);
                if (str != null) {
                }
            }
        }
    }

    @Override // q3.k
    public void e(int i, r3.f fVar, String str, Bundle bundle) {
        switch (this.f8596f) {
            case 0:
                ((a0) this.f8597g).j(i, fVar, str, bundle);
                break;
        }
    }

    @Override // q3.k
    public final r3.f f(int i) {
        switch (this.f8596f) {
            case 0:
                return t(i);
            default:
                return new r3.f(AccessibilityNodeInfo.obtain(((x3.a) this.f8597g).n(i).f6557a));
        }
    }

    @Override // q3.k
    public final r3.f g(int i) {
        switch (this.f8596f) {
            case 0:
                a0 a0Var = (a0) this.f8597g;
                if (i != 1) {
                    if (i == 2) {
                        return f(a0Var.f8339n);
                    }
                    throw new IllegalArgumentException(a0.q.h("Unknown focus type: ", i));
                }
                int i8 = a0Var.f8340o;
                if (i8 == Integer.MIN_VALUE) {
                    return null;
                }
                return f(i8);
            default:
                x3.a aVar = (x3.a) this.f8597g;
                int i9 = i == 2 ? aVar.f8624k : aVar.f8625l;
                if (i9 == Integer.MIN_VALUE) {
                    return null;
                }
                return f(i9);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x036c, code lost:
    
        if (((java.lang.Boolean) r1.g(java.lang.Float.valueOf(r3), java.lang.Float.valueOf(r16))).booleanValue() == true) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x023d, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0777, code lost:
    
        if (r0 != 16) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        if (r8 == false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0834  */
    @Override // q3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(int i, int i8, Bundle bundle) {
        boolean z3;
        d2.n nVar;
        boolean z7;
        Integer num;
        w4.u uVar;
        int i9;
        int i10;
        g2.f0 m7;
        c cVar;
        p6.a aVar;
        int i11;
        int i12;
        p6.a aVar2;
        p6.a aVar3;
        p6.a aVar4;
        Float f6;
        d2.a aVar5;
        p6.a aVar6;
        float intBitsToFloat;
        d2.a aVar7;
        p6.a aVar8;
        p6.c cVar2;
        p6.a aVar9;
        p6.a aVar10;
        p6.a aVar11;
        p6.a aVar12;
        p6.a aVar13;
        p6.c cVar3;
        d2.a aVar14;
        long j7;
        Object g3;
        float f8;
        float f9;
        p6.c cVar4;
        p6.a aVar15;
        p6.a aVar16;
        p6.a aVar17;
        p6.a aVar18;
        p6.a aVar19;
        boolean z8;
        int i13;
        int i14 = this.f8596f;
        q3.b bVar = this.f8597g;
        boolean z9 = false;
        switch (i14) {
            case 0:
                a0 a0Var = (a0) bVar;
                AccessibilityManager accessibilityManager = a0Var.f8333g;
                Float valueOf = Float.valueOf(0.0f);
                t tVar = a0Var.f8330d;
                d2.o oVar = (d2.o) a0Var.t().b(i);
                if (oVar == null || (nVar = oVar.f2163a) == null) {
                    z3 = false;
                } else {
                    w1.f0 f0Var = nVar.f2158c;
                    int i15 = nVar.f2162g;
                    d2.j jVar = nVar.f2159d;
                    o.j0 j0Var = jVar.f2150d;
                    Object g7 = j0Var.g(d2.s.f2200n);
                    if (g7 == null) {
                        g7 = null;
                    }
                    Boolean bool = Boolean.TRUE;
                    if (q6.i.a(g7, bool)) {
                        if (Build.VERSION.SDK_INT < 34) {
                            z8 = true;
                            break;
                        } else {
                            z8 = q3.v.h(accessibilityManager);
                            break;
                        }
                    }
                    if (i8 != 64) {
                        if (i8 != 128) {
                            if (i8 == 256 || i8 == 512) {
                                if (bundle != null) {
                                    int i16 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                                    boolean z10 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                                    boolean z11 = i8 == 256;
                                    Integer num2 = a0Var.f8349x;
                                    if (num2 == null || i15 != num2.intValue()) {
                                        a0Var.f8348w = -1;
                                        a0Var.f8349x = Integer.valueOf(i15);
                                    }
                                    String u7 = a0.u(nVar);
                                    if (u7 != null && u7.length() != 0) {
                                        String u8 = a0.u(nVar);
                                        if (u8 != null && u8.length() != 0) {
                                            if (i16 == 1) {
                                                Locale locale = tVar.getContext().getResources().getConfiguration().locale;
                                                if (b.f8356e == null) {
                                                    b bVar2 = new b(0);
                                                    bVar2.f8361d = BreakIterator.getCharacterInstance(locale);
                                                    b.f8356e = bVar2;
                                                }
                                                b bVar3 = b.f8356e;
                                                q6.i.c(bVar3, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                                                bVar3.u(u8);
                                                uVar = bVar3;
                                            } else if (i16 != 2) {
                                                if (i16 != 4) {
                                                    if (i16 != 8) {
                                                        break;
                                                    } else {
                                                        if (d.f8393c == null) {
                                                            d.f8393c = new d();
                                                        }
                                                        d dVar = d.f8393c;
                                                        q6.i.c(dVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                                                        dVar.f8038a = u8;
                                                        uVar = dVar;
                                                    }
                                                }
                                                if (j0Var.c(d2.i.f2125a) && (m7 = g0.m(jVar)) != null) {
                                                    if (i16 == 4) {
                                                        if (b.f8358g == null) {
                                                            b.f8358g = new b(2);
                                                        }
                                                        b bVar4 = b.f8358g;
                                                        q6.i.c(bVar4, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                                                        bVar4.f8038a = u8;
                                                        bVar4.f8361d = m7;
                                                        cVar = bVar4;
                                                    } else {
                                                        if (c.f8385e == null) {
                                                            c cVar5 = new c();
                                                            new Rect();
                                                            c.f8385e = cVar5;
                                                        }
                                                        c cVar6 = c.f8385e;
                                                        q6.i.c(cVar6, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                                                        cVar6.f8038a = u8;
                                                        cVar6.f8388c = m7;
                                                        cVar6.f8389d = nVar;
                                                        cVar = cVar6;
                                                    }
                                                    uVar = cVar;
                                                }
                                            } else {
                                                Locale locale2 = tVar.getContext().getResources().getConfiguration().locale;
                                                if (b.f8357f == null) {
                                                    b bVar5 = new b(1);
                                                    bVar5.f8361d = BreakIterator.getWordInstance(locale2);
                                                    b.f8357f = bVar5;
                                                }
                                                b bVar6 = b.f8357f;
                                                q6.i.c(bVar6, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                                                bVar6.u(u8);
                                                uVar = bVar6;
                                            }
                                            if (uVar != null) {
                                                int r7 = a0Var.r(nVar);
                                                if (r7 == -1) {
                                                    r7 = z11 ? 0 : u7.length();
                                                }
                                                int[] b8 = z11 ? uVar.b(r7) : uVar.s(r7);
                                                if (b8 != null) {
                                                    int i17 = b8[0];
                                                    int i18 = b8[1];
                                                    if (z10 && !j0Var.c(d2.s.f2188a) && j0Var.c(d2.s.D)) {
                                                        i9 = a0Var.s(nVar);
                                                        if (i9 == -1) {
                                                            i9 = z11 ? i17 : i18;
                                                        }
                                                        i10 = z11 ? i18 : i17;
                                                    } else {
                                                        i9 = z11 ? i18 : i17;
                                                        i10 = i9;
                                                    }
                                                    a0Var.B = new x(nVar, z11 ? 256 : 512, i16, i17, i18, SystemClock.uptimeMillis());
                                                    z7 = true;
                                                    a0Var.K(nVar, i9, i10, true);
                                                }
                                            }
                                        }
                                        uVar = null;
                                        if (uVar != null) {
                                        }
                                    }
                                }
                            } else if (i8 == 16384) {
                                Object g8 = j0Var.g(d2.i.f2138o);
                                d2.a aVar20 = (d2.a) (g8 == null ? null : g8);
                                if (aVar20 != null && (aVar = (p6.a) aVar20.f2109b) != null) {
                                    return ((Boolean) aVar.b()).booleanValue();
                                }
                            } else {
                                if (i8 == 131072) {
                                    if (bundle != null) {
                                        i11 = -1;
                                        i12 = bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                                    } else {
                                        i11 = -1;
                                        i12 = -1;
                                    }
                                    boolean K = a0Var.K(nVar, i12, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", i11) : -1, false);
                                    if (K) {
                                        a0.E(a0Var, a0Var.A(i15), 0, null, 12);
                                    }
                                    return K;
                                }
                                if (g0.a(nVar)) {
                                    if (i8 == 1) {
                                        if (tVar.isInTouchMode()) {
                                            tVar.requestFocusFromTouch();
                                        }
                                        Object g9 = j0Var.g(d2.i.f2144u);
                                        d2.a aVar21 = (d2.a) (g9 == null ? null : g9);
                                        if (aVar21 != null && (aVar2 = (p6.a) aVar21.f2109b) != null) {
                                            return ((Boolean) aVar2.b()).booleanValue();
                                        }
                                    } else if (i8 != 2) {
                                        r2.l lVar = r2.l.f6530e;
                                        switch (i8) {
                                            case 16:
                                                Object g10 = j0Var.g(d2.i.f2126b);
                                                if (g10 == null) {
                                                    g10 = null;
                                                }
                                                d2.a aVar22 = (d2.a) g10;
                                                Boolean bool2 = (aVar22 == null || (aVar3 = (p6.a) aVar22.f2109b) == null) ? null : (Boolean) aVar3.b();
                                                a0.E(a0Var, i, 1, null, 12);
                                                if (bool2 != null) {
                                                    return bool2.booleanValue();
                                                }
                                                break;
                                            case 32:
                                                Object g11 = j0Var.g(d2.i.f2127c);
                                                d2.a aVar23 = (d2.a) (g11 == null ? null : g11);
                                                if (aVar23 != null && (aVar4 = (p6.a) aVar23.f2109b) != null) {
                                                    return ((Boolean) aVar4.b()).booleanValue();
                                                }
                                                break;
                                            case 4096:
                                            case 8192:
                                                boolean z12 = i8 == 4096;
                                                boolean z13 = i8 == 8192;
                                                boolean z14 = i8 == 16908345;
                                                boolean z15 = i8 == 16908347;
                                                boolean z16 = i8 == 16908344;
                                                boolean z17 = i8 == 16908346;
                                                boolean z18 = z14 || z15 || z12 || z13;
                                                boolean z19 = z16 || z17 || z12 || z13;
                                                if (z12 || z13) {
                                                    Object g12 = j0Var.g(d2.s.f2190c);
                                                    if (g12 == null) {
                                                        g12 = null;
                                                    }
                                                    d2.f fVar = (d2.f) g12;
                                                    Object g13 = j0Var.g(d2.i.f2132h);
                                                    if (g13 == null) {
                                                        g13 = null;
                                                    }
                                                    d2.a aVar24 = (d2.a) g13;
                                                    if (fVar != null) {
                                                        v6.a aVar25 = fVar.f2121b;
                                                        if (aVar24 != null) {
                                                            float f10 = aVar25.f7491a;
                                                            float f11 = ((f10 < 0.0f ? 0.0f : f10) - (0.0f > f10 ? f10 : 0.0f)) / 20;
                                                            if (z13) {
                                                                f11 = -f11;
                                                            }
                                                            p6.c cVar7 = (p6.c) aVar24.f2109b;
                                                            if (cVar7 != null) {
                                                                return ((Boolean) cVar7.i(Float.valueOf(fVar.f2120a + f11))).booleanValue();
                                                            }
                                                        }
                                                    }
                                                }
                                                long b9 = u1.s0.d(f0Var.F.f7597c).b();
                                                ArrayList arrayList = new ArrayList();
                                                Object g14 = j0Var.g(d2.i.A);
                                                if (g14 == null) {
                                                    g14 = null;
                                                }
                                                d2.a aVar26 = (d2.a) g14;
                                                Float f12 = (aVar26 == null || (cVar2 = (p6.c) aVar26.f2109b) == null || !((Boolean) cVar2.i(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                                Object g15 = j0Var.g(d2.i.f2128d);
                                                if (g15 == null) {
                                                    g15 = null;
                                                }
                                                d2.a aVar27 = (d2.a) g15;
                                                if (aVar27 != null) {
                                                    c6.c cVar8 = aVar27.f2109b;
                                                    Object g16 = j0Var.g(d2.s.f2206t);
                                                    if (g16 == null) {
                                                        g16 = null;
                                                    }
                                                    d2.h hVar = (d2.h) g16;
                                                    if (hVar == null || !z18) {
                                                        f6 = f12;
                                                    } else {
                                                        if (f12 != null) {
                                                            intBitsToFloat = f12.floatValue();
                                                            f6 = f12;
                                                        } else {
                                                            f6 = f12;
                                                            intBitsToFloat = Float.intBitsToFloat((int) (b9 >> 32));
                                                        }
                                                        if (z14 || z13) {
                                                            intBitsToFloat = -intBitsToFloat;
                                                        }
                                                        if ((f0Var.f7660z == lVar) && (z14 || z15)) {
                                                            intBitsToFloat = -intBitsToFloat;
                                                        }
                                                        if (a0.x(hVar, intBitsToFloat)) {
                                                            d2.v vVar = d2.i.f2147x;
                                                            if (j0Var.c(vVar) || j0Var.c(d2.i.f2149z)) {
                                                                if (intBitsToFloat > 0.0f) {
                                                                    Object g17 = j0Var.g(d2.i.f2149z);
                                                                    aVar7 = (d2.a) (g17 == null ? null : g17);
                                                                } else {
                                                                    Object g18 = j0Var.g(vVar);
                                                                    aVar7 = (d2.a) (g18 == null ? null : g18);
                                                                }
                                                                if (aVar7 != null && (aVar8 = (p6.a) aVar7.f2109b) != null) {
                                                                    return ((Boolean) aVar8.b()).booleanValue();
                                                                }
                                                            } else {
                                                                p6.e eVar = (p6.e) cVar8;
                                                                if (eVar != null) {
                                                                    return ((Boolean) eVar.g(Float.valueOf(intBitsToFloat), valueOf)).booleanValue();
                                                                }
                                                            }
                                                        }
                                                    }
                                                    Object g19 = j0Var.g(d2.s.f2207u);
                                                    if (g19 == null) {
                                                        g19 = null;
                                                    }
                                                    d2.h hVar2 = (d2.h) g19;
                                                    if (hVar2 != null && z19) {
                                                        float floatValue = f6 != null ? f6.floatValue() : Float.intBitsToFloat((int) (4294967295L & b9));
                                                        if (z16 || z13) {
                                                            floatValue = -floatValue;
                                                        }
                                                        if (a0.x(hVar2, floatValue)) {
                                                            d2.v vVar2 = d2.i.f2146w;
                                                            if (j0Var.c(vVar2) || j0Var.c(d2.i.f2148y)) {
                                                                if (floatValue > 0.0f) {
                                                                    Object g20 = j0Var.g(d2.i.f2148y);
                                                                    aVar5 = (d2.a) (g20 == null ? null : g20);
                                                                } else {
                                                                    Object g21 = j0Var.g(vVar2);
                                                                    aVar5 = (d2.a) (g21 == null ? null : g21);
                                                                }
                                                                if (aVar5 != null && (aVar6 = (p6.a) aVar5.f2109b) != null) {
                                                                    return ((Boolean) aVar6.b()).booleanValue();
                                                                }
                                                            } else {
                                                                p6.e eVar2 = (p6.e) cVar8;
                                                                if (eVar2 != null) {
                                                                    return ((Boolean) eVar2.g(valueOf, Float.valueOf(floatValue))).booleanValue();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                break;
                                            case 32768:
                                                Object g22 = j0Var.g(d2.i.f2140q);
                                                d2.a aVar28 = (d2.a) (g22 == null ? null : g22);
                                                if (aVar28 != null && (aVar9 = (p6.a) aVar28.f2109b) != null) {
                                                    return ((Boolean) aVar9.b()).booleanValue();
                                                }
                                                break;
                                            case 65536:
                                                Object g23 = j0Var.g(d2.i.f2139p);
                                                d2.a aVar29 = (d2.a) (g23 == null ? null : g23);
                                                if (aVar29 != null && (aVar10 = (p6.a) aVar29.f2109b) != null) {
                                                    return ((Boolean) aVar10.b()).booleanValue();
                                                }
                                                break;
                                            case 262144:
                                                Object g24 = j0Var.g(d2.i.f2141r);
                                                d2.a aVar30 = (d2.a) (g24 == null ? null : g24);
                                                if (aVar30 != null && (aVar11 = (p6.a) aVar30.f2109b) != null) {
                                                    return ((Boolean) aVar11.b()).booleanValue();
                                                }
                                                break;
                                            case 524288:
                                                Object g25 = j0Var.g(d2.i.f2142s);
                                                d2.a aVar31 = (d2.a) (g25 == null ? null : g25);
                                                if (aVar31 != null && (aVar12 = (p6.a) aVar31.f2109b) != null) {
                                                    return ((Boolean) aVar12.b()).booleanValue();
                                                }
                                                break;
                                            case 1048576:
                                                Object g26 = j0Var.g(d2.i.f2143t);
                                                d2.a aVar32 = (d2.a) (g26 == null ? null : g26);
                                                if (aVar32 != null && (aVar13 = (p6.a) aVar32.f2109b) != null) {
                                                    return ((Boolean) aVar13.b()).booleanValue();
                                                }
                                                break;
                                            case 2097152:
                                                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                                Object g27 = j0Var.g(d2.i.f2133j);
                                                d2.a aVar33 = (d2.a) (g27 == null ? null : g27);
                                                if (aVar33 != null && (cVar3 = (p6.c) aVar33.f2109b) != null) {
                                                    if (string == null) {
                                                        string = "";
                                                    }
                                                    return ((Boolean) cVar3.i(new g2.e(string))).booleanValue();
                                                }
                                                break;
                                            case android.R.id.accessibilityActionShowOnScreen:
                                                d2.n l3 = nVar.l();
                                                if (l3 != null) {
                                                    Object g28 = l3.f2159d.f2150d.g(d2.i.f2128d);
                                                    if (g28 == null) {
                                                        g28 = null;
                                                    }
                                                    aVar14 = (d2.a) g28;
                                                    while (l3 != null && aVar14 == null) {
                                                        l3 = l3.l();
                                                        if (l3 != null) {
                                                            Object g29 = l3.f2159d.f2150d.g(d2.i.f2128d);
                                                            if (g29 == null) {
                                                                g29 = null;
                                                            }
                                                            aVar14 = (d2.a) g29;
                                                        }
                                                    }
                                                    if (l3 == null) {
                                                        e1.c g30 = nVar.g();
                                                        return tVar.requestRectangleOnScreen(new Rect((int) Math.floor(g30.f2457a), (int) Math.floor(g30.f2458b), s6.a.B((float) Math.ceil(g30.f2459c)), s6.a.B((float) Math.ceil(g30.f2460d))));
                                                    }
                                                    o.j0 j0Var2 = l3.f2159d.f2150d;
                                                    w1.f0 f0Var2 = l3.f2158c;
                                                    e1.c d8 = u1.s0.d(f0Var2.F.f7597c);
                                                    u1.p h8 = f0Var2.F.f7597c.h();
                                                    e1.c e8 = d8.e(h8 != null ? ((w1.d1) h8).O0(0L) : 0L);
                                                    w1.d1 d9 = nVar.d();
                                                    if (d9 != null) {
                                                        if (!d9.E0().f8718q) {
                                                            d9 = null;
                                                        }
                                                        if (d9 != null) {
                                                            j7 = d9.O0(0L);
                                                            w1.d1 d10 = nVar.d();
                                                            e1.c b10 = a.a.b(j7, m.a.R(d10 != null ? d10.f7232f : 0L));
                                                            g3 = j0Var2.g(d2.s.f2206t);
                                                            if (g3 == null) {
                                                                g3 = null;
                                                            }
                                                            Object g31 = j0Var2.g(d2.s.f2207u);
                                                            f8 = b10.f2457a - e8.f2457a;
                                                            f9 = b10.f2459c - e8.f2459c;
                                                            if (Math.signum(f8) == Math.signum(f9)) {
                                                                f8 = 0.0f;
                                                            } else if (Math.abs(f8) >= Math.abs(f9)) {
                                                                f8 = f9;
                                                            }
                                                            if (f0Var.f7660z != lVar) {
                                                                f8 = -f8;
                                                            }
                                                            float f13 = b10.f2458b - e8.f2458b;
                                                            float f14 = b10.f2460d - e8.f2460d;
                                                            float f15 = Math.signum(f13) == Math.signum(f14) ? Math.abs(f13) < Math.abs(f14) ? f13 : f14 : 0.0f;
                                                            if (aVar14 != null) {
                                                                p6.e eVar3 = (p6.e) aVar14.f2109b;
                                                                if (eVar3 != null) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    j7 = 0;
                                                    w1.d1 d102 = nVar.d();
                                                    e1.c b102 = a.a.b(j7, m.a.R(d102 != null ? d102.f7232f : 0L));
                                                    g3 = j0Var2.g(d2.s.f2206t);
                                                    if (g3 == null) {
                                                    }
                                                    Object g312 = j0Var2.g(d2.s.f2207u);
                                                    f8 = b102.f2457a - e8.f2457a;
                                                    f9 = b102.f2459c - e8.f2459c;
                                                    if (Math.signum(f8) == Math.signum(f9)) {
                                                    }
                                                    if (f0Var.f7660z != lVar) {
                                                    }
                                                    float f132 = b102.f2458b - e8.f2458b;
                                                    float f142 = b102.f2460d - e8.f2460d;
                                                    if (Math.signum(f132) == Math.signum(f142)) {
                                                    }
                                                    if (aVar14 != null) {
                                                    }
                                                }
                                                aVar14 = null;
                                                break;
                                            case android.R.id.accessibilityActionSetProgress:
                                                if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                                    Object g32 = j0Var.g(d2.i.f2132h);
                                                    d2.a aVar34 = (d2.a) (g32 == null ? null : g32);
                                                    if (aVar34 != null && (cVar4 = (p6.c) aVar34.f2109b) != null) {
                                                        return ((Boolean) cVar4.i(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                                    }
                                                }
                                                break;
                                            case android.R.id.accessibilityActionImeEnter:
                                                Object g33 = j0Var.g(d2.i.f2137n);
                                                d2.a aVar35 = (d2.a) (g33 == null ? null : g33);
                                                if (aVar35 != null && (aVar15 = (p6.a) aVar35.f2109b) != null) {
                                                    return ((Boolean) aVar15.b()).booleanValue();
                                                }
                                                break;
                                            default:
                                                switch (i8) {
                                                    case android.R.id.accessibilityActionScrollUp:
                                                    case android.R.id.accessibilityActionScrollLeft:
                                                    case android.R.id.accessibilityActionScrollDown:
                                                    case android.R.id.accessibilityActionScrollRight:
                                                        break;
                                                    default:
                                                        switch (i8) {
                                                            case android.R.id.accessibilityActionPageUp:
                                                                Object g34 = j0Var.g(d2.i.f2146w);
                                                                d2.a aVar36 = (d2.a) (g34 == null ? null : g34);
                                                                if (aVar36 != null && (aVar16 = (p6.a) aVar36.f2109b) != null) {
                                                                    return ((Boolean) aVar16.b()).booleanValue();
                                                                }
                                                                break;
                                                            case android.R.id.accessibilityActionPageDown:
                                                                Object g35 = j0Var.g(d2.i.f2148y);
                                                                d2.a aVar37 = (d2.a) (g35 == null ? null : g35);
                                                                if (aVar37 != null && (aVar17 = (p6.a) aVar37.f2109b) != null) {
                                                                    return ((Boolean) aVar17.b()).booleanValue();
                                                                }
                                                                break;
                                                            case android.R.id.accessibilityActionPageLeft:
                                                                Object g36 = j0Var.g(d2.i.f2147x);
                                                                d2.a aVar38 = (d2.a) (g36 == null ? null : g36);
                                                                if (aVar38 != null && (aVar18 = (p6.a) aVar38.f2109b) != null) {
                                                                    return ((Boolean) aVar18.b()).booleanValue();
                                                                }
                                                                break;
                                                            case android.R.id.accessibilityActionPageRight:
                                                                Object g37 = j0Var.g(d2.i.f2149z);
                                                                d2.a aVar39 = (d2.a) (g37 == null ? null : g37);
                                                                if (aVar39 != null && (aVar19 = (p6.a) aVar39.f2109b) != null) {
                                                                    return ((Boolean) aVar19.b()).booleanValue();
                                                                }
                                                                break;
                                                            default:
                                                                o.u0 u0Var = (o.u0) a0Var.f8346u.c(i);
                                                                if (u0Var != null && ((CharSequence) u0Var.c(i8)) != null) {
                                                                    Object g38 = j0Var.g(d2.i.f2145v);
                                                                    List list = (List) (g38 == null ? null : g38);
                                                                    if (list != null && list.size() > 0) {
                                                                        list.get(0).getClass();
                                                                        throw new ClassCastException();
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                }
                                        }
                                    } else {
                                        Object g39 = j0Var.g(d2.s.f2197k);
                                        if (g39 == null) {
                                            g39 = null;
                                        }
                                        if (q6.i.a(g39, bool)) {
                                            ((d1.i) tVar.getFocusOwner()).b(8, false, true);
                                            return true;
                                        }
                                    }
                                }
                            }
                            z3 = false;
                        } else {
                            z7 = true;
                            z3 = false;
                            if (a0Var.f8339n == i) {
                                a0Var.f8339n = Integer.MIN_VALUE;
                                a0Var.f8341p = null;
                                tVar.invalidate();
                                a0.E(a0Var, i, 65536, null, 12);
                            }
                        }
                        return z7;
                    }
                    z7 = true;
                    z3 = false;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                        int i19 = a0Var.f8339n;
                        if (!(i19 == i)) {
                            if (i19 != Integer.MIN_VALUE) {
                                num = null;
                                a0.E(a0Var, i19, 65536, null, 12);
                            } else {
                                num = null;
                            }
                            a0Var.f8339n = i;
                            tVar.invalidate();
                            a0.E(a0Var, i, 32768, num, 12);
                            return z7;
                        }
                    }
                }
                return z3;
            default:
                x3.a aVar40 = (x3.a) bVar;
                Chip chip = aVar40.i;
                if (i == -1) {
                    Field field = q3.k0.f6120a;
                    return chip.performAccessibilityAction(i8, bundle);
                }
                if (i8 == 1) {
                    return aVar40.q(i);
                }
                if (i8 == 2) {
                    return aVar40.j(i);
                }
                if (i8 == 64) {
                    AccessibilityManager accessibilityManager2 = aVar40.f8622h;
                    if (accessibilityManager2.isEnabled() && accessibilityManager2.isTouchExplorationEnabled() && (i13 = aVar40.f8624k) != i) {
                        if (i13 != Integer.MIN_VALUE) {
                            aVar40.f8624k = Integer.MIN_VALUE;
                            chip.invalidate();
                            aVar40.r(i13, 65536);
                        }
                        aVar40.f8624k = i;
                        chip.invalidate();
                        aVar40.r(i, 32768);
                        return true;
                    }
                } else if (i8 != 128) {
                    Chip chip2 = ((n5.d) aVar40).f5379q;
                    if (i8 == 16) {
                        if (i == 0) {
                            return chip2.performClick();
                        }
                        if (i == 1) {
                            chip2.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip2.f1903k;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip2);
                                z9 = true;
                            }
                            if (chip2.f1914v) {
                                chip2.f1913u.r(1, 1);
                            }
                        }
                    }
                } else if (aVar40.f8624k == i) {
                    aVar40.f8624k = Integer.MIN_VALUE;
                    chip.invalidate();
                    aVar40.r(i, 65536);
                    return true;
                }
                return z9;
        }
    }
}
