package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
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
public final class DeviceContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DeviceContext> CREATOR;
    public final String locale;
    public final String manufacturer;
    public final String model;
    public final Platform platform;
    public final String platform_version;
    public final String resolution_density_bucket;
    public final Integer resolution_density_dpi;
    public final Integer resolution_height;
    public final Integer resolution_width;

    static {
        DeviceContext$Companion$ADAPTER$1 deviceContext$Companion$ADAPTER$1 = new DeviceContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DeviceContext.class), "type.googleapis.com/squareup.cash.cashautomationtooling.api.external.v1beta1.DeviceContext", Syntax.PROTO_2, null, "squareup/cash/cashautomationtooling/api/external/v1beta1/bug_report_service.proto");
        ADAPTER = deviceContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(deviceContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceContext(Platform platform, String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.platform = platform;
        this.platform_version = str;
        this.manufacturer = str2;
        this.model = str3;
        this.resolution_width = num;
        this.resolution_height = num2;
        this.resolution_density_dpi = num3;
        this.resolution_density_bucket = str4;
        this.locale = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceContext)) {
            return false;
        }
        DeviceContext deviceContext = (DeviceContext) obj;
        return Intrinsics.areEqual(unknownFields(), deviceContext.unknownFields()) && this.platform == deviceContext.platform && Intrinsics.areEqual(this.platform_version, deviceContext.platform_version) && Intrinsics.areEqual(this.manufacturer, deviceContext.manufacturer) && Intrinsics.areEqual(this.model, deviceContext.model) && Intrinsics.areEqual(this.resolution_width, deviceContext.resolution_width) && Intrinsics.areEqual(this.resolution_height, deviceContext.resolution_height) && Intrinsics.areEqual(this.resolution_density_dpi, deviceContext.resolution_density_dpi) && Intrinsics.areEqual(this.resolution_density_bucket, deviceContext.resolution_density_bucket) && Intrinsics.areEqual(this.locale, deviceContext.locale);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Platform platform = this.platform;
        int hashCode2 = (hashCode + (platform != null ? platform.hashCode() : 0)) * 37;
        String str = this.platform_version;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.manufacturer;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.model;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Integer num = this.resolution_width;
        int hashCode6 = (hashCode5 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.resolution_height;
        int hashCode7 = (hashCode6 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Integer num3 = this.resolution_density_dpi;
        int hashCode8 = (hashCode7 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
        String str4 = this.resolution_density_bucket;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.locale;
        int hashCode10 = hashCode9 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(7, false);
        builder.locale = this.platform;
        builder.title = this.platform_version;
        builder.info_rows_header = this.manufacturer;
        builder.footer_text = this.model;
        builder.loadable_subtitle = this.resolution_width;
        builder.info_rows = this.resolution_height;
        builder.primary_footer_button_state = this.resolution_density_dpi;
        builder.secondary_footer_button_state = this.resolution_density_bucket;
        builder.payment_plans_data = this.locale;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Platform platform = this.platform;
        if (platform != null) {
            arrayList.add("platform=" + platform);
        }
        String str = this.platform_version;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "platform_version=", arrayList);
        }
        String str2 = this.manufacturer;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "manufacturer=", arrayList);
        }
        String str3 = this.model;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "model=", arrayList);
        }
        Integer num = this.resolution_width;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("resolution_width=", num, arrayList);
        }
        Integer num2 = this.resolution_height;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("resolution_height=", num2, arrayList);
        }
        Integer num3 = this.resolution_density_dpi;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("resolution_density_dpi=", num3, arrayList);
        }
        String str4 = this.resolution_density_bucket;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "resolution_density_bucket=", arrayList);
        }
        String str5 = this.locale;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "locale=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DeviceContext{", "}", 0, null, null, 56);
    }
}
