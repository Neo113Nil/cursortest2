package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.kgoose.syncentity.CashUserSettings;
import com.squareup.protos.franklin.common.ResponseContext;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WriteCashUserSettingsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/WriteCashUserSettingsResponse$Builder;", "Lcom/squareup/protos/franklin/common/ResponseContext;", "response_context", "Lcom/squareup/protos/franklin/common/ResponseContext;", "Lcom/squareup/protos/cash/kgoose/syncentity/CashUserSettings;", "user_settings", "Lcom/squareup/protos/cash/kgoose/syncentity/CashUserSettings;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WriteCashUserSettingsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WriteCashUserSettingsResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.common.ResponseContext#ADAPTER", schemaIndex = 0, tag = 1)
    public final ResponseContext response_context;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.syncentity.CashUserSettings#ADAPTER", schemaIndex = 1, tag = 2)
    public final CashUserSettings user_settings;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WriteCashUserSettingsResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/WriteCashUserSettingsResponse;", "<init>", "()V", "response_context", "Lcom/squareup/protos/franklin/common/ResponseContext;", "user_settings", "Lcom/squareup/protos/cash/kgoose/syncentity/CashUserSettings;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ResponseContext response_context;
        public CashUserSettings user_settings;

        @Override // com.squareup.wire.Message.Builder
        public WriteCashUserSettingsResponse build() {
            return new WriteCashUserSettingsResponse(this.response_context, this.user_settings, buildUnknownFields());
        }

        public final Builder response_context(ResponseContext response_context) {
            this.response_context = response_context;
            return this;
        }

        public final Builder user_settings(CashUserSettings user_settings) {
            this.user_settings = user_settings;
            return this;
        }
    }

    static {
        WriteCashUserSettingsResponse$Companion$ADAPTER$1 writeCashUserSettingsResponse$Companion$ADAPTER$1 = new WriteCashUserSettingsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WriteCashUserSettingsResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.WriteCashUserSettingsResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/cash_user_settings_messages.proto");
        ADAPTER = writeCashUserSettingsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(writeCashUserSettingsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteCashUserSettingsResponse(ResponseContext responseContext, CashUserSettings cashUserSettings, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.user_settings = cashUserSettings;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WriteCashUserSettingsResponse)) {
            return false;
        }
        WriteCashUserSettingsResponse writeCashUserSettingsResponse = (WriteCashUserSettingsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), writeCashUserSettingsResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, writeCashUserSettingsResponse.response_context) && Intrinsics.areEqual(this.user_settings, writeCashUserSettingsResponse.user_settings);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        CashUserSettings cashUserSettings = this.user_settings;
        int hashCode3 = hashCode2 + (cashUserSettings != null ? cashUserSettings.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.response_context = this.response_context;
        builder.user_settings = this.user_settings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        CashUserSettings cashUserSettings = this.user_settings;
        if (cashUserSettings != null) {
            arrayList.add("user_settings=" + cashUserSettings);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WriteCashUserSettingsResponse{", "}", 0, null, null, 56);
    }
}
