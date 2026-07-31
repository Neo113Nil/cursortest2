package l1;

import android.content.Intent;
import com.yandex.authsdk.YandexAuthLoginOptions;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.YandexAuthToken;
import d.AbstractC2398a;
import j1.C3184a;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3253b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f41305a = new a(null);

    /* renamed from: l1.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Intent intent, YandexAuthOptions options, YandexAuthLoginOptions loginOptions) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(loginOptions, "loginOptions");
            intent.putExtra("com.yandex.authsdk.EXTRA_OPTIONS", options);
            intent.putExtra("com.yandex.authsdk.EXTRA_LOGIN_OPTIONS", loginOptions);
            return intent;
        }

        public final Intent b(Intent intent, YandexAuthOptions options) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(options, "options");
            intent.putExtra("com.yandex.auth.CLIENT_ID", options.c());
            intent.putExtra("com.yandex.auth.USE_TESTING_ENV", options.f());
            intent.putExtra("com.yandex.auth.FORCE_CONFIRM", true);
            return intent;
        }

        private a() {
        }
    }

    /* renamed from: l1.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0236b extends AbstractC2398a {

        /* renamed from: a, reason: collision with root package name */
        private final c f41306a;

        public AbstractC0236b(c extractor) {
            Intrinsics.checkNotNullParameter(extractor, "extractor");
            this.f41306a = extractor;
        }

        @Override // d.AbstractC2398a
        public /* bridge */ /* synthetic */ Object c(int i4, Intent intent) {
            return Result.a(d(i4, intent));
        }

        public Object d(int i4, Intent intent) {
            if (intent == null || i4 != -1) {
                return Result.m243constructorimpl(null);
            }
            YandexAuthToken a4 = this.f41306a.a(intent);
            if (a4 != null) {
                return Result.m243constructorimpl(a4);
            }
            C3184a b4 = this.f41306a.b(intent);
            if (b4 == null) {
                return Result.m243constructorimpl(null);
            }
            Result.Companion companion = Result.Companion;
            return Result.m243constructorimpl(ResultKt.createFailure(b4));
        }
    }

    /* renamed from: l1.b$c */
    public interface c {
        YandexAuthToken a(Intent intent);

        C3184a b(Intent intent);
    }

    public abstract AbstractC2398a a();

    public abstract d b();
}
