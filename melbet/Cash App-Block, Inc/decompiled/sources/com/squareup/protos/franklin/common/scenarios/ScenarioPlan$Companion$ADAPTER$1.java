package com.squareup.protos.franklin.common.scenarios;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyOutcome;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyStart;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"com/squareup/protos/franklin/common/scenarios/ScenarioPlan$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;", "sub_journey_outcomesAdapter", "", "", "Lcom/squareup/protos/cash/blockuserjourneys/api/v1/JourneyOutcome;", "getSub_journey_outcomesAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "sub_journey_outcomesAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScenarioPlan$Companion$ADAPTER$1 extends ProtoAdapter {

    /* renamed from: sub_journey_outcomesAdapter$delegate, reason: from kotlin metadata */
    private final Lazy sub_journey_outcomesAdapter;

    public ScenarioPlan$Companion$ADAPTER$1(FieldEncoding fieldEncoding, KClass kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/squareup.franklin.common.scenarios.ScenarioPlan", syntax, (Object) null, "squareup/franklin/scenarios.proto");
        this.sub_journey_outcomesAdapter = LazyKt.lazy(new Moneys$$ExternalSyntheticLambda0(23));
    }

    private final ProtoAdapter getSub_journey_outcomesAdapter() {
        return (ProtoAdapter) this.sub_journey_outcomesAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter sub_journey_outcomesAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.Companion;
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        ProtoAdapter protoAdapter2 = JourneyOutcome.ADAPTER;
        companion.getClass();
        return ProtoAdapter.Companion.newMapAdapter(protoAdapter, protoAdapter2);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public ScenarioPlan decode(ProtoReader reader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long beginMessage = reader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                return new ScenarioPlan((Boolean) obj, (CashWaitingData) obj2, (InviteFriendsData) obj3, m, (Boolean) obj4, (JourneyOutcome) obj5, arrayList, linkedHashMap, reader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 3:
                    obj = ProtoAdapter.BOOL.decode(reader);
                    break;
                case 4:
                    obj2 = TransactorKt.decodeMessageOrMerge(CashWaitingData.ADAPTER, reader, obj2);
                    break;
                case 5:
                    obj3 = TransactorKt.decodeMessageOrMerge(InviteFriendsData.ADAPTER, reader, obj3);
                    break;
                case 6:
                    m.add(BlockerDescriptor.ADAPTER.decode(reader));
                    break;
                case 7:
                    obj4 = ProtoAdapter.BOOL.decode(reader);
                    break;
                case 8:
                    try {
                        obj5 = JourneyOutcome.ADAPTER.decode(reader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 9:
                    arrayList.add(JourneyStart.ADAPTER.decode(reader));
                    break;
                case 10:
                    linkedHashMap.putAll((Map) getSub_journey_outcomesAdapter().decode(reader));
                    break;
                default:
                    reader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, ScenarioPlan value) {
        writer.getClass();
        value.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(writer, 3, value.end_onboarding);
        CashWaitingData.ADAPTER.encodeWithTag(writer, 4, value.cash_waiting_data);
        InviteFriendsData.ADAPTER.encodeWithTag(writer, 5, value.invite_friends_data);
        BlockerDescriptor.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.blocker_descriptors);
        protoAdapter.encodeWithTag(writer, 7, value.display_in_dialog);
        JourneyOutcome.ADAPTER.encodeWithTag(writer, 8, value.journey_outcome);
        JourneyStart.ADAPTER.asRepeated().encodeWithTag(writer, 9, value.sub_journeys_started);
        getSub_journey_outcomesAdapter().encodeWithTag(writer, 10, value.sub_journey_outcomes);
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(ScenarioPlan value) {
        value.getClass();
        int size$okio = value.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return getSub_journey_outcomesAdapter().encodedSizeWithTag(10, value.sub_journey_outcomes) + JourneyStart.ADAPTER.asRepeated().encodedSizeWithTag(9, value.sub_journeys_started) + JourneyOutcome.ADAPTER.encodedSizeWithTag(8, value.journey_outcome) + protoAdapter.encodedSizeWithTag(7, value.display_in_dialog) + BlockerDescriptor.ADAPTER.asRepeated().encodedSizeWithTag(6, value.blocker_descriptors) + InviteFriendsData.ADAPTER.encodedSizeWithTag(5, value.invite_friends_data) + CashWaitingData.ADAPTER.encodedSizeWithTag(4, value.cash_waiting_data) + protoAdapter.encodedSizeWithTag(3, value.end_onboarding) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public ScenarioPlan redact(ScenarioPlan value) {
        value.getClass();
        CashWaitingData cashWaitingData = value.cash_waiting_data;
        CashWaitingData cashWaitingData2 = cashWaitingData != null ? (CashWaitingData) CashWaitingData.ADAPTER.redact(cashWaitingData) : null;
        InviteFriendsData inviteFriendsData = value.invite_friends_data;
        return ScenarioPlan.copy$default(value, cashWaitingData2, inviteFriendsData != null ? (InviteFriendsData) InviteFriendsData.ADAPTER.redact(inviteFriendsData) : null, TransactorKt.m1169redactElements(value.blocker_descriptors, BlockerDescriptor.ADAPTER), TransactorKt.m1169redactElements(value.sub_journeys_started, JourneyStart.ADAPTER), ByteString.EMPTY, EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, ScenarioPlan value) {
        writer.getClass();
        value.getClass();
        writer.writeBytes(value.unknownFields());
        getSub_journey_outcomesAdapter().encodeWithTag(writer, 10, value.sub_journey_outcomes);
        JourneyStart.ADAPTER.asRepeated().encodeWithTag(writer, 9, value.sub_journeys_started);
        JourneyOutcome.ADAPTER.encodeWithTag(writer, 8, value.journey_outcome);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(writer, 7, value.display_in_dialog);
        BlockerDescriptor.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.blocker_descriptors);
        InviteFriendsData.ADAPTER.encodeWithTag(writer, 5, value.invite_friends_data);
        CashWaitingData.ADAPTER.encodeWithTag(writer, 4, value.cash_waiting_data);
        protoAdapter.encodeWithTag(writer, 3, value.end_onboarding);
    }
}
