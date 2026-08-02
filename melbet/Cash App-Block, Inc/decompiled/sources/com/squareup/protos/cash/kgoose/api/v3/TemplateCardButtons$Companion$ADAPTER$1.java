package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/TemplateCardButtons$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardButtons;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCardButtons$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TemplateCardButtons((TemplateCardButton) obj, (TemplateCardButton) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(TemplateCardButton.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(TemplateCardButton.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TemplateCardButtons templateCardButtons = (TemplateCardButtons) obj;
        reverseProtoWriter.getClass();
        templateCardButtons.getClass();
        reverseProtoWriter.writeBytes(templateCardButtons.unknownFields());
        ProtoAdapter protoAdapter = TemplateCardButton.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, templateCardButtons.secondary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, templateCardButtons.primary_button);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TemplateCardButtons templateCardButtons = (TemplateCardButtons) obj;
        templateCardButtons.getClass();
        int size$okio = templateCardButtons.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = TemplateCardButton.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, templateCardButtons.secondary_button) + protoAdapter.encodedSizeWithTag(1, templateCardButtons.primary_button) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TemplateCardButtons templateCardButtons = (TemplateCardButtons) obj;
        templateCardButtons.getClass();
        TemplateCardButton templateCardButton = templateCardButtons.primary_button;
        TemplateCardButton templateCardButton2 = templateCardButton != null ? (TemplateCardButton) TemplateCardButton.ADAPTER.redact(templateCardButton) : null;
        TemplateCardButton templateCardButton3 = templateCardButtons.secondary_button;
        TemplateCardButton templateCardButton4 = templateCardButton3 != null ? (TemplateCardButton) TemplateCardButton.ADAPTER.redact(templateCardButton3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TemplateCardButtons(templateCardButton2, templateCardButton4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TemplateCardButtons templateCardButtons = (TemplateCardButtons) obj;
        templateCardButtons.getClass();
        ProtoAdapter protoAdapter = TemplateCardButton.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, templateCardButtons.primary_button);
        protoAdapter.encodeWithTag(protoWriter, 2, templateCardButtons.secondary_button);
        protoWriter.writeBytes(templateCardButtons.unknownFields());
    }
}
