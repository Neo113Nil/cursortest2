package com.squareup.protos.cash.moneymap.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsRequest;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.protos.cash.piggybank.api.v2.InterestTiersApyRates;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetRetailerLocationsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetRetailerLocationsRequest> CREATOR;
    public final GetRetailerLocationsRequest$Query$LatLongQuery query;
    public final Double radius_miles;
    public final List retailer_types;

    /* loaded from: classes7.dex */
    public final class LatLongQuery extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LatLongQuery> CREATOR;
        public final Double latitude;
        public final Double longitude;

        static {
            GetRetailerLocationsRequest$LatLongQuery$Companion$ADAPTER$1 getRetailerLocationsRequest$LatLongQuery$Companion$ADAPTER$1 = new GetRetailerLocationsRequest$LatLongQuery$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LatLongQuery.class), "type.googleapis.com/squareup.cash.moneymap.app.GetRetailerLocationsRequest.LatLongQuery", Syntax.PROTO_2, null, "squareup/cash/moneymap/app/get_retailer_locations.proto");
            ADAPTER = getRetailerLocationsRequest$LatLongQuery$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getRetailerLocationsRequest$LatLongQuery$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LatLongQuery(Double d, Double d2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.latitude = d;
            this.longitude = d2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LatLongQuery)) {
                return false;
            }
            LatLongQuery latLongQuery = (LatLongQuery) obj;
            return Intrinsics.areEqual(unknownFields(), latLongQuery.unknownFields()) && Intrinsics.areEqual(this.latitude, latLongQuery.latitude) && Intrinsics.areEqual(this.longitude, latLongQuery.longitude);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Double d = this.latitude;
            int hashCode2 = (hashCode + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
            Double d2 = this.longitude;
            int hashCode3 = hashCode2 + (d2 != null ? Double.hashCode(d2.doubleValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            InterestTiersApyRates.Builder builder = new InterestTiersApyRates.Builder(2);
            builder.standard_interest_apy_rate = this.latitude;
            builder.enhanced_interest_apy_rate = this.longitude;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.latitude != null) {
                arrayList.add("latitude=██");
            }
            if (this.longitude != null) {
                arrayList.add("longitude=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LatLongQuery{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetRetailerLocationsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.moneymap.app.GetRetailerLocationsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                GetRetailerLocationsRequest$Query$LatLongQuery getRetailerLocationsRequest$Query$LatLongQuery = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetRetailerLocationsRequest(m, (Double) obj, getRetailerLocationsRequest$Query$LatLongQuery, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            RetailerType.ADAPTER.tryDecode(protoReader, m);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        obj = ProtoAdapter.DOUBLE.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        getRetailerLocationsRequest$Query$LatLongQuery = new GetRetailerLocationsRequest$Query$LatLongQuery((GetRetailerLocationsRequest.LatLongQuery) GetRetailerLocationsRequest.LatLongQuery.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetRetailerLocationsRequest getRetailerLocationsRequest = (GetRetailerLocationsRequest) obj;
                reverseProtoWriter.getClass();
                getRetailerLocationsRequest.getClass();
                reverseProtoWriter.writeBytes(getRetailerLocationsRequest.unknownFields());
                GetRetailerLocationsRequest$Query$LatLongQuery getRetailerLocationsRequest$Query$LatLongQuery = getRetailerLocationsRequest.query;
                if (getRetailerLocationsRequest$Query$LatLongQuery != null) {
                    GetRetailerLocationsRequest.LatLongQuery.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getRetailerLocationsRequest$Query$LatLongQuery.value);
                } else if (getRetailerLocationsRequest$Query$LatLongQuery != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 2, getRetailerLocationsRequest.radius_miles);
                RetailerType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getRetailerLocationsRequest.retailer_types);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetRetailerLocationsRequest getRetailerLocationsRequest = (GetRetailerLocationsRequest) obj;
                getRetailerLocationsRequest.getClass();
                int encodedSizeWithTag = ProtoAdapter.DOUBLE.encodedSizeWithTag(2, getRetailerLocationsRequest.radius_miles) + RetailerType.ADAPTER.asRepeated().encodedSizeWithTag(1, getRetailerLocationsRequest.retailer_types) + getRetailerLocationsRequest.unknownFields().getSize$okio();
                GetRetailerLocationsRequest$Query$LatLongQuery getRetailerLocationsRequest$Query$LatLongQuery = getRetailerLocationsRequest.query;
                if (getRetailerLocationsRequest$Query$LatLongQuery != null) {
                    return GetRetailerLocationsRequest.LatLongQuery.ADAPTER.encodedSizeWithTag(3, getRetailerLocationsRequest$Query$LatLongQuery.value) + encodedSizeWithTag;
                }
                if (getRetailerLocationsRequest$Query$LatLongQuery == null) {
                    return encodedSizeWithTag;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetRetailerLocationsRequest getRetailerLocationsRequest = (GetRetailerLocationsRequest) obj;
                getRetailerLocationsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                List list = getRetailerLocationsRequest.retailer_types;
                Double d = getRetailerLocationsRequest.radius_miles;
                GetRetailerLocationsRequest$Query$LatLongQuery getRetailerLocationsRequest$Query$LatLongQuery = getRetailerLocationsRequest.query;
                list.getClass();
                byteString.getClass();
                return new GetRetailerLocationsRequest(list, d, getRetailerLocationsRequest$Query$LatLongQuery, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetRetailerLocationsRequest getRetailerLocationsRequest = (GetRetailerLocationsRequest) obj;
                getRetailerLocationsRequest.getClass();
                RetailerType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getRetailerLocationsRequest.retailer_types);
                ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, getRetailerLocationsRequest.radius_miles);
                GetRetailerLocationsRequest$Query$LatLongQuery getRetailerLocationsRequest$Query$LatLongQuery = getRetailerLocationsRequest.query;
                if (getRetailerLocationsRequest$Query$LatLongQuery != null) {
                    GetRetailerLocationsRequest.LatLongQuery.ADAPTER.encodeWithTag(protoWriter, 3, getRetailerLocationsRequest$Query$LatLongQuery.value);
                } else if (getRetailerLocationsRequest$Query$LatLongQuery != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(getRetailerLocationsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRetailerLocationsRequest(List list, Double d, GetRetailerLocationsRequest$Query$LatLongQuery getRetailerLocationsRequest$Query$LatLongQuery, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.radius_miles = d;
        this.query = getRetailerLocationsRequest$Query$LatLongQuery;
        this.retailer_types = TransactorKt.immutableCopyOf("retailer_types", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetRetailerLocationsRequest)) {
            return false;
        }
        GetRetailerLocationsRequest getRetailerLocationsRequest = (GetRetailerLocationsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getRetailerLocationsRequest.unknownFields()) && Intrinsics.areEqual(this.retailer_types, getRetailerLocationsRequest.retailer_types) && Intrinsics.areEqual(this.radius_miles, getRetailerLocationsRequest.radius_miles) && Intrinsics.areEqual(this.query, getRetailerLocationsRequest.query);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.retailer_types);
        Double d = this.radius_miles;
        int hashCode = (m + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
        GetRetailerLocationsRequest$Query$LatLongQuery getRetailerLocationsRequest$Query$LatLongQuery = this.query;
        int hashCode2 = hashCode + (getRetailerLocationsRequest$Query$LatLongQuery != null ? getRetailerLocationsRequest$Query$LatLongQuery.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(19);
        builder.advertisement_data = this.retailer_types;
        builder.transmission_level = this.radius_miles;
        builder.frequency = this.query;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.retailer_types;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("retailer_types=", arrayList, list);
        }
        Double d = this.radius_miles;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("radius_miles=", d, arrayList);
        }
        GetRetailerLocationsRequest$Query$LatLongQuery getRetailerLocationsRequest$Query$LatLongQuery = this.query;
        if (getRetailerLocationsRequest$Query$LatLongQuery != null) {
            arrayList.add("query=" + getRetailerLocationsRequest$Query$LatLongQuery);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRetailerLocationsRequest{", "}", 0, null, null, 56);
    }
}
