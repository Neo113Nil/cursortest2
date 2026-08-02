package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzjn;
import com.squareup.protos.cash.messagingplatformcommon.common.MessageType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        String str;
        Boolean bool;
        String str2;
        ?? decode;
        zzjn appMessage$Message$HomeScreenMessage;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str3 = null;
        String str4 = null;
        Object obj = null;
        Boolean bool2 = null;
        String str5 = null;
        zzjn zzjnVar = null;
        Long l = null;
        MessageType messageType = null;
        String str6 = null;
        Long l2 = null;
        String str7 = null;
        String str8 = null;
        Long l3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppMessage(str3, str4, zzjnVar, (AppMessageFormat) obj, bool2, str5, l, messageType, str6, l2, str7, str8, l3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 3:
                default:
                    protoReader.readUnknownField(nextTag);
                    str = str4;
                    bool = bool2;
                    str2 = str5;
                    decode = str3;
                    str4 = str;
                    bool2 = bool;
                    str5 = str2;
                    break;
                case 4:
                    appMessage$Message$HomeScreenMessage = new AppMessage$Message$HomeScreenMessage((HomeScreenMessage) HomeScreenMessage.ADAPTER.decode(protoReader));
                    zzjnVar = appMessage$Message$HomeScreenMessage;
                    decode = str3;
                    break;
                case 5:
                    appMessage$Message$HomeScreenMessage = new AppMessage$Message$ActivityInlineMessage((ActivityInlineMessage) ActivityInlineMessage.ADAPTER.decode(protoReader));
                    zzjnVar = appMessage$Message$HomeScreenMessage;
                    decode = str3;
                    break;
                case 6:
                    obj = TransactorKt.decodeMessageOrMerge(AppMessageFormat.ADAPTER, protoReader, obj);
                    decode = str3;
                    break;
                case 7:
                    bool2 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 8:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 9:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 10:
                    try {
                        messageType = MessageType.ADAPTER.decode(protoReader);
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        str = str4;
                        bool = bool2;
                        str2 = str5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 11:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 12:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 13:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 14:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 15:
                    l3 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
            }
            str3 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppMessage appMessage = (AppMessage) obj;
        reverseProtoWriter.getClass();
        appMessage.getClass();
        reverseProtoWriter.writeBytes(appMessage.unknownFields());
        zzjn zzjnVar = appMessage.message;
        if (zzjnVar instanceof AppMessage$Message$HomeScreenMessage) {
            HomeScreenMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((AppMessage$Message$HomeScreenMessage) zzjnVar).value);
        } else if (zzjnVar instanceof AppMessage$Message$ActivityInlineMessage) {
            ActivityInlineMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((AppMessage$Message$ActivityInlineMessage) zzjnVar).value);
        } else if (zzjnVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, appMessage.template_version);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 14, appMessage.template_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, appMessage.locale);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, appMessage.expires_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, appMessage.dismissal_event_name);
        MessageType.ADAPTER.encodeWithTag(reverseProtoWriter, 10, appMessage.message_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, appMessage.created_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, appMessage.metadata_id);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, appMessage.is_badged);
        AppMessageFormat.ADAPTER.encodeWithTag(reverseProtoWriter, 6, appMessage.app_message_format);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, appMessage.campaign_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, appMessage.message_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        AppMessage appMessage = (AppMessage) obj;
        appMessage.getClass();
        int size$okio = appMessage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, appMessage.campaign_token) + protoAdapter.encodedSizeWithTag(1, appMessage.message_token) + size$okio;
        zzjn zzjnVar = appMessage.message;
        if (zzjnVar instanceof AppMessage$Message$HomeScreenMessage) {
            encodedSizeWithTag = HomeScreenMessage.ADAPTER.encodedSizeWithTag(4, ((AppMessage$Message$HomeScreenMessage) zzjnVar).value);
        } else {
            if (!(zzjnVar instanceof AppMessage$Message$ActivityInlineMessage)) {
                if (zzjnVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(8, appMessage.metadata_id) + ProtoAdapter.BOOL.encodedSizeWithTag(7, appMessage.is_badged) + AppMessageFormat.ADAPTER.encodedSizeWithTag(6, appMessage.app_message_format) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                return protoAdapter2.encodedSizeWithTag(15, appMessage.template_version) + protoAdapter.encodedSizeWithTag(14, appMessage.template_token) + protoAdapter.encodedSizeWithTag(13, appMessage.locale) + protoAdapter2.encodedSizeWithTag(12, appMessage.expires_at) + protoAdapter.encodedSizeWithTag(11, appMessage.dismissal_event_name) + MessageType.ADAPTER.encodedSizeWithTag(10, appMessage.message_type) + protoAdapter2.encodedSizeWithTag(9, appMessage.created_at) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = ActivityInlineMessage.ADAPTER.encodedSizeWithTag(5, ((AppMessage$Message$ActivityInlineMessage) zzjnVar).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        int encodedSizeWithTag32 = protoAdapter.encodedSizeWithTag(8, appMessage.metadata_id) + ProtoAdapter.BOOL.encodedSizeWithTag(7, appMessage.is_badged) + AppMessageFormat.ADAPTER.encodedSizeWithTag(6, appMessage.app_message_format) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter22 = ProtoAdapter.INT64;
        return protoAdapter22.encodedSizeWithTag(15, appMessage.template_version) + protoAdapter.encodedSizeWithTag(14, appMessage.template_token) + protoAdapter.encodedSizeWithTag(13, appMessage.locale) + protoAdapter22.encodedSizeWithTag(12, appMessage.expires_at) + protoAdapter.encodedSizeWithTag(11, appMessage.dismissal_event_name) + MessageType.ADAPTER.encodedSizeWithTag(10, appMessage.message_type) + protoAdapter22.encodedSizeWithTag(9, appMessage.created_at) + encodedSizeWithTag32;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppMessage appMessage = (AppMessage) obj;
        appMessage.getClass();
        AppMessageFormat appMessageFormat = appMessage.app_message_format;
        AppMessageFormat appMessageFormat2 = appMessageFormat != null ? (AppMessageFormat) AppMessageFormat.ADAPTER.redact(appMessageFormat) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = appMessage.message_token;
        String str2 = appMessage.campaign_token;
        zzjn zzjnVar = appMessage.message;
        Boolean bool = appMessage.is_badged;
        String str3 = appMessage.metadata_id;
        Long l = appMessage.created_at;
        MessageType messageType = appMessage.message_type;
        String str4 = appMessage.dismissal_event_name;
        Long l2 = appMessage.expires_at;
        String str5 = appMessage.locale;
        String str6 = appMessage.template_token;
        Long l3 = appMessage.template_version;
        byteString.getClass();
        return new AppMessage(str, str2, zzjnVar, appMessageFormat2, bool, str3, l, messageType, str4, l2, str5, str6, l3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppMessage appMessage = (AppMessage) obj;
        appMessage.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, appMessage.message_token);
        protoAdapter.encodeWithTag(protoWriter, 2, appMessage.campaign_token);
        AppMessageFormat.ADAPTER.encodeWithTag(protoWriter, 6, appMessage.app_message_format);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, appMessage.is_badged);
        protoAdapter.encodeWithTag(protoWriter, 8, appMessage.metadata_id);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 9, appMessage.created_at);
        MessageType.ADAPTER.encodeWithTag(protoWriter, 10, appMessage.message_type);
        protoAdapter.encodeWithTag(protoWriter, 11, appMessage.dismissal_event_name);
        protoAdapter2.encodeWithTag(protoWriter, 12, appMessage.expires_at);
        protoAdapter.encodeWithTag(protoWriter, 13, appMessage.locale);
        protoAdapter.encodeWithTag(protoWriter, 14, appMessage.template_token);
        protoAdapter2.encodeWithTag(protoWriter, 15, appMessage.template_version);
        zzjn zzjnVar = appMessage.message;
        if (zzjnVar instanceof AppMessage$Message$HomeScreenMessage) {
            HomeScreenMessage.ADAPTER.encodeWithTag(protoWriter, 4, ((AppMessage$Message$HomeScreenMessage) zzjnVar).value);
        } else if (zzjnVar instanceof AppMessage$Message$ActivityInlineMessage) {
            ActivityInlineMessage.ADAPTER.encodeWithTag(protoWriter, 5, ((AppMessage$Message$ActivityInlineMessage) zzjnVar).value);
        } else if (zzjnVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(appMessage.unknownFields());
    }
}
