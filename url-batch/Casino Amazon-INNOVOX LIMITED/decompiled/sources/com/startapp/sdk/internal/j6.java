package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class j6 {
    public static void a(Context context, DiskAdCacheManager$DiskCachedAd diskAdCacheManager$DiskCachedAd, m2 m2Var, l2 l2Var) {
        com.startapp.sdk.adsbase.f a2 = diskAdCacheManager$DiskCachedAd.a();
        WeakHashMap weakHashMap = zh.f528a;
        if (a2 instanceof r9) {
            r9 r9Var = (r9) a2;
            String b = diskAdCacheManager$DiskCachedAd.b();
            if (b == null || b.equals("")) {
                a0.a(context, (AdEventListener) l2Var, (Ad) null, true);
                return;
            }
            if (AdsCommonMetaData.k().G()) {
                ArrayList a3 = q0.a(b, 0);
                ArrayList arrayList = new ArrayList();
                if (q0.a(context, a3, 0, new HashSet(), arrayList).booleanValue()) {
                    ((Executor) com.startapp.sdk.components.a.a(context).A.a()).execute(new p0(context, arrayList).c);
                    a0.a(context, (AdEventListener) l2Var, (Ad) null, true);
                    return;
                }
            }
            m2Var.f328a.o = r9Var;
            ((sj) com.startapp.sdk.components.a.a(context).b.a()).a(b, new i6(context, l2Var, r9Var));
            return;
        }
        if (!(a2 instanceof fd)) {
            a0.a(context, (AdEventListener) l2Var, (Ad) null, true);
            return;
        }
        fd fdVar = (fd) a2;
        List list = fdVar.f302a;
        if (list == null) {
            a0.a(context, (AdEventListener) l2Var, (Ad) null, true);
            return;
        }
        if (AdsCommonMetaData.k().G()) {
            list = q0.a(context, list, 0, new HashSet(), true);
        }
        if (list.size() <= 0) {
            a0.a(context, (AdEventListener) l2Var, (Ad) null, true);
            return;
        }
        m2Var.f328a.o = fdVar;
        ya a4 = ((za) com.startapp.sdk.components.a.a(context).Q.a()).a(fdVar.b);
        a4.getClass();
        a4.b = new ArrayList();
        a4.c = "";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            va vaVar = new va((AdDetails) it.next());
            a4.b.add(vaVar);
            a4.f508a.a(vaVar.f466a, a4.b.size() - 1, vaVar.i);
        }
        a0.b(context, l2Var, fdVar, true);
    }
}
