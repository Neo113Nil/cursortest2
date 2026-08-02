package io.appmetrica.analytics.impl;

import android.telephony.SubscriptionInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;

/* renamed from: io.appmetrica.analytics.impl.tl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0861tl {

    /* renamed from: a, reason: collision with root package name */
    public static final C0861tl f8380a = new C0861tl();

    private C0861tl() {
    }

    public static final Integer a(SubscriptionInfo subscriptionInfo) {
        String mccString;
        mccString = subscriptionInfo.getMccString();
        return ParseUtils.intValueOf(mccString);
    }

    public static final Integer b(SubscriptionInfo subscriptionInfo) {
        String mncString;
        mncString = subscriptionInfo.getMncString();
        return ParseUtils.intValueOf(mncString);
    }
}
