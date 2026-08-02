package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.ui.Color;
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
public final class Button$TextButtonElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Button$TextButtonElement> CREATOR;
    public final Action action;
    public final Alignment alignment;
    public final Color background_color;
    public final Color color;
    public final Size size;
    public final State state;
    public final String text;
    public final Color text_color;

    /* renamed from: type, reason: collision with root package name */
    public final Button$Type f1265type;

    public enum Size implements WireEnum {
        WIDE(1),
        MEDIUM(2),
        SMALL(3);

        public final int value;
        public static final Action.Type.Companion Companion = new Action.Type.Companion();
        public static final Button$TextButtonElement$Size$Companion$ADAPTER$1 ADAPTER = new Button$TextButtonElement$Size$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Size.class), Syntax.PROTO_2, null);

        Size(int i) {
            this.value = i;
        }

        public static final Size fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return WIDE;
            }
            if (i == 2) {
                return MEDIUM;
            }
            if (i != 3) {
                return null;
            }
            return SMALL;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum State implements WireEnum {
        DEFAULT(1),
        PRESSED(2),
        DISABLED(3),
        SELECTED(4);

        public final int value;
        public static final Alignment.Companion Companion = new Alignment.Companion();
        public static final Button$TextButtonElement$State$Companion$ADAPTER$1 ADAPTER = new Button$TextButtonElement$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, null);

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return DEFAULT;
            }
            if (i == 2) {
                return PRESSED;
            }
            if (i == 3) {
                return DISABLED;
            }
            if (i != 4) {
                return null;
            }
            return SELECTED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Button$TextButtonElement$Companion$ADAPTER$1 button$TextButtonElement$Companion$ADAPTER$1 = new Button$TextButtonElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button$TextButtonElement.class), "type.googleapis.com/squareup.cash.genericelements.ui.Button.TextButtonElement", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = button$TextButtonElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(button$TextButtonElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Button$TextButtonElement(String str, Action action, Button$Type button$Type, State state, Size size, Alignment alignment, Color color, Color color2, Color color3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.action = action;
        this.f1265type = button$Type;
        this.state = state;
        this.size = size;
        this.alignment = alignment;
        this.color = color;
        this.text_color = color2;
        this.background_color = color3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Button$TextButtonElement)) {
            return false;
        }
        Button$TextButtonElement button$TextButtonElement = (Button$TextButtonElement) obj;
        return Intrinsics.areEqual(unknownFields(), button$TextButtonElement.unknownFields()) && Intrinsics.areEqual(this.text, button$TextButtonElement.text) && Intrinsics.areEqual(this.action, button$TextButtonElement.action) && this.f1265type == button$TextButtonElement.f1265type && this.state == button$TextButtonElement.state && this.size == button$TextButtonElement.size && this.alignment == button$TextButtonElement.alignment && Intrinsics.areEqual(this.color, button$TextButtonElement.color) && Intrinsics.areEqual(this.text_color, button$TextButtonElement.text_color) && Intrinsics.areEqual(this.background_color, button$TextButtonElement.background_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode3 = (hashCode2 + (action != null ? action.hashCode() : 0)) * 37;
        Button$Type button$Type = this.f1265type;
        int hashCode4 = (hashCode3 + (button$Type != null ? button$Type.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode5 = (hashCode4 + (state != null ? state.hashCode() : 0)) * 37;
        Size size = this.size;
        int hashCode6 = (hashCode5 + (size != null ? size.hashCode() : 0)) * 37;
        Alignment alignment = this.alignment;
        int hashCode7 = (hashCode6 + (alignment != null ? alignment.hashCode() : 0)) * 37;
        Color color = this.color;
        int hashCode8 = (hashCode7 + (color != null ? color.hashCode() : 0)) * 37;
        Color color2 = this.text_color;
        int hashCode9 = (hashCode8 + (color2 != null ? color2.hashCode() : 0)) * 37;
        Color color3 = this.background_color;
        int hashCode10 = hashCode9 + (color3 != null ? color3.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(18, false);
        builder.locale = this.text;
        builder.title = this.action;
        builder.info_rows_header = this.f1265type;
        builder.footer_text = this.state;
        builder.loadable_subtitle = this.size;
        builder.info_rows = this.alignment;
        builder.primary_footer_button_state = this.color;
        builder.secondary_footer_button_state = this.text_color;
        builder.payment_plans_data = this.background_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        Button$Type button$Type = this.f1265type;
        if (button$Type != null) {
            arrayList.add("type=" + button$Type);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        Size size = this.size;
        if (size != null) {
            arrayList.add("size=" + size);
        }
        Alignment alignment = this.alignment;
        if (alignment != null) {
            arrayList.add("alignment=" + alignment);
        }
        Color color = this.color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
        }
        Color color2 = this.text_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("text_color=", color2, arrayList);
        }
        Color color3 = this.background_color;
        if (color3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TextButtonElement{", "}", 0, null, null, 56);
    }
}
