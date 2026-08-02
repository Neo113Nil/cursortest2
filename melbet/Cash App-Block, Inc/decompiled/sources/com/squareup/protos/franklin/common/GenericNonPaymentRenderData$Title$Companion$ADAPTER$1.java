package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.common.GenericNonPaymentRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GenericNonPaymentRenderData$Title$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GenericNonPaymentRenderData.Title((String) obj, (LocalizedString) obj2, (LocalizableString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericNonPaymentRenderData.Title title = (GenericNonPaymentRenderData.Title) obj;
        reverseProtoWriter.getClass();
        title.getClass();
        reverseProtoWriter.writeBytes(title.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, title.localizable_text);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, title.localized_text);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, title.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericNonPaymentRenderData.Title title = (GenericNonPaymentRenderData.Title) obj;
        title.getClass();
        return LocalizableString.ADAPTER.encodedSizeWithTag(3, title.localizable_text) + LocalizedString.ADAPTER.encodedSizeWithTag(2, title.localized_text) + ProtoAdapter.STRING.encodedSizeWithTag(1, title.text) + title.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericNonPaymentRenderData.Title title = (GenericNonPaymentRenderData.Title) obj;
        title.getClass();
        LocalizedString localizedString = title.localized_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizableString localizableString = title.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = title.text;
        byteString.getClass();
        return new GenericNonPaymentRenderData.Title(str, localizedString2, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericNonPaymentRenderData.Title title = (GenericNonPaymentRenderData.Title) obj;
        title.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, title.text);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, title.localized_text);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 3, title.localizable_text);
        protoWriter.writeBytes(title.unknownFields());
    }
}
