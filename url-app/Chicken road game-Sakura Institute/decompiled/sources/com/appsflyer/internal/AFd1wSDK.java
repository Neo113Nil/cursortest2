package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class AFd1wSDK {
    public final String[] AFInAppEventType;

    public AFd1wSDK(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.AFInAppEventType = null;
            return;
        }
        Pattern compile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !compile.matcher(str).matches()) {
                AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
            } else {
                arrayList.add(str.toLowerCase(Locale.getDefault()));
            }
        }
        if (arrayList.contains("all")) {
            this.AFInAppEventType = new String[]{"all"};
        } else if (arrayList.isEmpty()) {
            this.AFInAppEventType = null;
        } else {
            this.AFInAppEventType = (String[]) arrayList.toArray(new String[0]);
        }
    }
}
