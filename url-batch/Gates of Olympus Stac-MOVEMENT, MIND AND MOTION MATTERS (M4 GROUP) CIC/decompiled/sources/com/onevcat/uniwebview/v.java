package com.onevcat.uniwebview;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.imaginationoverflow.unity.referrer.BuildConfig;
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
public final class v {
    public final Context a;
    public final w b;
    public final o c;
    public final Set d;
    public boolean e;

    public v(Context context, w delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = context;
        this.b = delegate;
        o oVar = o.b;
        this.c = m.a();
        this.d = SetsKt.mutableSetOf("uniwebview");
    }

    public final boolean a(String str, boolean z) {
        if (str == null || z || !this.e || ((b0) this.b).getHitTestResult().getType() == 0) {
            return false;
        }
        o oVar = this.c;
        oVar.getClass();
        Intrinsics.checkNotNullParameter("UniWebView is opening links in external browser.", "message");
        oVar.a(n.DEBUG, "UniWebView is opening links in external browser.");
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
            y4 y4Var = UniWebViewInterface.Companion;
            h0 h0Var = new h0(str, url);
            y4Var.getClass();
            j0 a = y4.a(h0Var);
            if (a != null) {
                try {
                    if (!a.b.getBoolean("result")) {
                        return true;
                    }
                } catch (Exception e) {
                    o oVar = o.b;
                    String message = "Exception during parsing result for `ShouldUniWebViewHandleRequest`: " + e + ". Result from managed code: " + a.a;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(message, "message");
                    oVar.a(n.CRITICAL, message);
                }
            }
        }
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String url2 = url.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(url2, "this as java.lang.String).toLowerCase(locale)");
        Intent intent6 = null;
        if (StringsKt.startsWith$default(url2, "file:", false, 2, (Object) null)) {
            b0 b0Var = (b0) this.b;
            if (b0Var.getSettings().getAllowFileAccess()) {
                o oVar2 = o.b;
                oVar2.getClass();
                Intrinsics.checkNotNullParameter("Loading a local file. The local file loading will never be overridden.", "message");
                oVar2.a(n.DEBUG, "Loading a local file. The local file loading will never be overridden.");
                return false;
            }
            o oVar3 = o.b;
            oVar3.getClass();
            Intrinsics.checkNotNullParameter("Local file loading is disabled. To enable loading from a `file://` URL, call `SetAllowFileAccess` with true.", "message");
            oVar3.a(n.INFO, "Local file loading is disabled. To enable loading from a `file://` URL, call `SetAllowFileAccess` with true.");
            b0Var.c.a(b0Var.b, h5.PageErrorReceived, new c5(BuildConfig.FLAVOR, "-1", "Local file loading is disabled.", null));
            return true;
        }
        if (StringsKt.startsWith$default(url2, "uniwebviewinternal://", false, 2, (Object) null)) {
            if (StringsKt.contains$default((CharSequence) url2, (CharSequence) "__uniwebview_internal_video_end", false, 2, (Object) null)) {
                ((b0) this.b).d.onHideCustomView();
            }
            o oVar4 = this.c;
            oVar4.getClass();
            Intrinsics.checkNotNullParameter("Url handled internally in UniWebView", "message");
            oVar4.a(n.DEBUG, "Url handled internally in UniWebView");
            return true;
        }
        Intrinsics.checkNotNullParameter(url2, "url");
        o oVar5 = this.c;
        oVar5.a(n.VERBOSE, d.a("Checking url could match with a defined url scheme: ", url2, oVar5, "message"));
        Set set = this.d;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(url2, ((String) it.next()) + "://", false, 2, (Object) null)) {
                    o oVar6 = this.c;
                    oVar6.a(n.VERBOSE, d.a("Found url matching scheme: ", url2, oVar6, "message"));
                    o oVar7 = this.c;
                    String message2 = "Url handled by defined scheme. Redirected to Unity. ".concat(url);
                    oVar7.getClass();
                    Intrinsics.checkNotNullParameter(message2, "message");
                    oVar7.a(n.DEBUG, message2);
                    b0 b0Var2 = (b0) this.b;
                    b0Var2.getClass();
                    Intrinsics.checkNotNullParameter(url, "url");
                    b0Var2.c.a(b0Var2.b, h5.MessageReceived, url);
                    return true;
                }
            }
        }
        o oVar8 = this.c;
        oVar8.a(n.VERBOSE, d.a("Did not find a matched scheme for: ", url2, oVar8, "message"));
        if (StringsKt.startsWith$default(url2, "sms:", false, 2, (Object) null)) {
            o oVar9 = this.c;
            oVar9.getClass();
            Intrinsics.checkNotNullParameter("Received sms url...", "message");
            oVar9.a(n.DEBUG, "Received sms url...");
            intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
        } else {
            intent = null;
        }
        if (!a(intent)) {
            if (StringsKt.startsWith$default(url2, "tel:", false, 2, (Object) null)) {
                o oVar10 = this.c;
                oVar10.getClass();
                Intrinsics.checkNotNullParameter("Received tel url...", "message");
                oVar10.a(n.DEBUG, "Received tel url...");
                intent2 = new Intent("android.intent.action.DIAL", Uri.parse(url));
            } else {
                intent2 = null;
            }
            if (!a(intent2)) {
                if (StringsKt.startsWith$default(url2, "mailto:", false, 2, (Object) null)) {
                    o oVar11 = this.c;
                    oVar11.getClass();
                    Intrinsics.checkNotNullParameter("Received mailto url...", "message");
                    oVar11.a(n.DEBUG, "Received mailto url...");
                    intent3 = new Intent("android.intent.action.SENDTO", Uri.parse(url));
                } else {
                    intent3 = null;
                }
                if (!a(intent3)) {
                    if (StringsKt.startsWith$default(url2, "intent:", false, 2, (Object) null)) {
                        o oVar12 = this.c;
                        oVar12.getClass();
                        Intrinsics.checkNotNullParameter("Received intent url...", "message");
                        oVar12.a(n.DEBUG, "Received intent url...");
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
                            o oVar13 = this.c;
                            String message3 = "Parsing intent url error: " + e2 + ".message";
                            oVar13.getClass();
                            Intrinsics.checkNotNullParameter(message3, "message");
                            oVar13.a(n.CRITICAL, message3);
                        }
                        if (!a(intent4)) {
                            if (StringsKt.startsWith$default(url2, "market:", false, 2, (Object) null)) {
                                o oVar14 = this.c;
                                oVar14.getClass();
                                Intrinsics.checkNotNullParameter("Received market url...", "message");
                                oVar14.a(n.DEBUG, "Received market url...");
                                try {
                                    intent5 = Intent.parseUri(url, 1);
                                } catch (Exception e3) {
                                    o oVar15 = this.c;
                                    String message4 = "Parsing market url error. " + e3.getMessage();
                                    oVar15.getClass();
                                    Intrinsics.checkNotNullParameter(message4, "message");
                                    oVar15.a(n.CRITICAL, message4);
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
                                        o oVar16 = this.c;
                                        String message5 = "Url handled by a third party app: ".concat(url);
                                        oVar16.getClass();
                                        Intrinsics.checkNotNullParameter(message5, "message");
                                        oVar16.a(n.DEBUG, message5);
                                        return true;
                                    }
                                    o oVar17 = this.c;
                                    String message6 = "Url is opening without overridden: ".concat(url);
                                    oVar17.getClass();
                                    Intrinsics.checkNotNullParameter(message6, "message");
                                    oVar17.a(n.DEBUG, message6);
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
        o oVar18 = this.c;
        oVar18.getClass();
        Intrinsics.checkNotNullParameter("Url handled by intent.", "message");
        oVar18.a(n.DEBUG, "Url handled by intent.");
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
            o oVar = this.c;
            String message = "No Activity found to handle Intent: " + intent.getData();
            oVar.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            oVar.a(n.CRITICAL, message);
            return false;
        }
    }
}
