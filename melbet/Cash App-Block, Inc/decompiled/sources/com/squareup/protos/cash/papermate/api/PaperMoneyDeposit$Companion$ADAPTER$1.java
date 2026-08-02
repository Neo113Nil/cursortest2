package com.squareup.protos.cash.papermate.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.papermate.enums.ExternalSystem;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.protos.cash.papermate.states.PaperMoneyDepositState;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PaperMoneyDeposit$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        String str;
        String str2;
        PaperMoneyDepositState paperMoneyDepositState;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str3 = null;
        String str4 = null;
        String str5 = null;
        PaperMoneyDepositState paperMoneyDepositState2 = null;
        Object obj = null;
        Object obj2 = null;
        Long l = null;
        String str6 = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        String str7 = null;
        Long l6 = null;
        String str8 = null;
        String str9 = null;
        Long l7 = null;
        Long l8 = null;
        Long l9 = null;
        FeeType feeType = null;
        ExternalSystem externalSystem = null;
        String str10 = null;
        String str11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaperMoneyDeposit(str3, str4, str5, paperMoneyDepositState2, (Money) obj, (Money) obj2, l, str6, l2, l3, l4, l5, str7, l6, str8, str9, l7, l8, l9, feeType, externalSystem, str10, str11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 3:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 4:
                    str = str4;
                    str2 = str5;
                    paperMoneyDepositState = paperMoneyDepositState2;
                    try {
                        paperMoneyDepositState2 = PaperMoneyDepositState.ADAPTER.decode(protoReader);
                        str4 = str;
                        str5 = str2;
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    decode = str3;
                    break;
                case 6:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    decode = str3;
                    break;
                case 7:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 8:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 9:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 10:
                    l3 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 11:
                    l4 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 12:
                    l5 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 13:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 14:
                    l6 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 15:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 16:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 17:
                    l7 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 18:
                    l8 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 19:
                    str = str4;
                    str2 = str5;
                    paperMoneyDepositState = paperMoneyDepositState2;
                    try {
                        feeType = FeeType.ADAPTER.decode(protoReader);
                        str4 = str;
                        str5 = str2;
                        paperMoneyDepositState2 = paperMoneyDepositState;
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 20:
                    try {
                        externalSystem = ExternalSystem.ADAPTER.decode(protoReader);
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        str = str4;
                        str2 = str5;
                        paperMoneyDepositState = paperMoneyDepositState2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 21:
                    l9 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 22:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 23:
                    str11 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    str = str4;
                    str2 = str5;
                    paperMoneyDepositState = paperMoneyDepositState2;
                    decode = str3;
                    str4 = str;
                    str5 = str2;
                    paperMoneyDepositState2 = paperMoneyDepositState;
                    break;
            }
            str3 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaperMoneyDeposit paperMoneyDeposit = (PaperMoneyDeposit) obj;
        reverseProtoWriter.getClass();
        paperMoneyDeposit.getClass();
        reverseProtoWriter.writeBytes(paperMoneyDeposit.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 23, paperMoneyDeposit.device_installation_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 22, paperMoneyDeposit.device_id);
        ExternalSystem.ADAPTER.encodeWithTag(reverseProtoWriter, 20, paperMoneyDeposit.external_system);
        FeeType.ADAPTER.encodeWithTag(reverseProtoWriter, 19, paperMoneyDeposit.fee_type);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 21, paperMoneyDeposit.reversed_ledgered_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 18, paperMoneyDeposit.pending_ledgered_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 17, paperMoneyDeposit.created_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, paperMoneyDeposit.external_reference_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, paperMoneyDeposit.reversal_message);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 14, paperMoneyDeposit.reversed_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, paperMoneyDeposit.failure_reason);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, paperMoneyDeposit.failed_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, paperMoneyDeposit.settled_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, paperMoneyDeposit.validated_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, paperMoneyDeposit.pending_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, paperMoneyDeposit.decline_reason);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, paperMoneyDeposit.declined_at);
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, paperMoneyDeposit.fee);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, paperMoneyDeposit.amount);
        PaperMoneyDepositState.ADAPTER.encodeWithTag(reverseProtoWriter, 4, paperMoneyDeposit.state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, paperMoneyDeposit.barcode_number);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, paperMoneyDeposit.customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, paperMoneyDeposit.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaperMoneyDeposit paperMoneyDeposit = (PaperMoneyDeposit) obj;
        paperMoneyDeposit.getClass();
        int size$okio = paperMoneyDeposit.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = PaperMoneyDepositState.ADAPTER.encodedSizeWithTag(4, paperMoneyDeposit.state) + protoAdapter.encodedSizeWithTag(3, paperMoneyDeposit.barcode_number) + protoAdapter.encodedSizeWithTag(2, paperMoneyDeposit.customer_token) + protoAdapter.encodedSizeWithTag(1, paperMoneyDeposit.token) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(6, paperMoneyDeposit.fee) + protoAdapter2.encodedSizeWithTag(5, paperMoneyDeposit.amount) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(23, paperMoneyDeposit.device_installation_id) + protoAdapter.encodedSizeWithTag(22, paperMoneyDeposit.device_id) + ExternalSystem.ADAPTER.encodedSizeWithTag(20, paperMoneyDeposit.external_system) + FeeType.ADAPTER.encodedSizeWithTag(19, paperMoneyDeposit.fee_type) + protoAdapter3.encodedSizeWithTag(21, paperMoneyDeposit.reversed_ledgered_at) + protoAdapter3.encodedSizeWithTag(18, paperMoneyDeposit.pending_ledgered_at) + protoAdapter3.encodedSizeWithTag(17, paperMoneyDeposit.created_at) + protoAdapter.encodedSizeWithTag(16, paperMoneyDeposit.external_reference_id) + protoAdapter.encodedSizeWithTag(15, paperMoneyDeposit.reversal_message) + protoAdapter3.encodedSizeWithTag(14, paperMoneyDeposit.reversed_at) + protoAdapter.encodedSizeWithTag(13, paperMoneyDeposit.failure_reason) + protoAdapter3.encodedSizeWithTag(12, paperMoneyDeposit.failed_at) + protoAdapter3.encodedSizeWithTag(11, paperMoneyDeposit.settled_at) + protoAdapter3.encodedSizeWithTag(10, paperMoneyDeposit.validated_at) + protoAdapter3.encodedSizeWithTag(9, paperMoneyDeposit.pending_at) + protoAdapter.encodedSizeWithTag(8, paperMoneyDeposit.decline_reason) + protoAdapter3.encodedSizeWithTag(7, paperMoneyDeposit.declined_at) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaperMoneyDeposit paperMoneyDeposit = (PaperMoneyDeposit) obj;
        paperMoneyDeposit.getClass();
        Money money = paperMoneyDeposit.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = paperMoneyDeposit.fee;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = paperMoneyDeposit.token;
        String str2 = paperMoneyDeposit.customer_token;
        String str3 = paperMoneyDeposit.barcode_number;
        PaperMoneyDepositState paperMoneyDepositState = paperMoneyDeposit.state;
        Long l = paperMoneyDeposit.declined_at;
        String str4 = paperMoneyDeposit.decline_reason;
        Long l2 = paperMoneyDeposit.pending_at;
        Long l3 = paperMoneyDeposit.validated_at;
        Long l4 = paperMoneyDeposit.settled_at;
        Long l5 = paperMoneyDeposit.failed_at;
        String str5 = paperMoneyDeposit.failure_reason;
        Long l6 = paperMoneyDeposit.reversed_at;
        String str6 = paperMoneyDeposit.reversal_message;
        String str7 = paperMoneyDeposit.external_reference_id;
        Long l7 = paperMoneyDeposit.created_at;
        Long l8 = paperMoneyDeposit.pending_ledgered_at;
        Long l9 = paperMoneyDeposit.reversed_ledgered_at;
        FeeType feeType = paperMoneyDeposit.fee_type;
        ExternalSystem externalSystem = paperMoneyDeposit.external_system;
        String str8 = paperMoneyDeposit.device_id;
        String str9 = paperMoneyDeposit.device_installation_id;
        byteString.getClass();
        return new PaperMoneyDeposit(str, str2, str3, paperMoneyDepositState, money2, money4, l, str4, l2, l3, l4, l5, str5, l6, str6, str7, l7, l8, l9, feeType, externalSystem, str8, str9, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaperMoneyDeposit paperMoneyDeposit = (PaperMoneyDeposit) obj;
        paperMoneyDeposit.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, paperMoneyDeposit.token);
        protoAdapter.encodeWithTag(protoWriter, 2, paperMoneyDeposit.customer_token);
        protoAdapter.encodeWithTag(protoWriter, 3, paperMoneyDeposit.barcode_number);
        PaperMoneyDepositState.ADAPTER.encodeWithTag(protoWriter, 4, paperMoneyDeposit.state);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, paperMoneyDeposit.amount);
        protoAdapter2.encodeWithTag(protoWriter, 6, paperMoneyDeposit.fee);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 7, paperMoneyDeposit.declined_at);
        protoAdapter.encodeWithTag(protoWriter, 8, paperMoneyDeposit.decline_reason);
        protoAdapter3.encodeWithTag(protoWriter, 9, paperMoneyDeposit.pending_at);
        protoAdapter3.encodeWithTag(protoWriter, 10, paperMoneyDeposit.validated_at);
        protoAdapter3.encodeWithTag(protoWriter, 11, paperMoneyDeposit.settled_at);
        protoAdapter3.encodeWithTag(protoWriter, 12, paperMoneyDeposit.failed_at);
        protoAdapter.encodeWithTag(protoWriter, 13, paperMoneyDeposit.failure_reason);
        protoAdapter3.encodeWithTag(protoWriter, 14, paperMoneyDeposit.reversed_at);
        protoAdapter.encodeWithTag(protoWriter, 15, paperMoneyDeposit.reversal_message);
        protoAdapter.encodeWithTag(protoWriter, 16, paperMoneyDeposit.external_reference_id);
        protoAdapter3.encodeWithTag(protoWriter, 17, paperMoneyDeposit.created_at);
        protoAdapter3.encodeWithTag(protoWriter, 18, paperMoneyDeposit.pending_ledgered_at);
        protoAdapter3.encodeWithTag(protoWriter, 21, paperMoneyDeposit.reversed_ledgered_at);
        FeeType.ADAPTER.encodeWithTag(protoWriter, 19, paperMoneyDeposit.fee_type);
        ExternalSystem.ADAPTER.encodeWithTag(protoWriter, 20, paperMoneyDeposit.external_system);
        protoAdapter.encodeWithTag(protoWriter, 22, paperMoneyDeposit.device_id);
        protoAdapter.encodeWithTag(protoWriter, 23, paperMoneyDeposit.device_installation_id);
        protoWriter.writeBytes(paperMoneyDeposit.unknownFields());
    }
}
