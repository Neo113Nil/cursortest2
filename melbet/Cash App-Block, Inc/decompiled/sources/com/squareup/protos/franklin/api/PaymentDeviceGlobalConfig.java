package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceGlobalConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PaymentDeviceGlobalConfig$Builder;", "Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig;", "payment_card_global_config", "Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentDeviceGlobalConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentDeviceGlobalConfig> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.PaymentCardGlobalConfig#ADAPTER", schemaIndex = 0, tag = 1)
    public final PaymentCardGlobalConfig payment_card_global_config;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceGlobalConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PaymentDeviceGlobalConfig;", "<init>", "()V", "payment_card_global_config", "Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public PaymentCardGlobalConfig payment_card_global_config;

        @Override // com.squareup.wire.Message.Builder
        public PaymentDeviceGlobalConfig build() {
            return new PaymentDeviceGlobalConfig(this.payment_card_global_config, buildUnknownFields());
        }

        public final Builder payment_card_global_config(PaymentCardGlobalConfig payment_card_global_config) {
            this.payment_card_global_config = payment_card_global_config;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentDeviceGlobalConfig.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PaymentDeviceGlobalConfig$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PaymentDeviceGlobalConfig decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PaymentDeviceGlobalConfig((PaymentCardGlobalConfig) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(PaymentCardGlobalConfig.ADAPTER, reader, obj);
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PaymentDeviceGlobalConfig value) {
                writer.getClass();
                value.getClass();
                PaymentCardGlobalConfig.ADAPTER.encodeWithTag(writer, 1, value.payment_card_global_config);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PaymentDeviceGlobalConfig value) {
                value.getClass();
                return PaymentCardGlobalConfig.ADAPTER.encodedSizeWithTag(1, value.payment_card_global_config) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PaymentDeviceGlobalConfig redact(PaymentDeviceGlobalConfig value) {
                value.getClass();
                PaymentCardGlobalConfig paymentCardGlobalConfig = value.payment_card_global_config;
                PaymentCardGlobalConfig paymentCardGlobalConfig2 = paymentCardGlobalConfig != null ? (PaymentCardGlobalConfig) PaymentCardGlobalConfig.ADAPTER.redact(paymentCardGlobalConfig) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new PaymentDeviceGlobalConfig(paymentCardGlobalConfig2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PaymentDeviceGlobalConfig value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                PaymentCardGlobalConfig.ADAPTER.encodeWithTag(writer, 1, value.payment_card_global_config);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDeviceGlobalConfig(PaymentCardGlobalConfig paymentCardGlobalConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_card_global_config = paymentCardGlobalConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentDeviceGlobalConfig)) {
            return false;
        }
        PaymentDeviceGlobalConfig paymentDeviceGlobalConfig = (PaymentDeviceGlobalConfig) obj;
        return Intrinsics.areEqual(unknownFields(), paymentDeviceGlobalConfig.unknownFields()) && Intrinsics.areEqual(this.payment_card_global_config, paymentDeviceGlobalConfig.payment_card_global_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PaymentCardGlobalConfig paymentCardGlobalConfig = this.payment_card_global_config;
        int hashCode2 = hashCode + (paymentCardGlobalConfig != null ? paymentCardGlobalConfig.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.payment_card_global_config = this.payment_card_global_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PaymentCardGlobalConfig paymentCardGlobalConfig = this.payment_card_global_config;
        if (paymentCardGlobalConfig != null) {
            arrayList.add("payment_card_global_config=" + paymentCardGlobalConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentDeviceGlobalConfig{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceGlobalConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PaymentDeviceGlobalConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PaymentDeviceGlobalConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PaymentDeviceGlobalConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PaymentDeviceGlobalConfig build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
