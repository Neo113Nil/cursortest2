package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.GroupActivityRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GroupActivityRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        GroupActivityRenderData$Params$MemberAdded groupActivityRenderData$Params$MemberAdded = null;
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GroupActivityRenderData(groupActivityRenderData$Params$MemberAdded, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                groupActivityRenderData$Params$MemberAdded = new GroupActivityRenderData$Params$MemberAdded((GroupActivityRenderData.MemberAdded) GroupActivityRenderData.MemberAdded.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GroupActivityRenderData groupActivityRenderData = (GroupActivityRenderData) obj;
        reverseProtoWriter.getClass();
        groupActivityRenderData.getClass();
        reverseProtoWriter.writeBytes(groupActivityRenderData.unknownFields());
        GroupActivityRenderData$Params$MemberAdded groupActivityRenderData$Params$MemberAdded = groupActivityRenderData.params;
        if (groupActivityRenderData$Params$MemberAdded != null) {
            GroupActivityRenderData.MemberAdded.ADAPTER.encodeWithTag(reverseProtoWriter, 1, groupActivityRenderData$Params$MemberAdded.value);
        } else if (groupActivityRenderData$Params$MemberAdded != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, groupActivityRenderData.action_link);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GroupActivityRenderData groupActivityRenderData = (GroupActivityRenderData) obj;
        groupActivityRenderData.getClass();
        int size$okio = groupActivityRenderData.unknownFields().getSize$okio();
        GroupActivityRenderData$Params$MemberAdded groupActivityRenderData$Params$MemberAdded = groupActivityRenderData.params;
        if (groupActivityRenderData$Params$MemberAdded != null) {
            size$okio += GroupActivityRenderData.MemberAdded.ADAPTER.encodedSizeWithTag(1, groupActivityRenderData$Params$MemberAdded.value);
        } else if (groupActivityRenderData$Params$MemberAdded != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        return ProtoAdapter.STRING.encodedSizeWithTag(2, groupActivityRenderData.action_link) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GroupActivityRenderData groupActivityRenderData = (GroupActivityRenderData) obj;
        groupActivityRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        GroupActivityRenderData$Params$MemberAdded groupActivityRenderData$Params$MemberAdded = groupActivityRenderData.params;
        String str = groupActivityRenderData.action_link;
        byteString.getClass();
        return new GroupActivityRenderData(groupActivityRenderData$Params$MemberAdded, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GroupActivityRenderData groupActivityRenderData = (GroupActivityRenderData) obj;
        groupActivityRenderData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, groupActivityRenderData.action_link);
        GroupActivityRenderData$Params$MemberAdded groupActivityRenderData$Params$MemberAdded = groupActivityRenderData.params;
        if (groupActivityRenderData$Params$MemberAdded != null) {
            GroupActivityRenderData.MemberAdded.ADAPTER.encodeWithTag(protoWriter, 1, groupActivityRenderData$Params$MemberAdded.value);
        } else if (groupActivityRenderData$Params$MemberAdded != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(groupActivityRenderData.unknownFields());
    }
}
