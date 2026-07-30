package com.appsflyer.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", "", "", "afInfoLog", "()V", "Lcom/appsflyer/internal/AFa1qSDK;", "valueOf", "Lcom/appsflyer/internal/AFa1qSDK;", "AFInAppEventParameterName", "values", "<init>", "(Lcom/appsflyer/internal/AFa1qSDK;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFb1sSDK {

    /* renamed from: valueOf, reason: from kotlin metadata */
    private final AFa1qSDK AFInAppEventParameterName;

    public AFb1sSDK(AFa1qSDK aFa1qSDK) {
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        this.AFInAppEventParameterName = aFa1qSDK;
    }

    public final void afInfoLog() {
        try {
            Object obj = AFc1fSDK.afDebugLog.get(-564701561);
            if (obj == null) {
                obj = ((Class) AFc1fSDK.valueOf((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 89, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 27799))).getDeclaredConstructor(null);
                AFc1fSDK.afDebugLog.put(-564701561, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(null);
            try {
                Object[] objArr = {this.AFInAppEventParameterName};
                Object obj2 = AFc1fSDK.afDebugLog.get(-628703230);
                if (obj2 == null) {
                    obj2 = ((Class) AFc1fSDK.valueOf(Color.alpha(0) + 36, 90 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27799))).getMethod("AFInAppEventType", AFa1qSDK.class);
                    AFc1fSDK.afDebugLog.put(-628703230, obj2);
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
