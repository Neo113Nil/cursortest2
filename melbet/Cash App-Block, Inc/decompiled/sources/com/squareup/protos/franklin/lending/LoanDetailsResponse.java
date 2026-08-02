package com.squareup.protos.franklin.lending;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/lending/LoanDetailsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/AppLinks$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LoanDetailsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LoanDetailsResponse> CREATOR;
    public final BorrowAppletLoanHistoryTile.Data.Loan.Details loan_details;
    public final ResponseContext response_context;

    static {
        LoanDetailsResponse$Companion$ADAPTER$1 loanDetailsResponse$Companion$ADAPTER$1 = new LoanDetailsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoanDetailsResponse.class), "type.googleapis.com/squareup.franklin.lending.LoanDetailsResponse", Syntax.PROTO_2, null, "squareup/franklin/lending_api.proto");
        ADAPTER = loanDetailsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(loanDetailsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanDetailsResponse(ResponseContext responseContext, BorrowAppletLoanHistoryTile.Data.Loan.Details details, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.loan_details = details;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoanDetailsResponse)) {
            return false;
        }
        LoanDetailsResponse loanDetailsResponse = (LoanDetailsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), loanDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, loanDetailsResponse.response_context) && Intrinsics.areEqual(this.loan_details, loanDetailsResponse.loan_details);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        BorrowAppletLoanHistoryTile.Data.Loan.Details details = this.loan_details;
        int hashCode3 = hashCode2 + (details != null ? details.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(27);
        builder.f1372android = this.response_context;
        builder.ios = this.loan_details;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        BorrowAppletLoanHistoryTile.Data.Loan.Details details = this.loan_details;
        if (details != null) {
            arrayList.add("loan_details=" + details);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoanDetailsResponse{", "}", 0, null, null, 56);
    }
}
