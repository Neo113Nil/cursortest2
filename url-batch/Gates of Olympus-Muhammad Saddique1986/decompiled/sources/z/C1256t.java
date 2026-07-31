package z;

import B.C0022x;
import C0.AbstractC0032h;
import C0.AbstractC0037m;
import C0.C0029e;
import C0.C0031g;
import C0.C0036l;
import C0.J;
import I.C0143d;
import I.C0156j0;
import I.W;
import a.AbstractC0235a;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
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
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0294x;
import androidx.lifecycle.EnumC0286o;
import b0.C0352v;
import com.gatesof.olympus.martu.marku.R;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;
import j.AbstractC0520B;
import j.AbstractC0539m;
import j.C0525G;
import j.C0540n;
import j.C0541o;
import j.C0547u;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import k.AbstractC0561a;
import k2.C0572d;
import n.z0;
import r0.C0903Z;
import r0.InterfaceC0885G;
import r0.a0;
import t0.AbstractC0993f;
import t0.AbstractC1000m;
import t0.C1001n;
import t0.E;
import t0.InterfaceC1003p;
import t0.M;
import t0.b0;
import t0.f0;
import t0.s0;
import u0.AbstractC1131w;
import u0.AbstractC1133x;
import u0.C1110l;
import u0.C1112m;
import u0.C1123s;
import u0.J0;
import u0.L;

