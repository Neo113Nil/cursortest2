package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1342q;

/* loaded from: classes.dex */
public final class AFf1aSDK {
    private static /* synthetic */ boolean AFInAppEventParameterName(AFf1aSDK aFf1aSDK, String str) {
        return AFKeystoreWrapper(str, TimeUnit.HOURS, 1L);
    }

    public final boolean AFKeystoreWrapper(String str) {
        return AFInAppEventParameterName(this, str);
    }

    private static boolean AFKeystoreWrapper(String str, TimeUnit timeUnit, long j4) {
        Long g4;
        Object a4;
        Intrinsics.checkNotNullParameter(timeUnit, "");
        if (str != null && (g4 = t.g(str)) != null) {
            try {
                AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                a4 = Boolean.valueOf(Math.abs(g4.longValue() - TimeUnit.MILLISECONDS.toSeconds(AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().e().AFInAppEventType())) < timeUnit.toSeconds(1L));
            } catch (Throwable th) {
                AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                a4 = AbstractC1343r.a(th);
            }
            Throwable a5 = AbstractC1341p.a(a4);
            if (a5 != null) {
                StringBuilder sb = new StringBuilder("Could not convert ");
                sb.append(str);
                sb.append(" to TS");
                AFLogger.afErrorLog(sb.toString(), a5);
            }
            if (a4 instanceof C1342q) {
                a4 = null;
            }
            Boolean bool = (Boolean) a4;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }
}
