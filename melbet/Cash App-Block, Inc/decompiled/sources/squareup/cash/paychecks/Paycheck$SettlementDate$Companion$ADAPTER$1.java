package squareup.cash.paychecks;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.Paycheck;

/* loaded from: classes10.dex */
public final class Paycheck$SettlementDate$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Paycheck.SettlementDate((Paycheck.SettlementDate.Type) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Paycheck.SettlementDate.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Paycheck.SettlementDate settlementDate = (Paycheck.SettlementDate) obj;
        reverseProtoWriter.getClass();
        settlementDate.getClass();
        reverseProtoWriter.writeBytes(settlementDate.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, settlementDate.date);
        Paycheck.SettlementDate.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, settlementDate.f1639type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Paycheck.SettlementDate settlementDate = (Paycheck.SettlementDate) obj;
        settlementDate.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, settlementDate.date) + Paycheck.SettlementDate.Type.ADAPTER.encodedSizeWithTag(1, settlementDate.f1639type) + settlementDate.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Paycheck.SettlementDate settlementDate = (Paycheck.SettlementDate) obj;
        settlementDate.getClass();
        ByteString byteString = ByteString.EMPTY;
        Paycheck.SettlementDate.Type type2 = settlementDate.f1639type;
        Long l = settlementDate.date;
        byteString.getClass();
        return new Paycheck.SettlementDate(type2, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Paycheck.SettlementDate settlementDate = (Paycheck.SettlementDate) obj;
        settlementDate.getClass();
        Paycheck.SettlementDate.Type.ADAPTER.encodeWithTag(protoWriter, 1, settlementDate.f1639type);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, settlementDate.date);
        protoWriter.writeBytes(settlementDate.unknownFields());
    }
}
