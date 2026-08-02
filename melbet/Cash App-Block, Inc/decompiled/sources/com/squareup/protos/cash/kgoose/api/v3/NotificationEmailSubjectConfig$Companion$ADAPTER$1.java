package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/NotificationEmailSubjectConfig$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailSubjectConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NotificationEmailSubjectConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NotificationEmailSubjectConfig((NotificationEmailSubjectMode) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = NotificationEmailSubjectMode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NotificationEmailSubjectConfig notificationEmailSubjectConfig = (NotificationEmailSubjectConfig) obj;
        reverseProtoWriter.getClass();
        notificationEmailSubjectConfig.getClass();
        reverseProtoWriter.writeBytes(notificationEmailSubjectConfig.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, notificationEmailSubjectConfig.custom_subject);
        NotificationEmailSubjectMode.ADAPTER.encodeWithTag(reverseProtoWriter, 1, notificationEmailSubjectConfig.mode);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NotificationEmailSubjectConfig notificationEmailSubjectConfig = (NotificationEmailSubjectConfig) obj;
        notificationEmailSubjectConfig.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, notificationEmailSubjectConfig.custom_subject) + NotificationEmailSubjectMode.ADAPTER.encodedSizeWithTag(1, notificationEmailSubjectConfig.mode) + notificationEmailSubjectConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NotificationEmailSubjectConfig notificationEmailSubjectConfig = (NotificationEmailSubjectConfig) obj;
        notificationEmailSubjectConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        NotificationEmailSubjectMode notificationEmailSubjectMode = notificationEmailSubjectConfig.mode;
        String str = notificationEmailSubjectConfig.custom_subject;
        byteString.getClass();
        return new NotificationEmailSubjectConfig(notificationEmailSubjectMode, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NotificationEmailSubjectConfig notificationEmailSubjectConfig = (NotificationEmailSubjectConfig) obj;
        notificationEmailSubjectConfig.getClass();
        NotificationEmailSubjectMode.ADAPTER.encodeWithTag(protoWriter, 1, notificationEmailSubjectConfig.mode);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, notificationEmailSubjectConfig.custom_subject);
        protoWriter.writeBytes(notificationEmailSubjectConfig.unknownFields());
    }
}
