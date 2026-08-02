package squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;

/* loaded from: classes10.dex */
public final class GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$PhoneSupport$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport phoneSupport = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport) obj;
        reverseProtoWriter.getClass();
        phoneSupport.getClass();
        reverseProtoWriter.writeBytes(phoneSupport.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, phoneSupport.best_offer_label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport phoneSupport = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport) obj;
        phoneSupport.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, phoneSupport.best_offer_label) + phoneSupport.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport phoneSupport = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport) obj;
        phoneSupport.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = phoneSupport.best_offer_label;
        byteString.getClass();
        return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport phoneSupport = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport) obj;
        phoneSupport.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, phoneSupport.best_offer_label);
        protoWriter.writeBytes(phoneSupport.unknownFields());
    }
}
