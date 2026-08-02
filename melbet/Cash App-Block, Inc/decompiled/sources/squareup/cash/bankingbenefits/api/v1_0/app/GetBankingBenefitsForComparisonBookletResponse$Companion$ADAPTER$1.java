package squareup.cash.bankingbenefits.api.v1_0.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;

/* loaded from: classes10.dex */
public final class GetBankingBenefitsForComparisonBookletResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBankingBenefitsForComparisonBookletResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse getBankingBenefitsForComparisonBookletResponse = (GetBankingBenefitsForComparisonBookletResponse) obj;
        reverseProtoWriter.getClass();
        getBankingBenefitsForComparisonBookletResponse.getClass();
        reverseProtoWriter.writeBytes(getBankingBenefitsForComparisonBookletResponse.unknownFields());
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getBankingBenefitsForComparisonBookletResponse.benefits);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse getBankingBenefitsForComparisonBookletResponse = (GetBankingBenefitsForComparisonBookletResponse) obj;
        getBankingBenefitsForComparisonBookletResponse.getClass();
        return GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.ADAPTER.asRepeated().encodedSizeWithTag(1, getBankingBenefitsForComparisonBookletResponse.benefits) + getBankingBenefitsForComparisonBookletResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse getBankingBenefitsForComparisonBookletResponse = (GetBankingBenefitsForComparisonBookletResponse) obj;
        getBankingBenefitsForComparisonBookletResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getBankingBenefitsForComparisonBookletResponse.benefits, GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetBankingBenefitsForComparisonBookletResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse getBankingBenefitsForComparisonBookletResponse = (GetBankingBenefitsForComparisonBookletResponse) obj;
        getBankingBenefitsForComparisonBookletResponse.getClass();
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getBankingBenefitsForComparisonBookletResponse.benefits);
        protoWriter.writeBytes(getBankingBenefitsForComparisonBookletResponse.unknownFields());
    }
}
