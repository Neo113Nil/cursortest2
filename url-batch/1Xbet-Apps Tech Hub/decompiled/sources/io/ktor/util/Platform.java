package io.ktor.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlatformUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/util/Platform;", "", "(Ljava/lang/String;I)V", "Jvm", "Native", "Browser", "Node", "ktor-utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Platform {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Platform[] $VALUES;
    public static final Platform Jvm = new Platform("Jvm", 0);
    public static final Platform Native = new Platform("Native", 1);
    public static final Platform Browser = new Platform("Browser", 2);
    public static final Platform Node = new Platform("Node", 3);

    private static final /* synthetic */ Platform[] $values() {
        return new Platform[]{Jvm, Native, Browser, Node};
    }

    public static EnumEntries<Platform> getEntries() {
        return $ENTRIES;
    }

    public static Platform valueOf(String str) {
        return (Platform) Enum.valueOf(Platform.class, str);
    }

    public static Platform[] values() {
        return (Platform[]) $VALUES.clone();
    }

    private Platform(String str, int i) {
    }

    static {
        Platform[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
