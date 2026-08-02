package squareup.cash.lynx.api.app.v1_0;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.model.EnrichedInstrumentLink;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class GetEnrichedInstrumentLinksAppResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetEnrichedInstrumentLinksAppResponse(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(EnrichedInstrumentLink.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEnrichedInstrumentLinksAppResponse getEnrichedInstrumentLinksAppResponse = (GetEnrichedInstrumentLinksAppResponse) obj;
        reverseProtoWriter.getClass();
        getEnrichedInstrumentLinksAppResponse.getClass();
        reverseProtoWriter.writeBytes(getEnrichedInstrumentLinksAppResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, getEnrichedInstrumentLinksAppResponse.cursor);
        EnrichedInstrumentLink.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getEnrichedInstrumentLinksAppResponse.enriched_instrument_links);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEnrichedInstrumentLinksAppResponse getEnrichedInstrumentLinksAppResponse = (GetEnrichedInstrumentLinksAppResponse) obj;
        getEnrichedInstrumentLinksAppResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, getEnrichedInstrumentLinksAppResponse.cursor) + EnrichedInstrumentLink.ADAPTER.asRepeated().encodedSizeWithTag(1, getEnrichedInstrumentLinksAppResponse.enriched_instrument_links) + getEnrichedInstrumentLinksAppResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEnrichedInstrumentLinksAppResponse getEnrichedInstrumentLinksAppResponse = (GetEnrichedInstrumentLinksAppResponse) obj;
        getEnrichedInstrumentLinksAppResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getEnrichedInstrumentLinksAppResponse.enriched_instrument_links, EnrichedInstrumentLink.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = getEnrichedInstrumentLinksAppResponse.cursor;
        byteString.getClass();
        return new GetEnrichedInstrumentLinksAppResponse(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEnrichedInstrumentLinksAppResponse getEnrichedInstrumentLinksAppResponse = (GetEnrichedInstrumentLinksAppResponse) obj;
        getEnrichedInstrumentLinksAppResponse.getClass();
        EnrichedInstrumentLink.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getEnrichedInstrumentLinksAppResponse.enriched_instrument_links);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getEnrichedInstrumentLinksAppResponse.cursor);
        protoWriter.writeBytes(getEnrichedInstrumentLinksAppResponse.unknownFields());
    }
}
