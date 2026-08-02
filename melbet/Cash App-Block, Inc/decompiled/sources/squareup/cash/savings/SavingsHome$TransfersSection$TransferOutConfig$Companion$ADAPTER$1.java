package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.SavingsHome;

/* loaded from: classes10.dex */
public final class SavingsHome$TransfersSection$TransferOutConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsHome.TransfersSection.TransferOutConfig((Money) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsHome.TransfersSection.TransferOutConfig transferOutConfig = (SavingsHome.TransfersSection.TransferOutConfig) obj;
        reverseProtoWriter.getClass();
        transferOutConfig.getClass();
        reverseProtoWriter.writeBytes(transferOutConfig.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, transferOutConfig.minimum_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsHome.TransfersSection.TransferOutConfig transferOutConfig = (SavingsHome.TransfersSection.TransferOutConfig) obj;
        transferOutConfig.getClass();
        return Money.ADAPTER.encodedSizeWithTag(1, transferOutConfig.minimum_amount) + transferOutConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsHome.TransfersSection.TransferOutConfig transferOutConfig = (SavingsHome.TransfersSection.TransferOutConfig) obj;
        transferOutConfig.getClass();
        Money money = transferOutConfig.minimum_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SavingsHome.TransfersSection.TransferOutConfig(money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsHome.TransfersSection.TransferOutConfig transferOutConfig = (SavingsHome.TransfersSection.TransferOutConfig) obj;
        transferOutConfig.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, transferOutConfig.minimum_amount);
        protoWriter.writeBytes(transferOutConfig.unknownFields());
    }
}
