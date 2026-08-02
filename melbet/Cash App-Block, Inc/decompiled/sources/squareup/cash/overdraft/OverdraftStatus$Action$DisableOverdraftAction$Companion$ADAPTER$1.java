package squareup.cash.overdraft;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes10.dex */
public final class OverdraftStatus$Action$DisableOverdraftAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OverdraftStatus.Action.DisableOverdraftAction(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OverdraftStatus.Action.DisableOverdraftAction disableOverdraftAction = (OverdraftStatus.Action.DisableOverdraftAction) obj;
        reverseProtoWriter.getClass();
        disableOverdraftAction.getClass();
        reverseProtoWriter.writeBytes(disableOverdraftAction.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OverdraftStatus.Action.DisableOverdraftAction disableOverdraftAction = (OverdraftStatus.Action.DisableOverdraftAction) obj;
        disableOverdraftAction.getClass();
        return disableOverdraftAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((OverdraftStatus.Action.DisableOverdraftAction) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OverdraftStatus.Action.DisableOverdraftAction(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OverdraftStatus.Action.DisableOverdraftAction disableOverdraftAction = (OverdraftStatus.Action.DisableOverdraftAction) obj;
        disableOverdraftAction.getClass();
        protoWriter.writeBytes(disableOverdraftAction.unknownFields());
    }
}
