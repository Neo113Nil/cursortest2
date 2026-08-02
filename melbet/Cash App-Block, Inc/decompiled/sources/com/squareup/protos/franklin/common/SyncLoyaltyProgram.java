package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.protos.franklin.ui.UiLoyaltyProgram;
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
public final class SyncLoyaltyProgram extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncLoyaltyProgram> CREATOR;
    public final UiLoyaltyProgram loyalty_program;

    static {
        SyncLoyaltyProgram$Companion$ADAPTER$1 syncLoyaltyProgram$Companion$ADAPTER$1 = new SyncLoyaltyProgram$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncLoyaltyProgram.class), "type.googleapis.com/squareup.franklin.SyncLoyaltyProgram", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncLoyaltyProgram$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncLoyaltyProgram$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncLoyaltyProgram(UiLoyaltyProgram uiLoyaltyProgram, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.loyalty_program = uiLoyaltyProgram;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncLoyaltyProgram)) {
            return false;
        }
        SyncLoyaltyProgram syncLoyaltyProgram = (SyncLoyaltyProgram) obj;
        return Intrinsics.areEqual(unknownFields(), syncLoyaltyProgram.unknownFields()) && Intrinsics.areEqual(this.loyalty_program, syncLoyaltyProgram.loyalty_program);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UiLoyaltyProgram uiLoyaltyProgram = this.loyalty_program;
        int hashCode2 = hashCode + (uiLoyaltyProgram != null ? uiLoyaltyProgram.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(12);
        builder.cash_limit_group = this.loyalty_program;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UiLoyaltyProgram uiLoyaltyProgram = this.loyalty_program;
        if (uiLoyaltyProgram != null) {
            arrayList.add("loyalty_program=" + uiLoyaltyProgram);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncLoyaltyProgram{", "}", 0, null, null, 56);
    }
}
