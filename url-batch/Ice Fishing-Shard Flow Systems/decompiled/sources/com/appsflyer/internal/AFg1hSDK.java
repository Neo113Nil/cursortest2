package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
/* loaded from: classes.dex */
public abstract class AFg1hSDK {
    public static final Companion Companion = new Companion(null);
    public static long getRevenue = System.currentTimeMillis();
    private final boolean shouldExtendMsg;

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void d$default(AFg1hSDK aFg1hSDK, AFg1cSDK aFg1cSDK, String str, boolean z7, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i2 & 4) != 0) {
            z7 = true;
        }
        aFg1hSDK.d(aFg1cSDK, str, z7);
    }

    public static /* synthetic */ void e$default(AFg1hSDK aFg1hSDK, AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z7, boolean z8, boolean z9, boolean z10, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i2 & 8) != 0) {
            z7 = true;
        }
        if ((i2 & 16) != 0) {
            z8 = true;
        }
        if ((i2 & 32) != 0) {
            z9 = true;
        }
        if ((i2 & 64) != 0) {
            z10 = true;
        }
        aFg1hSDK.e(aFg1cSDK, str, th, z7, z8, z9, z10);
    }

    public static /* synthetic */ void i$default(AFg1hSDK aFg1hSDK, AFg1cSDK aFg1cSDK, String str, boolean z7, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i2 & 4) != 0) {
            z7 = true;
        }
        aFg1hSDK.i(aFg1cSDK, str, z7);
    }

    public static /* synthetic */ void v$default(AFg1hSDK aFg1hSDK, AFg1cSDK aFg1cSDK, String str, boolean z7, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i2 & 4) != 0) {
            z7 = true;
        }
        aFg1hSDK.v(aFg1cSDK, str, z7);
    }

    public static /* synthetic */ void w$default(AFg1hSDK aFg1hSDK, AFg1cSDK aFg1cSDK, String str, boolean z7, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i2 & 4) != 0) {
            z7 = true;
        }
        aFg1hSDK.w(aFg1cSDK, str, z7);
    }

    public void d(AFg1cSDK aFg1cSDK, String str, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z7, boolean z8, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
    }

    public void force(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final String getMonetizationNetwork(String str, AFg1cSDK aFg1cSDK) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        if (str == null || StringsKt.z(str)) {
            str = "null";
        }
        String withTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1cSDK);
        if (!getShouldExtendMsg()) {
            return withTag$SDK_prodRelease;
        }
        long currentTimeMillis = System.currentTimeMillis() - getRevenue;
        String name = Thread.currentThread().getName();
        StringBuilder sb = new StringBuilder("(");
        sb.append(currentTimeMillis);
        sb.append(") [");
        sb.append(name);
        return r4.f.f(sb, "] ", withTag$SDK_prodRelease);
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public void i(AFg1cSDK aFg1cSDK, String str, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void v(AFg1cSDK aFg1cSDK, String str, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void w(AFg1cSDK aFg1cSDK, String str, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final String withTag$SDK_prodRelease(String str, AFg1cSDK aFg1cSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        return "[" + aFg1cSDK.getCurrencyIso4217Code + "] " + str;
    }

    public final void d(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFg1cSDK, str, false, 4, null);
    }

    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, false, false, false, false, 120, null);
    }

    public final void i(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFg1cSDK, str, false, 4, null);
    }

    public final void v(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFg1cSDK, str, false, 4, null);
    }

    public final void w(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFg1cSDK, str, false, 4, null);
    }

    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, z7, false, false, false, 112, null);
    }

    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, z7, z8, false, false, 96, null);
    }

    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z7, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, z7, z8, z9, false, 64, null);
    }
}
