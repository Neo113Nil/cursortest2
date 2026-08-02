package com.squareup.protos.cash.aegis.core;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class FamilyAccountsParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FamilyAccountsParameters((InviteLink) obj, (String) obj2, m, (PendingRequestSection) obj3, arrayList, arrayList2, (FormBlocker.Element) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(InviteLink.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 4:
                    m.add(Member.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    obj3 = TransactorKt.decodeMessageOrMerge(PendingRequestSection.ADAPTER, protoReader, obj3);
                    break;
                case 6:
                    arrayList.add(Section.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    arrayList2.add(PendingRequest.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    obj4 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.ADAPTER, protoReader, obj4);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FamilyAccountsParameters familyAccountsParameters = (FamilyAccountsParameters) obj;
        reverseProtoWriter.getClass();
        familyAccountsParameters.getClass();
        reverseProtoWriter.writeBytes(familyAccountsParameters.unknownFields());
        FormBlocker.Element.ADAPTER.encodeWithTag(reverseProtoWriter, 8, familyAccountsParameters.upsell_element);
        PendingRequest.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, familyAccountsParameters.pending_invitations);
        Section.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, familyAccountsParameters.sections);
        PendingRequestSection.ADAPTER.encodeWithTag(reverseProtoWriter, 5, familyAccountsParameters.pending_request_section);
        Member.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, familyAccountsParameters.sorted_dependents);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, familyAccountsParameters.title);
        InviteLink.ADAPTER.encodeWithTag(reverseProtoWriter, 1, familyAccountsParameters.invite_teen_action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FamilyAccountsParameters familyAccountsParameters = (FamilyAccountsParameters) obj;
        familyAccountsParameters.getClass();
        return FormBlocker.Element.ADAPTER.encodedSizeWithTag(8, familyAccountsParameters.upsell_element) + PendingRequest.ADAPTER.asRepeated().encodedSizeWithTag(7, familyAccountsParameters.pending_invitations) + Section.ADAPTER.asRepeated().encodedSizeWithTag(6, familyAccountsParameters.sections) + PendingRequestSection.ADAPTER.encodedSizeWithTag(5, familyAccountsParameters.pending_request_section) + Member.ADAPTER.asRepeated().encodedSizeWithTag(4, familyAccountsParameters.sorted_dependents) + ProtoAdapter.STRING.encodedSizeWithTag(2, familyAccountsParameters.title) + InviteLink.ADAPTER.encodedSizeWithTag(1, familyAccountsParameters.invite_teen_action) + familyAccountsParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FamilyAccountsParameters familyAccountsParameters = (FamilyAccountsParameters) obj;
        familyAccountsParameters.getClass();
        InviteLink inviteLink = familyAccountsParameters.invite_teen_action;
        InviteLink inviteLink2 = inviteLink != null ? (InviteLink) InviteLink.ADAPTER.redact(inviteLink) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(familyAccountsParameters.sorted_dependents, Member.ADAPTER);
        PendingRequestSection pendingRequestSection = familyAccountsParameters.pending_request_section;
        PendingRequestSection pendingRequestSection2 = pendingRequestSection != null ? (PendingRequestSection) PendingRequestSection.ADAPTER.redact(pendingRequestSection) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(familyAccountsParameters.sections, Section.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(familyAccountsParameters.pending_invitations, PendingRequest.ADAPTER);
        FormBlocker.Element element = familyAccountsParameters.upsell_element;
        FormBlocker.Element element2 = element != null ? (FormBlocker.Element) FormBlocker.Element.ADAPTER.redact(element) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = familyAccountsParameters.title;
        byteString.getClass();
        return new FamilyAccountsParameters(inviteLink2, str, m1169redactElements, pendingRequestSection2, m1169redactElements2, m1169redactElements3, element2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FamilyAccountsParameters familyAccountsParameters = (FamilyAccountsParameters) obj;
        familyAccountsParameters.getClass();
        InviteLink.ADAPTER.encodeWithTag(protoWriter, 1, familyAccountsParameters.invite_teen_action);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, familyAccountsParameters.title);
        Member.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, familyAccountsParameters.sorted_dependents);
        PendingRequestSection.ADAPTER.encodeWithTag(protoWriter, 5, familyAccountsParameters.pending_request_section);
        Section.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, familyAccountsParameters.sections);
        PendingRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, familyAccountsParameters.pending_invitations);
        FormBlocker.Element.ADAPTER.encodeWithTag(protoWriter, 8, familyAccountsParameters.upsell_element);
        protoWriter.writeBytes(familyAccountsParameters.unknownFields());
    }
}
