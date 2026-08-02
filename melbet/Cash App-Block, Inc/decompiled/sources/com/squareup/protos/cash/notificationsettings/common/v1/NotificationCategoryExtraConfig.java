package com.squareup.protos.cash.notificationsettings.common.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.tigers.Tigers;
import com.squareup.protos.common.time.LocalTime;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class NotificationCategoryExtraConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NotificationCategoryExtraConfig> CREATOR;
    public final CategoryEligibility category_eligibility;
    public final zzkb configuration;

    public final class CategoryEligibility extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CategoryEligibility> CREATOR;
        public final Long eligible_at_timestamp_ms;
        public final Long ineligible_at_timestamp_ms;

        static {
            NotificationCategoryExtraConfig$CategoryEligibility$Companion$ADAPTER$1 notificationCategoryExtraConfig$CategoryEligibility$Companion$ADAPTER$1 = new NotificationCategoryExtraConfig$CategoryEligibility$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CategoryEligibility.class), "type.googleapis.com/squareup.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig.CategoryEligibility", Syntax.PROTO_2, null, "squareup/cash/notificationsettings/common/v1/notification_category_extra_config.proto");
            ADAPTER = notificationCategoryExtraConfig$CategoryEligibility$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(notificationCategoryExtraConfig$CategoryEligibility$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CategoryEligibility(Long l, Long l2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.eligible_at_timestamp_ms = l;
            this.ineligible_at_timestamp_ms = l2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CategoryEligibility)) {
                return false;
            }
            CategoryEligibility categoryEligibility = (CategoryEligibility) obj;
            return Intrinsics.areEqual(unknownFields(), categoryEligibility.unknownFields()) && Intrinsics.areEqual(this.eligible_at_timestamp_ms, categoryEligibility.eligible_at_timestamp_ms) && Intrinsics.areEqual(this.ineligible_at_timestamp_ms, categoryEligibility.ineligible_at_timestamp_ms);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.eligible_at_timestamp_ms;
            int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.ineligible_at_timestamp_ms;
            int hashCode3 = hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Tigers.Builder builder = new Tigers.Builder(3);
            builder.tiger_count = this.eligible_at_timestamp_ms;
            builder.fetch_version = this.ineligible_at_timestamp_ms;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.eligible_at_timestamp_ms;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("eligible_at_timestamp_ms=", l, arrayList);
            }
            Long l2 = this.ineligible_at_timestamp_ms;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("ineligible_at_timestamp_ms=", l2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CategoryEligibility{", "}", 0, null, null, 56);
        }
    }

    public final class FamiliesConfiguration extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FamiliesConfiguration> CREATOR;
        public final List sponsored;

        public enum NotificationStatus implements WireEnum {
            NOTIFICATION_STATUS_UNSPECIFIED(0),
            NOTIFICATION_STATUS_ENABLED_ON(1),
            NOTIFICATION_STATUS_ENABLED_OFF(2),
            NOTIFICATION_STATUS_DISABLED(3);

            public static final NotificationCategoryExtraConfig$FamiliesConfiguration$NotificationStatus$Companion$ADAPTER$1 ADAPTER;
            public static final SliceStatus.Companion Companion;
            public final int value;

            static {
                NotificationStatus notificationStatus = NOTIFICATION_STATUS_UNSPECIFIED;
                Companion = new SliceStatus.Companion();
                ADAPTER = new NotificationCategoryExtraConfig$FamiliesConfiguration$NotificationStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(NotificationStatus.class), Syntax.PROTO_2, notificationStatus);
            }

            NotificationStatus(int i) {
                this.value = i;
            }

            public static final NotificationStatus fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return NOTIFICATION_STATUS_UNSPECIFIED;
                }
                if (i == 1) {
                    return NOTIFICATION_STATUS_ENABLED_ON;
                }
                if (i == 2) {
                    return NOTIFICATION_STATUS_ENABLED_OFF;
                }
                if (i != 3) {
                    return null;
                }
                return NOTIFICATION_STATUS_DISABLED;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        public final class SponseeNotificationStatus extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<SponseeNotificationStatus> CREATOR;
            public final String account_token;
            public final NotificationStatus notification_status;

            static {
                NotificationCategoryExtraConfig$FamiliesConfiguration$SponseeNotificationStatus$Companion$ADAPTER$1 notificationCategoryExtraConfig$FamiliesConfiguration$SponseeNotificationStatus$Companion$ADAPTER$1 = new NotificationCategoryExtraConfig$FamiliesConfiguration$SponseeNotificationStatus$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SponseeNotificationStatus.class), "type.googleapis.com/squareup.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus", Syntax.PROTO_2, null, "squareup/cash/notificationsettings/common/v1/notification_category_extra_config.proto");
                ADAPTER = notificationCategoryExtraConfig$FamiliesConfiguration$SponseeNotificationStatus$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(notificationCategoryExtraConfig$FamiliesConfiguration$SponseeNotificationStatus$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SponseeNotificationStatus(String str, NotificationStatus notificationStatus, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.account_token = str;
                this.notification_status = notificationStatus;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SponseeNotificationStatus)) {
                    return false;
                }
                SponseeNotificationStatus sponseeNotificationStatus = (SponseeNotificationStatus) obj;
                return Intrinsics.areEqual(unknownFields(), sponseeNotificationStatus.unknownFields()) && Intrinsics.areEqual(this.account_token, sponseeNotificationStatus.account_token) && this.notification_status == sponseeNotificationStatus.notification_status;
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.account_token;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                NotificationStatus notificationStatus = this.notification_status;
                int hashCode3 = hashCode2 + (notificationStatus != null ? notificationStatus.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                CardModule.Builder builder = new CardModule.Builder(5);
                builder.f1329type = this.account_token;
                builder.use_case = this.notification_status;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.account_token;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "account_token=", arrayList);
                }
                NotificationStatus notificationStatus = this.notification_status;
                if (notificationStatus != null) {
                    arrayList.add("notification_status=" + notificationStatus);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "SponseeNotificationStatus{", "}", 0, null, null, 56);
            }
        }

        static {
            NotificationCategoryExtraConfig$FamiliesConfiguration$Companion$ADAPTER$1 notificationCategoryExtraConfig$FamiliesConfiguration$Companion$ADAPTER$1 = new NotificationCategoryExtraConfig$FamiliesConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FamiliesConfiguration.class), "type.googleapis.com/squareup.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig.FamiliesConfiguration", Syntax.PROTO_2, null, "squareup/cash/notificationsettings/common/v1/notification_category_extra_config.proto");
            ADAPTER = notificationCategoryExtraConfig$FamiliesConfiguration$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(notificationCategoryExtraConfig$FamiliesConfiguration$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FamiliesConfiguration(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.sponsored = TransactorKt.immutableCopyOf("sponsored", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FamiliesConfiguration)) {
                return false;
            }
            FamiliesConfiguration familiesConfiguration = (FamiliesConfiguration) obj;
            return Intrinsics.areEqual(unknownFields(), familiesConfiguration.unknownFields()) && Intrinsics.areEqual(this.sponsored, familiesConfiguration.sponsored);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.sponsored.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            MoneyTab.Builder builder = new MoneyTab.Builder(24, false);
            builder.applets = this.sponsored;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.sponsored;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("sponsored=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FamiliesConfiguration{", "}", 0, null, null, 56);
        }
    }

    static {
        NotificationCategoryExtraConfig$Companion$ADAPTER$1 notificationCategoryExtraConfig$Companion$ADAPTER$1 = new NotificationCategoryExtraConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NotificationCategoryExtraConfig.class), "type.googleapis.com/squareup.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig", Syntax.PROTO_2, null, "squareup/cash/notificationsettings/common/v1/notification_category_extra_config.proto");
        ADAPTER = notificationCategoryExtraConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(notificationCategoryExtraConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCategoryExtraConfig(zzkb zzkbVar, CategoryEligibility categoryEligibility, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.configuration = zzkbVar;
        this.category_eligibility = categoryEligibility;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationCategoryExtraConfig)) {
            return false;
        }
        NotificationCategoryExtraConfig notificationCategoryExtraConfig = (NotificationCategoryExtraConfig) obj;
        return Intrinsics.areEqual(unknownFields(), notificationCategoryExtraConfig.unknownFields()) && Intrinsics.areEqual(this.configuration, notificationCategoryExtraConfig.configuration) && Intrinsics.areEqual(this.category_eligibility, notificationCategoryExtraConfig.category_eligibility);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzkb zzkbVar = this.configuration;
        int hashCode2 = (hashCode + (zzkbVar != null ? zzkbVar.hashCode() : 0)) * 37;
        CategoryEligibility categoryEligibility = this.category_eligibility;
        int hashCode3 = hashCode2 + (categoryEligibility != null ? categoryEligibility.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(4);
        builder.f1329type = this.configuration;
        builder.use_case = this.category_eligibility;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzkb zzkbVar = this.configuration;
        if (zzkbVar != null) {
            arrayList.add("configuration=" + zzkbVar);
        }
        CategoryEligibility categoryEligibility = this.category_eligibility;
        if (categoryEligibility != null) {
            arrayList.add("category_eligibility=" + categoryEligibility);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NotificationCategoryExtraConfig{", "}", 0, null, null, 56);
    }

    public /* synthetic */ NotificationCategoryExtraConfig(zzkb zzkbVar) {
        this(zzkbVar, null, ByteString.EMPTY);
    }

    public final class PriceMovementConfiguration extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PriceMovementConfiguration> CREATOR;
        public final Integer price_movement_percent;
        public final Integer price_movement_percent_default;
        public final Integer price_movement_percent_max;
        public final Integer price_movement_percent_min;

        static {
            NotificationCategoryExtraConfig$PriceMovementConfiguration$Companion$ADAPTER$1 notificationCategoryExtraConfig$PriceMovementConfiguration$Companion$ADAPTER$1 = new NotificationCategoryExtraConfig$PriceMovementConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PriceMovementConfiguration.class), "type.googleapis.com/squareup.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig.PriceMovementConfiguration", Syntax.PROTO_2, null, "squareup/cash/notificationsettings/common/v1/notification_category_extra_config.proto");
            ADAPTER = notificationCategoryExtraConfig$PriceMovementConfiguration$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(notificationCategoryExtraConfig$PriceMovementConfiguration$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PriceMovementConfiguration(Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.price_movement_percent = num;
            this.price_movement_percent_min = num2;
            this.price_movement_percent_max = num3;
            this.price_movement_percent_default = num4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PriceMovementConfiguration)) {
                return false;
            }
            PriceMovementConfiguration priceMovementConfiguration = (PriceMovementConfiguration) obj;
            return Intrinsics.areEqual(unknownFields(), priceMovementConfiguration.unknownFields()) && Intrinsics.areEqual(this.price_movement_percent, priceMovementConfiguration.price_movement_percent) && Intrinsics.areEqual(this.price_movement_percent_min, priceMovementConfiguration.price_movement_percent_min) && Intrinsics.areEqual(this.price_movement_percent_max, priceMovementConfiguration.price_movement_percent_max) && Intrinsics.areEqual(this.price_movement_percent_default, priceMovementConfiguration.price_movement_percent_default);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.price_movement_percent;
            int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.price_movement_percent_min;
            int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
            Integer num3 = this.price_movement_percent_max;
            int hashCode4 = (hashCode3 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
            Integer num4 = this.price_movement_percent_default;
            int hashCode5 = hashCode4 + (num4 != null ? Integer.hashCode(num4.intValue()) : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            LocalTime.Builder builder = new LocalTime.Builder(1);
            builder.hour_of_day = this.price_movement_percent;
            builder.minute_of_hour = this.price_movement_percent_min;
            builder.second_of_minute = this.price_movement_percent_max;
            builder.millis_of_second = this.price_movement_percent_default;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.price_movement_percent;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("price_movement_percent=", num, arrayList);
            }
            Integer num2 = this.price_movement_percent_min;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("price_movement_percent_min=", num2, arrayList);
            }
            Integer num3 = this.price_movement_percent_max;
            if (num3 != null) {
                re$$ExternalSyntheticOutline0.m("price_movement_percent_max=", num3, arrayList);
            }
            Integer num4 = this.price_movement_percent_default;
            if (num4 != null) {
                re$$ExternalSyntheticOutline0.m("price_movement_percent_default=", num4, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PriceMovementConfiguration{", "}", 0, null, null, 56);
        }

        public /* synthetic */ PriceMovementConfiguration(Integer num) {
            this(num, null, null, null, ByteString.EMPTY);
        }
    }
}
