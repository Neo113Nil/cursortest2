package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint$CreditBalance$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayAppletEntrypoint.CreditBalance((LocalizedString) obj, (LocalizedString) obj2, (AfterpayAppletEntrypoint.CreditBalance.RingStyle) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = AfterpayAppletEntrypoint.CreditBalance.RingStyle.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletEntrypoint.CreditBalance creditBalance = (AfterpayAppletEntrypoint.CreditBalance) obj;
        reverseProtoWriter.getClass();
        creditBalance.getClass();
        reverseProtoWriter.writeBytes(creditBalance.unknownFields());
        AfterpayAppletEntrypoint.CreditBalance.RingStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 3, creditBalance.ring_style);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, creditBalance.total_balance_suffix);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, creditBalance.total_credit_suffix);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletEntrypoint.CreditBalance creditBalance = (AfterpayAppletEntrypoint.CreditBalance) obj;
        creditBalance.getClass();
        int size$okio = creditBalance.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return AfterpayAppletEntrypoint.CreditBalance.RingStyle.ADAPTER.encodedSizeWithTag(3, creditBalance.ring_style) + protoAdapter.encodedSizeWithTag(2, creditBalance.total_balance_suffix) + protoAdapter.encodedSizeWithTag(1, creditBalance.total_credit_suffix) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletEntrypoint.CreditBalance creditBalance = (AfterpayAppletEntrypoint.CreditBalance) obj;
        creditBalance.getClass();
        LocalizedString localizedString = creditBalance.total_credit_suffix;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = creditBalance.total_balance_suffix;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        AfterpayAppletEntrypoint.CreditBalance.RingStyle ringStyle = creditBalance.ring_style;
        byteString.getClass();
        return new AfterpayAppletEntrypoint.CreditBalance(localizedString2, localizedString4, ringStyle, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletEntrypoint.CreditBalance creditBalance = (AfterpayAppletEntrypoint.CreditBalance) obj;
        creditBalance.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, creditBalance.total_credit_suffix);
        protoAdapter.encodeWithTag(protoWriter, 2, creditBalance.total_balance_suffix);
        AfterpayAppletEntrypoint.CreditBalance.RingStyle.ADAPTER.encodeWithTag(protoWriter, 3, creditBalance.ring_style);
        protoWriter.writeBytes(creditBalance.unknownFields());
    }
}
