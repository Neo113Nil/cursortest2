package com.appsflyer.internal;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.p0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rBE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFd1fSDK;", "Lcom/appsflyer/internal/AFd1bSDK;", "", "p0", "", "p1", "", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/util/Map;[BLjava/lang/String;Z)V", "AFa1uSDK"}, k = 1, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFd1fSDK extends AFd1bSDK {

    /* renamed from: AFa1uSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ AFd1fSDK(String str, Map map, byte[] bArr, String str2, boolean z10, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i3 & 4) != 0 ? null : bArr, (i3 & 8) != 0 ? "GET" : str2, (i3 & 16) != 0 ? false : z10);
    }

    public static final AFd1fSDK getRevenue(String str, String str2, String str3, String str4) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        String monetizationNetwork = Companion.getMonetizationNetwork(str, str2, str3);
        String valueOf = String.valueOf(System.currentTimeMillis());
        AFd1fSDK aFd1fSDK = new AFd1fSDK(monetizationNetwork, p0.d(new Pair("Connection", "close"), new Pair("af_request_epoch_ms", valueOf), new Pair("af_sig", Companion.getMediationNetwork(str, str3, str2, str4, valueOf))), null, null, false, 28, null);
        aFd1fSDK.component4 = 10000;
        return aFd1fSDK;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\n\u001a\u0006*\u00020\u00040\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFd1fSDK$AFa1uSDK;", "", "<init>", "()V", "", "p0", "p1", "p2", "p3", "p4", "getMediationNetwork", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getMonetizationNetwork", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1fSDK$AFa1uSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static String getMediationNetwork(String p02, String p12, String p22, String p32, String p4) {
            p02.getClass();
            p12.getClass();
            p32.getClass();
            p4.getClass();
            return AFj1dSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{p4, p22, p02 + p12}), p32);
        }

        public static String getMonetizationNetwork(String p02, String p12, String p22) {
            return String.format(AFd1nSDK.getMonetizationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName()) + p02 + p22 + "?device_id=" + p12;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AFd1fSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z10) {
        super(str, bArr, str2, map, z10);
    }
}
