package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.model.AdDetails;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class q0 {
    public static ArrayList a(Context context, List list, int i, HashSet hashSet, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AdDetails adDetails = (AdDetails) it.next();
            List<String> asList = Arrays.asList(adDetails.t());
            WeakHashMap weakHashMap = zh.f528a;
            ArrayList arrayList5 = new ArrayList();
            for (String str : asList) {
                if (zh.d(str)) {
                    arrayList5.add(str);
                }
            }
            AppPresenceDetails appPresenceDetails = new AppPresenceDetails(arrayList5.isEmpty() ? null : (String) arrayList5.get(0), adDetails.d(), i, adDetails.r());
            boolean z3 = adDetails.d() != null && adDetails.d().startsWith("!");
            boolean a2 = m0.a(adDetails.r(), context, z3 ? adDetails.d().substring(1) : adDetails.d());
            boolean z4 = AdsCommonMetaData.k().G() && ((a2 && !z3) || (!a2 && z3));
            arrayList3.add(appPresenceDetails);
            if (z4) {
                appPresenceDetails.a(a2);
                appPresenceDetails.b(false);
                if (!z3) {
                    arrayList2.add(adDetails);
                    arrayList4.add(appPresenceDetails);
                }
                hashSet.add(adDetails.s());
                z2 = true;
            } else {
                arrayList.add(adDetails);
            }
        }
        if (arrayList.size() < 5 && (list.size() != 1 || i > 0)) {
            int min = Math.min(5 - arrayList.size(), arrayList2.size());
            arrayList.addAll(arrayList2.subList(0, min));
            Iterator it2 = arrayList4.subList(0, min).iterator();
            while (it2.hasNext()) {
                ((AppPresenceDetails) it2.next()).b(true);
            }
        }
        if (z2) {
            com.startapp.sdk.adsbase.g.f(context);
            if (z) {
                ((Executor) com.startapp.sdk.components.a.a(context).A.a()).execute(new p0(context, arrayList3).c);
            }
        }
        return arrayList;
    }

    public static ArrayList a(String str, int i) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = new String[0];
        String a2 = zh.a(str, "@tracking@", "@tracking@");
        if (a2 != null) {
            strArr = a2.split(StringUtils.COMMA);
        }
        String[] strArr2 = new String[0];
        String a3 = zh.a(str, "@appPresencePackage@", "@appPresencePackage@");
        if (a3 != null) {
            strArr2 = a3.split(StringUtils.COMMA);
        }
        String[] strArr3 = new String[0];
        String a4 = zh.a(str, "@minAppVersion@", "@minAppVersion@");
        if (a4 != null) {
            strArr3 = a4.split(StringUtils.COMMA);
        }
        int i2 = 0;
        while (i2 < strArr2.length) {
            arrayList.add(new AppPresenceDetails(strArr.length > i2 ? strArr[i2] : null, strArr2[i2], i, strArr3.length > i2 ? Integer.valueOf(strArr3[i2]).intValue() : 0));
            i2++;
        }
        while (i2 < strArr.length) {
            arrayList.add(new AppPresenceDetails(strArr[i2], "", i, strArr3.length > i2 ? Integer.valueOf(strArr3[i2]).intValue() : 0));
            i2++;
        }
        return arrayList;
    }

    public static Boolean a(Context context, ArrayList arrayList, int i, HashSet hashSet, ArrayList arrayList2) {
        int size = arrayList.size();
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            AppPresenceDetails appPresenceDetails = (AppPresenceDetails) obj;
            boolean startsWith = appPresenceDetails.b().startsWith("!");
            boolean a2 = m0.a(appPresenceDetails.a(), context, startsWith ? appPresenceDetails.b().substring(1) : appPresenceDetails.b());
            if ((!startsWith && a2) || (startsWith && !a2)) {
                appPresenceDetails.a(a2);
                z = i == 0;
                if (z && !startsWith) {
                    hashSet.add(appPresenceDetails.b());
                } else if (!z && appPresenceDetails.c() != null) {
                    appPresenceDetails.a(appPresenceDetails.c() + "&isShown=" + appPresenceDetails.e() + "&appPresence=" + appPresenceDetails.d());
                }
            }
            arrayList2.add(appPresenceDetails);
        }
        if (z) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                ((AppPresenceDetails) arrayList2.get(i3)).b(false);
            }
        }
        return Boolean.valueOf(z);
    }
}
