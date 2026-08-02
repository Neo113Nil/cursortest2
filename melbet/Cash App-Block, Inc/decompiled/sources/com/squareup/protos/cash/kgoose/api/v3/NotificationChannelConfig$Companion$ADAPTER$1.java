package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/NotificationChannelConfig$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationChannelConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NotificationChannelConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NotificationChannelConfig((NotificationChannel) obj, (NotificationEmailConfig) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = NotificationChannel.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(NotificationEmailConfig.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NotificationChannelConfig notificationChannelConfig = (NotificationChannelConfig) obj;
        reverseProtoWriter.getClass();
        notificationChannelConfig.getClass();
        reverseProtoWriter.writeBytes(notificationChannelConfig.unknownFields());
        NotificationEmailConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 2, notificationChannelConfig.email_config);
        NotificationChannel.ADAPTER.encodeWithTag(reverseProtoWriter, 1, notificationChannelConfig.channel);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NotificationChannelConfig notificationChannelConfig = (NotificationChannelConfig) obj;
        notificationChannelConfig.getClass();
        return NotificationEmailConfig.ADAPTER.encodedSizeWithTag(2, notificationChannelConfig.email_config) + NotificationChannel.ADAPTER.encodedSizeWithTag(1, notificationChannelConfig.channel) + notificationChannelConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NotificationChannelConfig notificationChannelConfig = (NotificationChannelConfig) obj;
        notificationChannelConfig.getClass();
        NotificationEmailConfig notificationEmailConfig = notificationChannelConfig.email_config;
        NotificationEmailConfig notificationEmailConfig2 = notificationEmailConfig != null ? (NotificationEmailConfig) NotificationEmailConfig.ADAPTER.redact(notificationEmailConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        NotificationChannel notificationChannel = notificationChannelConfig.channel;
        byteString.getClass();
        return new NotificationChannelConfig(notificationChannel, notificationEmailConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NotificationChannelConfig notificationChannelConfig = (NotificationChannelConfig) obj;
        notificationChannelConfig.getClass();
        NotificationChannel.ADAPTER.encodeWithTag(protoWriter, 1, notificationChannelConfig.channel);
        NotificationEmailConfig.ADAPTER.encodeWithTag(protoWriter, 2, notificationChannelConfig.email_config);
        protoWriter.writeBytes(notificationChannelConfig.unknownFields());
    }
}
