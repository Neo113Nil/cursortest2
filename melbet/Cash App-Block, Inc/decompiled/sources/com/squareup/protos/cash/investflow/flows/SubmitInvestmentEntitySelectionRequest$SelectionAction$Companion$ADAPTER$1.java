package com.squareup.protos.cash.investflow.flows;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SubmitInvestmentEntitySelectionRequest$SelectionAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitInvestmentEntitySelectionRequest.SelectionAction(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitInvestmentEntitySelectionRequest.SelectionAction selectionAction = (SubmitInvestmentEntitySelectionRequest.SelectionAction) obj;
        reverseProtoWriter.getClass();
        selectionAction.getClass();
        reverseProtoWriter.writeBytes(selectionAction.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, selectionAction.investment_entity_tokens);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitInvestmentEntitySelectionRequest.SelectionAction selectionAction = (SubmitInvestmentEntitySelectionRequest.SelectionAction) obj;
        selectionAction.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, selectionAction.investment_entity_tokens) + selectionAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitInvestmentEntitySelectionRequest.SelectionAction selectionAction = (SubmitInvestmentEntitySelectionRequest.SelectionAction) obj;
        selectionAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = selectionAction.investment_entity_tokens;
        list.getClass();
        byteString.getClass();
        return new SubmitInvestmentEntitySelectionRequest.SelectionAction(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitInvestmentEntitySelectionRequest.SelectionAction selectionAction = (SubmitInvestmentEntitySelectionRequest.SelectionAction) obj;
        selectionAction.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, selectionAction.investment_entity_tokens);
        protoWriter.writeBytes(selectionAction.unknownFields());
    }
}
