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
public final class GetPlaypensResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPlaypensResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Playpen.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPlaypensResponse getPlaypensResponse = (GetPlaypensResponse) obj;
        reverseProtoWriter.getClass();
        getPlaypensResponse.getClass();
        reverseProtoWriter.writeBytes(getPlaypensResponse.unknownFields());
        Playpen.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getPlaypensResponse.playpens);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPlaypensResponse getPlaypensResponse = (GetPlaypensResponse) obj;
        getPlaypensResponse.getClass();
        return Playpen.ADAPTER.asRepeated().encodedSizeWithTag(1, getPlaypensResponse.playpens) + getPlaypensResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPlaypensResponse getPlaypensResponse = (GetPlaypensResponse) obj;
        getPlaypensResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getPlaypensResponse.playpens, Playpen.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetPlaypensResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPlaypensResponse getPlaypensResponse = (GetPlaypensResponse) obj;
        getPlaypensResponse.getClass();
        Playpen.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getPlaypensResponse.playpens);
        protoWriter.writeBytes(getPlaypensResponse.unknownFields());
    }
}
