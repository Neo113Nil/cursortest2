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
public final class AfterpayAppletEntrypoint$V3Uninstalled$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayAppletEntrypoint.V3Uninstalled((LocalizedString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletEntrypoint.V3Uninstalled v3Uninstalled = (AfterpayAppletEntrypoint.V3Uninstalled) obj;
        reverseProtoWriter.getClass();
        v3Uninstalled.getClass();
        reverseProtoWriter.writeBytes(v3Uninstalled.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, v3Uninstalled.body);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletEntrypoint.V3Uninstalled v3Uninstalled = (AfterpayAppletEntrypoint.V3Uninstalled) obj;
        v3Uninstalled.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(2, v3Uninstalled.body) + v3Uninstalled.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletEntrypoint.V3Uninstalled v3Uninstalled = (AfterpayAppletEntrypoint.V3Uninstalled) obj;
        v3Uninstalled.getClass();
        LocalizedString localizedString = v3Uninstalled.body;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AfterpayAppletEntrypoint.V3Uninstalled(localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletEntrypoint.V3Uninstalled v3Uninstalled = (AfterpayAppletEntrypoint.V3Uninstalled) obj;
        v3Uninstalled.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, v3Uninstalled.body);
        protoWriter.writeBytes(v3Uninstalled.unknownFields());
    }
}
