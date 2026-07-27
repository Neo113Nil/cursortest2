package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface AFd1vSDK {

    public static final class AFa1uSDK {
        public final float valueOf;
        public final String values;

        public AFa1uSDK(float f4, String str) {
            this.valueOf = f4;
            this.values = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) obj;
            return Float.valueOf(this.valueOf).equals(Float.valueOf(aFa1uSDK.valueOf)) && Intrinsics.a(this.values, aFa1uSDK.values);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.valueOf) * 31;
            String str = this.values;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BatteryData(level=");
            sb.append(this.valueOf);
            sb.append(", charging=");
            sb.append(this.values);
            sb.append(')');
            return sb.toString();
        }
    }

    AFa1uSDK AFInAppEventParameterName(Context context);
}
