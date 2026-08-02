package squareup.playpen_bff.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class Service$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = "";
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Service((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Service service = (Service) obj;
        reverseProtoWriter.getClass();
        service.getClass();
        reverseProtoWriter.writeBytes(service.unknownFields());
        String str = service.name;
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, str);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Service service = (Service) obj;
        service.getClass();
        int size$okio = service.unknownFields().getSize$okio();
        String str = service.name;
        return !Intrinsics.areEqual(str, "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, str) + size$okio : size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Service service = (Service) obj;
        service.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = service.name;
        str.getClass();
        byteString.getClass();
        return new Service(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Service service = (Service) obj;
        service.getClass();
        String str = service.name;
        if (!Intrinsics.areEqual(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
        }
        protoWriter.writeBytes(service.unknownFields());
    }
}
