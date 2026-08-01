package a;

import a2.g0;
import a2.r;
import a4.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.widget.TextView;
import androidx.lifecycle.a1;
import androidx.lifecycle.z0;
import c2.b1;
import c2.g;
import c2.z;
import c2.z1;
import c6.f;
import c6.n;
import ce.b;
import com.google.android.gms.common.api.Status;
import d.m;
import d1.l;
import d1.o;
import d2.d1;
import de.k;
import i1.t;
import j0.d0;
import j0.q;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import k1.p;
import k3.d;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import kotlin.text.i;
import m.g2;
import m2.h0;
import m2.u;
import n0.i0;
import n0.q1;
import n0.s1;
import n4.s;
import o0.e;
import wd.c0;
import wd.h;
import x2.c;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {
    public a() {
        new ConcurrentHashMap();
    }

    public static Sequence B(s sVar) {
        sVar.getClass();
        return k.c(sVar, new u(16));
    }

    public static final int C(String str, Bundle bundle) {
        str.getClass();
        int i3 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i3 != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i3;
        }
        f.Q(str);
        throw null;
    }

    public static final Class D(b bVar) {
        bVar.getClass();
        Class a9 = ((wd.f) bVar).a();
        a9.getClass();
        return a9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class E(b bVar) {
        bVar.getClass();
        Class a9 = ((wd.f) bVar).a();
        if (a9.isPrimitive()) {
            String name = a9.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a9;
    }

    public static final h F(Class cls) {
        cls.getClass();
        return c0.a(cls);
    }

    public static final long G(int i3, byte[] bArr) {
        return (bArr[i3 + 7] & 255) | ((bArr[i3] & 255) << 56) | ((bArr[i3 + 1] & 255) << 48) | ((bArr[i3 + 2] & 255) << 40) | ((bArr[i3 + 3] & 255) << 32) | ((bArr[i3 + 4] & 255) << 24) | ((bArr[i3 + 5] & 255) << 16) | ((bArr[i3 + 6] & 255) << 8);
    }

    public static final Bundle H(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        f.Q(str);
        throw null;
    }

    public static final ArrayList I(String str, Bundle bundle) {
        Class a9 = c0.a(Bundle.class).a();
        a9.getClass();
        ArrayList a10 = Build.VERSION.SDK_INT >= 34 ? d.a(bundle, str, a9) : bundle.getParcelableArrayList(str);
        if (a10 != null) {
            return a10;
        }
        f.Q(str);
        throw null;
    }

    public static final String J(String str, Bundle bundle) {
        str.getClass();
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        f.Q(str);
        throw null;
    }

    public static final String[] K(String str, Bundle bundle) {
        str.getClass();
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        f.Q(str);
        throw null;
    }

    public static m3.a L(m.c0 c0Var) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            return new m3.a(e3.k.l(c0Var));
        }
        TextPaint textPaint = new TextPaint(c0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c0Var.getBreakStrategy();
        int hyphenationFrequency = c0Var.getHyphenationFrequency();
        if (c0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i3 < 28 || (c0Var.getInputType() & 15) != 3) {
                boolean z10 = c0Var.getLayoutDirection() == 1;
                switch (c0Var.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case j.INTEGER_FIELD_NUMBER /* 3 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case j.LONG_FIELD_NUMBER /* 4 */:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case j.STRING_FIELD_NUMBER /* 5 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case j.STRING_SET_FIELD_NUMBER /* 6 */:
                        break;
                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z10) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(e3.k.d(DecimalFormatSymbols.getInstance(c0Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new m3.a(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static int M(Set set) {
        Iterator it = set.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3 = ~(~(i3 + (next != null ? next.hashCode() : 0)));
        }
        return i3;
    }

    public static final boolean N(String str, Bundle bundle) {
        str.getClass();
        return k(str, bundle) && bundle.get(str) == null;
    }

    public static final String O(Collection collection) {
        return i.b(CollectionsKt.B(collection, ",", null, null, null, 62)).concat(i.b(" }"));
    }

    public static final String P(Collection collection) {
        return i.b(CollectionsKt.B(collection, ",", null, null, null, 62)).concat(i.b("},"));
    }

    public static HashSet Q(int i3) {
        int i10;
        if (i3 < 3) {
            f.n(i3, "expectedSize");
            i10 = i3 + 1;
        } else {
            i10 = i3 < 1073741824 ? (int) ((i3 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        return new HashSet(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean T(t tVar, a3.i iVar) {
        t[] tVarArr = new t[16];
        if (!tVar.f3305d.B) {
            z1.a.b("visitChildren called on an unattached node");
        }
        e eVar = new e(new d1.k[16]);
        d1.k kVar = tVar.f3305d;
        d1.k kVar2 = kVar.f3310t;
        if (kVar2 == null) {
            c2.k.b(eVar, kVar);
        } else {
            eVar.b(kVar2);
        }
        int i3 = 0;
        while (true) {
            int i10 = eVar.f7319i;
            if (i10 == 0) {
                break;
            }
            d1.k kVar3 = (d1.k) eVar.l(i10 - 1);
            if ((kVar3.f3308r & 1024) == 0) {
                c2.k.b(eVar, kVar3);
            } else {
                while (true) {
                    if (kVar3 == null) {
                        break;
                    }
                    if ((kVar3.f3307i & 1024) != 0) {
                        e eVar2 = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof t) {
                                t tVar2 = (t) kVar3;
                                int i11 = i3 + 1;
                                if (tVarArr.length < i11) {
                                    int length = tVarArr.length;
                                    ?? r10 = new Object[Math.max(i11, length * 2)];
                                    System.arraycopy(tVarArr, 0, r10, 0, length);
                                    tVarArr = r10;
                                }
                                tVarArr[i3] = tVar2;
                                i3 = i11;
                            } else if ((kVar3.f3307i & 1024) != 0 && (kVar3 instanceof c2.j)) {
                                int i12 = 0;
                                for (d1.k kVar4 = ((c2.j) kVar3).D; kVar4 != null; kVar4 = kVar4.f3310t) {
                                    if ((kVar4.f3307i & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            kVar3 = kVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new e(new d1.k[16]);
                                            }
                                            if (kVar3 != null) {
                                                eVar2.b(kVar3);
                                                kVar3 = null;
                                            }
                                            eVar2.b(kVar4);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            kVar3 = c2.k.e(eVar2);
                        }
                    } else {
                        kVar3 = kVar3.f3310t;
                    }
                }
            }
        }
        Arrays.sort(tVarArr, 0, i3, i1.u.f4631d);
        int i13 = i3 - 1;
        if (i13 < tVarArr.length) {
            while (i13 >= 0) {
                t tVar3 = tVarArr[i13];
                if (w.A(tVar3) && h(tVar3, iVar)) {
                    return true;
                }
                i13--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean U(t tVar, a3.i iVar) {
        t[] tVarArr = new t[16];
        if (!tVar.f3305d.B) {
            z1.a.b("visitChildren called on an unattached node");
        }
        e eVar = new e(new d1.k[16]);
        d1.k kVar = tVar.f3305d;
        d1.k kVar2 = kVar.f3310t;
        if (kVar2 == null) {
            c2.k.b(eVar, kVar);
        } else {
            eVar.b(kVar2);
        }
        int i3 = 0;
        while (true) {
            int i10 = eVar.f7319i;
            if (i10 == 0) {
                break;
            }
            d1.k kVar3 = (d1.k) eVar.l(i10 - 1);
            if ((kVar3.f3308r & 1024) == 0) {
                c2.k.b(eVar, kVar3);
            } else {
                while (true) {
                    if (kVar3 == null) {
                        break;
                    }
                    if ((kVar3.f3307i & 1024) != 0) {
                        e eVar2 = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof t) {
                                t tVar2 = (t) kVar3;
                                int i11 = i3 + 1;
                                if (tVarArr.length < i11) {
                                    int length = tVarArr.length;
                                    ?? r10 = new Object[Math.max(i11, length * 2)];
                                    System.arraycopy(tVarArr, 0, r10, 0, length);
                                    tVarArr = r10;
                                }
                                tVarArr[i3] = tVar2;
                                i3 = i11;
                            } else if ((kVar3.f3307i & 1024) != 0 && (kVar3 instanceof c2.j)) {
                                int i12 = 0;
                                for (d1.k kVar4 = ((c2.j) kVar3).D; kVar4 != null; kVar4 = kVar4.f3310t) {
                                    if ((kVar4.f3307i & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            kVar3 = kVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new e(new d1.k[16]);
                                            }
                                            if (kVar3 != null) {
                                                eVar2.b(kVar3);
                                                kVar3 = null;
                                            }
                                            eVar2.b(kVar4);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            kVar3 = c2.k.e(eVar2);
                        }
                    } else {
                        kVar3 = kVar3.f3310t;
                    }
                }
            }
        }
        Arrays.sort(tVarArr, 0, i3, i1.u.f4631d);
        for (int i13 = 0; i13 < i3; i13++) {
            t tVar3 = tVarArr[i13];
            if (w.A(tVar3) && v(tVar3, iVar)) {
                return true;
            }
        }
        return false;
    }

    public static void Y(TextView textView, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            e3.k.o(textView, i3);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i3 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i3 + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void Z(TextView textView, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i3 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i3 - i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final l lVar, final h0 h0Var, final int i3, final boolean z10, final int i10, final int i11, i0 i0Var, final int i12) {
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        i0Var.X(-1040751001);
        if ((i12 & 6) == 0) {
            i13 = (i0Var.f(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= i0Var.f(lVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= i0Var.f(h0Var) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= i0Var.h(null) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 = i3;
            i13 |= i0Var.d(i14) ? 16384 : 8192;
        } else {
            i14 = i3;
        }
        if ((196608 & i12) == 0) {
            z11 = z10;
            i13 |= i0Var.g(z11) ? 131072 : 65536;
        } else {
            z11 = z10;
        }
        if ((1572864 & i12) == 0) {
            i13 |= i0Var.d(i10) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i13 |= i0Var.d(i11) ? 8388608 : 4194304;
        }
        int i15 = i13 | 100663296;
        if ((805306368 & i12) == 0) {
            i15 |= (1073741824 & i12) == 0 ? i0Var.f(null) : i0Var.h(null) ? 536870912 : 268435456;
        }
        if (i0Var.O(i15 & 1, (306783379 & i15) != 306783378)) {
            if (!(i11 > 0 && i10 > 0)) {
                a0.a.a("both minLines " + i11 + " and maxLines " + i10 + " must be greater than zero");
            }
            if (!(i11 <= i10)) {
                a0.a.a("minLines " + i11 + " must be less than or equal to maxLines " + i10);
            }
            if (i0Var.j(g0.b.f4221a) != null) {
                kotlin.collections.i0.j();
                return;
            }
            i0Var.W(356914239);
            i0Var.p(false);
            p2.h hVar = (p2.h) i0Var.j(d1.f3386k);
            Executor executor = (Executor) i0Var.j(e0.b.f3765a);
            if (executor != null) {
                int length = str.length();
                if (Build.VERSION.SDK_INT >= 28 && length >= 8 && length < 1000) {
                    if (e0.b.f3766b == null) {
                        e0.b.f3766b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                    }
                    Boolean bool = e0.b.f3766b;
                    bool.getClass();
                    if (bool.booleanValue()) {
                        i0Var.W(1254298614);
                        try {
                            z12 = false;
                            z13 = true;
                            try {
                                executor.execute(new m(h0Var, (x2.l) i0Var.j(d1.f3389n), str, (c) i0Var.j(d1.f3384h), hVar, 1));
                            } catch (RejectedExecutionException unused) {
                            }
                        } catch (RejectedExecutionException unused2) {
                            z13 = true;
                            z12 = false;
                        }
                        i0Var.p(z12);
                        i0Var.W(357875859);
                        i0Var.p(z12);
                        boolean z14 = z13;
                        l c10 = lVar.c(new f0.e(str, h0Var, hVar, i14, z11, i10, i11));
                        int hashCode = Long.hashCode(i0Var.T);
                        l C = w.C(c10, i0Var);
                        x0.h l10 = i0Var.l();
                        g.f1541a.getClass();
                        z zVar = c2.f.f1533b;
                        i0Var.Z();
                        if (i0Var.S) {
                            i0Var.j0();
                        } else {
                            i0Var.k(zVar);
                        }
                        n0.h.y(e0.c.f3767a, c2.f.f1536e, i0Var);
                        n0.h.y(l10, c2.f.f1535d, i0Var);
                        n0.h.t(i0Var, c2.f.g);
                        n0.h.y(C, c2.f.f1534c, i0Var);
                        n0.h.y(Integer.valueOf(hashCode), c2.f.f1537f, i0Var);
                        i0Var.p(z14);
                    }
                }
                z13 = true;
                z12 = false;
            } else {
                z12 = false;
                z13 = true;
            }
            i0Var.W(1255914055);
            i0Var.p(z12);
            i0Var.W(357875859);
            i0Var.p(z12);
            boolean z142 = z13;
            l c102 = lVar.c(new f0.e(str, h0Var, hVar, i14, z11, i10, i11));
            int hashCode2 = Long.hashCode(i0Var.T);
            l C2 = w.C(c102, i0Var);
            x0.h l102 = i0Var.l();
            g.f1541a.getClass();
            z zVar2 = c2.f.f1533b;
            i0Var.Z();
            if (i0Var.S) {
            }
            n0.h.y(e0.c.f3767a, c2.f.f1536e, i0Var);
            n0.h.y(l102, c2.f.f1535d, i0Var);
            n0.h.t(i0Var, c2.f.g);
            n0.h.y(C2, c2.f.f1534c, i0Var);
            n0.h.y(Integer.valueOf(hashCode2), c2.f.f1537f, i0Var);
            i0Var.p(z142);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new Function2() { // from class: e0.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.a.a(str, lVar, h0Var, i3, z10, i10, i11, (i0) obj, n0.h.z(i12 | 1));
                    return Unit.f5554a;
                }
            };
        }
    }

    public static void a0(TextView textView, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        if (i3 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i3 - r0, 1.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final long j, l lVar, long j3, long j10, final float f3, p2.s sVar, p2.i iVar, h0 h0Var, i0 i0Var, final int i3, final int i10) {
        int i11;
        l lVar2;
        int i12;
        long j11;
        int i13;
        int i14;
        long j12;
        int i15;
        int i16;
        final p2.i iVar2;
        final l lVar3;
        final long j13;
        final long j14;
        final p2.s sVar2;
        final h0 h0Var2;
        s1 r9;
        int i17;
        l lVar4;
        p2.s sVar3;
        long j15;
        long j16;
        p2.i iVar3;
        h0 h0Var3;
        i0 i0Var2 = i0Var;
        str.getClass();
        i0Var2.X(-299729649);
        if ((i3 & 6) == 0) {
            i11 = (i0Var2.f(str) ? 4 : 2) | i3;
        } else {
            i11 = i3;
        }
        if ((i3 & 48) == 0) {
            i11 |= i0Var2.e(j) ? 32 : 16;
        }
        int i18 = i10 & 4;
        if (i18 != 0) {
            i11 |= 384;
        } else if ((i3 & 384) == 0) {
            lVar2 = lVar;
            i11 |= i0Var2.f(lVar2) ? 256 : 128;
            i12 = i10 & 8;
            if (i12 == 0) {
                i13 = i11 | 3072;
                j11 = j3;
            } else {
                j11 = j3;
                i13 = i11 | (i0Var2.e(j11) ? 2048 : 1024);
            }
            i14 = i10 & 16;
            if (i14 == 0) {
                i15 = i13 | 24576;
                j12 = j10;
            } else {
                j12 = j10;
                i15 = i13 | (i0Var2.e(j12) ? 16384 : 8192);
            }
            i16 = i15 | 106430464;
            if (i0Var2.O(i16 & 1, (38347923 & i16) == 38347922)) {
                i0Var2.R();
                iVar2 = iVar;
                lVar3 = lVar2;
                j13 = j11;
                j14 = j12;
                sVar2 = sVar;
                h0Var2 = h0Var;
            } else {
                i0Var2.T();
                if ((i3 & 1) == 0 || i0Var2.y()) {
                    l lVar5 = i18 != 0 ? d1.i.f3304a : lVar2;
                    long j17 = i12 != 0 ? p.f5337c : j11;
                    long j18 = i14 != 0 ? p.f5336b : j12;
                    i17 = i16 & (-29360129);
                    lVar4 = lVar5;
                    sVar3 = p2.s.f7647u;
                    j15 = j17;
                    j16 = j18;
                    iVar3 = u9.d.f9713a;
                    h0Var3 = h0.f6480d;
                } else {
                    i0Var2.R();
                    sVar3 = sVar;
                    i17 = i16 & (-29360129);
                    lVar4 = lVar2;
                    j15 = j11;
                    j16 = j12;
                    iVar3 = iVar;
                    h0Var3 = h0Var;
                }
                i0Var2.q();
                int i19 = i17 >> 6;
                g0 d10 = b0.p.d(d1.a.f3282d);
                int hashCode = Long.hashCode(i0Var2.T);
                x0.h l10 = i0Var2.l();
                l C = w.C(lVar4, i0Var2);
                g.f1541a.getClass();
                z zVar = c2.f.f1533b;
                i0Var2.Z();
                if (i0Var2.S) {
                    i0Var2.k(zVar);
                } else {
                    i0Var2.j0();
                }
                n0.h.y(d10, c2.f.f1536e, i0Var2);
                n0.h.y(l10, c2.f.f1535d, i0Var2);
                n0.h.y(Integer.valueOf(hashCode), c2.f.f1537f, i0Var2);
                n0.h.t(i0Var2, c2.f.g);
                n0.h.y(C, c2.f.f1534c, i0Var2);
                h0 h0Var4 = h0Var3;
                p2.i iVar4 = iVar3;
                int i20 = i17 & 14;
                long j19 = j16;
                p2.s sVar4 = sVar3;
                d0.b(str, null, j19, 0L, sVar4, 0L, null, 0L, 0, false, 0, 0, h0.a(h0Var3, j, null, iVar3, 0L, new m1.g(f3, 0.0f, 0, 0, 30), 0L, null, 16760797), i0Var2, i20 | (i19 & 896) | 1572864, 131002);
                long j20 = j15;
                d0.b(str, null, j20, 0L, sVar4, 0L, null, 0L, 0, false, 0, 0, h0.a(h0Var4, j, null, iVar4, 0L, null, 0L, null, 16777181), i0Var, i20 | ((i17 >> 3) & 896) | 1572864, 131002);
                i0Var2 = i0Var;
                i0Var2.p(true);
                sVar2 = sVar4;
                h0Var2 = h0Var4;
                iVar2 = iVar4;
                lVar3 = lVar4;
                j14 = j19;
                j13 = j20;
            }
            r9 = i0Var2.r();
            if (r9 == null) {
                r9.f6812d = new Function2() { // from class: m9.a
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int z10 = n0.h.z(i3 | 1);
                        a.a.b(str, j, lVar3, j13, j14, f3, sVar2, iVar2, h0Var2, (i0) obj, z10, i10);
                        return Unit.f5554a;
                    }
                };
                return;
            }
            return;
        }
        lVar2 = lVar;
        i12 = i10 & 8;
        if (i12 == 0) {
        }
        i14 = i10 & 16;
        if (i14 == 0) {
        }
        i16 = i15 | 106430464;
        if (i0Var2.O(i16 & 1, (38347923 & i16) == 38347922)) {
        }
        r9 = i0Var2.r();
        if (r9 == null) {
        }
    }

    public static void b0(Status status, Object obj, w7.g gVar) {
        if (status.f2119d <= 0) {
            gVar.a(obj);
        } else {
            gVar.f10117a.m(status.f2121i != null ? new a7.m(status) : new a7.e(status));
        }
    }

    public static final long c(float f3, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static String c0(long j) {
        int i3 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i3) == Float.intBitsToFloat(i10)) {
            return "CornerRadius.circular(" + f.e0(Float.intBitsToFloat(i3)) + ')';
        }
        return "CornerRadius.elliptical(" + f.e0(Float.intBitsToFloat(i3)) + ", " + f.e0(Float.intBitsToFloat(i10)) + ')';
    }

    public static final void d(n4.h hVar, a1.j jVar, x0.d dVar, i0 i0Var, int i3) {
        i0Var.X(233973821);
        if ((((i0Var.h(hVar) ? 4 : 2) | i3 | (i0Var.h(jVar) ? 32 : 16)) & 147) == 146 && i0Var.A()) {
            i0Var.R();
        } else {
            n0.h.b(new q1[]{l4.a.f5860a.a(hVar), i4.e.f4646a.a(hVar), g5.a.f4273a.a(hVar)}, x0.i.d(1808964477, new q(2, jVar, dVar), i0Var), i0Var, 56);
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new n9.l(hVar, jVar, dVar, i3, 1);
        }
    }

    public static final void d0(int i3, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i3 + ", but was '" + str.charAt(i3) + '\'');
    }

    public static final void e(boolean z10, Function2 function2, i0 i0Var, int i3) {
        i0Var.X(1818896922);
        int i10 = (i0Var.g(z10) ? 4 : 2) | i3 | (i0Var.h(function2) ? 32 : 16);
        if ((i10 & 19) == 18 && i0Var.A()) {
            i0Var.R();
        } else {
            w.d(z10, function2, i0Var, i10 & 126);
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new e.c(z10, function2, i3, 1);
        }
    }

    public static final l e0(l lVar, float f3) {
        return lVar.c(new o(f3));
    }

    public static final void f(a1.j jVar, x0.d dVar, i0 i0Var, int i3) {
        i0Var.X(832919318);
        int i10 = (i0Var.h(jVar) ? 4 : 2) | i3 | (i0Var.h(dVar) ? 32 : 16);
        if ((i10 & 19) == 18 && i0Var.A()) {
            i0Var.R();
        } else {
            Object L = i0Var.L();
            if (L == n0.k.f6729a) {
                L = new u(19);
                i0Var.g0(L);
            }
            Function1 function1 = (Function1) L;
            a1 a9 = l4.a.a(i0Var);
            if (a9 == null) {
                kotlin.collections.i0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            h a10 = c0.a(o4.a.class);
            k4.d dVar2 = new k4.d(0);
            dVar2.a(c0.a(o4.a.class), function1);
            k4.c c10 = dVar2.c();
            k4.b e2 = a9 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a9).e() : k4.a.f5385b;
            z0 f3 = a9.f();
            f3.getClass();
            e2.getClass();
            n nVar = new n(f3, c10, e2);
            String b10 = a10.b();
            if (b10 == null) {
                te.a1.e("Local and anonymous classes can not be ViewModels");
                return;
            } else {
                o4.a aVar = (o4.a) nVar.b(a10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10));
                aVar.f7471d = new b7.u(jVar);
                jVar.a(aVar.f7470c, dVar, i0Var, ((i10 << 6) & 896) | (i10 & 112));
            }
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new b0.u(i3, 6, jVar, dVar);
        }
    }

    public static void f0(int i3, int i10) {
        String h0;
        if (i3 < 0 || i3 >= i10) {
            if (i3 < 0) {
                h0 = f.h0("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i10 < 0) {
                    te.a1.e(v4.a.n(new StringBuilder(String.valueOf(i10).length() + 15), "negative size: ", i10));
                    return;
                }
                h0 = f.h0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(h0);
        }
    }

    public static final Context g(lf.a aVar) {
        aVar.getClass();
        try {
            return (Context) aVar.d(c0.a(Context.class), null);
        } catch (bf.a unused) {
            throw new c3.b("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.", 4);
        }
    }

    public static void g0(int i3, int i10, int i11) {
        if (i3 < 0 || i10 < i3 || i10 > i11) {
            throw new IndexOutOfBoundsException((i3 < 0 || i3 > i11) ? h0("start index", i3, i11) : (i10 < 0 || i10 > i11) ? h0("end index", i10, i11) : f.h0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i3)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean h(t tVar, a3.i iVar) {
        int ordinal = tVar.M().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                t r9 = w.r(tVar);
                if (r9 == null) {
                    kotlin.collections.i0.l("ActiveParent must have a focusedChild");
                    return false;
                }
                int ordinal2 = r9.M().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                r.p();
                                return false;
                            }
                            kotlin.collections.i0.l("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (h(r9, iVar) || w(tVar, r9, 2, iVar) || (r9.K().f4612a && ((Boolean) iVar.invoke(r9)).booleanValue())) {
                        return true;
                    }
                }
                return w(tVar, r9, 2, iVar);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    r.p();
                    return false;
                }
                if (!T(tVar, iVar)) {
                    if (!(tVar.K().f4612a ? ((Boolean) iVar.invoke(tVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return T(tVar, iVar);
    }

    public static String h0(String str, int i3, int i10) {
        if (i3 < 0) {
            return f.h0("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i10 >= 0) {
            return f.h0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i10));
        }
        te.a1.e(v4.a.n(new StringBuilder(String.valueOf(i10).length() + 15), "negative size: ", i10));
        return null;
    }

    public static final boolean k(String str, Bundle bundle) {
        str.getClass();
        return bundle.containsKey(str);
    }

    public static Handler l(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e3.k.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e9) {
            e = e9;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final boolean q(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i3 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i3 < str.length()) {
                    char charAt = str.charAt(i3);
                    int i12 = i11 + 1;
                    if (i11 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i10++;
                    } else if (charAt == ')' && i10 - 1 == 0 && i11 != str.length() - 1) {
                        break;
                    }
                    i3++;
                    i11 = i12;
                } else if (i10 == 0) {
                    return Intrinsics.a(StringsKt.y(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final boolean r(long j, long j3) {
        return j == j3;
    }

    public static l3.h s(l3.h[] hVarArr, int i3) {
        int i10 = (i3 & 1) == 0 ? 400 : 700;
        boolean z10 = (i3 & 2) != 0;
        l3.h hVar = null;
        int i11 = Integer.MAX_VALUE;
        for (l3.h hVar2 : hVarArr) {
            int abs = (Math.abs(hVar2.f5855c - i10) * 2) + (hVar2.f5856d == z10 ? 0 : 1);
            if (hVar == null || i11 > abs) {
                hVar = hVar2;
                i11 = abs;
            }
        }
        return hVar;
    }

    public static final void t(long j, byte[] bArr, int i3, int i10, int i11) {
        int i12 = 7 - i10;
        int i13 = 8 - i11;
        if (i13 > i12) {
            return;
        }
        while (true) {
            int i14 = kotlin.text.d.f5617a[(int) ((j >> (i12 << 3)) & 255)];
            int i15 = i3 + 1;
            bArr[i3] = (byte) (i14 >> 8);
            i3 += 2;
            bArr[i15] = (byte) i14;
            if (i12 == i13) {
                return;
            } else {
                i12--;
            }
        }
    }

    public static final String u(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? i.b(CollectionsKt.B(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static final boolean v(t tVar, a3.i iVar) {
        int ordinal = tVar.M().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                t r9 = w.r(tVar);
                if (r9 != null) {
                    return v(r9, iVar) || w(tVar, r9, 1, iVar);
                }
                kotlin.collections.i0.l("ActiveParent must have a focusedChild");
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return tVar.K().f4612a ? ((Boolean) iVar.invoke(tVar)).booleanValue() : U(tVar, iVar);
                }
                r.p();
                return false;
            }
        }
        return U(tVar, iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x019d A[EDGE_INSN: B:154:0x019d->B:136:0x019d BREAK  A[LOOP:5: B:95:0x012e->B:149:0x012e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0130  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean w(t tVar, t tVar2, int i3, a3.i iVar) {
        boolean z10;
        d1.k kVar;
        c2.g0 u2;
        b1 b1Var;
        if (tVar.M() == i1.r.f4627e) {
            t[] tVarArr = new t[16];
            if (!tVar.f3305d.B) {
                z1.a.b("visitChildren called on an unattached node");
            }
            e eVar = new e(new d1.k[16]);
            d1.k kVar2 = tVar.f3305d;
            d1.k kVar3 = kVar2.f3310t;
            z10 = false;
            if (kVar3 == null) {
                c2.k.b(eVar, kVar2);
            } else {
                eVar.b(kVar3);
            }
            int i10 = 0;
            while (true) {
                int i11 = eVar.f7319i;
                kVar = null;
                if (i11 == 0) {
                    break;
                }
                d1.k kVar4 = (d1.k) eVar.l(i11 - 1);
                if ((kVar4.f3308r & 1024) == 0) {
                    c2.k.b(eVar, kVar4);
                } else {
                    while (true) {
                        if (kVar4 == null) {
                            break;
                        }
                        if ((kVar4.f3307i & 1024) != 0) {
                            e eVar2 = null;
                            while (kVar4 != null) {
                                if (kVar4 instanceof t) {
                                    t tVar3 = (t) kVar4;
                                    int i12 = i10 + 1;
                                    if (tVarArr.length < i12) {
                                        int length = tVarArr.length;
                                        ?? r11 = new Object[Math.max(i12, length * 2)];
                                        System.arraycopy(tVarArr, 0, r11, 0, length);
                                        tVarArr = r11;
                                    }
                                    tVarArr[i10] = tVar3;
                                    i10 = i12;
                                } else if ((kVar4.f3307i & 1024) != 0 && (kVar4 instanceof c2.j)) {
                                    int i13 = 0;
                                    for (d1.k kVar5 = ((c2.j) kVar4).D; kVar5 != null; kVar5 = kVar5.f3310t) {
                                        if ((kVar5.f3307i & 1024) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                kVar4 = kVar5;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new e(new d1.k[16]);
                                                }
                                                if (kVar4 != null) {
                                                    eVar2.b(kVar4);
                                                    kVar4 = null;
                                                }
                                                eVar2.b(kVar5);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                kVar4 = c2.k.e(eVar2);
                            }
                        } else {
                            kVar4 = kVar4.f3310t;
                        }
                    }
                }
            }
            Arrays.sort(tVarArr, 0, i10, i1.u.f4631d);
            if (i3 == 1) {
                IntRange f3 = be.f.f(0, i10);
                int i14 = f3.f5599d;
                int i15 = f3.f5600e;
                if (i14 <= i15) {
                    boolean z11 = false;
                    while (true) {
                        if (z11) {
                            t tVar4 = tVarArr[i14];
                            if (w.A(tVar4) && v(tVar4, iVar)) {
                                break;
                            }
                        }
                        if (Intrinsics.a(tVarArr[i14], tVar2)) {
                            z11 = true;
                        }
                        if (i14 == i15) {
                            break;
                        }
                        i14++;
                    }
                    z10 = true;
                }
                if (i3 != 1 && tVar.K().f4612a) {
                    if (!tVar.f3305d.B) {
                        z1.a.b("visitAncestors called on an unattached node");
                    }
                    d1.k kVar6 = tVar.f3305d.f3309s;
                    u2 = c2.k.u(tVar);
                    loop5: while (true) {
                        if (u2 == null) {
                            break;
                        }
                        if ((((d1.k) u2.S.g).f3308r & 1024) != 0) {
                            while (kVar6 != null) {
                                if ((kVar6.f3307i & 1024) != 0) {
                                    d1.k kVar7 = kVar6;
                                    e eVar3 = null;
                                    while (kVar7 != null) {
                                        if (kVar7 instanceof t) {
                                            kVar = kVar7;
                                            break loop5;
                                        }
                                        if ((kVar7.f3307i & 1024) != 0 && (kVar7 instanceof c2.j)) {
                                            int i16 = 0;
                                            for (d1.k kVar8 = ((c2.j) kVar7).D; kVar8 != null; kVar8 = kVar8.f3310t) {
                                                if ((kVar8.f3307i & 1024) != 0) {
                                                    i16++;
                                                    if (i16 == 1) {
                                                        kVar7 = kVar8;
                                                    } else {
                                                        if (eVar3 == null) {
                                                            eVar3 = new e(new d1.k[16]);
                                                        }
                                                        if (kVar7 != null) {
                                                            eVar3.b(kVar7);
                                                            kVar7 = null;
                                                        }
                                                        eVar3.b(kVar8);
                                                    }
                                                }
                                            }
                                            if (i16 == 1) {
                                            }
                                        }
                                        kVar7 = c2.k.e(eVar3);
                                    }
                                }
                                kVar6 = kVar6.f3309s;
                            }
                        }
                        u2 = u2.s();
                        kVar6 = (u2 == null || (b1Var = u2.S) == null) ? null : (z1) b1Var.f1495f;
                    }
                    if (kVar != null) {
                        z10 = ((Boolean) iVar.invoke(tVar)).booleanValue();
                    }
                }
            } else if (i3 == 2) {
                IntRange f10 = be.f.f(0, i10);
                int i17 = f10.f5599d;
                int i18 = f10.f5600e;
                if (i17 <= i18) {
                    boolean z12 = false;
                    while (true) {
                        if (z12) {
                            t tVar5 = tVarArr[i18];
                            if (w.A(tVar5) && h(tVar5, iVar)) {
                                break;
                            }
                        }
                        if (Intrinsics.a(tVarArr[i18], tVar2)) {
                            z12 = true;
                        }
                        if (i18 == i17) {
                            break;
                        }
                        i18--;
                    }
                    z10 = true;
                }
                if (i3 != 1) {
                    if (!tVar.f3305d.B) {
                    }
                    d1.k kVar62 = tVar.f3305d.f3309s;
                    u2 = c2.k.u(tVar);
                    loop5: while (true) {
                        if (u2 == null) {
                        }
                    }
                    if (kVar != null) {
                    }
                }
            } else {
                kotlin.collections.i0.l("This function should only be used for 1-D focus search");
            }
            if (!z10) {
                return true;
            }
            ((i1.k) c2.k.v(tVar).getFocusOwner()).getClass();
            i7.a.b0(tVar);
            return false;
        }
        kotlin.collections.i0.l("This function should only be used within a parent that has focus.");
        z10 = false;
        if (!z10) {
        }
    }

    public static String x(c4.o oVar, int i3) {
        oVar.getClass();
        if (i3 <= 16777215) {
            return String.valueOf(i3);
        }
        try {
            Context context = oVar.f1772d;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i3);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i3);
        }
    }

    public static final float y(Layout layout, int i3, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i3);
        ThreadLocal threadLocal = n2.i.f7021a;
        if (layout.getEllipsisCount(i3) <= 0 || layout.getParagraphDirection(i3) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i3) + layout.getLineStart(i3)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i3);
        if ((paragraphAlignment == null ? -1 : o2.d.f7336a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float z(Layout layout, int i3, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = n2.i.f7021a;
        if (layout.getEllipsisCount(i3) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i3) != -1 || layout.getWidth() >= layout.getLineRight(i3)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i3) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i3) + layout.getLineStart(i3)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i3);
        if ((paragraphAlignment != null ? o2.d.f7336a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i3);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i3);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public abstract InputFilter[] A(InputFilter[] inputFilterArr);

    public abstract void R(Throwable th);

    public abstract void S(n nVar);

    public abstract long V();

    public abstract void W(boolean z10);

    public abstract void X(boolean z10);

    public c7.i i(Context context, Looper looper, g2 g2Var, Object obj, a7.k kVar, a7.l lVar) {
        return j(context, looper, g2Var, obj, kVar, lVar);
    }

    public c7.i j(Context context, Looper looper, g2 g2Var, Object obj, a7.k kVar, a7.l lVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract Typeface m(Context context, g3.e eVar, Resources resources, int i3);

    public abstract Typeface n(Context context, l3.h[] hVarArr, int i3);

    public Typeface o(Context context, List list, int i3) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface p(Context context, Resources resources, int i3, String str, int i10) {
        File J = f.J(context);
        if (J == null) {
            return null;
        }
        try {
            if (f.q(J, resources, i3)) {
                return Typeface.createFromFile(J.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            J.delete();
        }
    }
}
