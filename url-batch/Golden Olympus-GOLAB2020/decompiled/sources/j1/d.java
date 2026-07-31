package j1;

import android.content.Context;
import android.content.Intent;
import com.yandex.authsdk.YandexAuthLoginOptions;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.YandexAuthToken;
import com.yandex.authsdk.internal.AuthSdkActivity;
import d.AbstractC2398a;
import j1.b;
import k1.g;
import k1.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends AbstractC2398a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f40854b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final YandexAuthOptions f40855a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "<this>");
            Object e4 = g.e(intent, "com.yandex.authsdk.EXTRA_OPTIONS", YandexAuthOptions.class);
            Intrinsics.checkNotNull(e4);
            Object e5 = g.e(intent, "com.yandex.authsdk.EXTRA_LOGIN_OPTIONS", YandexAuthLoginOptions.class);
            Intrinsics.checkNotNull(e5);
            return new n((YandexAuthOptions) e4, (YandexAuthLoginOptions) e5);
        }

        private a() {
        }
    }

    public d(YandexAuthOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f40855a = options;
    }

    @Override // d.AbstractC2398a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, YandexAuthLoginOptions input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intent = new Intent(context, (Class<?>) AuthSdkActivity.class);
        intent.putExtra("com.yandex.authsdk.EXTRA_OPTIONS", this.f40855a);
        intent.putExtra("com.yandex.authsdk.EXTRA_LOGIN_OPTIONS", input);
        return intent;
    }

    @Override // d.AbstractC2398a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public b c(int i4, Intent intent) {
        if (intent == null || i4 != -1) {
            return b.a.f40849a;
        }
        C3184a c3184a = (C3184a) g.f(intent, "com.yandex.authsdk.EXTRA_ERROR", C3184a.class);
        if (c3184a != null) {
            return new b.C0221b(c3184a);
        }
        YandexAuthToken yandexAuthToken = (YandexAuthToken) g.e(intent, "com.yandex.authsdk.EXTRA_TOKEN", YandexAuthToken.class);
        return yandexAuthToken != null ? new b.c(yandexAuthToken) : b.a.f40849a;
    }
}
