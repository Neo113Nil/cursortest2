package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalCashMarketingContent;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCashMarketingContent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalCashMarketingContent((LocalCashMarketingContent.Template) obj, (LocalCashMarketingContent.Template) obj2, (LocalCashMarketingContent.Template) obj3, (LocalCashMarketingContent.Template) obj4, (LocalCashMarketingContent.Template) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalCashMarketingContent.Template.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalCashMarketingContent.Template.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalCashMarketingContent.Template.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalCashMarketingContent.Template.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalCashMarketingContent.Template.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCashMarketingContent localCashMarketingContent = (LocalCashMarketingContent) obj;
        reverseProtoWriter.getClass();
        localCashMarketingContent.getClass();
        reverseProtoWriter.writeBytes(localCashMarketingContent.unknownFields());
        ProtoAdapter protoAdapter = LocalCashMarketingContent.Template.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, localCashMarketingContent.checkout);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localCashMarketingContent.order_details_redemption_on);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localCashMarketingContent.order_details_redemption_off);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localCashMarketingContent.cart_toolbar);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localCashMarketingContent.brand_profile);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCashMarketingContent localCashMarketingContent = (LocalCashMarketingContent) obj;
        localCashMarketingContent.getClass();
        int size$okio = localCashMarketingContent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalCashMarketingContent.Template.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, localCashMarketingContent.checkout) + protoAdapter.encodedSizeWithTag(4, localCashMarketingContent.order_details_redemption_on) + protoAdapter.encodedSizeWithTag(3, localCashMarketingContent.order_details_redemption_off) + protoAdapter.encodedSizeWithTag(2, localCashMarketingContent.cart_toolbar) + protoAdapter.encodedSizeWithTag(1, localCashMarketingContent.brand_profile) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCashMarketingContent localCashMarketingContent = (LocalCashMarketingContent) obj;
        localCashMarketingContent.getClass();
        LocalCashMarketingContent.Template template = localCashMarketingContent.brand_profile;
        LocalCashMarketingContent.Template template2 = template != null ? (LocalCashMarketingContent.Template) LocalCashMarketingContent.Template.ADAPTER.redact(template) : null;
        LocalCashMarketingContent.Template template3 = localCashMarketingContent.cart_toolbar;
        LocalCashMarketingContent.Template template4 = template3 != null ? (LocalCashMarketingContent.Template) LocalCashMarketingContent.Template.ADAPTER.redact(template3) : null;
        LocalCashMarketingContent.Template template5 = localCashMarketingContent.order_details_redemption_off;
        LocalCashMarketingContent.Template template6 = template5 != null ? (LocalCashMarketingContent.Template) LocalCashMarketingContent.Template.ADAPTER.redact(template5) : null;
        LocalCashMarketingContent.Template template7 = localCashMarketingContent.order_details_redemption_on;
        LocalCashMarketingContent.Template template8 = template7 != null ? (LocalCashMarketingContent.Template) LocalCashMarketingContent.Template.ADAPTER.redact(template7) : null;
        LocalCashMarketingContent.Template template9 = localCashMarketingContent.checkout;
        LocalCashMarketingContent.Template template10 = template9 != null ? (LocalCashMarketingContent.Template) LocalCashMarketingContent.Template.ADAPTER.redact(template9) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalCashMarketingContent(template2, template4, template6, template8, template10, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCashMarketingContent localCashMarketingContent = (LocalCashMarketingContent) obj;
        localCashMarketingContent.getClass();
        ProtoAdapter protoAdapter = LocalCashMarketingContent.Template.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, localCashMarketingContent.brand_profile);
        protoAdapter.encodeWithTag(protoWriter, 2, localCashMarketingContent.cart_toolbar);
        protoAdapter.encodeWithTag(protoWriter, 3, localCashMarketingContent.order_details_redemption_off);
        protoAdapter.encodeWithTag(protoWriter, 4, localCashMarketingContent.order_details_redemption_on);
        protoAdapter.encodeWithTag(protoWriter, 5, localCashMarketingContent.checkout);
        protoWriter.writeBytes(localCashMarketingContent.unknownFields());
    }
}
