package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class vn0 {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f13457a = BigInteger.ONE;

    /* renamed from: b, reason: collision with root package name */
    private String f13458b = "0";

    public final synchronized String a() {
        String bigInteger;
        bigInteger = this.f13457a.toString();
        this.f13457a = this.f13457a.add(BigInteger.ONE);
        this.f13458b = bigInteger;
        return bigInteger;
    }

    public final synchronized String b() {
        return this.f13458b;
    }
}
