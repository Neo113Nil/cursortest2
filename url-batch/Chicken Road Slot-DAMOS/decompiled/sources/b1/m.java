package b1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f1007a;

    /* renamed from: b, reason: collision with root package name */
    public int f1008b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1009c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f1010d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f1011e;

    public static String c(g8.g gVar) {
        gVar.a();
        g8.i iVar = gVar.f4302c;
        String str = iVar.f4317e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = iVar.f4314b;
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

    /* JADX WARN: Type inference failed for: r2v7, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.io.Serializable] */
    public int a(long j) {
        int i3 = this.f1007a + 1;
        long[] jArr = (long[]) this.f1009c;
        int length = jArr.length;
        if (i3 > length) {
            int i10 = length * 2;
            long[] jArr2 = new long[i10];
            ?? r22 = new int[i10];
            kotlin.collections.v.e(jArr, jArr2, 0, 0, jArr.length);
            kotlin.collections.v.f(0, 0, 14, (int[]) this.f1010d, r22);
            this.f1009c = jArr2;
            this.f1010d = r22;
        }
        int i11 = this.f1007a;
        this.f1007a = i11 + 1;
        int length2 = ((int[]) this.f1011e).length;
        if (this.f1008b >= length2) {
            int i12 = length2 * 2;
            ?? r23 = new int[i12];
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i13 + 1;
                r23[i13] = i14;
                i13 = i14;
            }
            kotlin.collections.v.f(0, 0, 14, (int[]) this.f1011e, r23);
            this.f1011e = r23;
        }
        int i15 = this.f1008b;
        int[] iArr = (int[]) this.f1011e;
        this.f1008b = iArr[i15];
        long[] jArr3 = (long[]) this.f1009c;
        jArr3[i11] = j;
        ((int[]) this.f1010d)[i11] = i15;
        iArr[i15] = i11;
        while (i11 > 0) {
            int i16 = ((i11 + 1) >> 1) - 1;
            if (Intrinsics.c(jArr3[i16], j) <= 0) {
                break;
            }
            i(i16, i11);
            i11 = i16;
        }
        return i15;
    }

    public synchronized String b() {
        try {
            if (((String) this.f1010d) == null) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f1010d;
    }

    public synchronized int d() {
        PackageInfo e2;
        try {
            if (this.f1007a == 0 && (e2 = e("com.google.android.gms")) != null) {
                this.f1007a = e2.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1007a;
    }

    public PackageInfo e(String str) {
        try {
            return ((Context) this.f1009c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("FirebaseMessaging", "Failed to find package " + e2);
            return null;
        }
    }

    public boolean f() {
        int i3;
        synchronized (this) {
            i3 = this.f1008b;
            if (i3 == 0) {
                PackageManager packageManager = ((Context) this.f1009c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i3 = 0;
                } else {
                    if (!g7.b.b()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f1008b = 1;
                            i3 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (g7.b.b()) {
                            this.f1008b = 2;
                        } else {
                            this.f1008b = 1;
                        }
                        i3 = this.f1008b;
                    } else {
                        this.f1008b = 2;
                        i3 = 2;
                    }
                }
            }
        }
        return i3 != 0;
    }

    public synchronized void g() {
        PackageInfo e2 = e(((Context) this.f1009c).getPackageName());
        if (e2 != null) {
            this.f1010d = Integer.toString(e2.versionCode);
            this.f1011e = e2.versionName;
        }
    }

    public void h(int i3) {
        int i10 = this.f1008b;
        boolean z10 = false;
        if (i3 >= 0 && i3 < i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        r2.a.a("lineIndex(" + i3 + ") is out of bounds [0, " + i10 + ')');
    }

    public void i(int i3, int i10) {
        long[] jArr = (long[]) this.f1009c;
        int[] iArr = (int[]) this.f1010d;
        int[] iArr2 = (int[]) this.f1011e;
        long j = jArr[i3];
        jArr[i3] = jArr[i10];
        jArr[i10] = j;
        int i11 = iArr[i3];
        int i12 = iArr[i10];
        iArr[i3] = i12;
        iArr[i10] = i11;
        iArr2[i12] = i3;
        iArr2[i11] = i10;
    }
}
