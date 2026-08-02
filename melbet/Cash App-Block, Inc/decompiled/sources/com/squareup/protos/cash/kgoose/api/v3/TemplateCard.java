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

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCard;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCard$Builder;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "display_template", "Lcom/squareup/protos/cash/localization/LocalizedString;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker;", "bottom_picker", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior;", "tap_behavior", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior;", "description", "", "non_editable", "Ljava/lang/Boolean;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardFooterSection;", "footer_section", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardFooterSection;", "", "source_placeholder_key", "Ljava/lang/String;", "target_placeholder_key", "", "Lcom/squareup/protos/cash/kgoose/api/v3/InlineContent;", "inline_content", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TemplateCard> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TemplateCardBottomPicker#ADAPTER", schemaIndex = 2, tag = 3)
    public final TemplateCardBottomPicker bottom_picker;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 4, tag = 5)
    public final LocalizedString description;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
    public final LocalizedString display_template;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TemplateCardFooterSection#ADAPTER", schemaIndex = 6, tag = 7)
    public final TemplateCardFooterSection footer_section;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.InlineContent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<InlineContent> inline_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    public final Boolean non_editable;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String source_placeholder_key;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TemplateCardTapBehavior#ADAPTER", schemaIndex = 3, tag = 4)
    public final TemplateCardTapBehavior tap_behavior;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    public final String target_placeholder_key;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCard$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCard;", "<init>", "()V", "display_template", "Lcom/squareup/protos/cash/localization/LocalizedString;", "inline_content", "", "Lcom/squareup/protos/cash/kgoose/api/v3/InlineContent;", "bottom_picker", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker;", "tap_behavior", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior;", "description", "non_editable", "", "Ljava/lang/Boolean;", "footer_section", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardFooterSection;", "source_placeholder_key", "", "target_placeholder_key", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCard$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public TemplateCardBottomPicker bottom_picker;
        public LocalizedString description;
        public LocalizedString display_template;
        public TemplateCardFooterSection footer_section;
        public List<InlineContent> inline_content = EmptyList.INSTANCE;
        public Boolean non_editable;
        public String source_placeholder_key;
        public TemplateCardTapBehavior tap_behavior;
        public String target_placeholder_key;

        public final Builder bottom_picker(TemplateCardBottomPicker bottom_picker) {
            this.bottom_picker = bottom_picker;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public TemplateCard build() {
            return new TemplateCard(this.display_template, this.inline_content, this.bottom_picker, this.tap_behavior, this.description, this.non_editable, this.footer_section, this.source_placeholder_key, this.target_placeholder_key, buildUnknownFields());
        }

        public final Builder description(LocalizedString description) {
            this.description = description;
            return this;
        }

        public final Builder display_template(LocalizedString display_template) {
            this.display_template = display_template;
            return this;
        }

        public final Builder footer_section(TemplateCardFooterSection footer_section) {
            this.footer_section = footer_section;
            return this;
        }

        public final Builder inline_content(List<InlineContent> inline_content) {
            inline_content.getClass();
            TransactorKt.checkElementsNotNull(inline_content);
            this.inline_content = inline_content;
            return this;
        }

        public final Builder non_editable(Boolean non_editable) {
            this.non_editable = non_editable;
            return this;
        }

        public final Builder source_placeholder_key(String source_placeholder_key) {
            this.source_placeholder_key = source_placeholder_key;
            return this;
        }

        public final Builder tap_behavior(TemplateCardTapBehavior tap_behavior) {
            this.tap_behavior = tap_behavior;
            return this;
        }

        public final Builder target_placeholder_key(String target_placeholder_key) {
            this.target_placeholder_key = target_placeholder_key;
            return this;
        }
    }

    static {
        TemplateCard$Companion$ADAPTER$1 templateCard$Companion$ADAPTER$1 = new TemplateCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TemplateCard.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.TemplateCard", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = templateCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(templateCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateCard(LocalizedString localizedString, List list, TemplateCardBottomPicker templateCardBottomPicker, TemplateCardTapBehavior templateCardTapBehavior, LocalizedString localizedString2, Boolean bool, TemplateCardFooterSection templateCardFooterSection, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.display_template = localizedString;
        this.bottom_picker = templateCardBottomPicker;
        this.tap_behavior = templateCardTapBehavior;
        this.description = localizedString2;
        this.non_editable = bool;
        this.footer_section = templateCardFooterSection;
        this.source_placeholder_key = str;
        this.target_placeholder_key = str2;
        this.inline_content = TransactorKt.immutableCopyOf("inline_content", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TemplateCard)) {
            return false;
        }
        TemplateCard templateCard = (TemplateCard) obj;
        return Intrinsics.areEqual(unknownFields(), templateCard.unknownFields()) && Intrinsics.areEqual(this.display_template, templateCard.display_template) && Intrinsics.areEqual(this.inline_content, templateCard.inline_content) && Intrinsics.areEqual(this.bottom_picker, templateCard.bottom_picker) && Intrinsics.areEqual(this.tap_behavior, templateCard.tap_behavior) && Intrinsics.areEqual(this.description, templateCard.description) && Intrinsics.areEqual(this.non_editable, templateCard.non_editable) && Intrinsics.areEqual(this.footer_section, templateCard.footer_section) && Intrinsics.areEqual(this.source_placeholder_key, templateCard.source_placeholder_key) && Intrinsics.areEqual(this.target_placeholder_key, templateCard.target_placeholder_key);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.display_template;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.inline_content);
        TemplateCardBottomPicker templateCardBottomPicker = this.bottom_picker;
        int hashCode2 = (m + (templateCardBottomPicker != null ? templateCardBottomPicker.hashCode() : 0)) * 37;
        TemplateCardTapBehavior templateCardTapBehavior = this.tap_behavior;
        int hashCode3 = (hashCode2 + (templateCardTapBehavior != null ? templateCardTapBehavior.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.description;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Boolean bool = this.non_editable;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        TemplateCardFooterSection templateCardFooterSection = this.footer_section;
        int hashCode6 = (hashCode5 + (templateCardFooterSection != null ? templateCardFooterSection.hashCode() : 0)) * 37;
        String str = this.source_placeholder_key;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.target_placeholder_key;
        int hashCode8 = hashCode7 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.display_template = this.display_template;
        builder.inline_content = this.inline_content;
        builder.bottom_picker = this.bottom_picker;
        builder.tap_behavior = this.tap_behavior;
        builder.description = this.description;
        builder.non_editable = this.non_editable;
        builder.footer_section = this.footer_section;
        builder.source_placeholder_key = this.source_placeholder_key;
        builder.target_placeholder_key = this.target_placeholder_key;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.display_template;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("display_template=", localizedString, arrayList);
        }
        if (!this.inline_content.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("inline_content=", arrayList, this.inline_content);
        }
        TemplateCardBottomPicker templateCardBottomPicker = this.bottom_picker;
        if (templateCardBottomPicker != null) {
            arrayList.add("bottom_picker=" + templateCardBottomPicker);
        }
        TemplateCardTapBehavior templateCardTapBehavior = this.tap_behavior;
        if (templateCardTapBehavior != null) {
            arrayList.add("tap_behavior=" + templateCardTapBehavior);
        }
        LocalizedString localizedString2 = this.description;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("description=", localizedString2, arrayList);
        }
        Boolean bool = this.non_editable;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("non_editable=", bool, arrayList);
        }
        TemplateCardFooterSection templateCardFooterSection = this.footer_section;
        if (templateCardFooterSection != null) {
            arrayList.add("footer_section=" + templateCardFooterSection);
        }
        String str = this.source_placeholder_key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "source_placeholder_key=", arrayList);
        }
        String str2 = this.target_placeholder_key;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "target_placeholder_key=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TemplateCard{", "}", 0, null, null, 56);
    }
}
