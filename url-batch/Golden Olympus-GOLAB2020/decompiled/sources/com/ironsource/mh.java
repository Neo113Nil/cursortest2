package com.ironsource;

import android.util.Log;
import com.ironsource.fr;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class mh {

    /* renamed from: b, reason: collision with root package name */
    private static mh f18047b;

    /* renamed from: a, reason: collision with root package name */
    private kc f18048a;

    private mh() {
    }

    private static mh a() {
        if (f18047b == null) {
            f18047b = new mh();
        }
        return f18047b;
    }

    public static void a(ec ecVar, kh khVar) {
        if (ecVar != null) {
            try {
                a().f18048a = new kc(ecVar, khVar);
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }
    }

    public static void a(fr.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(fr.a aVar, Map<String, Object> map) {
        kc kcVar = a().f18048a;
        if (kcVar == null) {
            Log.d(cc.f15729a, cc.f15728U);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f16300b));
        }
        kcVar.a(aVar.f16299a, map);
    }
}
