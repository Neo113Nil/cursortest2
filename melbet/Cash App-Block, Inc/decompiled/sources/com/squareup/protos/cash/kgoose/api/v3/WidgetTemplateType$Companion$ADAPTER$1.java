package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/WidgetTemplateType$Companion$ADAPTER$1", "Lcom/squareup/wire/EnumAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateType;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WidgetTemplateType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        WidgetTemplateType.INSTANCE.getClass();
        switch (i) {
            case 0:
                return WidgetTemplateType.WIDGET_TEMPLATE_TYPE_UNSPECIFIED;
            case 1:
                return WidgetTemplateType.WIDGET_TEMPLATE_TYPE_SPENDING;
            case 2:
                return WidgetTemplateType.WIDGET_TEMPLATE_TYPE_STOCK_PRICE;
            case 3:
                return WidgetTemplateType.WIDGET_TEMPLATE_TYPE_RECURRING_PAYMENTS;
            case 4:
                return WidgetTemplateType.WIDGET_TEMPLATE_TYPE_WEEKLY_BRIEF;
            case 5:
                return WidgetTemplateType.WIDGET_TEMPLATE_TYPE_PROMPT_MESSAGE;
            case 6:
                return WidgetTemplateType.WIDGET_TEMPLATE_TYPE_SUGGESTIONS;
            case 7:
                return WidgetTemplateType.WIDGET_TEMPLATE_TYPE_SUGGESTION_CARD;
            default:
                return null;
        }
    }
}
