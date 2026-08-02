package squareup.cash.bankingbenefits.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class RiskStatus$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RiskStatus((Integer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RiskStatus riskStatus = (RiskStatus) obj;
        reverseProtoWriter.getClass();
        riskStatus.getClass();
        reverseProtoWriter.writeBytes(riskStatus.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, riskStatus.days_remaining);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RiskStatus riskStatus = (RiskStatus) obj;
        riskStatus.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(1, riskStatus.days_remaining) + riskStatus.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RiskStatus riskStatus = (RiskStatus) obj;
        riskStatus.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = riskStatus.days_remaining;
        byteString.getClass();
        return new RiskStatus(num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RiskStatus riskStatus = (RiskStatus) obj;
        riskStatus.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, riskStatus.days_remaining);
        protoWriter.writeBytes(riskStatus.unknownFields());
    }
}
