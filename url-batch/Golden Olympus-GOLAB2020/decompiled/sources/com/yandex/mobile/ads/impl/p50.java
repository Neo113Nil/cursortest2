package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class p50 extends hy1 {
    @Override // com.yandex.mobile.ads.impl.hy1
    protected final wz0 a(zz0 zz0Var, ByteBuffer byteBuffer) {
        sf1 sf1Var = new sf1(byteBuffer.limit(), byteBuffer.array());
        String q4 = sf1Var.q();
        q4.getClass();
        String q5 = sf1Var.q();
        q5.getClass();
        return new wz0(new o50(q4, q5, sf1Var.p(), sf1Var.p(), Arrays.copyOfRange(sf1Var.c(), sf1Var.d(), sf1Var.e())));
    }
}
