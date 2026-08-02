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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentIntent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentIntent$Builder;", "", "customer_token", "Ljava/lang/String;", "idempotency_key", "withdrawal_destination", "", "amount_sats", "Ljava/lang/Long;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinConfirmationSpeed;", "selected_speed", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinConfirmationSpeed;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SendSparkPaymentIntent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SendSparkPaymentIntent> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", schemaIndex = 3, tag = 4)
    public final Long amount_sats;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String customer_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String idempotency_key;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SparkBitcoinConfirmationSpeed#ADAPTER", schemaIndex = 4, tag = 5)
    public final SparkBitcoinConfirmationSpeed selected_speed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String withdrawal_destination;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentIntent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentIntent;", "<init>", "()V", "customer_token", "", "idempotency_key", "withdrawal_destination", "amount_sats", "", "Ljava/lang/Long;", "selected_speed", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinConfirmationSpeed;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentIntent$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Long amount_sats;
        public String customer_token;
        public String idempotency_key;
        public SparkBitcoinConfirmationSpeed selected_speed;
        public String withdrawal_destination;

        public final Builder amount_sats(Long amount_sats) {
            this.amount_sats = amount_sats;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SendSparkPaymentIntent build() {
            return new SendSparkPaymentIntent(this.customer_token, this.idempotency_key, this.withdrawal_destination, this.amount_sats, this.selected_speed, buildUnknownFields());
        }

        public final Builder customer_token(String customer_token) {
            this.customer_token = customer_token;
            return this;
        }

        public final Builder idempotency_key(String idempotency_key) {
            this.idempotency_key = idempotency_key;
            return this;
        }

        public final Builder selected_speed(SparkBitcoinConfirmationSpeed selected_speed) {
            this.selected_speed = selected_speed;
            return this;
        }

        public final Builder withdrawal_destination(String withdrawal_destination) {
            this.withdrawal_destination = withdrawal_destination;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SendSparkPaymentIntent.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cashliteorchestrator.api.v1.SendSparkPaymentIntent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SendSparkPaymentIntent decode(ProtoReader reader) {
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
                        return new SendSparkPaymentIntent((String) obj, (String) obj2, (String) obj3, (Long) obj4, (SparkBitcoinConfirmationSpeed) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 4) {
                        obj4 = ProtoAdapter.UINT64.decode(reader);
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj5 = SparkBitcoinConfirmationSpeed.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SendSparkPaymentIntent value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.customer_token);
                protoAdapter2.encodeWithTag(writer, 2, value.idempotency_key);
                protoAdapter2.encodeWithTag(writer, 3, value.withdrawal_destination);
                ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.amount_sats);
                SparkBitcoinConfirmationSpeed.ADAPTER.encodeWithTag(writer, 5, value.selected_speed);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SendSparkPaymentIntent value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return SparkBitcoinConfirmationSpeed.ADAPTER.encodedSizeWithTag(5, value.selected_speed) + ProtoAdapter.UINT64.encodedSizeWithTag(4, value.amount_sats) + protoAdapter2.encodedSizeWithTag(3, value.withdrawal_destination) + protoAdapter2.encodedSizeWithTag(2, value.idempotency_key) + protoAdapter2.encodedSizeWithTag(1, value.customer_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SendSparkPaymentIntent redact(SendSparkPaymentIntent value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.customer_token;
                String str2 = value.idempotency_key;
                String str3 = value.withdrawal_destination;
                Long l = value.amount_sats;
                SparkBitcoinConfirmationSpeed sparkBitcoinConfirmationSpeed = value.selected_speed;
                value.getClass();
                byteString.getClass();
                return new SendSparkPaymentIntent(str, str2, str3, l, sparkBitcoinConfirmationSpeed, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SendSparkPaymentIntent value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                SparkBitcoinConfirmationSpeed.ADAPTER.encodeWithTag(writer, 5, value.selected_speed);
                ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.amount_sats);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 3, value.withdrawal_destination);
                protoAdapter2.encodeWithTag(writer, 2, value.idempotency_key);
                protoAdapter2.encodeWithTag(writer, 1, value.customer_token);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendSparkPaymentIntent(String str, String str2, String str3, Long l, SparkBitcoinConfirmationSpeed sparkBitcoinConfirmationSpeed, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.idempotency_key = str2;
        this.withdrawal_destination = str3;
        this.amount_sats = l;
        this.selected_speed = sparkBitcoinConfirmationSpeed;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendSparkPaymentIntent)) {
            return false;
        }
        SendSparkPaymentIntent sendSparkPaymentIntent = (SendSparkPaymentIntent) obj;
        return Intrinsics.areEqual(unknownFields(), sendSparkPaymentIntent.unknownFields()) && Intrinsics.areEqual(this.customer_token, sendSparkPaymentIntent.customer_token) && Intrinsics.areEqual(this.idempotency_key, sendSparkPaymentIntent.idempotency_key) && Intrinsics.areEqual(this.withdrawal_destination, sendSparkPaymentIntent.withdrawal_destination) && Intrinsics.areEqual(this.amount_sats, sendSparkPaymentIntent.amount_sats) && this.selected_speed == sendSparkPaymentIntent.selected_speed;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.idempotency_key;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.withdrawal_destination;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l = this.amount_sats;
        int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        SparkBitcoinConfirmationSpeed sparkBitcoinConfirmationSpeed = this.selected_speed;
        int hashCode6 = hashCode5 + (sparkBitcoinConfirmationSpeed != null ? sparkBitcoinConfirmationSpeed.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.customer_token = this.customer_token;
        builder.idempotency_key = this.idempotency_key;
        builder.withdrawal_destination = this.withdrawal_destination;
        builder.amount_sats = this.amount_sats;
        builder.selected_speed = this.selected_speed;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        String str2 = this.idempotency_key;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "idempotency_key=", arrayList);
        }
        String str3 = this.withdrawal_destination;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "withdrawal_destination=", arrayList);
        }
        Long l = this.amount_sats;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("amount_sats=", l, arrayList);
        }
        SparkBitcoinConfirmationSpeed sparkBitcoinConfirmationSpeed = this.selected_speed;
        if (sparkBitcoinConfirmationSpeed != null) {
            arrayList.add("selected_speed=" + sparkBitcoinConfirmationSpeed);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SendSparkPaymentIntent{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentIntent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentIntent$Builder;", "", "body", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentIntent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentIntent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SendSparkPaymentIntent build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
