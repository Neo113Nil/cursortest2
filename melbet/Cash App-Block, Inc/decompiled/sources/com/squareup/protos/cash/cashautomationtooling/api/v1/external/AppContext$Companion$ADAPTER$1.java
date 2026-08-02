package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppContext((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppContext appContext = (AppContext) obj;
        reverseProtoWriter.getClass();
        appContext.getClass();
        reverseProtoWriter.writeBytes(appContext.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, appContext.screen_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, appContext.variant);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, appContext.version_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, appContext.version_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, appContext.endpoint);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, appContext.app_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppContext appContext = (AppContext) obj;
        appContext.getClass();
        int size$okio = appContext.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, appContext.screen_name) + protoAdapter.encodedSizeWithTag(5, appContext.variant) + protoAdapter.encodedSizeWithTag(4, appContext.version_code) + protoAdapter.encodedSizeWithTag(3, appContext.version_name) + protoAdapter.encodedSizeWithTag(2, appContext.endpoint) + protoAdapter.encodedSizeWithTag(1, appContext.app_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppContext appContext = (AppContext) obj;
        appContext.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = appContext.app_token;
        String str2 = appContext.endpoint;
        String str3 = appContext.version_name;
        String str4 = appContext.version_code;
        String str5 = appContext.variant;
        String str6 = appContext.screen_name;
        byteString.getClass();
        return new AppContext(str, str2, str3, str4, str5, str6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppContext appContext = (AppContext) obj;
        appContext.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, appContext.app_token);
        protoAdapter.encodeWithTag(protoWriter, 2, appContext.endpoint);
        protoAdapter.encodeWithTag(protoWriter, 3, appContext.version_name);
        protoAdapter.encodeWithTag(protoWriter, 4, appContext.version_code);
        protoAdapter.encodeWithTag(protoWriter, 5, appContext.variant);
        protoAdapter.encodeWithTag(protoWriter, 6, appContext.screen_name);
        protoWriter.writeBytes(appContext.unknownFields());
    }
}
