package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
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
public final class ScheduledReloadData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ScheduledReloadData> CREATOR;
    public final String funding_source;
    public final Money min_amount;
    public final Long next_reload_at;
    public final ScheduledTransactionPreference scheduled_reload_preference;
    public final Boolean supported;

    static {
        ScheduledReloadData$Companion$ADAPTER$1 scheduledReloadData$Companion$ADAPTER$1 = new ScheduledReloadData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ScheduledReloadData.class), "type.googleapis.com/squareup.franklin.common.ScheduledReloadData", Syntax.PROTO_2, null, "squareup/franklin/schedule_data.proto");
        ADAPTER = scheduledReloadData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(scheduledReloadData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledReloadData(ScheduledTransactionPreference scheduledTransactionPreference, Long l, String str, Boolean bool, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.scheduled_reload_preference = scheduledTransactionPreference;
        this.next_reload_at = l;
        this.funding_source = str;
        this.supported = bool;
        this.min_amount = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScheduledReloadData)) {
            return false;
        }
        ScheduledReloadData scheduledReloadData = (ScheduledReloadData) obj;
        return Intrinsics.areEqual(unknownFields(), scheduledReloadData.unknownFields()) && Intrinsics.areEqual(this.scheduled_reload_preference, scheduledReloadData.scheduled_reload_preference) && Intrinsics.areEqual(this.next_reload_at, scheduledReloadData.next_reload_at) && Intrinsics.areEqual(this.funding_source, scheduledReloadData.funding_source) && Intrinsics.areEqual(this.supported, scheduledReloadData.supported) && Intrinsics.areEqual(this.min_amount, scheduledReloadData.min_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ScheduledTransactionPreference scheduledTransactionPreference = this.scheduled_reload_preference;
        int hashCode2 = (hashCode + (scheduledTransactionPreference != null ? scheduledTransactionPreference.hashCode() : 0)) * 37;
        Long l = this.next_reload_at;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.funding_source;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.supported;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Money money = this.min_amount;
        int hashCode6 = hashCode5 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(14, false);
        builder.alias = this.scheduled_reload_preference;
        builder.expires_at = this.next_reload_at;
        builder.version = this.funding_source;
        builder.verified = this.supported;
        builder.display_date = this.min_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ScheduledTransactionPreference scheduledTransactionPreference = this.scheduled_reload_preference;
        if (scheduledTransactionPreference != null) {
            arrayList.add("scheduled_reload_preference=" + scheduledTransactionPreference);
        }
        Long l = this.next_reload_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("next_reload_at=", l, arrayList);
        }
        String str = this.funding_source;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "funding_source=", arrayList);
        }
        Boolean bool = this.supported;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("supported=", bool, arrayList);
        }
        Money money = this.min_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("min_amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScheduledReloadData{", "}", 0, null, null, 56);
    }
}
