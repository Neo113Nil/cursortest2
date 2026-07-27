package com.appsflyer.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFb1sSDK {
    private final AFa1qSDK valueOf;

    public AFb1sSDK(AFa1qSDK aFa1qSDK) {
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        this.valueOf = aFa1qSDK;
    }

    public final void afInfoLog() {
        try {
            Map<Integer, Object> map = AFc1fSDK.afDebugLog;
            Object obj = map.get(-564701561);
            if (obj == null) {
                obj = ((Class) AFc1fSDK.valueOf((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 89, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 27799))).getDeclaredConstructor(null);
                map.put(-564701561, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(null);
            try {
                Object[] objArr = {this.valueOf};
                Object obj2 = map.get(-628703230);
                if (obj2 == null) {
                    obj2 = ((Class) AFc1fSDK.valueOf(Color.alpha(0) + 36, 90 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27799))).getMethod("AFInAppEventType", AFa1qSDK.class);
                    map.put(-628703230, obj2);
                }
                ((Method) obj2).invoke(newInstance, objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
