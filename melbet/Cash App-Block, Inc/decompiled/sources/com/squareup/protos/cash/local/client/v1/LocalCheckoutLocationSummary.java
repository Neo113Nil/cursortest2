package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCheckoutLocationSummary extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalCheckoutLocationSummary> CREATOR;
    public final LocalAddress address;
    public final Boolean allow_no_contact_delivery;
    public final CurbsidePickupSettings curbside_pickup_settings;
    public final List free_fulfillment_configurations;
    public final String name;
    public final String time_zone;
    public final String token;

    static {
        LocalCheckoutLocationSummary$Companion$ADAPTER$1 localCheckoutLocationSummary$Companion$ADAPTER$1 = new LocalCheckoutLocationSummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalCheckoutLocationSummary.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalCheckoutLocationSummary", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_common.proto");
        ADAPTER = localCheckoutLocationSummary$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localCheckoutLocationSummary$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCheckoutLocationSummary(String str, LocalAddress localAddress, String str2, String str3, Boolean bool, CurbsidePickupSettings curbsidePickupSettings, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.token = str;
        this.address = localAddress;
        this.name = str2;
        this.time_zone = str3;
        this.allow_no_contact_delivery = bool;
        this.curbside_pickup_settings = curbsidePickupSettings;
        this.free_fulfillment_configurations = TransactorKt.immutableCopyOf("free_fulfillment_configurations", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalCheckoutLocationSummary)) {
            return false;
        }
        LocalCheckoutLocationSummary localCheckoutLocationSummary = (LocalCheckoutLocationSummary) obj;
        return Intrinsics.areEqual(unknownFields(), localCheckoutLocationSummary.unknownFields()) && Intrinsics.areEqual(this.token, localCheckoutLocationSummary.token) && Intrinsics.areEqual(this.address, localCheckoutLocationSummary.address) && Intrinsics.areEqual(this.name, localCheckoutLocationSummary.name) && Intrinsics.areEqual(this.time_zone, localCheckoutLocationSummary.time_zone) && Intrinsics.areEqual(this.allow_no_contact_delivery, localCheckoutLocationSummary.allow_no_contact_delivery) && Intrinsics.areEqual(this.curbside_pickup_settings, localCheckoutLocationSummary.curbside_pickup_settings) && Intrinsics.areEqual(this.free_fulfillment_configurations, localCheckoutLocationSummary.free_fulfillment_configurations);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalAddress localAddress = this.address;
        int hashCode3 = (hashCode2 + (localAddress != null ? localAddress.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.time_zone;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.allow_no_contact_delivery;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        CurbsidePickupSettings curbsidePickupSettings = this.curbside_pickup_settings;
        int hashCode7 = this.free_fulfillment_configurations.hashCode() + ((hashCode6 + (curbsidePickupSettings != null ? curbsidePickupSettings.hashCode() : 0)) * 37);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(3);
        builder.customer_identifier = this.token;
        builder.cashtag = this.address;
        builder.full_name = this.name;
        builder.profile_photo_url = this.time_zone;
        builder.added_at = this.allow_no_contact_delivery;
        builder.participant_type = this.curbside_pickup_settings;
        builder.aggregated_contribution_amount = this.free_fulfillment_configurations;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        LocalAddress localAddress = this.address;
        if (localAddress != null) {
            arrayList.add("address=" + localAddress);
        }
        String str2 = this.name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
        }
        String str3 = this.time_zone;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "time_zone=", arrayList);
        }
        Boolean bool = this.allow_no_contact_delivery;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("allow_no_contact_delivery=", bool, arrayList);
        }
        CurbsidePickupSettings curbsidePickupSettings = this.curbside_pickup_settings;
        if (curbsidePickupSettings != null) {
            arrayList.add("curbside_pickup_settings=" + curbsidePickupSettings);
        }
        List list = this.free_fulfillment_configurations;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("free_fulfillment_configurations=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalCheckoutLocationSummary{", "}", 0, null, null, 56);
    }
}
