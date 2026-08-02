package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.TagDefinition;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TagDefinition$Membership$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TagDefinition.Membership((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TagDefinition.Membership membership = (TagDefinition.Membership) obj;
        reverseProtoWriter.getClass();
        membership.getClass();
        reverseProtoWriter.writeBytes(membership.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, membership.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TagDefinition.Membership membership = (TagDefinition.Membership) obj;
        membership.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, membership.id) + membership.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TagDefinition.Membership membership = (TagDefinition.Membership) obj;
        membership.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = membership.id;
        byteString.getClass();
        return new TagDefinition.Membership(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TagDefinition.Membership membership = (TagDefinition.Membership) obj;
        membership.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, membership.id);
        protoWriter.writeBytes(membership.unknownFields());
    }
}
