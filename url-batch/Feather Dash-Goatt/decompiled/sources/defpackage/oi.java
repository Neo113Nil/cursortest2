package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.l;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class oi {
    public static final ke1 a = new ke1(new dd(1));
    public static final ke1 b = new ke1(new dd(2));

    public static mi a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, int i, int i2) {
        return new mi(j, (i & 2) != 0 ? ii.j : j2, (i & 4) != 0 ? ii.z : j3, (i & 8) != 0 ? ii.k : j4, (i & 16) != 0 ? ii.e : j5, j6, (i & 64) != 0 ? ii.n : j7, (i & 128) != 0 ? ii.D : j8, (i & 256) != 0 ? ii.o : j9, j10, (i & 1024) != 0 ? ii.t : j11, (i & 2048) != 0 ? ii.P : j12, (i & 4096) != 0 ? ii.u : j13, (i & 8192) != 0 ? ii.a : j14, (i & 16384) != 0 ? ii.g : j15, (i & 32768) != 0 ? ii.G : j16, (65536 & i) != 0 ? ii.r : j17, (131072 & i) != 0 ? ii.O : j18, (262144 & i) != 0 ? ii.s : j19, (524288 & i) != 0 ? j : j20, (1048576 & i) != 0 ? ii.f : j21, (2097152 & i) != 0 ? ii.d : j22, ii.b, ii.h, ii.c, ii.i, (67108864 & i) != 0 ? ii.x : j23, (134217728 & i) != 0 ? ii.y : j24, (268435456 & i) != 0 ? ii.C : j25, (536870912 & i) != 0 ? ii.H : j26, (i2 & 8) != 0 ? ii.N : j32, (1073741824 & i) != 0 ? ii.I : j27, (i & Integer.MIN_VALUE) != 0 ? ii.J : j28, (i2 & 1) != 0 ? ii.K : j29, (i2 & 2) != 0 ? ii.L : j30, (i2 & 4) != 0 ? ii.M : j31, (i2 & 16) != 0 ? ii.A : j33, (i2 & 32) != 0 ? ii.B : j34, (i2 & 64) != 0 ? ii.l : j35, (i2 & 128) != 0 ? ii.m : j36, (i2 & 256) != 0 ? ii.E : j37, (i2 & 512) != 0 ? ii.F : j38, (i2 & 1024) != 0 ? ii.p : j39, (i2 & 2048) != 0 ? ii.q : j40, (i2 & 4096) != 0 ? ii.Q : j41, (i2 & 8192) != 0 ? ii.R : j42, (i2 & 16384) != 0 ? ii.v : j43, (i2 & 32768) != 0 ? ii.w : j44);
    }

    public static final long b(ni niVar, hl hlVar) {
        mi miVar = (mi) hlVar.j(a);
        switch (niVar.ordinal()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return miVar.n;
            case 1:
                return miVar.w;
            case 2:
                return miVar.y;
            case 3:
                return miVar.v;
            case 4:
                return miVar.e;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return miVar.u;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return miVar.o;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return miVar.x;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                return miVar.z;
            case 9:
                return miVar.b;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return miVar.d;
            case RequestError.STOP_TRACKING /* 11 */:
                return miVar.M;
            case 12:
                return miVar.N;
            case 13:
                return miVar.g;
            case 14:
                return miVar.i;
            case 15:
                return miVar.Q;
            case 16:
                return miVar.R;
            case 17:
                return miVar.q;
            case 18:
                return miVar.s;
            case 19:
                return miVar.k;
            case 20:
                return miVar.m;
            case 21:
                return miVar.U;
            case 22:
                return miVar.V;
            case 23:
                return miVar.A;
            case 24:
                return miVar.B;
            case 25:
                return miVar.a;
            case 26:
                return miVar.c;
            case 27:
                return miVar.K;
            case 28:
                return miVar.L;
            case 29:
                return miVar.C;
            case 30:
                return miVar.f;
            case 31:
                return miVar.h;
            case 32:
                return miVar.O;
            case 33:
                return miVar.P;
            case 34:
                return miVar.p;
            case 35:
                return miVar.D;
            case 36:
                return miVar.F;
            case 37:
                return miVar.G;
            case 38:
                return miVar.H;
            case 39:
                return miVar.I;
            case RequestError.NETWORK_FAILURE /* 40 */:
                return miVar.J;
            case RequestError.NO_DEV_KEY /* 41 */:
                return miVar.E;
            case 42:
                return miVar.t;
            case 43:
                return miVar.r;
            case 44:
                return miVar.j;
            case 45:
                return miVar.l;
            case 46:
                return miVar.S;
            case 47:
                return miVar.T;
            default:
                l.a();
                return 0L;
        }
    }

    public static mi c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, int i, int i2) {
        long j45 = (i & 1) != 0 ? ki.z : j;
        return new mi(j45, (i & 2) != 0 ? ki.j : j2, (i & 4) != 0 ? ki.A : j3, (i & 8) != 0 ? ki.k : j4, (i & 16) != 0 ? ki.e : j5, (i & 32) != 0 ? ki.E : j6, (i & 64) != 0 ? ki.n : j7, (i & 128) != 0 ? ki.F : j8, (i & 256) != 0 ? ki.o : j9, (i & 512) != 0 ? ki.R : j10, (i & 1024) != 0 ? ki.t : j11, (i & 2048) != 0 ? ki.S : j12, (i & 4096) != 0 ? ki.u : j13, (i & 8192) != 0 ? ki.a : j14, (i & 16384) != 0 ? ki.g : j15, (i & 32768) != 0 ? ki.I : j16, (65536 & i) != 0 ? ki.r : j17, (131072 & i) != 0 ? ki.Q : j18, (262144 & i) != 0 ? ki.s : j19, (524288 & i) != 0 ? j45 : j20, (1048576 & i) != 0 ? ki.f : j21, (2097152 & i) != 0 ? ki.d : j22, ki.b, ki.h, ki.c, ki.i, (67108864 & i) != 0 ? ki.x : j23, (134217728 & i) != 0 ? ki.y : j24, (268435456 & i) != 0 ? ki.D : j25, (536870912 & i) != 0 ? ki.J : j26, (i2 & 8) != 0 ? ki.P : j32, (1073741824 & i) != 0 ? ki.K : j27, (i & Integer.MIN_VALUE) != 0 ? ki.L : j28, (i2 & 1) != 0 ? ki.M : j29, (i2 & 2) != 0 ? ki.N : j30, (i2 & 4) != 0 ? ki.O : j31, (i2 & 16) != 0 ? ki.B : j33, (i2 & 32) != 0 ? ki.C : j34, (i2 & 64) != 0 ? ki.l : j35, (i2 & 128) != 0 ? ki.m : j36, (i2 & 256) != 0 ? ki.G : j37, (i2 & 512) != 0 ? ki.H : j38, (i2 & 1024) != 0 ? ki.p : j39, (i2 & 2048) != 0 ? ki.q : j40, (i2 & 4096) != 0 ? ki.T : j41, (i2 & 8192) != 0 ? ki.U : j42, (i2 & 16384) != 0 ? ki.v : j43, (i2 & 32768) != 0 ? ki.w : j44);
    }
}
