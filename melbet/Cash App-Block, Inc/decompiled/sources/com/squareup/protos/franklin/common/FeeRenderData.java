package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.bankbook.Institution;
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
public final class FeeRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FeeRenderData> CREATOR;
    public final Money amount;
    public final String description;

    /* renamed from: type, reason: collision with root package name */
    public final FeeType f1378type;

    public enum FeeType implements WireEnum {
        TRANSACTION_FEE(1),
        DELIVERY_FEE(2),
        TOTAL_FEES(3);

        public final int value;
        public static final LinkResult.Companion Companion = new LinkResult.Companion();
        public static final FeeRenderData$FeeType$Companion$ADAPTER$1 ADAPTER = new FeeRenderData$FeeType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FeeType.class), Syntax.PROTO_2, null);

        FeeType(int i) {
            this.value = i;
        }

        public static final FeeType fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return TRANSACTION_FEE;
            }
            if (i == 2) {
                return DELIVERY_FEE;
            }
            if (i != 3) {
                return null;
            }
            return TOTAL_FEES;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FeeRenderData$Companion$ADAPTER$1 feeRenderData$Companion$ADAPTER$1 = new FeeRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FeeRenderData.class), "type.googleapis.com/squareup.franklin.FeeRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = feeRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(feeRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeeRenderData(Money money, String str, FeeType feeType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount = money;
        this.description = str;
        this.f1378type = feeType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeeRenderData)) {
            return false;
        }
        FeeRenderData feeRenderData = (FeeRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), feeRenderData.unknownFields()) && Intrinsics.areEqual(this.amount, feeRenderData.amount) && Intrinsics.areEqual(this.description, feeRenderData.description) && this.f1378type == feeRenderData.f1378type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.amount;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        String str = this.description;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        FeeType feeType = this.f1378type;
        int hashCode4 = hashCode3 + (feeType != null ? feeType.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(18, false);
        builder.display_info = this.amount;
        builder.institution_token = this.description;
        builder.help_menu_items = this.f1378type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        String str = this.description;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "description=", arrayList);
        }
        FeeType feeType = this.f1378type;
        if (feeType != null) {
            arrayList.add("type=" + feeType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeeRenderData{", "}", 0, null, null, 56);
    }
}
