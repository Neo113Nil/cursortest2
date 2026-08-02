package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.pools.ListPoolsRequest;
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
public final class CreditDetail extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreditDetail> CREATOR;
    public final StyledText detail_text;

    static {
        CreditDetail$Companion$ADAPTER$1 creditDetail$Companion$ADAPTER$1 = new CreditDetail$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreditDetail.class), "type.googleapis.com/squareup.cash.shop.rendering.api.CreditDetail", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Common.proto");
        ADAPTER = creditDetail$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(creditDetail$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditDetail(StyledText styledText, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.detail_text = styledText;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreditDetail)) {
            return false;
        }
        CreditDetail creditDetail = (CreditDetail) obj;
        return Intrinsics.areEqual(unknownFields(), creditDetail.unknownFields()) && Intrinsics.areEqual(this.detail_text, creditDetail.detail_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        StyledText styledText = this.detail_text;
        int hashCode2 = hashCode + (styledText != null ? styledText.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(17);
        builder.pool_lifecycle_filter = this.detail_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StyledText styledText = this.detail_text;
        if (styledText != null) {
            SizeMode$EnumUnboxingLocalUtility.m("detail_text=", styledText, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreditDetail{", "}", 0, null, null, 56);
    }
}
