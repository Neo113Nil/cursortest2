package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetNextBestActionRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetNextBestActionRequest$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "", "", "viewed_ids", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetNextBestActionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetNextBestActionRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.OnBehalfOf#ADAPTER", schemaIndex = 0, tag = 1)
    public final OnBehalfOf on_behalf_of;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<String> viewed_ids;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetNextBestActionRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetNextBestActionRequest;", "<init>", "()V", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "viewed_ids", "", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public OnBehalfOf on_behalf_of;
        public List<String> viewed_ids = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public GetNextBestActionRequest build() {
            return new GetNextBestActionRequest(this.on_behalf_of, this.viewed_ids, buildUnknownFields());
        }

        public final Builder on_behalf_of(OnBehalfOf on_behalf_of) {
            this.on_behalf_of = on_behalf_of;
            return this;
        }

        public final Builder viewed_ids(List<String> viewed_ids) {
            viewed_ids.getClass();
            TransactorKt.checkElementsNotNull(viewed_ids);
            this.viewed_ids = viewed_ids;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetNextBestActionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.api.v3.GetNextBestActionRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetNextBestActionRequest((OnBehalfOf) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(OnBehalfOf.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetNextBestActionRequest getNextBestActionRequest = (GetNextBestActionRequest) obj;
                reverseProtoWriter.getClass();
                getNextBestActionRequest.getClass();
                reverseProtoWriter.writeBytes(getNextBestActionRequest.unknownFields());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 2, getNextBestActionRequest.viewed_ids);
                OnBehalfOf.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getNextBestActionRequest.on_behalf_of);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetNextBestActionRequest getNextBestActionRequest = (GetNextBestActionRequest) obj;
                getNextBestActionRequest.getClass();
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getNextBestActionRequest.viewed_ids) + OnBehalfOf.ADAPTER.encodedSizeWithTag(1, getNextBestActionRequest.on_behalf_of) + getNextBestActionRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetNextBestActionRequest getNextBestActionRequest = (GetNextBestActionRequest) obj;
                getNextBestActionRequest.getClass();
                OnBehalfOf onBehalfOf = getNextBestActionRequest.on_behalf_of;
                OnBehalfOf onBehalfOf2 = onBehalfOf != null ? (OnBehalfOf) OnBehalfOf.ADAPTER.redact(onBehalfOf) : null;
                ByteString byteString = ByteString.EMPTY;
                List<String> list = getNextBestActionRequest.viewed_ids;
                list.getClass();
                byteString.getClass();
                return new GetNextBestActionRequest(onBehalfOf2, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetNextBestActionRequest getNextBestActionRequest = (GetNextBestActionRequest) obj;
                getNextBestActionRequest.getClass();
                OnBehalfOf.ADAPTER.encodeWithTag(protoWriter, 1, getNextBestActionRequest.on_behalf_of);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getNextBestActionRequest.viewed_ids);
                protoWriter.writeBytes(getNextBestActionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNextBestActionRequest(OnBehalfOf onBehalfOf, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.on_behalf_of = onBehalfOf;
        this.viewed_ids = TransactorKt.immutableCopyOf("viewed_ids", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetNextBestActionRequest)) {
            return false;
        }
        GetNextBestActionRequest getNextBestActionRequest = (GetNextBestActionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getNextBestActionRequest.unknownFields()) && Intrinsics.areEqual(this.on_behalf_of, getNextBestActionRequest.on_behalf_of) && Intrinsics.areEqual(this.viewed_ids, getNextBestActionRequest.viewed_ids);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        int hashCode2 = this.viewed_ids.hashCode() + ((hashCode + (onBehalfOf != null ? onBehalfOf.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.on_behalf_of = this.on_behalf_of;
        builder.viewed_ids = this.viewed_ids;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        if (onBehalfOf != null) {
            arrayList.add("on_behalf_of=" + onBehalfOf);
        }
        if (!this.viewed_ids.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("viewed_ids=", arrayList, this.viewed_ids);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetNextBestActionRequest{", "}", 0, null, null, 56);
    }
}
