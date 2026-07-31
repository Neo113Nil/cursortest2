package j1;

import com.yandex.authsdk.YandexAuthOptions;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    private final YandexAuthOptions f40856b;

    public e(YandexAuthOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f40856b = options;
    }

    @Override // j1.c
    public d a() {
        return new d(this.f40856b);
    }
}
