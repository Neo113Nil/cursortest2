package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.WidgetConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WidgetConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        WidgetConfig.Config config = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new WidgetConfig(config, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                config = new WidgetConfig.Config.StockPrice((StockPriceConfig) StockPriceConfig.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                config = new WidgetConfig.Config.Spending((SpendingConfig) SpendingConfig.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                config = new WidgetConfig.Config.Recurring((RecurringPaymentsConfig) RecurringPaymentsConfig.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                config = new WidgetConfig.Config.WeeklyBrief((WeeklyBriefConfig) WeeklyBriefConfig.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                config = new WidgetConfig.Config.PromptMessage((PromptMessageConfig) PromptMessageConfig.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WidgetConfig widgetConfig = (WidgetConfig) obj;
        reverseProtoWriter.getClass();
        widgetConfig.getClass();
        reverseProtoWriter.writeBytes(widgetConfig.unknownFields());
        WidgetConfig.Config config = widgetConfig.config;
        if (config instanceof WidgetConfig.Config.StockPrice) {
            StockPriceConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((WidgetConfig.Config.StockPrice) config).getValue());
            return;
        }
        if (config instanceof WidgetConfig.Config.Spending) {
            SpendingConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((WidgetConfig.Config.Spending) config).getValue());
            return;
        }
        if (config instanceof WidgetConfig.Config.Recurring) {
            RecurringPaymentsConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((WidgetConfig.Config.Recurring) config).getValue());
            return;
        }
        if (config instanceof WidgetConfig.Config.WeeklyBrief) {
            WeeklyBriefConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((WidgetConfig.Config.WeeklyBrief) config).getValue());
        } else if (config instanceof WidgetConfig.Config.PromptMessage) {
            PromptMessageConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((WidgetConfig.Config.PromptMessage) config).getValue());
        } else {
            if (config == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        WidgetConfig widgetConfig = (WidgetConfig) obj;
        widgetConfig.getClass();
        int size$okio = widgetConfig.unknownFields().getSize$okio();
        WidgetConfig.Config config = widgetConfig.config;
        if (config instanceof WidgetConfig.Config.StockPrice) {
            encodedSizeWithTag = StockPriceConfig.ADAPTER.encodedSizeWithTag(1, ((WidgetConfig.Config.StockPrice) config).getValue());
        } else if (config instanceof WidgetConfig.Config.Spending) {
            encodedSizeWithTag = SpendingConfig.ADAPTER.encodedSizeWithTag(2, ((WidgetConfig.Config.Spending) config).getValue());
        } else if (config instanceof WidgetConfig.Config.Recurring) {
            encodedSizeWithTag = RecurringPaymentsConfig.ADAPTER.encodedSizeWithTag(3, ((WidgetConfig.Config.Recurring) config).getValue());
        } else if (config instanceof WidgetConfig.Config.WeeklyBrief) {
            encodedSizeWithTag = WeeklyBriefConfig.ADAPTER.encodedSizeWithTag(4, ((WidgetConfig.Config.WeeklyBrief) config).getValue());
        } else {
            if (!(config instanceof WidgetConfig.Config.PromptMessage)) {
                if (config == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = PromptMessageConfig.ADAPTER.encodedSizeWithTag(5, ((WidgetConfig.Config.PromptMessage) config).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WidgetConfig widgetConfig = (WidgetConfig) obj;
        widgetConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        WidgetConfig.Config config = widgetConfig.config;
        byteString.getClass();
        return new WidgetConfig(config, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WidgetConfig widgetConfig = (WidgetConfig) obj;
        widgetConfig.getClass();
        WidgetConfig.Config config = widgetConfig.config;
        if (config instanceof WidgetConfig.Config.StockPrice) {
            StockPriceConfig.ADAPTER.encodeWithTag(protoWriter, 1, ((WidgetConfig.Config.StockPrice) config).getValue());
        } else if (config instanceof WidgetConfig.Config.Spending) {
            SpendingConfig.ADAPTER.encodeWithTag(protoWriter, 2, ((WidgetConfig.Config.Spending) config).getValue());
        } else if (config instanceof WidgetConfig.Config.Recurring) {
            RecurringPaymentsConfig.ADAPTER.encodeWithTag(protoWriter, 3, ((WidgetConfig.Config.Recurring) config).getValue());
        } else if (config instanceof WidgetConfig.Config.WeeklyBrief) {
            WeeklyBriefConfig.ADAPTER.encodeWithTag(protoWriter, 4, ((WidgetConfig.Config.WeeklyBrief) config).getValue());
        } else if (config instanceof WidgetConfig.Config.PromptMessage) {
            PromptMessageConfig.ADAPTER.encodeWithTag(protoWriter, 5, ((WidgetConfig.Config.PromptMessage) config).getValue());
        } else if (config != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(widgetConfig.unknownFields());
    }
}
