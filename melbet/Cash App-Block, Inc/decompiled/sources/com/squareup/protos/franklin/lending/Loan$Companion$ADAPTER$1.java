package com.squareup.protos.franklin.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.lending.Loan;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Loan$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Integer num;
        Loan.State state;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj2 = null;
        Long l = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Integer num2 = null;
        Loan.State state2 = null;
        Long l2 = null;
        LendingProduct lendingProduct = null;
        String str2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Loan(str, str2, l, (Money) obj3, (Money) obj4, (Money) obj5, (Money) obj6, (Money) obj7, num2, m, state2, l2, lendingProduct, (Loan.BnplData) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    decode = str;
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    decode = str;
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    decode = str;
                    break;
                case 6:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    decode = str;
                    break;
                case 8:
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    decode = str;
                    break;
                case 9:
                    num2 = ProtoAdapter.INT32.decode(protoReader);
                    decode = str;
                    break;
                case 10:
                    obj = obj2;
                    num = num2;
                    state = state2;
                    m.add(Loan.DetailRow.ADAPTER.decode(protoReader));
                    decode = str;
                    obj2 = obj;
                    num2 = num;
                    state2 = state;
                    break;
                case 11:
                    obj = obj2;
                    num = num2;
                    state = state2;
                    try {
                        state2 = Loan.State.ADAPTER.decode(protoReader);
                        obj2 = obj;
                        num2 = num;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 12:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 13:
                    try {
                        lendingProduct = LendingProduct.ADAPTER.decode(protoReader);
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj2;
                        num = num2;
                        state = state2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 14:
                    obj2 = TransactorKt.decodeMessageOrMerge(Loan.BnplData.ADAPTER, protoReader, obj2);
                    decode = str;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    num = num2;
                    state = state2;
                    decode = str;
                    obj2 = obj;
                    num2 = num;
                    state2 = state;
                    break;
            }
            str = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Loan loan = (Loan) obj;
        reverseProtoWriter.getClass();
        loan.getClass();
        reverseProtoWriter.writeBytes(loan.unknownFields());
        Loan.BnplData.ADAPTER.encodeWithTag(reverseProtoWriter, 14, loan.bnpl_data);
        LendingProduct.ADAPTER.encodeWithTag(reverseProtoWriter, 13, loan.lending_product);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, loan.due_at);
        Loan.State.ADAPTER.encodeWithTag(reverseProtoWriter, 11, loan.state);
        Loan.DetailRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 10, loan.detail_rows);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 9, loan.setup_fee_bps);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, loan.interest_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, loan.late_fee_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, loan.outstanding_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, loan.setup_fee_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, loan.principal_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, loan.borrowed_at);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, loan.credit_line_token);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, loan.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Loan loan = (Loan) obj;
        loan.getClass();
        int size$okio = loan.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, loan.credit_line_token) + protoAdapter.encodedSizeWithTag(1, loan.token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(6, loan.borrowed_at) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        return Loan.BnplData.ADAPTER.encodedSizeWithTag(14, loan.bnpl_data) + LendingProduct.ADAPTER.encodedSizeWithTag(13, loan.lending_product) + protoAdapter2.encodedSizeWithTag(12, loan.due_at) + Loan.State.ADAPTER.encodedSizeWithTag(11, loan.state) + Loan.DetailRow.ADAPTER.asRepeated().encodedSizeWithTag(10, loan.detail_rows) + ProtoAdapter.INT32.encodedSizeWithTag(9, loan.setup_fee_bps) + protoAdapter3.encodedSizeWithTag(8, loan.interest_amount) + protoAdapter3.encodedSizeWithTag(7, loan.late_fee_amount) + protoAdapter3.encodedSizeWithTag(5, loan.outstanding_amount) + protoAdapter3.encodedSizeWithTag(4, loan.setup_fee_amount) + protoAdapter3.encodedSizeWithTag(3, loan.principal_amount) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Loan loan = (Loan) obj;
        loan.getClass();
        Money money = loan.principal_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = loan.setup_fee_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = loan.outstanding_amount;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = loan.late_fee_amount;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        Money money9 = loan.interest_amount;
        Money money10 = money9 != null ? (Money) Money.ADAPTER.redact(money9) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(loan.detail_rows, Loan.DetailRow.ADAPTER);
        Loan.BnplData bnplData = loan.bnpl_data;
        Loan.BnplData bnplData2 = bnplData != null ? (Loan.BnplData) Loan.BnplData.ADAPTER.redact(bnplData) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = loan.token;
        String str2 = loan.credit_line_token;
        Long l = loan.borrowed_at;
        Integer num = loan.setup_fee_bps;
        Loan.State state = loan.state;
        Long l2 = loan.due_at;
        LendingProduct lendingProduct = loan.lending_product;
        byteString.getClass();
        return new Loan(str, str2, l, money2, money4, money6, money8, money10, num, m1169redactElements, state, l2, lendingProduct, bnplData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Loan loan = (Loan) obj;
        loan.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, loan.token);
        protoAdapter.encodeWithTag(protoWriter, 2, loan.credit_line_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 6, loan.borrowed_at);
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 3, loan.principal_amount);
        protoAdapter3.encodeWithTag(protoWriter, 4, loan.setup_fee_amount);
        protoAdapter3.encodeWithTag(protoWriter, 5, loan.outstanding_amount);
        protoAdapter3.encodeWithTag(protoWriter, 7, loan.late_fee_amount);
        protoAdapter3.encodeWithTag(protoWriter, 8, loan.interest_amount);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, loan.setup_fee_bps);
        Loan.DetailRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, loan.detail_rows);
        Loan.State.ADAPTER.encodeWithTag(protoWriter, 11, loan.state);
        protoAdapter2.encodeWithTag(protoWriter, 12, loan.due_at);
        LendingProduct.ADAPTER.encodeWithTag(protoWriter, 13, loan.lending_product);
        Loan.BnplData.ADAPTER.encodeWithTag(protoWriter, 14, loan.bnpl_data);
        protoWriter.writeBytes(loan.unknownFields());
    }
}
