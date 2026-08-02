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
public final class GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Overdraft$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft((Money) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft overdraft = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft) obj;
        reverseProtoWriter.getClass();
        overdraft.getClass();
        reverseProtoWriter.writeBytes(overdraft.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, overdraft.maximum_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft overdraft = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft) obj;
        overdraft.getClass();
        return Money.ADAPTER.encodedSizeWithTag(2, overdraft.maximum_amount) + overdraft.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft overdraft = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft) obj;
        overdraft.getClass();
        Money money = overdraft.maximum_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft(money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft overdraft = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft) obj;
        overdraft.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 2, overdraft.maximum_amount);
        protoWriter.writeBytes(overdraft.unknownFields());
    }
}
