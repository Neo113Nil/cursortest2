package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.paychecks.Paycheck;

/* loaded from: classes10.dex */
public final class Paycheck$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Paycheck((String) obj, (Paycheck.SettlementDate) obj2, (Employer) obj3, (AllocationDistribution) obj4, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Paycheck.SettlementDate.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Employer.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(AllocationDistribution.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    m.add(Deduction.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    arrayList.add(RealizedAllocationAmount.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Paycheck paycheck = (Paycheck) obj;
        reverseProtoWriter.getClass();
        paycheck.getClass();
        reverseProtoWriter.writeBytes(paycheck.unknownFields());
        RealizedAllocationAmount.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, paycheck.realized_allocation_amounts);
        Deduction.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, paycheck.deductions);
        AllocationDistribution.ADAPTER.encodeWithTag(reverseProtoWriter, 4, paycheck.allocation_distribution);
        Employer.ADAPTER.encodeWithTag(reverseProtoWriter, 3, paycheck.employer);
        Paycheck.SettlementDate.ADAPTER.encodeWithTag(reverseProtoWriter, 2, paycheck.settlement_date);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, paycheck.paycheck_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Paycheck paycheck = (Paycheck) obj;
        paycheck.getClass();
        return RealizedAllocationAmount.ADAPTER.asRepeated().encodedSizeWithTag(6, paycheck.realized_allocation_amounts) + Deduction.ADAPTER.asRepeated().encodedSizeWithTag(5, paycheck.deductions) + AllocationDistribution.ADAPTER.encodedSizeWithTag(4, paycheck.allocation_distribution) + Employer.ADAPTER.encodedSizeWithTag(3, paycheck.employer) + Paycheck.SettlementDate.ADAPTER.encodedSizeWithTag(2, paycheck.settlement_date) + ProtoAdapter.STRING.encodedSizeWithTag(1, paycheck.paycheck_token) + paycheck.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Paycheck paycheck = (Paycheck) obj;
        paycheck.getClass();
        Paycheck.SettlementDate settlementDate = paycheck.settlement_date;
        Paycheck.SettlementDate settlementDate2 = settlementDate != null ? (Paycheck.SettlementDate) Paycheck.SettlementDate.ADAPTER.redact(settlementDate) : null;
        Employer employer = paycheck.employer;
        Employer employer2 = employer != null ? (Employer) Employer.ADAPTER.redact(employer) : null;
        AllocationDistribution allocationDistribution = paycheck.allocation_distribution;
        AllocationDistribution allocationDistribution2 = allocationDistribution != null ? (AllocationDistribution) AllocationDistribution.ADAPTER.redact(allocationDistribution) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(paycheck.deductions, Deduction.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(paycheck.realized_allocation_amounts, RealizedAllocationAmount.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = paycheck.paycheck_token;
        byteString.getClass();
        return new Paycheck(str, settlementDate2, employer2, allocationDistribution2, m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Paycheck paycheck = (Paycheck) obj;
        paycheck.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, paycheck.paycheck_token);
        Paycheck.SettlementDate.ADAPTER.encodeWithTag(protoWriter, 2, paycheck.settlement_date);
        Employer.ADAPTER.encodeWithTag(protoWriter, 3, paycheck.employer);
        AllocationDistribution.ADAPTER.encodeWithTag(protoWriter, 4, paycheck.allocation_distribution);
        Deduction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, paycheck.deductions);
        RealizedAllocationAmount.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, paycheck.realized_allocation_amounts);
        protoWriter.writeBytes(paycheck.unknownFields());
    }
}
