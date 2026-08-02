package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.ui.UiControl;
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
import squareup.cash.savings.GoalFolder;

/* loaded from: classes8.dex */
public final class LimitsPageletInlineMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LimitsPageletInlineMessage> CREATOR;
    public final Icon icon;
    public final LocalizableString localizable_main_text;
    public final LocalizableString localizable_subtext;
    public final String main_text;
    public final LimitsPageletInlineMessageButton primary_button;
    public final LimitsPageletInlineMessageButton secondary_button;
    public final String subtext;
    public final Long version;

    public enum Icon implements WireEnum {
        VERIFYING(1),
        DECREASE(2),
        FAILED(3),
        ALERT(4),
        REPORTED(5);

        public final int value;
        public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
        public static final LimitsPageletInlineMessage$Icon$Companion$ADAPTER$1 ADAPTER = new LimitsPageletInlineMessage$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, null);

        Icon(int i) {
            this.value = i;
        }

        public static final Icon fromValue(int i) {
            Companion.getClass();
            return UiControl.Type.Companion.m3967fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LimitsPageletInlineMessage$Companion$ADAPTER$1 limitsPageletInlineMessage$Companion$ADAPTER$1 = new LimitsPageletInlineMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LimitsPageletInlineMessage.class), "type.googleapis.com/squareup.franklin.ui.LimitsPageletInlineMessage", Syntax.PROTO_2, null, "squareup/franklin/ui/limits_pagelet_inline_message.proto");
        ADAPTER = limitsPageletInlineMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(limitsPageletInlineMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitsPageletInlineMessage(Icon icon, String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, LimitsPageletInlineMessageButton limitsPageletInlineMessageButton, LimitsPageletInlineMessageButton limitsPageletInlineMessageButton2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = icon;
        this.main_text = str;
        this.localizable_main_text = localizableString;
        this.subtext = str2;
        this.localizable_subtext = localizableString2;
        this.primary_button = limitsPageletInlineMessageButton;
        this.secondary_button = limitsPageletInlineMessageButton2;
        this.version = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LimitsPageletInlineMessage)) {
            return false;
        }
        LimitsPageletInlineMessage limitsPageletInlineMessage = (LimitsPageletInlineMessage) obj;
        return Intrinsics.areEqual(unknownFields(), limitsPageletInlineMessage.unknownFields()) && this.icon == limitsPageletInlineMessage.icon && Intrinsics.areEqual(this.main_text, limitsPageletInlineMessage.main_text) && Intrinsics.areEqual(this.localizable_main_text, limitsPageletInlineMessage.localizable_main_text) && Intrinsics.areEqual(this.subtext, limitsPageletInlineMessage.subtext) && Intrinsics.areEqual(this.localizable_subtext, limitsPageletInlineMessage.localizable_subtext) && Intrinsics.areEqual(this.primary_button, limitsPageletInlineMessage.primary_button) && Intrinsics.areEqual(this.secondary_button, limitsPageletInlineMessage.secondary_button) && Intrinsics.areEqual(this.version, limitsPageletInlineMessage.version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        String str = this.main_text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_main_text;
        int hashCode4 = (hashCode3 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        String str2 = this.subtext;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localizable_subtext;
        int hashCode6 = (hashCode5 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
        LimitsPageletInlineMessageButton limitsPageletInlineMessageButton = this.primary_button;
        int hashCode7 = (hashCode6 + (limitsPageletInlineMessageButton != null ? limitsPageletInlineMessageButton.hashCode() : 0)) * 37;
        LimitsPageletInlineMessageButton limitsPageletInlineMessageButton2 = this.secondary_button;
        int hashCode8 = (hashCode7 + (limitsPageletInlineMessageButton2 != null ? limitsPageletInlineMessageButton2.hashCode() : 0)) * 37;
        Long l = this.version;
        int hashCode9 = hashCode8 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GoalFolder.Builder builder = new GoalFolder.Builder(4);
        builder.completion_token = this.icon;
        builder.token = this.main_text;
        builder.label = this.localizable_main_text;
        builder.icon_unicode = this.subtext;
        builder.goal_flow_parameters = this.localizable_subtext;
        builder.met_goal = this.primary_button;
        builder.goal_amount = this.secondary_button;
        builder.goal_progress_percentage = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        if (this.main_text != null) {
            arrayList.add("main_text=██");
        }
        LocalizableString localizableString = this.localizable_main_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_main_text=", localizableString, arrayList);
        }
        if (this.subtext != null) {
            arrayList.add("subtext=██");
        }
        LocalizableString localizableString2 = this.localizable_subtext;
        if (localizableString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_subtext=", localizableString2, arrayList);
        }
        LimitsPageletInlineMessageButton limitsPageletInlineMessageButton = this.primary_button;
        if (limitsPageletInlineMessageButton != null) {
            arrayList.add("primary_button=" + limitsPageletInlineMessageButton);
        }
        LimitsPageletInlineMessageButton limitsPageletInlineMessageButton2 = this.secondary_button;
        if (limitsPageletInlineMessageButton2 != null) {
            arrayList.add("secondary_button=" + limitsPageletInlineMessageButton2);
        }
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LimitsPageletInlineMessage{", "}", 0, null, null, 56);
    }
}
