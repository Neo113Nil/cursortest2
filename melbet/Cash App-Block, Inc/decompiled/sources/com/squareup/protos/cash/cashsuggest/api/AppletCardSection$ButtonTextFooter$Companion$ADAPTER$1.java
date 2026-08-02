package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppletCardSection$ButtonTextFooter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppletCardSection.ButtonTextFooter((LocalizedString) obj, (Button) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppletCardSection.ButtonTextFooter buttonTextFooter = (AppletCardSection.ButtonTextFooter) obj;
        reverseProtoWriter.getClass();
        buttonTextFooter.getClass();
        reverseProtoWriter.writeBytes(buttonTextFooter.unknownFields());
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 2, buttonTextFooter.button);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, buttonTextFooter.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppletCardSection.ButtonTextFooter buttonTextFooter = (AppletCardSection.ButtonTextFooter) obj;
        buttonTextFooter.getClass();
        return Button.ADAPTER.encodedSizeWithTag(2, buttonTextFooter.button) + LocalizedString.ADAPTER.encodedSizeWithTag(1, buttonTextFooter.title) + buttonTextFooter.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppletCardSection.ButtonTextFooter buttonTextFooter = (AppletCardSection.ButtonTextFooter) obj;
        buttonTextFooter.getClass();
        LocalizedString localizedString = buttonTextFooter.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Button button = buttonTextFooter.button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AppletCardSection.ButtonTextFooter(localizedString2, button2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppletCardSection.ButtonTextFooter buttonTextFooter = (AppletCardSection.ButtonTextFooter) obj;
        buttonTextFooter.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, buttonTextFooter.title);
        Button.ADAPTER.encodeWithTag(protoWriter, 2, buttonTextFooter.button);
        protoWriter.writeBytes(buttonTextFooter.unknownFields());
    }
}
