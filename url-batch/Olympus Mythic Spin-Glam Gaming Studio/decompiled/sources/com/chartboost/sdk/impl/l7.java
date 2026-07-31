package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.pi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class l7 extends pi {
    public static final a m = new a(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(si name, String message, String adType, String location, Mediation mediation) {
        super(name, message, adType, location, mediation, pi.b.d, null, false, false, 0L, 0.0f, pi.a.c, 1984, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
    }

    public static final l7 a(si siVar, String str) {
        return m.a(siVar, str);
    }

    public static final class a {
        public final l7 a(si name, String message) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            return new l7(name, message, null, null, null, 28, null);
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ l7(si siVar, String str, String str2, String str3, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(siVar, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : mediation);
    }
}
