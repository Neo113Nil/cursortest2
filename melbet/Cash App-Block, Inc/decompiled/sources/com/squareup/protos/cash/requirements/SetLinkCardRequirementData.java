package com.squareup.protos.cash.requirements;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.common.time.DateTime;
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
public final class SetLinkCardRequirementData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetLinkCardRequirementData> CREATOR;
    public final EntryPoint entry_point;
    public final String instrument_token_to_replace;
    public final Boolean resolve_if_instrument_type_active;
    public final Boolean skippable;
    public final List supported_cash_instrument_types;

    public enum EntryPoint implements WireEnum {
        PROFILE(1),
        CASH_IN(2),
        CASH_OUT(3);

        public final int value;
        public static final PoolVisibility.Companion Companion = new PoolVisibility.Companion();
        public static final SetLinkCardRequirementData$EntryPoint$Companion$ADAPTER$1 ADAPTER = new SetLinkCardRequirementData$EntryPoint$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EntryPoint.class), Syntax.PROTO_2, null);

        EntryPoint(int i) {
            this.value = i;
        }

        public static final EntryPoint fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return PROFILE;
            }
            if (i == 2) {
                return CASH_IN;
            }
            if (i != 3) {
                return null;
            }
            return CASH_OUT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SetLinkCardRequirementData$Companion$ADAPTER$1 setLinkCardRequirementData$Companion$ADAPTER$1 = new SetLinkCardRequirementData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetLinkCardRequirementData.class), "type.googleapis.com/squareup.cash.requirements.SetLinkCardRequirementData", Syntax.PROTO_2, null, "squareup/cash/requirements/SetLinkCardRequirementData.proto");
        ADAPTER = setLinkCardRequirementData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setLinkCardRequirementData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetLinkCardRequirementData(List list, Boolean bool, Boolean bool2, EntryPoint entryPoint, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.skippable = bool;
        this.resolve_if_instrument_type_active = bool2;
        this.entry_point = entryPoint;
        this.instrument_token_to_replace = str;
        this.supported_cash_instrument_types = TransactorKt.immutableCopyOf("supported_cash_instrument_types", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetLinkCardRequirementData)) {
            return false;
        }
        SetLinkCardRequirementData setLinkCardRequirementData = (SetLinkCardRequirementData) obj;
        return Intrinsics.areEqual(unknownFields(), setLinkCardRequirementData.unknownFields()) && Intrinsics.areEqual(this.supported_cash_instrument_types, setLinkCardRequirementData.supported_cash_instrument_types) && Intrinsics.areEqual(this.skippable, setLinkCardRequirementData.skippable) && Intrinsics.areEqual(this.resolve_if_instrument_type_active, setLinkCardRequirementData.resolve_if_instrument_type_active) && this.entry_point == setLinkCardRequirementData.entry_point && Intrinsics.areEqual(this.instrument_token_to_replace, setLinkCardRequirementData.instrument_token_to_replace);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.supported_cash_instrument_types);
        Boolean bool = this.skippable;
        int hashCode = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.resolve_if_instrument_type_active;
        int hashCode2 = (hashCode + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        EntryPoint entryPoint = this.entry_point;
        int hashCode3 = (hashCode2 + (entryPoint != null ? entryPoint.hashCode() : 0)) * 37;
        String str = this.instrument_token_to_replace;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(11, false);
        builder.tz_name = this.supported_cash_instrument_types;
        builder.instant_usec = this.skippable;
        builder.ordinal = this.resolve_if_instrument_type_active;
        builder.timezone_offset_min = this.entry_point;
        builder.posix_tz = this.instrument_token_to_replace;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.supported_cash_instrument_types;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("supported_cash_instrument_types=", arrayList, list);
        }
        Boolean bool = this.skippable;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("skippable=", bool, arrayList);
        }
        Boolean bool2 = this.resolve_if_instrument_type_active;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("resolve_if_instrument_type_active=", bool2, arrayList);
        }
        EntryPoint entryPoint = this.entry_point;
        if (entryPoint != null) {
            arrayList.add("entry_point=" + entryPoint);
        }
        String str = this.instrument_token_to_replace;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_token_to_replace=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetLinkCardRequirementData{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SetLinkCardRequirementData(List list, String str) {
        this(list, r2, r2, null, str, ByteString.EMPTY);
        Boolean bool = Boolean.FALSE;
    }
}
