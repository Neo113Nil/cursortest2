package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class B3 {
    public static final List D = CollectionsKt.listOf((Object[]) new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.chrome.canary", "com.microsoft.emmx", "com.brave.browser", "com.opera.browser", "com.opera.mini.native", "com.sec.android.app.sbrowser", "com.yandex.browser", "com.UCMobile.intl"});
    public static final ArrayList E = new ArrayList();
    public static final x3 F = new x3() { // from class: com.onevcat.uniwebview.internal.obfuscated.B3$$ExternalSyntheticLambda0
        @Override // com.onevcat.uniwebview.internal.obfuscated.x3
        public final boolean a(Activity activity, String str, CustomTabsServiceConnection customTabsServiceConnection) {
            return B3.a(activity, str, customTabsServiceConnection);
        }
    };
    public Integer A;
    public Integer B;
    public Integer C;
    public final Activity a;
    public final String b;
    public String c;
    public final C0069j d;
    public CustomTabsClient e;
    public CustomTabsSession f;
    public F g;
    public boolean h;
    public boolean i;
    public boolean j;
    public Integer k;
    public Integer l;
    public Integer m;
    public Integer n;
    public Integer o;
    public boolean p;
    public Boolean q;
    public Boolean r;
    public Boolean s;
    public Boolean t;
    public Boolean u;
    public Boolean v;
    public Boolean w;
    public Boolean x;
    public String y;
    public Integer z;

    public B3(Activity activity, String name, String url, C0069j messageDispatcher) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        this.a = activity;
        this.b = name;
        this.c = url;
        this.d = messageDispatcher;
        G g = G.b;
        g.getClass();
        Intrinsics.checkNotNullParameter(this, "browsing");
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String a = AbstractC0045e.a("Adding safe browsing to manager: ", name, b, "message");
        A a2 = A.DEBUG;
        b.a(a2, a);
        g.a.put(name, this);
        if (this.i) {
            String message = "Safe browsing already disposed. Skip binding: " + name;
            Intrinsics.checkNotNullParameter(message, "message");
            b.a(a2, message);
            return;
        }
        ResolveInfo a3 = A3.a(activity);
        if (a3 == null) {
            return;
        }
        F f = new F(this);
        this.g = f;
        x3 x3Var = F;
        String str = a3.serviceInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.serviceInfo.packageName");
        boolean a4 = x3Var.a(activity, str, f);
        this.h = a4;
        if (a4) {
            return;
        }
        Intrinsics.checkNotNullParameter("Custom Tabs didn't bind to a tab service. Something goes wrong. Trying to show the browser without a session.", "message");
        b.a(A.CRITICAL, "Custom Tabs didn't bind to a tab service. Something goes wrong. Trying to show the browser without a session.");
        if (!this.i) {
            a(new CustomTabsIntent.Builder());
            return;
        }
        String message2 = "Safe browsing '" + name + "' already disposed. Skip showWithoutClient";
        Intrinsics.checkNotNullParameter(message2, "message");
        b.a(A.INFO, message2);
    }

    public static final boolean a(Activity activity, String packageName, CustomTabsServiceConnection connection) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(connection, "connection");
        return CustomTabsClient.bindCustomTabsService(activity, packageName, connection);
    }

    public final void b(String str) {
        if (this.i) {
            B b = B.b;
            String message = "Safe browsing already disposed (" + str + "): " + this.b;
            b.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            b.a(A.DEBUG, message);
            return;
        }
        B b2 = B.b;
        String message2 = "Disposing safe browsing '" + this.b + "' because: " + str;
        b2.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        b2.a(A.INFO, message2);
        this.i = true;
        G g = G.b;
        String name = this.b;
        g.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        String message3 = "Removing safe browsing from manager: " + name;
        Intrinsics.checkNotNullParameter(message3, "message");
        b2.a(A.DEBUG, message3);
        g.a.remove(name);
        F f = this.g;
        if (f != null && this.h) {
            try {
                this.a.unbindService(f);
            } catch (IllegalArgumentException e) {
                B b3 = B.b;
                String message4 = "unbindService failed: " + e.getMessage();
                b3.getClass();
                Intrinsics.checkNotNullParameter(message4, "message");
                b3.a(A.DEBUG, message4);
            }
        }
        this.g = null;
        this.h = false;
        this.e = null;
        this.f = null;
        this.p = false;
        this.y = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(CustomTabsIntent.Builder builder, String str, Object obj, Class cls, String str2) {
        try {
            Intrinsics.checkNotNull(builder);
            builder.getClass().getMethod(str, cls).invoke(builder, obj);
        } catch (Exception e) {
            B b = B.b;
            String message = str + " not available until " + str2 + ": " + e;
            b.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            b.a(A.CRITICAL, message);
        }
    }

    public final void a(CustomTabsIntent.Builder builder) {
        Integer num = this.k;
        if (num != null) {
            builder.setColorScheme(num.intValue());
        }
        if (this.l != null || this.m != null || this.n != null || this.o != null) {
            CustomTabColorSchemeParams.Builder builder2 = new CustomTabColorSchemeParams.Builder();
            Integer num2 = this.l;
            if (num2 != null) {
                builder2.setToolbarColor(num2.intValue());
            }
            Integer num3 = this.m;
            if (num3 != null) {
                builder2.setSecondaryToolbarColor(num3.intValue());
            }
            Integer num4 = this.n;
            if (num4 != null) {
                builder2.setNavigationBarColor(num4.intValue());
            }
            Integer num5 = this.o;
            if (num5 != null) {
                builder2.setNavigationBarDividerColor(num5.intValue());
            }
            Integer num6 = this.k;
            if (num6 != null && num6.intValue() != 0) {
                Integer num7 = this.k;
                if (num7 != null) {
                    builder.setColorSchemeParams(num7.intValue(), builder2.build());
                }
            } else {
                builder.setDefaultColorSchemeParams(builder2.build());
            }
        }
        Boolean bool = this.q;
        if (bool != null) {
            a(builder, "setBookmarksButtonEnabled", bool, Boolean.TYPE, "1.7.0");
        }
        Boolean bool2 = this.r;
        if (bool2 != null) {
            a(builder, "setBackgroundInteractionEnabled", bool2, Boolean.TYPE, "1.7.0");
        }
        Boolean bool3 = this.s;
        if (bool3 != null) {
            a(builder, "setDownloadButtonEnabled", bool3, Boolean.TYPE, "1.7.0");
        }
        Integer num8 = this.z;
        if (num8 != null) {
            builder.setToolbarCornerRadiusDp(num8.intValue());
        }
        Boolean bool4 = this.u;
        if (bool4 != null) {
            a(builder, "setSendToExternalDefaultHandlerEnabled", bool4, Boolean.TYPE, "1.7.0");
        }
        Boolean bool5 = this.v;
        if (bool5 != null) {
            builder.setUrlBarHidingEnabled(bool5.booleanValue());
        }
        Boolean bool6 = this.w;
        if (bool6 != null) {
            builder.setShareState(bool6.booleanValue() ? 1 : 2);
        }
        Integer num9 = this.A;
        if (num9 != null) {
            int intValue = num9.intValue();
            Integer num10 = this.B;
            builder.setInitialActivityHeightPx(intValue, num10 != null ? num10.intValue() : 2);
        }
        Integer num11 = this.C;
        if (num11 != null) {
            a(builder, "setInitialActivityWidthPx", Integer.valueOf(num11.intValue()), Integer.TYPE, "1.8.0");
        }
        Boolean bool7 = this.t;
        if (bool7 != null) {
            a(builder, "setActivitySideSheetMaximizationEnabled", bool7, Boolean.TYPE, "1.8.0");
        }
        builder.build().launchUrl(this.a, Uri.parse(this.c));
    }

    public final void a() {
        String str;
        CustomTabsClient customTabsClient;
        CustomTabsSession customTabsSession;
        boolean z = this.i;
        if (z || (str = this.y) == null || (customTabsClient = this.e) == null) {
            return;
        }
        if (z) {
            customTabsSession = null;
        } else {
            if (this.f == null) {
                this.f = customTabsClient.newSession(new H(this));
            }
            customTabsSession = this.f;
        }
        if (customTabsSession == null) {
            return;
        }
        customTabsSession.mayLaunchUrl(Uri.parse(str), null, null);
    }

    public static String a(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, str);
        jSONObject.put("source", "CustomTabsCallback");
        jSONObject.put("timestamp", System.currentTimeMillis());
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "payload.toString()");
        return jSONObject2;
    }

    public final void b() {
        CustomTabsSession customTabsSession;
        if (this.i) {
            B b = B.b;
            b.a(A.INFO, AbstractC0094p0.a(new StringBuilder("Safe browsing '"), this.b, "' already disposed. Skip show", b, "message"));
            return;
        }
        CustomTabsClient customTabsClient = this.e;
        if (customTabsClient == null) {
            this.p = true;
            return;
        }
        if (this.i) {
            customTabsSession = null;
        } else {
            if (this.f == null) {
                this.f = customTabsClient.newSession(new H(this));
            }
            customTabsSession = this.f;
        }
        a(new CustomTabsIntent.Builder(customTabsSession));
    }
}
