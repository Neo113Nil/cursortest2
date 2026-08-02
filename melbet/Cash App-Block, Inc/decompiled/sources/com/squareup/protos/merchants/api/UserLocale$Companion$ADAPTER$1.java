package com.squareup.protos.merchants.api;

import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.countries.Country;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UserLocale$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UserLocale((Country) obj, (String) obj2, (CurrencyCode) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Country.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = CurrencyCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UserLocale userLocale = (UserLocale) obj;
        reverseProtoWriter.getClass();
        userLocale.getClass();
        reverseProtoWriter.writeBytes(userLocale.unknownFields());
        CurrencyCode.ADAPTER.encodeWithTag(reverseProtoWriter, 3, userLocale.currency_code);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, userLocale.language_code);
        Country.ADAPTER.encodeWithTag(reverseProtoWriter, 1, userLocale.country_code);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UserLocale userLocale = (UserLocale) obj;
        userLocale.getClass();
        return CurrencyCode.ADAPTER.encodedSizeWithTag(3, userLocale.currency_code) + ProtoAdapter.STRING.encodedSizeWithTag(2, userLocale.language_code) + Country.ADAPTER.encodedSizeWithTag(1, userLocale.country_code) + userLocale.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UserLocale userLocale = (UserLocale) obj;
        userLocale.getClass();
        ByteString byteString = ByteString.EMPTY;
        Country country = userLocale.country_code;
        String str = userLocale.language_code;
        CurrencyCode currencyCode = userLocale.currency_code;
        byteString.getClass();
        return new UserLocale(country, str, currencyCode, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UserLocale userLocale = (UserLocale) obj;
        userLocale.getClass();
        Country.ADAPTER.encodeWithTag(protoWriter, 1, userLocale.country_code);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, userLocale.language_code);
        CurrencyCode.ADAPTER.encodeWithTag(protoWriter, 3, userLocale.currency_code);
        protoWriter.writeBytes(userLocale.unknownFields());
    }
}
