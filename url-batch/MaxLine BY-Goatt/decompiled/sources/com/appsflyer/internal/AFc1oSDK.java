package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import defpackage.mi1;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFc1oSDK extends AFb1ySDK {
    public static final AFa1xSDK AFa1xSDK = new AFa1xSDK(null);

    public /* synthetic */ AFc1oSDK(String str, Map map, byte[] bArr, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? null : bArr, (i & 8) != 0 ? "GET" : str2, (i & 16) != 0 ? false : z);
    }

    public static final AFc1oSDK AFKeystoreWrapper(String str, String str2, String str3, String str4) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        String values = AFa1xSDK.values(str, str2, str3);
        String valueOf = String.valueOf(System.currentTimeMillis());
        AFc1oSDK aFc1oSDK = new AFc1oSDK(values, mi1.f(new Pair("Connection", "close"), new Pair("af_request_epoch_ms", valueOf), new Pair("af_sig", AFa1xSDK.AFInAppEventType(str, str3, str2, str4, valueOf))), null, null, false, 28, null);
        aFc1oSDK.AFKeystoreWrapper(10000);
        return aFc1oSDK;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class AFa1xSDK {
        public /* synthetic */ AFa1xSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static String AFInAppEventType(String str, String str2, String str3, String str4, String str5) {
            str.getClass();
            str2.getClass();
            str4.getClass();
            str5.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return AFb1zSDK.AFKeystoreWrapper(AFb1zSDK.values(str5, str3, sb.toString()), str4);
        }

        public static String values(String str, String str2, String str3) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(AFc1qSDK.valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
            sb.append(str);
            sb.append(str3);
            sb.append("?device_id=");
            sb.append(str2);
            return sb.toString();
        }

        private AFa1xSDK() {
        }
    }

    private AFc1oSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z) {
        super(str, bArr, str2, map, z);
    }
}
