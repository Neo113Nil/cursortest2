package com.baidu.bbalbscesium.k.d;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f4147a;

    /* renamed from: b, reason: collision with root package name */
    private BigInteger f4148b;

    public e(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f4147a = bigInteger;
        this.f4148b = bigInteger2;
    }

    @Override // com.baidu.bbalbscesium.k.d.d
    public BigInteger a() {
        return this.f4147a;
    }

    @Override // com.baidu.bbalbscesium.k.d.d
    public BigInteger b() {
        return this.f4148b;
    }

    public e(byte[] bArr, byte[] bArr2) {
        this.f4147a = new BigInteger(bArr);
        this.f4148b = new BigInteger(bArr2);
    }
}
