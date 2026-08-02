package com.squareup.protos.cash.usher.api;

import com.google.android.gms.internal.mlkit_vision_common.zzlt;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetPreSignInDataResponse$InvitationIntroData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzlt zzltVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPreSignInDataResponse.InvitationIntroData(zzltVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzltVar = new GetPreSignInDataResponse$InvitationIntroData$Content$TeenSponsorshipRequestContent((GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent) GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzltVar = new GetPreSignInDataResponse$InvitationIntroData$Content$SponsorSponsorshipRequestContent((GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent) GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPreSignInDataResponse.InvitationIntroData invitationIntroData = (GetPreSignInDataResponse.InvitationIntroData) obj;
        reverseProtoWriter.getClass();
        invitationIntroData.getClass();
        reverseProtoWriter.writeBytes(invitationIntroData.unknownFields());
        zzlt zzltVar = invitationIntroData.content;
        if (zzltVar instanceof GetPreSignInDataResponse$InvitationIntroData$Content$TeenSponsorshipRequestContent) {
            GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetPreSignInDataResponse$InvitationIntroData$Content$TeenSponsorshipRequestContent) zzltVar).value);
        } else if (zzltVar instanceof GetPreSignInDataResponse$InvitationIntroData$Content$SponsorSponsorshipRequestContent) {
            GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetPreSignInDataResponse$InvitationIntroData$Content$SponsorSponsorshipRequestContent) zzltVar).value);
        } else {
            if (zzltVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetPreSignInDataResponse.InvitationIntroData invitationIntroData = (GetPreSignInDataResponse.InvitationIntroData) obj;
        invitationIntroData.getClass();
        int size$okio = invitationIntroData.unknownFields().getSize$okio();
        zzlt zzltVar = invitationIntroData.content;
        if (zzltVar instanceof GetPreSignInDataResponse$InvitationIntroData$Content$TeenSponsorshipRequestContent) {
            encodedSizeWithTag = GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent.ADAPTER.encodedSizeWithTag(1, ((GetPreSignInDataResponse$InvitationIntroData$Content$TeenSponsorshipRequestContent) zzltVar).value);
        } else {
            if (!(zzltVar instanceof GetPreSignInDataResponse$InvitationIntroData$Content$SponsorSponsorshipRequestContent)) {
                if (zzltVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent.ADAPTER.encodedSizeWithTag(2, ((GetPreSignInDataResponse$InvitationIntroData$Content$SponsorSponsorshipRequestContent) zzltVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPreSignInDataResponse.InvitationIntroData invitationIntroData = (GetPreSignInDataResponse.InvitationIntroData) obj;
        invitationIntroData.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzlt zzltVar = invitationIntroData.content;
        byteString.getClass();
        return new GetPreSignInDataResponse.InvitationIntroData(zzltVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPreSignInDataResponse.InvitationIntroData invitationIntroData = (GetPreSignInDataResponse.InvitationIntroData) obj;
        invitationIntroData.getClass();
        zzlt zzltVar = invitationIntroData.content;
        if (zzltVar instanceof GetPreSignInDataResponse$InvitationIntroData$Content$TeenSponsorshipRequestContent) {
            GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent.ADAPTER.encodeWithTag(protoWriter, 1, ((GetPreSignInDataResponse$InvitationIntroData$Content$TeenSponsorshipRequestContent) zzltVar).value);
        } else if (zzltVar instanceof GetPreSignInDataResponse$InvitationIntroData$Content$SponsorSponsorshipRequestContent) {
            GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent.ADAPTER.encodeWithTag(protoWriter, 2, ((GetPreSignInDataResponse$InvitationIntroData$Content$SponsorSponsorshipRequestContent) zzltVar).value);
        } else if (zzltVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(invitationIntroData.unknownFields());
    }
}
