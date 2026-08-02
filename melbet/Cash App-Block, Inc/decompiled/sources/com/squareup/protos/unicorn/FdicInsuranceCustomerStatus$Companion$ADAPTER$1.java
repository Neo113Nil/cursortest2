package com.squareup.protos.unicorn;

import androidx.room.TransactorKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FdicInsuranceCustomerStatus$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    return new FdicInsuranceCustomerStatus(bool.booleanValue(), (FdicDisclosureCopy) obj2, (FdicDisclosureCopy) obj3, (FdicDisclosureCopy) obj4, (FdicDisclosureCopy) obj5, (FdicDisclosureCopy) obj6, (FdicDisclosureCopy) obj7, (FdicDisclosureCopy) obj8, (FdicDisclosureCopy) obj9, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj, "is_fdic_insured");
                throw null;
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(FdicDisclosureCopy.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(FdicDisclosureCopy.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(FdicDisclosureCopy.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(FdicDisclosureCopy.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(FdicDisclosureCopy.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(FdicDisclosureCopy.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(FdicDisclosureCopy.ADAPTER, protoReader, obj8);
                    break;
                case 9:
                    obj9 = TransactorKt.decodeMessageOrMerge(FdicDisclosureCopy.ADAPTER, protoReader, obj9);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FdicInsuranceCustomerStatus fdicInsuranceCustomerStatus = (FdicInsuranceCustomerStatus) obj;
        reverseProtoWriter.getClass();
        fdicInsuranceCustomerStatus.getClass();
        reverseProtoWriter.writeBytes(fdicInsuranceCustomerStatus.unknownFields());
        ProtoAdapter protoAdapter = FdicDisclosureCopy.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, fdicInsuranceCustomerStatus.benefits_home_disclosure);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, fdicInsuranceCustomerStatus.benefits_booklet_disclosure);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, fdicInsuranceCustomerStatus.money_tab_disclosure);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, fdicInsuranceCustomerStatus.paychecks_disclosure);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, fdicInsuranceCustomerStatus.savings_home_disclosure);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, fdicInsuranceCustomerStatus.account_profile_disclosure);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, fdicInsuranceCustomerStatus.cards_home_disclosure);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, fdicInsuranceCustomerStatus.balance_home_disclosure);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, Boolean.valueOf(fdicInsuranceCustomerStatus.is_fdic_insured));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FdicInsuranceCustomerStatus fdicInsuranceCustomerStatus = (FdicInsuranceCustomerStatus) obj;
        fdicInsuranceCustomerStatus.getClass();
        int size$okio = fdicInsuranceCustomerStatus.unknownFields().getSize$okio();
        int m = SizeMode$EnumUnboxingLocalUtility.m(fdicInsuranceCustomerStatus.is_fdic_insured, ProtoAdapter.BOOL, 1, size$okio);
        ProtoAdapter protoAdapter = FdicDisclosureCopy.ADAPTER;
        return protoAdapter.encodedSizeWithTag(9, fdicInsuranceCustomerStatus.benefits_home_disclosure) + protoAdapter.encodedSizeWithTag(8, fdicInsuranceCustomerStatus.benefits_booklet_disclosure) + protoAdapter.encodedSizeWithTag(7, fdicInsuranceCustomerStatus.money_tab_disclosure) + protoAdapter.encodedSizeWithTag(6, fdicInsuranceCustomerStatus.paychecks_disclosure) + protoAdapter.encodedSizeWithTag(5, fdicInsuranceCustomerStatus.savings_home_disclosure) + protoAdapter.encodedSizeWithTag(4, fdicInsuranceCustomerStatus.account_profile_disclosure) + protoAdapter.encodedSizeWithTag(3, fdicInsuranceCustomerStatus.cards_home_disclosure) + protoAdapter.encodedSizeWithTag(2, fdicInsuranceCustomerStatus.balance_home_disclosure) + m;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FdicInsuranceCustomerStatus fdicInsuranceCustomerStatus = (FdicInsuranceCustomerStatus) obj;
        fdicInsuranceCustomerStatus.getClass();
        FdicDisclosureCopy fdicDisclosureCopy = fdicInsuranceCustomerStatus.balance_home_disclosure;
        FdicDisclosureCopy fdicDisclosureCopy2 = fdicDisclosureCopy != null ? (FdicDisclosureCopy) FdicDisclosureCopy.ADAPTER.redact(fdicDisclosureCopy) : null;
        FdicDisclosureCopy fdicDisclosureCopy3 = fdicInsuranceCustomerStatus.cards_home_disclosure;
        FdicDisclosureCopy fdicDisclosureCopy4 = fdicDisclosureCopy3 != null ? (FdicDisclosureCopy) FdicDisclosureCopy.ADAPTER.redact(fdicDisclosureCopy3) : null;
        FdicDisclosureCopy fdicDisclosureCopy5 = fdicInsuranceCustomerStatus.account_profile_disclosure;
        FdicDisclosureCopy fdicDisclosureCopy6 = fdicDisclosureCopy5 != null ? (FdicDisclosureCopy) FdicDisclosureCopy.ADAPTER.redact(fdicDisclosureCopy5) : null;
        FdicDisclosureCopy fdicDisclosureCopy7 = fdicInsuranceCustomerStatus.savings_home_disclosure;
        FdicDisclosureCopy fdicDisclosureCopy8 = fdicDisclosureCopy7 != null ? (FdicDisclosureCopy) FdicDisclosureCopy.ADAPTER.redact(fdicDisclosureCopy7) : null;
        FdicDisclosureCopy fdicDisclosureCopy9 = fdicInsuranceCustomerStatus.paychecks_disclosure;
        FdicDisclosureCopy fdicDisclosureCopy10 = fdicDisclosureCopy9 != null ? (FdicDisclosureCopy) FdicDisclosureCopy.ADAPTER.redact(fdicDisclosureCopy9) : null;
        FdicDisclosureCopy fdicDisclosureCopy11 = fdicInsuranceCustomerStatus.money_tab_disclosure;
        FdicDisclosureCopy fdicDisclosureCopy12 = fdicDisclosureCopy11 != null ? (FdicDisclosureCopy) FdicDisclosureCopy.ADAPTER.redact(fdicDisclosureCopy11) : null;
        FdicDisclosureCopy fdicDisclosureCopy13 = fdicInsuranceCustomerStatus.benefits_booklet_disclosure;
        FdicDisclosureCopy fdicDisclosureCopy14 = fdicDisclosureCopy13 != null ? (FdicDisclosureCopy) FdicDisclosureCopy.ADAPTER.redact(fdicDisclosureCopy13) : null;
        FdicDisclosureCopy fdicDisclosureCopy15 = fdicInsuranceCustomerStatus.benefits_home_disclosure;
        FdicDisclosureCopy fdicDisclosureCopy16 = fdicDisclosureCopy15 != null ? (FdicDisclosureCopy) FdicDisclosureCopy.ADAPTER.redact(fdicDisclosureCopy15) : null;
        ByteString byteString = ByteString.EMPTY;
        boolean z = fdicInsuranceCustomerStatus.is_fdic_insured;
        byteString.getClass();
        return new FdicInsuranceCustomerStatus(z, fdicDisclosureCopy2, fdicDisclosureCopy4, fdicDisclosureCopy6, fdicDisclosureCopy8, fdicDisclosureCopy10, fdicDisclosureCopy12, fdicDisclosureCopy14, fdicDisclosureCopy16, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FdicInsuranceCustomerStatus fdicInsuranceCustomerStatus = (FdicInsuranceCustomerStatus) obj;
        fdicInsuranceCustomerStatus.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, Boolean.valueOf(fdicInsuranceCustomerStatus.is_fdic_insured));
        ProtoAdapter protoAdapter = FdicDisclosureCopy.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, fdicInsuranceCustomerStatus.balance_home_disclosure);
        protoAdapter.encodeWithTag(protoWriter, 3, fdicInsuranceCustomerStatus.cards_home_disclosure);
        protoAdapter.encodeWithTag(protoWriter, 4, fdicInsuranceCustomerStatus.account_profile_disclosure);
        protoAdapter.encodeWithTag(protoWriter, 5, fdicInsuranceCustomerStatus.savings_home_disclosure);
        protoAdapter.encodeWithTag(protoWriter, 6, fdicInsuranceCustomerStatus.paychecks_disclosure);
        protoAdapter.encodeWithTag(protoWriter, 7, fdicInsuranceCustomerStatus.money_tab_disclosure);
        protoAdapter.encodeWithTag(protoWriter, 8, fdicInsuranceCustomerStatus.benefits_booklet_disclosure);
        protoAdapter.encodeWithTag(protoWriter, 9, fdicInsuranceCustomerStatus.benefits_home_disclosure);
        protoWriter.writeBytes(fdicInsuranceCustomerStatus.unknownFields());
    }
}
