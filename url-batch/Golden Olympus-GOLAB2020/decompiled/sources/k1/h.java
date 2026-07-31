package k1;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.b9;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.YandexAuthToken;
import j1.C3184a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final l f40989a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f40990b;

    /* renamed from: c, reason: collision with root package name */
    private final m f40991c;

    public h(l preferencesHelper, Function0 stateGenerator, m urlCreator) {
        Intrinsics.checkNotNullParameter(preferencesHelper, "preferencesHelper");
        Intrinsics.checkNotNullParameter(stateGenerator, "stateGenerator");
        Intrinsics.checkNotNullParameter(urlCreator, "urlCreator");
        this.f40989a = preferencesHelper;
        this.f40990b = stateGenerator;
        this.f40991c = urlCreator;
    }

    private final String d() {
        return this.f40989a.a();
    }

    private final void e(String str) {
        this.f40989a.b(str);
    }

    public final String a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Object e4 = g.e(intent, "com.yandex.authsdk.EXTRA_OPTIONS", YandexAuthOptions.class);
        Intrinsics.checkNotNull(e4);
        String str = (String) this.f40990b.invoke();
        e(str);
        return this.f40991c.d((YandexAuthOptions) e4, str);
    }

    public final boolean b(YandexAuthOptions options, String url) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(url, "url");
        return StringsKt.K(url, this.f40991c.b(options), false, 2, null);
    }

    public final Intent c(Uri data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String d4 = d();
        Uri parse = Uri.parse("dummy://dummy?" + data.getFragment());
        Intent intent = new Intent();
        String queryParameter = parse.getQueryParameter(b9.h.f15456P);
        if (TextUtils.isEmpty(queryParameter) || !Intrinsics.areEqual(queryParameter, d4)) {
            intent.putExtra("com.yandex.authsdk.EXTRA_ERROR", new C3184a("security.error"));
            return intent;
        }
        String queryParameter2 = parse.getQueryParameter("error");
        if (queryParameter2 != null) {
            intent.putExtra("com.yandex.authsdk.EXTRA_ERROR", new C3184a(queryParameter2));
            return intent;
        }
        String queryParameter3 = parse.getQueryParameter("access_token");
        String queryParameter4 = parse.getQueryParameter("expires_in");
        long parseLong = queryParameter4 != null ? Long.parseLong(queryParameter4) : Long.MAX_VALUE;
        if (queryParameter3 != null) {
            intent.putExtra("com.yandex.authsdk.EXTRA_TOKEN", new YandexAuthToken(queryParameter3, parseLong));
        }
        return intent;
    }
}
