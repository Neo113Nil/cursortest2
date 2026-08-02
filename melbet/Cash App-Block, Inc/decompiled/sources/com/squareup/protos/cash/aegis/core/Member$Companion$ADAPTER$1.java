package com.squareup.protos.cash.aegis.core;

import com.squareup.protos.cash.aegis.sync_values.SponsorshipTier;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Member$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Member((String) obj, (SponsorshipTier) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = SponsorshipTier.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Member member = (Member) obj;
        reverseProtoWriter.getClass();
        member.getClass();
        reverseProtoWriter.writeBytes(member.unknownFields());
        SponsorshipTier.ADAPTER.encodeWithTag(reverseProtoWriter, 2, member.sponsorship_tier);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, member.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Member member = (Member) obj;
        member.getClass();
        return SponsorshipTier.ADAPTER.encodedSizeWithTag(2, member.sponsorship_tier) + ProtoAdapter.STRING.encodedSizeWithTag(1, member.customer_token) + member.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Member member = (Member) obj;
        member.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = member.customer_token;
        SponsorshipTier sponsorshipTier = member.sponsorship_tier;
        byteString.getClass();
        return new Member(str, sponsorshipTier, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Member member = (Member) obj;
        member.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, member.customer_token);
        SponsorshipTier.ADAPTER.encodeWithTag(protoWriter, 2, member.sponsorship_tier);
        protoWriter.writeBytes(member.unknownFields());
    }
}
