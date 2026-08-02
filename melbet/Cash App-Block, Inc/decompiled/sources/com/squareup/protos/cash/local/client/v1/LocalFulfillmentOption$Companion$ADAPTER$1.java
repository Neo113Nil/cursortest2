package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentOption;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalFulfillmentOption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalFulfillmentOption((LocalFulfillmentOption.Type) obj, (LocalEstimatedCompletionDuration) obj2, (LocalFulfillmentType) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = LocalFulfillmentOption.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalEstimatedCompletionDuration.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = LocalFulfillmentType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalFulfillmentOption localFulfillmentOption = (LocalFulfillmentOption) obj;
        reverseProtoWriter.getClass();
        localFulfillmentOption.getClass();
        reverseProtoWriter.writeBytes(localFulfillmentOption.unknownFields());
        LocalFulfillmentType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localFulfillmentOption.fulfillment_type);
        LocalEstimatedCompletionDuration.ADAPTER.encodeWithTag(reverseProtoWriter, 2, localFulfillmentOption.estimated_completion_duration);
        LocalFulfillmentOption.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localFulfillmentOption.f1311type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalFulfillmentOption localFulfillmentOption = (LocalFulfillmentOption) obj;
        localFulfillmentOption.getClass();
        return LocalFulfillmentType.ADAPTER.encodedSizeWithTag(3, localFulfillmentOption.fulfillment_type) + LocalEstimatedCompletionDuration.ADAPTER.encodedSizeWithTag(2, localFulfillmentOption.estimated_completion_duration) + LocalFulfillmentOption.Type.ADAPTER.encodedSizeWithTag(1, localFulfillmentOption.f1311type) + localFulfillmentOption.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalFulfillmentOption localFulfillmentOption = (LocalFulfillmentOption) obj;
        localFulfillmentOption.getClass();
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration = localFulfillmentOption.estimated_completion_duration;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration2 = localEstimatedCompletionDuration != null ? (LocalEstimatedCompletionDuration) LocalEstimatedCompletionDuration.ADAPTER.redact(localEstimatedCompletionDuration) : null;
        ByteString byteString = ByteString.EMPTY;
        LocalFulfillmentOption.Type type2 = localFulfillmentOption.f1311type;
        LocalFulfillmentType localFulfillmentType = localFulfillmentOption.fulfillment_type;
        byteString.getClass();
        return new LocalFulfillmentOption(type2, localEstimatedCompletionDuration2, localFulfillmentType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalFulfillmentOption localFulfillmentOption = (LocalFulfillmentOption) obj;
        localFulfillmentOption.getClass();
        LocalFulfillmentOption.Type.ADAPTER.encodeWithTag(protoWriter, 1, localFulfillmentOption.f1311type);
        LocalEstimatedCompletionDuration.ADAPTER.encodeWithTag(protoWriter, 2, localFulfillmentOption.estimated_completion_duration);
        LocalFulfillmentType.ADAPTER.encodeWithTag(protoWriter, 3, localFulfillmentOption.fulfillment_type);
        protoWriter.writeBytes(localFulfillmentOption.unknownFields());
    }
}
