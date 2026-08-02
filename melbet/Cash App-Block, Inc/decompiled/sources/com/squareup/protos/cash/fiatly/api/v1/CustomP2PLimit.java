package com.squareup.protos.cash.fiatly.api.v1;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.protos.common.Money;
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

/* loaded from: classes7.dex */
public final class CustomP2PLimit extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CustomP2PLimit> CREATOR;
    public final Money max;
    public final Money remaining_usage;

    /* renamed from: type, reason: collision with root package name */
    public final LimitType f1261type;

    public enum LimitType implements WireEnum {
        LIMIT_TYPE_UNSPECIFIED(0),
        LIMIT_TYPE_SPONSORED_P2P_SEND_AMOUNT_30_DAY(1),
        LIMIT_TYPE_DEFAULT_P2P_SEND_AMOUNT_30_DAY(2),
        LIMIT_TYPE_DEFAULT_P2P_SEND_AMOUNT_7_DAY(3);

        public static final CustomP2PLimit$LimitType$Companion$ADAPTER$1 ADAPTER;
        public static final Channel.Companion Companion;
        public final int value;

        static {
            LimitType limitType = LIMIT_TYPE_UNSPECIFIED;
            Companion = new Channel.Companion();
            ADAPTER = new CustomP2PLimit$LimitType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LimitType.class), Syntax.PROTO_2, limitType);
        }

        LimitType(int i) {
            this.value = i;
        }

        public static final LimitType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return LIMIT_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return LIMIT_TYPE_SPONSORED_P2P_SEND_AMOUNT_30_DAY;
            }
            if (i == 2) {
                return LIMIT_TYPE_DEFAULT_P2P_SEND_AMOUNT_30_DAY;
            }
            if (i != 3) {
                return null;
            }
            return LIMIT_TYPE_DEFAULT_P2P_SEND_AMOUNT_7_DAY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CustomP2PLimit$Companion$ADAPTER$1 customP2PLimit$Companion$ADAPTER$1 = new CustomP2PLimit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomP2PLimit.class), "type.googleapis.com/squareup.cash.fiatly.api.v1.CustomP2PLimit", Syntax.PROTO_2, null, "squareup/cash/fiatly/api/v1/p2p_controls.proto");
        ADAPTER = customP2PLimit$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customP2PLimit$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomP2PLimit(LimitType limitType, Money money, Money money2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1261type = limitType;
        this.max = money;
        this.remaining_usage = money2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomP2PLimit)) {
            return false;
        }
        CustomP2PLimit customP2PLimit = (CustomP2PLimit) obj;
        return Intrinsics.areEqual(unknownFields(), customP2PLimit.unknownFields()) && this.f1261type == customP2PLimit.f1261type && Intrinsics.areEqual(this.max, customP2PLimit.max) && Intrinsics.areEqual(this.remaining_usage, customP2PLimit.remaining_usage);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LimitType limitType = this.f1261type;
        int hashCode2 = (hashCode + (limitType != null ? limitType.hashCode() : 0)) * 37;
        Money money = this.max;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.remaining_usage;
        int hashCode4 = hashCode3 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(17);
        builder.loan_type = this.f1261type;
        builder.payment_schedule = this.max;
        builder.tila_data = this.remaining_usage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LimitType limitType = this.f1261type;
        if (limitType != null) {
            arrayList.add("type=" + limitType);
        }
        Money money = this.max;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("max=", money, arrayList);
        }
        Money money2 = this.remaining_usage;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("remaining_usage=", money2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomP2PLimit{", "}", 0, null, null, 56);
    }
}
