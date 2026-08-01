package g8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.se;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements w8.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4294c;

    public /* synthetic */ c(Context context, String str) {
        this.f4292a = 2;
        this.f4294c = context;
        this.f4293b = str;
    }

    @Override // w8.a
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f4292a) {
            case 0:
                g gVar = (g) this.f4293b;
                Context context = (Context) this.f4294c;
                String d10 = gVar.d();
                b9.a aVar = new b9.a();
                Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(d10), 0);
                boolean z10 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.f1468a = z10;
                return aVar;
            case 1:
                l8.g gVar2 = (l8.g) this.f4293b;
                l8.b bVar = (l8.b) this.f4294c;
                return bVar.f5903f.b(new se(bVar, gVar2));
            default:
                return new u8.g((Context) this.f4294c, (String) this.f4293b);
        }
    }

    public /* synthetic */ c(int i3, Object obj, Object obj2) {
        this.f4292a = i3;
        this.f4293b = obj;
        this.f4294c = obj2;
    }
}
