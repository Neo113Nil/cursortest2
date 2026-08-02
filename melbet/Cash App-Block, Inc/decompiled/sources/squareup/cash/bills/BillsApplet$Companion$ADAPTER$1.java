package squareup.cash.bills;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes10.dex */
public final class BillsApplet$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BillsApplet((BillsApplet.BillsAppletAction) obj, (BillsApplet.FullApplet) obj2, (BillsApplet.HalfApplet) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BillsApplet.BillsAppletAction.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(BillsApplet.FullApplet.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(BillsApplet.HalfApplet.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BillsApplet billsApplet = (BillsApplet) obj;
        reverseProtoWriter.getClass();
        billsApplet.getClass();
        reverseProtoWriter.writeBytes(billsApplet.unknownFields());
        BillsApplet.HalfApplet.ADAPTER.encodeWithTag(reverseProtoWriter, 3, billsApplet.half_applet);
        BillsApplet.FullApplet.ADAPTER.encodeWithTag(reverseProtoWriter, 2, billsApplet.full_applet);
        BillsApplet.BillsAppletAction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, billsApplet.action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BillsApplet billsApplet = (BillsApplet) obj;
        billsApplet.getClass();
        return BillsApplet.HalfApplet.ADAPTER.encodedSizeWithTag(3, billsApplet.half_applet) + BillsApplet.FullApplet.ADAPTER.encodedSizeWithTag(2, billsApplet.full_applet) + BillsApplet.BillsAppletAction.ADAPTER.encodedSizeWithTag(1, billsApplet.action) + billsApplet.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BillsApplet billsApplet = (BillsApplet) obj;
        billsApplet.getClass();
        BillsApplet.BillsAppletAction billsAppletAction = billsApplet.action;
        BillsApplet.BillsAppletAction billsAppletAction2 = billsAppletAction != null ? (BillsApplet.BillsAppletAction) BillsApplet.BillsAppletAction.ADAPTER.redact(billsAppletAction) : null;
        BillsApplet.FullApplet fullApplet = billsApplet.full_applet;
        BillsApplet.FullApplet fullApplet2 = fullApplet != null ? (BillsApplet.FullApplet) BillsApplet.FullApplet.ADAPTER.redact(fullApplet) : null;
        BillsApplet.HalfApplet halfApplet = billsApplet.half_applet;
        BillsApplet.HalfApplet halfApplet2 = halfApplet != null ? (BillsApplet.HalfApplet) BillsApplet.HalfApplet.ADAPTER.redact(halfApplet) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BillsApplet(billsAppletAction2, fullApplet2, halfApplet2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BillsApplet billsApplet = (BillsApplet) obj;
        billsApplet.getClass();
        BillsApplet.BillsAppletAction.ADAPTER.encodeWithTag(protoWriter, 1, billsApplet.action);
        BillsApplet.FullApplet.ADAPTER.encodeWithTag(protoWriter, 2, billsApplet.full_applet);
        BillsApplet.HalfApplet.ADAPTER.encodeWithTag(protoWriter, 3, billsApplet.half_applet);
        protoWriter.writeBytes(billsApplet.unknownFields());
    }
}
