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

/* loaded from: classes.dex */
public abstract class t0 {
    public static ArrayList a(Context context, List list, int i4, HashSet hashSet, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            AdDetails adDetails = (AdDetails) it.next();
            List<String> asList = Arrays.asList(adDetails.t());
            WeakHashMap weakHashMap = si.f7575a;
            ArrayList arrayList5 = new ArrayList();
            for (String str : asList) {
                if (si.e(str)) {
                    arrayList5.add(str);
                }
            }
            AppPresenceDetails appPresenceDetails = new AppPresenceDetails(i4, adDetails.r(), arrayList5.isEmpty() ? null : (String) arrayList5.get(0), adDetails.d());
            boolean z5 = adDetails.d() != null && adDetails.d().startsWith("!");
            boolean a3 = p0.a(adDetails.r(), context, z5 ? adDetails.d().substring(1) : adDetails.d());
            boolean z6 = AdsCommonMetaData.k().G() && ((a3 && !z5) || (!a3 && z5));
            arrayList3.add(appPresenceDetails);
            if (z6) {
                appPresenceDetails.a(a3);
                appPresenceDetails.b(false);
                if (!z5) {
                    arrayList2.add(adDetails);
                    arrayList4.add(appPresenceDetails);
                }
                hashSet.add(adDetails.s());
                z4 = true;
            } else {
                arrayList.add(adDetails);
            }
        }
        if (arrayList.size() < 5 && (list.size() != 1 || i4 > 0)) {
            int min = Math.min(5 - arrayList.size(), arrayList2.size());
            arrayList.addAll(arrayList2.subList(0, min));
            Iterator it2 = arrayList4.subList(0, min).iterator();
            while (it2.hasNext()) {
                ((AppPresenceDetails) it2.next()).b(true);
            }
        }
        if (z4) {
            com.startapp.sdk.adsbase.g.f(context);
            if (z) {
                ((Executor) com.startapp.sdk.components.a.a(context).f6541A.a()).execute(new s0(context, arrayList3).f7546c);
            }
        }
        return arrayList;
    }

    public static ArrayList a(String str, int i4) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = new String[0];
        String a3 = si.a(str, "@tracking@", "@tracking@");
        if (a3 != null) {
            strArr = a3.split(StringUtils.COMMA);
        }
        String[] strArr2 = new String[0];
        String a4 = si.a(str, "@appPresencePackage@", "@appPresencePackage@");
        if (a4 != null) {
            strArr2 = a4.split(StringUtils.COMMA);
        }
        String[] strArr3 = new String[0];
        String a5 = si.a(str, "@minAppVersion@", "@minAppVersion@");
        if (a5 != null) {
            strArr3 = a5.split(StringUtils.COMMA);
        }
        int i5 = 0;
        while (i5 < strArr2.length) {
            arrayList.add(new AppPresenceDetails(i4, strArr3.length > i5 ? Integer.valueOf(strArr3[i5]).intValue() : 0, strArr.length > i5 ? strArr[i5] : null, strArr2[i5]));
            i5++;
        }
        while (i5 < strArr.length) {
            arrayList.add(new AppPresenceDetails(i4, strArr3.length > i5 ? Integer.valueOf(strArr3[i5]).intValue() : 0, strArr[i5], ""));
            i5++;
        }
        return arrayList;
    }

    public static Boolean a(Context context, ArrayList arrayList, int i4, HashSet hashSet, ArrayList arrayList2) {
        int size = arrayList.size();
        boolean z = false;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            AppPresenceDetails appPresenceDetails = (AppPresenceDetails) obj;
            boolean startsWith = appPresenceDetails.b().startsWith("!");
            boolean a3 = p0.a(appPresenceDetails.a(), context, startsWith ? appPresenceDetails.b().substring(1) : appPresenceDetails.b());
            if ((!startsWith && a3) || (startsWith && !a3)) {
                appPresenceDetails.a(a3);
                z = i4 == 0;
                if (z && !startsWith) {
                    hashSet.add(appPresenceDetails.b());
                } else if (!z && appPresenceDetails.c() != null) {
                    appPresenceDetails.a(appPresenceDetails.c() + "&isShown=" + appPresenceDetails.e() + "&appPresence=" + appPresenceDetails.d());
                }
            }
            arrayList2.add(appPresenceDetails);
        }
        if (z) {
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                ((AppPresenceDetails) arrayList2.get(i6)).b(false);
            }
        }
        return Boolean.valueOf(z);
    }
}
