package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config;", "config", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config;", "Companion", "Builder", "Config", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WidgetConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WidgetConfig> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final Config config;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig;", "<init>", "()V", "config", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Config config;

        @Override // com.squareup.wire.Message.Builder
        public WidgetConfig build() {
            return new WidgetConfig(this.config, buildUnknownFields());
        }

        public final Builder config(Config config) {
            this.config = config;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config;", "", "StockPrice", "Spending", "Recurring", "WeeklyBrief", "PromptMessage", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config$PromptMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config$Recurring;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config$Spending;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config$StockPrice;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config$WeeklyBrief;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Config {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.PromptMessageConfig#ADAPTER", declaredName = "prompt_message", tag = 5)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config$PromptMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config;", "Lcom/squareup/protos/cash/kgoose/api/v3/PromptMessageConfig;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/PromptMessageConfig;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/PromptMessageConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PromptMessage extends Config {
            private final PromptMessageConfig value;

            public PromptMessage(PromptMessageConfig promptMessageConfig) {
                promptMessageConfig.getClass();
                this.value = promptMessageConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PromptMessage) && Intrinsics.areEqual(this.value, ((PromptMessage) obj).value);
            }

            public final PromptMessageConfig getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PromptMessage(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.RecurringPaymentsConfig#ADAPTER", declaredName = "recurring", tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config$Recurring;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config;", "Lcom/squareup/protos/cash/kgoose/api/v3/RecurringPaymentsConfig;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/RecurringPaymentsConfig;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/RecurringPaymentsConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Recurring extends Config {
            private final RecurringPaymentsConfig value;

            public Recurring(RecurringPaymentsConfig recurringPaymentsConfig) {
                recurringPaymentsConfig.getClass();
                this.value = recurringPaymentsConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Recurring) && Intrinsics.areEqual(this.value, ((Recurring) obj).value);
            }

            public final RecurringPaymentsConfig getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Recurring(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.SpendingConfig#ADAPTER", declaredName = "spending", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config$Spending;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config;", "Lcom/squareup/protos/cash/kgoose/api/v3/SpendingConfig;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/SpendingConfig;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/SpendingConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Spending extends Config {
            private final SpendingConfig value;

            public Spending(SpendingConfig spendingConfig) {
                spendingConfig.getClass();
                this.value = spendingConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Spending) && Intrinsics.areEqual(this.value, ((Spending) obj).value);
            }

            public final SpendingConfig getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Spending(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.StockPriceConfig#ADAPTER", declaredName = "stock_price", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config$StockPrice;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config;", "Lcom/squareup/protos/cash/kgoose/api/v3/StockPriceConfig;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/StockPriceConfig;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/StockPriceConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class StockPrice extends Config {
            private final StockPriceConfig value;

            public StockPrice(StockPriceConfig stockPriceConfig) {
                stockPriceConfig.getClass();
                this.value = stockPriceConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StockPrice) && Intrinsics.areEqual(this.value, ((StockPrice) obj).value);
            }

            public final StockPriceConfig getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "StockPrice(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.WeeklyBriefConfig#ADAPTER", declaredName = "weekly_brief", tag = 4)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config$WeeklyBrief;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig$Config;", "Lcom/squareup/protos/cash/kgoose/api/v3/WeeklyBriefConfig;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/WeeklyBriefConfig;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/WeeklyBriefConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class WeeklyBrief extends Config {
            private final WeeklyBriefConfig value;

            public WeeklyBrief(WeeklyBriefConfig weeklyBriefConfig) {
                weeklyBriefConfig.getClass();
                this.value = weeklyBriefConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WeeklyBrief) && Intrinsics.areEqual(this.value, ((WeeklyBrief) obj).value);
            }

            public final WeeklyBriefConfig getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "WeeklyBrief(value=" + this.value + ")";
            }
        }
    }

    static {
        WidgetConfig$Companion$ADAPTER$1 widgetConfig$Companion$ADAPTER$1 = new WidgetConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WidgetConfig.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.WidgetConfig", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/widget_messages.proto");
        ADAPTER = widgetConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(widgetConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetConfig(Config config, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.config = config;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WidgetConfig)) {
            return false;
        }
        WidgetConfig widgetConfig = (WidgetConfig) obj;
        return Intrinsics.areEqual(unknownFields(), widgetConfig.unknownFields()) && Intrinsics.areEqual(this.config, widgetConfig.config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Config config = this.config;
        int hashCode2 = hashCode + (config != null ? config.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.config = this.config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Config config = this.config;
        if (config != null) {
            arrayList.add("config=" + config);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WidgetConfig{", "}", 0, null, null, 56);
    }
}
