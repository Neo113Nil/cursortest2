package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class s6 {
    public static void a(Context context, DiskAdCacheManager$DiskCachedAd diskAdCacheManager$DiskCachedAd, s2 s2Var, r2 r2Var) {
        com.startapp.sdk.adsbase.f a3 = diskAdCacheManager$DiskCachedAd.a();
        WeakHashMap weakHashMap = si.f7575a;
        if (a3 instanceof ka) {
            ka kaVar = (ka) a3;
            String b4 = diskAdCacheManager$DiskCachedAd.b();
            if (b4 == null || b4.equals("")) {
                a0.a(context, r2Var, null, true);
                return;
            }
            if (AdsCommonMetaData.k().G()) {
                ArrayList a4 = t0.a(b4, 0);
                ArrayList arrayList = new ArrayList();
                if (t0.a(context, a4, 0, new HashSet(), arrayList).booleanValue()) {
                    ((Executor) com.startapp.sdk.components.a.a(context).f6541A.a()).execute(new s0(context, arrayList).f7546c);
                    a0.a(context, r2Var, null, true);
                    return;
                }
            }
            s2Var.f7551a.o = kaVar;
            ((pk) com.startapp.sdk.components.a.a(context).f6562c.a()).a(b4, new r6(context, r2Var, kaVar));
            return;
        }
        if (!(a3 instanceof td)) {
            a0.a(context, r2Var, null, true);
            return;
        }
        td tdVar = (td) a3;
        List list = tdVar.f6800a;
        if (list == null) {
            a0.a(context, r2Var, null, true);
            return;
        }
        if (AdsCommonMetaData.k().G()) {
            list = t0.a(context, list, 0, new HashSet(), true);
        }
        if (list.size() <= 0) {
            a0.a(context, r2Var, null, true);
            return;
        }
        s2Var.f7551a.o = tdVar;
        rb a5 = ((sb) com.startapp.sdk.components.a.a(context).f6557R.a()).a(tdVar.f7619b);
        a5.getClass();
        a5.f7529b = new ArrayList();
        a5.f7530c = "";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ob obVar = new ob((AdDetails) it.next());
            a5.f7529b.add(obVar);
            a5.f7528a.a(obVar.f7379a, a5.f7529b.size() - 1, obVar.f7387i);
        }
        a0.b(context, r2Var, tdVar, true);
    }
}
