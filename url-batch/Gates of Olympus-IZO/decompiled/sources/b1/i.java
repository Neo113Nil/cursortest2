package b1;

import B0.C0007d;
import B0.z;
import a.AbstractC0157a;
import android.R;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import e2.AbstractC0381e;
import e2.C0377a;
import j.C0481G;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import r0.InterfaceC0838k;
import r0.M;
import t0.C0911t;
import t0.D;
import t0.a0;
import u0.AbstractC0962b;
import u0.C0954A;
import u0.C0959F;
import u0.C0964c;
import u0.C0966d;
import u0.C0968e;
import u0.C0997t;
import u0.C1010z0;
import u0.L;
import z0.C1076a;
import z0.t;

/* loaded from: classes.dex */
public class i extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C2.c f4320a;

    public i(C2.c cVar) {
        this.f4320a = cVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        h l3 = this.f4320a.l(i3);
        if (l3 == null) {
            return null;
        }
        return l3.f4317a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i3) {
        this.f4320a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i3) {
        C2.c cVar = this.f4320a;
        h l3 = cVar.l(((C0959F) cVar.f485f).f8146n);
        if (l3 == null) {
            return null;
        }
        return l3.f4317a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0183, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0691, code lost:
    
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
    /* JADX WARN: Removed duplicated region for block: B:262:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0752  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAction(int i3, int i4, Bundle bundle) {
        boolean z3;
        z0.n nVar;
        int i5;
        AbstractC0962b abstractC0962b;
        int i6;
        int i7;
        AbstractC0962b abstractC0962b2;
        z n3;
        C0966d c0966d;
        Y1.a aVar;
        int i8;
        int i9;
        Y1.a aVar2;
        int i10;
        Integer num;
        Boolean bool;
        Y1.a aVar3;
        Y1.a aVar4;
        float f3;
        float f4;
        C1076a c1076a;
        Y1.a aVar5;
        C1076a c1076a2;
        Y1.a aVar6;
        Y1.c cVar;
        Y1.a aVar7;
        Y1.a aVar8;
        Y1.a aVar9;
        Y1.a aVar10;
        Y1.a aVar11;
        Y1.c cVar2;
        C1076a c1076a3;
        long j3;
        Object obj;
        z0.g gVar;
        z0.g gVar2;
        float f5;
        float f6;
        float f7;
        Y1.e eVar;
        Y1.c cVar3;
        Y1.a aVar12;
        Y1.a aVar13;
        Y1.a aVar14;
        Y1.a aVar15;
        Y1.a aVar16;
        C0959F c0959f = (C0959F) this.f4320a.f485f;
        C1010z0 c1010z0 = (C1010z0) c0959f.l().f(i3);
        if (c1010z0 == null || (nVar = c1010z0.f8507a) == null) {
            z3 = false;
        } else {
            C0997t c0997t = c0959f.f8136d;
            if (i4 == 64) {
                z3 = false;
                AccessibilityManager accessibilityManager = c0959f.f8139g;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i5 = c0959f.f8146n) != i3) {
                    if (i5 != Integer.MIN_VALUE) {
                        C0959F.A(c0959f, i5, 65536, null, 12);
                    }
                    c0959f.f8146n = i3;
                    c0997t.invalidate();
                    C0959F.A(c0959f, i3, 32768, null, 12);
                    return true;
                }
            } else if (i4 != 128) {
                z0.i iVar = nVar.f8991d;
                int i11 = nVar.f8994g;
                LinkedHashMap linkedHashMap = iVar.f8982d;
                if (i4 != 256 && i4 != 512) {
                    if (i4 == 16384) {
                        Object obj2 = linkedHashMap.get(z0.h.f8970n);
                        C1076a c1076a4 = (C1076a) (obj2 == null ? null : obj2);
                        if (c1076a4 != null && (aVar = (Y1.a) c1076a4.f8943b) != null) {
                            return ((Boolean) aVar.b()).booleanValue();
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
                            boolean G3 = c0959f.G(nVar, i9, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", i8) : -1, false);
                            if (G3) {
                                C0959F.A(c0959f, c0959f.w(i11), 0, null, 12);
                            }
                            return G3;
                        }
                        if (!L.h(nVar)) {
                            return false;
                        }
                        if (i4 == 1) {
                            Object obj3 = linkedHashMap.get(z0.h.f8975t);
                            C1076a c1076a5 = (C1076a) (obj3 == null ? null : obj3);
                            if (c1076a5 != null && (aVar2 = (Y1.a) c1076a5.f8943b) != null) {
                                return ((Boolean) aVar2.b()).booleanValue();
                            }
                        } else if (i4 != 2) {
                            switch (i4) {
                                case 16:
                                    Object obj4 = linkedHashMap.get(z0.h.f8958b);
                                    if (obj4 == null) {
                                        obj4 = null;
                                    }
                                    C1076a c1076a6 = (C1076a) obj4;
                                    if (c1076a6 == null || (aVar3 = (Y1.a) c1076a6.f8943b) == null) {
                                        i10 = 12;
                                        num = null;
                                        bool = null;
                                    } else {
                                        bool = (Boolean) aVar3.b();
                                        i10 = 12;
                                        num = null;
                                    }
                                    C0959F.A(c0959f, i3, 1, num, i10);
                                    if (bool != null) {
                                        return bool.booleanValue();
                                    }
                                    break;
                                case 32:
                                    Object obj5 = linkedHashMap.get(z0.h.f8959c);
                                    C1076a c1076a7 = (C1076a) (obj5 == null ? null : obj5);
                                    if (c1076a7 != null && (aVar4 = (Y1.a) c1076a7.f8943b) != null) {
                                        return ((Boolean) aVar4.b()).booleanValue();
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
                                        Object obj6 = linkedHashMap.get(z0.q.f9012c);
                                        if (obj6 == null) {
                                            obj6 = null;
                                        }
                                        z0.e eVar2 = (z0.e) obj6;
                                        Object obj7 = linkedHashMap.get(z0.h.f8963g);
                                        if (obj7 == null) {
                                            obj7 = null;
                                        }
                                        C1076a c1076a8 = (C1076a) obj7;
                                        if (eVar2 != null && c1076a8 != null) {
                                            C0377a c0377a = eVar2.f8951b;
                                            float f8 = c0377a.f4767b;
                                            float f9 = c0377a.f4766a;
                                            float n4 = AbstractC0381e.n(f8, f9);
                                            float o3 = AbstractC0381e.o(f9, f8);
                                            int i12 = eVar2.f8952c;
                                            if (i12 > 0) {
                                                f3 = n4 - o3;
                                                f4 = i12 + 1;
                                            } else {
                                                f3 = n4 - o3;
                                                f4 = 20;
                                            }
                                            float f10 = f3 / f4;
                                            if (z5) {
                                                f10 = -f10;
                                            }
                                            Y1.c cVar4 = (Y1.c) c1076a8.f8943b;
                                            if (cVar4 != null) {
                                                return ((Boolean) cVar4.j(Float.valueOf(eVar2.f8950a + f10))).booleanValue();
                                            }
                                            return false;
                                        }
                                    }
                                    a0.d d3 = M.d((C0911t) nVar.f8990c.f7735x.f2353c);
                                    long h3 = I2.d.h(d3.c(), d3.b());
                                    ArrayList arrayList = new ArrayList();
                                    Object obj8 = linkedHashMap.get(z0.h.f8981z);
                                    if (obj8 == null) {
                                        obj8 = null;
                                    }
                                    C1076a c1076a9 = (C1076a) obj8;
                                    Float f11 = (c1076a9 == null || (cVar = (Y1.c) c1076a9.f8943b) == null || !((Boolean) cVar.j(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                    Object obj9 = linkedHashMap.get(z0.h.f8960d);
                                    if (obj9 == null) {
                                        obj9 = null;
                                    }
                                    C1076a c1076a10 = (C1076a) obj9;
                                    if (c1076a10 == null) {
                                        return false;
                                    }
                                    Object obj10 = linkedHashMap.get(z0.q.f9024o);
                                    if (obj10 == null) {
                                        obj10 = null;
                                    }
                                    z0.g gVar3 = (z0.g) obj10;
                                    L1.e eVar3 = c1076a10.f8943b;
                                    if (gVar3 != null && z10) {
                                        float floatValue = f11 != null ? f11.floatValue() : a0.f.d(h3);
                                        if (z6 || z5) {
                                            floatValue = -floatValue;
                                        }
                                        if (gVar3.f8956c) {
                                            floatValue = -floatValue;
                                        }
                                        if (L.i(nVar) && (z6 || z7)) {
                                            floatValue = -floatValue;
                                        }
                                        if (C0959F.t(gVar3, floatValue)) {
                                            t tVar = z0.h.f8978w;
                                            if (linkedHashMap.containsKey(tVar) || linkedHashMap.containsKey(z0.h.f8980y)) {
                                                if (floatValue > 0.0f) {
                                                    Object obj11 = linkedHashMap.get(z0.h.f8980y);
                                                    c1076a2 = (C1076a) (obj11 == null ? null : obj11);
                                                } else {
                                                    Object obj12 = linkedHashMap.get(tVar);
                                                    c1076a2 = (C1076a) (obj12 == null ? null : obj12);
                                                }
                                                if (c1076a2 != null && (aVar6 = (Y1.a) c1076a2.f8943b) != null) {
                                                    return ((Boolean) aVar6.b()).booleanValue();
                                                }
                                            } else {
                                                Y1.e eVar4 = (Y1.e) eVar3;
                                                if (eVar4 != null) {
                                                    return ((Boolean) eVar4.g(Float.valueOf(floatValue), Float.valueOf(0.0f))).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                    Object obj13 = linkedHashMap.get(z0.q.p);
                                    if (obj13 == null) {
                                        obj13 = null;
                                    }
                                    z0.g gVar4 = (z0.g) obj13;
                                    if (gVar4 != null && z11) {
                                        float floatValue2 = f11 != null ? f11.floatValue() : a0.f.b(h3);
                                        if (z8 || z5) {
                                            floatValue2 = -floatValue2;
                                        }
                                        if (gVar4.f8956c) {
                                            floatValue2 = -floatValue2;
                                        }
                                        if (C0959F.t(gVar4, floatValue2)) {
                                            t tVar2 = z0.h.f8977v;
                                            if (linkedHashMap.containsKey(tVar2) || linkedHashMap.containsKey(z0.h.f8979x)) {
                                                if (floatValue2 > 0.0f) {
                                                    Object obj14 = linkedHashMap.get(z0.h.f8979x);
                                                    c1076a = (C1076a) (obj14 == null ? null : obj14);
                                                } else {
                                                    Object obj15 = linkedHashMap.get(tVar2);
                                                    c1076a = (C1076a) (obj15 == null ? null : obj15);
                                                }
                                                if (c1076a != null && (aVar5 = (Y1.a) c1076a.f8943b) != null) {
                                                    return ((Boolean) aVar5.b()).booleanValue();
                                                }
                                            } else {
                                                Y1.e eVar5 = (Y1.e) eVar3;
                                                if (eVar5 != null) {
                                                    return ((Boolean) eVar5.g(Float.valueOf(0.0f), Float.valueOf(floatValue2))).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 32768:
                                    Object obj16 = linkedHashMap.get(z0.h.p);
                                    C1076a c1076a11 = (C1076a) (obj16 != null ? obj16 : null);
                                    if (c1076a11 == null || (aVar7 = (Y1.a) c1076a11.f8943b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) aVar7.b()).booleanValue();
                                case 65536:
                                    Object obj17 = linkedHashMap.get(z0.h.f8971o);
                                    C1076a c1076a12 = (C1076a) (obj17 != null ? obj17 : null);
                                    if (c1076a12 == null || (aVar8 = (Y1.a) c1076a12.f8943b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) aVar8.b()).booleanValue();
                                case 262144:
                                    Object obj18 = linkedHashMap.get(z0.h.f8972q);
                                    C1076a c1076a13 = (C1076a) (obj18 != null ? obj18 : null);
                                    if (c1076a13 == null || (aVar9 = (Y1.a) c1076a13.f8943b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) aVar9.b()).booleanValue();
                                case 524288:
                                    Object obj19 = linkedHashMap.get(z0.h.f8973r);
                                    C1076a c1076a14 = (C1076a) (obj19 != null ? obj19 : null);
                                    if (c1076a14 == null || (aVar10 = (Y1.a) c1076a14.f8943b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) aVar10.b()).booleanValue();
                                case 1048576:
                                    Object obj20 = linkedHashMap.get(z0.h.f8974s);
                                    C1076a c1076a15 = (C1076a) (obj20 != null ? obj20 : null);
                                    if (c1076a15 == null || (aVar11 = (Y1.a) c1076a15.f8943b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) aVar11.b()).booleanValue();
                                case 2097152:
                                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                    Object obj21 = linkedHashMap.get(z0.h.f8965i);
                                    if (obj21 == null) {
                                        obj21 = null;
                                    }
                                    C1076a c1076a16 = (C1076a) obj21;
                                    if (c1076a16 == null || (cVar2 = (Y1.c) c1076a16.f8943b) == null) {
                                        return false;
                                    }
                                    if (string == null) {
                                        string = "";
                                    }
                                    return ((Boolean) cVar2.j(new C0007d(string, null, null, null))).booleanValue();
                                case R.id.accessibilityActionShowOnScreen:
                                    z0.n j4 = nVar.j();
                                    if (j4 != null) {
                                        Object obj22 = j4.f8991d.f8982d.get(z0.h.f8960d);
                                        if (obj22 == null) {
                                            obj22 = null;
                                        }
                                        c1076a3 = (C1076a) obj22;
                                        while (j4 != null && c1076a3 == null) {
                                            j4 = j4.j();
                                            if (j4 != null) {
                                                Object obj23 = j4.f8991d.f8982d.get(z0.h.f8960d);
                                                if (obj23 == null) {
                                                    obj23 = null;
                                                }
                                                c1076a3 = (C1076a) obj23;
                                            }
                                        }
                                        if (j4 == null) {
                                            return false;
                                        }
                                        D d4 = j4.f8990c;
                                        a0.d d5 = M.d((C0911t) d4.f7735x.f2353c);
                                        InterfaceC0838k t3 = ((C0911t) d4.f7735x.f2353c).t();
                                        a0.d e3 = d5.e(t3 != null ? ((a0) t3).K0(0L) : 0L);
                                        a0 c3 = nVar.c();
                                        if (c3 != null) {
                                            if (!c3.B0().p) {
                                                c3 = null;
                                            }
                                            if (c3 != null) {
                                                j3 = c3.K0(0L);
                                                a0 c4 = nVar.c();
                                                a0.d f12 = AbstractC0157a.f(j3, I2.l.R(c4 != null ? c4.f7116f : 0L));
                                                t tVar3 = z0.q.f9024o;
                                                LinkedHashMap linkedHashMap2 = j4.f8991d.f8982d;
                                                obj = linkedHashMap2.get(tVar3);
                                                if (obj == null) {
                                                    obj = null;
                                                }
                                                gVar = (z0.g) obj;
                                                Object obj24 = linkedHashMap2.get(z0.q.p);
                                                gVar2 = (z0.g) (obj24 != null ? obj24 : null);
                                                f5 = f12.f3491a - e3.f3491a;
                                                f6 = f12.f3493c - e3.f3493c;
                                                if (Math.signum(f5) == Math.signum(f6)) {
                                                    f5 = 0.0f;
                                                } else if (Math.abs(f5) >= Math.abs(f6)) {
                                                    f5 = f6;
                                                }
                                                if (gVar != null && gVar.f8956c) {
                                                    f5 = -f5;
                                                }
                                                if (L.i(nVar)) {
                                                    f5 = -f5;
                                                }
                                                float f13 = f12.f3492b - e3.f3492b;
                                                float f14 = f12.f3494d - e3.f3494d;
                                                f7 = Math.signum(f13) == Math.signum(f14) ? Math.abs(f13) < Math.abs(f14) ? f13 : f14 : 0.0f;
                                                if (gVar2 != null && gVar2.f8956c) {
                                                    f7 = -f7;
                                                }
                                                if (c1076a3 == null && (eVar = (Y1.e) c1076a3.f8943b) != null) {
                                                    return ((Boolean) eVar.g(Float.valueOf(f5), Float.valueOf(f7))).booleanValue();
                                                }
                                            }
                                        }
                                        j3 = 0;
                                        a0 c42 = nVar.c();
                                        a0.d f122 = AbstractC0157a.f(j3, I2.l.R(c42 != null ? c42.f7116f : 0L));
                                        t tVar32 = z0.q.f9024o;
                                        LinkedHashMap linkedHashMap22 = j4.f8991d.f8982d;
                                        obj = linkedHashMap22.get(tVar32);
                                        if (obj == null) {
                                        }
                                        gVar = (z0.g) obj;
                                        Object obj242 = linkedHashMap22.get(z0.q.p);
                                        gVar2 = (z0.g) (obj242 != null ? obj242 : null);
                                        f5 = f122.f3491a - e3.f3491a;
                                        f6 = f122.f3493c - e3.f3493c;
                                        if (Math.signum(f5) == Math.signum(f6)) {
                                        }
                                        if (gVar != null) {
                                            f5 = -f5;
                                        }
                                        if (L.i(nVar)) {
                                        }
                                        float f132 = f122.f3492b - e3.f3492b;
                                        float f142 = f122.f3494d - e3.f3494d;
                                        if (Math.signum(f132) == Math.signum(f142)) {
                                        }
                                        if (gVar2 != null) {
                                            f7 = -f7;
                                        }
                                        return c1076a3 == null ? false : false;
                                    }
                                    c1076a3 = null;
                                    break;
                                case R.id.accessibilityActionSetProgress:
                                    if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                        return false;
                                    }
                                    Object obj25 = linkedHashMap.get(z0.h.f8963g);
                                    C1076a c1076a17 = (C1076a) (obj25 != null ? obj25 : null);
                                    if (c1076a17 == null || (cVar3 = (Y1.c) c1076a17.f8943b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) cVar3.j(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                case R.id.accessibilityActionImeEnter:
                                    Object obj26 = linkedHashMap.get(z0.h.f8969m);
                                    C1076a c1076a18 = (C1076a) (obj26 != null ? obj26 : null);
                                    if (c1076a18 == null || (aVar12 = (Y1.a) c1076a18.f8943b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) aVar12.b()).booleanValue();
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
                                                    Object obj27 = linkedHashMap.get(z0.h.f8977v);
                                                    C1076a c1076a19 = (C1076a) (obj27 != null ? obj27 : null);
                                                    if (c1076a19 == null || (aVar13 = (Y1.a) c1076a19.f8943b) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) aVar13.b()).booleanValue();
                                                case R.id.accessibilityActionPageDown:
                                                    Object obj28 = linkedHashMap.get(z0.h.f8979x);
                                                    C1076a c1076a20 = (C1076a) (obj28 != null ? obj28 : null);
                                                    if (c1076a20 == null || (aVar14 = (Y1.a) c1076a20.f8943b) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) aVar14.b()).booleanValue();
                                                case R.id.accessibilityActionPageLeft:
                                                    Object obj29 = linkedHashMap.get(z0.h.f8978w);
                                                    C1076a c1076a21 = (C1076a) (obj29 != null ? obj29 : null);
                                                    if (c1076a21 == null || (aVar15 = (Y1.a) c1076a21.f8943b) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) aVar15.b()).booleanValue();
                                                case R.id.accessibilityActionPageRight:
                                                    Object obj30 = linkedHashMap.get(z0.h.f8980y);
                                                    C1076a c1076a22 = (C1076a) (obj30 != null ? obj30 : null);
                                                    if (c1076a22 == null || (aVar16 = (Y1.a) c1076a22.f8943b) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) aVar16.b()).booleanValue();
                                                default:
                                                    C0481G c0481g = (C0481G) c0959f.f8150s.b(i3);
                                                    if (c0481g == null || ((CharSequence) c0481g.b(i4)) == null) {
                                                        return false;
                                                    }
                                                    Object obj31 = linkedHashMap.get(z0.h.f8976u);
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
                            Object obj32 = linkedHashMap.get(z0.q.f9020k);
                            if (Z1.i.a(obj32 == null ? null : obj32, Boolean.TRUE)) {
                                ((androidx.compose.ui.focus.a) c0997t.getFocusOwner()).a(8, false, true);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (bundle != null) {
                    int i13 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                    boolean z12 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                    boolean z13 = i4 == 256;
                    Integer num2 = c0959f.f8153v;
                    if (num2 == null || i11 != num2.intValue()) {
                        c0959f.f8152u = -1;
                        c0959f.f8153v = Integer.valueOf(i11);
                    }
                    String p = C0959F.p(nVar);
                    if (p != null && p.length() != 0) {
                        String p3 = C0959F.p(nVar);
                        if (p3 != null && p3.length() != 0) {
                            if (i13 == 1) {
                                Locale locale = c0997t.getContext().getResources().getConfiguration().locale;
                                if (C0964c.f8311e == null) {
                                    C0964c c0964c = new C0964c(0);
                                    c0964c.f8315d = BreakIterator.getCharacterInstance(locale);
                                    C0964c.f8311e = c0964c;
                                }
                                C0964c c0964c2 = C0964c.f8311e;
                                Z1.i.d(c0964c2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                                c0964c2.f(p3);
                                abstractC0962b2 = c0964c2;
                            } else if (i13 != 2) {
                                if (i13 != 4) {
                                    if (i13 == 8) {
                                        if (C0968e.f8321c == null) {
                                            C0968e.f8321c = new C0968e();
                                        }
                                        C0968e c0968e = C0968e.f8321c;
                                        Z1.i.d(c0968e, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                                        c0968e.f8289a = p3;
                                        abstractC0962b2 = c0968e;
                                    }
                                }
                                if (linkedHashMap.containsKey(z0.h.f8957a) && (n3 = L.n(iVar)) != null) {
                                    if (i13 == 4) {
                                        if (C0964c.f8313g == null) {
                                            C0964c.f8313g = new C0964c(2);
                                        }
                                        C0964c c0964c3 = C0964c.f8313g;
                                        Z1.i.d(c0964c3, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                                        c0964c3.f8289a = p3;
                                        c0964c3.f8315d = n3;
                                        c0966d = c0964c3;
                                    } else {
                                        if (C0966d.f8316e == null) {
                                            C0966d c0966d2 = new C0966d();
                                            new Rect();
                                            C0966d.f8316e = c0966d2;
                                        }
                                        C0966d c0966d3 = C0966d.f8316e;
                                        Z1.i.d(c0966d3, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                                        c0966d3.f8289a = p3;
                                        c0966d3.f8317c = n3;
                                        c0966d3.f8318d = nVar;
                                        c0966d = c0966d3;
                                    }
                                    abstractC0962b = c0966d;
                                    if (abstractC0962b != null) {
                                        int j5 = c0959f.j(nVar);
                                        if (j5 == -1) {
                                            j5 = z13 ? 0 : p.length();
                                        }
                                        int[] a3 = z13 ? abstractC0962b.a(j5) : abstractC0962b.d(j5);
                                        if (a3 != null) {
                                            int i14 = a3[0];
                                            int i15 = a3[1];
                                            if (z12 && !linkedHashMap.containsKey(z0.q.f9010a) && linkedHashMap.containsKey(z0.q.f9031w)) {
                                                i6 = c0959f.k(nVar);
                                                if (i6 == -1) {
                                                    i6 = z13 ? i14 : i15;
                                                }
                                                i7 = z13 ? i15 : i14;
                                            } else {
                                                i6 = z13 ? i15 : i14;
                                                i7 = i6;
                                            }
                                            c0959f.f8157z = new C0954A(nVar, z13 ? 256 : 512, i13, i14, i15, SystemClock.uptimeMillis());
                                            c0959f.G(nVar, i6, i7, true);
                                            return true;
                                        }
                                    }
                                    return false;
                                }
                            } else {
                                Locale locale2 = c0997t.getContext().getResources().getConfiguration().locale;
                                if (C0964c.f8312f == null) {
                                    C0964c c0964c4 = new C0964c(1);
                                    c0964c4.f8315d = BreakIterator.getWordInstance(locale2);
                                    C0964c.f8312f = c0964c4;
                                }
                                C0964c c0964c5 = C0964c.f8312f;
                                Z1.i.d(c0964c5, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                                c0964c5.f(p3);
                                abstractC0962b2 = c0964c5;
                            }
                            abstractC0962b = abstractC0962b2;
                            if (abstractC0962b != null) {
                            }
                            return false;
                        }
                        abstractC0962b = null;
                        if (abstractC0962b != null) {
                        }
                        return false;
                    }
                }
                z3 = false;
            } else {
                z3 = false;
                if (c0959f.f8146n == i3) {
                    c0959f.f8146n = Integer.MIN_VALUE;
                    c0959f.f8147o = null;
                    c0997t.invalidate();
                    C0959F.A(c0959f, i3, 65536, null, 12);
                    return true;
                }
            }
        }
        return z3;
    }
}
