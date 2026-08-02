package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.P2pPoolMemberRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class P2pPoolMemberRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new P2pPoolMemberRenderData((P2pPoolMemberRenderData.MembershipStatus) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = P2pPoolMemberRenderData.MembershipStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        P2pPoolMemberRenderData p2pPoolMemberRenderData = (P2pPoolMemberRenderData) obj;
        reverseProtoWriter.getClass();
        p2pPoolMemberRenderData.getClass();
        reverseProtoWriter.writeBytes(p2pPoolMemberRenderData.unknownFields());
        P2pPoolMemberRenderData.MembershipStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, p2pPoolMemberRenderData.membership_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        P2pPoolMemberRenderData p2pPoolMemberRenderData = (P2pPoolMemberRenderData) obj;
        p2pPoolMemberRenderData.getClass();
        return P2pPoolMemberRenderData.MembershipStatus.ADAPTER.encodedSizeWithTag(1, p2pPoolMemberRenderData.membership_status) + p2pPoolMemberRenderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        P2pPoolMemberRenderData p2pPoolMemberRenderData = (P2pPoolMemberRenderData) obj;
        p2pPoolMemberRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        P2pPoolMemberRenderData.MembershipStatus membershipStatus = p2pPoolMemberRenderData.membership_status;
        byteString.getClass();
        return new P2pPoolMemberRenderData(membershipStatus, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        P2pPoolMemberRenderData p2pPoolMemberRenderData = (P2pPoolMemberRenderData) obj;
        p2pPoolMemberRenderData.getClass();
        P2pPoolMemberRenderData.MembershipStatus.ADAPTER.encodeWithTag(protoWriter, 1, p2pPoolMemberRenderData.membership_status);
        protoWriter.writeBytes(p2pPoolMemberRenderData.unknownFields());
    }
}
