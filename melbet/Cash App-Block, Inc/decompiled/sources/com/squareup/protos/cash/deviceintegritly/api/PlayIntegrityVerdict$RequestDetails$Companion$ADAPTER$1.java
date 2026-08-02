package com.squareup.protos.cash.deviceintegritly.api;

import com.squareup.protos.cash.deviceintegritly.api.PlayIntegrityVerdict;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PlayIntegrityVerdict$RequestDetails$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PlayIntegrityVerdict.RequestDetails((Long) obj3, (String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.UINT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PlayIntegrityVerdict.RequestDetails requestDetails = (PlayIntegrityVerdict.RequestDetails) obj;
        reverseProtoWriter.getClass();
        requestDetails.getClass();
        reverseProtoWriter.writeBytes(requestDetails.unknownFields());
        ProtoAdapter.UINT64.encodeWithTag(reverseProtoWriter, 3, requestDetails.timestamp_millis);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, requestDetails.nonce);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, requestDetails.request_package_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PlayIntegrityVerdict.RequestDetails requestDetails = (PlayIntegrityVerdict.RequestDetails) obj;
        requestDetails.getClass();
        int size$okio = requestDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.UINT64.encodedSizeWithTag(3, requestDetails.timestamp_millis) + protoAdapter.encodedSizeWithTag(2, requestDetails.nonce) + protoAdapter.encodedSizeWithTag(1, requestDetails.request_package_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PlayIntegrityVerdict.RequestDetails requestDetails = (PlayIntegrityVerdict.RequestDetails) obj;
        requestDetails.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = requestDetails.request_package_name;
        Long l = requestDetails.timestamp_millis;
        byteString.getClass();
        return new PlayIntegrityVerdict.RequestDetails(l, str, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PlayIntegrityVerdict.RequestDetails requestDetails = (PlayIntegrityVerdict.RequestDetails) obj;
        requestDetails.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, requestDetails.request_package_name);
        protoAdapter.encodeWithTag(protoWriter, 2, requestDetails.nonce);
        ProtoAdapter.UINT64.encodeWithTag(protoWriter, 3, requestDetails.timestamp_millis);
        protoWriter.writeBytes(requestDetails.unknownFields());
    }
}
