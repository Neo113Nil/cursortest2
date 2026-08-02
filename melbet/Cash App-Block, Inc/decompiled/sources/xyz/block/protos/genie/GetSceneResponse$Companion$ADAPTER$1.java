package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.GetSceneResponse;

/* loaded from: classes10.dex */
public final class GetSceneResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSceneResponse((GetSceneResponse.Success) obj, (GetSceneResponse.Failure) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = GetSceneResponse.Success.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = GetSceneResponse.Failure.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSceneResponse getSceneResponse = (GetSceneResponse) obj;
        reverseProtoWriter.getClass();
        getSceneResponse.getClass();
        reverseProtoWriter.writeBytes(getSceneResponse.unknownFields());
        GetSceneResponse.Failure.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getSceneResponse.failure);
        GetSceneResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getSceneResponse.success);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSceneResponse getSceneResponse = (GetSceneResponse) obj;
        getSceneResponse.getClass();
        return GetSceneResponse.Failure.ADAPTER.encodedSizeWithTag(2, getSceneResponse.failure) + GetSceneResponse.Success.ADAPTER.encodedSizeWithTag(1, getSceneResponse.success) + getSceneResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSceneResponse getSceneResponse = (GetSceneResponse) obj;
        getSceneResponse.getClass();
        GetSceneResponse.Success success = getSceneResponse.success;
        GetSceneResponse.Success success2 = success != null ? (GetSceneResponse.Success) GetSceneResponse.Success.ADAPTER.redact(success) : null;
        GetSceneResponse.Failure failure = getSceneResponse.failure;
        GetSceneResponse.Failure failure2 = failure != null ? (GetSceneResponse.Failure) GetSceneResponse.Failure.ADAPTER.redact(failure) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetSceneResponse(success2, failure2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSceneResponse getSceneResponse = (GetSceneResponse) obj;
        getSceneResponse.getClass();
        GetSceneResponse.Success.ADAPTER.encodeWithTag(protoWriter, 1, getSceneResponse.success);
        GetSceneResponse.Failure.ADAPTER.encodeWithTag(protoWriter, 2, getSceneResponse.failure);
        protoWriter.writeBytes(getSceneResponse.unknownFields());
    }
}
