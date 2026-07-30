package I;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContentInfo;
import java.util.List;
import java.util.Locale;
import x1.AbstractC1000b;

/* renamed from: I.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108d implements InterfaceC0107c, InterfaceC0109e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1176d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1177e;

    /* renamed from: i, reason: collision with root package name */
    public int f1178i;

    /* renamed from: l, reason: collision with root package name */
    public int f1179l;

    /* renamed from: m, reason: collision with root package name */
    public Comparable f1180m;

    /* renamed from: n, reason: collision with root package name */
    public Object f1181n;

    public /* synthetic */ C0108d() {
        this.f1176d = 0;
    }

    public static String f(P1.g gVar) {
        gVar.a();
        P1.h hVar = gVar.f2272c;
        String str = hVar.f2283e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = hVar.f2280b;
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

    @Override // I.InterfaceC0109e
    public int a() {
        return this.f1178i;
    }

    @Override // I.InterfaceC0109e
    public ClipData b() {
        return (ClipData) this.f1177e;
    }

    @Override // I.InterfaceC0107c
    public C0110f build() {
        return new C0110f(new C0108d(this));
    }

    @Override // I.InterfaceC0109e
    public int c() {
        return this.f1179l;
    }

    @Override // I.InterfaceC0109e
    public ContentInfo d() {
        return null;
    }

    public synchronized String e() {
        try {
            if (((String) this.f1180m) == null) {
                j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f1180m;
    }

    public synchronized int g() {
        PackageInfo h7;
        try {
            if (this.f1178i == 0 && (h7 = h("com.google.android.gms")) != null) {
                this.f1178i = h7.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1178i;
    }

    public PackageInfo h(String str) {
        try {
            return ((Context) this.f1177e).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w("FirebaseMessaging", "Failed to find package " + e7);
            return null;
        }
    }

    public boolean i() {
        int i2;
        synchronized (this) {
            i2 = this.f1179l;
            if (i2 == 0) {
                PackageManager packageManager = ((Context) this.f1177e).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i2 = 0;
                } else {
                    if (!AbstractC1000b.b()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f1179l = 1;
                            i2 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (AbstractC1000b.b()) {
                            this.f1179l = 2;
                        } else {
                            this.f1179l = 1;
                        }
                        i2 = this.f1179l;
                    } else {
                        this.f1179l = 2;
                        i2 = 2;
                    }
                }
            }
        }
        return i2 != 0;
    }

    public synchronized void j() {
        PackageInfo h7 = h(((Context) this.f1177e).getPackageName());
        if (h7 != null) {
            this.f1180m = Integer.toString(h7.versionCode);
            this.f1181n = h7.versionName;
        }
    }

    @Override // I.InterfaceC0107c
    public void q(Uri uri) {
        this.f1180m = uri;
    }

    @Override // I.InterfaceC0107c
    public void setExtras(Bundle bundle) {
        this.f1181n = bundle;
    }

    @Override // I.InterfaceC0107c
    public void t(int i2) {
        this.f1179l = i2;
    }

    public String toString() {
        String str;
        switch (this.f1176d) {
            case 1:
                Uri uri = (Uri) this.f1180m;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f1177e).getDescription());
                sb.append(", source=");
                int i2 = this.f1178i;
                sb.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i5 = this.f1179l;
                sb.append((i5 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i5));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return r4.f.f(sb, ((Bundle) this.f1181n) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C0108d(Context context) {
        this.f1176d = 2;
        this.f1179l = 0;
        this.f1177e = context;
    }

    public C0108d(C0108d c0108d) {
        this.f1176d = 1;
        ClipData clipData = (ClipData) c0108d.f1177e;
        clipData.getClass();
        this.f1177e = clipData;
        int i2 = c0108d.f1178i;
        if (i2 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i2 <= 5) {
            this.f1178i = i2;
            int i5 = c0108d.f1179l;
            if ((i5 & 1) == i5) {
                this.f1179l = i5;
                this.f1180m = (Uri) c0108d.f1180m;
                this.f1181n = (Bundle) c0108d.f1181n;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i5) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
