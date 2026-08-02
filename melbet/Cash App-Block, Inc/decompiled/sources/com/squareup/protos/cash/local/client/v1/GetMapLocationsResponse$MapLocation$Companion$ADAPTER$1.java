package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.GetMapLocationsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetMapLocationsResponse$MapLocation$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                String str = (String) obj;
                if (str != null) {
                    return new GetMapLocationsResponse.MapLocation(str, (String) obj2, (LocalLocationSummary) obj3, (String) obj4, (LocalMiniCard) obj5, (LocalColor) obj6, (LocalColor) obj7, (LocalEstimatedCompletionDuration) obj8, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj, "brand_token");
                throw null;
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalLocationSummary.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalMiniCard.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalEstimatedCompletionDuration.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetMapLocationsResponse.MapLocation mapLocation = (GetMapLocationsResponse.MapLocation) obj;
        reverseProtoWriter.getClass();
        mapLocation.getClass();
        reverseProtoWriter.writeBytes(mapLocation.unknownFields());
        LocalEstimatedCompletionDuration.ADAPTER.encodeWithTag(reverseProtoWriter, 8, mapLocation.estimated_pickup_wait_time);
        ProtoAdapter protoAdapter = LocalColor.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, mapLocation.background_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, mapLocation.foreground_color);
        LocalMiniCard.ADAPTER.encodeWithTag(reverseProtoWriter, 5, mapLocation.mini_card);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, mapLocation.profile_client_route);
        LocalLocationSummary.ADAPTER.encodeWithTag(reverseProtoWriter, 3, mapLocation.location_summary);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, mapLocation.brand_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, mapLocation.brand_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetMapLocationsResponse.MapLocation mapLocation = (GetMapLocationsResponse.MapLocation) obj;
        mapLocation.getClass();
        int size$okio = mapLocation.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = LocalMiniCard.ADAPTER.encodedSizeWithTag(5, mapLocation.mini_card) + protoAdapter.encodedSizeWithTag(4, mapLocation.profile_client_route) + LocalLocationSummary.ADAPTER.encodedSizeWithTag(3, mapLocation.location_summary) + protoAdapter.encodedSizeWithTag(2, mapLocation.brand_name) + protoAdapter.encodedSizeWithTag(1, mapLocation.brand_token) + size$okio;
        ProtoAdapter protoAdapter2 = LocalColor.ADAPTER;
        return LocalEstimatedCompletionDuration.ADAPTER.encodedSizeWithTag(8, mapLocation.estimated_pickup_wait_time) + protoAdapter2.encodedSizeWithTag(7, mapLocation.background_color) + protoAdapter2.encodedSizeWithTag(6, mapLocation.foreground_color) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetMapLocationsResponse.MapLocation mapLocation = (GetMapLocationsResponse.MapLocation) obj;
        mapLocation.getClass();
        LocalLocationSummary localLocationSummary = mapLocation.location_summary;
        LocalLocationSummary localLocationSummary2 = localLocationSummary != null ? (LocalLocationSummary) LocalLocationSummary.ADAPTER.redact(localLocationSummary) : null;
        LocalMiniCard localMiniCard = mapLocation.mini_card;
        LocalMiniCard localMiniCard2 = localMiniCard != null ? (LocalMiniCard) LocalMiniCard.ADAPTER.redact(localMiniCard) : null;
        LocalColor localColor = mapLocation.foreground_color;
        LocalColor localColor2 = localColor != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor) : null;
        LocalColor localColor3 = mapLocation.background_color;
        LocalColor localColor4 = localColor3 != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor3) : null;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration = mapLocation.estimated_pickup_wait_time;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration2 = localEstimatedCompletionDuration != null ? (LocalEstimatedCompletionDuration) LocalEstimatedCompletionDuration.ADAPTER.redact(localEstimatedCompletionDuration) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = mapLocation.brand_token;
        String str2 = mapLocation.brand_name;
        String str3 = mapLocation.profile_client_route;
        str.getClass();
        byteString.getClass();
        return new GetMapLocationsResponse.MapLocation(str, str2, localLocationSummary2, str3, localMiniCard2, localColor2, localColor4, localEstimatedCompletionDuration2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetMapLocationsResponse.MapLocation mapLocation = (GetMapLocationsResponse.MapLocation) obj;
        mapLocation.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, mapLocation.brand_token);
        protoAdapter.encodeWithTag(protoWriter, 2, mapLocation.brand_name);
        LocalLocationSummary.ADAPTER.encodeWithTag(protoWriter, 3, mapLocation.location_summary);
        protoAdapter.encodeWithTag(protoWriter, 4, mapLocation.profile_client_route);
        LocalMiniCard.ADAPTER.encodeWithTag(protoWriter, 5, mapLocation.mini_card);
        ProtoAdapter protoAdapter2 = LocalColor.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, mapLocation.foreground_color);
        protoAdapter2.encodeWithTag(protoWriter, 7, mapLocation.background_color);
        LocalEstimatedCompletionDuration.ADAPTER.encodeWithTag(protoWriter, 8, mapLocation.estimated_pickup_wait_time);
        protoWriter.writeBytes(mapLocation.unknownFields());
    }
}
