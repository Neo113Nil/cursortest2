package q;

import I.B;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f7288a;

    /* renamed from: b, reason: collision with root package name */
    public final c2.e f7289b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f7290c;

    /* renamed from: d, reason: collision with root package name */
    public ActivityOptions f7291d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f7292e;

    /* renamed from: f, reason: collision with root package name */
    public int f7293f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7294g;

    public h() {
        this.f7288a = new Intent("android.intent.action.VIEW");
        this.f7289b = new c2.e();
        this.f7293f = 0;
        this.f7294g = true;
    }

    public final i a() {
        Intent intent = this.f7288a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        ArrayList<? extends Parcelable> arrayList = this.f7290c;
        if (arrayList != null) {
            intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f7294g);
        this.f7289b.getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = this.f7292e;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f7293f);
        int i2 = Build.VERSION.SDK_INT;
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i2 >= 34) {
            if (this.f7291d == null) {
                this.f7291d = ActivityOptions.makeBasic();
            }
            B.h(this.f7291d);
        }
        if (i2 >= 36) {
            if (this.f7291d == null) {
                this.f7291d = ActivityOptions.makeBasic();
            }
            J.e.e(this.f7291d, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = this.f7291d;
        return new i(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public final void b(int i2) {
        if (i2 < 0 || i2 > 2) {
            throw new IllegalArgumentException("Invalid value for the shareState argument");
        }
        this.f7293f = i2;
        Intent intent = this.f7288a;
        if (i2 == 1) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        } else if (i2 == 2) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        } else {
            intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
        }
    }

    public h(n nVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f7288a = intent;
        this.f7289b = new c2.e();
        this.f7293f = 0;
        this.f7294g = true;
        if (nVar != null) {
            intent.setPackage(nVar.f7306d.getPackageName());
            f fVar = nVar.f7305c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", fVar);
            intent.putExtras(bundle);
        }
    }
}
