package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import xyz.block.protos.genie.KeyValueMap;

/* loaded from: classes10.dex */
public final class KeyValueMap$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new KeyValueMap(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(KeyValueMap.Entry.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        KeyValueMap keyValueMap = (KeyValueMap) obj;
        reverseProtoWriter.getClass();
        keyValueMap.getClass();
        reverseProtoWriter.writeBytes(keyValueMap.unknownFields());
        KeyValueMap.Entry.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, keyValueMap.entries);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        KeyValueMap keyValueMap = (KeyValueMap) obj;
        keyValueMap.getClass();
        return KeyValueMap.Entry.ADAPTER.asRepeated().encodedSizeWithTag(1, keyValueMap.entries) + keyValueMap.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        KeyValueMap keyValueMap = (KeyValueMap) obj;
        keyValueMap.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(keyValueMap.entries, KeyValueMap.Entry.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new KeyValueMap(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        KeyValueMap keyValueMap = (KeyValueMap) obj;
        keyValueMap.getClass();
        KeyValueMap.Entry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, keyValueMap.entries);
        protoWriter.writeBytes(keyValueMap.unknownFields());
    }
}
