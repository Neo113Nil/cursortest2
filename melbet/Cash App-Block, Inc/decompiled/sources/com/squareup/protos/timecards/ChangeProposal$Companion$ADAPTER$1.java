package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientrouting.UtilsKt;
import com.squareup.protos.timecards.ChangeProposal;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ChangeProposal$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        UtilsKt changeProposal$Entity$OpenShiftToClaim;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        UtilsKt utilsKt = null;
        Object obj8 = null;
        Object obj9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ChangeProposal((String) obj3, (String) obj4, (String) obj5, (ChangeProposal.State) obj6, (String) obj7, m, utilsKt, (String) obj8, (String) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    try {
                        obj6 = ChangeProposal.State.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj3;
                        obj2 = obj4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    m.add(ChangeProposalAdvancement.ADAPTER.decode(protoReader));
                    obj = obj3;
                    obj2 = obj4;
                    obj3 = obj;
                    obj4 = obj2;
                    break;
                case 7:
                    changeProposal$Entity$OpenShiftToClaim = new ChangeProposal$Entity$OpenShiftToClaim((OpenShiftToClaim) OpenShiftToClaim.ADAPTER.decode(protoReader));
                    utilsKt = changeProposal$Entity$OpenShiftToClaim;
                    break;
                case 8:
                    changeProposal$Entity$OpenShiftToClaim = new ChangeProposal$Entity$ShiftsToSwap((ShiftsToSwap) ShiftsToSwap.ADAPTER.decode(protoReader));
                    utilsKt = changeProposal$Entity$OpenShiftToClaim;
                    break;
                case 9:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 11:
                    changeProposal$Entity$OpenShiftToClaim = new ChangeProposal$Entity$ProposedTimeOff((ProposedTimeOff) ProposedTimeOff.ADAPTER.decode(protoReader));
                    utilsKt = changeProposal$Entity$OpenShiftToClaim;
                    break;
                case 12:
                    changeProposal$Entity$OpenShiftToClaim = new ChangeProposal$Entity$TimecardEditRequest((TimecardEditRequest) TimecardEditRequest.ADAPTER.decode(protoReader));
                    utilsKt = changeProposal$Entity$OpenShiftToClaim;
                    break;
                case 13:
                    changeProposal$Entity$OpenShiftToClaim = new ChangeProposal$Entity$ShiftCover((ShiftToCover) ShiftToCover.ADAPTER.decode(protoReader));
                    utilsKt = changeProposal$Entity$OpenShiftToClaim;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj2 = obj4;
                    obj3 = obj;
                    obj4 = obj2;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ChangeProposal changeProposal = (ChangeProposal) obj;
        reverseProtoWriter.getClass();
        changeProposal.getClass();
        reverseProtoWriter.writeBytes(changeProposal.unknownFields());
        UtilsKt utilsKt = changeProposal.entity;
        if (utilsKt instanceof ChangeProposal$Entity$OpenShiftToClaim) {
            OpenShiftToClaim.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((ChangeProposal$Entity$OpenShiftToClaim) utilsKt).value);
        } else if (utilsKt instanceof ChangeProposal$Entity$ShiftsToSwap) {
            ShiftsToSwap.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((ChangeProposal$Entity$ShiftsToSwap) utilsKt).value);
        } else if (utilsKt instanceof ChangeProposal$Entity$ProposedTimeOff) {
            ProposedTimeOff.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((ChangeProposal$Entity$ProposedTimeOff) utilsKt).value);
        } else if (utilsKt instanceof ChangeProposal$Entity$TimecardEditRequest) {
            TimecardEditRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((ChangeProposal$Entity$TimecardEditRequest) utilsKt).value);
        } else if (utilsKt instanceof ChangeProposal$Entity$ShiftCover) {
            ShiftToCover.ADAPTER.encodeWithTag(reverseProtoWriter, 13, ((ChangeProposal$Entity$ShiftCover) utilsKt).value);
        } else if (utilsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, changeProposal.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, changeProposal.created_at);
        ChangeProposalAdvancement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, changeProposal.advancements);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, changeProposal.note);
        ChangeProposal.State.ADAPTER.encodeWithTag(reverseProtoWriter, 4, changeProposal.state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, changeProposal.target_team_member_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, changeProposal.proposing_team_member_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, changeProposal.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ChangeProposal changeProposal = (ChangeProposal) obj;
        changeProposal.getClass();
        int size$okio = changeProposal.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = ChangeProposalAdvancement.ADAPTER.asRepeated().encodedSizeWithTag(6, changeProposal.advancements) + protoAdapter.encodedSizeWithTag(5, changeProposal.note) + ChangeProposal.State.ADAPTER.encodedSizeWithTag(4, changeProposal.state) + protoAdapter.encodedSizeWithTag(3, changeProposal.target_team_member_id) + protoAdapter.encodedSizeWithTag(2, changeProposal.proposing_team_member_id) + protoAdapter.encodedSizeWithTag(1, changeProposal.id) + size$okio;
        UtilsKt utilsKt = changeProposal.entity;
        if (utilsKt instanceof ChangeProposal$Entity$OpenShiftToClaim) {
            encodedSizeWithTag = OpenShiftToClaim.ADAPTER.encodedSizeWithTag(7, ((ChangeProposal$Entity$OpenShiftToClaim) utilsKt).value);
        } else if (utilsKt instanceof ChangeProposal$Entity$ShiftsToSwap) {
            encodedSizeWithTag = ShiftsToSwap.ADAPTER.encodedSizeWithTag(8, ((ChangeProposal$Entity$ShiftsToSwap) utilsKt).value);
        } else if (utilsKt instanceof ChangeProposal$Entity$ProposedTimeOff) {
            encodedSizeWithTag = ProposedTimeOff.ADAPTER.encodedSizeWithTag(11, ((ChangeProposal$Entity$ProposedTimeOff) utilsKt).value);
        } else if (utilsKt instanceof ChangeProposal$Entity$TimecardEditRequest) {
            encodedSizeWithTag = TimecardEditRequest.ADAPTER.encodedSizeWithTag(12, ((ChangeProposal$Entity$TimecardEditRequest) utilsKt).value);
        } else {
            if (!(utilsKt instanceof ChangeProposal$Entity$ShiftCover)) {
                if (utilsKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return protoAdapter.encodedSizeWithTag(10, changeProposal.updated_at) + protoAdapter.encodedSizeWithTag(9, changeProposal.created_at) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = ShiftToCover.ADAPTER.encodedSizeWithTag(13, ((ChangeProposal$Entity$ShiftCover) utilsKt).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return protoAdapter.encodedSizeWithTag(10, changeProposal.updated_at) + protoAdapter.encodedSizeWithTag(9, changeProposal.created_at) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ChangeProposal changeProposal = (ChangeProposal) obj;
        changeProposal.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(changeProposal.advancements, ChangeProposalAdvancement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = changeProposal.id;
        String str2 = changeProposal.proposing_team_member_id;
        String str3 = changeProposal.target_team_member_id;
        ChangeProposal.State state = changeProposal.state;
        String str4 = changeProposal.note;
        UtilsKt utilsKt = changeProposal.entity;
        String str5 = changeProposal.created_at;
        String str6 = changeProposal.updated_at;
        byteString.getClass();
        return new ChangeProposal(str, str2, str3, state, str4, m1169redactElements, utilsKt, str5, str6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChangeProposal changeProposal = (ChangeProposal) obj;
        changeProposal.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, changeProposal.id);
        protoAdapter.encodeWithTag(protoWriter, 2, changeProposal.proposing_team_member_id);
        protoAdapter.encodeWithTag(protoWriter, 3, changeProposal.target_team_member_id);
        ChangeProposal.State.ADAPTER.encodeWithTag(protoWriter, 4, changeProposal.state);
        protoAdapter.encodeWithTag(protoWriter, 5, changeProposal.note);
        ChangeProposalAdvancement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, changeProposal.advancements);
        protoAdapter.encodeWithTag(protoWriter, 9, changeProposal.created_at);
        protoAdapter.encodeWithTag(protoWriter, 10, changeProposal.updated_at);
        UtilsKt utilsKt = changeProposal.entity;
        if (utilsKt instanceof ChangeProposal$Entity$OpenShiftToClaim) {
            OpenShiftToClaim.ADAPTER.encodeWithTag(protoWriter, 7, ((ChangeProposal$Entity$OpenShiftToClaim) utilsKt).value);
        } else if (utilsKt instanceof ChangeProposal$Entity$ShiftsToSwap) {
            ShiftsToSwap.ADAPTER.encodeWithTag(protoWriter, 8, ((ChangeProposal$Entity$ShiftsToSwap) utilsKt).value);
        } else if (utilsKt instanceof ChangeProposal$Entity$ProposedTimeOff) {
            ProposedTimeOff.ADAPTER.encodeWithTag(protoWriter, 11, ((ChangeProposal$Entity$ProposedTimeOff) utilsKt).value);
        } else if (utilsKt instanceof ChangeProposal$Entity$TimecardEditRequest) {
            TimecardEditRequest.ADAPTER.encodeWithTag(protoWriter, 12, ((ChangeProposal$Entity$TimecardEditRequest) utilsKt).value);
        } else if (utilsKt instanceof ChangeProposal$Entity$ShiftCover) {
            ShiftToCover.ADAPTER.encodeWithTag(protoWriter, 13, ((ChangeProposal$Entity$ShiftCover) utilsKt).value);
        } else if (utilsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(changeProposal.unknownFields());
    }
}
