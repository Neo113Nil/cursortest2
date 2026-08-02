package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class db extends Ad {

    /* renamed from: a, reason: collision with root package name */
    public List f3687a;

    public db(Context context, AdPreferences.Placement placement, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9) {
        super(context, placement, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, ibVar6, ibVar7, ibVar8, ibVar9);
        this.f3687a = Collections.EMPTY_LIST;
    }

    public final void a(ArrayList arrayList) {
        boolean z;
        this.f3687a = arrayList;
        Iterator it = arrayList.iterator();
        Long l3 = null;
        while (it.hasNext()) {
            AdDetails adDetails = (AdDetails) it.next();
            if (adDetails != null && adDetails.A() != null && (l3 == null || adDetails.A().longValue() < l3.longValue())) {
                l3 = adDetails.A();
            }
        }
        if (l3 != null) {
            this.adCacheTtl = Long.valueOf(TimeUnit.SECONDS.toMillis(l3.longValue()));
        }
        Iterator it2 = this.f3687a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = true;
                break;
            } else if (!((AdDetails) it2.next()).q()) {
                z = false;
                break;
            }
        }
        this.belowMinCPM = z;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getAdId() {
        if (this.f3687a.isEmpty()) {
            return null;
        }
        return ((AdDetails) this.f3687a.get(0)).a();
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getDParam() {
        List<AdDetails> list = this.f3687a;
        if (list == null) {
            return null;
        }
        try {
            String str = null;
            for (AdDetails adDetails : list) {
                try {
                    if (adDetails != null) {
                        String h3 = adDetails.h();
                        String[] y3 = adDetails.y();
                        str = g0.a(h3, (y3 == null || y3.length <= 0) ? null : y3[0]);
                        if (str != null) {
                            break;
                        }
                    }
                } catch (Throwable unused) {
                    return str;
                }
            }
            return str;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
