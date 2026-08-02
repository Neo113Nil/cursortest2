package com.squareup.protos.franklin.blockers;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.blockers.PersonaDidvBlocker;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001b\u001c\u001a\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u0012\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\b\u0012\u0004\b\u000f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\bR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$Builder;", "Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$PersonaId;", "persona_id", "Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$PersonaId;", "", "reference_id", "Ljava/lang/String;", "inquiry_id", TrackingEventsLoggerImpl.KEY_SESSION_TOKEN, "country_code", "getCountry_code$annotations", "()V", "region", "getRegion$annotations", "", "resolve_on_cancel", "Ljava/lang/Boolean;", "Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$FlowType;", "idv_flow_type", "Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$FlowType;", "flow_token", "is_fallback_mode", "fallback_template_id", "biometric_consent_collected", "Companion", "Builder", "PersonaId", "FlowType", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PersonaDidvBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PersonaDidvBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final boolean DEFAULT_IS_FALLBACK_MODE = false;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 11, tag = 13)
    public final Boolean biometric_consent_collected;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 6)
    public final String country_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 12)
    public final String fallback_template_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 10)
    public final String flow_token;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.PersonaDidvBlocker$FlowType#ADAPTER", schemaIndex = 7, tag = 9)
    public final FlowType idv_flow_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 4)
    public final String inquiry_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 9, tag = 11)
    public final Boolean is_fallback_mode;

    @WireSealedOneof(schemaIndex = 0)
    public final PersonaId persona_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 3)
    public final String reference_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 7)
    public final String region;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 6, tag = 8)
    public final Boolean resolve_on_cancel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 5)
    public final String session_token;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0007J\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\bJ\u0015\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\bJ\u0015\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0017\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker;", "<init>", "()V", "persona_id", "Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$PersonaId;", "reference_id", "", "inquiry_id", TrackingEventsLoggerImpl.KEY_SESSION_TOKEN, "country_code", "region", "resolve_on_cancel", "", "Ljava/lang/Boolean;", "idv_flow_type", "Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$FlowType;", "flow_token", "is_fallback_mode", "fallback_template_id", "biometric_consent_collected", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Boolean biometric_consent_collected;
        public String country_code;
        public String fallback_template_id;
        public String flow_token;
        public FlowType idv_flow_type;
        public String inquiry_id;
        public Boolean is_fallback_mode;
        public PersonaId persona_id;
        public String reference_id;
        public String region;
        public Boolean resolve_on_cancel;
        public String session_token;

        public final Builder biometric_consent_collected(Boolean biometric_consent_collected) {
            this.biometric_consent_collected = biometric_consent_collected;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PersonaDidvBlocker build() {
            return new PersonaDidvBlocker(this.persona_id, this.reference_id, this.inquiry_id, this.session_token, this.country_code, this.region, this.resolve_on_cancel, this.idv_flow_type, this.flow_token, this.is_fallback_mode, this.fallback_template_id, this.biometric_consent_collected, buildUnknownFields());
        }

        @Deprecated
        public final Builder country_code(String country_code) {
            this.country_code = country_code;
            return this;
        }

        public final Builder fallback_template_id(String fallback_template_id) {
            this.fallback_template_id = fallback_template_id;
            return this;
        }

        public final Builder flow_token(String flow_token) {
            this.flow_token = flow_token;
            return this;
        }

        public final Builder idv_flow_type(FlowType idv_flow_type) {
            this.idv_flow_type = idv_flow_type;
            return this;
        }

        public final Builder inquiry_id(String inquiry_id) {
            this.inquiry_id = inquiry_id;
            return this;
        }

        public final Builder is_fallback_mode(Boolean is_fallback_mode) {
            this.is_fallback_mode = is_fallback_mode;
            return this;
        }

        public final Builder persona_id(PersonaId persona_id) {
            this.persona_id = persona_id;
            return this;
        }

        public final Builder reference_id(String reference_id) {
            this.reference_id = reference_id;
            return this;
        }

        @Deprecated
        public final Builder region(String region) {
            this.region = region;
            return this;
        }

        public final Builder resolve_on_cancel(Boolean resolve_on_cancel) {
            this.resolve_on_cancel = resolve_on_cancel;
            return this;
        }

        public final Builder session_token(String session_token) {
            this.session_token = session_token;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PersonaDidvBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.PersonaDidvBlocker$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v29 */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v32 */
            /* JADX WARN: Type inference failed for: r0v33 */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public PersonaDidvBlocker decode(ProtoReader reader) {
                PersonaDidvBlocker.PersonaId personaId;
                String str;
                String str2;
                PersonaDidvBlocker.PersonaId templateId;
                ?? decode;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                String str3 = null;
                PersonaDidvBlocker.PersonaId personaId2 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                Boolean bool = null;
                PersonaDidvBlocker.FlowType flowType = null;
                String str8 = null;
                Boolean bool2 = null;
                String str9 = null;
                Boolean bool3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PersonaDidvBlocker(personaId2, str3, str4, str5, str6, str7, bool, flowType, str8, bool2, str9, bool3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            templateId = new PersonaDidvBlocker.PersonaId.TemplateId((String) ProtoAdapter.STRING.decode(reader));
                            personaId2 = templateId;
                            decode = str3;
                            break;
                        case 2:
                            templateId = new PersonaDidvBlocker.PersonaId.TemplateVersion((String) ProtoAdapter.STRING.decode(reader));
                            personaId2 = templateId;
                            decode = str3;
                            break;
                        case 3:
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            str4 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 5:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 6:
                            str6 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 7:
                            str7 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 8:
                            bool = ProtoAdapter.BOOL.decode(reader);
                            decode = str3;
                            break;
                        case 9:
                            try {
                                flowType = PersonaDidvBlocker.FlowType.ADAPTER.decode(reader);
                                decode = str3;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                personaId = personaId2;
                                str = str4;
                                str2 = str5;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 10:
                            str8 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 11:
                            bool2 = ProtoAdapter.BOOL.decode(reader);
                            decode = str3;
                            break;
                        case 12:
                            str9 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 13:
                            bool3 = ProtoAdapter.BOOL.decode(reader);
                            decode = str3;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            personaId = personaId2;
                            str = str4;
                            str2 = str5;
                            decode = str3;
                            personaId2 = personaId;
                            str4 = str;
                            str5 = str2;
                            break;
                    }
                    str3 = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PersonaDidvBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                PersonaDidvBlocker.PersonaId personaId = value.persona_id;
                if (personaId instanceof PersonaDidvBlocker.PersonaId.TemplateId) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, ((PersonaDidvBlocker.PersonaId.TemplateId) personaId).getValue());
                } else if (personaId instanceof PersonaDidvBlocker.PersonaId.TemplateVersion) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, ((PersonaDidvBlocker.PersonaId.TemplateVersion) personaId).getValue());
                } else if (personaId != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 13, value.biometric_consent_collected);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 12, value.fallback_template_id);
                protoAdapter2.encodeWithTag(writer, 11, value.is_fallback_mode);
                protoAdapter3.encodeWithTag(writer, 10, value.flow_token);
                PersonaDidvBlocker.FlowType.ADAPTER.encodeWithTag(writer, 9, value.idv_flow_type);
                protoAdapter2.encodeWithTag(writer, 8, value.resolve_on_cancel);
                protoAdapter3.encodeWithTag(writer, 7, value.region);
                protoAdapter3.encodeWithTag(writer, 6, value.country_code);
                protoAdapter3.encodeWithTag(writer, 5, value.session_token);
                protoAdapter3.encodeWithTag(writer, 4, value.inquiry_id);
                protoAdapter3.encodeWithTag(writer, 3, value.reference_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PersonaDidvBlocker value) {
                int encodedSizeWithTag;
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                PersonaDidvBlocker.PersonaId personaId = value.persona_id;
                if (personaId instanceof PersonaDidvBlocker.PersonaId.TemplateId) {
                    encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, ((PersonaDidvBlocker.PersonaId.TemplateId) personaId).getValue());
                } else {
                    if (!(personaId instanceof PersonaDidvBlocker.PersonaId.TemplateVersion)) {
                        if (personaId != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(7, value.region) + protoAdapter2.encodedSizeWithTag(6, value.country_code) + protoAdapter2.encodedSizeWithTag(5, value.session_token) + protoAdapter2.encodedSizeWithTag(4, value.inquiry_id) + protoAdapter2.encodedSizeWithTag(3, value.reference_id) + size$okio;
                        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                        return protoAdapter3.encodedSizeWithTag(13, value.biometric_consent_collected) + protoAdapter2.encodedSizeWithTag(12, value.fallback_template_id) + protoAdapter3.encodedSizeWithTag(11, value.is_fallback_mode) + protoAdapter2.encodedSizeWithTag(10, value.flow_token) + PersonaDidvBlocker.FlowType.ADAPTER.encodedSizeWithTag(9, value.idv_flow_type) + protoAdapter3.encodedSizeWithTag(8, value.resolve_on_cancel) + encodedSizeWithTag2;
                    }
                    encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, ((PersonaDidvBlocker.PersonaId.TemplateVersion) personaId).getValue());
                }
                size$okio += encodedSizeWithTag;
                ProtoAdapter protoAdapter22 = ProtoAdapter.STRING;
                int encodedSizeWithTag22 = protoAdapter22.encodedSizeWithTag(7, value.region) + protoAdapter22.encodedSizeWithTag(6, value.country_code) + protoAdapter22.encodedSizeWithTag(5, value.session_token) + protoAdapter22.encodedSizeWithTag(4, value.inquiry_id) + protoAdapter22.encodedSizeWithTag(3, value.reference_id) + size$okio;
                ProtoAdapter protoAdapter32 = ProtoAdapter.BOOL;
                return protoAdapter32.encodedSizeWithTag(13, value.biometric_consent_collected) + protoAdapter22.encodedSizeWithTag(12, value.fallback_template_id) + protoAdapter32.encodedSizeWithTag(11, value.is_fallback_mode) + protoAdapter22.encodedSizeWithTag(10, value.flow_token) + PersonaDidvBlocker.FlowType.ADAPTER.encodedSizeWithTag(9, value.idv_flow_type) + protoAdapter32.encodedSizeWithTag(8, value.resolve_on_cancel) + encodedSizeWithTag22;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PersonaDidvBlocker redact(PersonaDidvBlocker value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                PersonaDidvBlocker.PersonaId personaId = value.persona_id;
                String str = value.reference_id;
                String str2 = value.inquiry_id;
                String str3 = value.session_token;
                String str4 = value.country_code;
                String str5 = value.region;
                Boolean bool = value.resolve_on_cancel;
                PersonaDidvBlocker.FlowType flowType = value.idv_flow_type;
                String str6 = value.flow_token;
                Boolean bool2 = value.is_fallback_mode;
                String str7 = value.fallback_template_id;
                Boolean bool3 = value.biometric_consent_collected;
                value.getClass();
                byteString.getClass();
                return new PersonaDidvBlocker(personaId, str, str2, str3, str4, str5, bool, flowType, str6, bool2, str7, bool3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PersonaDidvBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 3, value.reference_id);
                protoAdapter2.encodeWithTag(writer, 4, value.inquiry_id);
                protoAdapter2.encodeWithTag(writer, 5, value.session_token);
                protoAdapter2.encodeWithTag(writer, 6, value.country_code);
                protoAdapter2.encodeWithTag(writer, 7, value.region);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 8, value.resolve_on_cancel);
                PersonaDidvBlocker.FlowType.ADAPTER.encodeWithTag(writer, 9, value.idv_flow_type);
                protoAdapter2.encodeWithTag(writer, 10, value.flow_token);
                protoAdapter3.encodeWithTag(writer, 11, value.is_fallback_mode);
                protoAdapter2.encodeWithTag(writer, 12, value.fallback_template_id);
                protoAdapter3.encodeWithTag(writer, 13, value.biometric_consent_collected);
                PersonaDidvBlocker.PersonaId personaId = value.persona_id;
                if (personaId instanceof PersonaDidvBlocker.PersonaId.TemplateId) {
                    protoAdapter2.encodeWithTag(writer, 1, ((PersonaDidvBlocker.PersonaId.TemplateId) personaId).getValue());
                } else if (personaId instanceof PersonaDidvBlocker.PersonaId.TemplateVersion) {
                    protoAdapter2.encodeWithTag(writer, 2, ((PersonaDidvBlocker.PersonaId.TemplateVersion) personaId).getValue());
                } else if (personaId != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonaDidvBlocker(PersonaId personaId, String str, String str2, String str3, String str4, String str5, Boolean bool, FlowType flowType, String str6, Boolean bool2, String str7, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.persona_id = personaId;
        this.reference_id = str;
        this.inquiry_id = str2;
        this.session_token = str3;
        this.country_code = str4;
        this.region = str5;
        this.resolve_on_cancel = bool;
        this.idv_flow_type = flowType;
        this.flow_token = str6;
        this.is_fallback_mode = bool2;
        this.fallback_template_id = str7;
        this.biometric_consent_collected = bool3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersonaDidvBlocker)) {
            return false;
        }
        PersonaDidvBlocker personaDidvBlocker = (PersonaDidvBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), personaDidvBlocker.unknownFields()) && Intrinsics.areEqual(this.persona_id, personaDidvBlocker.persona_id) && Intrinsics.areEqual(this.reference_id, personaDidvBlocker.reference_id) && Intrinsics.areEqual(this.inquiry_id, personaDidvBlocker.inquiry_id) && Intrinsics.areEqual(this.session_token, personaDidvBlocker.session_token) && Intrinsics.areEqual(this.country_code, personaDidvBlocker.country_code) && Intrinsics.areEqual(this.region, personaDidvBlocker.region) && Intrinsics.areEqual(this.resolve_on_cancel, personaDidvBlocker.resolve_on_cancel) && this.idv_flow_type == personaDidvBlocker.idv_flow_type && Intrinsics.areEqual(this.flow_token, personaDidvBlocker.flow_token) && Intrinsics.areEqual(this.is_fallback_mode, personaDidvBlocker.is_fallback_mode) && Intrinsics.areEqual(this.fallback_template_id, personaDidvBlocker.fallback_template_id) && Intrinsics.areEqual(this.biometric_consent_collected, personaDidvBlocker.biometric_consent_collected);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PersonaId personaId = this.persona_id;
        int hashCode2 = (hashCode + (personaId != null ? personaId.hashCode() : 0)) * 37;
        String str = this.reference_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.inquiry_id;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.session_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.country_code;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.region;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Boolean bool = this.resolve_on_cancel;
        int hashCode8 = (hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        FlowType flowType = this.idv_flow_type;
        int hashCode9 = (hashCode8 + (flowType != null ? flowType.hashCode() : 0)) * 37;
        String str6 = this.flow_token;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_fallback_mode;
        int hashCode11 = (hashCode10 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str7 = this.fallback_template_id;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Boolean bool3 = this.biometric_consent_collected;
        int hashCode13 = hashCode12 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.persona_id = this.persona_id;
        builder.reference_id = this.reference_id;
        builder.inquiry_id = this.inquiry_id;
        builder.session_token = this.session_token;
        builder.country_code = this.country_code;
        builder.region = this.region;
        builder.resolve_on_cancel = this.resolve_on_cancel;
        builder.idv_flow_type = this.idv_flow_type;
        builder.flow_token = this.flow_token;
        builder.is_fallback_mode = this.is_fallback_mode;
        builder.fallback_template_id = this.fallback_template_id;
        builder.biometric_consent_collected = this.biometric_consent_collected;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PersonaId personaId = this.persona_id;
        if (personaId != null) {
            arrayList.add("persona_id=" + personaId);
        }
        String str = this.reference_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "reference_id=", arrayList);
        }
        String str2 = this.inquiry_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "inquiry_id=", arrayList);
        }
        String str3 = this.session_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "session_token=", arrayList);
        }
        String str4 = this.country_code;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "country_code=", arrayList);
        }
        String str5 = this.region;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "region=", arrayList);
        }
        Boolean bool = this.resolve_on_cancel;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("resolve_on_cancel=", bool, arrayList);
        }
        FlowType flowType = this.idv_flow_type;
        if (flowType != null) {
            arrayList.add("idv_flow_type=" + flowType);
        }
        String str6 = this.flow_token;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "flow_token=", arrayList);
        }
        Boolean bool2 = this.is_fallback_mode;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_fallback_mode=", bool2, arrayList);
        }
        String str7 = this.fallback_template_id;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "fallback_template_id=", arrayList);
        }
        Boolean bool3 = this.biometric_consent_collected;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("biometric_consent_collected=", bool3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PersonaDidvBlocker{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$FlowType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INVALID", "DIDV", "DIDV_REFRESH", "CONFIRM_IDENTITY", "LIVENESS_VERIFICATION", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class FlowType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FlowType[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final FlowType CONFIRM_IDENTITY;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final FlowType DIDV;
        public static final FlowType DIDV_REFRESH;
        public static final FlowType INVALID;
        public static final FlowType LIVENESS_VERIFICATION;
        private final int value;

        private static final /* synthetic */ FlowType[] $values() {
            return new FlowType[]{INVALID, DIDV, DIDV_REFRESH, CONFIRM_IDENTITY, LIVENESS_VERIFICATION};
        }

        static {
            final FlowType flowType = new FlowType("INVALID", 0, 0);
            INVALID = flowType;
            DIDV = new FlowType("DIDV", 1, 1);
            DIDV_REFRESH = new FlowType("DIDV_REFRESH", 2, 2);
            CONFIRM_IDENTITY = new FlowType("CONFIRM_IDENTITY", 3, 3);
            LIVENESS_VERIFICATION = new FlowType("LIVENESS_VERIFICATION", 4, 5);
            FlowType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FlowType.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, flowType) { // from class: com.squareup.protos.franklin.blockers.PersonaDidvBlocker$FlowType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PersonaDidvBlocker.FlowType fromValue(int value) {
                    return PersonaDidvBlocker.FlowType.INSTANCE.fromValue(value);
                }
            };
        }

        private FlowType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final FlowType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static FlowType valueOf(String str) {
            return (FlowType) Enum.valueOf(FlowType.class, str);
        }

        public static FlowType[] values() {
            return (FlowType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$FlowType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$FlowType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FlowType fromValue(int value) {
                if (value == 0) {
                    return FlowType.INVALID;
                }
                if (value == 1) {
                    return FlowType.DIDV;
                }
                if (value == 2) {
                    return FlowType.DIDV_REFRESH;
                }
                if (value == 3) {
                    return FlowType.CONFIRM_IDENTITY;
                }
                if (value != 5) {
                    return null;
                }
                return FlowType.LIVENESS_VERIFICATION;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker;", "", "DEFAULT_IS_FALLBACK_MODE", "Z", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PersonaDidvBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$PersonaId;", "", "<init>", "()V", "TemplateId", "TemplateVersion", "Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$PersonaId$TemplateId;", "Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$PersonaId$TemplateVersion;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static abstract class PersonaId {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$PersonaId$TemplateId;", "Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$PersonaId;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "template_id", tag = 1)
        @Deprecated
        public static final /* data */ class TemplateId extends PersonaId {
            private final String value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TemplateId(String str) {
                super(null);
                str.getClass();
                this.value = str;
            }

            public static /* synthetic */ TemplateId copy$default(TemplateId templateId, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = templateId.value;
                }
                return templateId.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final TemplateId copy(String value) {
                value.getClass();
                return new TemplateId(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TemplateId) && Intrinsics.areEqual(this.value, ((TemplateId) other).value);
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TemplateId(value=", this.value, ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$PersonaId$TemplateVersion;", "Lcom/squareup/protos/franklin/blockers/PersonaDidvBlocker$PersonaId;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "template_version", tag = 2)
        @Deprecated
        public static final /* data */ class TemplateVersion extends PersonaId {
            private final String value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TemplateVersion(String str) {
                super(null);
                str.getClass();
                this.value = str;
            }

            public static /* synthetic */ TemplateVersion copy$default(TemplateVersion templateVersion, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = templateVersion.value;
                }
                return templateVersion.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final TemplateVersion copy(String value) {
                value.getClass();
                return new TemplateVersion(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TemplateVersion) && Intrinsics.areEqual(this.value, ((TemplateVersion) other).value);
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TemplateVersion(value=", this.value, ")");
            }
        }

        public /* synthetic */ PersonaId(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PersonaId() {
        }
    }
}
