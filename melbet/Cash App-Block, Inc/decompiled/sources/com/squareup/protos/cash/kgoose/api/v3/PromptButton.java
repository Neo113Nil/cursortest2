package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
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
import squareup.cash.analytics.CdfEvent;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PromptButton;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/PromptButton$Builder;", "", "id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "prompt", "", "Lsquareup/cash/analytics/CdfEvent;", "view_cdf_events", "Ljava/util/List;", "tap_cdf_events", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PromptButton extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PromptButton> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String id;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
    public final LocalizedString prompt;

    @WireField(adapter = "squareup.cash.analytics.CdfEvent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    public final List<CdfEvent> tap_cdf_events;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalizedString text;

    @WireField(adapter = "squareup.cash.analytics.CdfEvent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<CdfEvent> view_cdf_events;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PromptButton$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/PromptButton;", "<init>", "()V", "id", "", "text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "prompt", "view_cdf_events", "", "Lsquareup/cash/analytics/CdfEvent;", "tap_cdf_events", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String id;
        public LocalizedString prompt;
        public List<CdfEvent> tap_cdf_events;
        public LocalizedString text;
        public List<CdfEvent> view_cdf_events;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.view_cdf_events = emptyList;
            this.tap_cdf_events = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public PromptButton build() {
            return new PromptButton(this.id, this.text, this.prompt, this.view_cdf_events, this.tap_cdf_events, buildUnknownFields());
        }

        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final Builder prompt(LocalizedString prompt) {
            this.prompt = prompt;
            return this;
        }

        public final Builder tap_cdf_events(List<CdfEvent> tap_cdf_events) {
            tap_cdf_events.getClass();
            TransactorKt.checkElementsNotNull(tap_cdf_events);
            this.tap_cdf_events = tap_cdf_events;
            return this;
        }

        public final Builder text(LocalizedString text) {
            this.text = text;
            return this;
        }

        public final Builder view_cdf_events(List<CdfEvent> view_cdf_events) {
            view_cdf_events.getClass();
            TransactorKt.checkElementsNotNull(view_cdf_events);
            this.view_cdf_events = view_cdf_events;
            return this;
        }
    }

    static {
        PromptButton$Companion$ADAPTER$1 promptButton$Companion$ADAPTER$1 = new PromptButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PromptButton.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.PromptButton", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
        ADAPTER = promptButton$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(promptButton$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromptButton(String str, LocalizedString localizedString, LocalizedString localizedString2, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.id = str;
        this.text = localizedString;
        this.prompt = localizedString2;
        this.view_cdf_events = TransactorKt.immutableCopyOf("view_cdf_events", list);
        this.tap_cdf_events = TransactorKt.immutableCopyOf("tap_cdf_events", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PromptButton)) {
            return false;
        }
        PromptButton promptButton = (PromptButton) obj;
        return Intrinsics.areEqual(unknownFields(), promptButton.unknownFields()) && Intrinsics.areEqual(this.id, promptButton.id) && Intrinsics.areEqual(this.text, promptButton.text) && Intrinsics.areEqual(this.prompt, promptButton.prompt) && Intrinsics.areEqual(this.view_cdf_events, promptButton.view_cdf_events) && Intrinsics.areEqual(this.tap_cdf_events, promptButton.tap_cdf_events);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.text;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.prompt;
        int hashCode4 = this.tap_cdf_events.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37, 37, this.view_cdf_events);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.text = this.text;
        builder.prompt = this.prompt;
        builder.view_cdf_events = this.view_cdf_events;
        builder.tap_cdf_events = this.tap_cdf_events;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        LocalizedString localizedString = this.text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.prompt;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("prompt=", localizedString2, arrayList);
        }
        if (!this.view_cdf_events.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("view_cdf_events=", arrayList, this.view_cdf_events);
        }
        if (!this.tap_cdf_events.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tap_cdf_events=", arrayList, this.tap_cdf_events);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PromptButton{", "}", 0, null, null, 56);
    }
}
