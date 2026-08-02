package com.squareup.protos.cash.papermate.app;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.btcnetwork.external.GetBitcoinSellerLocationsRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetRetailerLocationsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetRetailerLocationsRequest> CREATOR;
    public final Double latitude;
    public final Double longitude;
    public final Double radius_miles;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Double latitude;
        public Double longitude;
        public Double radius_miles;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GetRetailerLocationsRequest(this.latitude, this.longitude, this.radius_miles, buildUnknownFields());
                default:
                    return new GetBitcoinSellerLocationsRequest(this.latitude, this.longitude, this.radius_miles, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetRetailerLocationsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.papermate.app.GetRetailerLocationsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetRetailerLocationsRequest((Double) obj, (Double) obj2, (Double) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.DOUBLE.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.DOUBLE.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetRetailerLocationsRequest getRetailerLocationsRequest = (GetRetailerLocationsRequest) obj;
                reverseProtoWriter.getClass();
                getRetailerLocationsRequest.getClass();
                reverseProtoWriter.writeBytes(getRetailerLocationsRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.DOUBLE;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, getRetailerLocationsRequest.radius_miles);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getRetailerLocationsRequest.longitude);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getRetailerLocationsRequest.latitude);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetRetailerLocationsRequest getRetailerLocationsRequest = (GetRetailerLocationsRequest) obj;
                getRetailerLocationsRequest.getClass();
                int size$okio = getRetailerLocationsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.DOUBLE;
                return protoAdapter2.encodedSizeWithTag(3, getRetailerLocationsRequest.radius_miles) + protoAdapter2.encodedSizeWithTag(2, getRetailerLocationsRequest.longitude) + protoAdapter2.encodedSizeWithTag(1, getRetailerLocationsRequest.latitude) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetRetailerLocationsRequest getRetailerLocationsRequest = (GetRetailerLocationsRequest) obj;
                getRetailerLocationsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                Double d = getRetailerLocationsRequest.radius_miles;
                byteString.getClass();
                return new GetRetailerLocationsRequest(null, null, d, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetRetailerLocationsRequest getRetailerLocationsRequest = (GetRetailerLocationsRequest) obj;
                getRetailerLocationsRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.DOUBLE;
                protoAdapter2.encodeWithTag(protoWriter, 1, getRetailerLocationsRequest.latitude);
                protoAdapter2.encodeWithTag(protoWriter, 2, getRetailerLocationsRequest.longitude);
                protoAdapter2.encodeWithTag(protoWriter, 3, getRetailerLocationsRequest.radius_miles);
                protoWriter.writeBytes(getRetailerLocationsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRetailerLocationsRequest(Double d, Double d2, Double d3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.latitude = d;
        this.longitude = d2;
        this.radius_miles = d3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetRetailerLocationsRequest)) {
            return false;
        }
        GetRetailerLocationsRequest getRetailerLocationsRequest = (GetRetailerLocationsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getRetailerLocationsRequest.unknownFields()) && Intrinsics.areEqual(this.latitude, getRetailerLocationsRequest.latitude) && Intrinsics.areEqual(this.longitude, getRetailerLocationsRequest.longitude) && Intrinsics.areEqual(this.radius_miles, getRetailerLocationsRequest.radius_miles);
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
        int hashCode3 = (hashCode2 + (d2 != null ? Double.hashCode(d2.doubleValue()) : 0)) * 37;
        Double d3 = this.radius_miles;
        int hashCode4 = hashCode3 + (d3 != null ? Double.hashCode(d3.doubleValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.latitude = this.latitude;
        builder.longitude = this.longitude;
        builder.radius_miles = this.radius_miles;
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
        Double d = this.radius_miles;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("radius_miles=", d, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRetailerLocationsRequest{", "}", 0, null, null, 56);
    }
}
