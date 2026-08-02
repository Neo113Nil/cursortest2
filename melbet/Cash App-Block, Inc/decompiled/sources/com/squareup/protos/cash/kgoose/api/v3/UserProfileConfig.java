package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0002\b\u0003\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/UserProfileConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserProfileConfig$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Model;", "preferred_model", "Lcom/squareup/protos/cash/kgoose/api/v3/Model;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionConfig;", "client_tools", "Ljava/util/List;", "", "", "extra_args", "Ljava/util/Map;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserProfileConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UserProfileConfig> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ExtensionConfig#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<ExtensionConfig> client_tools;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", schemaIndex = 1, tag = 2)
    public final Map<String, ?> extra_args;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Model#ADAPTER", schemaIndex = 2, tag = 3)
    public final Model preferred_model;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u001a\u0010\b\u001a\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u0003\u0018\u00010\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u0003\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/UserProfileConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserProfileConfig;", "<init>", "()V", "client_tools", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionConfig;", "extra_args", "", "", "preferred_model", "Lcom/squareup/protos/cash/kgoose/api/v3/Model;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<ExtensionConfig> client_tools = EmptyList.INSTANCE;
        public Map<String, ?> extra_args;
        public Model preferred_model;

        @Override // com.squareup.wire.Message.Builder
        public UserProfileConfig build() {
            return new UserProfileConfig(this.client_tools, this.extra_args, this.preferred_model, buildUnknownFields());
        }

        public final Builder client_tools(List<ExtensionConfig> client_tools) {
            client_tools.getClass();
            TransactorKt.checkElementsNotNull(client_tools);
            this.client_tools = client_tools;
            return this;
        }

        public final Builder extra_args(Map<String, ?> extra_args) {
            this.extra_args = extra_args;
            return this;
        }

        public final Builder preferred_model(Model preferred_model) {
            this.preferred_model = preferred_model;
            return this;
        }
    }

    static {
        UserProfileConfig$Companion$ADAPTER$1 userProfileConfig$Companion$ADAPTER$1 = new UserProfileConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UserProfileConfig.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.UserProfileConfig", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/profile_messages.proto");
        ADAPTER = userProfileConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(userProfileConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileConfig(List list, Map map, Model model, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.preferred_model = model;
        this.client_tools = TransactorKt.immutableCopyOf("client_tools", list);
        this.extra_args = (Map) TransactorKt.immutableCopyOfStruct(map, "extra_args");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserProfileConfig)) {
            return false;
        }
        UserProfileConfig userProfileConfig = (UserProfileConfig) obj;
        return Intrinsics.areEqual(unknownFields(), userProfileConfig.unknownFields()) && Intrinsics.areEqual(this.client_tools, userProfileConfig.client_tools) && Intrinsics.areEqual(this.extra_args, userProfileConfig.extra_args) && Intrinsics.areEqual(this.preferred_model, userProfileConfig.preferred_model);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.client_tools);
        Map<String, ?> map = this.extra_args;
        int hashCode = (m + (map != null ? map.hashCode() : 0)) * 37;
        Model model = this.preferred_model;
        int hashCode2 = hashCode + (model != null ? model.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.client_tools = this.client_tools;
        builder.extra_args = this.extra_args;
        builder.preferred_model = this.preferred_model;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.client_tools.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("client_tools=", arrayList, this.client_tools);
        }
        Map<String, ?> map = this.extra_args;
        if (map != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("extra_args=", map, arrayList);
        }
        Model model = this.preferred_model;
        if (model != null) {
            arrayList.add("preferred_model=" + model);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UserProfileConfig{", "}", 0, null, null, 56);
    }
}
