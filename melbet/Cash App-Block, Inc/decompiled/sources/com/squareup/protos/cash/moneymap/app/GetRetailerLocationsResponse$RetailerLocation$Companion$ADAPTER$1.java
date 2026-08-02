package com.squareup.protos.cash.moneymap.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetRetailerLocationsResponse$RetailerLocation$Companion$ADAPTER$1 extends ProtoAdapter {
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.squareup.wire.ProtoAdapter
    public final java.lang.Object decode(com.squareup.wire.ProtoReader r22) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse$RetailerLocation$Companion$ADAPTER$1.decode(com.squareup.wire.ProtoReader):java.lang.Object");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetRetailerLocationsResponse.RetailerLocation retailerLocation = (GetRetailerLocationsResponse.RetailerLocation) obj;
        reverseProtoWriter.getClass();
        retailerLocation.getClass();
        reverseProtoWriter.writeBytes(retailerLocation.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 14, retailerLocation.fee_amount);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 13, retailerLocation.retailer_icon);
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 12, retailerLocation.button);
        GetRetailerLocationsResponse.LocationDetail.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 11, retailerLocation.location_details);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, retailerLocation.address_button_name);
        RetailerType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, retailerLocation.retailer_types);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, retailerLocation.retailer_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, retailerLocation.retailer_location_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, retailerLocation.retailer_icon_url);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 5, retailerLocation.retailer_accent_color);
        ProtoAdapter protoAdapter2 = ProtoAdapter.DOUBLE;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, retailerLocation.longitude);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, retailerLocation.latitude);
        GetRetailerLocationsResponse.Fee.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, retailerLocation.fees);
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 1, retailerLocation.address);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetRetailerLocationsResponse.RetailerLocation retailerLocation = (GetRetailerLocationsResponse.RetailerLocation) obj;
        retailerLocation.getClass();
        int encodedSizeWithTag = GetRetailerLocationsResponse.Fee.ADAPTER.asRepeated().encodedSizeWithTag(2, retailerLocation.fees) + GlobalAddress.ADAPTER.encodedSizeWithTag(1, retailerLocation.address) + retailerLocation.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        int encodedSizeWithTag2 = Color.ADAPTER.encodedSizeWithTag(5, retailerLocation.retailer_accent_color) + protoAdapter.encodedSizeWithTag(4, retailerLocation.longitude) + protoAdapter.encodedSizeWithTag(3, retailerLocation.latitude) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return Money.ADAPTER.encodedSizeWithTag(14, retailerLocation.fee_amount) + Image.ADAPTER.encodedSizeWithTag(13, retailerLocation.retailer_icon) + Button.ADAPTER.encodedSizeWithTag(12, retailerLocation.button) + GetRetailerLocationsResponse.LocationDetail.ADAPTER.asRepeated().encodedSizeWithTag(11, retailerLocation.location_details) + protoAdapter2.encodedSizeWithTag(10, retailerLocation.address_button_name) + RetailerType.ADAPTER.asRepeated().encodedSizeWithTag(9, retailerLocation.retailer_types) + protoAdapter2.encodedSizeWithTag(8, retailerLocation.retailer_name) + protoAdapter2.encodedSizeWithTag(7, retailerLocation.retailer_location_token) + protoAdapter2.encodedSizeWithTag(6, retailerLocation.retailer_icon_url) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetRetailerLocationsResponse.RetailerLocation retailerLocation = (GetRetailerLocationsResponse.RetailerLocation) obj;
        retailerLocation.getClass();
        GlobalAddress globalAddress = retailerLocation.address;
        GlobalAddress globalAddress2 = globalAddress != null ? (GlobalAddress) GlobalAddress.ADAPTER.redact(globalAddress) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(retailerLocation.fees, GetRetailerLocationsResponse.Fee.ADAPTER);
        Color color = retailerLocation.retailer_accent_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(retailerLocation.location_details, GetRetailerLocationsResponse.LocationDetail.ADAPTER);
        Button button = retailerLocation.button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Image image = retailerLocation.retailer_icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Money money = retailerLocation.fee_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Double d = retailerLocation.latitude;
        Double d2 = retailerLocation.longitude;
        String str = retailerLocation.retailer_icon_url;
        String str2 = retailerLocation.retailer_location_token;
        String str3 = retailerLocation.retailer_name;
        List list = retailerLocation.retailer_types;
        String str4 = retailerLocation.address_button_name;
        list.getClass();
        byteString.getClass();
        return new GetRetailerLocationsResponse.RetailerLocation(globalAddress2, m1169redactElements, d, d2, color2, str, str2, str3, list, str4, m1169redactElements2, button2, image2, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetRetailerLocationsResponse.RetailerLocation retailerLocation = (GetRetailerLocationsResponse.RetailerLocation) obj;
        retailerLocation.getClass();
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 1, retailerLocation.address);
        GetRetailerLocationsResponse.Fee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, retailerLocation.fees);
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(protoWriter, 3, retailerLocation.latitude);
        protoAdapter.encodeWithTag(protoWriter, 4, retailerLocation.longitude);
        Color.ADAPTER.encodeWithTag(protoWriter, 5, retailerLocation.retailer_accent_color);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 6, retailerLocation.retailer_icon_url);
        protoAdapter2.encodeWithTag(protoWriter, 7, retailerLocation.retailer_location_token);
        protoAdapter2.encodeWithTag(protoWriter, 8, retailerLocation.retailer_name);
        RetailerType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, retailerLocation.retailer_types);
        protoAdapter2.encodeWithTag(protoWriter, 10, retailerLocation.address_button_name);
        GetRetailerLocationsResponse.LocationDetail.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, retailerLocation.location_details);
        Button.ADAPTER.encodeWithTag(protoWriter, 12, retailerLocation.button);
        Image.ADAPTER.encodeWithTag(protoWriter, 13, retailerLocation.retailer_icon);
        Money.ADAPTER.encodeWithTag(protoWriter, 14, retailerLocation.fee_amount);
        protoWriter.writeBytes(retailerLocation.unknownFields());
    }
}
