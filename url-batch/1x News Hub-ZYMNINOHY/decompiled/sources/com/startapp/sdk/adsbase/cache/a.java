package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.internal.C0291j;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.o;
import com.startapp.sdk.internal.o6;
import com.startapp.sdk.internal.p;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o6 f3304b;

    public a(o6 o6Var, ArrayList arrayList) {
        this.f3304b = o6Var;
        this.f3303a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0291j c0291j = this.f3304b.f4229b;
        ArrayList arrayList = this.f3303a;
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    DiskAdCacheManager$DiskCacheKey diskAdCacheManager$DiskCacheKey = (DiskAdCacheManager$DiskCacheKey) it.next();
                    c0291j.f3989a.a(null, diskAdCacheManager$DiskCacheKey.placement, diskAdCacheManager$DiskCacheKey.adPreferences, true, diskAdCacheManager$DiskCacheKey.a(), null, null);
                }
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        p pVar = c0291j.f3989a;
        pVar.f4278c = false;
        Iterator it2 = pVar.f4279d.iterator();
        while (it2.hasNext()) {
            o oVar = (o) it2.next();
            pVar.a(oVar.f4219a, oVar.f4220b, oVar.f4221c, false, 0, oVar.f4222d, null);
        }
        pVar.f4279d.clear();
    }
}
