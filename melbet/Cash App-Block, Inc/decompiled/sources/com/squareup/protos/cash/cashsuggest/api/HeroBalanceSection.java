package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.redwood.treehouse.TreehouseAppContentKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashface.api.Activity;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HeroBalanceSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HeroBalanceSection> CREATOR;
    public final TreehouseAppContentKt content;

    static {
        HeroBalanceSection$Companion$ADAPTER$1 heroBalanceSection$Companion$ADAPTER$1 = new HeroBalanceSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HeroBalanceSection.class), "type.googleapis.com/squareup.cash.cashsuggest.api.HeroBalanceSection", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/HeroBalanceSection.proto");
        ADAPTER = heroBalanceSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(heroBalanceSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroBalanceSection(TreehouseAppContentKt treehouseAppContentKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.content = treehouseAppContentKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeroBalanceSection)) {
            return false;
        }
        HeroBalanceSection heroBalanceSection = (HeroBalanceSection) obj;
        return Intrinsics.areEqual(unknownFields(), heroBalanceSection.unknownFields()) && Intrinsics.areEqual(this.content, heroBalanceSection.content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TreehouseAppContentKt treehouseAppContentKt = this.content;
        int hashCode2 = hashCode + (treehouseAppContentKt != null ? treehouseAppContentKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(26);
        builder.activity = this.content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TreehouseAppContentKt treehouseAppContentKt = this.content;
        if (treehouseAppContentKt != null) {
            arrayList.add("content=" + treehouseAppContentKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HeroBalanceSection{", "}", 0, null, null, 56);
    }

    public final class NoBalance extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<NoBalance> CREATOR;
        public final SectionCTA cta;

        static {
            HeroBalanceSection$NoBalance$Companion$ADAPTER$1 heroBalanceSection$NoBalance$Companion$ADAPTER$1 = new HeroBalanceSection$NoBalance$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NoBalance.class), "type.googleapis.com/squareup.cash.cashsuggest.api.HeroBalanceSection.NoBalance", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/HeroBalanceSection.proto");
            ADAPTER = heroBalanceSection$NoBalance$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(heroBalanceSection$NoBalance$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoBalance(SectionCTA sectionCTA, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.cta = sectionCTA;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NoBalance)) {
                return false;
            }
            NoBalance noBalance = (NoBalance) obj;
            return Intrinsics.areEqual(unknownFields(), noBalance.unknownFields()) && Intrinsics.areEqual(this.cta, noBalance.cta);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            SectionCTA sectionCTA = this.cta;
            int hashCode2 = hashCode + (sectionCTA != null ? sectionCTA.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Activity.Builder builder = new Activity.Builder(27);
            builder.activity = this.cta;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            SectionCTA sectionCTA = this.cta;
            if (sectionCTA != null) {
                arrayList.add("cta=" + sectionCTA);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "NoBalance{", "}", 0, null, null, 56);
        }

        public /* synthetic */ NoBalance(SectionCTA sectionCTA) {
            this(sectionCTA, ByteString.EMPTY);
        }
    }

    public final class SectionCTA extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SectionCTA> CREATOR;
        public final com.squareup.protos.cash.shop.rendering.api.TapAction tap_action;
        public final LocalizedString title;

        static {
            HeroBalanceSection$SectionCTA$Companion$ADAPTER$1 heroBalanceSection$SectionCTA$Companion$ADAPTER$1 = new HeroBalanceSection$SectionCTA$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SectionCTA.class), "type.googleapis.com/squareup.cash.cashsuggest.api.HeroBalanceSection.SectionCTA", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/HeroBalanceSection.proto");
            ADAPTER = heroBalanceSection$SectionCTA$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(heroBalanceSection$SectionCTA$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionCTA(LocalizedString localizedString, com.squareup.protos.cash.shop.rendering.api.TapAction tapAction, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
            this.tap_action = tapAction;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SectionCTA)) {
                return false;
            }
            SectionCTA sectionCTA = (SectionCTA) obj;
            return Intrinsics.areEqual(unknownFields(), sectionCTA.unknownFields()) && Intrinsics.areEqual(this.title, sectionCTA.title) && Intrinsics.areEqual(this.tap_action, sectionCTA.tap_action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.tap_action;
            int hashCode3 = hashCode2 + (tapAction != null ? tapAction.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.Builder builder = new Card.Builder(16);
            builder.image_url = this.title;
            builder.asset = this.tap_action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.tap_action;
            if (tapAction != null) {
                SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SectionCTA{", "}", 0, null, null, 56);
        }

        public /* synthetic */ SectionCTA(LocalizedString localizedString, com.squareup.protos.cash.shop.rendering.api.TapAction tapAction) {
            this(localizedString, tapAction, ByteString.EMPTY);
        }
    }

    public final class PaymentCalendar extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PaymentCalendar> CREATOR;
        public final SectionCTA cta;
        public final Overdue overdue;
        public final Button primary_button;
        public final List upcoming_payments;

        static {
            HeroBalanceSection$PaymentCalendar$Companion$ADAPTER$1 heroBalanceSection$PaymentCalendar$Companion$ADAPTER$1 = new HeroBalanceSection$PaymentCalendar$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentCalendar.class), "type.googleapis.com/squareup.cash.cashsuggest.api.HeroBalanceSection.PaymentCalendar", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/HeroBalanceSection.proto");
            ADAPTER = heroBalanceSection$PaymentCalendar$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(heroBalanceSection$PaymentCalendar$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentCalendar(List list, Overdue overdue, Button button, SectionCTA sectionCTA, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.overdue = overdue;
            this.primary_button = button;
            this.cta = sectionCTA;
            this.upcoming_payments = TransactorKt.immutableCopyOf("upcoming_payments", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PaymentCalendar)) {
                return false;
            }
            PaymentCalendar paymentCalendar = (PaymentCalendar) obj;
            return Intrinsics.areEqual(unknownFields(), paymentCalendar.unknownFields()) && Intrinsics.areEqual(this.upcoming_payments, paymentCalendar.upcoming_payments) && Intrinsics.areEqual(this.overdue, paymentCalendar.overdue) && Intrinsics.areEqual(this.primary_button, paymentCalendar.primary_button) && Intrinsics.areEqual(this.cta, paymentCalendar.cta);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.upcoming_payments);
            Overdue overdue = this.overdue;
            int hashCode = (m + (overdue != null ? overdue.hashCode() : 0)) * 37;
            Button button = this.primary_button;
            int hashCode2 = (hashCode + (button != null ? button.hashCode() : 0)) * 37;
            SectionCTA sectionCTA = this.cta;
            int hashCode3 = hashCode2 + (sectionCTA != null ? sectionCTA.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Trust.Builder builder = new Trust.Builder(17, false);
            builder.icon = this.upcoming_payments;
            builder.title = this.overdue;
            builder.enabled = this.primary_button;
            builder.id = this.cta;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.upcoming_payments;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("upcoming_payments=", arrayList, list);
            }
            Overdue overdue = this.overdue;
            if (overdue != null) {
                arrayList.add("overdue=" + overdue);
            }
            Button button = this.primary_button;
            if (button != null) {
                SizeMode$EnumUnboxingLocalUtility.m("primary_button=", button, arrayList);
            }
            SectionCTA sectionCTA = this.cta;
            if (sectionCTA != null) {
                arrayList.add("cta=" + sectionCTA);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentCalendar{", "}", 0, null, null, 56);
        }

        public final class Overdue extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Overdue> CREATOR;
            public final Money amount;
            public final AnalyticsEvent analytic_tap_event;
            public final AnalyticsEvent analytic_view_event;

            static {
                HeroBalanceSection$PaymentCalendar$Overdue$Companion$ADAPTER$1 heroBalanceSection$PaymentCalendar$Overdue$Companion$ADAPTER$1 = new HeroBalanceSection$PaymentCalendar$Overdue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Overdue.class), "type.googleapis.com/squareup.cash.cashsuggest.api.HeroBalanceSection.PaymentCalendar.Overdue", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/HeroBalanceSection.proto");
                ADAPTER = heroBalanceSection$PaymentCalendar$Overdue$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(heroBalanceSection$PaymentCalendar$Overdue$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Overdue(Money money, AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.amount = money;
                this.analytic_view_event = analyticsEvent;
                this.analytic_tap_event = analyticsEvent2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Overdue)) {
                    return false;
                }
                Overdue overdue = (Overdue) obj;
                return Intrinsics.areEqual(unknownFields(), overdue.unknownFields()) && Intrinsics.areEqual(this.amount, overdue.amount) && Intrinsics.areEqual(this.analytic_view_event, overdue.analytic_view_event) && Intrinsics.areEqual(this.analytic_tap_event, overdue.analytic_tap_event);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Money money = this.amount;
                int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
                AnalyticsEvent analyticsEvent = this.analytic_view_event;
                int hashCode3 = (hashCode2 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
                AnalyticsEvent analyticsEvent2 = this.analytic_tap_event;
                int hashCode4 = hashCode3 + (analyticsEvent2 != null ? analyticsEvent2.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Row.Builder builder = new Row.Builder(25);
                builder.title = this.amount;
                builder.subtitle = this.analytic_view_event;
                builder.action = this.analytic_tap_event;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Money money = this.amount;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
                }
                AnalyticsEvent analyticsEvent = this.analytic_view_event;
                if (analyticsEvent != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("analytic_view_event=", analyticsEvent, arrayList);
                }
                AnalyticsEvent analyticsEvent2 = this.analytic_tap_event;
                if (analyticsEvent2 != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("analytic_tap_event=", analyticsEvent2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Overdue{", "}", 0, null, null, 56);
            }

            public /* synthetic */ Overdue(Money money) {
                this(money, null, null, ByteString.EMPTY);
            }
        }

        public final class Payment extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Payment> CREATOR;
            public final Money amount;
            public final AnalyticsEvent analytic_tap_event;
            public final AnalyticsEvent analytic_view_event;
            public final Long due_date_ms;

            static {
                HeroBalanceSection$PaymentCalendar$Payment$Companion$ADAPTER$1 heroBalanceSection$PaymentCalendar$Payment$Companion$ADAPTER$1 = new HeroBalanceSection$PaymentCalendar$Payment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Payment.class), "type.googleapis.com/squareup.cash.cashsuggest.api.HeroBalanceSection.PaymentCalendar.Payment", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/HeroBalanceSection.proto");
                ADAPTER = heroBalanceSection$PaymentCalendar$Payment$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(heroBalanceSection$PaymentCalendar$Payment$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Payment(Long l, Money money, AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.due_date_ms = l;
                this.amount = money;
                this.analytic_view_event = analyticsEvent;
                this.analytic_tap_event = analyticsEvent2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Payment)) {
                    return false;
                }
                Payment payment = (Payment) obj;
                return Intrinsics.areEqual(unknownFields(), payment.unknownFields()) && Intrinsics.areEqual(this.due_date_ms, payment.due_date_ms) && Intrinsics.areEqual(this.amount, payment.amount) && Intrinsics.areEqual(this.analytic_view_event, payment.analytic_view_event) && Intrinsics.areEqual(this.analytic_tap_event, payment.analytic_tap_event);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Long l = this.due_date_ms;
                int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
                Money money = this.amount;
                int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
                AnalyticsEvent analyticsEvent = this.analytic_view_event;
                int hashCode4 = (hashCode3 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
                AnalyticsEvent analyticsEvent2 = this.analytic_tap_event;
                int hashCode5 = hashCode4 + (analyticsEvent2 != null ? analyticsEvent2.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Trust.Builder builder = new Trust.Builder(18, false);
                builder.icon = this.due_date_ms;
                builder.title = this.amount;
                builder.enabled = this.analytic_view_event;
                builder.id = this.analytic_tap_event;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Long l = this.due_date_ms;
                if (l != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("due_date_ms=", l, arrayList);
                }
                Money money = this.amount;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
                }
                AnalyticsEvent analyticsEvent = this.analytic_view_event;
                if (analyticsEvent != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("analytic_view_event=", analyticsEvent, arrayList);
                }
                AnalyticsEvent analyticsEvent2 = this.analytic_tap_event;
                if (analyticsEvent2 != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("analytic_tap_event=", analyticsEvent2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Payment{", "}", 0, null, null, 56);
            }

            public /* synthetic */ Payment(Long l, Money money) {
                this(l, money, null, null, ByteString.EMPTY);
            }
        }

        public PaymentCalendar(List list, Overdue overdue, Button button, int i) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? null : overdue, button, null, ByteString.EMPTY);
        }
    }
}
