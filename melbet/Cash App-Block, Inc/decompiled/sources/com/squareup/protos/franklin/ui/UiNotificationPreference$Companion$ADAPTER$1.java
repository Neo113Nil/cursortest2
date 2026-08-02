package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiNotificationPreference$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiNotificationPreference((UiAlias) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiAlias.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiNotificationPreference uiNotificationPreference = (UiNotificationPreference) obj;
        reverseProtoWriter.getClass();
        uiNotificationPreference.getClass();
        reverseProtoWriter.writeBytes(uiNotificationPreference.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, uiNotificationPreference.enabled);
        UiAlias.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiNotificationPreference.alias);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiNotificationPreference uiNotificationPreference = (UiNotificationPreference) obj;
        uiNotificationPreference.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, uiNotificationPreference.enabled) + UiAlias.ADAPTER.encodedSizeWithTag(1, uiNotificationPreference.alias) + uiNotificationPreference.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiNotificationPreference uiNotificationPreference = (UiNotificationPreference) obj;
        uiNotificationPreference.getClass();
        UiAlias uiAlias = uiNotificationPreference.alias;
        UiAlias uiAlias2 = uiAlias != null ? (UiAlias) UiAlias.ADAPTER.redact(uiAlias) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = uiNotificationPreference.enabled;
        byteString.getClass();
        return new UiNotificationPreference(uiAlias2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiNotificationPreference uiNotificationPreference = (UiNotificationPreference) obj;
        uiNotificationPreference.getClass();
        UiAlias.ADAPTER.encodeWithTag(protoWriter, 1, uiNotificationPreference.alias);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, uiNotificationPreference.enabled);
        protoWriter.writeBytes(uiNotificationPreference.unknownFields());
    }
}
