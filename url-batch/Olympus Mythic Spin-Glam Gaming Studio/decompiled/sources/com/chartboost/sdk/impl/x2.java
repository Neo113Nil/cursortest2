package com.chartboost.sdk.impl;

import android.content.Context;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Mediation;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes6.dex */
public final class x2 extends q3 {
    public final String O;
    public final String P;
    public final za Q;
    public final oa R;
    public final List S;
    public final q7 T;
    public final CoroutineDispatcher U;
    public final Function1 V;

    public static final class a extends Lambda implements Function1 {
        public static final a b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v2 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new v2(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(Context context, String location, jc mtype, String adUnitParameters, u8 fileCache, i3 i3Var, yi uiPoster, n3 n3Var, Mediation mediation, String baseUrl, String str, za infoIcon, ge openMeasurementImpressionCallback, r0 adUnitRendererCallback, oa impressionInterface, xl webViewTimeoutInterface, List scripts, q7 eventTracker, CoroutineDispatcher dispatcher, Function1 cbWebViewFactory) {
        super(context, location, mtype, adUnitParameters, uiPoster, fileCache, i3Var, n3Var, mediation, str, openMeasurementImpressionCallback, adUnitRendererCallback, webViewTimeoutInterface, eventTracker, null, 16384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(adUnitParameters, "adUnitParameters");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererCallback, "adUnitRendererCallback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(scripts, "scripts");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        this.O = baseUrl;
        this.P = str;
        this.Q = infoIcon;
        this.R = impressionInterface;
        this.S = scripts;
        this.T = eventTracker;
        this.U = dispatcher;
        this.V = cbWebViewFactory;
    }

    @Override // com.chartboost.sdk.impl.q3
    public cl b(Context context) {
        cl clVar;
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.P;
        if (str == null || StringsKt.isBlank(str)) {
            xb.b("html must not be null or blank", (Throwable) null, 2, (Object) null);
            return null;
        }
        try {
            clVar = null;
            try {
                g9 g9Var = new g9(context, this.O, this.P, this.Q, this.T, j(), this.R, this.U, this.V, null, 512, null);
                RelativeLayout webViewContainer = g9Var.getWebViewContainer();
                if (webViewContainer != null) {
                    g9Var.a(webViewContainer);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    xb.b("webViewContainer null when creating HtmlWebViewBase", (Throwable) null, 2, (Object) null);
                }
                return g9Var;
            } catch (Exception e) {
                e = e;
                cl clVar2 = clVar;
                c("Can't instantiate WebViewBase: " + e);
                return clVar2;
            }
        } catch (Exception e2) {
            e = e2;
            clVar = null;
        }
    }

    @Override // com.chartboost.sdk.impl.q3
    public void w() {
    }

    @Override // com.chartboost.sdk.impl.q3
    public void x() {
        r3 webView;
        super.x();
        this.R.u();
        cl u = u();
        if (u == null || (webView = u.getWebView()) == null) {
            return;
        }
        Iterator it = this.S.iterator();
        while (it.hasNext()) {
            webView.evaluateJavascript((String) it.next(), null);
        }
    }

    public /* synthetic */ x2(Context context, String str, jc jcVar, String str2, u8 u8Var, i3 i3Var, yi yiVar, n3 n3Var, Mediation mediation, String str3, String str4, za zaVar, ge geVar, r0 r0Var, oa oaVar, xl xlVar, List list, q7 q7Var, CoroutineDispatcher coroutineDispatcher, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, jcVar, str2, u8Var, i3Var, yiVar, n3Var, mediation, str3, str4, zaVar, geVar, r0Var, oaVar, xlVar, list, q7Var, (i & 262144) != 0 ? Dispatchers.getMain() : coroutineDispatcher, (i & 524288) != 0 ? a.b : function1);
    }
}
