package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.BenefitsDetails;

/* loaded from: classes10.dex */
public final class BenefitsDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsDetails((BenefitsDetails.MoneyTabSection) obj, (BenefitsDetails.InsightsSection) obj2, (BenefitsDetails.PaychecksSection) obj3, (BenefitsDetails.State) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BenefitsDetails.MoneyTabSection.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(BenefitsDetails.InsightsSection.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(BenefitsDetails.PaychecksSection.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = BenefitsDetails.State.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsDetails benefitsDetails = (BenefitsDetails) obj;
        reverseProtoWriter.getClass();
        benefitsDetails.getClass();
        reverseProtoWriter.writeBytes(benefitsDetails.unknownFields());
        BenefitsDetails.State.ADAPTER.encodeWithTag(reverseProtoWriter, 4, benefitsDetails.state);
        BenefitsDetails.PaychecksSection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, benefitsDetails.paychecks_section);
        BenefitsDetails.InsightsSection.ADAPTER.encodeWithTag(reverseProtoWriter, 2, benefitsDetails.insights_section);
        BenefitsDetails.MoneyTabSection.ADAPTER.encodeWithTag(reverseProtoWriter, 1, benefitsDetails.money_tab_section);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsDetails benefitsDetails = (BenefitsDetails) obj;
        benefitsDetails.getClass();
        return BenefitsDetails.State.ADAPTER.encodedSizeWithTag(4, benefitsDetails.state) + BenefitsDetails.PaychecksSection.ADAPTER.encodedSizeWithTag(3, benefitsDetails.paychecks_section) + BenefitsDetails.InsightsSection.ADAPTER.encodedSizeWithTag(2, benefitsDetails.insights_section) + BenefitsDetails.MoneyTabSection.ADAPTER.encodedSizeWithTag(1, benefitsDetails.money_tab_section) + benefitsDetails.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsDetails benefitsDetails = (BenefitsDetails) obj;
        benefitsDetails.getClass();
        BenefitsDetails.MoneyTabSection moneyTabSection = benefitsDetails.money_tab_section;
        BenefitsDetails.MoneyTabSection moneyTabSection2 = moneyTabSection != null ? (BenefitsDetails.MoneyTabSection) BenefitsDetails.MoneyTabSection.ADAPTER.redact(moneyTabSection) : null;
        BenefitsDetails.InsightsSection insightsSection = benefitsDetails.insights_section;
        BenefitsDetails.InsightsSection insightsSection2 = insightsSection != null ? (BenefitsDetails.InsightsSection) BenefitsDetails.InsightsSection.ADAPTER.redact(insightsSection) : null;
        BenefitsDetails.PaychecksSection paychecksSection = benefitsDetails.paychecks_section;
        BenefitsDetails.PaychecksSection paychecksSection2 = paychecksSection != null ? (BenefitsDetails.PaychecksSection) BenefitsDetails.PaychecksSection.ADAPTER.redact(paychecksSection) : null;
        ByteString byteString = ByteString.EMPTY;
        BenefitsDetails.State state = benefitsDetails.state;
        byteString.getClass();
        return new BenefitsDetails(moneyTabSection2, insightsSection2, paychecksSection2, state, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsDetails benefitsDetails = (BenefitsDetails) obj;
        benefitsDetails.getClass();
        BenefitsDetails.MoneyTabSection.ADAPTER.encodeWithTag(protoWriter, 1, benefitsDetails.money_tab_section);
        BenefitsDetails.InsightsSection.ADAPTER.encodeWithTag(protoWriter, 2, benefitsDetails.insights_section);
        BenefitsDetails.PaychecksSection.ADAPTER.encodeWithTag(protoWriter, 3, benefitsDetails.paychecks_section);
        BenefitsDetails.State.ADAPTER.encodeWithTag(protoWriter, 4, benefitsDetails.state);
        protoWriter.writeBytes(benefitsDetails.unknownFields());
    }
}
