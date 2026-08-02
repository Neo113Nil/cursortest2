package com.squareup.protos.cash.badging.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.appthemes.Gradient;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class BatchClearBadgeClientRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BatchClearBadgeClientRequest> CREATOR;
    public final List requests;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BatchClearBadgeClientRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.badging.api.BatchClearBadgeClientRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new BatchClearBadgeClientRequest(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(ClearBadgeClientRequest.ADAPTER.decode(protoReader));
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                BatchClearBadgeClientRequest batchClearBadgeClientRequest = (BatchClearBadgeClientRequest) obj;
                reverseProtoWriter.getClass();
                batchClearBadgeClientRequest.getClass();
                reverseProtoWriter.writeBytes(batchClearBadgeClientRequest.unknownFields());
                ClearBadgeClientRequest.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, batchClearBadgeClientRequest.requests);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                BatchClearBadgeClientRequest batchClearBadgeClientRequest = (BatchClearBadgeClientRequest) obj;
                batchClearBadgeClientRequest.getClass();
                return ClearBadgeClientRequest.ADAPTER.asRepeated().encodedSizeWithTag(1, batchClearBadgeClientRequest.requests) + batchClearBadgeClientRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                BatchClearBadgeClientRequest batchClearBadgeClientRequest = (BatchClearBadgeClientRequest) obj;
                batchClearBadgeClientRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(batchClearBadgeClientRequest.requests, ClearBadgeClientRequest.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new BatchClearBadgeClientRequest(m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                BatchClearBadgeClientRequest batchClearBadgeClientRequest = (BatchClearBadgeClientRequest) obj;
                batchClearBadgeClientRequest.getClass();
                ClearBadgeClientRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchClearBadgeClientRequest.requests);
                protoWriter.writeBytes(batchClearBadgeClientRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchClearBadgeClientRequest(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.requests = TransactorKt.immutableCopyOf("requests", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BatchClearBadgeClientRequest)) {
            return false;
        }
        BatchClearBadgeClientRequest batchClearBadgeClientRequest = (BatchClearBadgeClientRequest) obj;
        return Intrinsics.areEqual(unknownFields(), batchClearBadgeClientRequest.unknownFields()) && Intrinsics.areEqual(this.requests, batchClearBadgeClientRequest.requests);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.requests.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Gradient.Builder builder = new Gradient.Builder(21);
        builder.colors = this.requests;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.requests;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("requests=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BatchClearBadgeClientRequest{", "}", 0, null, null, 56);
    }
}
