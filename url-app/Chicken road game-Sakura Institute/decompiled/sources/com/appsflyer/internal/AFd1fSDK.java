package com.appsflyer.internal;

import T2.p;
import android.util.Base64;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.C0755b;
import kotlin.text.Charsets;
import kotlin.text.u;
import kotlin.text.y;
import org.json.JSONObject;
import z2.C1442z;

@Metadata
/* loaded from: classes.dex */
public final class AFd1fSDK {
    public static final AFa1vSDK AFa1vSDK = new AFa1vSDK(null);
    public final String AFInAppEventType;
    public final String AFKeystoreWrapper;
    int valueOf;
    final String values;

    @Metadata
    public static final class AFa1vSDK {
        private AFa1vSDK() {
        }

        private static boolean AFInAppEventType(Integer num, String... strArr) {
            boolean z4 = num == null;
            int length = strArr.length;
            for (int i2 = 0; i2 < 3; i2++) {
                String str = strArr[i2];
                z4 = z4 || str == null || str.length() == 0;
            }
            return z4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
        public static AFd1fSDK valueOf(String str) {
            ?? G3;
            Intrinsics.checkNotNullParameter(str, "");
            String[] delimiters = {"\n"};
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(delimiters, "delimiters");
            String str2 = delimiters[0];
            if (str2.length() == 0) {
                kotlin.text.c B = y.B(str, delimiters, false, 0);
                Intrinsics.checkNotNullParameter(B, "<this>");
                p pVar = new p(B);
                G3 = new ArrayList(C1442z.h(pVar, 10));
                Iterator it = pVar.iterator();
                while (true) {
                    C0755b c0755b = (C0755b) it;
                    if (!c0755b.hasNext()) {
                        break;
                    }
                    G3.add(y.I(str, (IntRange) c0755b.next()));
                }
            } else {
                G3 = y.G(0, str, str2, false);
            }
            if (G3.size() != 4) {
                return null;
            }
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Integer num = null;
            for (String str6 : G3) {
                if (u.n(str6, "label=")) {
                    str3 = AFInAppEventType(str6, "label=");
                } else if (u.n(str6, "hashName=")) {
                    str4 = AFInAppEventType(str6, "hashName=");
                } else if (!u.n(str6, "stackTrace=")) {
                    if (!u.n(str6, "c=")) {
                        break;
                    }
                    String substring = str6.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "");
                    num = Integer.valueOf(Integer.parseInt(y.M(substring).toString()));
                } else {
                    str5 = AFInAppEventType(str6, "stackTrace=");
                }
            }
            if (AFInAppEventType(num, str3, str4, str5)) {
                return null;
            }
            Intrinsics.c(str3);
            Intrinsics.c(str4);
            Intrinsics.c(str5);
            Intrinsics.c(num);
            return new AFd1fSDK(str3, str4, str5, num.intValue());
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static String AFInAppEventType(String str, String str2) {
            String substring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(substring, "");
            String obj = y.M(substring).toString();
            Intrinsics.checkNotNullParameter(obj, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = obj.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] decode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "");
            return new String(decode, charset);
        }
    }

    public AFd1fSDK(String str, String str2, String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AFKeystoreWrapper = str;
        this.values = str2;
        this.AFInAppEventType = str3;
        this.valueOf = i2;
    }

    public final JSONObject AFKeystoreWrapper() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.AFKeystoreWrapper);
        jSONObject.put("hash_name", this.values);
        jSONObject.put("st", this.AFInAppEventType);
        jSONObject.put("c", String.valueOf(this.valueOf));
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFd1fSDK)) {
            return false;
        }
        AFd1fSDK aFd1fSDK = (AFd1fSDK) obj;
        return Intrinsics.a(this.AFKeystoreWrapper, aFd1fSDK.AFKeystoreWrapper) && Intrinsics.a(this.values, aFd1fSDK.values) && Intrinsics.a(this.AFInAppEventType, aFd1fSDK.AFInAppEventType) && this.valueOf == aFd1fSDK.valueOf;
    }

    public final int hashCode() {
        return Integer.hashCode(this.valueOf) + ((this.AFInAppEventType.hashCode() + ((this.values.hashCode() + (this.AFKeystoreWrapper.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AFd1fSDK(values=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(", AFKeystoreWrapper=");
        sb.append(this.values);
        sb.append(", AFInAppEventType=");
        sb.append(this.AFInAppEventType);
        sb.append(", AFInAppEventParameterName=");
        sb.append(this.valueOf);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ AFd1fSDK(String str, String str2, String str3, int i2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i4 & 8) != 0 ? 1 : i2);
    }
}
