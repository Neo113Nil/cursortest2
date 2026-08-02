package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class DebugInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DebugInfo((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        DebugInfo debugInfo = (DebugInfo) obj;
        reverseProtoWriter.getClass();
        debugInfo.getClass();
        reverseProtoWriter.writeBytes(debugInfo.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, debugInfo.message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DebugInfo debugInfo = (DebugInfo) obj;
        debugInfo.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, debugInfo.message) + debugInfo.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DebugInfo debugInfo = (DebugInfo) obj;
        debugInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = debugInfo.message;
        byteString.getClass();
        return new DebugInfo(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DebugInfo debugInfo = (DebugInfo) obj;
        debugInfo.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, debugInfo.message);
        protoWriter.writeBytes(debugInfo.unknownFields());
    }
}
