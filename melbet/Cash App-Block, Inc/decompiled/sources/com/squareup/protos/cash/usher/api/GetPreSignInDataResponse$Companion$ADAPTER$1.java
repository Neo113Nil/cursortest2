package com.squareup.protos.cash.usher.api;

import androidx.room.util.DBUtil;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetPreSignInDataResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        DBUtil dBUtil = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPreSignInDataResponse(dBUtil, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                dBUtil = new GetPreSignInDataResponse$IntroData$InvitationIntroData((GetPreSignInDataResponse.InvitationIntroData) GetPreSignInDataResponse.InvitationIntroData.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                dBUtil = new GetPreSignInDataResponse$IntroData$StaffInvitationIntroData((GetPreSignInDataResponse.StaffInvitationIntroData) GetPreSignInDataResponse.StaffInvitationIntroData.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                dBUtil = new GetPreSignInDataResponse$IntroData$ContextualOnboardingIntroData((GetPreSignInDataResponse.ContextualOnboardingIntroData) GetPreSignInDataResponse.ContextualOnboardingIntroData.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPreSignInDataResponse getPreSignInDataResponse = (GetPreSignInDataResponse) obj;
        reverseProtoWriter.getClass();
        getPreSignInDataResponse.getClass();
        reverseProtoWriter.writeBytes(getPreSignInDataResponse.unknownFields());
        DBUtil dBUtil = getPreSignInDataResponse.intro_data;
        if (dBUtil instanceof GetPreSignInDataResponse$IntroData$InvitationIntroData) {
            GetPreSignInDataResponse.InvitationIntroData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetPreSignInDataResponse$IntroData$InvitationIntroData) dBUtil).value);
            return;
        }
        if (dBUtil instanceof GetPreSignInDataResponse$IntroData$StaffInvitationIntroData) {
            GetPreSignInDataResponse.StaffInvitationIntroData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetPreSignInDataResponse$IntroData$StaffInvitationIntroData) dBUtil).value);
        } else if (dBUtil instanceof GetPreSignInDataResponse$IntroData$ContextualOnboardingIntroData) {
            GetPreSignInDataResponse.ContextualOnboardingIntroData.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((GetPreSignInDataResponse$IntroData$ContextualOnboardingIntroData) dBUtil).value);
        } else {
            if (dBUtil == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetPreSignInDataResponse getPreSignInDataResponse = (GetPreSignInDataResponse) obj;
        getPreSignInDataResponse.getClass();
        int size$okio = getPreSignInDataResponse.unknownFields().getSize$okio();
        DBUtil dBUtil = getPreSignInDataResponse.intro_data;
        if (dBUtil instanceof GetPreSignInDataResponse$IntroData$InvitationIntroData) {
            encodedSizeWithTag = GetPreSignInDataResponse.InvitationIntroData.ADAPTER.encodedSizeWithTag(1, ((GetPreSignInDataResponse$IntroData$InvitationIntroData) dBUtil).value);
        } else if (dBUtil instanceof GetPreSignInDataResponse$IntroData$StaffInvitationIntroData) {
            encodedSizeWithTag = GetPreSignInDataResponse.StaffInvitationIntroData.ADAPTER.encodedSizeWithTag(2, ((GetPreSignInDataResponse$IntroData$StaffInvitationIntroData) dBUtil).value);
        } else {
            if (!(dBUtil instanceof GetPreSignInDataResponse$IntroData$ContextualOnboardingIntroData)) {
                if (dBUtil == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = GetPreSignInDataResponse.ContextualOnboardingIntroData.ADAPTER.encodedSizeWithTag(3, ((GetPreSignInDataResponse$IntroData$ContextualOnboardingIntroData) dBUtil).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPreSignInDataResponse getPreSignInDataResponse = (GetPreSignInDataResponse) obj;
        getPreSignInDataResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        DBUtil dBUtil = getPreSignInDataResponse.intro_data;
        byteString.getClass();
        return new GetPreSignInDataResponse(dBUtil, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPreSignInDataResponse getPreSignInDataResponse = (GetPreSignInDataResponse) obj;
        getPreSignInDataResponse.getClass();
        DBUtil dBUtil = getPreSignInDataResponse.intro_data;
        if (dBUtil instanceof GetPreSignInDataResponse$IntroData$InvitationIntroData) {
            GetPreSignInDataResponse.InvitationIntroData.ADAPTER.encodeWithTag(protoWriter, 1, ((GetPreSignInDataResponse$IntroData$InvitationIntroData) dBUtil).value);
        } else if (dBUtil instanceof GetPreSignInDataResponse$IntroData$StaffInvitationIntroData) {
            GetPreSignInDataResponse.StaffInvitationIntroData.ADAPTER.encodeWithTag(protoWriter, 2, ((GetPreSignInDataResponse$IntroData$StaffInvitationIntroData) dBUtil).value);
        } else if (dBUtil instanceof GetPreSignInDataResponse$IntroData$ContextualOnboardingIntroData) {
            GetPreSignInDataResponse.ContextualOnboardingIntroData.ADAPTER.encodeWithTag(protoWriter, 3, ((GetPreSignInDataResponse$IntroData$ContextualOnboardingIntroData) dBUtil).value);
        } else if (dBUtil != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getPreSignInDataResponse.unknownFields());
    }
}
