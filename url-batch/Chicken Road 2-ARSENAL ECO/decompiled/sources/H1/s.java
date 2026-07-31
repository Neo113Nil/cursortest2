package H1;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import n.AbstractC0535c;
import n.AbstractC0536d;
import n.AbstractC0537e;
import n.BinderC0533a;
import u0.C0675e;
import x1.InterfaceC0727b;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f988a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f989b;

    /* renamed from: c, reason: collision with root package name */
    public Object f990c;

    /* renamed from: d, reason: collision with root package name */
    public Object f991d;

    public s() {
        this.f989b = new Intent("android.intent.action.VIEW");
        this.f990c = new R0.g();
        this.f988a = true;
    }

    public C0675e a() {
        Intent intent = (Intent) this.f989b;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f988a);
        ((R0.g) this.f990c).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i7 = Build.VERSION.SDK_INT;
        String a7 = AbstractC0536d.a();
        if (!TextUtils.isEmpty(a7)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a7);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i7 >= 34) {
            if (((ActivityOptions) this.f991d) == null) {
                this.f991d = AbstractC0535c.a();
            }
            AbstractC0537e.a((ActivityOptions) this.f991d, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f991d;
        return new C0675e(intent, 12, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public int[] b() {
        synchronized (this) {
            try {
                if (!this.f988a) {
                    return null;
                }
                long[] jArr = (long[]) this.f989b;
                int length = jArr.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    int i9 = i8 + 1;
                    int i10 = 1;
                    boolean z5 = jArr[i7] > 0;
                    boolean[] zArr = (boolean[]) this.f990c;
                    if (z5 != zArr[i8]) {
                        int[] iArr = (int[]) this.f991d;
                        if (!z5) {
                            i10 = 2;
                        }
                        iArr[i8] = i10;
                    } else {
                        ((int[]) this.f991d)[i8] = 0;
                    }
                    zArr[i8] = z5;
                    i7++;
                    i8 = i9;
                }
                this.f988a = false;
                return (int[]) ((int[]) this.f991d).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean c() {
        boolean z5;
        boolean z6;
        try {
            synchronized (this) {
                try {
                    if (!this.f988a) {
                        Boolean d7 = d();
                        this.f990c = d7;
                        if (d7 == null) {
                            ((p1.i) ((InterfaceC0727b) this.f989b)).a(new B1.g(7));
                        }
                        this.f988a = true;
                    }
                } finally {
                }
            }
            return z6;
        } catch (Throwable th) {
            throw th;
        }
        Boolean bool = (Boolean) this.f990c;
        if (bool != null) {
            z6 = bool.booleanValue();
        } else {
            m1.g gVar = ((FirebaseMessaging) this.f991d).f3901a;
            gVar.a();
            F1.a aVar = (F1.a) gVar.f5431g.get();
            synchronized (aVar) {
                z5 = aVar.f708a;
            }
            z6 = z5;
        }
        return z6;
    }

    public Boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        m1.g gVar = ((FirebaseMessaging) this.f991d).f3901a;
        gVar.a();
        Context context = gVar.f5425a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public s(int i7) {
        this.f989b = new long[i7];
        this.f990c = new boolean[i7];
        this.f991d = new int[i7];
    }

    public s(B0.c cVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f989b = intent;
        this.f990c = new R0.g();
        this.f988a = true;
        intent.setPackage(((ComponentName) cVar.f71g).getPackageName());
        BinderC0533a binderC0533a = (BinderC0533a) cVar.f73i;
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", binderC0533a);
        intent.putExtras(bundle);
    }

    public s(FirebaseMessaging firebaseMessaging, InterfaceC0727b interfaceC0727b) {
        this.f991d = firebaseMessaging;
        this.f989b = interfaceC0727b;
    }
}
