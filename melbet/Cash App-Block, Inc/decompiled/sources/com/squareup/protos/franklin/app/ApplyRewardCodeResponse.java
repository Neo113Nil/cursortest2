package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.RewardStatus;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/ApplyRewardCodeResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/UiAlias$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ApplyRewardCodeResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ApplyRewardCodeResponse> CREATOR;
    public final ResponseContext response_context;
    public final RewardStatus reward_status;
    public final Boolean valid;

    static {
        ApplyRewardCodeResponse$Companion$ADAPTER$1 applyRewardCodeResponse$Companion$ADAPTER$1 = new ApplyRewardCodeResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ApplyRewardCodeResponse.class), "type.googleapis.com/squareup.franklin.app.ApplyRewardCodeResponse", Syntax.PROTO_2, null, "squareup/franklin/app/reward_code.proto");
        ADAPTER = applyRewardCodeResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(applyRewardCodeResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplyRewardCodeResponse(ResponseContext responseContext, Boolean bool, RewardStatus rewardStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.valid = bool;
        this.reward_status = rewardStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplyRewardCodeResponse)) {
            return false;
        }
        ApplyRewardCodeResponse applyRewardCodeResponse = (ApplyRewardCodeResponse) obj;
        return Intrinsics.areEqual(unknownFields(), applyRewardCodeResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, applyRewardCodeResponse.response_context) && Intrinsics.areEqual(this.valid, applyRewardCodeResponse.valid) && Intrinsics.areEqual(this.reward_status, applyRewardCodeResponse.reward_status);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        Boolean bool = this.valid;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        RewardStatus rewardStatus = this.reward_status;
        int hashCode4 = hashCode3 + (rewardStatus != null ? rewardStatus.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(14);
        builder.f1364type = this.response_context;
        builder.canonical_text = this.valid;
        builder.formatted = this.reward_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        Boolean bool = this.valid;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("valid=", bool, arrayList);
        }
        RewardStatus rewardStatus = this.reward_status;
        if (rewardStatus != null) {
            arrayList.add("reward_status=" + rewardStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ApplyRewardCodeResponse{", "}", 0, null, null, 56);
    }
}
