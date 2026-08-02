package com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.CardBlockedBusinessesUIConfig;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardBlockedBusinessesUIConfig$SectionConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardBlockedBusinessesUIConfig.SectionConfig((LocalizedString) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(CardBlockedBusinessesUIConfig.MerchantRow.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardBlockedBusinessesUIConfig.SectionConfig sectionConfig = (CardBlockedBusinessesUIConfig.SectionConfig) obj;
        reverseProtoWriter.getClass();
        sectionConfig.getClass();
        reverseProtoWriter.writeBytes(sectionConfig.unknownFields());
        CardBlockedBusinessesUIConfig.MerchantRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, sectionConfig.merchant_rows);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, sectionConfig.section_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardBlockedBusinessesUIConfig.SectionConfig sectionConfig = (CardBlockedBusinessesUIConfig.SectionConfig) obj;
        sectionConfig.getClass();
        return CardBlockedBusinessesUIConfig.MerchantRow.ADAPTER.asRepeated().encodedSizeWithTag(2, sectionConfig.merchant_rows) + LocalizedString.ADAPTER.encodedSizeWithTag(1, sectionConfig.section_title) + sectionConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardBlockedBusinessesUIConfig.SectionConfig sectionConfig = (CardBlockedBusinessesUIConfig.SectionConfig) obj;
        sectionConfig.getClass();
        LocalizedString localizedString = sectionConfig.section_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(sectionConfig.merchant_rows, CardBlockedBusinessesUIConfig.MerchantRow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardBlockedBusinessesUIConfig.SectionConfig(localizedString2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardBlockedBusinessesUIConfig.SectionConfig sectionConfig = (CardBlockedBusinessesUIConfig.SectionConfig) obj;
        sectionConfig.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, sectionConfig.section_title);
        CardBlockedBusinessesUIConfig.MerchantRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, sectionConfig.merchant_rows);
        protoWriter.writeBytes(sectionConfig.unknownFields());
    }
}
