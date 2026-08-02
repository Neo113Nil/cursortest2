package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetBuyerInfoResponse$BuyerInfo$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetBuyerInfoResponse.BuyerInfo((BrandBanner) obj, (BrandBanner) obj2, (Boolean) obj3, (Boolean) obj4, (LocalLoyaltyAccount) obj5, (LocalCart) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(BrandBanner.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(BrandBanner.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalLoyaltyAccount.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalCart.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBuyerInfoResponse.BuyerInfo buyerInfo = (GetBuyerInfoResponse.BuyerInfo) obj;
        reverseProtoWriter.getClass();
        buyerInfo.getClass();
        reverseProtoWriter.writeBytes(buyerInfo.unknownFields());
        LocalCart.ADAPTER.encodeWithTag(reverseProtoWriter, 6, buyerInfo.active_cart);
        LocalLoyaltyAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 5, buyerInfo.loyalty_account);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, buyerInfo.can_follow_brand);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, buyerInfo.follows_brand);
        ProtoAdapter protoAdapter2 = BrandBanner.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, buyerInfo.cart_banner);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, buyerInfo.profile_banner);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBuyerInfoResponse.BuyerInfo buyerInfo = (GetBuyerInfoResponse.BuyerInfo) obj;
        buyerInfo.getClass();
        int size$okio = buyerInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = BrandBanner.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, buyerInfo.cart_banner) + protoAdapter.encodedSizeWithTag(1, buyerInfo.profile_banner) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return LocalCart.ADAPTER.encodedSizeWithTag(6, buyerInfo.active_cart) + LocalLoyaltyAccount.ADAPTER.encodedSizeWithTag(5, buyerInfo.loyalty_account) + protoAdapter2.encodedSizeWithTag(4, buyerInfo.can_follow_brand) + protoAdapter2.encodedSizeWithTag(3, buyerInfo.follows_brand) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBuyerInfoResponse.BuyerInfo buyerInfo = (GetBuyerInfoResponse.BuyerInfo) obj;
        buyerInfo.getClass();
        BrandBanner brandBanner = buyerInfo.profile_banner;
        BrandBanner brandBanner2 = brandBanner != null ? (BrandBanner) BrandBanner.ADAPTER.redact(brandBanner) : null;
        BrandBanner brandBanner3 = buyerInfo.cart_banner;
        BrandBanner brandBanner4 = brandBanner3 != null ? (BrandBanner) BrandBanner.ADAPTER.redact(brandBanner3) : null;
        LocalLoyaltyAccount localLoyaltyAccount = buyerInfo.loyalty_account;
        LocalLoyaltyAccount localLoyaltyAccount2 = localLoyaltyAccount != null ? (LocalLoyaltyAccount) LocalLoyaltyAccount.ADAPTER.redact(localLoyaltyAccount) : null;
        LocalCart localCart = buyerInfo.active_cart;
        LocalCart localCart2 = localCart != null ? (LocalCart) LocalCart.ADAPTER.redact(localCart) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = buyerInfo.follows_brand;
        Boolean bool2 = buyerInfo.can_follow_brand;
        byteString.getClass();
        return new GetBuyerInfoResponse.BuyerInfo(brandBanner2, brandBanner4, bool, bool2, localLoyaltyAccount2, localCart2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBuyerInfoResponse.BuyerInfo buyerInfo = (GetBuyerInfoResponse.BuyerInfo) obj;
        buyerInfo.getClass();
        ProtoAdapter protoAdapter = BrandBanner.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, buyerInfo.profile_banner);
        protoAdapter.encodeWithTag(protoWriter, 2, buyerInfo.cart_banner);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 3, buyerInfo.follows_brand);
        protoAdapter2.encodeWithTag(protoWriter, 4, buyerInfo.can_follow_brand);
        LocalLoyaltyAccount.ADAPTER.encodeWithTag(protoWriter, 5, buyerInfo.loyalty_account);
        LocalCart.ADAPTER.encodeWithTag(protoWriter, 6, buyerInfo.active_cart);
        protoWriter.writeBytes(buyerInfo.unknownFields());
    }
}
