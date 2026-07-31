package com.facebook.react.devsupport.inspector;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TracingState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/devsupport/inspector/TracingState;", "", "<init>", "(Ljava/lang/String;I)V", "DISABLED", "ENABLED_IN_BACKGROUND_MODE", "ENABLED_IN_CDP_MODE", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TracingState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TracingState[] $VALUES;
    public static final TracingState DISABLED = new TracingState("DISABLED", 0);
    public static final TracingState ENABLED_IN_BACKGROUND_MODE = new TracingState("ENABLED_IN_BACKGROUND_MODE", 1);
    public static final TracingState ENABLED_IN_CDP_MODE = new TracingState("ENABLED_IN_CDP_MODE", 2);

    private static final /* synthetic */ TracingState[] $values() {
        return new TracingState[]{DISABLED, ENABLED_IN_BACKGROUND_MODE, ENABLED_IN_CDP_MODE};
    }

    public static EnumEntries<TracingState> getEntries() {
        return $ENTRIES;
    }

    private TracingState(String str, int i) {
    }

    static {
        TracingState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static TracingState valueOf(String str) {
        return (TracingState) Enum.valueOf(TracingState.class, str);
    }

    public static TracingState[] values() {
        return (TracingState[]) $VALUES.clone();
    }
}
