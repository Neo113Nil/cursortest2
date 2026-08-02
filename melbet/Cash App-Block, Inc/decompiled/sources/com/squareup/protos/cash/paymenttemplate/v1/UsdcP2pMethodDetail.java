package com.squareup.protos.cash.paymenttemplate.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.Instrument;
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
public final class UsdcP2pMethodDetail extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UsdcP2pMethodDetail> CREATOR;
    public final String chain;

    static {
        UsdcP2pMethodDetail$Companion$ADAPTER$1 usdcP2pMethodDetail$Companion$ADAPTER$1 = new UsdcP2pMethodDetail$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UsdcP2pMethodDetail.class), "type.googleapis.com/squareup.cash.paymenttemplate.v1.UsdcP2pMethodDetail", Syntax.PROTO_2, null, "squareup/cash/paymenttemplate/v1/payment_template.proto");
        ADAPTER = usdcP2pMethodDetail$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(usdcP2pMethodDetail$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsdcP2pMethodDetail(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.chain = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UsdcP2pMethodDetail)) {
            return false;
        }
        UsdcP2pMethodDetail usdcP2pMethodDetail = (UsdcP2pMethodDetail) obj;
        return Intrinsics.areEqual(unknownFields(), usdcP2pMethodDetail.unknownFields()) && Intrinsics.areEqual(this.chain, usdcP2pMethodDetail.chain);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.chain;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Instrument.Builder builder = new Instrument.Builder(24);
        builder.token = this.chain;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.chain;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "chain=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UsdcP2pMethodDetail{", "}", 0, null, null, 56);
    }
}
