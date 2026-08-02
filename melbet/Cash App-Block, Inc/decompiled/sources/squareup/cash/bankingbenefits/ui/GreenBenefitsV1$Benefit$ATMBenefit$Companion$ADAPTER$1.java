package squareup.cash.bankingbenefits.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes10.dex */
public final class GreenBenefitsV1$Benefit$ATMBenefit$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GreenBenefitsV1.Benefit.ATMBenefit((Money) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GreenBenefitsV1.Benefit.ATMBenefit aTMBenefit = (GreenBenefitsV1.Benefit.ATMBenefit) obj;
        reverseProtoWriter.getClass();
        aTMBenefit.getClass();
        reverseProtoWriter.writeBytes(aTMBenefit.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, aTMBenefit.fees);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GreenBenefitsV1.Benefit.ATMBenefit aTMBenefit = (GreenBenefitsV1.Benefit.ATMBenefit) obj;
        aTMBenefit.getClass();
        return Money.ADAPTER.encodedSizeWithTag(1, aTMBenefit.fees) + aTMBenefit.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GreenBenefitsV1.Benefit.ATMBenefit aTMBenefit = (GreenBenefitsV1.Benefit.ATMBenefit) obj;
        aTMBenefit.getClass();
        Money money = aTMBenefit.fees;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GreenBenefitsV1.Benefit.ATMBenefit(money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GreenBenefitsV1.Benefit.ATMBenefit aTMBenefit = (GreenBenefitsV1.Benefit.ATMBenefit) obj;
        aTMBenefit.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, aTMBenefit.fees);
        protoWriter.writeBytes(aTMBenefit.unknownFields());
    }
}
