package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFd1aSDK extends AFd1mSDK {
    private final AFe1uSDK AFInAppEventType;
    public static final AFa1uSDK AFa1uSDK = new AFa1uSDK(null);
    public static String AFKeystoreWrapper = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    @Metadata
    public static final class AFa1uSDK {
        private AFa1uSDK() {
        }

        public /* synthetic */ AFa1uSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1aSDK(byte[] bArr, Map<String, String> map, int i2) {
        super(bArr, map, i2);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFInAppEventType = AFe1uSDK.JSON;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final String AFInAppEventParameterName() {
        String format = String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final String AFInAppEventType(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str, "");
        return "[Exception Manager]: ".concat(String.valueOf(str));
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final AFe1uSDK values() {
        return this.AFInAppEventType;
    }
}
