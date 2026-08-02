package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.RewardSelection;
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
public final class SyncRewardSelection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncRewardSelection> CREATOR;
    public final RewardSelection reward_selection;

    static {
        SyncRewardSelection$Companion$ADAPTER$1 syncRewardSelection$Companion$ADAPTER$1 = new SyncRewardSelection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncRewardSelection.class), "type.googleapis.com/squareup.franklin.SyncRewardSelection", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncRewardSelection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncRewardSelection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncRewardSelection(RewardSelection rewardSelection, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.reward_selection = rewardSelection;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncRewardSelection)) {
            return false;
        }
        SyncRewardSelection syncRewardSelection = (SyncRewardSelection) obj;
        return Intrinsics.areEqual(unknownFields(), syncRewardSelection.unknownFields()) && Intrinsics.areEqual(this.reward_selection, syncRewardSelection.reward_selection);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RewardSelection rewardSelection = this.reward_selection;
        int hashCode2 = hashCode + (rewardSelection != null ? rewardSelection.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(15);
        builder.cash_limit_group = this.reward_selection;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RewardSelection rewardSelection = this.reward_selection;
        if (rewardSelection != null) {
            arrayList.add("reward_selection=" + rewardSelection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncRewardSelection{", "}", 0, null, null, 56);
    }
}
