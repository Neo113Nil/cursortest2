package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0014\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Suggestion;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/Suggestion$Builder;", "", "body_text", "Ljava/lang/String;", "label_text", "Lcom/squareup/protos/cash/kgoose/api/v3/Suggestion$Icon;", "icon", "Lcom/squareup/protos/cash/kgoose/api/v3/Suggestion$Icon;", "campaign_category", "prompt", "id", "", "Lsquareup/cash/analytics/CdfEvent;", "view_cdf_events", "Ljava/util/List;", "tap_cdf_events", "Companion", "Builder", "Icon", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Suggestion extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Suggestion> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String body_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String campaign_category;

    @WireSealedOneof(schemaIndex = 2)
    public final Icon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 7)
    public final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String label_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String prompt;

    @WireField(adapter = "squareup.cash.analytics.CdfEvent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 9)
    public final List<CdfEvent> tap_cdf_events;

    @WireField(adapter = "squareup.cash.analytics.CdfEvent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 8)
    public final List<CdfEvent> view_cdf_events;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Suggestion$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Suggestion;", "<init>", "()V", "body_text", "", "label_text", "icon", "Lcom/squareup/protos/cash/kgoose/api/v3/Suggestion$Icon;", "campaign_category", "prompt", "id", "view_cdf_events", "", "Lsquareup/cash/analytics/CdfEvent;", "tap_cdf_events", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String body_text;
        public String campaign_category;
        public Icon icon;
        public String id;
        public String label_text;
        public String prompt;
        public List<CdfEvent> tap_cdf_events;
        public List<CdfEvent> view_cdf_events;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.view_cdf_events = emptyList;
            this.tap_cdf_events = emptyList;
        }

        public final Builder body_text(String body_text) {
            this.body_text = body_text;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Suggestion build() {
            return new Suggestion(this.body_text, this.label_text, this.icon, this.campaign_category, this.prompt, this.id, this.view_cdf_events, this.tap_cdf_events, buildUnknownFields());
        }

        public final Builder campaign_category(String campaign_category) {
            this.campaign_category = campaign_category;
            return this;
        }

        public final Builder icon(Icon icon) {
            this.icon = icon;
            return this;
        }

        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final Builder label_text(String label_text) {
            this.label_text = label_text;
            return this;
        }

        public final Builder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        public final Builder tap_cdf_events(List<CdfEvent> tap_cdf_events) {
            tap_cdf_events.getClass();
            TransactorKt.checkElementsNotNull(tap_cdf_events);
            this.tap_cdf_events = tap_cdf_events;
            return this;
        }

        public final Builder view_cdf_events(List<CdfEvent> view_cdf_events) {
            view_cdf_events.getClass();
            TransactorKt.checkElementsNotNull(view_cdf_events);
            this.view_cdf_events = view_cdf_events;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Suggestion$Icon;", "", "Avatar", "Image", "Lcom/squareup/protos/cash/kgoose/api/v3/Suggestion$Icon$Avatar;", "Lcom/squareup/protos/cash/kgoose/api/v3/Suggestion$Icon$Image;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Icon {

        @WireOneofField(adapter = "com.squareup.protos.franklin.ui.UiAvatar#ADAPTER", declaredName = "avatar", tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Suggestion$Icon$Avatar;", "Lcom/squareup/protos/cash/kgoose/api/v3/Suggestion$Icon;", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "value", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "getValue", "()Lcom/squareup/protos/franklin/ui/UiAvatar;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Avatar extends Icon {
            private final UiAvatar value;

            public Avatar(UiAvatar uiAvatar) {
                uiAvatar.getClass();
                this.value = uiAvatar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Avatar) && Intrinsics.areEqual(this.value, ((Avatar) obj).value);
            }

            public final UiAvatar getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Avatar(value=", ")");
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", declaredName = "image", tag = 6)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Suggestion$Icon$Image;", "Lcom/squareup/protos/cash/kgoose/api/v3/Suggestion$Icon;", "Lcom/squareup/protos/cash/ui/Image;", "value", "Lcom/squareup/protos/cash/ui/Image;", "getValue", "()Lcom/squareup/protos/cash/ui/Image;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Image extends Icon {
            private final com.squareup.protos.cash.ui.Image value;

            public Image(com.squareup.protos.cash.ui.Image image) {
                image.getClass();
                this.value = image;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Image) && Intrinsics.areEqual(this.value, ((Image) obj).value);
            }

            public final com.squareup.protos.cash.ui.Image getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Image(value=", ")");
            }
        }
    }

    static {
        Suggestion$Companion$ADAPTER$1 suggestion$Companion$ADAPTER$1 = new Suggestion$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Suggestion.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.Suggestion", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/cash_suggestions.proto");
        ADAPTER = suggestion$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(suggestion$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Suggestion(String str, String str2, Icon icon, String str3, String str4, String str5, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.body_text = str;
        this.label_text = str2;
        this.icon = icon;
        this.campaign_category = str3;
        this.prompt = str4;
        this.id = str5;
        this.view_cdf_events = TransactorKt.immutableCopyOf("view_cdf_events", list);
        this.tap_cdf_events = TransactorKt.immutableCopyOf("tap_cdf_events", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Suggestion)) {
            return false;
        }
        Suggestion suggestion = (Suggestion) obj;
        return Intrinsics.areEqual(unknownFields(), suggestion.unknownFields()) && Intrinsics.areEqual(this.body_text, suggestion.body_text) && Intrinsics.areEqual(this.label_text, suggestion.label_text) && Intrinsics.areEqual(this.icon, suggestion.icon) && Intrinsics.areEqual(this.campaign_category, suggestion.campaign_category) && Intrinsics.areEqual(this.prompt, suggestion.prompt) && Intrinsics.areEqual(this.id, suggestion.id) && Intrinsics.areEqual(this.view_cdf_events, suggestion.view_cdf_events) && Intrinsics.areEqual(this.tap_cdf_events, suggestion.tap_cdf_events);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.body_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.label_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Icon icon = this.icon;
        int hashCode4 = (hashCode3 + (icon != null ? icon.hashCode() : 0)) * 37;
        String str3 = this.campaign_category;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.prompt;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.id;
        int hashCode7 = this.tap_cdf_events.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37, 37, this.view_cdf_events);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.body_text = this.body_text;
        builder.label_text = this.label_text;
        builder.icon = this.icon;
        builder.campaign_category = this.campaign_category;
        builder.prompt = this.prompt;
        builder.id = this.id;
        builder.view_cdf_events = this.view_cdf_events;
        builder.tap_cdf_events = this.tap_cdf_events;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.body_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "body_text=", arrayList);
        }
        String str2 = this.label_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "label_text=", arrayList);
        }
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        String str3 = this.campaign_category;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "campaign_category=", arrayList);
        }
        String str4 = this.prompt;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "prompt=", arrayList);
        }
        String str5 = this.id;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "id=", arrayList);
        }
        if (!this.view_cdf_events.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("view_cdf_events=", arrayList, this.view_cdf_events);
        }
        if (!this.tap_cdf_events.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tap_cdf_events=", arrayList, this.tap_cdf_events);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Suggestion{", "}", 0, null, null, 56);
    }
}
