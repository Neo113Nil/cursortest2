package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\n\u000b\t\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Metric;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric$Value;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric$Value;", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric$TrendDirection;", "trend_direction", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric$TrendDirection;", "Companion", "Builder", "Value", "TrendDirection", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Metric extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Metric> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Metric$TrendDirection#ADAPTER", schemaIndex = 1, tag = 4)
    public final TrendDirection trend_direction;

    @WireSealedOneof(schemaIndex = 0)
    public final Value value;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Metric$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric;", "<init>", "()V", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric$Value;", "trend_direction", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric$TrendDirection;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public TrendDirection trend_direction;
        public Value value;

        @Override // com.squareup.wire.Message.Builder
        public Metric build() {
            return new Metric(this.value, this.trend_direction, buildUnknownFields());
        }

        public final Builder trend_direction(TrendDirection trend_direction) {
            this.trend_direction = trend_direction;
            return this;
        }

        public final Builder value(Value value) {
            this.value = value;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Metric$TrendDirection;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "TREND_DIRECTION_UNSPECIFIED", "TREND_DIRECTION_UP", "TREND_DIRECTION_DOWN", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TrendDirection implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TrendDirection[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TrendDirection TREND_DIRECTION_DOWN;
        public static final TrendDirection TREND_DIRECTION_UNSPECIFIED;
        public static final TrendDirection TREND_DIRECTION_UP;
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Metric$TrendDirection$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric$TrendDirection;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            TrendDirection trendDirection = new TrendDirection("TREND_DIRECTION_UNSPECIFIED", 0, 0);
            TREND_DIRECTION_UNSPECIFIED = trendDirection;
            TrendDirection trendDirection2 = new TrendDirection("TREND_DIRECTION_UP", 1, 1);
            TREND_DIRECTION_UP = trendDirection2;
            TrendDirection trendDirection3 = new TrendDirection("TREND_DIRECTION_DOWN", 2, 2);
            TREND_DIRECTION_DOWN = trendDirection3;
            TrendDirection[] trendDirectionArr = {trendDirection, trendDirection2, trendDirection3};
            $VALUES = trendDirectionArr;
            $ENTRIES = new EnumEntriesList(trendDirectionArr);
            INSTANCE = new Companion();
            ADAPTER = new Metric$TrendDirection$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TrendDirection.class), Syntax.PROTO_2, trendDirection);
        }

        public TrendDirection(String str, int i, int i2) {
            this.value = i2;
        }

        public static final TrendDirection fromValue(int i) {
            INSTANCE.getClass();
            if (i == 0) {
                return TREND_DIRECTION_UNSPECIFIED;
            }
            if (i == 1) {
                return TREND_DIRECTION_UP;
            }
            if (i != 2) {
                return null;
            }
            return TREND_DIRECTION_DOWN;
        }

        public static TrendDirection valueOf(String str) {
            return (TrendDirection) Enum.valueOf(TrendDirection.class, str);
        }

        public static TrendDirection[] values() {
            return (TrendDirection[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Metric$Value;", "", "Money", "Percentage", "Number", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric$Value$Money;", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric$Value$Number;", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric$Value$Percentage;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Value {

        @WireOneofField(adapter = "com.squareup.protos.common.Money#ADAPTER", declaredName = "money", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Metric$Value$Money;", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric$Value;", "Lcom/squareup/protos/common/Money;", "value", "Lcom/squareup/protos/common/Money;", "getValue", "()Lcom/squareup/protos/common/Money;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Money extends Value {
            private final com.squareup.protos.common.Money value;

            public Money(com.squareup.protos.common.Money money) {
                money.getClass();
                this.value = money;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Money) && Intrinsics.areEqual(this.value, ((Money) obj).value);
            }

            public final com.squareup.protos.common.Money getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Money(value=", ")");
            }
        }

        @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", declaredName = InquiryField.FloatField.TYPE2, tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Metric$Value$Number;", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric$Value;", "", "value", "D", "getValue", "()D", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Number extends Value {
            private final double value;

            public Number(double d) {
                this.value = d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Number) && Double.compare(this.value, ((Number) obj).value) == 0;
            }

            public final double getValue() {
                return this.value;
            }

            public final int hashCode() {
                return Double.hashCode(this.value);
            }

            public final String toString() {
                return "Number(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", declaredName = "percentage", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Metric$Value$Percentage;", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric$Value;", "", "value", "D", "getValue", "()D", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Percentage extends Value {
            private final double value;

            public Percentage(double d) {
                this.value = d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Percentage) && Double.compare(this.value, ((Percentage) obj).value) == 0;
            }

            public final double getValue() {
                return this.value;
            }

            public final int hashCode() {
                return Double.hashCode(this.value);
            }

            public final String toString() {
                return "Percentage(value=" + this.value + ")";
            }
        }
    }

    static {
        Metric$Companion$ADAPTER$1 metric$Companion$ADAPTER$1 = new Metric$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Metric.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.Metric", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/slot_content.proto");
        ADAPTER = metric$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(metric$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Metric(Value value, TrendDirection trendDirection, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.value = value;
        this.trend_direction = trendDirection;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Metric)) {
            return false;
        }
        Metric metric = (Metric) obj;
        return Intrinsics.areEqual(unknownFields(), metric.unknownFields()) && Intrinsics.areEqual(this.value, metric.value) && this.trend_direction == metric.trend_direction;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Value value = this.value;
        int hashCode2 = (hashCode + (value != null ? value.hashCode() : 0)) * 37;
        TrendDirection trendDirection = this.trend_direction;
        int hashCode3 = hashCode2 + (trendDirection != null ? trendDirection.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.value = this.value;
        builder.trend_direction = this.trend_direction;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Value value = this.value;
        if (value != null) {
            arrayList.add("value=" + value);
        }
        TrendDirection trendDirection = this.trend_direction;
        if (trendDirection != null) {
            arrayList.add("trend_direction=" + trendDirection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Metric{", "}", 0, null, null, 56);
    }
}
