package com.squareup.protos.cash.compass.api;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.CashDrawerConfig;
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

/* loaded from: classes7.dex */
public final class WifiScanResult extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WifiScanResult> CREATOR;
    public final String bssid;
    public final Integer frequency_mhz;
    public final Integer rssi;
    public final String ssid;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String bssid;
        public Integer frequency_mhz;
        public Integer rssi;
        public String ssid;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new WifiScanResult(this.ssid, this.bssid, this.rssi, this.frequency_mhz, buildUnknownFields());
                default:
                    return new CashDrawerConfig.GetCardAsset(this.ssid, this.bssid, this.rssi, this.frequency_mhz, buildUnknownFields());
            }
        }
    }

    static {
        WifiScanResult$Companion$ADAPTER$1 wifiScanResult$Companion$ADAPTER$1 = new WifiScanResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WifiScanResult.class), "type.googleapis.com/squareup.cash.compass.api.v1.WifiScanResult", Syntax.PROTO_2, null, "squareup/cash/compass/api/v1/wifi_context.proto");
        ADAPTER = wifiScanResult$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(wifiScanResult$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiScanResult(String str, String str2, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.ssid = str;
        this.bssid = str2;
        this.rssi = num;
        this.frequency_mhz = num2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiScanResult)) {
            return false;
        }
        WifiScanResult wifiScanResult = (WifiScanResult) obj;
        return Intrinsics.areEqual(unknownFields(), wifiScanResult.unknownFields()) && Intrinsics.areEqual(this.ssid, wifiScanResult.ssid) && Intrinsics.areEqual(this.bssid, wifiScanResult.bssid) && Intrinsics.areEqual(this.rssi, wifiScanResult.rssi) && Intrinsics.areEqual(this.frequency_mhz, wifiScanResult.frequency_mhz);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.ssid;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.bssid;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.rssi;
        int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.frequency_mhz;
        int hashCode5 = hashCode4 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.ssid = this.ssid;
        builder.bssid = this.bssid;
        builder.rssi = this.rssi;
        builder.frequency_mhz = this.frequency_mhz;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.ssid != null) {
            arrayList.add("ssid=██");
        }
        if (this.bssid != null) {
            arrayList.add("bssid=██");
        }
        Integer num = this.rssi;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("rssi=", num, arrayList);
        }
        Integer num2 = this.frequency_mhz;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("frequency_mhz=", num2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WifiScanResult{", "}", 0, null, null, 56);
    }

    public /* synthetic */ WifiScanResult(String str, String str2, Integer num, Integer num2) {
        this(str, str2, num, num2, ByteString.EMPTY);
    }
}
