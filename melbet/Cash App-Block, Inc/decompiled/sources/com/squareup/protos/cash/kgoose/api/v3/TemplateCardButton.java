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
import squareup.cash.ui.arcade.elements.ActionableButtonDefault;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardButton;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardButton$Builder;", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "button", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction;", "action", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction;", "", "hidden_message_template", "Ljava/lang/String;", "getHidden_message_template$annotations", "()V", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCardButton extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TemplateCardButton> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TemplateCardAction#ADAPTER", schemaIndex = 1, tag = 2)
    public final TemplateCardAction action;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.ActionableButtonDefault#ADAPTER", schemaIndex = 0, tag = 1)
    public final ActionableButtonDefault button;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String hidden_message_template;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0012\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardButton$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardButton;", "<init>", "()V", "button", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "action", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction;", "hidden_message_template", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public TemplateCardAction action;
        public ActionableButtonDefault button;
        public String hidden_message_template;

        public final Builder action(TemplateCardAction action) {
            this.action = action;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public TemplateCardButton build() {
            return new TemplateCardButton(this.button, this.action, this.hidden_message_template, buildUnknownFields());
        }

        public final Builder button(ActionableButtonDefault button) {
            this.button = button;
            return this;
        }

        @Deprecated
        public final Builder hidden_message_template(String hidden_message_template) {
            this.hidden_message_template = hidden_message_template;
            return this;
        }
    }

    static {
        TemplateCardButton$Companion$ADAPTER$1 templateCardButton$Companion$ADAPTER$1 = new TemplateCardButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TemplateCardButton.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.TemplateCardButton", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = templateCardButton$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(templateCardButton$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateCardButton(ActionableButtonDefault actionableButtonDefault, TemplateCardAction templateCardAction, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.button = actionableButtonDefault;
        this.action = templateCardAction;
        this.hidden_message_template = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TemplateCardButton)) {
            return false;
        }
        TemplateCardButton templateCardButton = (TemplateCardButton) obj;
        return Intrinsics.areEqual(unknownFields(), templateCardButton.unknownFields()) && Intrinsics.areEqual(this.button, templateCardButton.button) && Intrinsics.areEqual(this.action, templateCardButton.action) && Intrinsics.areEqual(this.hidden_message_template, templateCardButton.hidden_message_template);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActionableButtonDefault actionableButtonDefault = this.button;
        int hashCode2 = (hashCode + (actionableButtonDefault != null ? actionableButtonDefault.hashCode() : 0)) * 37;
        TemplateCardAction templateCardAction = this.action;
        int hashCode3 = (hashCode2 + (templateCardAction != null ? templateCardAction.hashCode() : 0)) * 37;
        String str = this.hidden_message_template;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.button = this.button;
        builder.action = this.action;
        builder.hidden_message_template = this.hidden_message_template;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActionableButtonDefault actionableButtonDefault = this.button;
        if (actionableButtonDefault != null) {
            arrayList.add("button=" + actionableButtonDefault);
        }
        TemplateCardAction templateCardAction = this.action;
        if (templateCardAction != null) {
            arrayList.add("action=" + templateCardAction);
        }
        String str = this.hidden_message_template;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "hidden_message_template=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TemplateCardButton{", "}", 0, null, null, 56);
    }
}
