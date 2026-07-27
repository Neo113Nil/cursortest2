package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

@Metadata
/* loaded from: classes.dex */
public abstract class AFg1fSDK {
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);
    public static long values = System.currentTimeMillis();
    private final boolean AFInAppEventParameterName;

    @Metadata
    public static final class AFa1tSDK {
        private AFa1tSDK() {
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void d$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, boolean z4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i2 & 4) != 0) {
            z4 = true;
        }
        aFg1fSDK.d(aFg1aSDK, str, z4);
    }

    public static /* synthetic */ void e$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z4, boolean z5, boolean z6, boolean z7, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        aFg1fSDK.e(aFg1aSDK, str, th, (i2 & 8) != 0 ? true : z4, (i2 & 16) != 0 ? true : z5, (i2 & 32) != 0 ? true : z6, (i2 & 64) != 0 ? true : z7);
    }

    public static /* synthetic */ void i$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, boolean z4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i2 & 4) != 0) {
            z4 = true;
        }
        aFg1fSDK.i(aFg1aSDK, str, z4);
    }

    public static /* synthetic */ void v$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, boolean z4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i2 & 4) != 0) {
            z4 = true;
        }
        aFg1fSDK.v(aFg1aSDK, str, z4);
    }

    public static /* synthetic */ void w$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, boolean z4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i2 & 4) != 0) {
            z4 = true;
        }
        aFg1fSDK.w(aFg1aSDK, str, z4);
    }

    public final void d(AFg1aSDK aFg1aSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFg1aSDK, str, false, 4, null);
    }

    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1aSDK, str, th, false, false, false, false, 120, null);
    }

    public void force(AFg1aSDK aFg1aSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public boolean getShouldExtendMsg() {
        return this.AFInAppEventParameterName;
    }

    public final void i(AFg1aSDK aFg1aSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFg1aSDK, str, false, 4, null);
    }

    public final void v(AFg1aSDK aFg1aSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFg1aSDK, str, false, 4, null);
    }

    public final String values(String str, AFg1aSDK aFg1aSDK) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        if (str == null || y.x(str)) {
            str = "null";
        }
        String withTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1aSDK);
        if (!getShouldExtendMsg()) {
            return withTag$SDK_prodRelease;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.currentTimeMillis() - values);
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(withTag$SDK_prodRelease);
        return sb.toString();
    }

    public final void w(AFg1aSDK aFg1aSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFg1aSDK, str, false, 4, null);
    }

    public final String withTag$SDK_prodRelease(String str, AFg1aSDK aFg1aSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        StringBuilder sb = new StringBuilder("[");
        sb.append(aFg1aSDK.AFInAppEventParameterName);
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    public void d(AFg1aSDK aFg1aSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1aSDK, str, th, z4, false, false, false, 112, null);
    }

    public void i(AFg1aSDK aFg1aSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void v(AFg1aSDK aFg1aSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void w(AFg1aSDK aFg1aSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1aSDK, str, th, z4, z5, false, false, 96, null);
    }

    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1aSDK, str, th, z4, z5, z6, false, 64, null);
    }

    public void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
    }
}
