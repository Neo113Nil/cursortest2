package com.squareup.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreHomeData$InfoSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreHomeData.InfoSection((Boolean) obj, (LocalizedString) obj2, (LocalizedString) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(CashCreditScoreHomeData.InfoSection.InfoItem.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreHomeData.InfoSection infoSection = (CashCreditScoreHomeData.InfoSection) obj;
        reverseProtoWriter.getClass();
        infoSection.getClass();
        reverseProtoWriter.writeBytes(infoSection.unknownFields());
        CashCreditScoreHomeData.InfoSection.InfoItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, infoSection.items);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, infoSection.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, infoSection.title);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, infoSection.show_top_divider);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreHomeData.InfoSection infoSection = (CashCreditScoreHomeData.InfoSection) obj;
        infoSection.getClass();
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, infoSection.show_top_divider) + infoSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return CashCreditScoreHomeData.InfoSection.InfoItem.ADAPTER.asRepeated().encodedSizeWithTag(4, infoSection.items) + protoAdapter.encodedSizeWithTag(3, infoSection.body) + protoAdapter.encodedSizeWithTag(2, infoSection.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreHomeData.InfoSection infoSection = (CashCreditScoreHomeData.InfoSection) obj;
        infoSection.getClass();
        LocalizedString localizedString = infoSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = infoSection.body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(infoSection.items, CashCreditScoreHomeData.InfoSection.InfoItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = infoSection.show_top_divider;
        byteString.getClass();
        return new CashCreditScoreHomeData.InfoSection(bool, localizedString2, localizedString4, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreHomeData.InfoSection infoSection = (CashCreditScoreHomeData.InfoSection) obj;
        infoSection.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, infoSection.show_top_divider);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, infoSection.title);
        protoAdapter.encodeWithTag(protoWriter, 3, infoSection.body);
        CashCreditScoreHomeData.InfoSection.InfoItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, infoSection.items);
        protoWriter.writeBytes(infoSection.unknownFields());
    }
}
