package com.squareup.protos.cash.paymenttemplate.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.postcard.CopyCardNumber;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashP2PFiatMethodDetail extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashP2PFiatMethodDetail> CREATOR;

    static {
        CashP2PFiatMethodDetail$Companion$ADAPTER$1 cashP2PFiatMethodDetail$Companion$ADAPTER$1 = new CashP2PFiatMethodDetail$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashP2PFiatMethodDetail.class), "type.googleapis.com/squareup.cash.paymenttemplate.v1.CashP2PFiatMethodDetail", Syntax.PROTO_2, null, "squareup/cash/paymenttemplate/v1/payment_template.proto");
        ADAPTER = cashP2PFiatMethodDetail$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashP2PFiatMethodDetail$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashP2PFiatMethodDetail(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CashP2PFiatMethodDetail) && Intrinsics.areEqual(unknownFields(), ((CashP2PFiatMethodDetail) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CopyCardNumber.Builder builder = new CopyCardNumber.Builder(20);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "CashP2PFiatMethodDetail{}";
    }
}
