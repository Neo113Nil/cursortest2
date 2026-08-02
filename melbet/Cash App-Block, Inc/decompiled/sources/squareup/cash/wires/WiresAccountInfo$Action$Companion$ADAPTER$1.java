package squareup.cash.wires;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.wires.WiresAccountInfo;

/* loaded from: classes10.dex */
public final class WiresAccountInfo$Action$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new WiresAccountInfo.Action((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WiresAccountInfo.Action action = (WiresAccountInfo.Action) obj;
        reverseProtoWriter.getClass();
        action.getClass();
        reverseProtoWriter.writeBytes(action.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, action.client_route_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WiresAccountInfo.Action action = (WiresAccountInfo.Action) obj;
        action.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, action.client_route_url) + action.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WiresAccountInfo.Action action = (WiresAccountInfo.Action) obj;
        action.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = action.client_route_url;
        byteString.getClass();
        return new WiresAccountInfo.Action(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WiresAccountInfo.Action action = (WiresAccountInfo.Action) obj;
        action.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, action.client_route_url);
        protoWriter.writeBytes(action.unknownFields());
    }
}
