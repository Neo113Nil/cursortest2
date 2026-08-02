package squareup.cash.bankingbenefits.ui;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class VersionedCashGreen$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VersionedCashGreen((CashGreenV1) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CashGreenV1.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VersionedCashGreen versionedCashGreen = (VersionedCashGreen) obj;
        reverseProtoWriter.getClass();
        versionedCashGreen.getClass();
        reverseProtoWriter.writeBytes(versionedCashGreen.unknownFields());
        CashGreenV1.ADAPTER.encodeWithTag(reverseProtoWriter, 1, versionedCashGreen.cash_green_v1);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VersionedCashGreen versionedCashGreen = (VersionedCashGreen) obj;
        versionedCashGreen.getClass();
        return CashGreenV1.ADAPTER.encodedSizeWithTag(1, versionedCashGreen.cash_green_v1) + versionedCashGreen.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VersionedCashGreen versionedCashGreen = (VersionedCashGreen) obj;
        versionedCashGreen.getClass();
        CashGreenV1 cashGreenV1 = versionedCashGreen.cash_green_v1;
        CashGreenV1 cashGreenV12 = cashGreenV1 != null ? (CashGreenV1) CashGreenV1.ADAPTER.redact(cashGreenV1) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new VersionedCashGreen(cashGreenV12, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VersionedCashGreen versionedCashGreen = (VersionedCashGreen) obj;
        versionedCashGreen.getClass();
        CashGreenV1.ADAPTER.encodeWithTag(protoWriter, 1, versionedCashGreen.cash_green_v1);
        protoWriter.writeBytes(versionedCashGreen.unknownFields());
    }
}
