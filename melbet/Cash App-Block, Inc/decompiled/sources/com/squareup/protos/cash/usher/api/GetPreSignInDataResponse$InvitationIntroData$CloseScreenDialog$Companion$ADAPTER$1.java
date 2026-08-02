package com.squareup.protos.cash.usher.api;

import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetPreSignInDataResponse$InvitationIntroData$CloseScreenDialog$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog closeScreenDialog = (GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog) obj;
        reverseProtoWriter.getClass();
        closeScreenDialog.getClass();
        reverseProtoWriter.writeBytes(closeScreenDialog.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, closeScreenDialog.dismiss_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, closeScreenDialog.continue_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, closeScreenDialog.message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, closeScreenDialog.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog closeScreenDialog = (GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog) obj;
        closeScreenDialog.getClass();
        int size$okio = closeScreenDialog.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, closeScreenDialog.dismiss_button_text) + protoAdapter.encodedSizeWithTag(3, closeScreenDialog.continue_button_text) + protoAdapter.encodedSizeWithTag(2, closeScreenDialog.message) + protoAdapter.encodedSizeWithTag(1, closeScreenDialog.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog closeScreenDialog = (GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog) obj;
        closeScreenDialog.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = closeScreenDialog.title;
        String str2 = closeScreenDialog.message;
        String str3 = closeScreenDialog.continue_button_text;
        String str4 = closeScreenDialog.dismiss_button_text;
        byteString.getClass();
        return new GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog(str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog closeScreenDialog = (GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog) obj;
        closeScreenDialog.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, closeScreenDialog.title);
        protoAdapter.encodeWithTag(protoWriter, 2, closeScreenDialog.message);
        protoAdapter.encodeWithTag(protoWriter, 3, closeScreenDialog.continue_button_text);
        protoAdapter.encodeWithTag(protoWriter, 4, closeScreenDialog.dismiss_button_text);
        protoWriter.writeBytes(closeScreenDialog.unknownFields());
    }
}
