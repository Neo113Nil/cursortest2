package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1uSDK;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class AFf1eSDK {

    enum AFa1zSDK {
        NONE,
        FIRST,
        ALL
    }

    static List<BigDecimal> AFKeystoreWrapper(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Float f = (Float) arrayList.get(0);
        Float f2 = (Float) arrayList.get(1);
        Float f3 = (Float) arrayList.get(2);
        ArrayList arrayList2 = new ArrayList();
        try {
            arrayList2.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(f.toString())));
            arrayList2.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(f2.toString())));
            arrayList2.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(f3.toString())));
            return arrayList2;
        } catch (ParseException e) {
            AFLogger.afErrorLogForExcManagerOnly("failed to parse string to number", e);
            return arrayList2;
        }
    }

    enum AFa1vSDK {
        UNKNOWN(0),
        ACCELEROMETER(1),
        MAGNETOMETER(2),
        RESERVED(3),
        GYROSCOPE(4);

        private int afErrorLog;

        AFa1vSDK(int i) {
            this.afErrorLog = i;
        }
    }

    enum AFa1wSDK {
        UNKNOWN("uk"),
        ACCELEROMETER("am"),
        MAGNETOMETER("mm"),
        RESERVED("rs"),
        GYROSCOPE("gs");

        String valueOf;

        AFa1wSDK(String str) {
            this.valueOf = str;
        }
    }
}
