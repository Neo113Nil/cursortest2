package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.ads.video.VideoAdDetails;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class hj {

    /* renamed from: a, reason: collision with root package name */
    public LinkedList f7065a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final Context f7066b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f7067c;

    /* renamed from: d, reason: collision with root package name */
    public final ib f7068d;

    public hj(Context context, ib ibVar, ib ibVar2) {
        this.f7066b = context;
        this.f7067c = ibVar;
        this.f7068d = ibVar2;
    }

    public final boolean a(int i4) {
        ArrayList arrayList;
        ij ijVar;
        VideoAdDetails videoAdDetails;
        Iterator it = this.f7065a.iterator();
        boolean z = false;
        while (it.hasNext() && this.f7065a.size() > i4) {
            CachedVideoAd cachedVideoAd = (CachedVideoAd) it.next();
            p pVar = (p) this.f7068d.a();
            String a3 = cachedVideoAd.a();
            synchronized (pVar) {
                arrayList = new ArrayList(pVar.f7411a.values());
            }
            int size = arrayList.size();
            int i5 = 0;
            while (true) {
                if (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    Ad ad = ((w2) obj).o;
                    if (!(ad instanceof ij) || (videoAdDetails = (ijVar = (ij) ad).f7113r) == null || videoAdDetails.getLocalVideoPath() == null || !ijVar.f7113r.getLocalVideoPath().equals(a3)) {
                    }
                } else {
                    it.remove();
                    if (cachedVideoAd.a() != null) {
                        new File(cachedVideoAd.a()).delete();
                    }
                    z = true;
                }
            }
        }
        return z;
    }
}
