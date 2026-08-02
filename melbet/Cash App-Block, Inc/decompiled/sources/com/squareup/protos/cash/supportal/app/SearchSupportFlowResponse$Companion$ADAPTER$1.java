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
public final class SearchSupportFlowResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchSupportFlowResponse((Boolean) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(MatchedNode.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchSupportFlowResponse searchSupportFlowResponse = (SearchSupportFlowResponse) obj;
        reverseProtoWriter.getClass();
        searchSupportFlowResponse.getClass();
        reverseProtoWriter.writeBytes(searchSupportFlowResponse.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, searchSupportFlowResponse.treat_unknown_nodes_as_stubs);
        MatchedNode.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, searchSupportFlowResponse.matched_nodes);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchSupportFlowResponse searchSupportFlowResponse = (SearchSupportFlowResponse) obj;
        searchSupportFlowResponse.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, searchSupportFlowResponse.treat_unknown_nodes_as_stubs) + MatchedNode.ADAPTER.asRepeated().encodedSizeWithTag(1, searchSupportFlowResponse.matched_nodes) + searchSupportFlowResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchSupportFlowResponse searchSupportFlowResponse = (SearchSupportFlowResponse) obj;
        searchSupportFlowResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(searchSupportFlowResponse.matched_nodes, MatchedNode.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = searchSupportFlowResponse.treat_unknown_nodes_as_stubs;
        byteString.getClass();
        return new SearchSupportFlowResponse(bool, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchSupportFlowResponse searchSupportFlowResponse = (SearchSupportFlowResponse) obj;
        searchSupportFlowResponse.getClass();
        MatchedNode.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchSupportFlowResponse.matched_nodes);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, searchSupportFlowResponse.treat_unknown_nodes_as_stubs);
        protoWriter.writeBytes(searchSupportFlowResponse.unknownFields());
    }
}
