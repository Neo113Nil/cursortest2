package com.startapp.sdk.adsbase;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.internal.af;
import com.startapp.sdk.internal.bg;
import com.startapp.sdk.internal.cg;
import com.startapp.sdk.internal.dg;
import com.startapp.sdk.internal.eg;
import com.startapp.sdk.internal.m0;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.t0;
import com.startapp.sdk.internal.y5;
import com.startapp.sdk.internal.ze;
import com.startapp.sdk.internal.zh;
import com.startapp.simple.bloomfilter.api.BloomFilterCreator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static List f142a = null;
    public static List b = null;
    public static long c = 0;
    public static volatile Pair d = null;
    public static volatile Pair e = null;
    public static boolean f = true;
    public static boolean g = false;
    public static SimpleTokenUtils$TokenType h = SimpleTokenUtils$TokenType.UNDEFINED;

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair a() {
        return d != null ? new Pair(((SimpleTokenUtils$TokenType) d.first).toString(), (String) d.second) : new Pair(SimpleTokenUtils$TokenType.T1.toString(), "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair b() {
        return e != null ? new Pair(((SimpleTokenUtils$TokenType) e.first).toString(), (String) e.second) : new Pair(SimpleTokenUtils$TokenType.T2.toString(), "");
    }

    public static void c(Context context) {
        Context a2 = t0.a(context);
        if (a2 != null) {
            context = a2;
        }
        f(context);
        f = true;
        g = false;
        h = SimpleTokenUtils$TokenType.UNDEFINED;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        context.registerReceiver(new bg(), intentFilter);
        MetaData.A().a(new cg(context));
    }

    public static void d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Set z = MetaData.A().z();
        Set K = MetaData.A().K();
        f142a = new CopyOnWriteArrayList();
        b = new CopyOnWriteArrayList();
        try {
            int i = m0.f327a;
            List<PackageInfo> list = (List) packageManager.getClass().getMethod("getInstalledPackages", Integer.TYPE).invoke(packageManager, 8192);
            c = System.currentTimeMillis();
            PackageInfo packageInfo = null;
            for (PackageInfo packageInfo2 : list) {
                int i2 = packageInfo2.applicationInfo.flags;
                if ((i2 & 1) == 0 && (i2 & 128) == 0) {
                    long j = packageInfo2.firstInstallTime;
                    if (j < c && j >= 1291593600000L) {
                        c = j;
                    }
                    f142a.add(packageInfo2);
                    try {
                        String b2 = zh.b(context);
                        if (z != null && z.contains(b2)) {
                            b.add(packageInfo2);
                        }
                    } catch (Throwable th) {
                        n8.a(th);
                    }
                } else if (K.contains(packageInfo2.packageName)) {
                    f142a.add(packageInfo2);
                } else if (packageInfo2.packageName.equals(y5.f505a)) {
                    packageInfo = packageInfo2;
                }
            }
            List list2 = f142a;
            if (list2.size() > 100) {
                ArrayList arrayList = new ArrayList(list2);
                Collections.sort(arrayList, new eg());
                list2 = arrayList.subList(0, 100);
            }
            f142a = list2;
            List list3 = b;
            if (list3.size() > 100) {
                ArrayList arrayList2 = new ArrayList(list3);
                Collections.sort(arrayList2, new eg());
                list3 = arrayList2.subList(0, 100);
            }
            b = list3;
            if (packageInfo != null) {
                f142a.add(0, packageInfo);
            }
        } catch (Throwable th2) {
            if (zh.a(th2, RemoteException.class)) {
                return;
            }
            n8.a(th2);
        }
    }

    public static void e(Context context) {
        boolean a2 = MetaData.A().R().a(context);
        synchronized (g.class) {
            if ((d == null || e == null) && a2) {
                try {
                    d(context);
                    SimpleTokenUtils$TokenType simpleTokenUtils$TokenType = SimpleTokenUtils$TokenType.T1;
                    List list = f142a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PackageInfo) it.next()).packageName);
                    }
                    d = new Pair(simpleTokenUtils$TokenType, new BloomFilterCreator().fromKeys(arrayList));
                    SimpleTokenUtils$TokenType simpleTokenUtils$TokenType2 = SimpleTokenUtils$TokenType.T2;
                    List list2 = b;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PackageInfo) it2.next()).packageName);
                    }
                    e = new Pair(simpleTokenUtils$TokenType2, new BloomFilterCreator().fromKeys(arrayList2));
                } catch (Throwable th) {
                    n8.a(th);
                }
            }
        }
    }

    public static void f(Context context) {
        Context a2 = t0.a(context);
        if (a2 != null) {
            context = a2;
        }
        try {
            if ((d == null || e == null) && MetaData.A().R().a(context)) {
                ((Executor) com.startapp.sdk.components.a.a(context).D.a()).execute(new dg(context));
            }
        } catch (Throwable th) {
            n8.a(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair a(Context context) {
        if (d == null) {
            e(context);
        }
        ze edit = ((af) com.startapp.sdk.components.a.a(context).G.a()).edit();
        String str = (String) d.second;
        edit.a("shared_prefs_simple_token", str);
        edit.f526a.putString("shared_prefs_simple_token", str);
        edit.apply();
        f = false;
        h = SimpleTokenUtils$TokenType.UNDEFINED;
        return new Pair(SimpleTokenUtils$TokenType.T1, (String) d.second);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair b(Context context) {
        if (e == null) {
            e(context);
        }
        ze edit = ((af) com.startapp.sdk.components.a.a(context).G.a()).edit();
        String str = (String) e.second;
        edit.a("shared_prefs_simple_token2", str);
        edit.f526a.putString("shared_prefs_simple_token2", str);
        edit.apply();
        f = false;
        h = SimpleTokenUtils$TokenType.UNDEFINED;
        return new Pair(SimpleTokenUtils$TokenType.T2, (String) e.second);
    }
}
