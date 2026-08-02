package com.squareup.protos.cash.piggybank.api.v2;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SavingsCustomer$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SavingsCustomer((String) obj, (Instant) obj2, (Boolean) obj3, (SavingsCustomerStatus) obj4, (YieldEligibilityStatus) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 4) {
                try {
                    obj4 = SavingsCustomerStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj5 = YieldEligibilityStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsCustomer savingsCustomer = (SavingsCustomer) obj;
        reverseProtoWriter.getClass();
        savingsCustomer.getClass();
        reverseProtoWriter.writeBytes(savingsCustomer.unknownFields());
        YieldEligibilityStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 5, savingsCustomer.yield_eligibility_status);
        SavingsCustomerStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 4, savingsCustomer.customer_status);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, savingsCustomer.eligible_for_savings);
        ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 2, savingsCustomer.auto_save_upsell_dismissed_at);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, savingsCustomer.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsCustomer savingsCustomer = (SavingsCustomer) obj;
        savingsCustomer.getClass();
        return YieldEligibilityStatus.ADAPTER.encodedSizeWithTag(5, savingsCustomer.yield_eligibility_status) + SavingsCustomerStatus.ADAPTER.encodedSizeWithTag(4, savingsCustomer.customer_status) + ProtoAdapter.BOOL.encodedSizeWithTag(3, savingsCustomer.eligible_for_savings) + ProtoAdapter.INSTANT.encodedSizeWithTag(2, savingsCustomer.auto_save_upsell_dismissed_at) + ProtoAdapter.STRING.encodedSizeWithTag(1, savingsCustomer.token) + savingsCustomer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsCustomer savingsCustomer = (SavingsCustomer) obj;
        savingsCustomer.getClass();
        Instant instant = savingsCustomer.auto_save_upsell_dismissed_at;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = savingsCustomer.token;
        Boolean bool = savingsCustomer.eligible_for_savings;
        SavingsCustomerStatus savingsCustomerStatus = savingsCustomer.customer_status;
        YieldEligibilityStatus yieldEligibilityStatus = savingsCustomer.yield_eligibility_status;
        byteString.getClass();
        return new SavingsCustomer(str, instant2, bool, savingsCustomerStatus, yieldEligibilityStatus, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsCustomer savingsCustomer = (SavingsCustomer) obj;
        savingsCustomer.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, savingsCustomer.token);
        ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 2, savingsCustomer.auto_save_upsell_dismissed_at);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, savingsCustomer.eligible_for_savings);
        SavingsCustomerStatus.ADAPTER.encodeWithTag(protoWriter, 4, savingsCustomer.customer_status);
        YieldEligibilityStatus.ADAPTER.encodeWithTag(protoWriter, 5, savingsCustomer.yield_eligibility_status);
        protoWriter.writeBytes(savingsCustomer.unknownFields());
    }
}
