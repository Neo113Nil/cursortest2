package com.squareup.protos.timecards.scheduling;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.employeejobs.Job;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import io.noties.markwon.LinkResolverDef;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ShiftCover extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShiftCover> CREATOR;
    public final List accepted_employee_tokens;
    public final List declined_employee_tokens;
    public final String original_employee_token;
    public final String shift_schedule_token;
    public final String shift_schedule_version_token;
    public final String shift_token;
    public final Status status;
    public final String successor_employee_token;
    public final String successor_shift_schedule_version_token;
    public final String token;
    public final String updated_at;

    public enum Status implements WireEnum {
        DO_NOT_USE(0),
        PENDING(1),
        DECLINED(2),
        APPROVED(3),
        CANCELED(4),
        EXPIRED(5),
        OBSOLETE(6);

        public static final ShiftCover$Status$Companion$ADAPTER$1 ADAPTER;
        public static final LinkResolverDef Companion;
        public final int value;

        static {
            Status status = DO_NOT_USE;
            Companion = new LinkResolverDef(6);
            ADAPTER = new ShiftCover$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 0:
                    return DO_NOT_USE;
                case 1:
                    return PENDING;
                case 2:
                    return DECLINED;
                case 3:
                    return APPROVED;
                case 4:
                    return CANCELED;
                case 5:
                    return EXPIRED;
                case 6:
                    return OBSOLETE;
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
        ShiftCover$Companion$ADAPTER$1 shiftCover$Companion$ADAPTER$1 = new ShiftCover$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShiftCover.class), "type.googleapis.com/squareup.timecards.scheduling.ShiftCover", Syntax.PROTO_2, null, "squareup/timecards/scheduling/models.proto");
        ADAPTER = shiftCover$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shiftCover$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShiftCover(String str, String str2, String str3, Status status, List list, List list2, String str4, String str5, String str6, String str7, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.token = str;
        this.shift_token = str2;
        this.shift_schedule_token = str3;
        this.status = status;
        this.original_employee_token = str4;
        this.shift_schedule_version_token = str5;
        this.successor_employee_token = str6;
        this.updated_at = str7;
        this.successor_shift_schedule_version_token = str8;
        this.accepted_employee_tokens = TransactorKt.immutableCopyOf("accepted_employee_tokens", list);
        this.declined_employee_tokens = TransactorKt.immutableCopyOf("declined_employee_tokens", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShiftCover)) {
            return false;
        }
        ShiftCover shiftCover = (ShiftCover) obj;
        return Intrinsics.areEqual(unknownFields(), shiftCover.unknownFields()) && Intrinsics.areEqual(this.token, shiftCover.token) && Intrinsics.areEqual(this.shift_token, shiftCover.shift_token) && Intrinsics.areEqual(this.shift_schedule_token, shiftCover.shift_schedule_token) && this.status == shiftCover.status && Intrinsics.areEqual(this.accepted_employee_tokens, shiftCover.accepted_employee_tokens) && Intrinsics.areEqual(this.declined_employee_tokens, shiftCover.declined_employee_tokens) && Intrinsics.areEqual(this.original_employee_token, shiftCover.original_employee_token) && Intrinsics.areEqual(this.shift_schedule_version_token, shiftCover.shift_schedule_version_token) && Intrinsics.areEqual(this.successor_employee_token, shiftCover.successor_employee_token) && Intrinsics.areEqual(this.updated_at, shiftCover.updated_at) && Intrinsics.areEqual(this.successor_shift_schedule_version_token, shiftCover.successor_shift_schedule_version_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.shift_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.shift_schedule_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Status status = this.status;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (status != null ? status.hashCode() : 0)) * 37, 37, this.accepted_employee_tokens), 37, this.declined_employee_tokens);
        String str4 = this.original_employee_token;
        int hashCode5 = (m + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.shift_schedule_version_token;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.successor_employee_token;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.updated_at;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.successor_shift_schedule_version_token;
        int hashCode9 = hashCode8 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Job.Builder builder = new Job.Builder(20);
        builder.token = this.token;
        builder.merchant_token = this.shift_token;
        builder.title = this.shift_schedule_token;
        builder.default_wage = this.status;
        builder.created_at_timestamp_ms = this.accepted_employee_tokens;
        builder.updated_at_timestamp_ms = this.declined_employee_tokens;
        builder.deleted_at_timestamp_ms = this.original_employee_token;
        builder.team_member_count = this.shift_schedule_version_token;
        builder.version = this.successor_employee_token;
        builder.tip_eligible = this.updated_at;
        builder.default_color_scheme = this.successor_shift_schedule_version_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.shift_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "shift_token=", arrayList);
        }
        String str3 = this.shift_schedule_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "shift_schedule_token=", arrayList);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        List list = this.accepted_employee_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("accepted_employee_tokens=", arrayList, list);
        }
        List list2 = this.declined_employee_tokens;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("declined_employee_tokens=", arrayList, list2);
        }
        String str4 = this.original_employee_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "original_employee_token=", arrayList);
        }
        String str5 = this.shift_schedule_version_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "shift_schedule_version_token=", arrayList);
        }
        String str6 = this.successor_employee_token;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "successor_employee_token=", arrayList);
        }
        String str7 = this.updated_at;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "updated_at=", arrayList);
        }
        String str8 = this.successor_shift_schedule_version_token;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "successor_shift_schedule_version_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShiftCover{", "}", 0, null, null, 56);
    }
}
