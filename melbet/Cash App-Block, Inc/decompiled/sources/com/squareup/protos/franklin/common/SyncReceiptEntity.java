package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.protos.franklin.ui.UiItemizedReceipt;
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
public final class SyncReceiptEntity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncReceiptEntity> CREATOR;
    public final UiItemizedReceipt receipt;

    static {
        SyncReceiptEntity$Companion$ADAPTER$1 syncReceiptEntity$Companion$ADAPTER$1 = new SyncReceiptEntity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncReceiptEntity.class), "type.googleapis.com/squareup.franklin.SyncReceiptEntity", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncReceiptEntity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncReceiptEntity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncReceiptEntity(UiItemizedReceipt uiItemizedReceipt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.receipt = uiItemizedReceipt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncReceiptEntity)) {
            return false;
        }
        SyncReceiptEntity syncReceiptEntity = (SyncReceiptEntity) obj;
        return Intrinsics.areEqual(unknownFields(), syncReceiptEntity.unknownFields()) && Intrinsics.areEqual(this.receipt, syncReceiptEntity.receipt);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UiItemizedReceipt uiItemizedReceipt = this.receipt;
        int hashCode2 = hashCode + (uiItemizedReceipt != null ? uiItemizedReceipt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(13);
        builder.cash_limit_group = this.receipt;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UiItemizedReceipt uiItemizedReceipt = this.receipt;
        if (uiItemizedReceipt != null) {
            arrayList.add("receipt=" + uiItemizedReceipt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncReceiptEntity{", "}", 0, null, null, 56);
    }
}
