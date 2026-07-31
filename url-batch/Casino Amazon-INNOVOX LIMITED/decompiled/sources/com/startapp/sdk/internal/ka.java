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

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class ka extends Ad {

    /* renamed from: a, reason: collision with root package name */
    public List f302a;

    public ka(Context context, AdPreferences.Placement placement, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9) {
        super(context, placement, paVar, paVar2, paVar3, paVar4, paVar5, paVar6, paVar7, paVar8, paVar9);
        this.f302a = Collections.EMPTY_LIST;
    }

    public final void a(ArrayList arrayList) {
        this.f302a = arrayList;
        int size = arrayList.size();
        Long l = null;
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            AdDetails adDetails = (AdDetails) obj;
            if (adDetails != null && adDetails.A() != null && (l == null || adDetails.A().longValue() < l.longValue())) {
                l = adDetails.A();
            }
        }
        if (l != null) {
            this.adCacheTtl = Long.valueOf(TimeUnit.SECONDS.toMillis(l.longValue()));
        }
        Iterator it = this.f302a.iterator();
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
        if (this.f302a.isEmpty()) {
            return null;
        }
        return ((AdDetails) this.f302a.get(0)).a();
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getDParam() {
        List<AdDetails> list = this.f302a;
        if (list == null) {
            return null;
        }
        try {
            String str = null;
            for (AdDetails adDetails : list) {
                try {
                    if (adDetails != null) {
                        String h = adDetails.h();
                        String[] y = adDetails.y();
                        str = e0.a(h, (y == null || y.length <= 0) ? null : y[0]);
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
