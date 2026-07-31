package com.yandex.mobile.ads.impl;

import O1.C0892k0;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class z10 extends DivActionHandler {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mr f35420a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a20 f35421b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final k20 f35422c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final z20 f35423d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final y20 f35424e;

    public /* synthetic */ z10(Context context, C2286v2 c2286v2, C2360y7 c2360y7, mr mrVar, a20 a20Var, k20 k20Var) {
        this(context, c2286v2, c2360y7, mrVar, a20Var, k20Var, new z20(new dh1(context, c2286v2, o62.f29919d)), new y20(c2286v2, c2360y7));
    }

    private final boolean a(JSONObject jSONObject, Uri uri, DivViewFacade divViewFacade) {
        if (!Intrinsics.areEqual(uri.getScheme(), "mobileads")) {
            return false;
        }
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != 94750088) {
                if (hashCode != 866535483) {
                    if (hashCode != 986975867) {
                        if (hashCode == 1270469668 && host.equals("trackUrl")) {
                            this.f35423d.a(uri);
                            return true;
                        }
                    } else if (host.equals("trackAnalytics")) {
                        this.f35424e.a(uri, jSONObject);
                        return true;
                    }
                } else if (host.equals("closeAd")) {
                    this.f35420a.f();
                    return true;
                }
            } else if (host.equals(com.ironsource.c9.f15700d)) {
                k20 k20Var = this.f35422c;
                View view = divViewFacade.getView();
                Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
                k20Var.a(uri, view);
                return true;
            }
        }
        return this.f35421b.a(uri);
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(@NotNull C0892k0 action, @NotNull DivViewFacade view, @NotNull ExpressionResolver expressionResolver) {
        Expression expression;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        return super.handleAction(action, view, expressionResolver) || ((expression = action.f6762k) != null && a(action.f6757f, (Uri) expression.evaluate(expressionResolver), view));
    }

    public z10(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2360y7<?> adResponse, @NotNull mr contentCloseListener, @NotNull a20 delegate, @NotNull k20 clickHandler, @NotNull z20 trackingUrlHandler, @NotNull y20 trackAnalyticsHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        Intrinsics.checkNotNullParameter(trackingUrlHandler, "trackingUrlHandler");
        Intrinsics.checkNotNullParameter(trackAnalyticsHandler, "trackAnalyticsHandler");
        this.f35420a = contentCloseListener;
        this.f35421b = delegate;
        this.f35422c = clickHandler;
        this.f35423d = trackingUrlHandler;
        this.f35424e = trackAnalyticsHandler;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(@NotNull O1.Xb action, @NotNull DivViewFacade view, @NotNull ExpressionResolver resolver) {
        Expression url;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return super.handleAction(action, view, resolver) || ((url = action.getUrl()) != null && a(action.c(), (Uri) url.evaluate(resolver), view));
    }

    public final void a(@Nullable eo eoVar) {
        this.f35422c.a(eoVar);
    }
}
