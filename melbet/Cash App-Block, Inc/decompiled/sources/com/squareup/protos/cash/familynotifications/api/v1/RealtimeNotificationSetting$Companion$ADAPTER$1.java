package com.squareup.protos.cash.familynotifications.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RealtimeNotificationSetting$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RealtimeNotificationSetting((String) obj2, (Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RealtimeNotificationSetting realtimeNotificationSetting = (RealtimeNotificationSetting) obj;
        reverseProtoWriter.getClass();
        realtimeNotificationSetting.getClass();
        reverseProtoWriter.writeBytes(realtimeNotificationSetting.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, realtimeNotificationSetting.target_customer_token);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, realtimeNotificationSetting.enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RealtimeNotificationSetting realtimeNotificationSetting = (RealtimeNotificationSetting) obj;
        realtimeNotificationSetting.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, realtimeNotificationSetting.target_customer_token) + ProtoAdapter.BOOL.encodedSizeWithTag(1, realtimeNotificationSetting.enabled) + realtimeNotificationSetting.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RealtimeNotificationSetting realtimeNotificationSetting = (RealtimeNotificationSetting) obj;
        realtimeNotificationSetting.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = realtimeNotificationSetting.enabled;
        String str = realtimeNotificationSetting.target_customer_token;
        byteString.getClass();
        return new RealtimeNotificationSetting(str, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RealtimeNotificationSetting realtimeNotificationSetting = (RealtimeNotificationSetting) obj;
        realtimeNotificationSetting.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, realtimeNotificationSetting.enabled);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, realtimeNotificationSetting.target_customer_token);
        protoWriter.writeBytes(realtimeNotificationSetting.unknownFields());
    }
}
