package com.onesignal.debug.internal.crash;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnrCheckEvaluator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/onesignal/debug/internal/crash/BlockClassification;", "", "(Ljava/lang/String;I)V", "RESPONSIVE", "FROZEN_PROCESS", "FOREGROUND_ANR", "BACKGROUND_WARNING", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BlockClassification {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BlockClassification[] $VALUES;
    public static final BlockClassification RESPONSIVE = new BlockClassification("RESPONSIVE", 0);
    public static final BlockClassification FROZEN_PROCESS = new BlockClassification("FROZEN_PROCESS", 1);
    public static final BlockClassification FOREGROUND_ANR = new BlockClassification("FOREGROUND_ANR", 2);
    public static final BlockClassification BACKGROUND_WARNING = new BlockClassification("BACKGROUND_WARNING", 3);

    private static final /* synthetic */ BlockClassification[] $values() {
        return new BlockClassification[]{RESPONSIVE, FROZEN_PROCESS, FOREGROUND_ANR, BACKGROUND_WARNING};
    }

    public static EnumEntries<BlockClassification> getEntries() {
        return $ENTRIES;
    }

    public static BlockClassification valueOf(String str) {
        return (BlockClassification) Enum.valueOf(BlockClassification.class, str);
    }

    public static BlockClassification[] values() {
        return (BlockClassification[]) $VALUES.clone();
    }

    private BlockClassification(String str, int i) {
    }

    static {
        BlockClassification[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
