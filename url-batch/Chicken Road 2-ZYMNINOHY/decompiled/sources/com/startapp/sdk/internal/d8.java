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
    public final ib f6788m;

    public d8(Context context, td tdVar, AdPreferences adPreferences, AdEventListener adEventListener, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5) {
        super(context, tdVar, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL, ibVar, ibVar2, ibVar3, ibVar4);
        this.f6788m = ibVar5;
    }

    @Override // com.startapp.sdk.internal.t1
    public final void a(Ad ad) {
        td tdVar = (td) ad;
        List list = tdVar.f6800a;
        rb a3 = ((sb) this.f6788m.a()).a(tdVar.f7619b);
        a3.getClass();
        a3.f7529b = new ArrayList();
        a3.f7530c = "";
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ob obVar = new ob((AdDetails) it.next());
                a3.f7529b.add(obVar);
                a3.f7528a.a(obVar.f7379a, a3.f7529b.size() - 1, obVar.f7387i);
            }
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a c4 = super.c();
        if (c4 == null) {
            return null;
        }
        c4.f6479t0 = AdsCommonMetaData.k().t();
        return c4;
    }
}
