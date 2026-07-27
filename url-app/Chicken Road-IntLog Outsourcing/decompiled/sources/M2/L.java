package M2;

import E.C0028c;
import G0.C0060j;
import G0.InterfaceC0055e;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import d2.C0397a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class L implements InterfaceC0055e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1844a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1845b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f1846c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1847d;

    public L(M m6, C0102f c0102f, Long l2) {
        this.f1847d = m6;
        this.f1845b = c0102f;
        this.f1846c = l2;
        this.f1844a = false;
    }

    public int[] a() {
        synchronized (this) {
            try {
                if (!this.f1844a) {
                    return null;
                }
                long[] jArr = (long[]) this.f1845b;
                int length = jArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i6 = i3 + 1;
                    int i7 = 1;
                    boolean z = jArr[i2] > 0;
                    boolean[] zArr = (boolean[]) this.f1846c;
                    if (z != zArr[i3]) {
                        int[] iArr = (int[]) this.f1847d;
                        if (!z) {
                            i7 = 2;
                        }
                        iArr[i3] = i7;
                    } else {
                        ((int[]) this.f1847d)[i3] = 0;
                    }
                    zArr[i3] = z;
                    i2++;
                    i3 = i6;
                }
                this.f1844a = false;
                return (int[]) ((int[]) this.f1847d).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void b() {
        try {
            if (this.f1844a) {
                return;
            }
            Boolean d6 = d();
            this.f1846c = d6;
            if (d6 == null) {
                ((N1.k) ((V1.b) this.f1845b)).a(new C0028c(0));
            }
            this.f1844a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean c() {
        boolean z;
        boolean z5;
        try {
            b();
            Boolean bool = (Boolean) this.f1846c;
            if (bool != null) {
                z5 = bool.booleanValue();
            } else {
                K1.g gVar = ((FirebaseMessaging) this.f1847d).f5322a;
                gVar.a();
                C0397a c0397a = (C0397a) gVar.f1393g.get();
                synchronized (c0397a) {
                    z = c0397a.f5480a;
                }
                z5 = z;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z5;
    }

    public Boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        K1.g gVar = ((FirebaseMessaging) this.f1847d).f5322a;
        gVar.a();
        Context context = gVar.f1387a;
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

    @Override // G0.InterfaceC0055e
    public void onBillingServiceDisconnected() {
        B1.g gVar = ((M) this.f1847d).f1852e;
        l1.j jVar = new l1.j(7);
        gVar.getClass();
        new f2.t((H2.f) gVar.f215b, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onBillingServiceDisconnected", C0106j.f1877a, null).g(new ArrayList(Collections.singletonList((Long) this.f1846c)), new C0097a(jVar, 1, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onBillingServiceDisconnected"));
    }

    @Override // G0.InterfaceC0055e
    public void onBillingSetupFinished(C0060j c0060j) {
        if (this.f1844a) {
            Log.d("InAppPurchasePlugin", "Tried to call onBillingSetupFinished multiple times.");
            return;
        }
        this.f1844a = true;
        ((C0102f) this.f1845b).a(AbstractC1341c.j(c0060j));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public L(int i2) {
        this.f1845b = new long[i2];
        this.f1846c = new boolean[i2];
        this.f1847d = new int[i2];
    }

    public L(FirebaseMessaging firebaseMessaging, V1.b bVar) {
        this.f1847d = firebaseMessaging;
        this.f1845b = bVar;
    }
}
