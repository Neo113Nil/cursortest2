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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/DraftUIResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/DraftUIResponse$Builder;", "", "success", "Ljava/lang/Boolean;", "", "error_msg", "Ljava/lang/String;", "code_mode_result_json", "final_code", "final_code_output_json", "structured_output_json", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable;", "client_renderables", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DraftUIResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DraftUIResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ClientRenderable#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<ClientRenderable> client_renderables;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String code_mode_result_json;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String error_msg;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String final_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String final_code_output_json;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String structured_output_json;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean success;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0011J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/DraftUIResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/DraftUIResponse;", "<init>", "()V", "client_renderables", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable;", "success", "", "Ljava/lang/Boolean;", "error_msg", "", "code_mode_result_json", "final_code", "final_code_output_json", "structured_output_json", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/DraftUIResponse$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<ClientRenderable> client_renderables = EmptyList.INSTANCE;
        public String code_mode_result_json;
        public String error_msg;
        public String final_code;
        public String final_code_output_json;
        public String structured_output_json;
        public Boolean success;

        @Override // com.squareup.wire.Message.Builder
        public DraftUIResponse build() {
            return new DraftUIResponse(this.client_renderables, this.success, this.error_msg, this.code_mode_result_json, this.final_code, this.final_code_output_json, this.structured_output_json, buildUnknownFields());
        }

        public final Builder client_renderables(List<ClientRenderable> client_renderables) {
            client_renderables.getClass();
            TransactorKt.checkElementsNotNull(client_renderables);
            this.client_renderables = client_renderables;
            return this;
        }

        public final Builder code_mode_result_json(String code_mode_result_json) {
            this.code_mode_result_json = code_mode_result_json;
            return this;
        }

        public final Builder error_msg(String error_msg) {
            this.error_msg = error_msg;
            return this;
        }

        public final Builder final_code(String final_code) {
            this.final_code = final_code;
            return this;
        }

        public final Builder final_code_output_json(String final_code_output_json) {
            this.final_code_output_json = final_code_output_json;
            return this;
        }

        public final Builder structured_output_json(String structured_output_json) {
            this.structured_output_json = structured_output_json;
            return this;
        }

        public final Builder success(Boolean success) {
            this.success = success;
            return this;
        }
    }

    static {
        DraftUIResponse$Companion$ADAPTER$1 draftUIResponse$Companion$ADAPTER$1 = new DraftUIResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DraftUIResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.DraftUIResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/cash_draft_ui.proto");
        ADAPTER = draftUIResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(draftUIResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraftUIResponse(List list, Boolean bool, String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.success = bool;
        this.error_msg = str;
        this.code_mode_result_json = str2;
        this.final_code = str3;
        this.final_code_output_json = str4;
        this.structured_output_json = str5;
        this.client_renderables = TransactorKt.immutableCopyOf("client_renderables", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DraftUIResponse)) {
            return false;
        }
        DraftUIResponse draftUIResponse = (DraftUIResponse) obj;
        return Intrinsics.areEqual(unknownFields(), draftUIResponse.unknownFields()) && Intrinsics.areEqual(this.client_renderables, draftUIResponse.client_renderables) && Intrinsics.areEqual(this.success, draftUIResponse.success) && Intrinsics.areEqual(this.error_msg, draftUIResponse.error_msg) && Intrinsics.areEqual(this.code_mode_result_json, draftUIResponse.code_mode_result_json) && Intrinsics.areEqual(this.final_code, draftUIResponse.final_code) && Intrinsics.areEqual(this.final_code_output_json, draftUIResponse.final_code_output_json) && Intrinsics.areEqual(this.structured_output_json, draftUIResponse.structured_output_json);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.client_renderables);
        Boolean bool = this.success;
        int hashCode = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.error_msg;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.code_mode_result_json;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.final_code;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.final_code_output_json;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.structured_output_json;
        int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.client_renderables = this.client_renderables;
        builder.success = this.success;
        builder.error_msg = this.error_msg;
        builder.code_mode_result_json = this.code_mode_result_json;
        builder.final_code = this.final_code;
        builder.final_code_output_json = this.final_code_output_json;
        builder.structured_output_json = this.structured_output_json;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.client_renderables.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("client_renderables=", arrayList, this.client_renderables);
        }
        Boolean bool = this.success;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("success=", bool, arrayList);
        }
        String str = this.error_msg;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "error_msg=", arrayList);
        }
        String str2 = this.code_mode_result_json;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "code_mode_result_json=", arrayList);
        }
        String str3 = this.final_code;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "final_code=", arrayList);
        }
        String str4 = this.final_code_output_json;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "final_code_output_json=", arrayList);
        }
        String str5 = this.structured_output_json;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "structured_output_json=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DraftUIResponse{", "}", 0, null, null, 56);
    }
}
