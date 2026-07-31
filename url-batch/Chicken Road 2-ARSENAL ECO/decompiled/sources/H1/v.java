package H1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f997a;

    /* renamed from: b, reason: collision with root package name */
    public String f998b;

    /* renamed from: c, reason: collision with root package name */
    public String f999c;

    /* renamed from: d, reason: collision with root package name */
    public int f1000d;

    /* renamed from: e, reason: collision with root package name */
    public int f1001e = 0;

    public v(Context context) {
        this.f997a = context;
    }

    public static String b(m1.g gVar) {
        gVar.a();
        m1.i iVar = gVar.f5427c;
        String str = iVar.f5443e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = iVar.f5440b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        try {
            if (this.f998b == null) {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f998b;
    }

    public final PackageInfo c(String str) {
        try {
            return this.f997a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e4) {
            Log.w("FirebaseMessaging", "Failed to find package " + e4);
            return null;
        }
    }

    public final boolean d() {
        int i7;
        synchronized (this) {
            i7 = this.f1001e;
            if (i7 == 0) {
                PackageManager packageManager = this.f997a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i7 = 0;
                } else {
                    if (!Y0.b.b()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f1001e = 1;
                            i7 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (Y0.b.b()) {
                            this.f1001e = 2;
                        } else {
                            this.f1001e = 1;
                        }
                        i7 = this.f1001e;
                    } else {
                        this.f1001e = 2;
                        i7 = 2;
                    }
                }
            }
        }
        return i7 != 0;
    }

    public final synchronized void e() {
        PackageInfo c7 = c(this.f997a.getPackageName());
        if (c7 != null) {
            this.f998b = Integer.toString(c7.versionCode);
            this.f999c = c7.versionName;
        }
    }
}
