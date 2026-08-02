package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.CreateSessionResponse;

/* loaded from: classes10.dex */
public final class CreateSessionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateSessionResponse((CreateSessionResponse.Success) obj, (CreateSessionResponse.Failure) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = CreateSessionResponse.Success.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = CreateSessionResponse.Failure.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateSessionResponse createSessionResponse = (CreateSessionResponse) obj;
        reverseProtoWriter.getClass();
        createSessionResponse.getClass();
        reverseProtoWriter.writeBytes(createSessionResponse.unknownFields());
        CreateSessionResponse.Failure.ADAPTER.encodeWithTag(reverseProtoWriter, 2, createSessionResponse.failure);
        CreateSessionResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createSessionResponse.success);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateSessionResponse createSessionResponse = (CreateSessionResponse) obj;
        createSessionResponse.getClass();
        return CreateSessionResponse.Failure.ADAPTER.encodedSizeWithTag(2, createSessionResponse.failure) + CreateSessionResponse.Success.ADAPTER.encodedSizeWithTag(1, createSessionResponse.success) + createSessionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateSessionResponse createSessionResponse = (CreateSessionResponse) obj;
        createSessionResponse.getClass();
        CreateSessionResponse.Success success = createSessionResponse.success;
        CreateSessionResponse.Success success2 = success != null ? (CreateSessionResponse.Success) CreateSessionResponse.Success.ADAPTER.redact(success) : null;
        CreateSessionResponse.Failure failure = createSessionResponse.failure;
        CreateSessionResponse.Failure failure2 = failure != null ? (CreateSessionResponse.Failure) CreateSessionResponse.Failure.ADAPTER.redact(failure) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreateSessionResponse(success2, failure2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateSessionResponse createSessionResponse = (CreateSessionResponse) obj;
        createSessionResponse.getClass();
        CreateSessionResponse.Success.ADAPTER.encodeWithTag(protoWriter, 1, createSessionResponse.success);
        CreateSessionResponse.Failure.ADAPTER.encodeWithTag(protoWriter, 2, createSessionResponse.failure);
        protoWriter.writeBytes(createSessionResponse.unknownFields());
    }
}
