package com.squareup.protos.cash.compass.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes7.dex */
public final class LocationAttributes extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocationAttributes> CREATOR;
    public final Double altitude;
    public final Float altitude_accuracy;
    public final Float bearing;
    public final Float bearing_accuracy;
    public final Long gps_time;
    public final Long gps_time_since_boot;
    public final Boolean is_produced_by_accessory;
    public final Boolean is_spoofed_location;
    public final Float location_accuracy;
    public final Float speed;
    public final Float speed_accuracy;
    public final Long system_time_since_boot;

    static {
        LocationAttributes$Companion$ADAPTER$1 locationAttributes$Companion$ADAPTER$1 = new LocationAttributes$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocationAttributes.class), "type.googleapis.com/squareup.cash.compass.api.v1.LocationAttributes", Syntax.PROTO_2, null, "squareup/cash/compass/api/v1/gps_location_attributes.proto");
        ADAPTER = locationAttributes$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(locationAttributes$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationAttributes(Float f, Double d, Float f2, Float f3, Float f4, Float f5, Float f6, Boolean bool, Boolean bool2, Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.location_accuracy = f;
        this.altitude = d;
        this.altitude_accuracy = f2;
        this.speed = f3;
        this.speed_accuracy = f4;
        this.bearing = f5;
        this.bearing_accuracy = f6;
        this.is_spoofed_location = bool;
        this.is_produced_by_accessory = bool2;
        this.gps_time = l;
        this.gps_time_since_boot = l2;
        this.system_time_since_boot = l3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocationAttributes)) {
            return false;
        }
        LocationAttributes locationAttributes = (LocationAttributes) obj;
        return Intrinsics.areEqual(unknownFields(), locationAttributes.unknownFields()) && Intrinsics.areEqual(this.location_accuracy, locationAttributes.location_accuracy) && Intrinsics.areEqual(this.altitude, locationAttributes.altitude) && Intrinsics.areEqual(this.altitude_accuracy, locationAttributes.altitude_accuracy) && Intrinsics.areEqual(this.speed, locationAttributes.speed) && Intrinsics.areEqual(this.speed_accuracy, locationAttributes.speed_accuracy) && Intrinsics.areEqual(this.bearing, locationAttributes.bearing) && Intrinsics.areEqual(this.bearing_accuracy, locationAttributes.bearing_accuracy) && Intrinsics.areEqual(this.is_spoofed_location, locationAttributes.is_spoofed_location) && Intrinsics.areEqual(this.is_produced_by_accessory, locationAttributes.is_produced_by_accessory) && Intrinsics.areEqual(this.gps_time, locationAttributes.gps_time) && Intrinsics.areEqual(this.gps_time_since_boot, locationAttributes.gps_time_since_boot) && Intrinsics.areEqual(this.system_time_since_boot, locationAttributes.system_time_since_boot);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Float f = this.location_accuracy;
        int hashCode2 = (hashCode + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
        Double d = this.altitude;
        int hashCode3 = (hashCode2 + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
        Float f2 = this.altitude_accuracy;
        int hashCode4 = (hashCode3 + (f2 != null ? Float.hashCode(f2.floatValue()) : 0)) * 37;
        Float f3 = this.speed;
        int hashCode5 = (hashCode4 + (f3 != null ? Float.hashCode(f3.floatValue()) : 0)) * 37;
        Float f4 = this.speed_accuracy;
        int hashCode6 = (hashCode5 + (f4 != null ? Float.hashCode(f4.floatValue()) : 0)) * 37;
        Float f5 = this.bearing;
        int hashCode7 = (hashCode6 + (f5 != null ? Float.hashCode(f5.floatValue()) : 0)) * 37;
        Float f6 = this.bearing_accuracy;
        int hashCode8 = (hashCode7 + (f6 != null ? Float.hashCode(f6.floatValue()) : 0)) * 37;
        Boolean bool = this.is_spoofed_location;
        int hashCode9 = (hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.is_produced_by_accessory;
        int hashCode10 = (hashCode9 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Long l = this.gps_time;
        int hashCode11 = (hashCode10 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.gps_time_since_boot;
        int hashCode12 = (hashCode11 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.system_time_since_boot;
        int hashCode13 = hashCode12 + (l3 != null ? Long.hashCode(l3.longValue()) : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(4, false);
        builder.key_path_ref = this.location_accuracy;
        builder.float_literal = this.altitude;
        builder.string_literal = this.altitude_accuracy;
        builder.blob_literal = this.speed;
        builder.unary_op = this.speed_accuracy;
        builder.binary_op = this.bearing;
        builder.conditional_op = this.bearing_accuracy;
        builder.bool_literal = this.is_spoofed_location;
        builder.filter_op = this.is_produced_by_accessory;
        builder.int_literal = this.gps_time;
        builder.collection_literal = this.gps_time_since_boot;
        builder.format_string_op = this.system_time_since_boot;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Float f = this.location_accuracy;
        if (f != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("location_accuracy=", f, arrayList);
        }
        Double d = this.altitude;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("altitude=", d, arrayList);
        }
        Float f2 = this.altitude_accuracy;
        if (f2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("altitude_accuracy=", f2, arrayList);
        }
        Float f3 = this.speed;
        if (f3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("speed=", f3, arrayList);
        }
        Float f4 = this.speed_accuracy;
        if (f4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("speed_accuracy=", f4, arrayList);
        }
        Float f5 = this.bearing;
        if (f5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("bearing=", f5, arrayList);
        }
        Float f6 = this.bearing_accuracy;
        if (f6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("bearing_accuracy=", f6, arrayList);
        }
        Boolean bool = this.is_spoofed_location;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_spoofed_location=", bool, arrayList);
        }
        Boolean bool2 = this.is_produced_by_accessory;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_produced_by_accessory=", bool2, arrayList);
        }
        Long l = this.gps_time;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("gps_time=", l, arrayList);
        }
        Long l2 = this.gps_time_since_boot;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("gps_time_since_boot=", l2, arrayList);
        }
        Long l3 = this.system_time_since_boot;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("system_time_since_boot=", l3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocationAttributes{", "}", 0, null, null, 56);
    }

    public /* synthetic */ LocationAttributes(Float f, Double d, Float f2, Float f3, Float f4, Float f5, Float f6, Boolean bool, Long l, Long l2, Long l3) {
        this(f, d, f2, f3, f4, f5, f6, bool, null, l, l2, l3, ByteString.EMPTY);
    }
}
