package xyz.block.protos.genie;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class KeyPath$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new KeyPath(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        KeyPath keyPath = (KeyPath) obj;
        reverseProtoWriter.getClass();
        keyPath.getClass();
        reverseProtoWriter.writeBytes(keyPath.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, keyPath.segments);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        KeyPath keyPath = (KeyPath) obj;
        keyPath.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, keyPath.segments) + keyPath.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        KeyPath keyPath = (KeyPath) obj;
        keyPath.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = keyPath.segments;
        list.getClass();
        byteString.getClass();
        return new KeyPath(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        KeyPath keyPath = (KeyPath) obj;
        keyPath.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, keyPath.segments);
        protoWriter.writeBytes(keyPath.unknownFields());
    }
}
