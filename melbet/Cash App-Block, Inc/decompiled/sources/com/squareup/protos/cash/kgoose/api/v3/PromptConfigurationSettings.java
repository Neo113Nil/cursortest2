package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PromptConfigurationSettings;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/PromptConfigurationSettings$Builder;", "", "include_current_date", "Ljava/lang/Boolean;", "include_current_hour", "include_time_zone", "include_goose_model_description", "include_response_guidelines", "include_time_emphasis", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PromptConfigurationSettings extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PromptConfigurationSettings> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    public final Boolean include_current_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean include_current_hour;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
    public final Boolean include_goose_model_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 5)
    public final Boolean include_response_guidelines;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    public final Boolean include_time_emphasis;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean include_time_zone;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PromptConfigurationSettings$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/PromptConfigurationSettings;", "<init>", "()V", "include_current_date", "", "Ljava/lang/Boolean;", "include_current_hour", "include_time_zone", "include_goose_model_description", "include_response_guidelines", "include_time_emphasis", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/PromptConfigurationSettings$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Boolean include_current_date;
        public Boolean include_current_hour;
        public Boolean include_goose_model_description;
        public Boolean include_response_guidelines;
        public Boolean include_time_emphasis;
        public Boolean include_time_zone;

        @Override // com.squareup.wire.Message.Builder
        public PromptConfigurationSettings build() {
            return new PromptConfigurationSettings(this.include_current_date, this.include_current_hour, this.include_time_zone, this.include_goose_model_description, this.include_response_guidelines, this.include_time_emphasis, buildUnknownFields());
        }

        public final Builder include_current_date(Boolean include_current_date) {
            this.include_current_date = include_current_date;
            return this;
        }

        public final Builder include_current_hour(Boolean include_current_hour) {
            this.include_current_hour = include_current_hour;
            return this;
        }

        public final Builder include_goose_model_description(Boolean include_goose_model_description) {
            this.include_goose_model_description = include_goose_model_description;
            return this;
        }

        public final Builder include_response_guidelines(Boolean include_response_guidelines) {
            this.include_response_guidelines = include_response_guidelines;
            return this;
        }

        public final Builder include_time_emphasis(Boolean include_time_emphasis) {
            this.include_time_emphasis = include_time_emphasis;
            return this;
        }

        public final Builder include_time_zone(Boolean include_time_zone) {
            this.include_time_zone = include_time_zone;
            return this;
        }
    }

    static {
        PromptConfigurationSettings$Companion$ADAPTER$1 promptConfigurationSettings$Companion$ADAPTER$1 = new PromptConfigurationSettings$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PromptConfigurationSettings.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.PromptConfigurationSettings", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/profile_messages.proto");
        ADAPTER = promptConfigurationSettings$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(promptConfigurationSettings$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromptConfigurationSettings(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.include_current_date = bool;
        this.include_current_hour = bool2;
        this.include_time_zone = bool3;
        this.include_goose_model_description = bool4;
        this.include_response_guidelines = bool5;
        this.include_time_emphasis = bool6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PromptConfigurationSettings)) {
            return false;
        }
        PromptConfigurationSettings promptConfigurationSettings = (PromptConfigurationSettings) obj;
        return Intrinsics.areEqual(unknownFields(), promptConfigurationSettings.unknownFields()) && Intrinsics.areEqual(this.include_current_date, promptConfigurationSettings.include_current_date) && Intrinsics.areEqual(this.include_current_hour, promptConfigurationSettings.include_current_hour) && Intrinsics.areEqual(this.include_time_zone, promptConfigurationSettings.include_time_zone) && Intrinsics.areEqual(this.include_goose_model_description, promptConfigurationSettings.include_goose_model_description) && Intrinsics.areEqual(this.include_response_guidelines, promptConfigurationSettings.include_response_guidelines) && Intrinsics.areEqual(this.include_time_emphasis, promptConfigurationSettings.include_time_emphasis);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.include_current_date;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.include_current_hour;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.include_time_zone;
        int hashCode4 = (hashCode3 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.include_goose_model_description;
        int hashCode5 = (hashCode4 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Boolean bool5 = this.include_response_guidelines;
        int hashCode6 = (hashCode5 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        Boolean bool6 = this.include_time_emphasis;
        int hashCode7 = hashCode6 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.include_current_date = this.include_current_date;
        builder.include_current_hour = this.include_current_hour;
        builder.include_time_zone = this.include_time_zone;
        builder.include_goose_model_description = this.include_goose_model_description;
        builder.include_response_guidelines = this.include_response_guidelines;
        builder.include_time_emphasis = this.include_time_emphasis;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.include_current_date;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_current_date=", bool, arrayList);
        }
        Boolean bool2 = this.include_current_hour;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_current_hour=", bool2, arrayList);
        }
        Boolean bool3 = this.include_time_zone;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_time_zone=", bool3, arrayList);
        }
        Boolean bool4 = this.include_goose_model_description;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_goose_model_description=", bool4, arrayList);
        }
        Boolean bool5 = this.include_response_guidelines;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_response_guidelines=", bool5, arrayList);
        }
        Boolean bool6 = this.include_time_emphasis;
        if (bool6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_time_emphasis=", bool6, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PromptConfigurationSettings{", "}", 0, null, null, 56);
    }
}
