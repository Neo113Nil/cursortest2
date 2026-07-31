package com.appsflyer.internal;

import android.text.TextUtils;
import coil3.network.internal.UtilsKt;
import com.appsflyer.AppsFlyerLib;
import com.google.common.net.HttpHeaders;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rBE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFe1sSDK;", "Lcom/appsflyer/internal/AFe1nSDK;", "", "p0", "", "p1", "", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/util/Map;[BLjava/lang/String;Z)V", "AFa1tSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFe1sSDK extends AFe1nSDK {

    /* renamed from: AFa1tSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* synthetic */ AFe1sSDK(String str, Map map, byte[] bArr, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? null : bArr, (i & 8) != 0 ? UtilsKt.HTTP_METHOD_GET : str2, (i & 16) != 0 ? false : z);
    }

    private AFe1sSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z) {
        super(str, bArr, str2, map, z);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ=\u0010\b\u001a\u0006*\u00020\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ)\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFe1sSDK$AFa1tSDK;", "", "", "p0", "p1", "p2", "p3", "p4", "values", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "AFInAppEventType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1sSDK$AFa1tSDK, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        static String AFInAppEventType(String p0, String p1, String p2) {
            return new StringBuilder().append(String.format(AFe1wSDK.valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.AFInAppEventType().getHostName())).append(p0).append(p2).append("?device_id=").append(p1).toString();
        }

        public static String values(String p0, String p1, String p2, String p3, String p4) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p3, "");
            Intrinsics.checkNotNullParameter(p4, "");
            return AFb1lSDK.AFInAppEventParameterName(TextUtils.join("\u2063", new String[]{p4, p2, new StringBuilder().append(p0).append(p1).toString()}), p3);
        }
    }

    @JvmStatic
    public static final AFe1sSDK AFInAppEventType(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String AFInAppEventType = Companion.AFInAppEventType(str, str2, str3);
        String valueOf = String.valueOf(System.currentTimeMillis());
        AFe1sSDK aFe1sSDK = new AFe1sSDK(AFInAppEventType, MapsKt.mapOf(TuplesKt.to(HttpHeaders.CONNECTION, "close"), TuplesKt.to("af_request_epoch_ms", valueOf), TuplesKt.to("af_sig", Companion.values(str, str3, str2, str4, valueOf))), null, null, false, 28, null);
        aFe1sSDK.d = 10000;
        return aFe1sSDK;
    }
}
