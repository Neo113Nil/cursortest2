package squareup.cash.earnings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class ActionButton$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActionButton((LocalizedString) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ActionButton actionButton = (ActionButton) obj;
        reverseProtoWriter.getClass();
        actionButton.getClass();
        reverseProtoWriter.writeBytes(actionButton.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, actionButton.client_route);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, actionButton.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActionButton actionButton = (ActionButton) obj;
        actionButton.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, actionButton.client_route) + LocalizedString.ADAPTER.encodedSizeWithTag(1, actionButton.title) + actionButton.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActionButton actionButton = (ActionButton) obj;
        actionButton.getClass();
        LocalizedString localizedString = actionButton.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = actionButton.client_route;
        byteString.getClass();
        return new ActionButton(localizedString2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActionButton actionButton = (ActionButton) obj;
        actionButton.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, actionButton.title);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, actionButton.client_route);
        protoWriter.writeBytes(actionButton.unknownFields());
    }
}
