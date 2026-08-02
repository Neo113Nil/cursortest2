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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ChipType;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "DO_NOT_USE", "DATE_RANGE", "PRODUCT_TYPE", "DIRECTION", "TOTAL_AMOUNT", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ChipType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChipType[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ChipType DATE_RANGE;
    public static final ChipType DIRECTION;
    public static final ChipType DO_NOT_USE;
    public static final ChipType PRODUCT_TYPE;
    public static final ChipType TOTAL_AMOUNT;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ChipType$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ChipType;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static ChipType fromValue(int i) {
            if (i == 0) {
                return ChipType.DO_NOT_USE;
            }
            if (i == 1) {
                return ChipType.DATE_RANGE;
            }
            if (i == 2) {
                return ChipType.PRODUCT_TYPE;
            }
            if (i == 3) {
                return ChipType.DIRECTION;
            }
            if (i != 4) {
                return null;
            }
            return ChipType.TOTAL_AMOUNT;
        }
    }

    static {
        ChipType chipType = new ChipType("DO_NOT_USE", 0, 0);
        DO_NOT_USE = chipType;
        ChipType chipType2 = new ChipType("DATE_RANGE", 1, 1);
        DATE_RANGE = chipType2;
        ChipType chipType3 = new ChipType("PRODUCT_TYPE", 2, 2);
        PRODUCT_TYPE = chipType3;
        ChipType chipType4 = new ChipType("DIRECTION", 3, 3);
        DIRECTION = chipType4;
        ChipType chipType5 = new ChipType("TOTAL_AMOUNT", 4, 4);
        TOTAL_AMOUNT = chipType5;
        ChipType[] chipTypeArr = {chipType, chipType2, chipType3, chipType4, chipType5};
        $VALUES = chipTypeArr;
        $ENTRIES = new EnumEntriesList(chipTypeArr);
        INSTANCE = new Companion();
        ADAPTER = new ChipType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ChipType.class), Syntax.PROTO_2, chipType);
    }

    public ChipType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final ChipType fromValue(int i) {
        INSTANCE.getClass();
        return Companion.fromValue(i);
    }

    public static ChipType valueOf(String str) {
        return (ChipType) Enum.valueOf(ChipType.class, str);
    }

    public static ChipType[] values() {
        return (ChipType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
