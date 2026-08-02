package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.internal.C0369j;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.o;
import com.startapp.sdk.internal.o6;
import com.startapp.sdk.internal.p;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o6 f6394b;

    public a(o6 o6Var, ArrayList arrayList) {
        this.f6394b = o6Var;
        this.f6393a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0369j c0369j = this.f6394b.f7362b;
        ArrayList arrayList = this.f6393a;
        if (arrayList != null) {
            try {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    DiskAdCacheManager$DiskCacheKey diskAdCacheManager$DiskCacheKey = (DiskAdCacheManager$DiskCacheKey) obj;
                    c0369j.f7115a.a(null, diskAdCacheManager$DiskCacheKey.placement, diskAdCacheManager$DiskCacheKey.adPreferences, true, diskAdCacheManager$DiskCacheKey.a(), null, null);
                }
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        p pVar = c0369j.f7115a;
        pVar.f7413c = false;
        Iterator it = pVar.f7414d.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            pVar.a(oVar.f7352a, oVar.f7353b, oVar.f7354c, false, 0, oVar.f7355d, null);
        }
        pVar.f7414d.clear();
    }
}
