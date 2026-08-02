package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.OpaqueRoute;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/SetOnboardingContextResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/lending/OpaqueRoute$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SetOnboardingContextResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetOnboardingContextResponse> CREATOR;
    public final String initiation_data;

    static {
        SetOnboardingContextResponse$Companion$ADAPTER$1 setOnboardingContextResponse$Companion$ADAPTER$1 = new SetOnboardingContextResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetOnboardingContextResponse.class), "type.googleapis.com/squareup.franklin.app.SetOnboardingContextResponse", Syntax.PROTO_2, null, "squareup/franklin/app/onboarding_context.proto");
        ADAPTER = setOnboardingContextResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setOnboardingContextResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetOnboardingContextResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.initiation_data = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetOnboardingContextResponse)) {
            return false;
        }
        SetOnboardingContextResponse setOnboardingContextResponse = (SetOnboardingContextResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setOnboardingContextResponse.unknownFields()) && Intrinsics.areEqual(this.initiation_data, setOnboardingContextResponse.initiation_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.initiation_data;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpaqueRoute.Builder builder = new OpaqueRoute.Builder(13);
        builder.client_route = this.initiation_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.initiation_data;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "initiation_data=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetOnboardingContextResponse{", "}", 0, null, null, 56);
    }
}
