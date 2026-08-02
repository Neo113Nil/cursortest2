package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.ProgressRing;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$TextContent$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$TextContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProgressRing$ProgressRingContent$TextContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProgressRing.ProgressRingContent.TextContent((String) obj, (Color) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProgressRing.ProgressRingContent.TextContent textContent = (ProgressRing.ProgressRingContent.TextContent) obj;
        reverseProtoWriter.getClass();
        textContent.getClass();
        reverseProtoWriter.writeBytes(textContent.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, textContent.background_color);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, textContent.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProgressRing.ProgressRingContent.TextContent textContent = (ProgressRing.ProgressRingContent.TextContent) obj;
        textContent.getClass();
        return Color.ADAPTER.encodedSizeWithTag(2, textContent.background_color) + ProtoAdapter.STRING.encodedSizeWithTag(1, textContent.text) + textContent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProgressRing.ProgressRingContent.TextContent textContent = (ProgressRing.ProgressRingContent.TextContent) obj;
        textContent.getClass();
        Color color = textContent.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = textContent.text;
        byteString.getClass();
        return new ProgressRing.ProgressRingContent.TextContent(str, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProgressRing.ProgressRingContent.TextContent textContent = (ProgressRing.ProgressRingContent.TextContent) obj;
        textContent.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, textContent.text);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, textContent.background_color);
        protoWriter.writeBytes(textContent.unknownFields());
    }
}
