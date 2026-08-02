package com.squareup.protos.cash.aegis.sync_values;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Dependent$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Dependent((String) obj, (SponsorshipState) obj2, (SendCashCta) obj3, (LockCardWarning) obj4, (Text) obj5, (SponsorshipTier) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    try {
                        obj2 = SponsorshipState.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(SendCashCta.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LockCardWarning.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    try {
                        obj6 = SponsorshipTier.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Dependent dependent = (Dependent) obj;
        reverseProtoWriter.getClass();
        dependent.getClass();
        reverseProtoWriter.writeBytes(dependent.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, dependent.switching_identifier);
        SponsorshipTier.ADAPTER.encodeWithTag(reverseProtoWriter, 6, dependent.sponsorship_tier);
        Text.ADAPTER.encodeWithTag(reverseProtoWriter, 5, dependent.lock_card_error);
        LockCardWarning.ADAPTER.encodeWithTag(reverseProtoWriter, 4, dependent.lock_card_warning);
        SendCashCta.ADAPTER.encodeWithTag(reverseProtoWriter, 3, dependent.send_cash_cta);
        SponsorshipState.ADAPTER.encodeWithTag(reverseProtoWriter, 2, dependent.status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, dependent.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Dependent dependent = (Dependent) obj;
        dependent.getClass();
        int size$okio = dependent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(7, dependent.switching_identifier) + SponsorshipTier.ADAPTER.encodedSizeWithTag(6, dependent.sponsorship_tier) + Text.ADAPTER.encodedSizeWithTag(5, dependent.lock_card_error) + LockCardWarning.ADAPTER.encodedSizeWithTag(4, dependent.lock_card_warning) + SendCashCta.ADAPTER.encodedSizeWithTag(3, dependent.send_cash_cta) + SponsorshipState.ADAPTER.encodedSizeWithTag(2, dependent.status) + protoAdapter.encodedSizeWithTag(1, dependent.customer_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Dependent dependent = (Dependent) obj;
        dependent.getClass();
        SendCashCta sendCashCta = dependent.send_cash_cta;
        SendCashCta sendCashCta2 = sendCashCta != null ? (SendCashCta) SendCashCta.ADAPTER.redact(sendCashCta) : null;
        LockCardWarning lockCardWarning = dependent.lock_card_warning;
        LockCardWarning lockCardWarning2 = lockCardWarning != null ? (LockCardWarning) LockCardWarning.ADAPTER.redact(lockCardWarning) : null;
        Text text = dependent.lock_card_error;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = dependent.customer_token;
        SponsorshipState sponsorshipState = dependent.status;
        SponsorshipTier sponsorshipTier = dependent.sponsorship_tier;
        String str2 = dependent.switching_identifier;
        byteString.getClass();
        return new Dependent(str, sponsorshipState, sendCashCta2, lockCardWarning2, text2, sponsorshipTier, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Dependent dependent = (Dependent) obj;
        dependent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, dependent.customer_token);
        SponsorshipState.ADAPTER.encodeWithTag(protoWriter, 2, dependent.status);
        SendCashCta.ADAPTER.encodeWithTag(protoWriter, 3, dependent.send_cash_cta);
        LockCardWarning.ADAPTER.encodeWithTag(protoWriter, 4, dependent.lock_card_warning);
        Text.ADAPTER.encodeWithTag(protoWriter, 5, dependent.lock_card_error);
        SponsorshipTier.ADAPTER.encodeWithTag(protoWriter, 6, dependent.sponsorship_tier);
        protoAdapter.encodeWithTag(protoWriter, 7, dependent.switching_identifier);
        protoWriter.writeBytes(dependent.unknownFields());
    }
}
