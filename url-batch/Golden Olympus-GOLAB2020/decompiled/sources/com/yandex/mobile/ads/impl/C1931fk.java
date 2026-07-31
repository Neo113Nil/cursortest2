package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.fk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1931fk implements gc1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2303vj f25822a;

    /* renamed from: b, reason: collision with root package name */
    protected final C2374yl f25823b;

    public C1931fk(lh0 lh0Var, C2374yl c2374yl) {
        this.f25822a = lh0Var;
        this.f25823b = c2374yl;
    }

    @Override // com.yandex.mobile.ads.impl.gc1
    public final lc1 a(op1<?> op1Var) {
        IOException iOException;
        hh0 hh0Var;
        byte[] bArr;
        op1<?> op1Var2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                hh0 a4 = this.f25822a.a(op1Var, ch0.a(op1Var.c()));
                try {
                    int e4 = a4.e();
                    List<ze0> d4 = a4.d();
                    if (e4 == 304) {
                        return tc1.a(op1Var, SystemClock.elapsedRealtime() - elapsedRealtime, d4);
                    }
                    InputStream a5 = a4.a();
                    byte[] a6 = a5 != null ? tc1.a(a5, a4.c(), this.f25823b) : new byte[0];
                    try {
                        tc1.a(SystemClock.elapsedRealtime() - elapsedRealtime, op1Var, a6, e4);
                        if (e4 < 200 || e4 > 299) {
                            throw new IOException();
                        }
                        return new lc1(e4, a6, false, SystemClock.elapsedRealtime() - elapsedRealtime, d4);
                    } catch (IOException e5) {
                        e = e5;
                        op1Var2 = op1Var;
                        hh0Var = a4;
                        bArr = a6;
                        iOException = e;
                        tc1.a(op1Var2, tc1.a(op1Var2, iOException, elapsedRealtime, hh0Var, bArr));
                        op1Var = op1Var2;
                    }
                } catch (IOException e6) {
                    e = e6;
                    bArr = null;
                    hh0Var = a4;
                    op1Var2 = op1Var;
                }
            } catch (IOException e7) {
                iOException = e7;
                hh0Var = null;
                bArr = null;
                op1Var2 = op1Var;
            }
            tc1.a(op1Var2, tc1.a(op1Var2, iOException, elapsedRealtime, hh0Var, bArr));
            op1Var = op1Var2;
        }
    }
}
