package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class TimeBoundedPaychecksAggregation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TimeBoundedPaychecksAggregation((String) obj, (Long) obj2, (Long) obj3, m, arrayList, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    m.add(Employer.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    arrayList.add(Deduction.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    arrayList2.add(RealizedAllocationAmount.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation = (TimeBoundedPaychecksAggregation) obj;
        reverseProtoWriter.getClass();
        timeBoundedPaychecksAggregation.getClass();
        reverseProtoWriter.writeBytes(timeBoundedPaychecksAggregation.unknownFields());
        RealizedAllocationAmount.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, timeBoundedPaychecksAggregation.realized_allocation_amounts);
        Deduction.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, timeBoundedPaychecksAggregation.deductions);
        Employer.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, timeBoundedPaychecksAggregation.employers);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, timeBoundedPaychecksAggregation.end_date);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, timeBoundedPaychecksAggregation.start_date);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, timeBoundedPaychecksAggregation.time_bounded_paychecks_aggregation_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation = (TimeBoundedPaychecksAggregation) obj;
        timeBoundedPaychecksAggregation.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, timeBoundedPaychecksAggregation.time_bounded_paychecks_aggregation_token) + timeBoundedPaychecksAggregation.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return RealizedAllocationAmount.ADAPTER.asRepeated().encodedSizeWithTag(6, timeBoundedPaychecksAggregation.realized_allocation_amounts) + Deduction.ADAPTER.asRepeated().encodedSizeWithTag(5, timeBoundedPaychecksAggregation.deductions) + Employer.ADAPTER.asRepeated().encodedSizeWithTag(4, timeBoundedPaychecksAggregation.employers) + protoAdapter.encodedSizeWithTag(3, timeBoundedPaychecksAggregation.end_date) + protoAdapter.encodedSizeWithTag(2, timeBoundedPaychecksAggregation.start_date) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation = (TimeBoundedPaychecksAggregation) obj;
        timeBoundedPaychecksAggregation.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(timeBoundedPaychecksAggregation.employers, Employer.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(timeBoundedPaychecksAggregation.deductions, Deduction.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(timeBoundedPaychecksAggregation.realized_allocation_amounts, RealizedAllocationAmount.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = timeBoundedPaychecksAggregation.time_bounded_paychecks_aggregation_token;
        Long l = timeBoundedPaychecksAggregation.start_date;
        Long l2 = timeBoundedPaychecksAggregation.end_date;
        byteString.getClass();
        return new TimeBoundedPaychecksAggregation(str, l, l2, m1169redactElements, m1169redactElements2, m1169redactElements3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation = (TimeBoundedPaychecksAggregation) obj;
        timeBoundedPaychecksAggregation.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, timeBoundedPaychecksAggregation.time_bounded_paychecks_aggregation_token);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, timeBoundedPaychecksAggregation.start_date);
        protoAdapter.encodeWithTag(protoWriter, 3, timeBoundedPaychecksAggregation.end_date);
        Employer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, timeBoundedPaychecksAggregation.employers);
        Deduction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, timeBoundedPaychecksAggregation.deductions);
        RealizedAllocationAmount.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, timeBoundedPaychecksAggregation.realized_allocation_amounts);
        protoWriter.writeBytes(timeBoundedPaychecksAggregation.unknownFields());
    }
}
