package com.appsflyer.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0003\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\nX\u0007¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0017X\u0097D¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0012"}, d2 = {"Lcom/appsflyer/internal/AFe1vSDK;", "Lcom/appsflyer/internal/AFd1oSDK;", "", "AFKeystoreWrapper", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1uSDK;", "d", "Lcom/appsflyer/internal/AFe1uSDK;", "AFInAppEventType", "()Lcom/appsflyer/internal/AFe1uSDK;", "Lcom/appsflyer/internal/AFd1pSDK;", "Lcom/appsflyer/internal/AFd1pSDK;", "values", "", "Z", "AFInAppEventParameterName", "()Z", "valueOf", "()Ljava/lang/String;", "p0", "", "p1", "", "p2", "", "p3", "<init>", "(Lcom/appsflyer/internal/AFd1pSDK;[BLjava/util/Map;I)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFe1vSDK extends AFd1oSDK {

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    private final boolean valueOf;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public AFd1pSDK values;

    /* renamed from: d, reason: from kotlin metadata */
    private final AFe1uSDK AFKeystoreWrapper;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1vSDK(AFd1pSDK aFd1pSDK, byte[] bArr) {
        this(aFd1pSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }

    public /* synthetic */ AFe1vSDK(AFd1pSDK aFd1pSDK, byte[] bArr, Map map, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1pSDK, bArr, (i2 & 4) != 0 ? null : map, (i2 & 8) != 0 ? 2000 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFe1vSDK(AFd1pSDK aFd1pSDK, byte[] bArr, Map<String, String> map, int i) {
        super(bArr, map, i);
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.values = aFd1pSDK;
        this.AFKeystoreWrapper = AFe1uSDK.OCTET_STREAM;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    /* renamed from: AFInAppEventParameterName, reason: from getter */
    public final boolean getValueOf() {
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final String AFKeystoreWrapper() {
        AFi1fSDK aFi1fSDK = new AFi1fSDK(this.values, null, 2, null);
        return new StringBuilder().append(aFi1fSDK.AFKeystoreWrapper.AFKeystoreWrapper(AFi1fSDK.registerClient)).append(aFi1fSDK.valueOf.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName()).toString();
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    /* renamed from: AFInAppEventType, reason: from getter */
    public final AFe1uSDK getAFKeystoreWrapper() {
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final String AFKeystoreWrapper(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: ".concat(String.valueOf(str));
    }
}
