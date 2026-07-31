package com.onevcat.uniwebview;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class A implements InterfaceC0101y {
    public final Activity b;
    public final String c;
    public final String d;
    public final String e;
    public final c2 f;
    public String g;
    public UniWebViewProxyActivity h;
    public boolean i;
    public boolean j;

    public A(Activity activity, String name, String url, String callbackURLScheme, C0042f messageSender) {
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
        C0036d c0036d = C0036d.b;
        c0036d.getClass();
        Intrinsics.checkNotNullParameter(this, "session");
        Intrinsics.checkNotNullParameter(name, "name");
        C0060l c0060l = C0060l.b;
        c0060l.a(EnumC0057k.DEBUG, AbstractC0075q.a("Adding auth session to manager: ", name, c0060l, "message"));
        c0036d.a.put(name, this);
    }

    @Override // com.onevcat.uniwebview.InterfaceC0101y
    public final void a() {
        Activity activity = this.b;
        Intent intent = new Intent(activity, activity.getClass());
        intent.setFlags(603979776);
        this.b.startActivity(intent);
    }

    @Override // com.onevcat.uniwebview.InterfaceC0101y
    public final void b() {
        C0098x c0098x = InterfaceC0101y.a;
        String id = this.g;
        if (id == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handlerId");
            id = null;
        }
        c0098x.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        C0098x.b.remove(id);
        C0036d c0036d = C0036d.b;
        String name = this.c;
        c0036d.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0060l c0060l = C0060l.b;
        c0060l.a(EnumC0057k.DEBUG, AbstractC0075q.a("Removing auth session from manager: ", name, c0060l, "message"));
        c0036d.a.remove(name);
        if (this.j) {
            return;
        }
        Intrinsics.checkNotNullParameter("Seems that user cancelled the auth task.", "message");
        c0060l.a(EnumC0057k.INFO, "Seems that user cancelled the auth task.");
        this.f.a(this.c, d2.AuthErrorReceived, new Y1("", "-999", "user cancelled", null));
    }

    @Override // com.onevcat.uniwebview.InterfaceC0101y
    public final void a(UniWebViewProxyActivity activity, int i, int i2, Intent intent) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.finish();
    }

    @Override // com.onevcat.uniwebview.InterfaceC0101y
    public final void a(UniWebViewProxyActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C0060l c0060l = C0060l.b;
        String message = "UniWebViewAuthenticationSession.onCreate. Proxy activity: " + activity;
        c0060l.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        EnumC0057k enumC0057k = EnumC0057k.DEBUG;
        c0060l.a(enumC0057k, message);
        this.h = activity;
        Intrinsics.checkNotNullParameter("UniWebViewAuthenticationSession.startAuthSession. Trying to build custom tab intent...", "message");
        c0060l.a(enumC0057k, "UniWebViewAuthenticationSession.startAuthSession. Trying to build custom tab intent...");
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        if (this.i) {
            build.intent.putExtra("com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", true);
        }
        build.intent.setData(Uri.parse(this.d));
        String message2 = "UniWebViewAuthenticationSession.startAuthSession. startActivityForResult, Tab Intent: " + build + ", Internal Intent: " + build.intent + ", Uri: " + build.intent.getData();
        Intrinsics.checkNotNullParameter(message2, "message");
        c0060l.a(enumC0057k, message2);
        UniWebViewProxyActivity uniWebViewProxyActivity = this.h;
        if (uniWebViewProxyActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("proxyActivity");
            uniWebViewProxyActivity = null;
        }
        uniWebViewProxyActivity.startActivityForResult(build.intent, 12947761);
    }

    @Override // com.onevcat.uniwebview.InterfaceC0101y
    public final void a(Intent intent) {
        if (this.j) {
            C0060l c0060l = C0060l.b;
            String message = "An intent is already handled. Ignore this one..." + intent;
            c0060l.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0060l.a(EnumC0057k.CRITICAL, message);
            return;
        }
        this.j = true;
        if (intent == null) {
            C0060l c0060l2 = C0060l.b;
            c0060l2.getClass();
            Intrinsics.checkNotNullParameter("Auth session receives null intent.", "message");
            c0060l2.a(EnumC0057k.CRITICAL, "Auth session receives null intent.");
            this.f.a(this.c, d2.AuthErrorReceived, new Y1("", "1001", "null intent", null));
            return;
        }
        C0060l c0060l3 = C0060l.b;
        String message2 = "Auth session receives intent: " + intent + ". data: " + intent.getData();
        c0060l3.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        EnumC0057k enumC0057k = EnumC0057k.INFO;
        c0060l3.a(enumC0057k, message2);
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        if (!Intrinsics.areEqual(this.e, "intent") && !Intrinsics.areEqual(data.getScheme(), this.e)) {
            String message3 = "Auth session receives uri " + data + ". But its scheme does not match the expected one: " + this.e;
            Intrinsics.checkNotNullParameter(message3, "message");
            c0060l3.a(EnumC0057k.CRITICAL, message3);
            this.f.a(this.c, d2.AuthErrorReceived, new Y1("", "1002", String.valueOf(data), null));
            return;
        }
        String message4 = "Auth session got result from service provider. " + intent.getDataString();
        Intrinsics.checkNotNullParameter(message4, "message");
        c0060l3.a(enumC0057k, message4);
        c2 c2Var = this.f;
        String str = this.c;
        d2 d2Var = d2.AuthFinished;
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = String.valueOf(data);
        }
        Intrinsics.checkNotNullExpressionValue(dataString, "intent.dataString ?: \"$uri\"");
        c2Var.a(str, d2Var, dataString);
    }
}
