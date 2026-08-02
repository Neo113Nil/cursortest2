package squareup.playpen_bff.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class GetServicesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetServicesResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Service.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetServicesResponse getServicesResponse = (GetServicesResponse) obj;
        reverseProtoWriter.getClass();
        getServicesResponse.getClass();
        reverseProtoWriter.writeBytes(getServicesResponse.unknownFields());
        Service.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getServicesResponse.services);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetServicesResponse getServicesResponse = (GetServicesResponse) obj;
        getServicesResponse.getClass();
        return Service.ADAPTER.asRepeated().encodedSizeWithTag(1, getServicesResponse.services) + getServicesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetServicesResponse getServicesResponse = (GetServicesResponse) obj;
        getServicesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getServicesResponse.services, Service.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetServicesResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetServicesResponse getServicesResponse = (GetServicesResponse) obj;
        getServicesResponse.getClass();
        Service.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getServicesResponse.services);
        protoWriter.writeBytes(getServicesResponse.unknownFields());
    }
}
