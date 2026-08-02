package com.squareup.lending;

import androidx.room.TransactorKt;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$PaymentPlansData$Option$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PrepurchaseCashCardAppletData.PaymentPlansData.Option((LocalizedString) obj, (LocalizedString) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseCashCardAppletData.PaymentPlansData.Option option = (PrepurchaseCashCardAppletData.PaymentPlansData.Option) obj;
        reverseProtoWriter.getClass();
        option.getClass();
        reverseProtoWriter.writeBytes(option.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, option.identifier);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, option.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, option.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseCashCardAppletData.PaymentPlansData.Option option = (PrepurchaseCashCardAppletData.PaymentPlansData.Option) obj;
        option.getClass();
        int size$okio = option.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(3, option.identifier) + protoAdapter.encodedSizeWithTag(2, option.subtitle) + protoAdapter.encodedSizeWithTag(1, option.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseCashCardAppletData.PaymentPlansData.Option option = (PrepurchaseCashCardAppletData.PaymentPlansData.Option) obj;
        option.getClass();
        LocalizedString localizedString = option.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = option.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = option.identifier;
        byteString.getClass();
        return new PrepurchaseCashCardAppletData.PaymentPlansData.Option(localizedString2, localizedString4, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseCashCardAppletData.PaymentPlansData.Option option = (PrepurchaseCashCardAppletData.PaymentPlansData.Option) obj;
        option.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, option.title);
        protoAdapter.encodeWithTag(protoWriter, 2, option.subtitle);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, option.identifier);
        protoWriter.writeBytes(option.unknownFields());
    }
}
