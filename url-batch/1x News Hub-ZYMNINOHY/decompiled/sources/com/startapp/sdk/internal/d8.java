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

/* loaded from: classes.dex */
public final class d8 extends t1 {

    /* renamed from: m, reason: collision with root package name */
    public final ib f3676m;

    public d8(Context context, td tdVar, AdPreferences adPreferences, AdEventListener adEventListener, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5) {
        super(context, tdVar, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL, ibVar, ibVar2, ibVar3, ibVar4);
        this.f3676m = ibVar5;
    }

    @Override // com.startapp.sdk.internal.t1
    public final void a(Ad ad) {
        td tdVar = (td) ad;
        List list = tdVar.f3687a;
        rb a3 = ((sb) this.f3676m.a()).a(tdVar.f4481b);
        a3.getClass();
        a3.f4392b = new ArrayList();
        a3.f4393c = "";
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ob obVar = new ob((AdDetails) it.next());
                a3.f4392b.add(obVar);
                a3.f4391a.a(obVar.f4244a, a3.f4392b.size() - 1, obVar.f4251i);
            }
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a c3 = super.c();
        if (c3 == null) {
            return null;
        }
        c3.f3384t0 = AdsCommonMetaData.k().t();
        return c3;
    }
}
