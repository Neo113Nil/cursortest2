package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashidv.common.SsnScreenRenderConfig;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/CheckRewardCodeResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/CheckRewardCodeResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CheckRewardCodeResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CheckRewardCodeResponse> CREATOR;
    public final String inviter_customer_token;
    public final String inviter_full_name;
    public final String inviter_photo_url;
    public final String reward_text;
    public final Boolean valid;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String inviter_customer_token;
        public String inviter_full_name;
        public String inviter_photo_url;
        public String reward_text;
        public Boolean valid;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new CheckRewardCodeResponse(this.reward_text, this.inviter_photo_url, this.inviter_full_name, this.inviter_customer_token, this.valid, buildUnknownFields());
                case 1:
                    return new SsnScreenRenderConfig(this.reward_text, this.inviter_photo_url, this.inviter_full_name, this.inviter_customer_token, this.valid, buildUnknownFields());
                default:
                    return new LocalBrand.RequiredLocationSelection(this.reward_text, this.inviter_photo_url, this.inviter_full_name, this.inviter_customer_token, this.valid, buildUnknownFields());
            }
        }
    }

    static {
        CheckRewardCodeResponse$Companion$ADAPTER$1 checkRewardCodeResponse$Companion$ADAPTER$1 = new CheckRewardCodeResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CheckRewardCodeResponse.class), "type.googleapis.com/squareup.franklin.app.CheckRewardCodeResponse", Syntax.PROTO_2, null, "squareup/franklin/app/reward_code.proto");
        ADAPTER = checkRewardCodeResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(checkRewardCodeResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckRewardCodeResponse(String str, String str2, String str3, String str4, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.valid = bool;
        this.reward_text = str;
        this.inviter_photo_url = str2;
        this.inviter_full_name = str3;
        this.inviter_customer_token = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CheckRewardCodeResponse)) {
            return false;
        }
        CheckRewardCodeResponse checkRewardCodeResponse = (CheckRewardCodeResponse) obj;
        return Intrinsics.areEqual(unknownFields(), checkRewardCodeResponse.unknownFields()) && Intrinsics.areEqual(this.valid, checkRewardCodeResponse.valid) && Intrinsics.areEqual(this.reward_text, checkRewardCodeResponse.reward_text) && Intrinsics.areEqual(this.inviter_photo_url, checkRewardCodeResponse.inviter_photo_url) && Intrinsics.areEqual(this.inviter_full_name, checkRewardCodeResponse.inviter_full_name) && Intrinsics.areEqual(this.inviter_customer_token, checkRewardCodeResponse.inviter_customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.valid;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.reward_text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.inviter_photo_url;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.inviter_full_name;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.inviter_customer_token;
        int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.valid = this.valid;
        builder.reward_text = this.reward_text;
        builder.inviter_photo_url = this.inviter_photo_url;
        builder.inviter_full_name = this.inviter_full_name;
        builder.inviter_customer_token = this.inviter_customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.valid;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("valid=", bool, arrayList);
        }
        if (this.reward_text != null) {
            arrayList.add("reward_text=██");
        }
        String str = this.inviter_photo_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "inviter_photo_url=", arrayList);
        }
        if (this.inviter_full_name != null) {
            arrayList.add("inviter_full_name=██");
        }
        String str2 = this.inviter_customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "inviter_customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CheckRewardCodeResponse{", "}", 0, null, null, 56);
    }
}
