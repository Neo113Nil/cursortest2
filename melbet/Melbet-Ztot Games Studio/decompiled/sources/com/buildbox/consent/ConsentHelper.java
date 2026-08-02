package com.buildbox.consent;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ConsentHelper {
    public static List<SdkConsentInfo> getSdkConsentInfos() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SdkConsentInfo("admob", "Admob", "https://policies.google.com/technologies/partner-sites"));
        arrayList.add(new SdkConsentInfo("adbox-vungle", "Vungle", "https://vungle.com/privacy/"));
        return arrayList;
    }

    public static String getConsentKey(String str) {
        return str + "_CONSENT_KEY";
    }
}
