package l2;

import A0.AbstractC0037h;
import A0.AbstractC0042m;
import A0.C0034e;
import A0.C0036g;
import A0.C0041l;
import A0.D;
import A0.M;
import A0.N;
import B1.C0097d;
import G.C0192d;
import G.C0205j0;
import G.W;
import L0.l;
import S.n;
import Z.C0323u;
import Z.K;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.C0483x;
import androidx.lifecycle.EnumC0475o;
import b1.AbstractC0504d;
import b1.C0503c;
import b1.C0508h;
import b1.C0509i;
import com.appsflyer.attribution.RequestError;
import com.chicken.road.kedro.laqer.R;
import i.AbstractC0662C;
import i.H;
import i.p;
import i.v;
import j.AbstractC0705a;
import j2.C0716f;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3.z;
import n.AbstractC0864b;
import o2.C0924c;
import o2.m;
import o2.o;
import o2.s;
import p0.InterfaceC0945F;
import p0.a0;
import p0.b0;
import q.AbstractC1024c;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import r0.B;
import r0.C1068i;
import r0.E;
import r0.InterfaceC1075p;
import r0.L;
import r0.e0;
import r0.r0;
import s.C1113q;
import s0.AbstractC1125K;
import s0.AbstractC1174w;
import s0.AbstractC1176x;
import s0.C1118D;
import s0.C1153l;
import s0.C1157n;
import s0.C1166s;
import s0.K0;
import w2.C1294c;
import y0.C1317a;
import y0.C1318b;
import y0.q;
import y0.r;
import y0.t;
import y2.C1336k;
import y2.C1338m;
import y2.EnumC1337l;
import z2.C1403G;
import z2.C1405I;

