package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.PhonePlanESimCheckBlocker;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u001a\u001b\u0019\u001c\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$Builder;", "", "title", "Ljava/lang/String;", "description", "", "loading_duration_ms", "Ljava/lang/Long;", "esim_supported_title", "esim_supported_description", "esim_supported_action", "confirmed_duration_ms", "esim_unsupported_title", "esim_unsupported_description", "esim_unsupported_primary_button_text", "esim_unsupported_primary_action", "esim_unsupported_secondary_button_text", "esim_unsupported_secondary_action", "get_help_button_text", "get_help_action", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$CompatibilityCheckMethod;", "compatibility_check_method", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$CompatibilityCheckMethod;", "Companion", "Builder", "CompatibilityCheckMethod", "PlatformESimCheck", "IOSDeviceModelPredicate", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PhonePlanESimCheckBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PhonePlanESimCheckBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 15)
    public final CompatibilityCheckMethod compatibility_check_method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 6, tag = 7)
    public final Long confirmed_duration_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 3)
    public final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 9)
    public final String esim_supported_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 8)
    public final String esim_supported_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String esim_supported_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 6)
    public final String esim_unsupported_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 11)
    public final String esim_unsupported_primary_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
    public final String esim_unsupported_primary_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 12, tag = 13)
    public final String esim_unsupported_secondary_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 12)
    public final String esim_unsupported_secondary_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 5)
    public final String esim_unsupported_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 14, tag = 15)
    public final String get_help_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 13, tag = 14)
    public final String get_help_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 2, tag = 2)
    public final Long loading_duration_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0019J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0019J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker;", "<init>", "()V", "title", "", "description", "loading_duration_ms", "", "Ljava/lang/Long;", "esim_supported_title", "esim_supported_description", "esim_supported_action", "confirmed_duration_ms", "esim_unsupported_title", "esim_unsupported_description", "esim_unsupported_primary_button_text", "esim_unsupported_primary_action", "esim_unsupported_secondary_button_text", "esim_unsupported_secondary_action", "get_help_button_text", "get_help_action", "compatibility_check_method", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$CompatibilityCheckMethod;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public CompatibilityCheckMethod compatibility_check_method;
        public Long confirmed_duration_ms;
        public String description;
        public String esim_supported_action;
        public String esim_supported_description;
        public String esim_supported_title;
        public String esim_unsupported_description;
        public String esim_unsupported_primary_action;
        public String esim_unsupported_primary_button_text;
        public String esim_unsupported_secondary_action;
        public String esim_unsupported_secondary_button_text;
        public String esim_unsupported_title;
        public String get_help_action;
        public String get_help_button_text;
        public Long loading_duration_ms;
        public String title;

        @Override // com.squareup.wire.Message.Builder
        public PhonePlanESimCheckBlocker build() {
            return new PhonePlanESimCheckBlocker(this.title, this.description, this.loading_duration_ms, this.esim_supported_title, this.esim_supported_description, this.esim_supported_action, this.confirmed_duration_ms, this.esim_unsupported_title, this.esim_unsupported_description, this.esim_unsupported_primary_button_text, this.esim_unsupported_primary_action, this.esim_unsupported_secondary_button_text, this.esim_unsupported_secondary_action, this.get_help_button_text, this.get_help_action, this.compatibility_check_method, buildUnknownFields());
        }

        public final Builder compatibility_check_method(CompatibilityCheckMethod compatibility_check_method) {
            this.compatibility_check_method = compatibility_check_method;
            return this;
        }

        public final Builder confirmed_duration_ms(Long confirmed_duration_ms) {
            this.confirmed_duration_ms = confirmed_duration_ms;
            return this;
        }

        public final Builder description(String description) {
            this.description = description;
            return this;
        }

        public final Builder esim_supported_action(String esim_supported_action) {
            this.esim_supported_action = esim_supported_action;
            return this;
        }

        public final Builder esim_supported_description(String esim_supported_description) {
            this.esim_supported_description = esim_supported_description;
            return this;
        }

        public final Builder esim_supported_title(String esim_supported_title) {
            this.esim_supported_title = esim_supported_title;
            return this;
        }

        public final Builder esim_unsupported_description(String esim_unsupported_description) {
            this.esim_unsupported_description = esim_unsupported_description;
            return this;
        }

        public final Builder esim_unsupported_primary_action(String esim_unsupported_primary_action) {
            this.esim_unsupported_primary_action = esim_unsupported_primary_action;
            return this;
        }

        public final Builder esim_unsupported_primary_button_text(String esim_unsupported_primary_button_text) {
            this.esim_unsupported_primary_button_text = esim_unsupported_primary_button_text;
            return this;
        }

        public final Builder esim_unsupported_secondary_action(String esim_unsupported_secondary_action) {
            this.esim_unsupported_secondary_action = esim_unsupported_secondary_action;
            return this;
        }

        public final Builder esim_unsupported_secondary_button_text(String esim_unsupported_secondary_button_text) {
            this.esim_unsupported_secondary_button_text = esim_unsupported_secondary_button_text;
            return this;
        }

        public final Builder esim_unsupported_title(String esim_unsupported_title) {
            this.esim_unsupported_title = esim_unsupported_title;
            return this;
        }

        public final Builder get_help_action(String get_help_action) {
            this.get_help_action = get_help_action;
            return this;
        }

        public final Builder get_help_button_text(String get_help_button_text) {
            this.get_help_button_text = get_help_button_text;
            return this;
        }

        public final Builder loading_duration_ms(Long loading_duration_ms) {
            this.loading_duration_ms = loading_duration_ms;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PhonePlanESimCheckBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PhonePlanESimCheckBlocker$Companion$ADAPTER$1
            /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0028. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public PhonePlanESimCheckBlocker decode(ProtoReader reader) {
                PhonePlanESimCheckBlocker.CompatibilityCheckMethod platformApi;
                Object obj;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                Object obj12 = null;
                Object obj13 = null;
                Object obj14 = null;
                Object obj15 = null;
                Object obj16 = null;
                PhonePlanESimCheckBlocker.CompatibilityCheckMethod compatibilityCheckMethod = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    Object obj17 = obj3;
                    if (nextTag == -1) {
                        return new PhonePlanESimCheckBlocker((String) obj2, (String) obj17, (Long) obj4, (String) obj5, (String) obj6, (String) obj7, (Long) obj8, (String) obj9, (String) obj10, (String) obj11, (String) obj12, (String) obj13, (String) obj14, (String) obj15, (String) obj16, compatibilityCheckMethod, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj17;
                            break;
                        case 2:
                            obj4 = ProtoAdapter.INT64.decode(reader);
                            obj3 = obj17;
                            obj = obj2;
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            obj = obj2;
                            break;
                        case 4:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj17;
                            obj = obj2;
                            break;
                        case 5:
                            obj9 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj17;
                            obj = obj2;
                            break;
                        case 6:
                            obj10 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj17;
                            obj = obj2;
                            break;
                        case 7:
                            obj8 = ProtoAdapter.INT64.decode(reader);
                            obj3 = obj17;
                            obj = obj2;
                            break;
                        case 8:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj17;
                            obj = obj2;
                            break;
                        case 9:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj17;
                            obj = obj2;
                            break;
                        case 10:
                            obj11 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj17;
                            obj = obj2;
                            break;
                        case 11:
                            obj12 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj17;
                            obj = obj2;
                            break;
                        case 12:
                            obj13 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj17;
                            obj = obj2;
                            break;
                        case 13:
                            obj14 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj17;
                            obj = obj2;
                            break;
                        case 14:
                            obj15 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj17;
                            obj = obj2;
                            break;
                        case 15:
                            obj16 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj17;
                            obj = obj2;
                            break;
                        case 16:
                            platformApi = new PhonePlanESimCheckBlocker.CompatibilityCheckMethod.PlatformApi((PhonePlanESimCheckBlocker.PlatformESimCheck) PhonePlanESimCheckBlocker.PlatformESimCheck.ADAPTER.decode(reader));
                            compatibilityCheckMethod = platformApi;
                            obj3 = obj17;
                            obj = obj2;
                            break;
                        case 17:
                            platformApi = new PhonePlanESimCheckBlocker.CompatibilityCheckMethod.IosDeviceModelPredicate((PhonePlanESimCheckBlocker.IOSDeviceModelPredicate) PhonePlanESimCheckBlocker.IOSDeviceModelPredicate.ADAPTER.decode(reader));
                            compatibilityCheckMethod = platformApi;
                            obj3 = obj17;
                            obj = obj2;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj2;
                            obj3 = obj17;
                            break;
                    }
                    obj2 = obj;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PhonePlanESimCheckBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                protoAdapter2.encodeWithTag(writer, 3, value.description);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                protoAdapter3.encodeWithTag(writer, 2, value.loading_duration_ms);
                protoAdapter2.encodeWithTag(writer, 4, value.esim_supported_title);
                protoAdapter2.encodeWithTag(writer, 8, value.esim_supported_description);
                protoAdapter2.encodeWithTag(writer, 9, value.esim_supported_action);
                protoAdapter3.encodeWithTag(writer, 7, value.confirmed_duration_ms);
                protoAdapter2.encodeWithTag(writer, 5, value.esim_unsupported_title);
                protoAdapter2.encodeWithTag(writer, 6, value.esim_unsupported_description);
                protoAdapter2.encodeWithTag(writer, 10, value.esim_unsupported_primary_button_text);
                protoAdapter2.encodeWithTag(writer, 11, value.esim_unsupported_primary_action);
                protoAdapter2.encodeWithTag(writer, 12, value.esim_unsupported_secondary_button_text);
                protoAdapter2.encodeWithTag(writer, 13, value.esim_unsupported_secondary_action);
                protoAdapter2.encodeWithTag(writer, 14, value.get_help_button_text);
                protoAdapter2.encodeWithTag(writer, 15, value.get_help_action);
                PhonePlanESimCheckBlocker.CompatibilityCheckMethod compatibilityCheckMethod = value.compatibility_check_method;
                if (compatibilityCheckMethod instanceof PhonePlanESimCheckBlocker.CompatibilityCheckMethod.PlatformApi) {
                    PhonePlanESimCheckBlocker.PlatformESimCheck.ADAPTER.encodeWithTag(writer, 16, ((PhonePlanESimCheckBlocker.CompatibilityCheckMethod.PlatformApi) compatibilityCheckMethod).getValue());
                } else if (compatibilityCheckMethod instanceof PhonePlanESimCheckBlocker.CompatibilityCheckMethod.IosDeviceModelPredicate) {
                    PhonePlanESimCheckBlocker.IOSDeviceModelPredicate.ADAPTER.encodeWithTag(writer, 17, ((PhonePlanESimCheckBlocker.CompatibilityCheckMethod.IosDeviceModelPredicate) compatibilityCheckMethod).getValue());
                } else if (compatibilityCheckMethod != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PhonePlanESimCheckBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(3, value.description) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(15, value.get_help_action) + protoAdapter2.encodedSizeWithTag(14, value.get_help_button_text) + protoAdapter2.encodedSizeWithTag(13, value.esim_unsupported_secondary_action) + protoAdapter2.encodedSizeWithTag(12, value.esim_unsupported_secondary_button_text) + protoAdapter2.encodedSizeWithTag(11, value.esim_unsupported_primary_action) + protoAdapter2.encodedSizeWithTag(10, value.esim_unsupported_primary_button_text) + protoAdapter2.encodedSizeWithTag(6, value.esim_unsupported_description) + protoAdapter2.encodedSizeWithTag(5, value.esim_unsupported_title) + protoAdapter3.encodedSizeWithTag(7, value.confirmed_duration_ms) + protoAdapter2.encodedSizeWithTag(9, value.esim_supported_action) + protoAdapter2.encodedSizeWithTag(8, value.esim_supported_description) + protoAdapter2.encodedSizeWithTag(4, value.esim_supported_title) + protoAdapter3.encodedSizeWithTag(2, value.loading_duration_ms) + encodedSizeWithTag;
                PhonePlanESimCheckBlocker.CompatibilityCheckMethod compatibilityCheckMethod = value.compatibility_check_method;
                if (compatibilityCheckMethod instanceof PhonePlanESimCheckBlocker.CompatibilityCheckMethod.PlatformApi) {
                    return PhonePlanESimCheckBlocker.PlatformESimCheck.ADAPTER.encodedSizeWithTag(16, ((PhonePlanESimCheckBlocker.CompatibilityCheckMethod.PlatformApi) compatibilityCheckMethod).getValue()) + encodedSizeWithTag2;
                }
                if (compatibilityCheckMethod instanceof PhonePlanESimCheckBlocker.CompatibilityCheckMethod.IosDeviceModelPredicate) {
                    return PhonePlanESimCheckBlocker.IOSDeviceModelPredicate.ADAPTER.encodedSizeWithTag(17, ((PhonePlanESimCheckBlocker.CompatibilityCheckMethod.IosDeviceModelPredicate) compatibilityCheckMethod).getValue()) + encodedSizeWithTag2;
                }
                if (compatibilityCheckMethod == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PhonePlanESimCheckBlocker redact(PhonePlanESimCheckBlocker value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.description;
                Long l = value.loading_duration_ms;
                String str3 = value.esim_supported_title;
                String str4 = value.esim_supported_description;
                String str5 = value.esim_supported_action;
                Long l2 = value.confirmed_duration_ms;
                String str6 = value.esim_unsupported_title;
                String str7 = value.esim_unsupported_description;
                String str8 = value.esim_unsupported_primary_button_text;
                String str9 = value.esim_unsupported_primary_action;
                String str10 = value.esim_unsupported_secondary_button_text;
                String str11 = value.esim_unsupported_secondary_action;
                String str12 = value.get_help_button_text;
                String str13 = value.get_help_action;
                PhonePlanESimCheckBlocker.CompatibilityCheckMethod compatibilityCheckMethod = value.compatibility_check_method;
                value.getClass();
                byteString.getClass();
                return new PhonePlanESimCheckBlocker(str, str2, l, str3, str4, str5, l2, str6, str7, str8, str9, str10, str11, str12, str13, compatibilityCheckMethod, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PhonePlanESimCheckBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                PhonePlanESimCheckBlocker.CompatibilityCheckMethod compatibilityCheckMethod = value.compatibility_check_method;
                if (compatibilityCheckMethod instanceof PhonePlanESimCheckBlocker.CompatibilityCheckMethod.PlatformApi) {
                    PhonePlanESimCheckBlocker.PlatformESimCheck.ADAPTER.encodeWithTag(writer, 16, ((PhonePlanESimCheckBlocker.CompatibilityCheckMethod.PlatformApi) compatibilityCheckMethod).getValue());
                } else if (compatibilityCheckMethod instanceof PhonePlanESimCheckBlocker.CompatibilityCheckMethod.IosDeviceModelPredicate) {
                    PhonePlanESimCheckBlocker.IOSDeviceModelPredicate.ADAPTER.encodeWithTag(writer, 17, ((PhonePlanESimCheckBlocker.CompatibilityCheckMethod.IosDeviceModelPredicate) compatibilityCheckMethod).getValue());
                } else if (compatibilityCheckMethod != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 15, value.get_help_action);
                protoAdapter2.encodeWithTag(writer, 14, value.get_help_button_text);
                protoAdapter2.encodeWithTag(writer, 13, value.esim_unsupported_secondary_action);
                protoAdapter2.encodeWithTag(writer, 12, value.esim_unsupported_secondary_button_text);
                protoAdapter2.encodeWithTag(writer, 11, value.esim_unsupported_primary_action);
                protoAdapter2.encodeWithTag(writer, 10, value.esim_unsupported_primary_button_text);
                protoAdapter2.encodeWithTag(writer, 6, value.esim_unsupported_description);
                protoAdapter2.encodeWithTag(writer, 5, value.esim_unsupported_title);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                protoAdapter3.encodeWithTag(writer, 7, value.confirmed_duration_ms);
                protoAdapter2.encodeWithTag(writer, 9, value.esim_supported_action);
                protoAdapter2.encodeWithTag(writer, 8, value.esim_supported_description);
                protoAdapter2.encodeWithTag(writer, 4, value.esim_supported_title);
                protoAdapter3.encodeWithTag(writer, 2, value.loading_duration_ms);
                protoAdapter2.encodeWithTag(writer, 3, value.description);
                protoAdapter2.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhonePlanESimCheckBlocker(String str, String str2, Long l, String str3, String str4, String str5, Long l2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, CompatibilityCheckMethod compatibilityCheckMethod, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.description = str2;
        this.loading_duration_ms = l;
        this.esim_supported_title = str3;
        this.esim_supported_description = str4;
        this.esim_supported_action = str5;
        this.confirmed_duration_ms = l2;
        this.esim_unsupported_title = str6;
        this.esim_unsupported_description = str7;
        this.esim_unsupported_primary_button_text = str8;
        this.esim_unsupported_primary_action = str9;
        this.esim_unsupported_secondary_button_text = str10;
        this.esim_unsupported_secondary_action = str11;
        this.get_help_button_text = str12;
        this.get_help_action = str13;
        this.compatibility_check_method = compatibilityCheckMethod;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhonePlanESimCheckBlocker)) {
            return false;
        }
        PhonePlanESimCheckBlocker phonePlanESimCheckBlocker = (PhonePlanESimCheckBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), phonePlanESimCheckBlocker.unknownFields()) && Intrinsics.areEqual(this.title, phonePlanESimCheckBlocker.title) && Intrinsics.areEqual(this.description, phonePlanESimCheckBlocker.description) && Intrinsics.areEqual(this.loading_duration_ms, phonePlanESimCheckBlocker.loading_duration_ms) && Intrinsics.areEqual(this.esim_supported_title, phonePlanESimCheckBlocker.esim_supported_title) && Intrinsics.areEqual(this.esim_supported_description, phonePlanESimCheckBlocker.esim_supported_description) && Intrinsics.areEqual(this.esim_supported_action, phonePlanESimCheckBlocker.esim_supported_action) && Intrinsics.areEqual(this.confirmed_duration_ms, phonePlanESimCheckBlocker.confirmed_duration_ms) && Intrinsics.areEqual(this.esim_unsupported_title, phonePlanESimCheckBlocker.esim_unsupported_title) && Intrinsics.areEqual(this.esim_unsupported_description, phonePlanESimCheckBlocker.esim_unsupported_description) && Intrinsics.areEqual(this.esim_unsupported_primary_button_text, phonePlanESimCheckBlocker.esim_unsupported_primary_button_text) && Intrinsics.areEqual(this.esim_unsupported_primary_action, phonePlanESimCheckBlocker.esim_unsupported_primary_action) && Intrinsics.areEqual(this.esim_unsupported_secondary_button_text, phonePlanESimCheckBlocker.esim_unsupported_secondary_button_text) && Intrinsics.areEqual(this.esim_unsupported_secondary_action, phonePlanESimCheckBlocker.esim_unsupported_secondary_action) && Intrinsics.areEqual(this.get_help_button_text, phonePlanESimCheckBlocker.get_help_button_text) && Intrinsics.areEqual(this.get_help_action, phonePlanESimCheckBlocker.get_help_action) && Intrinsics.areEqual(this.compatibility_check_method, phonePlanESimCheckBlocker.compatibility_check_method);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.loading_duration_ms;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str3 = this.esim_supported_title;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.esim_supported_description;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.esim_supported_action;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Long l2 = this.confirmed_duration_ms;
        int hashCode8 = (hashCode7 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str6 = this.esim_unsupported_title;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.esim_unsupported_description;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.esim_unsupported_primary_button_text;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.esim_unsupported_primary_action;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.esim_unsupported_secondary_button_text;
        int hashCode13 = (hashCode12 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.esim_unsupported_secondary_action;
        int hashCode14 = (hashCode13 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.get_help_button_text;
        int hashCode15 = (hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.get_help_action;
        int hashCode16 = (hashCode15 + (str13 != null ? str13.hashCode() : 0)) * 37;
        CompatibilityCheckMethod compatibilityCheckMethod = this.compatibility_check_method;
        int hashCode17 = hashCode16 + (compatibilityCheckMethod != null ? compatibilityCheckMethod.hashCode() : 0);
        this.hashCode = hashCode17;
        return hashCode17;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.description = this.description;
        builder.loading_duration_ms = this.loading_duration_ms;
        builder.esim_supported_title = this.esim_supported_title;
        builder.esim_supported_description = this.esim_supported_description;
        builder.esim_supported_action = this.esim_supported_action;
        builder.confirmed_duration_ms = this.confirmed_duration_ms;
        builder.esim_unsupported_title = this.esim_unsupported_title;
        builder.esim_unsupported_description = this.esim_unsupported_description;
        builder.esim_unsupported_primary_button_text = this.esim_unsupported_primary_button_text;
        builder.esim_unsupported_primary_action = this.esim_unsupported_primary_action;
        builder.esim_unsupported_secondary_button_text = this.esim_unsupported_secondary_button_text;
        builder.esim_unsupported_secondary_action = this.esim_unsupported_secondary_action;
        builder.get_help_button_text = this.get_help_button_text;
        builder.get_help_action = this.get_help_action;
        builder.compatibility_check_method = this.compatibility_check_method;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        Long l = this.loading_duration_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("loading_duration_ms=", l, arrayList);
        }
        String str3 = this.esim_supported_title;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "esim_supported_title=", arrayList);
        }
        String str4 = this.esim_supported_description;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "esim_supported_description=", arrayList);
        }
        String str5 = this.esim_supported_action;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "esim_supported_action=", arrayList);
        }
        Long l2 = this.confirmed_duration_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("confirmed_duration_ms=", l2, arrayList);
        }
        String str6 = this.esim_unsupported_title;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "esim_unsupported_title=", arrayList);
        }
        String str7 = this.esim_unsupported_description;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "esim_unsupported_description=", arrayList);
        }
        String str8 = this.esim_unsupported_primary_button_text;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "esim_unsupported_primary_button_text=", arrayList);
        }
        String str9 = this.esim_unsupported_primary_action;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "esim_unsupported_primary_action=", arrayList);
        }
        String str10 = this.esim_unsupported_secondary_button_text;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "esim_unsupported_secondary_button_text=", arrayList);
        }
        String str11 = this.esim_unsupported_secondary_action;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "esim_unsupported_secondary_action=", arrayList);
        }
        String str12 = this.get_help_button_text;
        if (str12 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str12, "get_help_button_text=", arrayList);
        }
        String str13 = this.get_help_action;
        if (str13 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str13, "get_help_action=", arrayList);
        }
        CompatibilityCheckMethod compatibilityCheckMethod = this.compatibility_check_method;
        if (compatibilityCheckMethod != null) {
            arrayList.add("compatibility_check_method=" + compatibilityCheckMethod);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PhonePlanESimCheckBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0006H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0014R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$IOSDeviceModelPredicate;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$IOSDeviceModelPredicate$Builder;", "model_family", "", "minimum_major_version", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lokio/ByteString;)V", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$IOSDeviceModelPredicate;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class IOSDeviceModelPredicate extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<IOSDeviceModelPredicate> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 1, tag = 2)
        public final Integer minimum_major_version;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String model_family;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$IOSDeviceModelPredicate$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$IOSDeviceModelPredicate;", "<init>", "()V", "model_family", "", "minimum_major_version", "", "Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$IOSDeviceModelPredicate$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Integer minimum_major_version;
            public String model_family;

            @Override // com.squareup.wire.Message.Builder
            public IOSDeviceModelPredicate build() {
                return new IOSDeviceModelPredicate(this.model_family, this.minimum_major_version, buildUnknownFields());
            }

            public final Builder minimum_major_version(Integer minimum_major_version) {
                this.minimum_major_version = minimum_major_version;
                return this;
            }

            public final Builder model_family(String model_family) {
                this.model_family = model_family;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(IOSDeviceModelPredicate.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PhonePlanESimCheckBlocker$IOSDeviceModelPredicate$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PhonePlanESimCheckBlocker.IOSDeviceModelPredicate decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PhonePlanESimCheckBlocker.IOSDeviceModelPredicate((String) obj, (Integer) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.UINT32.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PhonePlanESimCheckBlocker.IOSDeviceModelPredicate value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.model_family);
                    ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.minimum_major_version);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PhonePlanESimCheckBlocker.IOSDeviceModelPredicate value) {
                    value.getClass();
                    return ProtoAdapter.UINT32.encodedSizeWithTag(2, value.minimum_major_version) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.model_family) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PhonePlanESimCheckBlocker.IOSDeviceModelPredicate redact(PhonePlanESimCheckBlocker.IOSDeviceModelPredicate value) {
                    value.getClass();
                    return PhonePlanESimCheckBlocker.IOSDeviceModelPredicate.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PhonePlanESimCheckBlocker.IOSDeviceModelPredicate value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.minimum_major_version);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.model_family);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ IOSDeviceModelPredicate(String str, Integer num, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ IOSDeviceModelPredicate copy$default(IOSDeviceModelPredicate iOSDeviceModelPredicate, String str, Integer num, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = iOSDeviceModelPredicate.model_family;
            }
            if ((i & 2) != 0) {
                num = iOSDeviceModelPredicate.minimum_major_version;
            }
            if ((i & 4) != 0) {
                byteString = iOSDeviceModelPredicate.unknownFields();
            }
            return iOSDeviceModelPredicate.copy(str, num, byteString);
        }

        public final IOSDeviceModelPredicate copy(String model_family, Integer minimum_major_version, ByteString unknownFields) {
            unknownFields.getClass();
            return new IOSDeviceModelPredicate(model_family, minimum_major_version, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof IOSDeviceModelPredicate)) {
                return false;
            }
            IOSDeviceModelPredicate iOSDeviceModelPredicate = (IOSDeviceModelPredicate) other;
            return Intrinsics.areEqual(unknownFields(), iOSDeviceModelPredicate.unknownFields()) && Intrinsics.areEqual(this.model_family, iOSDeviceModelPredicate.model_family) && Intrinsics.areEqual(this.minimum_major_version, iOSDeviceModelPredicate.minimum_major_version);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.model_family;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Integer num = this.minimum_major_version;
            int hashCode3 = hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.model_family = this.model_family;
            builder.minimum_major_version = this.minimum_major_version;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.model_family;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "model_family=", arrayList);
            }
            Integer num = this.minimum_major_version;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("minimum_major_version=", num, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "IOSDeviceModelPredicate{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$IOSDeviceModelPredicate$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$IOSDeviceModelPredicate$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$IOSDeviceModelPredicate;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$IOSDeviceModelPredicate;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ IOSDeviceModelPredicate build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public IOSDeviceModelPredicate() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IOSDeviceModelPredicate(String str, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.model_family = str;
            this.minimum_major_version = num;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$PlatformESimCheck;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$PlatformESimCheck$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class PlatformESimCheck extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PlatformESimCheck> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$PlatformESimCheck$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$PlatformESimCheck;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            @Override // com.squareup.wire.Message.Builder
            public PlatformESimCheck build() {
                return new PlatformESimCheck(buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PlatformESimCheck.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PhonePlanESimCheckBlocker$PlatformESimCheck$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PhonePlanESimCheckBlocker.PlatformESimCheck decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PhonePlanESimCheckBlocker.PlatformESimCheck(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PhonePlanESimCheckBlocker.PlatformESimCheck value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PhonePlanESimCheckBlocker.PlatformESimCheck value) {
                    value.getClass();
                    return value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PhonePlanESimCheckBlocker.PlatformESimCheck redact(PhonePlanESimCheckBlocker.PlatformESimCheck value) {
                    value.getClass();
                    return value.copy(ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PhonePlanESimCheckBlocker.PlatformESimCheck value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ PlatformESimCheck(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ PlatformESimCheck copy$default(PlatformESimCheck platformESimCheck, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = platformESimCheck.unknownFields();
            }
            return platformESimCheck.copy(byteString);
        }

        public final PlatformESimCheck copy(ByteString unknownFields) {
            unknownFields.getClass();
            return new PlatformESimCheck(unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof PlatformESimCheck) && Intrinsics.areEqual(unknownFields(), ((PlatformESimCheck) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            return "PlatformESimCheck{}";
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$PlatformESimCheck$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$PlatformESimCheck$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$PlatformESimCheck;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$PlatformESimCheck;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ PlatformESimCheck build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PlatformESimCheck() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlatformESimCheck(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PhonePlanESimCheckBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$CompatibilityCheckMethod;", "", "<init>", "()V", "PlatformApi", "IosDeviceModelPredicate", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$CompatibilityCheckMethod$IosDeviceModelPredicate;", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$CompatibilityCheckMethod$PlatformApi;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static abstract class CompatibilityCheckMethod {

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.PhonePlanESimCheckBlocker$IOSDeviceModelPredicate#ADAPTER", declaredName = "ios_device_model_predicate", tag = 17)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$CompatibilityCheckMethod$IosDeviceModelPredicate;", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$CompatibilityCheckMethod;", "value", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$IOSDeviceModelPredicate;", "<init>", "(Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$IOSDeviceModelPredicate;)V", "getValue", "()Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$IOSDeviceModelPredicate;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class IosDeviceModelPredicate extends CompatibilityCheckMethod {
            private final IOSDeviceModelPredicate value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IosDeviceModelPredicate(IOSDeviceModelPredicate iOSDeviceModelPredicate) {
                super(null);
                iOSDeviceModelPredicate.getClass();
                this.value = iOSDeviceModelPredicate;
            }

            public static /* synthetic */ IosDeviceModelPredicate copy$default(IosDeviceModelPredicate iosDeviceModelPredicate, IOSDeviceModelPredicate iOSDeviceModelPredicate, int i, Object obj) {
                if ((i & 1) != 0) {
                    iOSDeviceModelPredicate = iosDeviceModelPredicate.value;
                }
                return iosDeviceModelPredicate.copy(iOSDeviceModelPredicate);
            }

            /* renamed from: component1, reason: from getter */
            public final IOSDeviceModelPredicate getValue() {
                return this.value;
            }

            public final IosDeviceModelPredicate copy(IOSDeviceModelPredicate value) {
                value.getClass();
                return new IosDeviceModelPredicate(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IosDeviceModelPredicate) && Intrinsics.areEqual(this.value, ((IosDeviceModelPredicate) other).value);
            }

            public final IOSDeviceModelPredicate getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "IosDeviceModelPredicate(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.PhonePlanESimCheckBlocker$PlatformESimCheck#ADAPTER", declaredName = "platform_api", tag = 16)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$CompatibilityCheckMethod$PlatformApi;", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$CompatibilityCheckMethod;", "value", "Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$PlatformESimCheck;", "<init>", "(Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$PlatformESimCheck;)V", "getValue", "()Lcom/squareup/protos/franklin/api/PhonePlanESimCheckBlocker$PlatformESimCheck;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PlatformApi extends CompatibilityCheckMethod {
            private final PlatformESimCheck value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlatformApi(PlatformESimCheck platformESimCheck) {
                super(null);
                platformESimCheck.getClass();
                this.value = platformESimCheck;
            }

            public static /* synthetic */ PlatformApi copy$default(PlatformApi platformApi, PlatformESimCheck platformESimCheck, int i, Object obj) {
                if ((i & 1) != 0) {
                    platformESimCheck = platformApi.value;
                }
                return platformApi.copy(platformESimCheck);
            }

            /* renamed from: component1, reason: from getter */
            public final PlatformESimCheck getValue() {
                return this.value;
            }

            public final PlatformApi copy(PlatformESimCheck value) {
                value.getClass();
                return new PlatformApi(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlatformApi) && Intrinsics.areEqual(this.value, ((PlatformApi) other).value);
            }

            public final PlatformESimCheck getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PlatformApi(value=" + this.value + ")";
            }
        }

        public /* synthetic */ CompatibilityCheckMethod(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CompatibilityCheckMethod() {
        }
    }
}
