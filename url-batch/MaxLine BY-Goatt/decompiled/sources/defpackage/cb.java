package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.internal.Utility;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class cb {
    public static final r00 a = new r00(k8.t);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(o32 o32Var, Function0 function0, p32 p32Var, my myVar, a00 a00Var, int i, int i2) {
        int i3;
        Function0 function02;
        p32 p32Var2;
        int i4;
        Function0 function03;
        n72 s;
        String str;
        boolean z;
        Object obj;
        m32 m32Var;
        int i5;
        u81 u81Var;
        o32 o32Var2 = o32Var;
        a00Var.Z(-1772091631);
        int i6 = 2;
        if ((i & 6) == 0) {
            i3 = (a00Var.f(o32Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i3 |= a00Var.h(function02) ? 32 : 16;
            if ((i & 384) != 0) {
                p32Var2 = p32Var;
                i3 |= a00Var.f(p32Var2) ? 256 : 128;
            } else {
                p32Var2 = p32Var;
            }
            if ((i & 3072) == 0) {
                i3 |= a00Var.h(myVar) ? 2048 : 1024;
            }
            i4 = i3;
            if (a00Var.P(i4 & 1, (i4 & 1171) == 1170)) {
                a00Var.S();
                function03 = function02;
            } else {
                Function0 function04 = i7 != 0 ? null : function02;
                View view = (View) a00Var.j(AndroidCompositionLocals_androidKt.f);
                ca0 ca0Var = (ca0) a00Var.j(p00.h);
                String str2 = (String) a00Var.j(a);
                u81 u81Var2 = (u81) a00Var.j(p00.n);
                xz S = iv1.S(a00Var);
                zn1 k = ij2.k(myVar, a00Var);
                Object[] objArr = new Object[0];
                Object M = a00Var.M();
                Object obj2 = sz.a;
                if (M == obj2) {
                    M = k8.u;
                    a00Var.i0(M);
                }
                UUID uuid = (UUID) ll3.R(objArr, (Function0) M, a00Var, 48);
                Object M2 = a00Var.M();
                if (M2 == obj2) {
                    str = str2;
                    m32 m32Var2 = new m32(function04, p32Var2, str, view, ca0Var, o32Var2, uuid);
                    o32Var2 = o32Var2;
                    z = true;
                    m32Var2.i(S, new my(-297523940, new n8(i6, m32Var2, k), true));
                    a00Var.i0(m32Var2);
                    obj = m32Var2;
                } else {
                    str = str2;
                    z = true;
                    obj = M2;
                }
                m32 m32Var3 = (m32) obj;
                int i8 = i4 & 112;
                int i9 = i4 & 896;
                boolean h = a00Var.h(m32Var3) | (i8 == 32 ? z : false) | (i9 == 256 ? z : false) | a00Var.f(str) | a00Var.d(u81Var2.ordinal());
                Object M3 = a00Var.M();
                if (h || M3 == obj2) {
                    m32Var = m32Var3;
                    i5 = i4;
                    Object aaVar = new aa(m32Var, function04, p32Var, str, u81Var2, 1);
                    a00Var.i0(aaVar);
                    M3 = aaVar;
                } else {
                    m32Var = m32Var3;
                    i5 = i4;
                }
                l41.f(m32Var, (Function1) M3, a00Var);
                boolean h2 = a00Var.h(m32Var) | (i8 == 32 ? z : false) | (i9 == 256 ? z : false) | a00Var.f(str) | a00Var.d(u81Var2.ordinal());
                Object M4 = a00Var.M();
                if (h2 || M4 == obj2) {
                    Object waVar = new wa(m32Var, function04, p32Var, str, u81Var2);
                    u81Var = u81Var2;
                    a00Var.i0(waVar);
                    M4 = waVar;
                } else {
                    u81Var = u81Var2;
                }
                l41.m((Function0) M4, a00Var);
                int i10 = 4;
                boolean h3 = ((i5 & 14) == 4 ? z : false) | a00Var.h(m32Var);
                Object M5 = a00Var.M();
                if (h3 || M5 == obj2) {
                    M5 = new p8(i10, m32Var, o32Var2);
                    a00Var.i0(M5);
                }
                l41.f(o32Var2, (Function1) M5, a00Var);
                boolean h4 = a00Var.h(m32Var);
                Object M6 = a00Var.M();
                if (h4 || M6 == obj2) {
                    M6 = new v(6, null, m32Var);
                    a00Var.i0(M6);
                }
                l41.h(a00Var, m32Var, (Function2) M6);
                boolean h5 = a00Var.h(m32Var);
                Object M7 = a00Var.M();
                if (h5 || M7 == obj2) {
                    M7 = new ya(m32Var, 0);
                    a00Var.i0(M7);
                }
                vl1 d = a.d(sl1.a, (Function1) M7);
                boolean h6 = a00Var.h(m32Var) | a00Var.d(u81Var.ordinal());
                Object M8 = a00Var.M();
                if (h6 || M8 == obj2) {
                    M8 = new za(m32Var, u81Var);
                    a00Var.i0(M8);
                }
                oj1 oj1Var = (oj1) M8;
                int hashCode = Long.hashCode(a00Var.T);
                v02 l = a00Var.l();
                vl1 E = bd3.E(a00Var, d);
                pz.b.getClass();
                Function0 function05 = oz.b;
                a00Var.b0();
                if (a00Var.S) {
                    a00Var.k(function05);
                } else {
                    a00Var.l0();
                }
                uj2.e(a00Var, oj1Var, oz.f);
                uj2.e(a00Var, l, oz.e);
                sc scVar = oz.g;
                if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(hashCode))) {
                    q40.r(hashCode, a00Var, hashCode, scVar);
                }
                uj2.e(a00Var, E, oz.d);
                a00Var.q(z);
                function03 = function04;
            }
            s = a00Var.s();
            if (s == null) {
                s.d = new ab(o32Var2, function03, p32Var, myVar, i, i2);
                return;
            }
            return;
        }
        function02 = function0;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        i4 = i3;
        if (a00Var.P(i4 & 1, (i4 & 1171) == 1170)) {
        }
        s = a00Var.s();
        if (s == null) {
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & Utility.DEFAULT_STREAM_BUFFER_SIZE) == 0) ? false : true;
    }
}
