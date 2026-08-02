package io.appmetrica.analytics.impl;

import E1.AbstractC0033i;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public class J2 implements ExternalAttribution {

    /* renamed from: a, reason: collision with root package name */
    public final H9 f6195a;

    public J2(H9 h9) {
        this.f6195a = h9;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f6195a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalAttribution(type=`");
        sb.append(R9.a(this.f6195a.f6072a));
        sb.append("`value=`");
        return AbstractC0033i.m(sb, new String(this.f6195a.f6073b, s2.a.f10316a), "`)");
    }
}
