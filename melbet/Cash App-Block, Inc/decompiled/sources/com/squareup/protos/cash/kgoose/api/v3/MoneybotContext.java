package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.kgoosememorystore.api.v1.Memory;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003$#%R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\b\u0012\u0004\b\u0012\u0010\nR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\b\u0012\u0004\b\u0014\u0010\nR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\b\u0012\u0004\b\u0016\u0010\nR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006&"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotContext;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotContext$Builder;", "", "version", "Ljava/lang/Integer;", "", "should_extract_memory", "Ljava/lang/Boolean;", "getShould_extract_memory$annotations", "()V", "is_new_customer", "", "source_session_id", "Ljava/lang/String;", "enable_memory_retrieval", "memory_extraction_dry_run", "enable_freeform_memories", "getEnable_freeform_memories$annotations", "skip_session_name_generation", "getSkip_session_name_generation$annotations", "skip_tooltip_generation", "getSkip_tooltip_generation$annotations", "Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotContext$TriggerSource;", "trigger_source", "Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotContext$TriggerSource;", "Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference;", "generated_chat_agent_config_ref", "Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference;", "user_agent", "", "legal_and_compliance_tags", "Ljava/util/List;", "Lcom/squareup/protos/cash/kgoosememorystore/api/v1/Memory;", "memories", "Companion", "Builder", "TriggerSource", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MoneybotContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MoneybotContext> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 8, tag = 9)
    public final Boolean enable_freeform_memories;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    public final Boolean enable_memory_retrieval;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.AgentConfigReference#ADAPTER", schemaIndex = 12, tag = 13)
    public final AgentConfigReference generated_chat_agent_config_ref;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean is_new_customer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<String> legal_and_compliance_tags;

    @WireField(adapter = "com.squareup.protos.cash.kgoosememorystore.api.v1.Memory#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    public final List<Memory> memories;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 8)
    public final Boolean memory_extraction_dry_run;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean should_extract_memory;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 9, tag = 10)
    public final Boolean skip_session_name_generation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 10, tag = 11)
    public final Boolean skip_tooltip_generation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String source_session_id;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.MoneybotContext$TriggerSource#ADAPTER", schemaIndex = 11, tag = 12)
    public final TriggerSource trigger_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 13, tag = 14)
    public final String user_agent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 0, tag = 1)
    public final Integer version;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u001cJ\u0017\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u001dJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u001dJ\u0014\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u001dJ\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\rJ\u0015\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u001dJ\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u001dJ\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u001dJ\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotContext$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotContext;", "<init>", "()V", "version", "", "Ljava/lang/Integer;", "should_extract_memory", "", "Ljava/lang/Boolean;", "is_new_customer", "legal_and_compliance_tags", "", "", "source_session_id", "enable_memory_retrieval", "memories", "Lcom/squareup/protos/cash/kgoosememorystore/api/v1/Memory;", "memory_extraction_dry_run", "enable_freeform_memories", "skip_session_name_generation", "skip_tooltip_generation", "trigger_source", "Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotContext$TriggerSource;", "generated_chat_agent_config_ref", "Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference;", "user_agent", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotContext$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotContext$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Boolean enable_freeform_memories;
        public Boolean enable_memory_retrieval;
        public AgentConfigReference generated_chat_agent_config_ref;
        public Boolean is_new_customer;
        public List<String> legal_and_compliance_tags;
        public List<Memory> memories;
        public Boolean memory_extraction_dry_run;
        public Boolean should_extract_memory;
        public Boolean skip_session_name_generation;
        public Boolean skip_tooltip_generation;
        public String source_session_id;
        public TriggerSource trigger_source;
        public String user_agent;
        public Integer version;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.legal_and_compliance_tags = emptyList;
            this.memories = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public MoneybotContext build() {
            return new MoneybotContext(this.version, this.should_extract_memory, this.is_new_customer, this.legal_and_compliance_tags, this.source_session_id, this.enable_memory_retrieval, this.memories, this.memory_extraction_dry_run, this.enable_freeform_memories, this.skip_session_name_generation, this.skip_tooltip_generation, this.trigger_source, this.generated_chat_agent_config_ref, this.user_agent, buildUnknownFields());
        }

        @Deprecated
        public final Builder enable_freeform_memories(Boolean enable_freeform_memories) {
            this.enable_freeform_memories = enable_freeform_memories;
            return this;
        }

        public final Builder enable_memory_retrieval(Boolean enable_memory_retrieval) {
            this.enable_memory_retrieval = enable_memory_retrieval;
            return this;
        }

        public final Builder generated_chat_agent_config_ref(AgentConfigReference generated_chat_agent_config_ref) {
            this.generated_chat_agent_config_ref = generated_chat_agent_config_ref;
            return this;
        }

        public final Builder is_new_customer(Boolean is_new_customer) {
            this.is_new_customer = is_new_customer;
            return this;
        }

        public final Builder legal_and_compliance_tags(List<String> legal_and_compliance_tags) {
            legal_and_compliance_tags.getClass();
            TransactorKt.checkElementsNotNull(legal_and_compliance_tags);
            this.legal_and_compliance_tags = legal_and_compliance_tags;
            return this;
        }

        public final Builder memories(List<Memory> memories) {
            memories.getClass();
            TransactorKt.checkElementsNotNull(memories);
            this.memories = memories;
            return this;
        }

        public final Builder memory_extraction_dry_run(Boolean memory_extraction_dry_run) {
            this.memory_extraction_dry_run = memory_extraction_dry_run;
            return this;
        }

        @Deprecated
        public final Builder should_extract_memory(Boolean should_extract_memory) {
            this.should_extract_memory = should_extract_memory;
            return this;
        }

        @Deprecated
        public final Builder skip_session_name_generation(Boolean skip_session_name_generation) {
            this.skip_session_name_generation = skip_session_name_generation;
            return this;
        }

        @Deprecated
        public final Builder skip_tooltip_generation(Boolean skip_tooltip_generation) {
            this.skip_tooltip_generation = skip_tooltip_generation;
            return this;
        }

        public final Builder source_session_id(String source_session_id) {
            this.source_session_id = source_session_id;
            return this;
        }

        public final Builder trigger_source(TriggerSource trigger_source) {
            this.trigger_source = trigger_source;
            return this;
        }

        public final Builder user_agent(String user_agent) {
            this.user_agent = user_agent;
            return this;
        }

        public final Builder version(Integer version) {
            this.version = version;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotContext$TriggerSource;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "TRIGGER_SOURCE_UNSPECIFIED", "TRIGGER_SOURCE_DEFICIT_PREDICTED", "TRIGGER_SOURCE_RECURRING_CHARGE", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TriggerSource implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TriggerSource[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TriggerSource TRIGGER_SOURCE_DEFICIT_PREDICTED;
        public static final TriggerSource TRIGGER_SOURCE_RECURRING_CHARGE;
        public static final TriggerSource TRIGGER_SOURCE_UNSPECIFIED;
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotContext$TriggerSource$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotContext$TriggerSource;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            TriggerSource triggerSource = new TriggerSource("TRIGGER_SOURCE_UNSPECIFIED", 0, 0);
            TRIGGER_SOURCE_UNSPECIFIED = triggerSource;
            TriggerSource triggerSource2 = new TriggerSource("TRIGGER_SOURCE_DEFICIT_PREDICTED", 1, 1);
            TRIGGER_SOURCE_DEFICIT_PREDICTED = triggerSource2;
            TriggerSource triggerSource3 = new TriggerSource("TRIGGER_SOURCE_RECURRING_CHARGE", 2, 2);
            TRIGGER_SOURCE_RECURRING_CHARGE = triggerSource3;
            TriggerSource[] triggerSourceArr = {triggerSource, triggerSource2, triggerSource3};
            $VALUES = triggerSourceArr;
            $ENTRIES = new EnumEntriesList(triggerSourceArr);
            INSTANCE = new Companion();
            ADAPTER = new MoneybotContext$TriggerSource$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TriggerSource.class), Syntax.PROTO_2, triggerSource);
        }

        public TriggerSource(String str, int i, int i2) {
            this.value = i2;
        }

        public static final TriggerSource fromValue(int i) {
            INSTANCE.getClass();
            if (i == 0) {
                return TRIGGER_SOURCE_UNSPECIFIED;
            }
            if (i == 1) {
                return TRIGGER_SOURCE_DEFICIT_PREDICTED;
            }
            if (i != 2) {
                return null;
            }
            return TRIGGER_SOURCE_RECURRING_CHARGE;
        }

        public static TriggerSource valueOf(String str) {
            return (TriggerSource) Enum.valueOf(TriggerSource.class, str);
        }

        public static TriggerSource[] values() {
            return (TriggerSource[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        MoneybotContext$Companion$ADAPTER$1 moneybotContext$Companion$ADAPTER$1 = new MoneybotContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MoneybotContext.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.MoneybotContext", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = moneybotContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(moneybotContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotContext(Integer num, Boolean bool, Boolean bool2, List list, String str, Boolean bool3, List list2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, TriggerSource triggerSource, AgentConfigReference agentConfigReference, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.version = num;
        this.should_extract_memory = bool;
        this.is_new_customer = bool2;
        this.source_session_id = str;
        this.enable_memory_retrieval = bool3;
        this.memory_extraction_dry_run = bool4;
        this.enable_freeform_memories = bool5;
        this.skip_session_name_generation = bool6;
        this.skip_tooltip_generation = bool7;
        this.trigger_source = triggerSource;
        this.generated_chat_agent_config_ref = agentConfigReference;
        this.user_agent = str2;
        this.legal_and_compliance_tags = TransactorKt.immutableCopyOf("legal_and_compliance_tags", list);
        this.memories = TransactorKt.immutableCopyOf("memories", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MoneybotContext)) {
            return false;
        }
        MoneybotContext moneybotContext = (MoneybotContext) obj;
        return Intrinsics.areEqual(unknownFields(), moneybotContext.unknownFields()) && Intrinsics.areEqual(this.version, moneybotContext.version) && Intrinsics.areEqual(this.should_extract_memory, moneybotContext.should_extract_memory) && Intrinsics.areEqual(this.is_new_customer, moneybotContext.is_new_customer) && Intrinsics.areEqual(this.legal_and_compliance_tags, moneybotContext.legal_and_compliance_tags) && Intrinsics.areEqual(this.source_session_id, moneybotContext.source_session_id) && Intrinsics.areEqual(this.enable_memory_retrieval, moneybotContext.enable_memory_retrieval) && Intrinsics.areEqual(this.memories, moneybotContext.memories) && Intrinsics.areEqual(this.memory_extraction_dry_run, moneybotContext.memory_extraction_dry_run) && Intrinsics.areEqual(this.enable_freeform_memories, moneybotContext.enable_freeform_memories) && Intrinsics.areEqual(this.skip_session_name_generation, moneybotContext.skip_session_name_generation) && Intrinsics.areEqual(this.skip_tooltip_generation, moneybotContext.skip_tooltip_generation) && this.trigger_source == moneybotContext.trigger_source && Intrinsics.areEqual(this.generated_chat_agent_config_ref, moneybotContext.generated_chat_agent_config_ref) && Intrinsics.areEqual(this.user_agent, moneybotContext.user_agent);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.version;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Boolean bool = this.should_extract_memory;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.is_new_customer;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37, 37, this.legal_and_compliance_tags);
        String str = this.source_session_id;
        int hashCode4 = (m + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool3 = this.enable_memory_retrieval;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37, 37, this.memories);
        Boolean bool4 = this.memory_extraction_dry_run;
        int hashCode5 = (m2 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Boolean bool5 = this.enable_freeform_memories;
        int hashCode6 = (hashCode5 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        Boolean bool6 = this.skip_session_name_generation;
        int hashCode7 = (hashCode6 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0)) * 37;
        Boolean bool7 = this.skip_tooltip_generation;
        int hashCode8 = (hashCode7 + (bool7 != null ? Boolean.hashCode(bool7.booleanValue()) : 0)) * 37;
        TriggerSource triggerSource = this.trigger_source;
        int hashCode9 = (hashCode8 + (triggerSource != null ? triggerSource.hashCode() : 0)) * 37;
        AgentConfigReference agentConfigReference = this.generated_chat_agent_config_ref;
        int hashCode10 = (hashCode9 + (agentConfigReference != null ? agentConfigReference.hashCode() : 0)) * 37;
        String str2 = this.user_agent;
        int hashCode11 = hashCode10 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.version = this.version;
        builder.should_extract_memory = this.should_extract_memory;
        builder.is_new_customer = this.is_new_customer;
        builder.legal_and_compliance_tags = this.legal_and_compliance_tags;
        builder.source_session_id = this.source_session_id;
        builder.enable_memory_retrieval = this.enable_memory_retrieval;
        builder.memories = this.memories;
        builder.memory_extraction_dry_run = this.memory_extraction_dry_run;
        builder.enable_freeform_memories = this.enable_freeform_memories;
        builder.skip_session_name_generation = this.skip_session_name_generation;
        builder.skip_tooltip_generation = this.skip_tooltip_generation;
        builder.trigger_source = this.trigger_source;
        builder.generated_chat_agent_config_ref = this.generated_chat_agent_config_ref;
        builder.user_agent = this.user_agent;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.version;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("version=", num, arrayList);
        }
        Boolean bool = this.should_extract_memory;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_extract_memory=", bool, arrayList);
        }
        Boolean bool2 = this.is_new_customer;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_new_customer=", bool2, arrayList);
        }
        if (!this.legal_and_compliance_tags.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("legal_and_compliance_tags=", arrayList, this.legal_and_compliance_tags);
        }
        String str = this.source_session_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "source_session_id=", arrayList);
        }
        Boolean bool3 = this.enable_memory_retrieval;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enable_memory_retrieval=", bool3, arrayList);
        }
        if (!this.memories.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("memories=", arrayList, this.memories);
        }
        Boolean bool4 = this.memory_extraction_dry_run;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("memory_extraction_dry_run=", bool4, arrayList);
        }
        Boolean bool5 = this.enable_freeform_memories;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enable_freeform_memories=", bool5, arrayList);
        }
        Boolean bool6 = this.skip_session_name_generation;
        if (bool6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("skip_session_name_generation=", bool6, arrayList);
        }
        Boolean bool7 = this.skip_tooltip_generation;
        if (bool7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("skip_tooltip_generation=", bool7, arrayList);
        }
        TriggerSource triggerSource = this.trigger_source;
        if (triggerSource != null) {
            arrayList.add("trigger_source=" + triggerSource);
        }
        AgentConfigReference agentConfigReference = this.generated_chat_agent_config_ref;
        if (agentConfigReference != null) {
            arrayList.add("generated_chat_agent_config_ref=" + agentConfigReference);
        }
        String str2 = this.user_agent;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "user_agent=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MoneybotContext{", "}", 0, null, null, 56);
    }
}
