package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class N2 implements ExternalAttribution {

    /* renamed from: a, reason: collision with root package name */
    public final V9 f37990a;

    public N2(@NotNull V9 v9) {
        this.f37990a = v9;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    @NotNull
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f37990a);
    }

    @NotNull
    public final String toString() {
        return "ExternalAttribution(type=`" + AbstractC2621fa.a(this.f37990a.f38414a) + "`value=`" + new String(this.f37990a.f38415b, Charsets.UTF_8) + "`)";
    }
}
