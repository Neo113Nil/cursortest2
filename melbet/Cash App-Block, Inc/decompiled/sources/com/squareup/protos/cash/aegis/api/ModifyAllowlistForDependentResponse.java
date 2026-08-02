package com.squareup.protos.cash.aegis.api;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/aegis/api/ModifyAllowlistForDependentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/Section$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ModifyAllowlistForDependentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ModifyAllowlistForDependentResponse> CREATOR;
    public final Integer allowlist_limit;
    public final Boolean is_successful;
    public final ResponseContext response_context;

    static {
        ModifyAllowlistForDependentResponse$Companion$ADAPTER$1 modifyAllowlistForDependentResponse$Companion$ADAPTER$1 = new ModifyAllowlistForDependentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ModifyAllowlistForDependentResponse.class), "type.googleapis.com/squareup.cash.aegis.api.ModifyAllowlistForDependentResponse", Syntax.PROTO_2, null, "squareup/cash/aegis/api/ModifyAllowlistForDependentResponse.proto");
        ADAPTER = modifyAllowlistForDependentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(modifyAllowlistForDependentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifyAllowlistForDependentResponse(ResponseContext responseContext, Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.is_successful = bool;
        this.allowlist_limit = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ModifyAllowlistForDependentResponse)) {
            return false;
        }
        ModifyAllowlistForDependentResponse modifyAllowlistForDependentResponse = (ModifyAllowlistForDependentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), modifyAllowlistForDependentResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, modifyAllowlistForDependentResponse.response_context) && Intrinsics.areEqual(this.is_successful, modifyAllowlistForDependentResponse.is_successful) && Intrinsics.areEqual(this.allowlist_limit, modifyAllowlistForDependentResponse.allowlist_limit);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        Boolean bool = this.is_successful;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Integer num = this.allowlist_limit;
        int hashCode4 = hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(6);
        builder.header_text = this.response_context;
        builder.header_button = this.is_successful;
        builder.groups = this.allowlist_limit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        Boolean bool = this.is_successful;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_successful=", bool, arrayList);
        }
        Integer num = this.allowlist_limit;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("allowlist_limit=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ModifyAllowlistForDependentResponse{", "}", 0, null, null, 56);
    }
}
