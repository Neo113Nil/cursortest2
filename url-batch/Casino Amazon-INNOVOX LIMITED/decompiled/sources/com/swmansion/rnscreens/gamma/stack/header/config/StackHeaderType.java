package com.swmansion.rnscreens.gamma.stack.header.config;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StackHeaderType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/header/config/StackHeaderType;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL", "MEDIUM", "LARGE", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StackHeaderType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StackHeaderType[] $VALUES;
    public static final StackHeaderType SMALL = new StackHeaderType("SMALL", 0);
    public static final StackHeaderType MEDIUM = new StackHeaderType("MEDIUM", 1);
    public static final StackHeaderType LARGE = new StackHeaderType("LARGE", 2);

    private static final /* synthetic */ StackHeaderType[] $values() {
        return new StackHeaderType[]{SMALL, MEDIUM, LARGE};
    }

    public static EnumEntries<StackHeaderType> getEntries() {
        return $ENTRIES;
    }

    private StackHeaderType(String str, int i) {
    }

    static {
        StackHeaderType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static StackHeaderType valueOf(String str) {
        return (StackHeaderType) Enum.valueOf(StackHeaderType.class, str);
    }

    public static StackHeaderType[] values() {
        return (StackHeaderType[]) $VALUES.clone();
    }
}
