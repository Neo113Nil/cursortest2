package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.ui.UiAvatar;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionRow$Builder;", "", "triggered_action_id", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "avatar", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "title", "client_route_url", "subtitle", "", "amount", "Ljava/lang/Double;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TriggeredActionRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TriggeredActionRow> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 5, tag = 6)
    public final Double amount;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiAvatar#ADAPTER", schemaIndex = 1, tag = 2)
    public final UiAvatar avatar;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String client_route_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String triggered_action_id;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionRow;", "<init>", "()V", "triggered_action_id", "", "avatar", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "title", "client_route_url", "subtitle", "amount", "", "Ljava/lang/Double;", "(Ljava/lang/Double;)Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionRow$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Double amount;
        public UiAvatar avatar;
        public String client_route_url;
        public String subtitle;
        public String title;
        public String triggered_action_id;

        public final Builder amount(Double amount) {
            this.amount = amount;
            return this;
        }

        public final Builder avatar(UiAvatar avatar) {
            this.avatar = avatar;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public TriggeredActionRow build() {
            return new TriggeredActionRow(this.triggered_action_id, this.avatar, this.title, this.client_route_url, this.subtitle, this.amount, buildUnknownFields());
        }

        public final Builder client_route_url(String client_route_url) {
            this.client_route_url = client_route_url;
            return this;
        }

        public final Builder subtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }

        public final Builder triggered_action_id(String triggered_action_id) {
            this.triggered_action_id = triggered_action_id;
            return this;
        }
    }

    static {
        TriggeredActionRow$Companion$ADAPTER$1 triggeredActionRow$Companion$ADAPTER$1 = new TriggeredActionRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TriggeredActionRow.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.TriggeredActionRow", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = triggeredActionRow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(triggeredActionRow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggeredActionRow(String str, UiAvatar uiAvatar, String str2, String str3, String str4, Double d, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.triggered_action_id = str;
        this.avatar = uiAvatar;
        this.title = str2;
        this.client_route_url = str3;
        this.subtitle = str4;
        this.amount = d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TriggeredActionRow)) {
            return false;
        }
        TriggeredActionRow triggeredActionRow = (TriggeredActionRow) obj;
        return Intrinsics.areEqual(unknownFields(), triggeredActionRow.unknownFields()) && Intrinsics.areEqual(this.triggered_action_id, triggeredActionRow.triggered_action_id) && Intrinsics.areEqual(this.avatar, triggeredActionRow.avatar) && Intrinsics.areEqual(this.title, triggeredActionRow.title) && Intrinsics.areEqual(this.client_route_url, triggeredActionRow.client_route_url) && Intrinsics.areEqual(this.subtitle, triggeredActionRow.subtitle) && Intrinsics.areEqual(this.amount, triggeredActionRow.amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.triggered_action_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        UiAvatar uiAvatar = this.avatar;
        int hashCode3 = (hashCode2 + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
        String str2 = this.title;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.client_route_url;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.subtitle;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Double d = this.amount;
        int hashCode7 = hashCode6 + (d != null ? Double.hashCode(d.doubleValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.triggered_action_id = this.triggered_action_id;
        builder.avatar = this.avatar;
        builder.title = this.title;
        builder.client_route_url = this.client_route_url;
        builder.subtitle = this.subtitle;
        builder.amount = this.amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.triggered_action_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "triggered_action_id=", arrayList);
        }
        UiAvatar uiAvatar = this.avatar;
        if (uiAvatar != null) {
            Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
        }
        String str2 = this.title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
        }
        String str3 = this.client_route_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "client_route_url=", arrayList);
        }
        String str4 = this.subtitle;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "subtitle=", arrayList);
        }
        Double d = this.amount;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("amount=", d, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TriggeredActionRow{", "}", 0, null, null, 56);
    }
}
