package squareup.cash.earnings;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class EarnerEnrollmentState$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarnerEnrollmentState((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarnerEnrollmentState earnerEnrollmentState = (EarnerEnrollmentState) obj;
        reverseProtoWriter.getClass();
        earnerEnrollmentState.getClass();
        reverseProtoWriter.writeBytes(earnerEnrollmentState.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, earnerEnrollmentState.enrolled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarnerEnrollmentState earnerEnrollmentState = (EarnerEnrollmentState) obj;
        earnerEnrollmentState.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, earnerEnrollmentState.enrolled) + earnerEnrollmentState.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarnerEnrollmentState earnerEnrollmentState = (EarnerEnrollmentState) obj;
        earnerEnrollmentState.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = earnerEnrollmentState.enrolled;
        byteString.getClass();
        return new EarnerEnrollmentState(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarnerEnrollmentState earnerEnrollmentState = (EarnerEnrollmentState) obj;
        earnerEnrollmentState.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, earnerEnrollmentState.enrolled);
        protoWriter.writeBytes(earnerEnrollmentState.unknownFields());
    }
}
