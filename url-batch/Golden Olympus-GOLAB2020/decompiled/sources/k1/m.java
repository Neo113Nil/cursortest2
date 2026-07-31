package k1;

import com.yandex.authsdk.YandexAuthOptions;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f41006a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f41007b = true;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final String a(YandexAuthOptions yandexAuthOptions) {
        String encode = URLEncoder.encode(b(yandexAuthOptions), "UTF-8");
        Intrinsics.checkNotNullExpressionValue(encode, "encode(createRedirectUrl(options), \"UTF-8\")");
        return encode;
    }

    private final String c(YandexAuthOptions yandexAuthOptions) {
        String d4 = yandexAuthOptions.d();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        return i.a(d4, locale);
    }

    public final String b(YandexAuthOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (f41007b) {
            L l4 = L.f41137a;
            String format = String.format("https://yx%s.%s/auth/finish?platform=android", Arrays.copyOf(new Object[]{options.c(), options.d()}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            return format;
        }
        L l5 = L.f41137a;
        String format2 = String.format("yx%s:///auth/finish?platform=android", Arrays.copyOf(new Object[]{options.c()}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
        return format2;
    }

    public final String d(YandexAuthOptions options, String state) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(state, "state");
        String a4 = a(options);
        L l4 = L.f41137a;
        String format = String.format("https://%s/authorize?response_type=token&client_id=%s&redirect_uri=%s&state=%s&force_confirm=true&origin=yandex_auth_sdk_android_v3", Arrays.copyOf(new Object[]{c(options), options.c(), a4, state}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        String sb = new StringBuilder(format).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "String.format(\n         …}\n            .toString()");
        return sb;
    }
}
