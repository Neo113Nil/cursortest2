package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.pi;
import com.chartboost.sdk.impl.si;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ya extends pi {
    public static final a m = new a(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(si name, String message, String adType, String location, Mediation mediation, ci trackAd) {
        super(name, message, adType, location, mediation, pi.b.b, trackAd, false, false, 0L, 0.0f, pi.a.b, 1920, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(trackAd, "trackAd");
        if (n()) {
            a(pi.a.c);
            a(true);
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ya(si siVar, String str, String str2, String str3, Mediation mediation, ci ciVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(siVar, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : mediation, (i & 32) != 0 ? new ci(null, null, null, null, null, null, null, null, 255, null) : ciVar);
    }

    public final boolean n() {
        si f = f();
        return f == si.a.e || f == si.a.f || f == si.i.d || f == si.i.e;
    }
}
