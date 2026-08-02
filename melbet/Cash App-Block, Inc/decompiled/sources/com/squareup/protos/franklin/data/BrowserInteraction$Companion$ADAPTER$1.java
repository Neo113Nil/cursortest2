package com.squareup.protos.franklin.data;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BrowserInteraction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
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
                return new BrowserInteraction((Long) obj, (String) obj2, (String) obj3, m, (String) obj4, (String) obj5, (Headers) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 5:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(Headers.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BrowserInteraction browserInteraction = (BrowserInteraction) obj;
        reverseProtoWriter.getClass();
        browserInteraction.getClass();
        reverseProtoWriter.writeBytes(browserInteraction.unknownFields());
        Headers.ADAPTER.encodeWithTag(reverseProtoWriter, 7, browserInteraction.request_headers);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, browserInteraction.tracking_cookie);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, browserInteraction.client_ip);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, browserInteraction.header_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, browserInteraction.antibot_report);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, browserInteraction.sift_science_token);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, browserInteraction.timestamp);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BrowserInteraction browserInteraction = (BrowserInteraction) obj;
        browserInteraction.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, browserInteraction.timestamp) + browserInteraction.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Headers.ADAPTER.encodedSizeWithTag(7, browserInteraction.request_headers) + protoAdapter.encodedSizeWithTag(6, browserInteraction.tracking_cookie) + protoAdapter.encodedSizeWithTag(5, browserInteraction.client_ip) + protoAdapter.asRepeated().encodedSizeWithTag(4, browserInteraction.header_name) + protoAdapter.encodedSizeWithTag(3, browserInteraction.antibot_report) + protoAdapter.encodedSizeWithTag(2, browserInteraction.sift_science_token) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BrowserInteraction browserInteraction = (BrowserInteraction) obj;
        browserInteraction.getClass();
        Headers headers = browserInteraction.request_headers;
        Headers headers2 = headers != null ? (Headers) Headers.ADAPTER.redact(headers) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = browserInteraction.timestamp;
        String str = browserInteraction.sift_science_token;
        String str2 = browserInteraction.antibot_report;
        List list = browserInteraction.header_name;
        String str3 = browserInteraction.client_ip;
        String str4 = browserInteraction.tracking_cookie;
        list.getClass();
        byteString.getClass();
        return new BrowserInteraction(l, str, str2, list, str3, str4, headers2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BrowserInteraction browserInteraction = (BrowserInteraction) obj;
        browserInteraction.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, browserInteraction.timestamp);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, browserInteraction.sift_science_token);
        protoAdapter.encodeWithTag(protoWriter, 3, browserInteraction.antibot_report);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, browserInteraction.header_name);
        protoAdapter.encodeWithTag(protoWriter, 5, browserInteraction.client_ip);
        protoAdapter.encodeWithTag(protoWriter, 6, browserInteraction.tracking_cookie);
        Headers.ADAPTER.encodeWithTag(protoWriter, 7, browserInteraction.request_headers);
        protoWriter.writeBytes(browserInteraction.unknownFields());
    }
}
