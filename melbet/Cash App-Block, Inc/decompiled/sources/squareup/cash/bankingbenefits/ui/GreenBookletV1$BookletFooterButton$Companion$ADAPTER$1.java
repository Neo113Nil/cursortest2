package squareup.cash.bankingbenefits.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBookletV1;

/* loaded from: classes10.dex */
public final class GreenBookletV1$BookletFooterButton$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GreenBookletV1.BookletFooterButton((LocalizedString) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GreenBookletV1.BookletFooterButton bookletFooterButton = (GreenBookletV1.BookletFooterButton) obj;
        reverseProtoWriter.getClass();
        bookletFooterButton.getClass();
        reverseProtoWriter.writeBytes(bookletFooterButton.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, bookletFooterButton.client_route);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bookletFooterButton.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GreenBookletV1.BookletFooterButton bookletFooterButton = (GreenBookletV1.BookletFooterButton) obj;
        bookletFooterButton.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, bookletFooterButton.client_route) + LocalizedString.ADAPTER.encodedSizeWithTag(1, bookletFooterButton.text) + bookletFooterButton.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GreenBookletV1.BookletFooterButton bookletFooterButton = (GreenBookletV1.BookletFooterButton) obj;
        bookletFooterButton.getClass();
        LocalizedString localizedString = bookletFooterButton.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = bookletFooterButton.client_route;
        byteString.getClass();
        return new GreenBookletV1.BookletFooterButton(localizedString2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GreenBookletV1.BookletFooterButton bookletFooterButton = (GreenBookletV1.BookletFooterButton) obj;
        bookletFooterButton.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, bookletFooterButton.text);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bookletFooterButton.client_route);
        protoWriter.writeBytes(bookletFooterButton.unknownFields());
    }
}
