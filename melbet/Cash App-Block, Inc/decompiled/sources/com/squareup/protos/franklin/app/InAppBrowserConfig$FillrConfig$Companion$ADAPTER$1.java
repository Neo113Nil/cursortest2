package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.InAppBrowserConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InAppBrowserConfig$FillrConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InAppBrowserConfig.FillrConfig((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InAppBrowserConfig.FillrConfig fillrConfig = (InAppBrowserConfig.FillrConfig) obj;
        reverseProtoWriter.getClass();
        fillrConfig.getClass();
        reverseProtoWriter.writeBytes(fillrConfig.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, fillrConfig.widget_password);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, fillrConfig.widget_username);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, fillrConfig.secret_key);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, fillrConfig.dev_key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InAppBrowserConfig.FillrConfig fillrConfig = (InAppBrowserConfig.FillrConfig) obj;
        fillrConfig.getClass();
        int size$okio = fillrConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, fillrConfig.widget_password) + protoAdapter.encodedSizeWithTag(3, fillrConfig.widget_username) + protoAdapter.encodedSizeWithTag(2, fillrConfig.secret_key) + protoAdapter.encodedSizeWithTag(1, fillrConfig.dev_key) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InAppBrowserConfig.FillrConfig fillrConfig = (InAppBrowserConfig.FillrConfig) obj;
        fillrConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = fillrConfig.dev_key;
        String str2 = fillrConfig.widget_username;
        byteString.getClass();
        return new InAppBrowserConfig.FillrConfig(str, null, str2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InAppBrowserConfig.FillrConfig fillrConfig = (InAppBrowserConfig.FillrConfig) obj;
        fillrConfig.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, fillrConfig.dev_key);
        protoAdapter.encodeWithTag(protoWriter, 2, fillrConfig.secret_key);
        protoAdapter.encodeWithTag(protoWriter, 3, fillrConfig.widget_username);
        protoAdapter.encodeWithTag(protoWriter, 4, fillrConfig.widget_password);
        protoWriter.writeBytes(fillrConfig.unknownFields());
    }
}
