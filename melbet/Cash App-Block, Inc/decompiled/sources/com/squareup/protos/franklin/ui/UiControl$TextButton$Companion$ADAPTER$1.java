package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiControl$TextButton$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiControl.TextButton((String) obj, (LocalizableString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiControl.TextButton textButton = (UiControl.TextButton) obj;
        reverseProtoWriter.getClass();
        textButton.getClass();
        reverseProtoWriter.writeBytes(textButton.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 5, textButton.localizable_text);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, textButton.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiControl.TextButton textButton = (UiControl.TextButton) obj;
        textButton.getClass();
        return LocalizableString.ADAPTER.encodedSizeWithTag(5, textButton.localizable_text) + ProtoAdapter.STRING.encodedSizeWithTag(1, textButton.text) + textButton.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiControl.TextButton textButton = (UiControl.TextButton) obj;
        textButton.getClass();
        LocalizableString localizableString = textButton.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = textButton.text;
        byteString.getClass();
        return new UiControl.TextButton(str, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiControl.TextButton textButton = (UiControl.TextButton) obj;
        textButton.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, textButton.text);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 5, textButton.localizable_text);
        protoWriter.writeBytes(textButton.unknownFields());
    }
}
