package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.franklin.data.LinkResult;
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
public final class DepositFeeData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DepositFeeData> CREATOR;
    public final Long fee_bps;
    public final FeeType fee_type;

    public enum FeeType implements WireEnum {
        NONE(1),
        BASIS_POINTS(2);

        public final int value;
        public static final LinkResult.Companion Companion = new LinkResult.Companion();
        public static final DepositFeeData$FeeType$Companion$ADAPTER$1 ADAPTER = new DepositFeeData$FeeType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FeeType.class), Syntax.PROTO_2, null);

        FeeType(int i) {
            this.value = i;
        }

        public static final FeeType fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return NONE;
            }
            if (i != 2) {
                return null;
            }
            return BASIS_POINTS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        DepositFeeData$Companion$ADAPTER$1 depositFeeData$Companion$ADAPTER$1 = new DepositFeeData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DepositFeeData.class), "type.googleapis.com/squareup.franklin.common.DepositFeeData", Syntax.PROTO_2, null, "squareup/franklin/common/deposit_preference.proto");
        ADAPTER = depositFeeData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(depositFeeData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositFeeData(FeeType feeType, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.fee_type = feeType;
        this.fee_bps = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DepositFeeData)) {
            return false;
        }
        DepositFeeData depositFeeData = (DepositFeeData) obj;
        return Intrinsics.areEqual(unknownFields(), depositFeeData.unknownFields()) && this.fee_type == depositFeeData.fee_type && Intrinsics.areEqual(this.fee_bps, depositFeeData.fee_bps);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        FeeType feeType = this.fee_type;
        int hashCode2 = (hashCode + (feeType != null ? feeType.hashCode() : 0)) * 37;
        Long l = this.fee_bps;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(5);
        builder.f1372android = this.fee_type;
        builder.ios = this.fee_bps;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        FeeType feeType = this.fee_type;
        if (feeType != null) {
            arrayList.add("fee_type=" + feeType);
        }
        Long l = this.fee_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("fee_bps=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DepositFeeData{", "}", 0, null, null, 56);
    }
}
