package com.squareup.protos.cash.usher.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetPreSignInDataResponse$InvitationIntroData$TeenSponsorshipRequestContent$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent((FormBlocker.Element.RemoteImageElement) obj, (FormBlocker.Element.TextElement) obj2, (FormBlocker.Element.TextElement) obj3, (FormBlocker.Element.SpacerElement) obj4, (FormBlocker.Element.TextElement) obj5, (String) obj6, (GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction) obj7, (GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.RemoteImageElement.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.TextElement.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.TextElement.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.SpacerElement.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.TextElement.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent teenSponsorshipRequestContent = (GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent) obj;
        reverseProtoWriter.getClass();
        teenSponsorshipRequestContent.getClass();
        reverseProtoWriter.writeBytes(teenSponsorshipRequestContent.unknownFields());
        GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog.ADAPTER.encodeWithTag(reverseProtoWriter, 8, teenSponsorshipRequestContent.close_screen_dialog);
        GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction.ADAPTER.encodeWithTag(reverseProtoWriter, 7, teenSponsorshipRequestContent.primary_button_action);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, teenSponsorshipRequestContent.primary_button_text);
        ProtoAdapter protoAdapter = FormBlocker.Element.TextElement.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, teenSponsorshipRequestContent.legal_text_above_primary_button);
        FormBlocker.Element.SpacerElement.ADAPTER.encodeWithTag(reverseProtoWriter, 4, teenSponsorshipRequestContent.spacer_under_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, teenSponsorshipRequestContent.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, teenSponsorshipRequestContent.title);
        FormBlocker.Element.RemoteImageElement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, teenSponsorshipRequestContent.splash_image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent teenSponsorshipRequestContent = (GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent) obj;
        teenSponsorshipRequestContent.getClass();
        int encodedSizeWithTag = FormBlocker.Element.RemoteImageElement.ADAPTER.encodedSizeWithTag(1, teenSponsorshipRequestContent.splash_image) + teenSponsorshipRequestContent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = FormBlocker.Element.TextElement.ADAPTER;
        return GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog.ADAPTER.encodedSizeWithTag(8, teenSponsorshipRequestContent.close_screen_dialog) + GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction.ADAPTER.encodedSizeWithTag(7, teenSponsorshipRequestContent.primary_button_action) + ProtoAdapter.STRING.encodedSizeWithTag(6, teenSponsorshipRequestContent.primary_button_text) + protoAdapter.encodedSizeWithTag(5, teenSponsorshipRequestContent.legal_text_above_primary_button) + FormBlocker.Element.SpacerElement.ADAPTER.encodedSizeWithTag(4, teenSponsorshipRequestContent.spacer_under_subtitle) + protoAdapter.encodedSizeWithTag(3, teenSponsorshipRequestContent.subtitle) + protoAdapter.encodedSizeWithTag(2, teenSponsorshipRequestContent.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent teenSponsorshipRequestContent = (GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent) obj;
        teenSponsorshipRequestContent.getClass();
        FormBlocker.Element.RemoteImageElement remoteImageElement = teenSponsorshipRequestContent.splash_image;
        FormBlocker.Element.RemoteImageElement remoteImageElement2 = remoteImageElement != null ? (FormBlocker.Element.RemoteImageElement) FormBlocker.Element.RemoteImageElement.ADAPTER.redact(remoteImageElement) : null;
        FormBlocker.Element.TextElement textElement = teenSponsorshipRequestContent.title;
        FormBlocker.Element.TextElement textElement2 = textElement != null ? (FormBlocker.Element.TextElement) FormBlocker.Element.TextElement.ADAPTER.redact(textElement) : null;
        FormBlocker.Element.TextElement textElement3 = teenSponsorshipRequestContent.subtitle;
        FormBlocker.Element.TextElement textElement4 = textElement3 != null ? (FormBlocker.Element.TextElement) FormBlocker.Element.TextElement.ADAPTER.redact(textElement3) : null;
        FormBlocker.Element.SpacerElement spacerElement = teenSponsorshipRequestContent.spacer_under_subtitle;
        FormBlocker.Element.SpacerElement spacerElement2 = spacerElement != null ? (FormBlocker.Element.SpacerElement) FormBlocker.Element.SpacerElement.ADAPTER.redact(spacerElement) : null;
        FormBlocker.Element.TextElement textElement5 = teenSponsorshipRequestContent.legal_text_above_primary_button;
        FormBlocker.Element.TextElement textElement6 = textElement5 != null ? (FormBlocker.Element.TextElement) FormBlocker.Element.TextElement.ADAPTER.redact(textElement5) : null;
        GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction acceptInvitationAction = teenSponsorshipRequestContent.primary_button_action;
        GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction acceptInvitationAction2 = acceptInvitationAction != null ? (GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction) GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction.ADAPTER.redact(acceptInvitationAction) : null;
        GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog closeScreenDialog = teenSponsorshipRequestContent.close_screen_dialog;
        GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog closeScreenDialog2 = closeScreenDialog != null ? (GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog) GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog.ADAPTER.redact(closeScreenDialog) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = teenSponsorshipRequestContent.primary_button_text;
        byteString.getClass();
        return new GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent(remoteImageElement2, textElement2, textElement4, spacerElement2, textElement6, str, acceptInvitationAction2, closeScreenDialog2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent teenSponsorshipRequestContent = (GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent) obj;
        teenSponsorshipRequestContent.getClass();
        FormBlocker.Element.RemoteImageElement.ADAPTER.encodeWithTag(protoWriter, 1, teenSponsorshipRequestContent.splash_image);
        ProtoAdapter protoAdapter = FormBlocker.Element.TextElement.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, teenSponsorshipRequestContent.title);
        protoAdapter.encodeWithTag(protoWriter, 3, teenSponsorshipRequestContent.subtitle);
        FormBlocker.Element.SpacerElement.ADAPTER.encodeWithTag(protoWriter, 4, teenSponsorshipRequestContent.spacer_under_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 5, teenSponsorshipRequestContent.legal_text_above_primary_button);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, teenSponsorshipRequestContent.primary_button_text);
        GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction.ADAPTER.encodeWithTag(protoWriter, 7, teenSponsorshipRequestContent.primary_button_action);
        GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog.ADAPTER.encodeWithTag(protoWriter, 8, teenSponsorshipRequestContent.close_screen_dialog);
        protoWriter.writeBytes(teenSponsorshipRequestContent.unknownFields());
    }
}
