package com.squareup.protos.cash.supportal.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SuggestedArticlesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SuggestedArticlesResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(MatchedNode.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SuggestedArticlesResponse suggestedArticlesResponse = (SuggestedArticlesResponse) obj;
        reverseProtoWriter.getClass();
        suggestedArticlesResponse.getClass();
        reverseProtoWriter.writeBytes(suggestedArticlesResponse.unknownFields());
        MatchedNode.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, suggestedArticlesResponse.matched_nodes);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SuggestedArticlesResponse suggestedArticlesResponse = (SuggestedArticlesResponse) obj;
        suggestedArticlesResponse.getClass();
        return MatchedNode.ADAPTER.asRepeated().encodedSizeWithTag(1, suggestedArticlesResponse.matched_nodes) + suggestedArticlesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SuggestedArticlesResponse suggestedArticlesResponse = (SuggestedArticlesResponse) obj;
        suggestedArticlesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(suggestedArticlesResponse.matched_nodes, MatchedNode.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SuggestedArticlesResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SuggestedArticlesResponse suggestedArticlesResponse = (SuggestedArticlesResponse) obj;
        suggestedArticlesResponse.getClass();
        MatchedNode.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, suggestedArticlesResponse.matched_nodes);
        protoWriter.writeBytes(suggestedArticlesResponse.unknownFields());
    }
}
