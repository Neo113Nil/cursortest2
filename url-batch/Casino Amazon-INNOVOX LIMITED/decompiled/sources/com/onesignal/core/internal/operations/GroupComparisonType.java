package com.onesignal.core.internal.operations;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Operation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/onesignal/core/internal/operations/GroupComparisonType;", "", "(Ljava/lang/String;I)V", "CREATE", "ALTER", "NONE", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GroupComparisonType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GroupComparisonType[] $VALUES;
    public static final GroupComparisonType CREATE = new GroupComparisonType("CREATE", 0);
    public static final GroupComparisonType ALTER = new GroupComparisonType("ALTER", 1);
    public static final GroupComparisonType NONE = new GroupComparisonType("NONE", 2);

    private static final /* synthetic */ GroupComparisonType[] $values() {
        return new GroupComparisonType[]{CREATE, ALTER, NONE};
    }

    public static EnumEntries<GroupComparisonType> getEntries() {
        return $ENTRIES;
    }

    public static GroupComparisonType valueOf(String str) {
        return (GroupComparisonType) Enum.valueOf(GroupComparisonType.class, str);
    }

    public static GroupComparisonType[] values() {
        return (GroupComparisonType[]) $VALUES.clone();
    }

    private GroupComparisonType(String str, int i) {
    }

    static {
        GroupComparisonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
