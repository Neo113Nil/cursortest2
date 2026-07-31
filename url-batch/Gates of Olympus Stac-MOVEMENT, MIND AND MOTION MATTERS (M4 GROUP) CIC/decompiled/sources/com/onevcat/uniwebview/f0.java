package com.onevcat.uniwebview;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.imaginationoverflow.unity.referrer.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f0 implements d0 {
    public final Activity b;
    public final String c;
    public final String d;
    public final String e;
    public final g5 f;
    public String g;
    public UniWebViewProxyActivity h;
    public boolean i;
    public boolean j;

    public f0(Activity activity, String name, String url, String callbackURLScheme, h messageSender) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callbackURLScheme, "callbackURLScheme");
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        this.b = activity;
        this.c = name;
        this.d = url;
        this.e = callbackURLScheme;
        this.f = messageSender;
        f fVar = f.b;
        e.a().a(this, name);
    }

    @Override // com.onevcat.uniwebview.d0
    public final void a() {
        Activity activity = this.b;
        Intent intent = new Intent(activity, activity.getClass());
        intent.setFlags(603979776);
        this.b.startActivity(intent);
    }

    @Override // com.onevcat.uniwebview.d0
    public final void b() {
        c0 c0Var = d0.a;
        String id = this.g;
        if (id == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handlerId");
            id = null;
        }
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        c0.b.remove(id);
        f fVar = f.b;
        String name = this.c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.DEBUG, d.a("Removing auth session from manager: ", name, oVar, "message"));
        fVar.a.remove(name);
        if (this.j) {
            return;
        }
        Intrinsics.checkNotNullParameter("Seems that user cancelled the auth task.", "message");
        oVar.a(n.INFO, "Seems that user cancelled the auth task.");
        this.f.a(this.c, h5.AuthErrorReceived, new c5(BuildConfig.FLAVOR, "-999", "user cancelled", null));
    }

    @Override // com.onevcat.uniwebview.d0
    public final void a(UniWebViewProxyActivity activity, int i, int i2, Intent intent) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.finish();
    }

    @Override // com.onevcat.uniwebview.d0
    public final void a(UniWebViewProxyActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        o oVar = o.b;
        String message = "UniWebViewAuthenticationSession.onCreate. Proxy activity: " + activity;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        n nVar = n.DEBUG;
        oVar.a(nVar, message);
        this.h = activity;
        Intrinsics.checkNotNullParameter("UniWebViewAuthenticationSession.startAuthSession. Trying to build custom tab intent...", "message");
        oVar.a(nVar, "UniWebViewAuthenticationSession.startAuthSession. Trying to build custom tab intent...");
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        if (this.i) {
            build.intent.putExtra("com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", true);
        }
        build.intent.setData(Uri.parse(this.d));
        String message2 = "UniWebViewAuthenticationSession.startAuthSession. startActivityForResult, Tab Intent: " + build + ", Internal Intent: " + build.intent + ", Uri: " + build.intent.getData();
        Intrinsics.checkNotNullParameter(message2, "message");
        oVar.a(nVar, message2);
        UniWebViewProxyActivity uniWebViewProxyActivity = this.h;
        if (uniWebViewProxyActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("proxyActivity");
            uniWebViewProxyActivity = null;
        }
        uniWebViewProxyActivity.startActivityForResult(build.intent, 12947761);
    }

    @Override // com.onevcat.uniwebview.d0
    public final void a(Intent intent) {
        if (this.j) {
            o oVar = o.b;
            o oVar2 = o.b;
            String message = "An intent is already handled. Ignore this one..." + intent;
            oVar2.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            oVar2.a(n.CRITICAL, message);
            return;
        }
        this.j = true;
        if (intent == null) {
            o oVar3 = o.b;
            o oVar4 = o.b;
            oVar4.getClass();
            Intrinsics.checkNotNullParameter("Auth session receives null intent.", "message");
            oVar4.a(n.CRITICAL, "Auth session receives null intent.");
            this.f.a(this.c, h5.AuthErrorReceived, new c5(BuildConfig.FLAVOR, "1001", "null intent", null));
            return;
        }
        o oVar5 = o.b;
        o oVar6 = o.b;
        String message2 = "Auth session receives intent: " + intent + ". data: " + intent.getData();
        oVar6.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        n nVar = n.INFO;
        oVar6.a(nVar, message2);
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        if (!Intrinsics.areEqual(this.e, "intent") && !Intrinsics.areEqual(data.getScheme(), this.e)) {
            String message3 = "Auth session receives uri " + data + ". But its scheme does not match the expected one: " + this.e;
            oVar6.getClass();
            Intrinsics.checkNotNullParameter(message3, "message");
            oVar6.a(n.CRITICAL, message3);
            this.f.a(this.c, h5.AuthErrorReceived, new c5(BuildConfig.FLAVOR, "1002", String.valueOf(data), null));
            return;
        }
        String message4 = "Auth session got result from service provider. " + intent.getDataString();
        oVar6.getClass();
        Intrinsics.checkNotNullParameter(message4, "message");
        oVar6.a(nVar, message4);
        g5 g5Var = this.f;
        String str = this.c;
        h5 h5Var = h5.AuthFinished;
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = String.valueOf(data);
        }
        Intrinsics.checkNotNullExpressionValue(dataString, "intent.dataString ?: \"$uri\"");
        g5Var.a(str, h5Var, dataString);
    }
}
