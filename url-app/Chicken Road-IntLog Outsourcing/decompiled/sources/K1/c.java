package K1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import d2.C0397a;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Y1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1380c;

    public /* synthetic */ c(Context context, String str) {
        this.f1378a = 2;
        this.f1380c = context;
        this.f1379b = str;
    }

    @Override // Y1.a
    public final Object get() {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f1378a) {
            case 0:
                g gVar = (g) this.f1379b;
                String d6 = gVar.d();
                Context context = (Context) this.f1380c;
                C0397a c0397a = new C0397a();
                Context a6 = v.c.a(context);
                SharedPreferences sharedPreferences = a6.getSharedPreferences("com.google.firebase.common.prefs:" + d6, 0);
                boolean z5 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = a6.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(a6.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z5 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    z = z5;
                }
                c0397a.f5480a = z;
                return c0397a;
            case 1:
                N1.f fVar = (N1.f) this.f1379b;
                fVar.getClass();
                N1.a aVar = (N1.a) this.f1380c;
                return aVar.f2001f.d(new B.d(aVar, fVar));
            default:
                return new W1.i((Context) this.f1380c, (String) this.f1379b);
        }
    }

    public /* synthetic */ c(Object obj, int i2, Object obj2) {
        this.f1378a = i2;
        this.f1379b = obj;
        this.f1380c = obj2;
    }
}
