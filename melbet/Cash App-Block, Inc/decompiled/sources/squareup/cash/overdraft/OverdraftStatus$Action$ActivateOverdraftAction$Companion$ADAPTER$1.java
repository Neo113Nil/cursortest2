package squareup.cash.overdraft;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes10.dex */
public final class OverdraftStatus$Action$ActivateOverdraftAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OverdraftStatus.Action.ActivateOverdraftAction((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        OverdraftStatus.Action.ActivateOverdraftAction activateOverdraftAction = (OverdraftStatus.Action.ActivateOverdraftAction) obj;
        reverseProtoWriter.getClass();
        activateOverdraftAction.getClass();
        reverseProtoWriter.writeBytes(activateOverdraftAction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, activateOverdraftAction.client_route_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OverdraftStatus.Action.ActivateOverdraftAction activateOverdraftAction = (OverdraftStatus.Action.ActivateOverdraftAction) obj;
        activateOverdraftAction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, activateOverdraftAction.client_route_url) + activateOverdraftAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OverdraftStatus.Action.ActivateOverdraftAction activateOverdraftAction = (OverdraftStatus.Action.ActivateOverdraftAction) obj;
        activateOverdraftAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = activateOverdraftAction.client_route_url;
        byteString.getClass();
        return new OverdraftStatus.Action.ActivateOverdraftAction(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OverdraftStatus.Action.ActivateOverdraftAction activateOverdraftAction = (OverdraftStatus.Action.ActivateOverdraftAction) obj;
        activateOverdraftAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, activateOverdraftAction.client_route_url);
        protoWriter.writeBytes(activateOverdraftAction.unknownFields());
    }
}
