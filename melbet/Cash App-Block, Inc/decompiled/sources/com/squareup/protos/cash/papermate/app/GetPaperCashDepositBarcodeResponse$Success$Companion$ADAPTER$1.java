package com.squareup.protos.cash.papermate.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.BenefitExplainerScreen;

/* loaded from: classes.dex */
public final class GetPaperCashDepositBarcodeResponse$Success$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002b. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
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
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj19 = obj5;
            if (nextTag == -1) {
                return new GetPaperCashDepositBarcodeResponse.Success((String) obj3, (Long) obj17, (String) obj18, m, (String) obj19, (String) obj6, (String) obj7, (String) obj8, (String) obj9, (String) obj10, (String) obj11, (String) obj12, (String) obj13, (String) obj14, (GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage) obj2, (String) obj15, (String) obj16, (BenefitExplainerScreen) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj19;
                    break;
                case 2:
                    obj17 = ProtoAdapter.INT64.decode(protoReader);
                    obj5 = obj19;
                    obj = obj3;
                    break;
                case 3:
                    obj18 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj19;
                    obj = obj3;
                    break;
                case 4:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    obj = obj3;
                    obj5 = obj19;
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    obj = obj3;
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj19;
                    obj = obj3;
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj19;
                    obj = obj3;
                    break;
                case 8:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj19;
                    obj = obj3;
                    break;
                case 9:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj19;
                    obj = obj3;
                    break;
                case 10:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj19;
                    obj = obj3;
                    break;
                case 11:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj19;
                    obj = obj3;
                    break;
                case 12:
                    obj12 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj19;
                    obj = obj3;
                    break;
                case 13:
                    obj13 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj19;
                    obj = obj3;
                    break;
                case 14:
                    obj14 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj19;
                    obj = obj3;
                    break;
                case 15:
                    obj2 = TransactorKt.decodeMessageOrMerge(GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage.ADAPTER, protoReader, obj2);
                    obj = obj3;
                    obj5 = obj19;
                    break;
                case 16:
                    obj15 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj19;
                    obj = obj3;
                    break;
                case 17:
                    obj16 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj19;
                    obj = obj3;
                    break;
                case 18:
                    obj4 = TransactorKt.decodeMessageOrMerge(BenefitExplainerScreen.ADAPTER, protoReader, obj4);
                    obj = obj3;
                    obj5 = obj19;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj5 = obj19;
                    break;
            }
            obj3 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPaperCashDepositBarcodeResponse.Success success = (GetPaperCashDepositBarcodeResponse.Success) obj;
        reverseProtoWriter.getClass();
        success.getClass();
        reverseProtoWriter.writeBytes(success.unknownFields());
        BenefitExplainerScreen.ADAPTER.encodeWithTag(reverseProtoWriter, 18, success.explainer_screen);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 17, success.barcode_screen_fee_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, success.retailer_screen_fee_text);
        GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 15, success.benefit_reinforcement_message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, success.support_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, success.support_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, success.detail_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, success.barcode_detail_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, success.subtitle_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, success.title_image_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, success.terms_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, success.deposit_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, success.done_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, success.tutorial_button_text);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, success.detail_rows);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, success.title_text);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, success.expiration_duration_seconds);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, success.barcode_number);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPaperCashDepositBarcodeResponse.Success success = (GetPaperCashDepositBarcodeResponse.Success) obj;
        success.getClass();
        int size$okio = success.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return BenefitExplainerScreen.ADAPTER.encodedSizeWithTag(18, success.explainer_screen) + protoAdapter.encodedSizeWithTag(17, success.barcode_screen_fee_text) + protoAdapter.encodedSizeWithTag(16, success.retailer_screen_fee_text) + GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage.ADAPTER.encodedSizeWithTag(15, success.benefit_reinforcement_message) + protoAdapter.encodedSizeWithTag(14, success.support_url) + protoAdapter.encodedSizeWithTag(13, success.support_button_text) + protoAdapter.encodedSizeWithTag(12, success.detail_text) + protoAdapter.encodedSizeWithTag(11, success.barcode_detail_text) + protoAdapter.encodedSizeWithTag(10, success.subtitle_text) + protoAdapter.encodedSizeWithTag(9, success.title_image_url) + protoAdapter.encodedSizeWithTag(8, success.terms_text) + protoAdapter.encodedSizeWithTag(7, success.deposit_token) + protoAdapter.encodedSizeWithTag(6, success.done_button_text) + protoAdapter.encodedSizeWithTag(5, success.tutorial_button_text) + protoAdapter.asRepeated().encodedSizeWithTag(4, success.detail_rows) + protoAdapter.encodedSizeWithTag(3, success.title_text) + ProtoAdapter.INT64.encodedSizeWithTag(2, success.expiration_duration_seconds) + protoAdapter.encodedSizeWithTag(1, success.barcode_number) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPaperCashDepositBarcodeResponse.Success success = (GetPaperCashDepositBarcodeResponse.Success) obj;
        success.getClass();
        GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage benefitReinforcementMessage = success.benefit_reinforcement_message;
        GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage benefitReinforcementMessage2 = benefitReinforcementMessage != null ? (GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage) GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage.ADAPTER.redact(benefitReinforcementMessage) : null;
        BenefitExplainerScreen benefitExplainerScreen = success.explainer_screen;
        BenefitExplainerScreen benefitExplainerScreen2 = benefitExplainerScreen != null ? (BenefitExplainerScreen) BenefitExplainerScreen.ADAPTER.redact(benefitExplainerScreen) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = success.barcode_number;
        Long l = success.expiration_duration_seconds;
        String str2 = success.title_text;
        List list = success.detail_rows;
        String str3 = success.tutorial_button_text;
        String str4 = success.done_button_text;
        String str5 = success.deposit_token;
        String str6 = success.terms_text;
        String str7 = success.title_image_url;
        String str8 = success.subtitle_text;
        String str9 = success.barcode_detail_text;
        String str10 = success.detail_text;
        String str11 = success.support_button_text;
        String str12 = success.support_url;
        String str13 = success.retailer_screen_fee_text;
        String str14 = success.barcode_screen_fee_text;
        list.getClass();
        byteString.getClass();
        return new GetPaperCashDepositBarcodeResponse.Success(str, l, str2, list, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, benefitReinforcementMessage2, str13, str14, benefitExplainerScreen2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPaperCashDepositBarcodeResponse.Success success = (GetPaperCashDepositBarcodeResponse.Success) obj;
        success.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, success.barcode_number);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, success.expiration_duration_seconds);
        protoAdapter.encodeWithTag(protoWriter, 3, success.title_text);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, success.detail_rows);
        protoAdapter.encodeWithTag(protoWriter, 5, success.tutorial_button_text);
        protoAdapter.encodeWithTag(protoWriter, 6, success.done_button_text);
        protoAdapter.encodeWithTag(protoWriter, 7, success.deposit_token);
        protoAdapter.encodeWithTag(protoWriter, 8, success.terms_text);
        protoAdapter.encodeWithTag(protoWriter, 9, success.title_image_url);
        protoAdapter.encodeWithTag(protoWriter, 10, success.subtitle_text);
        protoAdapter.encodeWithTag(protoWriter, 11, success.barcode_detail_text);
        protoAdapter.encodeWithTag(protoWriter, 12, success.detail_text);
        protoAdapter.encodeWithTag(protoWriter, 13, success.support_button_text);
        protoAdapter.encodeWithTag(protoWriter, 14, success.support_url);
        GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage.ADAPTER.encodeWithTag(protoWriter, 15, success.benefit_reinforcement_message);
        protoAdapter.encodeWithTag(protoWriter, 16, success.retailer_screen_fee_text);
        protoAdapter.encodeWithTag(protoWriter, 17, success.barcode_screen_fee_text);
        BenefitExplainerScreen.ADAPTER.encodeWithTag(protoWriter, 18, success.explainer_screen);
        protoWriter.writeBytes(success.unknownFields());
    }
}
