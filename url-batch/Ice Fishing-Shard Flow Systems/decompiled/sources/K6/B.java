package K6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import x1.AbstractC1000b;
import z1.C1054b;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public int f1480a;

    /* renamed from: b, reason: collision with root package name */
    public int f1481b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1482c;

    public B(Context context) {
        this.f1481b = 0;
        this.f1482c = context;
    }

    public byte[] a() {
        int i2 = this.f1480a;
        ArrayList arrayList = (ArrayList) this.f1482c;
        if (i2 < arrayList.size()) {
            int i5 = this.f1480a;
            this.f1480a = i5 + 1;
            return (byte[]) arrayList.get(i5);
        }
        byte[] bArr = new byte[this.f1481b];
        arrayList.add(bArr);
        this.f1480a++;
        return bArr;
    }

    public synchronized int b() {
        int i2 = this.f1481b;
        if (i2 != 0) {
            return i2;
        }
        Context context = (Context) this.f1482c;
        PackageManager packageManager = context.getPackageManager();
        if (C1054b.a(context).f3070a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i5 = 1;
        if (!AbstractC1000b.b()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f1481b = i5;
                return i5;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i5 = 2;
            this.f1481b = i5;
            return i5;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == AbstractC1000b.b()) {
            i5 = 2;
        }
        this.f1481b = i5;
        return i5;
    }

    public synchronized int c() {
        PackageInfo packageInfo;
        if (this.f1480a == 0) {
            try {
                packageInfo = C1054b.a((Context) this.f1482c).f3070a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e7) {
                Log.w("Metadata", "Failed to find package ".concat(e7.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f1480a = packageInfo.versionCode;
            }
        }
        return this.f1480a;
    }

    public B(int i2) {
        this.f1482c = new ArrayList();
        this.f1481b = i2;
    }

    public B() {
        this.f1482c = new B[256];
        this.f1480a = 0;
        this.f1481b = 0;
    }

    public B(int i2, int i5) {
        this.f1482c = null;
        this.f1480a = i2;
        int i7 = i5 & 7;
        this.f1481b = i7 == 0 ? 8 : i7;
    }
}
