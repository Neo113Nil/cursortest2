package com.swmansion.rnscreens.gamma.stack.header.subview;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StackHeaderSubviewType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/header/subview/StackHeaderSubviewType;", "", "<init>", "(Ljava/lang/String;I)V", "BACKGROUND", "LEADING", "CENTER", "TRAILING", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StackHeaderSubviewType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StackHeaderSubviewType[] $VALUES;
    public static final StackHeaderSubviewType BACKGROUND = new StackHeaderSubviewType("BACKGROUND", 0);
    public static final StackHeaderSubviewType LEADING = new StackHeaderSubviewType("LEADING", 1);
    public static final StackHeaderSubviewType CENTER = new StackHeaderSubviewType("CENTER", 2);
    public static final StackHeaderSubviewType TRAILING = new StackHeaderSubviewType("TRAILING", 3);

    private static final /* synthetic */ StackHeaderSubviewType[] $values() {
        return new StackHeaderSubviewType[]{BACKGROUND, LEADING, CENTER, TRAILING};
    }

    public static EnumEntries<StackHeaderSubviewType> getEntries() {
        return $ENTRIES;
    }

    private StackHeaderSubviewType(String str, int i) {
    }

    static {
        StackHeaderSubviewType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static StackHeaderSubviewType valueOf(String str) {
        return (StackHeaderSubviewType) Enum.valueOf(StackHeaderSubviewType.class, str);
    }

    public static StackHeaderSubviewType[] values() {
        return (StackHeaderSubviewType[]) $VALUES.clone();
    }
}
