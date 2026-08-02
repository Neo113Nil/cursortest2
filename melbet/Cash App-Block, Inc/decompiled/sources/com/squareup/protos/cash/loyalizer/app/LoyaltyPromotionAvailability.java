package com.squareup.protos.cash.loyalizer.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
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
public final class LoyaltyPromotionAvailability extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LoyaltyPromotionAvailability> CREATOR;
    public final Alignment alignment;
    public final List day_time;
    public final String title;

    public enum Alignment implements WireEnum {
        LEFT(1),
        RIGHT(2);

        public final int value;
        public static final ContactAliasType.Companion Companion = new ContactAliasType.Companion();
        public static final LoyaltyPromotionAvailability$Alignment$Companion$ADAPTER$1 ADAPTER = new LoyaltyPromotionAvailability$Alignment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Alignment.class), Syntax.PROTO_2, null);

        Alignment(int i) {
            this.value = i;
        }

        public static final Alignment fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return LEFT;
            }
            if (i != 2) {
                return null;
            }
            return RIGHT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class DayTime extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DayTime> CREATOR;
        public final String day;
        public final String time_range;

        static {
            LoyaltyPromotionAvailability$DayTime$Companion$ADAPTER$1 loyaltyPromotionAvailability$DayTime$Companion$ADAPTER$1 = new LoyaltyPromotionAvailability$DayTime$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DayTime.class), "type.googleapis.com/squareup.cash.loyalizer.app.LoyaltyPromotionAvailability.DayTime", Syntax.PROTO_2, null, "squareup/cash/loyalizer/app/LoyaltyPromotionPlaceholderData.proto");
            ADAPTER = loyaltyPromotionAvailability$DayTime$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(loyaltyPromotionAvailability$DayTime$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DayTime(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.day = str;
            this.time_range = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DayTime)) {
                return false;
            }
            DayTime dayTime = (DayTime) obj;
            return Intrinsics.areEqual(unknownFields(), dayTime.unknownFields()) && Intrinsics.areEqual(this.day, dayTime.day) && Intrinsics.areEqual(this.time_range, dayTime.time_range);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.day;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.time_range;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            FullName.Builder builder = new FullName.Builder(25);
            builder.given_name = this.day;
            builder.family_name = this.time_range;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.day;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "day=", arrayList);
            }
            String str2 = this.time_range;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "time_range=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DayTime{", "}", 0, null, null, 56);
        }
    }

    static {
        LoyaltyPromotionAvailability$Companion$ADAPTER$1 loyaltyPromotionAvailability$Companion$ADAPTER$1 = new LoyaltyPromotionAvailability$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoyaltyPromotionAvailability.class), "type.googleapis.com/squareup.cash.loyalizer.app.LoyaltyPromotionAvailability", Syntax.PROTO_2, null, "squareup/cash/loyalizer/app/LoyaltyPromotionPlaceholderData.proto");
        ADAPTER = loyaltyPromotionAvailability$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(loyaltyPromotionAvailability$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyPromotionAvailability(String str, List list, Alignment alignment, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.alignment = alignment;
        this.day_time = TransactorKt.immutableCopyOf("day_time", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoyaltyPromotionAvailability)) {
            return false;
        }
        LoyaltyPromotionAvailability loyaltyPromotionAvailability = (LoyaltyPromotionAvailability) obj;
        return Intrinsics.areEqual(unknownFields(), loyaltyPromotionAvailability.unknownFields()) && Intrinsics.areEqual(this.title, loyaltyPromotionAvailability.title) && Intrinsics.areEqual(this.day_time, loyaltyPromotionAvailability.day_time) && this.alignment == loyaltyPromotionAvailability.alignment;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.day_time);
        Alignment alignment = this.alignment;
        int hashCode2 = m + (alignment != null ? alignment.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(8, false);
        builder.advertisement_data = this.title;
        builder.transmission_level = this.day_time;
        builder.frequency = this.alignment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        List list = this.day_time;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("day_time=", arrayList, list);
        }
        Alignment alignment = this.alignment;
        if (alignment != null) {
            arrayList.add("alignment=" + alignment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoyaltyPromotionAvailability{", "}", 0, null, null, 56);
    }
}
