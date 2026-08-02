package squareup.cash.bankingbenefits.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.CashGreenV1;

/* loaded from: classes10.dex */
public final class CashGreenV1$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashGreenV1((CashGreenV1.Status) obj, (Long) obj2, m, (String) obj3, (CashGreenV1.StatusMethod) obj4, (RiskStatus) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = CashGreenV1.Status.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                    m.add(PathProgress.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    try {
                        obj4 = CashGreenV1.StatusMethod.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(RiskStatus.ADAPTER, protoReader, obj5);
                    break;
                case 7:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashGreenV1 cashGreenV1 = (CashGreenV1) obj;
        reverseProtoWriter.getClass();
        cashGreenV1.getClass();
        reverseProtoWriter.writeBytes(cashGreenV1.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, cashGreenV1.support_url);
        RiskStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 6, cashGreenV1.risk_status);
        CashGreenV1.StatusMethod.ADAPTER.encodeWithTag(reverseProtoWriter, 5, cashGreenV1.status_method);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cashGreenV1.client_route);
        PathProgress.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, cashGreenV1.path_progresses);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, cashGreenV1.expire_at);
        CashGreenV1.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cashGreenV1.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashGreenV1 cashGreenV1 = (CashGreenV1) obj;
        cashGreenV1.getClass();
        int encodedSizeWithTag = PathProgress.ADAPTER.asRepeated().encodedSizeWithTag(3, cashGreenV1.path_progresses) + ProtoAdapter.INT64.encodedSizeWithTag(2, cashGreenV1.expire_at) + CashGreenV1.Status.ADAPTER.encodedSizeWithTag(1, cashGreenV1.status) + cashGreenV1.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(7, cashGreenV1.support_url) + RiskStatus.ADAPTER.encodedSizeWithTag(6, cashGreenV1.risk_status) + CashGreenV1.StatusMethod.ADAPTER.encodedSizeWithTag(5, cashGreenV1.status_method) + protoAdapter.encodedSizeWithTag(4, cashGreenV1.client_route) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashGreenV1 cashGreenV1 = (CashGreenV1) obj;
        cashGreenV1.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cashGreenV1.path_progresses, PathProgress.ADAPTER);
        RiskStatus riskStatus = cashGreenV1.risk_status;
        RiskStatus riskStatus2 = riskStatus != null ? (RiskStatus) RiskStatus.ADAPTER.redact(riskStatus) : null;
        ByteString byteString = ByteString.EMPTY;
        CashGreenV1.Status status = cashGreenV1.status;
        Long l = cashGreenV1.expire_at;
        String str = cashGreenV1.client_route;
        CashGreenV1.StatusMethod statusMethod = cashGreenV1.status_method;
        String str2 = cashGreenV1.support_url;
        byteString.getClass();
        return new CashGreenV1(status, l, m1169redactElements, str, statusMethod, riskStatus2, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashGreenV1 cashGreenV1 = (CashGreenV1) obj;
        cashGreenV1.getClass();
        CashGreenV1.Status.ADAPTER.encodeWithTag(protoWriter, 1, cashGreenV1.status);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, cashGreenV1.expire_at);
        PathProgress.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, cashGreenV1.path_progresses);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, cashGreenV1.client_route);
        CashGreenV1.StatusMethod.ADAPTER.encodeWithTag(protoWriter, 5, cashGreenV1.status_method);
        RiskStatus.ADAPTER.encodeWithTag(protoWriter, 6, cashGreenV1.risk_status);
        protoAdapter.encodeWithTag(protoWriter, 7, cashGreenV1.support_url);
        protoWriter.writeBytes(cashGreenV1.unknownFields());
    }
}
