package com.squareup.protos.cash.cashface.api;

import androidx.room.TransactorKt;
import app.cash.local.primitives.math.LocalMoneysKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetProfileDetailsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        LocalMoneysKt localMoneysKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                String str = (String) obj;
                Object obj4 = obj2;
                ReportState reportState = (ReportState) obj4;
                if (reportState != null) {
                    return new GetProfileDetailsResponse(str, m, reportState, arrayList, (AnalyticsData) obj3, localMoneysKt, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj4, "report_state");
                throw null;
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    m.add(ProfileElement.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    try {
                        obj2 = ReportState.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    arrayList.add(GenericProfileElement.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    obj3 = TransactorKt.decodeMessageOrMerge(AnalyticsData.ADAPTER, protoReader, obj3);
                    break;
                case 6:
                    localMoneysKt = new GetProfileDetailsResponse$EntityData$CustomerData((GetProfileDetailsResponse.CustomerData) GetProfileDetailsResponse.CustomerData.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    localMoneysKt = new GetProfileDetailsResponse$EntityData$MerchantData((GetProfileDetailsResponse.MerchantData) GetProfileDetailsResponse.MerchantData.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetProfileDetailsResponse getProfileDetailsResponse = (GetProfileDetailsResponse) obj;
        reverseProtoWriter.getClass();
        getProfileDetailsResponse.getClass();
        reverseProtoWriter.writeBytes(getProfileDetailsResponse.unknownFields());
        LocalMoneysKt localMoneysKt = getProfileDetailsResponse.entity_data;
        if (localMoneysKt instanceof GetProfileDetailsResponse$EntityData$CustomerData) {
            GetProfileDetailsResponse.CustomerData.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((GetProfileDetailsResponse$EntityData$CustomerData) localMoneysKt).getValue());
        } else if (localMoneysKt instanceof GetProfileDetailsResponse$EntityData$MerchantData) {
            GetProfileDetailsResponse.MerchantData.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((GetProfileDetailsResponse$EntityData$MerchantData) localMoneysKt).getValue());
        } else if (localMoneysKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        AnalyticsData.ADAPTER.encodeWithTag(reverseProtoWriter, 5, getProfileDetailsResponse.analytics_data);
        GenericProfileElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, getProfileDetailsResponse.generic_profile_elements);
        ReportState.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getProfileDetailsResponse.report_state);
        ProfileElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getProfileDetailsResponse.elements);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getProfileDetailsResponse.bio);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetProfileDetailsResponse getProfileDetailsResponse = (GetProfileDetailsResponse) obj;
        getProfileDetailsResponse.getClass();
        int encodedSizeWithTag = AnalyticsData.ADAPTER.encodedSizeWithTag(5, getProfileDetailsResponse.analytics_data) + GenericProfileElement.ADAPTER.asRepeated().encodedSizeWithTag(4, getProfileDetailsResponse.generic_profile_elements) + ReportState.ADAPTER.encodedSizeWithTag(3, getProfileDetailsResponse.report_state) + ProfileElement.ADAPTER.asRepeated().encodedSizeWithTag(2, getProfileDetailsResponse.elements) + ProtoAdapter.STRING.encodedSizeWithTag(1, getProfileDetailsResponse.bio) + getProfileDetailsResponse.unknownFields().getSize$okio();
        LocalMoneysKt localMoneysKt = getProfileDetailsResponse.entity_data;
        if (localMoneysKt instanceof GetProfileDetailsResponse$EntityData$CustomerData) {
            return GetProfileDetailsResponse.CustomerData.ADAPTER.encodedSizeWithTag(6, ((GetProfileDetailsResponse$EntityData$CustomerData) localMoneysKt).getValue()) + encodedSizeWithTag;
        }
        if (localMoneysKt instanceof GetProfileDetailsResponse$EntityData$MerchantData) {
            return GetProfileDetailsResponse.MerchantData.ADAPTER.encodedSizeWithTag(7, ((GetProfileDetailsResponse$EntityData$MerchantData) localMoneysKt).getValue()) + encodedSizeWithTag;
        }
        if (localMoneysKt == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetProfileDetailsResponse getProfileDetailsResponse = (GetProfileDetailsResponse) obj;
        getProfileDetailsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getProfileDetailsResponse.elements, ProfileElement.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(getProfileDetailsResponse.generic_profile_elements, GenericProfileElement.ADAPTER);
        AnalyticsData analyticsData = getProfileDetailsResponse.analytics_data;
        AnalyticsData analyticsData2 = analyticsData != null ? (AnalyticsData) AnalyticsData.ADAPTER.redact(analyticsData) : null;
        ByteString byteString = ByteString.EMPTY;
        ReportState reportState = getProfileDetailsResponse.report_state;
        LocalMoneysKt localMoneysKt = getProfileDetailsResponse.entity_data;
        reportState.getClass();
        byteString.getClass();
        return new GetProfileDetailsResponse(null, m1169redactElements, reportState, m1169redactElements2, analyticsData2, localMoneysKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetProfileDetailsResponse getProfileDetailsResponse = (GetProfileDetailsResponse) obj;
        getProfileDetailsResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getProfileDetailsResponse.bio);
        ProfileElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getProfileDetailsResponse.elements);
        ReportState.ADAPTER.encodeWithTag(protoWriter, 3, getProfileDetailsResponse.report_state);
        GenericProfileElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getProfileDetailsResponse.generic_profile_elements);
        AnalyticsData.ADAPTER.encodeWithTag(protoWriter, 5, getProfileDetailsResponse.analytics_data);
        LocalMoneysKt localMoneysKt = getProfileDetailsResponse.entity_data;
        if (localMoneysKt instanceof GetProfileDetailsResponse$EntityData$CustomerData) {
            GetProfileDetailsResponse.CustomerData.ADAPTER.encodeWithTag(protoWriter, 6, ((GetProfileDetailsResponse$EntityData$CustomerData) localMoneysKt).getValue());
        } else if (localMoneysKt instanceof GetProfileDetailsResponse$EntityData$MerchantData) {
            GetProfileDetailsResponse.MerchantData.ADAPTER.encodeWithTag(protoWriter, 7, ((GetProfileDetailsResponse$EntityData$MerchantData) localMoneysKt).getValue());
        } else if (localMoneysKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getProfileDetailsResponse.unknownFields());
    }
}
