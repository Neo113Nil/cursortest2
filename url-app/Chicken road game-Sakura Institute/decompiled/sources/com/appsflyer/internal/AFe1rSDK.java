package com.appsflyer.internal;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z2.C1412P;

@Metadata
/* loaded from: classes.dex */
public final class AFe1rSDK extends AFe1nSDK {
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);

    @Metadata
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public static String AFInAppEventType(String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return AFb1lSDK.AFKeystoreWrapper(TextUtils.join("\u2063", new String[]{str5, str3, sb.toString()}), str4);
        }

        public static String valueOf(String str, String str2, String str3) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(AFe1ySDK.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()));
            sb.append(str);
            sb.append(str3);
            sb.append("?device_id=");
            sb.append(str2);
            return sb.toString();
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AFe1rSDK(String str, Map map, byte[] bArr, String str2, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i2 & 4) != 0 ? null : bArr, (i2 & 8) != 0 ? "GET" : str2, (i2 & 16) != 0 ? false : z4);
    }

    public static final AFe1rSDK AFInAppEventParameterName(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String valueOf = AFa1ySDK.valueOf(str, str2, str3);
        String valueOf2 = String.valueOf(System.currentTimeMillis());
        AFe1rSDK aFe1rSDK = new AFe1rSDK(valueOf, C1412P.e(new Pair("Connection", "close"), new Pair("af_request_epoch_ms", valueOf2), new Pair("af_sig", AFa1ySDK.AFInAppEventType(str, str3, str2, str4, valueOf2))), null, null, false, 28, null);
        aFe1rSDK.registerClient = 10000;
        return aFe1rSDK;
    }

    private AFe1rSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z4) {
        super(str, bArr, str2, map, z4);
    }
}
