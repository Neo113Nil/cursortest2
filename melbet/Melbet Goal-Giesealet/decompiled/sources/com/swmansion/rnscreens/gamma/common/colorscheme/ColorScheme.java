package com.swmansion.rnscreens.gamma.common.colorscheme;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ColorScheme.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/swmansion/rnscreens/gamma/common/colorscheme/ColorScheme;", "", "<init>", "(Ljava/lang/String;I)V", "INHERIT", "LIGHT", "DARK", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ColorScheme {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ColorScheme[] $VALUES;
    public static final ColorScheme INHERIT = new ColorScheme("INHERIT", 0);
    public static final ColorScheme LIGHT = new ColorScheme("LIGHT", 1);
    public static final ColorScheme DARK = new ColorScheme("DARK", 2);

    private static final /* synthetic */ ColorScheme[] $values() {
        return new ColorScheme[]{INHERIT, LIGHT, DARK};
    }

    public static EnumEntries<ColorScheme> getEntries() {
        return $ENTRIES;
    }

    private ColorScheme(String str, int i) {
    }

    static {
        ColorScheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ColorScheme valueOf(String str) {
        return (ColorScheme) Enum.valueOf(ColorScheme.class, str);
    }

    public static ColorScheme[] values() {
        return (ColorScheme[]) $VALUES.clone();
    }
}
