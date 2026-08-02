package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint$Uninstalled$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayAppletEntrypoint.Uninstalled((UiAvatar) obj, (LocalizedString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletEntrypoint.Uninstalled uninstalled = (AfterpayAppletEntrypoint.Uninstalled) obj;
        reverseProtoWriter.getClass();
        uninstalled.getClass();
        reverseProtoWriter.writeBytes(uninstalled.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, uninstalled.body);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uninstalled.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletEntrypoint.Uninstalled uninstalled = (AfterpayAppletEntrypoint.Uninstalled) obj;
        uninstalled.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(2, uninstalled.body) + UiAvatar.ADAPTER.encodedSizeWithTag(1, uninstalled.avatar) + uninstalled.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletEntrypoint.Uninstalled uninstalled = (AfterpayAppletEntrypoint.Uninstalled) obj;
        uninstalled.getClass();
        UiAvatar uiAvatar = uninstalled.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        LocalizedString localizedString = uninstalled.body;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AfterpayAppletEntrypoint.Uninstalled(uiAvatar2, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletEntrypoint.Uninstalled uninstalled = (AfterpayAppletEntrypoint.Uninstalled) obj;
        uninstalled.getClass();
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 1, uninstalled.avatar);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, uninstalled.body);
        protoWriter.writeBytes(uninstalled.unknownFields());
    }
}
