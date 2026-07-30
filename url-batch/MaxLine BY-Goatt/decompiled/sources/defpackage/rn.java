package defpackage;

import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class rn {
    static {
        ap.g(40.0f, 40.0f);
    }

    public static final void a(String str, Function1 function1, vl1 vl1Var, boolean z, pw2 pw2Var, g81 g81Var, f81 f81Var, boolean z2, int i, int i2, ch2 ch2Var, Function1 function12, bn1 bn1Var, nn2 nn2Var, my myVar, a00 a00Var, int i3) {
        Function1 function13;
        int i4;
        Function1 function14;
        a00Var.Z(945255183);
        int i5 = i3 | (a00Var.f(str) ? 4 : 2) | (a00Var.h(function1) ? 32 : 16) | (a00Var.f(vl1Var) ? 256 : 128) | (a00Var.g(z) ? 2048 : 1024);
        boolean g = a00Var.g(false);
        int i6 = Utility.DEFAULT_STREAM_BUFFER_SIZE;
        int i7 = i5 | (g ? 16384 : 8192) | (a00Var.f(pw2Var) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) | (a00Var.f(g81Var) ? 1048576 : 524288) | (a00Var.f(f81Var) ? 8388608 : 4194304) | (a00Var.g(z2) ? 67108864 : 33554432) | (a00Var.d(i) ? 536870912 : 268435456);
        int i8 = 196608 | (a00Var.d(i2) ? 4 : 2) | (a00Var.f(ch2Var) ? 32 : 16) | 384 | (a00Var.f(bn1Var) ? 2048 : 1024);
        if (a00Var.f(nn2Var)) {
            i6 = 16384;
        }
        int i9 = i8 | i6;
        if ((306783379 & i7) == 306783378 && (i9 & 74899) == 74898 && a00Var.B()) {
            a00Var.S();
            function14 = function12;
        } else {
            a00Var.U();
            if ((i3 & 1) == 0 || a00Var.z()) {
                function13 = o3.z;
            } else {
                a00Var.S();
                function13 = function12;
            }
            a00Var.r();
            Object M = a00Var.M();
            Object obj = sz.a;
            if (M == obj) {
                M = ij2.j(new nv2(str, 6, 0L));
                a00Var.i0(M);
            }
            zn1 zn1Var = (zn1) M;
            nv2 nv2Var = (nv2) zn1Var.getValue();
            nv2 nv2Var2 = new nv2(new yd(str), nv2Var.b, nv2Var.c);
            boolean f = a00Var.f(nv2Var2);
            Object M2 = a00Var.M();
            if (f || M2 == obj) {
                i4 = 4;
                M2 = new k7(4, nv2Var2, zn1Var);
                a00Var.i0(M2);
            } else {
                i4 = 4;
            }
            l41.m((Function0) M2, a00Var);
            boolean z3 = (i7 & 14) == i4;
            Object M3 = a00Var.M();
            if (z3 || M3 == obj) {
                M3 = ij2.j(str);
                a00Var.i0(M3);
            }
            Object obj2 = (zn1) M3;
            g81Var.getClass();
            int i10 = g81Var.a;
            h81 h81Var = new h81(i10);
            if (i10 == 0) {
                h81Var = null;
            }
            c11 c11Var = new c11(z2, 0, true, h81Var != null ? h81Var.a : 1, 1, sf1.o);
            boolean z4 = !z2;
            function14 = function13;
            int i11 = z2 ? 1 : i2;
            int i12 = z2 ? 1 : i;
            boolean f2 = ((i7 & 112) == 32) | a00Var.f(obj2);
            Object M4 = a00Var.M();
            if (f2 || M4 == obj) {
                M4 = new oc(function1, zn1Var, obj2, 1);
                a00Var.i0(M4);
            }
            int i13 = i9 << 9;
            s93.h(nv2Var2, (Function1) M4, vl1Var, pw2Var, ch2Var, function14, bn1Var, nn2Var, z4, i12, i11, c11Var, f81Var, z, myVar, a00Var, (i7 & 896) | ((i7 >> 6) & 7168) | (i13 & 57344) | 196608 | (3670016 & i13) | (i13 & 29360128), ((i7 >> 15) & 896) | (i7 & 7168) | (i7 & 57344) | 196608);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new qn(str, function1, vl1Var, z, pw2Var, g81Var, f81Var, z2, i, i2, ch2Var, function14, bn1Var, nn2Var, myVar, i3);
        }
    }
}
