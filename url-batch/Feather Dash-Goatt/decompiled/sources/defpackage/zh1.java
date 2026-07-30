package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class zh1 {
    public static final mi a = oi.a(ji.a, 0, 0, 0, 0, ji.b, 0, 0, 0, ji.c, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 65535);
    public static final mi b = oi.c(ji.d, 0, 0, 0, 0, ji.e, 0, 0, 0, ji.f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 65535);

    public static final void a(boolean z, boolean z2, final hk hkVar, hl hlVar, final int i) {
        final boolean z3;
        final boolean z4;
        mi miVar;
        int i2;
        hlVar.Y(-1355719803);
        int i3 = i | 50;
        if (hlVar.O(i3 & 1, (i3 & 147) != 146)) {
            hlVar.T();
            if ((i & 1) == 0 || hlVar.y()) {
                z3 = (((Configuration) hlVar.j(AndroidCompositionLocals_androidKt.a)).uiMode & 48) == 32;
                z4 = true;
            } else {
                hlVar.R();
                z3 = z;
                z4 = z2;
            }
            hlVar.q();
            if (z4 && (i2 = Build.VERSION.SDK_INT) >= 31) {
                hlVar.W(1624110754);
                Context context = (Context) hlVar.j(AndroidCompositionLocals_androidKt.b);
                if (z3) {
                    if (i2 >= 34) {
                        miVar = oi.a(yr1.K(context, R.color.system_primary_dark), yr1.K(context, R.color.system_on_primary_dark), yr1.K(context, R.color.system_primary_container_dark), yr1.K(context, R.color.system_on_primary_container_dark), yr1.K(context, R.color.system_primary_light), yr1.K(context, R.color.system_secondary_dark), yr1.K(context, R.color.system_on_secondary_dark), yr1.K(context, R.color.system_secondary_container_dark), yr1.K(context, R.color.system_on_secondary_container_dark), yr1.K(context, R.color.system_tertiary_dark), yr1.K(context, R.color.system_on_tertiary_dark), yr1.K(context, R.color.system_tertiary_container_dark), yr1.K(context, R.color.system_on_tertiary_container_dark), yr1.K(context, R.color.system_background_dark), yr1.K(context, R.color.system_on_background_dark), yr1.K(context, R.color.system_surface_dark), yr1.K(context, R.color.system_on_surface_dark), yr1.K(context, R.color.system_surface_variant_dark), yr1.K(context, R.color.system_on_surface_variant_dark), yr1.K(context, R.color.system_primary_dark), yr1.K(context, R.color.system_surface_light), yr1.K(context, R.color.system_on_surface_light), yr1.K(context, R.color.system_outline_dark), yr1.K(context, R.color.system_outline_variant_dark), 0L, yr1.K(context, R.color.system_surface_bright_dark), yr1.K(context, R.color.system_surface_container_dark), yr1.K(context, R.color.system_surface_container_high_dark), yr1.K(context, R.color.system_surface_container_highest_dark), yr1.K(context, R.color.system_surface_container_low_dark), yr1.K(context, R.color.system_surface_container_lowest_dark), yr1.K(context, R.color.system_surface_dim_dark), yr1.K(context, R.color.system_primary_fixed), yr1.K(context, R.color.system_primary_fixed_dim), yr1.K(context, R.color.system_on_primary_fixed), yr1.K(context, R.color.system_on_primary_fixed_variant), yr1.K(context, R.color.system_secondary_fixed), yr1.K(context, R.color.system_secondary_fixed_dim), yr1.K(context, R.color.system_on_secondary_fixed), yr1.K(context, R.color.system_on_secondary_fixed_variant), yr1.K(context, R.color.system_tertiary_fixed), yr1.K(context, R.color.system_tertiary_fixed_dim), yr1.K(context, R.color.system_on_tertiary_fixed), yr1.K(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                    } else {
                        qi1 x = op.x(context);
                        long j = x.x;
                        long j2 = x.A;
                        long j3 = x.z;
                        long j4 = x.w;
                        long j5 = x.y;
                        long j6 = x.E;
                        long j7 = x.H;
                        long j8 = x.G;
                        long j9 = x.D;
                        long j10 = x.L;
                        long j11 = x.O;
                        long j12 = x.N;
                        long j13 = x.K;
                        long j14 = x.s;
                        long j15 = x.g;
                        long j16 = x.l;
                        miVar = oi.a(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j14, j15, j16, x.i, j, j15, x.o, x.j, j16, x.u, x.m, x.q, x.p, x.n, x.r, x.t, j14, j4, j, x.B, j3, j9, j6, x.I, j8, j13, j10, x.P, j12, 62914560, 0);
                    }
                } else if (i2 >= 34) {
                    miVar = oi.c(yr1.K(context, R.color.system_primary_light), yr1.K(context, R.color.system_on_primary_light), yr1.K(context, R.color.system_primary_container_light), yr1.K(context, R.color.system_on_primary_container_light), yr1.K(context, R.color.system_primary_dark), yr1.K(context, R.color.system_secondary_light), yr1.K(context, R.color.system_on_secondary_light), yr1.K(context, R.color.system_secondary_container_light), yr1.K(context, R.color.system_on_secondary_container_light), yr1.K(context, R.color.system_tertiary_light), yr1.K(context, R.color.system_on_tertiary_light), yr1.K(context, R.color.system_tertiary_container_light), yr1.K(context, R.color.system_on_tertiary_container_light), yr1.K(context, R.color.system_background_light), yr1.K(context, R.color.system_on_background_light), yr1.K(context, R.color.system_surface_light), yr1.K(context, R.color.system_on_surface_light), yr1.K(context, R.color.system_surface_variant_light), yr1.K(context, R.color.system_on_surface_variant_light), yr1.K(context, R.color.system_primary_light), yr1.K(context, R.color.system_surface_dark), yr1.K(context, R.color.system_on_surface_dark), yr1.K(context, R.color.system_outline_light), yr1.K(context, R.color.system_outline_variant_light), 0L, yr1.K(context, R.color.system_surface_bright_light), yr1.K(context, R.color.system_surface_container_light), yr1.K(context, R.color.system_surface_container_high_light), yr1.K(context, R.color.system_surface_container_highest_light), yr1.K(context, R.color.system_surface_container_low_light), yr1.K(context, R.color.system_surface_container_lowest_light), yr1.K(context, R.color.system_surface_dim_light), yr1.K(context, R.color.system_primary_fixed), yr1.K(context, R.color.system_primary_fixed_dim), yr1.K(context, R.color.system_on_primary_fixed), yr1.K(context, R.color.system_on_primary_fixed_variant), yr1.K(context, R.color.system_secondary_fixed), yr1.K(context, R.color.system_secondary_fixed_dim), yr1.K(context, R.color.system_on_secondary_fixed), yr1.K(context, R.color.system_on_secondary_fixed_variant), yr1.K(context, R.color.system_tertiary_fixed), yr1.K(context, R.color.system_tertiary_fixed_dim), yr1.K(context, R.color.system_on_tertiary_fixed), yr1.K(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                } else {
                    qi1 x2 = op.x(context);
                    long j17 = x2.y;
                    long j18 = x2.v;
                    long j19 = x2.w;
                    long j20 = x2.B;
                    long j21 = x2.x;
                    long j22 = x2.F;
                    long j23 = x2.C;
                    long j24 = x2.D;
                    long j25 = x2.I;
                    long j26 = x2.M;
                    long j27 = x2.J;
                    long j28 = x2.K;
                    long j29 = x2.P;
                    long j30 = x2.b;
                    long j31 = x2.r;
                    long j32 = x2.g;
                    miVar = oi.c(j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j30, j31, j32, x2.l, j17, x2.o, x2.d, x2.k, x2.i, x2.u, j30, x2.e, x2.f, j32, x2.c, x2.a, x2.h, j19, j21, j20, x2.z, j24, x2.E, j25, x2.G, j28, x2.L, j29, x2.N, 62914560, 0);
                }
                hlVar.p(false);
            } else if (z3) {
                hlVar.W(-1471624428);
                hlVar.p(false);
                miVar = a;
            } else {
                hlVar.W(-1471623403);
                hlVar.p(false);
                miVar = b;
            }
            mk0.b(miVar, null, uj1.a, hkVar, hlVar, 3456);
        } else {
            hlVar.R();
            z3 = z;
            z4 = z2;
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new Function2(z3, z4, hkVar, i) { // from class: yh1
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ hk g;

                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int P = gb0.P(385);
                    zh1.a(this.d, this.e, this.g, (hl) obj, P);
                    return Unit.a;
                }
            };
        }
    }
}
