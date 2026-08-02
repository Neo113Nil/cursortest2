package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.cash.cashregistrar.Account;
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
public final class SyncAccountStatementEntity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncAccountStatementEntity> CREATOR;
    public final Account account;

    static {
        SyncAccountStatementEntity$Companion$ADAPTER$1 syncAccountStatementEntity$Companion$ADAPTER$1 = new SyncAccountStatementEntity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncAccountStatementEntity.class), "type.googleapis.com/squareup.franklin.SyncAccountStatementEntity", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncAccountStatementEntity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncAccountStatementEntity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncAccountStatementEntity(Account account, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.account = account;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncAccountStatementEntity)) {
            return false;
        }
        SyncAccountStatementEntity syncAccountStatementEntity = (SyncAccountStatementEntity) obj;
        return Intrinsics.areEqual(unknownFields(), syncAccountStatementEntity.unknownFields()) && Intrinsics.areEqual(this.account, syncAccountStatementEntity.account);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Account account = this.account;
        int hashCode2 = hashCode + (account != null ? account.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(3);
        builder.cash_limit_group = this.account;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Account account = this.account;
        if (account != null) {
            arrayList.add("account=" + account);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncAccountStatementEntity{", "}", 0, null, null, 56);
    }
}
