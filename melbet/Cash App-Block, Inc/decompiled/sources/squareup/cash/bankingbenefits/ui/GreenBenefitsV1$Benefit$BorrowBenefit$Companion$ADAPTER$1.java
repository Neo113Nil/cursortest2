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
public final class GreenBenefitsV1$Benefit$BorrowBenefit$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GreenBenefitsV1.Benefit.BorrowBenefit((Money) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GreenBenefitsV1.Benefit.BorrowBenefit borrowBenefit = (GreenBenefitsV1.Benefit.BorrowBenefit) obj;
        reverseProtoWriter.getClass();
        borrowBenefit.getClass();
        reverseProtoWriter.writeBytes(borrowBenefit.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, borrowBenefit.higher_borrow_limit_enabled);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, borrowBenefit.limit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GreenBenefitsV1.Benefit.BorrowBenefit borrowBenefit = (GreenBenefitsV1.Benefit.BorrowBenefit) obj;
        borrowBenefit.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, borrowBenefit.higher_borrow_limit_enabled) + Money.ADAPTER.encodedSizeWithTag(1, borrowBenefit.limit) + borrowBenefit.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GreenBenefitsV1.Benefit.BorrowBenefit borrowBenefit = (GreenBenefitsV1.Benefit.BorrowBenefit) obj;
        borrowBenefit.getClass();
        Money money = borrowBenefit.limit;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = borrowBenefit.higher_borrow_limit_enabled;
        byteString.getClass();
        return new GreenBenefitsV1.Benefit.BorrowBenefit(money2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GreenBenefitsV1.Benefit.BorrowBenefit borrowBenefit = (GreenBenefitsV1.Benefit.BorrowBenefit) obj;
        borrowBenefit.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, borrowBenefit.limit);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, borrowBenefit.higher_borrow_limit_enabled);
        protoWriter.writeBytes(borrowBenefit.unknownFields());
    }
}
