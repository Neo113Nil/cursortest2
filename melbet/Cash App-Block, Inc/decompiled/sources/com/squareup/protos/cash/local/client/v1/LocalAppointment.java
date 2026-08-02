package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes7.dex */
public final class LocalAppointment extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalAppointment> CREATOR;
    public final LocalCheckoutBrandSummary brand;
    public final Integer duration_minutes;
    public final LocalCheckoutLocationSummary location;
    public final LocalMoney price;
    public final String service_description;
    public final String service_name;
    public final String staff_member_image_url;
    public final String staff_member_name;
    public final String staff_member_token;
    public final Long start_at;
    public final AppointmentStatus status;
    public final String token;

    public enum AppointmentStatus implements WireEnum {
        APPOINTMENT_STATUS_UNSPECIFIED(0),
        APPOINTMENT_STATUS_PENDING(1),
        APPOINTMENT_STATUS_ACCEPTED(2),
        APPOINTMENT_STATUS_CANCELLED_BY_CUSTOMER(3),
        APPOINTMENT_STATUS_CANCELLED_BY_SELLER(4),
        APPOINTMENT_STATUS_DECLINED(5),
        APPOINTMENT_STATUS_NO_SHOW(6);

        public static final LocalAppointment$AppointmentStatus$Companion$ADAPTER$1 ADAPTER;
        public static final RetailerType.Companion Companion;
        public final int value;

        static {
            AppointmentStatus appointmentStatus = APPOINTMENT_STATUS_UNSPECIFIED;
            Companion = new RetailerType.Companion();
            ADAPTER = new LocalAppointment$AppointmentStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AppointmentStatus.class), Syntax.PROTO_2, appointmentStatus);
        }

        AppointmentStatus(int i) {
            this.value = i;
        }

        public static final AppointmentStatus fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 0:
                    return APPOINTMENT_STATUS_UNSPECIFIED;
                case 1:
                    return APPOINTMENT_STATUS_PENDING;
                case 2:
                    return APPOINTMENT_STATUS_ACCEPTED;
                case 3:
                    return APPOINTMENT_STATUS_CANCELLED_BY_CUSTOMER;
                case 4:
                    return APPOINTMENT_STATUS_CANCELLED_BY_SELLER;
                case 5:
                    return APPOINTMENT_STATUS_DECLINED;
                case 6:
                    return APPOINTMENT_STATUS_NO_SHOW;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LocalAppointment$Companion$ADAPTER$1 localAppointment$Companion$ADAPTER$1 = new LocalAppointment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalAppointment.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalAppointment", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_appointment.proto");
        ADAPTER = localAppointment$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localAppointment$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAppointment(String str, String str2, String str3, String str4, String str5, Long l, Integer num, AppointmentStatus appointmentStatus, LocalCheckoutBrandSummary localCheckoutBrandSummary, LocalCheckoutLocationSummary localCheckoutLocationSummary, String str6, LocalMoney localMoney, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.service_name = str2;
        this.staff_member_token = str3;
        this.staff_member_name = str4;
        this.staff_member_image_url = str5;
        this.start_at = l;
        this.duration_minutes = num;
        this.status = appointmentStatus;
        this.brand = localCheckoutBrandSummary;
        this.location = localCheckoutLocationSummary;
        this.service_description = str6;
        this.price = localMoney;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalAppointment)) {
            return false;
        }
        LocalAppointment localAppointment = (LocalAppointment) obj;
        return Intrinsics.areEqual(unknownFields(), localAppointment.unknownFields()) && Intrinsics.areEqual(this.token, localAppointment.token) && Intrinsics.areEqual(this.service_name, localAppointment.service_name) && Intrinsics.areEqual(this.staff_member_token, localAppointment.staff_member_token) && Intrinsics.areEqual(this.staff_member_name, localAppointment.staff_member_name) && Intrinsics.areEqual(this.staff_member_image_url, localAppointment.staff_member_image_url) && Intrinsics.areEqual(this.start_at, localAppointment.start_at) && Intrinsics.areEqual(this.duration_minutes, localAppointment.duration_minutes) && this.status == localAppointment.status && Intrinsics.areEqual(this.brand, localAppointment.brand) && Intrinsics.areEqual(this.location, localAppointment.location) && Intrinsics.areEqual(this.service_description, localAppointment.service_description) && Intrinsics.areEqual(this.price, localAppointment.price);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.service_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.staff_member_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.staff_member_name;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.staff_member_image_url;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Long l = this.start_at;
        int hashCode7 = (hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Integer num = this.duration_minutes;
        int hashCode8 = (hashCode7 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        AppointmentStatus appointmentStatus = this.status;
        int hashCode9 = (hashCode8 + (appointmentStatus != null ? appointmentStatus.hashCode() : 0)) * 37;
        LocalCheckoutBrandSummary localCheckoutBrandSummary = this.brand;
        int hashCode10 = (hashCode9 + (localCheckoutBrandSummary != null ? localCheckoutBrandSummary.hashCode() : 0)) * 37;
        LocalCheckoutLocationSummary localCheckoutLocationSummary = this.location;
        int hashCode11 = (hashCode10 + (localCheckoutLocationSummary != null ? localCheckoutLocationSummary.hashCode() : 0)) * 37;
        String str6 = this.service_description;
        int hashCode12 = (hashCode11 + (str6 != null ? str6.hashCode() : 0)) * 37;
        LocalMoney localMoney = this.price;
        int hashCode13 = hashCode12 + (localMoney != null ? localMoney.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(14, false);
        builder.string_literal = this.token;
        builder.key_path_ref = this.service_name;
        builder.float_literal = this.staff_member_token;
        builder.bool_literal = this.staff_member_name;
        builder.blob_literal = this.staff_member_image_url;
        builder.int_literal = this.start_at;
        builder.unary_op = this.duration_minutes;
        builder.binary_op = this.status;
        builder.conditional_op = this.brand;
        builder.filter_op = this.location;
        builder.collection_literal = this.service_description;
        builder.format_string_op = this.price;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.service_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "service_name=", arrayList);
        }
        String str3 = this.staff_member_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "staff_member_token=", arrayList);
        }
        String str4 = this.staff_member_name;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "staff_member_name=", arrayList);
        }
        String str5 = this.staff_member_image_url;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "staff_member_image_url=", arrayList);
        }
        Long l = this.start_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("start_at=", l, arrayList);
        }
        Integer num = this.duration_minutes;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("duration_minutes=", num, arrayList);
        }
        AppointmentStatus appointmentStatus = this.status;
        if (appointmentStatus != null) {
            arrayList.add("status=" + appointmentStatus);
        }
        LocalCheckoutBrandSummary localCheckoutBrandSummary = this.brand;
        if (localCheckoutBrandSummary != null) {
            arrayList.add("brand=" + localCheckoutBrandSummary);
        }
        LocalCheckoutLocationSummary localCheckoutLocationSummary = this.location;
        if (localCheckoutLocationSummary != null) {
            arrayList.add("location=" + localCheckoutLocationSummary);
        }
        String str6 = this.service_description;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "service_description=", arrayList);
        }
        LocalMoney localMoney = this.price;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("price=", localMoney, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalAppointment{", "}", 0, null, null, 56);
    }
}
