package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.LimitedAction;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/GetEffectiveCustomerLimitsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/common/Headers$Builder;", "Builder", "LimitForAction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetEffectiveCustomerLimitsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetEffectiveCustomerLimitsResponse> CREATOR;
    public final List limits;

    public final class LimitForAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LimitForAction> CREATOR;
        public final LimitedAction action;
        public final Money limit;
        public final String limit_exceeded_message;

        static {
            GetEffectiveCustomerLimitsResponse$LimitForAction$Companion$ADAPTER$1 getEffectiveCustomerLimitsResponse$LimitForAction$Companion$ADAPTER$1 = new GetEffectiveCustomerLimitsResponse$LimitForAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LimitForAction.class), "type.googleapis.com/squareup.franklin.app.GetEffectiveCustomerLimitsResponse.LimitForAction", Syntax.PROTO_2, null, "squareup/franklin/app/customer_limits.proto");
            ADAPTER = getEffectiveCustomerLimitsResponse$LimitForAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getEffectiveCustomerLimitsResponse$LimitForAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LimitForAction(LimitedAction limitedAction, Money money, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.action = limitedAction;
            this.limit = money;
            this.limit_exceeded_message = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LimitForAction)) {
                return false;
            }
            LimitForAction limitForAction = (LimitForAction) obj;
            return Intrinsics.areEqual(unknownFields(), limitForAction.unknownFields()) && this.action == limitForAction.action && Intrinsics.areEqual(this.limit, limitForAction.limit) && Intrinsics.areEqual(this.limit_exceeded_message, limitForAction.limit_exceeded_message);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LimitedAction limitedAction = this.action;
            int hashCode2 = (hashCode + (limitedAction != null ? limitedAction.hashCode() : 0)) * 37;
            Money money = this.limit;
            int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
            String str = this.limit_exceeded_message;
            int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiAlias.Builder builder = new UiAlias.Builder(21);
            builder.f1364type = this.action;
            builder.formatted = this.limit;
            builder.canonical_text = this.limit_exceeded_message;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LimitedAction limitedAction = this.action;
            if (limitedAction != null) {
                arrayList.add("action=" + limitedAction);
            }
            Money money = this.limit;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("limit=", money, arrayList);
            }
            String str = this.limit_exceeded_message;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "limit_exceeded_message=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LimitForAction{", "}", 0, null, null, 56);
        }
    }

    static {
        GetEffectiveCustomerLimitsResponse$Companion$ADAPTER$1 getEffectiveCustomerLimitsResponse$Companion$ADAPTER$1 = new GetEffectiveCustomerLimitsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetEffectiveCustomerLimitsResponse.class), "type.googleapis.com/squareup.franklin.app.GetEffectiveCustomerLimitsResponse", Syntax.PROTO_2, null, "squareup/franklin/app/customer_limits.proto");
        ADAPTER = getEffectiveCustomerLimitsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getEffectiveCustomerLimitsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEffectiveCustomerLimitsResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.limits = TransactorKt.immutableCopyOf("limits", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetEffectiveCustomerLimitsResponse)) {
            return false;
        }
        GetEffectiveCustomerLimitsResponse getEffectiveCustomerLimitsResponse = (GetEffectiveCustomerLimitsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getEffectiveCustomerLimitsResponse.unknownFields()) && Intrinsics.areEqual(this.limits, getEffectiveCustomerLimitsResponse.limits);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.limits.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(14, false);
        builder.header = this.limits;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.limits;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("limits=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEffectiveCustomerLimitsResponse{", "}", 0, null, null, 56);
    }
}
