package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.protos.rewardly.ui.UiReward;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
import com.squareup.protos.rewardly.ui.UiRewardSlot;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes.dex */
public final class RewardsData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RewardsData> CREATOR;
    public final Boolean has_recently_used_boost;
    public final Boolean new_to_boost;
    public final List ordered_reward_tokens;
    public final List program_details;
    public final List reward_selection_states;
    public final List reward_selections;
    public final List rewards;
    public final List selectable_rewards_tokens;
    public final Boolean show_boost_video;
    public final Boolean show_rewards;
    public final List slots;
    public final Money ytd_total_saving;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RewardsData.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.common.RewardsData$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v0 */
            /* JADX WARN: Type inference failed for: r9v1 */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v27 */
            /* JADX WARN: Type inference failed for: r9v28 */
            /* JADX WARN: Type inference failed for: r9v30, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                ?? r9 = 0;
                Boolean bool = null;
                Boolean bool2 = null;
                Boolean bool3 = null;
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    Boolean bool4 = r9;
                    if (nextTag == -1) {
                        return new RewardsData(m, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, bool4, bool, bool2, arrayList6, bool3, (Money) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            m.add(UiReward.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            arrayList2.add(UiRewardSlot.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            arrayList3.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            r9 = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 5:
                            bool = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                        case 7:
                            arrayList.add(UiRewardProgramDetails.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            bool2 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            arrayList4.add(UiRewardSelectionState.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            arrayList5.add(RewardSelection.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            arrayList6.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 12:
                            bool3 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                            break;
                    }
                    r9 = bool4;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RewardsData rewardsData = (RewardsData) obj;
                reverseProtoWriter.getClass();
                rewardsData.getClass();
                reverseProtoWriter.writeBytes(rewardsData.unknownFields());
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 13, rewardsData.ytd_total_saving);
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 12, rewardsData.has_recently_used_boost);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.asRepeated().encodeWithTag(reverseProtoWriter, 11, rewardsData.ordered_reward_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 8, rewardsData.new_to_boost);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, rewardsData.show_boost_video);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, rewardsData.show_rewards);
                RewardSelection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 10, rewardsData.reward_selections);
                UiRewardSelectionState.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, rewardsData.reward_selection_states);
                protoAdapter3.asRepeated().encodeWithTag(reverseProtoWriter, 3, rewardsData.selectable_rewards_tokens);
                UiRewardSlot.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, rewardsData.slots);
                UiRewardProgramDetails.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, rewardsData.program_details);
                UiReward.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, rewardsData.rewards);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RewardsData rewardsData = (RewardsData) obj;
                rewardsData.getClass();
                int encodedSizeWithTag = UiRewardSlot.ADAPTER.asRepeated().encodedSizeWithTag(2, rewardsData.slots) + UiRewardProgramDetails.ADAPTER.asRepeated().encodedSizeWithTag(7, rewardsData.program_details) + UiReward.ADAPTER.asRepeated().encodedSizeWithTag(1, rewardsData.rewards) + rewardsData.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = RewardSelection.ADAPTER.asRepeated().encodedSizeWithTag(10, rewardsData.reward_selections) + UiRewardSelectionState.ADAPTER.asRepeated().encodedSizeWithTag(9, rewardsData.reward_selection_states) + protoAdapter2.asRepeated().encodedSizeWithTag(3, rewardsData.selectable_rewards_tokens) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                return Money.ADAPTER.encodedSizeWithTag(13, rewardsData.ytd_total_saving) + protoAdapter3.encodedSizeWithTag(12, rewardsData.has_recently_used_boost) + protoAdapter2.asRepeated().encodedSizeWithTag(11, rewardsData.ordered_reward_tokens) + protoAdapter3.encodedSizeWithTag(8, rewardsData.new_to_boost) + protoAdapter3.encodedSizeWithTag(5, rewardsData.show_boost_video) + protoAdapter3.encodedSizeWithTag(4, rewardsData.show_rewards) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RewardsData rewardsData = (RewardsData) obj;
                rewardsData.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(rewardsData.rewards, UiReward.ADAPTER);
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(rewardsData.program_details, UiRewardProgramDetails.ADAPTER);
                ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(rewardsData.slots, UiRewardSlot.ADAPTER);
                ArrayList m1169redactElements4 = TransactorKt.m1169redactElements(rewardsData.reward_selection_states, UiRewardSelectionState.ADAPTER);
                ArrayList m1169redactElements5 = TransactorKt.m1169redactElements(rewardsData.reward_selections, RewardSelection.ADAPTER);
                Money money = rewardsData.ytd_total_saving;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                ByteString byteString = ByteString.EMPTY;
                List list = rewardsData.selectable_rewards_tokens;
                Boolean bool = rewardsData.show_rewards;
                Boolean bool2 = rewardsData.show_boost_video;
                Boolean bool3 = rewardsData.new_to_boost;
                List list2 = rewardsData.ordered_reward_tokens;
                Boolean bool4 = rewardsData.has_recently_used_boost;
                list.getClass();
                list2.getClass();
                byteString.getClass();
                return new RewardsData(m1169redactElements, m1169redactElements2, m1169redactElements3, list, m1169redactElements4, m1169redactElements5, bool, bool2, bool3, list2, bool4, money2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RewardsData rewardsData = (RewardsData) obj;
                rewardsData.getClass();
                UiReward.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, rewardsData.rewards);
                UiRewardProgramDetails.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, rewardsData.program_details);
                UiRewardSlot.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, rewardsData.slots);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, rewardsData.selectable_rewards_tokens);
                UiRewardSelectionState.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, rewardsData.reward_selection_states);
                RewardSelection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, rewardsData.reward_selections);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(protoWriter, 4, rewardsData.show_rewards);
                protoAdapter3.encodeWithTag(protoWriter, 5, rewardsData.show_boost_video);
                protoAdapter3.encodeWithTag(protoWriter, 8, rewardsData.new_to_boost);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 11, rewardsData.ordered_reward_tokens);
                protoAdapter3.encodeWithTag(protoWriter, 12, rewardsData.has_recently_used_boost);
                Money.ADAPTER.encodeWithTag(protoWriter, 13, rewardsData.ytd_total_saving);
                protoWriter.writeBytes(rewardsData.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsData(List list, List list2, List list3, List list4, List list5, List list6, Boolean bool, Boolean bool2, Boolean bool3, List list7, Boolean bool4, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list6, list7, byteString);
        this.show_rewards = bool;
        this.show_boost_video = bool2;
        this.new_to_boost = bool3;
        this.has_recently_used_boost = bool4;
        this.ytd_total_saving = money;
        this.rewards = TransactorKt.immutableCopyOf("rewards", list);
        this.program_details = TransactorKt.immutableCopyOf("program_details", list2);
        this.slots = TransactorKt.immutableCopyOf("slots", list3);
        this.selectable_rewards_tokens = TransactorKt.immutableCopyOf("selectable_rewards_tokens", list4);
        this.reward_selection_states = TransactorKt.immutableCopyOf("reward_selection_states", list5);
        this.reward_selections = TransactorKt.immutableCopyOf("reward_selections", list6);
        this.ordered_reward_tokens = TransactorKt.immutableCopyOf("ordered_reward_tokens", list7);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RewardsData)) {
            return false;
        }
        RewardsData rewardsData = (RewardsData) obj;
        return Intrinsics.areEqual(unknownFields(), rewardsData.unknownFields()) && Intrinsics.areEqual(this.rewards, rewardsData.rewards) && Intrinsics.areEqual(this.program_details, rewardsData.program_details) && Intrinsics.areEqual(this.slots, rewardsData.slots) && Intrinsics.areEqual(this.selectable_rewards_tokens, rewardsData.selectable_rewards_tokens) && Intrinsics.areEqual(this.reward_selection_states, rewardsData.reward_selection_states) && Intrinsics.areEqual(this.reward_selections, rewardsData.reward_selections) && Intrinsics.areEqual(this.show_rewards, rewardsData.show_rewards) && Intrinsics.areEqual(this.show_boost_video, rewardsData.show_boost_video) && Intrinsics.areEqual(this.new_to_boost, rewardsData.new_to_boost) && Intrinsics.areEqual(this.ordered_reward_tokens, rewardsData.ordered_reward_tokens) && Intrinsics.areEqual(this.has_recently_used_boost, rewardsData.has_recently_used_boost) && Intrinsics.areEqual(this.ytd_total_saving, rewardsData.ytd_total_saving);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.rewards), 37, this.program_details), 37, this.slots), 37, this.selectable_rewards_tokens), 37, this.reward_selection_states), 37, this.reward_selections);
        Boolean bool = this.show_rewards;
        int hashCode = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.show_boost_video;
        int hashCode2 = (hashCode + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.new_to_boost;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37, 37, this.ordered_reward_tokens);
        Boolean bool4 = this.has_recently_used_boost;
        int hashCode3 = (m2 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Money money = this.ytd_total_saving;
        int hashCode4 = hashCode3 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(22);
        builder.key_path_ref = this.rewards;
        builder.string_literal = this.program_details;
        builder.int_literal = this.slots;
        builder.float_literal = this.selectable_rewards_tokens;
        builder.blob_literal = this.reward_selection_states;
        builder.unary_op = this.reward_selections;
        builder.bool_literal = this.show_rewards;
        builder.binary_op = this.show_boost_video;
        builder.conditional_op = this.new_to_boost;
        builder.filter_op = this.ordered_reward_tokens;
        builder.collection_literal = this.has_recently_used_boost;
        builder.format_string_op = this.ytd_total_saving;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.rewards;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("rewards=", arrayList, list);
        }
        List list2 = this.program_details;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("program_details=", arrayList, list2);
        }
        List list3 = this.slots;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("slots=", arrayList, list3);
        }
        List list4 = this.selectable_rewards_tokens;
        if (!list4.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("selectable_rewards_tokens=", arrayList, list4);
        }
        List list5 = this.reward_selection_states;
        if (!list5.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("reward_selection_states=", arrayList, list5);
        }
        List list6 = this.reward_selections;
        if (!list6.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("reward_selections=", arrayList, list6);
        }
        Boolean bool = this.show_rewards;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_rewards=", bool, arrayList);
        }
        Boolean bool2 = this.show_boost_video;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_boost_video=", bool2, arrayList);
        }
        Boolean bool3 = this.new_to_boost;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("new_to_boost=", bool3, arrayList);
        }
        List list7 = this.ordered_reward_tokens;
        if (!list7.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("ordered_reward_tokens=", arrayList, list7);
        }
        Boolean bool4 = this.has_recently_used_boost;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_recently_used_boost=", bool4, arrayList);
        }
        Money money = this.ytd_total_saving;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("ytd_total_saving=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RewardsData{", "}", 0, null, null, 56);
    }
}
