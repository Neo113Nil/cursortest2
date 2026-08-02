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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityReceiptClientRouteParameters;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityReceiptClientRouteParameters$Builder;", "", "exit_url", "Ljava/lang/String;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityGetRequest;", "activity_get_request", "Lcom/squareup/protos/cash/activity/api/v1/ActivityGetRequest;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityReceiptClientRouteParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivityReceiptClientRouteParameters> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityGetRequest#ADAPTER", schemaIndex = 1, tag = 2)
    public final ActivityGetRequest activity_get_request;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String exit_url;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityReceiptClientRouteParameters$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityReceiptClientRouteParameters;", "<init>", "()V", "exit_url", "", "activity_get_request", "Lcom/squareup/protos/cash/activity/api/v1/ActivityGetRequest;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ActivityGetRequest activity_get_request;
        public String exit_url;

        public final Builder activity_get_request(ActivityGetRequest activity_get_request) {
            this.activity_get_request = activity_get_request;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ActivityReceiptClientRouteParameters build() {
            return new ActivityReceiptClientRouteParameters(this.exit_url, this.activity_get_request, buildUnknownFields());
        }

        public final Builder exit_url(String exit_url) {
            this.exit_url = exit_url;
            return this;
        }
    }

    static {
        ActivityReceiptClientRouteParameters$Companion$ADAPTER$1 activityReceiptClientRouteParameters$Companion$ADAPTER$1 = new ActivityReceiptClientRouteParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivityReceiptClientRouteParameters.class), "type.googleapis.com/squareup.cash.activity.api.v1.ActivityReceiptClientRouteParameters", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/clientRoutes.proto");
        ADAPTER = activityReceiptClientRouteParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activityReceiptClientRouteParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityReceiptClientRouteParameters(String str, ActivityGetRequest activityGetRequest, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.exit_url = str;
        this.activity_get_request = activityGetRequest;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityReceiptClientRouteParameters)) {
            return false;
        }
        ActivityReceiptClientRouteParameters activityReceiptClientRouteParameters = (ActivityReceiptClientRouteParameters) obj;
        return Intrinsics.areEqual(unknownFields(), activityReceiptClientRouteParameters.unknownFields()) && Intrinsics.areEqual(this.exit_url, activityReceiptClientRouteParameters.exit_url) && Intrinsics.areEqual(this.activity_get_request, activityReceiptClientRouteParameters.activity_get_request);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.exit_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ActivityGetRequest activityGetRequest = this.activity_get_request;
        int hashCode3 = hashCode2 + (activityGetRequest != null ? activityGetRequest.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.exit_url = this.exit_url;
        builder.activity_get_request = this.activity_get_request;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.exit_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "exit_url=", arrayList);
        }
        ActivityGetRequest activityGetRequest = this.activity_get_request;
        if (activityGetRequest != null) {
            arrayList.add("activity_get_request=" + activityGetRequest);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivityReceiptClientRouteParameters{", "}", 0, null, null, 56);
    }
}
