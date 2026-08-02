package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.ActionableButtonDefault;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/TemplateCardButton$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardButton;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCardButton$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TemplateCardButton((ActionableButtonDefault) obj, (TemplateCardAction) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ActionableButtonDefault.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(TemplateCardAction.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TemplateCardButton templateCardButton = (TemplateCardButton) obj;
        reverseProtoWriter.getClass();
        templateCardButton.getClass();
        reverseProtoWriter.writeBytes(templateCardButton.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, templateCardButton.hidden_message_template);
        TemplateCardAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, templateCardButton.action);
        ActionableButtonDefault.ADAPTER.encodeWithTag(reverseProtoWriter, 1, templateCardButton.button);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TemplateCardButton templateCardButton = (TemplateCardButton) obj;
        templateCardButton.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, templateCardButton.hidden_message_template) + TemplateCardAction.ADAPTER.encodedSizeWithTag(2, templateCardButton.action) + ActionableButtonDefault.ADAPTER.encodedSizeWithTag(1, templateCardButton.button) + templateCardButton.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TemplateCardButton templateCardButton = (TemplateCardButton) obj;
        templateCardButton.getClass();
        ActionableButtonDefault actionableButtonDefault = templateCardButton.button;
        ActionableButtonDefault actionableButtonDefault2 = actionableButtonDefault != null ? (ActionableButtonDefault) ActionableButtonDefault.ADAPTER.redact(actionableButtonDefault) : null;
        TemplateCardAction templateCardAction = templateCardButton.action;
        TemplateCardAction templateCardAction2 = templateCardAction != null ? (TemplateCardAction) TemplateCardAction.ADAPTER.redact(templateCardAction) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = templateCardButton.hidden_message_template;
        byteString.getClass();
        return new TemplateCardButton(actionableButtonDefault2, templateCardAction2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TemplateCardButton templateCardButton = (TemplateCardButton) obj;
        templateCardButton.getClass();
        ActionableButtonDefault.ADAPTER.encodeWithTag(protoWriter, 1, templateCardButton.button);
        TemplateCardAction.ADAPTER.encodeWithTag(protoWriter, 2, templateCardButton.action);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, templateCardButton.hidden_message_template);
        protoWriter.writeBytes(templateCardButton.unknownFields());
    }
}
