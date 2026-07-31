package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.UUID;

/* loaded from: classes.dex */
public final class l1 {
    /* JADX WARN: Removed duplicated region for block: B:5:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UUID a(byte[] bArr) {
        k1 k1Var;
        UUID uuid;
        dr2 dr2Var = new dr2(bArr);
        if (dr2Var.l() >= 32) {
            dr2Var.f(0);
            if (dr2Var.m() == dr2Var.i() + 4 && dr2Var.m() == 1886614376) {
                int a7 = q0.a(dr2Var.m());
                if (a7 > 1) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unsupported pssh version: ");
                    sb.append(a7);
                    Log.w("PsshAtomUtil", sb.toString());
                } else {
                    UUID uuid2 = new UUID(dr2Var.z(), dr2Var.z());
                    if (a7 == 1) {
                        dr2Var.g(dr2Var.v() * 16);
                    }
                    int v6 = dr2Var.v();
                    if (v6 == dr2Var.i()) {
                        byte[] bArr2 = new byte[v6];
                        dr2Var.b(bArr2, 0, v6);
                        k1Var = new k1(uuid2, a7, bArr2);
                        if (k1Var != null) {
                            return null;
                        }
                        uuid = k1Var.f7319a;
                        return uuid;
                    }
                }
            }
        }
        k1Var = null;
        if (k1Var != null) {
        }
    }
}
