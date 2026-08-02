package com.squareup.protos.cash.papermate.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.papermate.app.GetRetailerLocationsResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetRetailerLocationsResponse$RetailerLocation$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0023. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj16 = obj5;
            if (nextTag == -1) {
                return new GetRetailerLocationsResponse.RetailerLocation((Double) obj3, (Double) obj15, (GlobalAddress) obj4, (String) obj16, (String) obj6, (Color) obj7, (String) obj8, (String) obj9, (String) obj10, (String) obj11, (Color) obj12, (GetRetailerLocationsResponse.DepositMethods) obj13, (String) obj14, (Money) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.DOUBLE.decode(protoReader);
                    obj5 = obj16;
                    break;
                case 2:
                    obj15 = ProtoAdapter.DOUBLE.decode(protoReader);
                    obj5 = obj16;
                    obj = obj3;
                    break;
                case 3:
                    obj4 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj4);
                    obj5 = obj16;
                    obj = obj3;
                    break;
                case 4:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    obj = obj3;
                    break;
                case 5:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj16;
                    obj = obj3;
                    break;
                case 6:
                    obj7 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj7);
                    obj5 = obj16;
                    obj = obj3;
                    break;
                case 7:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj16;
                    obj = obj3;
                    break;
                case 8:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj16;
                    obj = obj3;
                    break;
                case 9:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj16;
                    obj = obj3;
                    break;
                case 10:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj16;
                    obj = obj3;
                    break;
                case 11:
                    obj12 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj12);
                    obj5 = obj16;
                    obj = obj3;
                    break;
                case 12:
                    obj13 = TransactorKt.decodeMessageOrMerge(GetRetailerLocationsResponse.DepositMethods.ADAPTER, protoReader, obj13);
                    obj5 = obj16;
                    obj = obj3;
                    break;
                case 13:
                    obj14 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj16;
                    obj = obj3;
                    break;
                case 14:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    obj = obj3;
                    obj5 = obj16;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj5 = obj16;
                    break;
            }
            obj3 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetRetailerLocationsResponse.RetailerLocation retailerLocation = (GetRetailerLocationsResponse.RetailerLocation) obj;
        reverseProtoWriter.getClass();
        retailerLocation.getClass();
        reverseProtoWriter.writeBytes(retailerLocation.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 14, retailerLocation.fee_amount);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, retailerLocation.deposit_location);
        GetRetailerLocationsResponse.DepositMethods.ADAPTER.encodeWithTag(reverseProtoWriter, 12, retailerLocation.deposit_methods);
        ProtoAdapter protoAdapter2 = Color.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, retailerLocation.retailer_title_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, retailerLocation.support_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, retailerLocation.support_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, retailerLocation.retailer_location_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, retailerLocation.retailer_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, retailerLocation.retailer_accent_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, retailerLocation.retailer_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, retailerLocation.retailer_name);
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 3, retailerLocation.address);
        ProtoAdapter protoAdapter3 = ProtoAdapter.DOUBLE;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, retailerLocation.longitude);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, retailerLocation.latitude);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetRetailerLocationsResponse.RetailerLocation retailerLocation = (GetRetailerLocationsResponse.RetailerLocation) obj;
        retailerLocation.getClass();
        int size$okio = retailerLocation.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        int encodedSizeWithTag = GlobalAddress.ADAPTER.encodedSizeWithTag(3, retailerLocation.address) + protoAdapter.encodedSizeWithTag(2, retailerLocation.longitude) + protoAdapter.encodedSizeWithTag(1, retailerLocation.latitude) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(5, retailerLocation.retailer_icon_url) + protoAdapter2.encodedSizeWithTag(4, retailerLocation.retailer_name) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = Color.ADAPTER;
        return Money.ADAPTER.encodedSizeWithTag(14, retailerLocation.fee_amount) + protoAdapter2.encodedSizeWithTag(13, retailerLocation.deposit_location) + GetRetailerLocationsResponse.DepositMethods.ADAPTER.encodedSizeWithTag(12, retailerLocation.deposit_methods) + protoAdapter3.encodedSizeWithTag(11, retailerLocation.retailer_title_color) + protoAdapter2.encodedSizeWithTag(10, retailerLocation.support_url) + protoAdapter2.encodedSizeWithTag(9, retailerLocation.support_button_text) + protoAdapter2.encodedSizeWithTag(8, retailerLocation.retailer_location_token) + protoAdapter2.encodedSizeWithTag(7, retailerLocation.retailer_token) + protoAdapter3.encodedSizeWithTag(6, retailerLocation.retailer_accent_color) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetRetailerLocationsResponse.RetailerLocation retailerLocation = (GetRetailerLocationsResponse.RetailerLocation) obj;
        retailerLocation.getClass();
        GlobalAddress globalAddress = retailerLocation.address;
        GlobalAddress globalAddress2 = globalAddress != null ? (GlobalAddress) GlobalAddress.ADAPTER.redact(globalAddress) : null;
        Color color = retailerLocation.retailer_accent_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = retailerLocation.retailer_title_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        GetRetailerLocationsResponse.DepositMethods depositMethods = retailerLocation.deposit_methods;
        GetRetailerLocationsResponse.DepositMethods depositMethods2 = depositMethods != null ? (GetRetailerLocationsResponse.DepositMethods) GetRetailerLocationsResponse.DepositMethods.ADAPTER.redact(depositMethods) : null;
        Money money = retailerLocation.fee_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Double d = retailerLocation.latitude;
        Double d2 = retailerLocation.longitude;
        String str = retailerLocation.retailer_name;
        String str2 = retailerLocation.retailer_icon_url;
        String str3 = retailerLocation.retailer_token;
        String str4 = retailerLocation.retailer_location_token;
        String str5 = retailerLocation.support_button_text;
        String str6 = retailerLocation.support_url;
        String str7 = retailerLocation.deposit_location;
        byteString.getClass();
        return new GetRetailerLocationsResponse.RetailerLocation(d, d2, globalAddress2, str, str2, color2, str3, str4, str5, str6, color4, depositMethods2, str7, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetRetailerLocationsResponse.RetailerLocation retailerLocation = (GetRetailerLocationsResponse.RetailerLocation) obj;
        retailerLocation.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(protoWriter, 1, retailerLocation.latitude);
        protoAdapter.encodeWithTag(protoWriter, 2, retailerLocation.longitude);
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 3, retailerLocation.address);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, retailerLocation.retailer_name);
        protoAdapter2.encodeWithTag(protoWriter, 5, retailerLocation.retailer_icon_url);
        ProtoAdapter protoAdapter3 = Color.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 6, retailerLocation.retailer_accent_color);
        protoAdapter2.encodeWithTag(protoWriter, 7, retailerLocation.retailer_token);
        protoAdapter2.encodeWithTag(protoWriter, 8, retailerLocation.retailer_location_token);
        protoAdapter2.encodeWithTag(protoWriter, 9, retailerLocation.support_button_text);
        protoAdapter2.encodeWithTag(protoWriter, 10, retailerLocation.support_url);
        protoAdapter3.encodeWithTag(protoWriter, 11, retailerLocation.retailer_title_color);
        GetRetailerLocationsResponse.DepositMethods.ADAPTER.encodeWithTag(protoWriter, 12, retailerLocation.deposit_methods);
        protoAdapter2.encodeWithTag(protoWriter, 13, retailerLocation.deposit_location);
        Money.ADAPTER.encodeWithTag(protoWriter, 14, retailerLocation.fee_amount);
        protoWriter.writeBytes(retailerLocation.unknownFields());
    }
}
