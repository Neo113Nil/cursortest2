package io.appmetrica.analytics.impl;

import android.telephony.SubscriptionInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;

/* renamed from: io.appmetrica.analytics.impl.pl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0880pl {

    /* renamed from: a, reason: collision with root package name */
    public static final C0880pl f12591a = new C0880pl();

    private C0880pl() {
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
