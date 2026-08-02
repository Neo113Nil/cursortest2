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
public final class GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$AtmFees$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees((Money) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees atmFees = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees) obj;
        reverseProtoWriter.getClass();
        atmFees.getClass();
        reverseProtoWriter.writeBytes(atmFees.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, atmFees.best_offer_label);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, atmFees.common_withdrawal_fee);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees atmFees = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees) obj;
        atmFees.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, atmFees.best_offer_label) + Money.ADAPTER.encodedSizeWithTag(1, atmFees.common_withdrawal_fee) + atmFees.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees atmFees = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees) obj;
        atmFees.getClass();
        Money money = atmFees.common_withdrawal_fee;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = atmFees.best_offer_label;
        byteString.getClass();
        return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees(money2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees atmFees = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees) obj;
        atmFees.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, atmFees.common_withdrawal_fee);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, atmFees.best_offer_label);
        protoWriter.writeBytes(atmFees.unknownFields());
    }
}
