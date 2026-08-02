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
public final class AfterpayAppletEntrypoint$V3TextBrief$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayAppletEntrypoint.V3TextBrief((UiAvatar) obj, (LocalizedString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        AfterpayAppletEntrypoint.V3TextBrief v3TextBrief = (AfterpayAppletEntrypoint.V3TextBrief) obj;
        reverseProtoWriter.getClass();
        v3TextBrief.getClass();
        reverseProtoWriter.writeBytes(v3TextBrief.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, v3TextBrief.text);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, v3TextBrief.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletEntrypoint.V3TextBrief v3TextBrief = (AfterpayAppletEntrypoint.V3TextBrief) obj;
        v3TextBrief.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(2, v3TextBrief.text) + UiAvatar.ADAPTER.encodedSizeWithTag(1, v3TextBrief.avatar) + v3TextBrief.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletEntrypoint.V3TextBrief v3TextBrief = (AfterpayAppletEntrypoint.V3TextBrief) obj;
        v3TextBrief.getClass();
        UiAvatar uiAvatar = v3TextBrief.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        LocalizedString localizedString = v3TextBrief.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AfterpayAppletEntrypoint.V3TextBrief(uiAvatar2, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletEntrypoint.V3TextBrief v3TextBrief = (AfterpayAppletEntrypoint.V3TextBrief) obj;
        v3TextBrief.getClass();
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 1, v3TextBrief.avatar);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, v3TextBrief.text);
        protoWriter.writeBytes(v3TextBrief.unknownFields());
    }
}
