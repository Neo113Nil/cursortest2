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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SyncEntityRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/SyncEntityRow$Builder;", "", "token", "Ljava/lang/String;", "counterparty_token", "", "display_date", "Ljava/lang/Long;", "", "badged", "Ljava/lang/Boolean;", "sync_entity_version", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SyncEntityRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncEntityRow> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
    public final Boolean badged;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String counterparty_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 2, tag = 3)
    public final Long display_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 4, tag = 5)
    public final Long sync_entity_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String token;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0010J\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SyncEntityRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/SyncEntityRow;", "<init>", "()V", "token", "", "counterparty_token", "display_date", "", "Ljava/lang/Long;", "badged", "", "Ljava/lang/Boolean;", "sync_entity_version", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/activity/api/v1/SyncEntityRow$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/activity/api/v1/SyncEntityRow$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Boolean badged;
        public String counterparty_token;
        public Long display_date;
        public Long sync_entity_version;
        public String token;

        public final Builder badged(Boolean badged) {
            this.badged = badged;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SyncEntityRow build() {
            return new SyncEntityRow(this.token, this.counterparty_token, this.display_date, this.badged, this.sync_entity_version, buildUnknownFields());
        }

        public final Builder counterparty_token(String counterparty_token) {
            this.counterparty_token = counterparty_token;
            return this;
        }

        public final Builder display_date(Long display_date) {
            this.display_date = display_date;
            return this;
        }

        public final Builder sync_entity_version(Long sync_entity_version) {
            this.sync_entity_version = sync_entity_version;
            return this;
        }

        public final Builder token(String token) {
            this.token = token;
            return this;
        }
    }

    static {
        SyncEntityRow$Companion$ADAPTER$1 syncEntityRow$Companion$ADAPTER$1 = new SyncEntityRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncEntityRow.class), "type.googleapis.com/squareup.cash.activity.api.v1.SyncEntityRow", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/verification.proto");
        ADAPTER = syncEntityRow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncEntityRow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncEntityRow(String str, String str2, Long l, Boolean bool, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.counterparty_token = str2;
        this.display_date = l;
        this.badged = bool;
        this.sync_entity_version = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncEntityRow)) {
            return false;
        }
        SyncEntityRow syncEntityRow = (SyncEntityRow) obj;
        return Intrinsics.areEqual(unknownFields(), syncEntityRow.unknownFields()) && Intrinsics.areEqual(this.token, syncEntityRow.token) && Intrinsics.areEqual(this.counterparty_token, syncEntityRow.counterparty_token) && Intrinsics.areEqual(this.display_date, syncEntityRow.display_date) && Intrinsics.areEqual(this.badged, syncEntityRow.badged) && Intrinsics.areEqual(this.sync_entity_version, syncEntityRow.sync_entity_version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.counterparty_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.display_date;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Boolean bool = this.badged;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Long l2 = this.sync_entity_version;
        int hashCode6 = hashCode5 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.token = this.token;
        builder.counterparty_token = this.counterparty_token;
        builder.display_date = this.display_date;
        builder.badged = this.badged;
        builder.sync_entity_version = this.sync_entity_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.counterparty_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "counterparty_token=", arrayList);
        }
        Long l = this.display_date;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("display_date=", l, arrayList);
        }
        Boolean bool = this.badged;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("badged=", bool, arrayList);
        }
        Long l2 = this.sync_entity_version;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sync_entity_version=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncEntityRow{", "}", 0, null, null, 56);
    }
}
