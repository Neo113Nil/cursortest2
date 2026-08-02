package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.protos.cash.kgoose.syncentity.CashGlobalUserSettings;
import com.squareup.protos.cash.kgoose.syncentity.CashUserSettings;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ReadCashUserSettingsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ReadCashUserSettingsResponse$Builder;", "Lcom/squareup/protos/cash/kgoose/syncentity/CashUserSettings;", "user_settings", "Lcom/squareup/protos/cash/kgoose/syncentity/CashUserSettings;", "Lcom/squareup/protos/cash/kgoose/syncentity/CashGlobalUserSettings;", "global_user_settings", "Lcom/squareup/protos/cash/kgoose/syncentity/CashGlobalUserSettings;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReadCashUserSettingsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ReadCashUserSettingsResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.syncentity.CashGlobalUserSettings#ADAPTER", schemaIndex = 1, tag = 2)
    public final CashGlobalUserSettings global_user_settings;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.syncentity.CashUserSettings#ADAPTER", schemaIndex = 0, tag = 1)
    public final CashUserSettings user_settings;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ReadCashUserSettingsResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ReadCashUserSettingsResponse;", "<init>", "()V", "user_settings", "Lcom/squareup/protos/cash/kgoose/syncentity/CashUserSettings;", "global_user_settings", "Lcom/squareup/protos/cash/kgoose/syncentity/CashGlobalUserSettings;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public CashGlobalUserSettings global_user_settings;
        public CashUserSettings user_settings;

        @Override // com.squareup.wire.Message.Builder
        public ReadCashUserSettingsResponse build() {
            return new ReadCashUserSettingsResponse(this.user_settings, this.global_user_settings, buildUnknownFields());
        }

        public final Builder global_user_settings(CashGlobalUserSettings global_user_settings) {
            this.global_user_settings = global_user_settings;
            return this;
        }

        public final Builder user_settings(CashUserSettings user_settings) {
            this.user_settings = user_settings;
            return this;
        }
    }

    static {
        ReadCashUserSettingsResponse$Companion$ADAPTER$1 readCashUserSettingsResponse$Companion$ADAPTER$1 = new ReadCashUserSettingsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ReadCashUserSettingsResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ReadCashUserSettingsResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/cash_user_settings_messages.proto");
        ADAPTER = readCashUserSettingsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(readCashUserSettingsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadCashUserSettingsResponse(CashUserSettings cashUserSettings, CashGlobalUserSettings cashGlobalUserSettings, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.user_settings = cashUserSettings;
        this.global_user_settings = cashGlobalUserSettings;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReadCashUserSettingsResponse)) {
            return false;
        }
        ReadCashUserSettingsResponse readCashUserSettingsResponse = (ReadCashUserSettingsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), readCashUserSettingsResponse.unknownFields()) && Intrinsics.areEqual(this.user_settings, readCashUserSettingsResponse.user_settings) && Intrinsics.areEqual(this.global_user_settings, readCashUserSettingsResponse.global_user_settings);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CashUserSettings cashUserSettings = this.user_settings;
        int hashCode2 = (hashCode + (cashUserSettings != null ? cashUserSettings.hashCode() : 0)) * 37;
        CashGlobalUserSettings cashGlobalUserSettings = this.global_user_settings;
        int hashCode3 = hashCode2 + (cashGlobalUserSettings != null ? cashGlobalUserSettings.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.user_settings = this.user_settings;
        builder.global_user_settings = this.global_user_settings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CashUserSettings cashUserSettings = this.user_settings;
        if (cashUserSettings != null) {
            arrayList.add("user_settings=" + cashUserSettings);
        }
        CashGlobalUserSettings cashGlobalUserSettings = this.global_user_settings;
        if (cashGlobalUserSettings != null) {
            arrayList.add("global_user_settings=" + cashGlobalUserSettings);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReadCashUserSettingsResponse{", "}", 0, null, null, 56);
    }
}