/* loaded from: classes.dex */
public final class g implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7975a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7976b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7977c;

    public /* synthetic */ g(Object obj, int i2, Object obj2) {
        this.f7975a = i2;
        this.f7976b = obj;
        this.f7977c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [S.n] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [S.n] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void g(E e4) {
        L l4 = e4.f9584C;
        int i2 = 0;
        if (l4.f9676c == 5 && !l4.f9678e && !l4.f9677d && !e4.f9591J && e4.E()) {
            n nVar = (n) e4.B.f2912f;
            if ((nVar.f3981j & 256) != 0) {
                while (nVar != null) {
                    if ((nVar.f3980i & 256) != 0) {
                        AbstractC1073n abstractC1073n = nVar;
                        ?? r6 = 0;
                        while (abstractC1073n != 0) {
                            if (abstractC1073n instanceof InterfaceC1075p) {
                                InterfaceC1075p interfaceC1075p = (InterfaceC1075p) abstractC1073n;
                                interfaceC1075p.H(AbstractC1065f.t(interfaceC1075p, 256));
                            } else if ((abstractC1073n.f3980i & 256) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                                n nVar2 = abstractC1073n.f9826u;
                                int i4 = 0;
                                abstractC1073n = abstractC1073n;
                                r6 = r6;
                                while (nVar2 != null) {
                                    if ((nVar2.f3980i & 256) != 0) {
                                        i4++;
                                        r6 = r6;
                                        if (i4 == 1) {
                                            abstractC1073n = nVar2;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new I.d(new n[16]);
                                            }
                                            if (abstractC1073n != 0) {
                                                r6.b(abstractC1073n);
                                                abstractC1073n = 0;
                                            }
                                            r6.b(nVar2);
                                        }
                                    }
                                    nVar2 = nVar2.f3983l;
                                    abstractC1073n = abstractC1073n;
                                    r6 = r6;
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC1073n = AbstractC1065f.f(r6);
                        }
                    }
                    if ((nVar.f3981j & 256) == 0) {
                        break;
                    } else {
                        nVar = nVar.f3983l;
                    }
                }
            }
        }
        e4.f9590I = false;
        I.d v4 = e4.v();
        int i5 = v4.f3332i;
        if (i5 > 0) {
            Object[] objArr = v4.f3330d;
            do {
                g((E) objArr[i2]);
                i2++;
            } while (i2 < i5);
        }
    }

    public static void l(s sVar, o2.h hVar) {
        if (!sVar.y()) {
            if (sVar.isEmpty()) {
                throw new IllegalArgumentException("Can't calculate hash on empty node!");
            }
            if (sVar instanceof o2.f) {
                ((o2.f) sVar).h(new o2.g(hVar), true);
                return;
            } else {
                throw new IllegalStateException("Expected children node, but got: " + sVar);
            }
        }
        hVar.c();
        hVar.f8931c = hVar.f8932d;
        hVar.f8929a.append(((o) sVar).u(2));
        hVar.f8933e = true;
        C0716f c0716f = hVar.f8936h;
        c0716f.getClass();
        if (hVar.f8929a.length() > c0716f.f7161d) {
            if (hVar.a(hVar.f8932d).isEmpty() || !hVar.a(hVar.f8932d).B().equals(C0924c.f8919j)) {
                hVar.b();
            }
        }
    }

    @Override // p0.b0
    public boolean a(Object obj, Object obj2) {
        C1113q c1113q = (C1113q) this.f7976b;
        return Intrinsics.a(c1113q.b(obj), c1113q.b(obj2));
    }

    @Override // p0.b0
    public void b(a0 a0Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7977c;
        linkedHashMap.clear();
        Iterator it = a0Var.f9032d.iterator();
        while (it.hasNext()) {
            Object b4 = ((C1113q) this.f7976b).b(it.next());
            Integer num = (Integer) linkedHashMap.get(b4);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                linkedHashMap.put(b4, Integer.valueOf(intValue + 1));
            }
        }
    }

    public void c(E e4) {
        if (e4.D()) {
            ((r0) this.f7977c).add(e4);
        } else {
            AbstractC0864b.D("DepthSortedSet.add called on an unattached node");
            throw null;
        }
    }

    public void d(E e4, boolean z4) {
        g gVar = (g) this.f7977c;
        g gVar2 = (g) this.f7976b;
        if (z4) {
            gVar2.c(e4);
            gVar.c(e4);
        } else {
            if (((r0) gVar2.f7977c).contains(e4)) {
                return;
            }
            gVar.c(e4);
        }
    }

    public boolean e(E e4, boolean z4) {
        boolean contains = ((r0) ((g) this.f7976b).f7977c).contains(e4);
        return z4 ? contains : contains || ((r0) ((g) this.f7977c).f7977c).contains(e4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:380:0x07b4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r1, java.lang.Boolean.TRUE) == false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x07b6, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
    
        if (y0.n.h(r14, true, 4).isEmpty() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x07f0, code lost:
    
        if (r1 == false) goto L395;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0c47  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x09cd  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x09e4  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0a58  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0a6f  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0a79  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0bec  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0c09  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0c14  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0c31  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0c3b  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0c37  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0c10  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0c4e  */
    /* JADX WARN: Type inference failed for: r15v12, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r1v85, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r3v23, types: [z2.I] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v25, types: [z2.I] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v27, types: [z2.I] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [s0.D] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0508h f(int i2) {
        C1166s c1166s;
        C0508h c0508h;
        AccessibilityNodeInfo accessibilityNodeInfo;
        y0.n nVar;
        y0.i iVar;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        boolean z4;
        Object obj;
        C0508h c0508h2;
        int i4;
        int c4;
        int i5;
        int i6;
        C1166s c1166s2;
        int c5;
        int i7;
        int i8;
        C0508h c0508h3;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        ?? r32;
        ?? r33;
        C0097d c0097d;
        ?? r34;
        int i9;
        C0483x e4;
        ?? r7 = (C1118D) this.f7977c;
        C1166s c1166s3 = r7.f10011d;
        C1153l viewTreeOwners = c1166s3.getViewTreeOwners();
        if (((viewTreeOwners == null || (e4 = viewTreeOwners.f10253a.e()) == null) ? null : e4.f5496d) != EnumC0475o.f5480d) {
            ?? obtain = AccessibilityNodeInfo.obtain();
            C0508h c0508h4 = new C0508h(obtain);
            AccessibilityNodeInfo accessibilityNodeInfo3 = c0508h4.f5625a;
            K0 k02 = (K0) r7.l().f(i2);
            if (k02 != null) {
                y0.n nVar2 = k02.f10067a;
                if (i2 == -1) {
                    ?? parentForAccessibility = c1166s3.getParentForAccessibility();
                    View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                    c0508h4.f5626b = -1;
                    obtain.setParent(view);
                } else {
                    y0.n j4 = nVar2.j();
                    Integer valueOf = j4 != null ? Integer.valueOf(j4.f11590g) : null;
                    if (valueOf == null) {
                        AbstractC0864b.E("semanticsNode " + i2 + " has null parent");
                        throw null;
                    }
                    int intValue = valueOf.intValue();
                    if (intValue == c1166s3.getSemanticsOwner().a().f11590g) {
                        intValue = -1;
                    }
                    c0508h4.f5626b = intValue;
                    obtain.setParent(c1166s3, intValue);
                }
                c0508h4.f5627c = i2;
                obtain.setSource(c1166s3, i2);
                obtain.setBoundsInScreen(r7.c(k02));
                c0508h4.f("android.view.View");
                if (nVar2.f11587d.f11576d.containsKey(q.f11635x)) {
                    c0508h4.f("android.widget.EditText");
                }
                t tVar = q.f11632u;
                y0.i iVar2 = nVar2.f11587d;
                LinkedHashMap linkedHashMap = iVar2.f11576d;
                if (linkedHashMap.containsKey(tVar)) {
                    c0508h4.f("android.widget.TextView");
                }
                Object obj2 = linkedHashMap.get(q.f11630s);
                if (obj2 == null) {
                    obj2 = null;
                }
                y0.f fVar = (y0.f) obj2;
                if (fVar != null) {
                    int i10 = !nVar2.f11588e ? 4 : 4;
                    int i11 = fVar.f11545a;
                    if (y0.f.a(i11, i10)) {
                        obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", c1166s3.getContext().getResources().getString(R.string.tab));
                    } else if (y0.f.a(i11, 2)) {
                        obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", c1166s3.getContext().getResources().getString(R.string.switch_role));
                    } else {
                        String p4 = AbstractC1125K.p(i11);
                        if (!y0.f.a(i11, 5) || nVar2.m() || iVar2.f11577e) {
                            c0508h4.f(p4);
                        }
                    }
                    Unit unit = Unit.f7487a;
                }
                if (linkedHashMap.containsKey(y0.h.f11558i)) {
                    c0508h4.f("android.widget.EditText");
                }
                if (linkedHashMap.containsKey(tVar)) {
                    c0508h4.f("android.widget.TextView");
                }
                obtain.setPackageName(c1166s3.getContext().getPackageName());
                obtain.setImportantForAccessibility(AbstractC1125K.i(nVar2));
                List h4 = y0.n.h(nVar2, true, 4);
                int size = h4.size();
                for (int i12 = 0; i12 < size; i12++) {
                    y0.n nVar3 = (y0.n) h4.get(i12);
                    if (r7.l().b(nVar3.f11590g)) {
                        if (c1166s3.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(nVar3.f11586c) != null) {
                            throw new ClassCastException();
                        }
                        int i13 = nVar3.f11590g;
                        if (i13 != -1) {
                            obtain.addChild(c1166s3, i13);
                        }
                    }
                }
                if (i2 == r7.f10021n) {
                    accessibilityNodeInfo3.setAccessibilityFocused(true);
                    c0508h4.a(C0503c.f5616d);
                } else {
                    accessibilityNodeInfo3.setAccessibilityFocused(false);
                    c0508h4.a(C0503c.f5615c);
                }
                C0036g o4 = C1118D.o(nVar2);
                if (o4 != null) {
                    c1166s3.getFontFamilyResolver();
                    M0.b density = c1166s3.getDensity();
                    String str = o4.f328a;
                    SpannableString spannableString2 = new SpannableString(str);
                    List list = o4.f329b;
                    if (list != null) {
                        int size2 = list.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            int i15 = size2;
                            C0034e c0034e = (C0034e) list.get(i14);
                            List list2 = list;
                            D d4 = (D) c0034e.f324a;
                            C1166s c1166s4 = c1166s3;
                            C0508h c0508h5 = c0508h4;
                            AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfo3;
                            long b4 = d4.f256a.b();
                            L0.n nVar4 = d4.f256a;
                            y0.n nVar5 = nVar2;
                            y0.i iVar3 = iVar2;
                            if (!C0323u.c(b4, nVar4.b())) {
                                nVar4 = b4 != 16 ? new L0.c(b4) : l.f3515a;
                            }
                            long b5 = nVar4.b();
                            int i16 = c0034e.f325b;
                            int i17 = c0034e.f326c;
                            j0.c.M(spannableString2, b5, i16, i17);
                            j0.c.N(spannableString2, d4.f257b, density, i16, i17);
                            F0.k kVar = d4.f258c;
                            F0.i iVar4 = d4.f259d;
                            if (kVar == null && iVar4 == null) {
                                i9 = 33;
                            } else {
                                if (kVar == null) {
                                    kVar = F0.k.f2614i;
                                }
                                StyleSpan styleSpan = new StyleSpan(j0.c.z(kVar, iVar4 != null ? iVar4.f2611a : 0));
                                i9 = 33;
                                spannableString2.setSpan(styleSpan, i16, i17, 33);
                            }
                            L0.j jVar = d4.f268m;
                            if (jVar != null) {
                                int i18 = jVar.f3513a;
                                if ((i18 | 1) == i18) {
                                    spannableString2.setSpan(new UnderlineSpan(), i16, i17, i9);
                                }
                                if ((i18 | 2) == i18) {
                                    spannableString2.setSpan(new StrikethroughSpan(), i16, i17, i9);
                                }
                            }
                            L0.o oVar = d4.f265j;
                            if (oVar != null) {
                                spannableString2.setSpan(new ScaleXSpan(oVar.f3519a), i16, i17, i9);
                            }
                            H0.b bVar = d4.f266k;
                            if (bVar != null) {
                                spannableString2.setSpan(J0.a.f3380a.a(bVar), i16, i17, i9);
                            }
                            long j5 = d4.f267l;
                            if (j5 != 16) {
                                spannableString2.setSpan(new BackgroundColorSpan(K.D(j5)), i16, i17, i9);
                            }
                            i14++;
                            size2 = i15;
                            list = list2;
                            c1166s3 = c1166s4;
                            c0508h4 = c0508h5;
                            accessibilityNodeInfo3 = accessibilityNodeInfo4;
                            nVar2 = nVar5;
                            iVar2 = iVar3;
                        }
                    }
                    c1166s = c1166s3;
                    c0508h = c0508h4;
                    accessibilityNodeInfo = accessibilityNodeInfo3;
                    nVar = nVar2;
                    iVar = iVar2;
                    int length = str.length();
                    List list3 = o4.f331d;
                    if (list3 != null) {
                        r32 = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int i19 = 0; i19 < size3; i19++) {
                            Object obj3 = list3.get(i19);
                            C0034e c0034e2 = (C0034e) obj3;
                            if ((c0034e2.f324a instanceof N) && AbstractC0037h.c(0, length, c0034e2.f325b, c0034e2.f326c)) {
                                r32.add(obj3);
                            }
                        }
                    } else {
                        r32 = C1405I.f11931d;
                    }
                    Intrinsics.d(r32, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
                    int size4 = r32.size();
                    for (int i20 = 0; i20 < size4; i20++) {
                        C0034e c0034e3 = (C0034e) r32.get(i20);
                        N n2 = (N) c0034e3.f324a;
                        if (!(n2 instanceof N)) {
                            throw new C1338m();
                        }
                        spannableString2.setSpan(new TtsSpan.VerbatimBuilder(n2.f307a).build(), c0034e3.f325b, c0034e3.f326c, 33);
                    }
                    int length2 = str.length();
                    if (list3 != null) {
                        r33 = new ArrayList(list3.size());
                        int size5 = list3.size();
                        for (int i21 = 0; i21 < size5; i21++) {
                            Object obj4 = list3.get(i21);
                            C0034e c0034e4 = (C0034e) obj4;
                            if ((c0034e4.f324a instanceof M) && AbstractC0037h.c(0, length2, c0034e4.f325b, c0034e4.f326c)) {
                                r33.add(obj4);
                            }
                        }
                    } else {
                        r33 = C1405I.f11931d;
                    }
                    Intrinsics.d(r33, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
                    int size6 = r33.size();
                    int i22 = 0;
                    while (true) {
                        c0097d = r7.f10004G;
                        if (i22 >= size6) {
                            break;
                        }
                        C0034e c0034e5 = (C0034e) r33.get(i22);
                        M m4 = (M) c0034e5.f324a;
                        WeakHashMap weakHashMap = (WeakHashMap) c0097d.f987e;
                        Object obj5 = weakHashMap.get(m4);
                        if (obj5 == null) {
                            obj5 = new URLSpan(m4.f306a);
                            weakHashMap.put(m4, obj5);
                        }
                        spannableString2.setSpan((URLSpan) obj5, c0034e5.f325b, c0034e5.f326c, 33);
                        i22++;
                    }
                    int length3 = str.length();
                    if (list3 != null) {
                        r34 = new ArrayList(list3.size());
                        int size7 = list3.size();
                        for (int i23 = 0; i23 < size7; i23++) {
                            Object obj6 = list3.get(i23);
                            C0034e c0034e6 = (C0034e) obj6;
                            if ((c0034e6.f324a instanceof AbstractC0042m) && AbstractC0037h.c(0, length3, c0034e6.f325b, c0034e6.f326c)) {
                                r34.add(obj6);
                            }
                        }
                    } else {
                        r34 = C1405I.f11931d;
                    }
                    Intrinsics.d(r34, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
                    int size8 = r34.size();
                    for (int i24 = 0; i24 < size8; i24++) {
                        C0034e c0034e7 = (C0034e) r34.get(i24);
                        Object obj7 = c0034e7.f324a;
                        AbstractC0042m abstractC0042m = (AbstractC0042m) obj7;
                        boolean z10 = abstractC0042m instanceof C0041l;
                        int i25 = c0034e7.f326c;
                        int i26 = c0034e7.f325b;
                        if (z10) {
                            abstractC0042m.getClass();
                            Intrinsics.d(obj7, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                            C0041l c0041l = (C0041l) obj7;
                            C0034e c0034e8 = new C0034e(i26, i25, c0041l);
                            WeakHashMap weakHashMap2 = (WeakHashMap) c0097d.f988i;
                            Object obj8 = weakHashMap2.get(c0034e8);
                            if (obj8 == null) {
                                obj8 = new URLSpan(c0041l.f343a);
                                weakHashMap2.put(c0034e8, obj8);
                            }
                            spannableString2.setSpan((URLSpan) obj8, i26, i25, 33);
                        } else {
                            WeakHashMap weakHashMap3 = (WeakHashMap) c0097d.f989j;
                            Object obj9 = weakHashMap3.get(c0034e7);
                            if (obj9 == null) {
                                obj9 = new I0.f(abstractC0042m);
                                weakHashMap3.put(c0034e7, obj9);
                            }
                            spannableString2.setSpan((ClickableSpan) obj9, i26, i25, 33);
                        }
                    }
                    spannableString = (SpannableString) C1118D.I(spannableString2);
                } else {
                    c1166s = c1166s3;
                    c0508h = c0508h4;
                    accessibilityNodeInfo = accessibilityNodeInfo3;
                    nVar = nVar2;
                    iVar = iVar2;
                    spannableString = null;
                }
                obtain.setText(spannableString);
                t tVar2 = q.f11608D;
                if (linkedHashMap.containsKey(tVar2)) {
                    obtain.setContentInvalid(true);
                    Object obj10 = linkedHashMap.get(tVar2);
                    if (obj10 == null) {
                        obj10 = null;
                    }
                    obtain.setError((CharSequence) obj10);
                }
                y0.n nVar6 = nVar;
                String n4 = r7.n(nVar6);
                if (Build.VERSION.SDK_INT >= 30) {
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    AbstractC0504d.c(accessibilityNodeInfo2, n4);
                } else {
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", n4);
                }
                obtain.setCheckable(C1118D.m(nVar6));
                Object obj11 = linkedHashMap.get(q.B);
                if (obj11 == null) {
                    obj11 = null;
                }
                z0.a aVar = (z0.a) obj11;
                if (aVar != null) {
                    if (aVar == z0.a.f11778d) {
                        accessibilityNodeInfo2.setChecked(true);
                    } else if (aVar == z0.a.f11779e) {
                        accessibilityNodeInfo2.setChecked(false);
                    }
                    Unit unit2 = Unit.f7487a;
                }
                Object obj12 = linkedHashMap.get(q.f11606A);
                if (obj12 == null) {
                    obj12 = null;
                }
                Boolean bool = (Boolean) obj12;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (fVar == null ? false : y0.f.a(fVar.f11545a, 4)) {
                        obtain.setSelected(booleanValue);
                    } else {
                        accessibilityNodeInfo2.setChecked(booleanValue);
                    }
                    Unit unit3 = Unit.f7487a;
                }
                y0.i iVar5 = iVar;
                if (!iVar5.f11577e || y0.n.h(nVar6, true, 4).isEmpty()) {
                    Object obj13 = linkedHashMap.get(q.f11612a);
                    if (obj13 == null) {
                        obj13 = null;
                    }
                    List list4 = (List) obj13;
                    obtain.setContentDescription(list4 != null ? (String) C1403G.r(list4) : null);
                }
                Object obj14 = linkedHashMap.get(q.f11631t);
                if (obj14 == null) {
                    obj14 = null;
                }
                String str2 = (String) obj14;
                if (str2 != null) {
                    y0.n nVar7 = nVar6;
                    while (true) {
                        if (nVar7 == null) {
                            z9 = false;
                            break;
                        }
                        t tVar3 = r.f11638a;
                        y0.i iVar6 = nVar7.f11587d;
                        if (iVar6.f11576d.containsKey(tVar3)) {
                            z9 = ((Boolean) iVar6.h(tVar3)).booleanValue();
                            break;
                        }
                        nVar7 = nVar7.j();
                    }
                    if (z9) {
                        obtain.setViewIdResourceName(str2);
                    }
                }
                t tVar4 = q.f11612a;
                Object obj15 = linkedHashMap.get(q.f11619h);
                if (obj15 == null) {
                    obj15 = null;
                }
                if (((Unit) obj15) != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo2.setHeading(true);
                    } else {
                        Bundle extras = accessibilityNodeInfo2.getExtras();
                        if (extras != null) {
                            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)) | 2);
                        }
                    }
                    Unit unit4 = Unit.f7487a;
                }
                obtain.setPassword(linkedHashMap.containsKey(q.f11607C));
                accessibilityNodeInfo2.setEditable(iVar5.f11576d.containsKey(q.f11610F));
                Object obj16 = iVar5.f11576d.get(q.f11611G);
                if (obj16 == null) {
                    obj16 = null;
                }
                Integer num = (Integer) obj16;
                accessibilityNodeInfo2.setMaxTextLength(num != null ? num.intValue() : -1);
                accessibilityNodeInfo2.setEnabled(AbstractC1125K.a(nVar6));
                t tVar5 = q.f11622k;
                accessibilityNodeInfo2.setFocusable(iVar5.f11576d.containsKey(tVar5));
                if (accessibilityNodeInfo2.isFocusable()) {
                    accessibilityNodeInfo2.setFocused(((Boolean) iVar5.h(tVar5)).booleanValue());
                    if (accessibilityNodeInfo2.isFocused()) {
                        accessibilityNodeInfo2.addAction(2);
                    } else {
                        accessibilityNodeInfo2.addAction(1);
                    }
                }
                r0.a0 c6 = nVar6.c();
                if (!(c6 != null ? c6.V0() : false)) {
                    if (!iVar5.f11576d.containsKey(q.f11624m)) {
                        z4 = true;
                        accessibilityNodeInfo2.setVisibleToUser(z4);
                        obj = iVar5.f11576d.get(q.f11621j);
                        if (obj == null) {
                            obj = null;
                        }
                        if (obj == null) {
                            throw new ClassCastException();
                        }
                        accessibilityNodeInfo2.setClickable(false);
                        Object obj17 = iVar5.f11576d.get(y0.h.f11551b);
                        if (obj17 == null) {
                            obj17 = null;
                        }
                        C1317a c1317a = (C1317a) obj17;
                        if (c1317a != null) {
                            Object obj18 = iVar5.f11576d.get(q.f11606A);
                            if (obj18 == null) {
                                obj18 = null;
                            }
                            boolean a4 = Intrinsics.a(obj18, Boolean.TRUE);
                            if (!(fVar == null ? false : y0.f.a(fVar.f11545a, 4))) {
                                if (!(fVar == null ? false : y0.f.a(fVar.f11545a, 3))) {
                                    z8 = false;
                                    accessibilityNodeInfo2.setClickable(z8 || (z8 && !a4));
                                    if (AbstractC1125K.a(nVar6) || !accessibilityNodeInfo2.isClickable()) {
                                        c0508h2 = c0508h;
                                    } else {
                                        C0503c c0503c = new C0503c(null, 16, c1317a.f11535a, null);
                                        c0508h2 = c0508h;
                                        c0508h2.a(c0503c);
                                    }
                                    Unit unit5 = Unit.f7487a;
                                }
                            }
                            z8 = true;
                            accessibilityNodeInfo2.setClickable(z8 || (z8 && !a4));
                            if (AbstractC1125K.a(nVar6)) {
                            }
                            c0508h2 = c0508h;
                            Unit unit52 = Unit.f7487a;
                        } else {
                            c0508h2 = c0508h;
                        }
                        accessibilityNodeInfo2.setLongClickable(false);
                        Object obj19 = iVar5.f11576d.get(y0.h.f11552c);
                        if (obj19 == null) {
                            obj19 = null;
                        }
                        C1317a c1317a2 = (C1317a) obj19;
                        if (c1317a2 != null) {
                            accessibilityNodeInfo2.setLongClickable(true);
                            if (AbstractC1125K.a(nVar6)) {
                                c0508h2.a(new C0503c(null, 32, c1317a2.f11535a, null));
                            }
                            Unit unit6 = Unit.f7487a;
                        }
                        Object obj20 = iVar5.f11576d.get(y0.h.f11564o);
                        if (obj20 == null) {
                            obj20 = null;
                        }
                        C1317a c1317a3 = (C1317a) obj20;
                        if (c1317a3 != null) {
                            c0508h2.a(new C0503c(null, 16384, c1317a3.f11535a, null));
                            Unit unit7 = Unit.f7487a;
                        }
                        if (AbstractC1125K.a(nVar6)) {
                            Object obj21 = iVar5.f11576d.get(y0.h.f11558i);
                            if (obj21 == null) {
                                obj21 = null;
                            }
                            C1317a c1317a4 = (C1317a) obj21;
                            if (c1317a4 != null) {
                                c0508h2.a(new C0503c(null, 2097152, c1317a4.f11535a, null));
                                Unit unit8 = Unit.f7487a;
                            }
                            Object obj22 = iVar5.f11576d.get(y0.h.f11563n);
                            if (obj22 == null) {
                                obj22 = null;
                            }
                            C1317a c1317a5 = (C1317a) obj22;
                            if (c1317a5 != null) {
                                c0508h2.a(new C0503c(null, android.R.id.accessibilityActionImeEnter, c1317a5.f11535a, null));
                                Unit unit9 = Unit.f7487a;
                            }
                            C1317a c1317a6 = (C1317a) z.n(iVar5, y0.h.f11565p);
                            if (c1317a6 != null) {
                                c0508h2.a(new C0503c(65536, c1317a6.a()));
                                Unit unit10 = Unit.f7487a;
                            }
                            C1317a c1317a7 = (C1317a) z.n(nVar6.k(), y0.h.f11566q);
                            if (c1317a7 != null) {
                                if (accessibilityNodeInfo2.isFocused()) {
                                    ClipDescription primaryClipDescription = c1166s.getClipboardManager().f10234a.getPrimaryClipDescription();
                                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                        c0508h2.a(new C0503c(32768, c1317a7.a()));
                                    }
                                }
                                Unit unit11 = Unit.f7487a;
                            }
                        }
                        String p5 = C1118D.p(nVar6);
                        if (!(p5 == null || p5.length() == 0)) {
                            accessibilityNodeInfo2.setTextSelection(r7.k(nVar6), r7.j(nVar6));
                            C1317a c1317a8 = (C1317a) z.n(nVar6.k(), y0.h.f11557h);
                            c0508h2.a(new C0503c(131072, c1317a8 != null ? c1317a8.a() : null));
                            accessibilityNodeInfo2.addAction(256);
                            accessibilityNodeInfo2.addAction(512);
                            accessibilityNodeInfo2.setMovementGranularities(11);
                            List list5 = (List) z.n(nVar6.k(), q.f11612a);
                            if ((list5 == null || list5.isEmpty()) && nVar6.k().e(y0.h.f11550a)) {
                                if (nVar6.f11587d.f11576d.containsKey(q.f11635x)) {
                                    Object obj23 = nVar6.f11587d.f11576d.get(q.f11622k);
                                    if (obj23 == null) {
                                        obj23 = null;
                                    }
                                }
                                ?? r12 = C1157n.f10270k;
                                E s4 = nVar6.f11586c.s();
                                while (true) {
                                    if (s4 == null) {
                                        s4 = null;
                                        break;
                                    }
                                    if (((Boolean) r12.invoke(s4)).booleanValue()) {
                                        break;
                                    }
                                    s4 = s4.s();
                                }
                                if (s4 != null) {
                                    y0.i o5 = s4.o();
                                    if (o5 != null) {
                                        Object obj24 = o5.f11576d.get(q.f11622k);
                                        if (obj24 == null) {
                                            obj24 = null;
                                        }
                                        z7 = Intrinsics.a(obj24, Boolean.TRUE);
                                    } else {
                                        z7 = false;
                                    }
                                }
                                boolean z11 = false;
                                if (!z11) {
                                    accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                }
                            }
                        }
                        int i27 = Build.VERSION.SDK_INT;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        CharSequence e5 = c0508h2.e();
                        if (!(e5 == null || e5.length() == 0) && nVar6.k().e(y0.h.f11550a)) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (nVar6.k().e(q.f11631t)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        accessibilityNodeInfo2.setAvailableExtraData(arrayList);
                        y0.e eVar = (y0.e) z.n(nVar6.k(), q.f11614c);
                        if (eVar != null) {
                            y0.i k4 = nVar6.k();
                            t tVar6 = y0.h.f11556g;
                            if (k4.e(tVar6)) {
                                c0508h2.f("android.widget.SeekBar");
                            } else {
                                c0508h2.f("android.widget.ProgressBar");
                            }
                            y0.e eVar2 = y0.e.f11542c;
                            if (eVar != y0.e.f11542c) {
                                eVar.a().getClass();
                                float floatValue = Float.valueOf(0.0f).floatValue();
                                eVar.a().getClass();
                                accessibilityNodeInfo2.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new C1294c(AccessibilityNodeInfo.RangeInfo.obtain(1, floatValue, Float.valueOf(0.0f).floatValue(), 0.0f)).f11388d);
                            }
                            if (nVar6.k().e(tVar6) && AbstractC1125K.a(nVar6)) {
                                eVar.a().getClass();
                                float floatValue2 = Float.valueOf(0.0f).floatValue();
                                eVar.a().getClass();
                                if (0.0f < kotlin.ranges.b.a(floatValue2, Float.valueOf(0.0f).floatValue())) {
                                    c0508h2.a(C0503c.f5617e);
                                }
                                eVar.a().getClass();
                                float floatValue3 = Float.valueOf(0.0f).floatValue();
                                eVar.a().getClass();
                                if (0.0f > kotlin.ranges.b.b(floatValue3, Float.valueOf(0.0f).floatValue())) {
                                    c0508h2.a(C0503c.f5618f);
                                }
                            }
                        }
                        AbstractC1174w.a(c0508h2, nVar6);
                        Object obj25 = nVar6.i().f11576d.get(q.f11617f);
                        if (obj25 == null) {
                            obj25 = null;
                        }
                        C1318b c1318b = (C1318b) obj25;
                        if (c1318b != null) {
                            accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(c1318b.f11537a, c1318b.f11538b, false, 0));
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Object obj26 = nVar6.i().f11576d.get(q.f11616e);
                            if (obj26 == null) {
                                obj26 = null;
                            }
                            if (obj26 != null) {
                                List h5 = y0.n.h(nVar6, true, 4);
                                int size9 = h5.size();
                                for (int i28 = 0; i28 < size9; i28++) {
                                    y0.n nVar8 = (y0.n) h5.get(i28);
                                    if (nVar8.i().f11576d.containsKey(q.f11606A)) {
                                        arrayList2.add(nVar8);
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                boolean i29 = z.i(arrayList2);
                                accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i29 ? 1 : arrayList2.size(), i29 ? arrayList2.size() : 1, false, 0));
                            }
                        }
                        z.r(c0508h2, nVar6);
                        y0.g gVar = (y0.g) z.n(nVar6.k(), q.f11626o);
                        C1317a c1317a9 = (C1317a) z.n(nVar6.k(), y0.h.f11553d);
                        if (gVar != null && c1317a9 != null) {
                            Object obj27 = nVar6.i().f11576d.get(q.f11617f);
                            if (obj27 == null) {
                                obj27 = null;
                            }
                            if (obj27 == null) {
                                Object obj28 = nVar6.i().f11576d.get(q.f11616e);
                                if (obj28 == null) {
                                    obj28 = null;
                                }
                                if (obj28 == null) {
                                    z6 = false;
                                    if (!z6) {
                                        c0508h2.f("android.widget.HorizontalScrollView");
                                    }
                                    if (((Number) gVar.a().invoke()).floatValue() > 0.0f) {
                                        accessibilityNodeInfo2.setScrollable(true);
                                    }
                                    if (AbstractC1125K.a(nVar6)) {
                                        if (C1118D.v(gVar)) {
                                            c0508h2.a(C0503c.f5617e);
                                            c0508h2.a(!AbstractC1125K.b(nVar6) ? C0503c.f5622j : C0503c.f5620h);
                                        }
                                        if (C1118D.u(gVar)) {
                                            c0508h2.a(C0503c.f5618f);
                                            c0508h2.a(!AbstractC1125K.b(nVar6) ? C0503c.f5620h : C0503c.f5622j);
                                        }
                                    }
                                }
                            }
                            z6 = true;
                            if (!z6) {
                            }
                            if (((Number) gVar.a().invoke()).floatValue() > 0.0f) {
                            }
                            if (AbstractC1125K.a(nVar6)) {
                            }
                        }
                        y0.g gVar2 = (y0.g) z.n(nVar6.k(), q.f11627p);
                        if (gVar2 != null && c1317a9 != null) {
                            Object obj29 = nVar6.i().f11576d.get(q.f11617f);
                            if (obj29 == null) {
                                obj29 = null;
                            }
                            if (obj29 == null) {
                                Object obj30 = nVar6.i().f11576d.get(q.f11616e);
                                if (obj30 == null) {
                                    obj30 = null;
                                }
                                if (obj30 == null) {
                                    z5 = false;
                                    if (!z5) {
                                        c0508h2.f("android.widget.ScrollView");
                                    }
                                    if (((Number) gVar2.a().invoke()).floatValue() > 0.0f) {
                                        accessibilityNodeInfo2.setScrollable(true);
                                    }
                                    if (AbstractC1125K.a(nVar6)) {
                                        if (C1118D.v(gVar2)) {
                                            c0508h2.a(C0503c.f5617e);
                                            c0508h2.a(C0503c.f5621i);
                                        }
                                        if (C1118D.u(gVar2)) {
                                            c0508h2.a(C0503c.f5618f);
                                            c0508h2.a(C0503c.f5619g);
                                        }
                                    }
                                }
                            }
                            z5 = true;
                            if (!z5) {
                            }
                            if (((Number) gVar2.a().invoke()).floatValue() > 0.0f) {
                            }
                            if (AbstractC1125K.a(nVar6)) {
                            }
                        }
                        if (i27 >= 29) {
                            AbstractC1176x.a(c0508h2, nVar6);
                        }
                        CharSequence charSequence = (CharSequence) z.n(nVar6.k(), q.f11615d);
                        if (i27 >= 28) {
                            accessibilityNodeInfo2.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (AbstractC1125K.a(nVar6)) {
                            C1317a c1317a10 = (C1317a) z.n(nVar6.k(), y0.h.f11567r);
                            if (c1317a10 != null) {
                                c0508h2.a(new C0503c(262144, c1317a10.a()));
                                Unit unit12 = Unit.f7487a;
                            }
                            C1317a c1317a11 = (C1317a) z.n(nVar6.k(), y0.h.f11568s);
                            if (c1317a11 != null) {
                                c0508h2.a(new C0503c(524288, c1317a11.a()));
                                Unit unit13 = Unit.f7487a;
                            }
                            C1317a c1317a12 = (C1317a) z.n(nVar6.k(), y0.h.f11569t);
                            if (c1317a12 != null) {
                                c0508h2.a(new C0503c(1048576, c1317a12.a()));
                                Unit unit14 = Unit.f7487a;
                            }
                            y0.i k5 = nVar6.k();
                            t tVar7 = y0.h.f11571v;
                            if (k5.e(tVar7)) {
                                List list6 = (List) nVar6.k().h(tVar7);
                                int size10 = list6.size();
                                p pVar = C1118D.f9998N;
                                if (size10 >= pVar.f6939b) {
                                    throw new IllegalStateException("Can't have more than " + pVar.f6939b + " custom actions for one widget");
                                }
                                H h6 = new H();
                                v vVar = AbstractC0662C.f6889a;
                                v vVar2 = new v();
                                H h7 = r7.f10027t;
                                if (h7.f6896d) {
                                    i.n.a(h7);
                                }
                                i4 = i2;
                                if (AbstractC0705a.a(h7.f6897e, h7.f6899j, i4) >= 0) {
                                    v vVar3 = (v) h7.b(i4);
                                    p pVar2 = new p();
                                    int[] iArr = pVar.f6938a;
                                    int i30 = pVar.f6939b;
                                    for (int i31 = 0; i31 < i30; i31++) {
                                        pVar2.a(iArr[i31]);
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    if (list6.size() > 0) {
                                        B.c(list6.get(0));
                                        Intrinsics.c(vVar3);
                                        throw null;
                                    }
                                    if (arrayList3.size() > 0) {
                                        B.c(arrayList3.get(0));
                                        pVar2.c(0);
                                        throw null;
                                    }
                                } else if (list6.size() > 0) {
                                    B.c(list6.get(0));
                                    pVar.c(0);
                                    throw null;
                                }
                                r7.f10026s.d(i4, h6);
                                h7.d(i4, vVar2);
                                boolean r2 = r7.r(nVar6);
                                if (Build.VERSION.SDK_INT < 28) {
                                    accessibilityNodeInfo2.setScreenReaderFocusable(r2);
                                } else {
                                    Bundle extras2 = accessibilityNodeInfo2.getExtras();
                                    if (extras2 != null) {
                                        extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (r2 ? 1 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
                                    }
                                }
                                i.o oVar2 = r7.f10000C;
                                c4 = oVar2.c(i4);
                                if (c4 < 0) {
                                    i6 = oVar2.f6934c[c4];
                                    i5 = -1;
                                } else {
                                    i5 = -1;
                                    i6 = -1;
                                }
                                if (i6 == i5) {
                                    AbstractC1125K.n(c1166s.getAndroidViewsHandler$ui_release(), i6);
                                    c1166s2 = c1166s;
                                    c0508h2.g(c1166s2, i6);
                                    r7.b(i4, c0508h2, r7.f10002E, null);
                                } else {
                                    c1166s2 = c1166s;
                                }
                                i.o oVar3 = r7.f10001D;
                                c5 = oVar3.c(i4);
                                if (c5 < 0) {
                                    i8 = oVar3.f6934c[c5];
                                    i7 = -1;
                                } else {
                                    i7 = -1;
                                    i8 = -1;
                                }
                                if (i8 != i7) {
                                    AbstractC1125K.n(c1166s2.getAndroidViewsHandler$ui_release(), i8);
                                }
                                c0508h3 = c0508h2;
                                if (r7.f10023p && i4 == r7.f10021n) {
                                    r7.f10022o = c0508h3;
                                }
                                return c0508h3;
                            }
                        }
                        i4 = i2;
                        boolean r22 = r7.r(nVar6);
                        if (Build.VERSION.SDK_INT < 28) {
                        }
                        i.o oVar22 = r7.f10000C;
                        c4 = oVar22.c(i4);
                        if (c4 < 0) {
                        }
                        if (i6 == i5) {
                        }
                        i.o oVar32 = r7.f10001D;
                        c5 = oVar32.c(i4);
                        if (c5 < 0) {
                        }
                        if (i8 != i7) {
                        }
                        c0508h3 = c0508h2;
                        if (r7.f10023p) {
                            r7.f10022o = c0508h3;
                        }
                        return c0508h3;
                    }
                }
                z4 = false;
                accessibilityNodeInfo2.setVisibleToUser(z4);
                obj = iVar5.f11576d.get(q.f11621j);
                if (obj == null) {
                }
                if (obj == null) {
                }
            }
        }
        i4 = i2;
        c0508h3 = null;
        if (r7.f10023p) {
        }
        return c0508h3;
    }

    public s h() {
        C0821a c0821a = (C0821a) this.f7977c;
        if (c0821a.f7963b) {
            return c0821a.f7962a.f8941d;
        }
        return null;
    }

    public List i() {
        ArrayList arrayList;
        if (((ArrayList) this.f7976b).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f7976b)) {
            arrayList = new ArrayList((ArrayList) this.f7976b);
        }
        return arrayList;
    }

    public InterfaceC0945F j() {
        return (InterfaceC0945F) ((C0205j0) this.f7977c).getValue();
    }

    public boolean k() {
        return !(((r0) ((g) this.f7977c).f7977c).isEmpty() && ((r0) ((g) this.f7976b).f7977c).isEmpty());
    }

    public boolean m(E e4) {
        if (e4.D()) {
            return ((r0) this.f7977c).remove(e4);
        }
        AbstractC0864b.D("DepthSortedSet.remove called on an unattached node");
        throw null;
    }

    public g n(m mVar, boolean z4, boolean z5) {
        return new g(new C0821a(mVar, z4, z5), 1, (C0821a) this.f7977c);
    }

    public String toString() {
        switch (this.f7975a) {
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((r0) this.f7977c).toString();
            default:
                return super.toString();
        }
    }

    public g(E e4, InterfaceC0945F interfaceC0945F) {
        this.f7975a = 9;
        this.f7976b = e4;
        this.f7977c = C0192d.K(interfaceC0945F, W.f2779l);
    }

    public g(List list, List list2) {
        this.f7975a = 3;
        if (list.size() == list2.size() - 1) {
            this.f7976b = list;
            this.f7977c = list2;
            return;
        }
        throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
    }

    public g(int i2) {
        this.f7975a = i2;
        switch (i2) {
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f7976b = C1336k.b(EnumC1337l.f11671e, C1068i.f9804i);
                this.f7977c = new r0(new e0(1));
                break;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                this.f7976b = new g(7);
                this.f7977c = new g(7);
                break;
            case AbstractC1024c.f9242c /* 9 */:
            case 10:
            case 12:
            default:
                this.f7976b = new ArrayList();
                this.f7977c = new HashMap();
                new HashMap();
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                this.f7976b = new I.d(new E[16]);
                break;
            case 13:
                this.f7976b = new C0509i(this);
                break;
            case 14:
                this.f7976b = new I.d(new Reference[16]);
                this.f7977c = new ReferenceQueue();
                break;
        }
    }

    public g(g2.d dVar) {
        this.f7975a = 0;
        this.f7976b = dVar.f6684b;
        this.f7977c = dVar.b("EventRaiser");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(r.f fVar, Function1 function1, O.a aVar) {
        this.f7975a = 6;
        this.f7976b = (M2.p) function1;
        this.f7977c = aVar;
    }

    public g(C1113q c1113q) {
        this.f7975a = 12;
        this.f7976b = c1113q;
        this.f7977c = new LinkedHashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(C1118D c1118d) {
        this(13);
        this.f7975a = 13;
        this.f7977c = c1118d;
    }
}
