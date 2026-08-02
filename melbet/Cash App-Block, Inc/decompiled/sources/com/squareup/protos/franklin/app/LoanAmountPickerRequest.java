package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LoanAmountPickerRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LoanAmountPickerRequest> CREATOR;
    public final RequestContext request_context;
    public final Long selected_amount_cents;

    static {
        LoanAmountPickerRequest$Companion$ADAPTER$1 loanAmountPickerRequest$Companion$ADAPTER$1 = new LoanAmountPickerRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoanAmountPickerRequest.class), "type.googleapis.com/squareup.franklin.app.LoanAmountPickerRequest", Syntax.PROTO_2, null, "squareup/franklin/app/loan_amount_picker.proto");
        ADAPTER = loanAmountPickerRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(loanAmountPickerRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanAmountPickerRequest(RequestContext requestContext, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.selected_amount_cents = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoanAmountPickerRequest)) {
            return false;
        }
        LoanAmountPickerRequest loanAmountPickerRequest = (LoanAmountPickerRequest) obj;
        return Intrinsics.areEqual(unknownFields(), loanAmountPickerRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, loanAmountPickerRequest.request_context) && Intrinsics.areEqual(this.selected_amount_cents, loanAmountPickerRequest.selected_amount_cents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Long l = this.selected_amount_cents;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(19);
        builder.strings = this.request_context;
        builder.recurring_deposits_dda_upsell = this.selected_amount_cents;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Long l = this.selected_amount_cents;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("selected_amount_cents=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoanAmountPickerRequest{", "}", 0, null, null, 56);
    }
}
