package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f11000a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f11001b;

    private static class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* renamed from: androidx.browser.customtabs.b$b, reason: collision with other inner class name */
    private static class C0081b {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    private static class c {
        static void a(ActivityOptions activityOptions, boolean z4) {
            activityOptions.setShareIdentityEnabled(z4);
        }
    }

    public static final class d {

        /* renamed from: c, reason: collision with root package name */
        private ArrayList f11004c;

        /* renamed from: d, reason: collision with root package name */
        private ActivityOptions f11005d;

        /* renamed from: e, reason: collision with root package name */
        private ArrayList f11006e;

        /* renamed from: f, reason: collision with root package name */
        private SparseArray f11007f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f11008g;

        /* renamed from: j, reason: collision with root package name */
        private boolean f11011j;

        /* renamed from: a, reason: collision with root package name */
        private final Intent f11002a = new Intent("android.intent.action.VIEW");

        /* renamed from: b, reason: collision with root package name */
        private final a.C0080a f11003b = new a.C0080a();

        /* renamed from: h, reason: collision with root package name */
        private int f11009h = 0;

        /* renamed from: i, reason: collision with root package name */
        private boolean f11010i = true;

        private void b() {
            String a4 = C0081b.a();
            if (TextUtils.isEmpty(a4)) {
                return;
            }
            Bundle bundleExtra = this.f11002a.hasExtra("com.android.browser.headers") ? this.f11002a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", a4);
            this.f11002a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f11002a.putExtras(bundle);
        }

        private void d() {
            if (this.f11005d == null) {
                this.f11005d = a.a();
            }
            c.a(this.f11005d, this.f11011j);
        }

        public b a() {
            if (!this.f11002a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f11004c;
            if (arrayList != null) {
                this.f11002a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f11006e;
            if (arrayList2 != null) {
                this.f11002a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f11002a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f11010i);
            this.f11002a.putExtras(this.f11003b.a().a());
            Bundle bundle = this.f11008g;
            if (bundle != null) {
                this.f11002a.putExtras(bundle);
            }
            if (this.f11007f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f11007f);
                this.f11002a.putExtras(bundle2);
            }
            this.f11002a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f11009h);
            int i4 = Build.VERSION.SDK_INT;
            b();
            if (i4 >= 34) {
                d();
            }
            ActivityOptions activityOptions = this.f11005d;
            return new b(this.f11002a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public d e(int i4) {
            this.f11003b.b(i4);
            return this;
        }
    }

    b(Intent intent, Bundle bundle) {
        this.f11000a = intent;
        this.f11001b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f11000a.setData(uri);
        androidx.core.content.a.q(context, this.f11000a, this.f11001b);
    }
}
