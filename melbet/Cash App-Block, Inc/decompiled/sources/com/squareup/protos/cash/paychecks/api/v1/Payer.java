package com.squareup.protos.cash.paychecks.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolOwner;
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
public final class Payer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Payer> CREATOR;
    public final String cashtag;
    public final String customer_token;
    public final String display_name;
    public final String profile_photo_url;

    static {
        Payer$Companion$ADAPTER$1 payer$Companion$ADAPTER$1 = new Payer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Payer.class), "type.googleapis.com/squareup.cash.paychecks.api.v1.Payer", Syntax.PROTO_2, null, "squareup/cash/paychecks/api/v1/paychecks_app_service.proto");
        ADAPTER = payer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(payer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Payer(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.cashtag = str2;
        this.display_name = str3;
        this.profile_photo_url = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Payer)) {
            return false;
        }
        Payer payer = (Payer) obj;
        return Intrinsics.areEqual(unknownFields(), payer.unknownFields()) && Intrinsics.areEqual(this.customer_token, payer.customer_token) && Intrinsics.areEqual(this.cashtag, payer.cashtag) && Intrinsics.areEqual(this.display_name, payer.display_name) && Intrinsics.areEqual(this.profile_photo_url, payer.profile_photo_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cashtag;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.display_name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.profile_photo_url;
        int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolOwner.Builder builder = new PoolOwner.Builder(10);
        builder.customer_token = this.customer_token;
        builder.full_name = this.cashtag;
        builder.profile_photo_url = this.display_name;
        builder.cashtag = this.profile_photo_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        if (this.display_name != null) {
            arrayList.add("display_name=██");
        }
        if (this.profile_photo_url != null) {
            arrayList.add("profile_photo_url=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Payer{", "}", 0, null, null, 56);
    }
}
