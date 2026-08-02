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
public final class GetPreSignInDataResponse$StaffInvitationIntroData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPreSignInDataResponse.StaffInvitationIntroData((FormBlocker) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(FormBlocker.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPreSignInDataResponse.StaffInvitationIntroData staffInvitationIntroData = (GetPreSignInDataResponse.StaffInvitationIntroData) obj;
        reverseProtoWriter.getClass();
        staffInvitationIntroData.getClass();
        reverseProtoWriter.writeBytes(staffInvitationIntroData.unknownFields());
        FormBlocker.ADAPTER.encodeWithTag(reverseProtoWriter, 1, staffInvitationIntroData.form_blocker);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPreSignInDataResponse.StaffInvitationIntroData staffInvitationIntroData = (GetPreSignInDataResponse.StaffInvitationIntroData) obj;
        staffInvitationIntroData.getClass();
        return FormBlocker.ADAPTER.encodedSizeWithTag(1, staffInvitationIntroData.form_blocker) + staffInvitationIntroData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPreSignInDataResponse.StaffInvitationIntroData staffInvitationIntroData = (GetPreSignInDataResponse.StaffInvitationIntroData) obj;
        staffInvitationIntroData.getClass();
        FormBlocker formBlocker = staffInvitationIntroData.form_blocker;
        FormBlocker formBlocker2 = formBlocker != null ? (FormBlocker) FormBlocker.ADAPTER.redact(formBlocker) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetPreSignInDataResponse.StaffInvitationIntroData(formBlocker2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPreSignInDataResponse.StaffInvitationIntroData staffInvitationIntroData = (GetPreSignInDataResponse.StaffInvitationIntroData) obj;
        staffInvitationIntroData.getClass();
        FormBlocker.ADAPTER.encodeWithTag(protoWriter, 1, staffInvitationIntroData.form_blocker);
        protoWriter.writeBytes(staffInvitationIntroData.unknownFields());
    }
}
