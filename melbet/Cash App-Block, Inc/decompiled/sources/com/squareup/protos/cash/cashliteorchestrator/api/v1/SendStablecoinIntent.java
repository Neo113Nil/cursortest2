package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendStablecoinIntent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendStablecoinIntent$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Stablecoin;", "currency", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Stablecoin;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Chain;", "source_chain", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Chain;", "dest_chain", "", "amount", "Ljava/lang/String;", "recipient", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SendStablecoinIntent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SendStablecoinIntent> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String amount;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.Stablecoin#ADAPTER", schemaIndex = 0, tag = 1)
    public final Stablecoin currency;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.Chain#ADAPTER", schemaIndex = 2, tag = 3)
    public final Chain dest_chain;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String recipient;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.Chain#ADAPTER", schemaIndex = 1, tag = 2)
    public final Chain source_chain;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendStablecoinIntent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendStablecoinIntent;", "<init>", "()V", "currency", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Stablecoin;", "source_chain", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Chain;", "dest_chain", "amount", "", "recipient", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String amount;
        public Stablecoin currency;
        public Chain dest_chain;
        public String recipient;
        public Chain source_chain;

        public final Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SendStablecoinIntent build() {
            return new SendStablecoinIntent(this.currency, this.source_chain, this.dest_chain, this.amount, this.recipient, buildUnknownFields());
        }

        public final Builder currency(Stablecoin currency) {
            this.currency = currency;
            return this;
        }

        public final Builder dest_chain(Chain dest_chain) {
            this.dest_chain = dest_chain;
            return this;
        }

        public final Builder recipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public final Builder source_chain(Chain source_chain) {
            this.source_chain = source_chain;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SendStablecoinIntent.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cashliteorchestrator.api.v1.SendStablecoinIntent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SendStablecoinIntent decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SendStablecoinIntent((Stablecoin) obj, (Chain) obj2, (Chain) obj3, (String) obj4, (String) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = Stablecoin.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        try {
                            obj2 = Chain.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (nextTag == 3) {
                        try {
                            obj3 = Chain.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        }
                    } else if (nextTag == 4) {
                        obj4 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj5 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SendStablecoinIntent value) {
                writer.getClass();
                value.getClass();
                Stablecoin.ADAPTER.encodeWithTag(writer, 1, value.currency);
                ProtoAdapter protoAdapter2 = Chain.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 2, value.source_chain);
                protoAdapter2.encodeWithTag(writer, 3, value.dest_chain);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 4, value.amount);
                protoAdapter3.encodeWithTag(writer, 5, value.recipient);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SendStablecoinIntent value) {
                value.getClass();
                int encodedSizeWithTag = Stablecoin.ADAPTER.encodedSizeWithTag(1, value.currency) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = Chain.ADAPTER;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(3, value.dest_chain) + protoAdapter2.encodedSizeWithTag(2, value.source_chain) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                return protoAdapter3.encodedSizeWithTag(5, value.recipient) + protoAdapter3.encodedSizeWithTag(4, value.amount) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SendStablecoinIntent redact(SendStablecoinIntent value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                Stablecoin stablecoin = value.currency;
                Chain chain = value.source_chain;
                Chain chain2 = value.dest_chain;
                String str = value.amount;
                String str2 = value.recipient;
                value.getClass();
                byteString.getClass();
                return new SendStablecoinIntent(stablecoin, chain, chain2, str, str2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SendStablecoinIntent value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.recipient);
                protoAdapter2.encodeWithTag(writer, 4, value.amount);
                ProtoAdapter protoAdapter3 = Chain.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 3, value.dest_chain);
                protoAdapter3.encodeWithTag(writer, 2, value.source_chain);
                Stablecoin.ADAPTER.encodeWithTag(writer, 1, value.currency);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendStablecoinIntent(Stablecoin stablecoin, Chain chain, Chain chain2, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.currency = stablecoin;
        this.source_chain = chain;
        this.dest_chain = chain2;
        this.amount = str;
        this.recipient = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendStablecoinIntent)) {
            return false;
        }
        SendStablecoinIntent sendStablecoinIntent = (SendStablecoinIntent) obj;
        return Intrinsics.areEqual(unknownFields(), sendStablecoinIntent.unknownFields()) && this.currency == sendStablecoinIntent.currency && this.source_chain == sendStablecoinIntent.source_chain && this.dest_chain == sendStablecoinIntent.dest_chain && Intrinsics.areEqual(this.amount, sendStablecoinIntent.amount) && Intrinsics.areEqual(this.recipient, sendStablecoinIntent.recipient);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Stablecoin stablecoin = this.currency;
        int hashCode2 = (hashCode + (stablecoin != null ? stablecoin.hashCode() : 0)) * 37;
        Chain chain = this.source_chain;
        int hashCode3 = (hashCode2 + (chain != null ? chain.hashCode() : 0)) * 37;
        Chain chain2 = this.dest_chain;
        int hashCode4 = (hashCode3 + (chain2 != null ? chain2.hashCode() : 0)) * 37;
        String str = this.amount;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.recipient;
        int hashCode6 = hashCode5 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.currency = this.currency;
        builder.source_chain = this.source_chain;
        builder.dest_chain = this.dest_chain;
        builder.amount = this.amount;
        builder.recipient = this.recipient;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Stablecoin stablecoin = this.currency;
        if (stablecoin != null) {
            arrayList.add("currency=" + stablecoin);
        }
        Chain chain = this.source_chain;
        if (chain != null) {
            arrayList.add("source_chain=" + chain);
        }
        Chain chain2 = this.dest_chain;
        if (chain2 != null) {
            arrayList.add("dest_chain=" + chain2);
        }
        String str = this.amount;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "amount=", arrayList);
        }
        String str2 = this.recipient;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "recipient=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SendStablecoinIntent{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendStablecoinIntent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendStablecoinIntent$Builder;", "", "body", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendStablecoinIntent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendStablecoinIntent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SendStablecoinIntent build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
