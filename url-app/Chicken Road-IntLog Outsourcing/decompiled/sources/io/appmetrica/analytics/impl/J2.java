package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public class J2 implements ExternalAttribution {

    /* renamed from: a, reason: collision with root package name */
    public final H9 f6997a;

    public J2(H9 h9) {
        this.f6997a = h9;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f6997a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalAttribution(type=`");
        sb.append(R9.a(this.f6997a.f6866a));
        sb.append("`value=`");
        return AbstractC0279e.h(sb, new String(this.f6997a.f6867b, B4.a.f287a), "`)");
    }
}
