package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreateChangeProposalResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateChangeProposalResponse((ChangeProposal) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ChangeProposal.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateChangeProposalResponse createChangeProposalResponse = (CreateChangeProposalResponse) obj;
        reverseProtoWriter.getClass();
        createChangeProposalResponse.getClass();
        reverseProtoWriter.writeBytes(createChangeProposalResponse.unknownFields());
        ChangeProposal.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createChangeProposalResponse.change_proposal);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateChangeProposalResponse createChangeProposalResponse = (CreateChangeProposalResponse) obj;
        createChangeProposalResponse.getClass();
        return ChangeProposal.ADAPTER.encodedSizeWithTag(1, createChangeProposalResponse.change_proposal) + createChangeProposalResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateChangeProposalResponse createChangeProposalResponse = (CreateChangeProposalResponse) obj;
        createChangeProposalResponse.getClass();
        ChangeProposal changeProposal = createChangeProposalResponse.change_proposal;
        ChangeProposal changeProposal2 = changeProposal != null ? (ChangeProposal) ChangeProposal.ADAPTER.redact(changeProposal) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreateChangeProposalResponse(changeProposal2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateChangeProposalResponse createChangeProposalResponse = (CreateChangeProposalResponse) obj;
        createChangeProposalResponse.getClass();
        ChangeProposal.ADAPTER.encodeWithTag(protoWriter, 1, createChangeProposalResponse.change_proposal);
        protoWriter.writeBytes(createChangeProposalResponse.unknownFields());
    }
}
