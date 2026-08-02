package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
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
public final class Button$IconButtonElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Button$IconButtonElement> CREATOR;
    public final Action action;
    public final Alignment alignment;
    public final Color background_color;
    public final Color color;
    public final Image icon;
    public final Size size;
    public final State state;

    /* renamed from: type, reason: collision with root package name */
    public final Button$Type f1264type;

    public enum Size implements WireEnum {
        ICON_56(1),
        ICON_48(2),
        ICON_40(3),
        ICON_32(4);

        public final int value;
        public static final RadioType.Companion Companion = new RadioType.Companion();
        public static final Button$IconButtonElement$Size$Companion$ADAPTER$1 ADAPTER = new Button$IconButtonElement$Size$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Size.class), Syntax.PROTO_2, null);

        Size(int i) {
            this.value = i;
        }

        public static final Size fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return ICON_56;
            }
            if (i == 2) {
                return ICON_48;
            }
            if (i == 3) {
                return ICON_40;
            }
            if (i != 4) {
                return null;
            }
            return ICON_32;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum State implements WireEnum {
        DEFAULT(1),
        DISABLED(2);

        public final int value;
        public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
        public static final Button$IconButtonElement$State$Companion$ADAPTER$1 ADAPTER = new Button$IconButtonElement$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, null);

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return DEFAULT;
            }
            if (i != 2) {
                return null;
            }
            return DISABLED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Button$IconButtonElement$Companion$ADAPTER$1 button$IconButtonElement$Companion$ADAPTER$1 = new Button$IconButtonElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button$IconButtonElement.class), "type.googleapis.com/squareup.cash.genericelements.ui.Button.IconButtonElement", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = button$IconButtonElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(button$IconButtonElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Button$IconButtonElement(Image image, Action action, Button$Type button$Type, State state, Size size, Alignment alignment, Color color, Color color2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = image;
        this.action = action;
        this.f1264type = button$Type;
        this.state = state;
        this.size = size;
        this.alignment = alignment;
        this.color = color;
        this.background_color = color2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Button$IconButtonElement)) {
            return false;
        }
        Button$IconButtonElement button$IconButtonElement = (Button$IconButtonElement) obj;
        return Intrinsics.areEqual(unknownFields(), button$IconButtonElement.unknownFields()) && Intrinsics.areEqual(this.icon, button$IconButtonElement.icon) && Intrinsics.areEqual(this.action, button$IconButtonElement.action) && this.f1264type == button$IconButtonElement.f1264type && this.state == button$IconButtonElement.state && this.size == button$IconButtonElement.size && this.alignment == button$IconButtonElement.alignment && Intrinsics.areEqual(this.color, button$IconButtonElement.color) && Intrinsics.areEqual(this.background_color, button$IconButtonElement.background_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.icon;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode3 = (hashCode2 + (action != null ? action.hashCode() : 0)) * 37;
        Button$Type button$Type = this.f1264type;
        int hashCode4 = (hashCode3 + (button$Type != null ? button$Type.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode5 = (hashCode4 + (state != null ? state.hashCode() : 0)) * 37;
        Size size = this.size;
        int hashCode6 = (hashCode5 + (size != null ? size.hashCode() : 0)) * 37;
        Alignment alignment = this.alignment;
        int hashCode7 = (hashCode6 + (alignment != null ? alignment.hashCode() : 0)) * 37;
        Color color = this.color;
        int hashCode8 = (hashCode7 + (color != null ? color.hashCode() : 0)) * 37;
        Color color2 = this.background_color;
        int hashCode9 = hashCode8 + (color2 != null ? color2.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(23, false);
        builder.external_token = this.icon;
        builder.customer_token = this.action;
        builder.external_version = this.f1264type;
        builder.updated_at = this.state;
        builder.created_at = this.size;
        builder.is_badged = this.alignment;
        builder.item_type = this.color;
        builder.count_groups = this.background_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        Button$Type button$Type = this.f1264type;
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
        Color color2 = this.background_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IconButtonElement{", "}", 0, null, null, 56);
    }
}
