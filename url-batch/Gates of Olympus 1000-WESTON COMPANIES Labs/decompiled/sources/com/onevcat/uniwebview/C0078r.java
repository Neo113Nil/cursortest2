package com.onevcat.uniwebview;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.core.net.MailTo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.onevcat.uniwebview.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0078r {
    public final Context a;
    public final InterfaceC0081s b;
    public final C0060l c;
    public final Set d;
    public boolean e;

    public C0078r(Context context, InterfaceC0081s delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = context;
        this.b = delegate;
        C0060l c0060l = C0060l.b;
        this.c = C0060l.b;
        this.d = SetsKt.mutableSetOf("uniwebview");
    }

    public final boolean a(String str, boolean z) {
        if (str == null || z || !this.e || ((C0093w) this.b).getHitTestResult().getType() == 0) {
            return false;
        }
        C0060l c0060l = this.c;
        c0060l.getClass();
        Intrinsics.checkNotNullParameter("UniWebView is opening links in external browser.", "message");
        c0060l.a(EnumC0057k.DEBUG, "UniWebView is opening links in external browser.");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        a(intent);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String url, boolean z, String str) {
        Intent intent;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        Intent intent5;
        Intrinsics.checkNotNullParameter(url, "url");
        if (str != null) {
            U1 u1 = UniWebViewInterface.Companion;
            C c = new C(str, url);
            u1.getClass();
            E a = U1.a(c);
            if (a != null) {
                try {
                    if (!a.b.getBoolean("result")) {
                        return true;
                    }
                } catch (Exception e) {
                    C0060l c0060l = C0060l.b;
                    String message = "Exception during parsing result for `ShouldUniWebViewHandleRequest`: " + e + ". Result from managed code: " + a.a;
                    c0060l.getClass();
                    Intrinsics.checkNotNullParameter(message, "message");
                    c0060l.a(EnumC0057k.CRITICAL, message);
                }
            }
        }
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String url2 = url.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(url2, "this as java.lang.String).toLowerCase(locale)");
        Intent intent6 = null;
        if (StringsKt.startsWith$default(url2, "file:", false, 2, (Object) null)) {
            C0093w c0093w = (C0093w) this.b;
            if (c0093w.getSettings().getAllowFileAccess()) {
                C0060l c0060l2 = C0060l.b;
                c0060l2.getClass();
                Intrinsics.checkNotNullParameter("Loading a local file. The local file loading will never be overridden.", "message");
                c0060l2.a(EnumC0057k.DEBUG, "Loading a local file. The local file loading will never be overridden.");
                return false;
            }
            C0060l c0060l3 = C0060l.b;
            c0060l3.getClass();
            Intrinsics.checkNotNullParameter("Local file loading is disabled. To enable loading from a `file://` URL, call `SetAllowFileAccess` with true.", "message");
            c0060l3.a(EnumC0057k.INFO, "Local file loading is disabled. To enable loading from a `file://` URL, call `SetAllowFileAccess` with true.");
            c0093w.c.a(c0093w.b, d2.PageErrorReceived, new Y1("", "-1", "Local file loading is disabled.", null));
            return true;
        }
        if (StringsKt.startsWith$default(url2, "uniwebviewinternal://", false, 2, (Object) null)) {
            if (StringsKt.contains$default((CharSequence) url2, (CharSequence) "__uniwebview_internal_video_end", false, 2, (Object) null)) {
                ((C0093w) this.b).d.onHideCustomView();
            }
            C0060l c0060l4 = this.c;
            c0060l4.getClass();
            Intrinsics.checkNotNullParameter("Url handled internally in UniWebView", "message");
            c0060l4.a(EnumC0057k.DEBUG, "Url handled internally in UniWebView");
            return true;
        }
        Intrinsics.checkNotNullParameter(url2, "url");
        C0060l c0060l5 = this.c;
        c0060l5.a(EnumC0057k.VERBOSE, AbstractC0075q.a("Checking url could match with a defined url scheme: ", url2, c0060l5, "message"));
        Set set = this.d;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(url2, ((String) it.next()) + "://", false, 2, (Object) null)) {
                    C0060l c0060l6 = this.c;
                    c0060l6.a(EnumC0057k.VERBOSE, AbstractC0075q.a("Found url matching scheme: ", url2, c0060l6, "message"));
                    C0060l c0060l7 = this.c;
                    String message2 = "Url handled by defined scheme. Redirected to Unity. ".concat(url);
                    c0060l7.getClass();
                    Intrinsics.checkNotNullParameter(message2, "message");
                    c0060l7.a(EnumC0057k.DEBUG, message2);
                    C0093w c0093w2 = (C0093w) this.b;
                    c0093w2.getClass();
                    Intrinsics.checkNotNullParameter(url, "url");
                    c0093w2.c.a(c0093w2.b, d2.MessageReceived, url);
                    return true;
                }
            }
        }
        C0060l c0060l8 = this.c;
        c0060l8.a(EnumC0057k.VERBOSE, AbstractC0075q.a("Did not find a matched scheme for: ", url2, c0060l8, "message"));
        if (StringsKt.startsWith$default(url2, "sms:", false, 2, (Object) null)) {
            C0060l c0060l9 = this.c;
            c0060l9.getClass();
            Intrinsics.checkNotNullParameter("Received sms url...", "message");
            c0060l9.a(EnumC0057k.DEBUG, "Received sms url...");
            intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
        } else {
            intent = null;
        }
        if (!a(intent)) {
            if (StringsKt.startsWith$default(url2, "tel:", false, 2, (Object) null)) {
                C0060l c0060l10 = this.c;
                c0060l10.getClass();
                Intrinsics.checkNotNullParameter("Received tel url...", "message");
                c0060l10.a(EnumC0057k.DEBUG, "Received tel url...");
                intent2 = new Intent("android.intent.action.DIAL", Uri.parse(url));
            } else {
                intent2 = null;
            }
            if (!a(intent2)) {
                if (StringsKt.startsWith$default(url2, MailTo.MAILTO_SCHEME, false, 2, (Object) null)) {
                    C0060l c0060l11 = this.c;
                    c0060l11.getClass();
                    Intrinsics.checkNotNullParameter("Received mailto url...", "message");
                    c0060l11.a(EnumC0057k.DEBUG, "Received mailto url...");
                    intent3 = new Intent("android.intent.action.SENDTO", Uri.parse(url));
                } else {
                    intent3 = null;
                }
                if (!a(intent3)) {
                    if (StringsKt.startsWith$default(url2, "intent:", false, 2, (Object) null)) {
                        C0060l c0060l12 = this.c;
                        c0060l12.getClass();
                        Intrinsics.checkNotNullParameter("Received intent url...", "message");
                        c0060l12.a(EnumC0057k.DEBUG, "Received intent url...");
                        try {
                            intent4 = Intent.parseUri(url, 1);
                            if (this.a.getPackageManager().resolveActivity(intent4, 65536) == null) {
                                String str2 = intent4.getPackage();
                                if (str2 != null) {
                                    Intent intent7 = new Intent("android.intent.action.VIEW");
                                    intent7.setData(Uri.parse("market://details?id=".concat(str2)));
                                    intent4 = intent7;
                                }
                            }
                        } catch (Exception e2) {
                            C0060l c0060l13 = this.c;
                            String message3 = "Parsing intent url error: " + e2 + ".message";
                            c0060l13.getClass();
                            Intrinsics.checkNotNullParameter(message3, "message");
                            c0060l13.a(EnumC0057k.CRITICAL, message3);
                        }
                        if (!a(intent4)) {
                            if (StringsKt.startsWith$default(url2, "market:", false, 2, (Object) null)) {
                                C0060l c0060l14 = this.c;
                                c0060l14.getClass();
                                Intrinsics.checkNotNullParameter("Received market url...", "message");
                                c0060l14.a(EnumC0057k.DEBUG, "Received market url...");
                                try {
                                    intent5 = Intent.parseUri(url, 1);
                                } catch (Exception e3) {
                                    C0060l c0060l15 = this.c;
                                    String message4 = "Parsing market url error. " + e3.getMessage();
                                    c0060l15.getClass();
                                    Intrinsics.checkNotNullParameter(message4, "message");
                                    c0060l15.a(EnumC0057k.CRITICAL, message4);
                                }
                                if (!a(intent5)) {
                                    if (a(url, z)) {
                                        return true;
                                    }
                                    List listOf = CollectionsKt.listOf((Object[]) new String[]{"http:", "https:", "file:", "about:blank"});
                                    if (!(listOf instanceof Collection) || !listOf.isEmpty()) {
                                        Iterator it2 = listOf.iterator();
                                        while (it2.hasNext()) {
                                            if (StringsKt.startsWith$default(url2, (String) it2.next(), false, 2, (Object) null)) {
                                                break;
                                            }
                                        }
                                    }
                                    Intent intent8 = new Intent("android.intent.action.VIEW", Uri.parse(url));
                                    List<ResolveInfo> queryIntentActivities = this.a.getPackageManager().queryIntentActivities(intent8, 0);
                                    Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
                                    if (!queryIntentActivities.isEmpty()) {
                                        intent6 = intent8;
                                    }
                                    if (a(intent6)) {
                                        C0060l c0060l16 = this.c;
                                        String message5 = "Url handled by a third party app: ".concat(url);
                                        c0060l16.getClass();
                                        Intrinsics.checkNotNullParameter(message5, "message");
                                        c0060l16.a(EnumC0057k.DEBUG, message5);
                                        return true;
                                    }
                                    C0060l c0060l17 = this.c;
                                    String message6 = "Url is opening without overridden: ".concat(url);
                                    c0060l17.getClass();
                                    Intrinsics.checkNotNullParameter(message6, "message");
                                    c0060l17.a(EnumC0057k.DEBUG, message6);
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
        C0060l c0060l18 = this.c;
        c0060l18.getClass();
        Intrinsics.checkNotNullParameter("Url handled by intent.", "message");
        c0060l18.a(EnumC0057k.DEBUG, "Url handled by intent.");
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
            C0060l c0060l = this.c;
            String message = "No Activity found to handle Intent: " + intent.getData();
            c0060l.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0060l.a(EnumC0057k.CRITICAL, message);
            return false;
        }
    }
}
