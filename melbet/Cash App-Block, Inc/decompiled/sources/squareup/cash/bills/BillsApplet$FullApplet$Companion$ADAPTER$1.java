package squareup.cash.bills;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes10.dex */
public final class BillsApplet$FullApplet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BillsApplet.FullApplet((LocalizedString) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(BillsApplet.FullAppletLine.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BillsApplet.FullApplet fullApplet = (BillsApplet.FullApplet) obj;
        reverseProtoWriter.getClass();
        fullApplet.getClass();
        reverseProtoWriter.writeBytes(fullApplet.unknownFields());
        BillsApplet.FullAppletLine.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, fullApplet.lines);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, fullApplet.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BillsApplet.FullApplet fullApplet = (BillsApplet.FullApplet) obj;
        fullApplet.getClass();
        return BillsApplet.FullAppletLine.ADAPTER.asRepeated().encodedSizeWithTag(2, fullApplet.lines) + LocalizedString.ADAPTER.encodedSizeWithTag(1, fullApplet.title) + fullApplet.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BillsApplet.FullApplet fullApplet = (BillsApplet.FullApplet) obj;
        fullApplet.getClass();
        LocalizedString localizedString = fullApplet.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(fullApplet.lines, BillsApplet.FullAppletLine.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BillsApplet.FullApplet(localizedString2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BillsApplet.FullApplet fullApplet = (BillsApplet.FullApplet) obj;
        fullApplet.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, fullApplet.title);
        BillsApplet.FullAppletLine.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, fullApplet.lines);
        protoWriter.writeBytes(fullApplet.unknownFields());
    }
}
