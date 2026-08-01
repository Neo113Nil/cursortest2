package g8;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.SQLException;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.Window;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import b0.l0;
import b0.r0;
import b0.u;
import b1.c0;
import c2.g0;
import c2.i1;
import c2.w1;
import c2.z1;
import c6.j;
import c6.p;
import com.appsflyer.R;
import com.google.android.gms.internal.measurement.se;
import d2.l2;
import e1.l;
import e1.m;
import e1.n;
import ge.e0;
import j2.q;
import j2.t;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.p0;
import kotlin.collections.t0;
import kotlin.collections.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.r;
import n0.f1;
import n0.k;
import n0.m2;
import n0.s1;
import n0.z0;
import n4.a0;
import n4.s;
import n4.x;
import o4.o;
import s.b0;
import s.d0;
import s.h0;
import s.s0;
import te.a1;
import te.b1;
import te.k0;
import te.l1;
import te.w0;
import z4.v;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {
    public static final j A(p pVar) {
        pVar.getClass();
        return new j(pVar.f1839a, pVar.f1856t);
    }

    public static final f5.e B(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            f5.e eVar = tag instanceof f5.e ? (f5.e) tag : null;
            if (eVar != null) {
                return eVar;
            }
            Object z10 = w.z(view);
            view = z10 instanceof View ? (View) z10 : null;
        }
        return null;
    }

    public static final pe.a C(pe.a aVar) {
        return aVar.d().g() ? aVar : new w0(aVar);
    }

    public static final Object D(b4.a aVar, b4.c cVar, Serializable serializable) {
        aVar.getClass();
        cVar.getClass();
        Object obj = aVar.f1092a.get(cVar);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            obj = Arrays.copyOf(bArr, bArr.length);
        }
        return obj == null ? serializable : obj;
    }

    public static final int E(int i3, int i10) {
        return (i3 >> i10) & 31;
    }

    public static final boolean F(z4.a aVar, int i3, int i10) {
        aVar.getClass();
        if (i3 > i10 && aVar.f10712l) {
            return false;
        }
        Set set = aVar.f10713m;
        return aVar.f10711k && (set == null || !set.contains(Integer.valueOf(i3)));
    }

    public static final boolean G(j1.d dVar) {
        long j = dVar.f4924e;
        return (j >>> 32) == (4294967295L & j) && j == dVar.f4925f && j == dVar.g && j == dVar.f4926h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0394 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void H(ViewStructure viewStructure, g0 g0Var, AutofillId autofillId, String str, k2.b bVar) {
        int i3;
        long j;
        long j3;
        char c10;
        long j10;
        boolean z10;
        l2.a aVar;
        m2.e eVar;
        e1.e eVar2;
        j2.g gVar;
        e1.c cVar;
        boolean z11;
        m mVar;
        Boolean bool;
        boolean z12;
        Integer num;
        int i10;
        List list;
        Integer valueOf;
        boolean z13;
        boolean z14;
        String u2;
        String[] w6;
        String[] w10;
        AutofillValue forText;
        h0 h0Var;
        long[] jArr;
        Object[] objArr;
        int i11;
        long[] jArr2;
        Object[] objArr2;
        h0 h0Var2;
        l2.a aVar2;
        m2.e eVar3;
        e1.e eVar4;
        j2.g gVar2;
        t tVar = q.f4993a;
        t tVar2 = j2.i.f4951a;
        j2.j u10 = g0Var.u();
        int i12 = 8;
        if (u10 == null || (h0Var2 = u10.f4975d) == null) {
            i3 = 2;
            j = 128;
            j3 = 255;
            c10 = 7;
            j10 = -9187201950435737472L;
            z10 = true;
            aVar = null;
            eVar = null;
            eVar2 = null;
            gVar = null;
            cVar = null;
            z11 = false;
            mVar = null;
            bool = null;
            z12 = false;
            num = null;
        } else {
            Object[] objArr3 = h0Var2.f8313b;
            j = 128;
            Object[] objArr4 = h0Var2.f8314c;
            long[] jArr3 = h0Var2.f8312a;
            int length = jArr3.length - 2;
            i3 = 2;
            if (length >= 0) {
                z10 = true;
                int i13 = 0;
                cVar = null;
                j3 = 255;
                z11 = false;
                aVar2 = null;
                eVar3 = null;
                eVar4 = null;
                mVar = null;
                bool = null;
                gVar2 = null;
                z12 = false;
                num = null;
                c10 = 7;
                while (true) {
                    long j11 = jArr3[i13];
                    j10 = -9187201950435737472L;
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((j11 & 255) < 128) {
                                int i16 = (i13 << 3) + i15;
                                Object obj = objArr3[i16];
                                Object obj2 = objArr4[i16];
                                t tVar3 = (t) obj;
                                if (Intrinsics.a(tVar3, q.f5008r)) {
                                    obj2.getClass();
                                    cVar = (e1.c) obj2;
                                } else if (Intrinsics.a(tVar3, q.f4993a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) CollectionsKt.firstOrNull((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (Intrinsics.a(tVar3, q.f5007q)) {
                                    obj2.getClass();
                                    mVar = (m) obj2;
                                } else if (Intrinsics.a(tVar3, q.f5009s)) {
                                    obj2.getClass();
                                    eVar4 = (e1.e) obj2;
                                } else if (Intrinsics.a(tVar3, q.E)) {
                                    obj2.getClass();
                                    eVar3 = (m2.e) obj2;
                                } else if (Intrinsics.a(tVar3, q.f5002l)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (Intrinsics.a(tVar3, q.L)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (Intrinsics.a(tVar3, q.I)) {
                                    z12 = true;
                                } else if (Intrinsics.a(tVar3, q.f5004n)) {
                                    obj2.getClass();
                                    z10 = ((Boolean) obj2).booleanValue();
                                } else if (Intrinsics.a(tVar3, q.f5014x)) {
                                    obj2.getClass();
                                    gVar2 = (j2.g) obj2;
                                } else if (Intrinsics.a(tVar3, q.G)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (Intrinsics.a(tVar3, q.H)) {
                                    obj2.getClass();
                                    aVar2 = (l2.a) obj2;
                                } else if (Intrinsics.a(tVar3, j2.i.f4952b)) {
                                    viewStructure.setClickable(true);
                                } else if (Intrinsics.a(tVar3, j2.i.f4953c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (Intrinsics.a(tVar3, j2.i.f4969u)) {
                                    viewStructure.setFocusable(true);
                                } else if (Intrinsics.a(tVar3, j2.i.j)) {
                                    z11 = true;
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i14 != 8) {
                            break;
                        }
                    }
                    if (i13 == length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            } else {
                j3 = 255;
                c10 = 7;
                j10 = -9187201950435737472L;
                z10 = true;
                cVar = null;
                z11 = false;
                aVar2 = null;
                eVar3 = null;
                eVar4 = null;
                mVar = null;
                bool = null;
                gVar2 = null;
                z12 = false;
                num = null;
            }
            aVar = aVar2;
            eVar = eVar3;
            eVar2 = eVar4;
            gVar = gVar2;
        }
        j2.j u11 = g0Var.u();
        if (u11 != null && u11.f4977i && !u11.f4978r) {
            u11 = u11.c();
            d0 d0Var = new d0(((o0.b) g0Var.l()).f7311d.f7319i);
            d0Var.b(g0Var.l());
            while (d0Var.i()) {
                g0 g0Var2 = (g0) d0Var.k(d0Var.f8285b - 1);
                j2.j u12 = g0Var2.u();
                if (u12 != null && !u12.f4977i) {
                    u11.f(u12);
                    if (!u12.f4978r) {
                        d0Var.b(g0Var2.l());
                    }
                }
            }
        }
        if (u11 == null || (h0Var = u11.f4975d) == null) {
            i10 = 1;
        } else {
            Object[] objArr5 = h0Var.f8313b;
            Object[] objArr6 = h0Var.f8314c;
            long[] jArr4 = h0Var.f8312a;
            int length2 = jArr4.length - 2;
            i10 = 1;
            if (length2 >= 0) {
                int i17 = 0;
                list = null;
                while (true) {
                    long j12 = jArr4[i17];
                    int i18 = i12;
                    int i19 = i17;
                    if ((((~j12) << c10) & j12 & j10) != j10) {
                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j12 & j3) < j) {
                                int i22 = (i19 << 3) + i21;
                                Object obj3 = objArr5[i22];
                                Object obj4 = objArr6[i22];
                                jArr2 = jArr4;
                                t tVar4 = (t) obj3;
                                objArr2 = objArr5;
                                if (Intrinsics.a(tVar4, q.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (Intrinsics.a(tVar4, q.A)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j12 >>= i18;
                            i21++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i11 = i18;
                        if (i20 != i11) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i11 = i18;
                    }
                    if (i19 == length2) {
                        break;
                    }
                    i17 = i19 + 1;
                    i12 = i11;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
                Integer valueOf2 = Integer.valueOf(g0Var.f1550e);
                if (g0Var.s() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = cVar == null ? Integer.valueOf(cVar.f3779a) : z11 ? Integer.valueOf(i10) : aVar != null ? Integer.valueOf(i3) : null;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (eVar != null) {
                    String str2 = eVar.f6454e;
                    if (str2.length() >= 5000) {
                        str2 = (Character.isHighSurrogate(str2.charAt(4999)) && Character.isLowSurrogate(str2.charAt(5000))) ? r.m(4999, str2) : r.m(5000, str2);
                    }
                    forText = AutofillValue.forText(str2);
                    viewStructure.setAutofillValue(forText);
                }
                if (eVar2 != null) {
                    viewStructure.setAutofillValue(eVar2.f3781a);
                }
                if (mVar != null && (w10 = cf.c.w(mVar)) != null) {
                    viewStructure.setAutofillHints(w10);
                }
                bVar.f5362b.j(g0Var.f1550e, new n(viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (aVar == null) {
                    viewStructure.setCheckable(i10);
                    viewStructure.setChecked(aVar == l2.a.f5826d);
                } else if (bool != null && (gVar == null || gVar.f4938a != 4)) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
                m.f3788a.getClass();
                String str3 = (String) kotlin.collections.w.n(cf.c.w(l.f3787b));
                if (mVar != null || (w6 = cf.c.w(mVar)) == null) {
                    z13 = true;
                } else {
                    boolean l10 = kotlin.collections.w.l(w6, str3);
                    z13 = true;
                    if (l10) {
                        z14 = true;
                        boolean z15 = (!z12 || z14) ? z13 : false;
                        viewStructure.setDataIsSensitive((!z15 || z10) ? z13 : false);
                        viewStructure.setVisibility(((i1) g0Var.S.f1494e).L0() ? 4 : 0);
                        if (list != null) {
                            int size = list.size();
                            String str4 = "";
                            for (int i23 = 0; i23 < size; i23++) {
                                m2.e eVar5 = (m2.e) list.get(i23);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str4);
                                str4 = n0.l.h(sb2, eVar5.f6454e, '\n');
                            }
                            viewStructure.setText(str4);
                            viewStructure.setClassName("android.widget.TextView");
                        }
                        if (((o0.b) g0Var.l()).isEmpty() && gVar != null && (u2 = d2.h0.u(gVar.f4938a)) != null) {
                            viewStructure.setClassName(u2);
                        }
                        if (z11) {
                            viewStructure.setClassName("android.widget.EditText");
                            if (Build.VERSION.SDK_INT >= 28 && num != null) {
                                viewStructure.setMaxTextLength(num.intValue());
                            }
                            if (z15) {
                                viewStructure.setInputType(129);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z14 = false;
                if (z12) {
                }
                viewStructure.setDataIsSensitive((!z15 || z10) ? z13 : false);
                viewStructure.setVisibility(((i1) g0Var.S.f1494e).L0() ? 4 : 0);
                if (list != null) {
                }
                if (((o0.b) g0Var.l()).isEmpty()) {
                    viewStructure.setClassName(u2);
                }
                if (z11) {
                }
            }
        }
        list = null;
        Integer valueOf22 = Integer.valueOf(g0Var.f1550e);
        if (g0Var.s() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (cVar == null) {
        }
        if (valueOf != null) {
        }
        if (eVar != null) {
        }
        if (eVar2 != null) {
        }
        if (mVar != null) {
            viewStructure.setAutofillHints(w10);
        }
        bVar.f5362b.j(g0Var.f1550e, new n(viewStructure));
        if (bool != null) {
        }
        if (aVar == null) {
        }
        m.f3788a.getClass();
        String str32 = (String) kotlin.collections.w.n(cf.c.w(l.f3787b));
        if (mVar != null) {
        }
        z13 = true;
        z14 = false;
        if (z12) {
        }
        viewStructure.setDataIsSensitive((!z15 || z10) ? z13 : false);
        viewStructure.setVisibility(((i1) g0Var.S.f1494e).L0() ? 4 : 0);
        if (list != null) {
        }
        if (((o0.b) g0Var.l()).isEmpty()) {
        }
        if (z11) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final pe.a I(se seVar, k0 k0Var, boolean z10) {
        pe.a aVar;
        pe.a B;
        pe.d dVar;
        ce.b g = b1.g(k0Var);
        k0 k0Var2 = k0Var.f9395a;
        boolean c10 = k0Var2.f9395a.c();
        List a9 = k0Var2.f9395a.a();
        ArrayList arrayList = new ArrayList(z.j(a9, 10));
        Iterator it = a9.iterator();
        if (it.hasNext()) {
            ((KTypeProjection) it.next()).getClass();
            a2.r.h("Star projections in type arguments are not allowed, but had null");
            return null;
        }
        if (arrayList.isEmpty()) {
            if (a.a.D(g).isInterface()) {
                j0 j0Var = j0.f5574d;
                seVar.getClass();
                j0Var.getClass();
                if (((Map) seVar.f2798d).get(g) != null) {
                    i0.j();
                    return null;
                }
            }
            l1 l1Var = pe.g.f7711a;
            if (c10) {
                aVar = pe.g.f7712b.d(g);
            } else {
                aVar = pe.g.f7711a.d(g);
                if (aVar == null) {
                    aVar = null;
                }
            }
        } else {
            seVar.getClass();
            l1 l1Var2 = pe.g.f7711a;
            Object d10 = !c10 ? pe.g.f7713c.d(g, arrayList) : pe.g.f7714d.d(g, arrayList);
            hd.l lVar = hd.n.f4511e;
            if (d10 instanceof hd.m) {
                d10 = null;
            }
            aVar = (pe.a) d10;
        }
        if (aVar != null) {
            return aVar;
        }
        if (arrayList.isEmpty()) {
            B = cf.c.H(g);
            if (B == null) {
                j0 j0Var2 = j0.f5574d;
                seVar.getClass();
                j0Var2.getClass();
                if (((Map) seVar.f2798d).get(g) != null) {
                    i0.j();
                    return null;
                }
                if (a.a.D(g).isInterface()) {
                    dVar = new pe.d(g);
                    B = dVar;
                }
                B = null;
            }
            if (B != null) {
                return c10 ? C(B) : B;
            }
        } else {
            ArrayList J = cf.c.J(seVar, arrayList, z10);
            if (J != null) {
                B = cf.c.B(g, J, new a1.b(20, arrayList));
                if (B == null) {
                    if (((Map) seVar.f2798d).get(g) != null) {
                        i0.j();
                        return null;
                    }
                    if (a.a.D(g).isInterface()) {
                        dVar = new pe.d(g);
                        B = dVar;
                    }
                    B = null;
                }
                if (B != null) {
                }
            }
        }
        return null;
    }

    public static void J(Window window, boolean z10) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            f2.b.f(window, z10);
        } else {
            if (i3 >= 30) {
                f2.b.e(window, z10);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static int K(int i3) {
        return (int) (Integer.rotateLeft((int) (i3 * (-862048943)), 15) * 461845907);
    }

    public static final void L(int i3, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i3);
        sb2.append(", message: ".concat(str));
        throw new SQLException(sb2.toString());
    }

    public static final void M(c0 c0Var, long j, Function1 function1, boolean z10) {
        MotionEvent c10 = c0Var.c();
        if (c10 == null) {
            a1.e("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = c10.getAction();
        if (z10) {
            c10.setAction(3);
        }
        int i3 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        c10.offsetLocation(-Float.intBitsToFloat(i3), -Float.intBitsToFloat(i10));
        function1.invoke(c10);
        c10.offsetLocation(Float.intBitsToFloat(i3), Float.intBitsToFloat(i10));
        c10.setAction(action);
    }

    public static final boolean N(Throwable th, Function0 function0) {
        c1.h hVar;
        th.getClass();
        List b10 = pd.c.f7705a.b(th);
        int size = b10.size();
        boolean z10 = false;
        for (int i3 = 0; i3 < size; i3++) {
            if (((Throwable) b10.get(i3)) instanceof c1.h) {
                return false;
            }
        }
        try {
            c1.a aVar = (c1.a) function0.invoke();
            if (aVar != null) {
                boolean z11 = aVar.f1477b;
                List list = aVar.f1476a;
                if (z11) {
                    int size2 = list.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((c1.c) list.get(i10)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z10 = true;
                }
            }
            if (z10) {
                aVar.getClass();
                hVar = new c1.h(aVar);
            } else {
                hVar = null;
            }
        } catch (Throwable th2) {
            hVar = th2;
        }
        if (hVar != null) {
            hd.b.a(th, hVar);
        }
        return z10;
    }

    public static final double O(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    public static final String P(int i3, long j) {
        if (j >= 0) {
            String l10 = Long.toString(j, CharsKt.checkRadix(i3));
            l10.getClass();
            return l10;
        }
        long j3 = i3;
        long j10 = ((j >>> 1) / j3) << 1;
        long j11 = j - (j10 * j3);
        if (j11 >= j3) {
            j11 -= j3;
            j10++;
        }
        StringBuilder sb2 = new StringBuilder();
        String l11 = Long.toString(j10, CharsKt.checkRadix(i3));
        l11.getClass();
        sb2.append(l11);
        String l12 = Long.toString(j11, CharsKt.checkRadix(i3));
        l12.getClass();
        sb2.append(l12);
        return sb2.toString();
    }

    public static final void a(d1.l lVar, n0.i0 i0Var, int i3) {
        int i10;
        i0Var.X(1239949906);
        int i11 = i3 | (i0Var.f(lVar) ? 4 : 2);
        if (i0Var.O(i11 & 1, (i11 & 3) != 2)) {
            a2.g0 d10 = b0.p.d(d1.a.f3286s);
            int hashCode = Long.hashCode(i0Var.T);
            x0.h l10 = i0Var.l();
            d1.l C = w.C(lVar, i0Var);
            c2.g.f1541a.getClass();
            c2.z zVar = c2.f.f1533b;
            i0Var.Z();
            if (i0Var.S) {
                i0Var.k(zVar);
            } else {
                i0Var.j0();
            }
            n0.h.y(d10, c2.f.f1536e, i0Var);
            n0.h.y(l10, c2.f.f1535d, i0Var);
            n0.h.y(Integer.valueOf(hashCode), c2.f.f1537f, i0Var);
            n0.h.t(i0Var, c2.f.g);
            n0.h.y(C, c2.f.f1534c, i0Var);
            x.g.b(k7.e.B(R.drawable.record, i0Var, 0), b0.w0.a(1.0f), null, a2.h.f98d, 0.0f, i0Var, 25016);
            i10 = 1;
            a.a.b(w.P(R.string.no_records_yet, i0Var), v.c(24), null, 0L, 0L, 5.0f, null, null, null, i0Var, 196656, 476);
            i0Var.p(true);
        } else {
            i10 = 1;
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new b0.n(lVar, i3, i10);
        }
    }

    public static final void b(String str, int i3, d1.l lVar, Function0 function0, n0.i0 i0Var, int i10) {
        n0.i0 i0Var2 = i0Var;
        i0Var2.X(1088313959);
        int i11 = i10 | (i0Var2.f(str) ? 4 : 2) | (i0Var2.d(i3) ? 32 : 16) | (i0Var2.f(lVar) ? 256 : 128) | (i0Var2.h(function0) ? 2048 : 1024);
        if (i0Var2.O(i11 & 1, (i11 & 1171) != 1170)) {
            Object L = i0Var2.L();
            n0.e eVar = k.f6729a;
            if (L == eVar) {
                L = new z.f();
                i0Var2.g0(L);
            }
            z.f fVar = (z.f) L;
            boolean z10 = (i11 & 7168) == 2048;
            Object L2 = i0Var2.L();
            if (z10 || L2 == eVar) {
                L2 = new n9.j(3, function0);
                i0Var2.g0(L2);
            }
            d1.l d10 = x.g.d(lVar, fVar, null, false, null, (Function0) L2, 28);
            a2.g0 d11 = b0.p.d(d1.a.f3286s);
            int hashCode = Long.hashCode(i0Var2.T);
            x0.h l10 = i0Var2.l();
            d1.l C = w.C(d10, i0Var2);
            c2.g.f1541a.getClass();
            c2.z zVar = c2.f.f1533b;
            i0Var2.Z();
            if (i0Var2.S) {
                i0Var2.k(zVar);
            } else {
                i0Var2.j0();
            }
            n0.h.y(d11, c2.f.f1536e, i0Var2);
            n0.h.y(l10, c2.f.f1535d, i0Var2);
            n0.h.y(Integer.valueOf(hashCode), c2.f.f1537f, i0Var2);
            n0.h.t(i0Var2, c2.f.g);
            n0.h.y(C, c2.f.f1534c, i0Var2);
            x.g.b(k7.e.B(i3, i0Var2, (i11 >> 3) & 14), b0.w0.a(1.0f), null, a2.h.f98d, 0.0f, i0Var2, 25016);
            a.a.b(str, v.c(25), null, u9.a.j, u9.a.f9707i, 5.0f, null, null, null, i0Var, (i11 & 14) | 196656, 452);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new o9.b(str, i3, lVar, function0, i10, 1);
        }
    }

    public static final void c(Function0 function0, s9.a aVar, n0.i0 i0Var, int i3) {
        function0.getClass();
        i0Var.X(79099339);
        int i10 = (i0Var.h(function0) ? 4 : 2) | i3 | 16;
        if (i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            i0Var.T();
            if ((i3 & 1) == 0 || i0Var.y()) {
                androidx.lifecycle.a1 a9 = l4.a.a(i0Var);
                if (a9 == null) {
                    i0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                aVar = (s9.a) w.L(wd.c0.a(s9.a.class), a9.f(), k7.e.n(a9), xe.b.a(i0Var));
            } else {
                i0Var.R();
            }
            int i11 = i10 & (-113);
            i0Var.q();
            z0 k10 = n0.h.k(aVar.f9170d, i0Var);
            Unit unit = Unit.f5554a;
            boolean h10 = i0Var.h(aVar);
            Object L = i0Var.L();
            if (h10 || L == k.f6729a) {
                L = new i9.b(aVar, null, 3);
                i0Var.g0(L);
            }
            n0.h.f(unit, (Function2) L, i0Var);
            d((j9.c) k10.getValue(), function0, i0Var, ((i11 << 3) & 112) | 8);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new u(i3, 8, function0, aVar);
        }
    }

    public static final void d(j9.c cVar, Function0 function0, n0.i0 i0Var, int i3) {
        int i10;
        n0.i0 i0Var2;
        i0Var.X(-1217480057);
        if ((i3 & 6) == 0) {
            i10 = ((i3 & 8) == 0 ? i0Var.f(cVar) : i0Var.h(cVar) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= i0Var.h(function0) ? 32 : 16;
        }
        if (i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            i0Var2 = i0Var;
            b0.i.a(b0.w0.a(1.0f), null, x0.i.d(-1955136655, new o9.c(2, function0, cVar), i0Var), i0Var2, 3078, 6);
        } else {
            i0Var2 = i0Var;
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new n0.r(cVar, function0, i3, 3);
        }
    }

    public static final void e(d1.l lVar, Function0 function0, n0.i0 i0Var, int i3) {
        i0Var.X(-1697354211);
        int i10 = 2;
        int i11 = (i0Var.d(R.drawable.arrow) ? 4 : 2) | i3 | (i0Var.f(lVar) ? 32 : 16) | (i0Var.h(function0) ? 256 : 128);
        if (i0Var.O(i11 & 1, (i11 & 147) != 146)) {
            p1.b B = k7.e.B(R.drawable.arrow, i0Var, i11 & 14);
            Object L = i0Var.L();
            n0.e eVar = k.f6729a;
            if (L == eVar) {
                L = new z.f();
                i0Var.g0(L);
            }
            z.f fVar = (z.f) L;
            boolean z10 = (i11 & 896) == 256;
            Object L2 = i0Var.L();
            if (z10 || L2 == eVar) {
                L2 = new n9.j(6, function0);
                i0Var.g0(L2);
            }
            x.g.b(B, x.g.d(lVar, fVar, null, false, null, (Function0) L2, 28), null, a2.h.f96b, 0.0f, i0Var, 24632);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new n9.k(lVar, function0, i3, i10);
        }
    }

    public static final void f(final x xVar, final Object obj, d1.d dVar, Map map, Function1 function1, Function1 function12, Function1 function13, Function1 function14, final Function1 function15, n0.i0 i0Var, final int i3) {
        int i10;
        d1.d dVar2;
        Map map2;
        Function1 function16;
        int i11;
        int i12;
        Function1 function17;
        Function1 function18;
        Function1 function19;
        final d1.d dVar3;
        final Function1 function110;
        final Function1 function111;
        final Function1 function112;
        final Function1 function113;
        final Map map3;
        i0Var.X(-1476019057);
        if ((i3 & 6) == 0) {
            i10 = (i0Var.h(xVar) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= i0Var.h(obj) ? 32 : 16;
        }
        int i13 = i3 & 384;
        d1.i iVar = d1.i.f3304a;
        if (i13 == 0) {
            i10 |= i0Var.f(iVar) ? 256 : 128;
        }
        int i14 = 14380032 | i10;
        if ((i3 & 100663296) == 0) {
            i14 = 47934464 | i10;
        }
        if ((805306368 & i3) == 0) {
            i14 |= 268435456;
        }
        int i15 = (i0Var.h(function15) ? ' ' : (char) 16) | 6;
        if ((306783379 & i14) == 306783378 && (i15 & 19) == 18 && i0Var.A()) {
            i0Var.R();
            dVar3 = dVar;
            map3 = map;
            function113 = function1;
            function112 = function12;
            function111 = function13;
            function110 = function14;
        } else {
            i0Var.T();
            int i16 = i3 & 1;
            Object obj2 = k.f6729a;
            if (i16 == 0 || i0Var.y()) {
                dVar2 = d1.a.f3282d;
                map2 = kotlin.collections.k0.f5575d;
                map2.getClass();
                Object L = i0Var.L();
                if (L == obj2) {
                    L = new m2.u(20);
                    i0Var.g0(L);
                }
                function16 = (Function1) L;
                Object L2 = i0Var.L();
                if (L2 == obj2) {
                    i11 = 100663296;
                    L2 = new m2.u(22);
                    i0Var.g0(L2);
                } else {
                    i11 = 100663296;
                }
                Function1 function114 = (Function1) L2;
                i12 = i14 & (-2113929217);
                function17 = function114;
                function18 = function17;
                function19 = function16;
            } else {
                i0Var.R();
                dVar2 = dVar;
                map2 = map;
                function18 = function14;
                i12 = i14 & (-2113929217);
                i11 = 100663296;
                function16 = function1;
                function17 = function12;
                function19 = function13;
            }
            i0Var.q();
            Function1 function115 = function16;
            boolean f3 = ((i15 & 112) == 32) | i0Var.f(null) | i0Var.f(obj);
            Object L3 = i0Var.L();
            if (f3 || L3 == obj2) {
                n4.v vVar = new n4.v(xVar.f7130b.f8010s, obj, map2);
                function15.invoke(vVar);
                L3 = vVar.i();
                i0Var.g0(L3);
            }
            n4.u uVar = (n4.u) L3;
            int i17 = i12 >> 6;
            int i18 = (i12 & 8078) | (57344 & i17) | (i17 & 458752) | i11;
            Function1 function116 = function18;
            dVar3 = dVar2;
            g(xVar, uVar, iVar, dVar3, function115, function17, function19, function116, i0Var, i18);
            function110 = function116;
            function111 = function19;
            function112 = function17;
            function113 = function115;
            map3 = map2;
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new Function2() { // from class: o4.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    g8.b.f(n4.x.this, obj, dVar3, map3, function113, function112, function111, function110, function15, (n0.i0) obj3, n0.h.z(i3 | 1));
                    return Unit.f5554a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x04c5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v30, types: [n4.s, n4.u] */
    /* JADX WARN: Type inference failed for: r13v4, types: [n0.i0] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14, types: [ld.a] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r23v2, types: [ld.a] */
    /* JADX WARN: Type inference failed for: r23v4, types: [ld.a] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, v.z0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final x xVar, final n4.u uVar, final d1.l lVar, final d1.d dVar, final Function1 function1, final Function1 function12, final Function1 function13, final Function1 function14, n0.i0 i0Var, final int i3) {
        n4.i0 i0Var2;
        int i10;
        androidx.lifecycle.u uVar2;
        char c10;
        Object w1Var;
        z0 z0Var;
        f1 f1Var;
        z0 z0Var2;
        n4.i0 i0Var3;
        o oVar;
        boolean z10;
        b0 b0Var;
        n4.i0 i0Var4;
        o4.i iVar;
        n4.h hVar;
        Function1 function15;
        m2 m2Var;
        ?? r15;
        v.h0 h0Var;
        v.z0 z0Var3;
        n4.h hVar2;
        o oVar2;
        Object obj;
        o4.i iVar2;
        z0 z0Var4;
        b0 b0Var2;
        o oVar3;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        ArrayList arrayList;
        int length;
        int i11;
        String str;
        s p4;
        n4.u uVar3;
        Bundle bundle;
        s p10;
        n4.u uVar4;
        n0.i0 i0Var5;
        i0Var.X(-1964664536);
        int i12 = (i3 & 6) == 0 ? (i0Var.h(xVar) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i12 |= i0Var.h(uVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i12 |= i0Var.f(lVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i12 |= i0Var.f(dVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i12 |= i0Var.h(function1) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i12 |= i0Var.h(function12) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i12 |= i0Var.h(function13) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i12 |= i0Var.h(function14) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i12 |= i0Var.h(null) ? 67108864 : 33554432;
        }
        int i13 = i12;
        if ((38347923 & i13) == 38347922 && i0Var.A()) {
            i0Var.R();
            i0Var5 = i0Var;
        } else {
            i0Var.T();
            if ((i3 & 1) != 0 && !i0Var.y()) {
                i0Var.R();
            }
            i0Var.q();
            androidx.lifecycle.u uVar5 = (androidx.lifecycle.u) i0Var.j(i4.e.f4646a);
            androidx.lifecycle.a1 a9 = l4.a.a(i0Var);
            if (a9 == null) {
                i0.l("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            androidx.lifecycle.z0 f3 = a9.f();
            xVar.getClass();
            q4.h hVar3 = xVar.f7130b;
            f3.getClass();
            hVar3.getClass();
            n4.i0 i0Var6 = hVar3.f8010s;
            if (!Intrinsics.a(hVar3.f8006o, w.w(f3))) {
                if (!hVar3.f7999f.isEmpty()) {
                    i0.l("ViewModelStore should be set before setGraph call");
                    return;
                }
                hVar3.f8006o = w.w(f3);
            }
            uVar.getClass();
            hVar3.getClass();
            LinkedHashMap linkedHashMap = hVar3.f8011t;
            e3.o oVar4 = uVar.f7125t;
            kotlin.collections.s sVar = hVar3.f7999f;
            if (!sVar.isEmpty() && hVar3.j() == androidx.lifecycle.p.f707d) {
                i0.l("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
                return;
            }
            if (Intrinsics.a(hVar3.f7996c, uVar)) {
                i0Var2 = i0Var6;
                i10 = i13;
                uVar2 = uVar5;
                c10 = '\f';
                int f10 = ((s0) oVar4.f3829c).f();
                for (int i14 = 0; i14 < f10; i14++) {
                    s sVar2 = (s) ((s0) oVar4.f3829c).g(i14);
                    n4.u uVar6 = hVar3.f7996c;
                    uVar6.getClass();
                    int d10 = ((s0) uVar6.f7125t.f3829c).d(i14);
                    n4.u uVar7 = hVar3.f7996c;
                    uVar7.getClass();
                    s0 s0Var = (s0) uVar7.f7125t.f3829c;
                    if (s0Var.f8373d) {
                        s.q.a(s0Var);
                    }
                    int a10 = t.a.a(s0Var.f8376r, d10, s0Var.f8374e);
                    if (a10 >= 0) {
                        Object[] objArr = s0Var.f8375i;
                        Object obj2 = objArr[a10];
                        objArr[a10] = sVar2;
                    }
                }
                Iterator it = sVar.iterator();
                while (it.hasNext()) {
                    n4.h hVar4 = (n4.h) it.next();
                    int i15 = s.f7113s;
                    List d11 = de.n.d(a.a.B(hVar4.f7063e));
                    d11.getClass();
                    t0 t0Var = new t0(d11);
                    s sVar3 = hVar3.f7996c;
                    sVar3.getClass();
                    Iterator it2 = t0Var.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((b1.i0) it2).f988e;
                        if (listIterator.hasPrevious()) {
                            s sVar4 = (s) listIterator.previous();
                            if (Intrinsics.a(sVar4, hVar3.f7996c) && Intrinsics.a(sVar3, uVar)) {
                            }
                            if (sVar3 instanceof n4.u) {
                                sVar3 = ((n4.u) sVar3).f7125t.p(sVar4.f7115e.f1694a);
                                sVar3.getClass();
                            }
                        }
                    }
                    sVar3.getClass();
                    hVar4.f7063e = sVar3;
                }
            } else {
                n4.u uVar8 = hVar3.f7996c;
                if (uVar8 != null) {
                    ArrayList arrayList2 = new ArrayList(hVar3.f8003l.keySet());
                    int size = arrayList2.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList2.get(i16);
                        int i17 = i16 + 1;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        int i18 = size;
                        int intValue = num.intValue();
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((n4.k) it3.next()).f7080d = true;
                            i17 = i17;
                        }
                        int i19 = i17;
                        boolean r9 = hVar3.r(intValue, null, c6.f.S(new q4.f(0)));
                        Iterator it4 = linkedHashMap.values().iterator();
                        while (it4.hasNext()) {
                            ((n4.k) it4.next()).f7080d = false;
                            it4 = it4;
                            r9 = r9;
                        }
                        if (r9) {
                            hVar3.n(intValue, true, false);
                        }
                        size = i18;
                        i16 = i19;
                    }
                    hVar3.n(uVar8.f7115e.f1694a, true, false);
                }
                hVar3.f7996c = uVar;
                n4.i0 i0Var7 = hVar3.f8010s;
                x xVar2 = hVar3.f7994a;
                c4.o oVar5 = xVar2.f7131c;
                Bundle bundle2 = hVar3.f7997d;
                if (bundle2 != null && bundle2.containsKey("android-support-nav:controller:navigatorState:names")) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        c6.f.Q("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    int size2 = stringArrayList.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        String str2 = stringArrayList.get(i20);
                        i20++;
                        ArrayList<String> arrayList3 = stringArrayList;
                        String str3 = str2;
                        i0Var7.b(str3);
                        if (bundle2.containsKey(str3)) {
                            a.a.H(str3, bundle2);
                        }
                        stringArrayList = arrayList3;
                    }
                }
                Bundle[] bundleArr = hVar3.f7998e;
                if (bundleArr != null) {
                    int length2 = bundleArr.length;
                    int i21 = 0;
                    while (i21 < length2) {
                        Bundle[] bundleArr2 = bundleArr;
                        Bundle bundle3 = bundleArr2[i21];
                        bundle3.getClass();
                        int i22 = length2;
                        bundle3.setClassLoader(n4.i.class.getClassLoader());
                        String J = a.a.J("nav-entry-state:id", bundle3);
                        int C = a.a.C("nav-entry-state:destination-id", bundle3);
                        int i23 = i21;
                        Bundle bundle4 = bundle3.getBundle("nav-entry-state:args");
                        if (bundle4 == null) {
                            c6.f.Q("nav-entry-state:args");
                            throw null;
                        }
                        Bundle bundle5 = bundle3.getBundle("nav-entry-state:saved-state");
                        if (bundle5 == null) {
                            c6.f.Q("nav-entry-state:saved-state");
                            throw null;
                        }
                        s d12 = hVar3.d(C, null);
                        if (d12 == null) {
                            int i24 = s.f7113s;
                            StringBuilder q3 = v4.a.q("Restoring the Navigation back stack failed: destination ", a.a.x(oVar5, C), " cannot be found from the current destination ");
                            q3.append(hVar3.i());
                            throw new IllegalStateException(q3.toString());
                        }
                        androidx.lifecycle.p j = hVar3.j();
                        n4.l lVar2 = hVar3.f8006o;
                        oVar5.getClass();
                        j.getClass();
                        Context context = oVar5.f1772d;
                        bundle4.setClassLoader(context != null ? context.getClassLoader() : null);
                        n4.h hVar5 = new n4.h(oVar5, d12, bundle4, j, lVar2, J, bundle5);
                        n4.h0 b10 = i0Var7.b(d12.f7114d);
                        Object obj4 = linkedHashMap.get(b10);
                        if (obj4 == null) {
                            obj4 = new n4.k(xVar2, b10);
                            linkedHashMap.put(b10, obj4);
                        }
                        sVar.addLast(hVar5);
                        ((n4.k) obj4).a(hVar5);
                        n4.u uVar9 = hVar5.f7063e.f7116i;
                        if (uVar9 != null) {
                            hVar3.l(hVar5, hVar3.g(uVar9.f7115e.f1694a));
                        }
                        i21 = i23 + 1;
                        bundleArr = bundleArr2;
                        length2 = i22;
                    }
                    hVar3.f7995b.invoke();
                    hVar3.f7998e = null;
                }
                Collection values = p0.h(i0Var7.f7074a).values();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : values) {
                    if (!((n4.h0) obj5).f7071b) {
                        arrayList4.add(obj5);
                    }
                }
                int size3 = arrayList4.size();
                int i25 = 0;
                while (i25 < size3) {
                    Object obj6 = arrayList4.get(i25);
                    i25++;
                    n4.h0 h0Var2 = (n4.h0) obj6;
                    Object obj7 = linkedHashMap.get(h0Var2);
                    if (obj7 == null) {
                        h0Var2.getClass();
                        obj7 = new n4.k(xVar2, h0Var2);
                        linkedHashMap.put(h0Var2, obj7);
                    }
                    h0Var2.getClass();
                    h0Var2.f7070a = (n4.k) obj7;
                    h0Var2.f7071b = true;
                }
                if (hVar3.f7996c == null || !sVar.isEmpty()) {
                    i0Var2 = i0Var6;
                    i10 = i13;
                    uVar2 = uVar5;
                    c10 = '\f';
                    hVar3.b();
                } else {
                    Activity activity = xVar2.f7132d;
                    if (!xVar2.f7133e && activity != null) {
                        Intent intent = activity.getIntent();
                        q4.h hVar6 = xVar2.f7130b;
                        if (intent != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                try {
                                    iArr = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                } catch (Exception e2) {
                                    i10 = i13;
                                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e2);
                                    iArr = null;
                                }
                            } else {
                                iArr = null;
                            }
                            i10 = i13;
                            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            kotlin.collections.k0.f5575d.getClass();
                            ArrayList arrayList5 = parcelableArrayList;
                            Bundle h10 = w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                            Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle6 != null) {
                                h10.putAll(bundle6);
                            }
                            if (iArr == null || iArr.length == 0) {
                                ?? k10 = hVar6.k();
                                iArr2 = iArr;
                                uVar2 = uVar5;
                                i0Var2 = i0Var6;
                                n4.r f11 = k10.f(new a1.n(intent.getData(), intent.getAction(), intent.getType(), 28), k10);
                                if (f11 != null) {
                                    s sVar5 = f11.f7108d;
                                    kotlin.collections.s sVar6 = new kotlin.collections.s();
                                    s sVar7 = sVar5;
                                    while (true) {
                                        w1 w1Var2 = sVar7.f7115e;
                                        n4.u uVar10 = sVar7.f7116i;
                                        if (uVar10 == null || uVar10.f7125t.f3827a != w1Var2.f1694a) {
                                            sVar6.addFirst(sVar7);
                                        }
                                        if (!Intrinsics.a(uVar10, null) && uVar10 != null) {
                                            sVar7 = uVar10;
                                        }
                                    }
                                    List Q = CollectionsKt.Q(sVar6);
                                    ArrayList arrayList6 = new ArrayList(z.j(Q, 10));
                                    Iterator it5 = Q.iterator();
                                    while (it5.hasNext()) {
                                        arrayList6.add(Integer.valueOf(((s) it5.next()).f7115e.f1694a));
                                    }
                                    int[] P = CollectionsKt.P(arrayList6);
                                    Bundle b11 = sVar5.b(f11.f7109e);
                                    if (b11 != null) {
                                        h10.putAll(b11);
                                    }
                                    iArr3 = P;
                                    arrayList = null;
                                    if (iArr3 != null && iArr3.length != 0) {
                                        hVar6.getClass();
                                        n4.u uVar11 = hVar6.f7996c;
                                        length = iArr3.length;
                                        i11 = 0;
                                        while (true) {
                                            if (i11 < length) {
                                                str = null;
                                                break;
                                            }
                                            int i26 = iArr3[i11];
                                            if (i11 == 0) {
                                                n4.u uVar12 = hVar6.f7996c;
                                                uVar12.getClass();
                                                p10 = uVar12.f7115e.f1694a == i26 ? hVar6.f7996c : null;
                                            } else {
                                                uVar11.getClass();
                                                p10 = uVar11.f7125t.p(i26);
                                            }
                                            if (p10 == null) {
                                                int i27 = s.f7113s;
                                                str = a.a.x(hVar6.f7994a.f7131c, i26);
                                                break;
                                            }
                                            if (i11 != iArr3.length - 1 && (p10 instanceof n4.u)) {
                                                while (true) {
                                                    uVar4 = (n4.u) p10;
                                                    uVar4.getClass();
                                                    e3.o oVar6 = uVar4.f7125t;
                                                    if (!(oVar6.p(oVar6.f3827a) instanceof n4.u)) {
                                                        break;
                                                    } else {
                                                        p10 = oVar6.p(oVar6.f3827a);
                                                    }
                                                }
                                                uVar11 = uVar4;
                                            }
                                            i11++;
                                        }
                                        if (str == null) {
                                            Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                                        } else {
                                            h10.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                            int length3 = iArr3.length;
                                            Bundle[] bundleArr3 = new Bundle[length3];
                                            for (int i28 = 0; i28 < length3; i28++) {
                                                kotlin.collections.k0.f5575d.getClass();
                                                Bundle h11 = w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                                h11.putAll(h10);
                                                if (arrayList != null && (bundle = (Bundle) arrayList.get(i28)) != null) {
                                                    h11.putAll(bundle);
                                                }
                                                bundleArr3[i28] = h11;
                                            }
                                            int flags = intent.getFlags();
                                            int i29 = 268435456 & flags;
                                            if (i29 != 0 && (flags & 32768) == 0) {
                                                intent.addFlags(32768);
                                                Context context2 = xVar2.f7129a;
                                                ArrayList arrayList7 = new ArrayList();
                                                ComponentName component = intent.getComponent();
                                                if (component == null) {
                                                    component = intent.resolveActivity(context2.getPackageManager());
                                                }
                                                if (component != null) {
                                                    int size4 = arrayList7.size();
                                                    try {
                                                        for (Intent x10 = w.x(context2, component); x10 != null; x10 = w.x(context2, x10.getComponent())) {
                                                            arrayList7.add(size4, x10);
                                                        }
                                                    } catch (PackageManager.NameNotFoundException e9) {
                                                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                                        throw new IllegalArgumentException(e9);
                                                    }
                                                }
                                                arrayList7.add(intent);
                                                if (arrayList7.isEmpty()) {
                                                    i0.l("No intents added to TaskStackBuilder; cannot startActivities");
                                                    return;
                                                }
                                                Intent[] intentArr = (Intent[]) arrayList7.toArray(new Intent[0]);
                                                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                                                context2.startActivities(intentArr, null);
                                                activity.finish();
                                                activity.overridePendingTransition(0, 0);
                                                c10 = '\f';
                                            } else if (i29 != 0) {
                                                if (!hVar6.f7999f.isEmpty()) {
                                                    n4.u uVar13 = hVar6.f7996c;
                                                    uVar13.getClass();
                                                    hVar6.n(uVar13.f7115e.f1694a, true, false);
                                                }
                                                int i30 = 0;
                                                while (i30 < iArr3.length) {
                                                    int i31 = iArr3[i30];
                                                    int i32 = i30 + 1;
                                                    Bundle bundle7 = bundleArr3[i30];
                                                    s d13 = hVar6.d(i31, null);
                                                    if (d13 == null) {
                                                        int i33 = s.f7113s;
                                                        StringBuilder q7 = v4.a.q("Deep Linking failed: destination ", a.a.x(oVar5, i31), " cannot be found from the current destination ");
                                                        q7.append(hVar6.i());
                                                        throw new IllegalStateException(q7.toString());
                                                    }
                                                    hVar6.m(d13, bundle7, c6.f.S(new l0(12, d13, xVar2)));
                                                    i30 = i32;
                                                }
                                                c10 = '\f';
                                                xVar2.f7133e = true;
                                            } else {
                                                c10 = '\f';
                                                n4.u uVar14 = hVar6.f7996c;
                                                int length4 = iArr3.length;
                                                for (int i34 = 0; i34 < length4; i34++) {
                                                    int i35 = iArr3[i34];
                                                    Bundle bundle8 = bundleArr3[i34];
                                                    if (i34 == 0) {
                                                        p4 = hVar6.f7996c;
                                                    } else {
                                                        uVar14.getClass();
                                                        p4 = uVar14.f7125t.p(i35);
                                                    }
                                                    if (p4 == null) {
                                                        int i36 = s.f7113s;
                                                        throw new IllegalStateException("Deep Linking failed: destination " + a.a.x(oVar5, i35) + " cannot be found in graph " + uVar14);
                                                    }
                                                    if (i34 == iArr3.length - 1) {
                                                        n4.u uVar15 = hVar6.f7996c;
                                                        uVar15.getClass();
                                                        hVar6.m(p4, bundle8, new a0(false, false, uVar15.f7115e.f1694a, true, false, 0, 0));
                                                    } else if (p4 instanceof n4.u) {
                                                        while (true) {
                                                            uVar3 = (n4.u) p4;
                                                            uVar3.getClass();
                                                            e3.o oVar7 = uVar3.f7125t;
                                                            if (!(oVar7.p(oVar7.f3827a) instanceof n4.u)) {
                                                                break;
                                                            } else {
                                                                p4 = oVar7.p(oVar7.f3827a);
                                                            }
                                                        }
                                                        uVar14 = uVar3;
                                                    }
                                                }
                                                xVar2.f7133e = true;
                                            }
                                        }
                                    }
                                    c10 = '\f';
                                    n4.u uVar16 = hVar3.f7996c;
                                    uVar16.getClass();
                                    hVar3.m(uVar16, null, null);
                                }
                            } else {
                                iArr2 = iArr;
                                i0Var2 = i0Var6;
                                uVar2 = uVar5;
                            }
                            arrayList = arrayList5;
                            iArr3 = iArr2;
                            if (iArr3 != null) {
                                hVar6.getClass();
                                n4.u uVar112 = hVar6.f7996c;
                                length = iArr3.length;
                                i11 = 0;
                                while (true) {
                                    if (i11 < length) {
                                    }
                                    i11++;
                                }
                                if (str == null) {
                                }
                            }
                            c10 = '\f';
                            n4.u uVar162 = hVar3.f7996c;
                            uVar162.getClass();
                            hVar3.m(uVar162, null, null);
                        }
                    }
                    i0Var2 = i0Var6;
                    i10 = i13;
                    uVar2 = uVar5;
                    c10 = '\f';
                    n4.u uVar1622 = hVar3.f7996c;
                    uVar1622.getClass();
                    hVar3.m(uVar1622, null, null);
                }
            }
            n4.i0 i0Var8 = i0Var2;
            n4.h0 b12 = i0Var8.b("composable");
            o4.i iVar3 = b12 instanceof o4.i ? (o4.i) b12 : null;
            if (iVar3 == null) {
                s1 r10 = i0Var.r();
                if (r10 != null) {
                    final int i37 = 2;
                    r10.f6812d = new Function2() { // from class: o4.t
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            switch (i37) {
                                case 0:
                                    ((Integer) obj9).getClass();
                                    g8.b.g(xVar, uVar, lVar, dVar, function1, function12, function13, function14, (n0.i0) obj8, n0.h.z(i3 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj9).getClass();
                                    g8.b.g(xVar, uVar, lVar, dVar, function1, function12, function13, function14, (n0.i0) obj8, n0.h.z(i3 | 1));
                                    break;
                                default:
                                    ((Integer) obj9).getClass();
                                    g8.b.g(xVar, uVar, lVar, dVar, function1, function12, function13, function14, (n0.i0) obj8, n0.h.z(i3 | 1));
                                    break;
                            }
                            return Unit.f5554a;
                        }
                    };
                    return;
                }
                return;
            }
            ?? r13 = i0Var;
            z0 k11 = n0.h.k(iVar3.b().f7081e, r13);
            Object L = r13.L();
            Object obj8 = k.f6729a;
            if (L == obj8) {
                L = new f1(0.0f);
                r13.g0(L);
            }
            f1 f1Var2 = (f1) L;
            Object L2 = r13.L();
            if (L2 == obj8) {
                L2 = n0.h.r(Boolean.FALSE);
                r13.g0(L2);
            }
            z0 z0Var5 = (z0) L2;
            boolean z11 = ((List) k11.getValue()).size() > 1;
            boolean f12 = r13.f(k11) | r13.h(iVar3);
            Object L3 = r13.L();
            if (f12 || L3 == obj8) {
                o4.i iVar4 = iVar3;
                w1Var = new n0.w1(iVar4, k11, f1Var2, z0Var5, null);
                z0Var = k11;
                f1Var = f1Var2;
                z0Var2 = z0Var5;
                iVar3 = iVar4;
                r13.g0(w1Var);
            } else {
                w1Var = L3;
                z0Var = k11;
                f1Var = f1Var2;
                z0Var2 = z0Var5;
            }
            a.a.e(z11, (Function2) w1Var, r13, 0);
            androidx.lifecycle.u uVar17 = uVar2;
            boolean h12 = r13.h(xVar) | r13.h(uVar17);
            Object L4 = r13.L();
            if (h12 || L4 == obj8) {
                L4 = new l0(15, xVar, uVar17);
                r13.g0(L4);
            }
            n0.h.d(uVar17, (Function1) L4, r13);
            a1.j c11 = a1.s.c(r13);
            z0 k12 = n0.h.k(hVar3.f8001i, r13);
            Object L5 = r13.L();
            if (L5 == obj8) {
                L5 = n0.h.o(new a1.b(18, k12));
                r13.g0(L5);
            }
            m2 m2Var2 = (m2) L5;
            n4.h hVar7 = (n4.h) CollectionsKt.D((List) m2Var2.getValue());
            Object L6 = r13.L();
            if (L6 == obj8) {
                int i38 = s.l0.f8344a;
                L6 = new b0(6);
                r13.g0(L6);
            }
            b0 b0Var3 = (b0) L6;
            if (hVar7 != null) {
                r13.W(-1797563167);
                boolean h13 = r13.h(iVar3) | ((((i10 & 3670016) ^ 1572864) > 1048576 && r13.f(function13)) || (i10 & 1572864) == 1048576) | ((i10 & 57344) == 16384);
                Object L7 = r13.L();
                if (h13 || L7 == obj8) {
                    z10 = true;
                    b0Var = b0Var3;
                    i0Var4 = i0Var8;
                    iVar = iVar3;
                    hVar = hVar7;
                    o4.q qVar = new o4.q(iVar, function13, function1, z0Var2, 1);
                    r13.g0(qVar);
                    L7 = qVar;
                } else {
                    b0Var = b0Var3;
                    z10 = true;
                    i0Var4 = i0Var8;
                    iVar = iVar3;
                    hVar = hVar7;
                }
                Function1 function16 = (Function1) L7;
                boolean h14 = r13.h(iVar) | (((((i10 & 29360128) ^ 12582912) <= 8388608 || !r13.f(function14)) && (i10 & 12582912) != 8388608) ? false : z10) | ((i10 & 458752) == 131072 ? z10 : false);
                Object L8 = r13.L();
                if (h14 || L8 == obj8) {
                    function15 = function16;
                    o4.q qVar2 = new o4.q(iVar, function14, function12, z0Var2, 0);
                    r13.g0(qVar2);
                    L8 = qVar2;
                } else {
                    function15 = function16;
                }
                final Function1 function17 = (Function1) L8;
                boolean z12 = (i10 & 234881024) == 67108864 ? z10 : false;
                Object L9 = r13.L();
                if (z12 || L9 == obj8) {
                    L9 = new m2.u(21);
                    r13.g0(L9);
                }
                final Function1 function18 = (Function1) L9;
                Boolean bool = Boolean.TRUE;
                boolean h15 = r13.h(iVar);
                Object L10 = r13.L();
                if (h15 || L10 == obj8) {
                    L10 = new l0(14, m2Var2, iVar);
                    r13.g0(L10);
                }
                n0.h.d(bool, (Function1) L10, r13);
                Object L11 = r13.L();
                if (L11 == obj8) {
                    L11 = new v.h0(hVar);
                    r13.g0(L11);
                }
                v.h0 h0Var3 = (v.h0) L11;
                boolean f13 = r13.f(h0Var3);
                final z0 z0Var6 = z0Var2;
                Object L12 = r13.L();
                if (f13 || L12 == obj8) {
                    b1.i e10 = b1.x.e();
                    Function1 e11 = e10 != null ? e10.e() : null;
                    m2Var = m2Var2;
                    b1.i h16 = b1.x.h(e10);
                    i0Var3 = i0Var4;
                    try {
                        v.z0 z0Var7 = new v.z0(h0Var3, null, "entry");
                        b1.x.k(e10, h16, e11);
                        r13.g0(z0Var7);
                        L12 = z0Var7;
                    } catch (Throwable th) {
                        b1.x.k(e10, h16, e11);
                        throw th;
                    }
                } else {
                    m2Var = m2Var2;
                    i0Var3 = i0Var4;
                }
                ?? r42 = (v.z0) L12;
                if (h0Var3 != null) {
                    r13.W(-1357590553);
                    Object L13 = r13.L();
                    if (L13 == obj8) {
                        L13 = n0.h.m(kotlin.coroutines.g.f5592d, r13);
                        r13.g0(L13);
                    }
                    ge.x xVar3 = (ge.x) L13;
                    boolean h17 = r13.h(xVar3) | r13.f(h0Var3);
                    Object L14 = r13.L();
                    if (h17 || L14 == obj8) {
                        L14 = new l0(19, h0Var3, xVar3);
                        r13.g0(L14);
                    }
                    n0.h.d(xVar3, (Function1) L14, r13);
                    Object value = h0Var3.f9809i.getValue();
                    Object value2 = h0Var3.f9808e.getValue();
                    boolean f14 = r13.f(h0Var3);
                    Object L15 = r13.L();
                    if (f14 || L15 == obj8) {
                        r15 = null;
                        L15 = new b5.t(h0Var3, (ld.a) r15, 12);
                        r13.g0(L15);
                    } else {
                        r15 = null;
                    }
                    n0.h.e(value, value2, (Function2) L15, r13);
                    r13.p(false);
                } else {
                    r15 = null;
                    r13.W(-1356604288);
                    r42.a(h0Var3.f9808e.getValue(), r13, 0);
                    r13.p(false);
                }
                boolean f15 = r13.f(r42);
                Object L16 = r13.L();
                if (f15 || L16 == obj8) {
                    L16 = new a1.d(20, (Object) r42);
                    r13.g0(L16);
                }
                n0.h.d(r42, (Function1) L16, r13);
                if (((Boolean) z0Var6.getValue()).booleanValue()) {
                    r13.W(-1795329152);
                    Float valueOf = Float.valueOf(f1Var.h());
                    boolean f16 = r13.f(z0Var) | r13.h(h0Var3);
                    Object L17 = r13.L();
                    if (f16 || L17 == obj8) {
                        ?? r23 = r15;
                        L17 = new b5.t(h0Var3, z0Var, f1Var, r23, 8);
                        r13.g0(L17);
                        oVar3 = r23;
                    } else {
                        oVar3 = r15;
                    }
                    n0.h.f(valueOf, (Function2) L17, r13);
                    r13.p(false);
                    h0Var = h0Var3;
                    z0Var3 = r42;
                    hVar2 = hVar;
                    oVar2 = oVar3;
                } else {
                    ?? r232 = r15;
                    r13.W(-1794910745);
                    boolean h18 = r13.h(h0Var3) | r13.h(hVar) | r13.f(r42);
                    Object L18 = r13.L();
                    if (h18 || L18 == obj8) {
                        h0Var = h0Var3;
                        z0Var3 = r42;
                        n4.h hVar8 = hVar;
                        L18 = new l2(h0Var, hVar8, z0Var3, r232, 3);
                        hVar2 = hVar8;
                        r13.g0(L18);
                    } else {
                        h0Var = h0Var3;
                        z0Var3 = r42;
                        hVar2 = hVar;
                    }
                    n0.h.f(hVar2, (Function2) L18, r13);
                    r13.p(false);
                    oVar2 = r232;
                }
                boolean h19 = r13.h(b0Var) | r13.h(iVar) | r13.f(function15) | r13.f(function17) | r13.f(function18);
                Object L19 = r13.L();
                if (h19 || L19 == obj8) {
                    final o4.i iVar5 = iVar;
                    final b0 b0Var4 = b0Var;
                    final Function1 function19 = function15;
                    final m2 m2Var3 = m2Var;
                    obj = new Function1() { // from class: o4.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            u.o oVar8 = (u.o) obj9;
                            float f17 = 0.0f;
                            if (!((List) m2Var3.getValue()).contains(oVar8.a())) {
                                u.h0 h0Var4 = u.h0.f9516b;
                                u.i0 i0Var9 = u.i0.f9518b;
                                int i39 = u.f.f9508b;
                                return new u.v(h0Var4, i0Var9, 0.0f, new u.l0(u.e.f9502d));
                            }
                            String str4 = ((n4.h) oVar8.a()).f7067t;
                            b0 b0Var5 = b0.this;
                            int b13 = b0Var5.b(str4);
                            if (b13 >= 0) {
                                f17 = b0Var5.f8269c[b13];
                            } else {
                                b0Var5.d(str4, 0.0f);
                            }
                            if (!Intrinsics.a(((n4.h) oVar8.c()).f7067t, ((n4.h) oVar8.a()).f7067t)) {
                                f17 = (((Boolean) iVar5.f7477c.getValue()).booleanValue() || ((Boolean) z0Var6.getValue()).booleanValue()) ? f17 - 1.0f : f17 + 1.0f;
                            }
                            b0Var5.d(((n4.h) oVar8.c()).f7067t, f17);
                            return new u.v((u.h0) function19.invoke(oVar8), (u.i0) function17.invoke(oVar8), f17, (u.l0) function18.invoke(oVar8));
                        }
                    };
                    iVar2 = iVar5;
                    z0Var4 = z0Var6;
                    b0Var2 = b0Var4;
                    r13.g0(obj);
                } else {
                    obj = L19;
                    b0Var2 = b0Var;
                    z0Var4 = z0Var6;
                    iVar2 = iVar;
                }
                Function1 function110 = (Function1) obj;
                Object L20 = r13.L();
                if (L20 == obj8) {
                    L20 = new m2.u(23);
                    r13.g0(L20);
                }
                v.z0 z0Var8 = z0Var3;
                u.f.a(z0Var8, lVar, function110, dVar, (Function1) L20, x0.i.d(820763100, new o4.v(h0Var, hVar2, c11, z0Var4, m2Var), r13), r13, ((i10 >> 3) & 112) | 221184 | (i10 & 7168));
                Object l10 = z0Var8.f9917a.l();
                Object value3 = z0Var8.f9920d.getValue();
                boolean f17 = r13.f(z0Var8) | r13.h(xVar) | r13.h(hVar2) | r13.h(iVar2) | r13.h(b0Var2);
                Object L21 = r13.L();
                if (f17 || L21 == obj8) {
                    o4.w wVar = new o4.w(z0Var8, xVar, hVar2, b0Var2, m2Var, iVar2, null);
                    r13.g0(wVar);
                    L21 = wVar;
                }
                n0.h.e(l10, value3, (Function2) L21, r13);
                r13.p(false);
                oVar = oVar2;
            } else {
                i0Var3 = i0Var8;
                oVar = null;
                r13.W(-1789758886);
                r13.p(false);
            }
            n4.h0 b13 = i0Var3.b("dialog");
            o oVar8 = b13 instanceof o ? (o) b13 : oVar;
            if (oVar8 == null) {
                s1 r11 = r13.r();
                if (r11 != null) {
                    final int i39 = 0;
                    r11.f6812d = new Function2() { // from class: o4.t
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj82, Object obj9) {
                            switch (i39) {
                                case 0:
                                    ((Integer) obj9).getClass();
                                    g8.b.g(xVar, uVar, lVar, dVar, function1, function12, function13, function14, (n0.i0) obj82, n0.h.z(i3 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj9).getClass();
                                    g8.b.g(xVar, uVar, lVar, dVar, function1, function12, function13, function14, (n0.i0) obj82, n0.h.z(i3 | 1));
                                    break;
                                default:
                                    ((Integer) obj9).getClass();
                                    g8.b.g(xVar, uVar, lVar, dVar, function1, function12, function13, function14, (n0.i0) obj82, n0.h.z(i3 | 1));
                                    break;
                            }
                            return Unit.f5554a;
                        }
                    };
                    return;
                }
                return;
            }
            w.b(oVar8, r13, 0);
            i0Var5 = r13;
        }
        s1 r12 = i0Var5.r();
        if (r12 != null) {
            final int i40 = 1;
            r12.f6812d = new Function2() { // from class: o4.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj82, Object obj9) {
                    switch (i40) {
                        case 0:
                            ((Integer) obj9).getClass();
                            g8.b.g(xVar, uVar, lVar, dVar, function1, function12, function13, function14, (n0.i0) obj82, n0.h.z(i3 | 1));
                            break;
                        case 1:
                            ((Integer) obj9).getClass();
                            g8.b.g(xVar, uVar, lVar, dVar, function1, function12, function13, function14, (n0.i0) obj82, n0.h.z(i3 | 1));
                            break;
                        default:
                            ((Integer) obj9).getClass();
                            g8.b.g(xVar, uVar, lVar, dVar, function1, function12, function13, function14, (n0.i0) obj82, n0.h.z(i3 | 1));
                            break;
                    }
                    return Unit.f5554a;
                }
            };
        }
    }

    public static final void h(Function0 function0, Function0 function02, n0.i0 i0Var, int i3) {
        n0.i0 i0Var2;
        function0.getClass();
        function02.getClass();
        i0Var.X(-1645657982);
        int i10 = (i0Var.h(function0) ? 4 : 2) | i3 | (i0Var.h(function02) ? 32 : 16);
        if (i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            i0Var2 = i0Var;
            b0.i.a(x.g.c(b0.w0.a(1.0f), u9.a.g, k1.v.f5351b), d1.a.f3286s, x0.i.d(436253676, new o9.c(0, function0, function02), i0Var), i0Var2, 3120, 4);
        } else {
            i0Var2 = i0Var;
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new u(i3, 7, function0, function02);
        }
    }

    public static final j1.d i(float f3, float f10, float f11, float f12, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new j1.d(f3, f10, f11, f12, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final void j(List list, d1.l lVar, n0.i0 i0Var, int i3) {
        d1.l lVar2;
        n0.i0 i0Var2;
        i0Var.X(560365377);
        int i10 = (i0Var.f(list) ? 4 : 2) | i3 | (i0Var.f(lVar) ? 32 : 16);
        if (i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            lVar2 = lVar;
            i0Var2 = i0Var;
            b0.i.a(lVar2, null, x0.i.d(-1286482901, new ge.g(5, list), i0Var), i0Var2, ((i10 >> 3) & 14) | 3072, 6);
        } else {
            lVar2 = lVar;
            i0Var2 = i0Var;
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new u(i3, 9, list, lVar2);
        }
    }

    public static final void k(j9.b bVar, d1.l lVar, n0.i0 i0Var, int i3) {
        n0.i0 i0Var2 = i0Var;
        i0Var2.X(-1013944614);
        int i10 = i3 | (i0Var2.f(bVar) ? 4 : 2) | (i0Var2.f(lVar) ? 32 : 16);
        if (i0Var2.O(i10 & 1, (i10 & 19) != 18)) {
            d1.l c10 = b0.i.c(lVar, 3.7586207f);
            a2.g0 d10 = b0.p.d(d1.a.f3286s);
            int hashCode = Long.hashCode(i0Var2.T);
            x0.h l10 = i0Var2.l();
            d1.l C = w.C(c10, i0Var2);
            c2.g.f1541a.getClass();
            c2.z zVar = c2.f.f1533b;
            i0Var2.Z();
            if (i0Var2.S) {
                i0Var2.k(zVar);
            } else {
                i0Var2.j0();
            }
            c2.e eVar = c2.f.f1536e;
            n0.h.y(d10, eVar, i0Var2);
            c2.e eVar2 = c2.f.f1535d;
            n0.h.y(l10, eVar2, i0Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            c2.e eVar3 = c2.f.f1537f;
            n0.h.y(valueOf, eVar3, i0Var2);
            c2.d dVar = c2.f.g;
            n0.h.t(i0Var2, dVar);
            c2.e eVar4 = c2.f.f1534c;
            n0.h.y(C, eVar4, i0Var2);
            x.g.b(k7.e.B(R.drawable.record, i0Var2, 0), b0.w0.a(1.0f), null, a2.h.f98d, 0.0f, i0Var2, 25016);
            d1.l i11 = b0.i.i(b0.w0.b(1.0f), 18, 0);
            b0.t0 a9 = r0.a(b0.g.f842a, i0Var2, 48);
            int hashCode2 = Long.hashCode(i0Var2.T);
            x0.h l11 = i0Var2.l();
            d1.l C2 = w.C(i11, i0Var2);
            i0Var2.Z();
            if (i0Var2.S) {
                i0Var2.k(zVar);
            } else {
                i0Var2.j0();
            }
            n0.h.y(a9, eVar, i0Var2);
            n0.h.y(l11, eVar2, i0Var2);
            n0.h.y(Integer.valueOf(hashCode2), eVar3, i0Var2);
            n0.h.t(i0Var2, dVar);
            n0.h.y(C2, eVar4, i0Var2);
            x.g.b(k7.e.B(R.drawable.record_icon, i0Var2, 0), b0.w0.d(28), null, a2.h.f96b, 0.0f, i0Var2, 25016);
            i0Var2 = i0Var;
            a.a.b(String.valueOf(bVar.f5118b), v.c(23), b0.i.j(7), 0L, 0L, 5.0f, null, null, null, i0Var2, 197040, 472);
            if (1.0f <= 0.0d) {
                c0.a.a("invalid weight; must be greater than zero");
            }
            b0.i.b(new b0.i0(1.0f, true), i0Var2);
            a.a.b(bVar.f5119c, v.c(23), null, 0L, 0L, 5.0f, null, null, null, i0Var2, 196656, 476);
            i0Var2.p(true);
            i0Var2.p(true);
        } else {
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new u(i3, 10, bVar, lVar);
        }
    }

    public static final Object[] l(Object[] objArr, int i3, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        kotlin.collections.v.g(0, i3, 6, objArr, objArr2);
        kotlin.collections.v.d(i3 + 2, i3, objArr.length, objArr, objArr2);
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] m(int i3, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        kotlin.collections.v.g(0, i3, 6, objArr, objArr2);
        kotlin.collections.v.d(i3, i3 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] n(int i3, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        kotlin.collections.v.g(0, i3, 6, objArr, objArr2);
        kotlin.collections.v.d(i3, i3 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static c3.k o(e0 e0Var) {
        c3.i iVar = new c3.i();
        iVar.f1738c = new c3.l();
        c3.k kVar = new c3.k(iVar);
        iVar.f1737b = kVar;
        iVar.f1736a = v4.a.class;
        try {
            e0Var.o(new a3.d(8, iVar, e0Var));
            iVar.f1736a = "Deferred.asListenableFuture";
            return kVar;
        } catch (Exception e2) {
            kVar.f1742e.k(e2);
            return kVar;
        }
    }

    public static final Unit p(c2.i iVar, a2.a0 a0Var) {
        d1.k kVar;
        c2.b1 b1Var;
        d1.k kVar2 = (d1.k) iVar;
        boolean z10 = kVar2.f3305d.B;
        if (!z10) {
            return Unit.f5554a;
        }
        if (!z10) {
            z1.a.b("visitAncestors called on an unattached node");
        }
        d1.k kVar3 = kVar2.f3305d.f3309s;
        g0 u2 = c2.k.u(iVar);
        loop0: while (true) {
            if (u2 == null) {
                kVar = null;
                break;
            }
            if ((((d1.k) u2.S.g).f3308r & 524288) != 0) {
                while (kVar3 != null) {
                    if ((kVar3.f3307i & 524288) != 0) {
                        kVar = kVar3;
                        o0.e eVar = null;
                        while (kVar != null) {
                            if (kVar instanceof d2.l) {
                                break loop0;
                            }
                            if ((kVar.f3307i & 524288) != 0 && (kVar instanceof c2.j)) {
                                int i3 = 0;
                                for (d1.k kVar4 = ((c2.j) kVar).D; kVar4 != null; kVar4 = kVar4.f3310t) {
                                    if ((kVar4.f3307i & 524288) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            kVar = kVar4;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new o0.e(new d1.k[16]);
                                            }
                                            if (kVar != null) {
                                                eVar.b(kVar);
                                                kVar = null;
                                            }
                                            eVar.b(kVar4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            kVar = c2.k.e(eVar);
                        }
                    }
                    kVar3 = kVar3.f3309s;
                }
            }
            u2 = u2.s();
            kVar3 = (u2 == null || (b1Var = u2.S) == null) ? null : (z1) b1Var.f1495f;
        }
        d2.l lVar = (d2.l) kVar;
        if (lVar == null) {
            return Unit.f5554a;
        }
        i1 t6 = c2.k.t(iVar);
        a3.a0 a0Var2 = new a3.a0(5, a0Var, t6);
        long K = t6.K(0L);
        j1.c cVar = (j1.c) a0Var2.invoke();
        j1.c e2 = cVar != null ? cVar.e(K) : null;
        if (e2 != null) {
            lVar.D.requestRectangleOnScreen(new Rect((int) e2.f4916a, (int) e2.f4917b, (int) e2.f4918c, (int) e2.f4919d), false);
        }
        Unit unit = Unit.f5554a;
        md.a aVar = md.a.f6622d;
        return unit;
    }

    public static final re.f q(String str, re.e[] eVarArr, Function1 function1) {
        if (StringsKt.r(str)) {
            a1.e("Blank serial names are prohibited");
            return null;
        }
        re.a aVar = new re.a(str);
        function1.invoke(aVar);
        return new re.f(str, re.h.g, aVar.f8230b.size(), kotlin.collections.w.v(eVarArr), aVar);
    }

    public static final re.f r(String str, i7.a aVar, re.e[] eVarArr, Function1 function1) {
        if (StringsKt.r(str)) {
            a1.e("Blank serial names are prohibited");
            return null;
        }
        if (aVar.equals(re.h.g)) {
            a1.e("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        re.a aVar2 = new re.a(str);
        function1.invoke(aVar2);
        return new re.f(str, aVar, aVar2.f8230b.size(), kotlin.collections.w.v(eVarArr), aVar2);
    }

    public static final p2.j s(Context context) {
        return new p2.j(new c4.o(context, 3), new p2.a(Build.VERSION.SDK_INT >= 31 ? p2.t.f7649a.a(context) : 0));
    }

    public static void t(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        String valueOf = String.valueOf(file);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 39);
        sb2.append("Unable to create parent directories of ");
        sb2.append(valueOf);
        throw new IOException(sb2.toString());
    }

    public static void v(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l8.b bVar = (l8.b) obj;
            l8.h hVar = new l8.h(bVar);
            for (l8.r rVar : bVar.f5899b) {
                boolean z10 = bVar.f5902e == 0;
                l8.i iVar = new l8.i(rVar, !z10);
                if (!hashMap.containsKey(iVar)) {
                    hashMap.put(iVar, new HashSet());
                }
                Set set = (Set) hashMap.get(iVar);
                if (!set.isEmpty() && z10) {
                    a1.g(rVar, ".", "Multiple components provide ");
                    return;
                }
                set.add(hVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (l8.h hVar2 : (Set) it.next()) {
                for (l8.j jVar : hVar2.f5915a.f5900c) {
                    if (jVar.f5922c == 0) {
                        Set<l8.h> set2 = (Set) hashMap.get(new l8.i(jVar.f5920a, jVar.f5921b == 2));
                        if (set2 != null) {
                            for (l8.h hVar3 : set2) {
                                hVar2.f5916b.add(hVar3);
                                hVar3.f5917c.add(hVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            l8.h hVar4 = (l8.h) it3.next();
            if (hVar4.f5917c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            l8.h hVar5 = (l8.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i3++;
            Iterator it4 = hVar5.f5916b.iterator();
            while (it4.hasNext()) {
                l8.h hVar6 = (l8.h) it4.next();
                hVar6.f5917c.remove(hVar5);
                if (hVar6.f5917c.isEmpty()) {
                    hashSet2.add(hVar6);
                }
            }
        }
        if (i3 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            l8.h hVar7 = (l8.h) it5.next();
            if (!hVar7.f5917c.isEmpty() && !hVar7.f5916b.isEmpty()) {
                arrayList2.add(hVar7.f5915a);
            }
        }
        throw new l8.k("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()), 3);
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final void y(i5.a aVar, String str) {
        aVar.getClass();
        i5.c K = aVar.K(str);
        try {
            K.E();
            cf.c.m(K, null);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e A[EDGE_INSN: B:48:0x008e->B:32:0x008e BREAK  A[LOOP:0: B:10:0x0014->B:33:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List z(k4.d dVar, int i3, int i10) {
        Pair pair;
        boolean z10;
        dVar.getClass();
        if (i3 == i10) {
            return j0.f5574d;
        }
        boolean z11 = i10 > i3;
        ArrayList arrayList = new ArrayList();
        do {
            if (z11) {
                if (i3 >= i10) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap = dVar.f5388a;
                if (z11) {
                    TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                    if (treeMap != null) {
                        pair = new Pair(treeMap, treeMap.keySet());
                        if (pair != null) {
                        }
                    }
                    pair = null;
                    if (pair != null) {
                    }
                } else {
                    TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                    if (treeMap2 != null) {
                        pair = new Pair(treeMap2, treeMap2.descendingKeySet());
                        if (pair != null) {
                            break;
                        }
                        Map map = (Map) pair.f5552d;
                        Iterator it = ((Iterable) pair.f5553e).iterator();
                        while (it.hasNext()) {
                            int intValue = ((Number) it.next()).intValue();
                            if (!z11) {
                                if (i10 <= intValue && intValue < i3) {
                                    Object obj = map.get(Integer.valueOf(intValue));
                                    obj.getClass();
                                    arrayList.add(obj);
                                    z10 = true;
                                    i3 = intValue;
                                    break;
                                    break;
                                }
                            } else if (i3 + 1 <= intValue && intValue <= i10) {
                                Object obj2 = map.get(Integer.valueOf(intValue));
                                obj2.getClass();
                                arrayList.add(obj2);
                                z10 = true;
                                i3 = intValue;
                                break;
                            }
                        }
                        z10 = false;
                    }
                    pair = null;
                    if (pair != null) {
                    }
                }
            } else {
                if (i3 <= i10) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap2 = dVar.f5388a;
                if (z11) {
                }
            }
        } while (z10);
        return null;
    }

    public abstract String u(byte[] bArr, int i3, int i10);

    public abstract int w(String str, byte[] bArr, int i3, int i10);
}
