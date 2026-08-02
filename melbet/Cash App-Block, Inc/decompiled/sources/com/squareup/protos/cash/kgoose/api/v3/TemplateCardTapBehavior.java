package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior$Behavior;", "behavior", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior$Behavior;", "Companion", "Builder", "Behavior", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCardTapBehavior extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TemplateCardTapBehavior> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final Behavior behavior;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior$Behavior;", "", "TapAction", "CardButtons", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior$Behavior$CardButtons;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior$Behavior$TapAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Behavior {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TemplateCardButtons#ADAPTER", declaredName = "card_buttons", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior$Behavior$CardButtons;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior$Behavior;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardButtons;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardButtons;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardButtons;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CardButtons extends Behavior {
            private final TemplateCardButtons value;

            public CardButtons(TemplateCardButtons templateCardButtons) {
                templateCardButtons.getClass();
                this.value = templateCardButtons;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardButtons) && Intrinsics.areEqual(this.value, ((CardButtons) obj).value);
            }

            public final TemplateCardButtons getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CardButtons(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TemplateCardTapAction#ADAPTER", declaredName = "tap_action", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior$Behavior$TapAction;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior$Behavior;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapAction;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapAction;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class TapAction extends Behavior {
            private final TemplateCardTapAction value;

            public TapAction(TemplateCardTapAction templateCardTapAction) {
                templateCardTapAction.getClass();
                this.value = templateCardTapAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TapAction) && Intrinsics.areEqual(this.value, ((TapAction) obj).value);
            }

            public final TemplateCardTapAction getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "TapAction(value=" + this.value + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior;", "<init>", "()V", "behavior", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior$Behavior;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Behavior behavior;

        public final Builder behavior(Behavior behavior) {
            this.behavior = behavior;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public TemplateCardTapBehavior build() {
            return new TemplateCardTapBehavior(this.behavior, buildUnknownFields());
        }
    }

    static {
        TemplateCardTapBehavior$Companion$ADAPTER$1 templateCardTapBehavior$Companion$ADAPTER$1 = new TemplateCardTapBehavior$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TemplateCardTapBehavior.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.TemplateCardTapBehavior", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = templateCardTapBehavior$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(templateCardTapBehavior$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateCardTapBehavior(Behavior behavior, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.behavior = behavior;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TemplateCardTapBehavior)) {
            return false;
        }
        TemplateCardTapBehavior templateCardTapBehavior = (TemplateCardTapBehavior) obj;
        return Intrinsics.areEqual(unknownFields(), templateCardTapBehavior.unknownFields()) && Intrinsics.areEqual(this.behavior, templateCardTapBehavior.behavior);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Behavior behavior = this.behavior;
        int hashCode2 = hashCode + (behavior != null ? behavior.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.behavior = this.behavior;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Behavior behavior = this.behavior;
        if (behavior != null) {
            arrayList.add("behavior=" + behavior);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TemplateCardTapBehavior{", "}", 0, null, null, 56);
    }
}
