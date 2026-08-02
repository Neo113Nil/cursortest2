package com.squareup.protos.cash.appthemes;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.ui.Color;
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
public final class ButtonColors extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ButtonColors> CREATOR;
    public final Color currency_conversion_button_color;
    public final Color payment_pad_main_buttons_color;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Color currency_conversion_button_color;
        public Color payment_pad_main_buttons_color;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ButtonColors(this.currency_conversion_button_color, this.payment_pad_main_buttons_color, buildUnknownFields());
                default:
                    return new GenericProfileElement.ColorScheme(this.currency_conversion_button_color, this.payment_pad_main_buttons_color, buildUnknownFields());
            }
        }
    }

    static {
        ButtonColors$Companion$ADAPTER$1 buttonColors$Companion$ADAPTER$1 = new ButtonColors$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ButtonColors.class), "type.googleapis.com/squareup.cash.appthemes.ButtonColors", Syntax.PROTO_2, null, "squareup/cash/appthemes/app_theme_definitions.proto");
        ADAPTER = buttonColors$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(buttonColors$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonColors(Color color, Color color2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.currency_conversion_button_color = color;
        this.payment_pad_main_buttons_color = color2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ButtonColors)) {
            return false;
        }
        ButtonColors buttonColors = (ButtonColors) obj;
        return Intrinsics.areEqual(unknownFields(), buttonColors.unknownFields()) && Intrinsics.areEqual(this.currency_conversion_button_color, buttonColors.currency_conversion_button_color) && Intrinsics.areEqual(this.payment_pad_main_buttons_color, buttonColors.payment_pad_main_buttons_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Color color = this.currency_conversion_button_color;
        int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
        Color color2 = this.payment_pad_main_buttons_color;
        int hashCode3 = hashCode2 + (color2 != null ? color2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.currency_conversion_button_color = this.currency_conversion_button_color;
        builder.payment_pad_main_buttons_color = this.payment_pad_main_buttons_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Color color = this.currency_conversion_button_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("currency_conversion_button_color=", color, arrayList);
        }
        Color color2 = this.payment_pad_main_buttons_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("payment_pad_main_buttons_color=", color2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonColors{", "}", 0, null, null, 56);
    }
}
