package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.protos.franklin.common.PoolsConfig;
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
public final class ClaimablePayment extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClaimablePayment> CREATOR;
    public final String claim_token;
    public final String claim_url;
    public final String payment_token;

    static {
        ClaimablePayment$Companion$ADAPTER$1 claimablePayment$Companion$ADAPTER$1 = new ClaimablePayment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClaimablePayment.class), "type.googleapis.com/squareup.franklin.app.ClaimablePayment", Syntax.PROTO_2, null, "squareup/franklin/app/claim_data.proto");
        ADAPTER = claimablePayment$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(claimablePayment$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClaimablePayment(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_token = str;
        this.claim_token = str2;
        this.claim_url = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClaimablePayment)) {
            return false;
        }
        ClaimablePayment claimablePayment = (ClaimablePayment) obj;
        return Intrinsics.areEqual(unknownFields(), claimablePayment.unknownFields()) && Intrinsics.areEqual(this.payment_token, claimablePayment.payment_token) && Intrinsics.areEqual(this.claim_token, claimablePayment.claim_token) && Intrinsics.areEqual(this.claim_url, claimablePayment.claim_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.payment_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.claim_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.claim_url;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolsConfig.Builder builder = new PoolsConfig.Builder(3);
        builder.nux_details_img_url = this.payment_token;
        builder.nux_activity_img_url = this.claim_token;
        builder.share_background_img_url = this.claim_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.payment_token != null) {
            arrayList.add("payment_token=██");
        }
        if (this.claim_token != null) {
            arrayList.add("claim_token=██");
        }
        if (this.claim_url != null) {
            arrayList.add("claim_url=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClaimablePayment{", "}", 0, null, null, 56);
    }
}
