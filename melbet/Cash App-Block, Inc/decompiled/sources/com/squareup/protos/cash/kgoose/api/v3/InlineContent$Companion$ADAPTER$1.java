package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.InlineContent;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/InlineContent$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/InlineContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InlineContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        InlineContent.Content.EditableField editableField = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InlineContent((String) obj, editableField, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                editableField = new InlineContent.Content.EditableField((EditableField) EditableField.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InlineContent inlineContent = (InlineContent) obj;
        reverseProtoWriter.getClass();
        inlineContent.getClass();
        reverseProtoWriter.writeBytes(inlineContent.unknownFields());
        InlineContent.Content content = inlineContent.content;
        if (content instanceof InlineContent.Content.EditableField) {
            EditableField.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((InlineContent.Content.EditableField) content).getValue());
        } else if (content != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, inlineContent.placeholder_key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InlineContent inlineContent = (InlineContent) obj;
        inlineContent.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, inlineContent.placeholder_key) + inlineContent.unknownFields().getSize$okio();
        InlineContent.Content content = inlineContent.content;
        if (content instanceof InlineContent.Content.EditableField) {
            return EditableField.ADAPTER.encodedSizeWithTag(3, ((InlineContent.Content.EditableField) content).getValue()) + encodedSizeWithTag;
        }
        if (content == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InlineContent inlineContent = (InlineContent) obj;
        inlineContent.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = inlineContent.placeholder_key;
        InlineContent.Content content = inlineContent.content;
        byteString.getClass();
        return new InlineContent(str, content, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InlineContent inlineContent = (InlineContent) obj;
        inlineContent.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, inlineContent.placeholder_key);
        InlineContent.Content content = inlineContent.content;
        if (content instanceof InlineContent.Content.EditableField) {
            EditableField.ADAPTER.encodeWithTag(protoWriter, 3, ((InlineContent.Content.EditableField) content).getValue());
        } else if (content != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(inlineContent.unknownFields());
    }
}
