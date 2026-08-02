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
public final class AfterpayAppletEntrypoint$Ineligible$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayAppletEntrypoint.Ineligible((LocalizedString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        AfterpayAppletEntrypoint.Ineligible ineligible = (AfterpayAppletEntrypoint.Ineligible) obj;
        reverseProtoWriter.getClass();
        ineligible.getClass();
        reverseProtoWriter.writeBytes(ineligible.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ineligible.text_line);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletEntrypoint.Ineligible ineligible = (AfterpayAppletEntrypoint.Ineligible) obj;
        ineligible.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(1, ineligible.text_line) + ineligible.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletEntrypoint.Ineligible ineligible = (AfterpayAppletEntrypoint.Ineligible) obj;
        ineligible.getClass();
        LocalizedString localizedString = ineligible.text_line;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AfterpayAppletEntrypoint.Ineligible(localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletEntrypoint.Ineligible ineligible = (AfterpayAppletEntrypoint.Ineligible) obj;
        ineligible.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, ineligible.text_line);
        protoWriter.writeBytes(ineligible.unknownFields());
    }
}
