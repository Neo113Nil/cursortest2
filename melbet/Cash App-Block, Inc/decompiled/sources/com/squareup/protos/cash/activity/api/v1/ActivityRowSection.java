package com.squareup.protos.cash.activity.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityRowSection;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "DEFAULT_ACTIVITY_ROW_SECTION_DO_NOT_USE", "PENDING", "UPCOMING", "COMPLETED", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityRowSection implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ActivityRowSection[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final ActivityRowSection COMPLETED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ActivityRowSection DEFAULT_ACTIVITY_ROW_SECTION_DO_NOT_USE;
    public static final ActivityRowSection PENDING;
    public static final ActivityRowSection UPCOMING;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityRowSection$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRowSection;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ActivityRowSection activityRowSection = new ActivityRowSection("DEFAULT_ACTIVITY_ROW_SECTION_DO_NOT_USE", 0, 0);
        DEFAULT_ACTIVITY_ROW_SECTION_DO_NOT_USE = activityRowSection;
        ActivityRowSection activityRowSection2 = new ActivityRowSection("PENDING", 1, 1);
        PENDING = activityRowSection2;
        ActivityRowSection activityRowSection3 = new ActivityRowSection("UPCOMING", 2, 2);
        UPCOMING = activityRowSection3;
        ActivityRowSection activityRowSection4 = new ActivityRowSection("COMPLETED", 3, 3);
        COMPLETED = activityRowSection4;
        ActivityRowSection[] activityRowSectionArr = {activityRowSection, activityRowSection2, activityRowSection3, activityRowSection4};
        $VALUES = activityRowSectionArr;
        $ENTRIES = new EnumEntriesList(activityRowSectionArr);
        INSTANCE = new Companion();
        ADAPTER = new ActivityRowSection$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ActivityRowSection.class), Syntax.PROTO_2, activityRowSection);
    }

    public ActivityRowSection(String str, int i, int i2) {
        this.value = i2;
    }

    public static final ActivityRowSection fromValue(int i) {
        INSTANCE.getClass();
        if (i == 0) {
            return DEFAULT_ACTIVITY_ROW_SECTION_DO_NOT_USE;
        }
        if (i == 1) {
            return PENDING;
        }
        if (i == 2) {
            return UPCOMING;
        }
        if (i != 3) {
            return null;
        }
        return COMPLETED;
    }

    public static ActivityRowSection valueOf(String str) {
        return (ActivityRowSection) Enum.valueOf(ActivityRowSection.class, str);
    }

    public static ActivityRowSection[] values() {
        return (ActivityRowSection[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
