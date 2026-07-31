package com.yandex.div.core.view2.divs;

import O1.C0892k0;
import O1.Xb;
import android.net.Uri;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class DivActionBeaconSender {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final boolean isSwipeOutBeaconsEnabled;
    private final boolean isTapBeaconsEnabled;
    private final boolean isVisibilityBeaconsEnabled;

    @NotNull
    private final Q1.a sendBeaconManagerLazy;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DivActionBeaconSender(@NotNull Q1.a sendBeaconManagerLazy, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(sendBeaconManagerLazy, "sendBeaconManagerLazy");
        this.sendBeaconManagerLazy = sendBeaconManagerLazy;
        this.isTapBeaconsEnabled = z4;
        this.isVisibilityBeaconsEnabled = z5;
        this.isSwipeOutBeaconsEnabled = z6;
    }

    private boolean isHttpScheme(String str) {
        return Intrinsics.areEqual(str, "http") || Intrinsics.areEqual(str, "https");
    }

    private Map<String, String> toHttpHeaders(C0892k0 c0892k0, ExpressionResolver expressionResolver) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Expression expression = c0892k0.f6758g;
        if (expression != null) {
            String uri = ((Uri) expression.evaluate(expressionResolver)).toString();
            Intrinsics.checkNotNullExpressionValue(uri, "referer.evaluate(resolver).toString()");
            linkedHashMap.put("Referer", uri);
        }
        return linkedHashMap;
    }

    public void sendSwipeOutActionBeacon(@NotNull C0892k0 action, @NotNull ExpressionResolver resolver) {
        Uri uri;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Expression expression = action.f6755d;
        if (expression == null || (uri = (Uri) expression.evaluate(resolver)) == null) {
            return;
        }
        if (isHttpScheme(uri.getScheme())) {
            if (this.isSwipeOutBeaconsEnabled) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("SendBeaconManager was not configured");
                    return;
                }
                return;
            }
            return;
        }
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.WARNING)) {
            kLog.print(5, "DivActionBeaconSender", "Trying to send beacon with unsupported URL '" + uri + '\'');
        }
    }

    public void sendTapActionBeacon(@NotNull C0892k0 action, @NotNull ExpressionResolver resolver) {
        Uri uri;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Expression expression = action.f6755d;
        if (expression == null || (uri = (Uri) expression.evaluate(resolver)) == null) {
            return;
        }
        if (isHttpScheme(uri.getScheme())) {
            if (this.isTapBeaconsEnabled) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("SendBeaconManager was not configured");
                    return;
                }
                return;
            }
            return;
        }
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.WARNING)) {
            kLog.print(5, "DivActionBeaconSender", "Trying to send beacon with unsupported URL '" + uri + '\'');
        }
    }

    public void sendVisibilityActionBeacon(@NotNull Xb action, @NotNull ExpressionResolver resolver) {
        Uri uri;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Expression url = action.getUrl();
        if (url == null || (uri = (Uri) url.evaluate(resolver)) == null) {
            return;
        }
        if (isHttpScheme(uri.getScheme())) {
            if (this.isVisibilityBeaconsEnabled) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("SendBeaconManager was not configured");
                    return;
                }
                return;
            }
            return;
        }
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.WARNING)) {
            kLog.print(5, "DivActionBeaconSender", "Trying to send beacon with unsupported URL '" + uri + '\'');
        }
    }

    private Map<String, String> toHttpHeaders(Xb xb, ExpressionResolver expressionResolver) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Expression e4 = xb.e();
        if (e4 != null) {
            String uri = ((Uri) e4.evaluate(expressionResolver)).toString();
            Intrinsics.checkNotNullExpressionValue(uri, "referer.evaluate(resolver).toString()");
            linkedHashMap.put("Referer", uri);
        }
        return linkedHashMap;
    }
}
