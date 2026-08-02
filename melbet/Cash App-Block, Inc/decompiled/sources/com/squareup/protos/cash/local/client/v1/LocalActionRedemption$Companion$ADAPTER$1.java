package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalActionRedemption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalActionRedemption((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        LocalActionRedemption localActionRedemption = (LocalActionRedemption) obj;
        reverseProtoWriter.getClass();
        localActionRedemption.getClass();
        reverseProtoWriter.writeBytes(localActionRedemption.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, localActionRedemption.closed_loop_enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalActionRedemption localActionRedemption = (LocalActionRedemption) obj;
        localActionRedemption.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, localActionRedemption.closed_loop_enabled) + localActionRedemption.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalActionRedemption localActionRedemption = (LocalActionRedemption) obj;
        localActionRedemption.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = localActionRedemption.closed_loop_enabled;
        byteString.getClass();
        return new LocalActionRedemption(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalActionRedemption localActionRedemption = (LocalActionRedemption) obj;
        localActionRedemption.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, localActionRedemption.closed_loop_enabled);
        protoWriter.writeBytes(localActionRedemption.unknownFields());
    }
}
