package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BankingConfig$Strings$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BankingConfig.Strings((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BankingConfig.Strings strings = (BankingConfig.Strings) obj;
        reverseProtoWriter.getClass();
        strings.getClass();
        reverseProtoWriter.writeBytes(strings.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, strings.balance_screen_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, strings.main_screen_balance_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, strings.main_screen_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BankingConfig.Strings strings = (BankingConfig.Strings) obj;
        strings.getClass();
        int size$okio = strings.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, strings.balance_screen_title) + protoAdapter.encodedSizeWithTag(2, strings.main_screen_balance_subtitle) + protoAdapter.encodedSizeWithTag(1, strings.main_screen_title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BankingConfig.Strings strings = (BankingConfig.Strings) obj;
        strings.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = strings.main_screen_title;
        String str2 = strings.main_screen_balance_subtitle;
        String str3 = strings.balance_screen_title;
        byteString.getClass();
        return new BankingConfig.Strings(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BankingConfig.Strings strings = (BankingConfig.Strings) obj;
        strings.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, strings.main_screen_title);
        protoAdapter.encodeWithTag(protoWriter, 2, strings.main_screen_balance_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, strings.balance_screen_title);
        protoWriter.writeBytes(strings.unknownFields());
    }
}
