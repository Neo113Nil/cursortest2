package b1;

import A0.C0036g;
import A0.I;
import android.R;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import i.H;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0960V;
import p0.InterfaceC0980p;
import q.C0999C;
import r0.C1078t;
import r0.E;
import r0.a0;
import s0.AbstractC1125K;
import s0.AbstractC1133b;
import s0.C1118D;
import s0.C1135c;
import s0.C1137d;
import s0.C1139e;
import s0.C1166s;
import s0.K0;
import y0.C1317a;
import y0.q;
import y0.t;
import y2.InterfaceC1332g;

/* renamed from: b1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0509i extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final l2.g f5628a;

    public C0509i(l2.g gVar) {
        this.f5628a = gVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        ((C1118D) this.f5628a.f7977c).b(i2, new C0508h(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        C0508h f4 = this.f5628a.f(i2);
        if (f4 == null) {
            return null;
        }
        return f4.f5625a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i2) {
        this.f5628a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        l2.g gVar = this.f5628a;
        C0508h f4 = gVar.f(((C1118D) gVar.f7977c).f10021n);
        if (f4 == null) {
            return null;
        }
        return f4.f5625a;
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
    public final boolean performAction(int i2, int i4, Bundle bundle) {
        boolean z4;
        y0.n nVar;
        int i5;
        AbstractC1133b abstractC1133b;
        int i6;
        int i7;
        AbstractC1133b abstractC1133b2;
        I g4;
        C1137d c1137d;
        Function0 function0;
        int i8;
        int i9;
        Function0 function02;
        int i10;
        Integer num;
        Boolean bool;
        Function0 function03;
        Function0 function04;
        float f4;
        int i11;
        C1317a c1317a;
        Function0 function05;
        C1317a c1317a2;
        Function0 function06;
        Function1 function1;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        Function0 function010;
        Function0 function011;
        Function1 function12;
        C1317a c1317a3;
        long j4;
        Object obj;
        y0.g gVar;
        y0.g gVar2;
        float f5;
        float f6;
        float f7;
        Function2 function2;
        Function1 function13;
        Function0 function012;
        Function0 function013;
        Function0 function014;
        Function0 function015;
        Function0 function016;
        C1118D c1118d = (C1118D) this.f5628a.f7977c;
        K0 k02 = (K0) c1118d.l().f(i2);
        if (k02 == null || (nVar = k02.f10067a) == null) {
            z4 = false;
        } else {
            C1166s c1166s = c1118d.f10011d;
            if (i4 == 64) {
                z4 = false;
                AccessibilityManager accessibilityManager = c1118d.f10014g;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i5 = c1118d.f10021n) != i2) {
                    if (i5 != Integer.MIN_VALUE) {
                        C1118D.A(c1118d, i5, 65536, null, 12);
                    }
                    c1118d.f10021n = i2;
                    c1166s.invalidate();
                    C1118D.A(c1118d, i2, 32768, null, 12);
                    return true;
                }
            } else if (i4 != 128) {
                y0.i iVar = nVar.f11587d;
                int i12 = nVar.f11590g;
                LinkedHashMap linkedHashMap = iVar.f11576d;
                if (i4 != 256 && i4 != 512) {
                    if (i4 == 16384) {
                        Object obj2 = linkedHashMap.get(y0.h.f11564o);
                        C1317a c1317a4 = (C1317a) (obj2 == null ? null : obj2);
                        if (c1317a4 != null && (function0 = (Function0) c1317a4.f11536b) != null) {
                            return ((Boolean) function0.invoke()).booleanValue();
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
                            boolean G3 = c1118d.G(nVar, i9, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", i8) : -1, false);
                            if (G3) {
                                C1118D.A(c1118d, c1118d.w(i12), 0, null, 12);
                            }
                            return G3;
                        }
                        if (!AbstractC1125K.a(nVar)) {
                            return false;
                        }
                        if (i4 == 1) {
                            Object obj3 = linkedHashMap.get(y0.h.f11570u);
                            C1317a c1317a5 = (C1317a) (obj3 == null ? null : obj3);
                            if (c1317a5 != null && (function02 = (Function0) c1317a5.f11536b) != null) {
                                return ((Boolean) function02.invoke()).booleanValue();
                            }
                        } else if (i4 != 2) {
                            switch (i4) {
                                case 16:
                                    Object obj4 = linkedHashMap.get(y0.h.f11551b);
                                    if (obj4 == null) {
                                        obj4 = null;
                                    }
                                    C1317a c1317a6 = (C1317a) obj4;
                                    if (c1317a6 == null || (function03 = (Function0) c1317a6.f11536b) == null) {
                                        i10 = 12;
                                        num = null;
                                        bool = null;
                                    } else {
                                        bool = (Boolean) function03.invoke();
                                        i10 = 12;
                                        num = null;
                                    }
                                    C1118D.A(c1118d, i2, 1, num, i10);
                                    if (bool != null) {
                                        return bool.booleanValue();
                                    }
                                    break;
                                case 32:
                                    Object obj5 = linkedHashMap.get(y0.h.f11552c);
                                    C1317a c1317a7 = (C1317a) (obj5 == null ? null : obj5);
                                    if (c1317a7 != null && (function04 = (Function0) c1317a7.f11536b) != null) {
                                        return ((Boolean) function04.invoke()).booleanValue();
                                    }
                                    break;
                                case 4096:
                                case 8192:
                                    boolean z5 = i4 == 4096;
                                    boolean z6 = i4 == 8192;
                                    boolean z7 = i4 == 16908345;
                                    boolean z8 = i4 == 16908347;
                                    boolean z9 = i4 == 16908344;
                                    boolean z10 = i4 == 16908346;
                                    boolean z11 = z7 || z8 || z5 || z6;
                                    boolean z12 = z9 || z10 || z5 || z6;
                                    if (z5 || z6) {
                                        Object obj6 = linkedHashMap.get(q.f11614c);
                                        if (obj6 == null) {
                                            obj6 = null;
                                        }
                                        y0.e eVar = (y0.e) obj6;
                                        Object obj7 = linkedHashMap.get(y0.h.f11556g);
                                        if (obj7 == null) {
                                            obj7 = null;
                                        }
                                        C1317a c1317a8 = (C1317a) obj7;
                                        if (eVar != null && c1317a8 != null) {
                                            float a4 = kotlin.ranges.b.a(0.0f, 0.0f);
                                            float b4 = kotlin.ranges.b.b(0.0f, 0.0f);
                                            int i13 = eVar.f11544b;
                                            if (i13 > 0) {
                                                f4 = a4 - b4;
                                                i11 = i13 + 1;
                                            } else {
                                                f4 = a4 - b4;
                                                i11 = 20;
                                            }
                                            float f8 = f4 / i11;
                                            if (z6) {
                                                f8 = -f8;
                                            }
                                            Function1 function14 = (Function1) c1317a8.f11536b;
                                            if (function14 != null) {
                                                return ((Boolean) function14.invoke(Float.valueOf(0.0f + f8))).booleanValue();
                                            }
                                            return false;
                                        }
                                    }
                                    Y.d d4 = AbstractC0960V.d((C1078t) nVar.f11586c.B.f2909c);
                                    long N3 = u3.l.N(d4.c(), d4.b());
                                    ArrayList arrayList = new ArrayList();
                                    Object obj8 = linkedHashMap.get(y0.h.f11549A);
                                    if (obj8 == null) {
                                        obj8 = null;
                                    }
                                    C1317a c1317a9 = (C1317a) obj8;
                                    Float f9 = (c1317a9 == null || (function1 = (Function1) c1317a9.f11536b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                    Object obj9 = linkedHashMap.get(y0.h.f11553d);
                                    if (obj9 == null) {
                                        obj9 = null;
                                    }
                                    C1317a c1317a10 = (C1317a) obj9;
                                    if (c1317a10 == null) {
                                        return false;
                                    }
                                    Object obj10 = linkedHashMap.get(q.f11626o);
                                    if (obj10 == null) {
                                        obj10 = null;
                                    }
                                    y0.g gVar3 = (y0.g) obj10;
                                    InterfaceC1332g interfaceC1332g = c1317a10.f11536b;
                                    if (gVar3 != null && z11) {
                                        float floatValue = f9 != null ? f9.floatValue() : Y.f.d(N3);
                                        if (z7 || z6) {
                                            floatValue = -floatValue;
                                        }
                                        if (gVar3.f11548c) {
                                            floatValue = -floatValue;
                                        }
                                        if (AbstractC1125K.b(nVar) && (z7 || z8)) {
                                            floatValue = -floatValue;
                                        }
                                        if (C1118D.t(gVar3, floatValue)) {
                                            t tVar = y0.h.f11573x;
                                            if (linkedHashMap.containsKey(tVar) || linkedHashMap.containsKey(y0.h.f11575z)) {
                                                if (floatValue > 0.0f) {
                                                    Object obj11 = linkedHashMap.get(y0.h.f11575z);
                                                    c1317a2 = (C1317a) (obj11 == null ? null : obj11);
                                                } else {
                                                    Object obj12 = linkedHashMap.get(tVar);
                                                    c1317a2 = (C1317a) (obj12 == null ? null : obj12);
                                                }
                                                if (c1317a2 != null && (function06 = (Function0) c1317a2.f11536b) != null) {
                                                    return ((Boolean) function06.invoke()).booleanValue();
                                                }
                                            } else {
                                                Function2 function22 = (Function2) interfaceC1332g;
                                                if (function22 != null) {
                                                    return ((Boolean) function22.h(Float.valueOf(floatValue), Float.valueOf(0.0f))).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                    Object obj13 = linkedHashMap.get(q.f11627p);
                                    if (obj13 == null) {
                                        obj13 = null;
                                    }
                                    y0.g gVar4 = (y0.g) obj13;
                                    if (gVar4 != null && z12) {
                                        float floatValue2 = f9 != null ? f9.floatValue() : Y.f.b(N3);
                                        if (z9 || z6) {
                                            floatValue2 = -floatValue2;
                                        }
                                        if (gVar4.f11548c) {
                                            floatValue2 = -floatValue2;
                                        }
                                        if (C1118D.t(gVar4, floatValue2)) {
                                            t tVar2 = y0.h.f11572w;
                                            if (linkedHashMap.containsKey(tVar2) || linkedHashMap.containsKey(y0.h.f11574y)) {
                                                if (floatValue2 > 0.0f) {
                                                    Object obj14 = linkedHashMap.get(y0.h.f11574y);
                                                    c1317a = (C1317a) (obj14 == null ? null : obj14);
                                                } else {
                                                    Object obj15 = linkedHashMap.get(tVar2);
                                                    c1317a = (C1317a) (obj15 == null ? null : obj15);
                                                }
                                                if (c1317a != null && (function05 = (Function0) c1317a.f11536b) != null) {
                                                    return ((Boolean) function05.invoke()).booleanValue();
                                                }
                                            } else {
                                                Function2 function23 = (Function2) interfaceC1332g;
                                                if (function23 != null) {
                                                    return ((Boolean) function23.h(Float.valueOf(0.0f), Float.valueOf(floatValue2))).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 32768:
                                    Object obj16 = linkedHashMap.get(y0.h.f11566q);
                                    C1317a c1317a11 = (C1317a) (obj16 != null ? obj16 : null);
                                    if (c1317a11 == null || (function07 = (Function0) c1317a11.f11536b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function07.invoke()).booleanValue();
                                case 65536:
                                    Object obj17 = linkedHashMap.get(y0.h.f11565p);
                                    C1317a c1317a12 = (C1317a) (obj17 != null ? obj17 : null);
                                    if (c1317a12 == null || (function08 = (Function0) c1317a12.f11536b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function08.invoke()).booleanValue();
                                case 262144:
                                    Object obj18 = linkedHashMap.get(y0.h.f11567r);
                                    C1317a c1317a13 = (C1317a) (obj18 != null ? obj18 : null);
                                    if (c1317a13 == null || (function09 = (Function0) c1317a13.f11536b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function09.invoke()).booleanValue();
                                case 524288:
                                    Object obj19 = linkedHashMap.get(y0.h.f11568s);
                                    C1317a c1317a14 = (C1317a) (obj19 != null ? obj19 : null);
                                    if (c1317a14 == null || (function010 = (Function0) c1317a14.f11536b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function010.invoke()).booleanValue();
                                case 1048576:
                                    Object obj20 = linkedHashMap.get(y0.h.f11569t);
                                    C1317a c1317a15 = (C1317a) (obj20 != null ? obj20 : null);
                                    if (c1317a15 == null || (function011 = (Function0) c1317a15.f11536b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function011.invoke()).booleanValue();
                                case 2097152:
                                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                    Object obj21 = linkedHashMap.get(y0.h.f11558i);
                                    if (obj21 == null) {
                                        obj21 = null;
                                    }
                                    C1317a c1317a16 = (C1317a) obj21;
                                    if (c1317a16 == null || (function12 = (Function1) c1317a16.f11536b) == null) {
                                        return false;
                                    }
                                    if (string == null) {
                                        string = "";
                                    }
                                    return ((Boolean) function12.invoke(new C0036g(string, null, 6))).booleanValue();
                                case R.id.accessibilityActionShowOnScreen:
                                    y0.n j5 = nVar.j();
                                    if (j5 != null) {
                                        Object obj22 = j5.f11587d.f11576d.get(y0.h.f11553d);
                                        if (obj22 == null) {
                                            obj22 = null;
                                        }
                                        c1317a3 = (C1317a) obj22;
                                        while (j5 != null && c1317a3 == null) {
                                            j5 = j5.j();
                                            if (j5 != null) {
                                                Object obj23 = j5.f11587d.f11576d.get(y0.h.f11553d);
                                                if (obj23 == null) {
                                                    obj23 = null;
                                                }
                                                c1317a3 = (C1317a) obj23;
                                            }
                                        }
                                        if (j5 == null) {
                                            return false;
                                        }
                                        E e4 = j5.f11586c;
                                        Y.d d5 = AbstractC0960V.d((C1078t) e4.B.f2909c);
                                        InterfaceC0980p x2 = ((C1078t) e4.B.f2909c).x();
                                        Y.d h4 = d5.h(x2 != null ? ((a0) x2).Q(0L) : 0L);
                                        a0 c4 = nVar.c();
                                        if (c4 != null) {
                                            if (!c4.O0().f3990s) {
                                                c4 = null;
                                            }
                                            if (c4 != null) {
                                                j4 = c4.Q(0L);
                                                a0 c5 = nVar.c();
                                                Y.d h5 = j0.c.h(j4, u3.d.U(c5 != null ? c5.f9007i : 0L));
                                                t tVar3 = q.f11626o;
                                                LinkedHashMap linkedHashMap2 = j5.f11587d.f11576d;
                                                obj = linkedHashMap2.get(tVar3);
                                                if (obj == null) {
                                                    obj = null;
                                                }
                                                gVar = (y0.g) obj;
                                                Object obj24 = linkedHashMap2.get(q.f11627p);
                                                gVar2 = (y0.g) (obj24 != null ? obj24 : null);
                                                f5 = h5.f4374a - h4.f4374a;
                                                f6 = h5.f4376c - h4.f4376c;
                                                if (Math.signum(f5) == Math.signum(f6)) {
                                                    f5 = 0.0f;
                                                } else if (Math.abs(f5) >= Math.abs(f6)) {
                                                    f5 = f6;
                                                }
                                                if (gVar != null && gVar.f11548c) {
                                                    f5 = -f5;
                                                }
                                                if (AbstractC1125K.b(nVar)) {
                                                    f5 = -f5;
                                                }
                                                float f10 = h5.f4375b - h4.f4375b;
                                                float f11 = h5.f4377d - h4.f4377d;
                                                f7 = Math.signum(f10) == Math.signum(f11) ? Math.abs(f10) < Math.abs(f11) ? f10 : f11 : 0.0f;
                                                if (gVar2 != null && gVar2.f11548c) {
                                                    f7 = -f7;
                                                }
                                                if (c1317a3 == null && (function2 = (Function2) c1317a3.f11536b) != null) {
                                                    return ((Boolean) function2.h(Float.valueOf(f5), Float.valueOf(f7))).booleanValue();
                                                }
                                            }
                                        }
                                        j4 = 0;
                                        a0 c52 = nVar.c();
                                        Y.d h52 = j0.c.h(j4, u3.d.U(c52 != null ? c52.f9007i : 0L));
                                        t tVar32 = q.f11626o;
                                        LinkedHashMap linkedHashMap22 = j5.f11587d.f11576d;
                                        obj = linkedHashMap22.get(tVar32);
                                        if (obj == null) {
                                        }
                                        gVar = (y0.g) obj;
                                        Object obj242 = linkedHashMap22.get(q.f11627p);
                                        gVar2 = (y0.g) (obj242 != null ? obj242 : null);
                                        f5 = h52.f4374a - h4.f4374a;
                                        f6 = h52.f4376c - h4.f4376c;
                                        if (Math.signum(f5) == Math.signum(f6)) {
                                        }
                                        if (gVar != null) {
                                            f5 = -f5;
                                        }
                                        if (AbstractC1125K.b(nVar)) {
                                        }
                                        float f102 = h52.f4375b - h4.f4375b;
                                        float f112 = h52.f4377d - h4.f4377d;
                                        if (Math.signum(f102) == Math.signum(f112)) {
                                        }
                                        if (gVar2 != null) {
                                            f7 = -f7;
                                        }
                                        return c1317a3 == null ? false : false;
                                    }
                                    c1317a3 = null;
                                    break;
                                case R.id.accessibilityActionSetProgress:
                                    if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                        return false;
                                    }
                                    Object obj25 = linkedHashMap.get(y0.h.f11556g);
                                    C1317a c1317a17 = (C1317a) (obj25 != null ? obj25 : null);
                                    if (c1317a17 == null || (function13 = (Function1) c1317a17.f11536b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function13.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                case R.id.accessibilityActionImeEnter:
                                    Object obj26 = linkedHashMap.get(y0.h.f11563n);
                                    C1317a c1317a18 = (C1317a) (obj26 != null ? obj26 : null);
                                    if (c1317a18 == null || (function012 = (Function0) c1317a18.f11536b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function012.invoke()).booleanValue();
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
                                                    Object obj27 = linkedHashMap.get(y0.h.f11572w);
                                                    C1317a c1317a19 = (C1317a) (obj27 != null ? obj27 : null);
                                                    if (c1317a19 == null || (function013 = (Function0) c1317a19.f11536b) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) function013.invoke()).booleanValue();
                                                case R.id.accessibilityActionPageDown:
                                                    Object obj28 = linkedHashMap.get(y0.h.f11574y);
                                                    C1317a c1317a20 = (C1317a) (obj28 != null ? obj28 : null);
                                                    if (c1317a20 == null || (function014 = (Function0) c1317a20.f11536b) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) function014.invoke()).booleanValue();
                                                case R.id.accessibilityActionPageLeft:
                                                    Object obj29 = linkedHashMap.get(y0.h.f11573x);
                                                    C1317a c1317a21 = (C1317a) (obj29 != null ? obj29 : null);
                                                    if (c1317a21 == null || (function015 = (Function0) c1317a21.f11536b) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) function015.invoke()).booleanValue();
                                                case R.id.accessibilityActionPageRight:
                                                    Object obj30 = linkedHashMap.get(y0.h.f11575z);
                                                    C1317a c1317a22 = (C1317a) (obj30 != null ? obj30 : null);
                                                    if (c1317a22 == null || (function016 = (Function0) c1317a22.f11536b) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) function016.invoke()).booleanValue();
                                                default:
                                                    H h6 = (H) c1118d.f10026s.b(i2);
                                                    if (h6 == null || ((CharSequence) h6.b(i4)) == null) {
                                                        return false;
                                                    }
                                                    Object obj31 = linkedHashMap.get(y0.h.f11571v);
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
                            Object obj32 = linkedHashMap.get(q.f11622k);
                            if (Intrinsics.a(obj32 == null ? null : obj32, Boolean.TRUE)) {
                                ((androidx.compose.ui.focus.b) c1166s.getFocusOwner()).a(8, false, true);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (bundle != null) {
                    int i14 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                    boolean z13 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                    boolean z14 = i4 == 256;
                    Integer num2 = c1118d.f10029v;
                    if (num2 == null || i12 != num2.intValue()) {
                        c1118d.f10028u = -1;
                        c1118d.f10029v = Integer.valueOf(i12);
                    }
                    String p4 = C1118D.p(nVar);
                    if (p4 != null && p4.length() != 0) {
                        String p5 = C1118D.p(nVar);
                        if (p5 != null && p5.length() != 0) {
                            if (i14 == 1) {
                                Locale locale = c1166s.getContext().getResources().getConfiguration().locale;
                                if (C1135c.f10176e == null) {
                                    C1135c c1135c = new C1135c(0);
                                    c1135c.f10180d = BreakIterator.getCharacterInstance(locale);
                                    C1135c.f10176e = c1135c;
                                }
                                C1135c c1135c2 = C1135c.f10176e;
                                Intrinsics.d(c1135c2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                                c1135c2.f(p5);
                                abstractC1133b2 = c1135c2;
                            } else if (i14 != 2) {
                                if (i14 != 4) {
                                    if (i14 == 8) {
                                        if (C1139e.f10196c == null) {
                                            C1139e.f10196c = new C1139e();
                                        }
                                        C1139e c1139e = C1139e.f10196c;
                                        Intrinsics.d(c1139e, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                                        c1139e.f10173a = p5;
                                        abstractC1133b2 = c1139e;
                                    }
                                }
                                if (linkedHashMap.containsKey(y0.h.f11550a) && (g4 = AbstractC1125K.g(iVar)) != null) {
                                    if (i14 == 4) {
                                        if (C1135c.f10178g == null) {
                                            C1135c.f10178g = new C1135c(2);
                                        }
                                        C1135c c1135c3 = C1135c.f10178g;
                                        Intrinsics.d(c1135c3, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                                        c1135c3.f10173a = p5;
                                        c1135c3.f10180d = g4;
                                        c1137d = c1135c3;
                                    } else {
                                        if (C1137d.f10186e == null) {
                                            C1137d c1137d2 = new C1137d();
                                            new Rect();
                                            C1137d.f10186e = c1137d2;
                                        }
                                        C1137d c1137d3 = C1137d.f10186e;
                                        Intrinsics.d(c1137d3, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                                        c1137d3.f10173a = p5;
                                        c1137d3.f10187c = g4;
                                        c1137d3.f10188d = nVar;
                                        c1137d = c1137d3;
                                    }
                                    abstractC1133b = c1137d;
                                    if (abstractC1133b != null) {
                                        int j6 = c1118d.j(nVar);
                                        if (j6 == -1) {
                                            j6 = z14 ? 0 : p4.length();
                                        }
                                        int[] a5 = z14 ? abstractC1133b.a(j6) : abstractC1133b.d(j6);
                                        if (a5 != null) {
                                            int i15 = a5[0];
                                            int i16 = a5[1];
                                            if (z13 && !linkedHashMap.containsKey(q.f11612a) && linkedHashMap.containsKey(q.f11635x)) {
                                                i6 = c1118d.k(nVar);
                                                if (i6 == -1) {
                                                    i6 = z14 ? i15 : i16;
                                                }
                                                i7 = z14 ? i16 : i15;
                                            } else {
                                                i6 = z14 ? i16 : i15;
                                                i7 = i6;
                                            }
                                            c1118d.f10033z = new C0999C(nVar, z14 ? 256 : 512, i14, i15, i16, SystemClock.uptimeMillis());
                                            c1118d.G(nVar, i6, i7, true);
                                            return true;
                                        }
                                    }
                                    return false;
                                }
                            } else {
                                Locale locale2 = c1166s.getContext().getResources().getConfiguration().locale;
                                if (C1135c.f10177f == null) {
                                    C1135c c1135c4 = new C1135c(1);
                                    c1135c4.f10180d = BreakIterator.getWordInstance(locale2);
                                    C1135c.f10177f = c1135c4;
                                }
                                C1135c c1135c5 = C1135c.f10177f;
                                Intrinsics.d(c1135c5, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                                c1135c5.f(p5);
                                abstractC1133b2 = c1135c5;
                            }
                            abstractC1133b = abstractC1133b2;
                            if (abstractC1133b != null) {
                            }
                            return false;
                        }
                        abstractC1133b = null;
                        if (abstractC1133b != null) {
                        }
                        return false;
                    }
                }
                z4 = false;
            } else {
                z4 = false;
                if (c1118d.f10021n == i2) {
                    c1118d.f10021n = Integer.MIN_VALUE;
                    c1118d.f10022o = null;
                    c1166s.invalidate();
                    C1118D.A(c1118d, i2, 65536, null, 12);
                    return true;
                }
            }
        }
        return z4;
    }
}
