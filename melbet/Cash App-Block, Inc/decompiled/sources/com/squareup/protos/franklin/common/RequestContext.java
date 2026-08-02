package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/squareup/protos/franklin/common/RequestContext;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/RequestContext$Builder;", "Lcom/squareup/protos/franklin/common/RetryContext;", "retry_context", "Lcom/squareup/protos/franklin/common/RetryContext;", "", "promotion_token", "Ljava/lang/String;", "profile_token", "transfer_token", "blocker_descriptor_id", "Lcom/squareup/protos/franklin/common/SignalsContext;", "signals_context", "Lcom/squareup/protos/franklin/common/SignalsContext;", "Lcom/squareup/protos/franklin/common/ScenarioInitiatorType;", "scenario_initiator_type", "Lcom/squareup/protos/franklin/common/ScenarioInitiatorType;", "scenario_initiator_details", "Lcom/squareup/protos/cash/security/mri/api/v1/SignedSerializedMRIContext;", "signed_serialized_mri_context", "Lcom/squareup/protos/cash/security/mri/api/v1/SignedSerializedMRIContext;", "", "payment_tokens", "Ljava/util/List;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor;", "skipped_blockers", "Lokio/ByteString;", "all_known_ranges", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RequestContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RequestContext> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REPEATED, schemaIndex = 8, tag = 11)
    public final List<ByteString> all_known_ranges;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 9)
    public final String blocker_descriptor_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 8)
    public final List<String> payment_tokens;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 5)
    public final String profile_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 4)
    public final String promotion_token;

    @WireField(adapter = "com.squareup.protos.franklin.common.RetryContext#ADAPTER", schemaIndex = 0, tag = 1)
    public final RetryContext retry_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 15)
    public final String scenario_initiator_details;

    @WireField(adapter = "com.squareup.protos.franklin.common.ScenarioInitiatorType#ADAPTER", schemaIndex = 9, tag = 14)
    public final ScenarioInitiatorType scenario_initiator_type;

    @WireField(adapter = "com.squareup.protos.franklin.common.SignalsContext#ADAPTER", schemaIndex = 7, tag = 10)
    public final SignalsContext signals_context;

    @WireField(adapter = "com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext#ADAPTER", schemaIndex = 11, tag = 17)
    public final SignedSerializedMRIContext signed_serialized_mri_context;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.BlockerDescriptor#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 7)
    public final List<BlockerDescriptor> skipped_blockers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 6)
    public final String transfer_token;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\u0014\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\fJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010\u0019\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/common/RequestContext$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/RequestContext;", "<init>", "()V", "retry_context", "Lcom/squareup/protos/franklin/common/RetryContext;", "promotion_token", "", "profile_token", "transfer_token", "payment_tokens", "", "skipped_blockers", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor;", "blocker_descriptor_id", "signals_context", "Lcom/squareup/protos/franklin/common/SignalsContext;", "all_known_ranges", "Lokio/ByteString;", "scenario_initiator_type", "Lcom/squareup/protos/franklin/common/ScenarioInitiatorType;", "scenario_initiator_details", "signed_serialized_mri_context", "Lcom/squareup/protos/cash/security/mri/api/v1/SignedSerializedMRIContext;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder {
        public List<? extends ByteString> all_known_ranges;
        public String blocker_descriptor_id;
        public List<String> payment_tokens;
        public String profile_token;
        public String promotion_token;
        public RetryContext retry_context;
        public String scenario_initiator_details;
        public ScenarioInitiatorType scenario_initiator_type;
        public SignalsContext signals_context;
        public SignedSerializedMRIContext signed_serialized_mri_context;
        public List<BlockerDescriptor> skipped_blockers;
        public String transfer_token;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.payment_tokens = emptyList;
            this.skipped_blockers = emptyList;
            this.all_known_ranges = emptyList;
        }

        public final Builder all_known_ranges(List<? extends ByteString> all_known_ranges) {
            all_known_ranges.getClass();
            TransactorKt.checkElementsNotNull(all_known_ranges);
            this.all_known_ranges = all_known_ranges;
            return this;
        }

        public final Builder blocker_descriptor_id(String blocker_descriptor_id) {
            this.blocker_descriptor_id = blocker_descriptor_id;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public RequestContext build() {
            return new RequestContext(this.retry_context, this.promotion_token, this.profile_token, this.transfer_token, this.payment_tokens, this.skipped_blockers, this.blocker_descriptor_id, this.signals_context, this.all_known_ranges, this.scenario_initiator_type, this.scenario_initiator_details, this.signed_serialized_mri_context, buildUnknownFields());
        }

        public final Builder payment_tokens(List<String> payment_tokens) {
            payment_tokens.getClass();
            TransactorKt.checkElementsNotNull(payment_tokens);
            this.payment_tokens = payment_tokens;
            return this;
        }

        public final Builder profile_token(String profile_token) {
            this.profile_token = profile_token;
            return this;
        }

        public final Builder promotion_token(String promotion_token) {
            this.promotion_token = promotion_token;
            return this;
        }

        public final Builder retry_context(RetryContext retry_context) {
            this.retry_context = retry_context;
            return this;
        }

        public final Builder scenario_initiator_details(String scenario_initiator_details) {
            this.scenario_initiator_details = scenario_initiator_details;
            return this;
        }

        public final Builder scenario_initiator_type(ScenarioInitiatorType scenario_initiator_type) {
            this.scenario_initiator_type = scenario_initiator_type;
            return this;
        }

        public final Builder signals_context(SignalsContext signals_context) {
            this.signals_context = signals_context;
            return this;
        }

        public final Builder signed_serialized_mri_context(SignedSerializedMRIContext signed_serialized_mri_context) {
            this.signed_serialized_mri_context = signed_serialized_mri_context;
            return this;
        }

        public final Builder skipped_blockers(List<BlockerDescriptor> skipped_blockers) {
            skipped_blockers.getClass();
            TransactorKt.checkElementsNotNull(skipped_blockers);
            this.skipped_blockers = skipped_blockers;
            return this;
        }

        public final Builder transfer_token(String transfer_token) {
            this.transfer_token = transfer_token;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RequestContext.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.RequestContext$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r0v8 */
            @Override // com.squareup.wire.ProtoAdapter
            public RequestContext decode(ProtoReader reader) {
                ArrayList arrayList;
                ArrayList arrayList2;
                ?? r0;
                String str;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                long beginMessage = reader.beginMessage();
                String str2 = null;
                Object obj = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                Object obj2 = null;
                ScenarioInitiatorType scenarioInitiatorType = null;
                String str6 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new RequestContext((RetryContext) obj, str2, str3, str4, m, arrayList3, str5, (SignalsContext) obj2, arrayList4, scenarioInitiatorType, str6, (SignedSerializedMRIContext) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        arrayList = m;
                        arrayList2 = arrayList4;
                        obj = TransactorKt.decodeMessageOrMerge(RetryContext.ADAPTER, reader, obj);
                    } else if (nextTag != 17) {
                        if (nextTag == 14) {
                            try {
                                scenarioInitiatorType = ScenarioInitiatorType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                arrayList = m;
                                str = str3;
                                arrayList2 = arrayList4;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag != 15) {
                            switch (nextTag) {
                                case 4:
                                    r0 = ProtoAdapter.STRING.decode(reader);
                                    arrayList = m;
                                    arrayList2 = arrayList4;
                                    break;
                                case 5:
                                    str3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    str4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    arrayList3.add(BlockerDescriptor.ADAPTER.decode(reader));
                                    arrayList = m;
                                    str = str3;
                                    arrayList2 = arrayList4;
                                    r0 = str2;
                                    str3 = str;
                                    break;
                                case 8:
                                    m.add(ProtoAdapter.STRING.decode(reader));
                                    arrayList = m;
                                    str = str3;
                                    arrayList2 = arrayList4;
                                    r0 = str2;
                                    str3 = str;
                                    break;
                                case 9:
                                    str5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 10:
                                    obj2 = TransactorKt.decodeMessageOrMerge(SignalsContext.ADAPTER, reader, obj2);
                                    break;
                                case 11:
                                    arrayList4.add(ProtoAdapter.BYTES.decode(reader));
                                    arrayList = m;
                                    str = str3;
                                    arrayList2 = arrayList4;
                                    r0 = str2;
                                    str3 = str;
                                    break;
                                default:
                                    reader.readUnknownField(nextTag);
                                    arrayList = m;
                                    str = str3;
                                    arrayList2 = arrayList4;
                                    r0 = str2;
                                    str3 = str;
                                    break;
                            }
                            str2 = r0;
                            m = arrayList;
                            arrayList4 = arrayList2;
                        } else {
                            str6 = ProtoAdapter.STRING.decode(reader);
                        }
                        arrayList = m;
                        arrayList2 = arrayList4;
                    } else {
                        arrayList = m;
                        arrayList2 = arrayList4;
                        obj3 = TransactorKt.decodeMessageOrMerge(SignedSerializedMRIContext.ADAPTER, reader, obj3);
                    }
                    r0 = str2;
                    str2 = r0;
                    m = arrayList;
                    arrayList4 = arrayList2;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RequestContext value) {
                writer.getClass();
                value.getClass();
                RetryContext.ADAPTER.encodeWithTag(writer, 1, value.retry_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 4, value.promotion_token);
                protoAdapter2.encodeWithTag(writer, 5, value.profile_token);
                protoAdapter2.encodeWithTag(writer, 6, value.transfer_token);
                protoAdapter2.asRepeated().encodeWithTag(writer, 8, value.payment_tokens);
                BlockerDescriptor.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.skipped_blockers);
                protoAdapter2.encodeWithTag(writer, 9, value.blocker_descriptor_id);
                SignalsContext.ADAPTER.encodeWithTag(writer, 10, value.signals_context);
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(writer, 11, value.all_known_ranges);
                ScenarioInitiatorType.ADAPTER.encodeWithTag(writer, 14, value.scenario_initiator_type);
                protoAdapter2.encodeWithTag(writer, 15, value.scenario_initiator_details);
                SignedSerializedMRIContext.ADAPTER.encodeWithTag(writer, 17, value.signed_serialized_mri_context);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RequestContext value) {
                value.getClass();
                int encodedSizeWithTag = RetryContext.ADAPTER.encodedSizeWithTag(1, value.retry_context) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return SignedSerializedMRIContext.ADAPTER.encodedSizeWithTag(17, value.signed_serialized_mri_context) + protoAdapter2.encodedSizeWithTag(15, value.scenario_initiator_details) + ScenarioInitiatorType.ADAPTER.encodedSizeWithTag(14, value.scenario_initiator_type) + ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(11, value.all_known_ranges) + SignalsContext.ADAPTER.encodedSizeWithTag(10, value.signals_context) + protoAdapter2.encodedSizeWithTag(9, value.blocker_descriptor_id) + BlockerDescriptor.ADAPTER.asRepeated().encodedSizeWithTag(7, value.skipped_blockers) + protoAdapter2.asRepeated().encodedSizeWithTag(8, value.payment_tokens) + protoAdapter2.encodedSizeWithTag(6, value.transfer_token) + protoAdapter2.encodedSizeWithTag(5, value.profile_token) + protoAdapter2.encodedSizeWithTag(4, value.promotion_token) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RequestContext redact(RequestContext value) {
                value.getClass();
                RetryContext retryContext = value.retry_context;
                RetryContext retryContext2 = retryContext != null ? (RetryContext) RetryContext.ADAPTER.redact(retryContext) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.skipped_blockers, BlockerDescriptor.ADAPTER);
                SignalsContext signalsContext = value.signals_context;
                SignalsContext signalsContext2 = signalsContext != null ? (SignalsContext) SignalsContext.ADAPTER.redact(signalsContext) : null;
                SignedSerializedMRIContext signedSerializedMRIContext = value.signed_serialized_mri_context;
                return RequestContext.copy$default(value, retryContext2, null, null, null, null, m1169redactElements, null, signalsContext2, null, null, signedSerializedMRIContext != null ? (SignedSerializedMRIContext) SignedSerializedMRIContext.ADAPTER.redact(signedSerializedMRIContext) : null, ByteString.EMPTY, 1886);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RequestContext value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                SignedSerializedMRIContext.ADAPTER.encodeWithTag(writer, 17, value.signed_serialized_mri_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 15, value.scenario_initiator_details);
                ScenarioInitiatorType.ADAPTER.encodeWithTag(writer, 14, value.scenario_initiator_type);
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(writer, 11, value.all_known_ranges);
                SignalsContext.ADAPTER.encodeWithTag(writer, 10, value.signals_context);
                protoAdapter2.encodeWithTag(writer, 9, value.blocker_descriptor_id);
                BlockerDescriptor.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.skipped_blockers);
                protoAdapter2.asRepeated().encodeWithTag(writer, 8, value.payment_tokens);
                protoAdapter2.encodeWithTag(writer, 6, value.transfer_token);
                protoAdapter2.encodeWithTag(writer, 5, value.profile_token);
                protoAdapter2.encodeWithTag(writer, 4, value.promotion_token);
                RetryContext.ADAPTER.encodeWithTag(writer, 1, value.retry_context);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RequestContext(RetryContext retryContext, List list, String str, SignalsContext signalsContext, List list2, ScenarioInitiatorType scenarioInitiatorType, String str2, SignedSerializedMRIContext signedSerializedMRIContext, int i) {
        this(r4, null, null, null, r8, r9, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : signalsContext, (i & 256) != 0 ? r9 : list2, (i & 512) != 0 ? null : scenarioInitiatorType, (i & 1024) != 0 ? null : str2, (i & 2048) != 0 ? null : signedSerializedMRIContext, ByteString.EMPTY);
        RetryContext retryContext2 = (i & 1) != 0 ? null : retryContext;
        List list3 = (i & 16) != 0 ? EmptyList.INSTANCE : list;
        EmptyList emptyList = EmptyList.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RequestContext copy$default(RequestContext requestContext, RetryContext retryContext, String str, String str2, String str3, List list, ArrayList arrayList, String str4, SignalsContext signalsContext, ScenarioInitiatorType scenarioInitiatorType, String str5, SignedSerializedMRIContext signedSerializedMRIContext, ByteString byteString, int i) {
        if ((i & 1) != 0) {
            retryContext = requestContext.retry_context;
        }
        RetryContext retryContext2 = retryContext;
        String str6 = (i & 2) != 0 ? requestContext.promotion_token : str;
        String str7 = (i & 4) != 0 ? requestContext.profile_token : str2;
        String str8 = (i & 8) != 0 ? requestContext.transfer_token : str3;
        List list2 = (i & 16) != 0 ? requestContext.payment_tokens : list;
        List list3 = (i & 32) != 0 ? requestContext.skipped_blockers : arrayList;
        String str9 = (i & 64) != 0 ? requestContext.blocker_descriptor_id : str4;
        SignalsContext signalsContext2 = (i & 128) != 0 ? requestContext.signals_context : signalsContext;
        List<ByteString> list4 = requestContext.all_known_ranges;
        ScenarioInitiatorType scenarioInitiatorType2 = (i & 512) != 0 ? requestContext.scenario_initiator_type : scenarioInitiatorType;
        String str10 = (i & 1024) != 0 ? requestContext.scenario_initiator_details : str5;
        SignedSerializedMRIContext signedSerializedMRIContext2 = (i & 2048) != 0 ? requestContext.signed_serialized_mri_context : signedSerializedMRIContext;
        ByteString unknownFields = (i & 4096) != 0 ? requestContext.unknownFields() : byteString;
        requestContext.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        unknownFields.getClass();
        return new RequestContext(retryContext2, str6, str7, str8, list2, list3, str9, signalsContext2, list4, scenarioInitiatorType2, str10, signedSerializedMRIContext2, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestContext)) {
            return false;
        }
        RequestContext requestContext = (RequestContext) obj;
        return Intrinsics.areEqual(unknownFields(), requestContext.unknownFields()) && Intrinsics.areEqual(this.retry_context, requestContext.retry_context) && Intrinsics.areEqual(this.promotion_token, requestContext.promotion_token) && Intrinsics.areEqual(this.profile_token, requestContext.profile_token) && Intrinsics.areEqual(this.transfer_token, requestContext.transfer_token) && Intrinsics.areEqual(this.payment_tokens, requestContext.payment_tokens) && Intrinsics.areEqual(this.skipped_blockers, requestContext.skipped_blockers) && Intrinsics.areEqual(this.blocker_descriptor_id, requestContext.blocker_descriptor_id) && Intrinsics.areEqual(this.signals_context, requestContext.signals_context) && Intrinsics.areEqual(this.all_known_ranges, requestContext.all_known_ranges) && this.scenario_initiator_type == requestContext.scenario_initiator_type && Intrinsics.areEqual(this.scenario_initiator_details, requestContext.scenario_initiator_details) && Intrinsics.areEqual(this.signed_serialized_mri_context, requestContext.signed_serialized_mri_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RetryContext retryContext = this.retry_context;
        int hashCode2 = (hashCode + (retryContext != null ? retryContext.hashCode() : 0)) * 37;
        String str = this.promotion_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.profile_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.transfer_token;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.payment_tokens), 37, this.skipped_blockers);
        String str4 = this.blocker_descriptor_id;
        int hashCode5 = (m + (str4 != null ? str4.hashCode() : 0)) * 37;
        SignalsContext signalsContext = this.signals_context;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (signalsContext != null ? signalsContext.hashCode() : 0)) * 37, 37, this.all_known_ranges);
        ScenarioInitiatorType scenarioInitiatorType = this.scenario_initiator_type;
        int hashCode6 = (m2 + (scenarioInitiatorType != null ? scenarioInitiatorType.hashCode() : 0)) * 37;
        String str5 = this.scenario_initiator_details;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        SignedSerializedMRIContext signedSerializedMRIContext = this.signed_serialized_mri_context;
        int hashCode8 = hashCode7 + (signedSerializedMRIContext != null ? signedSerializedMRIContext.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.retry_context = this.retry_context;
        builder.promotion_token = this.promotion_token;
        builder.profile_token = this.profile_token;
        builder.transfer_token = this.transfer_token;
        builder.payment_tokens = this.payment_tokens;
        builder.skipped_blockers = this.skipped_blockers;
        builder.blocker_descriptor_id = this.blocker_descriptor_id;
        builder.signals_context = this.signals_context;
        builder.all_known_ranges = this.all_known_ranges;
        builder.scenario_initiator_type = this.scenario_initiator_type;
        builder.scenario_initiator_details = this.scenario_initiator_details;
        builder.signed_serialized_mri_context = this.signed_serialized_mri_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RetryContext retryContext = this.retry_context;
        if (retryContext != null) {
            arrayList.add("retry_context=" + retryContext);
        }
        String str = this.promotion_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "promotion_token=", arrayList);
        }
        String str2 = this.profile_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "profile_token=", arrayList);
        }
        String str3 = this.transfer_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "transfer_token=", arrayList);
        }
        if (!this.payment_tokens.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("payment_tokens=", arrayList, this.payment_tokens);
        }
        if (!this.skipped_blockers.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("skipped_blockers=", arrayList, this.skipped_blockers);
        }
        String str4 = this.blocker_descriptor_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "blocker_descriptor_id=", arrayList);
        }
        SignalsContext signalsContext = this.signals_context;
        if (signalsContext != null) {
            arrayList.add("signals_context=" + signalsContext);
        }
        if (!this.all_known_ranges.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("all_known_ranges=", arrayList, this.all_known_ranges);
        }
        ScenarioInitiatorType scenarioInitiatorType = this.scenario_initiator_type;
        if (scenarioInitiatorType != null) {
            arrayList.add("scenario_initiator_type=" + scenarioInitiatorType);
        }
        String str5 = this.scenario_initiator_details;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "scenario_initiator_details=", arrayList);
        }
        SignedSerializedMRIContext signedSerializedMRIContext = this.signed_serialized_mri_context;
        if (signedSerializedMRIContext != null) {
            arrayList.add("signed_serialized_mri_context=" + signedSerializedMRIContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RequestContext{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/RequestContext$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/RequestContext$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/RequestContext;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/RequestContext;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ RequestContext build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestContext(RetryContext retryContext, String str, String str2, String str3, List list, List list2, String str4, SignalsContext signalsContext, List list3, ScenarioInitiatorType scenarioInitiatorType, String str5, SignedSerializedMRIContext signedSerializedMRIContext, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.retry_context = retryContext;
        this.promotion_token = str;
        this.profile_token = str2;
        this.transfer_token = str3;
        this.blocker_descriptor_id = str4;
        this.signals_context = signalsContext;
        this.scenario_initiator_type = scenarioInitiatorType;
        this.scenario_initiator_details = str5;
        this.signed_serialized_mri_context = signedSerializedMRIContext;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
        this.skipped_blockers = TransactorKt.immutableCopyOf("skipped_blockers", list2);
        this.all_known_ranges = TransactorKt.immutableCopyOf("all_known_ranges", list3);
    }
}
