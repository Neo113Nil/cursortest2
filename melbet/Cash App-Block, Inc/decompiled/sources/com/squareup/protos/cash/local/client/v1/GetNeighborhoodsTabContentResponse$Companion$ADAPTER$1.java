package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetNeighborhoodsTabContentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList arrayList;
        Object obj;
        Object obj2;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Boolean bool = null;
        Object obj3 = null;
        Object obj4 = null;
        Long l = null;
        Object obj5 = null;
        String str = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetNeighborhoodsTabContentResponse(m, (BrandCollection) obj3, (GetNeighborhoodsTabContentResponse.EnrollmentIncentive) obj4, bool, l, (GetNeighborhoodsTabContentResponse.LocalCashExplainer) obj5, str, (MapboxConfiguration) obj6, arrayList2, (GetNeighborhoodsTabContentResponse.Incentive) obj7, (ShortlinkAction) obj8, (GetNeighborhoodsTabContentResponse.Incentive) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        GetNeighborhoodsTabContentResponse.AppletType.ADAPTER.tryDecode(protoReader, m);
                        arrayList = m;
                        obj = obj3;
                        obj2 = obj4;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        arrayList = m;
                        obj = obj3;
                        obj2 = obj4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                    decode = bool;
                    obj4 = obj2;
                    obj3 = obj;
                    break;
                case 2:
                    obj3 = TransactorKt.decodeMessageOrMerge(BrandCollection.ADAPTER, protoReader, obj3);
                    arrayList = m;
                    decode = bool;
                    break;
                case 3:
                    obj4 = TransactorKt.decodeMessageOrMerge(GetNeighborhoodsTabContentResponse.EnrollmentIncentive.ADAPTER, protoReader, obj4);
                    arrayList = m;
                    decode = bool;
                    break;
                case 4:
                    decode = ProtoAdapter.BOOL.decode(protoReader);
                    arrayList = m;
                    break;
                case 5:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    arrayList = m;
                    decode = bool;
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(GetNeighborhoodsTabContentResponse.LocalCashExplainer.ADAPTER, protoReader, obj5);
                    arrayList = m;
                    decode = bool;
                    break;
                case 7:
                    str = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = bool;
                    break;
                case 8:
                    obj6 = TransactorKt.decodeMessageOrMerge(MapboxConfiguration.ADAPTER, protoReader, obj6);
                    arrayList = m;
                    decode = bool;
                    break;
                case 9:
                    arrayList2.add(BrandCollection.ADAPTER.decode(protoReader));
                    arrayList = m;
                    obj = obj3;
                    obj2 = obj4;
                    decode = bool;
                    obj4 = obj2;
                    obj3 = obj;
                    break;
                case 10:
                    obj7 = TransactorKt.decodeMessageOrMerge(GetNeighborhoodsTabContentResponse.Incentive.ADAPTER, protoReader, obj7);
                    arrayList = m;
                    decode = bool;
                    break;
                case 11:
                    obj8 = TransactorKt.decodeMessageOrMerge(ShortlinkAction.ADAPTER, protoReader, obj8);
                    arrayList = m;
                    decode = bool;
                    break;
                case 12:
                    obj9 = TransactorKt.decodeMessageOrMerge(GetNeighborhoodsTabContentResponse.Incentive.ADAPTER, protoReader, obj9);
                    arrayList = m;
                    decode = bool;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    arrayList = m;
                    obj = obj3;
                    obj2 = obj4;
                    decode = bool;
                    obj4 = obj2;
                    obj3 = obj;
                    break;
            }
            bool = decode;
            m = arrayList;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse = (GetNeighborhoodsTabContentResponse) obj;
        reverseProtoWriter.getClass();
        getNeighborhoodsTabContentResponse.getClass();
        reverseProtoWriter.writeBytes(getNeighborhoodsTabContentResponse.unknownFields());
        ProtoAdapter protoAdapter = GetNeighborhoodsTabContentResponse.Incentive.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, getNeighborhoodsTabContentResponse.orders_incentive);
        ShortlinkAction.ADAPTER.encodeWithTag(reverseProtoWriter, 11, getNeighborhoodsTabContentResponse.change_geo_shortlink);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, getNeighborhoodsTabContentResponse.following_incentive);
        ProtoAdapter protoAdapter2 = BrandCollection.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 9, getNeighborhoodsTabContentResponse.brand_collection_sections);
        MapboxConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 8, getNeighborhoodsTabContentResponse.mapbox_configuration);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 7, getNeighborhoodsTabContentResponse.mapbox_access_token);
        GetNeighborhoodsTabContentResponse.LocalCashExplainer.ADAPTER.encodeWithTag(reverseProtoWriter, 6, getNeighborhoodsTabContentResponse.local_cash_explainer);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 5, getNeighborhoodsTabContentResponse.expires_at);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, getNeighborhoodsTabContentResponse.show_map_button);
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getNeighborhoodsTabContentResponse.enrollment_incentive);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getNeighborhoodsTabContentResponse.brand_collection);
        GetNeighborhoodsTabContentResponse.AppletType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getNeighborhoodsTabContentResponse.applet_ordering);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse = (GetNeighborhoodsTabContentResponse) obj;
        getNeighborhoodsTabContentResponse.getClass();
        int encodedSizeWithTag = GetNeighborhoodsTabContentResponse.AppletType.ADAPTER.asRepeated().encodedSizeWithTag(1, getNeighborhoodsTabContentResponse.applet_ordering) + getNeighborhoodsTabContentResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = BrandCollection.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.asRepeated().encodedSizeWithTag(9, getNeighborhoodsTabContentResponse.brand_collection_sections) + MapboxConfiguration.ADAPTER.encodedSizeWithTag(8, getNeighborhoodsTabContentResponse.mapbox_configuration) + ProtoAdapter.STRING.encodedSizeWithTag(7, getNeighborhoodsTabContentResponse.mapbox_access_token) + GetNeighborhoodsTabContentResponse.LocalCashExplainer.ADAPTER.encodedSizeWithTag(6, getNeighborhoodsTabContentResponse.local_cash_explainer) + ProtoAdapter.INT64.encodedSizeWithTag(5, getNeighborhoodsTabContentResponse.expires_at) + ProtoAdapter.BOOL.encodedSizeWithTag(4, getNeighborhoodsTabContentResponse.show_map_button) + GetNeighborhoodsTabContentResponse.EnrollmentIncentive.ADAPTER.encodedSizeWithTag(3, getNeighborhoodsTabContentResponse.enrollment_incentive) + protoAdapter.encodedSizeWithTag(2, getNeighborhoodsTabContentResponse.brand_collection) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = GetNeighborhoodsTabContentResponse.Incentive.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(12, getNeighborhoodsTabContentResponse.orders_incentive) + ShortlinkAction.ADAPTER.encodedSizeWithTag(11, getNeighborhoodsTabContentResponse.change_geo_shortlink) + protoAdapter2.encodedSizeWithTag(10, getNeighborhoodsTabContentResponse.following_incentive) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse = (GetNeighborhoodsTabContentResponse) obj;
        getNeighborhoodsTabContentResponse.getClass();
        BrandCollection brandCollection = getNeighborhoodsTabContentResponse.brand_collection;
        BrandCollection brandCollection2 = brandCollection != null ? (BrandCollection) BrandCollection.ADAPTER.redact(brandCollection) : null;
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive enrollmentIncentive = getNeighborhoodsTabContentResponse.enrollment_incentive;
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive enrollmentIncentive2 = enrollmentIncentive != null ? (GetNeighborhoodsTabContentResponse.EnrollmentIncentive) GetNeighborhoodsTabContentResponse.EnrollmentIncentive.ADAPTER.redact(enrollmentIncentive) : null;
        GetNeighborhoodsTabContentResponse.LocalCashExplainer localCashExplainer = getNeighborhoodsTabContentResponse.local_cash_explainer;
        GetNeighborhoodsTabContentResponse.LocalCashExplainer localCashExplainer2 = localCashExplainer != null ? (GetNeighborhoodsTabContentResponse.LocalCashExplainer) GetNeighborhoodsTabContentResponse.LocalCashExplainer.ADAPTER.redact(localCashExplainer) : null;
        MapboxConfiguration mapboxConfiguration = getNeighborhoodsTabContentResponse.mapbox_configuration;
        MapboxConfiguration mapboxConfiguration2 = mapboxConfiguration != null ? (MapboxConfiguration) MapboxConfiguration.ADAPTER.redact(mapboxConfiguration) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getNeighborhoodsTabContentResponse.brand_collection_sections, BrandCollection.ADAPTER);
        GetNeighborhoodsTabContentResponse.Incentive incentive = getNeighborhoodsTabContentResponse.following_incentive;
        GetNeighborhoodsTabContentResponse.Incentive incentive2 = incentive != null ? (GetNeighborhoodsTabContentResponse.Incentive) GetNeighborhoodsTabContentResponse.Incentive.ADAPTER.redact(incentive) : null;
        ShortlinkAction shortlinkAction = getNeighborhoodsTabContentResponse.change_geo_shortlink;
        ShortlinkAction shortlinkAction2 = shortlinkAction != null ? (ShortlinkAction) ShortlinkAction.ADAPTER.redact(shortlinkAction) : null;
        GetNeighborhoodsTabContentResponse.Incentive incentive3 = getNeighborhoodsTabContentResponse.orders_incentive;
        GetNeighborhoodsTabContentResponse.Incentive incentive4 = incentive3 != null ? (GetNeighborhoodsTabContentResponse.Incentive) GetNeighborhoodsTabContentResponse.Incentive.ADAPTER.redact(incentive3) : null;
        ByteString byteString = ByteString.EMPTY;
        List list = getNeighborhoodsTabContentResponse.applet_ordering;
        Boolean bool = getNeighborhoodsTabContentResponse.show_map_button;
        Long l = getNeighborhoodsTabContentResponse.expires_at;
        list.getClass();
        byteString.getClass();
        return new GetNeighborhoodsTabContentResponse(list, brandCollection2, enrollmentIncentive2, bool, l, localCashExplainer2, null, mapboxConfiguration2, m1169redactElements, incentive2, shortlinkAction2, incentive4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse = (GetNeighborhoodsTabContentResponse) obj;
        getNeighborhoodsTabContentResponse.getClass();
        GetNeighborhoodsTabContentResponse.AppletType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getNeighborhoodsTabContentResponse.applet_ordering);
        ProtoAdapter protoAdapter = BrandCollection.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, getNeighborhoodsTabContentResponse.brand_collection);
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.ADAPTER.encodeWithTag(protoWriter, 3, getNeighborhoodsTabContentResponse.enrollment_incentive);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getNeighborhoodsTabContentResponse.show_map_button);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, getNeighborhoodsTabContentResponse.expires_at);
        GetNeighborhoodsTabContentResponse.LocalCashExplainer.ADAPTER.encodeWithTag(protoWriter, 6, getNeighborhoodsTabContentResponse.local_cash_explainer);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, getNeighborhoodsTabContentResponse.mapbox_access_token);
        MapboxConfiguration.ADAPTER.encodeWithTag(protoWriter, 8, getNeighborhoodsTabContentResponse.mapbox_configuration);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 9, getNeighborhoodsTabContentResponse.brand_collection_sections);
        ProtoAdapter protoAdapter2 = GetNeighborhoodsTabContentResponse.Incentive.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 10, getNeighborhoodsTabContentResponse.following_incentive);
        ShortlinkAction.ADAPTER.encodeWithTag(protoWriter, 11, getNeighborhoodsTabContentResponse.change_geo_shortlink);
        protoAdapter2.encodeWithTag(protoWriter, 12, getNeighborhoodsTabContentResponse.orders_incentive);
        protoWriter.writeBytes(getNeighborhoodsTabContentResponse.unknownFields());
    }
}
