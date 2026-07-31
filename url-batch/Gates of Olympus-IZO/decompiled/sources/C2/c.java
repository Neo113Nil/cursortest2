package C2;

import B0.AbstractC0008e;
import B0.C0005b;
import B0.C0007d;
import B0.E;
import D1.C0014b;
import H2.AbstractC0080b;
import L0.j;
import L1.z;
import R.n;
import U.k;
import Y1.e;
import Z1.i;
import a.AbstractC0157a;
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
import androidx.lifecycle.C0238x;
import androidx.lifecycle.EnumC0230o;
import b0.AbstractC0259J;
import b0.C0288u;
import b1.AbstractC0297d;
import b1.C0296c;
import b1.h;
import com.gates.olympus.miruv.R;
import e2.AbstractC0381e;
import f.AbstractC0382a;
import h.AbstractC0416e;
import h1.C0438i;
import j.AbstractC0476B;
import j.AbstractC0495m;
import j.C0481G;
import j.C0496n;
import j.C0497o;
import j.C0503u;
import j1.o;
import j1.t;
import j1.u;
import j1.w;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import k.AbstractC0522a;
import n0.l;
import n0.p;
import r0.S;
import r0.T;
import t0.AbstractC0898f;
import t0.AbstractC0905m;
import t0.C0906n;
import t0.D;
import t0.InterfaceC0908p;
import t0.L;
import t0.a0;
import t0.e0;
import t0.r0;
import u.C0951t;
import u0.AbstractC1005x;
import u0.AbstractC1007y;
import u0.C0959F;
import u0.C0982l;
import u0.C0984m;
import u0.C0997t;
import u0.C1010z0;
import v1.d;
import z0.C1076a;
import z0.f;
import z0.g;
import z0.q;
import z0.r;

