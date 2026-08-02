package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.GetSceneResponse;

/* loaded from: classes10.dex */
public final class GetSceneResponse$Failure$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSceneResponse.Failure((Error) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = Error.ADAPTER.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSceneResponse.Failure failure = (GetSceneResponse.Failure) obj;
        reverseProtoWriter.getClass();
        failure.getClass();
        reverseProtoWriter.writeBytes(failure.unknownFields());
        Error.ADAPTER.encodeWithTag(reverseProtoWriter, 1, failure.error);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSceneResponse.Failure failure = (GetSceneResponse.Failure) obj;
        failure.getClass();
        return Error.ADAPTER.encodedSizeWithTag(1, failure.error) + failure.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSceneResponse.Failure failure = (GetSceneResponse.Failure) obj;
        failure.getClass();
        Error error = failure.error;
        Error error2 = error != null ? (Error) Error.ADAPTER.redact(error) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetSceneResponse.Failure(error2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSceneResponse.Failure failure = (GetSceneResponse.Failure) obj;
        failure.getClass();
        Error.ADAPTER.encodeWithTag(protoWriter, 1, failure.error);
        protoWriter.writeBytes(failure.unknownFields());
    }
}
