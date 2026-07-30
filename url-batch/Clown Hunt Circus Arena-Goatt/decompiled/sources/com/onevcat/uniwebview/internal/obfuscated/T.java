package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.onevcat.uniwebview.UniWebViewProxyActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class T implements Q {
    public final Activity b;
    public final String c;
    public final String d;
    public final String e;
    public final C0069j f;
    public String g;
    public UniWebViewProxyActivity h;
    public boolean i;
    public boolean j;

    public T(Activity activity, String name, String url, String callbackURLScheme, C0069j messageDispatcher) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callbackURLScheme, "callbackURLScheme");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        this.b = activity;
        this.c = name;
        this.d = url;
        this.e = callbackURLScheme;
        this.f = messageDispatcher;
        C0040d c0040d = C0040d.b;
        c0040d.getClass();
        Intrinsics.checkNotNullParameter(this, "session");
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.DEBUG, AbstractC0045e.a("Adding auth session to manager: ", name, b, "message"));
        c0040d.a.put(name, this);
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.Q
    public final void a(UniWebViewProxyActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        B b = B.b;
        String message = "UniWebViewAuthenticationSession.onCreate. Proxy activity: " + activity;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        A a = A.DEBUG;
        b.a(a, message);
        this.h = activity;
        Intrinsics.checkNotNullParameter("UniWebViewAuthenticationSession.startAuthSession. Trying to build custom tab intent...", "message");
        b.a(a, "UniWebViewAuthenticationSession.startAuthSession. Trying to build custom tab intent...");
        List list = B3.D;
        ResolveInfo a2 = A3.a(this.b);
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        if (a2 != null) {
            build.intent.setPackage(a2.serviceInfo.packageName);
            String message2 = "AuthenticationSession using browser: " + a2.serviceInfo.packageName;
            Intrinsics.checkNotNullParameter(message2, "message");
            b.a(a, message2);
        } else {
            Intrinsics.checkNotNullParameter("No preferred browser found, using system default", "message");
            b.a(a, "No preferred browser found, using system default");
        }
        if (this.i) {
            build.intent.putExtra("com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", true);
        }
        build.intent.setData(Uri.parse(this.d));
        String message3 = "UniWebViewAuthenticationSession.startAuthSession. startActivityForResult, Tab Intent: " + build + ", Internal Intent: " + build.intent + ", Uri: " + build.intent.getData();
        Intrinsics.checkNotNullParameter(message3, "message");
        b.a(a, message3);
        UniWebViewProxyActivity uniWebViewProxyActivity = this.h;
        if (uniWebViewProxyActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("proxyActivity");
            uniWebViewProxyActivity = null;
        }
        uniWebViewProxyActivity.startActivityForResult(build.intent, 12947761);
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.Q
    public final void b() {
        P p = Q.a;
        String id = this.g;
        if (id == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handlerId");
            id = null;
        }
        p.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        P.b.remove(id);
        C0040d c0040d = C0040d.b;
        String name = this.c;
        c0040d.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.DEBUG, AbstractC0045e.a("Removing auth session from manager: ", name, b, "message"));
        c0040d.a.remove(name);
        if (this.j) {
            return;
        }
        Intrinsics.checkNotNullParameter("Seems that user cancelled the auth task.", "message");
        b.a(A.INFO, "Seems that user cancelled the auth task.");
        v3 payload = new v3("", "-999", "user cancelled", null);
        C0069j c0069j = this.f;
        H3 method = H3.AuthErrorReceived;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(payload, "payload");
        c0069j.a(method, payload.a());
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.Q
    public final void a(UniWebViewProxyActivity activity, int i, int i2, Intent intent) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.finish();
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.Q
    public final void a(Intent intent) {
        if (this.j) {
            B b = B.b;
            String message = "An intent is already handled. Ignore this one..." + intent;
            b.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            b.a(A.CRITICAL, message);
            return;
        }
        this.j = true;
        if (intent == null) {
            B b2 = B.b;
            b2.getClass();
            Intrinsics.checkNotNullParameter("Auth session receives null intent.", "message");
            b2.a(A.CRITICAL, "Auth session receives null intent.");
            v3 payload = new v3("", "1001", "null intent", null);
            C0069j c0069j = this.f;
            H3 method = H3.AuthErrorReceived;
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(payload, "payload");
            c0069j.a(method, payload.a());
            return;
        }
        B b3 = B.b;
        String message2 = "Auth session receives intent: " + intent + ". data: " + intent.getData();
        b3.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        A a = A.INFO;
        b3.a(a, message2);
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        if (!Intrinsics.areEqual(this.e, "intent") && !Intrinsics.areEqual(data.getScheme(), this.e)) {
            String message3 = "Auth session receives uri " + data + ". But its scheme does not match the expected one: " + this.e;
            Intrinsics.checkNotNullParameter(message3, "message");
            b3.a(A.CRITICAL, message3);
            v3 payload2 = new v3("", "1002", String.valueOf(data), null);
            C0069j c0069j2 = this.f;
            H3 method2 = H3.AuthErrorReceived;
            Intrinsics.checkNotNullParameter(method2, "method");
            Intrinsics.checkNotNullParameter(payload2, "payload");
            c0069j2.a(method2, payload2.a());
            return;
        }
        String message4 = "Auth session got result from service provider. " + intent.getDataString();
        Intrinsics.checkNotNullParameter(message4, "message");
        b3.a(a, message4);
        C0069j c0069j3 = this.f;
        H3 method3 = H3.AuthFinished;
        String parameters = intent.getDataString();
        if (parameters == null) {
            parameters = String.valueOf(data);
        }
        Intrinsics.checkNotNullExpressionValue(parameters, "intent.dataString ?: \"$uri\"");
        Intrinsics.checkNotNullParameter(method3, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        c0069j3.b.a(c0069j3.a, method3, parameters);
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.Q
    public final void a() {
        Activity activity = this.b;
        Intent intent = new Intent(activity, activity.getClass());
        intent.setFlags(603979776);
        this.b.startActivity(intent);
    }
}
