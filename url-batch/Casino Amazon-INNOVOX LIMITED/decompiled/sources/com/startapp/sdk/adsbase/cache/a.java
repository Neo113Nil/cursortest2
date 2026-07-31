package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.internal.f6;
import com.startapp.sdk.internal.j;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.o;
import com.startapp.sdk.internal.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f134a;
    public final /* synthetic */ f6 b;

    public a(f6 f6Var, ArrayList arrayList) {
        this.b = f6Var;
        this.f134a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.b.b;
        List<DiskAdCacheManager$DiskCacheKey> list = this.f134a;
        if (list != null) {
            try {
                for (DiskAdCacheManager$DiskCacheKey diskAdCacheManager$DiskCacheKey : list) {
                    jVar.f281a.a(null, diskAdCacheManager$DiskCacheKey.placement, diskAdCacheManager$DiskCacheKey.adPreferences, true, diskAdCacheManager$DiskCacheKey.a(), null, null);
                }
            } catch (Throwable th) {
                n8.a(th);
            }
        }
        p pVar = jVar.f281a;
        pVar.c = false;
        Iterator it = pVar.d.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            pVar.a(oVar.f355a, oVar.b, oVar.c, false, 0, oVar.d, null);
        }
        pVar.d.clear();
    }
}
