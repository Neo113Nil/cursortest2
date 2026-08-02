package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ScheduledReloadData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiScheduledPayments$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiScheduledPayments((ScheduledReloadData) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ScheduledReloadData.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiScheduledPayments uiScheduledPayments = (UiScheduledPayments) obj;
        reverseProtoWriter.getClass();
        uiScheduledPayments.getClass();
        reverseProtoWriter.writeBytes(uiScheduledPayments.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, uiScheduledPayments.scheduled_reload_enabled);
        ScheduledReloadData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiScheduledPayments.scheduled_reload_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiScheduledPayments uiScheduledPayments = (UiScheduledPayments) obj;
        uiScheduledPayments.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, uiScheduledPayments.scheduled_reload_enabled) + ScheduledReloadData.ADAPTER.encodedSizeWithTag(1, uiScheduledPayments.scheduled_reload_data) + uiScheduledPayments.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiScheduledPayments uiScheduledPayments = (UiScheduledPayments) obj;
        uiScheduledPayments.getClass();
        ScheduledReloadData scheduledReloadData = uiScheduledPayments.scheduled_reload_data;
        ScheduledReloadData scheduledReloadData2 = scheduledReloadData != null ? (ScheduledReloadData) ScheduledReloadData.ADAPTER.redact(scheduledReloadData) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = uiScheduledPayments.scheduled_reload_enabled;
        byteString.getClass();
        return new UiScheduledPayments(scheduledReloadData2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiScheduledPayments uiScheduledPayments = (UiScheduledPayments) obj;
        uiScheduledPayments.getClass();
        ScheduledReloadData.ADAPTER.encodeWithTag(protoWriter, 1, uiScheduledPayments.scheduled_reload_data);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, uiScheduledPayments.scheduled_reload_enabled);
        protoWriter.writeBytes(uiScheduledPayments.unknownFields());
    }
}
