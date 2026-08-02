package com.squareup.protos.cash.semaphore.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/semaphore/api/GetOnboardingConfigResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/pools/ListPoolsResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetOnboardingConfigResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetOnboardingConfigResponse> CREATOR;
    public final List feature_flags;

    static {
        GetOnboardingConfigResponse$Companion$ADAPTER$1 getOnboardingConfigResponse$Companion$ADAPTER$1 = new GetOnboardingConfigResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetOnboardingConfigResponse.class), "type.googleapis.com/squareup.cash.semaphore.api.GetOnboardingConfigResponse", Syntax.PROTO_2, null, "squareup/cash/semaphore/api/GetOnboardingConfig.proto");
        ADAPTER = getOnboardingConfigResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getOnboardingConfigResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOnboardingConfigResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.feature_flags = TransactorKt.immutableCopyOf("feature_flags", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetOnboardingConfigResponse)) {
            return false;
        }
        GetOnboardingConfigResponse getOnboardingConfigResponse = (GetOnboardingConfigResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getOnboardingConfigResponse.unknownFields()) && Intrinsics.areEqual(this.feature_flags, getOnboardingConfigResponse.feature_flags);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.feature_flags.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(19);
        builder.pools = this.feature_flags;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.feature_flags;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("feature_flags=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetOnboardingConfigResponse{", "}", 0, null, null, 56);
    }
}
