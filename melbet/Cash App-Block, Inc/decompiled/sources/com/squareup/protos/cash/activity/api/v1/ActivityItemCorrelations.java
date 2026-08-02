package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityItemCorrelations;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemCorrelations$Builder;", "", "transaction_token", "Ljava/lang/String;", "external_system_id", "", "transaction_tokens", "Ljava/util/List;", "external_system_ids", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityItemCorrelations extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivityItemCorrelations> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String external_system_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<String> external_system_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String transaction_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<String> transaction_tokens;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityItemCorrelations$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemCorrelations;", "<init>", "()V", "transaction_token", "", "external_system_id", "transaction_tokens", "", "external_system_ids", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String external_system_id;
        public List<String> external_system_ids;
        public String transaction_token;
        public List<String> transaction_tokens;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.transaction_tokens = emptyList;
            this.external_system_ids = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public ActivityItemCorrelations build() {
            return new ActivityItemCorrelations(this.transaction_token, this.external_system_id, this.transaction_tokens, this.external_system_ids, buildUnknownFields());
        }

        public final Builder external_system_id(String external_system_id) {
            this.external_system_id = external_system_id;
            return this;
        }

        public final Builder external_system_ids(List<String> external_system_ids) {
            external_system_ids.getClass();
            TransactorKt.checkElementsNotNull(external_system_ids);
            this.external_system_ids = external_system_ids;
            return this;
        }

        public final Builder transaction_token(String transaction_token) {
            this.transaction_token = transaction_token;
            return this;
        }

        public final Builder transaction_tokens(List<String> transaction_tokens) {
            transaction_tokens.getClass();
            TransactorKt.checkElementsNotNull(transaction_tokens);
            this.transaction_tokens = transaction_tokens;
            return this;
        }
    }

    static {
        ActivityItemCorrelations$Companion$ADAPTER$1 activityItemCorrelations$Companion$ADAPTER$1 = new ActivityItemCorrelations$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivityItemCorrelations.class), "type.googleapis.com/squareup.cash.activity.api.v1.ActivityItemCorrelations", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/models.proto");
        ADAPTER = activityItemCorrelations$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activityItemCorrelations$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityItemCorrelations(String str, String str2, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.transaction_token = str;
        this.external_system_id = str2;
        this.transaction_tokens = TransactorKt.immutableCopyOf("transaction_tokens", list);
        this.external_system_ids = TransactorKt.immutableCopyOf("external_system_ids", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityItemCorrelations)) {
            return false;
        }
        ActivityItemCorrelations activityItemCorrelations = (ActivityItemCorrelations) obj;
        return Intrinsics.areEqual(unknownFields(), activityItemCorrelations.unknownFields()) && Intrinsics.areEqual(this.transaction_token, activityItemCorrelations.transaction_token) && Intrinsics.areEqual(this.external_system_id, activityItemCorrelations.external_system_id) && Intrinsics.areEqual(this.transaction_tokens, activityItemCorrelations.transaction_tokens) && Intrinsics.areEqual(this.external_system_ids, activityItemCorrelations.external_system_ids);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.transaction_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.external_system_id;
        int hashCode3 = this.external_system_ids.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.transaction_tokens);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.transaction_token = this.transaction_token;
        builder.external_system_id = this.external_system_id;
        builder.transaction_tokens = this.transaction_tokens;
        builder.external_system_ids = this.external_system_ids;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.transaction_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "transaction_token=", arrayList);
        }
        String str2 = this.external_system_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "external_system_id=", arrayList);
        }
        if (!this.transaction_tokens.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("transaction_tokens=", arrayList, this.transaction_tokens);
        }
        if (!this.external_system_ids.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("external_system_ids=", arrayList, this.external_system_ids);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivityItemCorrelations{", "}", 0, null, null, 56);
    }
}
