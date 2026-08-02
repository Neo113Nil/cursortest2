package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.CreateSessionResponse;

/* loaded from: classes10.dex */
public final class CreateSessionResponse$Success$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateSessionResponse.Success((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        CreateSessionResponse.Success success = (CreateSessionResponse.Success) obj;
        reverseProtoWriter.getClass();
        success.getClass();
        reverseProtoWriter.writeBytes(success.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, success.session_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateSessionResponse.Success success = (CreateSessionResponse.Success) obj;
        success.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, success.session_token) + success.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((CreateSessionResponse.Success) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreateSessionResponse.Success(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateSessionResponse.Success success = (CreateSessionResponse.Success) obj;
        success.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, success.session_token);
        protoWriter.writeBytes(success.unknownFields());
    }
}
