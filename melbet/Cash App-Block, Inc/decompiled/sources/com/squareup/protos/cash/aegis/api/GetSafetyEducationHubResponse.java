package com.squareup.protos.cash.aegis.api;

import android.os.Parcelable;
import com.squareup.protos.cash.aegis.core.SafetyEducationHub;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/aegis/api/GetSafetyEducationHubResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/SubsectionBlock$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetSafetyEducationHubResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetSafetyEducationHubResponse> CREATOR;
    public final SafetyEducationHub safety_education_hub;

    static {
        GetSafetyEducationHubResponse$Companion$ADAPTER$1 getSafetyEducationHubResponse$Companion$ADAPTER$1 = new GetSafetyEducationHubResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetSafetyEducationHubResponse.class), "type.googleapis.com/squareup.cash.aegis.api.GetSafetyEducationHubResponse", Syntax.PROTO_2, null, "squareup/cash/aegis/api/GetSafetyEducationHubResponse.proto");
        ADAPTER = getSafetyEducationHubResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getSafetyEducationHubResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSafetyEducationHubResponse(SafetyEducationHub safetyEducationHub, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.safety_education_hub = safetyEducationHub;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSafetyEducationHubResponse)) {
            return false;
        }
        GetSafetyEducationHubResponse getSafetyEducationHubResponse = (GetSafetyEducationHubResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getSafetyEducationHubResponse.unknownFields()) && Intrinsics.areEqual(this.safety_education_hub, getSafetyEducationHubResponse.safety_education_hub);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SafetyEducationHub safetyEducationHub = this.safety_education_hub;
        int hashCode2 = hashCode + (safetyEducationHub != null ? safetyEducationHub.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(18);
        builder.f1245type = this.safety_education_hub;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SafetyEducationHub safetyEducationHub = this.safety_education_hub;
        if (safetyEducationHub != null) {
            arrayList.add("safety_education_hub=" + safetyEducationHub);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSafetyEducationHubResponse{", "}", 0, null, null, 56);
    }
}
