package android.support.customtabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.BundleCompat;
import java.util.ArrayList;

/* compiled from: CustomTabsIntent.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f1479a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f1480b;

    private c(Intent intent, Bundle bundle) {
        this.f1479a = intent;
        this.f1480b = bundle;
    }

    /* compiled from: CustomTabsIntent.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Intent f1481a;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<Bundle> f1482b;

        /* renamed from: c, reason: collision with root package name */
        private Bundle f1483c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList<Bundle> f1484d;
        private boolean e;

        public a() {
            this(null);
        }

        public a(e eVar) {
            this.f1481a = new Intent("android.intent.action.VIEW");
            this.f1482b = null;
            this.f1483c = null;
            this.f1484d = null;
            this.e = true;
            if (eVar != null) {
                this.f1481a.setPackage(eVar.b().getPackageName());
            }
            Bundle bundle = new Bundle();
            BundleCompat.putBinder(bundle, "android.support.customtabs.extra.SESSION", eVar != null ? eVar.a() : null);
            this.f1481a.putExtras(bundle);
        }

        public c a() {
            if (this.f1482b != null) {
                this.f1481a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", this.f1482b);
            }
            if (this.f1484d != null) {
                this.f1481a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", this.f1484d);
            }
            this.f1481a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.e);
            return new c(this.f1481a, this.f1483c);
        }
    }
}
