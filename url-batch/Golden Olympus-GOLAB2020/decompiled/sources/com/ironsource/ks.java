package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.p;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.ms;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class ks {
    private final nr a(String str) {
        return str != null ? new nr(2110, str) : new nr(nr.f18416d, "noServerResponse");
    }

    private final xr a(Context context, cs csVar, sr srVar) {
        try {
            String a4 = csVar.a(context);
            if (TextUtils.isEmpty(a4)) {
                a4 = csVar.b(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str = a4;
            IronSourceSegment d4 = csVar.d();
            ArrayList<Pair<String, String>> segmentData = d4 != null ? d4.getSegmentData() : null;
            final kotlin.jvm.internal.G g4 = new kotlin.jvm.internal.G();
            String sendPostRequest = HttpFunctions.sendPostRequest(ServerURL.buildInitURL(context, srVar.d(), srVar.f(), str, null, true, segmentData, false), ri.a().toString(), new p.c() { // from class: com.ironsource.W1
                @Override // com.ironsource.mediationsdk.p.c
                public final void a(String str2) {
                    ks.a(kotlin.jvm.internal.G.this, str2);
                }
            });
            if (sendPostRequest == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return new xr(a((String) g4.f41132b));
            }
            if (csVar.e()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject = new JSONObject(sendPostRequest);
                String encryptedResponse = jSONObject.optString(ms.f18193n);
                if (TextUtils.isEmpty(encryptedResponse)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return new xr(new nr(2100, qr.f18883h));
                }
                boolean optBoolean = jSONObject.optBoolean("compression", false);
                Intrinsics.checkNotNullExpressionValue(encryptedResponse, "encryptedResponse");
                sendPostRequest = a(encryptedResponse, optBoolean);
                if (TextUtils.isEmpty(sendPostRequest)) {
                    ironLog.warning("encoded response invalid - return null");
                    csVar.f();
                    return new xr(new nr(nr.f18418f, qr.f18882g));
                }
            }
            ms msVar = new ms(context, srVar.d(), srVar.f(), sendPostRequest);
            msVar.a(ms.a.SERVER);
            if (msVar.p()) {
                return new xr(new tr(msVar));
            }
            IronLog.INTERNAL.warning("response invalid - return null");
            return new xr(new nr(nr.f18417e, "serverResponseIsNotValid"));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.warning("exception = " + e4);
            return new xr(e4 instanceof JSONException ? new nr(nr.f18417e, "serverResponseIsNotValid") : new nr(510, "internal error"));
        }
    }

    private final xr b(Context context, cs csVar, sr srVar) {
        xr a4 = a(context, csVar, srVar);
        if (a4.c()) {
            return a4;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
        ms a5 = csVar.a(context, srVar.d());
        if (a5 == null) {
            return a4;
        }
        xr xrVar = new xr(new tr(a5));
        IronSourceError buildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(srVar.d(), srVar.f());
        IronSourceLoggerManager.getLogger().log(ironSourceTag, buildUsingCachedConfigurationError + ": " + xrVar.b(), 1);
        csVar.g();
        return xrVar;
    }

    private final String a(String str, boolean z4) {
        String decryptAndDecompress = z4 ? IronSourceAES.decryptAndDecompress(mb.b().c(), str) : IronSourceAES.decode(mb.b().c(), str);
        Intrinsics.checkNotNullExpressionValue(decryptAndDecompress, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
        return decryptAndDecompress;
    }

    public final void a(@NotNull Context context, @NotNull sr request, @NotNull cs tools, @NotNull rr listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String f4 = request.f();
        if (f4 == null) {
            f4 = "";
        }
        tools.a("userId", f4);
        tools.a("appKey", request.d());
        tools.c().h(request.f());
        tools.a();
        xr b4 = b(context, tools, request);
        if (b4.b() == null) {
            nr a4 = b4.a();
            if (a4 == null) {
                a4 = new nr(510, "unknown error");
            }
            listener.a(a4);
            return;
        }
        lr lrVar = new lr(b4.b());
        if (b4.c()) {
            listener.a(lrVar);
        } else {
            listener.a(new nr(nr.f18417e, "serverResponseIsNotValid"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(kotlin.jvm.internal.G reason, String errorMessage) {
        Intrinsics.checkNotNullParameter(reason, "$reason");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        reason.f41132b = errorMessage;
    }
}
