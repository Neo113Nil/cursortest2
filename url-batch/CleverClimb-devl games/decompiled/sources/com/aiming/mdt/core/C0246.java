package com.aiming.mdt.core;

import android.app.Activity;
import com.aiming.mdt.a.C0045;
import com.aiming.mdt.a.C0088;
import com.aiming.mdt.a.C0114;
import com.aiming.mdt.a.C0131;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.mediation.InitModel;
import com.aiming.mdt.utils.AdLog;
import com.aiming.mdt.utils.C0272;
import com.aiming.mdt.utils.C0290;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.aiming.mdt.core.ʻʼʽʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0246 {
    /* renamed from: ʽ, reason: contains not printable characters */
    private static Map<String, Integer> m858(Set<String> set, Map<String, C0045> map, C0272 c0272) {
        Map<Integer, C0088> m113;
        HashMap hashMap = new HashMap();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            C0045 c0045 = map.get(it.next());
            if (c0045 != null && (m113 = c0045.m113()) != null && !m113.isEmpty()) {
                Set<Integer> keySet = m113.keySet();
                if (!keySet.isEmpty()) {
                    Iterator<Integer> it2 = keySet.iterator();
                    while (it2.hasNext()) {
                        C0088 c0088 = m113.get(Integer.valueOf(it2.next().intValue()));
                        if (c0088 != null && c0088.m313() == c0272.m930()) {
                            hashMap.put(c0088.m304(), Integer.valueOf(c0045.m116()));
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static void m859(Activity activity, C0131 c0131) {
        Activity activity2;
        Iterator<Map.Entry<Integer, C0272>> it = c0131.m497().entrySet().iterator();
        while (it.hasNext()) {
            C0272 value = it.next().getValue();
            Object m834 = C0226.m834(value.m934());
            if (m834 == null) {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder("can't find:");
                sb.append(value.m934());
                singleton.LogE(sb.toString());
            } else if (m834 instanceof InitModel) {
                InitModel initModel = (InitModel) m834;
                HashMap hashMap = new HashMap();
                hashMap.put("AppKey", value.m932());
                Map<String, C0045> m492 = c0131.m492();
                if (m492 != null && !m492.isEmpty()) {
                    Set<String> keySet = m492.keySet();
                    if (!keySet.isEmpty()) {
                        hashMap.put("placement", m858(keySet, m492, value));
                    }
                }
                try {
                    if (C0290.m984(activity)) {
                        activity2 = activity;
                    } else {
                        activity2 = C0114.m427().m429();
                        if (activity2 == null) {
                        }
                    }
                    initModel.init(activity2, hashMap, new C0255());
                } catch (Throwable th) {
                    AdLog.getSingleton().LogE("init mediation Error:", th);
                }
            }
        }
    }
}
