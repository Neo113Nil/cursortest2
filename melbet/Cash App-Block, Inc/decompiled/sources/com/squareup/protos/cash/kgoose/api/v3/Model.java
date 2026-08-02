package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Model;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/Model$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ModelProvider;", "provider", "Lcom/squareup/protos/cash/kgoose/api/v3/ModelProvider;", "", "name", "Ljava/lang/String;", "", "extra_args", "Ljava/util/Map;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Model extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Model> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", schemaIndex = 2, tag = 3)
    public final Map<String, ?> extra_args;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String name;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ModelProvider#ADAPTER", schemaIndex = 0, tag = 1)
    public final ModelProvider provider;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001a\u0010\t\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0002\b\u0003\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0002\b\u0003\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Model$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Model;", "<init>", "()V", "provider", "Lcom/squareup/protos/cash/kgoose/api/v3/ModelProvider;", "name", "", "extra_args", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Map<String, ?> extra_args;
        public String name;
        public ModelProvider provider;

        @Override // com.squareup.wire.Message.Builder
        public Model build() {
            return new Model(this.provider, this.name, this.extra_args, buildUnknownFields());
        }

        public final Builder extra_args(Map<String, ?> extra_args) {
            this.extra_args = extra_args;
            return this;
        }

        public final Builder name(String name) {
            this.name = name;
            return this;
        }

        public final Builder provider(ModelProvider provider) {
            this.provider = provider;
            return this;
        }
    }

    static {
        Model$Companion$ADAPTER$1 model$Companion$ADAPTER$1 = new Model$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Model.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.Model", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/common_messages.proto");
        ADAPTER = model$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(model$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Model(ModelProvider modelProvider, String str, Map map, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.provider = modelProvider;
        this.name = str;
        this.extra_args = (Map) TransactorKt.immutableCopyOfStruct(map, "extra_args");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Model)) {
            return false;
        }
        Model model = (Model) obj;
        return Intrinsics.areEqual(unknownFields(), model.unknownFields()) && this.provider == model.provider && Intrinsics.areEqual(this.name, model.name) && Intrinsics.areEqual(this.extra_args, model.extra_args);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ModelProvider modelProvider = this.provider;
        int hashCode2 = (hashCode + (modelProvider != null ? modelProvider.hashCode() : 0)) * 37;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Map<String, ?> map = this.extra_args;
        int hashCode4 = hashCode3 + (map != null ? map.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.provider = this.provider;
        builder.name = this.name;
        builder.extra_args = this.extra_args;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ModelProvider modelProvider = this.provider;
        if (modelProvider != null) {
            arrayList.add("provider=" + modelProvider);
        }
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        Map<String, ?> map = this.extra_args;
        if (map != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("extra_args=", map, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Model{", "}", 0, null, null, 56);
    }
}
