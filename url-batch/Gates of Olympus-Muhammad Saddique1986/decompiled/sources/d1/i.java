package d1;

import A0.s;
import A0.v;
import C0.C0031g;
import C0.H;
import a.AbstractC0235a;
import a0.C0239d;
import a0.C0241f;
import android.R;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import j.C0525G;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import r0.AbstractC0898U;
import r0.InterfaceC0919p;
import t0.C1006t;
import t0.b0;
import u0.AbstractC1090b;
import u0.C1092c;
import u0.C1094d;
import u0.C1096e;
import u0.C1123s;
import u0.C1137z;
import u0.E;
import u0.J0;
import u0.L;
import z.C1256t;

/* loaded from: classes.dex */
public class i extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C1256t f5675a;

    public i(C1256t c1256t) {
        this.f5675a = c1256t;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        h k3 = this.f5675a.k(i3);
        if (k3 == null) {
            return null;
        }
        return k3.f5672a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i3) {
        this.f5675a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i3) {
        C1256t c1256t = this.f5675a;
        h k3 = c1256t.k(((E) c1256t.f10467f).f9161n);
        if (k3 == null) {
            return null;
        }
        return k3.f5672a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0183, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0689, code lost:
    
        if (r0 != 16) goto L482;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x074a  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAction(int i3, int i4, Bundle bundle) {
        boolean z3;
        A0.p pVar;
        int i5;
        AbstractC1090b abstractC1090b;
        int i6;
        int i7;
        AbstractC1090b abstractC1090b2;
        H r3;
        C1094d c1094d;
        InterfaceC0422a interfaceC0422a;
        int i8;
        int i9;
        InterfaceC0422a interfaceC0422a2;
        int i10;
        Integer num;
        Boolean bool;
        InterfaceC0422a interfaceC0422a3;
        InterfaceC0422a interfaceC0422a4;
        float f3;
        int i11;
        A0.a aVar;
        InterfaceC0422a interfaceC0422a5;
        A0.a aVar2;
        InterfaceC0422a interfaceC0422a6;
        InterfaceC0424c interfaceC0424c;
        InterfaceC0422a interfaceC0422a7;
        InterfaceC0422a interfaceC0422a8;
        InterfaceC0422a interfaceC0422a9;
        InterfaceC0422a interfaceC0422a10;
        InterfaceC0422a interfaceC0422a11;
        InterfaceC0424c interfaceC0424c2;
        A0.a aVar3;
        long j3;
        Object obj;
        A0.g gVar;
        A0.g gVar2;
        float f4;
        float f5;
        float f6;
        InterfaceC0426e interfaceC0426e;
        InterfaceC0424c interfaceC0424c3;
        InterfaceC0422a interfaceC0422a12;
        InterfaceC0422a interfaceC0422a13;
        InterfaceC0422a interfaceC0422a14;
        InterfaceC0422a interfaceC0422a15;
        InterfaceC0422a interfaceC0422a16;
        E e3 = (E) this.f5675a.f10467f;
        J0 j02 = (J0) e3.l().f(i3);
        if (j02 == null || (pVar = j02.f9202a) == null) {
            z3 = false;
        } else {
            C1123s c1123s = e3.f9151d;
            if (i4 == 64) {
                z3 = false;
                AccessibilityManager accessibilityManager = e3.f9154g;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i5 = e3.f9161n) != i3) {
                    if (i5 != Integer.MIN_VALUE) {
                        E.A(e3, i5, 65536, null, 12);
                    }
                    e3.f9161n = i3;
                    c1123s.invalidate();
                    E.A(e3, i3, 32768, null, 12);
                    return true;
                }
            } else if (i4 != 128) {
                A0.i iVar = pVar.f142d;
                int i12 = pVar.f145g;
                LinkedHashMap linkedHashMap = iVar.f129d;
                if (i4 != 256 && i4 != 512) {
                    if (i4 == 16384) {
                        Object obj2 = linkedHashMap.get(A0.h.f117o);
                        A0.a aVar4 = (A0.a) (obj2 == null ? null : obj2);
                        if (aVar4 != null && (interfaceC0422a = (InterfaceC0422a) aVar4.f89b) != null) {
                            return ((Boolean) interfaceC0422a.b()).booleanValue();
                        }
                    } else {
                        if (i4 == 131072) {
                            if (bundle != null) {
                                i8 = -1;
                                i9 = bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                            } else {
                                i8 = -1;
                                i9 = -1;
                            }
                            boolean G3 = e3.G(pVar, i9, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", i8) : -1, false);
                            if (G3) {
                                E.A(e3, e3.w(i12), 0, null, 12);
                            }
                            return G3;
                        }
                        if (!L.l(pVar)) {
                            return false;
                        }
                        if (i4 == 1) {
                            Object obj3 = linkedHashMap.get(A0.h.f123u);
                            A0.a aVar5 = (A0.a) (obj3 == null ? null : obj3);
                            if (aVar5 != null && (interfaceC0422a2 = (InterfaceC0422a) aVar5.f89b) != null) {
                                return ((Boolean) interfaceC0422a2.b()).booleanValue();
                            }
                        } else if (i4 != 2) {
                            switch (i4) {
                                case 16:
                                    Object obj4 = linkedHashMap.get(A0.h.f104b);
                                    if (obj4 == null) {
                                        obj4 = null;
                                    }
                                    A0.a aVar6 = (A0.a) obj4;
                                    if (aVar6 == null || (interfaceC0422a3 = (InterfaceC0422a) aVar6.f89b) == null) {
                                        i10 = 12;
                                        num = null;
                                        bool = null;
                                    } else {
                                        bool = (Boolean) interfaceC0422a3.b();
                                        i10 = 12;
                                        num = null;
                                    }
                                    E.A(e3, i3, 1, num, i10);
                                    if (bool != null) {
                                        return bool.booleanValue();
                                    }
                                    break;
                                case 32:
                                    Object obj5 = linkedHashMap.get(A0.h.f105c);
                                    A0.a aVar7 = (A0.a) (obj5 == null ? null : obj5);
                                    if (aVar7 != null && (interfaceC0422a4 = (InterfaceC0422a) aVar7.f89b) != null) {
                                        return ((Boolean) interfaceC0422a4.b()).booleanValue();
                                    }
                                    break;
                                case 4096:
                                case 8192:
                                    boolean z4 = i4 == 4096;
                                    boolean z5 = i4 == 8192;
                                    boolean z6 = i4 == 16908345;
                                    boolean z7 = i4 == 16908347;
                                    boolean z8 = i4 == 16908344;
                                    boolean z9 = i4 == 16908346;
                                    boolean z10 = z6 || z7 || z4 || z5;
                                    boolean z11 = z8 || z9 || z4 || z5;
                                    if (z4 || z5) {
                                        Object obj6 = linkedHashMap.get(s.f168c);
                                        if (obj6 == null) {
                                            obj6 = null;
                                        }
                                        A0.e eVar = (A0.e) obj6;
                                        Object obj7 = linkedHashMap.get(A0.h.f109g);
                                        if (obj7 == null) {
                                            obj7 = null;
                                        }
                                        A0.a aVar8 = (A0.a) obj7;
                                        if (eVar != null && aVar8 != null) {
                                            float u3 = O2.d.u(0.0f, 0.0f);
                                            float v3 = O2.d.v(0.0f, 0.0f);
                                            int i13 = eVar.f97b;
                                            if (i13 > 0) {
                                                f3 = u3 - v3;
                                                i11 = i13 + 1;
                                            } else {
                                                f3 = u3 - v3;
                                                i11 = 20;
                                            }
                                            float f7 = f3 / i11;
                                            if (z5) {
                                                f7 = -f7;
                                            }
                                            InterfaceC0424c interfaceC0424c4 = (InterfaceC0424c) aVar8.f89b;
                                            if (interfaceC0424c4 != null) {
                                                return ((Boolean) interfaceC0424c4.n(Float.valueOf(0.0f + f7))).booleanValue();
                                            }
                                            return false;
                                        }
                                    }
                                    C0239d d3 = AbstractC0898U.d((C1006t) pVar.f141c.f8561y.f2912c);
                                    long e4 = AbstractC0235a.e(d3.c(), d3.b());
                                    ArrayList arrayList = new ArrayList();
                                    Object obj8 = linkedHashMap.get(A0.h.f102A);
                                    if (obj8 == null) {
                                        obj8 = null;
                                    }
                                    A0.a aVar9 = (A0.a) obj8;
                                    Float f8 = (aVar9 == null || (interfaceC0424c = (InterfaceC0424c) aVar9.f89b) == null || !((Boolean) interfaceC0424c.n(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                    Object obj9 = linkedHashMap.get(A0.h.f106d);
                                    if (obj9 == null) {
                                        obj9 = null;
                                    }
                                    A0.a aVar10 = (A0.a) obj9;
                                    if (aVar10 == null) {
                                        return false;
                                    }
                                    Object obj10 = linkedHashMap.get(s.f180o);
                                    if (obj10 == null) {
                                        obj10 = null;
                                    }
                                    A0.g gVar3 = (A0.g) obj10;
                                    R1.e eVar2 = aVar10.f89b;
                                    if (gVar3 != null && z10) {
                                        float floatValue = f8 != null ? f8.floatValue() : C0241f.d(e4);
                                        if (z6 || z5) {
                                            floatValue = -floatValue;
                                        }
                                        if (gVar3.f101c) {
                                            floatValue = -floatValue;
                                        }
                                        if (L.m(pVar) && (z6 || z7)) {
                                            floatValue = -floatValue;
                                        }
                                        if (E.t(gVar3, floatValue)) {
                                            v vVar = A0.h.f126x;
                                            if (linkedHashMap.containsKey(vVar) || linkedHashMap.containsKey(A0.h.f128z)) {
                                                if (floatValue > 0.0f) {
                                                    Object obj11 = linkedHashMap.get(A0.h.f128z);
                                                    aVar2 = (A0.a) (obj11 == null ? null : obj11);
                                                } else {
                                                    Object obj12 = linkedHashMap.get(vVar);
                                                    aVar2 = (A0.a) (obj12 == null ? null : obj12);
                                                }
                                                if (aVar2 != null && (interfaceC0422a6 = (InterfaceC0422a) aVar2.f89b) != null) {
                                                    return ((Boolean) interfaceC0422a6.b()).booleanValue();
                                                }
                                            } else {
                                                InterfaceC0426e interfaceC0426e2 = (InterfaceC0426e) eVar2;
                                                if (interfaceC0426e2 != null) {
                                                    return ((Boolean) interfaceC0426e2.h(Float.valueOf(floatValue), Float.valueOf(0.0f))).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                    Object obj13 = linkedHashMap.get(s.f181p);
                                    if (obj13 == null) {
                                        obj13 = null;
                                    }
                                    A0.g gVar4 = (A0.g) obj13;
                                    if (gVar4 != null && z11) {
                                        float floatValue2 = f8 != null ? f8.floatValue() : C0241f.b(e4);
                                        if (z8 || z5) {
                                            floatValue2 = -floatValue2;
                                        }
                                        if (gVar4.f101c) {
                                            floatValue2 = -floatValue2;
                                        }
                                        if (E.t(gVar4, floatValue2)) {
                                            v vVar2 = A0.h.f125w;
                                            if (linkedHashMap.containsKey(vVar2) || linkedHashMap.containsKey(A0.h.f127y)) {
                                                if (floatValue2 > 0.0f) {
                                                    Object obj14 = linkedHashMap.get(A0.h.f127y);
                                                    aVar = (A0.a) (obj14 == null ? null : obj14);
                                                } else {
                                                    Object obj15 = linkedHashMap.get(vVar2);
                                                    aVar = (A0.a) (obj15 == null ? null : obj15);
                                                }
                                                if (aVar != null && (interfaceC0422a5 = (InterfaceC0422a) aVar.f89b) != null) {
                                                    return ((Boolean) interfaceC0422a5.b()).booleanValue();
                                                }
                                            } else {
                                                InterfaceC0426e interfaceC0426e3 = (InterfaceC0426e) eVar2;
                                                if (interfaceC0426e3 != null) {
                                                    return ((Boolean) interfaceC0426e3.h(Float.valueOf(0.0f), Float.valueOf(floatValue2))).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 32768:
                                    Object obj16 = linkedHashMap.get(A0.h.f119q);
                                    A0.a aVar11 = (A0.a) (obj16 != null ? obj16 : null);
                                    if (aVar11 == null || (interfaceC0422a7 = (InterfaceC0422a) aVar11.f89b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) interfaceC0422a7.b()).booleanValue();
                                case 65536:
                                    Object obj17 = linkedHashMap.get(A0.h.f118p);
                                    A0.a aVar12 = (A0.a) (obj17 != null ? obj17 : null);
                                    if (aVar12 == null || (interfaceC0422a8 = (InterfaceC0422a) aVar12.f89b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) interfaceC0422a8.b()).booleanValue();
                                case 262144:
                                    Object obj18 = linkedHashMap.get(A0.h.f120r);
                                    A0.a aVar13 = (A0.a) (obj18 != null ? obj18 : null);
                                    if (aVar13 == null || (interfaceC0422a9 = (InterfaceC0422a) aVar13.f89b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) interfaceC0422a9.b()).booleanValue();
                                case 524288:
                                    Object obj19 = linkedHashMap.get(A0.h.f121s);
                                    A0.a aVar14 = (A0.a) (obj19 != null ? obj19 : null);
                                    if (aVar14 == null || (interfaceC0422a10 = (InterfaceC0422a) aVar14.f89b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) interfaceC0422a10.b()).booleanValue();
                                case 1048576:
                                    Object obj20 = linkedHashMap.get(A0.h.f122t);
                                    A0.a aVar15 = (A0.a) (obj20 != null ? obj20 : null);
                                    if (aVar15 == null || (interfaceC0422a11 = (InterfaceC0422a) aVar15.f89b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) interfaceC0422a11.b()).booleanValue();
                                case 2097152:
                                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                    Object obj21 = linkedHashMap.get(A0.h.f111i);
                                    if (obj21 == null) {
                                        obj21 = null;
                                    }
                                    A0.a aVar16 = (A0.a) obj21;
                                    if (aVar16 == null || (interfaceC0424c2 = (InterfaceC0424c) aVar16.f89b) == null) {
                                        return false;
                                    }
                                    if (string == null) {
                                        string = "";
                                    }
                                    return ((Boolean) interfaceC0424c2.n(new C0031g(string, null, 6))).booleanValue();
                                case R.id.accessibilityActionShowOnScreen:
                                    A0.p j4 = pVar.j();
                                    if (j4 != null) {
                                        Object obj22 = j4.f142d.f129d.get(A0.h.f106d);
                                        if (obj22 == null) {
                                            obj22 = null;
                                        }
                                        aVar3 = (A0.a) obj22;
                                        while (j4 != null && aVar3 == null) {
                                            j4 = j4.j();
                                            if (j4 != null) {
                                                Object obj23 = j4.f142d.f129d.get(A0.h.f106d);
                                                if (obj23 == null) {
                                                    obj23 = null;
                                                }
                                                aVar3 = (A0.a) obj23;
                                            }
                                        }
                                        if (j4 == null) {
                                            return false;
                                        }
                                        t0.E e5 = j4.f141c;
                                        C0239d d4 = AbstractC0898U.d((C1006t) e5.f8561y.f2912c);
                                        InterfaceC0919p v4 = ((C1006t) e5.f8561y.f2912c).v();
                                        C0239d h3 = d4.h(v4 != null ? ((b0) v4).N(0L) : 0L);
                                        b0 c2 = pVar.c();
                                        if (c2 != null) {
                                            if (!c2.K0().f4501p) {
                                                c2 = null;
                                            }
                                            if (c2 != null) {
                                                j3 = c2.N(0L);
                                                b0 c3 = pVar.c();
                                                C0239d g3 = O2.d.g(j3, O2.d.f0(c3 != null ? c3.f8128f : 0L));
                                                v vVar3 = s.f180o;
                                                LinkedHashMap linkedHashMap2 = j4.f142d.f129d;
                                                obj = linkedHashMap2.get(vVar3);
                                                if (obj == null) {
                                                    obj = null;
                                                }
                                                gVar = (A0.g) obj;
                                                Object obj24 = linkedHashMap2.get(s.f181p);
                                                gVar2 = (A0.g) (obj24 != null ? obj24 : null);
                                                f4 = g3.f4724a - h3.f4724a;
                                                f5 = g3.f4726c - h3.f4726c;
                                                if (Math.signum(f4) == Math.signum(f5)) {
                                                    f4 = 0.0f;
                                                } else if (Math.abs(f4) >= Math.abs(f5)) {
                                                    f4 = f5;
                                                }
                                                if (gVar != null && gVar.f101c) {
                                                    f4 = -f4;
                                                }
                                                if (L.m(pVar)) {
                                                    f4 = -f4;
                                                }
                                                float f9 = g3.f4725b - h3.f4725b;
                                                float f10 = g3.f4727d - h3.f4727d;
                                                f6 = Math.signum(f9) == Math.signum(f10) ? Math.abs(f9) < Math.abs(f10) ? f9 : f10 : 0.0f;
                                                if (gVar2 != null && gVar2.f101c) {
                                                    f6 = -f6;
                                                }
                                                if (aVar3 == null && (interfaceC0426e = (InterfaceC0426e) aVar3.f89b) != null) {
                                                    return ((Boolean) interfaceC0426e.h(Float.valueOf(f4), Float.valueOf(f6))).booleanValue();
                                                }
                                            }
                                        }
                                        j3 = 0;
                                        b0 c32 = pVar.c();
                                        C0239d g32 = O2.d.g(j3, O2.d.f0(c32 != null ? c32.f8128f : 0L));
                                        v vVar32 = s.f180o;
                                        LinkedHashMap linkedHashMap22 = j4.f142d.f129d;
                                        obj = linkedHashMap22.get(vVar32);
                                        if (obj == null) {
                                        }
                                        gVar = (A0.g) obj;
                                        Object obj242 = linkedHashMap22.get(s.f181p);
                                        gVar2 = (A0.g) (obj242 != null ? obj242 : null);
                                        f4 = g32.f4724a - h3.f4724a;
                                        f5 = g32.f4726c - h3.f4726c;
                                        if (Math.signum(f4) == Math.signum(f5)) {
                                        }
                                        if (gVar != null) {
                                            f4 = -f4;
                                        }
                                        if (L.m(pVar)) {
                                        }
                                        float f92 = g32.f4725b - h3.f4725b;
                                        float f102 = g32.f4727d - h3.f4727d;
                                        if (Math.signum(f92) == Math.signum(f102)) {
                                        }
                                        if (gVar2 != null) {
                                            f6 = -f6;
                                        }
                                        return aVar3 == null ? false : false;
                                    }
                                    aVar3 = null;
                                    break;
                                case R.id.accessibilityActionSetProgress:
                                    if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                        return false;
                                    }
                                    Object obj25 = linkedHashMap.get(A0.h.f109g);
                                    A0.a aVar17 = (A0.a) (obj25 != null ? obj25 : null);
                                    if (aVar17 == null || (interfaceC0424c3 = (InterfaceC0424c) aVar17.f89b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) interfaceC0424c3.n(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                case R.id.accessibilityActionImeEnter:
                                    Object obj26 = linkedHashMap.get(A0.h.f116n);
                                    A0.a aVar18 = (A0.a) (obj26 != null ? obj26 : null);
                                    if (aVar18 == null || (interfaceC0422a12 = (InterfaceC0422a) aVar18.f89b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) interfaceC0422a12.b()).booleanValue();
                                default:
                                    switch (i4) {
                                        case R.id.accessibilityActionScrollUp:
                                        case R.id.accessibilityActionScrollLeft:
                                        case R.id.accessibilityActionScrollDown:
                                        case R.id.accessibilityActionScrollRight:
                                            break;
                                        default:
                                            switch (i4) {
                                                case R.id.accessibilityActionPageUp:
                                                    Object obj27 = linkedHashMap.get(A0.h.f125w);
                                                    A0.a aVar19 = (A0.a) (obj27 != null ? obj27 : null);
                                                    if (aVar19 == null || (interfaceC0422a13 = (InterfaceC0422a) aVar19.f89b) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) interfaceC0422a13.b()).booleanValue();
                                                case R.id.accessibilityActionPageDown:
                                                    Object obj28 = linkedHashMap.get(A0.h.f127y);
                                                    A0.a aVar20 = (A0.a) (obj28 != null ? obj28 : null);
                                                    if (aVar20 == null || (interfaceC0422a14 = (InterfaceC0422a) aVar20.f89b) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) interfaceC0422a14.b()).booleanValue();
                                                case R.id.accessibilityActionPageLeft:
                                                    Object obj29 = linkedHashMap.get(A0.h.f126x);
                                                    A0.a aVar21 = (A0.a) (obj29 != null ? obj29 : null);
                                                    if (aVar21 == null || (interfaceC0422a15 = (InterfaceC0422a) aVar21.f89b) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) interfaceC0422a15.b()).booleanValue();
                                                case R.id.accessibilityActionPageRight:
                                                    Object obj30 = linkedHashMap.get(A0.h.f128z);
                                                    A0.a aVar22 = (A0.a) (obj30 != null ? obj30 : null);
                                                    if (aVar22 == null || (interfaceC0422a16 = (InterfaceC0422a) aVar22.f89b) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) interfaceC0422a16.b()).booleanValue();
                                                default:
                                                    C0525G c0525g = (C0525G) e3.f9166s.b(i3);
                                                    if (c0525g == null || ((CharSequence) c0525g.b(i4)) == null) {
                                                        return false;
                                                    }
                                                    Object obj31 = linkedHashMap.get(A0.h.f124v);
                                                    List list = (List) (obj31 != null ? obj31 : null);
                                                    if (list == null || list.size() <= 0) {
                                                        return false;
                                                    }
                                                    list.get(0).getClass();
                                                    throw new ClassCastException();
                                            }
                                    }
                            }
                        } else {
                            Object obj32 = linkedHashMap.get(s.f176k);
                            if (f2.j.a(obj32 == null ? null : obj32, Boolean.TRUE)) {
                                ((androidx.compose.ui.focus.b) c1123s.getFocusOwner()).a(8, false, true);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (bundle != null) {
                    int i14 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                    boolean z12 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                    boolean z13 = i4 == 256;
                    Integer num2 = e3.f9169v;
                    if (num2 == null || i12 != num2.intValue()) {
                        e3.f9168u = -1;
                        e3.f9169v = Integer.valueOf(i12);
                    }
                    String p3 = E.p(pVar);
                    if (p3 != null && p3.length() != 0) {
                        String p4 = E.p(pVar);
                        if (p4 != null && p4.length() != 0) {
                            if (i14 == 1) {
                                Locale locale = c1123s.getContext().getResources().getConfiguration().locale;
                                if (C1092c.f9314e == null) {
                                    C1092c c1092c = new C1092c(0);
                                    c1092c.f9318d = BreakIterator.getCharacterInstance(locale);
                                    C1092c.f9314e = c1092c;
                                }
                                C1092c c1092c2 = C1092c.f9314e;
                                f2.j.d(c1092c2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                                c1092c2.f(p4);
                                abstractC1090b2 = c1092c2;
                            } else if (i14 != 2) {
                                if (i14 != 4) {
                                    if (i14 == 8) {
                                        if (C1096e.f9336c == null) {
                                            C1096e.f9336c = new C1096e();
                                        }
                                        C1096e c1096e = C1096e.f9336c;
                                        f2.j.d(c1096e, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                                        c1096e.f9309a = p4;
                                        abstractC1090b2 = c1096e;
                                    }
                                }
                                if (linkedHashMap.containsKey(A0.h.f103a) && (r3 = L.r(iVar)) != null) {
                                    if (i14 == 4) {
                                        if (C1092c.f9316g == null) {
                                            C1092c.f9316g = new C1092c(2);
                                        }
                                        C1092c c1092c3 = C1092c.f9316g;
                                        f2.j.d(c1092c3, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                                        c1092c3.f9309a = p4;
                                        c1092c3.f9318d = r3;
                                        c1094d = c1092c3;
                                    } else {
                                        if (C1094d.f9328e == null) {
                                            C1094d c1094d2 = new C1094d();
                                            new Rect();
                                            C1094d.f9328e = c1094d2;
                                        }
                                        C1094d c1094d3 = C1094d.f9328e;
                                        f2.j.d(c1094d3, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                                        c1094d3.f9309a = p4;
                                        c1094d3.f9329c = r3;
                                        c1094d3.f9330d = pVar;
                                        c1094d = c1094d3;
                                    }
                                    abstractC1090b = c1094d;
                                    if (abstractC1090b != null) {
                                        int j5 = e3.j(pVar);
                                        if (j5 == -1) {
                                            j5 = z13 ? 0 : p3.length();
                                        }
                                        int[] a3 = z13 ? abstractC1090b.a(j5) : abstractC1090b.d(j5);
                                        if (a3 != null) {
                                            int i15 = a3[0];
                                            int i16 = a3[1];
                                            if (z12 && !linkedHashMap.containsKey(s.f166a) && linkedHashMap.containsKey(s.f189x)) {
                                                i6 = e3.k(pVar);
                                                if (i6 == -1) {
                                                    i6 = z13 ? i15 : i16;
                                                }
                                                i7 = z13 ? i16 : i15;
                                            } else {
                                                i6 = z13 ? i16 : i15;
                                                i7 = i6;
                                            }
                                            e3.f9173z = new C1137z(pVar, z13 ? 256 : 512, i14, i15, i16, SystemClock.uptimeMillis());
                                            e3.G(pVar, i6, i7, true);
                                            return true;
                                        }
                                    }
                                    return false;
                                }
                            } else {
                                Locale locale2 = c1123s.getContext().getResources().getConfiguration().locale;
                                if (C1092c.f9315f == null) {
                                    C1092c c1092c4 = new C1092c(1);
                                    c1092c4.f9318d = BreakIterator.getWordInstance(locale2);
                                    C1092c.f9315f = c1092c4;
                                }
                                C1092c c1092c5 = C1092c.f9315f;
                                f2.j.d(c1092c5, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                                c1092c5.f(p4);
                                abstractC1090b2 = c1092c5;
                            }
                            abstractC1090b = abstractC1090b2;
                            if (abstractC1090b != null) {
                            }
                            return false;
                        }
                        abstractC1090b = null;
                        if (abstractC1090b != null) {
                        }
                        return false;
                    }
                }
                z3 = false;
            } else {
                z3 = false;
                if (e3.f9161n == i3) {
                    e3.f9161n = Integer.MIN_VALUE;
                    e3.f9162o = null;
                    c1123s.invalidate();
                    E.A(e3, i3, 65536, null, 12);
                    return true;
                }
            }
        }
        return z3;
    }
}
