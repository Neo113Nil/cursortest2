package com.squareup.protos.cash.cashstorefronts.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayLaterMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayLaterMetadata((String) obj, m, (String) obj2, (String) obj3, (Boolean) obj4, (Money) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    m.add(ImageAsset.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayLaterMetadata cashAppPayLaterMetadata = (CashAppPayLaterMetadata) obj;
        reverseProtoWriter.getClass();
        cashAppPayLaterMetadata.getClass();
        reverseProtoWriter.writeBytes(cashAppPayLaterMetadata.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 6, cashAppPayLaterMetadata.cart_minimum);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, cashAppPayLaterMetadata.is_card_on_file);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cashAppPayLaterMetadata.cash_app_pay_brand_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cashAppPayLaterMetadata.cash_pay_brand_bizzy_base_token);
        ImageAsset.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, cashAppPayLaterMetadata.lifestyle_images);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashAppPayLaterMetadata.affiliate_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayLaterMetadata cashAppPayLaterMetadata = (CashAppPayLaterMetadata) obj;
        cashAppPayLaterMetadata.getClass();
        int size$okio = cashAppPayLaterMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Money.ADAPTER.encodedSizeWithTag(6, cashAppPayLaterMetadata.cart_minimum) + ProtoAdapter.BOOL.encodedSizeWithTag(5, cashAppPayLaterMetadata.is_card_on_file) + protoAdapter.encodedSizeWithTag(4, cashAppPayLaterMetadata.cash_app_pay_brand_id) + protoAdapter.encodedSizeWithTag(3, cashAppPayLaterMetadata.cash_pay_brand_bizzy_base_token) + ImageAsset.ADAPTER.asRepeated().encodedSizeWithTag(2, cashAppPayLaterMetadata.lifestyle_images) + protoAdapter.encodedSizeWithTag(1, cashAppPayLaterMetadata.affiliate_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayLaterMetadata cashAppPayLaterMetadata = (CashAppPayLaterMetadata) obj;
        cashAppPayLaterMetadata.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cashAppPayLaterMetadata.lifestyle_images, ImageAsset.ADAPTER);
        Money money = cashAppPayLaterMetadata.cart_minimum;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppPayLaterMetadata.affiliate_url;
        String str2 = cashAppPayLaterMetadata.cash_pay_brand_bizzy_base_token;
        String str3 = cashAppPayLaterMetadata.cash_app_pay_brand_id;
        Boolean bool = cashAppPayLaterMetadata.is_card_on_file;
        byteString.getClass();
        return new CashAppPayLaterMetadata(str, m1169redactElements, str2, str3, bool, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayLaterMetadata cashAppPayLaterMetadata = (CashAppPayLaterMetadata) obj;
        cashAppPayLaterMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppPayLaterMetadata.affiliate_url);
        ImageAsset.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, cashAppPayLaterMetadata.lifestyle_images);
        protoAdapter.encodeWithTag(protoWriter, 3, cashAppPayLaterMetadata.cash_pay_brand_bizzy_base_token);
        protoAdapter.encodeWithTag(protoWriter, 4, cashAppPayLaterMetadata.cash_app_pay_brand_id);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, cashAppPayLaterMetadata.is_card_on_file);
        Money.ADAPTER.encodeWithTag(protoWriter, 6, cashAppPayLaterMetadata.cart_minimum);
        protoWriter.writeBytes(cashAppPayLaterMetadata.unknownFields());
    }
}
