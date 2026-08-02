package com.squareup.protos.lending;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Toggle$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Toggle((ByteString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Toggle toggle = (Toggle) obj;
        reverseProtoWriter.getClass();
        toggle.getClass();
        reverseProtoWriter.writeBytes(toggle.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, toggle.opaque_request_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Toggle toggle = (Toggle) obj;
        toggle.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(1, toggle.opaque_request_data) + toggle.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Toggle toggle = (Toggle) obj;
        toggle.getClass();
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = toggle.opaque_request_data;
        byteString.getClass();
        return new Toggle(byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Toggle toggle = (Toggle) obj;
        toggle.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, toggle.opaque_request_data);
        protoWriter.writeBytes(toggle.unknownFields());
    }
}
