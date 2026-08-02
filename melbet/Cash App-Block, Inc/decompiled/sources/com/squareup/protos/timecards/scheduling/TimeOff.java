package com.squareup.protos.timecards.scheduling;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzkn;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.person.Alias;
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
import net.idrnd.face.iad.capture.internal.y0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TimeOff extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TimeOff> CREATOR;
    public final zzkn date_range;
    public final String id;
    public final String note;
    public final String start_datetime;
    public final State state;
    public final String stop_datetime;
    public final String team_member_id;

    /* loaded from: classes9.dex */
    public enum State implements WireEnum {
        DO_NOT_USE(0),
        PENDING_AUTHORIZATION(2),
        AUTHORIZED(3),
        FORBIDDEN(5),
        CANCELED(6),
        OBSOLETE(7);

        public static final TimeOff$State$Companion$ADAPTER$1 ADAPTER;
        public static final y0 Companion;
        public final int value;

        static {
            State state = DO_NOT_USE;
            Companion = new y0();
            ADAPTER = new TimeOff$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, state);
        }

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            return y0.m4311fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        TimeOff$Companion$ADAPTER$1 timeOff$Companion$ADAPTER$1 = new TimeOff$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TimeOff.class), "type.googleapis.com/squareup.timecards.scheduling.TimeOff", Syntax.PROTO_2, null, "squareup/timecards/scheduling/models.proto");
        ADAPTER = timeOff$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(timeOff$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeOff(String str, String str2, String str3, String str4, String str5, zzkn zzknVar, State state, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.team_member_id = str2;
        this.start_datetime = str3;
        this.stop_datetime = str4;
        this.note = str5;
        this.date_range = zzknVar;
        this.state = state;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimeOff)) {
            return false;
        }
        TimeOff timeOff = (TimeOff) obj;
        return Intrinsics.areEqual(unknownFields(), timeOff.unknownFields()) && Intrinsics.areEqual(this.id, timeOff.id) && Intrinsics.areEqual(this.team_member_id, timeOff.team_member_id) && Intrinsics.areEqual(this.start_datetime, timeOff.start_datetime) && Intrinsics.areEqual(this.stop_datetime, timeOff.stop_datetime) && Intrinsics.areEqual(this.note, timeOff.note) && Intrinsics.areEqual(this.date_range, timeOff.date_range) && this.state == timeOff.state;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.team_member_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.start_datetime;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.stop_datetime;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.note;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        zzkn zzknVar = this.date_range;
        int hashCode7 = (hashCode6 + (zzknVar != null ? zzknVar.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode8 = hashCode7 + (state != null ? state.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(23, false);
        builder.scope = this.id;
        builder.value = this.team_member_id;
        builder.f1407type = this.start_datetime;
        builder.first_verified_at_ms = this.stop_datetime;
        builder.last_verified_at_ms = this.note;
        builder.created_at = this.date_range;
        builder.updated_at = this.state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.team_member_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "team_member_id=", arrayList);
        }
        String str3 = this.start_datetime;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "start_datetime=", arrayList);
        }
        String str4 = this.stop_datetime;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "stop_datetime=", arrayList);
        }
        if (this.note != null) {
            arrayList.add("note=██");
        }
        zzkn zzknVar = this.date_range;
        if (zzknVar != null) {
            arrayList.add("date_range=" + zzknVar);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TimeOff{", "}", 0, null, null, 56);
    }
}
