package com.startapp.sdk.adsbase.utils;

import com.onesignal.otel.config.OtelConfigRemoteOneSignal;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Sta */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/startapp/sdk/adsbase/utils/NetworkMonitor$NetworkType", "", "Lcom/startapp/sdk/adsbase/utils/NetworkMonitor$NetworkType;", OtelConfigRemoteOneSignal.OTEL_PATH}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkMonitor$NetworkType {

    /* renamed from: a, reason: collision with root package name */
    public static final NetworkMonitor$NetworkType f157a;
    public static final NetworkMonitor$NetworkType b;
    public static final NetworkMonitor$NetworkType c;
    public static final NetworkMonitor$NetworkType d;
    public static final /* synthetic */ NetworkMonitor$NetworkType[] e;

    static {
        NetworkMonitor$NetworkType networkMonitor$NetworkType = new NetworkMonitor$NetworkType("WIFI", 0);
        f157a = networkMonitor$NetworkType;
        NetworkMonitor$NetworkType networkMonitor$NetworkType2 = new NetworkMonitor$NetworkType("CELLULAR_FAST", 1);
        b = networkMonitor$NetworkType2;
        NetworkMonitor$NetworkType networkMonitor$NetworkType3 = new NetworkMonitor$NetworkType("CELLULAR_SLOW", 2);
        c = networkMonitor$NetworkType3;
        NetworkMonitor$NetworkType networkMonitor$NetworkType4 = new NetworkMonitor$NetworkType("UNKNOWN", 3);
        d = networkMonitor$NetworkType4;
        NetworkMonitor$NetworkType[] networkMonitor$NetworkTypeArr = {networkMonitor$NetworkType, networkMonitor$NetworkType2, networkMonitor$NetworkType3, networkMonitor$NetworkType4};
        e = networkMonitor$NetworkTypeArr;
        EnumEntriesKt.enumEntries(networkMonitor$NetworkTypeArr);
    }

    public NetworkMonitor$NetworkType(String str, int i) {
    }

    public static NetworkMonitor$NetworkType valueOf(String str) {
        return (NetworkMonitor$NetworkType) Enum.valueOf(NetworkMonitor$NetworkType.class, str);
    }

    public static NetworkMonitor$NetworkType[] values() {
        return (NetworkMonitor$NetworkType[]) e.clone();
    }
}
