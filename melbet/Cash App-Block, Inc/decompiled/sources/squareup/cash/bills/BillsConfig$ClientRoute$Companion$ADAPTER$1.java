package squareup.cash.bills;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.bills.BillsConfig;

/* loaded from: classes10.dex */
public final class BillsConfig$ClientRoute$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BillsConfig.ClientRoute((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        BillsConfig.ClientRoute clientRoute = (BillsConfig.ClientRoute) obj;
        reverseProtoWriter.getClass();
        clientRoute.getClass();
        reverseProtoWriter.writeBytes(clientRoute.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, clientRoute.route_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BillsConfig.ClientRoute clientRoute = (BillsConfig.ClientRoute) obj;
        clientRoute.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, clientRoute.route_url) + clientRoute.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BillsConfig.ClientRoute clientRoute = (BillsConfig.ClientRoute) obj;
        clientRoute.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = clientRoute.route_url;
        byteString.getClass();
        return new BillsConfig.ClientRoute(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BillsConfig.ClientRoute clientRoute = (BillsConfig.ClientRoute) obj;
        clientRoute.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, clientRoute.route_url);
        protoWriter.writeBytes(clientRoute.unknownFields());
    }
}
