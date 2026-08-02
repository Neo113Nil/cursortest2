package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppletCardSection$CashCardRenderingConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppletCardSection.CashCardRenderingConfiguration((AppletCardSection.CashCardRenderingConfiguration.DisplayStyle) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = AppletCardSection.CashCardRenderingConfiguration.DisplayStyle.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppletCardSection.CashCardRenderingConfiguration cashCardRenderingConfiguration = (AppletCardSection.CashCardRenderingConfiguration) obj;
        reverseProtoWriter.getClass();
        cashCardRenderingConfiguration.getClass();
        reverseProtoWriter.writeBytes(cashCardRenderingConfiguration.unknownFields());
        AppletCardSection.CashCardRenderingConfiguration.DisplayStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cashCardRenderingConfiguration.display_style);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppletCardSection.CashCardRenderingConfiguration cashCardRenderingConfiguration = (AppletCardSection.CashCardRenderingConfiguration) obj;
        cashCardRenderingConfiguration.getClass();
        return AppletCardSection.CashCardRenderingConfiguration.DisplayStyle.ADAPTER.encodedSizeWithTag(1, cashCardRenderingConfiguration.display_style) + cashCardRenderingConfiguration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppletCardSection.CashCardRenderingConfiguration cashCardRenderingConfiguration = (AppletCardSection.CashCardRenderingConfiguration) obj;
        cashCardRenderingConfiguration.getClass();
        ByteString byteString = ByteString.EMPTY;
        AppletCardSection.CashCardRenderingConfiguration.DisplayStyle displayStyle = cashCardRenderingConfiguration.display_style;
        byteString.getClass();
        return new AppletCardSection.CashCardRenderingConfiguration(displayStyle, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppletCardSection.CashCardRenderingConfiguration cashCardRenderingConfiguration = (AppletCardSection.CashCardRenderingConfiguration) obj;
        cashCardRenderingConfiguration.getClass();
        AppletCardSection.CashCardRenderingConfiguration.DisplayStyle.ADAPTER.encodeWithTag(protoWriter, 1, cashCardRenderingConfiguration.display_style);
        protoWriter.writeBytes(cashCardRenderingConfiguration.unknownFields());
    }
}
