package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityTokenType;", "activity_token_type", "Lcom/squareup/protos/cash/activity/api/v1/ActivityTokenType;", "", "token", "Ljava/lang/String;", "sub_token", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityToken extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivityToken> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityTokenType#ADAPTER", schemaIndex = 0, tag = 1)
    public final ActivityTokenType activity_token_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String sub_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String token;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityToken$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "<init>", "()V", "activity_token_type", "Lcom/squareup/protos/cash/activity/api/v1/ActivityTokenType;", "token", "", "sub_token", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public ActivityTokenType activity_token_type;
        public String sub_token;
        public String token;

        public final Builder activity_token_type(ActivityTokenType activity_token_type) {
            this.activity_token_type = activity_token_type;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ActivityToken build() {
            return new ActivityToken(this.activity_token_type, this.token, this.sub_token, buildUnknownFields());
        }

        public final Builder sub_token(String sub_token) {
            this.sub_token = sub_token;
            return this;
        }

        public final Builder token(String token) {
            this.token = token;
            return this;
        }
    }

    static {
        ActivityToken$Companion$ADAPTER$1 activityToken$Companion$ADAPTER$1 = new ActivityToken$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivityToken.class), "type.googleapis.com/squareup.cash.activity.api.v1.ActivityToken", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/coremodels.proto");
        ADAPTER = activityToken$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activityToken$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityToken(ActivityTokenType activityTokenType, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.activity_token_type = activityTokenType;
        this.token = str;
        this.sub_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityToken)) {
            return false;
        }
        ActivityToken activityToken = (ActivityToken) obj;
        return Intrinsics.areEqual(unknownFields(), activityToken.unknownFields()) && this.activity_token_type == activityToken.activity_token_type && Intrinsics.areEqual(this.token, activityToken.token) && Intrinsics.areEqual(this.sub_token, activityToken.sub_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActivityTokenType activityTokenType = this.activity_token_type;
        int hashCode2 = (hashCode + (activityTokenType != null ? activityTokenType.hashCode() : 0)) * 37;
        String str = this.token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.sub_token;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.activity_token_type = this.activity_token_type;
        builder.token = this.token;
        builder.sub_token = this.sub_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActivityTokenType activityTokenType = this.activity_token_type;
        if (activityTokenType != null) {
            arrayList.add("activity_token_type=" + activityTokenType);
        }
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.sub_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "sub_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivityToken{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ActivityToken(ActivityTokenType activityTokenType, String str, String str2, int i) {
        this(activityTokenType, str, (i & 4) != 0 ? null : str2, ByteString.EMPTY);
    }
}
