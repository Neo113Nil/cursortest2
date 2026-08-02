package squareup.cash.bills;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.bills.BillsConfig;

/* loaded from: classes10.dex */
public final class BillsConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BillsConfig((BillsConfig.ClientRoute) obj, (BillsConfig.HalfApplet) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BillsConfig.ClientRoute.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(BillsConfig.HalfApplet.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BillsConfig billsConfig = (BillsConfig) obj;
        reverseProtoWriter.getClass();
        billsConfig.getClass();
        reverseProtoWriter.writeBytes(billsConfig.unknownFields());
        BillsConfig.HalfApplet.ADAPTER.encodeWithTag(reverseProtoWriter, 2, billsConfig.half_applet_content);
        BillsConfig.ClientRoute.ADAPTER.encodeWithTag(reverseProtoWriter, 1, billsConfig.bills_applet_default_action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BillsConfig billsConfig = (BillsConfig) obj;
        billsConfig.getClass();
        return BillsConfig.HalfApplet.ADAPTER.encodedSizeWithTag(2, billsConfig.half_applet_content) + BillsConfig.ClientRoute.ADAPTER.encodedSizeWithTag(1, billsConfig.bills_applet_default_action) + billsConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BillsConfig billsConfig = (BillsConfig) obj;
        billsConfig.getClass();
        BillsConfig.ClientRoute clientRoute = billsConfig.bills_applet_default_action;
        BillsConfig.ClientRoute clientRoute2 = clientRoute != null ? (BillsConfig.ClientRoute) BillsConfig.ClientRoute.ADAPTER.redact(clientRoute) : null;
        BillsConfig.HalfApplet halfApplet = billsConfig.half_applet_content;
        BillsConfig.HalfApplet halfApplet2 = halfApplet != null ? (BillsConfig.HalfApplet) BillsConfig.HalfApplet.ADAPTER.redact(halfApplet) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BillsConfig(clientRoute2, halfApplet2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BillsConfig billsConfig = (BillsConfig) obj;
        billsConfig.getClass();
        BillsConfig.ClientRoute.ADAPTER.encodeWithTag(protoWriter, 1, billsConfig.bills_applet_default_action);
        BillsConfig.HalfApplet.ADAPTER.encodeWithTag(protoWriter, 2, billsConfig.half_applet_content);
        protoWriter.writeBytes(billsConfig.unknownFields());
    }
}
