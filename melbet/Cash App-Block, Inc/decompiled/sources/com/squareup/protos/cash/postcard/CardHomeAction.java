package com.squareup.protos.cash.postcard;

import android.os.Parcelable;
import com.datadog.android.rum.model.ErrorEvent;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardHomeAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardHomeAction> CREATOR;
    public final ErrorEvent.Dd.Companion action;
    public final Icon icon;
    public final Boolean is_disabled;

    static {
        CardHomeAction$Companion$ADAPTER$1 cardHomeAction$Companion$ADAPTER$1 = new CardHomeAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardHomeAction.class), "type.googleapis.com/squareup.cash.postcard.CardHomeAction", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
        ADAPTER = cardHomeAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardHomeAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardHomeAction(ErrorEvent.Dd.Companion companion, Icon icon, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action = companion;
        this.icon = icon;
        this.is_disabled = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardHomeAction)) {
            return false;
        }
        CardHomeAction cardHomeAction = (CardHomeAction) obj;
        return Intrinsics.areEqual(unknownFields(), cardHomeAction.unknownFields()) && Intrinsics.areEqual(this.action, cardHomeAction.action) && Intrinsics.areEqual(this.icon, cardHomeAction.icon) && Intrinsics.areEqual(this.is_disabled, cardHomeAction.is_disabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ErrorEvent.Dd.Companion companion = this.action;
        int hashCode2 = (hashCode + (companion != null ? companion.hashCode() : 0)) * 37;
        Icon icon = this.icon;
        int hashCode3 = (hashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
        Boolean bool = this.is_disabled;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(7);
        builder.modules = this.action;
        builder.overflow_modules = this.icon;
        builder.card_home_actions = this.is_disabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ErrorEvent.Dd.Companion companion = this.action;
        if (companion != null) {
            arrayList.add("action=" + companion);
        }
        Icon icon = this.icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
        }
        Boolean bool = this.is_disabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_disabled=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardHomeAction{", "}", 0, null, null, 56);
    }
}
