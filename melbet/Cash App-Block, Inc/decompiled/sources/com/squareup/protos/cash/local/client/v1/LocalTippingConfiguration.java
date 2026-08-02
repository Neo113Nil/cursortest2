package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.protos.cash.local.client.v1.SchedulingDay;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalTippingConfiguration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalTippingConfiguration> CREATOR;
    public final String default_description_label;
    public final Boolean enabled;
    public final String subtitle;
    public final List suggestions;
    public final String title;

    public final class Suggestion extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Suggestion> CREATOR;
        public final Boolean hide_tip_amount;
        public final String label;
        public final String local_cash_earnings_label;
        public final Boolean selected_by_default;
        public final String summary_line_label;
        public final LocalMoney tip_amount;

        static {
            LocalTippingConfiguration$Suggestion$Companion$ADAPTER$1 localTippingConfiguration$Suggestion$Companion$ADAPTER$1 = new LocalTippingConfiguration$Suggestion$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Suggestion.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalTippingConfiguration.Suggestion", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_cart.proto");
            ADAPTER = localTippingConfiguration$Suggestion$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localTippingConfiguration$Suggestion$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Suggestion(String str, LocalMoney localMoney, Boolean bool, String str2, Boolean bool2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.tip_amount = localMoney;
            this.selected_by_default = bool;
            this.summary_line_label = str2;
            this.hide_tip_amount = bool2;
            this.local_cash_earnings_label = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Suggestion)) {
                return false;
            }
            Suggestion suggestion = (Suggestion) obj;
            return Intrinsics.areEqual(unknownFields(), suggestion.unknownFields()) && Intrinsics.areEqual(this.label, suggestion.label) && Intrinsics.areEqual(this.tip_amount, suggestion.tip_amount) && Intrinsics.areEqual(this.selected_by_default, suggestion.selected_by_default) && Intrinsics.areEqual(this.summary_line_label, suggestion.summary_line_label) && Intrinsics.areEqual(this.hide_tip_amount, suggestion.hide_tip_amount) && Intrinsics.areEqual(this.local_cash_earnings_label, suggestion.local_cash_earnings_label);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalMoney localMoney = this.tip_amount;
            int hashCode3 = (hashCode2 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
            Boolean bool = this.selected_by_default;
            int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            String str2 = this.summary_line_label;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Boolean bool2 = this.hide_tip_amount;
            int hashCode6 = (hashCode5 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            String str3 = this.local_cash_earnings_label;
            int hashCode7 = hashCode6 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ExpenseSlice.Builder builder = new ExpenseSlice.Builder(16);
            builder.slice_token = this.label;
            builder.requester = this.tip_amount;
            builder.responder = this.selected_by_default;
            builder.amount = this.summary_line_label;
            builder.status = this.hide_tip_amount;
            builder.action = this.local_cash_earnings_label;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            LocalMoney localMoney = this.tip_amount;
            if (localMoney != null) {
                SizeMode$EnumUnboxingLocalUtility.m("tip_amount=", localMoney, arrayList);
            }
            Boolean bool = this.selected_by_default;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("selected_by_default=", bool, arrayList);
            }
            String str2 = this.summary_line_label;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "summary_line_label=", arrayList);
            }
            Boolean bool2 = this.hide_tip_amount;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("hide_tip_amount=", bool2, arrayList);
            }
            String str3 = this.local_cash_earnings_label;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "local_cash_earnings_label=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Suggestion{", "}", 0, null, null, 56);
        }
    }

    static {
        LocalTippingConfiguration$Companion$ADAPTER$1 localTippingConfiguration$Companion$ADAPTER$1 = new LocalTippingConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalTippingConfiguration.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalTippingConfiguration", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_cart.proto");
        ADAPTER = localTippingConfiguration$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localTippingConfiguration$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTippingConfiguration(Boolean bool, String str, String str2, String str3, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.enabled = bool;
        this.default_description_label = str;
        this.title = str2;
        this.subtitle = str3;
        this.suggestions = TransactorKt.immutableCopyOf("suggestions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalTippingConfiguration)) {
            return false;
        }
        LocalTippingConfiguration localTippingConfiguration = (LocalTippingConfiguration) obj;
        return Intrinsics.areEqual(unknownFields(), localTippingConfiguration.unknownFields()) && Intrinsics.areEqual(this.enabled, localTippingConfiguration.enabled) && Intrinsics.areEqual(this.suggestions, localTippingConfiguration.suggestions) && Intrinsics.areEqual(this.default_description_label, localTippingConfiguration.default_description_label) && Intrinsics.areEqual(this.title, localTippingConfiguration.title) && Intrinsics.areEqual(this.subtitle, localTippingConfiguration.subtitle);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enabled;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.suggestions);
        String str = this.default_description_label;
        int hashCode2 = (m + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.subtitle;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SchedulingDay.Builder builder = new SchedulingDay.Builder(1);
        builder.is_in_context = this.enabled;
        builder.day_times = this.suggestions;
        builder.scheduling_day_token = this.default_description_label;
        builder.day_label = this.title;
        builder.day_date_label = this.subtitle;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        List list = this.suggestions;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("suggestions=", arrayList, list);
        }
        String str = this.default_description_label;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "default_description_label=", arrayList);
        }
        String str2 = this.title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
        }
        String str3 = this.subtitle;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "subtitle=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalTippingConfiguration{", "}", 0, null, null, 56);
    }
}
