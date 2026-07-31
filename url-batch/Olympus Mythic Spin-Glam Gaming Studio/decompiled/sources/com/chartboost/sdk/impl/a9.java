package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.sg;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.LGPD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes9.dex */
public class a9 {
    public final gf a;

    public a9(gf gfVar) {
        this.a = gfVar;
    }

    public List a(sg.b bVar) {
        HashMap a = this.a.a();
        List<DataUseConsent> a2 = a(a);
        ArrayList arrayList = new ArrayList();
        HashSet b = b(bVar);
        if (b != null) {
            for (DataUseConsent dataUseConsent : a2) {
                if (a(b, dataUseConsent)) {
                    arrayList.add(dataUseConsent);
                }
            }
        } else {
            if (a.containsKey("us_privacy")) {
                arrayList.add((DataUseConsent) a.get("us_privacy"));
            }
            if (a.containsKey("coppa")) {
                arrayList.add((DataUseConsent) a.get("coppa"));
            }
            if (a.containsKey(LGPD.LGPD_STANDARD)) {
                arrayList.add((DataUseConsent) a.get(LGPD.LGPD_STANDARD));
            }
        }
        return arrayList;
    }

    public final HashSet b(sg.b bVar) {
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public final boolean a(HashSet hashSet, DataUseConsent dataUseConsent) {
        if (hashSet.contains(dataUseConsent.getPrivacyStandardName())) {
            return true;
        }
        xb.b("DataUseConsent " + dataUseConsent.getPrivacyStandardName() + " is not whitelisted.", null);
        return false;
    }

    public final List a(HashMap hashMap) {
        HashMap hashMap2 = new HashMap(hashMap);
        hashMap2.remove("gdpr");
        return new ArrayList(hashMap2.values());
    }
}
