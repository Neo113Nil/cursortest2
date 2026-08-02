package squareup.cash.savings;

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
import squareup.cash.savings.SavingsHome;

/* loaded from: classes10.dex */
public final class SavingsHome$TransfersSection$AddCashConfig$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SavingsHome.TransfersSection.AddCashConfig(m, (Money) obj, (Money) obj2, (Money) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Money.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsHome.TransfersSection.AddCashConfig addCashConfig = (SavingsHome.TransfersSection.AddCashConfig) obj;
        reverseProtoWriter.getClass();
        addCashConfig.getClass();
        reverseProtoWriter.writeBytes(addCashConfig.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, addCashConfig.maximum_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, addCashConfig.minimum_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, addCashConfig.initially_selected_amount);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, addCashConfig.quick_amounts);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsHome.TransfersSection.AddCashConfig addCashConfig = (SavingsHome.TransfersSection.AddCashConfig) obj;
        addCashConfig.getClass();
        int size$okio = addCashConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, addCashConfig.maximum_amount) + protoAdapter.encodedSizeWithTag(3, addCashConfig.minimum_amount) + protoAdapter.encodedSizeWithTag(2, addCashConfig.initially_selected_amount) + protoAdapter.asRepeated().encodedSizeWithTag(1, addCashConfig.quick_amounts) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsHome.TransfersSection.AddCashConfig addCashConfig = (SavingsHome.TransfersSection.AddCashConfig) obj;
        addCashConfig.getClass();
        List list = addCashConfig.quick_amounts;
        ProtoAdapter protoAdapter = Money.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        Money money = addCashConfig.initially_selected_amount;
        Money money2 = money != null ? (Money) protoAdapter.redact(money) : null;
        Money money3 = addCashConfig.minimum_amount;
        Money money4 = money3 != null ? (Money) protoAdapter.redact(money3) : null;
        Money money5 = addCashConfig.maximum_amount;
        Money money6 = money5 != null ? (Money) protoAdapter.redact(money5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SavingsHome.TransfersSection.AddCashConfig(m1169redactElements, money2, money4, money6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsHome.TransfersSection.AddCashConfig addCashConfig = (SavingsHome.TransfersSection.AddCashConfig) obj;
        addCashConfig.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, addCashConfig.quick_amounts);
        protoAdapter.encodeWithTag(protoWriter, 2, addCashConfig.initially_selected_amount);
        protoAdapter.encodeWithTag(protoWriter, 3, addCashConfig.minimum_amount);
        protoAdapter.encodeWithTag(protoWriter, 4, addCashConfig.maximum_amount);
        protoWriter.writeBytes(addCashConfig.unknownFields());
    }
}
