package com.squareup.protos.cash.aegis.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Text$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Text((String) obj, (LocalizableString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Text text = (Text) obj;
        reverseProtoWriter.getClass();
        text.getClass();
        reverseProtoWriter.writeBytes(text.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, text.localizable_text);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, text.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Text text = (Text) obj;
        text.getClass();
        return LocalizableString.ADAPTER.encodedSizeWithTag(2, text.localizable_text) + ProtoAdapter.STRING.encodedSizeWithTag(1, text.text) + text.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Text text = (Text) obj;
        text.getClass();
        LocalizableString localizableString = text.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = text.text;
        byteString.getClass();
        return new Text(str, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Text text = (Text) obj;
        text.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, text.text);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 2, text.localizable_text);
        protoWriter.writeBytes(text.unknownFields());
    }
}
