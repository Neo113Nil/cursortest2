package com.squareup.protos.cash.cashliteflow.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PreparedRecoveryActivity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PreparedRecoveryActivity((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PreparedRecoveryActivity preparedRecoveryActivity = (PreparedRecoveryActivity) obj;
        reverseProtoWriter.getClass();
        preparedRecoveryActivity.getClass();
        reverseProtoWriter.writeBytes(preparedRecoveryActivity.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, preparedRecoveryActivity.unsigned_body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, preparedRecoveryActivity.activity_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PreparedRecoveryActivity preparedRecoveryActivity = (PreparedRecoveryActivity) obj;
        preparedRecoveryActivity.getClass();
        int size$okio = preparedRecoveryActivity.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, preparedRecoveryActivity.unsigned_body) + protoAdapter.encodedSizeWithTag(1, preparedRecoveryActivity.activity_type) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PreparedRecoveryActivity preparedRecoveryActivity = (PreparedRecoveryActivity) obj;
        preparedRecoveryActivity.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = preparedRecoveryActivity.activity_type;
        byteString.getClass();
        return new PreparedRecoveryActivity(str, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PreparedRecoveryActivity preparedRecoveryActivity = (PreparedRecoveryActivity) obj;
        preparedRecoveryActivity.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, preparedRecoveryActivity.activity_type);
        protoAdapter.encodeWithTag(protoWriter, 2, preparedRecoveryActivity.unsigned_body);
        protoWriter.writeBytes(preparedRecoveryActivity.unknownFields());
    }
}
