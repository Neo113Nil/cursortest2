package com.squareup.protos.cash.aegis.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetFamilyAccountSponsorResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetFamilyAccountSponsorResponse((Sponsor) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Sponsor.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetFamilyAccountSponsorResponse getFamilyAccountSponsorResponse = (GetFamilyAccountSponsorResponse) obj;
        reverseProtoWriter.getClass();
        getFamilyAccountSponsorResponse.getClass();
        reverseProtoWriter.writeBytes(getFamilyAccountSponsorResponse.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, getFamilyAccountSponsorResponse.is_sponsor_led);
        Sponsor.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getFamilyAccountSponsorResponse.sponsor);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetFamilyAccountSponsorResponse getFamilyAccountSponsorResponse = (GetFamilyAccountSponsorResponse) obj;
        getFamilyAccountSponsorResponse.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, getFamilyAccountSponsorResponse.is_sponsor_led) + Sponsor.ADAPTER.encodedSizeWithTag(1, getFamilyAccountSponsorResponse.sponsor) + getFamilyAccountSponsorResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetFamilyAccountSponsorResponse getFamilyAccountSponsorResponse = (GetFamilyAccountSponsorResponse) obj;
        getFamilyAccountSponsorResponse.getClass();
        Sponsor sponsor = getFamilyAccountSponsorResponse.sponsor;
        Sponsor sponsor2 = sponsor != null ? (Sponsor) Sponsor.ADAPTER.redact(sponsor) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = getFamilyAccountSponsorResponse.is_sponsor_led;
        byteString.getClass();
        return new GetFamilyAccountSponsorResponse(sponsor2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetFamilyAccountSponsorResponse getFamilyAccountSponsorResponse = (GetFamilyAccountSponsorResponse) obj;
        getFamilyAccountSponsorResponse.getClass();
        Sponsor.ADAPTER.encodeWithTag(protoWriter, 1, getFamilyAccountSponsorResponse.sponsor);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getFamilyAccountSponsorResponse.is_sponsor_led);
        protoWriter.writeBytes(getFamilyAccountSponsorResponse.unknownFields());
    }
}
