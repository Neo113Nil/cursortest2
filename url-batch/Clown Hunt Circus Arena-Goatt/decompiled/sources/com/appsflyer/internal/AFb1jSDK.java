package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface AFb1jSDK {
    AFa1xSDK AFInAppEventParameterName(Context context);

    public static final class AFa1xSDK {
        public final String AFInAppEventType;
        public final float AFKeystoreWrapper;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1xSDK)) {
                return false;
            }
            AFa1xSDK aFa1xSDK = (AFa1xSDK) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.AFKeystoreWrapper), (Object) Float.valueOf(aFa1xSDK.AFKeystoreWrapper)) && Intrinsics.areEqual(this.AFInAppEventType, aFa1xSDK.AFInAppEventType);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.AFKeystoreWrapper) * 31;
            String str = this.AFInAppEventType;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return new StringBuilder("BatteryData(level=").append(this.AFKeystoreWrapper).append(", charging=").append(this.AFInAppEventType).append(')').toString();
        }

        public AFa1xSDK(float f, String str) {
            this.AFKeystoreWrapper = f;
            this.AFInAppEventType = str;
        }
    }
}
