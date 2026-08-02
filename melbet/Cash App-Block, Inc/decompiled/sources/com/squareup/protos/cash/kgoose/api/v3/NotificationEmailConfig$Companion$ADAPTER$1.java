package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/NotificationEmailConfig$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NotificationEmailConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NotificationEmailConfig(m, (NotificationEmailSubjectConfig) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(NotificationEmailSubjectConfig.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NotificationEmailConfig notificationEmailConfig = (NotificationEmailConfig) obj;
        reverseProtoWriter.getClass();
        notificationEmailConfig.getClass();
        reverseProtoWriter.writeBytes(notificationEmailConfig.unknownFields());
        NotificationEmailSubjectConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 2, notificationEmailConfig.subject);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, notificationEmailConfig.recipients);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NotificationEmailConfig notificationEmailConfig = (NotificationEmailConfig) obj;
        notificationEmailConfig.getClass();
        return NotificationEmailSubjectConfig.ADAPTER.encodedSizeWithTag(2, notificationEmailConfig.subject) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, notificationEmailConfig.recipients) + notificationEmailConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NotificationEmailConfig notificationEmailConfig = (NotificationEmailConfig) obj;
        notificationEmailConfig.getClass();
        NotificationEmailSubjectConfig notificationEmailSubjectConfig = notificationEmailConfig.subject;
        NotificationEmailSubjectConfig notificationEmailSubjectConfig2 = notificationEmailSubjectConfig != null ? (NotificationEmailSubjectConfig) NotificationEmailSubjectConfig.ADAPTER.redact(notificationEmailSubjectConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        List<String> list = notificationEmailConfig.recipients;
        list.getClass();
        byteString.getClass();
        return new NotificationEmailConfig(list, notificationEmailSubjectConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NotificationEmailConfig notificationEmailConfig = (NotificationEmailConfig) obj;
        notificationEmailConfig.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, notificationEmailConfig.recipients);
        NotificationEmailSubjectConfig.ADAPTER.encodeWithTag(protoWriter, 2, notificationEmailConfig.subject);
        protoWriter.writeBytes(notificationEmailConfig.unknownFields());
    }
}
