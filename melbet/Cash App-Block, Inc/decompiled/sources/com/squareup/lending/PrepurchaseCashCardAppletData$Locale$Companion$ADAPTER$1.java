package com.squareup.lending;

import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$Locale$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseCashCardAppletData.Locale((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseCashCardAppletData.Locale locale = (PrepurchaseCashCardAppletData.Locale) obj;
        reverseProtoWriter.getClass();
        locale.getClass();
        reverseProtoWriter.writeBytes(locale.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, locale.display_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseCashCardAppletData.Locale locale = (PrepurchaseCashCardAppletData.Locale) obj;
        locale.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, locale.display_name) + locale.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseCashCardAppletData.Locale locale = (PrepurchaseCashCardAppletData.Locale) obj;
        locale.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = locale.display_name;
        byteString.getClass();
        return new PrepurchaseCashCardAppletData.Locale(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseCashCardAppletData.Locale locale = (PrepurchaseCashCardAppletData.Locale) obj;
        locale.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, locale.display_name);
        protoWriter.writeBytes(locale.unknownFields());
    }
}
