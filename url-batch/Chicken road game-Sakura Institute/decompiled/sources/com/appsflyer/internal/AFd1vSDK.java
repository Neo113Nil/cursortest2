package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface AFd1vSDK {
    AFa1uSDK AFInAppEventParameterName(Context context);

    public static final class AFa1uSDK {
        public final float valueOf;
        public final String values;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.valueOf), (Object) Float.valueOf(aFa1uSDK.valueOf)) && Intrinsics.areEqual(this.values, aFa1uSDK.values);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.valueOf) * 31;
            String str = this.values;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return new StringBuilder("BatteryData(level=").append(this.valueOf).append(", charging=").append(this.values).append(')').toString();
        }

        public AFa1uSDK(float f, String str) {
            this.valueOf = f;
            this.values = str;
        }
    }
}
