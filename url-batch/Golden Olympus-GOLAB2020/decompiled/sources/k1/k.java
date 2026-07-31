package k1;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.authsdk.YandexAuthOptions;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final a f40994d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final String f40995e = k.class.getSimpleName();

    /* renamed from: f, reason: collision with root package name */
    private static final List f40996f = CollectionsKt.listOf((Object[]) new String[]{"com.yandex.browser", "ru.yandex.searchplugin", "com.yandex.searchapp", "ru.yandex.taxi", "ru.yandex.mail", "ru.yandex.disk", "com.yandex.bank", "ru.yandex.key", "ru.yandex.auth.client"});

    /* renamed from: a, reason: collision with root package name */
    private final String f40997a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageManager f40998b;

    /* renamed from: c, reason: collision with root package name */
    private final YandexAuthOptions f40999c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] bArr) {
            BigInteger bigInteger = new BigInteger(1, bArr);
            L l4 = L.f41137a;
            String format = String.format("%0" + (bArr.length << 1) + 'X', Arrays.copyOf(new Object[]{bigInteger}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            return format;
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f41000a;

        /* renamed from: b, reason: collision with root package name */
        private final int f41001b;

        /* renamed from: c, reason: collision with root package name */
        private final float f41002c;

        /* renamed from: d, reason: collision with root package name */
        private final float f41003d;

        public b(String packageName, int i4, float f4, int i5) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            this.f41000a = packageName;
            this.f41001b = i4;
            this.f41002c = f4;
            this.f41003d = i5;
        }

        public final float a() {
            return this.f41003d;
        }

        public final float b() {
            return this.f41002c;
        }

        public final String c() {
            return this.f41000a;
        }
    }

    public k(String myPackageName, PackageManager packageManager, YandexAuthOptions options) {
        Intrinsics.checkNotNullParameter(myPackageName, "myPackageName");
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f40997a = myPackageName;
        this.f40998b = packageManager;
        this.f40999c = options;
    }

    private final List a(String str) {
        try {
            List b4 = g.b(this.f40998b, str);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b4, 10));
            Iterator it = b4.iterator();
            while (it.hasNext()) {
                arrayList.add(f40994d.b((byte[]) it.next()));
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e4) {
            j jVar = j.f40993a;
            YandexAuthOptions yandexAuthOptions = this.f40999c;
            String TAG = f40995e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            jVar.b(yandexAuthOptions, TAG, "Error getting fingerprint", e4);
            return null;
        } catch (NoSuchAlgorithmException e5) {
            j jVar2 = j.f40993a;
            YandexAuthOptions yandexAuthOptions2 = this.f40999c;
            String TAG2 = f40995e;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            jVar2.b(yandexAuthOptions2, TAG2, "Error getting fingerprint", e5);
            return null;
        }
    }

    private final List c() {
        ArrayList arrayList = new ArrayList();
        for (ApplicationInfo applicationInfo : g.c(this.f40998b, 128L)) {
            if (!TextUtils.equals(applicationInfo.packageName, this.f40997a) && f40996f.contains(applicationInfo.packageName) && applicationInfo.enabled) {
                Bundle bundle = applicationInfo.metaData;
                String packageName = applicationInfo.packageName;
                if (bundle != null && bundle.containsKey("com.yandex.auth.LOGIN_SDK_VERSION") && bundle.containsKey("com.yandex.auth.VERSION")) {
                    Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                    List a4 = a(packageName);
                    if (a4 != null && a4.contains("5D224274D9377C35DA777AD934C65C8CCA6E7A20")) {
                        PackageManager packageManager = this.f40998b;
                        String str = applicationInfo.packageName;
                        Intrinsics.checkNotNullExpressionValue(str, "applicationInfo.packageName");
                        if (d(packageManager, str)) {
                            arrayList.add(new b(packageName, bundle.getInt("com.yandex.auth.LOGIN_SDK_VERSION"), bundle.getFloat("com.yandex.auth.VERSION"), bundle.getInt("com.yandex.auth.INTERNAL_VERSION", -1)));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final boolean d(PackageManager packageManager, String str) {
        return !g.h(packageManager, l1.e.f41315e.a(str), 0L, 2, null).isEmpty();
    }

    public final b b() {
        b bVar = null;
        for (b bVar2 : c()) {
            if (bVar == null || bVar2.b() > bVar.b() || bVar2.a() > bVar.a()) {
                bVar = bVar2;
            }
        }
        return bVar;
    }
}
