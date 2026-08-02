package com.squareup.protos.franklin.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreditLine$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        String str = null;
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
        String str2 = null;
        LendingProduct lendingProduct = null;
        Integer num = null;
        String str3 = null;
        CreditLine.CreditLineStatusIcon creditLineStatusIcon = null;
        Boolean bool = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreditLine(str, (Money) obj4, (Money) obj5, (Money) obj6, num, m, (Money) obj8, (CreditLine.FirstTimeBorrowData) obj9, (CreditLine.UnlockBorrowData) obj10, str3, creditLineStatusIcon, bool, str2, lendingProduct, (CreditLine.CreditLineStatusData) obj3, (CreditLine.CreditLineLimitData) obj7, (CreditLine.Alert) obj11, (LocalizableString) obj12, (LocalizableString) obj13, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    decode = str;
                    break;
                case 3:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    decode = str;
                    break;
                case 4:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    decode = str;
                    break;
                case 5:
                    num = ProtoAdapter.INT32.decode(protoReader);
                    decode = str;
                    break;
                case 6:
                    obj = obj11;
                    obj2 = obj12;
                    m.add(Money.ADAPTER.decode(protoReader));
                    decode = str;
                    obj12 = obj2;
                    obj11 = obj;
                    break;
                case 7:
                    obj8 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj8);
                    decode = str;
                    break;
                case 8:
                    obj9 = TransactorKt.decodeMessageOrMerge(CreditLine.FirstTimeBorrowData.ADAPTER, protoReader, obj9);
                    decode = str;
                    break;
                case 9:
                    obj10 = TransactorKt.decodeMessageOrMerge(CreditLine.UnlockBorrowData.ADAPTER, protoReader, obj10);
                    decode = str;
                    break;
                case 10:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 11:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj11;
                    obj2 = obj12;
                    decode = str;
                    obj12 = obj2;
                    obj11 = obj;
                    break;
                case 12:
                    obj = obj11;
                    obj2 = obj12;
                    try {
                        creditLineStatusIcon = CreditLine.CreditLineStatusIcon.ADAPTER.decode(protoReader);
                        obj12 = obj2;
                        obj11 = obj;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 13:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str;
                    break;
                case 14:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 15:
                    try {
                        lendingProduct = LendingProduct.ADAPTER.decode(protoReader);
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj11;
                        obj2 = obj12;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 16:
                    obj3 = TransactorKt.decodeMessageOrMerge(CreditLine.CreditLineStatusData.ADAPTER, protoReader, obj3);
                    decode = str;
                    break;
                case 17:
                    obj7 = TransactorKt.decodeMessageOrMerge(CreditLine.CreditLineLimitData.ADAPTER, protoReader, obj7);
                    decode = str;
                    break;
                case 18:
                    obj11 = TransactorKt.decodeMessageOrMerge(CreditLine.Alert.ADAPTER, protoReader, obj11);
                    decode = str;
                    break;
                case 19:
                    obj12 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj12);
                    decode = str;
                    break;
                case 20:
                    obj13 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj13);
                    decode = str;
                    break;
            }
            str = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreditLine creditLine = (CreditLine) obj;
        reverseProtoWriter.getClass();
        creditLine.getClass();
        reverseProtoWriter.writeBytes(creditLine.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 20, creditLine.localizable_instrument_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 19, creditLine.localizable_instrument_display_name);
        CreditLine.Alert.ADAPTER.encodeWithTag(reverseProtoWriter, 18, creditLine.alert);
        CreditLine.CreditLineLimitData.ADAPTER.encodeWithTag(reverseProtoWriter, 17, creditLine.credit_line_limit_data);
        CreditLine.CreditLineStatusData.ADAPTER.encodeWithTag(reverseProtoWriter, 16, creditLine.credit_line_status_data);
        LendingProduct.ADAPTER.encodeWithTag(reverseProtoWriter, 15, creditLine.lending_product);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 14, creditLine.instrument_subtitle);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 13, creditLine.skip_loan_amount_selection);
        CreditLine.CreditLineStatusIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 12, creditLine.credit_line_status_icon);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, creditLine.instrument_display_name);
        CreditLine.UnlockBorrowData.ADAPTER.encodeWithTag(reverseProtoWriter, 9, creditLine.unlock_borrow_data);
        CreditLine.FirstTimeBorrowData.ADAPTER.encodeWithTag(reverseProtoWriter, 8, creditLine.first_time_borrow_data);
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 7, creditLine.minimum_loan_amount);
        protoAdapter3.asRepeated().encodeWithTag(reverseProtoWriter, 6, creditLine.quick_amounts);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 5, creditLine.setup_fee_bps);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, creditLine.outstanding_amount);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, creditLine.available_amount);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, creditLine.credit_limit);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, creditLine.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreditLine creditLine = (CreditLine) obj;
        creditLine.getClass();
        int size$okio = creditLine.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, creditLine.token) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        int encodedSizeWithTag2 = CreditLine.Alert.ADAPTER.encodedSizeWithTag(18, creditLine.alert) + CreditLine.CreditLineLimitData.ADAPTER.encodedSizeWithTag(17, creditLine.credit_line_limit_data) + CreditLine.CreditLineStatusData.ADAPTER.encodedSizeWithTag(16, creditLine.credit_line_status_data) + LendingProduct.ADAPTER.encodedSizeWithTag(15, creditLine.lending_product) + protoAdapter.encodedSizeWithTag(14, creditLine.instrument_subtitle) + ProtoAdapter.BOOL.encodedSizeWithTag(13, creditLine.skip_loan_amount_selection) + CreditLine.CreditLineStatusIcon.ADAPTER.encodedSizeWithTag(12, creditLine.credit_line_status_icon) + protoAdapter.encodedSizeWithTag(10, creditLine.instrument_display_name) + CreditLine.UnlockBorrowData.ADAPTER.encodedSizeWithTag(9, creditLine.unlock_borrow_data) + CreditLine.FirstTimeBorrowData.ADAPTER.encodedSizeWithTag(8, creditLine.first_time_borrow_data) + protoAdapter2.encodedSizeWithTag(7, creditLine.minimum_loan_amount) + protoAdapter2.asRepeated().encodedSizeWithTag(6, creditLine.quick_amounts) + ProtoAdapter.INT32.encodedSizeWithTag(5, creditLine.setup_fee_bps) + protoAdapter2.encodedSizeWithTag(4, creditLine.outstanding_amount) + protoAdapter2.encodedSizeWithTag(3, creditLine.available_amount) + protoAdapter2.encodedSizeWithTag(2, creditLine.credit_limit) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
        return protoAdapter3.encodedSizeWithTag(20, creditLine.localizable_instrument_subtitle) + protoAdapter3.encodedSizeWithTag(19, creditLine.localizable_instrument_display_name) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreditLine creditLine = (CreditLine) obj;
        creditLine.getClass();
        Money money = creditLine.credit_limit;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = creditLine.available_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = creditLine.outstanding_amount;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        List list = creditLine.quick_amounts;
        ProtoAdapter protoAdapter = Money.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        Money money7 = creditLine.minimum_loan_amount;
        Money money8 = money7 != null ? (Money) protoAdapter.redact(money7) : null;
        CreditLine.FirstTimeBorrowData firstTimeBorrowData = creditLine.first_time_borrow_data;
        CreditLine.FirstTimeBorrowData firstTimeBorrowData2 = firstTimeBorrowData != null ? (CreditLine.FirstTimeBorrowData) CreditLine.FirstTimeBorrowData.ADAPTER.redact(firstTimeBorrowData) : null;
        CreditLine.UnlockBorrowData unlockBorrowData = creditLine.unlock_borrow_data;
        CreditLine.UnlockBorrowData unlockBorrowData2 = unlockBorrowData != null ? (CreditLine.UnlockBorrowData) CreditLine.UnlockBorrowData.ADAPTER.redact(unlockBorrowData) : null;
        CreditLine.CreditLineStatusData creditLineStatusData = creditLine.credit_line_status_data;
        CreditLine.CreditLineStatusData creditLineStatusData2 = creditLineStatusData != null ? (CreditLine.CreditLineStatusData) CreditLine.CreditLineStatusData.ADAPTER.redact(creditLineStatusData) : null;
        CreditLine.CreditLineLimitData creditLineLimitData = creditLine.credit_line_limit_data;
        CreditLine.CreditLineLimitData creditLineLimitData2 = creditLineLimitData != null ? (CreditLine.CreditLineLimitData) CreditLine.CreditLineLimitData.ADAPTER.redact(creditLineLimitData) : null;
        CreditLine.Alert alert = creditLine.alert;
        CreditLine.Alert alert2 = alert != null ? (CreditLine.Alert) CreditLine.Alert.ADAPTER.redact(alert) : null;
        LocalizableString localizableString = creditLine.localizable_instrument_display_name;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = creditLine.localizable_instrument_subtitle;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = creditLine.token;
        Integer num = creditLine.setup_fee_bps;
        String str2 = creditLine.instrument_display_name;
        CreditLine.CreditLineStatusIcon creditLineStatusIcon = creditLine.credit_line_status_icon;
        Boolean bool = creditLine.skip_loan_amount_selection;
        String str3 = creditLine.instrument_subtitle;
        LendingProduct lendingProduct = creditLine.lending_product;
        byteString.getClass();
        return new CreditLine(str, money2, money4, money6, num, m1169redactElements, money8, firstTimeBorrowData2, unlockBorrowData2, str2, creditLineStatusIcon, bool, str3, lendingProduct, creditLineStatusData2, creditLineLimitData2, alert2, localizableString2, localizableString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreditLine creditLine = (CreditLine) obj;
        creditLine.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, creditLine.token);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, creditLine.credit_limit);
        protoAdapter2.encodeWithTag(protoWriter, 3, creditLine.available_amount);
        protoAdapter2.encodeWithTag(protoWriter, 4, creditLine.outstanding_amount);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, creditLine.setup_fee_bps);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 6, creditLine.quick_amounts);
        protoAdapter2.encodeWithTag(protoWriter, 7, creditLine.minimum_loan_amount);
        CreditLine.FirstTimeBorrowData.ADAPTER.encodeWithTag(protoWriter, 8, creditLine.first_time_borrow_data);
        CreditLine.UnlockBorrowData.ADAPTER.encodeWithTag(protoWriter, 9, creditLine.unlock_borrow_data);
        protoAdapter.encodeWithTag(protoWriter, 10, creditLine.instrument_display_name);
        CreditLine.CreditLineStatusIcon.ADAPTER.encodeWithTag(protoWriter, 12, creditLine.credit_line_status_icon);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, creditLine.skip_loan_amount_selection);
        protoAdapter.encodeWithTag(protoWriter, 14, creditLine.instrument_subtitle);
        LendingProduct.ADAPTER.encodeWithTag(protoWriter, 15, creditLine.lending_product);
        CreditLine.CreditLineStatusData.ADAPTER.encodeWithTag(protoWriter, 16, creditLine.credit_line_status_data);
        CreditLine.CreditLineLimitData.ADAPTER.encodeWithTag(protoWriter, 17, creditLine.credit_line_limit_data);
        CreditLine.Alert.ADAPTER.encodeWithTag(protoWriter, 18, creditLine.alert);
        ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 19, creditLine.localizable_instrument_display_name);
        protoAdapter3.encodeWithTag(protoWriter, 20, creditLine.localizable_instrument_subtitle);
        protoWriter.writeBytes(creditLine.unknownFields());
    }
}
