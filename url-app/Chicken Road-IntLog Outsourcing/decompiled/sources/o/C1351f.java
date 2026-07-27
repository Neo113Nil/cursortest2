package o;

import B4.i;
import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import b2.AbstractC0279e;
import l1.j;

/* renamed from: o.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1351f {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f11476a;

    /* renamed from: b, reason: collision with root package name */
    public final j f11477b;

    /* renamed from: c, reason: collision with root package name */
    public ActivityOptions f11478c;

    /* renamed from: d, reason: collision with root package name */
    public SparseArray f11479d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f11480e;

    /* renamed from: f, reason: collision with root package name */
    public int f11481f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11482g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11483h;

    public C1351f() {
        this.f11476a = new Intent("android.intent.action.VIEW");
        this.f11477b = new j(28);
        this.f11481f = 0;
        this.f11482g = true;
    }

    public final B0.e a() {
        Intent intent = this.f11476a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f11482g);
        this.f11477b.getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = this.f11480e;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        if (this.f11479d != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f11479d);
            intent.putExtras(bundle3);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f11481f);
        int i2 = Build.VERSION.SDK_INT;
        String a6 = AbstractC1349d.a();
        if (!TextUtils.isEmpty(a6)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a6);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i2 >= 34) {
            if (this.f11478c == null) {
                this.f11478c = AbstractC1348c.a();
            }
            AbstractC1350e.a(this.f11478c, this.f11483h);
        }
        ActivityOptions activityOptions = this.f11478c;
        return new B0.e(intent, 11, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public final void b(int i2, i iVar) {
        if (i2 < 0 || i2 > 2 || i2 == 0) {
            throw new IllegalArgumentException(AbstractC0279e.d(i2, "Invalid colorScheme: "));
        }
        if (this.f11479d == null) {
            this.f11479d = new SparseArray();
        }
        this.f11479d.put(i2, iVar.U());
    }

    public final void c(int i2, int i3) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
        }
        if (i3 < 0 || i3 > 2) {
            throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
        }
        Intent intent = this.f11476a;
        intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i2);
        intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i3);
    }

    public C1351f(i iVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f11476a = intent;
        this.f11477b = new j(28);
        this.f11481f = 0;
        this.f11482g = true;
        if (iVar != null) {
            intent.setPackage(((ComponentName) iVar.f313d).getPackageName());
            BinderC1346a binderC1346a = (BinderC1346a) iVar.f312c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", binderC1346a);
            intent.putExtras(bundle);
        }
    }
}
