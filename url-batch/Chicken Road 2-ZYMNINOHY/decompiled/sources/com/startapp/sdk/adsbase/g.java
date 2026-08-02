package com.startapp.sdk.adsbase;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.h6;
import com.startapp.sdk.internal.p0;
import com.startapp.sdk.internal.rf;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.sg;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.tg;
import com.startapp.sdk.internal.ug;
import com.startapp.sdk.internal.vg;
import com.startapp.sdk.internal.w0;
import com.startapp.simple.bloomfilter.api.BloomFilterCreator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static List f6418a = null;

    /* renamed from: b, reason: collision with root package name */
    public static List f6419b = null;

    /* renamed from: c, reason: collision with root package name */
    public static long f6420c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static volatile Pair f6421d = null;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Pair f6422e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f6423f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f6424g = false;

    /* renamed from: h, reason: collision with root package name */
    public static SimpleTokenUtils$TokenType f6425h = SimpleTokenUtils$TokenType.UNDEFINED;

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair a() {
        return f6421d != null ? new Pair(((SimpleTokenUtils$TokenType) f6421d.first).toString(), (String) f6421d.second) : new Pair(SimpleTokenUtils$TokenType.T1.toString(), "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair b() {
        return f6422e != null ? new Pair(((SimpleTokenUtils$TokenType) f6422e.first).toString(), (String) f6422e.second) : new Pair(SimpleTokenUtils$TokenType.T2.toString(), "");
    }

    public static void c(Context context) {
        Context a3 = w0.a(context);
        if (a3 != null) {
            context = a3;
        }
        f(context);
        f6423f = true;
        f6424g = false;
        f6425h = SimpleTokenUtils$TokenType.UNDEFINED;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        context.registerReceiver(new sg(), intentFilter);
        MetaData.E().a(new tg(context));
    }

    public static void d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Set D3 = MetaData.E().D();
        Set P4 = MetaData.E().P();
        f6418a = new CopyOnWriteArrayList();
        f6419b = new CopyOnWriteArrayList();
        try {
            int i4 = p0.f7428a;
            List<PackageInfo> list = (List) packageManager.getClass().getMethod("getInstalledPackages", Integer.TYPE).invoke(packageManager, 8192);
            f6420c = System.currentTimeMillis();
            PackageInfo packageInfo = null;
            for (PackageInfo packageInfo2 : list) {
                int i5 = packageInfo2.applicationInfo.flags;
                if ((i5 & 1) == 0 && (i5 & 128) == 0) {
                    long j4 = packageInfo2.firstInstallTime;
                    if (j4 < f6420c && j4 >= 1291593600000L) {
                        f6420c = j4;
                    }
                    f6418a.add(packageInfo2);
                    try {
                        String b4 = si.b(context);
                        if (D3 != null && D3.contains(b4)) {
                            f6419b.add(packageInfo2);
                        }
                    } catch (Throwable th) {
                        d9.a(th);
                    }
                } else if (P4.contains(packageInfo2.packageName)) {
                    f6418a.add(packageInfo2);
                } else if (packageInfo2.packageName.equals(h6.f7052a)) {
                    packageInfo = packageInfo2;
                }
            }
            List list2 = f6418a;
            if (list2.size() > 100) {
                ArrayList arrayList = new ArrayList(list2);
                Collections.sort(arrayList, new vg());
                list2 = arrayList.subList(0, 100);
            }
            f6418a = list2;
            List list3 = f6419b;
            if (list3.size() > 100) {
                ArrayList arrayList2 = new ArrayList(list3);
                Collections.sort(arrayList2, new vg());
                list3 = arrayList2.subList(0, 100);
            }
            f6419b = list3;
            if (packageInfo != null) {
                f6418a.add(0, packageInfo);
            }
        } catch (Throwable th2) {
            if (si.a(th2, RemoteException.class)) {
                return;
            }
            d9.a(th2);
        }
    }

    public static void e(Context context) {
        boolean a3 = MetaData.E().W().a(context);
        synchronized (g.class) {
            if ((f6421d == null || f6422e == null) && a3) {
                try {
                    d(context);
                    SimpleTokenUtils$TokenType simpleTokenUtils$TokenType = SimpleTokenUtils$TokenType.T1;
                    List list = f6418a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PackageInfo) it.next()).packageName);
                    }
                    f6421d = new Pair(simpleTokenUtils$TokenType, new BloomFilterCreator().fromKeys(arrayList));
                    SimpleTokenUtils$TokenType simpleTokenUtils$TokenType2 = SimpleTokenUtils$TokenType.T2;
                    List list2 = f6419b;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PackageInfo) it2.next()).packageName);
                    }
                    f6422e = new Pair(simpleTokenUtils$TokenType2, new BloomFilterCreator().fromKeys(arrayList2));
                } catch (Throwable th) {
                    d9.a(th);
                }
            }
        }
    }

    public static void f(Context context) {
        Context a3 = w0.a(context);
        if (a3 != null) {
            context = a3;
        }
        try {
            if ((f6421d == null || f6422e == null) && MetaData.E().W().a(context)) {
                ((Executor) com.startapp.sdk.components.a.a(context).f6544D.a()).execute(new ug(context));
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair a(Context context) {
        if (f6421d == null) {
            e(context);
        }
        rf edit = ((sf) com.startapp.sdk.components.a.a(context).f6547G.a()).edit();
        String str = (String) f6421d.second;
        edit.a("shared_prefs_simple_token", str);
        edit.f7532a.putString("shared_prefs_simple_token", str);
        edit.apply();
        f6423f = false;
        f6425h = SimpleTokenUtils$TokenType.UNDEFINED;
        return new Pair(SimpleTokenUtils$TokenType.T1, (String) f6421d.second);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair b(Context context) {
        if (f6422e == null) {
            e(context);
        }
        rf edit = ((sf) com.startapp.sdk.components.a.a(context).f6547G.a()).edit();
        String str = (String) f6422e.second;
        edit.a("shared_prefs_simple_token2", str);
        edit.f7532a.putString("shared_prefs_simple_token2", str);
        edit.apply();
        f6423f = false;
        f6425h = SimpleTokenUtils$TokenType.UNDEFINED;
        return new Pair(SimpleTokenUtils$TokenType.T2, (String) f6422e.second);
    }
}
