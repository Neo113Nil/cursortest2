package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CryptocurrencyConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CryptocurrencyConfig((Long) obj5, (String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CryptocurrencyConfig cryptocurrencyConfig = (CryptocurrencyConfig) obj;
        reverseProtoWriter.getClass();
        cryptocurrencyConfig.getClass();
        reverseProtoWriter.writeBytes(cryptocurrencyConfig.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 5, cryptocurrencyConfig.minimum_withdrawal_limit_sats);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cryptocurrencyConfig.dismiss_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cryptocurrencyConfig.learn_about_btc_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cryptocurrencyConfig.learn_about_btc_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cryptocurrencyConfig.btc_welcome_message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CryptocurrencyConfig cryptocurrencyConfig = (CryptocurrencyConfig) obj;
        cryptocurrencyConfig.getClass();
        int size$okio = cryptocurrencyConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT64.encodedSizeWithTag(5, cryptocurrencyConfig.minimum_withdrawal_limit_sats) + protoAdapter.encodedSizeWithTag(4, cryptocurrencyConfig.dismiss_button_text) + protoAdapter.encodedSizeWithTag(3, cryptocurrencyConfig.learn_about_btc_url) + protoAdapter.encodedSizeWithTag(2, cryptocurrencyConfig.learn_about_btc_button_text) + protoAdapter.encodedSizeWithTag(1, cryptocurrencyConfig.btc_welcome_message) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CryptocurrencyConfig cryptocurrencyConfig = (CryptocurrencyConfig) obj;
        cryptocurrencyConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = cryptocurrencyConfig.btc_welcome_message;
        String str2 = cryptocurrencyConfig.learn_about_btc_button_text;
        String str3 = cryptocurrencyConfig.learn_about_btc_url;
        String str4 = cryptocurrencyConfig.dismiss_button_text;
        Long l = cryptocurrencyConfig.minimum_withdrawal_limit_sats;
        byteString.getClass();
        return new CryptocurrencyConfig(l, str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CryptocurrencyConfig cryptocurrencyConfig = (CryptocurrencyConfig) obj;
        cryptocurrencyConfig.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cryptocurrencyConfig.btc_welcome_message);
        protoAdapter.encodeWithTag(protoWriter, 2, cryptocurrencyConfig.learn_about_btc_button_text);
        protoAdapter.encodeWithTag(protoWriter, 3, cryptocurrencyConfig.learn_about_btc_url);
        protoAdapter.encodeWithTag(protoWriter, 4, cryptocurrencyConfig.dismiss_button_text);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, cryptocurrencyConfig.minimum_withdrawal_limit_sats);
        protoWriter.writeBytes(cryptocurrencyConfig.unknownFields());
    }
}
