package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentDisplayData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentDisplayData$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkPaymentRail;", "rail", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkPaymentRail;", "", "amount_sats", "Ljava/lang/Long;", "fee_sats", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinFeeQuote;", "bitcoin_fee_quote", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinFeeQuote;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SendSparkPaymentDisplayData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SendSparkPaymentDisplayData> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", schemaIndex = 1, tag = 2)
    public final Long amount_sats;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SparkBitcoinFeeQuote#ADAPTER", schemaIndex = 3, tag = 4)
    public final SparkBitcoinFeeQuote bitcoin_fee_quote;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", schemaIndex = 2, tag = 3)
    public final Long fee_sats;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SparkPaymentRail#ADAPTER", schemaIndex = 0, tag = 1)
    public final SparkPaymentRail rail;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\rJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\rJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentDisplayData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentDisplayData;", "<init>", "()V", "rail", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkPaymentRail;", "amount_sats", "", "Ljava/lang/Long;", "fee_sats", "bitcoin_fee_quote", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinFeeQuote;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentDisplayData$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Long amount_sats;
        public SparkBitcoinFeeQuote bitcoin_fee_quote;
        public Long fee_sats;
        public SparkPaymentRail rail;

        public final Builder amount_sats(Long amount_sats) {
            this.amount_sats = amount_sats;
            return this;
        }

        public final Builder bitcoin_fee_quote(SparkBitcoinFeeQuote bitcoin_fee_quote) {
            this.bitcoin_fee_quote = bitcoin_fee_quote;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SendSparkPaymentDisplayData build() {
            return new SendSparkPaymentDisplayData(this.rail, this.amount_sats, this.fee_sats, this.bitcoin_fee_quote, buildUnknownFields());
        }

        public final Builder fee_sats(Long fee_sats) {
            this.fee_sats = fee_sats;
            return this;
        }

        public final Builder rail(SparkPaymentRail rail) {
            this.rail = rail;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SendSparkPaymentDisplayData.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cashliteorchestrator.api.v1.SendSparkPaymentDisplayData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SendSparkPaymentDisplayData decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SendSparkPaymentDisplayData((SparkPaymentRail) obj, (Long) obj2, (Long) obj3, (SparkBitcoinFeeQuote) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = SparkPaymentRail.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.UINT64.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.UINT64.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(SparkBitcoinFeeQuote.ADAPTER, reader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SendSparkPaymentDisplayData value) {
                writer.getClass();
                value.getClass();
                SparkPaymentRail.ADAPTER.encodeWithTag(writer, 1, value.rail);
                ProtoAdapter protoAdapter2 = ProtoAdapter.UINT64;
                protoAdapter2.encodeWithTag(writer, 2, value.amount_sats);
                protoAdapter2.encodeWithTag(writer, 3, value.fee_sats);
                SparkBitcoinFeeQuote.ADAPTER.encodeWithTag(writer, 4, value.bitcoin_fee_quote);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SendSparkPaymentDisplayData value) {
                value.getClass();
                int encodedSizeWithTag = SparkPaymentRail.ADAPTER.encodedSizeWithTag(1, value.rail) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.UINT64;
                return SparkBitcoinFeeQuote.ADAPTER.encodedSizeWithTag(4, value.bitcoin_fee_quote) + protoAdapter2.encodedSizeWithTag(3, value.fee_sats) + protoAdapter2.encodedSizeWithTag(2, value.amount_sats) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SendSparkPaymentDisplayData redact(SendSparkPaymentDisplayData value) {
                value.getClass();
                SparkBitcoinFeeQuote sparkBitcoinFeeQuote = value.bitcoin_fee_quote;
                SparkBitcoinFeeQuote sparkBitcoinFeeQuote2 = sparkBitcoinFeeQuote != null ? (SparkBitcoinFeeQuote) SparkBitcoinFeeQuote.ADAPTER.redact(sparkBitcoinFeeQuote) : null;
                ByteString byteString = ByteString.EMPTY;
                SparkPaymentRail sparkPaymentRail = value.rail;
                Long l = value.amount_sats;
                Long l2 = value.fee_sats;
                byteString.getClass();
                return new SendSparkPaymentDisplayData(sparkPaymentRail, l, l2, sparkBitcoinFeeQuote2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SendSparkPaymentDisplayData value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                SparkBitcoinFeeQuote.ADAPTER.encodeWithTag(writer, 4, value.bitcoin_fee_quote);
                ProtoAdapter protoAdapter2 = ProtoAdapter.UINT64;
                protoAdapter2.encodeWithTag(writer, 3, value.fee_sats);
                protoAdapter2.encodeWithTag(writer, 2, value.amount_sats);
                SparkPaymentRail.ADAPTER.encodeWithTag(writer, 1, value.rail);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendSparkPaymentDisplayData(SparkPaymentRail sparkPaymentRail, Long l, Long l2, SparkBitcoinFeeQuote sparkBitcoinFeeQuote, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.rail = sparkPaymentRail;
        this.amount_sats = l;
        this.fee_sats = l2;
        this.bitcoin_fee_quote = sparkBitcoinFeeQuote;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendSparkPaymentDisplayData)) {
            return false;
        }
        SendSparkPaymentDisplayData sendSparkPaymentDisplayData = (SendSparkPaymentDisplayData) obj;
        return Intrinsics.areEqual(unknownFields(), sendSparkPaymentDisplayData.unknownFields()) && this.rail == sendSparkPaymentDisplayData.rail && Intrinsics.areEqual(this.amount_sats, sendSparkPaymentDisplayData.amount_sats) && Intrinsics.areEqual(this.fee_sats, sendSparkPaymentDisplayData.fee_sats) && Intrinsics.areEqual(this.bitcoin_fee_quote, sendSparkPaymentDisplayData.bitcoin_fee_quote);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SparkPaymentRail sparkPaymentRail = this.rail;
        int hashCode2 = (hashCode + (sparkPaymentRail != null ? sparkPaymentRail.hashCode() : 0)) * 37;
        Long l = this.amount_sats;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.fee_sats;
        int hashCode4 = (hashCode3 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        SparkBitcoinFeeQuote sparkBitcoinFeeQuote = this.bitcoin_fee_quote;
        int hashCode5 = hashCode4 + (sparkBitcoinFeeQuote != null ? sparkBitcoinFeeQuote.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.rail = this.rail;
        builder.amount_sats = this.amount_sats;
        builder.fee_sats = this.fee_sats;
        builder.bitcoin_fee_quote = this.bitcoin_fee_quote;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SparkPaymentRail sparkPaymentRail = this.rail;
        if (sparkPaymentRail != null) {
            arrayList.add("rail=" + sparkPaymentRail);
        }
        Long l = this.amount_sats;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("amount_sats=", l, arrayList);
        }
        Long l2 = this.fee_sats;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("fee_sats=", l2, arrayList);
        }
        SparkBitcoinFeeQuote sparkBitcoinFeeQuote = this.bitcoin_fee_quote;
        if (sparkBitcoinFeeQuote != null) {
            arrayList.add("bitcoin_fee_quote=" + sparkBitcoinFeeQuote);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SendSparkPaymentDisplayData{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentDisplayData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentDisplayData$Builder;", "", "body", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentDisplayData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentDisplayData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SendSparkPaymentDisplayData build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
