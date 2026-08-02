package squareup.cash.overdraft;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes10.dex */
public final class OverdraftStatus$Action$EnableOverdraftAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OverdraftStatus.Action.EnableOverdraftAction(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OverdraftStatus.Action.EnableOverdraftAction enableOverdraftAction = (OverdraftStatus.Action.EnableOverdraftAction) obj;
        reverseProtoWriter.getClass();
        enableOverdraftAction.getClass();
        reverseProtoWriter.writeBytes(enableOverdraftAction.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OverdraftStatus.Action.EnableOverdraftAction enableOverdraftAction = (OverdraftStatus.Action.EnableOverdraftAction) obj;
        enableOverdraftAction.getClass();
        return enableOverdraftAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((OverdraftStatus.Action.EnableOverdraftAction) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OverdraftStatus.Action.EnableOverdraftAction(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OverdraftStatus.Action.EnableOverdraftAction enableOverdraftAction = (OverdraftStatus.Action.EnableOverdraftAction) obj;
        enableOverdraftAction.getClass();
        protoWriter.writeBytes(enableOverdraftAction.unknownFields());
    }
}
