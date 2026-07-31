package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.pi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class s5 extends pi {
    public static final a m = new a(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(si name, String message, String adType, String location, Mediation mediation, ci trackAd) {
        super(name, message, adType, location, mediation, pi.b.c, trackAd, false, false, 0L, 0.0f, pi.a.c, 1920, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(trackAd, "trackAd");
    }

    public static final s5 a(si siVar, String str) {
        return m.a(siVar, str);
    }

    public static final s5 a(si siVar, String str, String str2, String str3) {
        return m.a(siVar, str, str2, str3);
    }

    public static final class a {
        public final s5 a(si name, String message) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            return new s5(name, message, null, null, null, null, 60, null);
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s5 a(si name, String message, String adType, String location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(location, "location");
            return new s5(name, message, adType, location, null, null, 48, null);
        }
    }

    public /* synthetic */ s5(si siVar, String str, String str2, String str3, Mediation mediation, ci ciVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(siVar, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : mediation, (i & 32) != 0 ? new ci(null, null, null, null, null, null, null, null, 255, null) : ciVar);
    }
}
