package squareup.cash.wires;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.wires.WiresAccountInfo;

/* loaded from: classes10.dex */
public final class WiresAccountInfo$DeactivationDetails$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new WiresAccountInfo.DeactivationDetails((String) obj, (String) obj2, (String) obj3, (WiresAccountInfo.Action) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(WiresAccountInfo.Action.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WiresAccountInfo.DeactivationDetails deactivationDetails = (WiresAccountInfo.DeactivationDetails) obj;
        reverseProtoWriter.getClass();
        deactivationDetails.getClass();
        reverseProtoWriter.writeBytes(deactivationDetails.unknownFields());
        WiresAccountInfo.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 4, deactivationDetails.action);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, deactivationDetails.learn_more_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, deactivationDetails.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, deactivationDetails.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WiresAccountInfo.DeactivationDetails deactivationDetails = (WiresAccountInfo.DeactivationDetails) obj;
        deactivationDetails.getClass();
        int size$okio = deactivationDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return WiresAccountInfo.Action.ADAPTER.encodedSizeWithTag(4, deactivationDetails.action) + protoAdapter.encodedSizeWithTag(3, deactivationDetails.learn_more_button_text) + protoAdapter.encodedSizeWithTag(2, deactivationDetails.description) + protoAdapter.encodedSizeWithTag(1, deactivationDetails.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WiresAccountInfo.DeactivationDetails deactivationDetails = (WiresAccountInfo.DeactivationDetails) obj;
        deactivationDetails.getClass();
        WiresAccountInfo.Action action = deactivationDetails.action;
        WiresAccountInfo.Action action2 = action != null ? (WiresAccountInfo.Action) WiresAccountInfo.Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = deactivationDetails.title;
        String str2 = deactivationDetails.description;
        String str3 = deactivationDetails.learn_more_button_text;
        byteString.getClass();
        return new WiresAccountInfo.DeactivationDetails(str, str2, str3, action2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WiresAccountInfo.DeactivationDetails deactivationDetails = (WiresAccountInfo.DeactivationDetails) obj;
        deactivationDetails.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, deactivationDetails.title);
        protoAdapter.encodeWithTag(protoWriter, 2, deactivationDetails.description);
        protoAdapter.encodeWithTag(protoWriter, 3, deactivationDetails.learn_more_button_text);
        WiresAccountInfo.Action.ADAPTER.encodeWithTag(protoWriter, 4, deactivationDetails.action);
        protoWriter.writeBytes(deactivationDetails.unknownFields());
    }
}
