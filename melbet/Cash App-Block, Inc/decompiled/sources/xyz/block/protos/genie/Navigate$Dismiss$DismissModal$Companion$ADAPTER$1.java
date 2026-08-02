package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Navigate;

/* loaded from: classes10.dex */
public final class Navigate$Dismiss$DismissModal$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Navigate.Dismiss.DismissModal(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Navigate.Dismiss.DismissModal dismissModal = (Navigate.Dismiss.DismissModal) obj;
        reverseProtoWriter.getClass();
        dismissModal.getClass();
        reverseProtoWriter.writeBytes(dismissModal.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Navigate.Dismiss.DismissModal dismissModal = (Navigate.Dismiss.DismissModal) obj;
        dismissModal.getClass();
        return dismissModal.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((Navigate.Dismiss.DismissModal) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Navigate.Dismiss.DismissModal(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Navigate.Dismiss.DismissModal dismissModal = (Navigate.Dismiss.DismissModal) obj;
        dismissModal.getClass();
        protoWriter.writeBytes(dismissModal.unknownFields());
    }
}
