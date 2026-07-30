package q5;

import a2.m0;
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
import androidx.lifecycle.x;
import com.android.installreferrer.R;
import d6.z;
import g0.g1;
import g0.t0;
import i.h0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import p1.f0;
import p1.x0;
import p1.y0;
import r1.a1;
import r1.d0;
import r1.e1;
import r1.l0;
import r1.m;
import r1.p;
import r1.r1;
import s0.n;
import s1.c0;
import s1.g2;
import s1.j0;
import s1.l;
import s1.r;
import s1.v;
import s1.w;
import t5.o;
import t5.s;
import y1.q;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements y0, y3.d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7526f;

    /* renamed from: g, reason: collision with root package name */
    public Object f7527g;

    /* renamed from: h, reason: collision with root package name */
    public Object f7528h;

    public /* synthetic */ g(Object obj, int i7, Object obj2) {
        this.f7526f = i7;
        this.f7527g = obj;
        this.f7528h = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [s0.n] */
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
    /* JADX WARN: Type inference failed for: r6v3, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void i(d0 d0Var) {
        l0 l0Var = d0Var.B;
        int i7 = 0;
        if (l0Var.f7833c == 5 && !l0Var.f7835e && !l0Var.f7834d && !d0Var.I && d0Var.F()) {
            n nVar = (n) d0Var.A.f3895f;
            if ((nVar.f8107i & 256) != 0) {
                while (nVar != null) {
                    if ((nVar.f8106h & 256) != 0) {
                        m mVar = nVar;
                        ?? r62 = 0;
                        while (mVar != 0) {
                            if (mVar instanceof p) {
                                p pVar = (p) mVar;
                                pVar.V(r1.f.r(pVar, 256));
                            } else if ((mVar.f8106h & 256) != 0 && (mVar instanceof m)) {
                                n nVar2 = mVar.f7853t;
                                int i8 = 0;
                                mVar = mVar;
                                r62 = r62;
                                while (nVar2 != null) {
                                    if ((nVar2.f8106h & 256) != 0) {
                                        i8++;
                                        r62 = r62;
                                        if (i8 == 1) {
                                            mVar = nVar2;
                                        } else {
                                            if (r62 == 0) {
                                                r62 = new i0.d(new n[16]);
                                            }
                                            if (mVar != 0) {
                                                r62.b(mVar);
                                                mVar = 0;
                                            }
                                            r62.b(nVar2);
                                        }
                                    }
                                    nVar2 = nVar2.f8109k;
                                    mVar = mVar;
                                    r62 = r62;
                                }
                                if (i8 == 1) {
                                }
                            }
                            mVar = r1.f.f(r62);
                        }
                    }
                    if ((nVar.f8107i & 256) == 0) {
                        break;
                    } else {
                        nVar = nVar.f8109k;
                    }
                }
            }
        }
        d0Var.H = false;
        i0.d v5 = d0Var.v();
        int i9 = v5.f4842h;
        if (i9 > 0) {
            Object[] objArr = v5.f4840f;
            do {
                i((d0) objArr[i7]);
                i7++;
            } while (i7 < i9);
        }
    }

    public static void n(s sVar, t5.h hVar) {
        if (!sVar.i()) {
            if (sVar.isEmpty()) {
                throw new IllegalArgumentException("Can't calculate hash on empty node!");
            }
            if (sVar instanceof t5.f) {
                ((t5.f) sVar).g(new t5.g(hVar), true);
                return;
            } else {
                throw new IllegalStateException("Expected children node, but got: " + sVar);
            }
        }
        hVar.c();
        hVar.f8900c = hVar.f8901d;
        hVar.f8898a.append(((o) sVar).f(2));
        hVar.f8902e = true;
        o5.f fVar = hVar.f8905h;
        fVar.getClass();
        if (hVar.f8898a.length() > fVar.f6848f) {
            if (hVar.a(hVar.f8901d).isEmpty() || !hVar.a(hVar.f8901d).y().equals(t5.c.f8888i)) {
                hVar.b();
            }
        }
    }

    @Override // p1.y0
    public boolean a(Object obj, Object obj2) {
        s.p pVar = (s.p) this.f7527g;
        return r6.k.a(pVar.b(obj), pVar.b(obj2));
    }

    @Override // y3.d
    public String b() {
        return (String) this.f7527g;
    }

    @Override // y3.d
    public void c(y3.c cVar) {
        Object[] objArr = (Object[]) this.f7528h;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i7 = 0;
        while (i7 < length) {
            Object obj = objArr[i7];
            i7++;
            if (obj == null) {
                cVar.o(i7);
            } else if (obj instanceof byte[]) {
                cVar.G(i7, (byte[]) obj);
            } else if (obj instanceof Float) {
                cVar.j(((Number) obj).floatValue(), i7);
            } else if (obj instanceof Double) {
                cVar.j(((Number) obj).doubleValue(), i7);
            } else if (obj instanceof Long) {
                cVar.r(((Number) obj).longValue(), i7);
            } else if (obj instanceof Integer) {
                cVar.r(((Number) obj).intValue(), i7);
            } else if (obj instanceof Short) {
                cVar.r(((Number) obj).shortValue(), i7);
            } else if (obj instanceof Byte) {
                cVar.r(((Number) obj).byteValue(), i7);
            } else if (obj instanceof String) {
                cVar.H((String) obj, i7);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i7 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                cVar.r(((Boolean) obj).booleanValue() ? 1L : 0L, i7);
            }
        }
    }

    @Override // p1.y0
    public void d(x0 x0Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7528h;
        linkedHashMap.clear();
        Iterator it = x0Var.f7111f.iterator();
        while (it.hasNext()) {
            Object b9 = ((s.p) this.f7527g).b(it.next());
            Integer num = (Integer) linkedHashMap.get(b9);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                linkedHashMap.put(b9, Integer.valueOf(intValue + 1));
            }
        }
    }

    public void e(d0 d0Var) {
        if (d0Var.E()) {
            ((r1) this.f7528h).add(d0Var);
        } else {
            a.a.M("DepthSortedSet.add called on an unattached node");
            throw null;
        }
    }

    public void f(d0 d0Var, boolean z8) {
        g gVar = (g) this.f7528h;
        g gVar2 = (g) this.f7527g;
        if (z8) {
            gVar2.e(d0Var);
            gVar.e(d0Var);
        } else {
            if (((r1) gVar2.f7528h).contains(d0Var)) {
                return;
            }
            gVar.e(d0Var);
        }
    }

    public boolean g(d0 d0Var, boolean z8) {
        boolean contains = ((r1) ((g) this.f7527g).f7528h).contains(d0Var);
        return z8 ? contains : contains || ((r1) ((g) this.f7528h).f7528h).contains(d0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:383:0x07b0, code lost:
    
        if (r6.k.a(r3, java.lang.Boolean.TRUE) == false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x07f4, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x07f2, code lost:
    
        if (r3 == false) goto L427;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0998 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0a23 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0a4d  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0a94  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0be2  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0bff  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0c0a  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0c31  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0c3d  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0c2d  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0c1d  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0c06  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0be6  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0aa9  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0c44  */
    /* JADX WARN: Type inference failed for: r10v102, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r2v14, types: [e6.u] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c3.i h(int i7) {
        int i8;
        c0 c0Var;
        c3.i iVar;
        r rVar;
        c3.i iVar2;
        h0 h0Var;
        y1.m mVar;
        AccessibilityNodeInfo accessibilityNodeInfo;
        y1.i iVar3;
        y1.i iVar4;
        y1.f fVar;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        y1.f fVar2;
        int i9;
        y1.i iVar5;
        boolean z8;
        Object obj;
        c3.i iVar6;
        Object obj2;
        y1.a aVar;
        Object obj3;
        y1.a aVar2;
        String o2;
        int i10;
        Object obj4;
        y1.e eVar;
        Object obj5;
        y1.b bVar;
        y1.g gVar;
        y1.g gVar2;
        boolean z9;
        int i11;
        r rVar2;
        int i12;
        boolean z10;
        Object obj6;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i13;
        x f9;
        c0 c0Var2 = (c0) this.f7528h;
        r rVar3 = c0Var2.f8160d;
        l viewTreeOwners = rVar3.getViewTreeOwners();
        if (((viewTreeOwners == null || (f9 = viewTreeOwners.f8275a.f()) == null) ? null : f9.f1046d) != androidx.lifecycle.o.f1007f) {
            ?? obtain = AccessibilityNodeInfo.obtain();
            c3.i iVar7 = new c3.i((AccessibilityNodeInfo) obtain);
            g2 g2Var = (g2) c0Var2.l().f(i7);
            if (g2Var != null) {
                y1.m mVar2 = g2Var.f8236a;
                if (i7 == -1) {
                    ?? parentForAccessibility = rVar3.getParentForAccessibility();
                    View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                    iVar7.f1656b = -1;
                    obtain.setParent(view);
                } else {
                    y1.m j8 = mVar2.j();
                    Integer valueOf = j8 != null ? Integer.valueOf(j8.f9843g) : null;
                    if (valueOf == null) {
                        a.a.N("semanticsNode " + i7 + " has null parent");
                        throw null;
                    }
                    int intValue = valueOf.intValue();
                    if (intValue == rVar3.getSemanticsOwner().a().f9843g) {
                        intValue = -1;
                    }
                    iVar7.f1656b = intValue;
                    obtain.setParent(rVar3, intValue);
                }
                iVar7.f1657c = i7;
                obtain.setSource(rVar3, i7);
                obtain.setBoundsInScreen(c0Var2.c(g2Var));
                h0 h0Var2 = c0Var2.f8176t;
                iVar7.f("android.view.View");
                y1.i iVar8 = mVar2.f9840d;
                y1.i iVar9 = mVar2.f9840d;
                LinkedHashMap linkedHashMap = iVar8.f9832f;
                if (linkedHashMap.containsKey(y1.p.f9882x)) {
                    iVar7.f("android.widget.EditText");
                }
                if (linkedHashMap.containsKey(y1.p.f9879u)) {
                    iVar7.f("android.widget.TextView");
                }
                Object obj7 = linkedHashMap.get(y1.p.f9877s);
                if (obj7 == null) {
                    obj7 = null;
                }
                y1.f fVar3 = (y1.f) obj7;
                if (fVar3 != null) {
                    int i14 = fVar3.f9803a;
                    if (mVar2.f9841e || y1.m.h(mVar2, 4).isEmpty()) {
                        if (i14 == 4) {
                            obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", rVar3.getContext().getResources().getString(R.string.tab));
                        } else if (i14 == 2) {
                            obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", rVar3.getContext().getResources().getString(R.string.switch_role));
                        } else {
                            String A = j0.A(i14);
                            if (i14 != 5 || mVar2.m() || iVar8.f9833g) {
                                iVar7.f(A);
                            }
                        }
                    }
                }
                obtain.setPackageName(rVar3.getContext().getPackageName());
                obtain.setImportantForAccessibility(j0.t(mVar2));
                List h3 = y1.m.h(mVar2, 4);
                int size = h3.size();
                int i15 = 0;
                while (i15 < size) {
                    y1.m mVar3 = (y1.m) h3.get(i15);
                    int i16 = size;
                    if (c0Var2.l().b(mVar3.f9843g)) {
                        if (rVar3.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(mVar3.f9839c) != null) {
                            throw new ClassCastException();
                        }
                        int i17 = mVar3.f9843g;
                        if (i17 != -1) {
                            obtain.addChild(rVar3, i17);
                        }
                    }
                    i15++;
                    size = i16;
                }
                int i18 = c0Var2.f8170n;
                AccessibilityNodeInfo accessibilityNodeInfo3 = iVar7.f1655a;
                if (i7 == i18) {
                    accessibilityNodeInfo3.setAccessibilityFocused(true);
                    iVar7.a(c3.c.f1643d);
                } else {
                    accessibilityNodeInfo3.setAccessibilityFocused(false);
                    iVar7.a(c3.c.f1642c);
                }
                Object obj8 = iVar9.f9832f.get(y1.p.f9882x);
                if (obj8 == null) {
                    obj8 = null;
                }
                a2.g gVar3 = (a2.g) obj8;
                Object obj9 = iVar9.f9832f.get(y1.p.f9879u);
                if (obj9 == null) {
                    obj9 = null;
                }
                List list = (List) obj9;
                a2.g gVar4 = list != null ? (a2.g) e6.l.i0(list) : null;
                if (gVar3 == null) {
                    gVar3 = gVar4;
                }
                if (gVar3 != null) {
                    rVar3.getFontFamilyResolver();
                    m2.b density = rVar3.getDensity();
                    b1.b bVar2 = c0Var2.G;
                    String str = gVar3.f373f;
                    rVar = rVar3;
                    List list2 = gVar3.f376i;
                    SpannableString spannableString2 = new SpannableString(str);
                    List list3 = gVar3.f374g;
                    if (list3 != null) {
                        int size2 = list3.size();
                        int i19 = 0;
                        while (i19 < size2) {
                            List list4 = list3;
                            a2.e eVar2 = (a2.e) list3.get(i19);
                            int i20 = i19;
                            a2.d0 d0Var = (a2.d0) eVar2.f363a;
                            int i21 = size2;
                            int i22 = eVar2.f364b;
                            int i23 = eVar2.f365c;
                            h0 h0Var3 = h0Var2;
                            c3.i iVar10 = iVar7;
                            long b9 = d0Var.f347a.b();
                            y1.i iVar11 = iVar8;
                            y1.i iVar12 = iVar9;
                            long j9 = d0Var.f348b;
                            f2.k kVar = d0Var.f349c;
                            f2.i iVar13 = d0Var.f350d;
                            l2.n nVar = d0Var.f356j;
                            y1.f fVar4 = fVar3;
                            h2.b bVar3 = d0Var.f357k;
                            y1.m mVar4 = mVar2;
                            AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfo3;
                            long j10 = d0Var.f358l;
                            l2.j jVar = d0Var.f359m;
                            l2.m mVar5 = d0Var.f347a;
                            c0 c0Var3 = c0Var2;
                            t6.a.Q(spannableString2, (u.c(b9, mVar5.b()) ? mVar5 : b9 != 16 ? new l2.c(b9) : l2.l.f5882a).b(), i22, i23);
                            SpannableString spannableString3 = spannableString2;
                            t6.a.R(spannableString3, j9, density, i22, i23);
                            if (kVar == null && iVar13 == null) {
                                i13 = 33;
                            } else {
                                i13 = 33;
                                spannableString3.setSpan(new StyleSpan(a8.d.G(kVar == null ? f2.k.f3278h : kVar, iVar13 != null ? iVar13.f3275a : 0)), i22, i23, 33);
                            }
                            if (jVar != null) {
                                int i24 = jVar.f5880a;
                                if ((i24 | 1) == i24) {
                                    spannableString3.setSpan(new UnderlineSpan(), i22, i23, i13);
                                }
                                if ((i24 | 2) == i24) {
                                    spannableString3.setSpan(new StrikethroughSpan(), i22, i23, i13);
                                }
                            }
                            if (nVar != null) {
                                spannableString3.setSpan(new ScaleXSpan(nVar.f5884a), i22, i23, i13);
                            }
                            if (bVar3 != null) {
                                spannableString3.setSpan(j2.a.f4992a.a(bVar3), i22, i23, i13);
                            }
                            if (j10 != 16) {
                                spannableString3.setSpan(new BackgroundColorSpan(z0.l0.w(j10)), i22, i23, i13);
                            }
                            i19 = i20 + 1;
                            spannableString2 = spannableString3;
                            c0Var2 = c0Var3;
                            list3 = list4;
                            size2 = i21;
                            h0Var2 = h0Var3;
                            iVar7 = iVar10;
                            iVar8 = iVar11;
                            iVar9 = iVar12;
                            fVar3 = fVar4;
                            mVar2 = mVar4;
                            accessibilityNodeInfo3 = accessibilityNodeInfo4;
                        }
                    }
                    iVar2 = iVar7;
                    h0Var = h0Var2;
                    mVar = mVar2;
                    accessibilityNodeInfo = accessibilityNodeInfo3;
                    iVar3 = iVar8;
                    iVar4 = iVar9;
                    fVar = fVar3;
                    SpannableString spannableString4 = spannableString2;
                    c0Var = c0Var2;
                    int length = str.length();
                    ?? r22 = e6.u.f2826f;
                    if (list2 != null) {
                        arrayList = new ArrayList(list2.size());
                        int size3 = list2.size();
                        for (int i25 = 0; i25 < size3; i25++) {
                            Object obj10 = list2.get(i25);
                            a2.e eVar3 = (a2.e) obj10;
                            if ((eVar3.f363a instanceof m0) && a2.h.c(0, length, eVar3.f364b, eVar3.f365c)) {
                                arrayList.add(obj10);
                            }
                        }
                    } else {
                        arrayList = r22;
                    }
                    int size4 = arrayList.size();
                    for (int i26 = 0; i26 < size4; i26++) {
                        a2.e eVar4 = (a2.e) arrayList.get(i26);
                        m0 m0Var = (m0) eVar4.f363a;
                        int i27 = eVar4.f364b;
                        int i28 = eVar4.f365c;
                        if (!(m0Var instanceof m0)) {
                            throw new b4.c();
                        }
                        spannableString4.setSpan(new TtsSpan.VerbatimBuilder(m0Var.f418a).build(), i27, i28, 33);
                    }
                    int length2 = str.length();
                    if (list2 != null) {
                        arrayList2 = new ArrayList(list2.size());
                        int size5 = list2.size();
                        for (int i29 = 0; i29 < size5; i29++) {
                            Object obj11 = list2.get(i29);
                            a2.e eVar5 = (a2.e) obj11;
                            if ((eVar5.f363a instanceof a2.l0) && a2.h.c(0, length2, eVar5.f364b, eVar5.f365c)) {
                                arrayList2.add(obj11);
                            }
                        }
                    } else {
                        arrayList2 = r22;
                    }
                    int size6 = arrayList2.size();
                    for (int i30 = 0; i30 < size6; i30++) {
                        a2.e eVar6 = (a2.e) arrayList2.get(i30);
                        a2.l0 l0Var = (a2.l0) eVar6.f363a;
                        int i31 = eVar6.f364b;
                        int i32 = eVar6.f365c;
                        WeakHashMap weakHashMap = (WeakHashMap) bVar2.f1230g;
                        Object obj12 = weakHashMap.get(l0Var);
                        if (obj12 == null) {
                            obj12 = new URLSpan(l0Var.f417a);
                            weakHashMap.put(l0Var, obj12);
                        }
                        spannableString4.setSpan((URLSpan) obj12, i31, i32, 33);
                    }
                    int length3 = str.length();
                    if (list2 != null) {
                        r22 = new ArrayList(list2.size());
                        int size7 = list2.size();
                        for (int i33 = 0; i33 < size7; i33++) {
                            Object obj13 = list2.get(i33);
                            a2.e eVar7 = (a2.e) obj13;
                            if ((eVar7.f363a instanceof a2.m) && a2.h.c(0, length3, eVar7.f364b, eVar7.f365c)) {
                                r22.add(obj13);
                            }
                        }
                    }
                    int size8 = r22.size();
                    for (int i34 = 0; i34 < size8; i34++) {
                        a2.e eVar8 = (a2.e) r22.get(i34);
                        int i35 = eVar8.f364b;
                        Object obj14 = eVar8.f363a;
                        int i36 = eVar8.f365c;
                        if (i35 != i36) {
                            a2.m mVar6 = (a2.m) obj14;
                            if (mVar6 instanceof a2.l) {
                                r6.k.d(obj14, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                a2.l lVar = (a2.l) obj14;
                                a2.e eVar9 = new a2.e(i35, i36, lVar);
                                WeakHashMap weakHashMap2 = (WeakHashMap) bVar2.f1231h;
                                Object obj15 = weakHashMap2.get(eVar9);
                                if (obj15 == null) {
                                    obj15 = new URLSpan(lVar.f415a);
                                    weakHashMap2.put(eVar9, obj15);
                                }
                                spannableString4.setSpan((URLSpan) obj15, i35, i36, 33);
                            } else {
                                WeakHashMap weakHashMap3 = (WeakHashMap) bVar2.f1232i;
                                Object obj16 = weakHashMap3.get(eVar8);
                                if (obj16 == null) {
                                    obj16 = new i2.f(mVar6);
                                    weakHashMap3.put(eVar8, obj16);
                                }
                                spannableString4.setSpan((ClickableSpan) obj16, i35, i36, 33);
                            }
                        }
                    }
                    spannableString = (SpannableString) c0.H(spannableString4);
                } else {
                    rVar = rVar3;
                    iVar2 = iVar7;
                    h0Var = h0Var2;
                    mVar = mVar2;
                    accessibilityNodeInfo = accessibilityNodeInfo3;
                    iVar3 = iVar8;
                    iVar4 = iVar9;
                    fVar = fVar3;
                    c0Var = c0Var2;
                    spannableString = null;
                }
                obtain.setText(spannableString);
                y1.s sVar = y1.p.D;
                if (linkedHashMap.containsKey(sVar)) {
                    obtain.setContentInvalid(true);
                    Object obj17 = linkedHashMap.get(sVar);
                    if (obj17 == null) {
                        obj17 = null;
                    }
                    obtain.setError((CharSequence) obj17);
                }
                y1.m mVar7 = mVar;
                String n8 = c0Var.n(mVar7);
                if (Build.VERSION.SDK_INT >= 30) {
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    c3.d.c(accessibilityNodeInfo2, n8);
                } else {
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", n8);
                }
                obtain.setCheckable(c0.m(mVar7));
                Object obj18 = linkedHashMap.get(y1.p.B);
                if (obj18 == null) {
                    obj18 = null;
                }
                z1.a aVar3 = (z1.a) obj18;
                if (aVar3 != null) {
                    if (aVar3 == z1.a.f10064f) {
                        accessibilityNodeInfo2.setChecked(true);
                    } else if (aVar3 == z1.a.f10065g) {
                        accessibilityNodeInfo2.setChecked(false);
                    }
                }
                Object obj19 = linkedHashMap.get(y1.p.A);
                if (obj19 == null) {
                    obj19 = null;
                }
                Boolean bool = (Boolean) obj19;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (fVar == null) {
                        fVar2 = fVar;
                        i9 = 4;
                    } else {
                        fVar2 = fVar;
                        i9 = 4;
                        if (fVar2.f9803a == 4) {
                            obtain.setSelected(booleanValue);
                        }
                    }
                    accessibilityNodeInfo2.setChecked(booleanValue);
                } else {
                    fVar2 = fVar;
                    i9 = 4;
                }
                y1.i iVar14 = iVar3;
                if (!iVar14.f9833g || y1.m.h(mVar7, i9).isEmpty()) {
                    Object obj20 = linkedHashMap.get(y1.p.f9859a);
                    if (obj20 == null) {
                        obj20 = null;
                    }
                    List list5 = (List) obj20;
                    obtain.setContentDescription(list5 != null ? (String) e6.l.i0(list5) : null);
                }
                Object obj21 = linkedHashMap.get(y1.p.f9878t);
                if (obj21 == null) {
                    obj21 = null;
                }
                String str2 = (String) obj21;
                if (str2 != null) {
                    y1.m mVar8 = mVar7;
                    while (true) {
                        if (mVar8 == null) {
                            z14 = false;
                            break;
                        }
                        y1.i iVar15 = mVar8.f9840d;
                        y1.s sVar2 = q.f9885a;
                        if (iVar15.f9832f.containsKey(sVar2)) {
                            z14 = ((Boolean) iVar15.g(sVar2)).booleanValue();
                            break;
                        }
                        mVar8 = mVar8.j();
                    }
                    if (z14) {
                        obtain.setViewIdResourceName(str2);
                    }
                }
                y1.s sVar3 = y1.p.f9859a;
                Object obj22 = linkedHashMap.get(y1.p.f9866h);
                if (obj22 == null) {
                    obj22 = null;
                }
                if (((z) obj22) != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo2.setHeading(true);
                    } else {
                        Bundle extras = accessibilityNodeInfo2.getExtras();
                        if (extras != null) {
                            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)) | 2);
                        }
                    }
                }
                obtain.setPassword(linkedHashMap.containsKey(y1.p.C));
                obtain.setEditable(linkedHashMap.containsKey(y1.p.F));
                Object obj23 = linkedHashMap.get(y1.p.G);
                if (obj23 == null) {
                    obj23 = null;
                }
                Integer num = (Integer) obj23;
                obtain.setMaxTextLength(num != null ? num.intValue() : -1);
                obtain.setEnabled(j0.l(mVar7));
                y1.s sVar4 = y1.p.f9869k;
                obtain.setFocusable(linkedHashMap.containsKey(sVar4));
                if (obtain.isFocusable()) {
                    obtain.setFocused(((Boolean) iVar14.g(sVar4)).booleanValue());
                    if (obtain.isFocused()) {
                        accessibilityNodeInfo2.addAction(2);
                    } else {
                        accessibilityNodeInfo2.addAction(1);
                    }
                }
                a1 c4 = mVar7.c();
                if (c4 != null ? c4.T0() : false) {
                    iVar5 = iVar4;
                } else {
                    iVar5 = iVar4;
                    if (!iVar5.f9832f.containsKey(y1.p.f9871m)) {
                        z8 = true;
                        obtain.setVisibleToUser(z8);
                        obj = linkedHashMap.get(y1.p.f9868j);
                        if (obj == null) {
                            obj = null;
                        }
                        if (obj == null) {
                            throw new ClassCastException();
                        }
                        accessibilityNodeInfo2.setClickable(false);
                        Object obj24 = linkedHashMap.get(y1.h.f9807b);
                        if (obj24 == null) {
                            obj24 = null;
                        }
                        y1.a aVar4 = (y1.a) obj24;
                        if (aVar4 != null) {
                            Object obj25 = linkedHashMap.get(y1.p.A);
                            if (obj25 == null) {
                                obj25 = null;
                            }
                            boolean a3 = r6.k.a(obj25, Boolean.TRUE);
                            if (!(fVar2 != null && fVar2.f9803a == 4)) {
                                if (!(fVar2 != null && fVar2.f9803a == 3)) {
                                    z13 = false;
                                    accessibilityNodeInfo2.setClickable(z13 || (z13 && !a3));
                                    if (j0.l(mVar7) && obtain.isClickable()) {
                                        c3.c cVar = new c3.c(null, 16, aVar4.f9793a, null);
                                        iVar6 = iVar2;
                                        iVar6.a(cVar);
                                        accessibilityNodeInfo2.setLongClickable(false);
                                        obj2 = linkedHashMap.get(y1.h.f9808c);
                                        if (obj2 == null) {
                                            obj2 = null;
                                        }
                                        aVar = (y1.a) obj2;
                                        if (aVar != null) {
                                            accessibilityNodeInfo2.setLongClickable(true);
                                            if (j0.l(mVar7)) {
                                                iVar6.a(new c3.c(null, 32, aVar.f9793a, null));
                                            }
                                        }
                                        obj3 = linkedHashMap.get(y1.h.f9820o);
                                        if (obj3 == null) {
                                            obj3 = null;
                                        }
                                        aVar2 = (y1.a) obj3;
                                        if (aVar2 != null) {
                                            iVar6.a(new c3.c(null, 16384, aVar2.f9793a, null));
                                        }
                                        if (j0.l(mVar7)) {
                                            Object obj26 = linkedHashMap.get(y1.h.f9814i);
                                            if (obj26 == null) {
                                                obj26 = null;
                                            }
                                            y1.a aVar5 = (y1.a) obj26;
                                            if (aVar5 != null) {
                                                iVar6.a(new c3.c(null, 2097152, aVar5.f9793a, null));
                                            }
                                            Object obj27 = iVar5.f9832f.get(y1.h.f9819n);
                                            if (obj27 == null) {
                                                obj27 = null;
                                            }
                                            y1.a aVar6 = (y1.a) obj27;
                                            if (aVar6 != null) {
                                                iVar6.a(new c3.c(null, android.R.id.accessibilityActionImeEnter, aVar6.f9793a, null));
                                            }
                                            Object obj28 = iVar5.f9832f.get(y1.h.f9821p);
                                            if (obj28 == null) {
                                                obj28 = null;
                                            }
                                            y1.a aVar7 = (y1.a) obj28;
                                            if (aVar7 != null) {
                                                iVar6.a(new c3.c(null, 65536, aVar7.f9793a, null));
                                            }
                                            Object obj29 = iVar5.f9832f.get(y1.h.f9822q);
                                            if (obj29 == null) {
                                                obj29 = null;
                                            }
                                            y1.a aVar8 = (y1.a) obj29;
                                            if (aVar8 != null && accessibilityNodeInfo2.isFocused()) {
                                                ClipDescription primaryClipDescription = rVar.getClipboardManager().f8238a.getPrimaryClipDescription();
                                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                                    iVar6.a(new c3.c(null, 32768, aVar8.f9793a, null));
                                                }
                                            }
                                        }
                                        o2 = c0.o(mVar7);
                                        if (!(o2 != null || o2.length() == 0)) {
                                            accessibilityNodeInfo2.setTextSelection(c0Var.k(mVar7), c0Var.j(mVar7));
                                            Object obj30 = iVar5.f9832f.get(y1.h.f9813h);
                                            if (obj30 == null) {
                                                obj30 = null;
                                            }
                                            y1.a aVar9 = (y1.a) obj30;
                                            iVar6.a(new c3.c(null, 131072, aVar9 != null ? aVar9.f9793a : null, null));
                                            accessibilityNodeInfo2.addAction(256);
                                            accessibilityNodeInfo2.addAction(512);
                                            accessibilityNodeInfo2.setMovementGranularities(11);
                                            Object obj31 = iVar5.f9832f.get(y1.p.f9859a);
                                            if (obj31 == null) {
                                                obj31 = null;
                                            }
                                            List list6 = (List) obj31;
                                            if (list6 == null || list6.isEmpty()) {
                                                if (iVar5.f9832f.containsKey(y1.h.f9806a)) {
                                                    if (iVar5.f9832f.containsKey(y1.p.f9882x)) {
                                                        Object obj32 = iVar5.f9832f.get(sVar4);
                                                        if (obj32 == null) {
                                                            obj32 = null;
                                                        }
                                                    }
                                                    d0 s5 = mVar7.f9839c.s();
                                                    while (true) {
                                                        if (s5 == null) {
                                                            s5 = null;
                                                            break;
                                                        }
                                                        y1.i o6 = s5.o();
                                                        if (o6 != null && o6.f9833g) {
                                                            if (o6.f9832f.containsKey(y1.p.f9882x)) {
                                                                break;
                                                            }
                                                        }
                                                        s5 = s5.s();
                                                    }
                                                    if (s5 != null) {
                                                        y1.i o8 = s5.o();
                                                        if (o8 != null) {
                                                            Object obj33 = o8.f9832f.get(y1.p.f9869k);
                                                            if (obj33 == null) {
                                                                obj33 = null;
                                                            }
                                                            z12 = r6.k.a(obj33, Boolean.TRUE);
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    boolean z15 = false;
                                                    if (!z15) {
                                                        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                                    }
                                                }
                                            }
                                        }
                                        i10 = Build.VERSION.SDK_INT;
                                        if (i10 >= 26) {
                                            ArrayList arrayList3 = new ArrayList();
                                            arrayList3.add("androidx.compose.ui.semantics.id");
                                            CharSequence e9 = iVar6.e();
                                            if (!(e9 == null || e9.length() == 0)) {
                                                if (iVar5.f9832f.containsKey(y1.h.f9806a)) {
                                                    arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                                }
                                            }
                                            if (iVar5.f9832f.containsKey(y1.p.f9878t)) {
                                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (i10 >= 26) {
                                                accessibilityNodeInfo2.setAvailableExtraData(arrayList3);
                                            }
                                        }
                                        obj4 = iVar5.f9832f.get(y1.p.f9861c);
                                        if (obj4 == null) {
                                            obj4 = null;
                                        }
                                        eVar = (y1.e) obj4;
                                        if (eVar != null) {
                                            w6.a aVar10 = eVar.f9802b;
                                            float f10 = eVar.f9801a;
                                            y1.s sVar5 = y1.h.f9812g;
                                            if (iVar5.f9832f.containsKey(sVar5)) {
                                                iVar6.f("android.widget.SeekBar");
                                            } else {
                                                iVar6.f("android.widget.ProgressBar");
                                            }
                                            if (eVar != y1.e.f9800c) {
                                                accessibilityNodeInfo2.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new c3.h(AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(aVar10.f9519a).floatValue(), Float.valueOf(aVar10.f9520b).floatValue(), f10)).f1653a);
                                            }
                                            if (iVar5.a(sVar5) && j0.l(mVar7)) {
                                                float floatValue = Float.valueOf(eVar.a().f9520b).floatValue();
                                                float floatValue2 = Float.valueOf(eVar.a().f9519a).floatValue();
                                                if (floatValue < floatValue2) {
                                                    floatValue = floatValue2;
                                                }
                                                if (f10 < floatValue) {
                                                    iVar6.a(c3.c.f1644e);
                                                }
                                                float floatValue3 = Float.valueOf(eVar.a().f9519a).floatValue();
                                                float floatValue4 = Float.valueOf(eVar.a().f9520b).floatValue();
                                                if (floatValue3 > floatValue4) {
                                                    floatValue3 = floatValue4;
                                                }
                                                if (f10 > floatValue3) {
                                                    iVar6.a(c3.c.f1645f);
                                                }
                                            }
                                        }
                                        v.a(iVar6, mVar7);
                                        obj5 = mVar7.i().f9832f.get(y1.p.f9864f);
                                        if (obj5 == null) {
                                            obj5 = null;
                                        }
                                        bVar = (y1.b) obj5;
                                        if (bVar != null) {
                                            accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bVar.f9795a, bVar.f9796b, false, 0));
                                        } else {
                                            ArrayList arrayList4 = new ArrayList();
                                            Object obj34 = mVar7.i().f9832f.get(y1.p.f9863e);
                                            if (obj34 == null) {
                                                obj34 = null;
                                            }
                                            if (obj34 != null) {
                                                List h8 = y1.m.h(mVar7, 4);
                                                int size9 = h8.size();
                                                for (int i37 = 0; i37 < size9; i37++) {
                                                    y1.m mVar9 = (y1.m) h8.get(i37);
                                                    if (mVar9.i().f9832f.containsKey(y1.p.A)) {
                                                        arrayList4.add(mVar9);
                                                    }
                                                }
                                            }
                                            if (!arrayList4.isEmpty()) {
                                                boolean p6 = a8.d.p(arrayList4);
                                                accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(p6 ? 1 : arrayList4.size(), p6 ? arrayList4.size() : 1, false, 0));
                                            }
                                        }
                                        a8.d.Y(iVar6, mVar7);
                                        gVar = (y1.g) v1.g.k(mVar7.k(), y1.p.f9873o);
                                        y1.a aVar11 = (y1.a) v1.g.k(mVar7.k(), y1.h.f9809d);
                                        if (gVar != null && aVar11 != null) {
                                            obj6 = mVar7.i().f9832f.get(y1.p.f9864f);
                                            if (obj6 == null) {
                                                obj6 = null;
                                            }
                                            if (obj6 == null) {
                                                Object obj35 = mVar7.i().f9832f.get(y1.p.f9863e);
                                                if (obj35 == null) {
                                                    obj35 = null;
                                                }
                                                if (obj35 == null) {
                                                    z11 = false;
                                                    if (!z11) {
                                                        iVar6.f("android.widget.HorizontalScrollView");
                                                    }
                                                    if (((Number) gVar.a().a()).floatValue() > 0.0f) {
                                                        accessibilityNodeInfo2.setScrollable(true);
                                                    }
                                                    if (j0.l(mVar7)) {
                                                        if (c0.u(gVar)) {
                                                            iVar6.a(c3.c.f1644e);
                                                            iVar6.a(!j0.m(mVar7) ? c3.c.f1649j : c3.c.f1647h);
                                                        }
                                                        if (c0.t(gVar)) {
                                                            iVar6.a(c3.c.f1645f);
                                                            iVar6.a(!j0.m(mVar7) ? c3.c.f1647h : c3.c.f1649j);
                                                        }
                                                    }
                                                }
                                            }
                                            z11 = true;
                                            if (!z11) {
                                            }
                                            if (((Number) gVar.a().a()).floatValue() > 0.0f) {
                                            }
                                            if (j0.l(mVar7)) {
                                            }
                                        }
                                        gVar2 = (y1.g) v1.g.k(mVar7.k(), y1.p.f9874p);
                                        if (gVar2 != null || aVar11 == null) {
                                            z9 = true;
                                        } else {
                                            Object obj36 = mVar7.i().f9832f.get(y1.p.f9864f);
                                            if (obj36 == null) {
                                                obj36 = null;
                                            }
                                            if (obj36 == null) {
                                                Object obj37 = mVar7.i().f9832f.get(y1.p.f9863e);
                                                if (obj37 == null) {
                                                    obj37 = null;
                                                }
                                                if (obj37 == null) {
                                                    z10 = false;
                                                    if (!z10) {
                                                        iVar6.f("android.widget.ScrollView");
                                                    }
                                                    z9 = true;
                                                    if (((Number) gVar2.a().a()).floatValue() > 0.0f) {
                                                        accessibilityNodeInfo2.setScrollable(true);
                                                    }
                                                    if (j0.l(mVar7)) {
                                                        if (c0.u(gVar2)) {
                                                            iVar6.a(c3.c.f1644e);
                                                            iVar6.a(c3.c.f1648i);
                                                        }
                                                        if (c0.t(gVar2)) {
                                                            iVar6.a(c3.c.f1645f);
                                                            iVar6.a(c3.c.f1646g);
                                                        }
                                                    }
                                                }
                                            }
                                            z10 = true;
                                            if (!z10) {
                                            }
                                            z9 = true;
                                            if (((Number) gVar2.a().a()).floatValue() > 0.0f) {
                                            }
                                            if (j0.l(mVar7)) {
                                            }
                                        }
                                        if (i10 >= 29) {
                                            w.a(iVar6, mVar7);
                                        }
                                        CharSequence charSequence = (CharSequence) v1.g.k(mVar7.k(), y1.p.f9862d);
                                        if (i10 >= 28) {
                                            accessibilityNodeInfo2.setPaneTitle(charSequence);
                                        } else {
                                            accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                        }
                                        if (j0.l(mVar7)) {
                                            y1.a aVar12 = (y1.a) v1.g.k(mVar7.k(), y1.h.f9823r);
                                            if (aVar12 != null) {
                                                iVar6.a(new c3.c(aVar12.a(), 262144));
                                            }
                                            y1.a aVar13 = (y1.a) v1.g.k(mVar7.k(), y1.h.f9824s);
                                            if (aVar13 != null) {
                                                iVar6.a(new c3.c(aVar13.a(), 524288));
                                            }
                                            y1.a aVar14 = (y1.a) v1.g.k(mVar7.k(), y1.h.f9825t);
                                            if (aVar14 != null) {
                                                iVar6.a(new c3.c(aVar14.a(), 1048576));
                                            }
                                            y1.i k8 = mVar7.k();
                                            y1.s sVar6 = y1.h.f9827v;
                                            if (k8.a(sVar6)) {
                                                List list7 = (List) mVar7.k().g(sVar6);
                                                int size10 = list7.size();
                                                i.o oVar = c0.N;
                                                if (size10 >= oVar.f4769b) {
                                                    throw new IllegalStateException("Can't have more than " + oVar.f4769b + " custom actions for one widget");
                                                }
                                                h0 h0Var4 = new h0();
                                                i.u uVar = i.c0.f4730a;
                                                i.u uVar2 = new i.u();
                                                h0 h0Var5 = h0Var;
                                                if (h0Var5.f4746f) {
                                                    i.m.a(h0Var5);
                                                }
                                                i8 = i7;
                                                if (j.a.a(h0Var5.f4747g, h0Var5.f4749i, i8) < 0) {
                                                    z9 = false;
                                                }
                                                if (z9) {
                                                    i.u uVar3 = (i.u) h0Var5.b(i8);
                                                    i.o oVar2 = new i.o();
                                                    int[] iArr = oVar.f4768a;
                                                    int i38 = oVar.f4769b;
                                                    for (int i39 = 0; i39 < i38; i39++) {
                                                        oVar2.a(iArr[i39]);
                                                    }
                                                    ArrayList arrayList5 = new ArrayList();
                                                    if (list7.size() > 0) {
                                                        r6.i.e(list7.get(0));
                                                        r6.k.c(uVar3);
                                                        throw null;
                                                    }
                                                    if (arrayList5.size() > 0) {
                                                        r6.i.e(arrayList5.get(0));
                                                        oVar2.c(0);
                                                        throw null;
                                                    }
                                                } else if (list7.size() > 0) {
                                                    r6.i.e(list7.get(0));
                                                    oVar.c(0);
                                                    throw null;
                                                }
                                                c0Var.f8175s.d(i8, h0Var4);
                                                h0Var5.d(i8, uVar2);
                                                boolean q8 = c0Var.q(mVar7);
                                                if (Build.VERSION.SDK_INT < 28) {
                                                    accessibilityNodeInfo2.setScreenReaderFocusable(q8);
                                                } else {
                                                    Bundle extras2 = accessibilityNodeInfo2.getExtras();
                                                    if (extras2 != null) {
                                                        extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (q8 ? 1 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
                                                    }
                                                }
                                                i.n nVar2 = c0Var.C;
                                                int c6 = nVar2.c(i8);
                                                i11 = c6 < 0 ? nVar2.f4764c[c6] : -1;
                                                if (i11 == -1) {
                                                    j0.y(rVar.getAndroidViewsHandler$ui_release(), i11);
                                                    rVar2 = rVar;
                                                    accessibilityNodeInfo2.setTraversalBefore(rVar2, i11);
                                                    c0Var.b(i8, iVar6, c0Var.E, null);
                                                } else {
                                                    rVar2 = rVar;
                                                }
                                                i.n nVar3 = c0Var.D;
                                                int c9 = nVar3.c(i8);
                                                i12 = c9 < 0 ? nVar3.f4764c[c9] : -1;
                                                if (i12 != -1) {
                                                    j0.y(rVar2.getAndroidViewsHandler$ui_release(), i12);
                                                }
                                                iVar = iVar6;
                                                if (c0Var.f8172p && i8 == c0Var.f8170n) {
                                                    c0Var.f8171o = iVar;
                                                }
                                                return iVar;
                                            }
                                        }
                                        i8 = i7;
                                        boolean q82 = c0Var.q(mVar7);
                                        if (Build.VERSION.SDK_INT < 28) {
                                        }
                                        i.n nVar22 = c0Var.C;
                                        int c62 = nVar22.c(i8);
                                        if (c62 < 0) {
                                        }
                                        if (i11 == -1) {
                                        }
                                        i.n nVar32 = c0Var.D;
                                        int c92 = nVar32.c(i8);
                                        if (c92 < 0) {
                                        }
                                        if (i12 != -1) {
                                        }
                                        iVar = iVar6;
                                        if (c0Var.f8172p) {
                                            c0Var.f8171o = iVar;
                                        }
                                        return iVar;
                                    }
                                }
                            }
                            z13 = true;
                            accessibilityNodeInfo2.setClickable(z13 || (z13 && !a3));
                            if (j0.l(mVar7)) {
                                c3.c cVar2 = new c3.c(null, 16, aVar4.f9793a, null);
                                iVar6 = iVar2;
                                iVar6.a(cVar2);
                                accessibilityNodeInfo2.setLongClickable(false);
                                obj2 = linkedHashMap.get(y1.h.f9808c);
                                if (obj2 == null) {
                                }
                                aVar = (y1.a) obj2;
                                if (aVar != null) {
                                }
                                obj3 = linkedHashMap.get(y1.h.f9820o);
                                if (obj3 == null) {
                                }
                                aVar2 = (y1.a) obj3;
                                if (aVar2 != null) {
                                }
                                if (j0.l(mVar7)) {
                                }
                                o2 = c0.o(mVar7);
                                if (!(o2 != null || o2.length() == 0)) {
                                }
                                i10 = Build.VERSION.SDK_INT;
                                if (i10 >= 26) {
                                }
                                obj4 = iVar5.f9832f.get(y1.p.f9861c);
                                if (obj4 == null) {
                                }
                                eVar = (y1.e) obj4;
                                if (eVar != null) {
                                }
                                v.a(iVar6, mVar7);
                                obj5 = mVar7.i().f9832f.get(y1.p.f9864f);
                                if (obj5 == null) {
                                }
                                bVar = (y1.b) obj5;
                                if (bVar != null) {
                                }
                                a8.d.Y(iVar6, mVar7);
                                gVar = (y1.g) v1.g.k(mVar7.k(), y1.p.f9873o);
                                y1.a aVar112 = (y1.a) v1.g.k(mVar7.k(), y1.h.f9809d);
                                if (gVar != null) {
                                    obj6 = mVar7.i().f9832f.get(y1.p.f9864f);
                                    if (obj6 == null) {
                                    }
                                    if (obj6 == null) {
                                    }
                                    z11 = true;
                                    if (!z11) {
                                    }
                                    if (((Number) gVar.a().a()).floatValue() > 0.0f) {
                                    }
                                    if (j0.l(mVar7)) {
                                    }
                                }
                                gVar2 = (y1.g) v1.g.k(mVar7.k(), y1.p.f9874p);
                                if (gVar2 != null) {
                                }
                                z9 = true;
                                if (i10 >= 29) {
                                }
                                CharSequence charSequence2 = (CharSequence) v1.g.k(mVar7.k(), y1.p.f9862d);
                                if (i10 >= 28) {
                                }
                                if (j0.l(mVar7)) {
                                }
                                i8 = i7;
                                boolean q822 = c0Var.q(mVar7);
                                if (Build.VERSION.SDK_INT < 28) {
                                }
                                i.n nVar222 = c0Var.C;
                                int c622 = nVar222.c(i8);
                                if (c622 < 0) {
                                }
                                if (i11 == -1) {
                                }
                                i.n nVar322 = c0Var.D;
                                int c922 = nVar322.c(i8);
                                if (c922 < 0) {
                                }
                                if (i12 != -1) {
                                }
                                iVar = iVar6;
                                if (c0Var.f8172p) {
                                }
                                return iVar;
                            }
                        }
                        iVar6 = iVar2;
                        accessibilityNodeInfo2.setLongClickable(false);
                        obj2 = linkedHashMap.get(y1.h.f9808c);
                        if (obj2 == null) {
                        }
                        aVar = (y1.a) obj2;
                        if (aVar != null) {
                        }
                        obj3 = linkedHashMap.get(y1.h.f9820o);
                        if (obj3 == null) {
                        }
                        aVar2 = (y1.a) obj3;
                        if (aVar2 != null) {
                        }
                        if (j0.l(mVar7)) {
                        }
                        o2 = c0.o(mVar7);
                        if (!(o2 != null || o2.length() == 0)) {
                        }
                        i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 26) {
                        }
                        obj4 = iVar5.f9832f.get(y1.p.f9861c);
                        if (obj4 == null) {
                        }
                        eVar = (y1.e) obj4;
                        if (eVar != null) {
                        }
                        v.a(iVar6, mVar7);
                        obj5 = mVar7.i().f9832f.get(y1.p.f9864f);
                        if (obj5 == null) {
                        }
                        bVar = (y1.b) obj5;
                        if (bVar != null) {
                        }
                        a8.d.Y(iVar6, mVar7);
                        gVar = (y1.g) v1.g.k(mVar7.k(), y1.p.f9873o);
                        y1.a aVar1122 = (y1.a) v1.g.k(mVar7.k(), y1.h.f9809d);
                        if (gVar != null) {
                        }
                        gVar2 = (y1.g) v1.g.k(mVar7.k(), y1.p.f9874p);
                        if (gVar2 != null) {
                        }
                        z9 = true;
                        if (i10 >= 29) {
                        }
                        CharSequence charSequence22 = (CharSequence) v1.g.k(mVar7.k(), y1.p.f9862d);
                        if (i10 >= 28) {
                        }
                        if (j0.l(mVar7)) {
                        }
                        i8 = i7;
                        boolean q8222 = c0Var.q(mVar7);
                        if (Build.VERSION.SDK_INT < 28) {
                        }
                        i.n nVar2222 = c0Var.C;
                        int c6222 = nVar2222.c(i8);
                        if (c6222 < 0) {
                        }
                        if (i11 == -1) {
                        }
                        i.n nVar3222 = c0Var.D;
                        int c9222 = nVar3222.c(i8);
                        if (c9222 < 0) {
                        }
                        if (i12 != -1) {
                        }
                        iVar = iVar6;
                        if (c0Var.f8172p) {
                        }
                        return iVar;
                    }
                }
                z8 = false;
                obtain.setVisibleToUser(z8);
                obj = linkedHashMap.get(y1.p.f9868j);
                if (obj == null) {
                }
                if (obj == null) {
                }
            }
        }
        i8 = i7;
        c0Var = c0Var2;
        iVar = null;
        if (c0Var.f8172p) {
        }
        return iVar;
    }

    public s j() {
        a aVar = (a) this.f7528h;
        if (aVar.f7514b) {
            return aVar.f7513a.f8910f;
        }
        return null;
    }

    public f0 k() {
        return (f0) ((g1) this.f7528h).getValue();
    }

    public w6.d l() {
        Matcher matcher = (Matcher) this.f7527g;
        return v1.g.o(matcher.start(), matcher.end());
    }

    public boolean m() {
        return !(((r1) ((g) this.f7528h).f7528h).isEmpty() && ((r1) ((g) this.f7527g).f7528h).isEmpty());
    }

    public boolean o(d0 d0Var) {
        if (d0Var.E()) {
            return ((r1) this.f7528h).remove(d0Var);
        }
        a.a.M("DepthSortedSet.remove called on an unattached node");
        throw null;
    }

    public g p(t5.m mVar, boolean z8, boolean z9) {
        return new g(new a(mVar, z8, z9), 1, (a) this.f7528h);
    }

    public String toString() {
        switch (this.f7526f) {
            case 2:
                return ((r1) this.f7528h).toString();
            default:
                return super.toString();
        }
    }

    public g(String str, Object[] objArr) {
        this.f7526f = 15;
        r6.k.f(str, "query");
        this.f7527g = str;
        this.f7528h = objArr;
    }

    public g(d0 d0Var, f0 f0Var) {
        this.f7526f = 4;
        this.f7527g = d0Var;
        this.f7528h = g0.d.J(f0Var, t0.f3903k);
    }

    public g(int i7) {
        this.f7526f = i7;
        switch (i7) {
            case 3:
                this.f7527g = new g(2);
                this.f7528h = new g(2);
                break;
            case 4:
            case 5:
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                this.f7527g = d6.a.c(d6.h.f2616g, r1.n.f7859h);
                this.f7528h = new r1(new e1(1));
                break;
            case 6:
                this.f7527g = new i0.d(new d0[16]);
                break;
            case 8:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f7527g = new c3.k(this);
                    break;
                } else {
                    this.f7527g = new c3.j(this);
                    break;
                }
            case q.c.f7259c /* 9 */:
                this.f7527g = new i0.d(new Reference[16]);
                this.f7528h = new ReferenceQueue();
                break;
            case q.c.f7261e /* 10 */:
                break;
        }
    }

    public g(List list, List list2) {
        this.f7526f = 11;
        if (list.size() == list2.size() - 1) {
            this.f7527g = list;
            this.f7528h = list2;
            return;
        }
        throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
    }

    public g(l5.d dVar) {
        this.f7526f = 0;
        this.f7527g = dVar.f6013b;
        this.f7528h = dVar.a("EventRaiser");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(String str) {
        this(str, (Object[]) null);
        this.f7526f = 15;
        r6.k.f(str, "query");
    }

    public g(s.p pVar) {
        this.f7526f = 7;
        this.f7527g = pVar;
        this.f7528h = new LinkedHashMap();
    }

    public g(Matcher matcher, CharSequence charSequence) {
        this.f7526f = 16;
        r6.k.f(charSequence, "input");
        this.f7527g = matcher;
        this.f7528h = charSequence;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(c0 c0Var) {
        this(8);
        this.f7526f = 8;
        this.f7528h = c0Var;
    }
}
