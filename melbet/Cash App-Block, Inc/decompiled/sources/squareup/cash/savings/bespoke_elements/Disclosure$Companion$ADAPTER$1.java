package squareup.cash.savings.bespoke_elements;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class Disclosure$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Disclosure(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Disclosure disclosure = (Disclosure) obj;
        reverseProtoWriter.getClass();
        disclosure.getClass();
        reverseProtoWriter.writeBytes(disclosure.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Disclosure disclosure = (Disclosure) obj;
        disclosure.getClass();
        return disclosure.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((Disclosure) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Disclosure(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Disclosure disclosure = (Disclosure) obj;
        disclosure.getClass();
        protoWriter.writeBytes(disclosure.unknownFields());
    }
}
