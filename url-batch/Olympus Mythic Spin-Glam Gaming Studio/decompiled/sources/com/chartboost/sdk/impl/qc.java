package com.chartboost.sdk.impl;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.chartboost.sdk.impl.yb;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.ChartboostNetworkBridge;
import com.safedk.android.utils.Logger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class qc implements cd {
    public Context a;
    public final WebView b;
    public final yc c;
    public final ad d;
    public final bd e;
    public final gd f;
    public dd g;
    public id h;
    public Boolean i;
    public xc j;
    public Float k;
    public final Rect l;
    public final Runnable m;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[fd.values().length];
            try {
                iArr[fd.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fd.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fd.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public qc(Context context, WebView webView, yc placementType, ad orientationProvider, bd volumeProvider, gd synchronizerTask) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(orientationProvider, "orientationProvider");
        Intrinsics.checkNotNullParameter(volumeProvider, "volumeProvider");
        Intrinsics.checkNotNullParameter(synchronizerTask, "synchronizerTask");
        this.a = context;
        this.b = webView;
        this.c = placementType;
        this.d = orientationProvider;
        this.e = volumeProvider;
        this.f = synchronizerTask;
        this.h = new id(context);
        this.l = new Rect();
        Runnable runnable = new Runnable() { // from class: com.chartboost.sdk.impl.qc$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                qc.a(qc.this);
            }
        };
        this.m = runnable;
        synchronizerTask.a(runnable);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.c);
        p0.startActivity(p1);
    }

    public dd b() {
        return this.g;
    }

    public final boolean b(Uri uri) {
        re reVar;
        Intrinsics.checkNotNullParameter(uri, "uri");
        dd b = b();
        if (b == null) {
            return false;
        }
        Map c = c(uri);
        String str = (String) c.get("forceOrientation");
        if (str == null) {
            return false;
        }
        String str2 = (String) c.get("allowOrientationChange");
        boolean parseBoolean = str2 != null ? Boolean.parseBoolean(str2) : true;
        if (Intrinsics.areEqual(str, "landscape")) {
            reVar = re.d;
        } else if (Intrinsics.areEqual(str, "portrait")) {
            reVar = re.e;
        } else if (parseBoolean) {
            reVar = re.b;
        } else {
            reVar = re.c;
        }
        b.b(reVar);
        a(yb.b.a(fd.e));
        return true;
    }

    @Override // com.chartboost.sdk.impl.cd
    public void start() {
        e();
    }

    @Override // com.chartboost.sdk.impl.cd
    public void pause() {
        this.f.pause();
    }

    public /* synthetic */ qc(Context context, WebView webView, yc ycVar, ad adVar, bd bdVar, gd gdVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, webView, ycVar, (i & 8) != 0 ? new pc(context) : adVar, (i & 16) != 0 ? new rc(context) : bdVar, (i & 32) != 0 ? new hd(null, 0L, null, 7, null) : gdVar);
    }

    public final void e() {
        yb.a aVar = yb.b;
        a(aVar.b());
        a(aVar.b("9.12.1"));
        a(aVar.a(this.c));
        a(aVar.a(zc.c));
        f();
        a(aVar.a());
        this.f.start();
    }

    public final void f() {
        xc a2 = this.d.a();
        if (a2 != null && a2 != this.j) {
            this.j = a2;
            a(yb.b.a(a2, this.d.isLocked()));
        }
        this.h.a(this.b);
        d();
        Float a3 = this.e.a();
        if (!Intrinsics.areEqual(a3, this.k)) {
            this.k = a3;
            a(yb.b.a(a3));
        }
        boolean a4 = a(this.b);
        if (Intrinsics.areEqual(Boolean.valueOf(a4), this.i)) {
            return;
        }
        this.i = Boolean.valueOf(a4);
        a(yb.b.a(a4));
    }

    public final void d() {
        if (this.h.a().a()) {
            a(yb.b.b(this.h));
        }
        if (this.h.b().a()) {
            a(yb.b.c(this.h));
        }
        if (this.h.c().a()) {
            yb.a aVar = yb.b;
            a(aVar.d(this.h));
            a(aVar.a(this.h));
        }
        if (this.h.d().a()) {
            a(yb.b.e(this.h));
        }
    }

    public final void a(yb ybVar) {
        xb.a("MRAID command: " + ybVar.a(), (Throwable) null, 2, (Object) null);
        ChartboostNetworkBridge.webviewLoadUrl(this.b, "javascript:" + ybVar.a());
    }

    public final boolean c() {
        dd b = b();
        if (b == null) {
            return false;
        }
        b.a(wl.b);
        return true;
    }

    public final boolean a(Uri uri, boolean z) {
        boolean a2;
        String host = uri.getHost();
        if (host == null) {
            return false;
        }
        try {
            int i = a.a[fd.c.a(host).ordinal()];
            if (i != 1) {
                if (i == 2) {
                    a2 = b(uri);
                } else if (i == 3) {
                    a2 = c();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (z) {
                a2 = a(uri);
            } else {
                xb.e("MRAID open command was not preceded with a recognized gesture.", null, 2, null);
                a(yb.b.a(fd.d));
                return true;
            }
            return a2;
        } catch (IllegalArgumentException e) {
            xb.e("Invalid MRAID command: " + host, e);
            return true;
        }
    }

    public final Map c(Uri uri) {
        List split$default;
        String query = uri.getQuery();
        if (query != null && (split$default = StringsKt.split$default((CharSequence) query, new String[]{X3.j.c}, false, 0, 6, (Object) null)) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(split$default, 10)), 16));
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                List split$default2 = StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 2, 2, (Object) null);
                Pair pair = TuplesKt.to((String) split$default2.get(0), split$default2.size() > 1 ? (String) split$default2.get(1) : "");
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            return linkedHashMap;
        }
        return MapsKt.emptyMap();
    }

    public final boolean b(Uri uri, boolean z) {
        xb.a("Attempting to open URI with Intent: " + uri, (Throwable) null, 2, (Object) null);
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.a, intent);
            xb.a("Successfully started activity for URI: " + uri, (Throwable) null, 2, (Object) null);
            dd b = b();
            if (b == null) {
                return true;
            }
            b.a(null, ul.c, z);
            return true;
        } catch (ActivityNotFoundException unused) {
            xb.e("MRAID URI open failed: uri=" + uri + ", scheme=" + uri.getScheme() + ", errorType=ActivityNotFoundException", null, 2, null);
            return false;
        } catch (SecurityException e) {
            xb.b("MRAID URI security error: uri=" + uri + ", scheme=" + uri.getScheme() + ", errorType=SecurityException, message=" + e.getMessage(), e);
            return false;
        } catch (Exception e2) {
            xb.b("MRAID URI open error: uri=" + uri + ", scheme=" + uri.getScheme() + ", errorType=" + e2.getClass().getSimpleName() + ", message=" + e2.getMessage(), e2);
            return false;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x007e -> B:23:0x009a). Please report as a decompilation issue!!! */
    public final boolean a(Uri uri) {
        String str;
        String str2 = (String) c(uri).get("url");
        if (str2 == null) {
            return false;
        }
        dd b = b();
        try {
            Uri parse = Uri.parse(str2);
            String scheme = parse.getScheme();
            if (scheme != null) {
                str = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (!Intrinsics.areEqual(str, "http") && !Intrinsics.areEqual(str, "https")) {
                xb.a("MRAID open: Handling as non-standard URI (deeplink, custom scheme, etc.): " + parse, (Throwable) null, 2, (Object) null);
                b(parse, true);
            } else {
                try {
                    URL url = new URL(str2);
                    if (b != null) {
                        b.a(str2, ul.b, true);
                    } else {
                        xb.e("MRAID open: No listener, attempting to open standard URL with Intent: " + url, null, 2, null);
                        b(parse, true);
                    }
                } catch (MalformedURLException e) {
                    str2 = "MRAID open: Malformed standard URL '" + str2 + "', attempting to open with Intent as fallback.";
                    xb.e(str2, e);
                    b(parse, true);
                }
            }
            a(yb.b.a(fd.d));
            return true;
        } catch (Exception e2) {
            xb.b("MRAID open URL parse failed: urlString=" + str2 + ", errorType=" + e2.getClass().getSimpleName() + ", message=" + e2.getMessage(), e2);
            a(yb.b.a(fd.d));
            return true;
        }
    }

    @Override // com.chartboost.sdk.impl.cd
    public boolean a(WebResourceRequest request, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(request, "request");
        Uri url = request.getUrl();
        String scheme = url.getScheme();
        if (scheme != null) {
            int hashCode = scheme.hashCode();
            if (hashCode != -1368728362) {
                if (hashCode == 104156535 && scheme.equals("mraid")) {
                    Intrinsics.checkNotNull(url);
                    return a(url, z2);
                }
            } else if (scheme.equals("cb-log")) {
                String uri = url.toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                xb.c(uri, null, 2, null);
                return true;
            }
        }
        if (!z2) {
            xb.e("WebView navigation suppressed: no user gesture. uri=" + url, null, 2, null);
            return true;
        }
        if (z) {
            return false;
        }
        try {
            URL url2 = new URL(url.toString());
            dd b = b();
            if (b == null) {
                return true;
            }
            b.a(url2.toString(), ul.c, z2);
            return true;
        } catch (MalformedURLException e) {
            xb.a("WebView click: Malformed or non-standard URL '" + url + "', attempting to open with Intent.", e);
            Intrinsics.checkNotNull(url);
            b(url, z2);
            return true;
        }
    }

    public final boolean a(View view) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null || !view.getGlobalVisibleRect(this.l)) {
            return false;
        }
        long height = this.l.height() * this.l.width();
        if (view.getHeight() * view.getWidth() > 0 && height > 0) {
            return view.isShown();
        }
        return false;
    }

    public static final void a(qc this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f();
    }

    @Override // com.chartboost.sdk.impl.cd
    public void a() {
        this.f.a();
    }

    @Override // com.chartboost.sdk.impl.cd
    public void a(dd ddVar) {
        this.g = ddVar;
    }

    @Override // com.chartboost.sdk.impl.cd
    public void a(nh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f.cancel();
    }
}
