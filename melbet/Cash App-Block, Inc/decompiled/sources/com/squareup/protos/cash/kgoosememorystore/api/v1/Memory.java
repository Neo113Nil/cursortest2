package com.squareup.protos.cash.kgoosememorystore.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.rewardly.ui.UiReward;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Memory extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Memory> CREATOR;
    public final Double amount;
    public final Float confidence;
    public final String content;
    public final Instant created_at;
    public final String creator;
    public final Instant expires_at;
    public final FinancialKey financial_key;
    public final String id;
    public final Instant last_reinforced_at;
    public final List memory_extraction_session_ids;
    public final MemoryOrigin origin;
    public final Integer reinforcement_count;
    public final String replaced_by_id;
    public final List replaces_ids;
    public final List source_session_ids;
    public final MemoryStatus status;
    public final TemporalQualifier temporal_qualifier;
    public final List topic_tags;

    /* renamed from: type, reason: collision with root package name */
    public final MemoryType f1301type;
    public final Instant updated_at;

    static {
        Memory$Companion$ADAPTER$1 memory$Companion$ADAPTER$1 = new Memory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Memory.class), "type.googleapis.com/squareup.cash.kgoosememorystore.api.v1beta1.Memory", Syntax.PROTO_2, null, "squareup/cash/kgoosememorystore/api/v1beta1/memory.proto");
        ADAPTER = memory$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(memory$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Memory(String str, String str2, MemoryType memoryType, String str3, Float f, List list, List list2, List list3, Instant instant, Instant instant2, MemoryStatus memoryStatus, List list4, String str4, MemoryOrigin memoryOrigin, FinancialKey financialKey, Double d, Instant instant3, Instant instant4, Integer num, TemporalQualifier temporalQualifier, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        byteString.getClass();
        this.id = str;
        this.creator = str2;
        this.f1301type = memoryType;
        this.content = str3;
        this.confidence = f;
        this.created_at = instant;
        this.updated_at = instant2;
        this.status = memoryStatus;
        this.replaced_by_id = str4;
        this.origin = memoryOrigin;
        this.financial_key = financialKey;
        this.amount = d;
        this.expires_at = instant3;
        this.last_reinforced_at = instant4;
        this.reinforcement_count = num;
        this.temporal_qualifier = temporalQualifier;
        this.source_session_ids = TransactorKt.immutableCopyOf("source_session_ids", list);
        this.topic_tags = TransactorKt.immutableCopyOf("topic_tags", list2);
        this.memory_extraction_session_ids = TransactorKt.immutableCopyOf("memory_extraction_session_ids", list3);
        this.replaces_ids = TransactorKt.immutableCopyOf("replaces_ids", list4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Memory)) {
            return false;
        }
        Memory memory = (Memory) obj;
        return Intrinsics.areEqual(unknownFields(), memory.unknownFields()) && Intrinsics.areEqual(this.id, memory.id) && Intrinsics.areEqual(this.creator, memory.creator) && this.f1301type == memory.f1301type && Intrinsics.areEqual(this.content, memory.content) && Intrinsics.areEqual(this.confidence, memory.confidence) && Intrinsics.areEqual(this.source_session_ids, memory.source_session_ids) && Intrinsics.areEqual(this.topic_tags, memory.topic_tags) && Intrinsics.areEqual(this.memory_extraction_session_ids, memory.memory_extraction_session_ids) && Intrinsics.areEqual(this.created_at, memory.created_at) && Intrinsics.areEqual(this.updated_at, memory.updated_at) && this.status == memory.status && Intrinsics.areEqual(this.replaces_ids, memory.replaces_ids) && Intrinsics.areEqual(this.replaced_by_id, memory.replaced_by_id) && this.origin == memory.origin && this.financial_key == memory.financial_key && Intrinsics.areEqual(this.amount, memory.amount) && Intrinsics.areEqual(this.expires_at, memory.expires_at) && Intrinsics.areEqual(this.last_reinforced_at, memory.last_reinforced_at) && Intrinsics.areEqual(this.reinforcement_count, memory.reinforcement_count) && this.temporal_qualifier == memory.temporal_qualifier;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.creator;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        MemoryType memoryType = this.f1301type;
        int hashCode4 = (hashCode3 + (memoryType != null ? memoryType.hashCode() : 0)) * 37;
        String str3 = this.content;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Float f = this.confidence;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37, 37, this.source_session_ids), 37, this.topic_tags), 37, this.memory_extraction_session_ids);
        Instant instant = this.created_at;
        int hashCode6 = (m + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.updated_at;
        int hashCode7 = (hashCode6 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        MemoryStatus memoryStatus = this.status;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode7 + (memoryStatus != null ? memoryStatus.hashCode() : 0)) * 37, 37, this.replaces_ids);
        String str4 = this.replaced_by_id;
        int hashCode8 = (m2 + (str4 != null ? str4.hashCode() : 0)) * 37;
        MemoryOrigin memoryOrigin = this.origin;
        int hashCode9 = (hashCode8 + (memoryOrigin != null ? memoryOrigin.hashCode() : 0)) * 37;
        FinancialKey financialKey = this.financial_key;
        int hashCode10 = (hashCode9 + (financialKey != null ? financialKey.hashCode() : 0)) * 37;
        Double d = this.amount;
        int hashCode11 = (hashCode10 + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
        Instant instant3 = this.expires_at;
        int hashCode12 = (hashCode11 + (instant3 != null ? instant3.hashCode() : 0)) * 37;
        Instant instant4 = this.last_reinforced_at;
        int hashCode13 = (hashCode12 + (instant4 != null ? instant4.hashCode() : 0)) * 37;
        Integer num = this.reinforcement_count;
        int hashCode14 = (hashCode13 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        TemporalQualifier temporalQualifier = this.temporal_qualifier;
        int hashCode15 = hashCode14 + (temporalQualifier != null ? temporalQualifier.hashCode() : 0);
        this.hashCode = hashCode15;
        return hashCode15;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiReward.Builder builder = new UiReward.Builder(3);
        builder.token = this.id;
        builder.category = this.creator;
        builder.affiliate_link_url = this.f1301type;
        builder.title = this.content;
        builder.user_agent = this.confidence;
        builder.boost_attributes = this.source_session_ids;
        builder.merchant_tokens = this.topic_tags;
        builder.full_title_text = this.memory_extraction_session_ids;
        builder.discount_text = this.created_at;
        builder.merchant_name = this.updated_at;
        builder.offerly_token = this.status;
        builder.reward_avatars = this.replaces_ids;
        builder.main_text = this.replaced_by_id;
        builder.activation_date_time_ms = this.origin;
        builder.expiration_date_time_ms = this.financial_key;
        builder.draggable = this.amount;
        builder.is_custom_offer = this.expires_at;
        builder.redeemable_with_cash_card = this.last_reinforced_at;
        builder.redeemable_with_cash_app_pay = this.reinforcement_count;
        builder.app_links = this.temporal_qualifier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.creator;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "creator=", arrayList);
        }
        MemoryType memoryType = this.f1301type;
        if (memoryType != null) {
            arrayList.add("type=" + memoryType);
        }
        String str3 = this.content;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "content=", arrayList);
        }
        Float f = this.confidence;
        if (f != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("confidence=", f, arrayList);
        }
        List list = this.source_session_ids;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("source_session_ids=", arrayList, list);
        }
        List list2 = this.topic_tags;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("topic_tags=", arrayList, list2);
        }
        List list3 = this.memory_extraction_session_ids;
        if (!list3.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("memory_extraction_session_ids=", arrayList, list3);
        }
        Instant instant = this.created_at;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("created_at=", instant, arrayList);
        }
        Instant instant2 = this.updated_at;
        if (instant2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("updated_at=", instant2, arrayList);
        }
        MemoryStatus memoryStatus = this.status;
        if (memoryStatus != null) {
            arrayList.add("status=" + memoryStatus);
        }
        List list4 = this.replaces_ids;
        if (!list4.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("replaces_ids=", arrayList, list4);
        }
        String str4 = this.replaced_by_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "replaced_by_id=", arrayList);
        }
        MemoryOrigin memoryOrigin = this.origin;
        if (memoryOrigin != null) {
            arrayList.add("origin=" + memoryOrigin);
        }
        FinancialKey financialKey = this.financial_key;
        if (financialKey != null) {
            arrayList.add("financial_key=" + financialKey);
        }
        Double d = this.amount;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("amount=", d, arrayList);
        }
        Instant instant3 = this.expires_at;
        if (instant3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("expires_at=", instant3, arrayList);
        }
        Instant instant4 = this.last_reinforced_at;
        if (instant4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("last_reinforced_at=", instant4, arrayList);
        }
        Integer num = this.reinforcement_count;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("reinforcement_count=", num, arrayList);
        }
        TemporalQualifier temporalQualifier = this.temporal_qualifier;
        if (temporalQualifier != null) {
            arrayList.add("temporal_qualifier=" + temporalQualifier);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Memory{", "}", 0, null, null, 56);
    }
}
