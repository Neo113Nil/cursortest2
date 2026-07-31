package j1;

import com.yandex.authsdk.YandexAuthOptions;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f40852a = a.f40853a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f40853a = new a();

        private a() {
        }

        public final c a(YandexAuthOptions options) {
            Intrinsics.checkNotNullParameter(options, "options");
            return new e(options);
        }
    }

    static c b(YandexAuthOptions yandexAuthOptions) {
        return f40852a.a(yandexAuthOptions);
    }

    d a();
}
