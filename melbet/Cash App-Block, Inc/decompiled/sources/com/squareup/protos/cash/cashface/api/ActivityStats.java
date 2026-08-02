package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Activity;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
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
public final class ActivityStats extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivityStats> CREATOR;
    public final Stats activity_stats;

    public final class Stats extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Stats> CREATOR;
        public final Boolean enabled;
        public final Float percentage_received;
        public final String total_received;
        public final String total_sent;
        public final String total_transactions;
        public final Long total_transactions_count;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public Boolean enabled;
            public Float percentage_received;
            public String total_received;
            public String total_sent;
            public String total_transactions;
            public Long total_transactions_count;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new Stats(this.total_sent, this.total_received, this.total_transactions, this.percentage_received, this.enabled, this.total_transactions_count, buildUnknownFields());
                    default:
                        return new GenericProfileElement.ActivityStatsElement.ActivityStats(this.total_sent, this.total_received, this.total_transactions, this.percentage_received, this.enabled, this.total_transactions_count, buildUnknownFields());
                }
            }
        }

        static {
            ActivityStats$Stats$Companion$ADAPTER$1 activityStats$Stats$Companion$ADAPTER$1 = new ActivityStats$Stats$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Stats.class), "type.googleapis.com/squareup.cash.cashface.api.ActivityStats.Stats", Syntax.PROTO_2, null, "squareup/cash/cashface/api/CommerceProfileData.proto");
            ADAPTER = activityStats$Stats$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(activityStats$Stats$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Stats(String str, String str2, String str3, Float f, Boolean bool, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.total_sent = str;
            this.total_received = str2;
            this.total_transactions = str3;
            this.percentage_received = f;
            this.enabled = bool;
            this.total_transactions_count = l;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Stats)) {
                return false;
            }
            Stats stats = (Stats) obj;
            return Intrinsics.areEqual(unknownFields(), stats.unknownFields()) && Intrinsics.areEqual(this.total_sent, stats.total_sent) && Intrinsics.areEqual(this.total_received, stats.total_received) && Intrinsics.areEqual(this.total_transactions, stats.total_transactions) && Intrinsics.areEqual(this.percentage_received, stats.percentage_received) && Intrinsics.areEqual(this.enabled, stats.enabled) && Intrinsics.areEqual(this.total_transactions_count, stats.total_transactions_count);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.total_sent;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.total_received;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.total_transactions;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            Float f = this.percentage_received;
            int hashCode5 = (hashCode4 + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
            Boolean bool = this.enabled;
            int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Long l = this.total_transactions_count;
            int hashCode7 = hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.total_sent = this.total_sent;
            builder.total_received = this.total_received;
            builder.total_transactions = this.total_transactions;
            builder.percentage_received = this.percentage_received;
            builder.enabled = this.enabled;
            builder.total_transactions_count = this.total_transactions_count;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.total_sent;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "total_sent=", arrayList);
            }
            String str2 = this.total_received;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "total_received=", arrayList);
            }
            String str3 = this.total_transactions;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "total_transactions=", arrayList);
            }
            Float f = this.percentage_received;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("percentage_received=", f, arrayList);
            }
            Boolean bool = this.enabled;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
            }
            Long l = this.total_transactions_count;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("total_transactions_count=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Stats{", "}", 0, null, null, 56);
        }
    }

    static {
        ActivityStats$Companion$ADAPTER$1 activityStats$Companion$ADAPTER$1 = new ActivityStats$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivityStats.class), "type.googleapis.com/squareup.cash.cashface.api.ActivityStats", Syntax.PROTO_2, null, "squareup/cash/cashface/api/CommerceProfileData.proto");
        ADAPTER = activityStats$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activityStats$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityStats(Stats stats, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.activity_stats = stats;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityStats)) {
            return false;
        }
        ActivityStats activityStats = (ActivityStats) obj;
        return Intrinsics.areEqual(unknownFields(), activityStats.unknownFields()) && Intrinsics.areEqual(this.activity_stats, activityStats.activity_stats);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Stats stats = this.activity_stats;
        int hashCode2 = hashCode + (stats != null ? stats.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(8);
        builder.activity = this.activity_stats;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Stats stats = this.activity_stats;
        if (stats != null) {
            arrayList.add("activity_stats=" + stats);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivityStats{", "}", 0, null, null, 56);
    }
}
