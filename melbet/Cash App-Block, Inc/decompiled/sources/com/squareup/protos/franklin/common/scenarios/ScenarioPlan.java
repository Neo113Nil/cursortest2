package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyOutcome;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyStart;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000f0\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan$Builder;", "", "end_onboarding", "Ljava/lang/Boolean;", "getEnd_onboarding$annotations", "()V", "Lcom/squareup/protos/franklin/common/scenarios/CashWaitingData;", "cash_waiting_data", "Lcom/squareup/protos/franklin/common/scenarios/CashWaitingData;", "Lcom/squareup/protos/franklin/common/scenarios/InviteFriendsData;", "invite_friends_data", "Lcom/squareup/protos/franklin/common/scenarios/InviteFriendsData;", "display_in_dialog", "Lcom/squareup/protos/cash/blockuserjourneys/api/v1/JourneyOutcome;", "journey_outcome", "Lcom/squareup/protos/cash/blockuserjourneys/api/v1/JourneyOutcome;", "", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor;", "blocker_descriptors", "Ljava/util/List;", "Lcom/squareup/protos/cash/blockuserjourneys/api/v1/JourneyStart;", "sub_journeys_started", "", "", "sub_journey_outcomes", "Ljava/util/Map;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScenarioPlan extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ScenarioPlan> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final boolean DEFAULT_END_ONBOARDING = false;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.BlockerDescriptor#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 6)
    public final List<BlockerDescriptor> blocker_descriptors;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.CashWaitingData#ADAPTER", schemaIndex = 1, tag = 4)
    public final CashWaitingData cash_waiting_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 7)
    public final Boolean display_in_dialog;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 3)
    public final Boolean end_onboarding;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.InviteFriendsData#ADAPTER", schemaIndex = 2, tag = 5)
    public final InviteFriendsData invite_friends_data;

    @WireField(adapter = "com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyOutcome#ADAPTER", schemaIndex = 5, tag = 8)
    public final JourneyOutcome journey_outcome;

    @WireField(adapter = "com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyOutcome#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 10)
    public final Map<String, JourneyOutcome> sub_journey_outcomes;

    @WireField(adapter = "com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyStart#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 9)
    public final List<JourneyStart> sub_journeys_started;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0017J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0014\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\rJ\u001a\u0010\u0014\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u0015J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;", "<init>", "()V", "end_onboarding", "", "Ljava/lang/Boolean;", "cash_waiting_data", "Lcom/squareup/protos/franklin/common/scenarios/CashWaitingData;", "invite_friends_data", "Lcom/squareup/protos/franklin/common/scenarios/InviteFriendsData;", "blocker_descriptors", "", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor;", "display_in_dialog", "journey_outcome", "Lcom/squareup/protos/cash/blockuserjourneys/api/v1/JourneyOutcome;", "sub_journeys_started", "Lcom/squareup/protos/cash/blockuserjourneys/api/v1/JourneyStart;", "sub_journey_outcomes", "", "", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public List<BlockerDescriptor> blocker_descriptors;
        public CashWaitingData cash_waiting_data;
        public Boolean display_in_dialog;
        public Boolean end_onboarding;
        public InviteFriendsData invite_friends_data;
        public JourneyOutcome journey_outcome;
        public Map<String, ? extends JourneyOutcome> sub_journey_outcomes;
        public List<JourneyStart> sub_journeys_started;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.blocker_descriptors = emptyList;
            this.sub_journeys_started = emptyList;
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            this.sub_journey_outcomes = emptyMap;
        }

        public final Builder blocker_descriptors(List<BlockerDescriptor> blocker_descriptors) {
            blocker_descriptors.getClass();
            TransactorKt.checkElementsNotNull(blocker_descriptors);
            this.blocker_descriptors = blocker_descriptors;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ScenarioPlan build() {
            return new ScenarioPlan(this.end_onboarding, this.cash_waiting_data, this.invite_friends_data, this.blocker_descriptors, this.display_in_dialog, this.journey_outcome, this.sub_journeys_started, this.sub_journey_outcomes, buildUnknownFields());
        }

        public final Builder cash_waiting_data(CashWaitingData cash_waiting_data) {
            this.cash_waiting_data = cash_waiting_data;
            return this;
        }

        public final Builder display_in_dialog(Boolean display_in_dialog) {
            this.display_in_dialog = display_in_dialog;
            return this;
        }

        @Deprecated
        public final Builder end_onboarding(Boolean end_onboarding) {
            this.end_onboarding = end_onboarding;
            return this;
        }

        public final Builder invite_friends_data(InviteFriendsData invite_friends_data) {
            this.invite_friends_data = invite_friends_data;
            return this;
        }

        public final Builder journey_outcome(JourneyOutcome journey_outcome) {
            this.journey_outcome = journey_outcome;
            return this;
        }

        public final Builder sub_journey_outcomes(Map<String, ? extends JourneyOutcome> sub_journey_outcomes) {
            sub_journey_outcomes.getClass();
            this.sub_journey_outcomes = sub_journey_outcomes;
            return this;
        }

        public final Builder sub_journeys_started(List<JourneyStart> sub_journeys_started) {
            sub_journeys_started.getClass();
            TransactorKt.checkElementsNotNull(sub_journeys_started);
            this.sub_journeys_started = sub_journeys_started;
            return this;
        }
    }

    static {
        ScenarioPlan$Companion$ADAPTER$1 scenarioPlan$Companion$ADAPTER$1 = new ScenarioPlan$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ScenarioPlan.class), Syntax.PROTO_2);
        ADAPTER = scenarioPlan$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(scenarioPlan$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScenarioPlan(Boolean bool, CashWaitingData cashWaitingData, InviteFriendsData inviteFriendsData, List list, Boolean bool2, JourneyOutcome journeyOutcome, List list2, Map map, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        map.getClass();
        byteString.getClass();
        this.end_onboarding = bool;
        this.cash_waiting_data = cashWaitingData;
        this.invite_friends_data = inviteFriendsData;
        this.display_in_dialog = bool2;
        this.journey_outcome = journeyOutcome;
        this.blocker_descriptors = TransactorKt.immutableCopyOf("blocker_descriptors", list);
        this.sub_journeys_started = TransactorKt.immutableCopyOf("sub_journeys_started", list2);
        this.sub_journey_outcomes = TransactorKt.immutableCopyOf("sub_journey_outcomes", map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ScenarioPlan copy$default(ScenarioPlan scenarioPlan, CashWaitingData cashWaitingData, InviteFriendsData inviteFriendsData, List list, ArrayList arrayList, ByteString byteString, int i) {
        Boolean bool = scenarioPlan.end_onboarding;
        if ((i & 2) != 0) {
            cashWaitingData = scenarioPlan.cash_waiting_data;
        }
        CashWaitingData cashWaitingData2 = cashWaitingData;
        if ((i & 4) != 0) {
            inviteFriendsData = scenarioPlan.invite_friends_data;
        }
        InviteFriendsData inviteFriendsData2 = inviteFriendsData;
        Boolean bool2 = scenarioPlan.display_in_dialog;
        JourneyOutcome journeyOutcome = scenarioPlan.journey_outcome;
        List list2 = arrayList;
        if ((i & 64) != 0) {
            list2 = scenarioPlan.sub_journeys_started;
        }
        List list3 = list2;
        Map<String, JourneyOutcome> map = scenarioPlan.sub_journey_outcomes;
        if ((i & 256) != 0) {
            byteString = scenarioPlan.unknownFields();
        }
        ByteString byteString2 = byteString;
        scenarioPlan.getClass();
        list.getClass();
        list3.getClass();
        map.getClass();
        byteString2.getClass();
        return new ScenarioPlan(bool, cashWaitingData2, inviteFriendsData2, list, bool2, journeyOutcome, list3, map, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScenarioPlan)) {
            return false;
        }
        ScenarioPlan scenarioPlan = (ScenarioPlan) obj;
        return Intrinsics.areEqual(unknownFields(), scenarioPlan.unknownFields()) && Intrinsics.areEqual(this.end_onboarding, scenarioPlan.end_onboarding) && Intrinsics.areEqual(this.cash_waiting_data, scenarioPlan.cash_waiting_data) && Intrinsics.areEqual(this.invite_friends_data, scenarioPlan.invite_friends_data) && Intrinsics.areEqual(this.blocker_descriptors, scenarioPlan.blocker_descriptors) && Intrinsics.areEqual(this.display_in_dialog, scenarioPlan.display_in_dialog) && this.journey_outcome == scenarioPlan.journey_outcome && Intrinsics.areEqual(this.sub_journeys_started, scenarioPlan.sub_journeys_started) && Intrinsics.areEqual(this.sub_journey_outcomes, scenarioPlan.sub_journey_outcomes);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.end_onboarding;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        CashWaitingData cashWaitingData = this.cash_waiting_data;
        int hashCode3 = (hashCode2 + (cashWaitingData != null ? cashWaitingData.hashCode() : 0)) * 37;
        InviteFriendsData inviteFriendsData = this.invite_friends_data;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (inviteFriendsData != null ? inviteFriendsData.hashCode() : 0)) * 37, 37, this.blocker_descriptors);
        Boolean bool2 = this.display_in_dialog;
        int hashCode4 = (m + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        JourneyOutcome journeyOutcome = this.journey_outcome;
        int hashCode5 = this.sub_journey_outcomes.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (journeyOutcome != null ? journeyOutcome.hashCode() : 0)) * 37, 37, this.sub_journeys_started);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.end_onboarding = this.end_onboarding;
        builder.cash_waiting_data = this.cash_waiting_data;
        builder.invite_friends_data = this.invite_friends_data;
        builder.blocker_descriptors = this.blocker_descriptors;
        builder.display_in_dialog = this.display_in_dialog;
        builder.journey_outcome = this.journey_outcome;
        builder.sub_journeys_started = this.sub_journeys_started;
        builder.sub_journey_outcomes = this.sub_journey_outcomes;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.end_onboarding;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("end_onboarding=", bool, arrayList);
        }
        CashWaitingData cashWaitingData = this.cash_waiting_data;
        if (cashWaitingData != null) {
            arrayList.add("cash_waiting_data=" + cashWaitingData);
        }
        InviteFriendsData inviteFriendsData = this.invite_friends_data;
        if (inviteFriendsData != null) {
            arrayList.add("invite_friends_data=" + inviteFriendsData);
        }
        if (!this.blocker_descriptors.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("blocker_descriptors=", arrayList, this.blocker_descriptors);
        }
        Boolean bool2 = this.display_in_dialog;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("display_in_dialog=", bool2, arrayList);
        }
        JourneyOutcome journeyOutcome = this.journey_outcome;
        if (journeyOutcome != null) {
            arrayList.add("journey_outcome=" + journeyOutcome);
        }
        if (!this.sub_journeys_started.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sub_journeys_started=", arrayList, this.sub_journeys_started);
        }
        if (!this.sub_journey_outcomes.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sub_journey_outcomes=", this.sub_journey_outcomes, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScenarioPlan{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;", "", "DEFAULT_END_ONBOARDING", "Z", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ScenarioPlan build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ScenarioPlan(int i) {
        this(r0, null, null, r5, null, null, r5, r9, ByteString.EMPTY);
        Boolean bool = (i & 1) != 0 ? null : Boolean.FALSE;
        EmptyList emptyList = EmptyList.INSTANCE;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
    }
}
