package com.squareup.protos.cash.cashstorefronts.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.composer.app.Card;
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
public final class BusinessStatus extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BusinessStatus> CREATOR;
    public final BusinessType business_type;
    public final Boolean is_active;

    static {
        BusinessStatus$Companion$ADAPTER$1 businessStatus$Companion$ADAPTER$1 = new BusinessStatus$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BusinessStatus.class), "type.googleapis.com/squareup.cash.cashstorefronts.api.BusinessStatus", Syntax.PROTO_2, null, "squareup/cash/cashstorefronts/api/BusinessProfile.proto");
        ADAPTER = businessStatus$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(businessStatus$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessStatus(BusinessType businessType, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.business_type = businessType;
        this.is_active = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BusinessStatus)) {
            return false;
        }
        BusinessStatus businessStatus = (BusinessStatus) obj;
        return Intrinsics.areEqual(unknownFields(), businessStatus.unknownFields()) && this.business_type == businessStatus.business_type && Intrinsics.areEqual(this.is_active, businessStatus.is_active);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BusinessType businessType = this.business_type;
        int hashCode2 = (hashCode + (businessType != null ? businessType.hashCode() : 0)) * 37;
        Boolean bool = this.is_active;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(8);
        builder.image_url = this.business_type;
        builder.asset = this.is_active;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BusinessType businessType = this.business_type;
        if (businessType != null) {
            arrayList.add("business_type=" + businessType);
        }
        Boolean bool = this.is_active;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_active=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BusinessStatus{", "}", 0, null, null, 56);
    }
}
