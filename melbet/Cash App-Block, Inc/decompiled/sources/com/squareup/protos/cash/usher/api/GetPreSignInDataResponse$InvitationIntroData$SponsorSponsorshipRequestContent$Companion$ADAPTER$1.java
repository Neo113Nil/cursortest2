package com.squareup.protos.cash.usher.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetPreSignInDataResponse$InvitationIntroData$SponsorSponsorshipRequestContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent(m, (String) obj, (GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction) obj2, (GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(FormBlocker.Element.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent sponsorSponsorshipRequestContent = (GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent) obj;
        reverseProtoWriter.getClass();
        sponsorSponsorshipRequestContent.getClass();
        reverseProtoWriter.writeBytes(sponsorSponsorshipRequestContent.unknownFields());
        GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog.ADAPTER.encodeWithTag(reverseProtoWriter, 4, sponsorSponsorshipRequestContent.close_screen_dialog);
        GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, sponsorSponsorshipRequestContent.primary_button_action);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, sponsorSponsorshipRequestContent.primary_button_text);
        FormBlocker.Element.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, sponsorSponsorshipRequestContent.elements);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent sponsorSponsorshipRequestContent = (GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent) obj;
        sponsorSponsorshipRequestContent.getClass();
        return GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog.ADAPTER.encodedSizeWithTag(4, sponsorSponsorshipRequestContent.close_screen_dialog) + GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction.ADAPTER.encodedSizeWithTag(3, sponsorSponsorshipRequestContent.primary_button_action) + ProtoAdapter.STRING.encodedSizeWithTag(2, sponsorSponsorshipRequestContent.primary_button_text) + FormBlocker.Element.ADAPTER.asRepeated().encodedSizeWithTag(1, sponsorSponsorshipRequestContent.elements) + sponsorSponsorshipRequestContent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent sponsorSponsorshipRequestContent = (GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent) obj;
        sponsorSponsorshipRequestContent.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(sponsorSponsorshipRequestContent.elements, FormBlocker.Element.ADAPTER);
        GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction acceptInvitationAction = sponsorSponsorshipRequestContent.primary_button_action;
        GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction acceptInvitationAction2 = acceptInvitationAction != null ? (GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction) GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction.ADAPTER.redact(acceptInvitationAction) : null;
        GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog closeScreenDialog = sponsorSponsorshipRequestContent.close_screen_dialog;
        GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog closeScreenDialog2 = closeScreenDialog != null ? (GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog) GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog.ADAPTER.redact(closeScreenDialog) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = sponsorSponsorshipRequestContent.primary_button_text;
        byteString.getClass();
        return new GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent(m1169redactElements, str, acceptInvitationAction2, closeScreenDialog2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent sponsorSponsorshipRequestContent = (GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent) obj;
        sponsorSponsorshipRequestContent.getClass();
        FormBlocker.Element.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, sponsorSponsorshipRequestContent.elements);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sponsorSponsorshipRequestContent.primary_button_text);
        GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction.ADAPTER.encodeWithTag(protoWriter, 3, sponsorSponsorshipRequestContent.primary_button_action);
        GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog.ADAPTER.encodeWithTag(protoWriter, 4, sponsorSponsorshipRequestContent.close_screen_dialog);
        protoWriter.writeBytes(sponsorSponsorshipRequestContent.unknownFields());
    }
}
