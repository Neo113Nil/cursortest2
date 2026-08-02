package com.squareup.protos.roster.business_hours;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiPublicProfile;
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

/* loaded from: classes8.dex */
public final class SpecialBusinessHoursPeriod extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SpecialBusinessHoursPeriod> CREATOR;
    public final List days_of_week;
    public final String end_date;
    public final Boolean is_closed;
    public final String reason;
    public final String start_date;
    public final List time_periods;

    static {
        SpecialBusinessHoursPeriod$Companion$ADAPTER$1 specialBusinessHoursPeriod$Companion$ADAPTER$1 = new SpecialBusinessHoursPeriod$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SpecialBusinessHoursPeriod.class), "type.googleapis.com/squareup.roster.business_hours.SpecialBusinessHoursPeriod", Syntax.PROTO_2, null, "squareup/roster/business_hours.proto");
        ADAPTER = specialBusinessHoursPeriod$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(specialBusinessHoursPeriod$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialBusinessHoursPeriod(String str, String str2, List list, List list2, String str3, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.start_date = str;
        this.end_date = str2;
        this.reason = str3;
        this.is_closed = bool;
        this.time_periods = TransactorKt.immutableCopyOf("time_periods", list);
        this.days_of_week = TransactorKt.immutableCopyOf("days_of_week", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpecialBusinessHoursPeriod)) {
            return false;
        }
        SpecialBusinessHoursPeriod specialBusinessHoursPeriod = (SpecialBusinessHoursPeriod) obj;
        return Intrinsics.areEqual(unknownFields(), specialBusinessHoursPeriod.unknownFields()) && Intrinsics.areEqual(this.start_date, specialBusinessHoursPeriod.start_date) && Intrinsics.areEqual(this.end_date, specialBusinessHoursPeriod.end_date) && Intrinsics.areEqual(this.time_periods, specialBusinessHoursPeriod.time_periods) && Intrinsics.areEqual(this.days_of_week, specialBusinessHoursPeriod.days_of_week) && Intrinsics.areEqual(this.reason, specialBusinessHoursPeriod.reason) && Intrinsics.areEqual(this.is_closed, specialBusinessHoursPeriod.is_closed);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.start_date;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.end_date;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.time_periods), 37, this.days_of_week);
        String str3 = this.reason;
        int hashCode3 = (m + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.is_closed;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(27, false);
        builder.full_name = this.start_date;
        builder.photo_url = this.end_date;
        builder.full_cashtag = this.time_periods;
        builder.is_verified_account = this.days_of_week;
        builder.synopsis = this.reason;
        builder.cashtag_url_enabled = this.is_closed;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.start_date;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "start_date=", arrayList);
        }
        String str2 = this.end_date;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "end_date=", arrayList);
        }
        List list = this.time_periods;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("time_periods=", arrayList, list);
        }
        List list2 = this.days_of_week;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("days_of_week=", arrayList, list2);
        }
        String str3 = this.reason;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "reason=", arrayList);
        }
        Boolean bool = this.is_closed;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_closed=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SpecialBusinessHoursPeriod{", "}", 0, null, null, 56);
    }
}
