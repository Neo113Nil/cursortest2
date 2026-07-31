package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.C1646j;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.tracker.obfuscated.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1650k {

    /* renamed from: a, reason: collision with root package name */
    private static final C1646j f21399a = new C1646j(Collections.EMPTY_LIST);

    private static String a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1646j.a) it.next()).f21378a);
        }
        return TextUtils.join(StringUtils.COMMA, arrayList);
    }

    private static List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageInfo packageInfo = (PackageInfo) it.next();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if ((applicationInfo.flags & 1) == 0) {
                arrayList.add(new C1646j.a(applicationInfo.packageName, AbstractC1700w2.b(packageInfo.firstInstallTime)));
            }
        }
        return arrayList;
    }

    public C1646j a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, Context context) {
        List<PackageInfo> list;
        if (installedPackagesProvider == null) {
            return f21399a;
        }
        try {
            list = installedPackagesProvider.getInstalledPackages();
        } catch (Throwable unused) {
            AbstractC1708y2.b("MyTracker error: exception at InstalledPackagesProvider::getInstalledPackages()");
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return f21399a;
        }
        List b4 = b(list);
        if (b4.isEmpty()) {
            return f21399a;
        }
        String a4 = a(b4);
        String g4 = C1676q1.a(context).g();
        String a5 = AbstractC1617c0.a(a4);
        if (g4.equals(a5)) {
            AbstractC1708y2.a("AppsDataProvider: Apps hash did not changed");
            return f21399a;
        }
        AbstractC1708y2.a("AppsDataProvider: Apps hash changed");
        C1676q1.a(context).h(a5);
        return new C1646j(b4);
    }
}
