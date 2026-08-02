package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardFooterSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardFooterSection$Builder;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "display_template", "description", "", "Lcom/squareup/protos/cash/kgoose/api/v3/InlineContent;", "inline_content", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCardFooterSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TemplateCardFooterSection> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 3, tag = 4)
    public final LocalizedString description;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalizedString display_template;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.InlineContent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<InlineContent> inline_content;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
    public final LocalizedString title;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardFooterSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardFooterSection;", "<init>", "()V", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "display_template", "inline_content", "", "Lcom/squareup/protos/cash/kgoose/api/v3/InlineContent;", "description", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public LocalizedString description;
        public LocalizedString display_template;
        public List<InlineContent> inline_content = EmptyList.INSTANCE;
        public LocalizedString title;

        @Override // com.squareup.wire.Message.Builder
        public TemplateCardFooterSection build() {
            return new TemplateCardFooterSection(this.title, this.display_template, this.inline_content, this.description, buildUnknownFields());
        }

        public final Builder description(LocalizedString description) {
            this.description = description;
            return this;
        }

        public final Builder display_template(LocalizedString display_template) {
            this.display_template = display_template;
            return this;
        }

        public final Builder inline_content(List<InlineContent> inline_content) {
            inline_content.getClass();
            TransactorKt.checkElementsNotNull(inline_content);
            this.inline_content = inline_content;
            return this;
        }

        public final Builder title(LocalizedString title) {
            this.title = title;
            return this;
        }
    }

    static {
        TemplateCardFooterSection$Companion$ADAPTER$1 templateCardFooterSection$Companion$ADAPTER$1 = new TemplateCardFooterSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TemplateCardFooterSection.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.TemplateCardFooterSection", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = templateCardFooterSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(templateCardFooterSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateCardFooterSection(LocalizedString localizedString, LocalizedString localizedString2, List list, LocalizedString localizedString3, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = localizedString;
        this.display_template = localizedString2;
        this.description = localizedString3;
        this.inline_content = TransactorKt.immutableCopyOf("inline_content", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TemplateCardFooterSection)) {
            return false;
        }
        TemplateCardFooterSection templateCardFooterSection = (TemplateCardFooterSection) obj;
        return Intrinsics.areEqual(unknownFields(), templateCardFooterSection.unknownFields()) && Intrinsics.areEqual(this.title, templateCardFooterSection.title) && Intrinsics.areEqual(this.display_template, templateCardFooterSection.display_template) && Intrinsics.areEqual(this.inline_content, templateCardFooterSection.inline_content) && Intrinsics.areEqual(this.description, templateCardFooterSection.description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.display_template;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37, 37, this.inline_content);
        LocalizedString localizedString3 = this.description;
        int hashCode3 = m + (localizedString3 != null ? localizedString3.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.display_template = this.display_template;
        builder.inline_content = this.inline_content;
        builder.description = this.description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.display_template;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("display_template=", localizedString2, arrayList);
        }
        if (!this.inline_content.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("inline_content=", arrayList, this.inline_content);
        }
        LocalizedString localizedString3 = this.description;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("description=", localizedString3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TemplateCardFooterSection{", "}", 0, null, null, 56);
    }
}
