package squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;

/* loaded from: classes10.dex */
public final class GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$SavingsYield$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield((Float) obj, (Float) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.FLOAT.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.FLOAT.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield savingsYield = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield) obj;
        reverseProtoWriter.getClass();
        savingsYield.getClass();
        reverseProtoWriter.writeBytes(savingsYield.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.FLOAT;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, savingsYield.maximum_interest_percent);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, savingsYield.minimum_interest_percent);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield savingsYield = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield) obj;
        savingsYield.getClass();
        int size$okio = savingsYield.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.FLOAT;
        return protoAdapter.encodedSizeWithTag(2, savingsYield.maximum_interest_percent) + protoAdapter.encodedSizeWithTag(1, savingsYield.minimum_interest_percent) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield savingsYield = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield) obj;
        savingsYield.getClass();
        ByteString byteString = ByteString.EMPTY;
        Float f = savingsYield.minimum_interest_percent;
        Float f2 = savingsYield.maximum_interest_percent;
        byteString.getClass();
        return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield(f, f2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield savingsYield = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield) obj;
        savingsYield.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.FLOAT;
        protoAdapter.encodeWithTag(protoWriter, 1, savingsYield.minimum_interest_percent);
        protoAdapter.encodeWithTag(protoWriter, 2, savingsYield.maximum_interest_percent);
        protoWriter.writeBytes(savingsYield.unknownFields());
    }
}
