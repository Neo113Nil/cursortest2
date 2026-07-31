package l1;

import android.content.Context;
import android.content.Intent;
import com.yandex.authsdk.YandexAuthToken;
import j1.C3184a;
import k1.k;
import k1.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC3253b;

/* loaded from: classes2.dex */
public final class e extends AbstractC3253b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f41315e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final Intent f41316b;

    /* renamed from: c, reason: collision with root package name */
    private final d f41317c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC3253b.AbstractC0236b f41318d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intent intent = new Intent("com.yandex.auth.action.YA_SDK_LOGIN");
            intent.setPackage(packageName);
            return intent;
        }

        public final AbstractC3253b b(k packageManagerHelper) {
            Intrinsics.checkNotNullParameter(packageManagerHelper, "packageManagerHelper");
            k.b b4 = packageManagerHelper.b();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (b4 != null) {
                return new e(a(b4.c()), defaultConstructorMarker);
            }
            return null;
        }

        private a() {
        }
    }

    public static final class b implements AbstractC3253b.c {
        @Override // l1.AbstractC3253b.c
        public YandexAuthToken a(Intent data) {
            Intrinsics.checkNotNullParameter(data, "data");
            String stringExtra = data.getStringExtra("com.yandex.auth.EXTRA_OAUTH_TOKEN");
            long longExtra = data.getLongExtra("com.yandex.auth.OAUTH_TOKEN_EXPIRES", 0L);
            if (stringExtra != null) {
                return new YandexAuthToken(stringExtra, longExtra);
            }
            return null;
        }

        @Override // l1.AbstractC3253b.c
        public C3184a b(Intent data) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!data.getBooleanExtra("com.yandex.auth.OAUTH_TOKEN_ERROR", false)) {
                return null;
            }
            String[] stringArrayExtra = data.getStringArrayExtra("com.yandex.auth.OAUTH_TOKEN_ERROR_MESSAGES");
            return stringArrayExtra != null ? new C3184a(stringArrayExtra) : new C3184a("connection.error");
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
            return AbstractC3253b.f41305a.b(e.this.f41316b, input.b());
        }
    }

    public /* synthetic */ e(Intent intent, DefaultConstructorMarker defaultConstructorMarker) {
        this(intent);
    }

    @Override // l1.AbstractC3253b
    public d b() {
        return this.f41317c;
    }

    @Override // l1.AbstractC3253b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC3253b.AbstractC0236b a() {
        return this.f41318d;
    }

    private e(Intent intent) {
        this.f41316b = intent;
        this.f41317c = d.NATIVE;
        this.f41318d = new c(new b());
    }
}
