package squareup.cash.savings.action;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class ClientRouteTemplate$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClientRouteTemplate((Long) obj4, (String) obj, (String) obj2, (String) obj3, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClientRouteTemplate clientRouteTemplate = (ClientRouteTemplate) obj;
        reverseProtoWriter.getClass();
        clientRouteTemplate.getClass();
        reverseProtoWriter.writeBytes(clientRouteTemplate.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, clientRouteTemplate.zero_arg_verbatim_string);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, clientRouteTemplate.argument_count);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, clientRouteTemplate.web);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, clientRouteTemplate.ios);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, clientRouteTemplate.f1643android);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClientRouteTemplate clientRouteTemplate = (ClientRouteTemplate) obj;
        clientRouteTemplate.getClass();
        int size$okio = clientRouteTemplate.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, clientRouteTemplate.zero_arg_verbatim_string) + ProtoAdapter.INT64.encodedSizeWithTag(4, clientRouteTemplate.argument_count) + protoAdapter.encodedSizeWithTag(3, clientRouteTemplate.web) + protoAdapter.encodedSizeWithTag(2, clientRouteTemplate.ios) + protoAdapter.encodedSizeWithTag(1, clientRouteTemplate.f1643android) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClientRouteTemplate clientRouteTemplate = (ClientRouteTemplate) obj;
        clientRouteTemplate.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = clientRouteTemplate.f1643android;
        String str2 = clientRouteTemplate.ios;
        String str3 = clientRouteTemplate.web;
        Long l = clientRouteTemplate.argument_count;
        String str4 = clientRouteTemplate.zero_arg_verbatim_string;
        byteString.getClass();
        return new ClientRouteTemplate(l, str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientRouteTemplate clientRouteTemplate = (ClientRouteTemplate) obj;
        clientRouteTemplate.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, clientRouteTemplate.f1643android);
        protoAdapter.encodeWithTag(protoWriter, 2, clientRouteTemplate.ios);
        protoAdapter.encodeWithTag(protoWriter, 3, clientRouteTemplate.web);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, clientRouteTemplate.argument_count);
        protoAdapter.encodeWithTag(protoWriter, 5, clientRouteTemplate.zero_arg_verbatim_string);
        protoWriter.writeBytes(clientRouteTemplate.unknownFields());
    }
}
