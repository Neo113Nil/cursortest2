package com.squareup.protos.cash.compass.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashregistrar.Account;
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
public final class WifiContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WifiContext> CREATOR;
    public final List available_networks;
    public final String connected_bssid;
    public final Integer connected_frequency_mhz;
    public final Integer connected_rssi;
    public final String connected_ssid;

    static {
        WifiContext$Companion$ADAPTER$1 wifiContext$Companion$ADAPTER$1 = new WifiContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WifiContext.class), "type.googleapis.com/squareup.cash.compass.api.v1.WifiContext", Syntax.PROTO_2, null, "squareup/cash/compass/api/v1/wifi_context.proto");
        ADAPTER = wifiContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(wifiContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiContext(String str, String str2, Integer num, Integer num2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.connected_ssid = str;
        this.connected_bssid = str2;
        this.connected_rssi = num;
        this.connected_frequency_mhz = num2;
        this.available_networks = TransactorKt.immutableCopyOf("available_networks", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiContext)) {
            return false;
        }
        WifiContext wifiContext = (WifiContext) obj;
        return Intrinsics.areEqual(unknownFields(), wifiContext.unknownFields()) && Intrinsics.areEqual(this.connected_ssid, wifiContext.connected_ssid) && Intrinsics.areEqual(this.connected_bssid, wifiContext.connected_bssid) && Intrinsics.areEqual(this.connected_rssi, wifiContext.connected_rssi) && Intrinsics.areEqual(this.connected_frequency_mhz, wifiContext.connected_frequency_mhz) && Intrinsics.areEqual(this.available_networks, wifiContext.available_networks);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.connected_ssid;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.connected_bssid;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.connected_rssi;
        int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.connected_frequency_mhz;
        int hashCode5 = this.available_networks.hashCode() + ((hashCode4 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(26, false);
        builder.customer_token = this.connected_ssid;
        builder.account_token = this.connected_bssid;
        builder.display_name = this.connected_rssi;
        builder.account_type = this.connected_frequency_mhz;
        builder.is_sponsored_account = this.available_networks;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.connected_ssid != null) {
            arrayList.add("connected_ssid=██");
        }
        if (this.connected_bssid != null) {
            arrayList.add("connected_bssid=██");
        }
        Integer num = this.connected_rssi;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("connected_rssi=", num, arrayList);
        }
        Integer num2 = this.connected_frequency_mhz;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("connected_frequency_mhz=", num2, arrayList);
        }
        List list = this.available_networks;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("available_networks=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WifiContext{", "}", 0, null, null, 56);
    }

    public WifiContext(String str, String str2, Integer num, Integer num2, List list) {
        this(str, str2, num, num2, list, ByteString.EMPTY);
    }
}
