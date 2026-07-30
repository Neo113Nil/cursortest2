package com.appsflyer.internal;

import android.util.Base64;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00012\u00020\u000b:\u0001\u0001B)\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\t\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\t\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0003\u001a\u00020\u0002X\u0086\u0002¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u0005X\u0007¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\u0005X\u0007¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005X\u0007¢\u0006\u0006\n\u0004\b\n\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFb1aSDK;", "AFa1xSDK", "", "AFKeystoreWrapper", "I", "", "AFInAppEventType", "Ljava/lang/String;", "values", "valueOf", "AFInAppEventParameterName", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFb1aSDK {

    /* renamed from: AFa1xSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final String AFInAppEventParameterName;
    public final String AFInAppEventType;
    public int AFKeystoreWrapper;

    /* renamed from: values, reason: from kotlin metadata */
    public final String valueOf;

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFb1aSDK)) {
            return false;
        }
        AFb1aSDK aFb1aSDK = (AFb1aSDK) p0;
        return Intrinsics.areEqual(this.valueOf, aFb1aSDK.valueOf) && Intrinsics.areEqual(this.AFInAppEventType, aFb1aSDK.AFInAppEventType) && Intrinsics.areEqual(this.AFInAppEventParameterName, aFb1aSDK.AFInAppEventParameterName) && this.AFKeystoreWrapper == aFb1aSDK.AFKeystoreWrapper;
    }

    public final int hashCode() {
        return (((((this.valueOf.hashCode() * 31) + this.AFInAppEventType.hashCode()) * 31) + this.AFInAppEventParameterName.hashCode()) * 31) + Integer.hashCode(this.AFKeystoreWrapper);
    }

    public final String toString() {
        return new StringBuilder("AFb1aSDK(valueOf=").append(this.valueOf).append(", AFInAppEventType=").append(this.AFInAppEventType).append(", AFInAppEventParameterName=").append(this.AFInAppEventParameterName).append(", AFKeystoreWrapper=").append(this.AFKeystoreWrapper).append(')').toString();
    }

    public AFb1aSDK(String str, String str2, String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.valueOf = str;
        this.AFInAppEventType = str2;
        this.AFInAppEventParameterName = str3;
        this.AFKeystoreWrapper = i;
    }

    public /* synthetic */ AFb1aSDK(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 1 : i);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0086\u0003\u0018\u00002\u00020\u000fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFb1aSDK$AFa1xSDK;", "", "p0", "", "", "p1", "", "AFInAppEventType", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFb1aSDK;", "AFKeystoreWrapper", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFb1aSDK;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFb1aSDK$AFa1xSDK, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static AFb1aSDK AFKeystoreWrapper(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            List<String> split$default = StringsKt.split$default((CharSequence) p0, new String[]{"\n"}, false, 0, 6, (Object) null);
            if (split$default.size() != 4) {
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            for (String str4 : split$default) {
                if (StringsKt.startsWith$default(str4, "label=", false, 2, (Object) null)) {
                    str = AFKeystoreWrapper(str4, "label=");
                } else if (StringsKt.startsWith$default(str4, "hashName=", false, 2, (Object) null)) {
                    str2 = AFKeystoreWrapper(str4, "hashName=");
                } else if (StringsKt.startsWith$default(str4, "stackTrace=", false, 2, (Object) null)) {
                    str3 = AFKeystoreWrapper(str4, "stackTrace=");
                } else {
                    if (!StringsKt.startsWith$default(str4, "c=", false, 2, (Object) null)) {
                        break;
                    }
                    String substring = str4.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "");
                    num = Integer.valueOf(Integer.parseInt(StringsKt.trim((CharSequence) substring).toString()));
                }
            }
            if (AFInAppEventType(num, str, str2, str3)) {
                return null;
            }
            Intrinsics.checkNotNull(str);
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(str3);
            Intrinsics.checkNotNull(num);
            return new AFb1aSDK(str, str2, str3, num.intValue());
        }

        private static boolean AFInAppEventType(Integer p0, String... p1) {
            String str;
            boolean z = p0 == null;
            int length = p1.length;
            for (int i = 0; i < 3; i++) {
                z = z || (str = p1[i]) == null || str.length() == 0;
            }
            return z;
        }

        private static String AFKeystoreWrapper(String str, String str2) {
            String substring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(substring, "");
            String obj = StringsKt.trim((CharSequence) substring).toString();
            Intrinsics.checkNotNullParameter(obj, "");
            byte[] bytes = obj.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] decode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "");
            return new String(decode, Charsets.UTF_8);
        }
    }

    public final JSONObject valueOf() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ScionAnalytics.PARAM_LABEL, this.valueOf);
        jSONObject.put("hash_name", this.AFInAppEventType);
        jSONObject.put("st", this.AFInAppEventParameterName);
        jSONObject.put("c", String.valueOf(this.AFKeystoreWrapper));
        return jSONObject;
    }
}
