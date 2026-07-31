package com.appsflyer.internal;

import com.ironsource.InterfaceC1490j3;
import com.ironsource.b9;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
/* loaded from: classes.dex */
public abstract class AFg1gSDK {
    public static final Companion Companion = new Companion(null);
    public static long getCurrencyIso4217Code = System.currentTimeMillis();
    private final boolean shouldExtendMsg;

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void d$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        aFg1gSDK.d(aFg1cSDK, str, z4);
    }

    public static /* synthetic */ void e$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z4, boolean z5, boolean z6, boolean z7, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i4 & 8) != 0) {
            z4 = true;
        }
        if ((i4 & 16) != 0) {
            z5 = true;
        }
        if ((i4 & 32) != 0) {
            z6 = true;
        }
        if ((i4 & 64) != 0) {
            z7 = true;
        }
        aFg1gSDK.e(aFg1cSDK, str, th, z4, z5, z6, z7);
    }

    public static /* synthetic */ void i$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        aFg1gSDK.i(aFg1cSDK, str, z4);
    }

    public static /* synthetic */ void v$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        aFg1gSDK.v(aFg1cSDK, str, z4);
    }

    public static /* synthetic */ void w$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        aFg1gSDK.w(aFg1cSDK, str, z4);
    }

    public void d(AFg1cSDK aFg1cSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
    }

    public void force(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    protected final String getRevenue(String str, AFg1cSDK aFg1cSDK) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        if (str == null || StringsKt.z(str)) {
            str = "null";
        }
        String withTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1cSDK);
        if (!getShouldExtendMsg()) {
            return withTag$SDK_prodRelease;
        }
        return "(" + (System.currentTimeMillis() - getCurrencyIso4217Code) + ") [" + Thread.currentThread().getName() + "] " + withTag$SDK_prodRelease;
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public void i(AFg1cSDK aFg1cSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void v(AFg1cSDK aFg1cSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void w(AFg1cSDK aFg1cSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final String withTag$SDK_prodRelease(String str, AFg1cSDK aFg1cSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        return b9.i.f15550d + aFg1cSDK.getRevenue + "] " + str;
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

    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, z4, false, false, false, InterfaceC1490j3.d.b.f16818j, null);
    }

    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, z4, z5, false, false, 96, null);
    }

    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, z4, z5, z6, false, 64, null);
    }
}
