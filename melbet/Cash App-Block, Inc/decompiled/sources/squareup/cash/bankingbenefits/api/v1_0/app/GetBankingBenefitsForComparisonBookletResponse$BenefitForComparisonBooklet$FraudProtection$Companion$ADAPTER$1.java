package squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;

/* loaded from: classes10.dex */
public final class GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$FraudProtection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection fraudProtection = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection) obj;
        reverseProtoWriter.getClass();
        fraudProtection.getClass();
        reverseProtoWriter.writeBytes(fraudProtection.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, fraudProtection.available);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection fraudProtection = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection) obj;
        fraudProtection.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, fraudProtection.available) + fraudProtection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection fraudProtection = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection) obj;
        fraudProtection.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = fraudProtection.available;
        byteString.getClass();
        return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection fraudProtection = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection) obj;
        fraudProtection.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, fraudProtection.available);
        protoWriter.writeBytes(fraudProtection.unknownFields());
    }
}
