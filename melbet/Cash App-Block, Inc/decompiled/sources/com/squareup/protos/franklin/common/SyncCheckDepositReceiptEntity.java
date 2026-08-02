package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.checkmate.sync.UiCheckDeposit;
import com.squareup.protos.franklin.ui.UiCashLimits;
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
public final class SyncCheckDepositReceiptEntity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncCheckDepositReceiptEntity> CREATOR;
    public final UiCheckDeposit receipt;

    static {
        SyncCheckDepositReceiptEntity$Companion$ADAPTER$1 syncCheckDepositReceiptEntity$Companion$ADAPTER$1 = new SyncCheckDepositReceiptEntity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncCheckDepositReceiptEntity.class), "type.googleapis.com/squareup.franklin.SyncCheckDepositReceiptEntity", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncCheckDepositReceiptEntity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncCheckDepositReceiptEntity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncCheckDepositReceiptEntity(UiCheckDeposit uiCheckDeposit, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.receipt = uiCheckDeposit;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncCheckDepositReceiptEntity)) {
            return false;
        }
        SyncCheckDepositReceiptEntity syncCheckDepositReceiptEntity = (SyncCheckDepositReceiptEntity) obj;
        return Intrinsics.areEqual(unknownFields(), syncCheckDepositReceiptEntity.unknownFields()) && Intrinsics.areEqual(this.receipt, syncCheckDepositReceiptEntity.receipt);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UiCheckDeposit uiCheckDeposit = this.receipt;
        int hashCode2 = hashCode + (uiCheckDeposit != null ? uiCheckDeposit.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(4);
        builder.cash_limit_group = this.receipt;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UiCheckDeposit uiCheckDeposit = this.receipt;
        if (uiCheckDeposit != null) {
            arrayList.add("receipt=" + uiCheckDeposit);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncCheckDepositReceiptEntity{", "}", 0, null, null, 56);
    }
}
