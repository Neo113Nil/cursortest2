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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/FulfillmentHours;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/FulfillmentHours$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillmentType;", "fulfillment_type", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillmentType;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatusAndHours;", "hours_and_status", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatusAndHours;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FulfillmentHours extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FulfillmentHours> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalFulfillmentType#ADAPTER", schemaIndex = 0, tag = 1)
    public final LocalFulfillmentType fulfillment_type;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOpenStatusAndHours#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalOpenStatusAndHours hours_and_status;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/FulfillmentHours$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/FulfillmentHours;", "<init>", "()V", "fulfillment_type", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillmentType;", "hours_and_status", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatusAndHours;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public LocalFulfillmentType fulfillment_type;
        public LocalOpenStatusAndHours hours_and_status;

        @Override // com.squareup.wire.Message.Builder
        public FulfillmentHours build() {
            return new FulfillmentHours(this.fulfillment_type, this.hours_and_status, buildUnknownFields());
        }

        public final Builder fulfillment_type(LocalFulfillmentType fulfillment_type) {
            this.fulfillment_type = fulfillment_type;
            return this;
        }

        public final Builder hours_and_status(LocalOpenStatusAndHours hours_and_status) {
            this.hours_and_status = hours_and_status;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FulfillmentHours.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.FulfillmentHours$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public FulfillmentHours decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new FulfillmentHours((LocalFulfillmentType) obj, (LocalOpenStatusAndHours) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = LocalFulfillmentType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(LocalOpenStatusAndHours.ADAPTER, reader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FulfillmentHours value) {
                writer.getClass();
                value.getClass();
                LocalFulfillmentType.ADAPTER.encodeWithTag(writer, 1, value.fulfillment_type);
                LocalOpenStatusAndHours.ADAPTER.encodeWithTag(writer, 2, value.hours_and_status);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FulfillmentHours value) {
                value.getClass();
                return LocalOpenStatusAndHours.ADAPTER.encodedSizeWithTag(2, value.hours_and_status) + LocalFulfillmentType.ADAPTER.encodedSizeWithTag(1, value.fulfillment_type) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FulfillmentHours redact(FulfillmentHours value) {
                value.getClass();
                LocalOpenStatusAndHours localOpenStatusAndHours = value.hours_and_status;
                LocalOpenStatusAndHours localOpenStatusAndHours2 = localOpenStatusAndHours != null ? (LocalOpenStatusAndHours) LocalOpenStatusAndHours.ADAPTER.redact(localOpenStatusAndHours) : null;
                ByteString byteString = ByteString.EMPTY;
                LocalFulfillmentType localFulfillmentType = value.fulfillment_type;
                byteString.getClass();
                return new FulfillmentHours(localFulfillmentType, localOpenStatusAndHours2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FulfillmentHours value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                LocalOpenStatusAndHours.ADAPTER.encodeWithTag(writer, 2, value.hours_and_status);
                LocalFulfillmentType.ADAPTER.encodeWithTag(writer, 1, value.fulfillment_type);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FulfillmentHours(LocalFulfillmentType localFulfillmentType, LocalOpenStatusAndHours localOpenStatusAndHours, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.fulfillment_type = localFulfillmentType;
        this.hours_and_status = localOpenStatusAndHours;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FulfillmentHours)) {
            return false;
        }
        FulfillmentHours fulfillmentHours = (FulfillmentHours) obj;
        return Intrinsics.areEqual(unknownFields(), fulfillmentHours.unknownFields()) && this.fulfillment_type == fulfillmentHours.fulfillment_type && Intrinsics.areEqual(this.hours_and_status, fulfillmentHours.hours_and_status);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalFulfillmentType localFulfillmentType = this.fulfillment_type;
        int hashCode2 = (hashCode + (localFulfillmentType != null ? localFulfillmentType.hashCode() : 0)) * 37;
        LocalOpenStatusAndHours localOpenStatusAndHours = this.hours_and_status;
        int hashCode3 = hashCode2 + (localOpenStatusAndHours != null ? localOpenStatusAndHours.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.fulfillment_type = this.fulfillment_type;
        builder.hours_and_status = this.hours_and_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalFulfillmentType localFulfillmentType = this.fulfillment_type;
        if (localFulfillmentType != null) {
            arrayList.add("fulfillment_type=" + localFulfillmentType);
        }
        LocalOpenStatusAndHours localOpenStatusAndHours = this.hours_and_status;
        if (localOpenStatusAndHours != null) {
            arrayList.add("hours_and_status=" + localOpenStatusAndHours);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FulfillmentHours{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/FulfillmentHours$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/FulfillmentHours$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/FulfillmentHours;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/FulfillmentHours;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ FulfillmentHours build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
