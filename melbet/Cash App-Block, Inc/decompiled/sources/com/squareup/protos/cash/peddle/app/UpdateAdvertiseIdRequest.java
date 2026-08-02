package com.squareup.protos.cash.peddle.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SupportConfig;
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

/* loaded from: classes.dex */
public final class UpdateAdvertiseIdRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateAdvertiseIdRequest> CREATOR;
    public final String android_aaid;
    public final String app_token;
    public final String apps_flyer_id;

    static {
        UpdateAdvertiseIdRequest$Companion$ADAPTER$1 updateAdvertiseIdRequest$Companion$ADAPTER$1 = new UpdateAdvertiseIdRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdateAdvertiseIdRequest.class), "type.googleapis.com/squareup.cash.peddle.app.UpdateAdvertiseIdRequest", Syntax.PROTO_2, null, "squareup/cash/peddle/app/AppServiceProto.proto");
        ADAPTER = updateAdvertiseIdRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(updateAdvertiseIdRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateAdvertiseIdRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.app_token = str;
        this.android_aaid = str2;
        this.apps_flyer_id = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateAdvertiseIdRequest)) {
            return false;
        }
        UpdateAdvertiseIdRequest updateAdvertiseIdRequest = (UpdateAdvertiseIdRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateAdvertiseIdRequest.unknownFields()) && Intrinsics.areEqual(this.app_token, updateAdvertiseIdRequest.app_token) && Intrinsics.areEqual(this.android_aaid, updateAdvertiseIdRequest.android_aaid) && Intrinsics.areEqual(this.apps_flyer_id, updateAdvertiseIdRequest.apps_flyer_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.app_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.android_aaid;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.apps_flyer_id;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupportConfig.Builder builder = new SupportConfig.Builder(23);
        builder.contact_support_url = this.app_token;
        builder.privacy_policy_url = this.android_aaid;
        builder.terms_of_service_url = this.apps_flyer_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.app_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "app_token=", arrayList);
        }
        String str2 = this.android_aaid;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "android_aaid=", arrayList);
        }
        String str3 = this.apps_flyer_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "apps_flyer_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateAdvertiseIdRequest{", "}", 0, null, null, 56);
    }
}
