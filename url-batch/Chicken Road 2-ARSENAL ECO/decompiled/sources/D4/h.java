package D4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f527a;

    /* renamed from: b, reason: collision with root package name */
    public int f528b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f529c;

    public h(Context context) {
        this.f528b = 0;
        this.f529c = context;
    }

    public byte[] a() {
        int i7 = this.f527a;
        ArrayList arrayList = (ArrayList) this.f529c;
        if (i7 < arrayList.size()) {
            int i8 = this.f527a;
            this.f527a = i8 + 1;
            return (byte[]) arrayList.get(i8);
        }
        byte[] bArr = new byte[this.f528b];
        arrayList.add(bArr);
        this.f527a++;
        return bArr;
    }

    public synchronized int b() {
        PackageInfo packageInfo;
        if (this.f527a == 0) {
            try {
                packageInfo = a1.b.a((Context) this.f529c).f345a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e4) {
                Log.w("Metadata", "Failed to find package ".concat(e4.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f527a = packageInfo.versionCode;
            }
        }
        return this.f527a;
    }

    public synchronized int c() {
        int i7 = this.f528b;
        if (i7 != 0) {
            return i7;
        }
        Context context = (Context) this.f529c;
        PackageManager packageManager = context.getPackageManager();
        if (a1.b.a(context).f345a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i8 = 1;
        if (!Y0.b.b()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f528b = i8;
                return i8;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i8 = 2;
            this.f528b = i8;
            return i8;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == Y0.b.b()) {
            i8 = 2;
        }
        this.f528b = i8;
        return i8;
    }

    public h(int i7) {
        this.f529c = new ArrayList();
        this.f528b = i7;
    }

    public h(int i7, String str, double d7, double d8, double d9, double d10, int i8, int i9, ByteBuffer byteBuffer) {
        this.f527a = i7;
        this.f529c = str;
        this.f528b = i8;
    }

    public h() {
        this.f529c = new h[256];
        this.f527a = 0;
        this.f528b = 0;
    }

    public h(int i7, int i8) {
        this.f529c = null;
        this.f527a = i7;
        int i9 = i8 & 7;
        this.f528b = i9 == 0 ? 8 : i9;
    }
}
