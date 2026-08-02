package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$AddOrUpdateDirectDepositSection$PendingDirectDepositInfo$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo((LocalizedString) obj, (LocalizedString) obj2, (PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo pendingDirectDepositInfo = (PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo) obj;
        reverseProtoWriter.getClass();
        pendingDirectDepositInfo.getClass();
        reverseProtoWriter.writeBytes(pendingDirectDepositInfo.unknownFields());
        PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 3, pendingDirectDepositInfo.half_sheet);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, pendingDirectDepositInfo.button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, pendingDirectDepositInfo.secondary_button_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo pendingDirectDepositInfo = (PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo) obj;
        pendingDirectDepositInfo.getClass();
        int size$okio = pendingDirectDepositInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet.ADAPTER.encodedSizeWithTag(3, pendingDirectDepositInfo.half_sheet) + protoAdapter.encodedSizeWithTag(2, pendingDirectDepositInfo.button_text) + protoAdapter.encodedSizeWithTag(1, pendingDirectDepositInfo.secondary_button_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo pendingDirectDepositInfo = (PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo) obj;
        pendingDirectDepositInfo.getClass();
        LocalizedString localizedString = pendingDirectDepositInfo.secondary_button_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = pendingDirectDepositInfo.button_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet halfSheet = pendingDirectDepositInfo.half_sheet;
        PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet halfSheet2 = halfSheet != null ? (PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet) PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet.ADAPTER.redact(halfSheet) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo(localizedString2, localizedString4, halfSheet2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo pendingDirectDepositInfo = (PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo) obj;
        pendingDirectDepositInfo.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, pendingDirectDepositInfo.secondary_button_text);
        protoAdapter.encodeWithTag(protoWriter, 2, pendingDirectDepositInfo.button_text);
        PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet.ADAPTER.encodeWithTag(protoWriter, 3, pendingDirectDepositInfo.half_sheet);
        protoWriter.writeBytes(pendingDirectDepositInfo.unknownFields());
    }
}
