package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppointmentSlotSpec extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppointmentSlotSpec> CREATOR;
    public final List available_slots;
    public final String lookup_token;
    public final Long total_duration_minutes;

    public final class AvailableSlot extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AvailableSlot> CREATOR;
        public final String display_text;
        public final Instant end_time;
        public final String slot_id;
        public final Instant start_time;

        static {
            AppointmentSlotSpec$AvailableSlot$Companion$ADAPTER$1 appointmentSlotSpec$AvailableSlot$Companion$ADAPTER$1 = new AppointmentSlotSpec$AvailableSlot$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvailableSlot.class), "type.googleapis.com/squareup.cash.local.client.v1.AppointmentSlotSpec.AvailableSlot", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_cart.proto");
            ADAPTER = appointmentSlotSpec$AvailableSlot$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(appointmentSlotSpec$AvailableSlot$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvailableSlot(String str, Instant instant, Instant instant2, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.slot_id = str;
            this.start_time = instant;
            this.end_time = instant2;
            this.display_text = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvailableSlot)) {
                return false;
            }
            AvailableSlot availableSlot = (AvailableSlot) obj;
            return Intrinsics.areEqual(unknownFields(), availableSlot.unknownFields()) && Intrinsics.areEqual(this.slot_id, availableSlot.slot_id) && Intrinsics.areEqual(this.start_time, availableSlot.start_time) && Intrinsics.areEqual(this.end_time, availableSlot.end_time) && Intrinsics.areEqual(this.display_text, availableSlot.display_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.slot_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Instant instant = this.start_time;
            int hashCode3 = (hashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
            Instant instant2 = this.end_time;
            int hashCode4 = (hashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
            String str2 = this.display_text;
            int hashCode5 = hashCode4 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCard.Builder builder = new GiftCard.Builder(1, false);
            builder.id = this.slot_id;
            builder.gift_card_id = this.start_time;
            builder.gift_card_amount = this.end_time;
            builder.last_4 = this.display_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.slot_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "slot_id=", arrayList);
            }
            Instant instant = this.start_time;
            if (instant != null) {
                Matcher$$ExternalSyntheticOutline0.m("start_time=", instant, arrayList);
            }
            Instant instant2 = this.end_time;
            if (instant2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("end_time=", instant2, arrayList);
            }
            String str2 = this.display_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "display_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AvailableSlot{", "}", 0, null, null, 56);
        }
    }

    static {
        AppointmentSlotSpec$Companion$ADAPTER$1 appointmentSlotSpec$Companion$ADAPTER$1 = new AppointmentSlotSpec$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppointmentSlotSpec.class), "type.googleapis.com/squareup.cash.local.client.v1.AppointmentSlotSpec", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_cart.proto");
        ADAPTER = appointmentSlotSpec$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(appointmentSlotSpec$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppointmentSlotSpec(Long l, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.total_duration_minutes = l;
        this.lookup_token = str;
        this.available_slots = TransactorKt.immutableCopyOf("available_slots", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppointmentSlotSpec)) {
            return false;
        }
        AppointmentSlotSpec appointmentSlotSpec = (AppointmentSlotSpec) obj;
        return Intrinsics.areEqual(unknownFields(), appointmentSlotSpec.unknownFields()) && Intrinsics.areEqual(this.total_duration_minutes, appointmentSlotSpec.total_duration_minutes) && Intrinsics.areEqual(this.available_slots, appointmentSlotSpec.available_slots) && Intrinsics.areEqual(this.lookup_token, appointmentSlotSpec.lookup_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.total_duration_minutes;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37, 37, this.available_slots);
        String str = this.lookup_token;
        int hashCode2 = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(18);
        builder.group_image = this.total_duration_minutes;
        builder.participants = this.available_slots;
        builder.name = this.lookup_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.total_duration_minutes;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("total_duration_minutes=", l, arrayList);
        }
        List list = this.available_slots;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("available_slots=", arrayList, list);
        }
        String str = this.lookup_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "lookup_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppointmentSlotSpec{", "}", 0, null, null, 56);
    }
}
