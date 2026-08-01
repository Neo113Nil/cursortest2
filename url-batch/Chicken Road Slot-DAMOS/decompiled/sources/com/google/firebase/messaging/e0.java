package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3129a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static v7.a f3130b;

    public static void a(Context context) {
        if (f3130b == null) {
            v7.a aVar = new v7.a(context);
            f3130b = aVar;
            synchronized (aVar.f9986a) {
                aVar.g = true;
            }
        }
    }

    public static byte[] b(ArrayDeque arrayDeque, int i3) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i3) {
            return bArr;
        }
        int length = i3 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i3);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i3 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static void c(Intent intent) {
        synchronized (f3129a) {
            try {
                if (f3130b != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f3130b.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            g8.g.c();
            g8.g c10 = g8.g.c();
            c10.a();
            Context context = c10.f4300a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static SharedPreferences e(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(final Context context) {
        final boolean z10;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (e(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z10 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            if (Build.VERSION.SDK_INT >= 29) {
                z4.w.q(null);
                return;
            } else {
                final w7.g gVar = new w7.g();
                new Runnable() { // from class: com.google.firebase.messaging.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        String notificationDelegate;
                        Context context2 = context;
                        w7.g gVar2 = gVar;
                        try {
                            if (!(Binder.getCallingUid() == context2.getApplicationInfo().uid)) {
                                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                                return;
                            }
                            SharedPreferences.Editor edit = e0.e(context2).edit();
                            edit.putBoolean("proxy_notification_initialized", true);
                            edit.apply();
                            NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                            if (z10) {
                                notificationManager.setNotificationDelegate("com.google.android.gms");
                            } else {
                                notificationDelegate = notificationManager.getNotificationDelegate();
                                if ("com.google.android.gms".equals(notificationDelegate)) {
                                    notificationManager.setNotificationDelegate(null);
                                }
                            }
                        } finally {
                            gVar2.c(null);
                        }
                    }
                }.run();
                return;
            }
        }
        z10 = true;
        if (Build.VERSION.SDK_INT >= 29) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Intent intent) {
        int parseInt;
        int i3;
        String string;
        String string2;
        Object[] objArr;
        String string3;
        String string4;
        long parseLong;
        String str;
        String str2;
        if (i(intent)) {
            h("_nr", intent.getExtras());
        }
        int i10 = 0;
        if ((intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) ? false : d()) {
            h6.e eVar = (h6.e) FirebaseMessaging.f3076m.get();
            if (eVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            c9.d dVar = null;
            r4 = null;
            String str3 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    parseInt = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            parseInt = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                        }
                    }
                    i3 = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            g8.g c10 = g8.g.c();
                            try {
                                Object obj2 = x8.c.f10546m;
                                string = (String) z4.w.f(((x8.c) c10.b(x8.d.class)).c());
                            } catch (InterruptedException e2) {
                                e = e2;
                                throw new RuntimeException(e);
                            }
                        } catch (InterruptedException | ExecutionException e9) {
                            e = e9;
                        }
                    }
                    String str4 = string;
                    g8.g c11 = g8.g.c();
                    c11.a();
                    String packageName = c11.f4300a.getPackageName();
                    c9.b bVar = !d9.c.p(extras) ? c9.b.DISPLAY_NOTIFICATION : c9.b.DATA_MESSAGE;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 == null) {
                        if (!"1".equals(extras.getString("google.priority_reduced"))) {
                            string2 = extras.getString("google.priority");
                        }
                        objArr = 2;
                        if (objArr == 2) {
                            i10 = 5;
                        } else if (objArr == 1) {
                            i10 = 10;
                        }
                        int i11 = i10;
                        string3 = extras.getString("google.message_id");
                        if (string3 == null) {
                            string3 = extras.getString("message_id");
                        }
                        String str5 = string3 != null ? string3 : "";
                        string4 = extras.getString("from");
                        if (string4 != null && string4.startsWith("/topics/")) {
                            str3 = string4;
                        }
                        String str6 = str3 != null ? str3 : "";
                        String string5 = extras.getString("collapse_key");
                        String str7 = string5 != null ? string5 : "";
                        String string6 = extras.getString("google.c.a.m_l");
                        String str8 = string6 != null ? string6 : "";
                        String string7 = extras.getString("google.c.a.c_l");
                        String str9 = string7 != null ? string7 : "";
                        if (extras.containsKey("google.c.sender.id")) {
                            try {
                                parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                            } catch (NumberFormatException e10) {
                                Log.w("FirebaseMessaging", "error parsing project number", e10);
                            }
                            dVar = new c9.d(parseLong > 0 ? parseLong : 0L, str5, str4, bVar, packageName, str7, i11, i3, str6, str8, str9);
                        }
                        g8.g c12 = g8.g.c();
                        g8.i iVar = c12.f4302c;
                        c12.a();
                        str = iVar.f4317e;
                        if (str != null) {
                            try {
                                parseLong = Long.parseLong(str);
                            } catch (NumberFormatException e11) {
                                Log.w("FirebaseMessaging", "error parsing sender ID", e11);
                            }
                            dVar = new c9.d(parseLong > 0 ? parseLong : 0L, str5, str4, bVar, packageName, str7, i11, i3, str6, str8, str9);
                        }
                        c12.a();
                        str2 = iVar.f4314b;
                        if (str2.startsWith("1:")) {
                            String[] split = str2.split(":");
                            if (split.length >= 2) {
                                String str10 = split[1];
                                if (!str10.isEmpty()) {
                                    try {
                                        parseLong = Long.parseLong(str10);
                                    } catch (NumberFormatException e12) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", e12);
                                    }
                                }
                            }
                            parseLong = 0;
                        } else {
                            try {
                                parseLong = Long.parseLong(str2);
                            } catch (NumberFormatException e13) {
                                Log.w("FirebaseMessaging", "error parsing app ID", e13);
                            }
                        }
                        dVar = new c9.d(parseLong > 0 ? parseLong : 0L, str5, str4, bVar, packageName, str7, i11, i3, str6, str8, str9);
                    }
                    if ("high".equals(string2)) {
                        if (!"normal".equals(string2)) {
                            objArr = 0;
                        }
                        objArr = 2;
                    } else {
                        objArr = 1;
                    }
                    if (objArr == 2) {
                    }
                    int i112 = i10;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                    }
                    if (string3 != null) {
                    }
                    string4 = extras.getString("from");
                    if (string4 != null) {
                        str3 = string4;
                    }
                    if (str3 != null) {
                    }
                    String string52 = extras.getString("collapse_key");
                    if (string52 != null) {
                    }
                    String string62 = extras.getString("google.c.a.m_l");
                    if (string62 != null) {
                    }
                    String string72 = extras.getString("google.c.a.c_l");
                    if (string72 != null) {
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                    }
                    g8.g c122 = g8.g.c();
                    g8.i iVar2 = c122.f4302c;
                    c122.a();
                    str = iVar2.f4317e;
                    if (str != null) {
                    }
                    c122.a();
                    str2 = iVar2.f4314b;
                    if (str2.startsWith("1:")) {
                    }
                    dVar = new c9.d(parseLong > 0 ? parseLong : 0L, str5, str4, bVar, packageName, str7, i112, i3, str6, str8, str9);
                }
                i3 = parseInt;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                }
                String str42 = string;
                g8.g c112 = g8.g.c();
                c112.a();
                String packageName2 = c112.f4300a.getPackageName();
                c9.b bVar2 = !d9.c.p(extras) ? c9.b.DISPLAY_NOTIFICATION : c9.b.DATA_MESSAGE;
                string2 = extras.getString("google.delivered_priority");
                if (string2 == null) {
                }
                if ("high".equals(string2)) {
                }
                if (objArr == 2) {
                }
                int i1122 = i10;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                }
                if (string3 != null) {
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                }
                if (str3 != null) {
                }
                String string522 = extras.getString("collapse_key");
                if (string522 != null) {
                }
                String string622 = extras.getString("google.c.a.m_l");
                if (string622 != null) {
                }
                String string722 = extras.getString("google.c.a.c_l");
                if (string722 != null) {
                }
                if (extras.containsKey("google.c.sender.id")) {
                }
                g8.g c1222 = g8.g.c();
                g8.i iVar22 = c1222.f4302c;
                c1222.a();
                str = iVar22.f4317e;
                if (str != null) {
                }
                c1222.a();
                str2 = iVar22.f4314b;
                if (str2.startsWith("1:")) {
                }
                dVar = new c9.d(parseLong > 0 ? parseLong : 0L, str5, str42, bVar2, packageName2, str7, i1122, i3, str6, str8, str9);
            }
            if (dVar == null) {
                return;
            }
            try {
                h6.b bVar3 = new h6.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                h6.c cVar = new h6.c("proto");
                a2.r rVar = new a2.r(12);
                k6.n nVar = (k6.n) eVar;
                Set set = nVar.f5477a;
                if (!set.contains(cVar)) {
                    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
                }
                new a1.n(nVar.f5478b, cVar, rVar, nVar.f5479c).F(new h6.a(new c9.e(dVar), bVar3));
            } catch (RuntimeException e14) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e14);
            }
        }
    }

    public static void h(String str, Bundle bundle) {
        try {
            g8.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e9) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e9);
                }
            }
            String str2 = d9.c.p(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            i8.a aVar = (i8.a) g8.g.c().b(i8.a.class);
            if (aVar != null) {
                ((i8.b) aVar).a(str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean i(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static ComponentName j(Context context, Intent intent) {
        synchronized (f3129a) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f3130b.a();
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static byte[] k(d dVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i3 = 0;
        while (i3 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i3);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < min2) {
                int read = dVar.read(bArr, i10, min2 - i10);
                if (read == -1) {
                    return b(arrayDeque, i3);
                }
                i10 += read;
                i3 += read;
            }
            long j = min * (min < 4096 ? 4 : 2);
            min = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (dVar.read() == -1) {
            return b(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
