package com.appsflyer.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFe1wSDK extends AFd1mSDK {
    public AFd1sSDK AFInAppEventType;
    private final boolean AFKeystoreWrapper;

    /* renamed from: d, reason: collision with root package name */
    private final AFe1uSDK f5887d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1wSDK(AFd1sSDK aFd1sSDK, byte[] bArr) {
        this(aFd1sSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final String AFInAppEventParameterName() {
        AFj1xSDK aFj1xSDK = new AFj1xSDK(this.AFInAppEventType, null, 2, null);
        String AFInAppEventParameterName = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFj1xSDK.f5975d);
        StringBuilder sb = new StringBuilder();
        sb.append(AFInAppEventParameterName);
        sb.append(aFj1xSDK.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName());
        return sb.toString();
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final boolean AFInAppEventType() {
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final AFe1uSDK values() {
        return this.f5887d;
    }

    public /* synthetic */ AFe1wSDK(AFd1sSDK aFd1sSDK, byte[] bArr, Map map, int i2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1sSDK, bArr, (i4 & 4) != 0 ? null : map, (i4 & 8) != 0 ? 2000 : i2);
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final String AFInAppEventType(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: ".concat(String.valueOf(str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFe1wSDK(AFd1sSDK aFd1sSDK, byte[] bArr, Map<String, String> map, int i2) {
        super(bArr, map, i2);
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFInAppEventType = aFd1sSDK;
        this.f5887d = AFe1uSDK.OCTET_STREAM;
    }
}
