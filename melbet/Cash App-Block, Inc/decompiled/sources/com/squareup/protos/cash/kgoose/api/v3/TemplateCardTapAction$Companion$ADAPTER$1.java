package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/TemplateCardTapAction$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCardTapAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TemplateCardTapAction((TemplateCardAction) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(TemplateCardAction.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TemplateCardTapAction templateCardTapAction = (TemplateCardTapAction) obj;
        reverseProtoWriter.getClass();
        templateCardTapAction.getClass();
        reverseProtoWriter.writeBytes(templateCardTapAction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, templateCardTapAction.hidden_message_template);
        TemplateCardAction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, templateCardTapAction.action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TemplateCardTapAction templateCardTapAction = (TemplateCardTapAction) obj;
        templateCardTapAction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, templateCardTapAction.hidden_message_template) + TemplateCardAction.ADAPTER.encodedSizeWithTag(1, templateCardTapAction.action) + templateCardTapAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TemplateCardTapAction templateCardTapAction = (TemplateCardTapAction) obj;
        templateCardTapAction.getClass();
        TemplateCardAction templateCardAction = templateCardTapAction.action;
        TemplateCardAction templateCardAction2 = templateCardAction != null ? (TemplateCardAction) TemplateCardAction.ADAPTER.redact(templateCardAction) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = templateCardTapAction.hidden_message_template;
        byteString.getClass();
        return new TemplateCardTapAction(templateCardAction2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TemplateCardTapAction templateCardTapAction = (TemplateCardTapAction) obj;
        templateCardTapAction.getClass();
        TemplateCardAction.ADAPTER.encodeWithTag(protoWriter, 1, templateCardTapAction.action);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, templateCardTapAction.hidden_message_template);
        protoWriter.writeBytes(templateCardTapAction.unknownFields());
    }
}
