package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class k30 {
    public static final p32 a;
    public static final y20 b;

    static {
        a = new p32((14 & 1) == 0, jg2.m, true);
        long j = aw.c;
        long j2 = aw.b;
        b = new y20(j, j2, j2, aw.b(j2, 0.38f), aw.b(j2, 0.38f));
    }

    public static final void a(y20 y20Var, my myVar, a00 a00Var, int i) {
        a00Var.Z(-921259293);
        int i2 = (a00Var.f(y20Var) ? 4 : 2) | i;
        vl1 vl1Var = sl1.a;
        if (((i2 | (a00Var.f(vl1Var) ? 32 : 16)) & 147) == 146 && a00Var.B()) {
            a00Var.S();
        } else {
            zn znVar = c30.a;
            yb2 a2 = zb2.a(4.0f);
            boolean z = Float.compare(3.0f, 0.0f) > 0;
            long j = gw0.a;
            if (Float.compare(3.0f, 0.0f) > 0 || z) {
                vl1Var = new ShadowGraphicsLayerElement(a2, z, j, j);
            }
            vl1 T = s03.T(a.j(a.l(androidx.compose.foundation.a.b(vl1Var, y20Var.a, ap.e)), 0.0f, c30.d, 1), s03.G(a00Var));
            qw a3 = ow.a(s93.c, qb2.A, a00Var, 0);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, T);
            pz.b.getClass();
            Function0 function0 = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(function0);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, a3, oz.f);
            uj2.e(a00Var, l, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            myVar.a(rw.a, a00Var, 54);
            a00Var.q(true);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new n8(i, 6, y20Var, myVar);
        }
    }

    public static final void b(String str, boolean z, y20 y20Var, Function0 function0, a00 a00Var, int i) {
        int i2;
        a00Var.Z(791018367);
        if ((i & 6) == 0) {
            i2 = (a00Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= a00Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= a00Var.f(y20Var) ? 256 : 128;
        }
        int i3 = i & 3072;
        sl1 sl1Var = sl1.a;
        if (i3 == 0) {
            i2 |= a00Var.f(sl1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= a00Var.h(null) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= a00Var.h(function0) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        }
        if ((74899 & i2) == 74898 && a00Var.B()) {
            a00Var.S();
        } else {
            zn znVar = c30.a;
            float f = c30.c;
            yh yhVar = new yh(f, true, sc.o);
            boolean z2 = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object M = a00Var.M();
            if (z2 || M == sz.a) {
                M = new h30(function0, z);
                a00Var.i0(M);
            }
            vl1 j = a.j(b.j(b.c(androidx.compose.foundation.a.e(4, sl1Var, str, (Function0) M, z), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            fc2 a2 = ec2.a(yhVar, znVar, a00Var, 54);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, j);
            pz.b.getClass();
            Function0 function02 = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(function02);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, a2, oz.f);
            uj2.e(a00Var, l, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            a00Var.X(554568909);
            a00Var.q(false);
            long j2 = z ? y20Var.b : y20Var.d;
            ll3.a(str, new LayoutWeightElement(1.0f, true), new pw2(j2, c30.e, c30.f, null, c30.h, c30.b, c30.g, 16613240), 0, false, 1, 0, a00Var, (i2 & 14) | 1572864, 440);
            a00Var.q(true);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new i30(str, z, y20Var, function0, i);
        }
    }

    public static final void c(o32 o32Var, Function0 function0, y20 y20Var, ih2 ih2Var, a00 a00Var, int i) {
        int i2;
        Function0 function02;
        a00 a00Var2;
        o32 o32Var2;
        a00Var.Z(1447189339);
        if ((i & 6) == 0) {
            i2 = (a00Var.f(o32Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= a00Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= a00Var.f(sl1.a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= a00Var.f(y20Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= a00Var.h(ih2Var) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE;
        }
        if ((i2 & 9363) == 9362 && a00Var.B()) {
            a00Var.S();
            function02 = function0;
            a00Var2 = a00Var;
            o32Var2 = o32Var;
        } else {
            function02 = function0;
            a00Var2 = a00Var;
            cb.a(o32Var, function02, a, yj1.H(795909757, new n8(y20Var, ih2Var), a00Var), a00Var2, (i2 & 14) | 3456 | (i2 & 112), 0);
            o32Var2 = o32Var;
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new d6(o32Var2, function02, y20Var, ih2Var, i);
        }
    }

    public static final void d(o32 o32Var, Function0 function0, ih2 ih2Var, a00 a00Var, int i) {
        int i2;
        a00Var.Z(712057293);
        if ((i & 6) == 0) {
            i2 = (a00Var.f(o32Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= a00Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= a00Var.f(sl1.a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= a00Var.h(ih2Var) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && a00Var.B()) {
            a00Var.S();
        } else {
            Context context = (Context) a00Var.j(AndroidCompositionLocals_androidKt.b);
            boolean f = a00Var.f((Configuration) a00Var.j(AndroidCompositionLocals_androidKt.a)) | a00Var.f(context);
            Object M = a00Var.M();
            if (f || M == sz.a) {
                y20 y20Var = b;
                long j = y20Var.a;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int H = ap.H(j);
                int color = obtainStyledAttributes.getColor(0, H);
                obtainStyledAttributes.recycle();
                if (color != H) {
                    j = ap.c(color);
                }
                long j2 = j;
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
                obtainStyledAttributes2.recycle();
                long j3 = y20Var.b;
                int H2 = ap.H(j3);
                Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, H2)) : null;
                if (valueOf != null && valueOf.intValue() != H2) {
                    j3 = ap.c(valueOf.intValue());
                }
                long j4 = j3;
                long j5 = y20Var.d;
                int H3 = ap.H(j5);
                Integer valueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, H3)) : null;
                if (valueOf2 != null && valueOf2.intValue() != H3) {
                    j5 = ap.c(valueOf2.intValue());
                }
                long j6 = j5;
                Object y20Var2 = new y20(j2, j4, j4, j6, j6);
                a00Var.i0(y20Var2);
                M = y20Var2;
            }
            c(o32Var, function0, (y20) M, ih2Var, a00Var, (i2 & 1022) | ((i2 << 3) & 57344));
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new i9(o32Var, function0, ih2Var, i);
        }
    }
}
