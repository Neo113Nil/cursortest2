package com.squareup.protos.cash.local.client.v1;

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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/InStoreOrderingFulfillmentConfiguration;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/InStoreOrderingFulfillmentConfiguration$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment;", "cart_fulfillment", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InStoreOrderingFulfillmentConfiguration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InStoreOrderingFulfillmentConfiguration> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalFulfillment#ADAPTER", schemaIndex = 0, tag = 1)
    public final LocalFulfillment cart_fulfillment;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/InStoreOrderingFulfillmentConfiguration$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/InStoreOrderingFulfillmentConfiguration;", "<init>", "()V", "cart_fulfillment", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public LocalFulfillment cart_fulfillment;

        @Override // com.squareup.wire.Message.Builder
        public InStoreOrderingFulfillmentConfiguration build() {
            return new InStoreOrderingFulfillmentConfiguration(this.cart_fulfillment, buildUnknownFields());
        }

        public final Builder cart_fulfillment(LocalFulfillment cart_fulfillment) {
            this.cart_fulfillment = cart_fulfillment;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InStoreOrderingFulfillmentConfiguration.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.InStoreOrderingFulfillmentConfiguration$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public InStoreOrderingFulfillmentConfiguration decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new InStoreOrderingFulfillmentConfiguration((LocalFulfillment) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(LocalFulfillment.ADAPTER, reader, obj);
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InStoreOrderingFulfillmentConfiguration value) {
                writer.getClass();
                value.getClass();
                LocalFulfillment.ADAPTER.encodeWithTag(writer, 1, value.cart_fulfillment);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InStoreOrderingFulfillmentConfiguration value) {
                value.getClass();
                return LocalFulfillment.ADAPTER.encodedSizeWithTag(1, value.cart_fulfillment) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InStoreOrderingFulfillmentConfiguration redact(InStoreOrderingFulfillmentConfiguration value) {
                value.getClass();
                LocalFulfillment localFulfillment = value.cart_fulfillment;
                LocalFulfillment localFulfillment2 = localFulfillment != null ? (LocalFulfillment) LocalFulfillment.ADAPTER.redact(localFulfillment) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new InStoreOrderingFulfillmentConfiguration(localFulfillment2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InStoreOrderingFulfillmentConfiguration value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                LocalFulfillment.ADAPTER.encodeWithTag(writer, 1, value.cart_fulfillment);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InStoreOrderingFulfillmentConfiguration(LocalFulfillment localFulfillment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cart_fulfillment = localFulfillment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InStoreOrderingFulfillmentConfiguration)) {
            return false;
        }
        InStoreOrderingFulfillmentConfiguration inStoreOrderingFulfillmentConfiguration = (InStoreOrderingFulfillmentConfiguration) obj;
        return Intrinsics.areEqual(unknownFields(), inStoreOrderingFulfillmentConfiguration.unknownFields()) && Intrinsics.areEqual(this.cart_fulfillment, inStoreOrderingFulfillmentConfiguration.cart_fulfillment);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalFulfillment localFulfillment = this.cart_fulfillment;
        int hashCode2 = hashCode + (localFulfillment != null ? localFulfillment.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.cart_fulfillment = this.cart_fulfillment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalFulfillment localFulfillment = this.cart_fulfillment;
        if (localFulfillment != null) {
            arrayList.add("cart_fulfillment=" + localFulfillment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InStoreOrderingFulfillmentConfiguration{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/InStoreOrderingFulfillmentConfiguration$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/InStoreOrderingFulfillmentConfiguration$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/InStoreOrderingFulfillmentConfiguration;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/InStoreOrderingFulfillmentConfiguration;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ InStoreOrderingFulfillmentConfiguration build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
