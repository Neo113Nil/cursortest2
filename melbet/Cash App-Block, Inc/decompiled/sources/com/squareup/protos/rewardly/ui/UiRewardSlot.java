package com.squareup.protos.rewardly.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.rewardly.common.RewardSlotState;
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
import squareup.cash.bills.BillsApplet;

/* loaded from: classes8.dex */
public final class UiRewardSlot extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiRewardSlot> CREATOR;
    public final UiSelectedReward selected_reward;
    public final RewardSlotState state;
    public final String token;

    static {
        UiRewardSlot$Companion$ADAPTER$1 uiRewardSlot$Companion$ADAPTER$1 = new UiRewardSlot$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiRewardSlot.class), "type.googleapis.com/squareup.rewardly.ui.UiRewardSlot", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
        ADAPTER = uiRewardSlot$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiRewardSlot$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiRewardSlot(String str, RewardSlotState rewardSlotState, UiSelectedReward uiSelectedReward, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.state = rewardSlotState;
        this.selected_reward = uiSelectedReward;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiRewardSlot)) {
            return false;
        }
        UiRewardSlot uiRewardSlot = (UiRewardSlot) obj;
        return Intrinsics.areEqual(unknownFields(), uiRewardSlot.unknownFields()) && Intrinsics.areEqual(this.token, uiRewardSlot.token) && this.state == uiRewardSlot.state && Intrinsics.areEqual(this.selected_reward, uiRewardSlot.selected_reward);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        RewardSlotState rewardSlotState = this.state;
        int hashCode3 = (hashCode2 + (rewardSlotState != null ? rewardSlotState.hashCode() : 0)) * 37;
        UiSelectedReward uiSelectedReward = this.selected_reward;
        int hashCode4 = hashCode3 + (uiSelectedReward != null ? uiSelectedReward.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(3);
        builder.action = this.token;
        builder.full_applet = this.state;
        builder.half_applet = this.selected_reward;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        RewardSlotState rewardSlotState = this.state;
        if (rewardSlotState != null) {
            arrayList.add("state=" + rewardSlotState);
        }
        UiSelectedReward uiSelectedReward = this.selected_reward;
        if (uiSelectedReward != null) {
            arrayList.add("selected_reward=" + uiSelectedReward);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiRewardSlot{", "}", 0, null, null, 56);
    }
}
