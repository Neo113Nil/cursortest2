package com.squareup.protos.cash.client;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.common.time.DateTime;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ClientInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        String str;
        String str2;
        String str3;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str4 = null;
        String str5 = null;
        Object obj = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        ClientInfo.NavigationParadigm navigationParadigm = null;
        String str10 = null;
        Integer num = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClientInfo(str4, str5, (DateTime) obj, str6, str7, str8, str9, navigationParadigm, str10, num, str11, str12, str13, str14, str15, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 3:
                    obj = TransactorKt.decodeMessageOrMerge(DateTime.ADAPTER, protoReader, obj);
                    decode = str4;
                    break;
                case 4:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 5:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 6:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 7:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 8:
                    try {
                        navigationParadigm = ClientInfo.NavigationParadigm.ADAPTER.decode(protoReader);
                        decode = str4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        str = str5;
                        str2 = str6;
                        str3 = str7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 9:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 10:
                    num = ProtoAdapter.INT32.decode(protoReader);
                    decode = str4;
                    break;
                case 11:
                    str11 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 12:
                    str12 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 13:
                    str13 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 14:
                    str14 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 15:
                    str15 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    decode = str4;
                    str5 = str;
                    str6 = str2;
                    str7 = str3;
                    break;
            }
            str4 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClientInfo clientInfo = (ClientInfo) obj;
        reverseProtoWriter.getClass();
        clientInfo.getClass();
        reverseProtoWriter.writeBytes(clientInfo.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, clientInfo.threatmetrix_smart_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, clientInfo.device_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, clientInfo.device_vendor_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, clientInfo.drm_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, clientInfo.device_installation_id);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 10, clientInfo.client_scenario);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, clientInfo.accept_language);
        ClientInfo.NavigationParadigm.ADAPTER.encodeWithTag(reverseProtoWriter, 8, clientInfo.navigation_paradigm);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, clientInfo.device_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, clientInfo.ip_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, clientInfo.time_format);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, clientInfo.date_format);
        DateTime.ADAPTER.encodeWithTag(reverseProtoWriter, 3, clientInfo.timestamp);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, clientInfo.device_uuid);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, clientInfo.user_agent);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClientInfo clientInfo = (ClientInfo) obj;
        clientInfo.getClass();
        int size$okio = clientInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(15, clientInfo.threatmetrix_smart_id) + protoAdapter.encodedSizeWithTag(14, clientInfo.device_id) + protoAdapter.encodedSizeWithTag(13, clientInfo.device_vendor_id) + protoAdapter.encodedSizeWithTag(12, clientInfo.drm_id) + protoAdapter.encodedSizeWithTag(11, clientInfo.device_installation_id) + ProtoAdapter.INT32.encodedSizeWithTag(10, clientInfo.client_scenario) + protoAdapter.encodedSizeWithTag(9, clientInfo.accept_language) + ClientInfo.NavigationParadigm.ADAPTER.encodedSizeWithTag(8, clientInfo.navigation_paradigm) + protoAdapter.encodedSizeWithTag(7, clientInfo.device_name) + protoAdapter.encodedSizeWithTag(6, clientInfo.ip_address) + protoAdapter.encodedSizeWithTag(5, clientInfo.time_format) + protoAdapter.encodedSizeWithTag(4, clientInfo.date_format) + DateTime.ADAPTER.encodedSizeWithTag(3, clientInfo.timestamp) + protoAdapter.encodedSizeWithTag(2, clientInfo.device_uuid) + protoAdapter.encodedSizeWithTag(1, clientInfo.user_agent) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClientInfo clientInfo = (ClientInfo) obj;
        clientInfo.getClass();
        DateTime dateTime = clientInfo.timestamp;
        DateTime dateTime2 = dateTime != null ? (DateTime) DateTime.ADAPTER.redact(dateTime) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = clientInfo.user_agent;
        String str2 = clientInfo.device_uuid;
        String str3 = clientInfo.date_format;
        String str4 = clientInfo.time_format;
        String str5 = clientInfo.ip_address;
        ClientInfo.NavigationParadigm navigationParadigm = clientInfo.navigation_paradigm;
        String str6 = clientInfo.accept_language;
        Integer num = clientInfo.client_scenario;
        byteString.getClass();
        return new ClientInfo(str, str2, dateTime2, str3, str4, str5, null, navigationParadigm, str6, num, null, null, null, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientInfo clientInfo = (ClientInfo) obj;
        clientInfo.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, clientInfo.user_agent);
        protoAdapter.encodeWithTag(protoWriter, 2, clientInfo.device_uuid);
        DateTime.ADAPTER.encodeWithTag(protoWriter, 3, clientInfo.timestamp);
        protoAdapter.encodeWithTag(protoWriter, 4, clientInfo.date_format);
        protoAdapter.encodeWithTag(protoWriter, 5, clientInfo.time_format);
        protoAdapter.encodeWithTag(protoWriter, 6, clientInfo.ip_address);
        protoAdapter.encodeWithTag(protoWriter, 7, clientInfo.device_name);
        ClientInfo.NavigationParadigm.ADAPTER.encodeWithTag(protoWriter, 8, clientInfo.navigation_paradigm);
        protoAdapter.encodeWithTag(protoWriter, 9, clientInfo.accept_language);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, clientInfo.client_scenario);
        protoAdapter.encodeWithTag(protoWriter, 11, clientInfo.device_installation_id);
        protoAdapter.encodeWithTag(protoWriter, 12, clientInfo.drm_id);
        protoAdapter.encodeWithTag(protoWriter, 13, clientInfo.device_vendor_id);
        protoAdapter.encodeWithTag(protoWriter, 14, clientInfo.device_id);
        protoAdapter.encodeWithTag(protoWriter, 15, clientInfo.threatmetrix_smart_id);
        protoWriter.writeBytes(clientInfo.unknownFields());
    }
}
