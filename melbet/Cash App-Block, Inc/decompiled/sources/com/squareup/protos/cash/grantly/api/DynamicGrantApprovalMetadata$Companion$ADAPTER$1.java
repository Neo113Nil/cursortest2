package com.squareup.protos.cash.grantly.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DynamicGrantApprovalMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DynamicGrantApprovalMetadata((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DynamicGrantApprovalMetadata dynamicGrantApprovalMetadata = (DynamicGrantApprovalMetadata) obj;
        reverseProtoWriter.getClass();
        dynamicGrantApprovalMetadata.getClass();
        reverseProtoWriter.writeBytes(dynamicGrantApprovalMetadata.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, dynamicGrantApprovalMetadata.explicit_approval_shown);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DynamicGrantApprovalMetadata dynamicGrantApprovalMetadata = (DynamicGrantApprovalMetadata) obj;
        dynamicGrantApprovalMetadata.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, dynamicGrantApprovalMetadata.explicit_approval_shown) + dynamicGrantApprovalMetadata.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DynamicGrantApprovalMetadata dynamicGrantApprovalMetadata = (DynamicGrantApprovalMetadata) obj;
        dynamicGrantApprovalMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = dynamicGrantApprovalMetadata.explicit_approval_shown;
        byteString.getClass();
        return new DynamicGrantApprovalMetadata(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DynamicGrantApprovalMetadata dynamicGrantApprovalMetadata = (DynamicGrantApprovalMetadata) obj;
        dynamicGrantApprovalMetadata.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, dynamicGrantApprovalMetadata.explicit_approval_shown);
        protoWriter.writeBytes(dynamicGrantApprovalMetadata.unknownFields());
    }
}
