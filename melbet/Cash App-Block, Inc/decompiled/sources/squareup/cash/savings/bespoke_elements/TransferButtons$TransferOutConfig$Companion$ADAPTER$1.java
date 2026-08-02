package squareup.cash.savings.bespoke_elements;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.savings.bespoke_elements.TransferButtons;

/* loaded from: classes10.dex */
public final class TransferButtons$TransferOutConfig$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new TransferButtons.TransferOutConfig((CdfEvent) obj, (Money) obj2, (TransferButtons.AlternativeButtonBehavior) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = TransferButtons.AlternativeButtonBehavior.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TransferButtons.TransferOutConfig transferOutConfig = (TransferButtons.TransferOutConfig) obj;
        reverseProtoWriter.getClass();
        transferOutConfig.getClass();
        reverseProtoWriter.writeBytes(transferOutConfig.unknownFields());
        TransferButtons.AlternativeButtonBehavior.ADAPTER.encodeWithTag(reverseProtoWriter, 3, transferOutConfig.zero_balance_behavior);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, transferOutConfig.minimum_amount);
        CdfEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, transferOutConfig.cdfEvent);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TransferButtons.TransferOutConfig transferOutConfig = (TransferButtons.TransferOutConfig) obj;
        transferOutConfig.getClass();
        return TransferButtons.AlternativeButtonBehavior.ADAPTER.encodedSizeWithTag(3, transferOutConfig.zero_balance_behavior) + Money.ADAPTER.encodedSizeWithTag(2, transferOutConfig.minimum_amount) + CdfEvent.ADAPTER.encodedSizeWithTag(1, transferOutConfig.cdfEvent) + transferOutConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TransferButtons.TransferOutConfig transferOutConfig = (TransferButtons.TransferOutConfig) obj;
        transferOutConfig.getClass();
        CdfEvent cdfEvent = transferOutConfig.cdfEvent;
        CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
        Money money = transferOutConfig.minimum_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        TransferButtons.AlternativeButtonBehavior alternativeButtonBehavior = transferOutConfig.zero_balance_behavior;
        byteString.getClass();
        return new TransferButtons.TransferOutConfig(cdfEvent2, money2, alternativeButtonBehavior, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TransferButtons.TransferOutConfig transferOutConfig = (TransferButtons.TransferOutConfig) obj;
        transferOutConfig.getClass();
        CdfEvent.ADAPTER.encodeWithTag(protoWriter, 1, transferOutConfig.cdfEvent);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, transferOutConfig.minimum_amount);
        TransferButtons.AlternativeButtonBehavior.ADAPTER.encodeWithTag(protoWriter, 3, transferOutConfig.zero_balance_behavior);
        protoWriter.writeBytes(transferOutConfig.unknownFields());
    }
}
