package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint$Overdue$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayAppletEntrypoint.Overdue((LocalizedString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletEntrypoint.Overdue overdue = (AfterpayAppletEntrypoint.Overdue) obj;
        reverseProtoWriter.getClass();
        overdue.getClass();
        reverseProtoWriter.writeBytes(overdue.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, overdue.overdue_suffix);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletEntrypoint.Overdue overdue = (AfterpayAppletEntrypoint.Overdue) obj;
        overdue.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(1, overdue.overdue_suffix) + overdue.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletEntrypoint.Overdue overdue = (AfterpayAppletEntrypoint.Overdue) obj;
        overdue.getClass();
        LocalizedString localizedString = overdue.overdue_suffix;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AfterpayAppletEntrypoint.Overdue(localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletEntrypoint.Overdue overdue = (AfterpayAppletEntrypoint.Overdue) obj;
        overdue.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, overdue.overdue_suffix);
        protoWriter.writeBytes(overdue.unknownFields());
    }
}