/* renamed from: z.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1256t implements E0.e, R.n, m1.o, a0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10465d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10466e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10467f;

    public /* synthetic */ C1256t(Object obj, int i3, Object obj2) {
        this.f10465d = i3;
        this.f10466e = obj;
        this.f10467f = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [U.p] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [U.p] */
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
    /* JADX WARN: Type inference failed for: r6v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void l(E e3) {
        M m3 = e3.f8562z;
        int i3 = 0;
        if (m3.f8627c == 5 && !m3.f8629e && !m3.f8628d && !e3.f8537G && e3.E()) {
            U.p pVar = (U.p) e3.f8561y.f2915f;
            if ((pVar.f4492g & 256) != 0) {
                while (pVar != null) {
                    if ((pVar.f4491f & 256) != 0) {
                        AbstractC1000m abstractC1000m = pVar;
                        ?? r6 = 0;
                        while (abstractC1000m != 0) {
                            if (abstractC1000m instanceof InterfaceC1003p) {
                                InterfaceC1003p interfaceC1003p = (InterfaceC1003p) abstractC1000m;
                                interfaceC1003p.c0(AbstractC0993f.r(interfaceC1003p, 256));
                            } else if ((abstractC1000m.f4491f & 256) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                U.p pVar2 = abstractC1000m.f8771r;
                                int i4 = 0;
                                abstractC1000m = abstractC1000m;
                                r6 = r6;
                                while (pVar2 != null) {
                                    if ((pVar2.f4491f & 256) != 0) {
                                        i4++;
                                        r6 = r6;
                                        if (i4 == 1) {
                                            abstractC1000m = pVar2;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new K.d(new U.p[16]);
                                            }
                                            if (abstractC1000m != 0) {
                                                r6.b(abstractC1000m);
                                                abstractC1000m = 0;
                                            }
                                            r6.b(pVar2);
                                        }
                                    }
                                    pVar2 = pVar2.f4494i;
                                    abstractC1000m = abstractC1000m;
                                    r6 = r6;
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC1000m = AbstractC0993f.f(r6);
                        }
                    }
                    if ((pVar.f4492g & 256) == 0) {
                        break;
                    } else {
                        pVar = pVar.f4494i;
                    }
                }
            }
        }
        e3.f8536F = false;
        K.d v3 = e3.v();
        int i5 = v3.f3216f;
        if (i5 > 0) {
            Object[] objArr = v3.f3214d;
            do {
                l((E) objArr[i3]);
                i3++;
            } while (i3 < i5);
        }
    }

    @Override // E0.e
    public int B(int i3) {
        CharSequence charSequence;
        do {
            E0.f fVar = (E0.f) this.f10467f;
            fVar.a(i3);
            i3 = ((BreakIterator) fVar.f1031e).following(i3);
            if (i3 != -1) {
                charSequence = (CharSequence) this.f10466e;
                if (i3 == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i3)));
        return i3;
    }

    @Override // E0.e
    public int D(int i3) {
        do {
            E0.f fVar = (E0.f) this.f10467f;
            fVar.a(i3);
            i3 = ((BreakIterator) fVar.f1031e).preceding(i3);
            if (i3 == -1 || i3 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f10466e).charAt(i3 - 1)));
        return i3;
    }

    @Override // R.n
    public Object a(R.b bVar, Object obj) {
        return ((InterfaceC0426e) this.f10466e).h(bVar, obj);
    }

    @Override // m1.o
    public Object b() {
        return (m1.y) this.f10466e;
    }

    @Override // m1.o
    public boolean c(CharSequence charSequence, int i3, int i4, m1.u uVar) {
        if ((uVar.f6984c & 4) > 0) {
            return true;
        }
        if (((m1.y) this.f10466e) == null) {
            this.f10466e = new m1.y(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((A1.i) this.f10467f).getClass();
        ((m1.y) this.f10466e).setSpan(new m1.v(uVar), i3, i4, 33);
        return true;
    }

    @Override // r0.a0
    public boolean d(Object obj, Object obj2) {
        t.r rVar = (t.r) this.f10466e;
        return f2.j.a(rVar.b(obj), rVar.b(obj2));
    }

    @Override // r0.a0
    public void e(C0903Z c0903z) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f10467f;
        linkedHashMap.clear();
        Iterator it = c0903z.f8147d.iterator();
        while (it.hasNext()) {
            Object b3 = ((t.r) this.f10466e).b(it.next());
            Integer num = (Integer) linkedHashMap.get(b3);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                linkedHashMap.put(b3, Integer.valueOf(intValue + 1));
            }
        }
    }

    public boolean f(long j3) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((C1256t) this.f10467f).f10466e;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i3);
            if (n0.r.a(((n0.u) obj).f7324a, j3)) {
                break;
            }
            i3++;
        }
        n0.u uVar = (n0.u) obj;
        if (uVar != null) {
            return uVar.f7331h;
        }
        return false;
    }

    public void g(E e3) {
        if (e3.D()) {
            ((s0) this.f10466e).add(e3);
        } else {
            z0.o("DepthSortedSet.add called on an unattached node");
            throw null;
        }
    }

    public void h(E e3, boolean z3) {
        C1256t c1256t = (C1256t) this.f10467f;
        C1256t c1256t2 = (C1256t) this.f10466e;
        if (z3) {
            c1256t2.g(e3);
            c1256t.g(e3);
        } else {
            if (((s0) c1256t2.f10466e).contains(e3)) {
                return;
            }
            c1256t.g(e3);
        }
    }

    public I0.z i(List list) {
        I0.i iVar;
        Exception e3;
        I0.i iVar2;
        try {
            int size = list.size();
            int i3 = 0;
            iVar = null;
            while (i3 < size) {
                try {
                    iVar2 = (I0.i) list.get(i3);
                } catch (Exception e4) {
                    e3 = e4;
                }
                try {
                    iVar2.a((I0.j) this.f10467f);
                    i3++;
                    iVar = iVar2;
                } catch (Exception e5) {
                    e3 = e5;
                    iVar = iVar2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((I0.j) this.f10467f).f3065a.b());
                    sb2.append(", composition=");
                    sb2.append(((I0.j) this.f10467f).c());
                    sb2.append(", selection=");
                    I0.j jVar = (I0.j) this.f10467f;
                    sb2.append((Object) J.g(O2.l.J(jVar.f3066b, jVar.f3067c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    S1.l.O0(list, sb, new C0022x(iVar, 10, this), 60);
                    String sb3 = sb.toString();
                    f2.j.e(sb3, "StringBuilder().apply(builderAction).toString()");
                    throw new RuntimeException(sb3, e3);
                }
            }
            I0.j jVar2 = (I0.j) this.f10467f;
            jVar2.getClass();
            C0031g c0031g = new C0031g(jVar2.f3065a.toString(), null, 6);
            I0.j jVar3 = (I0.j) this.f10467f;
            long J3 = O2.l.J(jVar3.f3066b, jVar3.f3067c);
            J j3 = J.f(((I0.z) this.f10466e).f3098b) ? null : new J(J3);
            I0.z zVar = new I0.z(c0031g, j3 != null ? j3.f569a : O2.l.J(J.d(J3), J.e(J3)), ((I0.j) this.f10467f).c());
            this.f10466e = zVar;
            return zVar;
        } catch (Exception e6) {
            iVar = null;
            e3 = e6;
        }
    }

    public boolean j(E e3, boolean z3) {
        boolean contains = ((s0) ((C1256t) this.f10466e).f10466e).contains(e3);
        return z3 ? contains : contains || ((s0) ((C1256t) this.f10467f).f10466e).contains(e3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:381:0x0769, code lost:
    
        if (f2.j.a(r1, java.lang.Boolean.TRUE) == false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x076b, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x07a5, code lost:
    
        if (r1 == false) goto L393;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0bb7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x091e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x09a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x09ea  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0b5d  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0b7a  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0b84  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0ba1  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0ba7  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0b97  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0b80  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0a2d  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0bbe  */
    /* JADX WARN: Type inference failed for: r15v16, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r1v68, types: [u0.m] */
    /* JADX WARN: Type inference failed for: r2v91, types: [S1.u] */
    /* JADX WARN: Type inference failed for: r2v92, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d1.h k(int i3) {
        C1123s c1123s;
        d1.h hVar;
        AccessibilityNodeInfo accessibilityNodeInfo;
        A0.p pVar;
        LinkedHashMap linkedHashMap;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        boolean z3;
        Object obj;
        d1.h hVar2;
        Object obj2;
        A0.a aVar;
        Object obj3;
        A0.a aVar2;
        String p3;
        int i4;
        Object obj4;
        A0.e eVar;
        Object obj5;
        A0.b bVar;
        A0.g gVar;
        A0.g gVar2;
        int i5;
        int i6;
        C1123s c1123s2;
        int i7;
        d1.h hVar3;
        Object obj6;
        boolean z4;
        Object obj7;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ArrayList arrayList;
        ArrayList arrayList2;
        G1.m mVar;
        int i8;
        C0294x e3;
        boolean z9 = true;
        u0.E e4 = (u0.E) this.f10467f;
        C1123s c1123s3 = e4.f9151d;
        C1110l viewTreeOwners = c1123s3.getViewTreeOwners();
        if (((viewTreeOwners == null || (e3 = viewTreeOwners.f9393a.e()) == null) ? null : e3.f5242d) != EnumC0286o.f5226d) {
            ?? obtain = AccessibilityNodeInfo.obtain();
            d1.h hVar4 = new d1.h(obtain);
            AccessibilityNodeInfo accessibilityNodeInfo3 = hVar4.f5672a;
            J0 j02 = (J0) e4.l().f(i3);
            if (j02 != null) {
                A0.p pVar2 = j02.f9202a;
                if (i3 == -1) {
                    ?? parentForAccessibility = c1123s3.getParentForAccessibility();
                    View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                    hVar4.f5673b = -1;
                    obtain.setParent(view);
                } else {
                    A0.p j3 = pVar2.j();
                    Integer valueOf = j3 != null ? Integer.valueOf(j3.f145g) : null;
                    if (valueOf == null) {
                        z0.p("semanticsNode " + i3 + " has null parent");
                        throw null;
                    }
                    int intValue = valueOf.intValue();
                    if (intValue == c1123s3.getSemanticsOwner().a().f145g) {
                        intValue = -1;
                    }
                    hVar4.f5673b = intValue;
                    obtain.setParent(c1123s3, intValue);
                }
                hVar4.f5674c = i3;
                obtain.setSource(c1123s3, i3);
                obtain.setBoundsInScreen(e4.c(j02));
                hVar4.f("android.view.View");
                if (pVar2.f142d.f129d.containsKey(A0.s.f189x)) {
                    hVar4.f("android.widget.EditText");
                }
                A0.v vVar = A0.s.f186u;
                A0.i iVar = pVar2.f142d;
                LinkedHashMap linkedHashMap2 = iVar.f129d;
                if (linkedHashMap2.containsKey(vVar)) {
                    hVar4.f("android.widget.TextView");
                }
                Object obj8 = linkedHashMap2.get(A0.s.f184s);
                if (obj8 == null) {
                    obj8 = null;
                }
                A0.f fVar = (A0.f) obj8;
                if (fVar != null && (pVar2.f143e || A0.p.h(pVar2, true, 4).isEmpty())) {
                    int i9 = fVar.f98a;
                    if (A0.f.a(i9, 4)) {
                        obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", c1123s3.getContext().getResources().getString(R.string.tab));
                    } else if (A0.f.a(i9, 2)) {
                        obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", c1123s3.getContext().getResources().getString(R.string.switch_role));
                    } else {
                        String A3 = L.A(i9);
                        if (!A0.f.a(i9, 5) || pVar2.m() || iVar.f130e) {
                            hVar4.f(A3);
                        }
                    }
                }
                obtain.setPackageName(c1123s3.getContext().getPackageName());
                obtain.setImportantForAccessibility(L.t(pVar2));
                List h3 = A0.p.h(pVar2, true, 4);
                int size = h3.size();
                int i10 = 0;
                while (i10 < size) {
                    A0.p pVar3 = (A0.p) h3.get(i10);
                    int i11 = size;
                    if (e4.l().b(pVar3.f145g)) {
                        if (c1123s3.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(pVar3.f141c) != null) {
                            throw new ClassCastException();
                        }
                        int i12 = pVar3.f145g;
                        if (i12 != -1) {
                            obtain.addChild(c1123s3, i12);
                        }
                    }
                    i10++;
                    z9 = true;
                    size = i11;
                }
                boolean z10 = z9;
                if (i3 == e4.f9161n) {
                    accessibilityNodeInfo3.setAccessibilityFocused(z10);
                    hVar4.a(d1.c.f5662d);
                } else {
                    accessibilityNodeInfo3.setAccessibilityFocused(false);
                    hVar4.a(d1.c.f5661c);
                }
                C0031g o3 = u0.E.o(pVar2);
                if (o3 != null) {
                    c1123s3.getFontFamilyResolver();
                    O0.b density = c1123s3.getDensity();
                    String str = o3.f596a;
                    SpannableString spannableString2 = new SpannableString(str);
                    List list = o3.f597b;
                    if (list != null) {
                        int size2 = list.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            int i14 = size2;
                            C0029e c0029e = (C0029e) list.get(i13);
                            List list2 = list;
                            C0.D d3 = (C0.D) c0029e.f592a;
                            C1123s c1123s4 = c1123s3;
                            d1.h hVar5 = hVar4;
                            AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfo3;
                            long b3 = d3.f525a.b();
                            N0.m mVar2 = d3.f525a;
                            A0.p pVar4 = pVar2;
                            LinkedHashMap linkedHashMap3 = linkedHashMap2;
                            if (!C0352v.c(b3, mVar2.b())) {
                                mVar2 = b3 != 16 ? new N0.c(b3) : N0.l.f3553a;
                            }
                            long b4 = mVar2.b();
                            int i15 = c0029e.f593b;
                            int i16 = c0029e.f594c;
                            AbstractC0508a.S(spannableString2, b4, i15, i16);
                            AbstractC0508a.T(spannableString2, d3.f526b, density, i15, i16);
                            H0.k kVar = d3.f527c;
                            H0.i iVar2 = d3.f528d;
                            if (kVar == null && iVar2 == null) {
                                i8 = 33;
                            } else {
                                if (kVar == null) {
                                    kVar = H0.k.f2597f;
                                }
                                StyleSpan styleSpan = new StyleSpan(l0.c.x(kVar, iVar2 != null ? iVar2.f2594a : 0));
                                i8 = 33;
                                spannableString2.setSpan(styleSpan, i15, i16, 33);
                            }
                            N0.j jVar = d3.f537m;
                            if (jVar != null) {
                                int i17 = jVar.f3551a;
                                if ((i17 | 1) == i17) {
                                    spannableString2.setSpan(new UnderlineSpan(), i15, i16, i8);
                                }
                                if ((i17 | 2) == i17) {
                                    spannableString2.setSpan(new StrikethroughSpan(), i15, i16, i8);
                                }
                            }
                            N0.n nVar = d3.f534j;
                            if (nVar != null) {
                                spannableString2.setSpan(new ScaleXSpan(nVar.f3555a), i15, i16, i8);
                            }
                            J0.b bVar2 = d3.f535k;
                            if (bVar2 != null) {
                                spannableString2.setSpan(L0.a.f3342a.a(bVar2), i15, i16, i8);
                            }
                            long j4 = d3.f536l;
                            if (j4 != 16) {
                                spannableString2.setSpan(new BackgroundColorSpan(b0.M.D(j4)), i15, i16, i8);
                            }
                            i13++;
                            size2 = i14;
                            list = list2;
                            c1123s3 = c1123s4;
                            hVar4 = hVar5;
                            accessibilityNodeInfo3 = accessibilityNodeInfo4;
                            pVar2 = pVar4;
                            linkedHashMap2 = linkedHashMap3;
                        }
                    }
                    c1123s = c1123s3;
                    hVar = hVar4;
                    accessibilityNodeInfo = accessibilityNodeInfo3;
                    pVar = pVar2;
                    linkedHashMap = linkedHashMap2;
                    int length = str.length();
                    ?? r22 = S1.u.f4320d;
                    List list3 = o3.f599d;
                    if (list3 != null) {
                        arrayList = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int i18 = 0; i18 < size3; i18++) {
                            Object obj9 = list3.get(i18);
                            C0029e c0029e2 = (C0029e) obj9;
                            if ((c0029e2.f592a instanceof C0.M) && AbstractC0032h.c(0, length, c0029e2.f593b, c0029e2.f594c)) {
                                arrayList.add(obj9);
                            }
                        }
                    } else {
                        arrayList = r22;
                    }
                    int size4 = arrayList.size();
                    for (int i19 = 0; i19 < size4; i19++) {
                        C0029e c0029e3 = (C0029e) arrayList.get(i19);
                        C0.M m3 = (C0.M) c0029e3.f592a;
                        if (!(m3 instanceof C0.M)) {
                            throw new C1.c();
                        }
                        spannableString2.setSpan(new TtsSpan.VerbatimBuilder(m3.f575a).build(), c0029e3.f593b, c0029e3.f594c, 33);
                    }
                    int length2 = str.length();
                    if (list3 != null) {
                        arrayList2 = new ArrayList(list3.size());
                        int size5 = list3.size();
                        for (int i20 = 0; i20 < size5; i20++) {
                            Object obj10 = list3.get(i20);
                            C0029e c0029e4 = (C0029e) obj10;
                            if ((c0029e4.f592a instanceof C0.L) && AbstractC0032h.c(0, length2, c0029e4.f593b, c0029e4.f594c)) {
                                arrayList2.add(obj10);
                            }
                        }
                    } else {
                        arrayList2 = r22;
                    }
                    int size6 = arrayList2.size();
                    int i21 = 0;
                    while (true) {
                        mVar = e4.f9144G;
                        if (i21 >= size6) {
                            break;
                        }
                        C0029e c0029e5 = (C0029e) arrayList2.get(i21);
                        C0.L l3 = (C0.L) c0029e5.f592a;
                        WeakHashMap weakHashMap = (WeakHashMap) mVar.f2116b;
                        Object obj11 = weakHashMap.get(l3);
                        if (obj11 == null) {
                            obj11 = new URLSpan(l3.f574a);
                            weakHashMap.put(l3, obj11);
                        }
                        spannableString2.setSpan((URLSpan) obj11, c0029e5.f593b, c0029e5.f594c, 33);
                        i21++;
                    }
                    int length3 = str.length();
                    if (list3 != null) {
                        r22 = new ArrayList(list3.size());
                        int size7 = list3.size();
                        for (int i22 = 0; i22 < size7; i22++) {
                            Object obj12 = list3.get(i22);
                            C0029e c0029e6 = (C0029e) obj12;
                            if ((c0029e6.f592a instanceof AbstractC0037m) && AbstractC0032h.c(0, length3, c0029e6.f593b, c0029e6.f594c)) {
                                r22.add(obj12);
                            }
                        }
                    }
                    int size8 = r22.size();
                    for (int i23 = 0; i23 < size8; i23++) {
                        C0029e c0029e7 = (C0029e) r22.get(i23);
                        int i24 = c0029e7.f593b;
                        int i25 = c0029e7.f594c;
                        if (i24 != i25) {
                            Object obj13 = c0029e7.f592a;
                            AbstractC0037m abstractC0037m = (AbstractC0037m) obj13;
                            if (abstractC0037m instanceof C0036l) {
                                abstractC0037m.getClass();
                                f2.j.d(obj13, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                C0036l c0036l = (C0036l) obj13;
                                C0029e c0029e8 = new C0029e(i24, i25, c0036l);
                                WeakHashMap weakHashMap2 = (WeakHashMap) mVar.f2117c;
                                Object obj14 = weakHashMap2.get(c0029e8);
                                if (obj14 == null) {
                                    obj14 = new URLSpan(c0036l.f611a);
                                    weakHashMap2.put(c0029e8, obj14);
                                }
                                spannableString2.setSpan((URLSpan) obj14, i24, i25, 33);
                            } else {
                                WeakHashMap weakHashMap3 = (WeakHashMap) mVar.f2118d;
                                Object obj15 = weakHashMap3.get(c0029e7);
                                if (obj15 == null) {
                                    obj15 = new K0.e(abstractC0037m);
                                    weakHashMap3.put(c0029e7, obj15);
                                }
                                spannableString2.setSpan((ClickableSpan) obj15, i24, i25, 33);
                            }
                        }
                    }
                    spannableString = (SpannableString) u0.E.I(spannableString2);
                } else {
                    c1123s = c1123s3;
                    hVar = hVar4;
                    accessibilityNodeInfo = accessibilityNodeInfo3;
                    pVar = pVar2;
                    linkedHashMap = linkedHashMap2;
                    spannableString = null;
                }
                obtain.setText(spannableString);
                A0.v vVar2 = A0.s.D;
                LinkedHashMap linkedHashMap4 = linkedHashMap;
                if (linkedHashMap4.containsKey(vVar2)) {
                    obtain.setContentInvalid(true);
                    Object obj16 = linkedHashMap4.get(vVar2);
                    if (obj16 == null) {
                        obj16 = null;
                    }
                    obtain.setError((CharSequence) obj16);
                }
                A0.p pVar5 = pVar;
                String n3 = e4.n(pVar5);
                if (Build.VERSION.SDK_INT >= 30) {
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    d1.d.c(accessibilityNodeInfo2, n3);
                } else {
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", n3);
                }
                obtain.setCheckable(u0.E.m(pVar5));
                Object obj17 = linkedHashMap4.get(A0.s.f162B);
                if (obj17 == null) {
                    obj17 = null;
                }
                B0.a aVar3 = (B0.a) obj17;
                if (aVar3 != null) {
                    if (aVar3 == B0.a.f472d) {
                        accessibilityNodeInfo2.setChecked(true);
                    } else if (aVar3 == B0.a.f473e) {
                        accessibilityNodeInfo2.setChecked(false);
                    }
                }
                Object obj18 = linkedHashMap4.get(A0.s.f161A);
                if (obj18 == null) {
                    obj18 = null;
                }
                Boolean bool = (Boolean) obj18;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (fVar == null ? false : A0.f.a(fVar.f98a, 4)) {
                        obtain.setSelected(booleanValue);
                    } else {
                        accessibilityNodeInfo2.setChecked(booleanValue);
                    }
                }
                if (!iVar.f130e || A0.p.h(pVar5, true, 4).isEmpty()) {
                    Object obj19 = linkedHashMap4.get(A0.s.f166a);
                    if (obj19 == null) {
                        obj19 = null;
                    }
                    List list4 = (List) obj19;
                    obtain.setContentDescription(list4 != null ? (String) S1.l.L0(list4) : null);
                }
                Object obj20 = linkedHashMap4.get(A0.s.f185t);
                if (obj20 == null) {
                    obj20 = null;
                }
                String str2 = (String) obj20;
                if (str2 != null) {
                    A0.p pVar6 = pVar5;
                    while (true) {
                        if (pVar6 == null) {
                            z8 = false;
                            break;
                        }
                        A0.v vVar3 = A0.t.f192a;
                        A0.i iVar3 = pVar6.f142d;
                        if (iVar3.f129d.containsKey(vVar3)) {
                            z8 = ((Boolean) iVar3.b(vVar3)).booleanValue();
                            break;
                        }
                        pVar6 = pVar6.j();
                    }
                    if (z8) {
                        obtain.setViewIdResourceName(str2);
                    }
                }
                A0.v vVar4 = A0.s.f166a;
                Object obj21 = linkedHashMap4.get(A0.s.f173h);
                if (obj21 == null) {
                    obj21 = null;
                }
                if (((R1.y) obj21) != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo2.setHeading(true);
                    } else {
                        Bundle extras = accessibilityNodeInfo2.getExtras();
                        if (extras != null) {
                            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)) | 2);
                        }
                    }
                }
                obtain.setPassword(linkedHashMap4.containsKey(A0.s.C));
                obtain.setEditable(linkedHashMap4.containsKey(A0.s.f164F));
                Object obj22 = linkedHashMap4.get(A0.s.f165G);
                if (obj22 == null) {
                    obj22 = null;
                }
                Integer num = (Integer) obj22;
                obtain.setMaxTextLength(num != null ? num.intValue() : -1);
                obtain.setEnabled(L.l(pVar5));
                A0.v vVar5 = A0.s.f176k;
                obtain.setFocusable(linkedHashMap4.containsKey(vVar5));
                if (obtain.isFocusable()) {
                    obtain.setFocused(((Boolean) iVar.b(vVar5)).booleanValue());
                    if (obtain.isFocused()) {
                        accessibilityNodeInfo2.addAction(2);
                    } else {
                        accessibilityNodeInfo2.addAction(1);
                    }
                }
                b0 c2 = pVar5.c();
                if (!(c2 != null ? c2.R0() : false)) {
                    if (!iVar.f129d.containsKey(A0.s.f178m)) {
                        z3 = true;
                        obtain.setVisibleToUser(z3);
                        obj = linkedHashMap4.get(A0.s.f175j);
                        if (obj == null) {
                            obj = null;
                        }
                        if (obj == null) {
                            throw new ClassCastException();
                        }
                        accessibilityNodeInfo2.setClickable(false);
                        Object obj23 = linkedHashMap4.get(A0.h.f104b);
                        if (obj23 == null) {
                            obj23 = null;
                        }
                        A0.a aVar4 = (A0.a) obj23;
                        if (aVar4 != null) {
                            Object obj24 = linkedHashMap4.get(A0.s.f161A);
                            if (obj24 == null) {
                                obj24 = null;
                            }
                            boolean a3 = f2.j.a(obj24, Boolean.TRUE);
                            if (!(fVar == null ? false : A0.f.a(fVar.f98a, 4))) {
                                if (!(fVar == null ? false : A0.f.a(fVar.f98a, 3))) {
                                    z7 = false;
                                    accessibilityNodeInfo2.setClickable(z7 || (z7 && !a3));
                                    if (L.l(pVar5) && obtain.isClickable()) {
                                        d1.c cVar = new d1.c(null, 16, aVar4.f88a, null);
                                        hVar2 = hVar;
                                        hVar2.a(cVar);
                                        accessibilityNodeInfo2.setLongClickable(false);
                                        obj2 = linkedHashMap4.get(A0.h.f105c);
                                        if (obj2 == null) {
                                            obj2 = null;
                                        }
                                        aVar = (A0.a) obj2;
                                        if (aVar != null) {
                                            accessibilityNodeInfo2.setLongClickable(true);
                                            if (L.l(pVar5)) {
                                                hVar2.a(new d1.c(null, 32, aVar.f88a, null));
                                            }
                                        }
                                        obj3 = linkedHashMap4.get(A0.h.f117o);
                                        if (obj3 == null) {
                                            obj3 = null;
                                        }
                                        aVar2 = (A0.a) obj3;
                                        if (aVar2 != null) {
                                            hVar2.a(new d1.c(null, 16384, aVar2.f88a, null));
                                        }
                                        if (L.l(pVar5)) {
                                            Object obj25 = linkedHashMap4.get(A0.h.f111i);
                                            if (obj25 == null) {
                                                obj25 = null;
                                            }
                                            A0.a aVar5 = (A0.a) obj25;
                                            if (aVar5 != null) {
                                                hVar2.a(new d1.c(null, 2097152, aVar5.f88a, null));
                                            }
                                            Object obj26 = linkedHashMap4.get(A0.h.f116n);
                                            if (obj26 == null) {
                                                obj26 = null;
                                            }
                                            A0.a aVar6 = (A0.a) obj26;
                                            if (aVar6 != null) {
                                                hVar2.a(new d1.c(null, android.R.id.accessibilityActionImeEnter, aVar6.f88a, null));
                                            }
                                            Object obj27 = linkedHashMap4.get(A0.h.f118p);
                                            if (obj27 == null) {
                                                obj27 = null;
                                            }
                                            A0.a aVar7 = (A0.a) obj27;
                                            if (aVar7 != null) {
                                                hVar2.a(new d1.c(null, 65536, aVar7.f88a, null));
                                            }
                                            Object obj28 = linkedHashMap4.get(A0.h.f119q);
                                            if (obj28 == null) {
                                                obj28 = null;
                                            }
                                            A0.a aVar8 = (A0.a) obj28;
                                            if (aVar8 != null && obtain.isFocused()) {
                                                ClipDescription primaryClipDescription = c1123s.getClipboardManager().f9370a.getPrimaryClipDescription();
                                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                                    hVar2.a(new d1.c(null, 32768, aVar8.f88a, null));
                                                }
                                            }
                                        }
                                        p3 = u0.E.p(pVar5);
                                        if (!(p3 != null || p3.length() == 0)) {
                                            obtain.setTextSelection(e4.k(pVar5), e4.j(pVar5));
                                            Object obj29 = linkedHashMap4.get(A0.h.f110h);
                                            if (obj29 == null) {
                                                obj29 = null;
                                            }
                                            A0.a aVar9 = (A0.a) obj29;
                                            hVar2.a(new d1.c(null, 131072, aVar9 != null ? aVar9.f88a : null, null));
                                            accessibilityNodeInfo2.addAction(256);
                                            accessibilityNodeInfo2.addAction(512);
                                            accessibilityNodeInfo2.setMovementGranularities(11);
                                            Object obj30 = iVar.f129d.get(A0.s.f166a);
                                            if (obj30 == null) {
                                                obj30 = null;
                                            }
                                            List list5 = (List) obj30;
                                            if (list5 == null || list5.isEmpty()) {
                                                if (iVar.f129d.containsKey(A0.h.f103a)) {
                                                    if (pVar5.f142d.f129d.containsKey(A0.s.f189x)) {
                                                        Object obj31 = pVar5.f142d.f129d.get(A0.s.f176k);
                                                        if (obj31 == null) {
                                                            obj31 = null;
                                                        }
                                                    }
                                                    ?? r12 = C1112m.f9402i;
                                                    E s3 = pVar5.f141c.s();
                                                    while (true) {
                                                        if (s3 == null) {
                                                            s3 = null;
                                                            break;
                                                        }
                                                        if (((Boolean) r12.n(s3)).booleanValue()) {
                                                            break;
                                                        }
                                                        s3 = s3.s();
                                                    }
                                                    if (s3 != null) {
                                                        A0.i o4 = s3.o();
                                                        if (o4 != null) {
                                                            Object obj32 = o4.f129d.get(A0.s.f176k);
                                                            if (obj32 == null) {
                                                                obj32 = null;
                                                            }
                                                            z6 = f2.j.a(obj32, Boolean.TRUE);
                                                        } else {
                                                            z6 = false;
                                                        }
                                                    }
                                                    boolean z11 = false;
                                                    if (!z11) {
                                                        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                                    }
                                                }
                                            }
                                        }
                                        i4 = Build.VERSION.SDK_INT;
                                        if (i4 >= 26) {
                                            ArrayList arrayList3 = new ArrayList();
                                            arrayList3.add("androidx.compose.ui.semantics.id");
                                            CharSequence e5 = hVar2.e();
                                            if (!(e5 == null || e5.length() == 0)) {
                                                if (iVar.f129d.containsKey(A0.h.f103a)) {
                                                    arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                                }
                                            }
                                            if (iVar.f129d.containsKey(A0.s.f185t)) {
                                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (i4 >= 26) {
                                                accessibilityNodeInfo2.setAvailableExtraData(arrayList3);
                                            }
                                        }
                                        obj4 = iVar.f129d.get(A0.s.f168c);
                                        if (obj4 == null) {
                                            obj4 = null;
                                        }
                                        eVar = (A0.e) obj4;
                                        if (eVar != null) {
                                            A0.v vVar6 = A0.h.f109g;
                                            if (iVar.f129d.containsKey(vVar6)) {
                                                hVar2.f("android.widget.SeekBar");
                                            } else {
                                                hVar2.f("android.widget.ProgressBar");
                                            }
                                            if (eVar != A0.e.f95c) {
                                                accessibilityNodeInfo2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(0.0f).floatValue(), Float.valueOf(0.0f).floatValue(), 0.0f));
                                            }
                                            if (iVar.f129d.containsKey(vVar6) && L.l(pVar5)) {
                                                if (0.0f < O2.d.u(Float.valueOf(0.0f).floatValue(), Float.valueOf(0.0f).floatValue())) {
                                                    hVar2.a(d1.c.f5663e);
                                                }
                                                if (0.0f > O2.d.v(Float.valueOf(0.0f).floatValue(), Float.valueOf(0.0f).floatValue())) {
                                                    hVar2.a(d1.c.f5664f);
                                                }
                                            }
                                        }
                                        AbstractC1131w.a(hVar2, pVar5);
                                        obj5 = pVar5.i().f129d.get(A0.s.f171f);
                                        if (obj5 == null) {
                                            obj5 = null;
                                        }
                                        bVar = (A0.b) obj5;
                                        if (bVar != null) {
                                            accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bVar.f90a, bVar.f91b, false, 0));
                                        } else {
                                            ArrayList arrayList4 = new ArrayList();
                                            Object obj33 = pVar5.i().f129d.get(A0.s.f170e);
                                            if (obj33 == null) {
                                                obj33 = null;
                                            }
                                            if (obj33 != null) {
                                                List h4 = A0.p.h(pVar5, true, 4);
                                                int size9 = h4.size();
                                                for (int i26 = 0; i26 < size9; i26++) {
                                                    A0.p pVar7 = (A0.p) h4.get(i26);
                                                    if (pVar7.i().f129d.containsKey(A0.s.f161A)) {
                                                        arrayList4.add(pVar7);
                                                    }
                                                }
                                            }
                                            if (!arrayList4.isEmpty()) {
                                                boolean h5 = n.r.h(arrayList4);
                                                accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(h5 ? 1 : arrayList4.size(), h5 ? arrayList4.size() : 1, false, 0));
                                            }
                                        }
                                        n.r.q(hVar2, pVar5);
                                        gVar = (A0.g) AbstractC0235a.A(iVar, A0.s.f180o);
                                        A0.a aVar10 = (A0.a) AbstractC0235a.A(pVar5.k(), A0.h.f106d);
                                        if (gVar != null && aVar10 != null) {
                                            obj7 = pVar5.i().f129d.get(A0.s.f171f);
                                            if (obj7 == null) {
                                                obj7 = null;
                                            }
                                            if (obj7 == null) {
                                                Object obj34 = pVar5.i().f129d.get(A0.s.f170e);
                                                if (obj34 == null) {
                                                    obj34 = null;
                                                }
                                                if (obj34 == null) {
                                                    z5 = false;
                                                    if (!z5) {
                                                        hVar2.f("android.widget.HorizontalScrollView");
                                                    }
                                                    if (((Number) gVar.a().b()).floatValue() > 0.0f) {
                                                        accessibilityNodeInfo2.setScrollable(true);
                                                    }
                                                    if (L.l(pVar5)) {
                                                        if (u0.E.v(gVar)) {
                                                            hVar2.a(d1.c.f5663e);
                                                            hVar2.a(!L.m(pVar5) ? d1.c.f5668j : d1.c.f5666h);
                                                        }
                                                        if (u0.E.u(gVar)) {
                                                            hVar2.a(d1.c.f5664f);
                                                            hVar2.a(!L.m(pVar5) ? d1.c.f5666h : d1.c.f5668j);
                                                        }
                                                    }
                                                }
                                            }
                                            z5 = true;
                                            if (!z5) {
                                            }
                                            if (((Number) gVar.a().b()).floatValue() > 0.0f) {
                                            }
                                            if (L.l(pVar5)) {
                                            }
                                        }
                                        gVar2 = (A0.g) AbstractC0235a.A(pVar5.k(), A0.s.f181p);
                                        if (gVar2 != null && aVar10 != null) {
                                            obj6 = pVar5.i().f129d.get(A0.s.f171f);
                                            if (obj6 == null) {
                                                obj6 = null;
                                            }
                                            if (obj6 == null) {
                                                Object obj35 = pVar5.i().f129d.get(A0.s.f170e);
                                                if (obj35 == null) {
                                                    obj35 = null;
                                                }
                                                if (obj35 == null) {
                                                    z4 = false;
                                                    if (!z4) {
                                                        hVar2.f("android.widget.ScrollView");
                                                    }
                                                    if (((Number) gVar2.a().b()).floatValue() > 0.0f) {
                                                        accessibilityNodeInfo2.setScrollable(true);
                                                    }
                                                    if (L.l(pVar5)) {
                                                        if (u0.E.v(gVar2)) {
                                                            hVar2.a(d1.c.f5663e);
                                                            hVar2.a(d1.c.f5667i);
                                                        }
                                                        if (u0.E.u(gVar2)) {
                                                            hVar2.a(d1.c.f5664f);
                                                            hVar2.a(d1.c.f5665g);
                                                        }
                                                    }
                                                }
                                            }
                                            z4 = true;
                                            if (!z4) {
                                            }
                                            if (((Number) gVar2.a().b()).floatValue() > 0.0f) {
                                            }
                                            if (L.l(pVar5)) {
                                            }
                                        }
                                        if (i4 >= 29) {
                                            AbstractC1133x.a(hVar2, pVar5);
                                        }
                                        CharSequence charSequence = (CharSequence) AbstractC0235a.A(pVar5.k(), A0.s.f169d);
                                        if (i4 >= 28) {
                                            accessibilityNodeInfo2.setPaneTitle(charSequence);
                                        } else {
                                            accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                        }
                                        if (L.l(pVar5)) {
                                            A0.a aVar11 = (A0.a) AbstractC0235a.A(pVar5.k(), A0.h.f120r);
                                            if (aVar11 != null) {
                                                hVar2.a(new d1.c(aVar11.f88a, 262144));
                                            }
                                            A0.a aVar12 = (A0.a) AbstractC0235a.A(pVar5.k(), A0.h.f121s);
                                            if (aVar12 != null) {
                                                hVar2.a(new d1.c(aVar12.f88a, 524288));
                                            }
                                            A0.a aVar13 = (A0.a) AbstractC0235a.A(pVar5.k(), A0.h.f122t);
                                            if (aVar13 != null) {
                                                hVar2.a(new d1.c(aVar13.f88a, 1048576));
                                            }
                                            A0.i k3 = pVar5.k();
                                            A0.v vVar7 = A0.h.f124v;
                                            if (k3.f129d.containsKey(vVar7)) {
                                                List list6 = (List) pVar5.k().b(vVar7);
                                                int size10 = list6.size();
                                                C0541o c0541o = u0.E.f9139N;
                                                if (size10 >= c0541o.f6301b) {
                                                    throw new IllegalStateException("Can't have more than " + c0541o.f6301b + " custom actions for one widget");
                                                }
                                                C0525G c0525g = new C0525G();
                                                C0547u c0547u = AbstractC0520B.f6252a;
                                                C0547u c0547u2 = new C0547u();
                                                C0525G c0525g2 = e4.f9167t;
                                                if (c0525g2.f6259d) {
                                                    AbstractC0539m.a(c0525g2);
                                                }
                                                i5 = i3;
                                                if (AbstractC0561a.a(c0525g2.f6260e, c0525g2.f6262g, i5) >= 0) {
                                                    C0547u c0547u3 = (C0547u) c0525g2.b(i5);
                                                    C0541o c0541o2 = new C0541o();
                                                    int[] iArr = c0541o.f6300a;
                                                    int i27 = c0541o.f6301b;
                                                    for (int i28 = 0; i28 < i27; i28++) {
                                                        c0541o2.a(iArr[i28]);
                                                    }
                                                    ArrayList arrayList5 = new ArrayList();
                                                    if (list6.size() > 0) {
                                                        A.k.r(list6.get(0));
                                                        f2.j.c(c0547u3);
                                                        throw null;
                                                    }
                                                    if (arrayList5.size() > 0) {
                                                        A.k.r(arrayList5.get(0));
                                                        c0541o2.c(0);
                                                        throw null;
                                                    }
                                                } else if (list6.size() > 0) {
                                                    A.k.r(list6.get(0));
                                                    c0541o.c(0);
                                                    throw null;
                                                }
                                                e4.f9166s.d(i5, c0525g);
                                                c0525g2.d(i5, c0547u2);
                                                boolean r3 = e4.r(pVar5);
                                                if (Build.VERSION.SDK_INT < 28) {
                                                    accessibilityNodeInfo2.setScreenReaderFocusable(r3);
                                                } else {
                                                    Bundle extras2 = accessibilityNodeInfo2.getExtras();
                                                    if (extras2 != null) {
                                                        extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (r3 ? 1 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
                                                    }
                                                }
                                                C0540n c0540n = e4.C;
                                                int c3 = c0540n.c(i5);
                                                i6 = c3 < 0 ? c0540n.f6296c[c3] : -1;
                                                if (i6 == -1) {
                                                    L.y(c1123s.getAndroidViewsHandler$ui_release(), i6);
                                                    c1123s2 = c1123s;
                                                    accessibilityNodeInfo2.setTraversalBefore(c1123s2, i6);
                                                    e4.b(i5, hVar2, e4.f9142E, null);
                                                } else {
                                                    c1123s2 = c1123s;
                                                }
                                                C0540n c0540n2 = e4.D;
                                                int c4 = c0540n2.c(i5);
                                                i7 = c4 < 0 ? c0540n2.f6296c[c4] : -1;
                                                if (i7 != -1) {
                                                    L.y(c1123s2.getAndroidViewsHandler$ui_release(), i7);
                                                }
                                                hVar3 = hVar2;
                                                if (e4.f9163p && i5 == e4.f9161n) {
                                                    e4.f9162o = hVar3;
                                                }
                                                return hVar3;
                                            }
                                        }
                                        i5 = i3;
                                        boolean r32 = e4.r(pVar5);
                                        if (Build.VERSION.SDK_INT < 28) {
                                        }
                                        C0540n c0540n3 = e4.C;
                                        int c32 = c0540n3.c(i5);
                                        if (c32 < 0) {
                                        }
                                        if (i6 == -1) {
                                        }
                                        C0540n c0540n22 = e4.D;
                                        int c42 = c0540n22.c(i5);
                                        if (c42 < 0) {
                                        }
                                        if (i7 != -1) {
                                        }
                                        hVar3 = hVar2;
                                        if (e4.f9163p) {
                                            e4.f9162o = hVar3;
                                        }
                                        return hVar3;
                                    }
                                }
                            }
                            z7 = true;
                            accessibilityNodeInfo2.setClickable(z7 || (z7 && !a3));
                            if (L.l(pVar5)) {
                                d1.c cVar2 = new d1.c(null, 16, aVar4.f88a, null);
                                hVar2 = hVar;
                                hVar2.a(cVar2);
                                accessibilityNodeInfo2.setLongClickable(false);
                                obj2 = linkedHashMap4.get(A0.h.f105c);
                                if (obj2 == null) {
                                }
                                aVar = (A0.a) obj2;
                                if (aVar != null) {
                                }
                                obj3 = linkedHashMap4.get(A0.h.f117o);
                                if (obj3 == null) {
                                }
                                aVar2 = (A0.a) obj3;
                                if (aVar2 != null) {
                                }
                                if (L.l(pVar5)) {
                                }
                                p3 = u0.E.p(pVar5);
                                if (!(p3 != null || p3.length() == 0)) {
                                }
                                i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 26) {
                                }
                                obj4 = iVar.f129d.get(A0.s.f168c);
                                if (obj4 == null) {
                                }
                                eVar = (A0.e) obj4;
                                if (eVar != null) {
                                }
                                AbstractC1131w.a(hVar2, pVar5);
                                obj5 = pVar5.i().f129d.get(A0.s.f171f);
                                if (obj5 == null) {
                                }
                                bVar = (A0.b) obj5;
                                if (bVar != null) {
                                }
                                n.r.q(hVar2, pVar5);
                                gVar = (A0.g) AbstractC0235a.A(iVar, A0.s.f180o);
                                A0.a aVar102 = (A0.a) AbstractC0235a.A(pVar5.k(), A0.h.f106d);
                                if (gVar != null) {
                                    obj7 = pVar5.i().f129d.get(A0.s.f171f);
                                    if (obj7 == null) {
                                    }
                                    if (obj7 == null) {
                                    }
                                    z5 = true;
                                    if (!z5) {
                                    }
                                    if (((Number) gVar.a().b()).floatValue() > 0.0f) {
                                    }
                                    if (L.l(pVar5)) {
                                    }
                                }
                                gVar2 = (A0.g) AbstractC0235a.A(pVar5.k(), A0.s.f181p);
                                if (gVar2 != null) {
                                    obj6 = pVar5.i().f129d.get(A0.s.f171f);
                                    if (obj6 == null) {
                                    }
                                    if (obj6 == null) {
                                    }
                                    z4 = true;
                                    if (!z4) {
                                    }
                                    if (((Number) gVar2.a().b()).floatValue() > 0.0f) {
                                    }
                                    if (L.l(pVar5)) {
                                    }
                                }
                                if (i4 >= 29) {
                                }
                                CharSequence charSequence2 = (CharSequence) AbstractC0235a.A(pVar5.k(), A0.s.f169d);
                                if (i4 >= 28) {
                                }
                                if (L.l(pVar5)) {
                                }
                                i5 = i3;
                                boolean r322 = e4.r(pVar5);
                                if (Build.VERSION.SDK_INT < 28) {
                                }
                                C0540n c0540n32 = e4.C;
                                int c322 = c0540n32.c(i5);
                                if (c322 < 0) {
                                }
                                if (i6 == -1) {
                                }
                                C0540n c0540n222 = e4.D;
                                int c422 = c0540n222.c(i5);
                                if (c422 < 0) {
                                }
                                if (i7 != -1) {
                                }
                                hVar3 = hVar2;
                                if (e4.f9163p) {
                                }
                                return hVar3;
                            }
                        }
                        hVar2 = hVar;
                        accessibilityNodeInfo2.setLongClickable(false);
                        obj2 = linkedHashMap4.get(A0.h.f105c);
                        if (obj2 == null) {
                        }
                        aVar = (A0.a) obj2;
                        if (aVar != null) {
                        }
                        obj3 = linkedHashMap4.get(A0.h.f117o);
                        if (obj3 == null) {
                        }
                        aVar2 = (A0.a) obj3;
                        if (aVar2 != null) {
                        }
                        if (L.l(pVar5)) {
                        }
                        p3 = u0.E.p(pVar5);
                        if (!(p3 != null || p3.length() == 0)) {
                        }
                        i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 26) {
                        }
                        obj4 = iVar.f129d.get(A0.s.f168c);
                        if (obj4 == null) {
                        }
                        eVar = (A0.e) obj4;
                        if (eVar != null) {
                        }
                        AbstractC1131w.a(hVar2, pVar5);
                        obj5 = pVar5.i().f129d.get(A0.s.f171f);
                        if (obj5 == null) {
                        }
                        bVar = (A0.b) obj5;
                        if (bVar != null) {
                        }
                        n.r.q(hVar2, pVar5);
                        gVar = (A0.g) AbstractC0235a.A(iVar, A0.s.f180o);
                        A0.a aVar1022 = (A0.a) AbstractC0235a.A(pVar5.k(), A0.h.f106d);
                        if (gVar != null) {
                        }
                        gVar2 = (A0.g) AbstractC0235a.A(pVar5.k(), A0.s.f181p);
                        if (gVar2 != null) {
                        }
                        if (i4 >= 29) {
                        }
                        CharSequence charSequence22 = (CharSequence) AbstractC0235a.A(pVar5.k(), A0.s.f169d);
                        if (i4 >= 28) {
                        }
                        if (L.l(pVar5)) {
                        }
                        i5 = i3;
                        boolean r3222 = e4.r(pVar5);
                        if (Build.VERSION.SDK_INT < 28) {
                        }
                        C0540n c0540n322 = e4.C;
                        int c3222 = c0540n322.c(i5);
                        if (c3222 < 0) {
                        }
                        if (i6 == -1) {
                        }
                        C0540n c0540n2222 = e4.D;
                        int c4222 = c0540n2222.c(i5);
                        if (c4222 < 0) {
                        }
                        if (i7 != -1) {
                        }
                        hVar3 = hVar2;
                        if (e4.f9163p) {
                        }
                        return hVar3;
                    }
                }
                z3 = false;
                obtain.setVisibleToUser(z3);
                obj = linkedHashMap4.get(A0.s.f175j);
                if (obj == null) {
                }
                if (obj == null) {
                }
            }
        }
        i5 = i3;
        hVar3 = null;
        if (e4.f9163p) {
        }
        return hVar3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R1.f, java.lang.Object] */
    public InputMethodManager m() {
        return (InputMethodManager) this.f10467f.getValue();
    }

    public InterfaceC0885G n() {
        return (InterfaceC0885G) ((C0156j0) this.f10467f).getValue();
    }

    public C0572d o() {
        Matcher matcher = (Matcher) this.f10466e;
        return O2.d.g0(matcher.start(), matcher.end());
    }

    public boolean p() {
        return !(((s0) ((C1256t) this.f10467f).f10466e).isEmpty() && ((s0) ((C1256t) this.f10466e).f10466e).isEmpty());
    }

    public boolean q(E e3) {
        if (e3.D()) {
            return ((s0) this.f10466e).remove(e3);
        }
        z0.o("DepthSortedSet.remove called on an unattached node");
        throw null;
    }

    public String toString() {
        switch (this.f10465d) {
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "Bounds{lower=" + ((X0.c) this.f10466e) + " upper=" + ((X0.c) this.f10467f) + "}";
            case 13:
                return ((s0) this.f10466e).toString();
            default:
                return super.toString();
        }
    }

    @Override // E0.e
    public int v(int i3) {
        do {
            E0.f fVar = (E0.f) this.f10467f;
            fVar.a(i3);
            i3 = ((BreakIterator) fVar.f1031e).preceding(i3);
            if (i3 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f10466e).charAt(i3)));
        return i3;
    }

    @Override // E0.e
    public int w(int i3) {
        do {
            E0.f fVar = (E0.f) this.f10467f;
            fVar.a(i3);
            i3 = ((BreakIterator) fVar.f1031e).following(i3);
            if (i3 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f10466e).charAt(i3 - 1)));
        return i3;
    }

    public C1256t(E e3, InterfaceC0885G interfaceC0885G) {
        this.f10465d = 15;
        this.f10466e = e3;
        this.f10467f = C0143d.K(interfaceC0885G, W.f2783i);
    }

    public C1256t(View view) {
        this.f10465d = 0;
        this.f10466e = view;
        this.f10467f = R1.a.c(R1.g.f4148e, new t0.D(14, this));
    }

    public C1256t(t.r rVar) {
        this.f10465d = 12;
        this.f10466e = rVar;
        this.f10467f = new LinkedHashMap();
    }

    public C1256t(int i3) {
        this.f10465d = i3;
        switch (i3) {
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                this.f10466e = new A1.i(6, false);
                this.f10467f = new G0.b();
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                break;
            case 13:
                this.f10467f = R1.a.c(R1.g.f4148e, C1001n.f8772f);
                this.f10466e = new s0(new f0(1));
                break;
            case 14:
                this.f10466e = new C1256t(13);
                this.f10467f = new C1256t(13);
                break;
            case 17:
                this.f10466e = new K.d(new E[16]);
                break;
            case 18:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f10466e = new d1.j(this);
                    break;
                } else {
                    this.f10466e = new d1.i(this);
                    break;
                }
            case 19:
                this.f10466e = new K.d(new Reference[16]);
                this.f10467f = new ReferenceQueue();
                break;
            default:
                this.f10466e = new LinkedHashMap();
                this.f10467f = new LinkedHashMap();
                break;
        }
    }

    public C1256t(Matcher matcher, String str) {
        this.f10465d = 11;
        f2.j.f(str, "input");
        this.f10466e = matcher;
        this.f10467f = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1256t(u0.E e3) {
        this(18);
        this.f10465d = 18;
        this.f10467f = e3;
    }
}
