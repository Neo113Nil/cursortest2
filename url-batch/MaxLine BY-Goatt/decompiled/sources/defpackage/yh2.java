package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.Utility;
import com.google.firebase.encoders.json.BuildConfig;
import com.majelw.libystne.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class yh2 implements f53 {
    public static final void a(my myVar, a00 a00Var, int i) {
        a00Var.Z(1276766258);
        int i2 = 1;
        if (a00Var.P(i & 1, (i & 3) != 2)) {
            vl1 h = a.h(l41.q(1.0f, cw.t, androidx.compose.foundation.a.b(yk3.u(b.c(sl1.a, 1.0f), zb2.a(16.0f)), cw.s, ap.e), zb2.a(16.0f)), 16.0f);
            qw a = ow.a(new yh(6.0f, true, sc.o), qb2.A, a00Var, 6);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, h);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, a, oz.f);
            uj2.e(a00Var, l, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            myVar.invoke(a00Var, 6);
            a00Var.q(true);
        } else {
            a00Var.S();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new d51(myVar, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(vl1 vl1Var, a00 a00Var, int i) {
        int i2;
        vl1 vl1Var2;
        Double valueOf;
        double d;
        int D;
        boolean z;
        a00 a00Var2 = a00Var;
        int i3 = 0;
        a00Var2.Z(911216371);
        int i4 = i | 6;
        if (a00Var2.P(i4 & 1, (i4 & 3) != 2)) {
            Context context = (Context) a00Var2.j(AndroidCompositionLocals_androidKt.b);
            Object M = a00Var2.M();
            Object obj = sz.a;
            if (M == obj) {
                M = ij1.d.i(context);
                a00Var2.i0(M);
            }
            ij1 ij1Var = (ij1) M;
            zn1 a = ij2.a(bd3.p(ij1Var.c.a, new String[]{"jewelry_item"}, new zd(14)), ah0.m, null, a00Var2, 48, 2);
            zn1 a2 = ij2.a(ij1Var.h(), 0, null, a00Var, 48, 2);
            zn1 a3 = ij2.a(new cj1(ij1Var.b.b(), i3), 0, null, a00Var, 48, 2);
            Iterator it = ((List) a.getValue()).iterator();
            double d2 = 0.0d;
            while (it.hasNext()) {
                Double d3 = ((a61) it.next()).i;
                d2 += d3 != null ? d3.doubleValue() : 0.0d;
            }
            List list = (List) a.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list) {
                String str = ((a61) obj2).d;
                Object obj3 = linkedHashMap.get(str);
                if (obj3 == null) {
                    ArrayList arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                    obj3 = arrayList;
                }
                ((List) obj3).add(obj2);
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator it2 = ((List) entry.getValue()).iterator();
                double d4 = 0.0d;
                while (it2.hasNext()) {
                    Double d5 = ((a61) it2.next()).i;
                    d4 += d5 != null ? d5.doubleValue() : 0.0d;
                }
                arrayList2.add(new Pair(str2, Double.valueOf(d4)));
            }
            final List I = zv.I(arrayList2, new zo0(13));
            Iterator it3 = I.iterator();
            if (it3.hasNext()) {
                double doubleValue = ((Number) ((Pair) it3.next()).n).doubleValue();
                while (it3.hasNext()) {
                    doubleValue = Math.max(doubleValue, ((Number) ((Pair) it3.next()).n).doubleValue());
                }
                valueOf = Double.valueOf(doubleValue);
            } else {
                valueOf = null;
            }
            if (valueOf != null) {
                Double d6 = valueOf.doubleValue() > 0.0d ? valueOf : null;
                if (d6 != null) {
                    d = d6.doubleValue();
                    List list2 = (List) a.getValue();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : list2) {
                        Double d7 = ((a61) obj4).i;
                        if ((d7 != null ? d7.doubleValue() : 0.0d) > 0.0d) {
                            arrayList3.add(obj4);
                        }
                    }
                    List J = zv.J(5, zv.I(arrayList3, new zo0(14)));
                    long j = cw.r;
                    su suVar = ap.e;
                    final double d8 = d2;
                    sl1 sl1Var = sl1.a;
                    vl1 h = a.h(s03.T(androidx.compose.foundation.a.b(sl1Var, j, suVar), s03.G(a00Var)), 16.0f);
                    qw a4 = ow.a(new yh(14.0f, true, sc.o), qb2.A, a00Var, 6);
                    D = iv1.D(a00Var);
                    v02 l = a00Var.l();
                    vl1 E = bd3.E(a00Var, h);
                    pz.b.getClass();
                    Function0 function0 = oz.b;
                    a00Var.b0();
                    if (a00Var.S) {
                        a00Var.l0();
                    } else {
                        a00Var.k(function0);
                    }
                    uj2.e(a00Var, a4, oz.f);
                    uj2.e(a00Var, l, oz.e);
                    sc scVar = oz.g;
                    if (!a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                        q40.r(D, a00Var, D, scVar);
                    }
                    uj2.e(a00Var, E, oz.d);
                    a00Var.X(-93958227);
                    final double d9 = d;
                    yv2.b(uj2.f(R.string.stats_title, a00Var), null, cw.u, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(n13.a)).c, a00Var, 384, 0, 65530);
                    if (((List) a.getValue()).isEmpty()) {
                        a00Var.X(-97048091);
                        a00Var.q(false);
                        a(yj1.H(992726784, new Function2() { // from class: dp2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                a00 a00Var3 = (a00) obj5;
                                int intValue = ((Integer) obj6).intValue();
                                if (a00Var3.P(intValue & 1, (intValue & 3) != 2)) {
                                    String a5 = c61.a(Double.valueOf(d8));
                                    bp2 bp2Var = n13.a;
                                    pw2 pw2Var = ((l13) a00Var3.j(bp2Var)).c;
                                    long j2 = cw.m;
                                    jq0 jq0Var = jq0.t;
                                    yv2.b(a5, null, j2, 0L, jq0Var, 0L, null, 0L, 0, false, 0, 0, pw2Var, a00Var3, 196992, 0, 65498);
                                    yv2.b(uj2.f(R.string.stats_total, a00Var3), null, cw.u, 0L, jq0Var, 0L, null, 0L, 0, false, 0, 0, null, a00Var3, 196992, 0, 131034);
                                    yv2.b(uj2.f(R.string.stats_total_hint, a00Var3), null, cw.v, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var3.j(bp2Var)).o, a00Var3, 384, 0, 65530);
                                } else {
                                    a00Var3.S();
                                }
                                return Unit.a;
                            }
                        }, a00Var), a00Var, 6);
                        if (I.isEmpty()) {
                            a00Var.X(-97048091);
                        } else {
                            a00Var.X(-93327533);
                            a(yj1.H(2035548910, new Function2() { // from class: ep2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj5, Object obj6) {
                                    a00 a00Var3 = (a00) obj5;
                                    int intValue = ((Integer) obj6).intValue();
                                    if (a00Var3.P(intValue & 1, (intValue & 3) != 2)) {
                                        yv2.b(uj2.f(R.string.stats_by_metal, a00Var3), null, cw.u, 0L, jq0.t, 0L, null, 0L, 0, false, 0, 0, null, a00Var3, 196992, 0, 131034);
                                        a00 a00Var4 = a00Var3;
                                        for (Pair pair : I) {
                                            String str3 = (String) pair.m;
                                            double doubleValue2 = ((Number) pair.n).doubleValue();
                                            sl1 sl1Var2 = sl1.a;
                                            vl1 k = a.k(b.c(sl1Var2, 1.0f), 0.0f, 6.0f, 0.0f, 13);
                                            qw a5 = ow.a(s93.c, qb2.A, a00Var4, 0);
                                            int D2 = iv1.D(a00Var4);
                                            v02 l2 = a00Var4.l();
                                            vl1 E2 = bd3.E(a00Var4, k);
                                            pz.b.getClass();
                                            o00 o00Var = oz.b;
                                            a00Var4.b0();
                                            if (a00Var4.S) {
                                                a00Var4.k(o00Var);
                                            } else {
                                                a00Var4.l0();
                                            }
                                            sc scVar2 = oz.f;
                                            uj2.e(a00Var4, a5, scVar2);
                                            sc scVar3 = oz.e;
                                            uj2.e(a00Var4, l2, scVar3);
                                            sc scVar4 = oz.g;
                                            if (a00Var4.S || !Intrinsics.b(a00Var4.M(), Integer.valueOf(D2))) {
                                                q40.r(D2, a00Var4, D2, scVar4);
                                            }
                                            sc scVar5 = oz.d;
                                            uj2.e(a00Var4, E2, scVar5);
                                            vl1 c = b.c(sl1Var2, 1.0f);
                                            fc2 a6 = ec2.a(s93.e, qb2.y, a00Var4, 6);
                                            int D3 = iv1.D(a00Var4);
                                            v02 l3 = a00Var4.l();
                                            vl1 E3 = bd3.E(a00Var4, c);
                                            a00Var4.b0();
                                            if (a00Var4.S) {
                                                a00Var4.k(o00Var);
                                            } else {
                                                a00Var4.l0();
                                            }
                                            uj2.e(a00Var4, a6, scVar2);
                                            uj2.e(a00Var4, l3, scVar3);
                                            if (a00Var4.S || !Intrinsics.b(a00Var4.M(), Integer.valueOf(D3))) {
                                                q40.r(D3, a00Var4, D3, scVar4);
                                            }
                                            uj2.e(a00Var4, E3, scVar5);
                                            String b = c61.b(str3, a00Var4);
                                            long j2 = cw.u;
                                            bp2 bp2Var = n13.a;
                                            a00 a00Var5 = a00Var4;
                                            yv2.b(b, null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var4.j(bp2Var)).m, a00Var5, 384, 0, 65530);
                                            yv2.b(c61.a(Double.valueOf(doubleValue2)), null, cw.v, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var5.j(bp2Var)).n, a00Var5, 384, 0, 65530);
                                            a00Var4 = a00Var5;
                                            a00Var4.q(true);
                                            vl1 b2 = androidx.compose.foundation.a.b(yk3.u(b.d(b.c(sl1Var2, 1.0f), 10.0f), zb2.a(999.0f)), cw.t, ap.e);
                                            oj1 e = fp.e(qb2.p, false);
                                            int D4 = iv1.D(a00Var4);
                                            v02 l4 = a00Var4.l();
                                            vl1 E4 = bd3.E(a00Var4, b2);
                                            a00Var4.b0();
                                            if (a00Var4.S) {
                                                a00Var4.k(o00Var);
                                            } else {
                                                a00Var4.l0();
                                            }
                                            uj2.e(a00Var4, e, scVar2);
                                            uj2.e(a00Var4, l4, scVar3);
                                            if (a00Var4.S || !Intrinsics.b(a00Var4.M(), Integer.valueOf(D4))) {
                                                q40.r(D4, a00Var4, D4, scVar4);
                                            }
                                            uj2.e(a00Var4, E4, scVar5);
                                            fp.a(androidx.compose.foundation.a.a(yk3.u(b.d(b.c(sl1Var2, d.b((float) (doubleValue2 / d9), 0.02f, 1.0f)), 10.0f), zb2.a(999.0f)), nj.q(qv.g(new aw(cw.p), new aw(cw.q)))), a00Var4, 0);
                                            a00Var4.q(true);
                                            a00Var4.q(true);
                                        }
                                    } else {
                                        a00Var3.S();
                                    }
                                    return Unit.a;
                                }
                            }, a00Var), a00Var, 6);
                        }
                        a00Var.q(false);
                        if (J.isEmpty()) {
                            i2 = 2;
                            a00Var.X(-97048091);
                        } else {
                            a00Var.X(-91853855);
                            i2 = 2;
                            a(yj1.H(97009613, new pu0(i2, J), a00Var), a00Var, 6);
                        }
                        a00Var.q(false);
                        a(yj1.H(1748915945, new ss(8, a3, a2), a00Var), a00Var, 6);
                        String f = uj2.f(R.string.stats_export, a00Var);
                        boolean h2 = a00Var.h(context) | a00Var.f(a);
                        Object M2 = a00Var.M();
                        if (h2 || M2 == obj) {
                            z = true;
                            M2 = new v4(context, a, 1 == true ? 1 : 0);
                            a00Var.i0(M2);
                        } else {
                            z = true;
                        }
                        vl1Var2 = sl1Var;
                        yi1.e(f, (Function0) M2, b.c(vl1Var2, 1.0f), false, a00Var, 384);
                        a00Var2 = a00Var;
                        a00Var2.q(false);
                    } else {
                        a00Var.X(-93934699);
                        yv2.b(uj2.f(R.string.stats_empty, a00Var), null, cw.v, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, a00Var, 384, 0, 131066);
                        a00Var2 = a00Var;
                        a00Var2.q(false);
                        a00Var2.q(false);
                        vl1Var2 = sl1Var;
                        i2 = 2;
                        z = true;
                    }
                    a00Var2.q(z);
                }
            }
            d = 1.0d;
            List list22 = (List) a.getValue();
            ArrayList arrayList32 = new ArrayList();
            while (r8.hasNext()) {
            }
            List J2 = zv.J(5, zv.I(arrayList32, new zo0(14)));
            long j2 = cw.r;
            su suVar2 = ap.e;
            final double d82 = d2;
            sl1 sl1Var2 = sl1.a;
            vl1 h3 = a.h(s03.T(androidx.compose.foundation.a.b(sl1Var2, j2, suVar2), s03.G(a00Var)), 16.0f);
            qw a42 = ow.a(new yh(14.0f, true, sc.o), qb2.A, a00Var, 6);
            D = iv1.D(a00Var);
            v02 l2 = a00Var.l();
            vl1 E2 = bd3.E(a00Var, h3);
            pz.b.getClass();
            Function0 function02 = oz.b;
            a00Var.b0();
            if (a00Var.S) {
            }
            uj2.e(a00Var, a42, oz.f);
            uj2.e(a00Var, l2, oz.e);
            sc scVar2 = oz.g;
            if (!a00Var.S) {
            }
            q40.r(D, a00Var, D, scVar2);
            uj2.e(a00Var, E2, oz.d);
            a00Var.X(-93958227);
            final double d92 = d;
            yv2.b(uj2.f(R.string.stats_title, a00Var), null, cw.u, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(n13.a)).c, a00Var, 384, 0, 65530);
            if (((List) a.getValue()).isEmpty()) {
            }
            a00Var2.q(z);
        } else {
            i2 = 2;
            a00Var2.S();
            vl1Var2 = vl1Var;
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new qh(vl1Var2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(ff2 ff2Var, float f, nd ndVar, q70 q70Var, Function1 function1, r30 r30Var) {
        jm2 jm2Var;
        int i;
        float f2;
        z72 z72Var;
        if (r30Var instanceof jm2) {
            jm2Var = (jm2) r30Var;
            int i2 = jm2Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jm2Var.q = i2 - Integer.MIN_VALUE;
                Object obj = jm2Var.p;
                b50 b50Var = b50.m;
                i = jm2Var.q;
                if (i != 0) {
                    ca2.b(obj);
                    z72 z72Var2 = new z72();
                    boolean z = ((Number) ndVar.a()).floatValue() == 0.0f;
                    km2 km2Var = new km2(f, z72Var2, ff2Var, function1, 0);
                    jm2Var.n = ndVar;
                    jm2Var.o = z72Var2;
                    jm2Var.m = f;
                    jm2Var.q = 1;
                    if (nk2.e(ndVar, q70Var, !z, km2Var, jm2Var) == b50Var) {
                        return b50Var;
                    }
                    f2 = f;
                    z72Var = z72Var2;
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f2 = jm2Var.m;
                    z72Var = jm2Var.o;
                    ndVar = jm2Var.n;
                    ca2.b(obj);
                }
                return new jd(new Float(f2 - z72Var.m), ndVar);
            }
        }
        jm2Var = new jm2(r30Var);
        Object obj2 = jm2Var.p;
        b50 b50Var2 = b50.m;
        i = jm2Var.q;
        if (i != 0) {
        }
        return new jd(new Float(f2 - z72Var.m), ndVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(ff2 ff2Var, float f, float f2, nd ndVar, eo2 eo2Var, Function1 function1, r30 r30Var) {
        lm2 lm2Var;
        int i;
        float floatValue;
        nd ndVar2;
        z72 z72Var;
        float f3 = f;
        if (r30Var instanceof lm2) {
            lm2Var = (lm2) r30Var;
            int i2 = lm2Var.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lm2Var.r = i2 - Integer.MIN_VALUE;
                lm2 lm2Var2 = lm2Var;
                Object obj = lm2Var2.q;
                Object obj2 = b50.m;
                i = lm2Var2.r;
                if (i != 0) {
                    ca2.b(obj);
                    z72 z72Var2 = new z72();
                    floatValue = ((Number) ndVar.a()).floatValue();
                    Float f4 = new Float(f3);
                    boolean z = ((Number) ndVar.a()).floatValue() == 0.0f;
                    km2 km2Var = new km2(f2, z72Var2, ff2Var, function1, 1);
                    lm2Var2.o = ndVar;
                    lm2Var2.p = z72Var2;
                    lm2Var2.m = f3;
                    lm2Var2.n = floatValue;
                    lm2Var2.r = 1;
                    Object c = nk2.c(ndVar, new bt2(eo2Var, ndVar.m, ndVar.n.getValue(), f4, ndVar.o), !z ? ndVar.p : Long.MIN_VALUE, km2Var, lm2Var2);
                    if (c != obj2) {
                        c = Unit.a;
                    }
                    if (c == obj2) {
                        return obj2;
                    }
                    ndVar2 = ndVar;
                    z72Var = z72Var2;
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f5 = lm2Var2.n;
                    float f6 = lm2Var2.m;
                    z72Var = lm2Var2.p;
                    ndVar2 = lm2Var2.o;
                    ca2.b(obj);
                    floatValue = f5;
                    f3 = f6;
                }
                return new jd(new Float(f3 - z72Var.m), tk3.C(ndVar2, f(((Number) ndVar2.a()).floatValue(), floatValue), 29));
            }
        }
        lm2Var = new lm2(r30Var);
        lm2 lm2Var22 = lm2Var;
        Object obj3 = lm2Var22.q;
        Object obj22 = b50.m;
        i = lm2Var22.r;
        if (i != 0) {
        }
        return new jd(new Float(f3 - z72Var.m), tk3.C(ndVar2, f(((Number) ndVar2.a()).floatValue(), floatValue), 29));
    }

    public static final LinkedHashMap e(ArrayList arrayList) {
        String str = qz1.n;
        qz1 r = nm1.r("/");
        Pair[] pairArr = {new Pair(r, new o93(r, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(li1.a(1));
        mi1.g(linkedHashMap, pairArr);
        for (o93 o93Var : zv.I(arrayList, new zo0(17))) {
            if (((o93) linkedHashMap.put(o93Var.a, o93Var)) == null) {
                while (true) {
                    qz1 qz1Var = o93Var.a;
                    qz1 b = qz1Var.b();
                    if (b != null) {
                        o93 o93Var2 = (o93) linkedHashMap.get(b);
                        if (o93Var2 != null) {
                            o93Var2.q.add(qz1Var);
                            break;
                        }
                        o93 o93Var3 = new o93(b, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMap.put(b, o93Var3);
                        o93Var3.q.add(qz1Var);
                        o93Var = o93Var3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final float f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    public static boolean g(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean h = h(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return h;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static boolean h(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static final String i(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        return q40.m("\"", tp2.m(str, "\"", "\"\""), "\"");
    }

    public static final String j(int i) {
        String num = Integer.toString(i, CharsKt.checkRadix(16));
        num.getClass();
        return "0x".concat(num);
    }

    public static File k(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final void l(xh2 xh2Var) {
        s03.J(xh2Var).G();
    }

    public static MappedByteBuffer m(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final o93 n(p62 p62Var) {
        int m = p62Var.m();
        if (m != 33639248) {
            throw new IOException("bad zip: expected " + j(33639248) + " but was " + j(m));
        }
        p62Var.skip(4L);
        short o = p62Var.o();
        int i = o & 65535;
        if ((o & 1) != 0) {
            dm0.j("unsupported zip: general purpose bit flag=".concat(j(i)));
            return null;
        }
        int o2 = p62Var.o() & 65535;
        int o3 = p62Var.o() & 65535;
        int o4 = p62Var.o() & 65535;
        long m2 = p62Var.m() & 4294967295L;
        b82 b82Var = new b82();
        b82Var.m = p62Var.m() & 4294967295L;
        b82 b82Var2 = new b82();
        b82Var2.m = p62Var.m() & 4294967295L;
        int o5 = p62Var.o() & 65535;
        int o6 = p62Var.o() & 65535;
        int o7 = p62Var.o() & 65535;
        p62Var.skip(8L);
        b82 b82Var3 = new b82();
        b82Var3.m = p62Var.m() & 4294967295L;
        String p = p62Var.p(o5);
        if (up2.p(p, (char) 0)) {
            dm0.j("bad zip: filename contains 0x00");
            return null;
        }
        long j = b82Var2.m == 4294967295L ? 8L : 0L;
        if (b82Var.m == 4294967295L) {
            j += 8;
        }
        if (b82Var3.m == 4294967295L) {
            j += 8;
        }
        long j2 = j;
        c82 c82Var = new c82();
        c82 c82Var2 = new c82();
        c82 c82Var3 = new c82();
        y72 y72Var = new y72();
        o(p62Var, o6, new r93(y72Var, j2, b82Var2, p62Var, b82Var, b82Var3, c82Var, c82Var2, c82Var3));
        if (j2 > 0 && !y72Var.m) {
            dm0.j("bad zip: zip64 extra required but absent");
            return null;
        }
        String p2 = p62Var.p(o7);
        String str = qz1.n;
        return new o93(nm1.r("/").d(p), tp2.h(p, "/", false), p2, m2, b82Var.m, b82Var2.m, o2, b82Var3.m, o4, o3, (Long) c82Var.m, (Long) c82Var2.m, (Long) c82Var3.m, 57344);
    }

    public static final void o(p62 p62Var, int i, Function2 function2) {
        fq fqVar = p62Var.n;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                dm0.j("bad zip: truncated header in extra field");
                return;
            }
            int o = p62Var.o() & 65535;
            long o2 = p62Var.o() & 65535;
            long j2 = j - 4;
            if (j2 < o2) {
                dm0.j("bad zip: truncated value in extra field");
                return;
            }
            p62Var.F(o2);
            long j3 = fqVar.n;
            function2.invoke(Integer.valueOf(o), Long.valueOf(o2));
            long j4 = (fqVar.n + o2) - j3;
            if (j4 < 0) {
                dm0.j(in1.k(o, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    fqVar.skip(j4);
                }
                j = j2 - o2;
            }
        }
    }

    public static final ArrayList p(BufferedReader bufferedReader) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = new t10(new yv(1, bufferedReader)).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                str.getClass();
                arrayList.add(str);
                Unit unit = Unit.a;
            }
            Unit unit2 = Unit.a;
            bufferedReader.close();
            return arrayList;
        } finally {
        }
    }

    public static final o93 q(p62 p62Var, o93 o93Var) {
        int m = p62Var.m();
        if (m != 67324752) {
            throw new IOException("bad zip: expected " + j(67324752) + " but was " + j(m));
        }
        p62Var.skip(2L);
        short o = p62Var.o();
        int i = o & 65535;
        if ((o & 1) != 0) {
            dm0.j("unsupported zip: general purpose bit flag=".concat(j(i)));
            return null;
        }
        p62Var.skip(18L);
        int o2 = p62Var.o() & 65535;
        p62Var.skip(p62Var.o() & 65535);
        if (o93Var == null) {
            p62Var.skip(o2);
            return null;
        }
        c82 c82Var = new c82();
        c82 c82Var2 = new c82();
        c82 c82Var3 = new c82();
        o(p62Var, o2, new q93(p62Var, c82Var, c82Var2, c82Var3));
        return new o93(o93Var.a, o93Var.b, o93Var.c, o93Var.d, o93Var.e, o93Var.f, o93Var.g, o93Var.h, o93Var.i, o93Var.j, o93Var.k, o93Var.l, o93Var.m, (Integer) c82Var.m, (Integer) c82Var2.m, (Integer) c82Var3.m);
    }

    public static final String r(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[Utility.DEFAULT_STREAM_BUFFER_SIZE];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }

    public static String s(im3 im3Var) {
        StringBuilder sb = new StringBuilder(im3Var.c());
        for (int i = 0; i < im3Var.c(); i++) {
            byte a = im3Var.a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                        sb.append("\\f");
                        break;
                    case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                        sb.append("\\r");
                        break;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
