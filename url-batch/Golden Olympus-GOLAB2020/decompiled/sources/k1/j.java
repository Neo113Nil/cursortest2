package k1;

import android.util.Log;
import com.yandex.authsdk.YandexAuthOptions;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f40993a = new j();

    private j() {
    }

    public final void a(YandexAuthOptions options, String tag, String message) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (options.e()) {
            Log.d(tag, message);
        }
    }

    public final void b(YandexAuthOptions options, String tag, String message, Throwable e4) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(e4, "e");
        if (options.e()) {
            Log.e(tag, message, e4);
        }
    }
}
