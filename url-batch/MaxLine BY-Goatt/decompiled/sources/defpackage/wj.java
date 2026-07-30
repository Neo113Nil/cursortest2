package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Path;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class wj {
    public static final Map a;

    static {
        Pair pair = new Pair("amethyst", Float.valueOf(280.0f));
        Pair pair2 = new Pair("ruby", Float.valueOf(350.0f));
        Pair pair3 = new Pair("sapphire", Float.valueOf(220.0f));
        Pair pair4 = new Pair("emerald", Float.valueOf(150.0f));
        Pair pair5 = new Pair("citrine", Float.valueOf(45.0f));
        Pair pair6 = new Pair("garnet", Float.valueOf(355.0f));
        Pair pair7 = new Pair("turquoise", Float.valueOf(180.0f));
        Pair pair8 = new Pair("amber", Float.valueOf(35.0f));
        Pair pair9 = new Pair("tanzanite", Float.valueOf(255.0f));
        Pair pair10 = new Pair("topaz", Float.valueOf(200.0f));
        Pair pair11 = new Pair("aquamarine", Float.valueOf(190.0f));
        Pair pair12 = new Pair("peridot", Float.valueOf(90.0f));
        Float valueOf = Float.valueOf(300.0f);
        Pair pair13 = new Pair("opal", valueOf);
        Pair pair14 = new Pair("pearl", Float.valueOf(40.0f));
        Pair pair15 = new Pair("rose_quartz", Float.valueOf(330.0f));
        Pair pair16 = new Pair("ametrine", valueOf);
        Pair pair17 = new Pair("charoite", Float.valueOf(275.0f));
        Pair pair18 = new Pair("kunzite", Float.valueOf(320.0f));
        Pair pair19 = new Pair("quartz", Float.valueOf(0.0f));
        Pair pair20 = new Pair("pyrite", Float.valueOf(50.0f));
        Pair pair21 = new Pair("malachite", Float.valueOf(140.0f));
        Pair pair22 = new Pair("fluorite", Float.valueOf(265.0f));
        Float valueOf2 = Float.valueOf(210.0f);
        a = mi1.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, new Pair("hematite", valueOf2), new Pair("gold", Float.valueOf(46.0f)), new Pair("silver", valueOf2), new Pair("platinum", valueOf2), new Pair("palladium", valueOf2));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final ik ikVar, vl1 vl1Var, float f, a00 a00Var, final int i, final int i2) {
        vl1 vl1Var2;
        float f2;
        final vl1 vl1Var3;
        n72 s;
        float hashCode;
        ikVar.getClass();
        a00Var.Z(90839632);
        int i3 = i | (a00Var.h(ikVar) ? 4 : 2);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            vl1Var2 = vl1Var;
            i3 |= a00Var.f(vl1Var2) ? 32 : 16;
            if (a00Var.P(i3 & 1, (i3 & 147) == 146)) {
                f2 = f;
                a00Var.S();
                vl1Var3 = vl1Var2;
            } else {
                sl1 sl1Var = sl1.a;
                vl1 vl1Var4 = i4 != 0 ? sl1Var : vl1Var2;
                Context context = (Context) a00Var.j(AndroidCompositionLocals_androidKt.b);
                String str = ikVar.a;
                boolean f3 = a00Var.f(str);
                Object M = a00Var.M();
                Object obj = sz.a;
                if (f3 || M == obj) {
                    context.getClass();
                    str.getClass();
                    Resources resources = context.getResources();
                    String packageName = context.getPackageName();
                    int identifier = resources.getIdentifier(str, "drawable", packageName);
                    if (identifier == 0) {
                        identifier = resources.getIdentifier("atlas_".concat(str), "drawable", packageName);
                    }
                    M = Integer.valueOf(identifier);
                    a00Var.i0(M);
                }
                int intValue = ((Number) M).intValue();
                f2 = f;
                vl1 h = b.h(vl1Var4, f2);
                oj1 e = fp.e(qb2.t, false);
                int D = iv1.D(a00Var);
                v02 l = a00Var.l();
                vl1 E = bd3.E(a00Var, h);
                pz.b.getClass();
                Function0 function0 = oz.b;
                a00Var.b0();
                if (a00Var.S) {
                    a00Var.k(function0);
                } else {
                    a00Var.l0();
                }
                uj2.e(a00Var, e, oz.f);
                uj2.e(a00Var, l, oz.e);
                sc scVar = oz.g;
                if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                    q40.r(D, a00Var, D, scVar);
                }
                uj2.e(a00Var, E, oz.d);
                if (intValue != 0) {
                    a00Var.X(1803094332);
                    l41.g(o70.G(intValue, a00Var), b.b(sl1Var, 1.0f), null, null, 0.0f, a00Var, 432, 120);
                    a00Var.q(false);
                } else {
                    a00Var.X(1803285261);
                    boolean f4 = a00Var.f(str);
                    Object M2 = a00Var.M();
                    if (f4 || M2 == obj) {
                        Float f5 = (Float) a.get(str);
                        if (f5 != null) {
                            hashCode = f5.floatValue();
                        } else {
                            int ordinal = ikVar.b.ordinal();
                            hashCode = ordinal != 2 ? ordinal != 3 ? ((str.hashCode() % 360) + 360) % 360.0f : 45.0f : 28.0f;
                        }
                        M2 = Float.valueOf(hashCode);
                        a00Var.i0(M2);
                    }
                    final float floatValue = ((Number) M2).floatValue();
                    vl1 b = b.b(sl1Var, 1.0f);
                    boolean c = a00Var.c(floatValue);
                    Object M3 = a00Var.M();
                    if (c || M3 == obj) {
                        M3 = new Function1() { // from class: uj
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                long r;
                                yd0 yd0Var = (yd0) obj2;
                                yd0Var.getClass();
                                float intBitsToFloat = Float.intBitsToFloat((int) (yd0Var.f() >> 32));
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (yd0Var.f() & 4294967295L));
                                float f6 = floatValue;
                                int i5 = aw.h;
                                long r2 = f6 == 0.0f ? nj.r(0.0f, 0.0f, 0.85f) : nj.r(f6, 0.55f, 0.72f);
                                if (f6 == 0.0f) {
                                    int i6 = aw.h;
                                    r = nj.r(0.0f, 0.0f, 0.45f);
                                } else {
                                    int i7 = aw.h;
                                    r = nj.r(f6, 0.6f, 0.4f);
                                }
                                oa a2 = qa.a();
                                Path path = a2.a;
                                path.moveTo(Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 50.0f, 6.0f) >> 32)), Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 50.0f, 6.0f) & 4294967295L)));
                                a2.c(Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 82.0f, 32.0f) >> 32)), Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 82.0f, 32.0f) & 4294967295L)));
                                a2.c(Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 68.0f, 88.0f) >> 32)), Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 68.0f, 88.0f) & 4294967295L)));
                                a2.c(Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 32.0f, 88.0f) >> 32)), Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 32.0f, 88.0f) & 4294967295L)));
                                a2.c(Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 18.0f, 32.0f) >> 32)), Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 18.0f, 32.0f) & 4294967295L)));
                                path.close();
                                yd0.x(yd0Var, a2, new xd1(qv.g(new aw(r2), new aw(r)), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)), 0.0f, null, 60);
                                oa a3 = qa.a();
                                Path path2 = a3.a;
                                path2.moveTo(Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 50.0f, 6.0f) >> 32)), Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 50.0f, 6.0f) & 4294967295L)));
                                a3.c(Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 68.0f, 88.0f) >> 32)), Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 68.0f, 88.0f) & 4294967295L)));
                                a3.c(Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 50.0f, 50.0f) >> 32)), Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 50.0f, 50.0f) & 4294967295L)));
                                path2.close();
                                long j = aw.c;
                                yd0Var.b0(a3, aw.b(j, 0.22f));
                                oa a4 = qa.a();
                                Path path3 = a4.a;
                                path3.moveTo(Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 18.0f, 32.0f) >> 32)), Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 18.0f, 32.0f) & 4294967295L)));
                                a4.c(Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 32.0f, 88.0f) >> 32)), Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 32.0f, 88.0f) & 4294967295L)));
                                a4.c(Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 50.0f, 50.0f) >> 32)), Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 50.0f, 50.0f) & 4294967295L)));
                                path3.close();
                                yd0Var.b0(a4, aw.b(aw.b, 0.16f));
                                oa a5 = qa.a();
                                Path path4 = a5.a;
                                path4.moveTo(Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 18.0f, 32.0f) >> 32)), Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 18.0f, 32.0f) & 4294967295L)));
                                a5.c(Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 82.0f, 32.0f) >> 32)), Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 82.0f, 32.0f) & 4294967295L)));
                                a5.c(Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 50.0f, 50.0f) >> 32)), Float.intBitsToFloat((int) (wj.b(intBitsToFloat, intBitsToFloat2, 50.0f, 50.0f) & 4294967295L)));
                                path4.close();
                                yd0Var.b0(a5, aw.b(j, 0.3f));
                                return Unit.a;
                            }
                        };
                        a00Var.i0(M3);
                    }
                    j8.a(6, a00Var, b, (Function1) M3);
                    a00Var.q(false);
                }
                a00Var.q(true);
                vl1Var3 = vl1Var4;
            }
            s = a00Var.s();
            if (s == null) {
                final float f6 = f2;
                s.d = new Function2() { // from class: vj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        wj.a(ik.this, vl1Var3, f6, (a00) obj2, s03.R(i | 1), i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        vl1Var2 = vl1Var;
        if (a00Var.P(i3 & 1, (i3 & 147) == 146)) {
        }
        s = a00Var.s();
        if (s == null) {
        }
    }

    public static final long b(float f, float f2, float f3, float f4) {
        return (Float.floatToRawIntBits((f3 / 100.0f) * f) << 32) | (Float.floatToRawIntBits((f4 / 100.0f) * f2) & 4294967295L);
    }
}
