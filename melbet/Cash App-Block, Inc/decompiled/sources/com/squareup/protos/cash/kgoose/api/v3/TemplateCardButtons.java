package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\u0007R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardButtons;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardButtons$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardButton;", "primary_button", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardButton;", "secondary_button", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCardButtons extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TemplateCardButtons> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TemplateCardButton#ADAPTER", schemaIndex = 0, tag = 1)
    public final TemplateCardButton primary_button;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TemplateCardButton#ADAPTER", schemaIndex = 1, tag = 2)
    public final TemplateCardButton secondary_button;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardButtons$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardButtons;", "<init>", "()V", "primary_button", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardButton;", "secondary_button", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public TemplateCardButton primary_button;
        public TemplateCardButton secondary_button;

        @Override // com.squareup.wire.Message.Builder
        public TemplateCardButtons build() {
            return new TemplateCardButtons(this.primary_button, this.secondary_button, buildUnknownFields());
        }

        public final Builder primary_button(TemplateCardButton primary_button) {
            this.primary_button = primary_button;
            return this;
        }

        public final Builder secondary_button(TemplateCardButton secondary_button) {
            this.secondary_button = secondary_button;
            return this;
        }
    }

    static {
        TemplateCardButtons$Companion$ADAPTER$1 templateCardButtons$Companion$ADAPTER$1 = new TemplateCardButtons$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TemplateCardButtons.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.TemplateCardButtons", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = templateCardButtons$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(templateCardButtons$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateCardButtons(TemplateCardButton templateCardButton, TemplateCardButton templateCardButton2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.primary_button = templateCardButton;
        this.secondary_button = templateCardButton2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TemplateCardButtons)) {
            return false;
        }
        TemplateCardButtons templateCardButtons = (TemplateCardButtons) obj;
        return Intrinsics.areEqual(unknownFields(), templateCardButtons.unknownFields()) && Intrinsics.areEqual(this.primary_button, templateCardButtons.primary_button) && Intrinsics.areEqual(this.secondary_button, templateCardButtons.secondary_button);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TemplateCardButton templateCardButton = this.primary_button;
        int hashCode2 = (hashCode + (templateCardButton != null ? templateCardButton.hashCode() : 0)) * 37;
        TemplateCardButton templateCardButton2 = this.secondary_button;
        int hashCode3 = hashCode2 + (templateCardButton2 != null ? templateCardButton2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.primary_button = this.primary_button;
        builder.secondary_button = this.secondary_button;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TemplateCardButton templateCardButton = this.primary_button;
        if (templateCardButton != null) {
            arrayList.add("primary_button=" + templateCardButton);
        }
        TemplateCardButton templateCardButton2 = this.secondary_button;
        if (templateCardButton2 != null) {
            arrayList.add("secondary_button=" + templateCardButton2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TemplateCardButtons{", "}", 0, null, null, 56);
    }
}
