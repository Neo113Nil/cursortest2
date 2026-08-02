package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public class B2 implements ExternalAttribution {

    /* renamed from: a, reason: collision with root package name */
    public final A9 f10081a;

    public B2(A9 a9) {
        this.f10081a = a9;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f10081a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalAttribution(type=`");
        sb.append(K9.a(this.f10081a.f10032a));
        sb.append("`value=`");
        return AbstractC0005f.q(sb, new String(this.f10081a.f10033b, AbstractC1504a.f15936a), "`)");
    }
}
