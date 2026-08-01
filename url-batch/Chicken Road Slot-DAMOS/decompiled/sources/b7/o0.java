package b7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.Serializable;
import java.util.ArrayList;
import s7.f1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1325a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1326b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f1327c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1328d;

    public o0() {
        this.f1326b = new Object();
        this.f1327c = new ArrayList();
        this.f1328d = new ArrayList();
        this.f1325a = true;
    }

    public synchronized void a() {
        try {
            if (this.f1325a) {
                return;
            }
            Boolean c10 = c();
            this.f1327c = c10;
            if (c10 == null) {
                a2.r rVar = new a2.r(11);
                l8.l lVar = (l8.l) ((t8.c) this.f1326b);
                lVar.a(lVar.f5925c, rVar);
            }
            this.f1325a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean b() {
        boolean z10;
        boolean z11;
        try {
            a();
            Boolean bool = (Boolean) this.f1327c;
            if (bool != null) {
                z11 = bool.booleanValue();
            } else {
                g8.g gVar = ((FirebaseMessaging) this.f1328d).f3078a;
                gVar.a();
                b9.a aVar = (b9.a) gVar.g.get();
                synchronized (aVar) {
                    z10 = aVar.f1468a;
                }
                z11 = z10;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z11;
    }

    public Boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        g8.g gVar = ((FirebaseMessaging) this.f1328d).f3078a;
        gVar.a();
        Context context = gVar.f4300a;
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

    public String d() {
        if (!this.f1325a) {
            this.f1325a = true;
            f1 f1Var = (f1) this.f1328d;
            this.f1327c = f1Var.w().getString((String) this.f1326b, null);
        }
        return (String) this.f1327c;
    }

    public void e(String str) {
        SharedPreferences.Editor edit = ((f1) this.f1328d).w().edit();
        edit.putString((String) this.f1326b, str);
        edit.apply();
        this.f1327c = str;
    }

    public o0(f1 f1Var, String str) {
        this.f1328d = f1Var;
        c7.c0.d(str);
        this.f1326b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0(h hVar, f fVar, z6.d[] dVarArr, boolean z10) {
        this.f1328d = hVar;
        this.f1326b = fVar;
        this.f1327c = dVarArr;
        this.f1325a = z10;
    }

    public o0(FirebaseMessaging firebaseMessaging, t8.c cVar) {
        this.f1328d = firebaseMessaging;
        this.f1326b = cVar;
    }
}
