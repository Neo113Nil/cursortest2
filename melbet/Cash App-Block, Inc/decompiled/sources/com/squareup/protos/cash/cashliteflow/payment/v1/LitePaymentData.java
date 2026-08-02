package com.squareup.protos.cash.cashliteflow.payment.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/cashliteflow/payment/v1/LitePaymentData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteflow/payment/v1/LitePaymentData$Builder;", "Lcom/squareup/protos/cash/cashliteflow/payment/v1/Chain;", "chain", "Lcom/squareup/protos/cash/cashliteflow/payment/v1/Chain;", "", "destination_address", "Ljava/lang/String;", "Lcom/squareup/protos/common/Money;", "amount", "Lcom/squareup/protos/common/Money;", "token", "", "created_at_ms", "Ljava/lang/Long;", "Lokio/ByteString;", "signature", "Lokio/ByteString;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LitePaymentData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LitePaymentData> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 2, tag = 3)
    public final Money amount;

    @WireField(adapter = "com.squareup.protos.cash.cashliteflow.payment.v1.Chain#ADAPTER", schemaIndex = 0, tag = 1)
    public final Chain chain;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 4, tag = 5)
    public final Long created_at_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String destination_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", schemaIndex = 5, tag = 6)
    public final ByteString signature;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String token;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0011J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/cash/cashliteflow/payment/v1/LitePaymentData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cashliteflow/payment/v1/LitePaymentData;", "<init>", "()V", "chain", "Lcom/squareup/protos/cash/cashliteflow/payment/v1/Chain;", "destination_address", "", "amount", "Lcom/squareup/protos/common/Money;", "token", "created_at_ms", "", "Ljava/lang/Long;", "signature", "Lokio/ByteString;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/cashliteflow/payment/v1/LitePaymentData$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Money amount;
        public Chain chain;
        public Long created_at_ms;
        public String destination_address;
        public ByteString signature;
        public String token;

        public final Builder amount(Money amount) {
            this.amount = amount;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public LitePaymentData build() {
            return new LitePaymentData(this.chain, this.destination_address, this.amount, this.token, this.created_at_ms, this.signature, buildUnknownFields());
        }

        public final Builder chain(Chain chain) {
            this.chain = chain;
            return this;
        }

        public final Builder created_at_ms(Long created_at_ms) {
            this.created_at_ms = created_at_ms;
            return this;
        }

        public final Builder destination_address(String destination_address) {
            this.destination_address = destination_address;
            return this;
        }

        public final Builder signature(ByteString signature) {
            this.signature = signature;
            return this;
        }

        public final Builder token(String token) {
            this.token = token;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LitePaymentData.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cashliteflow.payment.v1.LitePaymentData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public LitePaymentData decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new LitePaymentData((Chain) obj, (String) obj2, (Money) obj3, (String) obj4, (Long) obj5, (ByteString) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            try {
                                obj = Chain.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj3);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.INT64.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.BYTES.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LitePaymentData value) {
                writer.getClass();
                value.getClass();
                Chain.ADAPTER.encodeWithTag(writer, 1, value.chain);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.destination_address);
                Money.ADAPTER.encodeWithTag(writer, 3, value.amount);
                protoAdapter2.encodeWithTag(writer, 4, value.token);
                ProtoAdapter.INT64.encodeWithTag(writer, 5, value.created_at_ms);
                ProtoAdapter.BYTES.encodeWithTag(writer, 6, value.signature);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LitePaymentData value) {
                value.getClass();
                int encodedSizeWithTag = Chain.ADAPTER.encodedSizeWithTag(1, value.chain) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ProtoAdapter.BYTES.encodedSizeWithTag(6, value.signature) + ProtoAdapter.INT64.encodedSizeWithTag(5, value.created_at_ms) + protoAdapter2.encodedSizeWithTag(4, value.token) + Money.ADAPTER.encodedSizeWithTag(3, value.amount) + protoAdapter2.encodedSizeWithTag(2, value.destination_address) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LitePaymentData redact(LitePaymentData value) {
                value.getClass();
                Money money = value.amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                ByteString byteString = ByteString.EMPTY;
                Chain chain = value.chain;
                String str = value.destination_address;
                String str2 = value.token;
                Long l = value.created_at_ms;
                ByteString byteString2 = value.signature;
                byteString.getClass();
                return new LitePaymentData(chain, str, money2, str2, l, byteString2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LitePaymentData value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BYTES.encodeWithTag(writer, 6, value.signature);
                ProtoAdapter.INT64.encodeWithTag(writer, 5, value.created_at_ms);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 4, value.token);
                Money.ADAPTER.encodeWithTag(writer, 3, value.amount);
                protoAdapter2.encodeWithTag(writer, 2, value.destination_address);
                Chain.ADAPTER.encodeWithTag(writer, 1, value.chain);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LitePaymentData(Chain chain, String str, Money money, String str2, Long l, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.chain = chain;
        this.destination_address = str;
        this.amount = money;
        this.token = str2;
        this.created_at_ms = l;
        this.signature = byteString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LitePaymentData)) {
            return false;
        }
        LitePaymentData litePaymentData = (LitePaymentData) obj;
        return Intrinsics.areEqual(unknownFields(), litePaymentData.unknownFields()) && this.chain == litePaymentData.chain && Intrinsics.areEqual(this.destination_address, litePaymentData.destination_address) && Intrinsics.areEqual(this.amount, litePaymentData.amount) && Intrinsics.areEqual(this.token, litePaymentData.token) && Intrinsics.areEqual(this.created_at_ms, litePaymentData.created_at_ms) && Intrinsics.areEqual(this.signature, litePaymentData.signature);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Chain chain = this.chain;
        int hashCode2 = (hashCode + (chain != null ? chain.hashCode() : 0)) * 37;
        String str = this.destination_address;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        String str2 = this.token;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.created_at_ms;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        ByteString byteString = this.signature;
        int hashCode7 = hashCode6 + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.chain = this.chain;
        builder.destination_address = this.destination_address;
        builder.amount = this.amount;
        builder.token = this.token;
        builder.created_at_ms = this.created_at_ms;
        builder.signature = this.signature;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Chain chain = this.chain;
        if (chain != null) {
            arrayList.add("chain=" + chain);
        }
        String str = this.destination_address;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "destination_address=", arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        String str2 = this.token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "token=", arrayList);
        }
        Long l = this.created_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at_ms=", l, arrayList);
        }
        ByteString byteString = this.signature;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("signature=", byteString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LitePaymentData{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cashliteflow/payment/v1/LitePaymentData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cashliteflow/payment/v1/LitePaymentData$Builder;", "", "body", "Lcom/squareup/protos/cash/cashliteflow/payment/v1/LitePaymentData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cashliteflow/payment/v1/LitePaymentData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ LitePaymentData build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
