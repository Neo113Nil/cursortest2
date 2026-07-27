package G2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import l.r;
import u1.C1478b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f945a;

    /* renamed from: b, reason: collision with root package name */
    public int f946b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f947c;

    public f(Context context) {
        this.f946b = 0;
        this.f947c = context;
    }

    public void a() {
        new Handler(Looper.getMainLooper()).post(new B2.b(22, this));
    }

    public byte[] b() {
        int i2 = this.f945a;
        ArrayList arrayList = (ArrayList) this.f947c;
        if (i2 < arrayList.size()) {
            int i3 = this.f945a;
            this.f945a = i3 + 1;
            return (byte[]) arrayList.get(i3);
        }
        byte[] bArr = new byte[this.f946b];
        arrayList.add(bArr);
        this.f945a++;
        return bArr;
    }

    public void c(Typeface typeface) {
        int i2;
        WeakReference weakReference = (WeakReference) this.f947c;
        r rVar = (r) weakReference.get();
        if (rVar == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f945a) != -1) {
            typeface = Typeface.create(typeface, i2, (this.f946b & 2) != 0);
        }
        rVar.f10948a.post(new A0.a(weakReference, typeface, 29, false));
    }

    public synchronized int d() {
        PackageInfo packageInfo;
        if (this.f945a == 0) {
            try {
                packageInfo = ((Context) C1478b.a((Context) this.f947c).f3053a).getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e3) {
                Log.w("Metadata", "Failed to find package ".concat(e3.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f945a = packageInfo.versionCode;
            }
        }
        return this.f945a;
    }

    public synchronized int e() {
        int i2 = this.f946b;
        if (i2 != 0) {
            return i2;
        }
        Context context = (Context) this.f947c;
        PackageManager packageManager = context.getPackageManager();
        if (((Context) C1478b.a(context).f3053a).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i3 = 1;
        if (!s1.b.b()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f946b = i3;
                return i3;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i3 = 2;
            this.f946b = i3;
            return i3;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == s1.b.b()) {
            i3 = 2;
        }
        this.f946b = i3;
        return i3;
    }

    public f(int i2) {
        this.f947c = new ArrayList();
        this.f946b = i2;
    }

    public f(int i2, String str, double d6, double d7, double d8, double d9, int i3, int i6, ByteBuffer byteBuffer) {
        this.f945a = i2;
        this.f947c = str;
        this.f946b = i3;
    }

    public f(r rVar, int i2, int i3) {
        this.f947c = new WeakReference(rVar);
        this.f945a = i2;
        this.f946b = i3;
    }

    public f() {
        this.f947c = new f[256];
        this.f945a = 0;
        this.f946b = 0;
    }

    public f(int i2, int i3) {
        this.f947c = null;
        this.f945a = i2;
        int i6 = i3 & 7;
        this.f946b = i6 == 0 ? 8 : i6;
    }
}
