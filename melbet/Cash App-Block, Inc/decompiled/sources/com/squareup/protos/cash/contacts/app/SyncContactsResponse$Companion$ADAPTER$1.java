package com.squareup.protos.cash.contacts.app;

import com.squareup.protos.cash.contacts.app.SyncContactsResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SyncContactsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SyncContactsResponse((Long) obj, (String) obj2, (SyncContactsResponse.ResponseCode) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = SyncContactsResponse.ResponseCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncContactsResponse syncContactsResponse = (SyncContactsResponse) obj;
        reverseProtoWriter.getClass();
        syncContactsResponse.getClass();
        reverseProtoWriter.writeBytes(syncContactsResponse.unknownFields());
        SyncContactsResponse.ResponseCode.ADAPTER.encodeWithTag(reverseProtoWriter, 4, syncContactsResponse.response_code);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, syncContactsResponse.patch_id);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, syncContactsResponse.modified_count);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncContactsResponse syncContactsResponse = (SyncContactsResponse) obj;
        syncContactsResponse.getClass();
        return SyncContactsResponse.ResponseCode.ADAPTER.encodedSizeWithTag(4, syncContactsResponse.response_code) + ProtoAdapter.STRING.encodedSizeWithTag(3, syncContactsResponse.patch_id) + ProtoAdapter.INT64.encodedSizeWithTag(1, syncContactsResponse.modified_count) + syncContactsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncContactsResponse syncContactsResponse = (SyncContactsResponse) obj;
        syncContactsResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = syncContactsResponse.modified_count;
        String str = syncContactsResponse.patch_id;
        SyncContactsResponse.ResponseCode responseCode = syncContactsResponse.response_code;
        byteString.getClass();
        return new SyncContactsResponse(l, str, responseCode, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncContactsResponse syncContactsResponse = (SyncContactsResponse) obj;
        syncContactsResponse.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, syncContactsResponse.modified_count);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, syncContactsResponse.patch_id);
        SyncContactsResponse.ResponseCode.ADAPTER.encodeWithTag(protoWriter, 4, syncContactsResponse.response_code);
        protoWriter.writeBytes(syncContactsResponse.unknownFields());
    }
}
