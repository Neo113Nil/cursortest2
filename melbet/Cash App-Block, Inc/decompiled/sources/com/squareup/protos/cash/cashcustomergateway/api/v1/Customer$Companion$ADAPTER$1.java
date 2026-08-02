package com.squareup.protos.cash.cashcustomergateway.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Customer$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        String str;
        String str2;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str3 = null;
        Object obj2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Region region = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        String str8 = null;
        BlockState blockState = null;
        String str9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Customer(str3, str9, str4, str5, str6, str7, region, bool, bool2, bool3, bool4, bool5, str8, blockState, (Instant) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 3:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 4:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 5:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 6:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 7:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    str = str4;
                    str2 = str5;
                    decode = str3;
                    obj2 = obj;
                    str4 = str;
                    str5 = str2;
                    break;
                case 8:
                    obj = obj2;
                    str = str4;
                    str2 = str5;
                    try {
                        region = Region.ADAPTER.decode(protoReader);
                        obj2 = obj;
                        str4 = str;
                        str5 = str2;
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 9:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 10:
                    bool2 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 11:
                    bool3 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 12:
                    bool4 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 13:
                    bool5 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 14:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 15:
                    try {
                        blockState = BlockState.ADAPTER.decode(protoReader);
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj2;
                        str = str4;
                        str2 = str5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 16:
                    obj2 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj2);
                    decode = str3;
                    break;
            }
            str3 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Customer customer = (Customer) obj;
        reverseProtoWriter.getClass();
        customer.getClass();
        reverseProtoWriter.writeBytes(customer.unknownFields());
        ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 16, customer.joined_date);
        BlockState.ADAPTER.encodeWithTag(reverseProtoWriter, 15, customer.block_state);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, customer.render_data);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, customer.is_verified_account);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, customer.is_business);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, customer.is_square);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, customer.can_accept_payments);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, customer.is_cash_customer);
        Region.ADAPTER.encodeWithTag(reverseProtoWriter, 8, customer.region);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, customer.cashtag);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, customer.photo_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, customer.full_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, customer.sms_number);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, customer.email_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, customer.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Customer customer = (Customer) obj;
        customer.getClass();
        int size$okio = customer.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = Region.ADAPTER.encodedSizeWithTag(8, customer.region) + protoAdapter.encodedSizeWithTag(6, customer.cashtag) + protoAdapter.encodedSizeWithTag(5, customer.photo_url) + protoAdapter.encodedSizeWithTag(4, customer.full_name) + protoAdapter.encodedSizeWithTag(3, customer.sms_number) + protoAdapter.encodedSizeWithTag(2, customer.email_address) + protoAdapter.encodedSizeWithTag(1, customer.token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return ProtoAdapter.INSTANT.encodedSizeWithTag(16, customer.joined_date) + BlockState.ADAPTER.encodedSizeWithTag(15, customer.block_state) + protoAdapter.encodedSizeWithTag(14, customer.render_data) + protoAdapter2.encodedSizeWithTag(13, customer.is_verified_account) + protoAdapter2.encodedSizeWithTag(12, customer.is_business) + protoAdapter2.encodedSizeWithTag(11, customer.is_square) + protoAdapter2.encodedSizeWithTag(10, customer.can_accept_payments) + protoAdapter2.encodedSizeWithTag(9, customer.is_cash_customer) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Customer customer = (Customer) obj;
        customer.getClass();
        Instant instant = customer.joined_date;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = customer.token;
        String str2 = customer.photo_url;
        Region region = customer.region;
        Boolean bool = customer.is_cash_customer;
        Boolean bool2 = customer.can_accept_payments;
        Boolean bool3 = customer.is_square;
        Boolean bool4 = customer.is_business;
        Boolean bool5 = customer.is_verified_account;
        BlockState blockState = customer.block_state;
        byteString.getClass();
        return new Customer(str, null, null, null, str2, null, region, bool, bool2, bool3, bool4, bool5, null, blockState, instant2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Customer customer = (Customer) obj;
        customer.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, customer.token);
        protoAdapter.encodeWithTag(protoWriter, 2, customer.email_address);
        protoAdapter.encodeWithTag(protoWriter, 3, customer.sms_number);
        protoAdapter.encodeWithTag(protoWriter, 4, customer.full_name);
        protoAdapter.encodeWithTag(protoWriter, 5, customer.photo_url);
        protoAdapter.encodeWithTag(protoWriter, 6, customer.cashtag);
        Region.ADAPTER.encodeWithTag(protoWriter, 8, customer.region);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 9, customer.is_cash_customer);
        protoAdapter2.encodeWithTag(protoWriter, 10, customer.can_accept_payments);
        protoAdapter2.encodeWithTag(protoWriter, 11, customer.is_square);
        protoAdapter2.encodeWithTag(protoWriter, 12, customer.is_business);
        protoAdapter2.encodeWithTag(protoWriter, 13, customer.is_verified_account);
        protoAdapter.encodeWithTag(protoWriter, 14, customer.render_data);
        BlockState.ADAPTER.encodeWithTag(protoWriter, 15, customer.block_state);
        ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 16, customer.joined_date);
        protoWriter.writeBytes(customer.unknownFields());
    }
}
