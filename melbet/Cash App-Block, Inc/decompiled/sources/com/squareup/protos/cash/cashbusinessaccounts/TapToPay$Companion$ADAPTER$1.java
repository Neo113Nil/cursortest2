package com.squareup.protos.cash.cashbusinessaccounts;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashbusinessaccounts.TapToPay;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TapToPay$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TapToPay((TapToPay.OnboardingStatus) obj, m, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = TapToPay.OnboardingStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TapToPay tapToPay = (TapToPay) obj;
        reverseProtoWriter.getClass();
        tapToPay.getClass();
        reverseProtoWriter.writeBytes(tapToPay.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, tapToPay.payment_description_suggestion_algorithm);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, tapToPay.payment_description_suggestions);
        TapToPay.OnboardingStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, tapToPay.onboarding_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TapToPay tapToPay = (TapToPay) obj;
        tapToPay.getClass();
        int encodedSizeWithTag = TapToPay.OnboardingStatus.ADAPTER.encodedSizeWithTag(1, tapToPay.onboarding_status) + tapToPay.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, tapToPay.payment_description_suggestion_algorithm) + protoAdapter.asRepeated().encodedSizeWithTag(2, tapToPay.payment_description_suggestions) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TapToPay tapToPay = (TapToPay) obj;
        tapToPay.getClass();
        EmptyList emptyList = EmptyList.INSTANCE;
        ByteString byteString = ByteString.EMPTY;
        TapToPay.OnboardingStatus onboardingStatus = tapToPay.onboarding_status;
        String str = tapToPay.payment_description_suggestion_algorithm;
        emptyList.getClass();
        byteString.getClass();
        return new TapToPay(onboardingStatus, emptyList, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TapToPay tapToPay = (TapToPay) obj;
        tapToPay.getClass();
        TapToPay.OnboardingStatus.ADAPTER.encodeWithTag(protoWriter, 1, tapToPay.onboarding_status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, tapToPay.payment_description_suggestions);
        protoAdapter.encodeWithTag(protoWriter, 3, tapToPay.payment_description_suggestion_algorithm);
        protoWriter.writeBytes(tapToPay.unknownFields());
    }
}
