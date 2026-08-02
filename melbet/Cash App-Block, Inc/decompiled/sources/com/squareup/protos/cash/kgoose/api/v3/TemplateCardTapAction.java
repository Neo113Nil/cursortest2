package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapAction$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction;", "action", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction;", "", "hidden_message_template", "Ljava/lang/String;", "getHidden_message_template$annotations", "()V", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCardTapAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TemplateCardTapAction> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TemplateCardAction#ADAPTER", schemaIndex = 0, tag = 1)
    public final TemplateCardAction action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String hidden_message_template;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapAction;", "<init>", "()V", "action", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction;", "hidden_message_template", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public TemplateCardAction action;
        public String hidden_message_template;

        public final Builder action(TemplateCardAction action) {
            this.action = action;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public TemplateCardTapAction build() {
            return new TemplateCardTapAction(this.action, this.hidden_message_template, buildUnknownFields());
        }

        @Deprecated
        public final Builder hidden_message_template(String hidden_message_template) {
            this.hidden_message_template = hidden_message_template;
            return this;
        }
    }

    static {
        TemplateCardTapAction$Companion$ADAPTER$1 templateCardTapAction$Companion$ADAPTER$1 = new TemplateCardTapAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TemplateCardTapAction.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.TemplateCardTapAction", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = templateCardTapAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(templateCardTapAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateCardTapAction(TemplateCardAction templateCardAction, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action = templateCardAction;
        this.hidden_message_template = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TemplateCardTapAction)) {
            return false;
        }
        TemplateCardTapAction templateCardTapAction = (TemplateCardTapAction) obj;
        return Intrinsics.areEqual(unknownFields(), templateCardTapAction.unknownFields()) && Intrinsics.areEqual(this.action, templateCardTapAction.action) && Intrinsics.areEqual(this.hidden_message_template, templateCardTapAction.hidden_message_template);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TemplateCardAction templateCardAction = this.action;
        int hashCode2 = (hashCode + (templateCardAction != null ? templateCardAction.hashCode() : 0)) * 37;
        String str = this.hidden_message_template;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.action = this.action;
        builder.hidden_message_template = this.hidden_message_template;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TemplateCardAction templateCardAction = this.action;
        if (templateCardAction != null) {
            arrayList.add("action=" + templateCardAction);
        }
        String str = this.hidden_message_template;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "hidden_message_template=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TemplateCardTapAction{", "}", 0, null, null, 56);
    }
}
