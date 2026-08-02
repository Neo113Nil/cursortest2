package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetEditorialResponse$EditorialContent$Spacer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetEditorialResponse.EditorialContent.Spacer((Boolean) obj2, (Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEditorialResponse.EditorialContent.Spacer spacer = (GetEditorialResponse.EditorialContent.Spacer) obj;
        reverseProtoWriter.getClass();
        spacer.getClass();
        reverseProtoWriter.writeBytes(spacer.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, spacer.divider);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, spacer.height);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEditorialResponse.EditorialContent.Spacer spacer = (GetEditorialResponse.EditorialContent.Spacer) obj;
        spacer.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, spacer.divider) + ProtoAdapter.INT64.encodedSizeWithTag(1, spacer.height) + spacer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEditorialResponse.EditorialContent.Spacer spacer = (GetEditorialResponse.EditorialContent.Spacer) obj;
        spacer.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = spacer.height;
        Boolean bool = spacer.divider;
        byteString.getClass();
        return new GetEditorialResponse.EditorialContent.Spacer(bool, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEditorialResponse.EditorialContent.Spacer spacer = (GetEditorialResponse.EditorialContent.Spacer) obj;
        spacer.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, spacer.height);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, spacer.divider);
        protoWriter.writeBytes(spacer.unknownFields());
    }
}
