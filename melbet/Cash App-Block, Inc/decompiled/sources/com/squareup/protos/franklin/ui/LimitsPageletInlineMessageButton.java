package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LimitsPageletInlineMessageButton extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LimitsPageletInlineMessageButton> CREATOR;
    public final ButtonAction button_action;
    public final LocalizableString localizable_text;
    public final String text;
    public final String url_to_open;

    public enum ButtonAction implements WireEnum {
        OPEN_URL(1),
        DISMISS(2);

        public final int value;
        public static final LinkResult.Companion Companion = new LinkResult.Companion();
        public static final LimitsPageletInlineMessageButton$ButtonAction$Companion$ADAPTER$1 ADAPTER = new LimitsPageletInlineMessageButton$ButtonAction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ButtonAction.class), Syntax.PROTO_2, null);

        ButtonAction(int i) {
            this.value = i;
        }

        public static final ButtonAction fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return OPEN_URL;
            }
            if (i != 2) {
                return null;
            }
            return DISMISS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LimitsPageletInlineMessageButton$Companion$ADAPTER$1 limitsPageletInlineMessageButton$Companion$ADAPTER$1 = new LimitsPageletInlineMessageButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LimitsPageletInlineMessageButton.class), "type.googleapis.com/squareup.franklin.ui.LimitsPageletInlineMessageButton", Syntax.PROTO_2, null, "squareup/franklin/ui/limits_pagelet_inline_message.proto");
        ADAPTER = limitsPageletInlineMessageButton$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(limitsPageletInlineMessageButton$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitsPageletInlineMessageButton(String str, LocalizableString localizableString, ButtonAction buttonAction, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.localizable_text = localizableString;
        this.button_action = buttonAction;
        this.url_to_open = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LimitsPageletInlineMessageButton)) {
            return false;
        }
        LimitsPageletInlineMessageButton limitsPageletInlineMessageButton = (LimitsPageletInlineMessageButton) obj;
        return Intrinsics.areEqual(unknownFields(), limitsPageletInlineMessageButton.unknownFields()) && Intrinsics.areEqual(this.text, limitsPageletInlineMessageButton.text) && Intrinsics.areEqual(this.localizable_text, limitsPageletInlineMessageButton.localizable_text) && this.button_action == limitsPageletInlineMessageButton.button_action && Intrinsics.areEqual(this.url_to_open, limitsPageletInlineMessageButton.url_to_open);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_text;
        int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        ButtonAction buttonAction = this.button_action;
        int hashCode4 = (hashCode3 + (buttonAction != null ? buttonAction.hashCode() : 0)) * 37;
        String str2 = this.url_to_open;
        int hashCode5 = hashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(9);
        builder.account = this.text;
        builder.enabled = this.localizable_text;
        builder.button = this.button_action;
        builder.dda_form = this.url_to_open;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        LocalizableString localizableString = this.localizable_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
        }
        ButtonAction buttonAction = this.button_action;
        if (buttonAction != null) {
            arrayList.add("button_action=" + buttonAction);
        }
        String str2 = this.url_to_open;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url_to_open=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LimitsPageletInlineMessageButton{", "}", 0, null, null, 56);
    }
}
