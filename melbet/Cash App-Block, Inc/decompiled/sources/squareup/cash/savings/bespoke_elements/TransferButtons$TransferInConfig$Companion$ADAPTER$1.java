package squareup.cash.savings.bespoke_elements;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.savings.bespoke_elements.TransferButtons;

/* loaded from: classes10.dex */
public final class TransferButtons$TransferInConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TransferButtons.TransferInConfig((CdfEvent) obj, m, (Money) obj2, (Money) obj3, (Money) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(Money.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TransferButtons.TransferInConfig transferInConfig = (TransferButtons.TransferInConfig) obj;
        reverseProtoWriter.getClass();
        transferInConfig.getClass();
        reverseProtoWriter.writeBytes(transferInConfig.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, transferInConfig.maximum_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, transferInConfig.minimum_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, transferInConfig.initially_selected_amount);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, transferInConfig.quick_amounts);
        CdfEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, transferInConfig.cdfEvent);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TransferButtons.TransferInConfig transferInConfig = (TransferButtons.TransferInConfig) obj;
        transferInConfig.getClass();
        int encodedSizeWithTag = CdfEvent.ADAPTER.encodedSizeWithTag(1, transferInConfig.cdfEvent) + transferInConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, transferInConfig.maximum_amount) + protoAdapter.encodedSizeWithTag(4, transferInConfig.minimum_amount) + protoAdapter.encodedSizeWithTag(3, transferInConfig.initially_selected_amount) + protoAdapter.asRepeated().encodedSizeWithTag(2, transferInConfig.quick_amounts) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TransferButtons.TransferInConfig transferInConfig = (TransferButtons.TransferInConfig) obj;
        transferInConfig.getClass();
        CdfEvent cdfEvent = transferInConfig.cdfEvent;
        CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
        List list = transferInConfig.quick_amounts;
        ProtoAdapter protoAdapter = Money.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        Money money = transferInConfig.initially_selected_amount;
        Money money2 = money != null ? (Money) protoAdapter.redact(money) : null;
        Money money3 = transferInConfig.minimum_amount;
        Money money4 = money3 != null ? (Money) protoAdapter.redact(money3) : null;
        Money money5 = transferInConfig.maximum_amount;
        Money money6 = money5 != null ? (Money) protoAdapter.redact(money5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TransferButtons.TransferInConfig(cdfEvent2, m1169redactElements, money2, money4, money6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TransferButtons.TransferInConfig transferInConfig = (TransferButtons.TransferInConfig) obj;
        transferInConfig.getClass();
        CdfEvent.ADAPTER.encodeWithTag(protoWriter, 1, transferInConfig.cdfEvent);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, transferInConfig.quick_amounts);
        protoAdapter.encodeWithTag(protoWriter, 3, transferInConfig.initially_selected_amount);
        protoAdapter.encodeWithTag(protoWriter, 4, transferInConfig.minimum_amount);
        protoAdapter.encodeWithTag(protoWriter, 5, transferInConfig.maximum_amount);
        protoWriter.writeBytes(transferInConfig.unknownFields());
    }
}
