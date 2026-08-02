package com.squareup.protos.cash.cashface.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.local.viewmodels.CartItemCounterViewModel;
import app.cash.local.viewmodels.LocalTextsKt;
import app.cash.local.viewmodels.LocationStatus;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.notifications.Op;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.cropview.Edge;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.appthemes.ButtonColors;
import com.squareup.protos.cash.cashface.api.Activity;
import com.squareup.protos.cash.cashface.api.ActivityStats;
import com.squareup.protos.cash.cashface.api.Banner;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.cash.cashface.api.TrustsData;
import com.squareup.protos.cash.cashlimitsxp.api.v1.Empty;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.cash.disputron.Pagination;
import com.squareup.protos.cash.messagingplatformcommon.app.ImageFill;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.app.GetRewardsResponse;
import com.squareup.protos.franklin.common.PaymentRewardStatus;
import com.squareup.protos.franklin.common.RewardsData;
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
public final class GenericProfileElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GenericProfileElement> CREATOR;
    public final LocalTextsKt element;

    public final class AchievementsWidgetElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AchievementsWidgetElement> CREATOR;
        public final String button_client_route;
        public final String button_text;
        public final Long number_of_elements_shown;
        public final List subelements;
        public final String title;

        public final class AchievementsProfileElement extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<AchievementsProfileElement> CREATOR;
            public final String client_route;
            public final Image icon;
            public final ProgressMeterElement progress_meter_element;
            public final String title;

            static {
                GenericProfileElement$AchievementsWidgetElement$AchievementsProfileElement$Companion$ADAPTER$1 genericProfileElement$AchievementsWidgetElement$AchievementsProfileElement$Companion$ADAPTER$1 = new GenericProfileElement$AchievementsWidgetElement$AchievementsProfileElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AchievementsProfileElement.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
                ADAPTER = genericProfileElement$AchievementsWidgetElement$AchievementsProfileElement$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$AchievementsWidgetElement$AchievementsProfileElement$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AchievementsProfileElement(Image image, String str, String str2, ProgressMeterElement progressMeterElement, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.icon = image;
                this.title = str;
                this.client_route = str2;
                this.progress_meter_element = progressMeterElement;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AchievementsProfileElement)) {
                    return false;
                }
                AchievementsProfileElement achievementsProfileElement = (AchievementsProfileElement) obj;
                return Intrinsics.areEqual(unknownFields(), achievementsProfileElement.unknownFields()) && Intrinsics.areEqual(this.icon, achievementsProfileElement.icon) && Intrinsics.areEqual(this.title, achievementsProfileElement.title) && Intrinsics.areEqual(this.client_route, achievementsProfileElement.client_route) && Intrinsics.areEqual(this.progress_meter_element, achievementsProfileElement.progress_meter_element);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Image image = this.icon;
                int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
                String str = this.title;
                int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.client_route;
                int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
                ProgressMeterElement progressMeterElement = this.progress_meter_element;
                int hashCode5 = hashCode4 + (progressMeterElement != null ? progressMeterElement.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Trust.Builder builder = new Trust.Builder(6, false);
                builder.icon = this.icon;
                builder.title = this.title;
                builder.enabled = this.client_route;
                builder.id = this.progress_meter_element;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Image image = this.icon;
                if (image != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
                }
                if (this.title != null) {
                    arrayList.add("title=██");
                }
                String str = this.client_route;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
                }
                ProgressMeterElement progressMeterElement = this.progress_meter_element;
                if (progressMeterElement != null) {
                    arrayList.add("progress_meter_element=" + progressMeterElement);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "AchievementsProfileElement{", "}", 0, null, null, 56);
            }
        }

        static {
            GenericProfileElement$AchievementsWidgetElement$Companion$ADAPTER$1 genericProfileElement$AchievementsWidgetElement$Companion$ADAPTER$1 = new GenericProfileElement$AchievementsWidgetElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AchievementsWidgetElement.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.AchievementsWidgetElement", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
            ADAPTER = genericProfileElement$AchievementsWidgetElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$AchievementsWidgetElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AchievementsWidgetElement(String str, String str2, String str3, List list, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = str;
            this.button_text = str2;
            this.button_client_route = str3;
            this.number_of_elements_shown = l;
            this.subelements = TransactorKt.immutableCopyOf("subelements", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AchievementsWidgetElement)) {
                return false;
            }
            AchievementsWidgetElement achievementsWidgetElement = (AchievementsWidgetElement) obj;
            return Intrinsics.areEqual(unknownFields(), achievementsWidgetElement.unknownFields()) && Intrinsics.areEqual(this.title, achievementsWidgetElement.title) && Intrinsics.areEqual(this.button_text, achievementsWidgetElement.button_text) && Intrinsics.areEqual(this.button_client_route, achievementsWidgetElement.button_client_route) && Intrinsics.areEqual(this.subelements, achievementsWidgetElement.subelements) && Intrinsics.areEqual(this.number_of_elements_shown, achievementsWidgetElement.number_of_elements_shown);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.button_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.button_client_route;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.subelements);
            Long l = this.number_of_elements_shown;
            int hashCode4 = m + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Account.Builder builder = new Account.Builder(5, false);
            builder.customer_token = this.title;
            builder.account_token = this.button_text;
            builder.display_name = this.button_client_route;
            builder.account_type = this.subelements;
            builder.is_sponsored_account = this.number_of_elements_shown;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.button_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "button_text=", arrayList);
            }
            String str3 = this.button_client_route;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_client_route=", arrayList);
            }
            List list = this.subelements;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("subelements=", arrayList, list);
            }
            Long l = this.number_of_elements_shown;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("number_of_elements_shown=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AchievementsWidgetElement{", "}", 0, null, null, 56);
        }
    }

    public final class ActivityElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ActivityElement> CREATOR;

        static {
            GenericProfileElement$ActivityElement$Companion$ADAPTER$1 genericProfileElement$ActivityElement$Companion$ADAPTER$1 = new GenericProfileElement$ActivityElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivityElement.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.ActivityElement", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
            ADAPTER = genericProfileElement$ActivityElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$ActivityElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityElement(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof ActivityElement) && Intrinsics.areEqual(unknownFields(), ((ActivityElement) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Empty.Builder builder = new Empty.Builder(5);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "ActivityElement{}";
        }
    }

    public final class ActivityStatsElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ActivityStatsElement> CREATOR;
        public final List activity_rows;
        public final ActivityStats activity_stats;

        public final class ActivityStats extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ActivityStats> CREATOR;
            public final Boolean enabled;
            public final Float percentage_received;
            public final String total_received;
            public final String total_sent;
            public final String total_transactions;
            public final Long total_transactions_count;

            static {
                GenericProfileElement$ActivityStatsElement$ActivityStats$Companion$ADAPTER$1 genericProfileElement$ActivityStatsElement$ActivityStats$Companion$ADAPTER$1 = new GenericProfileElement$ActivityStatsElement$ActivityStats$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivityStats.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.ActivityStatsElement.ActivityStats", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
                ADAPTER = genericProfileElement$ActivityStatsElement$ActivityStats$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$ActivityStatsElement$ActivityStats$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActivityStats(String str, String str2, String str3, Float f, Boolean bool, Long l, ByteString byteString) {
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
                if (!(obj instanceof ActivityStats)) {
                    return false;
                }
                ActivityStats activityStats = (ActivityStats) obj;
                return Intrinsics.areEqual(unknownFields(), activityStats.unknownFields()) && Intrinsics.areEqual(this.total_sent, activityStats.total_sent) && Intrinsics.areEqual(this.total_received, activityStats.total_received) && Intrinsics.areEqual(this.total_transactions, activityStats.total_transactions) && Intrinsics.areEqual(this.percentage_received, activityStats.percentage_received) && Intrinsics.areEqual(this.enabled, activityStats.enabled) && Intrinsics.areEqual(this.total_transactions_count, activityStats.total_transactions_count);
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
                ActivityStats.Stats.Builder builder = new ActivityStats.Stats.Builder(1);
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
                return CollectionsKt.joinToString$default(arrayList, ", ", "ActivityStats{", "}", 0, null, null, 56);
            }
        }

        static {
            GenericProfileElement$ActivityStatsElement$Companion$ADAPTER$1 genericProfileElement$ActivityStatsElement$Companion$ADAPTER$1 = new GenericProfileElement$ActivityStatsElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivityStatsElement.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.ActivityStatsElement", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
            ADAPTER = genericProfileElement$ActivityStatsElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$ActivityStatsElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityStatsElement(ActivityStats activityStats, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.activity_stats = activityStats;
            this.activity_rows = TransactorKt.immutableCopyOf("activity_rows", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActivityStatsElement)) {
                return false;
            }
            ActivityStatsElement activityStatsElement = (ActivityStatsElement) obj;
            return Intrinsics.areEqual(unknownFields(), activityStatsElement.unknownFields()) && Intrinsics.areEqual(this.activity_stats, activityStatsElement.activity_stats) && Intrinsics.areEqual(this.activity_rows, activityStatsElement.activity_rows);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ActivityStats activityStats = this.activity_stats;
            int hashCode2 = this.activity_rows.hashCode() + ((hashCode + (activityStats != null ? activityStats.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ResponseMetadata.Builder builder = new ResponseMetadata.Builder(22);
            builder.result = this.activity_stats;
            builder.errors = this.activity_rows;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ActivityStats activityStats = this.activity_stats;
            if (activityStats != null) {
                arrayList.add("activity_stats=" + activityStats);
            }
            List list = this.activity_rows;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("activity_rows=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ActivityStatsElement{", "}", 0, null, null, 56);
        }
    }

    public final class BoostElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BoostElement> CREATOR;
        public final RewardsData rewards_data;

        static {
            GenericProfileElement$BoostElement$Companion$ADAPTER$1 genericProfileElement$BoostElement$Companion$ADAPTER$1 = new GenericProfileElement$BoostElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BoostElement.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.BoostElement", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
            ADAPTER = genericProfileElement$BoostElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$BoostElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BoostElement(RewardsData rewardsData, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.rewards_data = rewardsData;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BoostElement)) {
                return false;
            }
            BoostElement boostElement = (BoostElement) obj;
            return Intrinsics.areEqual(unknownFields(), boostElement.unknownFields()) && Intrinsics.areEqual(this.rewards_data, boostElement.rewards_data);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            RewardsData rewardsData = this.rewards_data;
            int hashCode2 = hashCode + (rewardsData != null ? rewardsData.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GetRewardsResponse.Builder builder = new GetRewardsResponse.Builder(1);
            builder.rewards_data = this.rewards_data;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            RewardsData rewardsData = this.rewards_data;
            if (rewardsData != null) {
                arrayList.add("rewards_data=" + rewardsData);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BoostElement{", "}", 0, null, null, 56);
        }
    }

    public final class ButtonElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ButtonElement> CREATOR;
        public final CartItemCounterViewModel.Mode action;
        public final GenericProfileElement$ButtonElement$Style$Tertiary style;
        public final String title;

        public final class BlockAction extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<BlockAction> CREATOR;
            public final Boolean block;
            public final String flow_url;

            static {
                GenericProfileElement$ButtonElement$BlockAction$Companion$ADAPTER$1 genericProfileElement$ButtonElement$BlockAction$Companion$ADAPTER$1 = new GenericProfileElement$ButtonElement$BlockAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BlockAction.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.ButtonElement.BlockAction", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
                ADAPTER = genericProfileElement$ButtonElement$BlockAction$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$ButtonElement$BlockAction$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BlockAction(String str, Boolean bool, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.block = bool;
                this.flow_url = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof BlockAction)) {
                    return false;
                }
                BlockAction blockAction = (BlockAction) obj;
                return Intrinsics.areEqual(unknownFields(), blockAction.unknownFields()) && Intrinsics.areEqual(this.block, blockAction.block) && Intrinsics.areEqual(this.flow_url, blockAction.flow_url);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Boolean bool = this.block;
                int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                String str = this.flow_url;
                int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                PaymentRewardStatus.Builder builder = new PaymentRewardStatus.Builder(1);
                builder.show_payments = this.block;
                builder.main_text = this.flow_url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Boolean bool = this.block;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("block=", bool, arrayList);
                }
                String str = this.flow_url;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "flow_url=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "BlockAction{", "}", 0, null, null, 56);
            }
        }

        public final class ReportAction extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ReportAction> CREATOR;

            static {
                GenericProfileElement$ButtonElement$ReportAction$Companion$ADAPTER$1 genericProfileElement$ButtonElement$ReportAction$Companion$ADAPTER$1 = new GenericProfileElement$ButtonElement$ReportAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ReportAction.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.ButtonElement.ReportAction", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
                ADAPTER = genericProfileElement$ButtonElement$ReportAction$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$ButtonElement$ReportAction$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReportAction(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof ReportAction) && Intrinsics.areEqual(unknownFields(), ((ReportAction) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Empty.Builder builder = new Empty.Builder(6);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "ReportAction{}";
            }
        }

        public final class TertiaryStyle extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<TertiaryStyle> CREATOR;
            public final TitleStyle title_style;

            public enum TitleStyle implements WireEnum {
                DEFAULT(1),
                DESTRUCTIVE(2);

                public final int value;
                public static final Edge.Companion Companion = new Edge.Companion(26);
                public static final GenericProfileElement$ButtonElement$TertiaryStyle$TitleStyle$Companion$ADAPTER$1 ADAPTER = new GenericProfileElement$ButtonElement$TertiaryStyle$TitleStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TitleStyle.class), Syntax.PROTO_2, null);

                TitleStyle(int i) {
                    this.value = i;
                }

                public static final TitleStyle fromValue(int i) {
                    Companion.getClass();
                    if (i == 1) {
                        return DEFAULT;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return DESTRUCTIVE;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            static {
                GenericProfileElement$ButtonElement$TertiaryStyle$Companion$ADAPTER$1 genericProfileElement$ButtonElement$TertiaryStyle$Companion$ADAPTER$1 = new GenericProfileElement$ButtonElement$TertiaryStyle$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TertiaryStyle.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.ButtonElement.TertiaryStyle", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
                ADAPTER = genericProfileElement$ButtonElement$TertiaryStyle$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$ButtonElement$TertiaryStyle$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TertiaryStyle(TitleStyle titleStyle, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title_style = titleStyle;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TertiaryStyle)) {
                    return false;
                }
                TertiaryStyle tertiaryStyle = (TertiaryStyle) obj;
                return Intrinsics.areEqual(unknownFields(), tertiaryStyle.unknownFields()) && this.title_style == tertiaryStyle.title_style;
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                TitleStyle titleStyle = this.title_style;
                int hashCode2 = hashCode + (titleStyle != null ? titleStyle.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Activity.Builder builder = new Activity.Builder(12);
                builder.activity = this.title_style;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                TitleStyle titleStyle = this.title_style;
                if (titleStyle != null) {
                    arrayList.add("title_style=" + titleStyle);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "TertiaryStyle{", "}", 0, null, null, 56);
            }
        }

        public final class ViewChangeAction extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ViewChangeAction> CREATOR;
            public final String client_route;

            static {
                GenericProfileElement$ButtonElement$ViewChangeAction$Companion$ADAPTER$1 genericProfileElement$ButtonElement$ViewChangeAction$Companion$ADAPTER$1 = new GenericProfileElement$ButtonElement$ViewChangeAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ViewChangeAction.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.ButtonElement.ViewChangeAction", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
                ADAPTER = genericProfileElement$ButtonElement$ViewChangeAction$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$ButtonElement$ViewChangeAction$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewChangeAction(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.client_route = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ViewChangeAction)) {
                    return false;
                }
                ViewChangeAction viewChangeAction = (ViewChangeAction) obj;
                return Intrinsics.areEqual(unknownFields(), viewChangeAction.unknownFields()) && Intrinsics.areEqual(this.client_route, viewChangeAction.client_route);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.client_route;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Banner.Builder builder = new Banner.Builder(8);
                builder.banner_color = this.client_route;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.client_route;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ViewChangeAction{", "}", 0, null, null, 56);
            }
        }

        static {
            GenericProfileElement$ButtonElement$Companion$ADAPTER$1 genericProfileElement$ButtonElement$Companion$ADAPTER$1 = new GenericProfileElement$ButtonElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ButtonElement.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.ButtonElement", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
            ADAPTER = genericProfileElement$ButtonElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$ButtonElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ButtonElement(String str, GenericProfileElement$ButtonElement$Style$Tertiary genericProfileElement$ButtonElement$Style$Tertiary, CartItemCounterViewModel.Mode mode, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.style = genericProfileElement$ButtonElement$Style$Tertiary;
            this.action = mode;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ButtonElement)) {
                return false;
            }
            ButtonElement buttonElement = (ButtonElement) obj;
            return Intrinsics.areEqual(unknownFields(), buttonElement.unknownFields()) && Intrinsics.areEqual(this.title, buttonElement.title) && Intrinsics.areEqual(this.style, buttonElement.style) && Intrinsics.areEqual(this.action, buttonElement.action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            GenericProfileElement$ButtonElement$Style$Tertiary genericProfileElement$ButtonElement$Style$Tertiary = this.style;
            int hashCode3 = (hashCode2 + (genericProfileElement$ButtonElement$Style$Tertiary != null ? genericProfileElement$ButtonElement$Style$Tertiary.hashCode() : 0)) * 37;
            CartItemCounterViewModel.Mode mode = this.action;
            int hashCode4 = hashCode3 + (mode != null ? mode.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Row.Builder builder = new Row.Builder(7);
            builder.title = this.title;
            builder.subtitle = this.style;
            builder.action = this.action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.title != null) {
                arrayList.add("title=██");
            }
            GenericProfileElement$ButtonElement$Style$Tertiary genericProfileElement$ButtonElement$Style$Tertiary = this.style;
            if (genericProfileElement$ButtonElement$Style$Tertiary != null) {
                arrayList.add("style=" + genericProfileElement$ButtonElement$Style$Tertiary);
            }
            CartItemCounterViewModel.Mode mode = this.action;
            if (mode != null) {
                arrayList.add("action=" + mode);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonElement{", "}", 0, null, null, 56);
        }
    }

    public final class CardElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CardElement> CREATOR;
        public final GenericProfileElement body;
        public final GenericProfileElement footer;
        public final GenericProfileElement header;
        public final GenericProfileElement subtext;
        public final GenericProfileElement title;

        static {
            GenericProfileElement$CardElement$Companion$ADAPTER$1 genericProfileElement$CardElement$Companion$ADAPTER$1 = new GenericProfileElement$CardElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardElement.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.CardElement", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
            ADAPTER = genericProfileElement$CardElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$CardElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardElement(GenericProfileElement genericProfileElement, GenericProfileElement genericProfileElement2, GenericProfileElement genericProfileElement3, GenericProfileElement genericProfileElement4, GenericProfileElement genericProfileElement5, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.header = genericProfileElement;
            this.title = genericProfileElement2;
            this.body = genericProfileElement3;
            this.subtext = genericProfileElement4;
            this.footer = genericProfileElement5;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CardElement)) {
                return false;
            }
            CardElement cardElement = (CardElement) obj;
            return Intrinsics.areEqual(unknownFields(), cardElement.unknownFields()) && Intrinsics.areEqual(this.header, cardElement.header) && Intrinsics.areEqual(this.title, cardElement.title) && Intrinsics.areEqual(this.body, cardElement.body) && Intrinsics.areEqual(this.subtext, cardElement.subtext) && Intrinsics.areEqual(this.footer, cardElement.footer);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            GenericProfileElement genericProfileElement = this.header;
            int hashCode2 = (hashCode + (genericProfileElement != null ? genericProfileElement.hashCode() : 0)) * 37;
            GenericProfileElement genericProfileElement2 = this.title;
            int hashCode3 = (hashCode2 + (genericProfileElement2 != null ? genericProfileElement2.hashCode() : 0)) * 37;
            GenericProfileElement genericProfileElement3 = this.body;
            int hashCode4 = (hashCode3 + (genericProfileElement3 != null ? genericProfileElement3.hashCode() : 0)) * 37;
            GenericProfileElement genericProfileElement4 = this.subtext;
            int hashCode5 = (hashCode4 + (genericProfileElement4 != null ? genericProfileElement4.hashCode() : 0)) * 37;
            GenericProfileElement genericProfileElement5 = this.footer;
            int hashCode6 = hashCode5 + (genericProfileElement5 != null ? genericProfileElement5.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Account.Builder builder = new Account.Builder(6, false);
            builder.customer_token = this.header;
            builder.account_token = this.title;
            builder.display_name = this.body;
            builder.account_type = this.subtext;
            builder.is_sponsored_account = this.footer;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            GenericProfileElement genericProfileElement = this.header;
            if (genericProfileElement != null) {
                arrayList.add("header=" + genericProfileElement);
            }
            GenericProfileElement genericProfileElement2 = this.title;
            if (genericProfileElement2 != null) {
                arrayList.add("title=" + genericProfileElement2);
            }
            GenericProfileElement genericProfileElement3 = this.body;
            if (genericProfileElement3 != null) {
                arrayList.add("body=" + genericProfileElement3);
            }
            GenericProfileElement genericProfileElement4 = this.subtext;
            if (genericProfileElement4 != null) {
                arrayList.add("subtext=" + genericProfileElement4);
            }
            GenericProfileElement genericProfileElement5 = this.footer;
            if (genericProfileElement5 != null) {
                arrayList.add("footer=" + genericProfileElement5);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CardElement{", "}", 0, null, null, 56);
        }
    }

    public final class ColorScheme extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ColorScheme> CREATOR;
        public final Color primary;
        public final Color secondary;

        static {
            GenericProfileElement$ColorScheme$Companion$ADAPTER$1 genericProfileElement$ColorScheme$Companion$ADAPTER$1 = new GenericProfileElement$ColorScheme$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ColorScheme.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.ColorScheme", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
            ADAPTER = genericProfileElement$ColorScheme$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$ColorScheme$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ColorScheme(Color color, Color color2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.primary = color;
            this.secondary = color2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ColorScheme)) {
                return false;
            }
            ColorScheme colorScheme = (ColorScheme) obj;
            return Intrinsics.areEqual(unknownFields(), colorScheme.unknownFields()) && Intrinsics.areEqual(this.primary, colorScheme.primary) && Intrinsics.areEqual(this.secondary, colorScheme.secondary);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Color color = this.primary;
            int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
            Color color2 = this.secondary;
            int hashCode3 = hashCode2 + (color2 != null ? color2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ButtonColors.Builder builder = new ButtonColors.Builder(1);
            builder.currency_conversion_button_color = this.primary;
            builder.payment_pad_main_buttons_color = this.secondary;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Color color = this.primary;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("primary=", color, arrayList);
            }
            Color color2 = this.secondary;
            if (color2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("secondary=", color2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ColorScheme{", "}", 0, null, null, 56);
        }
    }

    public final class IconTextElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<IconTextElement> CREATOR;
        public final Image icon;
        public final String title;

        static {
            GenericProfileElement$IconTextElement$Companion$ADAPTER$1 genericProfileElement$IconTextElement$Companion$ADAPTER$1 = new GenericProfileElement$IconTextElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IconTextElement.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.IconTextElement", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
            ADAPTER = genericProfileElement$IconTextElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$IconTextElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconTextElement(Image image, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon = image;
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IconTextElement)) {
                return false;
            }
            IconTextElement iconTextElement = (IconTextElement) obj;
            return Intrinsics.areEqual(unknownFields(), iconTextElement.unknownFields()) && Intrinsics.areEqual(this.icon, iconTextElement.icon) && Intrinsics.areEqual(this.title, iconTextElement.title);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.icon;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            String str = this.title;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ImageFill.Builder builder = new ImageFill.Builder(1);
            builder.image_asset = this.icon;
            builder.asset_url = this.title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.icon;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
            }
            if (this.title != null) {
                arrayList.add("title=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "IconTextElement{", "}", 0, null, null, 56);
        }
    }

    public final class LabeledContainerElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LabeledContainerElement> CREATOR;
        public final GenericProfileElement call_to_action;
        public final List elements;
        public final String title;

        static {
            GenericProfileElement$LabeledContainerElement$Companion$ADAPTER$1 genericProfileElement$LabeledContainerElement$Companion$ADAPTER$1 = new GenericProfileElement$LabeledContainerElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LabeledContainerElement.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.LabeledContainerElement", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
            ADAPTER = genericProfileElement$LabeledContainerElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$LabeledContainerElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LabeledContainerElement(String str, GenericProfileElement genericProfileElement, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = str;
            this.call_to_action = genericProfileElement;
            this.elements = TransactorKt.immutableCopyOf("elements", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LabeledContainerElement)) {
                return false;
            }
            LabeledContainerElement labeledContainerElement = (LabeledContainerElement) obj;
            return Intrinsics.areEqual(unknownFields(), labeledContainerElement.unknownFields()) && Intrinsics.areEqual(this.title, labeledContainerElement.title) && Intrinsics.areEqual(this.call_to_action, labeledContainerElement.call_to_action) && Intrinsics.areEqual(this.elements, labeledContainerElement.elements);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            GenericProfileElement genericProfileElement = this.call_to_action;
            int hashCode3 = this.elements.hashCode() + ((hashCode2 + (genericProfileElement != null ? genericProfileElement.hashCode() : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Row.Builder builder = new Row.Builder(8);
            builder.title = this.title;
            builder.subtitle = this.call_to_action;
            builder.action = this.elements;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            GenericProfileElement genericProfileElement = this.call_to_action;
            if (genericProfileElement != null) {
                arrayList.add("call_to_action=" + genericProfileElement);
            }
            List list = this.elements;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("elements=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LabeledContainerElement{", "}", 0, null, null, 56);
        }
    }

    public final class ListElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ListElement> CREATOR;
        public final List elements;
        public final Direction scroll_direction;

        public enum Direction implements WireEnum {
            VERTICAL(1),
            HORIZONTAL(2);

            public final int value;
            public static final Op.Companion Companion = new Op.Companion();
            public static final GenericProfileElement$ListElement$Direction$Companion$ADAPTER$1 ADAPTER = new GenericProfileElement$ListElement$Direction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Direction.class), Syntax.PROTO_2, null);

            Direction(int i) {
                this.value = i;
            }

            public static final Direction fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return VERTICAL;
                }
                if (i != 2) {
                    return null;
                }
                return HORIZONTAL;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            GenericProfileElement$ListElement$Companion$ADAPTER$1 genericProfileElement$ListElement$Companion$ADAPTER$1 = new GenericProfileElement$ListElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ListElement.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.ListElement", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
            ADAPTER = genericProfileElement$ListElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$ListElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ListElement(Direction direction, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.scroll_direction = direction;
            this.elements = TransactorKt.immutableCopyOf("elements", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ListElement)) {
                return false;
            }
            ListElement listElement = (ListElement) obj;
            return Intrinsics.areEqual(unknownFields(), listElement.unknownFields()) && this.scroll_direction == listElement.scroll_direction && Intrinsics.areEqual(this.elements, listElement.elements);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Direction direction = this.scroll_direction;
            int hashCode2 = this.elements.hashCode() + ((hashCode + (direction != null ? direction.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ResponseMetadata.Builder builder = new ResponseMetadata.Builder(23);
            builder.result = this.scroll_direction;
            builder.errors = this.elements;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Direction direction = this.scroll_direction;
            if (direction != null) {
                arrayList.add("scroll_direction=" + direction);
            }
            List list = this.elements;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("elements=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ListElement{", "}", 0, null, null, 56);
        }
    }

    public final class ProgressMeterElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ProgressMeterElement> CREATOR;
        public final ColorScheme color_scheme;
        public final Image icon;
        public final Long progress;
        public final Long total;

        static {
            GenericProfileElement$ProgressMeterElement$Companion$ADAPTER$1 genericProfileElement$ProgressMeterElement$Companion$ADAPTER$1 = new GenericProfileElement$ProgressMeterElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProgressMeterElement.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.ProgressMeterElement", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
            ADAPTER = genericProfileElement$ProgressMeterElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$ProgressMeterElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProgressMeterElement(Image image, ColorScheme colorScheme, Long l, Long l2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon = image;
            this.color_scheme = colorScheme;
            this.progress = l;
            this.total = l2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProgressMeterElement)) {
                return false;
            }
            ProgressMeterElement progressMeterElement = (ProgressMeterElement) obj;
            return Intrinsics.areEqual(unknownFields(), progressMeterElement.unknownFields()) && Intrinsics.areEqual(this.icon, progressMeterElement.icon) && Intrinsics.areEqual(this.color_scheme, progressMeterElement.color_scheme) && Intrinsics.areEqual(this.progress, progressMeterElement.progress) && Intrinsics.areEqual(this.total, progressMeterElement.total);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.icon;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            ColorScheme colorScheme = this.color_scheme;
            int hashCode3 = (hashCode2 + (colorScheme != null ? colorScheme.hashCode() : 0)) * 37;
            Long l = this.progress;
            int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.total;
            int hashCode5 = hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Trust.Builder builder = new Trust.Builder(7, false);
            builder.icon = this.icon;
            builder.title = this.color_scheme;
            builder.enabled = this.progress;
            builder.id = this.total;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.icon;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
            }
            ColorScheme colorScheme = this.color_scheme;
            if (colorScheme != null) {
                arrayList.add("color_scheme=" + colorScheme);
            }
            Long l = this.progress;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("progress=", l, arrayList);
            }
            Long l2 = this.total;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("total=", l2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ProgressMeterElement{", "}", 0, null, null, 56);
        }
    }

    public final class TextElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TextElement> CREATOR;
        public final Style style;
        public final String text;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Style implements WireEnum {
            public static final /* synthetic */ Style[] $VALUES;
            public static final GenericProfileElement$TextElement$Style$Companion$ADAPTER$1 ADAPTER;
            public static final Style BIO;
            public static final CardProduct.Companion Companion;

            static {
                Style style = new Style("BIO", 0);
                BIO = style;
                $VALUES = new Style[]{style};
                Companion = new CardProduct.Companion(27);
                ADAPTER = new GenericProfileElement$TextElement$Style$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Style.class), Syntax.PROTO_2, null);
            }

            public static final Style fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return BIO;
                }
                return null;
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return 1;
            }
        }

        static {
            GenericProfileElement$TextElement$Companion$ADAPTER$1 genericProfileElement$TextElement$Companion$ADAPTER$1 = new GenericProfileElement$TextElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextElement.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.TextElement", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
            ADAPTER = genericProfileElement$TextElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$TextElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextElement(String str, Style style, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.style = style;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TextElement)) {
                return false;
            }
            TextElement textElement = (TextElement) obj;
            return Intrinsics.areEqual(unknownFields(), textElement.unknownFields()) && Intrinsics.areEqual(this.text, textElement.text) && this.style == textElement.style;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Style style = this.style;
            int hashCode3 = hashCode2 + (style != null ? style.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ResponseMetadata.Builder builder = new ResponseMetadata.Builder(24);
            builder.errors = this.text;
            builder.result = this.style;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.text != null) {
                arrayList.add("text=██");
            }
            Style style = this.style;
            if (style != null) {
                arrayList.add("style=" + style);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TextElement{", "}", 0, null, null, 56);
        }
    }

    public final class TrustElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TrustElement> CREATOR;
        public final Icon arcade_icon;
        public final Icon arcade_small_icon;
        public final Boolean enabled;
        public final Image icon;
        public final Id id;
        public final String title;

        public enum Id implements WireEnum {
            JOINED_AT(1),
            PAID_BY(2),
            CONTACTS(3),
            LAST_ACTIVE(4);

            public final int value;
            public static final Error.Code.Companion Companion = new Error.Code.Companion(27);
            public static final GenericProfileElement$TrustElement$Id$Companion$ADAPTER$1 ADAPTER = new GenericProfileElement$TrustElement$Id$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Id.class), Syntax.PROTO_2, null);

            Id(int i) {
                this.value = i;
            }

            public static final Id fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return JOINED_AT;
                }
                if (i == 2) {
                    return PAID_BY;
                }
                if (i == 3) {
                    return CONTACTS;
                }
                if (i != 4) {
                    return null;
                }
                return LAST_ACTIVE;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            GenericProfileElement$TrustElement$Companion$ADAPTER$1 genericProfileElement$TrustElement$Companion$ADAPTER$1 = new GenericProfileElement$TrustElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TrustElement.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.TrustElement", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
            ADAPTER = genericProfileElement$TrustElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$TrustElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrustElement(Image image, String str, Boolean bool, Id id, Icon icon, Icon icon2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon = image;
            this.title = str;
            this.enabled = bool;
            this.id = id;
            this.arcade_icon = icon;
            this.arcade_small_icon = icon2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrustElement)) {
                return false;
            }
            TrustElement trustElement = (TrustElement) obj;
            return Intrinsics.areEqual(unknownFields(), trustElement.unknownFields()) && Intrinsics.areEqual(this.icon, trustElement.icon) && Intrinsics.areEqual(this.title, trustElement.title) && Intrinsics.areEqual(this.enabled, trustElement.enabled) && this.id == trustElement.id && Intrinsics.areEqual(this.arcade_icon, trustElement.arcade_icon) && Intrinsics.areEqual(this.arcade_small_icon, trustElement.arcade_small_icon);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.icon;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            Boolean bool = this.enabled;
            int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Id id = this.id;
            int hashCode5 = (hashCode4 + (id != null ? id.hashCode() : 0)) * 37;
            Icon icon = this.arcade_icon;
            int hashCode6 = (hashCode5 + (icon != null ? icon.hashCode() : 0)) * 37;
            Icon icon2 = this.arcade_small_icon;
            int hashCode7 = hashCode6 + (icon2 != null ? icon2.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Error.Builder builder = new Error.Builder(18, false);
            builder.category = this.icon;
            builder.description = this.title;
            builder.retryable = this.enabled;
            builder.code = this.id;
            builder.field = this.arcade_icon;
            builder.metadata = this.arcade_small_icon;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.icon;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
            }
            if (this.title != null) {
                arrayList.add("title=██");
            }
            Boolean bool = this.enabled;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
            }
            Id id = this.id;
            if (id != null) {
                arrayList.add("id=" + id);
            }
            Icon icon = this.arcade_icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("arcade_icon=", icon, arrayList);
            }
            Icon icon2 = this.arcade_small_icon;
            if (icon2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("arcade_small_icon=", icon2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TrustElement{", "}", 0, null, null, 56);
        }
    }

    public final class TrustElements extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TrustElements> CREATOR;
        public final List subelements;

        static {
            GenericProfileElement$TrustElements$Companion$ADAPTER$1 genericProfileElement$TrustElements$Companion$ADAPTER$1 = new GenericProfileElement$TrustElements$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TrustElements.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.TrustElements", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
            ADAPTER = genericProfileElement$TrustElements$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$TrustElements$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrustElements(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.subelements = TransactorKt.immutableCopyOf("subelements", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrustElements)) {
                return false;
            }
            TrustElements trustElements = (TrustElements) obj;
            return Intrinsics.areEqual(unknownFields(), trustElements.unknownFields()) && Intrinsics.areEqual(this.subelements, trustElements.subelements);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.subelements.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            TrustsData.Builder builder = new TrustsData.Builder(3);
            builder.trust = this.subelements;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.subelements;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("subelements=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TrustElements{", "}", 0, null, null, 56);
        }
    }

    public final class ValueUnitElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ValueUnitElement> CREATOR;
        public final LocationStatus value_unit;

        public final class Split extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Split> CREATOR;
            public final Long numerical_value;
            public final String unit_description_suffix;

            static {
                GenericProfileElement$ValueUnitElement$Split$Companion$ADAPTER$1 genericProfileElement$ValueUnitElement$Split$Companion$ADAPTER$1 = new GenericProfileElement$ValueUnitElement$Split$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Split.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.ValueUnitElement.Split", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
                ADAPTER = genericProfileElement$ValueUnitElement$Split$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$ValueUnitElement$Split$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Split(String str, Long l, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.numerical_value = l;
                this.unit_description_suffix = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Split)) {
                    return false;
                }
                Split split = (Split) obj;
                return Intrinsics.areEqual(unknownFields(), split.unknownFields()) && Intrinsics.areEqual(this.numerical_value, split.numerical_value) && Intrinsics.areEqual(this.unit_description_suffix, split.unit_description_suffix);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Long l = this.numerical_value;
                int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
                String str = this.unit_description_suffix;
                int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Pagination.Builder builder = new Pagination.Builder(3);
                builder.limit = this.numerical_value;
                builder.offset = this.unit_description_suffix;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Long l = this.numerical_value;
                if (l != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("numerical_value=", l, arrayList);
                }
                String str = this.unit_description_suffix;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "unit_description_suffix=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Split{", "}", 0, null, null, 56);
            }
        }

        static {
            GenericProfileElement$ValueUnitElement$Companion$ADAPTER$1 genericProfileElement$ValueUnitElement$Companion$ADAPTER$1 = new GenericProfileElement$ValueUnitElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ValueUnitElement.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement.ValueUnitElement", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
            ADAPTER = genericProfileElement$ValueUnitElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$ValueUnitElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValueUnitElement(LocationStatus locationStatus, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.value_unit = locationStatus;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ValueUnitElement)) {
                return false;
            }
            ValueUnitElement valueUnitElement = (ValueUnitElement) obj;
            return Intrinsics.areEqual(unknownFields(), valueUnitElement.unknownFields()) && Intrinsics.areEqual(this.value_unit, valueUnitElement.value_unit);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocationStatus locationStatus = this.value_unit;
            int hashCode2 = hashCode + (locationStatus != null ? locationStatus.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Activity.Builder builder = new Activity.Builder(13);
            builder.activity = this.value_unit;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocationStatus locationStatus = this.value_unit;
            if (locationStatus != null) {
                arrayList.add("value_unit=" + locationStatus);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ValueUnitElement{", "}", 0, null, null, 56);
        }
    }

    static {
        GenericProfileElement$Companion$ADAPTER$1 genericProfileElement$Companion$ADAPTER$1 = new GenericProfileElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GenericProfileElement.class), "type.googleapis.com/squareup.cash.cashface.ui.GenericProfileElement", Syntax.PROTO_2, null, "squareup/cash/cashface/ui/GenericProfileElement.proto");
        ADAPTER = genericProfileElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(genericProfileElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericProfileElement(LocalTextsKt localTextsKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.element = localTextsKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GenericProfileElement)) {
            return false;
        }
        GenericProfileElement genericProfileElement = (GenericProfileElement) obj;
        return Intrinsics.areEqual(unknownFields(), genericProfileElement.unknownFields()) && Intrinsics.areEqual(this.element, genericProfileElement.element);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalTextsKt localTextsKt = this.element;
        int hashCode2 = hashCode + (localTextsKt != null ? localTextsKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(11);
        builder.activity = this.element;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalTextsKt localTextsKt = this.element;
        if (localTextsKt != null) {
            arrayList.add("element=" + localTextsKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GenericProfileElement{", "}", 0, null, null, 56);
    }
}
