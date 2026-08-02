package com.squareup.protos.timecards;

import com.squareup.protos.timecards.ChangeProposal;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ChangeProposalAdvancement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ChangeProposalAdvancement((String) obj, (ChangeProposal.State) obj2, (ChangeProposal.State) obj3, (String) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    try {
                        obj2 = ChangeProposal.State.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    try {
                        obj3 = ChangeProposal.State.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ChangeProposalAdvancement changeProposalAdvancement = (ChangeProposalAdvancement) obj;
        reverseProtoWriter.getClass();
        changeProposalAdvancement.getClass();
        reverseProtoWriter.writeBytes(changeProposalAdvancement.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, changeProposalAdvancement.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, changeProposalAdvancement.created_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, changeProposalAdvancement.note);
        ChangeProposal$State$Companion$ADAPTER$1 changeProposal$State$Companion$ADAPTER$1 = ChangeProposal.State.ADAPTER;
        changeProposal$State$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 6, changeProposalAdvancement.previous_state);
        changeProposal$State$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 2, changeProposalAdvancement.state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, changeProposalAdvancement.team_member_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ChangeProposalAdvancement changeProposalAdvancement = (ChangeProposalAdvancement) obj;
        changeProposalAdvancement.getClass();
        int size$okio = changeProposalAdvancement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, changeProposalAdvancement.team_member_id) + size$okio;
        ChangeProposal$State$Companion$ADAPTER$1 changeProposal$State$Companion$ADAPTER$1 = ChangeProposal.State.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, changeProposalAdvancement.updated_at) + protoAdapter.encodedSizeWithTag(4, changeProposalAdvancement.created_at) + protoAdapter.encodedSizeWithTag(3, changeProposalAdvancement.note) + changeProposal$State$Companion$ADAPTER$1.encodedSizeWithTag(6, changeProposalAdvancement.previous_state) + changeProposal$State$Companion$ADAPTER$1.encodedSizeWithTag(2, changeProposalAdvancement.state) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ChangeProposalAdvancement changeProposalAdvancement = (ChangeProposalAdvancement) obj;
        changeProposalAdvancement.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = changeProposalAdvancement.team_member_id;
        ChangeProposal.State state = changeProposalAdvancement.state;
        ChangeProposal.State state2 = changeProposalAdvancement.previous_state;
        String str2 = changeProposalAdvancement.note;
        String str3 = changeProposalAdvancement.created_at;
        String str4 = changeProposalAdvancement.updated_at;
        byteString.getClass();
        return new ChangeProposalAdvancement(str, state, state2, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChangeProposalAdvancement changeProposalAdvancement = (ChangeProposalAdvancement) obj;
        changeProposalAdvancement.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, changeProposalAdvancement.team_member_id);
        ChangeProposal$State$Companion$ADAPTER$1 changeProposal$State$Companion$ADAPTER$1 = ChangeProposal.State.ADAPTER;
        changeProposal$State$Companion$ADAPTER$1.encodeWithTag(protoWriter, 2, changeProposalAdvancement.state);
        changeProposal$State$Companion$ADAPTER$1.encodeWithTag(protoWriter, 6, changeProposalAdvancement.previous_state);
        protoAdapter.encodeWithTag(protoWriter, 3, changeProposalAdvancement.note);
        protoAdapter.encodeWithTag(protoWriter, 4, changeProposalAdvancement.created_at);
        protoAdapter.encodeWithTag(protoWriter, 5, changeProposalAdvancement.updated_at);
        protoWriter.writeBytes(changeProposalAdvancement.unknownFields());
    }
}
