package com.stripe.android.financialconnections.utils;

import android.net.Uri;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.datadog.trace.core.util.Matchers;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes8.dex */
public final class UriUtils {
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final FinancialConnectionsAnalyticsTrackerImpl tracker;

    public UriUtils(Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl) {
        logger$Companion$NOOP_LOGGER$1.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.tracker = financialConnectionsAnalyticsTrackerImpl;
    }

    public final boolean compareSchemeAuthorityAndPath(String str, String str2) {
        str.getClass();
        str2.getClass();
        Uri uriOrNull = toUriOrNull(str);
        Uri uriOrNull2 = toUriOrNull(str2);
        return uriOrNull != null && uriOrNull2 != null && StringsKt__StringsJVMKt.equals(uriOrNull.getAuthority(), uriOrNull2.getAuthority(), false) && StringsKt__StringsJVMKt.equals(uriOrNull.getScheme(), uriOrNull2.getScheme(), false) && StringsKt__StringsJVMKt.equals(uriOrNull.getPath(), uriOrNull2.getPath(), false);
    }

    public final String getQueryParameter(String str, String str2) {
        Object failure;
        str.getClass();
        try {
            Result.Companion companion = Result.Companion;
            Uri uriOrNull = toUriOrNull(str);
            failure = uriOrNull != null ? uriOrNull.getQueryParameter(str2) : null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
            Matchers.logError(this.tracker, CameraSelector$$ExternalSyntheticOutline0.m("Could not extract query param ", str2, " from URI ", str), m4120exceptionOrNullimpl, this.logger, FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR);
        }
        return (String) (failure instanceof Result.Failure ? null : failure);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        r1 = kotlin.text.StringsKt__StringsKt.split$default(r1, new java.lang.String[]{"&"}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getQueryParameterFromFragment(String str) {
        List split$default;
        List split$default2;
        try {
            Result.Companion companion = Result.Companion;
            Uri uriOrNull = toUriOrNull(str);
            if (uriOrNull == null || (r1 = uriOrNull.getFragment()) == null || split$default == null) {
                return null;
            }
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                split$default2 = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"="}, false, 0, 6, null);
                if (Intrinsics.areEqual(split$default2.get(0), "code") && split$default2.size() > 1) {
                    return split$default2.get(1);
                }
            }
            return null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(new Result.Failure(th));
            if (m4120exceptionOrNullimpl == null) {
                return null;
            }
            Matchers.logError(this.tracker, "Could not extract query param code from URI ".concat(str), m4120exceptionOrNullimpl, this.logger, FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR);
            return null;
        }
    }

    public final Uri toUriOrNull(String str) {
        try {
            Result.Companion companion = Result.Companion;
            return Uri.parse(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(new Result.Failure(th));
            if (m4120exceptionOrNullimpl == null) {
                return null;
            }
            Matchers.logError(this.tracker, Recorder$$ExternalSyntheticOutline2.m("Could not parse given URI ", str), m4120exceptionOrNullimpl, this.logger, FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR);
            return null;
        }
    }
}
