package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class P2pPoolContributionRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new P2pPoolContributionRenderData((P2pPoolComment) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(P2pPoolComment.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        P2pPoolContributionRenderData p2pPoolContributionRenderData = (P2pPoolContributionRenderData) obj;
        reverseProtoWriter.getClass();
        p2pPoolContributionRenderData.getClass();
        reverseProtoWriter.writeBytes(p2pPoolContributionRenderData.unknownFields());
        P2pPoolComment.ADAPTER.encodeWithTag(reverseProtoWriter, 1, p2pPoolContributionRenderData.contributor_root_comment);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        P2pPoolContributionRenderData p2pPoolContributionRenderData = (P2pPoolContributionRenderData) obj;
        p2pPoolContributionRenderData.getClass();
        return P2pPoolComment.ADAPTER.encodedSizeWithTag(1, p2pPoolContributionRenderData.contributor_root_comment) + p2pPoolContributionRenderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        P2pPoolContributionRenderData p2pPoolContributionRenderData = (P2pPoolContributionRenderData) obj;
        p2pPoolContributionRenderData.getClass();
        P2pPoolComment p2pPoolComment = p2pPoolContributionRenderData.contributor_root_comment;
        P2pPoolComment p2pPoolComment2 = p2pPoolComment != null ? (P2pPoolComment) P2pPoolComment.ADAPTER.redact(p2pPoolComment) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new P2pPoolContributionRenderData(p2pPoolComment2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        P2pPoolContributionRenderData p2pPoolContributionRenderData = (P2pPoolContributionRenderData) obj;
        p2pPoolContributionRenderData.getClass();
        P2pPoolComment.ADAPTER.encodeWithTag(protoWriter, 1, p2pPoolContributionRenderData.contributor_root_comment);
        protoWriter.writeBytes(p2pPoolContributionRenderData.unknownFields());
    }
}
