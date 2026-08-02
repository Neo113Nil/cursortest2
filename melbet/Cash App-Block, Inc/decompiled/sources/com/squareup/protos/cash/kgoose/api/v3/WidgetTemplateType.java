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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateType;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "WIDGET_TEMPLATE_TYPE_UNSPECIFIED", "WIDGET_TEMPLATE_TYPE_SPENDING", "WIDGET_TEMPLATE_TYPE_STOCK_PRICE", "WIDGET_TEMPLATE_TYPE_RECURRING_PAYMENTS", "WIDGET_TEMPLATE_TYPE_WEEKLY_BRIEF", "WIDGET_TEMPLATE_TYPE_PROMPT_MESSAGE", "WIDGET_TEMPLATE_TYPE_SUGGESTIONS", "WIDGET_TEMPLATE_TYPE_SUGGESTION_CARD", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WidgetTemplateType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WidgetTemplateType[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final WidgetTemplateType WIDGET_TEMPLATE_TYPE_PROMPT_MESSAGE;
    public static final WidgetTemplateType WIDGET_TEMPLATE_TYPE_RECURRING_PAYMENTS;
    public static final WidgetTemplateType WIDGET_TEMPLATE_TYPE_SPENDING;
    public static final WidgetTemplateType WIDGET_TEMPLATE_TYPE_STOCK_PRICE;
    public static final WidgetTemplateType WIDGET_TEMPLATE_TYPE_SUGGESTIONS;
    public static final WidgetTemplateType WIDGET_TEMPLATE_TYPE_SUGGESTION_CARD;
    public static final WidgetTemplateType WIDGET_TEMPLATE_TYPE_UNSPECIFIED;
    public static final WidgetTemplateType WIDGET_TEMPLATE_TYPE_WEEKLY_BRIEF;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateType$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateType;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        WidgetTemplateType widgetTemplateType = new WidgetTemplateType("WIDGET_TEMPLATE_TYPE_UNSPECIFIED", 0, 0);
        WIDGET_TEMPLATE_TYPE_UNSPECIFIED = widgetTemplateType;
        WidgetTemplateType widgetTemplateType2 = new WidgetTemplateType("WIDGET_TEMPLATE_TYPE_SPENDING", 1, 1);
        WIDGET_TEMPLATE_TYPE_SPENDING = widgetTemplateType2;
        WidgetTemplateType widgetTemplateType3 = new WidgetTemplateType("WIDGET_TEMPLATE_TYPE_STOCK_PRICE", 2, 2);
        WIDGET_TEMPLATE_TYPE_STOCK_PRICE = widgetTemplateType3;
        WidgetTemplateType widgetTemplateType4 = new WidgetTemplateType("WIDGET_TEMPLATE_TYPE_RECURRING_PAYMENTS", 3, 3);
        WIDGET_TEMPLATE_TYPE_RECURRING_PAYMENTS = widgetTemplateType4;
        WidgetTemplateType widgetTemplateType5 = new WidgetTemplateType("WIDGET_TEMPLATE_TYPE_WEEKLY_BRIEF", 4, 4);
        WIDGET_TEMPLATE_TYPE_WEEKLY_BRIEF = widgetTemplateType5;
        WidgetTemplateType widgetTemplateType6 = new WidgetTemplateType("WIDGET_TEMPLATE_TYPE_PROMPT_MESSAGE", 5, 5);
        WIDGET_TEMPLATE_TYPE_PROMPT_MESSAGE = widgetTemplateType6;
        WidgetTemplateType widgetTemplateType7 = new WidgetTemplateType("WIDGET_TEMPLATE_TYPE_SUGGESTIONS", 6, 6);
        WIDGET_TEMPLATE_TYPE_SUGGESTIONS = widgetTemplateType7;
        WidgetTemplateType widgetTemplateType8 = new WidgetTemplateType("WIDGET_TEMPLATE_TYPE_SUGGESTION_CARD", 7, 7);
        WIDGET_TEMPLATE_TYPE_SUGGESTION_CARD = widgetTemplateType8;
        WidgetTemplateType[] widgetTemplateTypeArr = {widgetTemplateType, widgetTemplateType2, widgetTemplateType3, widgetTemplateType4, widgetTemplateType5, widgetTemplateType6, widgetTemplateType7, widgetTemplateType8};
        $VALUES = widgetTemplateTypeArr;
        $ENTRIES = new EnumEntriesList(widgetTemplateTypeArr);
        INSTANCE = new Companion();
        ADAPTER = new WidgetTemplateType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(WidgetTemplateType.class), Syntax.PROTO_2, widgetTemplateType);
    }

    public WidgetTemplateType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final WidgetTemplateType fromValue(int i) {
        INSTANCE.getClass();
        switch (i) {
            case 0:
                return WIDGET_TEMPLATE_TYPE_UNSPECIFIED;
            case 1:
                return WIDGET_TEMPLATE_TYPE_SPENDING;
            case 2:
                return WIDGET_TEMPLATE_TYPE_STOCK_PRICE;
            case 3:
                return WIDGET_TEMPLATE_TYPE_RECURRING_PAYMENTS;
            case 4:
                return WIDGET_TEMPLATE_TYPE_WEEKLY_BRIEF;
            case 5:
                return WIDGET_TEMPLATE_TYPE_PROMPT_MESSAGE;
            case 6:
                return WIDGET_TEMPLATE_TYPE_SUGGESTIONS;
            case 7:
                return WIDGET_TEMPLATE_TYPE_SUGGESTION_CARD;
            default:
                return null;
        }
    }

    public static WidgetTemplateType valueOf(String str) {
        return (WidgetTemplateType) Enum.valueOf(WidgetTemplateType.class, str);
    }

    public static WidgetTemplateType[] values() {
        return (WidgetTemplateType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
