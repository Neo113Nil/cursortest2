package com.squareup.protos.cash.semaphore.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetFeatureLensResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(VendedFlags.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        VendedFlags vendedFlags = (VendedFlags) obj;
        if (vendedFlags != null) {
            return new GetFeatureLensResponse(vendedFlags, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "flags");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetFeatureLensResponse getFeatureLensResponse = (GetFeatureLensResponse) obj;
        reverseProtoWriter.getClass();
        getFeatureLensResponse.getClass();
        reverseProtoWriter.writeBytes(getFeatureLensResponse.unknownFields());
        VendedFlags.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getFeatureLensResponse.flags);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetFeatureLensResponse getFeatureLensResponse = (GetFeatureLensResponse) obj;
        getFeatureLensResponse.getClass();
        return VendedFlags.ADAPTER.encodedSizeWithTag(1, getFeatureLensResponse.flags) + getFeatureLensResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetFeatureLensResponse getFeatureLensResponse = (GetFeatureLensResponse) obj;
        getFeatureLensResponse.getClass();
        VendedFlags vendedFlags = (VendedFlags) VendedFlags.ADAPTER.redact(getFeatureLensResponse.flags);
        ByteString byteString = ByteString.EMPTY;
        vendedFlags.getClass();
        byteString.getClass();
        return new GetFeatureLensResponse(vendedFlags, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetFeatureLensResponse getFeatureLensResponse = (GetFeatureLensResponse) obj;
        getFeatureLensResponse.getClass();
        VendedFlags.ADAPTER.encodeWithTag(protoWriter, 1, getFeatureLensResponse.flags);
        protoWriter.writeBytes(getFeatureLensResponse.unknownFields());
    }
}
