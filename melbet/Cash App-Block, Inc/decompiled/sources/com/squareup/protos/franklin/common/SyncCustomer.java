package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.protos.franklin.ui.UiCustomer;
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
public final class SyncCustomer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncCustomer> CREATOR;
    public final UiCustomer customer;

    static {
        SyncCustomer$Companion$ADAPTER$1 syncCustomer$Companion$ADAPTER$1 = new SyncCustomer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncCustomer.class), "type.googleapis.com/squareup.franklin.SyncCustomer", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncCustomer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncCustomer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncCustomer(UiCustomer uiCustomer, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer = uiCustomer;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncCustomer)) {
            return false;
        }
        SyncCustomer syncCustomer = (SyncCustomer) obj;
        return Intrinsics.areEqual(unknownFields(), syncCustomer.unknownFields()) && Intrinsics.areEqual(this.customer, syncCustomer.customer);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UiCustomer uiCustomer = this.customer;
        int hashCode2 = hashCode + (uiCustomer != null ? uiCustomer.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(6);
        builder.cash_limit_group = this.customer;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UiCustomer uiCustomer = this.customer;
        if (uiCustomer != null) {
            arrayList.add("customer=" + uiCustomer);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncCustomer{", "}", 0, null, null, 56);
    }
}
