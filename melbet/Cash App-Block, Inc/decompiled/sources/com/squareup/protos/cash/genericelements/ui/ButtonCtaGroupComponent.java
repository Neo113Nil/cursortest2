package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ButtonCtaGroupComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ButtonCtaGroupComponent> CREATOR;
    public final List buttons;
    public final Direction direction;
    public final Boolean show_horizontal_divider;
    public final String text;

    public enum Direction implements WireEnum {
        Horizontal(1),
        Vertical(2);

        public final int value;
        public static final RadioType.Companion Companion = new RadioType.Companion();
        public static final ButtonCtaGroupComponent$Direction$Companion$ADAPTER$1 ADAPTER = new ButtonCtaGroupComponent$Direction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Direction.class), Syntax.PROTO_2, null);

        Direction(int i) {
            this.value = i;
        }

        public static final Direction fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return Horizontal;
            }
            if (i != 2) {
                return null;
            }
            return Vertical;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ButtonCtaGroupComponent$Companion$ADAPTER$1 buttonCtaGroupComponent$Companion$ADAPTER$1 = new ButtonCtaGroupComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ButtonCtaGroupComponent.class), "type.googleapis.com/squareup.cash.genericelements.ui.ButtonCtaGroupComponent", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = buttonCtaGroupComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(buttonCtaGroupComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonCtaGroupComponent(Direction direction, String str, Boolean bool, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.direction = direction;
        this.text = str;
        this.show_horizontal_divider = bool;
        this.buttons = TransactorKt.immutableCopyOf("buttons", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ButtonCtaGroupComponent)) {
            return false;
        }
        ButtonCtaGroupComponent buttonCtaGroupComponent = (ButtonCtaGroupComponent) obj;
        return Intrinsics.areEqual(unknownFields(), buttonCtaGroupComponent.unknownFields()) && this.direction == buttonCtaGroupComponent.direction && Intrinsics.areEqual(this.text, buttonCtaGroupComponent.text) && Intrinsics.areEqual(this.show_horizontal_divider, buttonCtaGroupComponent.show_horizontal_divider) && Intrinsics.areEqual(this.buttons, buttonCtaGroupComponent.buttons);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Direction direction = this.direction;
        int hashCode2 = (hashCode + (direction != null ? direction.hashCode() : 0)) * 37;
        String str = this.text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.show_horizontal_divider;
        int hashCode4 = this.buttons.hashCode() + ((hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(10, false);
        builder.last_four_digits = this.direction;
        builder.postal_code = this.text;
        builder.expiration = this.show_horizontal_divider;
        builder.ciphertext_ = this.buttons;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Direction direction = this.direction;
        if (direction != null) {
            arrayList.add("direction=" + direction);
        }
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        Boolean bool = this.show_horizontal_divider;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_horizontal_divider=", bool, arrayList);
        }
        List list = this.buttons;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("buttons=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonCtaGroupComponent{", "}", 0, null, null, 56);
    }
}
