package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface AFd1ySDK {
    AFa1uSDK values(Context context);

    public static final class AFa1uSDK {
        public final String AFInAppEventType;
        public final float values;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.values), (Object) Float.valueOf(aFa1uSDK.values)) && Intrinsics.areEqual(this.AFInAppEventType, aFa1uSDK.AFInAppEventType);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.values) * 31;
            String str = this.AFInAppEventType;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return new StringBuilder("BatteryData(level=").append(this.values).append(", charging=").append(this.AFInAppEventType).append(')').toString();
        }

        public AFa1uSDK(float f, String str) {
            this.values = f;
            this.AFInAppEventType = str;
        }
    }
}
