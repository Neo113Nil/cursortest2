package io.ktor.client.engine;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProxyConfig.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/engine/ProxyType;", "", "(Ljava/lang/String;I)V", "SOCKS", "HTTP", "UNKNOWN", "ktor-client-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProxyType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProxyType[] $VALUES;
    public static final ProxyType SOCKS = new ProxyType("SOCKS", 0);
    public static final ProxyType HTTP = new ProxyType("HTTP", 1);
    public static final ProxyType UNKNOWN = new ProxyType("UNKNOWN", 2);

    private static final /* synthetic */ ProxyType[] $values() {
        return new ProxyType[]{SOCKS, HTTP, UNKNOWN};
    }

    public static EnumEntries<ProxyType> getEntries() {
        return $ENTRIES;
    }

    public static ProxyType valueOf(String str) {
        return (ProxyType) Enum.valueOf(ProxyType.class, str);
    }

    public static ProxyType[] values() {
        return (ProxyType[]) $VALUES.clone();
    }

    private ProxyType(String str, int i) {
    }

    static {
        ProxyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
