package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.GroupActivityRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GroupActivityRenderData$MemberAdded$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GroupActivityRenderData.MemberAdded((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GroupActivityRenderData.MemberAdded memberAdded = (GroupActivityRenderData.MemberAdded) obj;
        reverseProtoWriter.getClass();
        memberAdded.getClass();
        reverseProtoWriter.writeBytes(memberAdded.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, memberAdded.added_by_customer_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GroupActivityRenderData.MemberAdded memberAdded = (GroupActivityRenderData.MemberAdded) obj;
        memberAdded.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, memberAdded.added_by_customer_name) + memberAdded.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GroupActivityRenderData.MemberAdded memberAdded = (GroupActivityRenderData.MemberAdded) obj;
        memberAdded.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = memberAdded.added_by_customer_name;
        byteString.getClass();
        return new GroupActivityRenderData.MemberAdded(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GroupActivityRenderData.MemberAdded memberAdded = (GroupActivityRenderData.MemberAdded) obj;
        memberAdded.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, memberAdded.added_by_customer_name);
        protoWriter.writeBytes(memberAdded.unknownFields());
    }
}
