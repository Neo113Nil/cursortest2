package com.squareup.lending;

import androidx.room.TransactorKt;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreHomeData$InfoSection$InfoItem$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashCreditScoreHomeData.InfoSection.InfoItem((CashCreditScoreHomeData.InfoSection.CollapsingItem) obj, (CashCreditScoreHomeData.InfoSection.Row) obj2, (CashCreditScoreHomeData.InfoSection.Callout) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.InfoSection.CollapsingItem.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.InfoSection.Row.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.InfoSection.Callout.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreHomeData.InfoSection.InfoItem infoItem = (CashCreditScoreHomeData.InfoSection.InfoItem) obj;
        reverseProtoWriter.getClass();
        infoItem.getClass();
        reverseProtoWriter.writeBytes(infoItem.unknownFields());
        CashCreditScoreHomeData.InfoSection.Callout.ADAPTER.encodeWithTag(reverseProtoWriter, 3, infoItem.callout);
        CashCreditScoreHomeData.InfoSection.Row.ADAPTER.encodeWithTag(reverseProtoWriter, 2, infoItem.row);
        CashCreditScoreHomeData.InfoSection.CollapsingItem.ADAPTER.encodeWithTag(reverseProtoWriter, 1, infoItem.collapsing_item);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreHomeData.InfoSection.InfoItem infoItem = (CashCreditScoreHomeData.InfoSection.InfoItem) obj;
        infoItem.getClass();
        return CashCreditScoreHomeData.InfoSection.Callout.ADAPTER.encodedSizeWithTag(3, infoItem.callout) + CashCreditScoreHomeData.InfoSection.Row.ADAPTER.encodedSizeWithTag(2, infoItem.row) + CashCreditScoreHomeData.InfoSection.CollapsingItem.ADAPTER.encodedSizeWithTag(1, infoItem.collapsing_item) + infoItem.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreHomeData.InfoSection.InfoItem infoItem = (CashCreditScoreHomeData.InfoSection.InfoItem) obj;
        infoItem.getClass();
        CashCreditScoreHomeData.InfoSection.CollapsingItem collapsingItem = infoItem.collapsing_item;
        CashCreditScoreHomeData.InfoSection.CollapsingItem collapsingItem2 = collapsingItem != null ? (CashCreditScoreHomeData.InfoSection.CollapsingItem) CashCreditScoreHomeData.InfoSection.CollapsingItem.ADAPTER.redact(collapsingItem) : null;
        CashCreditScoreHomeData.InfoSection.Row row = infoItem.row;
        CashCreditScoreHomeData.InfoSection.Row row2 = row != null ? (CashCreditScoreHomeData.InfoSection.Row) CashCreditScoreHomeData.InfoSection.Row.ADAPTER.redact(row) : null;
        CashCreditScoreHomeData.InfoSection.Callout callout = infoItem.callout;
        CashCreditScoreHomeData.InfoSection.Callout callout2 = callout != null ? (CashCreditScoreHomeData.InfoSection.Callout) CashCreditScoreHomeData.InfoSection.Callout.ADAPTER.redact(callout) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashCreditScoreHomeData.InfoSection.InfoItem(collapsingItem2, row2, callout2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreHomeData.InfoSection.InfoItem infoItem = (CashCreditScoreHomeData.InfoSection.InfoItem) obj;
        infoItem.getClass();
        CashCreditScoreHomeData.InfoSection.CollapsingItem.ADAPTER.encodeWithTag(protoWriter, 1, infoItem.collapsing_item);
        CashCreditScoreHomeData.InfoSection.Row.ADAPTER.encodeWithTag(protoWriter, 2, infoItem.row);
        CashCreditScoreHomeData.InfoSection.Callout.ADAPTER.encodeWithTag(protoWriter, 3, infoItem.callout);
        protoWriter.writeBytes(infoItem.unknownFields());
    }
}
