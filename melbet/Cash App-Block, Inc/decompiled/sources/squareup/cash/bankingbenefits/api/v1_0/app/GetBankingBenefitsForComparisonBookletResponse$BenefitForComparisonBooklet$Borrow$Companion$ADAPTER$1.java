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
public final class GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Borrow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow((Money) obj, (Money) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow borrow = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow) obj;
        reverseProtoWriter.getClass();
        borrow.getClass();
        reverseProtoWriter.writeBytes(borrow.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, borrow.maximum_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, borrow.minimum_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow borrow = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow) obj;
        borrow.getClass();
        int size$okio = borrow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, borrow.maximum_amount) + protoAdapter.encodedSizeWithTag(1, borrow.minimum_amount) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow borrow = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow) obj;
        borrow.getClass();
        Money money = borrow.minimum_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = borrow.maximum_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow(money2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow borrow = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow) obj;
        borrow.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, borrow.minimum_amount);
        protoAdapter.encodeWithTag(protoWriter, 2, borrow.maximum_amount);
        protoWriter.writeBytes(borrow.unknownFields());
    }
}
