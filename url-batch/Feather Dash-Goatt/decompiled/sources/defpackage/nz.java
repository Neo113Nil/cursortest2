package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nz {
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;

    public nz() {
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = true;
    }

    public synchronized boolean a() {
        boolean z;
        boolean z2;
        try {
            synchronized (this) {
                try {
                    if (!this.a) {
                        Boolean b = b();
                        this.c = b;
                        if (b == null) {
                            ((dw) ((gf1) this.b)).a(new af(26));
                        }
                        this.a = true;
                    }
                } finally {
                }
            }
            return z2;
        } catch (Throwable th) {
            throw th;
        }
        Boolean bool = (Boolean) this.c;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            ez ezVar = ((FirebaseMessaging) this.d).a;
            ezVar.a();
            lo loVar = (lo) ezVar.g.get();
            synchronized (loVar) {
                z = loVar.a;
            }
            z2 = z;
        }
        return z2;
    }

    public Boolean b() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        ez ezVar = ((FirebaseMessaging) this.d).a;
        ezVar.a();
        Context context = ezVar.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public nz(pe0 pe0Var, df1 df1Var, uy0 uy0Var) {
        this.b = pe0Var;
        this.c = df1Var;
        this.d = uy0Var;
        this.a = true;
    }

    public nz(FirebaseMessaging firebaseMessaging, gf1 gf1Var) {
        this.d = firebaseMessaging;
        this.b = gf1Var;
    }
}
