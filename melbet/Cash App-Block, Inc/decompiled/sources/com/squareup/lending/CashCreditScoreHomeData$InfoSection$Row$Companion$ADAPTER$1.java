package com.squareup.lending;

import androidx.room.TransactorKt;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreHomeData$InfoSection$Row$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreHomeData.InfoSection.Row((CashCreditScoreHomeData.Action) obj, (Icon) obj2, (LocalizedString) obj3, (LocalizedString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.Action.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreHomeData.InfoSection.Row row = (CashCreditScoreHomeData.InfoSection.Row) obj;
        reverseProtoWriter.getClass();
        row.getClass();
        reverseProtoWriter.writeBytes(row.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, row.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, row.title);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 2, row.icon);
        CashCreditScoreHomeData.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 1, row.action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreHomeData.InfoSection.Row row = (CashCreditScoreHomeData.InfoSection.Row) obj;
        row.getClass();
        int encodedSizeWithTag = Icon.ADAPTER.encodedSizeWithTag(2, row.icon) + CashCreditScoreHomeData.Action.ADAPTER.encodedSizeWithTag(1, row.action) + row.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, row.body) + protoAdapter.encodedSizeWithTag(3, row.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreHomeData.InfoSection.Row row = (CashCreditScoreHomeData.InfoSection.Row) obj;
        row.getClass();
        CashCreditScoreHomeData.Action action = row.action;
        CashCreditScoreHomeData.Action action2 = action != null ? (CashCreditScoreHomeData.Action) CashCreditScoreHomeData.Action.ADAPTER.redact(action) : null;
        Icon icon = row.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        LocalizedString localizedString = row.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = row.body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashCreditScoreHomeData.InfoSection.Row(action2, icon2, localizedString2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreHomeData.InfoSection.Row row = (CashCreditScoreHomeData.InfoSection.Row) obj;
        row.getClass();
        CashCreditScoreHomeData.Action.ADAPTER.encodeWithTag(protoWriter, 1, row.action);
        Icon.ADAPTER.encodeWithTag(protoWriter, 2, row.icon);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, row.title);
        protoAdapter.encodeWithTag(protoWriter, 4, row.body);
        protoWriter.writeBytes(row.unknownFields());
    }
}
