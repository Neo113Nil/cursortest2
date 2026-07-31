package k1;

import com.yandex.authsdk.YandexAuthLoginOptions;
import com.yandex.authsdk.YandexAuthOptions;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final YandexAuthOptions f41008a;

    /* renamed from: b, reason: collision with root package name */
    private final YandexAuthLoginOptions f41009b;

    public n(YandexAuthOptions options, YandexAuthLoginOptions loginOptions) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(loginOptions, "loginOptions");
        this.f41008a = options;
        this.f41009b = loginOptions;
    }

    public final YandexAuthLoginOptions a() {
        return this.f41009b;
    }

    public final YandexAuthOptions b() {
        return this.f41008a;
    }
}
