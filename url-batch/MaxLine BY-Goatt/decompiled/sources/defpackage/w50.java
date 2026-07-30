package defpackage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w50 {
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;

    public w50(int i, boolean z) {
        switch (i) {
            case 2:
                this.b = new Object();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.a = true;
                break;
            default:
                this.b = new Intent("android.intent.action.VIEW");
                this.c = new ar0(19, false);
                this.a = true;
                break;
        }
    }

    public t21 a() {
        Intent intent = (Intent) this.b;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.a);
        Integer num = (Integer) ((ar0) this.c).n;
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        intent.putExtras(bundle2);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            if (((ActivityOptions) this.d) == null) {
                this.d = ActivityOptions.makeBasic();
            }
            v1.q((ActivityOptions) this.d);
        }
        if (i >= 36) {
            if (((ActivityOptions) this.d) == null) {
                this.d = ActivityOptions.makeBasic();
            }
            e2.f((ActivityOptions) this.d, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = (ActivityOptions) this.d;
        return new t21(12, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public void b(boolean z) {
        ob0 ob0Var = (ob0) this.d;
        synchronized (ob0Var) {
            try {
                if (this.a) {
                    throw new IllegalStateException("editor is closed");
                }
                if (Intrinsics.b(((lb0) this.b).g, this)) {
                    ob0.b(ob0Var, this, z);
                }
                this.a = true;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public qz1 c(int i) {
        qz1 qz1Var;
        ob0 ob0Var = (ob0) this.d;
        synchronized (ob0Var) {
            if (this.a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.c)[i] = true;
            Object obj = ((lb0) this.b).d.get(i);
            nb0 nb0Var = ob0Var.B;
            qz1 qz1Var2 = (qz1) obj;
            if (!nb0Var.f(qz1Var2)) {
                l.a(nb0Var.k(qz1Var2));
            }
            qz1Var = (qz1) obj;
        }
        return qz1Var;
    }

    public String d() {
        if (!this.a) {
            this.a = true;
            qi3 qi3Var = (qi3) this.d;
            this.c = qi3Var.A().getString((String) this.b, null);
        }
        return (String) this.c;
    }

    public void e(String str) {
        SharedPreferences.Editor edit = ((qi3) this.d).A().edit();
        edit.putString((String) this.b, str);
        edit.apply();
        this.c = str;
    }

    public w50(int i) {
        this.b = new ReentrantLock();
        this.c = new long[i];
        this.d = new boolean[i];
    }

    public w50(ob0 ob0Var, lb0 lb0Var) {
        this.d = ob0Var;
        this.b = lb0Var;
        this.c = new boolean[2];
    }

    public w50(qi3 qi3Var, String str) {
        this.d = qi3Var;
        ll3.s(str);
        this.b = str;
    }

    public w50(z50 z50Var) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.b = intent;
        this.c = new ar0(19, false);
        this.a = true;
        if (z50Var != null) {
            intent.setPackage(z50Var.c.getPackageName());
            u50 u50Var = z50Var.b;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", u50Var);
            intent.putExtras(bundle);
        }
    }
}
