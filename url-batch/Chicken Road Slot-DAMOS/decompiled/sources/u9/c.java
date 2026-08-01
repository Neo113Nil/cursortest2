package u9;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j0.e0;
import j0.r;
import j0.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n0.h;
import n0.i0;
import n0.s1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final j0.a f9711a = j0.b.a(a.f9700a, 0, 0, 0, 0, a.f9701b, 0, 0, 0, a.f9702c, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 65535);

    /* renamed from: b, reason: collision with root package name */
    public static final j0.a f9712b = j0.b.b(a.f9703d, 0, 0, 0, 0, a.f9704e, 0, 0, 0, a.f9705f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 65535);

    public static final void a(boolean z10, boolean z11, final x0.d dVar, i0 i0Var, final int i3) {
        final boolean z12;
        final boolean z13;
        j0.a aVar;
        int i10;
        i0Var.X(-1043022369);
        int i11 = i3 | 50;
        if (i0Var.O(i11 & 1, (i11 & 147) != 146)) {
            i0Var.T();
            if ((i3 & 1) == 0 || i0Var.y()) {
                z12 = (((Configuration) i0Var.j(AndroidCompositionLocals_androidKt.f464a)).uiMode & 48) == 32;
                z13 = true;
            } else {
                i0Var.R();
                z12 = z10;
                z13 = z11;
            }
            i0Var.q();
            if (z13 && (i10 = Build.VERSION.SDK_INT) >= 31) {
                i0Var.W(1409282184);
                Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f465b);
                if (z12) {
                    if (i10 >= 34) {
                        aVar = j0.b.a(w.d(context, R.color.system_primary_dark), w.d(context, R.color.system_on_primary_dark), w.d(context, R.color.system_primary_container_dark), w.d(context, R.color.system_on_primary_container_dark), w.d(context, R.color.system_primary_light), w.d(context, R.color.system_secondary_dark), w.d(context, R.color.system_on_secondary_dark), w.d(context, R.color.system_secondary_container_dark), w.d(context, R.color.system_on_secondary_container_dark), w.d(context, R.color.system_tertiary_dark), w.d(context, R.color.system_on_tertiary_dark), w.d(context, R.color.system_tertiary_container_dark), w.d(context, R.color.system_on_tertiary_container_dark), w.d(context, R.color.system_background_dark), w.d(context, R.color.system_on_background_dark), w.d(context, R.color.system_surface_dark), w.d(context, R.color.system_on_surface_dark), w.d(context, R.color.system_surface_variant_dark), w.d(context, R.color.system_on_surface_variant_dark), w.d(context, R.color.system_primary_dark), w.d(context, R.color.system_surface_light), w.d(context, R.color.system_on_surface_light), w.d(context, R.color.system_outline_dark), w.d(context, R.color.system_outline_variant_dark), 0L, w.d(context, R.color.system_surface_bright_dark), w.d(context, R.color.system_surface_container_dark), w.d(context, R.color.system_surface_container_high_dark), w.d(context, R.color.system_surface_container_highest_dark), w.d(context, R.color.system_surface_container_low_dark), w.d(context, R.color.system_surface_container_lowest_dark), w.d(context, R.color.system_surface_dim_dark), w.d(context, R.color.system_primary_fixed), w.d(context, R.color.system_primary_fixed_dim), w.d(context, R.color.system_on_primary_fixed), w.d(context, R.color.system_on_primary_fixed_variant), w.d(context, R.color.system_secondary_fixed), w.d(context, R.color.system_secondary_fixed_dim), w.d(context, R.color.system_on_secondary_fixed), w.d(context, R.color.system_on_secondary_fixed_variant), w.d(context, R.color.system_tertiary_fixed), w.d(context, R.color.system_tertiary_fixed_dim), w.d(context, R.color.system_on_tertiary_fixed), w.d(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                    } else {
                        e0 c10 = w.c(context);
                        long j = c10.f4828x;
                        long j3 = c10.A;
                        long j10 = c10.f4830z;
                        long j11 = c10.f4827w;
                        long j12 = c10.f4829y;
                        long j13 = c10.E;
                        long j14 = c10.H;
                        long j15 = c10.G;
                        long j16 = c10.D;
                        long j17 = c10.L;
                        long j18 = c10.O;
                        long j19 = c10.N;
                        long j20 = c10.K;
                        long j21 = c10.f4823s;
                        long j22 = c10.g;
                        long j23 = c10.f4816l;
                        aVar = j0.b.a(j, j3, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j21, j22, j23, c10.f4814i, j, j22, c10.f4819o, c10.j, j23, c10.f4825u, c10.f4817m, c10.f4821q, c10.f4820p, c10.f4818n, c10.f4822r, c10.f4824t, j21, j11, j, c10.B, j10, j16, j13, c10.I, j15, j20, j17, c10.P, j19, 62914560, 0);
                    }
                } else if (i10 >= 34) {
                    aVar = j0.b.b(w.d(context, R.color.system_primary_light), w.d(context, R.color.system_on_primary_light), w.d(context, R.color.system_primary_container_light), w.d(context, R.color.system_on_primary_container_light), w.d(context, R.color.system_primary_dark), w.d(context, R.color.system_secondary_light), w.d(context, R.color.system_on_secondary_light), w.d(context, R.color.system_secondary_container_light), w.d(context, R.color.system_on_secondary_container_light), w.d(context, R.color.system_tertiary_light), w.d(context, R.color.system_on_tertiary_light), w.d(context, R.color.system_tertiary_container_light), w.d(context, R.color.system_on_tertiary_container_light), w.d(context, R.color.system_background_light), w.d(context, R.color.system_on_background_light), w.d(context, R.color.system_surface_light), w.d(context, R.color.system_on_surface_light), w.d(context, R.color.system_surface_variant_light), w.d(context, R.color.system_on_surface_variant_light), w.d(context, R.color.system_primary_light), w.d(context, R.color.system_surface_dark), w.d(context, R.color.system_on_surface_dark), w.d(context, R.color.system_outline_light), w.d(context, R.color.system_outline_variant_light), 0L, w.d(context, R.color.system_surface_bright_light), w.d(context, R.color.system_surface_container_light), w.d(context, R.color.system_surface_container_high_light), w.d(context, R.color.system_surface_container_highest_light), w.d(context, R.color.system_surface_container_low_light), w.d(context, R.color.system_surface_container_lowest_light), w.d(context, R.color.system_surface_dim_light), w.d(context, R.color.system_primary_fixed), w.d(context, R.color.system_primary_fixed_dim), w.d(context, R.color.system_on_primary_fixed), w.d(context, R.color.system_on_primary_fixed_variant), w.d(context, R.color.system_secondary_fixed), w.d(context, R.color.system_secondary_fixed_dim), w.d(context, R.color.system_on_secondary_fixed), w.d(context, R.color.system_on_secondary_fixed_variant), w.d(context, R.color.system_tertiary_fixed), w.d(context, R.color.system_tertiary_fixed_dim), w.d(context, R.color.system_on_tertiary_fixed), w.d(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                } else {
                    e0 c11 = w.c(context);
                    long j24 = c11.f4829y;
                    long j25 = c11.f4826v;
                    long j26 = c11.f4827w;
                    long j27 = c11.B;
                    long j28 = c11.f4828x;
                    long j29 = c11.F;
                    long j30 = c11.C;
                    long j31 = c11.D;
                    long j32 = c11.I;
                    long j33 = c11.M;
                    long j34 = c11.J;
                    long j35 = c11.K;
                    long j36 = c11.P;
                    long j37 = c11.f4808b;
                    long j38 = c11.f4822r;
                    long j39 = c11.g;
                    aVar = j0.b.b(j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j37, j38, j39, c11.f4816l, j24, c11.f4819o, c11.f4810d, c11.f4815k, c11.f4814i, c11.f4825u, j37, c11.f4811e, c11.f4812f, j39, c11.f4809c, c11.f4807a, c11.f4813h, j26, j28, j27, c11.f4830z, j31, c11.E, j32, c11.G, j35, c11.L, j36, c11.N, 62914560, 0);
                }
                i0Var.p(false);
            } else if (z12) {
                i0Var.W(-1617101714);
                i0Var.p(false);
                aVar = f9711a;
            } else {
                i0Var.W(-1617100689);
                i0Var.p(false);
                aVar = f9712b;
            }
            r.b(aVar, null, d.f9714b, dVar, i0Var, 3072);
        } else {
            i0Var.R();
            z12 = z10;
            z13 = z11;
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new Function2(z12, z13, dVar, i3) { // from class: u9.b

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f9708d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f9709e;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ x0.d f9710i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int z14 = h.z(385);
                    c.a(this.f9708d, this.f9709e, this.f9710i, (i0) obj, z14);
                    return Unit.f5554a;
                }
            };
        }
    }
}
