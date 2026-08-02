package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class IdValue$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new IdValue((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        IdValue idValue = (IdValue) obj;
        reverseProtoWriter.getClass();
        idValue.getClass();
        reverseProtoWriter.writeBytes(idValue.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, idValue.local);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, idValue.server);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        IdValue idValue = (IdValue) obj;
        idValue.getClass();
        int size$okio = idValue.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, idValue.local) + protoAdapter.encodedSizeWithTag(1, idValue.server) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        IdValue idValue = (IdValue) obj;
        idValue.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = idValue.server;
        String str2 = idValue.local;
        byteString.getClass();
        return new IdValue(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        IdValue idValue = (IdValue) obj;
        idValue.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, idValue.server);
        protoAdapter.encodeWithTag(protoWriter, 2, idValue.local);
        protoWriter.writeBytes(idValue.unknownFields());
    }
}
