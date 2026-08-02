package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/FreeFulfillmentConfiguration;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/FreeFulfillmentConfiguration$Builder;", "", AnnotatedPrivateKey.LABEL, "Ljava/lang/String;", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "order_subtotal_amount", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillmentType;", "fulfillment_type", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillmentType;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FreeFulfillmentConfiguration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FreeFulfillmentConfiguration> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalFulfillmentType#ADAPTER", schemaIndex = 2, tag = 3)
    public final LocalFulfillmentType fulfillment_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String label;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalMoney order_subtotal_amount;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/FreeFulfillmentConfiguration$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/FreeFulfillmentConfiguration;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "order_subtotal_amount", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "fulfillment_type", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillmentType;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public LocalFulfillmentType fulfillment_type;
        public String label;
        public LocalMoney order_subtotal_amount;

        @Override // com.squareup.wire.Message.Builder
        public FreeFulfillmentConfiguration build() {
            return new FreeFulfillmentConfiguration(this.label, this.order_subtotal_amount, this.fulfillment_type, buildUnknownFields());
        }

        public final Builder fulfillment_type(LocalFulfillmentType fulfillment_type) {
            this.fulfillment_type = fulfillment_type;
            return this;
        }

        public final Builder label(String label) {
            this.label = label;
            return this;
        }

        public final Builder order_subtotal_amount(LocalMoney order_subtotal_amount) {
            this.order_subtotal_amount = order_subtotal_amount;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FreeFulfillmentConfiguration.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.FreeFulfillmentConfiguration$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public FreeFulfillmentConfiguration decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new FreeFulfillmentConfiguration((String) obj, (LocalMoney) obj2, (LocalFulfillmentType) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj2);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj3 = LocalFulfillmentType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FreeFulfillmentConfiguration value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.label);
                LocalMoney.ADAPTER.encodeWithTag(writer, 2, value.order_subtotal_amount);
                LocalFulfillmentType.ADAPTER.encodeWithTag(writer, 3, value.fulfillment_type);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FreeFulfillmentConfiguration value) {
                value.getClass();
                return LocalFulfillmentType.ADAPTER.encodedSizeWithTag(3, value.fulfillment_type) + LocalMoney.ADAPTER.encodedSizeWithTag(2, value.order_subtotal_amount) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.label) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FreeFulfillmentConfiguration redact(FreeFulfillmentConfiguration value) {
                value.getClass();
                LocalMoney localMoney = value.order_subtotal_amount;
                LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.label;
                LocalFulfillmentType localFulfillmentType = value.fulfillment_type;
                byteString.getClass();
                return new FreeFulfillmentConfiguration(str, localMoney2, localFulfillmentType, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FreeFulfillmentConfiguration value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                LocalFulfillmentType.ADAPTER.encodeWithTag(writer, 3, value.fulfillment_type);
                LocalMoney.ADAPTER.encodeWithTag(writer, 2, value.order_subtotal_amount);
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.label);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreeFulfillmentConfiguration(String str, LocalMoney localMoney, LocalFulfillmentType localFulfillmentType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.label = str;
        this.order_subtotal_amount = localMoney;
        this.fulfillment_type = localFulfillmentType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FreeFulfillmentConfiguration)) {
            return false;
        }
        FreeFulfillmentConfiguration freeFulfillmentConfiguration = (FreeFulfillmentConfiguration) obj;
        return Intrinsics.areEqual(unknownFields(), freeFulfillmentConfiguration.unknownFields()) && Intrinsics.areEqual(this.label, freeFulfillmentConfiguration.label) && Intrinsics.areEqual(this.order_subtotal_amount, freeFulfillmentConfiguration.order_subtotal_amount) && this.fulfillment_type == freeFulfillmentConfiguration.fulfillment_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.label;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalMoney localMoney = this.order_subtotal_amount;
        int hashCode3 = (hashCode2 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
        LocalFulfillmentType localFulfillmentType = this.fulfillment_type;
        int hashCode4 = hashCode3 + (localFulfillmentType != null ? localFulfillmentType.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.label = this.label;
        builder.order_subtotal_amount = this.order_subtotal_amount;
        builder.fulfillment_type = this.fulfillment_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.label;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
        }
        LocalMoney localMoney = this.order_subtotal_amount;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("order_subtotal_amount=", localMoney, arrayList);
        }
        LocalFulfillmentType localFulfillmentType = this.fulfillment_type;
        if (localFulfillmentType != null) {
            arrayList.add("fulfillment_type=" + localFulfillmentType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FreeFulfillmentConfiguration{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/FreeFulfillmentConfiguration$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/FreeFulfillmentConfiguration$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/FreeFulfillmentConfiguration;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/FreeFulfillmentConfiguration;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ FreeFulfillmentConfiguration build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