/* loaded from: classes.dex */
public final class c implements n, o, T, d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f483d;

    /* renamed from: e, reason: collision with root package name */
    public Object f484e;

    /* renamed from: f, reason: collision with root package name */
    public Object f485f;

    public /* synthetic */ c(Object obj, int i3, Object obj2) {
        this.f483d = i3;
        this.f484e = obj;
        this.f485f = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [U.k] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [U.k] */
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
    public static void m(D d3) {
        L l3 = d3.f7736y;
        int i3 = 0;
        if (l3.f7799c == 5 && !l3.f7801e && !l3.f7800d && !d3.f7713F && d3.C()) {
            k kVar = (k) d3.f7735x.f2356f;
            if ((kVar.f3306g & 256) != 0) {
                while (kVar != null) {
                    if ((kVar.f3305f & 256) != 0) {
                        AbstractC0905m abstractC0905m = kVar;
                        ?? r6 = 0;
                        while (abstractC0905m != 0) {
                            if (abstractC0905m instanceof InterfaceC0908p) {
                                InterfaceC0908p interfaceC0908p = (InterfaceC0908p) abstractC0905m;
                                interfaceC0908p.b0(AbstractC0898f.r(interfaceC0908p, 256));
                            } else if ((abstractC0905m.f3305f & 256) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                k kVar2 = abstractC0905m.f7937r;
                                int i4 = 0;
                                abstractC0905m = abstractC0905m;
                                r6 = r6;
                                while (kVar2 != null) {
                                    if ((kVar2.f3305f & 256) != 0) {
                                        i4++;
                                        r6 = r6;
                                        if (i4 == 1) {
                                            abstractC0905m = kVar2;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new K.d(new k[16]);
                                            }
                                            if (abstractC0905m != 0) {
                                                r6.b(abstractC0905m);
                                                abstractC0905m = 0;
                                            }
                                            r6.b(kVar2);
                                        }
                                    }
                                    kVar2 = kVar2.f3308i;
                                    abstractC0905m = abstractC0905m;
                                    r6 = r6;
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC0905m = AbstractC0898f.f(r6);
                        }
                    }
                    if ((kVar.f3306g & 256) == 0) {
                        break;
                    } else {
                        kVar = kVar.f3308i;
                    }
                }
            }
        }
        d3.f7712E = false;
        K.d t3 = d3.t();
        int i5 = t3.f2642f;
        if (i5 > 0) {
            Object[] objArr = t3.f2640d;
            do {
                m((D) objArr[i3]);
                i3++;
            } while (i3 < i5);
        }
    }

    @Override // j1.o
    public Object a() {
        return (w) this.f484e;
    }

    @Override // j1.o
    public boolean b(CharSequence charSequence, int i3, int i4, t tVar) {
        if ((tVar.f5291c & 4) > 0) {
            return true;
        }
        if (((w) this.f484e) == null) {
            this.f484e = new w(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((F0.a) this.f485f).getClass();
        ((w) this.f484e).setSpan(new u(tVar), i3, i4, 33);
        return true;
    }

    @Override // R.n
    public Object c(R.b bVar, Object obj) {
        return ((e) this.f484e).g(bVar, obj);
    }

    @Override // r0.T
    public boolean d(Object obj, Object obj2) {
        C0951t c0951t = (C0951t) this.f484e;
        return i.a(c0951t.b(obj), c0951t.b(obj2));
    }

    @Override // v1.d
    public void e(v1.c cVar) {
        Object[] objArr = (Object[]) this.f485f;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i3 = 0;
        while (i3 < length) {
            Object obj = objArr[i3];
            i3++;
            if (obj == null) {
                cVar.B(i3);
            } else if (obj instanceof byte[]) {
                cVar.A(i3, (byte[]) obj);
            } else if (obj instanceof Float) {
                cVar.t(((Number) obj).floatValue(), i3);
            } else if (obj instanceof Double) {
                cVar.t(((Number) obj).doubleValue(), i3);
            } else if (obj instanceof Long) {
                cVar.J(((Number) obj).longValue(), i3);
            } else if (obj instanceof Integer) {
                cVar.J(((Number) obj).intValue(), i3);
            } else if (obj instanceof Short) {
                cVar.J(((Number) obj).shortValue(), i3);
            } else if (obj instanceof Byte) {
                cVar.J(((Number) obj).byteValue(), i3);
            } else if (obj instanceof String) {
                cVar.C((String) obj, i3);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i3 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                cVar.J(((Boolean) obj).booleanValue() ? 1L : 0L, i3);
            }
        }
    }

    @Override // r0.T
    public void f(S s3) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f485f;
        linkedHashMap.clear();
        Iterator it = s3.f7135d.iterator();
        while (it.hasNext()) {
            Object b2 = ((C0951t) this.f484e).b(it.next());
            Integer num = (Integer) linkedHashMap.get(b2);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                linkedHashMap.put(b2, Integer.valueOf(intValue + 1));
            }
        }
    }

    public boolean g(long j3) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((c) this.f485f).f484e;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i3);
            if (l.a(((p) obj).f6240a, j3)) {
                break;
            }
            i3++;
        }
        p pVar = (p) obj;
        if (pVar != null) {
            return pVar.f6247h;
        }
        return false;
    }

    @Override // v1.d
    public String h() {
        return (String) this.f484e;
    }

    public void i(D d3) {
        if (d3.B()) {
            ((r0) this.f485f).add(d3);
        } else {
            AbstractC0381e.N("DepthSortedSet.add called on an unattached node");
            throw null;
        }
    }

    public void j(D d3, boolean z3) {
        c cVar = (c) this.f485f;
        c cVar2 = (c) this.f484e;
        if (z3) {
            cVar2.i(d3);
            cVar.i(d3);
        } else {
            if (((r0) cVar2.f485f).contains(d3)) {
                return;
            }
            cVar.i(d3);
        }
    }

    public boolean k(D d3, boolean z3) {
        boolean contains = ((r0) ((c) this.f484e).f485f).contains(d3);
        return z3 ? contains : contains || ((r0) ((c) this.f485f).f485f).contains(d3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:380:0x0776, code lost:
    
        if (Z1.i.a(r0, java.lang.Boolean.TRUE) == false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0778, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x07b2, code lost:
    
        if (r0 == false) goto L399;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0bfd  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0965 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x09f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0a1a  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0a5f  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0ba2  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0bbf  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0be7  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0bed  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0bc6  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0c04  */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h l(int i3) {
        f fVar;
        C0997t c0997t;
        h hVar;
        AccessibilityNodeInfo accessibilityNodeInfo;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        f fVar2;
        boolean z3;
        Object obj;
        h hVar2;
        Object obj2;
        C1076a c1076a;
        Object obj3;
        C1076a c1076a2;
        String p;
        int i4;
        z0.e eVar;
        Object obj4;
        z0.b bVar;
        g gVar;
        g gVar2;
        int i5;
        int c3;
        int i6;
        int i7;
        C0997t c0997t2;
        int c4;
        int i8;
        int i9;
        h hVar3;
        Object obj5;
        boolean z4;
        Object obj6;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        M1.u uVar;
        M1.u uVar2;
        ?? r12;
        C0014b c0014b;
        ?? r13;
        M1.u uVar3;
        int i10;
        C0238x e3;
        boolean z9 = true;
        C0959F c0959f = (C0959F) this.f485f;
        C0997t c0997t3 = c0959f.f8136d;
        C0982l viewTreeOwners = c0997t3.getViewTreeOwners();
        if (((viewTreeOwners == null || (e3 = viewTreeOwners.f8360a.e()) == null) ? null : e3.f4041d) != EnumC0230o.f4025d) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            h hVar4 = new h(obtain);
            AccessibilityNodeInfo accessibilityNodeInfo3 = hVar4.f4317a;
            C1010z0 c1010z0 = (C1010z0) c0959f.l().f(i3);
            if (c1010z0 != null) {
                z0.n nVar = c1010z0.f8507a;
                if (i3 == -1) {
                    Object parentForAccessibility = c0997t3.getParentForAccessibility();
                    View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                    hVar4.f4318b = -1;
                    obtain.setParent(view);
                } else {
                    z0.n j3 = nVar.j();
                    Integer valueOf = j3 != null ? Integer.valueOf(j3.f8994g) : null;
                    if (valueOf == null) {
                        AbstractC0381e.O("semanticsNode " + i3 + " has null parent");
                        throw null;
                    }
                    int intValue = valueOf.intValue();
                    if (intValue == c0997t3.getSemanticsOwner().a().f8994g) {
                        intValue = -1;
                    }
                    hVar4.f4318b = intValue;
                    obtain.setParent(c0997t3, intValue);
                }
                hVar4.f4319c = i3;
                obtain.setSource(c0997t3, i3);
                obtain.setBoundsInScreen(c0959f.c(c1010z0));
                hVar4.f("android.view.View");
                if (nVar.f8991d.f8982d.containsKey(q.f9031w)) {
                    hVar4.f("android.widget.EditText");
                }
                z0.t tVar = q.f9028t;
                z0.i iVar = nVar.f8991d;
                LinkedHashMap linkedHashMap = iVar.f8982d;
                if (linkedHashMap.containsKey(tVar)) {
                    hVar4.f("android.widget.TextView");
                }
                Object obj7 = linkedHashMap.get(q.f9026r);
                if (obj7 == null) {
                    obj7 = null;
                }
                f fVar3 = (f) obj7;
                if (fVar3 != null && (nVar.f8992e || z0.n.h(nVar, true, 4).isEmpty())) {
                    int i11 = fVar3.f8953a;
                    if (f.a(i11, 4)) {
                        obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", c0997t3.getContext().getResources().getString(R.string.tab));
                    } else if (f.a(i11, 2)) {
                        obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", c0997t3.getContext().getResources().getString(R.string.switch_role));
                    } else {
                        String w3 = u0.L.w(i11);
                        if (!f.a(i11, 5) || nVar.m() || iVar.f8983e) {
                            hVar4.f(w3);
                        }
                    }
                }
                obtain.setPackageName(c0997t3.getContext().getPackageName());
                obtain.setImportantForAccessibility(u0.L.p(nVar));
                List h3 = z0.n.h(nVar, true, 4);
                int size = h3.size();
                int i12 = 0;
                while (i12 < size) {
                    z0.n nVar2 = (z0.n) h3.get(i12);
                    int i13 = size;
                    if (c0959f.l().b(nVar2.f8994g)) {
                        if (c0997t3.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(nVar2.f8990c) != null) {
                            throw new ClassCastException();
                        }
                        int i14 = nVar2.f8994g;
                        if (i14 != -1) {
                            obtain.addChild(c0997t3, i14);
                        }
                    }
                    i12++;
                    z9 = true;
                    size = i13;
                }
                boolean z10 = z9;
                if (i3 == c0959f.f8146n) {
                    accessibilityNodeInfo3.setAccessibilityFocused(z10);
                    hVar4.a(C0296c.f4307d);
                } else {
                    accessibilityNodeInfo3.setAccessibilityFocused(false);
                    hVar4.a(C0296c.f4306c);
                }
                C0007d o3 = C0959F.o(nVar);
                if (o3 != null) {
                    c0997t3.getFontFamilyResolver();
                    M0.b density = c0997t3.getDensity();
                    String str = o3.f251a;
                    SpannableString spannableString2 = new SpannableString(str);
                    List list = o3.f252b;
                    if (list != null) {
                        int size2 = list.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            int i16 = size2;
                            C0005b c0005b = (C0005b) list.get(i15);
                            List list2 = list;
                            B0.w wVar = (B0.w) c0005b.f246a;
                            C0997t c0997t4 = c0997t3;
                            h hVar5 = hVar4;
                            AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfo3;
                            long b2 = wVar.f365a.b();
                            j jVar = wVar.f365a;
                            f fVar4 = fVar3;
                            C0007d c0007d = o3;
                            if (!C0288u.c(b2, jVar.b())) {
                                jVar = b2 != 16 ? new L0.c(b2) : L0.i.f2686a;
                            }
                            long b3 = jVar.b();
                            int i17 = c0005b.f247b;
                            int i18 = c0005b.f248c;
                            AbstractC0157a.S(spannableString2, b3, i17, i18);
                            AbstractC0157a.U(spannableString2, wVar.f366b, density, i17, i18);
                            F0.l lVar = wVar.f367c;
                            F0.j jVar2 = wVar.f368d;
                            if (lVar == null && jVar2 == null) {
                                i10 = 33;
                            } else {
                                if (lVar == null) {
                                    lVar = F0.l.f1454f;
                                }
                                StyleSpan styleSpan = new StyleSpan(I2.l.B(lVar, jVar2 != null ? jVar2.f1451a : 0));
                                i10 = 33;
                                spannableString2.setSpan(styleSpan, i17, i18, 33);
                            }
                            L0.g gVar3 = wVar.f377m;
                            if (gVar3 != null) {
                                int i19 = gVar3.f2684a;
                                if ((i19 | 1) == i19) {
                                    spannableString2.setSpan(new UnderlineSpan(), i17, i18, i10);
                                }
                                if ((i19 | 2) == i19) {
                                    spannableString2.setSpan(new StrikethroughSpan(), i17, i18, i10);
                                }
                            }
                            L0.k kVar = wVar.f374j;
                            if (kVar != null) {
                                spannableString2.setSpan(new ScaleXSpan(kVar.f2688a), i17, i18, i10);
                            }
                            H0.b bVar2 = wVar.f375k;
                            if (bVar2 != null) {
                                spannableString2.setSpan(J0.a.f2579a.a(bVar2), i17, i18, i10);
                            }
                            long j4 = wVar.f376l;
                            if (j4 != 16) {
                                spannableString2.setSpan(new BackgroundColorSpan(AbstractC0259J.E(j4)), i17, i18, i10);
                            }
                            i15++;
                            size2 = i16;
                            list = list2;
                            c0997t3 = c0997t4;
                            hVar4 = hVar5;
                            accessibilityNodeInfo3 = accessibilityNodeInfo4;
                            fVar3 = fVar4;
                            o3 = c0007d;
                        }
                    }
                    fVar = fVar3;
                    c0997t = c0997t3;
                    hVar = hVar4;
                    accessibilityNodeInfo = accessibilityNodeInfo3;
                    int length = str.length();
                    M1.u uVar4 = M1.u.f2803d;
                    List list3 = o3.f254d;
                    if (list3 != null) {
                        ?? arrayList = new ArrayList(list3.size());
                        int size3 = list3.size();
                        int i20 = 0;
                        while (i20 < size3) {
                            Object obj8 = list3.get(i20);
                            C0005b c0005b2 = (C0005b) obj8;
                            if (c0005b2.f246a instanceof E) {
                                uVar3 = uVar4;
                                if (AbstractC0008e.b(0, length, c0005b2.f247b, c0005b2.f248c)) {
                                    arrayList.add(obj8);
                                }
                            } else {
                                uVar3 = uVar4;
                            }
                            i20++;
                            uVar4 = uVar3;
                        }
                        uVar = uVar4;
                        uVar2 = arrayList;
                    } else {
                        uVar = uVar4;
                        uVar2 = uVar;
                    }
                    int size4 = uVar2.size();
                    for (int i21 = 0; i21 < size4; i21++) {
                        C0005b c0005b3 = (C0005b) uVar2.get(i21);
                        E e4 = (E) c0005b3.f246a;
                        if (!(e4 instanceof E)) {
                            throw new L1.f();
                        }
                        spannableString2.setSpan(new TtsSpan.VerbatimBuilder(e4.f239a).build(), c0005b3.f247b, c0005b3.f248c, 33);
                    }
                    int length2 = str.length();
                    if (list3 != null) {
                        r12 = new ArrayList(list3.size());
                        int size5 = list3.size();
                        for (int i22 = 0; i22 < size5; i22++) {
                            Object obj9 = list3.get(i22);
                            C0005b c0005b4 = (C0005b) obj9;
                            if ((c0005b4.f246a instanceof B0.D) && AbstractC0008e.b(0, length2, c0005b4.f247b, c0005b4.f248c)) {
                                r12.add(obj9);
                            }
                        }
                    } else {
                        r12 = uVar;
                    }
                    int size6 = r12.size();
                    int i23 = 0;
                    while (true) {
                        c0014b = c0959f.f8129G;
                        if (i23 >= size6) {
                            break;
                        }
                        C0005b c0005b5 = (C0005b) r12.get(i23);
                        B0.D d3 = (B0.D) c0005b5.f246a;
                        WeakHashMap weakHashMap = (WeakHashMap) c0014b.f536b;
                        Object obj10 = weakHashMap.get(d3);
                        if (obj10 == null) {
                            obj10 = new URLSpan(d3.f238a);
                            weakHashMap.put(d3, obj10);
                        }
                        spannableString2.setSpan((URLSpan) obj10, c0005b5.f247b, c0005b5.f248c, 33);
                        i23++;
                    }
                    int length3 = str.length();
                    if (list3 != null) {
                        r13 = new ArrayList(list3.size());
                        int size7 = list3.size();
                        for (int i24 = 0; i24 < size7; i24++) {
                            Object obj11 = list3.get(i24);
                            C0005b c0005b6 = (C0005b) obj11;
                            if ((c0005b6.f246a instanceof B0.i) && AbstractC0008e.b(0, length3, c0005b6.f247b, c0005b6.f248c)) {
                                r13.add(obj11);
                            }
                        }
                    } else {
                        r13 = uVar;
                    }
                    int size8 = r13.size();
                    for (int i25 = 0; i25 < size8; i25++) {
                        C0005b c0005b7 = (C0005b) r13.get(i25);
                        int i26 = c0005b7.f247b;
                        int i27 = c0005b7.f248c;
                        if (i26 != i27) {
                            Object obj12 = c0005b7.f246a;
                            B0.i iVar2 = (B0.i) obj12;
                            if (iVar2 instanceof B0.h) {
                                iVar2.getClass();
                                i.d(obj12, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                B0.h hVar6 = (B0.h) obj12;
                                C0005b c0005b8 = new C0005b(hVar6, i26, i27);
                                WeakHashMap weakHashMap2 = (WeakHashMap) c0014b.f537c;
                                Object obj13 = weakHashMap2.get(c0005b8);
                                if (obj13 == null) {
                                    obj13 = new URLSpan(hVar6.f266a);
                                    weakHashMap2.put(c0005b8, obj13);
                                }
                                spannableString2.setSpan((URLSpan) obj13, i26, i27, 33);
                            } else {
                                WeakHashMap weakHashMap3 = (WeakHashMap) c0014b.f538d;
                                Object obj14 = weakHashMap3.get(c0005b7);
                                if (obj14 == null) {
                                    obj14 = new I0.f(iVar2);
                                    weakHashMap3.put(c0005b7, obj14);
                                }
                                spannableString2.setSpan((ClickableSpan) obj14, i26, i27, 33);
                            }
                        }
                    }
                    spannableString = (SpannableString) C0959F.I(spannableString2);
                } else {
                    fVar = fVar3;
                    c0997t = c0997t3;
                    hVar = hVar4;
                    accessibilityNodeInfo = accessibilityNodeInfo3;
                    spannableString = null;
                }
                obtain.setText(spannableString);
                z0.t tVar2 = q.B;
                if (linkedHashMap.containsKey(tVar2)) {
                    obtain.setContentInvalid(true);
                    Object obj15 = linkedHashMap.get(tVar2);
                    if (obj15 == null) {
                        obj15 = null;
                    }
                    obtain.setError((CharSequence) obj15);
                }
                String n3 = c0959f.n(nVar);
                if (Build.VERSION.SDK_INT >= 30) {
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    AbstractC0297d.c(accessibilityNodeInfo2, n3);
                } else {
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", n3);
                }
                obtain.setCheckable(C0959F.m(nVar));
                Object obj16 = linkedHashMap.get(q.f9034z);
                if (obj16 == null) {
                    obj16 = null;
                }
                A0.a aVar = (A0.a) obj16;
                if (aVar != null) {
                    if (aVar == A0.a.f8d) {
                        accessibilityNodeInfo2.setChecked(true);
                    } else if (aVar == A0.a.f9e) {
                        accessibilityNodeInfo2.setChecked(false);
                    }
                }
                Object obj17 = linkedHashMap.get(q.f9033y);
                if (obj17 == null) {
                    obj17 = null;
                }
                Boolean bool = (Boolean) obj17;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    fVar2 = fVar;
                    if (fVar == null ? false : f.a(fVar2.f8953a, 4)) {
                        obtain.setSelected(booleanValue);
                    } else {
                        accessibilityNodeInfo2.setChecked(booleanValue);
                    }
                } else {
                    fVar2 = fVar;
                }
                if (!iVar.f8983e || z0.n.h(nVar, true, 4).isEmpty()) {
                    Object obj18 = linkedHashMap.get(q.f9010a);
                    if (obj18 == null) {
                        obj18 = null;
                    }
                    List list4 = (List) obj18;
                    obtain.setContentDescription(list4 != null ? (String) M1.l.n0(list4) : null);
                }
                Object obj19 = linkedHashMap.get(q.f9027s);
                if (obj19 == null) {
                    obj19 = null;
                }
                String str2 = (String) obj19;
                if (str2 != null) {
                    z0.n nVar3 = nVar;
                    while (true) {
                        if (nVar3 == null) {
                            z8 = false;
                            break;
                        }
                        z0.t tVar3 = r.f9035a;
                        z0.i iVar3 = nVar3.f8991d;
                        if (iVar3.f8982d.containsKey(tVar3)) {
                            z8 = ((Boolean) iVar3.c(tVar3)).booleanValue();
                            break;
                        }
                        nVar3 = nVar3.j();
                    }
                    if (z8) {
                        obtain.setViewIdResourceName(str2);
                    }
                }
                z0.t tVar4 = q.f9010a;
                Object obj20 = linkedHashMap.get(q.f9017h);
                if (obj20 == null) {
                    obj20 = null;
                }
                if (((z) obj20) != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo2.setHeading(true);
                    } else {
                        Bundle extras = accessibilityNodeInfo2.getExtras();
                        if (extras != null) {
                            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)) | 2);
                        }
                    }
                }
                obtain.setPassword(linkedHashMap.containsKey(q.f9008A));
                obtain.setEditable(linkedHashMap.containsKey(q.D));
                Object obj21 = linkedHashMap.get(q.f9009E);
                if (obj21 == null) {
                    obj21 = null;
                }
                Integer num = (Integer) obj21;
                obtain.setMaxTextLength(num != null ? num.intValue() : -1);
                obtain.setEnabled(u0.L.h(nVar));
                z0.t tVar5 = q.f9020k;
                obtain.setFocusable(linkedHashMap.containsKey(tVar5));
                if (obtain.isFocusable()) {
                    obtain.setFocused(((Boolean) iVar.c(tVar5)).booleanValue());
                    if (obtain.isFocused()) {
                        accessibilityNodeInfo2.addAction(2);
                    } else {
                        accessibilityNodeInfo2.addAction(1);
                    }
                }
                a0 c5 = nVar.c();
                if (!(c5 != null ? c5.I0() : false)) {
                    if (!iVar.f8982d.containsKey(q.f9022m)) {
                        z3 = true;
                        obtain.setVisibleToUser(z3);
                        obj = linkedHashMap.get(q.f9019j);
                        if (obj == null) {
                            obj = null;
                        }
                        if (obj == null) {
                            throw new ClassCastException();
                        }
                        accessibilityNodeInfo2.setClickable(false);
                        Object obj22 = linkedHashMap.get(z0.h.f8958b);
                        if (obj22 == null) {
                            obj22 = null;
                        }
                        C1076a c1076a3 = (C1076a) obj22;
                        if (c1076a3 != null) {
                            Object obj23 = linkedHashMap.get(q.f9033y);
                            if (obj23 == null) {
                                obj23 = null;
                            }
                            boolean a3 = i.a(obj23, Boolean.TRUE);
                            if (!(fVar2 == null ? false : f.a(fVar2.f8953a, 4))) {
                                if (!(fVar2 == null ? false : f.a(fVar2.f8953a, 3))) {
                                    z7 = false;
                                    accessibilityNodeInfo2.setClickable(z7 || (z7 && !a3));
                                    if (u0.L.h(nVar) && obtain.isClickable()) {
                                        C0296c c0296c = new C0296c(null, 16, c1076a3.f8942a, null);
                                        hVar2 = hVar;
                                        hVar2.a(c0296c);
                                        accessibilityNodeInfo2.setLongClickable(false);
                                        obj2 = linkedHashMap.get(z0.h.f8959c);
                                        if (obj2 == null) {
                                            obj2 = null;
                                        }
                                        c1076a = (C1076a) obj2;
                                        if (c1076a != null) {
                                            accessibilityNodeInfo2.setLongClickable(true);
                                            if (u0.L.h(nVar)) {
                                                hVar2.a(new C0296c(null, 32, c1076a.f8942a, null));
                                            }
                                        }
                                        obj3 = linkedHashMap.get(z0.h.f8970n);
                                        if (obj3 == null) {
                                            obj3 = null;
                                        }
                                        c1076a2 = (C1076a) obj3;
                                        if (c1076a2 != null) {
                                            hVar2.a(new C0296c(null, 16384, c1076a2.f8942a, null));
                                        }
                                        if (u0.L.h(nVar)) {
                                            Object obj24 = linkedHashMap.get(z0.h.f8965i);
                                            if (obj24 == null) {
                                                obj24 = null;
                                            }
                                            C1076a c1076a4 = (C1076a) obj24;
                                            if (c1076a4 != null) {
                                                hVar2.a(new C0296c(null, 2097152, c1076a4.f8942a, null));
                                            }
                                            Object obj25 = linkedHashMap.get(z0.h.f8969m);
                                            if (obj25 == null) {
                                                obj25 = null;
                                            }
                                            C1076a c1076a5 = (C1076a) obj25;
                                            if (c1076a5 != null) {
                                                hVar2.a(new C0296c(null, android.R.id.accessibilityActionImeEnter, c1076a5.f8942a, null));
                                            }
                                            Object obj26 = linkedHashMap.get(z0.h.f8971o);
                                            if (obj26 == null) {
                                                obj26 = null;
                                            }
                                            C1076a c1076a6 = (C1076a) obj26;
                                            if (c1076a6 != null) {
                                                hVar2.a(new C0296c(null, 65536, c1076a6.f8942a, null));
                                            }
                                            Object obj27 = linkedHashMap.get(z0.h.p);
                                            if (obj27 == null) {
                                                obj27 = null;
                                            }
                                            C1076a c1076a7 = (C1076a) obj27;
                                            if (c1076a7 != null && obtain.isFocused()) {
                                                ClipDescription primaryClipDescription = c0997t.getClipboardManager().f8329a.getPrimaryClipDescription();
                                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                                    hVar2.a(new C0296c(null, 32768, c1076a7.f8942a, null));
                                                }
                                            }
                                        }
                                        p = C0959F.p(nVar);
                                        if (!(p != null || p.length() == 0)) {
                                            obtain.setTextSelection(c0959f.k(nVar), c0959f.j(nVar));
                                            Object obj28 = linkedHashMap.get(z0.h.f8964h);
                                            if (obj28 == null) {
                                                obj28 = null;
                                            }
                                            C1076a c1076a8 = (C1076a) obj28;
                                            hVar2.a(new C0296c(null, 131072, c1076a8 != null ? c1076a8.f8942a : null, null));
                                            accessibilityNodeInfo2.addAction(256);
                                            accessibilityNodeInfo2.addAction(512);
                                            accessibilityNodeInfo2.setMovementGranularities(11);
                                            Object obj29 = iVar.f8982d.get(q.f9010a);
                                            if (obj29 == null) {
                                                obj29 = null;
                                            }
                                            List list5 = (List) obj29;
                                            if (list5 == null || list5.isEmpty()) {
                                                if (iVar.f8982d.containsKey(z0.h.f8957a)) {
                                                    if (iVar.f8982d.containsKey(q.f9031w)) {
                                                        Object obj30 = iVar.f8982d.get(tVar5);
                                                        if (obj30 == null) {
                                                            obj30 = null;
                                                        }
                                                    }
                                                    C0984m c0984m = C0984m.f8366i;
                                                    D q2 = nVar.f8990c.q();
                                                    while (true) {
                                                        if (q2 == null) {
                                                            q2 = null;
                                                            break;
                                                        }
                                                        if (((Boolean) c0984m.j(q2)).booleanValue()) {
                                                            break;
                                                        }
                                                        q2 = q2.q();
                                                    }
                                                    if (q2 != null) {
                                                        z0.i n4 = q2.n();
                                                        if (n4 != null) {
                                                            Object obj31 = n4.f8982d.get(q.f9020k);
                                                            if (obj31 == null) {
                                                                obj31 = null;
                                                            }
                                                            z6 = i.a(obj31, Boolean.TRUE);
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
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add("androidx.compose.ui.semantics.id");
                                            CharSequence e5 = hVar2.e();
                                            if (!(e5 == null || e5.length() == 0)) {
                                                if (iVar.f8982d.containsKey(z0.h.f8957a)) {
                                                    arrayList2.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                                }
                                            }
                                            if (iVar.f8982d.containsKey(q.f9027s)) {
                                                arrayList2.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                accessibilityNodeInfo2.setAvailableExtraData(arrayList2);
                                            }
                                        }
                                        eVar = (z0.e) AbstractC0416e.u(iVar, q.f9012c);
                                        if (eVar != null) {
                                            z0.i k3 = nVar.k();
                                            z0.t tVar6 = z0.h.f8963g;
                                            if (k3.b(tVar6)) {
                                                hVar2.f("android.widget.SeekBar");
                                            } else {
                                                hVar2.f("android.widget.ProgressBar");
                                            }
                                            z0.e eVar2 = z0.e.f8949d;
                                            z0.e eVar3 = z0.e.f8949d;
                                            float f3 = eVar.f8950a;
                                            if (eVar != eVar3) {
                                                accessibilityNodeInfo2.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new A2.g(19, AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(eVar.a().f4766a).floatValue(), Float.valueOf(eVar.a().f4767b).floatValue(), f3)).f83b);
                                            }
                                            if (nVar.k().b(tVar6) && u0.L.h(nVar)) {
                                                if (f3 < AbstractC0381e.n(Float.valueOf(eVar.a().f4767b).floatValue(), Float.valueOf(eVar.a().f4766a).floatValue())) {
                                                    hVar2.a(C0296c.f4308e);
                                                }
                                                if (f3 > AbstractC0381e.o(Float.valueOf(eVar.a().f4766a).floatValue(), Float.valueOf(eVar.a().f4767b).floatValue())) {
                                                    hVar2.a(C0296c.f4309f);
                                                }
                                            }
                                        }
                                        AbstractC1005x.a(hVar2, nVar);
                                        obj4 = nVar.i().f8982d.get(q.f9015f);
                                        if (obj4 == null) {
                                            obj4 = null;
                                        }
                                        bVar = (z0.b) obj4;
                                        if (bVar != null) {
                                            accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bVar.f8944a, bVar.f8945b, false, 0));
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            Object obj32 = nVar.i().f8982d.get(q.f9014e);
                                            if (obj32 == null) {
                                                obj32 = null;
                                            }
                                            if (obj32 != null) {
                                                List h4 = z0.n.h(nVar, true, 4);
                                                int size9 = h4.size();
                                                for (int i28 = 0; i28 < size9; i28++) {
                                                    z0.n nVar4 = (z0.n) h4.get(i28);
                                                    if (nVar4.i().f8982d.containsKey(q.f9033y)) {
                                                        arrayList3.add(nVar4);
                                                    }
                                                }
                                            }
                                            if (!arrayList3.isEmpty()) {
                                                boolean d4 = AbstractC0382a.d(arrayList3);
                                                accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(d4 ? 1 : arrayList3.size(), d4 ? arrayList3.size() : 1, false, 0));
                                            }
                                        }
                                        AbstractC0382a.x(hVar2, nVar);
                                        gVar = (g) AbstractC0416e.u(nVar.k(), q.f9024o);
                                        C1076a c1076a9 = (C1076a) AbstractC0416e.u(nVar.k(), z0.h.f8960d);
                                        if (gVar != null && c1076a9 != null) {
                                            obj6 = nVar.i().f8982d.get(q.f9015f);
                                            if (obj6 == null) {
                                                obj6 = null;
                                            }
                                            if (obj6 == null) {
                                                Object obj33 = nVar.i().f8982d.get(q.f9014e);
                                                if (obj33 == null) {
                                                    obj33 = null;
                                                }
                                                if (obj33 == null) {
                                                    z5 = false;
                                                    if (!z5) {
                                                        hVar2.f("android.widget.HorizontalScrollView");
                                                    }
                                                    if (((Number) gVar.a().b()).floatValue() > 0.0f) {
                                                        accessibilityNodeInfo2.setScrollable(true);
                                                    }
                                                    if (u0.L.h(nVar)) {
                                                        if (C0959F.v(gVar)) {
                                                            hVar2.a(C0296c.f4308e);
                                                            hVar2.a(!u0.L.i(nVar) ? C0296c.f4313j : C0296c.f4311h);
                                                        }
                                                        if (C0959F.u(gVar)) {
                                                            hVar2.a(C0296c.f4309f);
                                                            hVar2.a(!u0.L.i(nVar) ? C0296c.f4311h : C0296c.f4313j);
                                                        }
                                                    }
                                                }
                                            }
                                            z5 = true;
                                            if (!z5) {
                                            }
                                            if (((Number) gVar.a().b()).floatValue() > 0.0f) {
                                            }
                                            if (u0.L.h(nVar)) {
                                            }
                                        }
                                        gVar2 = (g) AbstractC0416e.u(nVar.k(), q.p);
                                        if (gVar2 != null && c1076a9 != null) {
                                            obj5 = nVar.i().f8982d.get(q.f9015f);
                                            if (obj5 == null) {
                                                obj5 = null;
                                            }
                                            if (obj5 == null) {
                                                Object obj34 = nVar.i().f8982d.get(q.f9014e);
                                                if (obj34 == null) {
                                                    obj34 = null;
                                                }
                                                if (obj34 == null) {
                                                    z4 = false;
                                                    if (!z4) {
                                                        hVar2.f("android.widget.ScrollView");
                                                    }
                                                    if (((Number) gVar2.a().b()).floatValue() > 0.0f) {
                                                        accessibilityNodeInfo2.setScrollable(true);
                                                    }
                                                    if (u0.L.h(nVar)) {
                                                        if (C0959F.v(gVar2)) {
                                                            hVar2.a(C0296c.f4308e);
                                                            hVar2.a(C0296c.f4312i);
                                                        }
                                                        if (C0959F.u(gVar2)) {
                                                            hVar2.a(C0296c.f4309f);
                                                            hVar2.a(C0296c.f4310g);
                                                        }
                                                    }
                                                }
                                            }
                                            z4 = true;
                                            if (!z4) {
                                            }
                                            if (((Number) gVar2.a().b()).floatValue() > 0.0f) {
                                            }
                                            if (u0.L.h(nVar)) {
                                            }
                                        }
                                        if (i4 >= 29) {
                                            AbstractC1007y.a(hVar2, nVar);
                                        }
                                        CharSequence charSequence = (CharSequence) AbstractC0416e.u(nVar.k(), q.f9013d);
                                        if (i4 >= 28) {
                                            accessibilityNodeInfo2.setPaneTitle(charSequence);
                                        } else {
                                            accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                        }
                                        if (u0.L.h(nVar)) {
                                            C1076a c1076a10 = (C1076a) AbstractC0416e.u(nVar.k(), z0.h.f8972q);
                                            if (c1076a10 != null) {
                                                hVar2.a(new C0296c(c1076a10.f8942a, 262144));
                                            }
                                            C1076a c1076a11 = (C1076a) AbstractC0416e.u(nVar.k(), z0.h.f8973r);
                                            if (c1076a11 != null) {
                                                hVar2.a(new C0296c(c1076a11.f8942a, 524288));
                                            }
                                            C1076a c1076a12 = (C1076a) AbstractC0416e.u(nVar.k(), z0.h.f8974s);
                                            if (c1076a12 != null) {
                                                hVar2.a(new C0296c(c1076a12.f8942a, 1048576));
                                            }
                                            z0.i k4 = nVar.k();
                                            z0.t tVar7 = z0.h.f8976u;
                                            if (k4.b(tVar7)) {
                                                List list6 = (List) nVar.k().c(tVar7);
                                                int size10 = list6.size();
                                                C0497o c0497o = C0959F.f8125N;
                                                if (size10 >= c0497o.f5183b) {
                                                    throw new IllegalStateException("Can't have more than " + c0497o.f5183b + " custom actions for one widget");
                                                }
                                                C0481G c0481g = new C0481G();
                                                C0503u c0503u = AbstractC0476B.f5134a;
                                                C0503u c0503u2 = new C0503u();
                                                C0481G c0481g2 = c0959f.f8151t;
                                                if (c0481g2.f5141d) {
                                                    AbstractC0495m.a(c0481g2);
                                                }
                                                i5 = i3;
                                                if (AbstractC0522a.a(c0481g2.f5142e, c0481g2.f5144g, i5) >= 0) {
                                                    C0503u c0503u3 = (C0503u) c0481g2.b(i5);
                                                    C0497o c0497o2 = new C0497o();
                                                    int[] iArr = c0497o.f5182a;
                                                    int i29 = c0497o.f5183b;
                                                    for (int i30 = 0; i30 < i29; i30++) {
                                                        c0497o2.a(iArr[i30]);
                                                    }
                                                    ArrayList arrayList4 = new ArrayList();
                                                    if (list6.size() > 0) {
                                                        AbstractC0080b.r(list6.get(0));
                                                        i.c(c0503u3);
                                                        throw null;
                                                    }
                                                    if (arrayList4.size() > 0) {
                                                        AbstractC0080b.r(arrayList4.get(0));
                                                        c0497o2.b(0);
                                                        throw null;
                                                    }
                                                } else if (list6.size() > 0) {
                                                    AbstractC0080b.r(list6.get(0));
                                                    c0497o.b(0);
                                                    throw null;
                                                }
                                                c0959f.f8150s.d(i5, c0481g);
                                                c0481g2.d(i5, c0503u2);
                                                boolean r3 = c0959f.r(nVar);
                                                if (Build.VERSION.SDK_INT < 28) {
                                                    accessibilityNodeInfo2.setScreenReaderFocusable(r3);
                                                } else {
                                                    Bundle extras2 = accessibilityNodeInfo2.getExtras();
                                                    if (extras2 != null) {
                                                        extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (r3 ? 1 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
                                                    }
                                                }
                                                C0496n c0496n = c0959f.C;
                                                c3 = c0496n.c(i5);
                                                if (c3 < 0) {
                                                    i7 = c0496n.f5178c[c3];
                                                    i6 = -1;
                                                } else {
                                                    i6 = -1;
                                                    i7 = -1;
                                                }
                                                if (i7 == i6) {
                                                    u0.L.u(c0997t.getAndroidViewsHandler$ui_release(), i7);
                                                    c0997t2 = c0997t;
                                                    accessibilityNodeInfo2.setTraversalBefore(c0997t2, i7);
                                                    c0959f.b(i5, hVar2, c0959f.f8127E, null);
                                                } else {
                                                    c0997t2 = c0997t;
                                                }
                                                C0496n c0496n2 = c0959f.D;
                                                c4 = c0496n2.c(i5);
                                                if (c4 < 0) {
                                                    i9 = c0496n2.f5178c[c4];
                                                    i8 = -1;
                                                } else {
                                                    i8 = -1;
                                                    i9 = -1;
                                                }
                                                if (i9 != i8) {
                                                    u0.L.u(c0997t2.getAndroidViewsHandler$ui_release(), i9);
                                                }
                                                hVar3 = hVar2;
                                                if (c0959f.p && i5 == c0959f.f8146n) {
                                                    c0959f.f8147o = hVar3;
                                                }
                                                return hVar3;
                                            }
                                        }
                                        i5 = i3;
                                        boolean r32 = c0959f.r(nVar);
                                        if (Build.VERSION.SDK_INT < 28) {
                                        }
                                        C0496n c0496n3 = c0959f.C;
                                        c3 = c0496n3.c(i5);
                                        if (c3 < 0) {
                                        }
                                        if (i7 == i6) {
                                        }
                                        C0496n c0496n22 = c0959f.D;
                                        c4 = c0496n22.c(i5);
                                        if (c4 < 0) {
                                        }
                                        if (i9 != i8) {
                                        }
                                        hVar3 = hVar2;
                                        if (c0959f.p) {
                                            c0959f.f8147o = hVar3;
                                        }
                                        return hVar3;
                                    }
                                }
                            }
                            z7 = true;
                            accessibilityNodeInfo2.setClickable(z7 || (z7 && !a3));
                            if (u0.L.h(nVar)) {
                                C0296c c0296c2 = new C0296c(null, 16, c1076a3.f8942a, null);
                                hVar2 = hVar;
                                hVar2.a(c0296c2);
                                accessibilityNodeInfo2.setLongClickable(false);
                                obj2 = linkedHashMap.get(z0.h.f8959c);
                                if (obj2 == null) {
                                }
                                c1076a = (C1076a) obj2;
                                if (c1076a != null) {
                                }
                                obj3 = linkedHashMap.get(z0.h.f8970n);
                                if (obj3 == null) {
                                }
                                c1076a2 = (C1076a) obj3;
                                if (c1076a2 != null) {
                                }
                                if (u0.L.h(nVar)) {
                                }
                                p = C0959F.p(nVar);
                                if (!(p != null || p.length() == 0)) {
                                }
                                i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 26) {
                                }
                                eVar = (z0.e) AbstractC0416e.u(iVar, q.f9012c);
                                if (eVar != null) {
                                }
                                AbstractC1005x.a(hVar2, nVar);
                                obj4 = nVar.i().f8982d.get(q.f9015f);
                                if (obj4 == null) {
                                }
                                bVar = (z0.b) obj4;
                                if (bVar != null) {
                                }
                                AbstractC0382a.x(hVar2, nVar);
                                gVar = (g) AbstractC0416e.u(nVar.k(), q.f9024o);
                                C1076a c1076a92 = (C1076a) AbstractC0416e.u(nVar.k(), z0.h.f8960d);
                                if (gVar != null) {
                                    obj6 = nVar.i().f8982d.get(q.f9015f);
                                    if (obj6 == null) {
                                    }
                                    if (obj6 == null) {
                                    }
                                    z5 = true;
                                    if (!z5) {
                                    }
                                    if (((Number) gVar.a().b()).floatValue() > 0.0f) {
                                    }
                                    if (u0.L.h(nVar)) {
                                    }
                                }
                                gVar2 = (g) AbstractC0416e.u(nVar.k(), q.p);
                                if (gVar2 != null) {
                                    obj5 = nVar.i().f8982d.get(q.f9015f);
                                    if (obj5 == null) {
                                    }
                                    if (obj5 == null) {
                                    }
                                    z4 = true;
                                    if (!z4) {
                                    }
                                    if (((Number) gVar2.a().b()).floatValue() > 0.0f) {
                                    }
                                    if (u0.L.h(nVar)) {
                                    }
                                }
                                if (i4 >= 29) {
                                }
                                CharSequence charSequence2 = (CharSequence) AbstractC0416e.u(nVar.k(), q.f9013d);
                                if (i4 >= 28) {
                                }
                                if (u0.L.h(nVar)) {
                                }
                                i5 = i3;
                                boolean r322 = c0959f.r(nVar);
                                if (Build.VERSION.SDK_INT < 28) {
                                }
                                C0496n c0496n32 = c0959f.C;
                                c3 = c0496n32.c(i5);
                                if (c3 < 0) {
                                }
                                if (i7 == i6) {
                                }
                                C0496n c0496n222 = c0959f.D;
                                c4 = c0496n222.c(i5);
                                if (c4 < 0) {
                                }
                                if (i9 != i8) {
                                }
                                hVar3 = hVar2;
                                if (c0959f.p) {
                                }
                                return hVar3;
                            }
                        }
                        hVar2 = hVar;
                        accessibilityNodeInfo2.setLongClickable(false);
                        obj2 = linkedHashMap.get(z0.h.f8959c);
                        if (obj2 == null) {
                        }
                        c1076a = (C1076a) obj2;
                        if (c1076a != null) {
                        }
                        obj3 = linkedHashMap.get(z0.h.f8970n);
                        if (obj3 == null) {
                        }
                        c1076a2 = (C1076a) obj3;
                        if (c1076a2 != null) {
                        }
                        if (u0.L.h(nVar)) {
                        }
                        p = C0959F.p(nVar);
                        if (!(p != null || p.length() == 0)) {
                        }
                        i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 26) {
                        }
                        eVar = (z0.e) AbstractC0416e.u(iVar, q.f9012c);
                        if (eVar != null) {
                        }
                        AbstractC1005x.a(hVar2, nVar);
                        obj4 = nVar.i().f8982d.get(q.f9015f);
                        if (obj4 == null) {
                        }
                        bVar = (z0.b) obj4;
                        if (bVar != null) {
                        }
                        AbstractC0382a.x(hVar2, nVar);
                        gVar = (g) AbstractC0416e.u(nVar.k(), q.f9024o);
                        C1076a c1076a922 = (C1076a) AbstractC0416e.u(nVar.k(), z0.h.f8960d);
                        if (gVar != null) {
                        }
                        gVar2 = (g) AbstractC0416e.u(nVar.k(), q.p);
                        if (gVar2 != null) {
                        }
                        if (i4 >= 29) {
                        }
                        CharSequence charSequence22 = (CharSequence) AbstractC0416e.u(nVar.k(), q.f9013d);
                        if (i4 >= 28) {
                        }
                        if (u0.L.h(nVar)) {
                        }
                        i5 = i3;
                        boolean r3222 = c0959f.r(nVar);
                        if (Build.VERSION.SDK_INT < 28) {
                        }
                        C0496n c0496n322 = c0959f.C;
                        c3 = c0496n322.c(i5);
                        if (c3 < 0) {
                        }
                        if (i7 == i6) {
                        }
                        C0496n c0496n2222 = c0959f.D;
                        c4 = c0496n2222.c(i5);
                        if (c4 < 0) {
                        }
                        if (i9 != i8) {
                        }
                        hVar3 = hVar2;
                        if (c0959f.p) {
                        }
                        return hVar3;
                    }
                }
                z3 = false;
                obtain.setVisibleToUser(z3);
                obj = linkedHashMap.get(q.f9019j);
                if (obj == null) {
                }
                if (obj == null) {
                }
            }
        }
        i5 = i3;
        hVar3 = null;
        if (c0959f.p) {
        }
        return hVar3;
    }

    public boolean n() {
        return !(((r0) ((c) this.f485f).f485f).isEmpty() && ((r0) ((c) this.f484e).f485f).isEmpty());
    }

    public boolean o(D d3) {
        if (d3.B()) {
            return ((r0) this.f485f).remove(d3);
        }
        AbstractC0381e.N("DepthSortedSet.remove called on an unattached node");
        throw null;
    }

    public String toString() {
        switch (this.f483d) {
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                return "Bounds{lower=" + ((V0.c) this.f484e) + " upper=" + ((V0.c) this.f485f) + "}";
            case AbstractC0382a.f4777a /* 9 */:
                return ((r0) this.f485f).toString();
            default:
                return super.toString();
        }
    }

    public c(String str, Object[] objArr) {
        this.f483d = 16;
        i.f(str, "query");
        this.f484e = str;
        this.f485f = objArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str) {
        this(str, (Object[]) null);
        this.f483d = 16;
        i.f(str, "query");
    }

    public c(String[] strArr, m2.e eVar) {
        this.f483d = 5;
        this.f485f = eVar;
        this.f483d = 5;
        i.f(strArr, "tables");
        this.f484e = strArr;
    }

    public c(C0951t c0951t) {
        this.f483d = 13;
        this.f484e = c0951t;
        this.f485f = new LinkedHashMap();
    }

    public c(int i3) {
        this.f483d = i3;
        switch (i3) {
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f484e = new F0.a(4);
                this.f485f = new E0.b();
                break;
            case AbstractC0382a.f4777a /* 9 */:
                this.f484e = I2.d.E(L1.h.f2706e, C0906n.f7938f);
                this.f485f = new r0(new e0(1));
                break;
            case AbstractC0382a.f4779c /* 10 */:
                this.f484e = new c(9);
                this.f485f = new c(9);
                break;
            case 12:
                this.f484e = new K.d(new D[16]);
                break;
            case 14:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f484e = new b1.j(this);
                    break;
                } else {
                    this.f484e = new b1.i(this);
                    break;
                }
            case AbstractC0382a.f4781e /* 15 */:
                this.f484e = new K.d(new Reference[16]);
                this.f485f = new ReferenceQueue();
                break;
            default:
                this.f484e = new LinkedHashMap();
                this.f485f = new LinkedHashMap();
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(C0959F c0959f) {
        this(14);
        this.f483d = 14;
        this.f485f = c0959f;
    }
}
