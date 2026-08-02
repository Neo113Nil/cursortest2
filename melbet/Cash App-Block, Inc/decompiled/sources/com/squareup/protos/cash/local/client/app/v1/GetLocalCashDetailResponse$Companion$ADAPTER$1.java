package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalCashActivity;
import com.squareup.protos.cash.local.client.v1.LocalCashInformationalContent;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetLocalCashDetailResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetLocalCashDetailResponse((String) obj, (LocalCashInformationalContent) obj2, (LocalCashActivity) obj3, (ResponseContext) obj4, (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalCashInformationalContent.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalCashActivity.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetLocalCashDetailResponse getLocalCashDetailResponse = (GetLocalCashDetailResponse) obj;
        reverseProtoWriter.getClass();
        getLocalCashDetailResponse.getClass();
        reverseProtoWriter.writeBytes(getLocalCashDetailResponse.unknownFields());
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.ADAPTER.encodeWithTag(reverseProtoWriter, 5, getLocalCashDetailResponse.how_it_works);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, getLocalCashDetailResponse.response_context);
        LocalCashActivity.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getLocalCashDetailResponse.activity);
        LocalCashInformationalContent.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getLocalCashDetailResponse.content);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getLocalCashDetailResponse.local_cash_label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetLocalCashDetailResponse getLocalCashDetailResponse = (GetLocalCashDetailResponse) obj;
        getLocalCashDetailResponse.getClass();
        return GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.ADAPTER.encodedSizeWithTag(5, getLocalCashDetailResponse.how_it_works) + ResponseContext.ADAPTER.encodedSizeWithTag(4, getLocalCashDetailResponse.response_context) + LocalCashActivity.ADAPTER.encodedSizeWithTag(3, getLocalCashDetailResponse.activity) + LocalCashInformationalContent.ADAPTER.encodedSizeWithTag(2, getLocalCashDetailResponse.content) + ProtoAdapter.STRING.encodedSizeWithTag(1, getLocalCashDetailResponse.local_cash_label) + getLocalCashDetailResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetLocalCashDetailResponse getLocalCashDetailResponse = (GetLocalCashDetailResponse) obj;
        getLocalCashDetailResponse.getClass();
        LocalCashInformationalContent localCashInformationalContent = getLocalCashDetailResponse.content;
        LocalCashInformationalContent localCashInformationalContent2 = localCashInformationalContent != null ? (LocalCashInformationalContent) LocalCashInformationalContent.ADAPTER.redact(localCashInformationalContent) : null;
        LocalCashActivity localCashActivity = getLocalCashDetailResponse.activity;
        LocalCashActivity localCashActivity2 = localCashActivity != null ? (LocalCashActivity) LocalCashActivity.ADAPTER.redact(localCashActivity) : null;
        ResponseContext responseContext = getLocalCashDetailResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks = getLocalCashDetailResponse.how_it_works;
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks2 = howItWorks != null ? (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks) GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.ADAPTER.redact(howItWorks) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getLocalCashDetailResponse.local_cash_label;
        byteString.getClass();
        return new GetLocalCashDetailResponse(str, localCashInformationalContent2, localCashActivity2, responseContext2, howItWorks2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetLocalCashDetailResponse getLocalCashDetailResponse = (GetLocalCashDetailResponse) obj;
        getLocalCashDetailResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getLocalCashDetailResponse.local_cash_label);
        LocalCashInformationalContent.ADAPTER.encodeWithTag(protoWriter, 2, getLocalCashDetailResponse.content);
        LocalCashActivity.ADAPTER.encodeWithTag(protoWriter, 3, getLocalCashDetailResponse.activity);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 4, getLocalCashDetailResponse.response_context);
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.ADAPTER.encodeWithTag(protoWriter, 5, getLocalCashDetailResponse.how_it_works);
        protoWriter.writeBytes(getLocalCashDetailResponse.unknownFields());
    }
}
