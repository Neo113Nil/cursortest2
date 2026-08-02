package com.squareup.protos.cash.aegis.sync_values;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Sponsor$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Sponsor((String) obj, (SponsorshipState) obj2, (LinkText) obj3, (Long) obj4, (GraduationCta) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = SponsorshipState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LinkText.ADAPTER, protoReader, obj3);
            } else if (nextTag == 5) {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(GraduationCta.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Sponsor sponsor = (Sponsor) obj;
        reverseProtoWriter.getClass();
        sponsor.getClass();
        reverseProtoWriter.writeBytes(sponsor.unknownFields());
        GraduationCta.ADAPTER.encodeWithTag(reverseProtoWriter, 7, sponsor.graduation_cta);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 5, sponsor.sponsorship_requested_at);
        LinkText.ADAPTER.encodeWithTag(reverseProtoWriter, 3, sponsor.primary_cta);
        SponsorshipState.ADAPTER.encodeWithTag(reverseProtoWriter, 2, sponsor.status);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, sponsor.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Sponsor sponsor = (Sponsor) obj;
        sponsor.getClass();
        return GraduationCta.ADAPTER.encodedSizeWithTag(7, sponsor.graduation_cta) + ProtoAdapter.INT64.encodedSizeWithTag(5, sponsor.sponsorship_requested_at) + LinkText.ADAPTER.encodedSizeWithTag(3, sponsor.primary_cta) + SponsorshipState.ADAPTER.encodedSizeWithTag(2, sponsor.status) + ProtoAdapter.STRING.encodedSizeWithTag(1, sponsor.customer_token) + sponsor.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Sponsor sponsor = (Sponsor) obj;
        sponsor.getClass();
        GraduationCta graduationCta = sponsor.graduation_cta;
        GraduationCta graduationCta2 = graduationCta != null ? (GraduationCta) GraduationCta.ADAPTER.redact(graduationCta) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = sponsor.customer_token;
        SponsorshipState sponsorshipState = sponsor.status;
        Long l = sponsor.sponsorship_requested_at;
        byteString.getClass();
        return new Sponsor(str, sponsorshipState, null, l, graduationCta2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Sponsor sponsor = (Sponsor) obj;
        sponsor.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sponsor.customer_token);
        SponsorshipState.ADAPTER.encodeWithTag(protoWriter, 2, sponsor.status);
        LinkText.ADAPTER.encodeWithTag(protoWriter, 3, sponsor.primary_cta);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, sponsor.sponsorship_requested_at);
        GraduationCta.ADAPTER.encodeWithTag(protoWriter, 7, sponsor.graduation_cta);
        protoWriter.writeBytes(sponsor.unknownFields());
    }
}
