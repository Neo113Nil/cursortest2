package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SlottedCard;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlottedCard$Builder;", "Lcom/squareup/protos/cash/localization/LocalizedString;", AnnotatedPrivateKey.LABEL, "Lcom/squareup/protos/cash/localization/LocalizedString;", "text", "subtext", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent;", "slot", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SlottedCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SlottedCard> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
    public final LocalizedString label;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.SlotContent#ADAPTER", schemaIndex = 3, tag = 4)
    public final SlotContent slot;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
    public final LocalizedString subtext;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalizedString text;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SlottedCard$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlottedCard;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "Lcom/squareup/protos/cash/localization/LocalizedString;", "text", "subtext", "slot", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public LocalizedString label;
        public SlotContent slot;
        public LocalizedString subtext;
        public LocalizedString text;

        @Override // com.squareup.wire.Message.Builder
        public SlottedCard build() {
            return new SlottedCard(this.label, this.text, this.subtext, this.slot, buildUnknownFields());
        }

        public final Builder label(LocalizedString label) {
            this.label = label;
            return this;
        }

        public final Builder slot(SlotContent slot) {
            this.slot = slot;
            return this;
        }

        public final Builder subtext(LocalizedString subtext) {
            this.subtext = subtext;
            return this;
        }

        public final Builder text(LocalizedString text) {
            this.text = text;
            return this;
        }
    }

    static {
        SlottedCard$Companion$ADAPTER$1 slottedCard$Companion$ADAPTER$1 = new SlottedCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SlottedCard.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.SlottedCard", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
        ADAPTER = slottedCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(slottedCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlottedCard(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, SlotContent slotContent, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.label = localizedString;
        this.text = localizedString2;
        this.subtext = localizedString3;
        this.slot = slotContent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SlottedCard)) {
            return false;
        }
        SlottedCard slottedCard = (SlottedCard) obj;
        return Intrinsics.areEqual(unknownFields(), slottedCard.unknownFields()) && Intrinsics.areEqual(this.label, slottedCard.label) && Intrinsics.areEqual(this.text, slottedCard.text) && Intrinsics.areEqual(this.subtext, slottedCard.subtext) && Intrinsics.areEqual(this.slot, slottedCard.slot);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.label;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.text;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.subtext;
        int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
        SlotContent slotContent = this.slot;
        int hashCode5 = hashCode4 + (slotContent != null ? slotContent.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.label = this.label;
        builder.text = this.text;
        builder.subtext = this.subtext;
        builder.slot = this.slot;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.label;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("label=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.text;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("text=", localizedString2, arrayList);
        }
        LocalizedString localizedString3 = this.subtext;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtext=", localizedString3, arrayList);
        }
        SlotContent slotContent = this.slot;
        if (slotContent != null) {
            arrayList.add("slot=" + slotContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SlottedCard{", "}", 0, null, null, 56);
    }
}
