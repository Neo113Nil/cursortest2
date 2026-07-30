package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface AFb1jSDK {

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class AFa1xSDK {
        public final String AFInAppEventType;
        public final float AFKeystoreWrapper;

        public AFa1xSDK(float f, String str) {
            this.AFKeystoreWrapper = f;
            this.AFInAppEventType = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1xSDK)) {
                return false;
            }
            AFa1xSDK aFa1xSDK = (AFa1xSDK) obj;
            return Float.valueOf(this.AFKeystoreWrapper).equals(Float.valueOf(aFa1xSDK.AFKeystoreWrapper)) && Intrinsics.b(this.AFInAppEventType, aFa1xSDK.AFInAppEventType);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.AFKeystoreWrapper) * 31;
            String str = this.AFInAppEventType;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BatteryData(level=");
            sb.append(this.AFKeystoreWrapper);
            sb.append(", charging=");
            sb.append(this.AFInAppEventType);
            sb.append(')');
            return sb.toString();
        }
    }

    AFa1xSDK AFInAppEventParameterName(Context context);
}
