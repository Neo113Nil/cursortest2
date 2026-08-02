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
public final class GreenBenefitsV1$Benefit$PaperMoneyDepositBenefit$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit((Money) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit paperMoneyDepositBenefit = (GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit) obj;
        reverseProtoWriter.getClass();
        paperMoneyDepositBenefit.getClass();
        reverseProtoWriter.writeBytes(paperMoneyDepositBenefit.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, paperMoneyDepositBenefit.fees);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit paperMoneyDepositBenefit = (GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit) obj;
        paperMoneyDepositBenefit.getClass();
        return Money.ADAPTER.encodedSizeWithTag(1, paperMoneyDepositBenefit.fees) + paperMoneyDepositBenefit.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit paperMoneyDepositBenefit = (GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit) obj;
        paperMoneyDepositBenefit.getClass();
        Money money = paperMoneyDepositBenefit.fees;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit(money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit paperMoneyDepositBenefit = (GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit) obj;
        paperMoneyDepositBenefit.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, paperMoneyDepositBenefit.fees);
        protoWriter.writeBytes(paperMoneyDepositBenefit.unknownFields());
    }
}
