package d2;

import android.content.ClipDescription;
import android.content.ClipboardManager;
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
import com.appsflyer.R;
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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w extends l.d {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0 f3588i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b0 b0Var) {
        super(16);
        this.f3588i = b0Var;
    }

    @Override // l.d
    public final void m(int i3, p3.f fVar, String str, Bundle bundle) {
        this.f3588i.e(i3, fVar, str, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 34 ? o3.q.h(r5) : true) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x08af, code lost:
    
        if (r6 == false) goto L443;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x088c A[LOOP:9: B:395:0x086f->B:404:0x088c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0893 A[EDGE_INSN: B:405:0x0893->B:406:0x0893 BREAK  A[LOOP:9: B:395:0x086f->B:404:0x088c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0cf9  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0233  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [p3.f] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r2v27, types: [kotlin.collections.j0] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v29, types: [kotlin.collections.j0] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v31, types: [kotlin.collections.j0] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.util.ArrayList] */
    @Override // l.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p3.f n(int i3) {
        ?? r16;
        AccessibilityManager accessibilityManager;
        int size;
        int i10;
        int i11;
        m2.e l10;
        s.u uVar;
        b0 b0Var;
        v vVar;
        s.s0 s0Var;
        j2.m mVar;
        s.h0 h0Var;
        Resources resources;
        j2.g gVar;
        j2.j jVar;
        p3.f fVar;
        SpannableString spannableString;
        j2.t tVar;
        s.h0 h0Var2;
        j2.m mVar2;
        Object g;
        l2.a aVar;
        Object g2;
        Boolean bool;
        j2.g gVar2;
        int i12;
        j2.j jVar2;
        Object g10;
        Object g11;
        String str;
        Object g12;
        p3.f fVar2;
        Object g13;
        Object g14;
        Object g15;
        b0 b0Var2;
        boolean z10;
        j2.m mVar3;
        j1.c m10;
        boolean z11;
        Object g16;
        v vVar2;
        Bundle bundle;
        a3.n s3;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        ?? r22;
        ?? r23;
        ?? r24;
        int i13;
        boolean z17;
        j2.m mVar4;
        Float valueOf = Float.valueOf(0.0f);
        b0 b0Var3 = this.f3588i;
        AccessibilityManager accessibilityManager2 = b0Var3.f3341u;
        v vVar3 = b0Var3.f3338r;
        if (vVar3.getComposeViewContext().f3355c.g().f737c != androidx.lifecycle.p.f707d) {
            j2.n nVar = (j2.n) b0Var3.m().b(i3);
            if (nVar != null) {
                j2.m mVar5 = nVar.f4986a;
                Object g17 = mVar5.k().f4975d.g(j2.q.f5004n);
                if (g17 == null) {
                    g17 = null;
                }
                boolean a9 = Intrinsics.a(g17, Boolean.TRUE);
                if (a9) {
                }
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
                p3.f fVar3 = new p3.f(obtain);
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 34) {
                    o3.q.j(obtain, a9);
                    r16 = 0;
                } else {
                    r16 = 0;
                    fVar3.f(64, a9);
                }
                if (i3 == -1) {
                    Object parentForAccessibility = vVar3.getParentForAccessibility();
                    View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : r16;
                    fVar3.f7666b = -1;
                    obtain.setParent(view);
                } else {
                    j2.m l11 = mVar5.l();
                    Integer valueOf2 = l11 != null ? Integer.valueOf(l11.f4985f) : r16;
                    if (valueOf2 == null) {
                        z1.a.c("semanticsNode " + i3 + " has null parent");
                        throw new hd.d();
                    }
                    int intValue = valueOf2.intValue();
                    if (intValue == vVar3.getSemanticsOwner().a().f4985f) {
                        intValue = -1;
                    }
                    fVar3.f7666b = intValue;
                    obtain.setParent(vVar3, intValue);
                }
                fVar3.f7667c = i3;
                obtain.setSource(vVar3, i3);
                x2.j jVar3 = nVar.f4987b;
                obtain.setBoundsInScreen(b0Var3.C(jVar3.f10325a, jVar3.f10326b, jVar3.f10327c, jVar3.f10328d));
                s.u uVar2 = b0Var3.U;
                s.s0 s0Var2 = b0Var3.D;
                Resources resources2 = vVar3.getContext().getResources();
                fVar3.g("android.view.View");
                j2.j jVar4 = mVar5.f4983d;
                s.h0 h0Var3 = jVar4.f4975d;
                if (h0Var3.c(j2.q.E)) {
                    fVar3.g("android.widget.EditText");
                }
                if (h0Var3.c(j2.q.A)) {
                    fVar3.g("android.widget.TextView");
                }
                Object g18 = h0Var3.g(j2.q.f5014x);
                if (g18 == null) {
                    g18 = r16;
                }
                j2.g gVar3 = (j2.g) g18;
                if (gVar3 != null) {
                    int i15 = gVar3.f4938a;
                    if (mVar5.o() || j2.m.j(4, mVar5).isEmpty()) {
                        accessibilityManager = accessibilityManager2;
                        if (i15 == 4) {
                            obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.tab));
                        } else if (i15 == 2) {
                            obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.switch_role));
                        } else {
                            String u2 = h0.u(i15);
                            if (i15 != 5 || mVar5.q() || jVar4.f4977i) {
                                fVar3.g(u2);
                            }
                        }
                        obtain.setPackageName(vVar3.getContext().getPackageName());
                        obtain.setImportantForAccessibility(j2.p.h(mVar5));
                        boolean h10 = i14 < 34 ? o3.q.h(accessibilityManager) : true;
                        List j = j2.m.j(4, mVar5);
                        size = j.size();
                        boolean z18 = h10;
                        int i16 = 0;
                        i10 = 0;
                        while (i10 < size) {
                            int i17 = size;
                            j2.m mVar6 = (j2.m) j.get(i10);
                            List list = j;
                            s.k m11 = b0Var3.m();
                            int i18 = i10;
                            int i19 = mVar6.f4985f;
                            if (m11.a(i19)) {
                                a3.n nVar2 = vVar3.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(mVar6.f4982c);
                                if (i19 != -1) {
                                    if (nVar2 != null) {
                                        obtain.addChild(nVar2);
                                    } else {
                                        j2.n nVar3 = (j2.n) b0Var3.m().b(i19);
                                        if (nVar3 == null || (mVar4 = nVar3.f4986a) == null) {
                                            z17 = false;
                                        } else {
                                            Object g19 = mVar4.k().f4975d.g(j2.q.f5004n);
                                            if (g19 == null) {
                                                g19 = r16;
                                            }
                                            z17 = Intrinsics.a(g19, Boolean.TRUE);
                                        }
                                        if (z18 || !z17) {
                                            obtain.addChild(vVar3, i19);
                                        }
                                    }
                                    uVar2.f(i19, i16);
                                    i16++;
                                }
                            }
                            i10 = i18 + 1;
                            j = list;
                            size = i17;
                        }
                        i11 = b0Var3.f3345y;
                        AccessibilityNodeInfo accessibilityNodeInfo = fVar3.f7665a;
                        if (i3 != i11) {
                            accessibilityNodeInfo.setAccessibilityFocused(true);
                            fVar3.a(p3.d.f7658d);
                        } else {
                            accessibilityNodeInfo.setAccessibilityFocused(false);
                            fVar3.a(p3.d.f7657c);
                        }
                        l10 = h0.l(mVar5);
                        if (l10 == null) {
                            vVar3.getFontFamilyResolver();
                            x2.c density = vVar3.getDensity();
                            p.e eVar = b0Var3.Q;
                            vVar = vVar3;
                            String str2 = l10.f6454e;
                            s0Var = s0Var2;
                            List list2 = l10.f6453d;
                            SpannableString spannableString2 = new SpannableString(str2);
                            ArrayList arrayList = l10.f6455i;
                            if (arrayList != null) {
                                int size2 = arrayList.size();
                                b0Var = b0Var3;
                                int i20 = 0;
                                while (i20 < size2) {
                                    ArrayList arrayList2 = arrayList;
                                    m2.c cVar = (m2.c) arrayList.get(i20);
                                    int i21 = i20;
                                    m2.a0 a0Var = (m2.a0) cVar.f6439a;
                                    int i22 = size2;
                                    int i23 = cVar.f6440b;
                                    int i24 = cVar.f6441c;
                                    s.u uVar3 = uVar2;
                                    long b10 = a0Var.f6422a.b();
                                    j2.g gVar4 = gVar3;
                                    j2.j jVar5 = jVar4;
                                    long j3 = a0Var.f6423b;
                                    p2.s sVar = a0Var.f6424c;
                                    p2.o oVar = a0Var.f6425d;
                                    w2.p pVar = a0Var.j;
                                    p3.f fVar4 = fVar3;
                                    s2.b bVar = a0Var.f6430k;
                                    j2.m mVar7 = mVar5;
                                    s.h0 h0Var4 = h0Var3;
                                    long j10 = a0Var.f6431l;
                                    w2.l lVar = a0Var.f6432m;
                                    w2.o oVar2 = a0Var.f6422a;
                                    Resources resources3 = resources2;
                                    if (!k1.p.c(b10, oVar2.b())) {
                                        oVar2 = b10 != 16 ? new w2.c(b10) : w2.n.f10048a;
                                    }
                                    i7.a.c0(spannableString2, oVar2.b(), i23, i24);
                                    SpannableString spannableString3 = spannableString2;
                                    i7.a.d0(spannableString3, j3, density, i23, i24);
                                    if (sVar == null && oVar == null) {
                                        i13 = 33;
                                    } else {
                                        i13 = 33;
                                        spannableString3.setSpan(new StyleSpan(cf.c.u(sVar == null ? p2.s.f7645s : sVar, oVar != null ? oVar.f7639a : 0)), i23, i24, 33);
                                    }
                                    if (lVar != null) {
                                        int i25 = lVar.f10046a;
                                        if ((i25 | 1) == i25) {
                                            spannableString3.setSpan(new UnderlineSpan(), i23, i24, i13);
                                        }
                                        if ((i25 | 2) == i25) {
                                            spannableString3.setSpan(new StrikethroughSpan(), i23, i24, i13);
                                        }
                                    }
                                    if (pVar != null) {
                                        spannableString3.setSpan(new ScaleXSpan(pVar.f10050a), i23, i24, i13);
                                    }
                                    i7.a.e0(spannableString3, bVar, i23, i24);
                                    if (j10 != 16) {
                                        spannableString3.setSpan(new BackgroundColorSpan(k1.v.r(j10)), i23, i24, i13);
                                    }
                                    i20 = i21 + 1;
                                    spannableString2 = spannableString3;
                                    arrayList = arrayList2;
                                    size2 = i22;
                                    uVar2 = uVar3;
                                    jVar4 = jVar5;
                                    gVar3 = gVar4;
                                    fVar3 = fVar4;
                                    mVar5 = mVar7;
                                    h0Var3 = h0Var4;
                                    resources2 = resources3;
                                }
                            } else {
                                b0Var = b0Var3;
                            }
                            uVar = uVar2;
                            mVar = mVar5;
                            h0Var = h0Var3;
                            resources = resources2;
                            gVar = gVar3;
                            jVar = jVar4;
                            fVar = fVar3;
                            SpannableString spannableString4 = spannableString2;
                            int length = str2.length();
                            if (list2 != null) {
                                r22 = new ArrayList(list2.size());
                                int size3 = list2.size();
                                for (int i26 = 0; i26 < size3; i26++) {
                                    Object obj = list2.get(i26);
                                    m2.c cVar2 = (m2.c) obj;
                                    if ((cVar2.f6439a instanceof m2.j0) && m2.f.a(0, length, cVar2.f6440b, cVar2.f6441c)) {
                                        r22.add(obj);
                                    }
                                }
                            } else {
                                r22 = kotlin.collections.j0.f5574d;
                            }
                            r22.getClass();
                            int size4 = r22.size();
                            for (int i27 = 0; i27 < size4; i27++) {
                                m2.c cVar3 = (m2.c) r22.get(i27);
                                m2.j0 j0Var = (m2.j0) cVar3.f6439a;
                                int i28 = cVar3.f6440b;
                                int i29 = cVar3.f6441c;
                                if (!(j0Var instanceof m2.j0)) {
                                    a2.r.p();
                                    return r16;
                                }
                                spannableString4.setSpan(new TtsSpan.VerbatimBuilder(j0Var.f6489a).build(), i28, i29, 33);
                            }
                            int length2 = str2.length();
                            if (list2 != null) {
                                r23 = new ArrayList(list2.size());
                                int size5 = list2.size();
                                for (int i30 = 0; i30 < size5; i30++) {
                                    Object obj2 = list2.get(i30);
                                    m2.c cVar4 = (m2.c) obj2;
                                    if ((cVar4.f6439a instanceof m2.i0) && m2.f.a(0, length2, cVar4.f6440b, cVar4.f6441c)) {
                                        r23.add(obj2);
                                    }
                                }
                            } else {
                                r23 = kotlin.collections.j0.f5574d;
                            }
                            r23.getClass();
                            int size6 = r23.size();
                            for (int i31 = 0; i31 < size6; i31++) {
                                m2.c cVar5 = (m2.c) r23.get(i31);
                                m2.i0 i0Var = (m2.i0) cVar5.f6439a;
                                int i32 = cVar5.f6440b;
                                int i33 = cVar5.f6441c;
                                WeakHashMap weakHashMap = (WeakHashMap) eVar.f7588e;
                                Object obj3 = weakHashMap.get(i0Var);
                                if (obj3 == null) {
                                    obj3 = new URLSpan(i0Var.f6486a);
                                    weakHashMap.put(i0Var, obj3);
                                }
                                spannableString4.setSpan((URLSpan) obj3, i32, i33, 33);
                            }
                            int length3 = str2.length();
                            if (list2 != null) {
                                r24 = new ArrayList(list2.size());
                                int size7 = list2.size();
                                for (int i34 = 0; i34 < size7; i34++) {
                                    Object obj4 = list2.get(i34);
                                    m2.c cVar6 = (m2.c) obj4;
                                    if ((cVar6.f6439a instanceof m2.k) && m2.f.a(0, length3, cVar6.f6440b, cVar6.f6441c)) {
                                        r24.add(obj4);
                                    }
                                }
                            } else {
                                r24 = kotlin.collections.j0.f5574d;
                            }
                            r24.getClass();
                            int size8 = r24.size();
                            for (int i35 = 0; i35 < size8; i35++) {
                                m2.c cVar7 = (m2.c) r24.get(i35);
                                int i36 = cVar7.f6440b;
                                Object obj5 = cVar7.f6439a;
                                int i37 = cVar7.f6441c;
                                if (i36 != i37) {
                                    m2.k kVar = (m2.k) obj5;
                                    if (kVar instanceof m2.j) {
                                        obj5.getClass();
                                        m2.j jVar6 = (m2.j) obj5;
                                        m2.c cVar8 = new m2.c(i36, i37, jVar6);
                                        WeakHashMap weakHashMap2 = (WeakHashMap) eVar.f7589i;
                                        Object obj6 = weakHashMap2.get(cVar8);
                                        if (obj6 == null) {
                                            obj6 = new URLSpan(jVar6.f6487a);
                                            weakHashMap2.put(cVar8, obj6);
                                        }
                                        spannableString4.setSpan((URLSpan) obj6, i36, i37, 33);
                                    } else {
                                        WeakHashMap weakHashMap3 = (WeakHashMap) eVar.f7590r;
                                        Object obj7 = weakHashMap3.get(cVar7);
                                        if (obj7 == null) {
                                            obj7 = new t2.e(kVar);
                                            weakHashMap3.put(cVar7, obj7);
                                        }
                                        spannableString4.setSpan((ClickableSpan) obj7, i36, i37, 33);
                                    }
                                }
                            }
                            spannableString = (SpannableString) b0.F(spannableString4);
                        } else {
                            uVar = uVar2;
                            b0Var = b0Var3;
                            vVar = vVar3;
                            s0Var = s0Var2;
                            mVar = mVar5;
                            h0Var = h0Var3;
                            resources = resources2;
                            gVar = gVar3;
                            jVar = jVar4;
                            fVar = fVar3;
                            spannableString = r16;
                        }
                        accessibilityNodeInfo.setText(spannableString);
                        tVar = j2.q.J;
                        h0Var2 = h0Var;
                        if (h0Var2.c(tVar)) {
                            obtain.setContentInvalid(true);
                            Object g20 = h0Var2.g(tVar);
                            if (g20 == null) {
                                g20 = r16;
                            }
                            obtain.setError((CharSequence) g20);
                        }
                        mVar2 = mVar;
                        Resources resources4 = resources;
                        String k10 = h0.k(mVar2, resources4);
                        if (Build.VERSION.SDK_INT < 30) {
                            f2.b.i(accessibilityNodeInfo, k10);
                        } else {
                            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", k10);
                        }
                        obtain.setCheckable(h0.j(mVar2));
                        g = h0Var2.g(j2.q.H);
                        if (g == null) {
                            g = r16;
                        }
                        aVar = (l2.a) g;
                        if (aVar != null) {
                            if (aVar == l2.a.f5826d) {
                                accessibilityNodeInfo.setChecked(true);
                            } else if (aVar == l2.a.f5827e) {
                                accessibilityNodeInfo.setChecked(false);
                            }
                        }
                        g2 = h0Var2.g(j2.q.G);
                        if (g2 == null) {
                            g2 = r16;
                        }
                        bool = (Boolean) g2;
                        if (bool == null) {
                            boolean booleanValue = bool.booleanValue();
                            if (gVar == null) {
                                gVar2 = gVar;
                                i12 = 4;
                            } else {
                                gVar2 = gVar;
                                i12 = 4;
                                if (gVar2.f4938a == 4) {
                                    obtain.setSelected(booleanValue);
                                }
                            }
                            accessibilityNodeInfo.setChecked(booleanValue);
                        } else {
                            gVar2 = gVar;
                            i12 = 4;
                        }
                        jVar2 = jVar;
                        if (jVar2.f4977i || j2.m.j(i12, mVar2).isEmpty()) {
                            g10 = h0Var2.g(j2.q.f4993a);
                            if (g10 == null) {
                                g10 = r16;
                            }
                            List list3 = (List) g10;
                            obtain.setContentDescription(list3 == null ? (String) CollectionsKt.firstOrNull(list3) : r16);
                        }
                        g11 = h0Var2.g(j2.q.f5015y);
                        if (g11 == null) {
                            g11 = r16;
                        }
                        str = (String) g11;
                        if (str != null) {
                            j2.m mVar8 = mVar2;
                            while (true) {
                                if (mVar8 == null) {
                                    z16 = false;
                                    break;
                                }
                                j2.j jVar7 = mVar8.f4983d;
                                j2.t tVar2 = j2.r.f5017a;
                                if (jVar7.f4975d.c(tVar2)) {
                                    z16 = ((Boolean) jVar7.e(tVar2)).booleanValue();
                                    break;
                                }
                                mVar8 = mVar8.l();
                            }
                            if (z16) {
                                obtain.setViewIdResourceName(str);
                            }
                        }
                        g12 = h0Var2.g(j2.q.f4999h);
                        if (g12 == null) {
                            g12 = r16;
                        }
                        if (((Unit) g12) != null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                accessibilityNodeInfo.setHeading(true);
                            } else {
                                fVar2 = fVar;
                                fVar2.f(2, true);
                                g13 = h0Var2.g(j2.q.f5000i);
                                if (g13 == null) {
                                    g13 = r16;
                                }
                                if (((Unit) g13) != null) {
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        obtain.setTextEntryKey(true);
                                    } else {
                                        fVar2.f(8, true);
                                    }
                                }
                                if (i3 != -1) {
                                    int d10 = uVar.d(mVar2.f4985f);
                                    if (d10 != -1) {
                                        obtain.setDrawingOrder(d10);
                                    } else {
                                        Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                    }
                                }
                                obtain.setPassword(h0Var2.c(j2.q.I));
                                g14 = h0Var2.g(j2.q.K);
                                if (g14 == null) {
                                    g14 = r16;
                                }
                                Boolean bool2 = Boolean.TRUE;
                                obtain.setEditable(Intrinsics.a(g14, bool2));
                                g15 = h0Var2.g(j2.q.L);
                                if (g15 == null) {
                                    g15 = r16;
                                }
                                Integer num = (Integer) g15;
                                obtain.setMaxTextLength(num != null ? num.intValue() : -1);
                                obtain.setEnabled(h0.b(mVar2));
                                j2.t tVar3 = j2.q.f5002l;
                                obtain.setFocusable(h0Var2.c(tVar3));
                                if (obtain.isFocusable()) {
                                    obtain.setFocused(((Boolean) jVar2.e(tVar3)).booleanValue());
                                    if (!obtain.isFocused()) {
                                        b0Var2 = b0Var;
                                        z10 = true;
                                        accessibilityNodeInfo.addAction(1);
                                        accessibilityNodeInfo.setVisibleToUser(j2.p.g(mVar2) ^ z10);
                                        if (mVar2.o()) {
                                            mVar3 = mVar2;
                                        } else {
                                            mVar3 = mVar2.l();
                                            mVar3.getClass();
                                        }
                                        m10 = mVar3.m();
                                        if ((m10.f4916a < m10.f4918c) || (m10.f4917b < m10.f4919d)) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                            accessibilityNodeInfo.setVisibleToUser(false);
                                        }
                                        g16 = h0Var2.g(j2.q.f5001k);
                                        if (g16 == null) {
                                            g16 = r16;
                                        }
                                        if (g16 == null) {
                                            kotlin.collections.i0.j();
                                            return null;
                                        }
                                        accessibilityNodeInfo.setClickable(z11);
                                        j2.a aVar2 = (j2.a) j2.p.f(jVar2, j2.i.f4952b);
                                        if (aVar2 != null) {
                                            boolean a10 = Intrinsics.a(j2.p.f(jVar2, j2.q.G), bool2);
                                            if (!(gVar2 != null && gVar2.f4938a == 4)) {
                                                if (!(gVar2 != null && gVar2.f4938a == 3)) {
                                                    z15 = false;
                                                    accessibilityNodeInfo.setClickable(z15 || (z15 && !a10));
                                                    if (h0.b(mVar2) && obtain.isClickable()) {
                                                        fVar2.a(new p3.d(16, aVar2.f4928a));
                                                    }
                                                }
                                            }
                                            z15 = true;
                                            accessibilityNodeInfo.setClickable(z15 || (z15 && !a10));
                                            if (h0.b(mVar2)) {
                                                fVar2.a(new p3.d(16, aVar2.f4928a));
                                            }
                                        }
                                        accessibilityNodeInfo.setLongClickable(false);
                                        j2.a aVar3 = (j2.a) j2.p.f(jVar2, j2.i.f4953c);
                                        if (aVar3 != null) {
                                            accessibilityNodeInfo.setLongClickable(true);
                                            if (h0.b(mVar2)) {
                                                fVar2.a(new p3.d(32, aVar3.f4928a));
                                            }
                                        }
                                        j2.a aVar4 = (j2.a) j2.p.f(jVar2, j2.i.f4963o);
                                        if (aVar4 != null) {
                                            fVar2.a(new p3.d(16384, aVar4.f4928a));
                                        }
                                        if (h0.b(mVar2)) {
                                            j2.a aVar5 = (j2.a) j2.p.f(jVar2, j2.i.j);
                                            if (aVar5 != null) {
                                                fVar2.a(new p3.d(2097152, aVar5.f4928a));
                                            }
                                            j2.a aVar6 = (j2.a) j2.p.f(jVar2, j2.i.f4962n);
                                            if (aVar6 != null) {
                                                fVar2.a(new p3.d(android.R.id.accessibilityActionImeEnter, aVar6.f4928a));
                                            }
                                            j2.a aVar7 = (j2.a) j2.p.f(jVar2, j2.i.f4964p);
                                            if (aVar7 != null) {
                                                fVar2.a(new p3.d(65536, aVar7.f4928a));
                                            }
                                            j2.a aVar8 = (j2.a) j2.p.f(jVar2, j2.i.f4965q);
                                            if (aVar8 != null && obtain.isFocused()) {
                                                j m39getClipboardManager = vVar.m39getClipboardManager();
                                                ClipboardManager clipboardManager = m39getClipboardManager.f3445b;
                                                if (clipboardManager == null) {
                                                    Object systemService = m39getClipboardManager.f3444a.getSystemService("clipboard");
                                                    systemService.getClass();
                                                    clipboardManager = (ClipboardManager) systemService;
                                                    m39getClipboardManager.f3445b = clipboardManager;
                                                }
                                                ClipDescription primaryClipDescription = clipboardManager.getPrimaryClipDescription();
                                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                                    fVar2.a(new p3.d(32768, aVar8.f4928a));
                                                }
                                            }
                                        }
                                        String n10 = b0.n(mVar2);
                                        if (!(n10 == null || n10.length() == 0)) {
                                            obtain.setTextSelection(b0Var2.l(mVar2), b0Var2.k(mVar2));
                                            j2.a aVar9 = (j2.a) j2.p.f(jVar2, j2.i.f4958i);
                                            fVar2.a(new p3.d(131072, aVar9 != null ? aVar9.f4928a : r16));
                                            accessibilityNodeInfo.addAction(256);
                                            accessibilityNodeInfo.addAction(512);
                                            accessibilityNodeInfo.setMovementGranularities(11);
                                            List list4 = (List) j2.p.f(jVar2, j2.q.f4993a);
                                            if ((list4 == null || list4.isEmpty()) && h0Var2.c(j2.i.f4951a)) {
                                                if (!h0Var2.c(j2.q.E) || Intrinsics.a(j2.p.f(jVar2, tVar3), bool2)) {
                                                    c2.g0 s10 = mVar2.f4982c.s();
                                                    while (true) {
                                                        if (s10 == null) {
                                                            s10 = r16;
                                                            break;
                                                        }
                                                        j2.j u10 = s10.u();
                                                        if (u10 != null && u10.f4977i) {
                                                            if (u10.f4975d.c(j2.q.E)) {
                                                                z14 = true;
                                                                if (!z14) {
                                                                    break;
                                                                }
                                                                s10 = s10.s();
                                                            }
                                                        }
                                                        z14 = false;
                                                        if (!z14) {
                                                        }
                                                    }
                                                    if (s10 != null) {
                                                        j2.j u11 = s10.u();
                                                        if (u11 != null) {
                                                            Object g21 = u11.f4975d.g(j2.q.f5002l);
                                                            if (g21 == null) {
                                                                g21 = r16;
                                                            }
                                                            z13 = Intrinsics.a(g21, Boolean.TRUE);
                                                        } else {
                                                            z13 = false;
                                                        }
                                                    }
                                                    z12 = false;
                                                    if (!z12) {
                                                        accessibilityNodeInfo.setMovementGranularities(obtain.getMovementGranularities() | 20);
                                                    }
                                                }
                                                z12 = true;
                                                if (!z12) {
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            ArrayList arrayList3 = new ArrayList();
                                            arrayList3.add("androidx.compose.ui.semantics.id");
                                            CharSequence e2 = fVar2.e();
                                            if (!(e2 == null || e2.length() == 0) && h0Var2.c(j2.i.f4951a)) {
                                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                            }
                                            if (h0Var2.c(j2.q.f5015y)) {
                                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (h0Var2.c(j2.q.M)) {
                                                arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                            }
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                accessibilityNodeInfo.setAvailableExtraData(arrayList3);
                                            }
                                        }
                                        j2.f fVar5 = (j2.f) j2.p.f(jVar2, j2.q.f4995c);
                                        if (fVar5 != null) {
                                            j2.j n11 = mVar2.n();
                                            j2.t tVar4 = j2.i.f4957h;
                                            if (n11.f4975d.c(tVar4)) {
                                                fVar2.g("android.widget.SeekBar");
                                            } else {
                                                fVar2.g("android.widget.ProgressBar");
                                            }
                                            j2.f fVar6 = j2.f.f4936b;
                                            if (fVar5 != j2.f.f4936b) {
                                                accessibilityNodeInfo.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new f2.a(AccessibilityNodeInfo.RangeInfo.obtain(1, valueOf.floatValue(), valueOf.floatValue(), 0.0f)).f4064d);
                                            }
                                            if (mVar2.n().f4975d.c(tVar4) && h0.b(mVar2)) {
                                                float floatValue = valueOf.floatValue();
                                                float floatValue2 = valueOf.floatValue();
                                                if (floatValue < floatValue2) {
                                                    floatValue = floatValue2;
                                                }
                                                if (0.0f < floatValue) {
                                                    fVar2.a(p3.d.f7659e);
                                                }
                                                float floatValue3 = valueOf.floatValue();
                                                float floatValue4 = valueOf.floatValue();
                                                if (floatValue3 > floatValue4) {
                                                    floatValue3 = floatValue4;
                                                }
                                                if (0.0f > floatValue3) {
                                                    fVar2.a(p3.d.f7660f);
                                                }
                                            }
                                        }
                                        if (h0.b(mVar2)) {
                                            Object g22 = mVar2.f4983d.f4975d.g(j2.i.f4957h);
                                            if (g22 == null) {
                                                g22 = r16;
                                            }
                                            j2.a aVar10 = (j2.a) g22;
                                            if (aVar10 != null) {
                                                Class cls = r16;
                                                fVar2.a(new p3.d(cls, android.R.id.accessibilityActionSetProgress, aVar10.f4928a, cls));
                                            }
                                        }
                                        Object g23 = mVar2.k().f4975d.g(j2.q.f4998f);
                                        if (g23 == null) {
                                            g23 = null;
                                        }
                                        if (g23 == null) {
                                            ArrayList arrayList4 = new ArrayList();
                                            Object g24 = mVar2.k().f4975d.g(j2.q.f4997e);
                                            if (g24 == null) {
                                                g24 = null;
                                            }
                                            if (g24 != null) {
                                                List j11 = j2.m.j(4, mVar2);
                                                int size9 = j11.size();
                                                for (int i38 = 0; i38 < size9; i38++) {
                                                    j2.m mVar9 = (j2.m) j11.get(i38);
                                                    if (mVar9.k().f4975d.c(j2.q.G)) {
                                                        arrayList4.add(mVar9);
                                                    }
                                                }
                                            }
                                            if (!arrayList4.isEmpty()) {
                                                boolean p4 = i7.a.p(arrayList4);
                                                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(p4 ? 1 : arrayList4.size(), p4 ? arrayList4.size() : 1, false, 0));
                                            }
                                        } else {
                                            kotlin.collections.i0.j();
                                        }
                                        Object g25 = mVar2.k().f4975d.g(j2.q.g);
                                        if (g25 == null) {
                                            g25 = null;
                                        }
                                        if (g25 == null) {
                                            j2.m l12 = mVar2.l();
                                            if (l12 != null) {
                                                Object g26 = l12.k().f4975d.g(j2.q.f4997e);
                                                if (g26 == null) {
                                                    g26 = null;
                                                }
                                                if (g26 != null) {
                                                    Object g27 = l12.k().f4975d.g(j2.q.f4998f);
                                                    if (g27 == null) {
                                                        g27 = null;
                                                    }
                                                    if (g27 != null) {
                                                        kotlin.collections.i0.j();
                                                    } else if (mVar2.k().f4975d.c(j2.q.G)) {
                                                        ArrayList arrayList5 = new ArrayList();
                                                        List j12 = j2.m.j(4, l12);
                                                        int size10 = j12.size();
                                                        int i39 = 0;
                                                        for (int i40 = 0; i40 < size10; i40++) {
                                                            j2.m mVar10 = (j2.m) j12.get(i40);
                                                            if (mVar10.k().f4975d.c(j2.q.G)) {
                                                                arrayList5.add(mVar10);
                                                                if (mVar10.f4982c.t() < mVar2.f4982c.t()) {
                                                                    i39++;
                                                                }
                                                            }
                                                        }
                                                        if (!arrayList5.isEmpty()) {
                                                            boolean p10 = i7.a.p(arrayList5);
                                                            int i41 = p10 ? 0 : i39;
                                                            int i42 = p10 ? i39 : 0;
                                                            Object g28 = mVar2.k().f4975d.g(j2.q.G);
                                                            if (g28 == null) {
                                                                g28 = Boolean.FALSE;
                                                            }
                                                            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i41, 1, i42, 1, false, ((Boolean) g28).booleanValue()));
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            kotlin.collections.i0.j();
                                        }
                                        v4.a.w(j2.p.f(mVar2.n(), j2.q.f5011u));
                                        v4.a.w(j2.p.f(mVar2.n(), j2.q.f5012v));
                                        int i43 = Build.VERSION.SDK_INT;
                                        if (i43 >= 29) {
                                            h0.d(fVar2, mVar2);
                                        }
                                        CharSequence charSequence = (CharSequence) j2.p.f(mVar2.n(), j2.q.f4996d);
                                        if (i43 >= 28) {
                                            accessibilityNodeInfo.setPaneTitle(charSequence);
                                        } else {
                                            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                        }
                                        if (h0.b(mVar2)) {
                                            j2.a aVar11 = (j2.a) j2.p.f(mVar2.n(), j2.i.f4966r);
                                            if (aVar11 != null) {
                                                fVar2.a(new p3.d(262144, aVar11.f4928a));
                                            }
                                            j2.a aVar12 = (j2.a) j2.p.f(mVar2.n(), j2.i.f4967s);
                                            if (aVar12 != null) {
                                                fVar2.a(new p3.d(524288, aVar12.f4928a));
                                            }
                                            j2.a aVar13 = (j2.a) j2.p.f(mVar2.n(), j2.i.f4968t);
                                            if (aVar13 != null) {
                                                fVar2.a(new p3.d(1048576, aVar13.f4928a));
                                            }
                                            j2.j n12 = mVar2.n();
                                            j2.t tVar5 = j2.i.f4970v;
                                            if (n12.f4975d.c(tVar5)) {
                                                List list5 = (List) mVar2.n().e(tVar5);
                                                int size11 = list5.size();
                                                s.v vVar4 = b0.Y;
                                                if (size11 >= vVar4.f8390b) {
                                                    throw new IllegalStateException("Can't have more than " + vVar4.f8390b + " custom actions for one widget");
                                                }
                                                s.s0 s0Var3 = new s.s0(0);
                                                s.c0 c0Var = s.m0.f8346a;
                                                s.c0 c0Var2 = new s.c0();
                                                s.s0 s0Var4 = s0Var;
                                                if (s0Var4.b(i3)) {
                                                    s.c0 c0Var3 = (s.c0) s0Var4.c(i3);
                                                    int[] iArr = vVar4.f8389a;
                                                    int i44 = vVar4.f8390b;
                                                    int[] iArr2 = new int[16];
                                                    int i45 = 0;
                                                    int i46 = 0;
                                                    while (i45 < i44) {
                                                        int i47 = iArr[i45];
                                                        int i48 = i44;
                                                        int i49 = i46 + 1;
                                                        s.c0 c0Var4 = c0Var3;
                                                        if (iArr2.length < i49) {
                                                            iArr2 = Arrays.copyOf(iArr2, Math.max(i49, (iArr2.length * 3) / 2));
                                                        }
                                                        iArr2[i46] = i47;
                                                        i45++;
                                                        i46 = i49;
                                                        i44 = i48;
                                                        c0Var3 = c0Var4;
                                                    }
                                                    s.c0 c0Var5 = c0Var3;
                                                    ArrayList arrayList6 = new ArrayList();
                                                    if (list5.size() > 0) {
                                                        v4.a.w(list5.get(0));
                                                        c0Var5.getClass();
                                                        throw null;
                                                    }
                                                    if (arrayList6.size() > 0) {
                                                        v4.a.w(arrayList6.get(0));
                                                        if (i46 <= 0) {
                                                            kotlin.collections.i0.g("Index must be between 0 and size");
                                                            return null;
                                                        }
                                                        int i50 = iArr2[0];
                                                        throw null;
                                                    }
                                                } else if (list5.size() > 0) {
                                                    v4.a.w(list5.get(0));
                                                    vVar4.b(0);
                                                    throw null;
                                                }
                                                b0Var2.C.e(i3, s0Var3);
                                                s0Var4.e(i3, c0Var2);
                                            }
                                        }
                                        boolean c10 = h0.c(mVar2, resources4);
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            accessibilityNodeInfo.setScreenReaderFocusable(c10);
                                        } else {
                                            fVar2.f(1, c10);
                                        }
                                        int d11 = b0Var2.M.d(i3);
                                        if (d11 != -1) {
                                            a3.n s11 = h0.s(vVar.getAndroidViewsHandler$ui(), d11);
                                            if (s11 != null) {
                                                accessibilityNodeInfo.setTraversalBefore(s11);
                                                vVar2 = vVar;
                                            } else {
                                                vVar2 = vVar;
                                                accessibilityNodeInfo.setTraversalBefore(vVar2, d11);
                                            }
                                            bundle = null;
                                            b0Var2.e(i3, fVar2, b0Var2.O, null);
                                        } else {
                                            vVar2 = vVar;
                                            bundle = null;
                                        }
                                        int d12 = b0Var2.N.d(i3);
                                        if (d12 != -1 && (s3 = h0.s(vVar2.getAndroidViewsHandler$ui(), d12)) != null) {
                                            accessibilityNodeInfo.setTraversalAfter(s3);
                                            b0Var2.e(i3, fVar2, b0Var2.P, bundle);
                                        }
                                        String str3 = (String) j2.p.f(mVar2.n(), j2.r.f5018b);
                                        if (str3 != null) {
                                            fVar2.g(str3);
                                        }
                                        return fVar2;
                                    }
                                    accessibilityNodeInfo.addAction(2);
                                    b0Var2 = b0Var;
                                    b0Var2.f3346z = i3;
                                } else {
                                    b0Var2 = b0Var;
                                }
                                z10 = true;
                                accessibilityNodeInfo.setVisibleToUser(j2.p.g(mVar2) ^ z10);
                                if (mVar2.o()) {
                                }
                                m10 = mVar3.m();
                                if (!((m10.f4916a < m10.f4918c) | (m10.f4917b < m10.f4919d))) {
                                }
                                g16 = h0Var2.g(j2.q.f5001k);
                                if (g16 == null) {
                                }
                                if (g16 == null) {
                                }
                            }
                        }
                        fVar2 = fVar;
                        g13 = h0Var2.g(j2.q.f5000i);
                        if (g13 == null) {
                        }
                        if (((Unit) g13) != null) {
                        }
                        if (i3 != -1) {
                        }
                        obtain.setPassword(h0Var2.c(j2.q.I));
                        g14 = h0Var2.g(j2.q.K);
                        if (g14 == null) {
                        }
                        Boolean bool22 = Boolean.TRUE;
                        obtain.setEditable(Intrinsics.a(g14, bool22));
                        g15 = h0Var2.g(j2.q.L);
                        if (g15 == null) {
                        }
                        Integer num2 = (Integer) g15;
                        obtain.setMaxTextLength(num2 != null ? num2.intValue() : -1);
                        obtain.setEnabled(h0.b(mVar2));
                        j2.t tVar32 = j2.q.f5002l;
                        obtain.setFocusable(h0Var2.c(tVar32));
                        if (obtain.isFocusable()) {
                        }
                        z10 = true;
                        accessibilityNodeInfo.setVisibleToUser(j2.p.g(mVar2) ^ z10);
                        if (mVar2.o()) {
                        }
                        m10 = mVar3.m();
                        if (!((m10.f4916a < m10.f4918c) | (m10.f4917b < m10.f4919d))) {
                        }
                        g16 = h0Var2.g(j2.q.f5001k);
                        if (g16 == null) {
                        }
                        if (g16 == null) {
                        }
                    }
                }
                accessibilityManager = accessibilityManager2;
                obtain.setPackageName(vVar3.getContext().getPackageName());
                obtain.setImportantForAccessibility(j2.p.h(mVar5));
                if (i14 < 34) {
                }
                List j13 = j2.m.j(4, mVar5);
                size = j13.size();
                boolean z182 = h10;
                int i162 = 0;
                i10 = 0;
                while (i10 < size) {
                }
                i11 = b0Var3.f3345y;
                AccessibilityNodeInfo accessibilityNodeInfo2 = fVar3.f7665a;
                if (i3 != i11) {
                }
                l10 = h0.l(mVar5);
                if (l10 == null) {
                }
                accessibilityNodeInfo2.setText(spannableString);
                tVar = j2.q.J;
                h0Var2 = h0Var;
                if (h0Var2.c(tVar)) {
                }
                mVar2 = mVar;
                Resources resources42 = resources;
                String k102 = h0.k(mVar2, resources42);
                if (Build.VERSION.SDK_INT < 30) {
                }
                obtain.setCheckable(h0.j(mVar2));
                g = h0Var2.g(j2.q.H);
                if (g == null) {
                }
                aVar = (l2.a) g;
                if (aVar != null) {
                }
                g2 = h0Var2.g(j2.q.G);
                if (g2 == null) {
                }
                bool = (Boolean) g2;
                if (bool == null) {
                }
                jVar2 = jVar;
                if (jVar2.f4977i) {
                }
                g10 = h0Var2.g(j2.q.f4993a);
                if (g10 == null) {
                }
                List list32 = (List) g10;
                obtain.setContentDescription(list32 == null ? (String) CollectionsKt.firstOrNull(list32) : r16);
                g11 = h0Var2.g(j2.q.f5015y);
                if (g11 == null) {
                }
                str = (String) g11;
                if (str != null) {
                }
                g12 = h0Var2.g(j2.q.f4999h);
                if (g12 == null) {
                }
                if (((Unit) g12) != null) {
                }
                fVar2 = fVar;
                g13 = h0Var2.g(j2.q.f5000i);
                if (g13 == null) {
                }
                if (((Unit) g13) != null) {
                }
                if (i3 != -1) {
                }
                obtain.setPassword(h0Var2.c(j2.q.I));
                g14 = h0Var2.g(j2.q.K);
                if (g14 == null) {
                }
                Boolean bool222 = Boolean.TRUE;
                obtain.setEditable(Intrinsics.a(g14, bool222));
                g15 = h0Var2.g(j2.q.L);
                if (g15 == null) {
                }
                Integer num22 = (Integer) g15;
                obtain.setMaxTextLength(num22 != null ? num22.intValue() : -1);
                obtain.setEnabled(h0.b(mVar2));
                j2.t tVar322 = j2.q.f5002l;
                obtain.setFocusable(h0Var2.c(tVar322));
                if (obtain.isFocusable()) {
                }
                z10 = true;
                accessibilityNodeInfo2.setVisibleToUser(j2.p.g(mVar2) ^ z10);
                if (mVar2.o()) {
                }
                m10 = mVar3.m();
                if (!((m10.f4916a < m10.f4918c) | (m10.f4917b < m10.f4919d))) {
                }
                g16 = h0Var2.g(j2.q.f5001k);
                if (g16 == null) {
                }
                if (g16 == null) {
                }
            } else if (!accessibilityManager2.isEnabled()) {
                return new p3.f(AccessibilityNodeInfo.obtain());
            }
        } else if (!accessibilityManager2.isEnabled()) {
            return new p3.f(AccessibilityNodeInfo.obtain());
        }
        return null;
    }

    @Override // l.d
    public final p3.f q(int i3) {
        b0 b0Var = this.f3588i;
        if (i3 != 1) {
            if (i3 == 2) {
                return n(b0Var.f3345y);
            }
            te.a1.e(v4.a.j(i3, "Unknown focus type: "));
            return null;
        }
        int i10 = b0Var.f3346z;
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return n(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:306:0x01a4, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0646, code lost:
    
        if (r0 != 16) goto L446;
     */
    /* JADX WARN: Removed duplicated region for block: B:251:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:522:? A[RETURN, SYNTHETIC] */
    @Override // l.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(int i3, int i10, Bundle bundle) {
        j2.m mVar;
        int i11;
        Integer num;
        b bVar;
        int i12;
        int i13;
        m2.e0 n10;
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        Function1 function1;
        j2.a aVar;
        c2.g0 g0Var;
        float f3;
        long j;
        float f10;
        float f11;
        float f12;
        float f13;
        long floatToRawIntBits;
        long j3;
        char c10;
        long floatToRawIntBits2;
        Function1 function12;
        Function0 function010;
        Function1 function13;
        Function0 function011;
        Function0 function012;
        Function0 function013;
        Function0 function014;
        b0 b0Var = this.f3588i;
        AccessibilityManager accessibilityManager = b0Var.f3341u;
        v vVar = b0Var.f3338r;
        j2.n nVar = (j2.n) b0Var.m().b(i3);
        if (nVar == null || (mVar = nVar.f4986a) == null) {
            return false;
        }
        c2.g0 g0Var2 = mVar.f4982c;
        int i14 = mVar.f4985f;
        j2.j jVar = mVar.f4983d;
        s.h0 h0Var = jVar.f4975d;
        Object g = h0Var.g(j2.q.f5004n);
        if (g == null) {
            g = null;
        }
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.a(g, bool)) {
            if (!(Build.VERSION.SDK_INT >= 34 ? o3.q.h(accessibilityManager) : true)) {
                return false;
            }
        }
        if (i10 == 64) {
            if (!(accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())) {
                return false;
            }
            int i15 = b0Var.f3345y;
            if (i15 == i3) {
                return false;
            }
            if (i15 != Integer.MIN_VALUE) {
                i11 = 12;
                num = null;
                b0.v(b0Var, i15, 65536, null, 12);
            } else {
                i11 = 12;
                num = null;
            }
            b0Var.f3345y = i3;
            vVar.invalidate();
            b0.v(b0Var, i3, 32768, num, i11);
            return true;
        }
        if (i10 == 128) {
            if (!(b0Var.f3345y == i3)) {
                return false;
            }
            b0Var.f3345y = Integer.MIN_VALUE;
            vVar.invalidate();
            b0.v(b0Var, i3, 65536, null, 12);
            return true;
        }
        if (i10 != 256 && i10 != 512) {
            if (i10 == 16384) {
                Object g2 = h0Var.g(j2.i.f4963o);
                j2.a aVar2 = (j2.a) (g2 == null ? null : g2);
                if (aVar2 == null || (function0 = (Function0) aVar2.f4929b) == null) {
                    return false;
                }
                return ((Boolean) function0.invoke()).booleanValue();
            }
            if (i10 == 131072) {
                boolean A = b0Var.A(mVar, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                if (A) {
                    b0.v(b0Var, b0Var.r(i14), 0, null, 12);
                }
                return A;
            }
            if (!h0.b(mVar)) {
                return false;
            }
            if (i10 == 1) {
                if (vVar.isInTouchMode()) {
                    vVar.requestFocusFromTouch();
                }
                Object g10 = h0Var.g(j2.i.f4969u);
                j2.a aVar3 = (j2.a) (g10 == null ? null : g10);
                if (aVar3 == null || (function02 = (Function0) aVar3.f4929b) == null) {
                    return false;
                }
                return ((Boolean) function02.invoke()).booleanValue();
            }
            if (i10 == 2) {
                Object g11 = h0Var.g(j2.q.f5002l);
                if (!Intrinsics.a(g11 == null ? null : g11, bool)) {
                    return false;
                }
                ((i1.k) vVar.getFocusOwner()).b(8, false, true);
                return true;
            }
            switch (i10) {
                case 16:
                    Object g12 = h0Var.g(j2.i.f4952b);
                    if (g12 == null) {
                        g12 = null;
                    }
                    j2.a aVar4 = (j2.a) g12;
                    Boolean bool2 = (aVar4 == null || (function03 = (Function0) aVar4.f4929b) == null) ? null : (Boolean) function03.invoke();
                    b0.v(b0Var, i3, 1, null, 12);
                    if (bool2 != null) {
                        return bool2.booleanValue();
                    }
                    return false;
                case 32:
                    Object g13 = h0Var.g(j2.i.f4953c);
                    j2.a aVar5 = (j2.a) (g13 == null ? null : g13);
                    if (aVar5 == null || (function04 = (Function0) aVar5.f4929b) == null) {
                        return false;
                    }
                    return ((Boolean) function04.invoke()).booleanValue();
                case 4096:
                case 8192:
                    break;
                case 32768:
                    Object g14 = h0Var.g(j2.i.f4965q);
                    j2.a aVar6 = (j2.a) (g14 == null ? null : g14);
                    if (aVar6 == null || (function05 = (Function0) aVar6.f4929b) == null) {
                        return false;
                    }
                    return ((Boolean) function05.invoke()).booleanValue();
                case 65536:
                    Object g15 = h0Var.g(j2.i.f4964p);
                    j2.a aVar7 = (j2.a) (g15 == null ? null : g15);
                    if (aVar7 == null || (function06 = (Function0) aVar7.f4929b) == null) {
                        return false;
                    }
                    return ((Boolean) function06.invoke()).booleanValue();
                case 262144:
                    Object g16 = h0Var.g(j2.i.f4966r);
                    j2.a aVar8 = (j2.a) (g16 == null ? null : g16);
                    if (aVar8 == null || (function07 = (Function0) aVar8.f4929b) == null) {
                        return false;
                    }
                    return ((Boolean) function07.invoke()).booleanValue();
                case 524288:
                    Object g17 = h0Var.g(j2.i.f4967s);
                    j2.a aVar9 = (j2.a) (g17 == null ? null : g17);
                    if (aVar9 == null || (function08 = (Function0) aVar9.f4929b) == null) {
                        return false;
                    }
                    return ((Boolean) function08.invoke()).booleanValue();
                case 1048576:
                    Object g18 = h0Var.g(j2.i.f4968t);
                    j2.a aVar10 = (j2.a) (g18 == null ? null : g18);
                    if (aVar10 == null || (function09 = (Function0) aVar10.f4929b) == null) {
                        return false;
                    }
                    return ((Boolean) function09.invoke()).booleanValue();
                case 2097152:
                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                    Object g19 = h0Var.g(j2.i.j);
                    j2.a aVar11 = (j2.a) (g19 == null ? null : g19);
                    if (aVar11 == null || (function1 = (Function1) aVar11.f4929b) == null) {
                        return false;
                    }
                    if (string == null) {
                        string = "";
                    }
                    return ((Boolean) function1.invoke(new m2.e(string))).booleanValue();
                case android.R.id.accessibilityActionShowOnScreen:
                    j2.m l10 = mVar.l();
                    if (l10 != null) {
                        Object g20 = l10.f4983d.f4975d.g(j2.i.f4954d);
                        if (g20 == null) {
                            g20 = null;
                        }
                        aVar = (j2.a) g20;
                        while (aVar == null && l10 != null) {
                            l10 = l10.l();
                            if (l10 != null) {
                                Object g21 = l10.f4983d.f4975d.g(j2.i.f4954d);
                                if (g21 == null) {
                                    g21 = null;
                                }
                                aVar = (j2.a) g21;
                            }
                        }
                        if (l10 == null) {
                            j1.c g22 = mVar.g();
                            return vVar.requestRectangleOnScreen(new Rect((int) Math.floor(g22.f4916a), (int) Math.floor(g22.f4917b), yd.c.a((float) Math.ceil(g22.f4918c)), yd.c.a((float) Math.ceil(g22.f4919d))));
                        }
                        long j10 = 0;
                        long j11 = 0;
                        boolean z10 = false;
                        while (l10 != null) {
                            c2.g0 g0Var3 = l10.f4982c;
                            s.h0 h0Var2 = l10.f4983d.f4975d;
                            Object g23 = h0Var2.g(j2.i.f4954d);
                            if (g23 == null) {
                                g23 = null;
                            }
                            j2.a aVar12 = (j2.a) g23;
                            if (aVar12 != null) {
                                j1.c e2 = a2.q.e((c2.q) g0Var3.S.f1493d);
                                a2.n k10 = ((c2.q) g0Var3.S.f1493d).k();
                                j1.c e9 = e2.e(k10 != null ? ((c2.i1) k10).K(j10) : j10);
                                c2.i1 d10 = mVar.d();
                                if (d10 != null) {
                                    if (!d10.D0().B) {
                                        d10 = null;
                                    }
                                    if (d10 != null) {
                                        f3 = 0.0f;
                                        j = d10.K(j10);
                                        long d11 = j1.b.d(j, j11);
                                        c2.i1 d12 = mVar.d();
                                        j1.c k11 = cf.c.k(d11, z4.m.b(d12 == null ? d12.f133i : 0L));
                                        f10 = k11.f4916a - e9.f4916a;
                                        f11 = k11.f4918c - e9.f4918c;
                                        if (Math.signum(f10) == Math.signum(f11)) {
                                            f10 = f3;
                                        } else if (Math.abs(f10) >= Math.abs(f11)) {
                                            f10 = f11;
                                        }
                                        f12 = k11.f4917b - e9.f4917b;
                                        f13 = k11.f4919d - e9.f4919d;
                                        if (Math.signum(f12) == Math.signum(f13)) {
                                            f12 = f3;
                                        } else if (Math.abs(f12) >= Math.abs(f13)) {
                                            f12 = f13;
                                        }
                                        floatToRawIntBits = (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
                                        if (j1.b.a(floatToRawIntBits, 0L)) {
                                            float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                                            j3 = 4294967295L;
                                            float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                                            Object g24 = h0Var2.g(j2.q.f5011u);
                                            if (g24 == null) {
                                                g24 = null;
                                            }
                                            if (g24 != null) {
                                                kotlin.collections.i0.j();
                                                return false;
                                            }
                                            if (g0Var2.M == x2.l.f10331e) {
                                                intBitsToFloat = -intBitsToFloat;
                                            }
                                            Object g25 = h0Var2.g(j2.q.f5012v);
                                            if (g25 == null) {
                                                g25 = null;
                                            }
                                            if (g25 != null) {
                                                kotlin.collections.i0.j();
                                                return false;
                                            }
                                            c10 = ' ';
                                            g0Var = g0Var2;
                                            floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                                        } else {
                                            floatToRawIntBits2 = floatToRawIntBits;
                                            g0Var = g0Var2;
                                            c10 = ' ';
                                            j3 = 4294967295L;
                                        }
                                        Function2 function2 = (Function2) aVar12.f4929b;
                                        z10 = (function2 == null && ((Boolean) function2.invoke(Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 >> c10))), Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 & j3))))).booleanValue()) || z10;
                                        j11 = j1.b.c(j11, floatToRawIntBits);
                                    }
                                }
                                f3 = 0.0f;
                                j = j10;
                                long d112 = j1.b.d(j, j11);
                                c2.i1 d122 = mVar.d();
                                j1.c k112 = cf.c.k(d112, z4.m.b(d122 == null ? d122.f133i : 0L));
                                f10 = k112.f4916a - e9.f4916a;
                                f11 = k112.f4918c - e9.f4918c;
                                if (Math.signum(f10) == Math.signum(f11)) {
                                }
                                f12 = k112.f4917b - e9.f4917b;
                                f13 = k112.f4919d - e9.f4919d;
                                if (Math.signum(f12) == Math.signum(f13)) {
                                }
                                floatToRawIntBits = (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
                                if (j1.b.a(floatToRawIntBits, 0L)) {
                                }
                                Function2 function22 = (Function2) aVar12.f4929b;
                                if (function22 == null) {
                                }
                                j11 = j1.b.c(j11, floatToRawIntBits);
                            } else {
                                g0Var = g0Var2;
                            }
                            l10 = l10.l();
                            g0Var2 = g0Var;
                            j10 = 0;
                        }
                        return z10;
                    }
                    aVar = null;
                    break;
                case android.R.id.accessibilityActionSetProgress:
                    if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                        return false;
                    }
                    Object g26 = h0Var.g(j2.i.f4957h);
                    j2.a aVar13 = (j2.a) (g26 == null ? null : g26);
                    if (aVar13 == null || (function12 = (Function1) aVar13.f4929b) == null) {
                        return false;
                    }
                    return ((Boolean) function12.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                case android.R.id.accessibilityActionImeEnter:
                    Object g27 = h0Var.g(j2.i.f4962n);
                    j2.a aVar14 = (j2.a) (g27 == null ? null : g27);
                    if (aVar14 == null || (function010 = (Function0) aVar14.f4929b) == null) {
                        return false;
                    }
                    return ((Boolean) function010.invoke()).booleanValue();
                default:
                    switch (i10) {
                        case android.R.id.accessibilityActionScrollUp:
                        case android.R.id.accessibilityActionScrollLeft:
                        case android.R.id.accessibilityActionScrollDown:
                        case android.R.id.accessibilityActionScrollRight:
                            break;
                        default:
                            switch (i10) {
                                case android.R.id.accessibilityActionPageUp:
                                    Object g28 = h0Var.g(j2.i.f4971w);
                                    j2.a aVar15 = (j2.a) (g28 == null ? null : g28);
                                    if (aVar15 == null || (function011 = (Function0) aVar15.f4929b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function011.invoke()).booleanValue();
                                case android.R.id.accessibilityActionPageDown:
                                    Object g29 = h0Var.g(j2.i.f4973y);
                                    j2.a aVar16 = (j2.a) (g29 == null ? null : g29);
                                    if (aVar16 == null || (function012 = (Function0) aVar16.f4929b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function012.invoke()).booleanValue();
                                case android.R.id.accessibilityActionPageLeft:
                                    Object g30 = h0Var.g(j2.i.f4972x);
                                    j2.a aVar17 = (j2.a) (g30 == null ? null : g30);
                                    if (aVar17 == null || (function013 = (Function0) aVar17.f4929b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function013.invoke()).booleanValue();
                                case android.R.id.accessibilityActionPageRight:
                                    Object g31 = h0Var.g(j2.i.f4974z);
                                    j2.a aVar18 = (j2.a) (g31 == null ? null : g31);
                                    if (aVar18 == null || (function014 = (Function0) aVar18.f4929b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function014.invoke()).booleanValue();
                                default:
                                    s.s0 s0Var = (s.s0) b0Var.C.c(i3);
                                    if (s0Var == null || ((CharSequence) s0Var.c(i10)) == null) {
                                        return false;
                                    }
                                    Object g32 = h0Var.g(j2.i.f4970v);
                                    List list = (List) (g32 == null ? null : g32);
                                    if (list == null || list.size() <= 0) {
                                        return false;
                                    }
                                    list.get(0).getClass();
                                    kotlin.collections.i0.j();
                                    return false;
                            }
                    }
            }
            boolean z11 = i10 == 4096;
            boolean z12 = i10 == 8192;
            if (i10 == 16908345) {
            }
            if (i10 == 16908347) {
            }
            if (i10 == 16908344) {
            }
            if (i10 == 16908346) {
            }
            if (z11 || z12) {
                Object g33 = h0Var.g(j2.q.f4995c);
                if (g33 == null) {
                    g33 = null;
                }
                j2.f fVar = (j2.f) g33;
                Object g34 = h0Var.g(j2.i.f4957h);
                if (g34 == null) {
                    g34 = null;
                }
                j2.a aVar19 = (j2.a) g34;
                if (fVar != null && aVar19 != null) {
                    float f14 = 0.0f / 20;
                    if (z12) {
                        f14 = -f14;
                    }
                    Function1 function14 = (Function1) aVar19.f4929b;
                    if (function14 != null) {
                        return ((Boolean) function14.invoke(Float.valueOf(0.0f + f14))).booleanValue();
                    }
                    return false;
                }
            }
            a2.q.e((c2.q) g0Var2.S.f1493d).b();
            ArrayList arrayList = new ArrayList();
            Object g35 = h0Var.g(j2.i.A);
            if (g35 == null) {
                g35 = null;
            }
            j2.a aVar20 = (j2.a) g35;
            if (aVar20 != null && (function13 = (Function1) aVar20.f4929b) != null && ((Boolean) function13.invoke(arrayList)).booleanValue()) {
            }
            Object g36 = h0Var.g(j2.i.f4954d);
            if (g36 == null) {
                g36 = null;
            }
            if (((j2.a) g36) == null) {
                return false;
            }
            Object g37 = h0Var.g(j2.q.f5011u);
            if (g37 == null) {
                g37 = null;
            }
            if (g37 != null) {
                kotlin.collections.i0.j();
                return false;
            }
            Object g38 = h0Var.g(j2.q.f5012v);
            if ((g38 == null ? null : g38) == null) {
                return false;
            }
            kotlin.collections.i0.j();
            return false;
        }
        if (bundle == null) {
            return false;
        }
        int i16 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z13 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        boolean z14 = i10 == 256;
        Integer num2 = b0Var.F;
        if (num2 == null || i14 != num2.intValue()) {
            b0Var.E = -1;
            b0Var.F = Integer.valueOf(i14);
        }
        String n11 = b0.n(mVar);
        if (n11 == null || n11.length() == 0) {
            return false;
        }
        String n12 = b0.n(mVar);
        if (n12 != null && n12.length() != 0) {
            if (i16 == 1) {
                Locale locale = vVar.getContext().getResources().getConfiguration().locale;
                if (c.f3348e == null) {
                    c cVar = new c(0);
                    cVar.f3351d = BreakIterator.getCharacterInstance(locale);
                    c.f3348e = cVar;
                }
                c cVar2 = c.f3348e;
                cVar2.getClass();
                cVar2.j(n12);
                bVar = cVar2;
            } else if (i16 != 2) {
                if (i16 != 4) {
                    if (i16 == 8) {
                        if (f.f3407c == null) {
                            f.f3407c = new f();
                        }
                        f fVar2 = f.f3407c;
                        fVar2.getClass();
                        fVar2.f3336a = n12;
                        bVar = fVar2;
                    }
                }
                if (h0Var.c(j2.i.f4951a) && (n10 = h0.n(jVar)) != null) {
                    if (i16 == 4) {
                        if (d.f3373d == null) {
                            d.f3373d = new d();
                        }
                        d dVar = d.f3373d;
                        dVar.getClass();
                        dVar.f3336a = n12;
                        dVar.f3376c = n10;
                        bVar = dVar;
                    } else {
                        if (e.f3400e == null) {
                            e eVar = new e();
                            new Rect();
                            e.f3400e = eVar;
                        }
                        e eVar2 = e.f3400e;
                        eVar2.getClass();
                        eVar2.f3336a = n12;
                        eVar2.f3402c = n10;
                        eVar2.f3403d = mVar;
                        bVar = eVar2;
                    }
                }
            } else {
                Locale locale2 = vVar.getContext().getResources().getConfiguration().locale;
                if (c.f3349f == null) {
                    c cVar3 = new c(1);
                    cVar3.f3351d = BreakIterator.getWordInstance(locale2);
                    c.f3349f = cVar3;
                }
                c cVar4 = c.f3349f;
                cVar4.getClass();
                cVar4.j(n12);
                bVar = cVar4;
            }
            if (bVar != null) {
                return false;
            }
            int k12 = b0Var.k(mVar);
            if (k12 == -1) {
                k12 = z14 ? 0 : n11.length();
            }
            int[] a9 = z14 ? bVar.a(k12) : bVar.i(k12);
            if (a9 == null) {
                return false;
            }
            int i17 = a9[0];
            int i18 = a9[1];
            if (z13 && !h0Var.c(j2.q.f4993a) && h0Var.c(j2.q.E)) {
                i12 = b0Var.l(mVar);
                if (i12 == -1) {
                    i12 = z14 ? i17 : i18;
                }
                i13 = z14 ? i18 : i17;
            } else {
                i12 = z14 ? i18 : i17;
                i13 = i12;
            }
            b0Var.J = new x(mVar, z14 ? 256 : 512, i16, i17, i18, SystemClock.uptimeMillis());
            b0Var.A(mVar, i12, i13, true);
            return true;
        }
        bVar = null;
        if (bVar != null) {
        }
    }
}
