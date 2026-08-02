package com.squareup.protos.cash.aegis.sync_values;

import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum SponsorshipTier implements WireEnum {
    MANAGED_ACCOUNT(1),
    TEEN(2),
    AGENT(3);

    public final int value;
    public static final WorkCookieJar Companion = new WorkCookieJar(15);
    public static final SponsorshipTier$Companion$ADAPTER$1 ADAPTER = new SponsorshipTier$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SponsorshipTier.class), Syntax.PROTO_2, null);

    SponsorshipTier(int i) {
        this.value = i;
    }

    public static final SponsorshipTier fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return MANAGED_ACCOUNT;
        }
        if (i == 2) {
            return TEEN;
        }
        if (i != 3) {
            return null;
        }
        return AGENT;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
