package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gj2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f26181a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f26182b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f26183c = 0;

    static {
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        Locale locale = Locale.US;
        String format = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%3$s) { \n      return %4$s.%1$s(%2$s, %3$s); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", Arrays.copyOf(new Object[]{"onAdRender", "document.querySelector('#rtb').offsetHeight", "testTag", "AdPerformActionsJSI"}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        f26181a = format;
        String format2 = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function() { \n      return %2$s.%1$s(); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", Arrays.copyOf(new Object[]{"getBannerInfo", "AdPerformActionsJSI"}, 2));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        f26182b = format2;
    }

    @NotNull
    public static String a(int i4, int i5) {
        return StringsKt.f("\n\n        <style>ytag.container { width:" + i4 + "px; height:" + i5 + "px; }</style>\n\n        ");
    }

    @NotNull
    public static String b() {
        return f26181a;
    }

    @NotNull
    public static String a(int i4) {
        return "<body style='width:" + i4 + "px;'>";
    }

    @NotNull
    public static String a() {
        return f26182b;
    }
}
