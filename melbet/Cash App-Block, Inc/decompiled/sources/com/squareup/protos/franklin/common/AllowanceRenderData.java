package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.invest.ui.ClientDriven;
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

/* loaded from: classes8.dex */
public final class AllowanceRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AllowanceRenderData> CREATOR;
    public final Long allowance_payment_datetime_ms;
    public final String edit_allowance_url;
    public final String icon_url;
    public final Boolean is_managed_account;
    public final Role role;
    public final String skip_allowance_url;
    public final AllowanceState state;
    public final AllowanceStateReason state_reason;
    public final String time_zone;

    public enum AllowanceState implements WireEnum {
        SCHEDULED(1),
        SKIPPED(2),
        COMPLETED(3),
        FAILED(4),
        DECLINED(5),
        CANCELED(6);

        public final int value;
        public static final Trigger.Companion Companion = new Trigger.Companion();
        public static final AllowanceRenderData$AllowanceState$Companion$ADAPTER$1 ADAPTER = new AllowanceRenderData$AllowanceState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AllowanceState.class), Syntax.PROTO_2, null);

        AllowanceState(int i) {
            this.value = i;
        }

        public static final AllowanceState fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 1:
                    return SCHEDULED;
                case 2:
                    return SKIPPED;
                case 3:
                    return COMPLETED;
                case 4:
                    return FAILED;
                case 5:
                    return DECLINED;
                case 6:
                    return CANCELED;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum AllowanceStateReason implements WireEnum {
        EXCEEDS_RECIPIENT_MONTHLY_RECEIVE_LIMIT(1),
        BANK_DECLINE(2),
        INSUFFICIENT_FUNDS(3),
        DEFAULT(4);

        public final int value;
        public static final KeyScope.Companion Companion = new KeyScope.Companion();
        public static final AllowanceRenderData$AllowanceStateReason$Companion$ADAPTER$1 ADAPTER = new AllowanceRenderData$AllowanceStateReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AllowanceStateReason.class), Syntax.PROTO_2, null);

        AllowanceStateReason(int i) {
            this.value = i;
        }

        public static final AllowanceStateReason fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return EXCEEDS_RECIPIENT_MONTHLY_RECEIVE_LIMIT;
            }
            if (i == 2) {
                return BANK_DECLINE;
            }
            if (i == 3) {
                return INSUFFICIENT_FUNDS;
            }
            if (i != 4) {
                return null;
            }
            return DEFAULT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum Role implements WireEnum {
        SENDER(1),
        RECIPIENT(2);

        public final int value;
        public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
        public static final AllowanceRenderData$Role$Companion$ADAPTER$1 ADAPTER = new AllowanceRenderData$Role$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Role.class), Syntax.PROTO_2, null);

        Role(int i) {
            this.value = i;
        }

        public static final Role fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return SENDER;
            }
            if (i != 2) {
                return null;
            }
            return RECIPIENT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        AllowanceRenderData$Companion$ADAPTER$1 allowanceRenderData$Companion$ADAPTER$1 = new AllowanceRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AllowanceRenderData.class), "type.googleapis.com/squareup.franklin.AllowanceRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = allowanceRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(allowanceRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllowanceRenderData(String str, String str2, AllowanceState allowanceState, AllowanceStateReason allowanceStateReason, Long l, String str3, String str4, Role role, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.edit_allowance_url = str;
        this.skip_allowance_url = str2;
        this.state = allowanceState;
        this.state_reason = allowanceStateReason;
        this.allowance_payment_datetime_ms = l;
        this.time_zone = str3;
        this.icon_url = str4;
        this.role = role;
        this.is_managed_account = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AllowanceRenderData)) {
            return false;
        }
        AllowanceRenderData allowanceRenderData = (AllowanceRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), allowanceRenderData.unknownFields()) && Intrinsics.areEqual(this.edit_allowance_url, allowanceRenderData.edit_allowance_url) && Intrinsics.areEqual(this.skip_allowance_url, allowanceRenderData.skip_allowance_url) && this.state == allowanceRenderData.state && this.state_reason == allowanceRenderData.state_reason && Intrinsics.areEqual(this.allowance_payment_datetime_ms, allowanceRenderData.allowance_payment_datetime_ms) && Intrinsics.areEqual(this.time_zone, allowanceRenderData.time_zone) && Intrinsics.areEqual(this.icon_url, allowanceRenderData.icon_url) && this.role == allowanceRenderData.role && Intrinsics.areEqual(this.is_managed_account, allowanceRenderData.is_managed_account);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.edit_allowance_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.skip_allowance_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        AllowanceState allowanceState = this.state;
        int hashCode4 = (hashCode3 + (allowanceState != null ? allowanceState.hashCode() : 0)) * 37;
        AllowanceStateReason allowanceStateReason = this.state_reason;
        int hashCode5 = (hashCode4 + (allowanceStateReason != null ? allowanceStateReason.hashCode() : 0)) * 37;
        Long l = this.allowance_payment_datetime_ms;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str3 = this.time_zone;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.icon_url;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Role role = this.role;
        int hashCode9 = (hashCode8 + (role != null ? role.hashCode() : 0)) * 37;
        Boolean bool = this.is_managed_account;
        int hashCode10 = hashCode9 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Transfer.Builder builder = new Transfer.Builder(7, false);
        builder.token = this.edit_allowance_url;
        builder.source = this.skip_allowance_url;
        builder.target = this.state;
        builder.state = this.state_reason;
        builder.created_at = this.allowance_payment_datetime_ms;
        builder.amount = this.time_zone;
        builder.push_amount = this.icon_url;
        builder.completed_at = this.role;
        builder.failed_at = this.is_managed_account;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.edit_allowance_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "edit_allowance_url=", arrayList);
        }
        String str2 = this.skip_allowance_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "skip_allowance_url=", arrayList);
        }
        AllowanceState allowanceState = this.state;
        if (allowanceState != null) {
            arrayList.add("state=" + allowanceState);
        }
        AllowanceStateReason allowanceStateReason = this.state_reason;
        if (allowanceStateReason != null) {
            arrayList.add("state_reason=" + allowanceStateReason);
        }
        Long l = this.allowance_payment_datetime_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("allowance_payment_datetime_ms=", l, arrayList);
        }
        String str3 = this.time_zone;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "time_zone=", arrayList);
        }
        String str4 = this.icon_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "icon_url=", arrayList);
        }
        Role role = this.role;
        if (role != null) {
            arrayList.add("role=" + role);
        }
        Boolean bool = this.is_managed_account;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_managed_account=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AllowanceRenderData{", "}", 0, null, null, 56);
    }
}
