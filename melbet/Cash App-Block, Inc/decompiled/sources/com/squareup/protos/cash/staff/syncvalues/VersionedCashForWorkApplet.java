package com.squareup.protos.cash.staff.syncvalues;

import android.os.Parcelable;
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
public final class VersionedCashForWorkApplet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VersionedCashForWorkApplet> CREATOR;
    public final CashForWorkAppletV1 cash_for_work_applet_v1;

    static {
        VersionedCashForWorkApplet$Companion$ADAPTER$1 versionedCashForWorkApplet$Companion$ADAPTER$1 = new VersionedCashForWorkApplet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VersionedCashForWorkApplet.class), "type.googleapis.com/squareup.cash.staff.syncvalues.VersionedCashForWorkApplet", Syntax.PROTO_2, null, "squareup/cash/staff/syncvalues/CashForWorkApplet.proto");
        ADAPTER = versionedCashForWorkApplet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(versionedCashForWorkApplet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionedCashForWorkApplet(CashForWorkAppletV1 cashForWorkAppletV1, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cash_for_work_applet_v1 = cashForWorkAppletV1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VersionedCashForWorkApplet)) {
            return false;
        }
        VersionedCashForWorkApplet versionedCashForWorkApplet = (VersionedCashForWorkApplet) obj;
        return Intrinsics.areEqual(unknownFields(), versionedCashForWorkApplet.unknownFields()) && Intrinsics.areEqual(this.cash_for_work_applet_v1, versionedCashForWorkApplet.cash_for_work_applet_v1);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CashForWorkAppletV1 cashForWorkAppletV1 = this.cash_for_work_applet_v1;
        int hashCode2 = hashCode + (cashForWorkAppletV1 != null ? cashForWorkAppletV1.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(24);
        builder.pool_lifecycle_filter = this.cash_for_work_applet_v1;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CashForWorkAppletV1 cashForWorkAppletV1 = this.cash_for_work_applet_v1;
        if (cashForWorkAppletV1 != null) {
            arrayList.add("cash_for_work_applet_v1=" + cashForWorkAppletV1);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VersionedCashForWorkApplet{", "}", 0, null, null, 56);
    }
}
