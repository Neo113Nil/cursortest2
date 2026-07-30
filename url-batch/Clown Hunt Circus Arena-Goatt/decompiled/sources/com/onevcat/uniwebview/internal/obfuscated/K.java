package com.onevcat.uniwebview.internal.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.core.net.MailTo;
import com.onevcat.uniwebview.UniWebViewInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class K {
    public final Context a;
    public final com.onevcat.uniwebview.a b;
    public final B c;
    public final Set d;
    public boolean e;

    public K(Context context, com.onevcat.uniwebview.a delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = context;
        this.b = delegate;
        this.c = B.b;
        this.d = SetsKt.mutableSetOf("uniwebview");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String parameters, boolean z, boolean z2, String str) {
        Intent intent;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        Intent intent5;
        Intrinsics.checkNotNullParameter(parameters, "url");
        if (str != null) {
            p3 p3Var = UniWebViewInterface.Companion;
            C0070j0 c0070j0 = new C0070j0(str, z, parameters);
            p3Var.getClass();
            C0078l0 a = p3.a(c0070j0);
            if (a != null) {
                try {
                    if (!a.b.getBoolean("result")) {
                        return true;
                    }
                } catch (Exception e) {
                    B b = B.b;
                    String message = "Exception during parsing result for `ShouldUniWebViewHandleRequest`: " + e + ". Result from managed code: " + a.a;
                    b.getClass();
                    Intrinsics.checkNotNullParameter(message, "message");
                    b.a(A.CRITICAL, message);
                }
            }
        }
        String url = parameters.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(url, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        Intent intent6 = null;
        if (StringsKt.startsWith$default(url, "file:", false, 2, (Object) null)) {
            com.onevcat.uniwebview.a aVar = this.b;
            if (aVar.getSettings().getAllowFileAccess()) {
                B b2 = B.b;
                b2.getClass();
                Intrinsics.checkNotNullParameter("Loading a local file. The local file loading will never be overridden.", "message");
                b2.a(A.DEBUG, "Loading a local file. The local file loading will never be overridden.");
                return false;
            }
            B b3 = B.b;
            b3.getClass();
            Intrinsics.checkNotNullParameter("Local file loading is disabled. To enable loading from a `file://` URL, call `SetAllowFileAccess` with true.", "message");
            b3.a(A.INFO, "Local file loading is disabled. To enable loading from a `file://` URL, call `SetAllowFileAccess` with true.");
            aVar.a(H3.PageErrorReceived, new v3("", "-1", "Local file loading is disabled.", null));
            return true;
        }
        if (StringsKt.startsWith$default(url, "uniwebviewinternal://", false, 2, (Object) null)) {
            if (StringsKt.contains$default((CharSequence) url, (CharSequence) "__uniwebview_internal_video_end", false, 2, (Object) null)) {
                this.b.d.onHideCustomView();
            }
            B b4 = this.c;
            b4.getClass();
            Intrinsics.checkNotNullParameter("Url handled internally in UniWebView", "message");
            b4.a(A.DEBUG, "Url handled internally in UniWebView");
            return true;
        }
        Intrinsics.checkNotNullParameter(url, "url");
        B b5 = this.c;
        b5.a(A.VERBOSE, AbstractC0045e.a("Checking url could match with a defined url scheme: ", url, b5, "message"));
        Set set = this.d;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(url, ((String) it.next()) + "://", false, 2, (Object) null)) {
                    B b6 = this.c;
                    b6.a(A.VERBOSE, AbstractC0045e.a("Found url matching scheme: ", url, b6, "message"));
                    B b7 = this.c;
                    String message2 = "Url handled by defined scheme. Redirected to Unity. ".concat(parameters);
                    b7.getClass();
                    Intrinsics.checkNotNullParameter(message2, "message");
                    b7.a(A.DEBUG, message2);
                    com.onevcat.uniwebview.a aVar2 = this.b;
                    Intrinsics.checkNotNullParameter(parameters, "url");
                    H3 method = H3.MessageReceived;
                    Intrinsics.checkNotNullParameter(method, "method");
                    Intrinsics.checkNotNullParameter(parameters, "parameters");
                    aVar2.j.a(method, parameters);
                    return true;
                }
            }
        }
        B b8 = this.c;
        b8.a(A.VERBOSE, AbstractC0045e.a("Did not find a matched scheme for: ", url, b8, "message"));
        if (StringsKt.startsWith$default(url, "sms:", false, 2, (Object) null)) {
            B b9 = this.c;
            b9.getClass();
            Intrinsics.checkNotNullParameter("Received sms url...", "message");
            b9.a(A.DEBUG, "Received sms url...");
            intent = new Intent("android.intent.action.VIEW", Uri.parse(parameters));
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
        } else {
            intent = null;
        }
        if (!a(intent)) {
            if (StringsKt.startsWith$default(url, "tel:", false, 2, (Object) null)) {
                B b10 = this.c;
                b10.getClass();
                Intrinsics.checkNotNullParameter("Received tel url...", "message");
                b10.a(A.DEBUG, "Received tel url...");
                intent2 = new Intent("android.intent.action.DIAL", Uri.parse(parameters));
            } else {
                intent2 = null;
            }
            if (!a(intent2)) {
                if (StringsKt.startsWith$default(url, MailTo.MAILTO_SCHEME, false, 2, (Object) null)) {
                    B b11 = this.c;
                    b11.getClass();
                    Intrinsics.checkNotNullParameter("Received mailto url...", "message");
                    b11.a(A.DEBUG, "Received mailto url...");
                    intent3 = new Intent("android.intent.action.SENDTO", Uri.parse(parameters));
                } else {
                    intent3 = null;
                }
                if (!a(intent3)) {
                    if (StringsKt.startsWith$default(url, "intent:", false, 2, (Object) null)) {
                        B b12 = this.c;
                        b12.getClass();
                        Intrinsics.checkNotNullParameter("Received intent url...", "message");
                        b12.a(A.DEBUG, "Received intent url...");
                        try {
                            intent4 = Intent.parseUri(parameters, 1);
                            if (this.a.getPackageManager().resolveActivity(intent4, 65536) == null) {
                                String str2 = intent4.getPackage();
                                if (str2 != null) {
                                    Intent intent7 = new Intent("android.intent.action.VIEW");
                                    intent7.setData(Uri.parse("market://details?id=".concat(str2)));
                                    intent4 = intent7;
                                }
                            }
                        } catch (Exception e2) {
                            B b13 = this.c;
                            String message3 = "Parsing intent url error: " + e2 + ".message";
                            b13.getClass();
                            Intrinsics.checkNotNullParameter(message3, "message");
                            b13.a(A.CRITICAL, message3);
                        }
                        if (!a(intent4)) {
                            if (StringsKt.startsWith$default(url, "market:", false, 2, (Object) null)) {
                                B b14 = this.c;
                                b14.getClass();
                                Intrinsics.checkNotNullParameter("Received market url...", "message");
                                b14.a(A.DEBUG, "Received market url...");
                                try {
                                    intent5 = Intent.parseUri(parameters, 1);
                                } catch (Exception e3) {
                                    B b15 = this.c;
                                    String message4 = "Parsing market url error. " + e3.getMessage();
                                    b15.getClass();
                                    Intrinsics.checkNotNullParameter(message4, "message");
                                    b15.a(A.CRITICAL, message4);
                                }
                                if (!a(intent5)) {
                                    if (a(parameters, z2)) {
                                        return true;
                                    }
                                    List listOf = CollectionsKt.listOf((Object[]) new String[]{"http:", "https:", "file:", "about:blank"});
                                    if (!(listOf instanceof Collection) || !listOf.isEmpty()) {
                                        Iterator it2 = listOf.iterator();
                                        while (it2.hasNext()) {
                                            if (StringsKt.startsWith$default(url, (String) it2.next(), false, 2, (Object) null)) {
                                                break;
                                            }
                                        }
                                    }
                                    B b16 = this.c;
                                    String message5 = "Trying to parse third party app url: ".concat(parameters);
                                    b16.getClass();
                                    Intrinsics.checkNotNullParameter(message5, "message");
                                    A a2 = A.DEBUG;
                                    b16.a(a2, message5);
                                    Intent intent8 = new Intent("android.intent.action.VIEW", Uri.parse(parameters));
                                    List<ResolveInfo> queryIntentActivities = this.a.getPackageManager().queryIntentActivities(intent8, 0);
                                    Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
                                    B b17 = this.c;
                                    String message6 = "Query for supported activity to run the intent with url: ".concat(parameters);
                                    b17.getClass();
                                    Intrinsics.checkNotNullParameter(message6, "message");
                                    b17.a(a2, message6);
                                    if (queryIntentActivities.isEmpty()) {
                                        B b18 = this.c;
                                        b18.getClass();
                                        Intrinsics.checkNotNullParameter("No supported activity found to run the intent. Confirm you have enabled the package visibility if you think this is an error. https://developer.android.com/training/package-visibility", "message");
                                        b18.a(a2, "No supported activity found to run the intent. Confirm you have enabled the package visibility if you think this is an error. https://developer.android.com/training/package-visibility");
                                    } else {
                                        B b19 = this.c;
                                        b19.getClass();
                                        Intrinsics.checkNotNullParameter("Found supported activity, ready to run the intent.", "message");
                                        b19.a(a2, "Found supported activity, ready to run the intent.");
                                        intent6 = intent8;
                                    }
                                    if (a(intent6)) {
                                        B b20 = this.c;
                                        String message7 = "Url handled by a third party app: ".concat(parameters);
                                        b20.getClass();
                                        Intrinsics.checkNotNullParameter(message7, "message");
                                        b20.a(A.DEBUG, message7);
                                        return true;
                                    }
                                    B b21 = this.c;
                                    String message8 = "Url is opening without overridden: ".concat(parameters);
                                    b21.getClass();
                                    Intrinsics.checkNotNullParameter(message8, "message");
                                    b21.a(A.DEBUG, message8);
                                    return false;
                                }
                            }
                            intent5 = null;
                            if (!a(intent5)) {
                            }
                        }
                    }
                    intent4 = null;
                    if (!a(intent4)) {
                    }
                }
            }
        }
        B b22 = this.c;
        b22.getClass();
        Intrinsics.checkNotNullParameter("Url handled by intent.", "message");
        b22.a(A.DEBUG, "Url handled by intent.");
        return true;
    }

    public final boolean a(String str, boolean z) {
        if (str == null || z || !this.e || this.b.getHitTestResult().getType() == 0) {
            return false;
        }
        B b = this.c;
        b.getClass();
        Intrinsics.checkNotNullParameter("UniWebView is opening links in external browser.", "message");
        b.a(A.DEBUG, "UniWebView is opening links in external browser.");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        a(intent);
        return true;
    }

    public final boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            this.a.startActivity(intent);
            return true;
        } catch (Exception unused) {
            B b = this.c;
            String message = "No Activity found to handle Intent: " + intent.getData();
            b.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            b.a(A.CRITICAL, message);
            return false;
        }
    }
}
