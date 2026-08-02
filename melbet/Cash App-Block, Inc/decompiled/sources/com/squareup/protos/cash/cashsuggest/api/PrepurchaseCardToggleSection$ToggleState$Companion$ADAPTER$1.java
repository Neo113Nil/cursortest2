package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.cashsuggest.api.PrepurchaseCardToggleSection;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrepurchaseCardToggleSection$ToggleState$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseCardToggleSection.ToggleState((AppletCardSection.StandardHeader) obj, (LocalizedString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AppletCardSection.StandardHeader.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseCardToggleSection.ToggleState toggleState = (PrepurchaseCardToggleSection.ToggleState) obj;
        reverseProtoWriter.getClass();
        toggleState.getClass();
        reverseProtoWriter.writeBytes(toggleState.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, toggleState.footer_label);
        AppletCardSection.StandardHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 1, toggleState.header);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseCardToggleSection.ToggleState toggleState = (PrepurchaseCardToggleSection.ToggleState) obj;
        toggleState.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(3, toggleState.footer_label) + AppletCardSection.StandardHeader.ADAPTER.encodedSizeWithTag(1, toggleState.header) + toggleState.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseCardToggleSection.ToggleState toggleState = (PrepurchaseCardToggleSection.ToggleState) obj;
        toggleState.getClass();
        AppletCardSection.StandardHeader standardHeader = toggleState.header;
        AppletCardSection.StandardHeader standardHeader2 = standardHeader != null ? (AppletCardSection.StandardHeader) AppletCardSection.StandardHeader.ADAPTER.redact(standardHeader) : null;
        LocalizedString localizedString = toggleState.footer_label;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PrepurchaseCardToggleSection.ToggleState(standardHeader2, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseCardToggleSection.ToggleState toggleState = (PrepurchaseCardToggleSection.ToggleState) obj;
        toggleState.getClass();
        AppletCardSection.StandardHeader.ADAPTER.encodeWithTag(protoWriter, 1, toggleState.header);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, toggleState.footer_label);
        protoWriter.writeBytes(toggleState.unknownFields());
    }
}
