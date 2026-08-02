package squareup.cash.bills;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes10.dex */
public final class BillsApplet$BillsAppletAction$Button$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BillsApplet.BillsAppletAction.Button((LocalizedString) obj, (BillsApplet.BillsAppletAction.ClientRoute) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(BillsApplet.BillsAppletAction.ClientRoute.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BillsApplet.BillsAppletAction.Button button = (BillsApplet.BillsAppletAction.Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        BillsApplet.BillsAppletAction.ClientRoute.ADAPTER.encodeWithTag(reverseProtoWriter, 3, button.client_route);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, button.button_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BillsApplet.BillsAppletAction.Button button = (BillsApplet.BillsAppletAction.Button) obj;
        button.getClass();
        return BillsApplet.BillsAppletAction.ClientRoute.ADAPTER.encodedSizeWithTag(3, button.client_route) + LocalizedString.ADAPTER.encodedSizeWithTag(1, button.button_text) + button.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BillsApplet.BillsAppletAction.Button button = (BillsApplet.BillsAppletAction.Button) obj;
        button.getClass();
        LocalizedString localizedString = button.button_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        BillsApplet.BillsAppletAction.ClientRoute clientRoute = button.client_route;
        BillsApplet.BillsAppletAction.ClientRoute clientRoute2 = clientRoute != null ? (BillsApplet.BillsAppletAction.ClientRoute) BillsApplet.BillsAppletAction.ClientRoute.ADAPTER.redact(clientRoute) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BillsApplet.BillsAppletAction.Button(localizedString2, clientRoute2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BillsApplet.BillsAppletAction.Button button = (BillsApplet.BillsAppletAction.Button) obj;
        button.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, button.button_text);
        BillsApplet.BillsAppletAction.ClientRoute.ADAPTER.encodeWithTag(protoWriter, 3, button.client_route);
        protoWriter.writeBytes(button.unknownFields());
    }
}
