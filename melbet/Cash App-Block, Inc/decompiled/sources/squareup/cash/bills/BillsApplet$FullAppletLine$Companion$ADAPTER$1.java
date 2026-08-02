package squareup.cash.bills;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes10.dex */
public final class BillsApplet$FullAppletLine$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BillsApplet.FullAppletLine((Image) obj, (LocalizedString) obj2, (Color) obj3, (LocalizedString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BillsApplet.FullAppletLine fullAppletLine = (BillsApplet.FullAppletLine) obj;
        reverseProtoWriter.getClass();
        fullAppletLine.getClass();
        reverseProtoWriter.writeBytes(fullAppletLine.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, fullAppletLine.description);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 5, fullAppletLine.ui_status_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, fullAppletLine.status);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, fullAppletLine.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BillsApplet.FullAppletLine fullAppletLine = (BillsApplet.FullAppletLine) obj;
        fullAppletLine.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, fullAppletLine.icon) + fullAppletLine.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, fullAppletLine.description) + Color.ADAPTER.encodedSizeWithTag(5, fullAppletLine.ui_status_color) + protoAdapter.encodedSizeWithTag(2, fullAppletLine.status) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BillsApplet.FullAppletLine fullAppletLine = (BillsApplet.FullAppletLine) obj;
        fullAppletLine.getClass();
        Image image = fullAppletLine.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        LocalizedString localizedString = fullAppletLine.status;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Color color = fullAppletLine.ui_status_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        LocalizedString localizedString3 = fullAppletLine.description;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BillsApplet.FullAppletLine(image2, localizedString2, color2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BillsApplet.FullAppletLine fullAppletLine = (BillsApplet.FullAppletLine) obj;
        fullAppletLine.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, fullAppletLine.icon);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, fullAppletLine.status);
        Color.ADAPTER.encodeWithTag(protoWriter, 5, fullAppletLine.ui_status_color);
        protoAdapter.encodeWithTag(protoWriter, 4, fullAppletLine.description);
        protoWriter.writeBytes(fullAppletLine.unknownFields());
    }
}
