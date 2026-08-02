package com.squareup.protos.cash.familynotifications.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.PaymentRewardStatus;
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
public final class RealtimeNotificationSetting extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RealtimeNotificationSetting> CREATOR;
    public final Boolean enabled;
    public final String target_customer_token;

    static {
        RealtimeNotificationSetting$Companion$ADAPTER$1 realtimeNotificationSetting$Companion$ADAPTER$1 = new RealtimeNotificationSetting$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RealtimeNotificationSetting.class), "type.googleapis.com/squareup.cash.familynotifications.api.v1beta1.RealtimeNotificationSetting", Syntax.PROTO_2, null, "squareup/cash/familynotifications/api/v1beta1/service.proto");
        ADAPTER = realtimeNotificationSetting$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(realtimeNotificationSetting$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealtimeNotificationSetting(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.enabled = bool;
        this.target_customer_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RealtimeNotificationSetting)) {
            return false;
        }
        RealtimeNotificationSetting realtimeNotificationSetting = (RealtimeNotificationSetting) obj;
        return Intrinsics.areEqual(unknownFields(), realtimeNotificationSetting.unknownFields()) && Intrinsics.areEqual(this.enabled, realtimeNotificationSetting.enabled) && Intrinsics.areEqual(this.target_customer_token, realtimeNotificationSetting.target_customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.target_customer_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PaymentRewardStatus.Builder builder = new PaymentRewardStatus.Builder(4);
        builder.show_payments = this.enabled;
        builder.main_text = this.target_customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        String str = this.target_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "target_customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RealtimeNotificationSetting{", "}", 0, null, null, 56);
    }
}
