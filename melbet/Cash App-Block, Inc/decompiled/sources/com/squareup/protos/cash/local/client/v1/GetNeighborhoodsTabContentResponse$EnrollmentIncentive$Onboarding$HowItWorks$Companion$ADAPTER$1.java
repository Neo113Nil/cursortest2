package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$HowItWorks$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.Row.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks) obj;
        reverseProtoWriter.getClass();
        howItWorks.getClass();
        reverseProtoWriter.writeBytes(howItWorks.unknownFields());
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.Row.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, howItWorks.rows);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, howItWorks.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks) obj;
        howItWorks.getClass();
        return GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.Row.ADAPTER.asRepeated().encodedSizeWithTag(2, howItWorks.rows) + ProtoAdapter.STRING.encodedSizeWithTag(1, howItWorks.title) + howItWorks.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks) obj;
        howItWorks.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(howItWorks.rows, GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.Row.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = howItWorks.title;
        byteString.getClass();
        return new GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks(str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks) obj;
        howItWorks.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, howItWorks.title);
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.Row.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, howItWorks.rows);
        protoWriter.writeBytes(howItWorks.unknownFields());
    }
}
