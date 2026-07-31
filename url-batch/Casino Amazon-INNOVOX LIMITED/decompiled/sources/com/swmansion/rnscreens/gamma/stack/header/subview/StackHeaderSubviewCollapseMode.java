package com.swmansion.rnscreens.gamma.stack.header.subview;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StackHeaderSubviewCollapseMode.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bj\u0002\b\u0004j\u0002\b\u0005¨\u0006\t"}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/header/subview/StackHeaderSubviewCollapseMode;", "", "<init>", "(Ljava/lang/String;I)V", "OFF", "PARALLAX", "toNativeCollapseMode", "", "toNativeCollapseMode$react_native_screens_release", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StackHeaderSubviewCollapseMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StackHeaderSubviewCollapseMode[] $VALUES;
    public static final StackHeaderSubviewCollapseMode OFF = new StackHeaderSubviewCollapseMode("OFF", 0);
    public static final StackHeaderSubviewCollapseMode PARALLAX = new StackHeaderSubviewCollapseMode("PARALLAX", 1);

    /* compiled from: StackHeaderSubviewCollapseMode.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StackHeaderSubviewCollapseMode.values().length];
            try {
                iArr[StackHeaderSubviewCollapseMode.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StackHeaderSubviewCollapseMode.PARALLAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ StackHeaderSubviewCollapseMode[] $values() {
        return new StackHeaderSubviewCollapseMode[]{OFF, PARALLAX};
    }

    public static EnumEntries<StackHeaderSubviewCollapseMode> getEntries() {
        return $ENTRIES;
    }

    private StackHeaderSubviewCollapseMode(String str, int i) {
    }

    static {
        StackHeaderSubviewCollapseMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public final int toNativeCollapseMode$react_native_screens_release() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static StackHeaderSubviewCollapseMode valueOf(String str) {
        return (StackHeaderSubviewCollapseMode) Enum.valueOf(StackHeaderSubviewCollapseMode.class, str);
    }

    public static StackHeaderSubviewCollapseMode[] values() {
        return (StackHeaderSubviewCollapseMode[]) $VALUES.clone();
    }
}
