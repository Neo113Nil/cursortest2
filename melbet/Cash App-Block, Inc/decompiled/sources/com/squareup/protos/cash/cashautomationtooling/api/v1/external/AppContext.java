package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.security.mri.api.v1.Identifiers;
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
public final class AppContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppContext> CREATOR;
    public final String app_token;
    public final String endpoint;
    public final String screen_name;
    public final String variant;
    public final String version_code;
    public final String version_name;

    static {
        AppContext$Companion$ADAPTER$1 appContext$Companion$ADAPTER$1 = new AppContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppContext.class), "type.googleapis.com/squareup.cash.cashautomationtooling.api.external.v1beta1.AppContext", Syntax.PROTO_2, null, "squareup/cash/cashautomationtooling/api/external/v1beta1/bug_report_service.proto");
        ADAPTER = appContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(appContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppContext(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.app_token = str;
        this.endpoint = str2;
        this.version_name = str3;
        this.version_code = str4;
        this.variant = str5;
        this.screen_name = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppContext)) {
            return false;
        }
        AppContext appContext = (AppContext) obj;
        return Intrinsics.areEqual(unknownFields(), appContext.unknownFields()) && Intrinsics.areEqual(this.app_token, appContext.app_token) && Intrinsics.areEqual(this.endpoint, appContext.endpoint) && Intrinsics.areEqual(this.version_name, appContext.version_name) && Intrinsics.areEqual(this.version_code, appContext.version_code) && Intrinsics.areEqual(this.variant, appContext.variant) && Intrinsics.areEqual(this.screen_name, appContext.screen_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.app_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.endpoint;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.version_name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.version_code;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.variant;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.screen_name;
        int hashCode7 = hashCode6 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Identifiers.Builder builder = new Identifiers.Builder(1);
        builder.operating_system = this.app_token;
        builder.operating_system_version = this.endpoint;
        builder.app_version = this.version_name;
        builder.app_token = this.version_code;
        builder.device_id = this.variant;
        builder.vendor_id = this.screen_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.app_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "app_token=", arrayList);
        }
        String str2 = this.endpoint;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "endpoint=", arrayList);
        }
        String str3 = this.version_name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "version_name=", arrayList);
        }
        String str4 = this.version_code;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "version_code=", arrayList);
        }
        String str5 = this.variant;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "variant=", arrayList);
        }
        String str6 = this.screen_name;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "screen_name=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppContext{", "}", 0, null, null, 56);
    }
}
