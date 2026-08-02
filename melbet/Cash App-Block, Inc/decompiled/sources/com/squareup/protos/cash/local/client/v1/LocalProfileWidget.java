package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ActionEvent;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.local.client.v1.InputValue;
import com.squareup.protos.cash.money.content.MoneyTab;
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
public final class LocalProfileWidget extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalProfileWidget> CREATOR;
    public final ActionEvent.Companion data;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1313type;

    public final class AboutData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AboutData> CREATOR;

        static {
            LocalProfileWidget$AboutData$Companion$ADAPTER$1 localProfileWidget$AboutData$Companion$ADAPTER$1 = new LocalProfileWidget$AboutData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AboutData.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalProfileWidget.AboutData", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_profile_widgets.proto");
            ADAPTER = localProfileWidget$AboutData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localProfileWidget$AboutData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AboutData(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof AboutData) && Intrinsics.areEqual(unknownFields(), ((AboutData) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.OpenID.Builder builder = new Action.OpenID.Builder(20);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "AboutData{}";
        }
    }

    public final class BookingRebookingData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BookingRebookingData> CREATOR;

        static {
            LocalProfileWidget$BookingRebookingData$Companion$ADAPTER$1 localProfileWidget$BookingRebookingData$Companion$ADAPTER$1 = new LocalProfileWidget$BookingRebookingData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BookingRebookingData.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalProfileWidget.BookingRebookingData", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_profile_widgets.proto");
            ADAPTER = localProfileWidget$BookingRebookingData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localProfileWidget$BookingRebookingData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BookingRebookingData(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof BookingRebookingData) && Intrinsics.areEqual(unknownFields(), ((BookingRebookingData) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.OpenID.Builder builder = new Action.OpenID.Builder(21);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "BookingRebookingData{}";
        }
    }

    public final class BookingServicesData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BookingServicesData> CREATOR;

        static {
            LocalProfileWidget$BookingServicesData$Companion$ADAPTER$1 localProfileWidget$BookingServicesData$Companion$ADAPTER$1 = new LocalProfileWidget$BookingServicesData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BookingServicesData.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalProfileWidget.BookingServicesData", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_profile_widgets.proto");
            ADAPTER = localProfileWidget$BookingServicesData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localProfileWidget$BookingServicesData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BookingServicesData(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof BookingServicesData) && Intrinsics.areEqual(unknownFields(), ((BookingServicesData) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.OpenID.Builder builder = new Action.OpenID.Builder(22);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "BookingServicesData{}";
        }
    }

    public final class BookingTeamMembersData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BookingTeamMembersData> CREATOR;

        static {
            LocalProfileWidget$BookingTeamMembersData$Companion$ADAPTER$1 localProfileWidget$BookingTeamMembersData$Companion$ADAPTER$1 = new LocalProfileWidget$BookingTeamMembersData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BookingTeamMembersData.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalProfileWidget.BookingTeamMembersData", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_profile_widgets.proto");
            ADAPTER = localProfileWidget$BookingTeamMembersData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localProfileWidget$BookingTeamMembersData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BookingTeamMembersData(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof BookingTeamMembersData) && Intrinsics.areEqual(unknownFields(), ((BookingTeamMembersData) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.OpenID.Builder builder = new Action.OpenID.Builder(23);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "BookingTeamMembersData{}";
        }
    }

    public final class ContactData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ContactData> CREATOR;

        static {
            LocalProfileWidget$ContactData$Companion$ADAPTER$1 localProfileWidget$ContactData$Companion$ADAPTER$1 = new LocalProfileWidget$ContactData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ContactData.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalProfileWidget.ContactData", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_profile_widgets.proto");
            ADAPTER = localProfileWidget$ContactData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localProfileWidget$ContactData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContactData(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof ContactData) && Intrinsics.areEqual(unknownFields(), ((ContactData) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.OpenID.Builder builder = new Action.OpenID.Builder(24);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "ContactData{}";
        }
    }

    public final class HoursData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HoursData> CREATOR;

        static {
            LocalProfileWidget$HoursData$Companion$ADAPTER$1 localProfileWidget$HoursData$Companion$ADAPTER$1 = new LocalProfileWidget$HoursData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HoursData.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalProfileWidget.HoursData", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_profile_widgets.proto");
            ADAPTER = localProfileWidget$HoursData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localProfileWidget$HoursData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HoursData(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof HoursData) && Intrinsics.areEqual(unknownFields(), ((HoursData) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.OpenID.Builder builder = new Action.OpenID.Builder(25);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "HoursData{}";
        }
    }

    public final class LinksData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LinksData> CREATOR;
        public final List links;

        public final class Link extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Link> CREATOR;
            public final String title;
            public final String url;

            static {
                LocalProfileWidget$LinksData$Link$Companion$ADAPTER$1 localProfileWidget$LinksData$Link$Companion$ADAPTER$1 = new LocalProfileWidget$LinksData$Link$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Link.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalProfileWidget.LinksData.Link", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_profile_widgets.proto");
                ADAPTER = localProfileWidget$LinksData$Link$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(localProfileWidget$LinksData$Link$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Link(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.url = str2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Link)) {
                    return false;
                }
                Link link = (Link) obj;
                return Intrinsics.areEqual(unknownFields(), link.unknownFields()) && Intrinsics.areEqual(this.title, link.title) && Intrinsics.areEqual(this.url, link.url);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.url;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                FullName.Builder builder = new FullName.Builder(23);
                builder.given_name = this.title;
                builder.family_name = this.url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.url;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Link{", "}", 0, null, null, 56);
            }
        }

        static {
            LocalProfileWidget$LinksData$Companion$ADAPTER$1 localProfileWidget$LinksData$Companion$ADAPTER$1 = new LocalProfileWidget$LinksData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LinksData.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalProfileWidget.LinksData", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_profile_widgets.proto");
            ADAPTER = localProfileWidget$LinksData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localProfileWidget$LinksData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinksData(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.links = TransactorKt.immutableCopyOf("links", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LinksData)) {
                return false;
            }
            LinksData linksData = (LinksData) obj;
            return Intrinsics.areEqual(unknownFields(), linksData.unknownFields()) && Intrinsics.areEqual(this.links, linksData.links);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.links.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            MoneyTab.Builder builder = new MoneyTab.Builder(12, false);
            builder.applets = this.links;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.links;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("links=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LinksData{", "}", 0, null, null, 56);
        }
    }

    public final class OrderingMenusData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OrderingMenusData> CREATOR;

        static {
            LocalProfileWidget$OrderingMenusData$Companion$ADAPTER$1 localProfileWidget$OrderingMenusData$Companion$ADAPTER$1 = new LocalProfileWidget$OrderingMenusData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OrderingMenusData.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalProfileWidget.OrderingMenusData", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_profile_widgets.proto");
            ADAPTER = localProfileWidget$OrderingMenusData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localProfileWidget$OrderingMenusData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderingMenusData(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof OrderingMenusData) && Intrinsics.areEqual(unknownFields(), ((OrderingMenusData) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.OpenID.Builder builder = new Action.OpenID.Builder(26);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "OrderingMenusData{}";
        }
    }

    public final class OrderingReorderingData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OrderingReorderingData> CREATOR;

        static {
            LocalProfileWidget$OrderingReorderingData$Companion$ADAPTER$1 localProfileWidget$OrderingReorderingData$Companion$ADAPTER$1 = new LocalProfileWidget$OrderingReorderingData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OrderingReorderingData.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalProfileWidget.OrderingReorderingData", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_profile_widgets.proto");
            ADAPTER = localProfileWidget$OrderingReorderingData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localProfileWidget$OrderingReorderingData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderingReorderingData(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof OrderingReorderingData) && Intrinsics.areEqual(unknownFields(), ((OrderingReorderingData) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.OpenID.Builder builder = new Action.OpenID.Builder(27);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "OrderingReorderingData{}";
        }
    }

    public final class PoliciesData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PoliciesData> CREATOR;

        static {
            LocalProfileWidget$PoliciesData$Companion$ADAPTER$1 localProfileWidget$PoliciesData$Companion$ADAPTER$1 = new LocalProfileWidget$PoliciesData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PoliciesData.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalProfileWidget.PoliciesData", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_profile_widgets.proto");
            ADAPTER = localProfileWidget$PoliciesData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localProfileWidget$PoliciesData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PoliciesData(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof PoliciesData) && Intrinsics.areEqual(unknownFields(), ((PoliciesData) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.OpenID.Builder builder = new Action.OpenID.Builder(28);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "PoliciesData{}";
        }
    }

    public final class RetailData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RetailData> CREATOR;

        static {
            LocalProfileWidget$RetailData$Companion$ADAPTER$1 localProfileWidget$RetailData$Companion$ADAPTER$1 = new LocalProfileWidget$RetailData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RetailData.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalProfileWidget.RetailData", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_profile_widgets.proto");
            ADAPTER = localProfileWidget$RetailData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localProfileWidget$RetailData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetailData(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof RetailData) && Intrinsics.areEqual(unknownFields(), ((RetailData) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.OpenID.Builder builder = new Action.OpenID.Builder(29);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "RetailData{}";
        }
    }

    public enum Type implements WireEnum {
        TYPE_UNSPECIFIED(0),
        TYPE_ORDERING_REORDERING(1),
        TYPE_ORDERING_MENUS(2),
        TYPE_BOOKING_REBOOKING(3),
        TYPE_BOOKING_SERVICES(4),
        TYPE_BOOKING_TEAM_MEMBERS(5),
        TYPE_ABOUT(6),
        TYPE_POLICIES(7),
        TYPE_HOURS(8),
        TYPE_CONTACT(9),
        TYPE_LINKS(10),
        TYPE_RETAIL(11);

        public static final LocalProfileWidget$Type$Companion$ADAPTER$1 ADAPTER;
        public static final Origin.Companion Companion;
        public final int value;

        static {
            Type type2 = TYPE_UNSPECIFIED;
            Companion = new Origin.Companion();
            ADAPTER = new LocalProfileWidget$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
        }

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            return Origin.Companion.m3883fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LocalProfileWidget$Companion$ADAPTER$1 localProfileWidget$Companion$ADAPTER$1 = new LocalProfileWidget$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalProfileWidget.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalProfileWidget", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_profile_widgets.proto");
        ADAPTER = localProfileWidget$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localProfileWidget$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalProfileWidget(Type type2, ActionEvent.Companion companion, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1313type = type2;
        this.data = companion;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalProfileWidget)) {
            return false;
        }
        LocalProfileWidget localProfileWidget = (LocalProfileWidget) obj;
        return Intrinsics.areEqual(unknownFields(), localProfileWidget.unknownFields()) && this.f1313type == localProfileWidget.f1313type && Intrinsics.areEqual(this.data, localProfileWidget.data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.f1313type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        ActionEvent.Companion companion = this.data;
        int hashCode3 = hashCode2 + (companion != null ? companion.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(18);
        builder.input_id = this.f1313type;
        builder.value = this.data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.f1313type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        ActionEvent.Companion companion = this.data;
        if (companion != null) {
            arrayList.add("data=" + companion);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalProfileWidget{", "}", 0, null, null, 56);
    }
}
