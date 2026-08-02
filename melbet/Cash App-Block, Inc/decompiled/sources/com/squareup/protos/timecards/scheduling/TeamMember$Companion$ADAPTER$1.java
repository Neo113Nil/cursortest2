package com.squareup.protos.timecards.scheduling;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TeamMember$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TeamMember((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TeamMember teamMember = (TeamMember) obj;
        reverseProtoWriter.getClass();
        teamMember.getClass();
        reverseProtoWriter.writeBytes(teamMember.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, teamMember.person_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, teamMember.initials);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, teamMember.family_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, teamMember.given_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, teamMember.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TeamMember teamMember = (TeamMember) obj;
        teamMember.getClass();
        int size$okio = teamMember.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, teamMember.person_id) + protoAdapter.encodedSizeWithTag(4, teamMember.initials) + protoAdapter.encodedSizeWithTag(3, teamMember.family_name) + protoAdapter.encodedSizeWithTag(2, teamMember.given_name) + protoAdapter.encodedSizeWithTag(1, teamMember.id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TeamMember teamMember = (TeamMember) obj;
        teamMember.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = teamMember.id;
        String str2 = teamMember.person_id;
        byteString.getClass();
        return new TeamMember(str, null, null, null, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TeamMember teamMember = (TeamMember) obj;
        teamMember.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, teamMember.id);
        protoAdapter.encodeWithTag(protoWriter, 2, teamMember.given_name);
        protoAdapter.encodeWithTag(protoWriter, 3, teamMember.family_name);
        protoAdapter.encodeWithTag(protoWriter, 4, teamMember.initials);
        protoAdapter.encodeWithTag(protoWriter, 5, teamMember.person_id);
        protoWriter.writeBytes(teamMember.unknownFields());
    }
}
