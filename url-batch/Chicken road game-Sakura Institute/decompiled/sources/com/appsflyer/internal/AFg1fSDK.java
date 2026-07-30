package com.appsflyer.internal;

import androidx.compose.material3.MenuKt;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0017\b&\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJO\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0014\u0010\nJ)\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0015\u0010\nJ)\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0016\u0010\nJ\u001d\u0010\u0018\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0002H\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/appsflyer/internal/AFg1fSDK;", "", "Lcom/appsflyer/internal/AFg1aSDK;", "tag", "", NotificationCompat.CATEGORY_MESSAGE, "", "shouldRemoteDebug", "", "d", "(Lcom/appsflyer/internal/AFg1aSDK;Ljava/lang/String;Z)V", "", "throwable", "printMsg", "printThrowable", "shouldReportToExManager", "e", "(Lcom/appsflyer/internal/AFg1aSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1aSDK;Ljava/lang/String;)V", "i", "v", "w", "p0", "values", "(Ljava/lang/String;Lcom/appsflyer/internal/AFg1aSDK;)Ljava/lang/String;", "withTag$SDK_prodRelease", "AFInAppEventParameterName", "Z", "getShouldExtendMsg", "()Z", "shouldExtendMsg", "<init>", "()V", "AFa1tSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AFg1fSDK {
    public static long values = System.currentTimeMillis();

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    private final boolean shouldExtendMsg;

    public final void d(AFg1aSDK aFg1aSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFg1aSDK, str, false, 4, null);
    }

    public void d(AFg1aSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1aSDK, str, th, false, false, false, false, MenuKt.InTransitionDuration, null);
    }

    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1aSDK, str, th, z, false, false, false, 112, null);
    }

    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1aSDK, str, th, z, z2, false, false, 96, null);
    }

    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1aSDK, str, th, z, z2, z3, false, 64, null);
    }

    public void e(AFg1aSDK tag, String msg, Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
    }

    public void force(AFg1aSDK tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public final void i(AFg1aSDK aFg1aSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFg1aSDK, str, false, 4, null);
    }

    public void i(AFg1aSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public final void v(AFg1aSDK aFg1aSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFg1aSDK, str, false, 4, null);
    }

    public void v(AFg1aSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public final void w(AFg1aSDK aFg1aSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFg1aSDK, str, false, 4, null);
    }

    public void w(AFg1aSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public static /* synthetic */ void d$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFg1fSDK.d(aFg1aSDK, str, z);
    }

    public static /* synthetic */ void e$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        aFg1fSDK.e(aFg1aSDK, str, th, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3, (i & 64) != 0 ? true : z4);
    }

    public static /* synthetic */ void i$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFg1fSDK.i(aFg1aSDK, str, z);
    }

    public static /* synthetic */ void w$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFg1fSDK.w(aFg1aSDK, str, z);
    }

    public static /* synthetic */ void v$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFg1fSDK.v(aFg1aSDK, str, z);
    }

    public final String withTag$SDK_prodRelease(String str, AFg1aSDK aFg1aSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        return new StringBuilder("[").append(aFg1aSDK.values).append("] ").append(str).toString();
    }

    protected final String values(String str, AFg1aSDK aFg1aSDK) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            str = AbstractJsonLexerKt.NULL;
        }
        String withTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1aSDK);
        return getShouldExtendMsg() ? new StringBuilder("(").append(System.currentTimeMillis() - values).append(") [").append(Thread.currentThread().getName()).append("] ").append(withTag$SDK_prodRelease).toString() : withTag$SDK_prodRelease;
    }
}
