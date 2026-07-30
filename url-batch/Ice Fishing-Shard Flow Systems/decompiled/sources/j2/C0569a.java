package j2;

import P1.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import b2.C0270a;
import b2.InterfaceC0271b;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0569a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5948a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f5949b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0271b f5950c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5951d;

    public C0569a(Context context, String str, InterfaceC0271b interfaceC0271b) {
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        this.f5948a = createDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f5949b = sharedPreferences;
        this.f5950c = interfaceC0271b;
        this.f5951d = sharedPreferences.contains("firebase_data_collection_default_enabled") ? sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true) : a();
    }

    public final boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context = this.f5948a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public final synchronized void b(boolean z7) {
        if (this.f5951d != z7) {
            this.f5951d = z7;
            this.f5950c.a(new C0270a(new b(0)));
        }
    }
}
