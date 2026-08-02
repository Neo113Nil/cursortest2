package com.squareup.lending;

import androidx.room.TransactorKt;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreHomeData$DisclaimerSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreHomeData.DisclaimerSection((LocalizedString) obj, (CashCreditScoreHomeData.TextAlignment) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = CashCreditScoreHomeData.TextAlignment.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreHomeData.DisclaimerSection disclaimerSection = (CashCreditScoreHomeData.DisclaimerSection) obj;
        reverseProtoWriter.getClass();
        disclaimerSection.getClass();
        reverseProtoWriter.writeBytes(disclaimerSection.unknownFields());
        CashCreditScoreHomeData.TextAlignment.ADAPTER.encodeWithTag(reverseProtoWriter, 2, disclaimerSection.text_alignment);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, disclaimerSection.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreHomeData.DisclaimerSection disclaimerSection = (CashCreditScoreHomeData.DisclaimerSection) obj;
        disclaimerSection.getClass();
        return CashCreditScoreHomeData.TextAlignment.ADAPTER.encodedSizeWithTag(2, disclaimerSection.text_alignment) + LocalizedString.ADAPTER.encodedSizeWithTag(1, disclaimerSection.text) + disclaimerSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreHomeData.DisclaimerSection disclaimerSection = (CashCreditScoreHomeData.DisclaimerSection) obj;
        disclaimerSection.getClass();
        LocalizedString localizedString = disclaimerSection.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        CashCreditScoreHomeData.TextAlignment textAlignment = disclaimerSection.text_alignment;
        byteString.getClass();
        return new CashCreditScoreHomeData.DisclaimerSection(localizedString2, textAlignment, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreHomeData.DisclaimerSection disclaimerSection = (CashCreditScoreHomeData.DisclaimerSection) obj;
        disclaimerSection.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, disclaimerSection.text);
        CashCreditScoreHomeData.TextAlignment.ADAPTER.encodeWithTag(protoWriter, 2, disclaimerSection.text_alignment);
        protoWriter.writeBytes(disclaimerSection.unknownFields());
    }
}
