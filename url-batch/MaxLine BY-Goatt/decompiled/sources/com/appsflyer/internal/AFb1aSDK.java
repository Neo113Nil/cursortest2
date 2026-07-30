package com.appsflyer.internal;

import android.util.Base64;
import com.facebook.appevents.UserDataStore;
import com.google.firebase.messaging.Constants;
import defpackage.tp2;
import defpackage.up2;
import defpackage.yt;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFb1aSDK {
    public static final AFa1xSDK AFa1xSDK = new AFa1xSDK(null);
    public final String AFInAppEventParameterName;
    public final String AFInAppEventType;
    public int AFKeystoreWrapper;
    public final String values;

    public AFb1aSDK(String str, String str2, String str3, int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.values = str;
        this.AFInAppEventType = str2;
        this.AFInAppEventParameterName = str3;
        this.AFKeystoreWrapper = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFb1aSDK)) {
            return false;
        }
        AFb1aSDK aFb1aSDK = (AFb1aSDK) obj;
        return Intrinsics.b(this.values, aFb1aSDK.values) && Intrinsics.b(this.AFInAppEventType, aFb1aSDK.AFInAppEventType) && Intrinsics.b(this.AFInAppEventParameterName, aFb1aSDK.AFInAppEventParameterName) && this.AFKeystoreWrapper == aFb1aSDK.AFKeystoreWrapper;
    }

    public final int hashCode() {
        return Integer.hashCode(this.AFKeystoreWrapper) + ((this.AFInAppEventParameterName.hashCode() + ((this.AFInAppEventType.hashCode() + (this.values.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AFb1aSDK(valueOf=");
        sb.append(this.values);
        sb.append(", AFInAppEventType=");
        sb.append(this.AFInAppEventType);
        sb.append(", AFInAppEventParameterName=");
        sb.append(this.AFInAppEventParameterName);
        sb.append(", AFKeystoreWrapper=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(')');
        return sb.toString();
    }

    public final JSONObject valueOf() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ScionAnalytics.PARAM_LABEL, this.values);
        jSONObject.put("hash_name", this.AFInAppEventType);
        jSONObject.put(UserDataStore.STATE, this.AFInAppEventParameterName);
        jSONObject.put("c", String.valueOf(this.AFKeystoreWrapper));
        return jSONObject;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class AFa1xSDK {
        public /* synthetic */ AFa1xSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static boolean AFInAppEventType(Integer num, String... strArr) {
            boolean z = num == null;
            int length = strArr.length;
            for (int i = 0; i < 3; i++) {
                String str = strArr[i];
                z = z || str == null || str.length() == 0;
            }
            return z;
        }

        public static AFb1aSDK AFKeystoreWrapper(String str) {
            str.getClass();
            List<String> F = up2.F(0, 6, str, new String[]{"\n"});
            if (F.size() == 4) {
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Integer num = null;
                for (String str5 : F) {
                    if (tp2.o(str5, "label=", false)) {
                        str2 = AFKeystoreWrapper(str5, "label=");
                    } else if (tp2.o(str5, "hashName=", false)) {
                        str3 = AFKeystoreWrapper(str5, "hashName=");
                    } else if (!tp2.o(str5, "stackTrace=", false)) {
                        if (!tp2.o(str5, "c=", false)) {
                            break;
                        }
                        num = Integer.valueOf(Integer.parseInt(up2.K(str5.substring(2)).toString()));
                    } else {
                        str4 = AFKeystoreWrapper(str5, "stackTrace=");
                    }
                }
                if (!AFInAppEventType(num, str2, str3, str4)) {
                    str2.getClass();
                    str3.getClass();
                    str4.getClass();
                    num.getClass();
                    return new AFb1aSDK(str2, str3, str4, num.intValue());
                }
            }
            return null;
        }

        private AFa1xSDK() {
        }

        private static String AFKeystoreWrapper(String str, String str2) {
            String obj = up2.K(str.substring(str2.length())).toString();
            obj.getClass();
            Charset charset = yt.b;
            byte[] bytes = obj.getBytes(charset);
            bytes.getClass();
            byte[] decode = Base64.decode(bytes, 2);
            decode.getClass();
            return new String(decode, charset);
        }
    }

    public /* synthetic */ AFb1aSDK(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 1 : i);
    }
}
