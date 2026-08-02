package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.InstrumentLinkingConfig;
import com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig;
import com.squareup.protos.franklin.common.scenarios.MenuItem;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InstrumentLinkingConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        String str;
        String str2;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        String str3 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        Integer num = null;
        Long l = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        InstrumentLinkingConfig.IssuedCardDisabledStyle issuedCardDisabledStyle = null;
        Boolean bool4 = null;
        String str8 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        String str9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InstrumentLinkingConfig((MenuItem) obj2, (MenuItem) obj3, (MenuItem) obj4, (MenuItem) obj5, str3, str9, str4, str5, str6, str7, bool, num, l, bool2, bool3, issuedCardDisabledStyle, bool4, str8, m, bool5, bool6, (BankAccountLinkingConfig) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj2 = TransactorKt.decodeMessageOrMerge(MenuItem.ADAPTER, protoReader, obj2);
                    decode = str3;
                    break;
                case 2:
                    obj3 = TransactorKt.decodeMessageOrMerge(MenuItem.ADAPTER, protoReader, obj3);
                    decode = str3;
                    break;
                case 3:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 5:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 6:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 7:
                    obj4 = TransactorKt.decodeMessageOrMerge(MenuItem.ADAPTER, protoReader, obj4);
                    decode = str3;
                    break;
                case 8:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 9:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 10:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 11:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 12:
                    num = ProtoAdapter.INT32.decode(protoReader);
                    decode = str3;
                    break;
                case 13:
                    obj5 = TransactorKt.decodeMessageOrMerge(MenuItem.ADAPTER, protoReader, obj5);
                    decode = str3;
                    break;
                case 14:
                    bool2 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 15:
                case 16:
                case 23:
                case 25:
                case 26:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj6;
                    str = str4;
                    str2 = str5;
                    decode = str3;
                    obj6 = obj;
                    str4 = str;
                    str5 = str2;
                    break;
                case 17:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 18:
                    obj = obj6;
                    str = str4;
                    str2 = str5;
                    m.add(TransferInstrumentMap.ADAPTER.decode(protoReader));
                    decode = str3;
                    obj6 = obj;
                    str4 = str;
                    str5 = str2;
                    break;
                case 19:
                    bool3 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 20:
                    bool5 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 21:
                    try {
                        issuedCardDisabledStyle = InstrumentLinkingConfig.IssuedCardDisabledStyle.ADAPTER.decode(protoReader);
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj6;
                        str = str4;
                        str2 = str5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 22:
                    bool4 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 24:
                    bool6 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 27:
                    obj6 = TransactorKt.decodeMessageOrMerge(BankAccountLinkingConfig.ADAPTER, protoReader, obj6);
                    decode = str3;
                    break;
            }
            str3 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InstrumentLinkingConfig instrumentLinkingConfig = (InstrumentLinkingConfig) obj;
        reverseProtoWriter.getClass();
        instrumentLinkingConfig.getClass();
        reverseProtoWriter.writeBytes(instrumentLinkingConfig.unknownFields());
        BankAccountLinkingConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 27, instrumentLinkingConfig.bank_account_linking_config);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 24, instrumentLinkingConfig.nfc_card_linking_enabled);
        protoAdapter.encodeWithTag(reverseProtoWriter, 20, instrumentLinkingConfig.bankbook_enabled);
        TransferInstrumentMap.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 18, instrumentLinkingConfig.supported_transfer_instruments);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 17, instrumentLinkingConfig.customer_passcode_instrument_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 22, instrumentLinkingConfig.physical_issued_cards_enabled);
        InstrumentLinkingConfig.IssuedCardDisabledStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 21, instrumentLinkingConfig.issued_card_disabled_style);
        protoAdapter.encodeWithTag(reverseProtoWriter, 19, instrumentLinkingConfig.issued_cards_enabled);
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, instrumentLinkingConfig.cash_balance_enabled);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 8, instrumentLinkingConfig.credit_card_fee_bps);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 12, instrumentLinkingConfig.max_credit_card_prompts);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, instrumentLinkingConfig.credit_card_linking_enabled);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, instrumentLinkingConfig.instrument_description_no_instrument_linked_personal);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, instrumentLinkingConfig.instrument_header_no_instrument_linked_personal);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, instrumentLinkingConfig.instrument_description_bank_account_linked);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, instrumentLinkingConfig.instrument_header_bank_account_linked);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, instrumentLinkingConfig.instrument_description_no_instrument_linked);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, instrumentLinkingConfig.instrument_header_no_instrument_linked);
        ProtoAdapter protoAdapter3 = MenuItem.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 13, instrumentLinkingConfig.menu_item_cash_balance);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 7, instrumentLinkingConfig.menu_item_credit_card);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, instrumentLinkingConfig.menu_item_bank_account);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, instrumentLinkingConfig.menu_item_card);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstrumentLinkingConfig instrumentLinkingConfig = (InstrumentLinkingConfig) obj;
        instrumentLinkingConfig.getClass();
        int size$okio = instrumentLinkingConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = MenuItem.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(13, instrumentLinkingConfig.menu_item_cash_balance) + protoAdapter.encodedSizeWithTag(7, instrumentLinkingConfig.menu_item_credit_card) + protoAdapter.encodedSizeWithTag(2, instrumentLinkingConfig.menu_item_bank_account) + protoAdapter.encodedSizeWithTag(1, instrumentLinkingConfig.menu_item_card) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(10, instrumentLinkingConfig.instrument_description_no_instrument_linked_personal) + protoAdapter2.encodedSizeWithTag(9, instrumentLinkingConfig.instrument_header_no_instrument_linked_personal) + protoAdapter2.encodedSizeWithTag(6, instrumentLinkingConfig.instrument_description_bank_account_linked) + protoAdapter2.encodedSizeWithTag(5, instrumentLinkingConfig.instrument_header_bank_account_linked) + protoAdapter2.encodedSizeWithTag(4, instrumentLinkingConfig.instrument_description_no_instrument_linked) + protoAdapter2.encodedSizeWithTag(3, instrumentLinkingConfig.instrument_header_no_instrument_linked) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return BankAccountLinkingConfig.ADAPTER.encodedSizeWithTag(27, instrumentLinkingConfig.bank_account_linking_config) + protoAdapter3.encodedSizeWithTag(24, instrumentLinkingConfig.nfc_card_linking_enabled) + protoAdapter3.encodedSizeWithTag(20, instrumentLinkingConfig.bankbook_enabled) + TransferInstrumentMap.ADAPTER.asRepeated().encodedSizeWithTag(18, instrumentLinkingConfig.supported_transfer_instruments) + protoAdapter2.encodedSizeWithTag(17, instrumentLinkingConfig.customer_passcode_instrument_token) + protoAdapter3.encodedSizeWithTag(22, instrumentLinkingConfig.physical_issued_cards_enabled) + InstrumentLinkingConfig.IssuedCardDisabledStyle.ADAPTER.encodedSizeWithTag(21, instrumentLinkingConfig.issued_card_disabled_style) + protoAdapter3.encodedSizeWithTag(19, instrumentLinkingConfig.issued_cards_enabled) + protoAdapter3.encodedSizeWithTag(14, instrumentLinkingConfig.cash_balance_enabled) + ProtoAdapter.INT64.encodedSizeWithTag(8, instrumentLinkingConfig.credit_card_fee_bps) + ProtoAdapter.INT32.encodedSizeWithTag(12, instrumentLinkingConfig.max_credit_card_prompts) + protoAdapter3.encodedSizeWithTag(11, instrumentLinkingConfig.credit_card_linking_enabled) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstrumentLinkingConfig instrumentLinkingConfig = (InstrumentLinkingConfig) obj;
        instrumentLinkingConfig.getClass();
        MenuItem menuItem = instrumentLinkingConfig.menu_item_card;
        MenuItem menuItem2 = menuItem != null ? (MenuItem) MenuItem.ADAPTER.redact(menuItem) : null;
        MenuItem menuItem3 = instrumentLinkingConfig.menu_item_bank_account;
        MenuItem menuItem4 = menuItem3 != null ? (MenuItem) MenuItem.ADAPTER.redact(menuItem3) : null;
        MenuItem menuItem5 = instrumentLinkingConfig.menu_item_credit_card;
        MenuItem menuItem6 = menuItem5 != null ? (MenuItem) MenuItem.ADAPTER.redact(menuItem5) : null;
        MenuItem menuItem7 = instrumentLinkingConfig.menu_item_cash_balance;
        MenuItem menuItem8 = menuItem7 != null ? (MenuItem) MenuItem.ADAPTER.redact(menuItem7) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(instrumentLinkingConfig.supported_transfer_instruments, TransferInstrumentMap.ADAPTER);
        BankAccountLinkingConfig bankAccountLinkingConfig = instrumentLinkingConfig.bank_account_linking_config;
        BankAccountLinkingConfig bankAccountLinkingConfig2 = bankAccountLinkingConfig != null ? (BankAccountLinkingConfig) BankAccountLinkingConfig.ADAPTER.redact(bankAccountLinkingConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = instrumentLinkingConfig.instrument_header_no_instrument_linked;
        String str2 = instrumentLinkingConfig.instrument_description_no_instrument_linked;
        String str3 = instrumentLinkingConfig.instrument_header_bank_account_linked;
        String str4 = instrumentLinkingConfig.instrument_description_bank_account_linked;
        String str5 = instrumentLinkingConfig.instrument_header_no_instrument_linked_personal;
        String str6 = instrumentLinkingConfig.instrument_description_no_instrument_linked_personal;
        Boolean bool = instrumentLinkingConfig.credit_card_linking_enabled;
        Integer num = instrumentLinkingConfig.max_credit_card_prompts;
        Long l = instrumentLinkingConfig.credit_card_fee_bps;
        Boolean bool2 = instrumentLinkingConfig.cash_balance_enabled;
        Boolean bool3 = instrumentLinkingConfig.issued_cards_enabled;
        InstrumentLinkingConfig.IssuedCardDisabledStyle issuedCardDisabledStyle = instrumentLinkingConfig.issued_card_disabled_style;
        Boolean bool4 = instrumentLinkingConfig.physical_issued_cards_enabled;
        String str7 = instrumentLinkingConfig.customer_passcode_instrument_token;
        Boolean bool5 = instrumentLinkingConfig.bankbook_enabled;
        Boolean bool6 = instrumentLinkingConfig.nfc_card_linking_enabled;
        byteString.getClass();
        return new InstrumentLinkingConfig(menuItem2, menuItem4, menuItem6, menuItem8, str, str2, str3, str4, str5, str6, bool, num, l, bool2, bool3, issuedCardDisabledStyle, bool4, str7, m1169redactElements, bool5, bool6, bankAccountLinkingConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstrumentLinkingConfig instrumentLinkingConfig = (InstrumentLinkingConfig) obj;
        instrumentLinkingConfig.getClass();
        ProtoAdapter protoAdapter = MenuItem.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, instrumentLinkingConfig.menu_item_card);
        protoAdapter.encodeWithTag(protoWriter, 2, instrumentLinkingConfig.menu_item_bank_account);
        protoAdapter.encodeWithTag(protoWriter, 7, instrumentLinkingConfig.menu_item_credit_card);
        protoAdapter.encodeWithTag(protoWriter, 13, instrumentLinkingConfig.menu_item_cash_balance);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 3, instrumentLinkingConfig.instrument_header_no_instrument_linked);
        protoAdapter2.encodeWithTag(protoWriter, 4, instrumentLinkingConfig.instrument_description_no_instrument_linked);
        protoAdapter2.encodeWithTag(protoWriter, 5, instrumentLinkingConfig.instrument_header_bank_account_linked);
        protoAdapter2.encodeWithTag(protoWriter, 6, instrumentLinkingConfig.instrument_description_bank_account_linked);
        protoAdapter2.encodeWithTag(protoWriter, 9, instrumentLinkingConfig.instrument_header_no_instrument_linked_personal);
        protoAdapter2.encodeWithTag(protoWriter, 10, instrumentLinkingConfig.instrument_description_no_instrument_linked_personal);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 11, instrumentLinkingConfig.credit_card_linking_enabled);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, instrumentLinkingConfig.max_credit_card_prompts);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, instrumentLinkingConfig.credit_card_fee_bps);
        protoAdapter3.encodeWithTag(protoWriter, 14, instrumentLinkingConfig.cash_balance_enabled);
        protoAdapter3.encodeWithTag(protoWriter, 19, instrumentLinkingConfig.issued_cards_enabled);
        InstrumentLinkingConfig.IssuedCardDisabledStyle.ADAPTER.encodeWithTag(protoWriter, 21, instrumentLinkingConfig.issued_card_disabled_style);
        protoAdapter3.encodeWithTag(protoWriter, 22, instrumentLinkingConfig.physical_issued_cards_enabled);
        protoAdapter2.encodeWithTag(protoWriter, 17, instrumentLinkingConfig.customer_passcode_instrument_token);
        TransferInstrumentMap.ADAPTER.asRepeated().encodeWithTag(protoWriter, 18, instrumentLinkingConfig.supported_transfer_instruments);
        protoAdapter3.encodeWithTag(protoWriter, 20, instrumentLinkingConfig.bankbook_enabled);
        protoAdapter3.encodeWithTag(protoWriter, 24, instrumentLinkingConfig.nfc_card_linking_enabled);
        BankAccountLinkingConfig.ADAPTER.encodeWithTag(protoWriter, 27, instrumentLinkingConfig.bank_account_linking_config);
        protoWriter.writeBytes(instrumentLinkingConfig.unknownFields());
    }
}
