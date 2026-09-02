package m1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.onesignal.inAppMessages.internal.display.impl.a;
import p1.C0576a;
import u.AbstractC0668c;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements A1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5418c;

    public /* synthetic */ c(Context context, String str) {
        this.f5416a = 2;
        this.f5418c = context;
        this.f5417b = str;
    }

    @Override // A1.a
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f5416a) {
            case 0:
                g gVar = (g) this.f5417b;
                Context context = (Context) this.f5418c;
                String d7 = gVar.d();
                F1.a aVar = new F1.a();
                Context a7 = AbstractC0668c.a(context);
                SharedPreferences sharedPreferences = a7.getSharedPreferences("com.google.firebase.common.prefs:" + d7, 0);
                boolean z5 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z5 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = a7.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(a7.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z5 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.f708a = z5;
                return aVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                p1.d dVar = (p1.d) this.f5417b;
                C0576a c0576a = (C0576a) this.f5418c;
                return c0576a.f5665f.b(new A.e(c0576a, dVar));
            default:
                return new y1.h((Context) this.f5418c, (String) this.f5417b);
        }
    }

    public /* synthetic */ c(Object obj, int i7, Object obj2) {
        this.f5416a = i7;
        this.f5417b = obj;
        this.f5418c = obj2;
    }
}
