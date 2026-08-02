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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetRuntimeMetadataResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetRuntimeMetadataResponse$Builder;", "", "system_preamble", "Ljava/lang/String;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionConfig;", "available_extension_configs", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetRuntimeMetadataResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetRuntimeMetadataResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ExtensionConfig#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<ExtensionConfig> available_extension_configs;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String system_preamble;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetRuntimeMetadataResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetRuntimeMetadataResponse;", "<init>", "()V", "available_extension_configs", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionConfig;", "system_preamble", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<ExtensionConfig> available_extension_configs = EmptyList.INSTANCE;
        public String system_preamble;

        public final Builder available_extension_configs(List<ExtensionConfig> available_extension_configs) {
            available_extension_configs.getClass();
            TransactorKt.checkElementsNotNull(available_extension_configs);
            this.available_extension_configs = available_extension_configs;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetRuntimeMetadataResponse build() {
            return new GetRuntimeMetadataResponse(this.available_extension_configs, this.system_preamble, buildUnknownFields());
        }

        public final Builder system_preamble(String system_preamble) {
            this.system_preamble = system_preamble;
            return this;
        }
    }

    static {
        GetRuntimeMetadataResponse$Companion$ADAPTER$1 getRuntimeMetadataResponse$Companion$ADAPTER$1 = new GetRuntimeMetadataResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetRuntimeMetadataResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.GetRuntimeMetadataResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/utility_messages.proto");
        ADAPTER = getRuntimeMetadataResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getRuntimeMetadataResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRuntimeMetadataResponse(List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.system_preamble = str;
        this.available_extension_configs = TransactorKt.immutableCopyOf("available_extension_configs", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetRuntimeMetadataResponse)) {
            return false;
        }
        GetRuntimeMetadataResponse getRuntimeMetadataResponse = (GetRuntimeMetadataResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getRuntimeMetadataResponse.unknownFields()) && Intrinsics.areEqual(this.available_extension_configs, getRuntimeMetadataResponse.available_extension_configs) && Intrinsics.areEqual(this.system_preamble, getRuntimeMetadataResponse.system_preamble);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.available_extension_configs);
        String str = this.system_preamble;
        int hashCode = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.available_extension_configs = this.available_extension_configs;
        builder.system_preamble = this.system_preamble;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.available_extension_configs.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("available_extension_configs=", arrayList, this.available_extension_configs);
        }
        String str = this.system_preamble;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "system_preamble=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRuntimeMetadataResponse{", "}", 0, null, null, 56);
    }
}
