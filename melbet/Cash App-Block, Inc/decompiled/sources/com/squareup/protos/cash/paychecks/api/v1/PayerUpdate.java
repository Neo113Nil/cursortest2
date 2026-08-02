package com.squareup.protos.cash.paychecks.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardModule;
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

/* loaded from: classes7.dex */
public final class PayerUpdate extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PayerUpdate> CREATOR;

    /* renamed from: operation, reason: collision with root package name */
    public final PayerOperation f1323operation;
    public final String payer_token;

    static {
        PayerUpdate$Companion$ADAPTER$1 payerUpdate$Companion$ADAPTER$1 = new PayerUpdate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PayerUpdate.class), "type.googleapis.com/squareup.cash.paychecks.api.v1.PayerUpdate", Syntax.PROTO_2, null, "squareup/cash/paychecks/api/v1/paychecks_app_service.proto");
        ADAPTER = payerUpdate$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(payerUpdate$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayerUpdate(String str, PayerOperation payerOperation, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payer_token = str;
        this.f1323operation = payerOperation;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PayerUpdate)) {
            return false;
        }
        PayerUpdate payerUpdate = (PayerUpdate) obj;
        return Intrinsics.areEqual(unknownFields(), payerUpdate.unknownFields()) && Intrinsics.areEqual(this.payer_token, payerUpdate.payer_token) && this.f1323operation == payerUpdate.f1323operation;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.payer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        PayerOperation payerOperation = this.f1323operation;
        int hashCode3 = hashCode2 + (payerOperation != null ? payerOperation.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(9);
        builder.f1329type = this.payer_token;
        builder.use_case = this.f1323operation;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.payer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payer_token=", arrayList);
        }
        PayerOperation payerOperation = this.f1323operation;
        if (payerOperation != null) {
            arrayList.add("operation=" + payerOperation);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PayerUpdate{", "}", 0, null, null, 56);
    }
}
