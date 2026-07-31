package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class hc {

    /* renamed from: a, reason: collision with root package name */
    static bd3 f6177a;

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0033, code lost:
    
        if (r0 != null) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean a(gc gcVar) {
        Method j7;
        bd3 a7;
        if (f6177a != null) {
            return true;
        }
        String str = (String) sw.c().b(m10.W1);
        if (str == null || str.length() == 0) {
            str = null;
            if (gcVar != null && (j7 = gcVar.j("PDJGtr7hH5z8kziZtOwKBHfUklGaxsnuMOcaf4/XJNQXH5uqgOnO+ZxxlrN1G5R2", "8jFByxLLStK1ZA6Q/SQPKITUmXlRJfaQf0bJ+6rt27M=")) != null) {
                str = (String) j7.invoke(null, new Object[0]);
            }
        }
        try {
            md3 a8 = qd3.a(q9.b(str, true));
            for (wk3 wk3Var : dg3.f4220a.H()) {
                if (wk3Var.J().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                }
                if (wk3Var.I().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
                if (wk3Var.H().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
                if (!wk3Var.H().equals("TinkAead") && !wk3Var.H().equals("TinkMac") && !wk3Var.H().equals("TinkHybridDecrypt") && !wk3Var.H().equals("TinkHybridEncrypt") && !wk3Var.H().equals("TinkPublicKeySign") && !wk3Var.H().equals("TinkPublicKeyVerify") && !wk3Var.H().equals("TinkStreamingAead") && !wk3Var.H().equals("TinkDeterministicAead")) {
                    xc3<?> a9 = ee3.a(wk3Var.H());
                    ee3.n(a9.zza());
                    wk3Var.J();
                    wk3Var.I();
                    wk3Var.F();
                    ee3.l(a9.a(), wk3Var.K());
                }
            }
            a7 = hg3.a(a8);
            f6177a = a7;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
        return a7 != null;
    }
}
