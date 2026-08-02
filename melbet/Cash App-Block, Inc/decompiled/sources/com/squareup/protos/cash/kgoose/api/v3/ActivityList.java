package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.localization.LocalizedString;
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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActivityList;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActivityList$Builder;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "", "has_more", "Ljava/lang/Boolean;", "", "version", "Ljava/lang/Integer;", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow;", "rows", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityList extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivityList> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean has_more;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<ActivityRow> rows;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalizedString title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 3, tag = 4)
    public final Integer version;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0010J\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActivityList$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActivityList;", "<init>", "()V", "rows", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "has_more", "", "Ljava/lang/Boolean;", "version", "", "Ljava/lang/Integer;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/ActivityList$Builder;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/ActivityList$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Boolean has_more;
        public List<ActivityRow> rows = EmptyList.INSTANCE;
        public LocalizedString title;
        public Integer version;

        @Override // com.squareup.wire.Message.Builder
        public ActivityList build() {
            return new ActivityList(this.rows, this.title, this.has_more, this.version, buildUnknownFields());
        }

        public final Builder has_more(Boolean has_more) {
            this.has_more = has_more;
            return this;
        }

        public final Builder rows(List<ActivityRow> rows) {
            rows.getClass();
            TransactorKt.checkElementsNotNull(rows);
            this.rows = rows;
            return this;
        }

        public final Builder title(LocalizedString title) {
            this.title = title;
            return this;
        }

        public final Builder version(Integer version) {
            this.version = version;
            return this;
        }
    }

    static {
        ActivityList$Companion$ADAPTER$1 activityList$Companion$ADAPTER$1 = new ActivityList$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivityList.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ActivityList", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
        ADAPTER = activityList$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activityList$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityList(List list, LocalizedString localizedString, Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = localizedString;
        this.has_more = bool;
        this.version = num;
        this.rows = TransactorKt.immutableCopyOf("rows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityList)) {
            return false;
        }
        ActivityList activityList = (ActivityList) obj;
        return Intrinsics.areEqual(unknownFields(), activityList.unknownFields()) && Intrinsics.areEqual(this.rows, activityList.rows) && Intrinsics.areEqual(this.title, activityList.title) && Intrinsics.areEqual(this.has_more, activityList.has_more) && Intrinsics.areEqual(this.version, activityList.version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.rows);
        LocalizedString localizedString = this.title;
        int hashCode = (m + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Boolean bool = this.has_more;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Integer num = this.version;
        int hashCode3 = hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.rows = this.rows;
        builder.title = this.title;
        builder.has_more = this.has_more;
        builder.version = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.rows.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("rows=", arrayList, this.rows);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        Boolean bool = this.has_more;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_more=", bool, arrayList);
        }
        Integer num = this.version;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("version=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivityList{", "}", 0, null, null, 56);
    }
}
