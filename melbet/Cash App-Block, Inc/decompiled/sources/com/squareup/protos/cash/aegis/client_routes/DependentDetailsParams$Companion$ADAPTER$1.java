package com.squareup.protos.cash.aegis.client_routes;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DependentDetailsParams$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DependentDetailsParams((DependentDetailsEntryDialog) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(DependentDetailsEntryDialog.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DependentDetailsParams dependentDetailsParams = (DependentDetailsParams) obj;
        reverseProtoWriter.getClass();
        dependentDetailsParams.getClass();
        reverseProtoWriter.writeBytes(dependentDetailsParams.unknownFields());
        DependentDetailsEntryDialog.ADAPTER.encodeWithTag(reverseProtoWriter, 2, dependentDetailsParams.entryDialog);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DependentDetailsParams dependentDetailsParams = (DependentDetailsParams) obj;
        dependentDetailsParams.getClass();
        return DependentDetailsEntryDialog.ADAPTER.encodedSizeWithTag(2, dependentDetailsParams.entryDialog) + dependentDetailsParams.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DependentDetailsParams dependentDetailsParams = (DependentDetailsParams) obj;
        dependentDetailsParams.getClass();
        DependentDetailsEntryDialog dependentDetailsEntryDialog = dependentDetailsParams.entryDialog;
        DependentDetailsEntryDialog dependentDetailsEntryDialog2 = dependentDetailsEntryDialog != null ? (DependentDetailsEntryDialog) DependentDetailsEntryDialog.ADAPTER.redact(dependentDetailsEntryDialog) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DependentDetailsParams(dependentDetailsEntryDialog2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DependentDetailsParams dependentDetailsParams = (DependentDetailsParams) obj;
        dependentDetailsParams.getClass();
        DependentDetailsEntryDialog.ADAPTER.encodeWithTag(protoWriter, 2, dependentDetailsParams.entryDialog);
        protoWriter.writeBytes(dependentDetailsParams.unknownFields());
    }
}
