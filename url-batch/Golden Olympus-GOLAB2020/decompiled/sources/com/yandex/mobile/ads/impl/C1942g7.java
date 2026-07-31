package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.g7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1942g7 {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f26017A = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26018a = new C1866d3(1, "Received unsupported ad type", "Received unsupported ad type. We are already working on this issue.", null);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26019b = new C1866d3(5, "android.webkit.WebView database is inoperable", "android.webkit.WebViewDatabase is inoperable. Try using another device for testing.", null);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26020c = new C1866d3(1, "Internal state wasn't completely configured", "Internal state wasn't completely configured. Please try again later.", null);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26021d = new C1866d3(1, "Incorrect data in server response", "Failed to parse server's response. We are already working on this issue.", null);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26022e = new C1866d3(5, "android.webkit.WebView creation failed", "android.webkit.WebView creation failed. Try using another device for testing.", null);

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26023f = new C1866d3(1, "Invalid server response code", "Unexpected server response code. We are already working on this issue.", null);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26024g = new C1866d3(1, "Service temporarily unavailable", "Service temporarily unavailable. Please try again later.", null);

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26025h = new C1866d3(1, "The loaded banner can't fit in the container.", "The loaded banner can't fit in the container.", null);

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26026i = new C1866d3(1, "Banner rendering failed with timeout", "Banner rendering failed with timeout. Please try again.", null);

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26027j = new C1866d3(1, "Invalid SDK state.", "Invalid SDK state.", null);

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26028k = new C1866d3(1, "Invalid SDK state.", "Invalid SDK state.", null);

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26029l = new C1866d3(4, "Ad request completed successfully, but there are no ads available.", "Ad request completed successfully, but there are no ads available.", null);

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26030m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26031n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26032o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26033p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26034q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26035r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26036s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26037t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26038u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26039v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26040w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26041x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26042y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private static final C1866d3 f26043z;

    static {
        Intrinsics.checkNotNullParameter("Ad request configured incorrectly", "errorType");
        Intrinsics.checkNotNullParameter("Ad request configured incorrectly", "description");
        f26030m = new C1866d3(2, "Ad request configured incorrectly", "Ad request configured incorrectly", null);
        Intrinsics.checkNotNullParameter("Invalid request parameters", "errorType");
        Intrinsics.checkNotNullParameter("Invalid request parameters", "description");
        f26031n = new C1866d3(2, "Invalid request parameters", "Invalid request parameters", null);
        Intrinsics.checkNotNullParameter("Invalid Ad Unit Id. AdUnitId should be not empty string", "errorType");
        Intrinsics.checkNotNullParameter("Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.", "description");
        f26032o = new C1866d3(2, "Invalid Ad Unit Id. AdUnitId should be not empty string", "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.", null);
        Intrinsics.checkNotNullParameter("Invalid ad size. Please, specify AdSize excplicitly", "errorType");
        Intrinsics.checkNotNullParameter("Invalid ad size. Set the ad size using the 'setAdSize' method.", "description");
        f26033p = new C1866d3(2, "Invalid ad size. Please, specify AdSize excplicitly", "Invalid ad size. Set the ad size using the 'setAdSize' method.", null);
        f26034q = new C1866d3(1, "Invalid sdk configuration. Please request another ad.", "Invalid sdk configuration. Please request another ad.", null);
        f26035r = new C1866d3(5, "Device hasn't enough free memory.", "Device has not enough free memory.", null);
        f26036s = new C1866d3(2, "Feed ad preloading has already started", "Feed ad preloading was already started. You should use preloadAd method only once", null);
        f26037t = new C1866d3(3, "Ad request failed with network error", "Ad request failed with network error. Please try again later.", null);
        f26038u = new C1866d3(3, "Ad request failed with no connection error", "Ad request failed with network error. Please try again later.", null);
        f26039v = new C1866d3(3, "Ad request failed with timeout error", "Ad request failed with network error. Please try again later.", null);
        f26040w = new C1866d3(3, "Ad request failed with auth failure", "Ad request failed with network error. Please try again later.", null);
        f26041x = new C1866d3(3, "Ad request failed with client error", "Ad request failed with network error. Please try again later.", null);
        f26042y = new C1866d3(3, "Ad request failed with parse error", "Ad request failed with network error. Please try again later.", null);
        f26043z = new C1866d3(1, "Ad request failed with content preloading error", "Ad request failed with content preloading error. Please try again later", null);
    }

    @NotNull
    public static C1866d3 a(@NotNull String errorType, @NotNull String description) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(description, "description");
        return a(1, errorType, description);
    }

    @NotNull
    public static C1866d3 b() {
        return f26025h;
    }

    @NotNull
    public static C1866d3 c() {
        return f26041x;
    }

    @NotNull
    public static C1866d3 d() {
        return f26043z;
    }

    @NotNull
    public static C1866d3 e() {
        return f26033p;
    }

    @NotNull
    public static C1866d3 f() {
        return f26032o;
    }

    @NotNull
    public static C1866d3 g() {
        return f26028k;
    }

    @NotNull
    public static C1866d3 h() {
        return f26034q;
    }

    @NotNull
    public static C1866d3 i() {
        return f26027j;
    }

    @NotNull
    public static C1866d3 j() {
        return f26023f;
    }

    @NotNull
    public static C1866d3 k() {
        return f26021d;
    }

    @NotNull
    public static C1866d3 l() {
        return f26026i;
    }

    @NotNull
    public static C1866d3 m() {
        return f26020c;
    }

    @NotNull
    public static C1866d3 n() {
        return f26037t;
    }

    @NotNull
    public static C1866d3 o() {
        return f26035r;
    }

    @NotNull
    public static C1866d3 p() {
        return f26038u;
    }

    @NotNull
    public static C1866d3 q() {
        return f26029l;
    }

    @NotNull
    public static C1866d3 r() {
        return f26042y;
    }

    @NotNull
    public static C1866d3 s() {
        return f26036s;
    }

    @NotNull
    public static C1866d3 t() {
        return f26030m;
    }

    @NotNull
    public static C1866d3 u() {
        return f26031n;
    }

    @NotNull
    public static C1866d3 v() {
        return f26024g;
    }

    @NotNull
    public static C1866d3 w() {
        return f26039v;
    }

    @NotNull
    public static C1866d3 x() {
        return f26018a;
    }

    @NotNull
    public static C1866d3 y() {
        return f26022e;
    }

    @NotNull
    public static C1866d3 z() {
        return f26019b;
    }

    @NotNull
    public static C1866d3 a(@Nullable String str) {
        String str2;
        String errorType;
        if (str != null && str.length() != 0) {
            str2 = "Provided AdUnitId '%s' does not exist! Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.";
            errorType = "Provided ad unit id doesn't exist";
        } else {
            str2 = "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.";
            errorType = "Invalid Ad Unit Id. AdUnitId should be not empty string";
        }
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        String description = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(description, "format(...)");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(description, "description");
        return new C1866d3(2, errorType, description, null);
    }

    @NotNull
    public static C1866d3 a() {
        return f26040w;
    }

    @NotNull
    public static C1866d3 a(int i4, int i5, int i6, int i7, int i8, int i9) {
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        String format = String.format(Locale.US, "Ad was loaded successfully, but there is not enough space to display it. Requested size: [%dx%d], Received size : [%dx%d], device screen size: [%dx%d].", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)}, 6));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return new C1866d3(1, "Ad was loaded successfully, but there is not enough space to display it", format, null);
    }

    private static C1866d3 a(int i4, String str, String str2) {
        return new C1866d3(i4, str, str2, null);
    }
}
