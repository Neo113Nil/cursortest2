package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.protos.franklin.ui.UiLoyaltyAccount;
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
public final class SyncLoyaltyAccount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncLoyaltyAccount> CREATOR;
    public final UiLoyaltyAccount loyalty_account;

    static {
        SyncLoyaltyAccount$Companion$ADAPTER$1 syncLoyaltyAccount$Companion$ADAPTER$1 = new SyncLoyaltyAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncLoyaltyAccount.class), "type.googleapis.com/squareup.franklin.SyncLoyaltyAccount", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncLoyaltyAccount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncLoyaltyAccount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncLoyaltyAccount(UiLoyaltyAccount uiLoyaltyAccount, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.loyalty_account = uiLoyaltyAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncLoyaltyAccount)) {
            return false;
        }
        SyncLoyaltyAccount syncLoyaltyAccount = (SyncLoyaltyAccount) obj;
        return Intrinsics.areEqual(unknownFields(), syncLoyaltyAccount.unknownFields()) && Intrinsics.areEqual(this.loyalty_account, syncLoyaltyAccount.loyalty_account);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UiLoyaltyAccount uiLoyaltyAccount = this.loyalty_account;
        int hashCode2 = hashCode + (uiLoyaltyAccount != null ? uiLoyaltyAccount.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(11);
        builder.cash_limit_group = this.loyalty_account;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UiLoyaltyAccount uiLoyaltyAccount = this.loyalty_account;
        if (uiLoyaltyAccount != null) {
            arrayList.add("loyalty_account=" + uiLoyaltyAccount);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncLoyaltyAccount{", "}", 0, null, null, 56);
    }
}
