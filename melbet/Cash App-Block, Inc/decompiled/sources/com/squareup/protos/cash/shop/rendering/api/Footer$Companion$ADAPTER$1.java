package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Footer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Footer((Icon) obj, (LocalizedString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Footer footer = (Footer) obj;
        reverseProtoWriter.getClass();
        footer.getClass();
        reverseProtoWriter.writeBytes(footer.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, footer.footer_markdown_text);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, footer.arcade_icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Footer footer = (Footer) obj;
        footer.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(2, footer.footer_markdown_text) + Icon.ADAPTER.encodedSizeWithTag(1, footer.arcade_icon) + footer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Footer footer = (Footer) obj;
        footer.getClass();
        Icon icon = footer.arcade_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        LocalizedString localizedString = footer.footer_markdown_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Footer(icon2, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Footer footer = (Footer) obj;
        footer.getClass();
        Icon.ADAPTER.encodeWithTag(protoWriter, 1, footer.arcade_icon);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, footer.footer_markdown_text);
        protoWriter.writeBytes(footer.unknownFields());
    }
}
