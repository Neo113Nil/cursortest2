package l1;

import android.content.Context;
import android.content.Intent;
import com.yandex.authsdk.YandexAuthToken;
import com.yandex.authsdk.internal.WebViewLoginActivity;
import j1.C3184a;
import k1.g;
import k1.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC3253b;

/* loaded from: classes2.dex */
public final class f extends AbstractC3253b {

    /* renamed from: d, reason: collision with root package name */
    public static final a f41320d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final d f41321b = d.WEBVIEW;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3253b.AbstractC0236b f41322c = new c(new b());

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC3253b a() {
            return new f();
        }

        private a() {
        }
    }

    public static final class b implements AbstractC3253b.c {
        @Override // l1.AbstractC3253b.c
        public YandexAuthToken a(Intent data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return (YandexAuthToken) g.e(data, "com.yandex.authsdk.EXTRA_TOKEN", YandexAuthToken.class);
        }

        @Override // l1.AbstractC3253b.c
        public C3184a b(Intent data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return (C3184a) g.f(data, "com.yandex.authsdk.EXTRA_ERROR", C3184a.class);
        }
    }

    public static final class c extends AbstractC3253b.AbstractC0236b {
        c(b bVar) {
            super(bVar);
        }

        @Override // d.AbstractC2398a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, n input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intent = new Intent(context, (Class<?>) WebViewLoginActivity.class);
            AbstractC3253b.f41305a.a(intent, input.b(), input.a());
            return intent;
        }
    }

    @Override // l1.AbstractC3253b
    public d b() {
        return this.f41321b;
    }

    @Override // l1.AbstractC3253b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC3253b.AbstractC0236b a() {
        return this.f41322c;
    }
}
