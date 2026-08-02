package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.franklin.ui.UiPayment;
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
public final class SyncPayment extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncPayment> CREATOR;
    public final Boolean is_badged;
    public final UiPayment payment;

    static {
        SyncPayment$Companion$ADAPTER$1 syncPayment$Companion$ADAPTER$1 = new SyncPayment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncPayment.class), "type.googleapis.com/squareup.franklin.SyncPayment", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncPayment$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncPayment$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncPayment(UiPayment uiPayment, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment = uiPayment;
        this.is_badged = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncPayment)) {
            return false;
        }
        SyncPayment syncPayment = (SyncPayment) obj;
        return Intrinsics.areEqual(unknownFields(), syncPayment.unknownFields()) && Intrinsics.areEqual(this.payment, syncPayment.payment) && Intrinsics.areEqual(this.is_badged, syncPayment.is_badged);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UiPayment uiPayment = this.payment;
        int hashCode2 = (hashCode + (uiPayment != null ? uiPayment.hashCode() : 0)) * 37;
        Boolean bool = this.is_badged;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(20);
        builder.f1372android = this.payment;
        builder.ios = this.is_badged;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UiPayment uiPayment = this.payment;
        if (uiPayment != null) {
            arrayList.add("payment=" + uiPayment);
        }
        Boolean bool = this.is_badged;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_badged=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncPayment{", "}", 0, null, null, 56);
    }
}
