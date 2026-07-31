package g;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f16206a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f16207b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Intent f16208a;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<Bundle> f16209b;

        /* renamed from: c, reason: collision with root package name */
        private Bundle f16210c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList<Bundle> f16211d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f16212e;

        public a() {
            this(null);
        }

        public a(e eVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f16208a = intent;
            this.f16209b = null;
            this.f16210c = null;
            this.f16211d = null;
            this.f16212e = true;
            if (eVar != null) {
                intent.setPackage(eVar.b().getPackageName());
            }
            Bundle bundle = new Bundle();
            j.b.b(bundle, "android.support.customtabs.extra.SESSION", eVar != null ? eVar.a() : null);
            intent.putExtras(bundle);
        }

        public c a() {
            ArrayList<Bundle> arrayList = this.f16209b;
            if (arrayList != null) {
                this.f16208a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f16211d;
            if (arrayList2 != null) {
                this.f16208a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f16208a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f16212e);
            return new c(this.f16208a, this.f16210c);
        }
    }

    c(Intent intent, Bundle bundle) {
        this.f16206a = intent;
        this.f16207b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f16206a.setData(uri);
        androidx.core.content.a.d(context, this.f16206a, this.f16207b);
    }
}
