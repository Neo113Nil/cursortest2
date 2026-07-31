package com.appsflyer.internal;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFb1sSDK {
    private final AFh1rSDK getRevenue;

    public AFb1sSDK(AFh1rSDK aFh1rSDK) {
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        this.getRevenue = aFh1rSDK;
    }

    public final void afInfoLog() {
        try {
            Map map = AFa1kSDK.f13355i;
            Object obj = map.get(-496653013);
            if (obj == null) {
                obj = ((Class) AFa1kSDK.getCurrencyIso4217Code(87 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (28154 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 36 - Color.argb(0, 0, 0, 0))).getDeclaredConstructor(null);
                map.put(-496653013, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(null);
            Object[] objArr = {this.getRevenue};
            Object obj2 = map.get(-1581670163);
            if (obj2 == null) {
                obj2 = ((Class) AFa1kSDK.getCurrencyIso4217Code(87 - TextUtils.indexOf("", "", 0, 0), (char) (28155 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 36 - (ViewConfiguration.getScrollBarSize() >> 8))).getMethod("getRevenue", AFh1rSDK.class);
                map.put(-1581670163, obj2);
            }
            ((Method) obj2).invoke(newInstance, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
