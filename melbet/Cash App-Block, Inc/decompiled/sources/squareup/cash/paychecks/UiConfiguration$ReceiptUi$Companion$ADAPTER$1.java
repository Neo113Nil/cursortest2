package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.UiConfiguration;

/* loaded from: classes10.dex */
public final class UiConfiguration$ReceiptUi$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiConfiguration.ReceiptUi((AlertUi) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AlertUi.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiConfiguration.ReceiptUi receiptUi = (UiConfiguration.ReceiptUi) obj;
        reverseProtoWriter.getClass();
        receiptUi.getClass();
        reverseProtoWriter.writeBytes(receiptUi.unknownFields());
        AlertUi.ADAPTER.encodeWithTag(reverseProtoWriter, 1, receiptUi.remove_from_paychecks_alert);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiConfiguration.ReceiptUi receiptUi = (UiConfiguration.ReceiptUi) obj;
        receiptUi.getClass();
        return AlertUi.ADAPTER.encodedSizeWithTag(1, receiptUi.remove_from_paychecks_alert) + receiptUi.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiConfiguration.ReceiptUi receiptUi = (UiConfiguration.ReceiptUi) obj;
        receiptUi.getClass();
        AlertUi alertUi = receiptUi.remove_from_paychecks_alert;
        AlertUi alertUi2 = alertUi != null ? (AlertUi) AlertUi.ADAPTER.redact(alertUi) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiConfiguration.ReceiptUi(alertUi2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiConfiguration.ReceiptUi receiptUi = (UiConfiguration.ReceiptUi) obj;
        receiptUi.getClass();
        AlertUi.ADAPTER.encodeWithTag(protoWriter, 1, receiptUi.remove_from_paychecks_alert);
        protoWriter.writeBytes(receiptUi.unknownFields());
    }
}
