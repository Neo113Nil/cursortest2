package com.squareup.protos.access.sync_values;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
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
public final class FeatureEligibilityRefreshPolicy extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FeatureEligibilityRefreshPolicy> CREATOR;
    public final String origin_description;
    public final Long policy_change_timestamp;
    public final Long refresh_delay_between_requests_in_millis;
    public final Long refresh_repeat_count;

    static {
        FeatureEligibilityRefreshPolicy$Companion$ADAPTER$1 featureEligibilityRefreshPolicy$Companion$ADAPTER$1 = new FeatureEligibilityRefreshPolicy$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FeatureEligibilityRefreshPolicy.class), "type.googleapis.com/squareup.access.sync_values.FeatureEligibilityRefreshPolicy", Syntax.PROTO_2, null, "squareup/access/sync_values.proto");
        ADAPTER = featureEligibilityRefreshPolicy$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(featureEligibilityRefreshPolicy$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureEligibilityRefreshPolicy(Long l, Long l2, Long l3, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.policy_change_timestamp = l;
        this.refresh_delay_between_requests_in_millis = l2;
        this.refresh_repeat_count = l3;
        this.origin_description = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeatureEligibilityRefreshPolicy)) {
            return false;
        }
        FeatureEligibilityRefreshPolicy featureEligibilityRefreshPolicy = (FeatureEligibilityRefreshPolicy) obj;
        return Intrinsics.areEqual(unknownFields(), featureEligibilityRefreshPolicy.unknownFields()) && Intrinsics.areEqual(this.policy_change_timestamp, featureEligibilityRefreshPolicy.policy_change_timestamp) && Intrinsics.areEqual(this.refresh_delay_between_requests_in_millis, featureEligibilityRefreshPolicy.refresh_delay_between_requests_in_millis) && Intrinsics.areEqual(this.refresh_repeat_count, featureEligibilityRefreshPolicy.refresh_repeat_count) && Intrinsics.areEqual(this.origin_description, featureEligibilityRefreshPolicy.origin_description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.policy_change_timestamp;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.refresh_delay_between_requests_in_millis;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.refresh_repeat_count;
        int hashCode4 = (hashCode3 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        String str = this.origin_description;
        int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(17);
        builder.collection = this.policy_change_timestamp;
        builder.template = this.refresh_delay_between_requests_in_millis;
        builder.source = this.refresh_repeat_count;
        builder.item_variable = this.origin_description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.policy_change_timestamp;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("policy_change_timestamp=", l, arrayList);
        }
        Long l2 = this.refresh_delay_between_requests_in_millis;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("refresh_delay_between_requests_in_millis=", l2, arrayList);
        }
        Long l3 = this.refresh_repeat_count;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("refresh_repeat_count=", l3, arrayList);
        }
        String str = this.origin_description;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "origin_description=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeatureEligibilityRefreshPolicy{", "}", 0, null, null, 56);
    }
}
