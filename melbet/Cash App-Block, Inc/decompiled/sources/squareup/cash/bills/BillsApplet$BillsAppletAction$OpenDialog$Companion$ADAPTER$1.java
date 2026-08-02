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
public final class BillsApplet$BillsAppletAction$OpenDialog$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BillsApplet.BillsAppletAction.OpenDialog((LocalizedString) obj, (LocalizedString) obj2, (BillsApplet.BillsAppletAction.Button) obj3, (BillsApplet.BillsAppletAction.Button) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(BillsApplet.BillsAppletAction.Button.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(BillsApplet.BillsAppletAction.Button.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BillsApplet.BillsAppletAction.OpenDialog openDialog = (BillsApplet.BillsAppletAction.OpenDialog) obj;
        reverseProtoWriter.getClass();
        openDialog.getClass();
        reverseProtoWriter.writeBytes(openDialog.unknownFields());
        ProtoAdapter protoAdapter = BillsApplet.BillsAppletAction.Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, openDialog.secondary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, openDialog.primary_button);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, openDialog.body);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, openDialog.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BillsApplet.BillsAppletAction.OpenDialog openDialog = (BillsApplet.BillsAppletAction.OpenDialog) obj;
        openDialog.getClass();
        int size$okio = openDialog.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, openDialog.body) + protoAdapter.encodedSizeWithTag(1, openDialog.title) + size$okio;
        ProtoAdapter protoAdapter2 = BillsApplet.BillsAppletAction.Button.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(4, openDialog.secondary_button) + protoAdapter2.encodedSizeWithTag(3, openDialog.primary_button) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BillsApplet.BillsAppletAction.OpenDialog openDialog = (BillsApplet.BillsAppletAction.OpenDialog) obj;
        openDialog.getClass();
        LocalizedString localizedString = openDialog.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = openDialog.body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        BillsApplet.BillsAppletAction.Button button = openDialog.primary_button;
        BillsApplet.BillsAppletAction.Button button2 = button != null ? (BillsApplet.BillsAppletAction.Button) BillsApplet.BillsAppletAction.Button.ADAPTER.redact(button) : null;
        BillsApplet.BillsAppletAction.Button button3 = openDialog.secondary_button;
        BillsApplet.BillsAppletAction.Button button4 = button3 != null ? (BillsApplet.BillsAppletAction.Button) BillsApplet.BillsAppletAction.Button.ADAPTER.redact(button3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BillsApplet.BillsAppletAction.OpenDialog(localizedString2, localizedString4, button2, button4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BillsApplet.BillsAppletAction.OpenDialog openDialog = (BillsApplet.BillsAppletAction.OpenDialog) obj;
        openDialog.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, openDialog.title);
        protoAdapter.encodeWithTag(protoWriter, 2, openDialog.body);
        ProtoAdapter protoAdapter2 = BillsApplet.BillsAppletAction.Button.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, openDialog.primary_button);
        protoAdapter2.encodeWithTag(protoWriter, 4, openDialog.secondary_button);
        protoWriter.writeBytes(openDialog.unknownFields());
    }
}
