package com.squareup.protos.cash.papermate.app;

import android.os.Parcelable;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.protos.cash.papermate.api.PaperMoneyDeposit;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/papermate/app/GetPaperCashDepositResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalBuyer$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetPaperCashDepositResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPaperCashDepositResponse> CREATOR;
    public final PaperMoneyDeposit deposit;

    static {
        GetPaperCashDepositResponse$Companion$ADAPTER$1 getPaperCashDepositResponse$Companion$ADAPTER$1 = new GetPaperCashDepositResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPaperCashDepositResponse.class), "type.googleapis.com/squareup.cash.papermate.app.GetPaperCashDepositResponse", Syntax.PROTO_2, null, "squareup/cash/papermate/app/GetPaperCashDeposit.proto");
        ADAPTER = getPaperCashDepositResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPaperCashDepositResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPaperCashDepositResponse(PaperMoneyDeposit paperMoneyDeposit, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.deposit = paperMoneyDeposit;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPaperCashDepositResponse)) {
            return false;
        }
        GetPaperCashDepositResponse getPaperCashDepositResponse = (GetPaperCashDepositResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPaperCashDepositResponse.unknownFields()) && Intrinsics.areEqual(this.deposit, getPaperCashDepositResponse.deposit);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PaperMoneyDeposit paperMoneyDeposit = this.deposit;
        int hashCode2 = hashCode + (paperMoneyDeposit != null ? paperMoneyDeposit.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(26);
        builder.local_buyer = this.deposit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PaperMoneyDeposit paperMoneyDeposit = this.deposit;
        if (paperMoneyDeposit != null) {
            arrayList.add("deposit=" + paperMoneyDeposit);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPaperCashDepositResponse{", "}", 0, null, null, 56);
    }
}
