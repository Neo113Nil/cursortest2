package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PreAuthorizationData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(Discount.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(Discount.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                arrayList.add(LoanOption.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        String str = (String) obj;
        if (str != null) {
            return new PreAuthorizationData(str, m, (Discount) obj2, arrayList, (String) obj3, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "pre_auth_token");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PreAuthorizationData preAuthorizationData = (PreAuthorizationData) obj;
        reverseProtoWriter.getClass();
        preAuthorizationData.getClass();
        reverseProtoWriter.writeBytes(preAuthorizationData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, preAuthorizationData.order_id);
        LoanOption.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, preAuthorizationData.eligible_loan_options);
        ProtoAdapter protoAdapter2 = Discount.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, preAuthorizationData.auto_selected_discount);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 2, preAuthorizationData.eligible_discounts);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, preAuthorizationData.pre_auth_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PreAuthorizationData preAuthorizationData = (PreAuthorizationData) obj;
        preAuthorizationData.getClass();
        int size$okio = preAuthorizationData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, preAuthorizationData.pre_auth_token) + size$okio;
        ProtoAdapter protoAdapter2 = Discount.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, preAuthorizationData.order_id) + LoanOption.ADAPTER.asRepeated().encodedSizeWithTag(4, preAuthorizationData.eligible_loan_options) + protoAdapter2.encodedSizeWithTag(3, preAuthorizationData.auto_selected_discount) + protoAdapter2.asRepeated().encodedSizeWithTag(2, preAuthorizationData.eligible_discounts) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PreAuthorizationData preAuthorizationData = (PreAuthorizationData) obj;
        preAuthorizationData.getClass();
        List list = preAuthorizationData.eligible_discounts;
        ProtoAdapter protoAdapter = Discount.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        Discount discount = preAuthorizationData.auto_selected_discount;
        Discount discount2 = discount != null ? (Discount) protoAdapter.redact(discount) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(preAuthorizationData.eligible_loan_options, LoanOption.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = preAuthorizationData.pre_auth_token;
        String str2 = preAuthorizationData.order_id;
        str.getClass();
        byteString.getClass();
        return new PreAuthorizationData(str, m1169redactElements, discount2, m1169redactElements2, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PreAuthorizationData preAuthorizationData = (PreAuthorizationData) obj;
        preAuthorizationData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, preAuthorizationData.pre_auth_token);
        ProtoAdapter protoAdapter2 = Discount.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 2, preAuthorizationData.eligible_discounts);
        protoAdapter2.encodeWithTag(protoWriter, 3, preAuthorizationData.auto_selected_discount);
        LoanOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, preAuthorizationData.eligible_loan_options);
        protoAdapter.encodeWithTag(protoWriter, 5, preAuthorizationData.order_id);
        protoWriter.writeBytes(preAuthorizationData.unknownFields());
    }
}
