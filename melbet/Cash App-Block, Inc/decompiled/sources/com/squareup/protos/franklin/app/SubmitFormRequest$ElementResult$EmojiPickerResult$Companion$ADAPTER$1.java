package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$EmojiPickerResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitFormRequest.ElementResult.EmojiPickerResult((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitFormRequest.ElementResult.EmojiPickerResult emojiPickerResult = (SubmitFormRequest.ElementResult.EmojiPickerResult) obj;
        reverseProtoWriter.getClass();
        emojiPickerResult.getClass();
        reverseProtoWriter.writeBytes(emojiPickerResult.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, emojiPickerResult.selection);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitFormRequest.ElementResult.EmojiPickerResult emojiPickerResult = (SubmitFormRequest.ElementResult.EmojiPickerResult) obj;
        emojiPickerResult.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, emojiPickerResult.selection) + emojiPickerResult.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitFormRequest.ElementResult.EmojiPickerResult emojiPickerResult = (SubmitFormRequest.ElementResult.EmojiPickerResult) obj;
        emojiPickerResult.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = emojiPickerResult.selection;
        byteString.getClass();
        return new SubmitFormRequest.ElementResult.EmojiPickerResult(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitFormRequest.ElementResult.EmojiPickerResult emojiPickerResult = (SubmitFormRequest.ElementResult.EmojiPickerResult) obj;
        emojiPickerResult.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, emojiPickerResult.selection);
        protoWriter.writeBytes(emojiPickerResult.unknownFields());
    }
}
