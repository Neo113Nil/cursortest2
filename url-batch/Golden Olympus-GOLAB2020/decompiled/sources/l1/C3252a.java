package l1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.yandex.authsdk.YandexAuthToken;
import com.yandex.authsdk.internal.ChromeTabLoginActivity;
import j1.C3184a;
import java.util.ArrayList;
import java.util.List;
import k1.g;
import k1.n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC3253b;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3252a extends AbstractC3253b {

    /* renamed from: e, reason: collision with root package name */
    public static final C0235a f41300e = new C0235a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f41301b;

    /* renamed from: c, reason: collision with root package name */
    private final d f41302c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC3253b.AbstractC0236b f41303d;

    /* renamed from: l1.a$a, reason: collision with other inner class name */
    public static final class C0235a {
        public /* synthetic */ C0235a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC3253b a(PackageManager packageManager) {
            ActivityInfo activityInfo;
            Intrinsics.checkNotNullParameter(packageManager, "packageManager");
            List h4 = g.h(packageManager, new Intent("android.intent.action.VIEW", Uri.parse("https://ya.ru")), 0L, 2, null);
            ArrayList arrayList = new ArrayList();
            for (Object obj : h4) {
                Intent intent = new Intent();
                intent.setAction("android.support.customtabs.action.CustomTabsService");
                intent.setPackage(((ResolveInfo) obj).activityInfo.packageName);
                if (g.j(packageManager, intent, 0L, 2, null) != null) {
                    arrayList.add(obj);
                }
            }
            ResolveInfo resolveInfo = (ResolveInfo) CollectionsKt.getOrNull(arrayList, 0);
            String str = (resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null) ? null : activityInfo.packageName;
            if (str != null) {
                return new C3252a(str);
            }
            return null;
        }

        private C0235a() {
        }
    }

    /* renamed from: l1.a$b */
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

    /* renamed from: l1.a$c */
    public static final class c extends AbstractC3253b.AbstractC0236b {
        c(b bVar) {
            super(bVar);
        }

        @Override // d.AbstractC2398a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, n input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intent = new Intent(context, (Class<?>) ChromeTabLoginActivity.class);
            intent.putExtra("com.yandex.authsdk.internal.EXTRA_PACKAGE_NAME", C3252a.this.f41301b);
            AbstractC3253b.f41305a.a(intent, input.b(), input.a());
            return intent;
        }
    }

    public C3252a(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.f41301b = packageName;
        this.f41302c = d.CHROME_TAB;
        this.f41303d = new c(new b());
    }

    @Override // l1.AbstractC3253b
    public d b() {
        return this.f41302c;
    }

    @Override // l1.AbstractC3253b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC3253b.AbstractC0236b a() {
        return this.f41303d;
    }
}
