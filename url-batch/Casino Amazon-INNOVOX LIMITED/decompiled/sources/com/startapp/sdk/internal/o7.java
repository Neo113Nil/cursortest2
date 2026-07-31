package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class o7 extends p1 {
    public final pa m;

    public o7(Context context, fd fdVar, AdPreferences adPreferences, AdEventListener adEventListener, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5) {
        super(context, fdVar, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL, paVar, paVar2, paVar3, paVar4);
        this.m = paVar5;
    }

    @Override // com.startapp.sdk.internal.p1
    public final void a(Ad ad) {
        fd fdVar = (fd) ad;
        List list = fdVar.f302a;
        ya a2 = ((za) this.m.a()).a(fdVar.b);
        a2.getClass();
        a2.b = new ArrayList();
        a2.c = "";
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                va vaVar = new va((AdDetails) it.next());
                a2.b.add(vaVar);
                a2.f508a.a(vaVar.f466a, a2.b.size() - 1, vaVar.i);
            }
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a c = super.c();
        if (c == null) {
            return null;
        }
        c.t0 = AdsCommonMetaData.k().t();
        return c;
    }
}
