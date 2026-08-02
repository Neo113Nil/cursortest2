package squareup.cash.bankingbenefits.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes10.dex */
public final class GreenBenefitsV1$Benefit$OverdraftBenefit$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GreenBenefitsV1.Benefit.OverdraftBenefit((Money) obj, (Boolean) obj2, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GreenBenefitsV1.Benefit.OverdraftBenefit overdraftBenefit = (GreenBenefitsV1.Benefit.OverdraftBenefit) obj;
        reverseProtoWriter.getClass();
        overdraftBenefit.getClass();
        reverseProtoWriter.writeBytes(overdraftBenefit.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, overdraftBenefit.disclosure);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, overdraftBenefit.requires_disclosure);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, overdraftBenefit.limit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GreenBenefitsV1.Benefit.OverdraftBenefit overdraftBenefit = (GreenBenefitsV1.Benefit.OverdraftBenefit) obj;
        overdraftBenefit.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(3, overdraftBenefit.disclosure) + ProtoAdapter.BOOL.encodedSizeWithTag(2, overdraftBenefit.requires_disclosure) + Money.ADAPTER.encodedSizeWithTag(1, overdraftBenefit.limit) + overdraftBenefit.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GreenBenefitsV1.Benefit.OverdraftBenefit overdraftBenefit = (GreenBenefitsV1.Benefit.OverdraftBenefit) obj;
        overdraftBenefit.getClass();
        Money money = overdraftBenefit.limit;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        LocalizedString localizedString = overdraftBenefit.disclosure;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = overdraftBenefit.requires_disclosure;
        byteString.getClass();
        return new GreenBenefitsV1.Benefit.OverdraftBenefit(money2, bool, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GreenBenefitsV1.Benefit.OverdraftBenefit overdraftBenefit = (GreenBenefitsV1.Benefit.OverdraftBenefit) obj;
        overdraftBenefit.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, overdraftBenefit.limit);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, overdraftBenefit.requires_disclosure);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, overdraftBenefit.disclosure);
        protoWriter.writeBytes(overdraftBenefit.unknownFields());
    }
}
