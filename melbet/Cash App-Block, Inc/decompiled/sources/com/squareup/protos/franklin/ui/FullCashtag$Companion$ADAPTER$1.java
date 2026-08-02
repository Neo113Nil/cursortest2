package com.squareup.protos.franklin.ui;

import com.squareup.protos.common.CurrencyCode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FullCashtag$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FullCashtag((String) obj, (String) obj2, (CurrencyCode) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    try {
                        obj3 = CurrencyCode.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FullCashtag fullCashtag = (FullCashtag) obj;
        reverseProtoWriter.getClass();
        fullCashtag.getClass();
        reverseProtoWriter.writeBytes(fullCashtag.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, fullCashtag.printable_cashtag_qr_image_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, fullCashtag.cashtag_qr_image_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, fullCashtag.cashtag_url_display_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, fullCashtag.cashtag_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, fullCashtag.avatar_version);
        CurrencyCode.ADAPTER.encodeWithTag(reverseProtoWriter, 3, fullCashtag.currency);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, fullCashtag.cashtag_display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, fullCashtag.base_dot_app_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FullCashtag fullCashtag = (FullCashtag) obj;
        fullCashtag.getClass();
        int size$okio = fullCashtag.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(8, fullCashtag.printable_cashtag_qr_image_url) + protoAdapter.encodedSizeWithTag(7, fullCashtag.cashtag_qr_image_url) + protoAdapter.encodedSizeWithTag(6, fullCashtag.cashtag_url_display_text) + protoAdapter.encodedSizeWithTag(5, fullCashtag.cashtag_url) + protoAdapter.encodedSizeWithTag(4, fullCashtag.avatar_version) + CurrencyCode.ADAPTER.encodedSizeWithTag(3, fullCashtag.currency) + protoAdapter.encodedSizeWithTag(2, fullCashtag.cashtag_display_name) + protoAdapter.encodedSizeWithTag(1, fullCashtag.base_dot_app_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FullCashtag fullCashtag = (FullCashtag) obj;
        fullCashtag.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = fullCashtag.base_dot_app_url;
        CurrencyCode currencyCode = fullCashtag.currency;
        String str2 = fullCashtag.avatar_version;
        byteString.getClass();
        return new FullCashtag(str, null, currencyCode, str2, null, null, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FullCashtag fullCashtag = (FullCashtag) obj;
        fullCashtag.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, fullCashtag.base_dot_app_url);
        protoAdapter.encodeWithTag(protoWriter, 2, fullCashtag.cashtag_display_name);
        CurrencyCode.ADAPTER.encodeWithTag(protoWriter, 3, fullCashtag.currency);
        protoAdapter.encodeWithTag(protoWriter, 4, fullCashtag.avatar_version);
        protoAdapter.encodeWithTag(protoWriter, 5, fullCashtag.cashtag_url);
        protoAdapter.encodeWithTag(protoWriter, 6, fullCashtag.cashtag_url_display_text);
        protoAdapter.encodeWithTag(protoWriter, 7, fullCashtag.cashtag_qr_image_url);
        protoAdapter.encodeWithTag(protoWriter, 8, fullCashtag.printable_cashtag_qr_image_url);
        protoWriter.writeBytes(fullCashtag.unknownFields());
    }
}
