package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.Profile;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/GetProfileResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/UiAlias$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetProfileResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetProfileResponse> CREATOR;
    public final Profile profile;
    public final String profile_token;
    public final Status status;

    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1);

        public static final GetProfileResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final TextSize.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new TextSize.Companion();
            ADAPTER = new GetProfileResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INVALID;
            }
            if (i != 1) {
                return null;
            }
            return SUCCESS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        GetProfileResponse$Companion$ADAPTER$1 getProfileResponse$Companion$ADAPTER$1 = new GetProfileResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetProfileResponse.class), "type.googleapis.com/squareup.franklin.app.GetProfileResponse", Syntax.PROTO_2, null, "squareup/franklin/app/profile.proto");
        ADAPTER = getProfileResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getProfileResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProfileResponse(Status status, Profile profile, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = status;
        this.profile = profile;
        this.profile_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetProfileResponse)) {
            return false;
        }
        GetProfileResponse getProfileResponse = (GetProfileResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getProfileResponse.unknownFields()) && this.status == getProfileResponse.status && Intrinsics.areEqual(this.profile, getProfileResponse.profile) && Intrinsics.areEqual(this.profile_token, getProfileResponse.profile_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
        Profile profile = this.profile;
        int hashCode3 = (hashCode2 + (profile != null ? profile.hashCode() : 0)) * 37;
        String str = this.profile_token;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(24);
        builder.f1364type = this.status;
        builder.formatted = this.profile;
        builder.canonical_text = this.profile_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        Profile profile = this.profile;
        if (profile != null) {
            arrayList.add("profile=" + profile);
        }
        String str = this.profile_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "profile_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetProfileResponse{", "}", 0, null, null, 56);
    }
}
