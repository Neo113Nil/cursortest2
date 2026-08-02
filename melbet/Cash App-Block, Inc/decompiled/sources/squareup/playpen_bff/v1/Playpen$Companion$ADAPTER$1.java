package squareup.playpen_bff.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class Playpen$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = "";
        Object obj2 = "";
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Playpen((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Playpen playpen = (Playpen) obj;
        reverseProtoWriter.getClass();
        playpen.getClass();
        ByteString unknownFields = playpen.unknownFields();
        String str = playpen.name;
        reverseProtoWriter.writeBytes(unknownFields);
        String str2 = playpen.baggage_header_value;
        if (!Intrinsics.areEqual(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, str2);
        }
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, str);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Playpen playpen = (Playpen) obj;
        playpen.getClass();
        ByteString unknownFields = playpen.unknownFields();
        String str = playpen.baggage_header_value;
        int size$okio = unknownFields.getSize$okio();
        String str2 = playpen.name;
        if (!Intrinsics.areEqual(str2, "")) {
            size$okio += ProtoAdapter.STRING.encodedSizeWithTag(1, str2);
        }
        return !Intrinsics.areEqual(str, "") ? ProtoAdapter.STRING.encodedSizeWithTag(2, str) + size$okio : size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Playpen playpen = (Playpen) obj;
        playpen.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = playpen.name;
        String str2 = playpen.baggage_header_value;
        str.getClass();
        str2.getClass();
        byteString.getClass();
        return new Playpen(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Playpen playpen = (Playpen) obj;
        playpen.getClass();
        String str = playpen.name;
        String str2 = playpen.baggage_header_value;
        if (!Intrinsics.areEqual(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
        }
        if (!Intrinsics.areEqual(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str2);
        }
        protoWriter.writeBytes(playpen.unknownFields());
    }
}
