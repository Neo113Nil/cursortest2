package com.squareup.protos.cash.taply.model.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.employeejobs.Job;
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
public final class PaymentTokenDevice extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentTokenDevice> CREATOR;
    public final Long created_at;
    public final String device_id;
    public final String display_name;
    public final Boolean locked;
    public final String provider_device_id;
    public final Boolean sponsor_locked;
    public final State state;
    public final PaymentTokenDeviceStateReason state_reason;
    public final String tag_theme_token;
    public final TokenProviderType token_provider_type;
    public final Long updated_at;

    public enum State implements WireEnum {
        STATE_UNSPECIFIED(0),
        STATE_INACTIVE(1),
        STATE_ACTIVE(2),
        STATE_TERMINATED(3);

        public static final PaymentTokenDevice$State$Companion$ADAPTER$1 ADAPTER;
        public static final ActionType.Companion Companion;
        public final int value;

        static {
            State state = STATE_UNSPECIFIED;
            Companion = new ActionType.Companion();
            ADAPTER = new PaymentTokenDevice$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, state);
        }

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return STATE_INACTIVE;
            }
            if (i == 2) {
                return STATE_ACTIVE;
            }
            if (i != 3) {
                return null;
            }
            return STATE_TERMINATED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        PaymentTokenDevice$Companion$ADAPTER$1 paymentTokenDevice$Companion$ADAPTER$1 = new PaymentTokenDevice$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentTokenDevice.class), "type.googleapis.com/squareup.cash.taply.model.v1beta1.PaymentTokenDevice", Syntax.PROTO_2, null, "squareup/cash/taply/model/v1beta1/payment_token_device.proto");
        ADAPTER = paymentTokenDevice$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentTokenDevice$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentTokenDevice(String str, Boolean bool, String str2, TokenProviderType tokenProviderType, State state, PaymentTokenDeviceStateReason paymentTokenDeviceStateReason, String str3, Long l, Long l2, String str4, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.device_id = str;
        this.locked = bool;
        this.provider_device_id = str2;
        this.token_provider_type = tokenProviderType;
        this.state = state;
        this.state_reason = paymentTokenDeviceStateReason;
        this.tag_theme_token = str3;
        this.created_at = l;
        this.updated_at = l2;
        this.display_name = str4;
        this.sponsor_locked = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentTokenDevice)) {
            return false;
        }
        PaymentTokenDevice paymentTokenDevice = (PaymentTokenDevice) obj;
        return Intrinsics.areEqual(unknownFields(), paymentTokenDevice.unknownFields()) && Intrinsics.areEqual(this.device_id, paymentTokenDevice.device_id) && Intrinsics.areEqual(this.locked, paymentTokenDevice.locked) && Intrinsics.areEqual(this.provider_device_id, paymentTokenDevice.provider_device_id) && this.token_provider_type == paymentTokenDevice.token_provider_type && this.state == paymentTokenDevice.state && this.state_reason == paymentTokenDevice.state_reason && Intrinsics.areEqual(this.tag_theme_token, paymentTokenDevice.tag_theme_token) && Intrinsics.areEqual(this.created_at, paymentTokenDevice.created_at) && Intrinsics.areEqual(this.updated_at, paymentTokenDevice.updated_at) && Intrinsics.areEqual(this.display_name, paymentTokenDevice.display_name) && Intrinsics.areEqual(this.sponsor_locked, paymentTokenDevice.sponsor_locked);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.device_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.locked;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str2 = this.provider_device_id;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        TokenProviderType tokenProviderType = this.token_provider_type;
        int hashCode5 = (hashCode4 + (tokenProviderType != null ? tokenProviderType.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode6 = (hashCode5 + (state != null ? state.hashCode() : 0)) * 37;
        PaymentTokenDeviceStateReason paymentTokenDeviceStateReason = this.state_reason;
        int hashCode7 = (hashCode6 + (paymentTokenDeviceStateReason != null ? paymentTokenDeviceStateReason.hashCode() : 0)) * 37;
        String str3 = this.tag_theme_token;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode9 = (hashCode8 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.updated_at;
        int hashCode10 = (hashCode9 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str4 = this.display_name;
        int hashCode11 = (hashCode10 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool2 = this.sponsor_locked;
        int hashCode12 = hashCode11 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Job.Builder builder = new Job.Builder(12);
        builder.token = this.device_id;
        builder.tip_eligible = this.locked;
        builder.merchant_token = this.provider_device_id;
        builder.default_wage = this.token_provider_type;
        builder.deleted_at_timestamp_ms = this.state;
        builder.team_member_count = this.state_reason;
        builder.title = this.tag_theme_token;
        builder.created_at_timestamp_ms = this.created_at;
        builder.updated_at_timestamp_ms = this.updated_at;
        builder.version = this.display_name;
        builder.default_color_scheme = this.sponsor_locked;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.device_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "device_id=", arrayList);
        }
        Boolean bool = this.locked;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("locked=", bool, arrayList);
        }
        String str2 = this.provider_device_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "provider_device_id=", arrayList);
        }
        TokenProviderType tokenProviderType = this.token_provider_type;
        if (tokenProviderType != null) {
            arrayList.add("token_provider_type=" + tokenProviderType);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        PaymentTokenDeviceStateReason paymentTokenDeviceStateReason = this.state_reason;
        if (paymentTokenDeviceStateReason != null) {
            arrayList.add("state_reason=" + paymentTokenDeviceStateReason);
        }
        String str3 = this.tag_theme_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "tag_theme_token=", arrayList);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        Long l2 = this.updated_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at=", l2, arrayList);
        }
        String str4 = this.display_name;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "display_name=", arrayList);
        }
        Boolean bool2 = this.sponsor_locked;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sponsor_locked=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentTokenDevice{", "}", 0, null, null, 56);
    }
}
