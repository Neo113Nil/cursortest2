package c3;

import a2.h0;
import android.R;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import p1.s0;
import r1.a1;
import r1.d0;
import r1.t;
import s1.c0;
import s1.g2;
import s1.j0;
import s1.y;
import y1.s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class j extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final q5.g f1658a;

    public j(q5.g gVar) {
        this.f1658a = gVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        i h3 = this.f1658a.h(i7);
        if (h3 == null) {
            return null;
        }
        return h3.f1655a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i7) {
        this.f1658a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i7) {
        q5.g gVar = this.f1658a;
        i h3 = gVar.h(((c0) gVar.f7528h).f8170n);
        if (h3 == null) {
            return null;
        }
        return h3.f1655a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0189, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x066f, code lost:
    
        if (r0 != 16) goto L469;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x072b  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAction(int i7, int i8, Bundle bundle) {
        boolean z8;
        y1.m mVar;
        int i9;
        int i10;
        Integer num;
        s1.b bVar;
        int i11;
        int i12;
        h0 r8;
        q6.a aVar;
        q6.a aVar2;
        q6.a aVar3;
        q6.a aVar4;
        y1.a aVar5;
        q6.a aVar6;
        y1.a aVar7;
        q6.a aVar8;
        q6.c cVar;
        q6.a aVar9;
        q6.a aVar10;
        q6.a aVar11;
        q6.a aVar12;
        q6.a aVar13;
        q6.c cVar2;
        y1.a aVar14;
        long j8;
        Object obj;
        float f9;
        float f10;
        float f11;
        float f12;
        q6.e eVar;
        q6.c cVar3;
        q6.a aVar15;
        q6.a aVar16;
        q6.a aVar17;
        q6.a aVar18;
        q6.a aVar19;
        c0 c0Var = (c0) this.f1658a.f7528h;
        Float valueOf = Float.valueOf(0.0f);
        s1.r rVar = c0Var.f8160d;
        g2 g2Var = (g2) c0Var.l().f(i7);
        if (g2Var != null && (mVar = g2Var.f8236a) != null) {
            int i13 = mVar.f9843g;
            y1.i iVar = mVar.f9840d;
            LinkedHashMap linkedHashMap = iVar.f9832f;
            boolean z9 = true;
            if (i8 == 64) {
                z8 = false;
                AccessibilityManager accessibilityManager = c0Var.f8163g;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i9 = c0Var.f8170n) != i7) {
                    if (i9 != Integer.MIN_VALUE) {
                        i10 = 12;
                        num = null;
                        c0.z(c0Var, i9, 65536, null, 12);
                    } else {
                        i10 = 12;
                        num = null;
                    }
                    c0Var.f8170n = i7;
                    rVar.invalidate();
                    c0.z(c0Var, i7, 32768, num, i10);
                    return true;
                }
                return z8;
            }
            if (i8 == 128) {
                z8 = false;
                if (c0Var.f8170n == i7) {
                    c0Var.f8170n = Integer.MIN_VALUE;
                    c0Var.f8171o = null;
                    rVar.invalidate();
                    c0.z(c0Var, i7, 65536, null, 12);
                }
                return z8;
            }
            if (i8 == 256 || i8 == 512) {
                if (bundle != null) {
                    int i14 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                    boolean z10 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                    boolean z11 = i8 == 256;
                    Integer num2 = c0Var.f8178v;
                    if (num2 == null || i13 != num2.intValue()) {
                        c0Var.f8177u = -1;
                        c0Var.f8178v = Integer.valueOf(i13);
                    }
                    String o2 = c0.o(mVar);
                    if (o2 != null && o2.length() != 0) {
                        String o6 = c0.o(mVar);
                        if (o6 != null && o6.length() != 0) {
                            if (i14 == 1) {
                                Locale locale = rVar.getContext().getResources().getConfiguration().locale;
                                if (s1.c.f8155e == null) {
                                    s1.c cVar4 = new s1.c(0);
                                    cVar4.f8159d = BreakIterator.getCharacterInstance(locale);
                                    s1.c.f8155e = cVar4;
                                }
                                s1.c cVar5 = s1.c.f8155e;
                                r6.k.d(cVar5, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                                cVar5.f(o6);
                                bVar = cVar5;
                            } else if (i14 != 2) {
                                if (i14 != 4) {
                                    if (i14 == 8) {
                                        if (s1.e.f8200c == null) {
                                            s1.e.f8200c = new s1.e();
                                        }
                                        s1.e eVar2 = s1.e.f8200c;
                                        r6.k.d(eVar2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                                        eVar2.f8135a = o6;
                                        bVar = eVar2;
                                    }
                                }
                                if (linkedHashMap.containsKey(y1.h.f9806a) && (r8 = j0.r(iVar)) != null) {
                                    if (i14 == 4) {
                                        if (s1.c.f8157g == null) {
                                            s1.c.f8157g = new s1.c(2);
                                        }
                                        s1.c cVar6 = s1.c.f8157g;
                                        r6.k.d(cVar6, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                                        cVar6.f8135a = o6;
                                        cVar6.f8159d = r8;
                                        bVar = cVar6;
                                    } else {
                                        if (s1.d.f8193e == null) {
                                            s1.d dVar = new s1.d();
                                            new Rect();
                                            s1.d.f8193e = dVar;
                                        }
                                        s1.d dVar2 = s1.d.f8193e;
                                        r6.k.d(dVar2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                                        dVar2.f8135a = o6;
                                        dVar2.f8194c = r8;
                                        dVar2.f8195d = mVar;
                                        bVar = dVar2;
                                    }
                                }
                            } else {
                                Locale locale2 = rVar.getContext().getResources().getConfiguration().locale;
                                if (s1.c.f8156f == null) {
                                    s1.c cVar7 = new s1.c(1);
                                    cVar7.f8159d = BreakIterator.getWordInstance(locale2);
                                    s1.c.f8156f = cVar7;
                                }
                                s1.c cVar8 = s1.c.f8156f;
                                r6.k.d(cVar8, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                                cVar8.f(o6);
                                bVar = cVar8;
                            }
                            if (bVar != null) {
                                int j9 = c0Var.j(mVar);
                                if (j9 == -1) {
                                    j9 = z11 ? 0 : o2.length();
                                }
                                int[] a3 = z11 ? bVar.a(j9) : bVar.d(j9);
                                if (a3 != null) {
                                    int i15 = a3[0];
                                    int i16 = a3[1];
                                    if (z10 && !linkedHashMap.containsKey(y1.p.f9859a) && linkedHashMap.containsKey(y1.p.f9882x)) {
                                        i11 = c0Var.k(mVar);
                                        if (i11 == -1) {
                                            i11 = z11 ? i15 : i16;
                                        }
                                        i12 = z11 ? i16 : i15;
                                    } else {
                                        i11 = z11 ? i16 : i15;
                                        i12 = i11;
                                    }
                                    c0Var.f8182z = new y(mVar, z11 ? 256 : 512, i14, i15, i16, SystemClock.uptimeMillis());
                                    c0Var.F(mVar, i11, i12, true);
                                }
                            }
                        }
                        bVar = null;
                        if (bVar != null) {
                        }
                    }
                }
            } else if (i8 == 16384) {
                Object obj2 = linkedHashMap.get(y1.h.f9820o);
                y1.a aVar20 = (y1.a) (obj2 == null ? null : obj2);
                if (aVar20 != null && (aVar = (q6.a) aVar20.f9794b) != null) {
                    return ((Boolean) aVar.a()).booleanValue();
                }
            } else {
                if (i8 == 131072) {
                    boolean F = c0Var.F(mVar, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                    if (F) {
                        c0.z(c0Var, c0Var.v(i13), 0, null, 12);
                    }
                    return F;
                }
                if (j0.l(mVar)) {
                    if (i8 == 1) {
                        Object obj3 = linkedHashMap.get(y1.h.f9826u);
                        y1.a aVar21 = (y1.a) (obj3 == null ? null : obj3);
                        if (aVar21 != null && (aVar2 = (q6.a) aVar21.f9794b) != null) {
                            return ((Boolean) aVar2.a()).booleanValue();
                        }
                    } else if (i8 != 2) {
                        switch (i8) {
                            case 16:
                                Object obj4 = linkedHashMap.get(y1.h.f9807b);
                                if (obj4 == null) {
                                    obj4 = null;
                                }
                                y1.a aVar22 = (y1.a) obj4;
                                Boolean bool = (aVar22 == null || (aVar3 = (q6.a) aVar22.f9794b) == null) ? null : (Boolean) aVar3.a();
                                c0.z(c0Var, i7, 1, null, 12);
                                if (bool != null) {
                                    return bool.booleanValue();
                                }
                                break;
                            case 32:
                                Object obj5 = linkedHashMap.get(y1.h.f9808c);
                                y1.a aVar23 = (y1.a) (obj5 == null ? null : obj5);
                                if (aVar23 != null && (aVar4 = (q6.a) aVar23.f9794b) != null) {
                                    return ((Boolean) aVar4.a()).booleanValue();
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
                                if (!z16 && !z17 && !z12 && !z13) {
                                    z9 = false;
                                }
                                if (z12 || z13) {
                                    Object obj6 = linkedHashMap.get(y1.p.f9861c);
                                    if (obj6 == null) {
                                        obj6 = null;
                                    }
                                    y1.e eVar3 = (y1.e) obj6;
                                    Object obj7 = linkedHashMap.get(y1.h.f9812g);
                                    if (obj7 == null) {
                                        obj7 = null;
                                    }
                                    y1.a aVar24 = (y1.a) obj7;
                                    if (eVar3 != null) {
                                        w6.a aVar25 = eVar3.f9802b;
                                        if (aVar24 != null) {
                                            float f13 = aVar25.f9520b;
                                            float f14 = aVar25.f9519a;
                                            float f15 = f13 < f14 ? f14 : f13;
                                            if (f14 <= f13) {
                                                f13 = f14;
                                            }
                                            float f16 = (f15 - f13) / 20;
                                            if (z13) {
                                                f16 = -f16;
                                            }
                                            q6.c cVar9 = (q6.c) aVar24.f9794b;
                                            if (cVar9 != null) {
                                                return ((Boolean) cVar9.f(Float.valueOf(eVar3.f9801a + f16))).booleanValue();
                                            }
                                        }
                                    }
                                }
                                y0.d d8 = s0.d((t) mVar.f9839c.A.f3892c);
                                long a9 = v0.d.a(d8.c(), d8.b());
                                ArrayList arrayList = new ArrayList();
                                Object obj8 = linkedHashMap.get(y1.h.A);
                                if (obj8 == null) {
                                    obj8 = null;
                                }
                                y1.a aVar26 = (y1.a) obj8;
                                Float f17 = (aVar26 == null || (cVar = (q6.c) aVar26.f9794b) == null || !((Boolean) cVar.f(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                Object obj9 = linkedHashMap.get(y1.h.f9809d);
                                if (obj9 == null) {
                                    obj9 = null;
                                }
                                y1.a aVar27 = (y1.a) obj9;
                                if (aVar27 != null) {
                                    d6.e eVar4 = aVar27.f9794b;
                                    Object obj10 = linkedHashMap.get(y1.p.f9873o);
                                    if (obj10 == null) {
                                        obj10 = null;
                                    }
                                    y1.g gVar = (y1.g) obj10;
                                    if (gVar != null && z18) {
                                        float floatValue = f17 != null ? f17.floatValue() : y0.f.d(a9);
                                        if (z14 || z13) {
                                            floatValue = -floatValue;
                                        }
                                        if (j0.m(mVar) && (z14 || z15)) {
                                            floatValue = -floatValue;
                                        }
                                        if (c0.s(gVar, floatValue)) {
                                            s sVar = y1.h.f9829x;
                                            if (linkedHashMap.containsKey(sVar) || linkedHashMap.containsKey(y1.h.f9831z)) {
                                                if (floatValue > 0.0f) {
                                                    Object obj11 = linkedHashMap.get(y1.h.f9831z);
                                                    aVar7 = (y1.a) (obj11 == null ? null : obj11);
                                                } else {
                                                    Object obj12 = linkedHashMap.get(sVar);
                                                    aVar7 = (y1.a) (obj12 == null ? null : obj12);
                                                }
                                                if (aVar7 != null && (aVar8 = (q6.a) aVar7.f9794b) != null) {
                                                    return ((Boolean) aVar8.a()).booleanValue();
                                                }
                                            } else {
                                                q6.e eVar5 = (q6.e) eVar4;
                                                if (eVar5 != null) {
                                                    return ((Boolean) eVar5.d(Float.valueOf(floatValue), valueOf)).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                    Object obj13 = linkedHashMap.get(y1.p.f9874p);
                                    if (obj13 == null) {
                                        obj13 = null;
                                    }
                                    y1.g gVar2 = (y1.g) obj13;
                                    if (gVar2 != null && z9) {
                                        float floatValue2 = f17 != null ? f17.floatValue() : y0.f.b(a9);
                                        if (z16 || z13) {
                                            floatValue2 = -floatValue2;
                                        }
                                        if (c0.s(gVar2, floatValue2)) {
                                            s sVar2 = y1.h.f9828w;
                                            if (linkedHashMap.containsKey(sVar2) || linkedHashMap.containsKey(y1.h.f9830y)) {
                                                if (floatValue2 > 0.0f) {
                                                    Object obj14 = linkedHashMap.get(y1.h.f9830y);
                                                    aVar5 = (y1.a) (obj14 == null ? null : obj14);
                                                } else {
                                                    Object obj15 = linkedHashMap.get(sVar2);
                                                    aVar5 = (y1.a) (obj15 == null ? null : obj15);
                                                }
                                                if (aVar5 != null && (aVar6 = (q6.a) aVar5.f9794b) != null) {
                                                    return ((Boolean) aVar6.a()).booleanValue();
                                                }
                                            } else {
                                                q6.e eVar6 = (q6.e) eVar4;
                                                if (eVar6 != null) {
                                                    return ((Boolean) eVar6.d(valueOf, Float.valueOf(floatValue2))).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 32768:
                                Object obj16 = linkedHashMap.get(y1.h.f9822q);
                                y1.a aVar28 = (y1.a) (obj16 == null ? null : obj16);
                                if (aVar28 != null && (aVar9 = (q6.a) aVar28.f9794b) != null) {
                                    return ((Boolean) aVar9.a()).booleanValue();
                                }
                                break;
                            case 65536:
                                Object obj17 = linkedHashMap.get(y1.h.f9821p);
                                y1.a aVar29 = (y1.a) (obj17 == null ? null : obj17);
                                if (aVar29 != null && (aVar10 = (q6.a) aVar29.f9794b) != null) {
                                    return ((Boolean) aVar10.a()).booleanValue();
                                }
                                break;
                            case 262144:
                                Object obj18 = linkedHashMap.get(y1.h.f9823r);
                                y1.a aVar30 = (y1.a) (obj18 == null ? null : obj18);
                                if (aVar30 != null && (aVar11 = (q6.a) aVar30.f9794b) != null) {
                                    return ((Boolean) aVar11.a()).booleanValue();
                                }
                                break;
                            case 524288:
                                Object obj19 = linkedHashMap.get(y1.h.f9824s);
                                y1.a aVar31 = (y1.a) (obj19 == null ? null : obj19);
                                if (aVar31 != null && (aVar12 = (q6.a) aVar31.f9794b) != null) {
                                    return ((Boolean) aVar12.a()).booleanValue();
                                }
                                break;
                            case 1048576:
                                Object obj20 = linkedHashMap.get(y1.h.f9825t);
                                y1.a aVar32 = (y1.a) (obj20 == null ? null : obj20);
                                if (aVar32 != null && (aVar13 = (q6.a) aVar32.f9794b) != null) {
                                    return ((Boolean) aVar13.a()).booleanValue();
                                }
                                break;
                            case 2097152:
                                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                Object obj21 = linkedHashMap.get(y1.h.f9814i);
                                if (obj21 == null) {
                                    obj21 = null;
                                }
                                y1.a aVar33 = (y1.a) obj21;
                                if (aVar33 != null && (cVar2 = (q6.c) aVar33.f9794b) != null) {
                                    if (string == null) {
                                        string = "";
                                    }
                                    return ((Boolean) cVar2.f(new a2.g(string, null, 6))).booleanValue();
                                }
                                break;
                            case R.id.accessibilityActionShowOnScreen:
                                y1.m j10 = mVar.j();
                                if (j10 != null) {
                                    Object obj22 = j10.f9840d.f9832f.get(y1.h.f9809d);
                                    if (obj22 == null) {
                                        obj22 = null;
                                    }
                                    aVar14 = (y1.a) obj22;
                                    while (j10 != null && aVar14 == null) {
                                        j10 = j10.j();
                                        if (j10 != null) {
                                            Object obj23 = j10.f9840d.f9832f.get(y1.h.f9809d);
                                            if (obj23 == null) {
                                                obj23 = null;
                                            }
                                            aVar14 = (y1.a) obj23;
                                        }
                                    }
                                    if (j10 != null) {
                                        LinkedHashMap linkedHashMap2 = j10.f9840d.f9832f;
                                        d0 d0Var = j10.f9839c;
                                        y0.d d9 = s0.d((t) d0Var.A.f3892c);
                                        p1.p i17 = ((t) d0Var.A.f3892c).i();
                                        y0.d h3 = d9.h(i17 != null ? ((a1) i17).W(0L) : 0L);
                                        a1 c4 = mVar.c();
                                        if (c4 != null) {
                                            if (!c4.M0().f8116r) {
                                                c4 = null;
                                            }
                                            if (c4 != null) {
                                                j8 = c4.W(0L);
                                                a1 c6 = mVar.c();
                                                y0.d a10 = u3.t.a(j8, j1.c.o0(c6 != null ? c6.f7065h : 0L));
                                                obj = linkedHashMap2.get(y1.p.f9873o);
                                                if (obj == null) {
                                                    obj = null;
                                                }
                                                Object obj24 = linkedHashMap2.get(y1.p.f9874p);
                                                f9 = a10.f9780a - h3.f9780a;
                                                f10 = a10.f9782c - h3.f9782c;
                                                if (Math.signum(f9) == Math.signum(f10)) {
                                                    f9 = 0.0f;
                                                } else if (Math.abs(f9) >= Math.abs(f10)) {
                                                    f9 = f10;
                                                }
                                                if (j0.m(mVar)) {
                                                    f9 = -f9;
                                                }
                                                f11 = a10.f9781b - h3.f9781b;
                                                f12 = a10.f9783d - h3.f9783d;
                                                if (Math.signum(f11) == Math.signum(f12)) {
                                                    f11 = 0.0f;
                                                } else if (Math.abs(f11) >= Math.abs(f12)) {
                                                    f11 = f12;
                                                }
                                                if (aVar14 != null && (eVar = (q6.e) aVar14.f9794b) != null) {
                                                    return ((Boolean) eVar.d(Float.valueOf(f9), Float.valueOf(f11))).booleanValue();
                                                }
                                            }
                                        }
                                        j8 = 0;
                                        a1 c62 = mVar.c();
                                        y0.d a102 = u3.t.a(j8, j1.c.o0(c62 != null ? c62.f7065h : 0L));
                                        obj = linkedHashMap2.get(y1.p.f9873o);
                                        if (obj == null) {
                                        }
                                        Object obj242 = linkedHashMap2.get(y1.p.f9874p);
                                        f9 = a102.f9780a - h3.f9780a;
                                        f10 = a102.f9782c - h3.f9782c;
                                        if (Math.signum(f9) == Math.signum(f10)) {
                                        }
                                        if (j0.m(mVar)) {
                                        }
                                        f11 = a102.f9781b - h3.f9781b;
                                        f12 = a102.f9783d - h3.f9783d;
                                        if (Math.signum(f11) == Math.signum(f12)) {
                                        }
                                        if (aVar14 != null) {
                                            return ((Boolean) eVar.d(Float.valueOf(f9), Float.valueOf(f11))).booleanValue();
                                        }
                                    }
                                }
                                aVar14 = null;
                                break;
                            case R.id.accessibilityActionSetProgress:
                                if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                    Object obj25 = linkedHashMap.get(y1.h.f9812g);
                                    y1.a aVar34 = (y1.a) (obj25 == null ? null : obj25);
                                    if (aVar34 != null && (cVar3 = (q6.c) aVar34.f9794b) != null) {
                                        return ((Boolean) cVar3.f(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                    }
                                }
                                break;
                            case R.id.accessibilityActionImeEnter:
                                Object obj26 = linkedHashMap.get(y1.h.f9819n);
                                y1.a aVar35 = (y1.a) (obj26 == null ? null : obj26);
                                if (aVar35 != null && (aVar15 = (q6.a) aVar35.f9794b) != null) {
                                    return ((Boolean) aVar15.a()).booleanValue();
                                }
                                break;
                            default:
                                switch (i8) {
                                    case R.id.accessibilityActionScrollUp:
                                    case R.id.accessibilityActionScrollLeft:
                                    case R.id.accessibilityActionScrollDown:
                                    case R.id.accessibilityActionScrollRight:
                                        break;
                                    default:
                                        switch (i8) {
                                            case R.id.accessibilityActionPageUp:
                                                Object obj27 = linkedHashMap.get(y1.h.f9828w);
                                                y1.a aVar36 = (y1.a) (obj27 == null ? null : obj27);
                                                if (aVar36 != null && (aVar16 = (q6.a) aVar36.f9794b) != null) {
                                                    return ((Boolean) aVar16.a()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageDown:
                                                Object obj28 = linkedHashMap.get(y1.h.f9830y);
                                                y1.a aVar37 = (y1.a) (obj28 == null ? null : obj28);
                                                if (aVar37 != null && (aVar17 = (q6.a) aVar37.f9794b) != null) {
                                                    return ((Boolean) aVar17.a()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageLeft:
                                                Object obj29 = linkedHashMap.get(y1.h.f9829x);
                                                y1.a aVar38 = (y1.a) (obj29 == null ? null : obj29);
                                                if (aVar38 != null && (aVar18 = (q6.a) aVar38.f9794b) != null) {
                                                    return ((Boolean) aVar18.a()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageRight:
                                                Object obj30 = linkedHashMap.get(y1.h.f9831z);
                                                y1.a aVar39 = (y1.a) (obj30 == null ? null : obj30);
                                                if (aVar39 != null && (aVar19 = (q6.a) aVar39.f9794b) != null) {
                                                    return ((Boolean) aVar19.a()).booleanValue();
                                                }
                                                break;
                                            default:
                                                i.h0 h0Var = (i.h0) c0Var.f8175s.b(i7);
                                                if (h0Var != null && ((CharSequence) h0Var.b(i8)) != null) {
                                                    Object obj31 = linkedHashMap.get(y1.h.f9827v);
                                                    List list = (List) (obj31 == null ? null : obj31);
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
                        Object obj32 = linkedHashMap.get(y1.p.f9869k);
                        if (r6.k.a(obj32 == null ? null : obj32, Boolean.TRUE)) {
                            ((androidx.compose.ui.focus.b) rVar.getFocusOwner()).a(8, false, true);
                        }
                    }
                }
            }
            return z8;
            return true;
        }
        z8 = false;
        return z8;
    }
}
