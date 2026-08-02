package com.squareup.protos.cash.compass.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.protos.cash.groups.ExpenseSlice;
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
public final class WriteGpsDataRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WriteGpsDataRequest> CREATOR;
    public final CellTowerContext cell_tower_context;
    public final GpsDataContext context;
    public final Float latitude;
    public final LocationAttributes location_attributes;
    public final Float longitude;
    public final WifiContext wifi_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(WriteGpsDataRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.compass.api.WriteGpsDataRequest$Companion$ADAPTER$1
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
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new WriteGpsDataRequest((Float) obj, (Float) obj2, (GpsDataContext) obj3, (LocationAttributes) obj4, (WifiContext) obj5, (CellTowerContext) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case 3:
                            obj3 = TransactorKt.decodeMessageOrMerge(GpsDataContext.ADAPTER, protoReader, obj3);
                            break;
                        case 4:
                            obj4 = TransactorKt.decodeMessageOrMerge(LocationAttributes.ADAPTER, protoReader, obj4);
                            break;
                        case 5:
                            obj5 = TransactorKt.decodeMessageOrMerge(WifiContext.ADAPTER, protoReader, obj5);
                            break;
                        case 6:
                            obj6 = TransactorKt.decodeMessageOrMerge(CellTowerContext.ADAPTER, protoReader, obj6);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                WriteGpsDataRequest writeGpsDataRequest = (WriteGpsDataRequest) obj;
                reverseProtoWriter.getClass();
                writeGpsDataRequest.getClass();
                reverseProtoWriter.writeBytes(writeGpsDataRequest.unknownFields());
                CellTowerContext.ADAPTER.encodeWithTag(reverseProtoWriter, 6, writeGpsDataRequest.cell_tower_context);
                WifiContext.ADAPTER.encodeWithTag(reverseProtoWriter, 5, writeGpsDataRequest.wifi_context);
                LocationAttributes.ADAPTER.encodeWithTag(reverseProtoWriter, 4, writeGpsDataRequest.location_attributes);
                GpsDataContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, writeGpsDataRequest.context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, writeGpsDataRequest.longitude);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, writeGpsDataRequest.latitude);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                WriteGpsDataRequest writeGpsDataRequest = (WriteGpsDataRequest) obj;
                writeGpsDataRequest.getClass();
                int size$okio = writeGpsDataRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                return CellTowerContext.ADAPTER.encodedSizeWithTag(6, writeGpsDataRequest.cell_tower_context) + WifiContext.ADAPTER.encodedSizeWithTag(5, writeGpsDataRequest.wifi_context) + LocationAttributes.ADAPTER.encodedSizeWithTag(4, writeGpsDataRequest.location_attributes) + GpsDataContext.ADAPTER.encodedSizeWithTag(3, writeGpsDataRequest.context) + protoAdapter2.encodedSizeWithTag(2, writeGpsDataRequest.longitude) + protoAdapter2.encodedSizeWithTag(1, writeGpsDataRequest.latitude) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                WriteGpsDataRequest writeGpsDataRequest = (WriteGpsDataRequest) obj;
                writeGpsDataRequest.getClass();
                GpsDataContext gpsDataContext = writeGpsDataRequest.context;
                GpsDataContext gpsDataContext2 = gpsDataContext != null ? (GpsDataContext) GpsDataContext.ADAPTER.redact(gpsDataContext) : null;
                LocationAttributes locationAttributes = writeGpsDataRequest.location_attributes;
                LocationAttributes locationAttributes2 = locationAttributes != null ? (LocationAttributes) LocationAttributes.ADAPTER.redact(locationAttributes) : null;
                WifiContext wifiContext = writeGpsDataRequest.wifi_context;
                WifiContext wifiContext2 = wifiContext != null ? (WifiContext) WifiContext.ADAPTER.redact(wifiContext) : null;
                CellTowerContext cellTowerContext = writeGpsDataRequest.cell_tower_context;
                CellTowerContext cellTowerContext2 = cellTowerContext != null ? (CellTowerContext) CellTowerContext.ADAPTER.redact(cellTowerContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new WriteGpsDataRequest(null, null, gpsDataContext2, locationAttributes2, wifiContext2, cellTowerContext2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                WriteGpsDataRequest writeGpsDataRequest = (WriteGpsDataRequest) obj;
                writeGpsDataRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                protoAdapter2.encodeWithTag(protoWriter, 1, writeGpsDataRequest.latitude);
                protoAdapter2.encodeWithTag(protoWriter, 2, writeGpsDataRequest.longitude);
                GpsDataContext.ADAPTER.encodeWithTag(protoWriter, 3, writeGpsDataRequest.context);
                LocationAttributes.ADAPTER.encodeWithTag(protoWriter, 4, writeGpsDataRequest.location_attributes);
                WifiContext.ADAPTER.encodeWithTag(protoWriter, 5, writeGpsDataRequest.wifi_context);
                CellTowerContext.ADAPTER.encodeWithTag(protoWriter, 6, writeGpsDataRequest.cell_tower_context);
                protoWriter.writeBytes(writeGpsDataRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteGpsDataRequest(Float f, Float f2, GpsDataContext gpsDataContext, LocationAttributes locationAttributes, WifiContext wifiContext, CellTowerContext cellTowerContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.latitude = f;
        this.longitude = f2;
        this.context = gpsDataContext;
        this.location_attributes = locationAttributes;
        this.wifi_context = wifiContext;
        this.cell_tower_context = cellTowerContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WriteGpsDataRequest)) {
            return false;
        }
        WriteGpsDataRequest writeGpsDataRequest = (WriteGpsDataRequest) obj;
        return Intrinsics.areEqual(unknownFields(), writeGpsDataRequest.unknownFields()) && Intrinsics.areEqual(this.latitude, writeGpsDataRequest.latitude) && Intrinsics.areEqual(this.longitude, writeGpsDataRequest.longitude) && Intrinsics.areEqual(this.context, writeGpsDataRequest.context) && Intrinsics.areEqual(this.location_attributes, writeGpsDataRequest.location_attributes) && Intrinsics.areEqual(this.wifi_context, writeGpsDataRequest.wifi_context) && Intrinsics.areEqual(this.cell_tower_context, writeGpsDataRequest.cell_tower_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Float f = this.latitude;
        int hashCode2 = (hashCode + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
        Float f2 = this.longitude;
        int hashCode3 = (hashCode2 + (f2 != null ? Float.hashCode(f2.floatValue()) : 0)) * 37;
        GpsDataContext gpsDataContext = this.context;
        int hashCode4 = (hashCode3 + (gpsDataContext != null ? gpsDataContext.hashCode() : 0)) * 37;
        LocationAttributes locationAttributes = this.location_attributes;
        int hashCode5 = (hashCode4 + (locationAttributes != null ? locationAttributes.hashCode() : 0)) * 37;
        WifiContext wifiContext = this.wifi_context;
        int hashCode6 = (hashCode5 + (wifiContext != null ? wifiContext.hashCode() : 0)) * 37;
        CellTowerContext cellTowerContext = this.cell_tower_context;
        int hashCode7 = hashCode6 + (cellTowerContext != null ? cellTowerContext.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(4);
        builder.requester = this.latitude;
        builder.responder = this.longitude;
        builder.amount = this.context;
        builder.status = this.location_attributes;
        builder.slice_token = this.wifi_context;
        builder.action = this.cell_tower_context;
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
        GpsDataContext gpsDataContext = this.context;
        if (gpsDataContext != null) {
            arrayList.add("context=" + gpsDataContext);
        }
        LocationAttributes locationAttributes = this.location_attributes;
        if (locationAttributes != null) {
            arrayList.add("location_attributes=" + locationAttributes);
        }
        WifiContext wifiContext = this.wifi_context;
        if (wifiContext != null) {
            arrayList.add("wifi_context=" + wifiContext);
        }
        CellTowerContext cellTowerContext = this.cell_tower_context;
        if (cellTowerContext != null) {
            arrayList.add("cell_tower_context=" + cellTowerContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WriteGpsDataRequest{", "}", 0, null, null, 56);
    }
}
