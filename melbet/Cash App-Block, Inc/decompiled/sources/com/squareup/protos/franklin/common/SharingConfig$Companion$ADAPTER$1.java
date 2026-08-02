package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.SharingContent;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SharingConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SharingConfig((Boolean) obj, (SharingContent) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(SharingContent.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SharingConfig sharingConfig = (SharingConfig) obj;
        reverseProtoWriter.getClass();
        sharingConfig.getClass();
        reverseProtoWriter.writeBytes(sharingConfig.unknownFields());
        SharingContent.ADAPTER.encodeWithTag(reverseProtoWriter, 2, sharingConfig.sharing_content);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, sharingConfig.enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SharingConfig sharingConfig = (SharingConfig) obj;
        sharingConfig.getClass();
        return SharingContent.ADAPTER.encodedSizeWithTag(2, sharingConfig.sharing_content) + ProtoAdapter.BOOL.encodedSizeWithTag(1, sharingConfig.enabled) + sharingConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SharingConfig sharingConfig = (SharingConfig) obj;
        sharingConfig.getClass();
        SharingContent sharingContent = sharingConfig.sharing_content;
        SharingContent sharingContent2 = sharingContent != null ? (SharingContent) SharingContent.ADAPTER.redact(sharingContent) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = sharingConfig.enabled;
        byteString.getClass();
        return new SharingConfig(bool, sharingContent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SharingConfig sharingConfig = (SharingConfig) obj;
        sharingConfig.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, sharingConfig.enabled);
        SharingContent.ADAPTER.encodeWithTag(protoWriter, 2, sharingConfig.sharing_content);
        protoWriter.writeBytes(sharingConfig.unknownFields());
    }
}
