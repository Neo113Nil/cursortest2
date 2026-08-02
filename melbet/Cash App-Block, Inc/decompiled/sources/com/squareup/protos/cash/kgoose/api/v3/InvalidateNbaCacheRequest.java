package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InvalidateNbaCacheRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/InvalidateNbaCacheRequest$Builder;", "", "creator", "Ljava/lang/String;", "", "rewarm_after_invalidate", "Ljava/lang/Boolean;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/TransactionType;", "transaction_types", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InvalidateNbaCacheRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvalidateNbaCacheRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String creator;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean rewarm_after_invalidate;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TransactionType#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<TransactionType> transaction_types;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InvalidateNbaCacheRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/InvalidateNbaCacheRequest;", "<init>", "()V", "creator", "", "transaction_types", "", "Lcom/squareup/protos/cash/kgoose/api/v3/TransactionType;", "rewarm_after_invalidate", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/InvalidateNbaCacheRequest$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public String creator;
        public Boolean rewarm_after_invalidate;
        public List<? extends TransactionType> transaction_types = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public InvalidateNbaCacheRequest build() {
            return new InvalidateNbaCacheRequest(this.rewarm_after_invalidate, this.creator, this.transaction_types, buildUnknownFields());
        }

        public final Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        public final Builder rewarm_after_invalidate(Boolean rewarm_after_invalidate) {
            this.rewarm_after_invalidate = rewarm_after_invalidate;
            return this;
        }

        public final Builder transaction_types(List<? extends TransactionType> transaction_types) {
            transaction_types.getClass();
            TransactorKt.checkElementsNotNull(transaction_types);
            this.transaction_types = transaction_types;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InvalidateNbaCacheRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.api.v3.InvalidateNbaCacheRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new InvalidateNbaCacheRequest((Boolean) obj2, (String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            TransactionType.ADAPTER.tryDecode(protoReader, m);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                InvalidateNbaCacheRequest invalidateNbaCacheRequest = (InvalidateNbaCacheRequest) obj;
                reverseProtoWriter.getClass();
                invalidateNbaCacheRequest.getClass();
                reverseProtoWriter.writeBytes(invalidateNbaCacheRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, invalidateNbaCacheRequest.rewarm_after_invalidate);
                TransactionType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, invalidateNbaCacheRequest.transaction_types);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, invalidateNbaCacheRequest.creator);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                InvalidateNbaCacheRequest invalidateNbaCacheRequest = (InvalidateNbaCacheRequest) obj;
                invalidateNbaCacheRequest.getClass();
                return ProtoAdapter.BOOL.encodedSizeWithTag(3, invalidateNbaCacheRequest.rewarm_after_invalidate) + TransactionType.ADAPTER.asRepeated().encodedSizeWithTag(2, invalidateNbaCacheRequest.transaction_types) + ProtoAdapter.STRING.encodedSizeWithTag(1, invalidateNbaCacheRequest.creator) + invalidateNbaCacheRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                InvalidateNbaCacheRequest invalidateNbaCacheRequest = (InvalidateNbaCacheRequest) obj;
                invalidateNbaCacheRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = invalidateNbaCacheRequest.creator;
                List<TransactionType> list = invalidateNbaCacheRequest.transaction_types;
                Boolean bool = invalidateNbaCacheRequest.rewarm_after_invalidate;
                list.getClass();
                byteString.getClass();
                return new InvalidateNbaCacheRequest(bool, str, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                InvalidateNbaCacheRequest invalidateNbaCacheRequest = (InvalidateNbaCacheRequest) obj;
                invalidateNbaCacheRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, invalidateNbaCacheRequest.creator);
                TransactionType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, invalidateNbaCacheRequest.transaction_types);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, invalidateNbaCacheRequest.rewarm_after_invalidate);
                protoWriter.writeBytes(invalidateNbaCacheRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidateNbaCacheRequest(Boolean bool, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.creator = str;
        this.rewarm_after_invalidate = bool;
        this.transaction_types = TransactorKt.immutableCopyOf("transaction_types", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvalidateNbaCacheRequest)) {
            return false;
        }
        InvalidateNbaCacheRequest invalidateNbaCacheRequest = (InvalidateNbaCacheRequest) obj;
        return Intrinsics.areEqual(unknownFields(), invalidateNbaCacheRequest.unknownFields()) && Intrinsics.areEqual(this.creator, invalidateNbaCacheRequest.creator) && Intrinsics.areEqual(this.transaction_types, invalidateNbaCacheRequest.transaction_types) && Intrinsics.areEqual(this.rewarm_after_invalidate, invalidateNbaCacheRequest.rewarm_after_invalidate);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.creator;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.transaction_types);
        Boolean bool = this.rewarm_after_invalidate;
        int hashCode2 = m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.creator = this.creator;
        builder.transaction_types = this.transaction_types;
        builder.rewarm_after_invalidate = this.rewarm_after_invalidate;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.creator;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "creator=", arrayList);
        }
        if (!this.transaction_types.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("transaction_types=", arrayList, this.transaction_types);
        }
        Boolean bool = this.rewarm_after_invalidate;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("rewarm_after_invalidate=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvalidateNbaCacheRequest{", "}", 0, null, null, 56);
    }
}
