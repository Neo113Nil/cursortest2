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
public final class GenericNonPaymentRenderData$Header$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericNonPaymentRenderData.Header((String) obj, (String) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (LocalizableString) obj5, (LocalizableString) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericNonPaymentRenderData.Header header = (GenericNonPaymentRenderData.Header) obj;
        reverseProtoWriter.getClass();
        header.getClass();
        reverseProtoWriter.writeBytes(header.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, header.localizable_subtext);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, header.localizable_text);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, header.localized_subtext);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, header.localized_text);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, header.subtext);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, header.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericNonPaymentRenderData.Header header = (GenericNonPaymentRenderData.Header) obj;
        header.getClass();
        int size$okio = header.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, header.subtext) + protoAdapter.encodedSizeWithTag(1, header.text) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(4, header.localized_subtext) + protoAdapter2.encodedSizeWithTag(3, header.localized_text) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
        return protoAdapter3.encodedSizeWithTag(6, header.localizable_subtext) + protoAdapter3.encodedSizeWithTag(5, header.localizable_text) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericNonPaymentRenderData.Header header = (GenericNonPaymentRenderData.Header) obj;
        header.getClass();
        LocalizedString localizedString = header.localized_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = header.localized_subtext;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizableString localizableString = header.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = header.localizable_subtext;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = header.text;
        String str2 = header.subtext;
        byteString.getClass();
        return new GenericNonPaymentRenderData.Header(str, str2, localizedString2, localizedString4, localizableString2, localizableString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericNonPaymentRenderData.Header header = (GenericNonPaymentRenderData.Header) obj;
        header.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, header.text);
        protoAdapter.encodeWithTag(protoWriter, 2, header.subtext);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, header.localized_text);
        protoAdapter2.encodeWithTag(protoWriter, 4, header.localized_subtext);
        ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 5, header.localizable_text);
        protoAdapter3.encodeWithTag(protoWriter, 6, header.localizable_subtext);
        protoWriter.writeBytes(header.unknownFields());
    }
}
