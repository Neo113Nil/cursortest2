package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.common.GenericNonPaymentRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GenericNonPaymentRenderData$TertiaryLabelSuffix$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericNonPaymentRenderData.TertiaryLabelSuffix((String) obj, (LocalizableString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GenericNonPaymentRenderData.TertiaryLabelSuffix tertiaryLabelSuffix = (GenericNonPaymentRenderData.TertiaryLabelSuffix) obj;
        reverseProtoWriter.getClass();
        tertiaryLabelSuffix.getClass();
        reverseProtoWriter.writeBytes(tertiaryLabelSuffix.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, tertiaryLabelSuffix.localizable_text);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, tertiaryLabelSuffix.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericNonPaymentRenderData.TertiaryLabelSuffix tertiaryLabelSuffix = (GenericNonPaymentRenderData.TertiaryLabelSuffix) obj;
        tertiaryLabelSuffix.getClass();
        return LocalizableString.ADAPTER.encodedSizeWithTag(2, tertiaryLabelSuffix.localizable_text) + ProtoAdapter.STRING.encodedSizeWithTag(1, tertiaryLabelSuffix.text) + tertiaryLabelSuffix.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericNonPaymentRenderData.TertiaryLabelSuffix tertiaryLabelSuffix = (GenericNonPaymentRenderData.TertiaryLabelSuffix) obj;
        tertiaryLabelSuffix.getClass();
        LocalizableString localizableString = tertiaryLabelSuffix.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = tertiaryLabelSuffix.text;
        byteString.getClass();
        return new GenericNonPaymentRenderData.TertiaryLabelSuffix(str, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericNonPaymentRenderData.TertiaryLabelSuffix tertiaryLabelSuffix = (GenericNonPaymentRenderData.TertiaryLabelSuffix) obj;
        tertiaryLabelSuffix.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, tertiaryLabelSuffix.text);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 2, tertiaryLabelSuffix.localizable_text);
        protoWriter.writeBytes(tertiaryLabelSuffix.unknownFields());
    }
}
