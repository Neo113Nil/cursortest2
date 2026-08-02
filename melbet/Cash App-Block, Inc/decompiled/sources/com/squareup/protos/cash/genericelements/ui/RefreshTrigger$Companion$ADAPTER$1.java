package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.RefreshTrigger;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RefreshTrigger$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        RefreshTrigger$Trigger$BoostContentUpdate refreshTrigger$Trigger$BoostContentUpdate = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RefreshTrigger(refreshTrigger$Trigger$BoostContentUpdate, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                refreshTrigger$Trigger$BoostContentUpdate = new RefreshTrigger$Trigger$BoostContentUpdate((RefreshTrigger.BoostContentUpdateTrigger) RefreshTrigger.BoostContentUpdateTrigger.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RefreshTrigger refreshTrigger = (RefreshTrigger) obj;
        reverseProtoWriter.getClass();
        refreshTrigger.getClass();
        reverseProtoWriter.writeBytes(refreshTrigger.unknownFields());
        RefreshTrigger$Trigger$BoostContentUpdate refreshTrigger$Trigger$BoostContentUpdate = refreshTrigger.trigger;
        if (refreshTrigger$Trigger$BoostContentUpdate != null) {
            RefreshTrigger.BoostContentUpdateTrigger.ADAPTER.encodeWithTag(reverseProtoWriter, 1, refreshTrigger$Trigger$BoostContentUpdate.value);
        } else {
            if (refreshTrigger$Trigger$BoostContentUpdate == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RefreshTrigger refreshTrigger = (RefreshTrigger) obj;
        refreshTrigger.getClass();
        int size$okio = refreshTrigger.unknownFields().getSize$okio();
        RefreshTrigger$Trigger$BoostContentUpdate refreshTrigger$Trigger$BoostContentUpdate = refreshTrigger.trigger;
        if (refreshTrigger$Trigger$BoostContentUpdate != null) {
            return RefreshTrigger.BoostContentUpdateTrigger.ADAPTER.encodedSizeWithTag(1, refreshTrigger$Trigger$BoostContentUpdate.value) + size$okio;
        }
        if (refreshTrigger$Trigger$BoostContentUpdate == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RefreshTrigger refreshTrigger = (RefreshTrigger) obj;
        refreshTrigger.getClass();
        ByteString byteString = ByteString.EMPTY;
        RefreshTrigger$Trigger$BoostContentUpdate refreshTrigger$Trigger$BoostContentUpdate = refreshTrigger.trigger;
        byteString.getClass();
        return new RefreshTrigger(refreshTrigger$Trigger$BoostContentUpdate, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RefreshTrigger refreshTrigger = (RefreshTrigger) obj;
        refreshTrigger.getClass();
        RefreshTrigger$Trigger$BoostContentUpdate refreshTrigger$Trigger$BoostContentUpdate = refreshTrigger.trigger;
        if (refreshTrigger$Trigger$BoostContentUpdate != null) {
            RefreshTrigger.BoostContentUpdateTrigger.ADAPTER.encodeWithTag(protoWriter, 1, refreshTrigger$Trigger$BoostContentUpdate.value);
        } else if (refreshTrigger$Trigger$BoostContentUpdate != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(refreshTrigger.unknownFields());
    }
}
