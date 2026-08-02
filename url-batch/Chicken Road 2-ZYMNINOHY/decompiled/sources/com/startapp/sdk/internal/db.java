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
    public List f6800a;

    public db(Context context, AdPreferences.Placement placement, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9) {
        super(context, placement, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, ibVar6, ibVar7, ibVar8, ibVar9);
        this.f6800a = Collections.EMPTY_LIST;
    }

    public final void a(ArrayList arrayList) {
        this.f6800a = arrayList;
        int size = arrayList.size();
        Long l4 = null;
        boolean z = false;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            AdDetails adDetails = (AdDetails) obj;
            if (adDetails != null && adDetails.A() != null && (l4 == null || adDetails.A().longValue() < l4.longValue())) {
                l4 = adDetails.A();
            }
        }
        if (l4 != null) {
            this.adCacheTtl = Long.valueOf(TimeUnit.SECONDS.toMillis(l4.longValue()));
        }
        Iterator it = this.f6800a.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            } else if (!((AdDetails) it.next()).q()) {
                break;
            }
        }
        this.belowMinCPM = z;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getAdId() {
        if (this.f6800a.isEmpty()) {
            return null;
        }
        return ((AdDetails) this.f6800a.get(0)).a();
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getDParam() {
        List<AdDetails> list = this.f6800a;
        if (list == null) {
            return null;
        }
        try {
            String str = null;
            for (AdDetails adDetails : list) {
                try {
                    if (adDetails != null) {
                        String h2 = adDetails.h();
                        String[] y4 = adDetails.y();
                        str = g0.a(h2, (y4 == null || y4.length <= 0) ? null : y4[0]);
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
