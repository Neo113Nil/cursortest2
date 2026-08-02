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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WidgetCategory;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "WIDGET_CATEGORY_UNSPECIFIED", "WIDGET_CATEGORY_SPENDING_ANALYSIS", "WIDGET_CATEGORY_SUBSCRIPTION_MANAGER", "WIDGET_CATEGORY_CASH_FLOW", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WidgetCategory implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WidgetCategory[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final WidgetCategory WIDGET_CATEGORY_CASH_FLOW;
    public static final WidgetCategory WIDGET_CATEGORY_SPENDING_ANALYSIS;
    public static final WidgetCategory WIDGET_CATEGORY_SUBSCRIPTION_MANAGER;
    public static final WidgetCategory WIDGET_CATEGORY_UNSPECIFIED;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WidgetCategory$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetCategory;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        WidgetCategory widgetCategory = new WidgetCategory("WIDGET_CATEGORY_UNSPECIFIED", 0, 0);
        WIDGET_CATEGORY_UNSPECIFIED = widgetCategory;
        WidgetCategory widgetCategory2 = new WidgetCategory("WIDGET_CATEGORY_SPENDING_ANALYSIS", 1, 1);
        WIDGET_CATEGORY_SPENDING_ANALYSIS = widgetCategory2;
        WidgetCategory widgetCategory3 = new WidgetCategory("WIDGET_CATEGORY_SUBSCRIPTION_MANAGER", 2, 2);
        WIDGET_CATEGORY_SUBSCRIPTION_MANAGER = widgetCategory3;
        WidgetCategory widgetCategory4 = new WidgetCategory("WIDGET_CATEGORY_CASH_FLOW", 3, 3);
        WIDGET_CATEGORY_CASH_FLOW = widgetCategory4;
        WidgetCategory[] widgetCategoryArr = {widgetCategory, widgetCategory2, widgetCategory3, widgetCategory4};
        $VALUES = widgetCategoryArr;
        $ENTRIES = new EnumEntriesList(widgetCategoryArr);
        INSTANCE = new Companion();
        ADAPTER = new WidgetCategory$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(WidgetCategory.class), Syntax.PROTO_2, widgetCategory);
    }

    public WidgetCategory(String str, int i, int i2) {
        this.value = i2;
    }

    public static final WidgetCategory fromValue(int i) {
        INSTANCE.getClass();
        if (i == 0) {
            return WIDGET_CATEGORY_UNSPECIFIED;
        }
        if (i == 1) {
            return WIDGET_CATEGORY_SPENDING_ANALYSIS;
        }
        if (i == 2) {
            return WIDGET_CATEGORY_SUBSCRIPTION_MANAGER;
        }
        if (i != 3) {
            return null;
        }
        return WIDGET_CATEGORY_CASH_FLOW;
    }

    public static WidgetCategory valueOf(String str) {
        return (WidgetCategory) Enum.valueOf(WidgetCategory.class, str);
    }

    public static WidgetCategory[] values() {
        return (WidgetCategory[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
