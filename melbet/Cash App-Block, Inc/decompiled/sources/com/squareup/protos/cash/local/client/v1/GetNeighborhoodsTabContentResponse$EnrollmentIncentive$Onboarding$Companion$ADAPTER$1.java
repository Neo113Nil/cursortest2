package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding((String) obj, (String) obj2, (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks) obj3, (String) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding onboarding = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding) obj;
        reverseProtoWriter.getClass();
        onboarding.getClass();
        reverseProtoWriter.writeBytes(onboarding.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, onboarding.primary_cta_button_label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, onboarding.primary_cta_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, onboarding.fine_print);
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.ADAPTER.encodeWithTag(reverseProtoWriter, 3, onboarding.how_it_works);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, onboarding.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, onboarding.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding onboarding = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding) obj;
        onboarding.getClass();
        int size$okio = onboarding.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, onboarding.primary_cta_button_label) + protoAdapter.encodedSizeWithTag(5, onboarding.primary_cta_client_route) + protoAdapter.encodedSizeWithTag(4, onboarding.fine_print) + GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.ADAPTER.encodedSizeWithTag(3, onboarding.how_it_works) + protoAdapter.encodedSizeWithTag(2, onboarding.body) + protoAdapter.encodedSizeWithTag(1, onboarding.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding onboarding = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding) obj;
        onboarding.getClass();
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks = onboarding.how_it_works;
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks2 = howItWorks != null ? (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks) GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.ADAPTER.redact(howItWorks) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = onboarding.title;
        String str2 = onboarding.body;
        String str3 = onboarding.fine_print;
        String str4 = onboarding.primary_cta_client_route;
        String str5 = onboarding.primary_cta_button_label;
        byteString.getClass();
        return new GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding(str, str2, howItWorks2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding onboarding = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding) obj;
        onboarding.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, onboarding.title);
        protoAdapter.encodeWithTag(protoWriter, 2, onboarding.body);
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.ADAPTER.encodeWithTag(protoWriter, 3, onboarding.how_it_works);
        protoAdapter.encodeWithTag(protoWriter, 4, onboarding.fine_print);
        protoAdapter.encodeWithTag(protoWriter, 5, onboarding.primary_cta_client_route);
        protoAdapter.encodeWithTag(protoWriter, 6, onboarding.primary_cta_button_label);
        protoWriter.writeBytes(onboarding.unknownFields());
    }
}
