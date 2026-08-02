package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.CreateTestAccountResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class DeviceLocationHeuristics extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DeviceLocationHeuristics> CREATOR;
    public final String carrier_country_code;
    public final String carrier_name;
    public final String country_code;
    public final List installed_keyboards;
    public final String language;
    public final String time_zone;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String carrier_country_code;
        public String carrier_name;
        public String country_code;
        public List installed_keyboards;
        public String language;
        public String time_zone;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    break;
                default:
                    this.installed_keyboards = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new DeviceLocationHeuristics(this.language, this.country_code, this.carrier_name, this.carrier_country_code, this.time_zone, this.installed_keyboards, buildUnknownFields());
                default:
                    return new CreateTestAccountResponse(this.language, this.country_code, this.carrier_name, this.carrier_country_code, this.time_zone, this.installed_keyboards, buildUnknownFields());
            }
        }
    }

    static {
        DeviceLocationHeuristics$Companion$ADAPTER$1 deviceLocationHeuristics$Companion$ADAPTER$1 = new DeviceLocationHeuristics$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DeviceLocationHeuristics.class), "type.googleapis.com/squareup.franklin.common.DeviceLocationHeuristics", Syntax.PROTO_2, null, "squareup/franklin/common/device_location_heuristics.proto");
        ADAPTER = deviceLocationHeuristics$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(deviceLocationHeuristics$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLocationHeuristics(String str, String str2, String str3, String str4, String str5, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.language = str;
        this.country_code = str2;
        this.carrier_name = str3;
        this.carrier_country_code = str4;
        this.time_zone = str5;
        this.installed_keyboards = TransactorKt.immutableCopyOf("installed_keyboards", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceLocationHeuristics)) {
            return false;
        }
        DeviceLocationHeuristics deviceLocationHeuristics = (DeviceLocationHeuristics) obj;
        return Intrinsics.areEqual(unknownFields(), deviceLocationHeuristics.unknownFields()) && Intrinsics.areEqual(this.language, deviceLocationHeuristics.language) && Intrinsics.areEqual(this.country_code, deviceLocationHeuristics.country_code) && Intrinsics.areEqual(this.carrier_name, deviceLocationHeuristics.carrier_name) && Intrinsics.areEqual(this.carrier_country_code, deviceLocationHeuristics.carrier_country_code) && Intrinsics.areEqual(this.time_zone, deviceLocationHeuristics.time_zone) && Intrinsics.areEqual(this.installed_keyboards, deviceLocationHeuristics.installed_keyboards);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.language;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.country_code;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.carrier_name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.carrier_country_code;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.time_zone;
        int hashCode6 = this.installed_keyboards.hashCode() + ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.language = this.language;
        builder.country_code = this.country_code;
        builder.carrier_name = this.carrier_name;
        builder.carrier_country_code = this.carrier_country_code;
        builder.time_zone = this.time_zone;
        builder.installed_keyboards = this.installed_keyboards;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.language;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "language=", arrayList);
        }
        String str2 = this.country_code;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "country_code=", arrayList);
        }
        String str3 = this.carrier_name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "carrier_name=", arrayList);
        }
        String str4 = this.carrier_country_code;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "carrier_country_code=", arrayList);
        }
        String str5 = this.time_zone;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "time_zone=", arrayList);
        }
        List list = this.installed_keyboards;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("installed_keyboards=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DeviceLocationHeuristics{", "}", 0, null, null, 56);
    }
}
