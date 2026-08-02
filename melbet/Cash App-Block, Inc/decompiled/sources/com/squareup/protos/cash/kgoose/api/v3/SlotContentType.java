package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SlotContentType;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "SLOT_CONTENT_TYPE_UNSPECIFIED", "SLOT_CONTENT_TYPE_METRIC", "SLOT_CONTENT_TYPE_LINE_GRAPH", "SLOT_CONTENT_TYPE_ITEMIZED_TABLE", "SLOT_CONTENT_TYPE_COMPOSITION_CHART", "SLOT_CONTENT_TYPE_STACKED_IMAGE", "SLOT_CONTENT_TYPE_PROGRESS_RING", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SlotContentType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SlotContentType[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SlotContentType SLOT_CONTENT_TYPE_COMPOSITION_CHART;
    public static final SlotContentType SLOT_CONTENT_TYPE_ITEMIZED_TABLE;
    public static final SlotContentType SLOT_CONTENT_TYPE_LINE_GRAPH;
    public static final SlotContentType SLOT_CONTENT_TYPE_METRIC;
    public static final SlotContentType SLOT_CONTENT_TYPE_PROGRESS_RING;
    public static final SlotContentType SLOT_CONTENT_TYPE_STACKED_IMAGE;
    public static final SlotContentType SLOT_CONTENT_TYPE_UNSPECIFIED;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SlotContentType$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContentType;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        SlotContentType slotContentType = new SlotContentType("SLOT_CONTENT_TYPE_UNSPECIFIED", 0, 0);
        SLOT_CONTENT_TYPE_UNSPECIFIED = slotContentType;
        SlotContentType slotContentType2 = new SlotContentType("SLOT_CONTENT_TYPE_METRIC", 1, 1);
        SLOT_CONTENT_TYPE_METRIC = slotContentType2;
        SlotContentType slotContentType3 = new SlotContentType("SLOT_CONTENT_TYPE_LINE_GRAPH", 2, 2);
        SLOT_CONTENT_TYPE_LINE_GRAPH = slotContentType3;
        SlotContentType slotContentType4 = new SlotContentType("SLOT_CONTENT_TYPE_ITEMIZED_TABLE", 3, 3);
        SLOT_CONTENT_TYPE_ITEMIZED_TABLE = slotContentType4;
        SlotContentType slotContentType5 = new SlotContentType("SLOT_CONTENT_TYPE_COMPOSITION_CHART", 4, 4);
        SLOT_CONTENT_TYPE_COMPOSITION_CHART = slotContentType5;
        SlotContentType slotContentType6 = new SlotContentType("SLOT_CONTENT_TYPE_STACKED_IMAGE", 5, 5);
        SLOT_CONTENT_TYPE_STACKED_IMAGE = slotContentType6;
        SlotContentType slotContentType7 = new SlotContentType("SLOT_CONTENT_TYPE_PROGRESS_RING", 6, 6);
        SLOT_CONTENT_TYPE_PROGRESS_RING = slotContentType7;
        SlotContentType[] slotContentTypeArr = {slotContentType, slotContentType2, slotContentType3, slotContentType4, slotContentType5, slotContentType6, slotContentType7};
        $VALUES = slotContentTypeArr;
        $ENTRIES = new EnumEntriesList(slotContentTypeArr);
        INSTANCE = new Companion();
        ADAPTER = new SlotContentType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SlotContentType.class), Syntax.PROTO_2, slotContentType);
    }

    public SlotContentType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final SlotContentType fromValue(int i) {
        INSTANCE.getClass();
        switch (i) {
            case 0:
                return SLOT_CONTENT_TYPE_UNSPECIFIED;
            case 1:
                return SLOT_CONTENT_TYPE_METRIC;
            case 2:
                return SLOT_CONTENT_TYPE_LINE_GRAPH;
            case 3:
                return SLOT_CONTENT_TYPE_ITEMIZED_TABLE;
            case 4:
                return SLOT_CONTENT_TYPE_COMPOSITION_CHART;
            case 5:
                return SLOT_CONTENT_TYPE_STACKED_IMAGE;
            case 6:
                return SLOT_CONTENT_TYPE_PROGRESS_RING;
            default:
                return null;
        }
    }

    public static SlotContentType valueOf(String str) {
        return (SlotContentType) Enum.valueOf(SlotContentType.class, str);
    }

    public static SlotContentType[] values() {
        return (SlotContentType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
