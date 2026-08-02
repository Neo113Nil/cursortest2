package squareup.cash.bankingbenefits.api.v1_0.app;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;

/* loaded from: classes10.dex */
public final class GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$PaperMoneyDeposit$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit((Money) obj, (Money) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit paperMoneyDeposit = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit) obj;
        reverseProtoWriter.getClass();
        paperMoneyDeposit.getClass();
        reverseProtoWriter.writeBytes(paperMoneyDeposit.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, paperMoneyDeposit.best_deposit_fee);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, paperMoneyDeposit.inactive_deposit_fee);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit paperMoneyDeposit = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit) obj;
        paperMoneyDeposit.getClass();
        int size$okio = paperMoneyDeposit.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, paperMoneyDeposit.best_deposit_fee) + protoAdapter.encodedSizeWithTag(1, paperMoneyDeposit.inactive_deposit_fee) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit paperMoneyDeposit = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit) obj;
        paperMoneyDeposit.getClass();
        Money money = paperMoneyDeposit.inactive_deposit_fee;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = paperMoneyDeposit.best_deposit_fee;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit(money2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit paperMoneyDeposit = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit) obj;
        paperMoneyDeposit.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, paperMoneyDeposit.inactive_deposit_fee);
        protoAdapter.encodeWithTag(protoWriter, 2, paperMoneyDeposit.best_deposit_fee);
        protoWriter.writeBytes(paperMoneyDeposit.unknownFields());
    }
}
