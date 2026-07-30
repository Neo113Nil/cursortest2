package defpackage;

import com.appsflyer.attribution.RequestError;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.Utility;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class hw {
    public static final bp2 a = new bp2(k8.x);
    public static final bp2 b = new bp2(k8.y);

    public static final long a(gw gwVar, long j) {
        long j2 = gwVar.a;
        long j3 = gwVar.q;
        if (aw.c(j, j2)) {
            return gwVar.b;
        }
        if (aw.c(j, gwVar.f)) {
            return gwVar.g;
        }
        if (aw.c(j, gwVar.j)) {
            return gwVar.k;
        }
        if (aw.c(j, gwVar.n)) {
            return gwVar.o;
        }
        if (aw.c(j, gwVar.w)) {
            return gwVar.x;
        }
        if (aw.c(j, gwVar.c)) {
            return gwVar.d;
        }
        if (aw.c(j, gwVar.h)) {
            return gwVar.i;
        }
        if (aw.c(j, gwVar.l)) {
            return gwVar.m;
        }
        if (aw.c(j, gwVar.y)) {
            return gwVar.z;
        }
        if (aw.c(j, gwVar.u)) {
            return gwVar.v;
        }
        if (aw.c(j, gwVar.p)) {
            return j3;
        }
        if (aw.c(j, gwVar.r)) {
            return gwVar.s;
        }
        if (aw.c(j, gwVar.D)) {
            return j3;
        }
        if (aw.c(j, gwVar.F)) {
            return j3;
        }
        if (aw.c(j, gwVar.G)) {
            return j3;
        }
        if (aw.c(j, gwVar.H)) {
            return j3;
        }
        if (aw.c(j, gwVar.I)) {
            return j3;
        }
        if (aw.c(j, gwVar.J)) {
            return j3;
        }
        int i = aw.h;
        return aw.g;
    }

    public static final long b(long j, a00 a00Var) {
        a00Var.X(-1680936624);
        long a2 = a((gw) a00Var.j(a), j);
        if (a2 == 16) {
            a2 = ((aw) a00Var.j(e20.a)).a;
        }
        a00Var.q(false);
        return a2;
    }

    public static final long c(gw gwVar, int i) {
        switch (q40.u(i)) {
            case 0:
                return gwVar.n;
            case 1:
                return gwVar.w;
            case 2:
                return gwVar.y;
            case 3:
                return gwVar.v;
            case 4:
                return gwVar.e;
            case 5:
                return gwVar.u;
            case 6:
                return gwVar.o;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return gwVar.x;
            case 8:
                return gwVar.z;
            case 9:
                return gwVar.b;
            case 10:
                return gwVar.d;
            case 11:
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
            case 15:
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                return aw.g;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return gwVar.g;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return gwVar.i;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                return gwVar.q;
            case 18:
                return gwVar.s;
            case 19:
                return gwVar.k;
            case 20:
                return gwVar.m;
            case 23:
                return gwVar.A;
            case 24:
                return gwVar.B;
            case Constants.MAX_TREE_DEPTH /* 25 */:
                return gwVar.a;
            case 26:
                return gwVar.c;
            case 29:
                return gwVar.C;
            case 30:
                return gwVar.f;
            case 31:
                return gwVar.h;
            case 34:
                return gwVar.p;
            case 35:
                return gwVar.D;
            case 36:
                return gwVar.F;
            case 37:
                return gwVar.G;
            case 38:
                return gwVar.H;
            case 39:
                return gwVar.I;
            case RequestError.NETWORK_FAILURE /* 40 */:
                return gwVar.J;
            case RequestError.NO_DEV_KEY /* 41 */:
                return gwVar.E;
            case 42:
                return gwVar.t;
            case 43:
                return gwVar.r;
            case 44:
                return gwVar.j;
            case 45:
                return gwVar.l;
        }
    }

    public static final long d(int i, a00 a00Var) {
        return c((gw) a00Var.j(a), i);
    }

    public static gw e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, int i) {
        long j23 = (i & 1) != 0 ? dw.t : j;
        return new gw(j23, (i & 2) != 0 ? dw.j : j2, (i & 4) != 0 ? dw.u : j3, (i & 8) != 0 ? dw.k : j4, dw.e, (i & 32) != 0 ? dw.w : j5, (i & 64) != 0 ? dw.l : j6, (i & 128) != 0 ? dw.x : j7, (i & 256) != 0 ? dw.m : j8, (i & 512) != 0 ? dw.H : j9, (i & 1024) != 0 ? dw.p : j10, dw.I, dw.q, (i & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? dw.a : j11, (i & 16384) != 0 ? dw.g : j12, (32768 & i) != 0 ? dw.y : j13, (65536 & i) != 0 ? dw.n : j14, (131072 & i) != 0 ? dw.G : j15, (262144 & i) != 0 ? dw.o : j16, j23, dw.f, dw.d, (4194304 & i) != 0 ? dw.b : j17, (8388608 & i) != 0 ? dw.h : j18, (16777216 & i) != 0 ? dw.c : j19, (33554432 & i) != 0 ? dw.i : j20, (67108864 & i) != 0 ? dw.r : j21, (i & 134217728) != 0 ? dw.s : j22, dw.v, dw.z, dw.F, dw.A, dw.B, dw.C, dw.D, dw.E);
    }
}
