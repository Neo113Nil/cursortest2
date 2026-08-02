package com.squareup.protos.cash.composer.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
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

/* loaded from: classes7.dex */
public final class ButtonElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ButtonElement> CREATOR;
    public final String analytics_key;
    public final ButtonStyle style;
    public final String text;
    public final String url;

    public enum ButtonStyle implements WireEnum {
        PRIMARY(1),
        SECONDARY(2);

        public final int value;
        public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
        public static final ButtonElement$ButtonStyle$Companion$ADAPTER$1 ADAPTER = new ButtonElement$ButtonStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ButtonStyle.class), Syntax.PROTO_2, null);

        ButtonStyle(int i) {
            this.value = i;
        }

        public static final ButtonStyle fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return PRIMARY;
            }
            if (i != 2) {
                return null;
            }
            return SECONDARY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ButtonElement$Companion$ADAPTER$1 buttonElement$Companion$ADAPTER$1 = new ButtonElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ButtonElement.class), "type.googleapis.com/squareup.cash.composer.app.ButtonElement", Syntax.PROTO_2, null, "squareup/cash/composer/app/CardTabNullStateV2.proto");
        ADAPTER = buttonElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(buttonElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonElement(String str, ButtonStyle buttonStyle, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.style = buttonStyle;
        this.url = str2;
        this.analytics_key = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ButtonElement)) {
            return false;
        }
        ButtonElement buttonElement = (ButtonElement) obj;
        return Intrinsics.areEqual(unknownFields(), buttonElement.unknownFields()) && Intrinsics.areEqual(this.text, buttonElement.text) && this.style == buttonElement.style && Intrinsics.areEqual(this.url, buttonElement.url) && Intrinsics.areEqual(this.analytics_key, buttonElement.analytics_key);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ButtonStyle buttonStyle = this.style;
        int hashCode3 = (hashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 37;
        String str2 = this.url;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.analytics_key;
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(25, false);
        builder.title = this.text;
        builder.icon = this.style;
        builder.enabled = this.url;
        builder.id = this.analytics_key;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        ButtonStyle buttonStyle = this.style;
        if (buttonStyle != null) {
            arrayList.add("style=" + buttonStyle);
        }
        String str2 = this.url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url=", arrayList);
        }
        String str3 = this.analytics_key;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "analytics_key=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonElement{", "}", 0, null, null, 56);
    }
}
