package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.grantly.api.Channel;
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
public final class ImageElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ImageElement> CREATOR;
    public final String accessibility_label;
    public final Alignment alignment;
    public final Color color;
    public final Image icon;
    public final Size size;

    public enum Size implements WireEnum {
        SMALL(1),
        MEDIUM(2),
        LARGE(3),
        STATIC(4);

        public final int value;
        public static final Channel.Companion Companion = new Channel.Companion();
        public static final ImageElement$Size$Companion$ADAPTER$1 ADAPTER = new ImageElement$Size$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Size.class), Syntax.PROTO_2, null);

        Size(int i) {
            this.value = i;
        }

        public static final Size fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return SMALL;
            }
            if (i == 2) {
                return MEDIUM;
            }
            if (i == 3) {
                return LARGE;
            }
            if (i != 4) {
                return null;
            }
            return STATIC;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ImageElement$Companion$ADAPTER$1 imageElement$Companion$ADAPTER$1 = new ImageElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ImageElement.class), "type.googleapis.com/squareup.cash.genericelements.ui.ImageElement", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = imageElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(imageElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageElement(Image image, Color color, Alignment alignment, Size size, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = image;
        this.color = color;
        this.alignment = alignment;
        this.size = size;
        this.accessibility_label = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageElement)) {
            return false;
        }
        ImageElement imageElement = (ImageElement) obj;
        return Intrinsics.areEqual(unknownFields(), imageElement.unknownFields()) && Intrinsics.areEqual(this.icon, imageElement.icon) && Intrinsics.areEqual(this.color, imageElement.color) && this.alignment == imageElement.alignment && this.size == imageElement.size && Intrinsics.areEqual(this.accessibility_label, imageElement.accessibility_label);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.icon;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        Color color = this.color;
        int hashCode3 = (hashCode2 + (color != null ? color.hashCode() : 0)) * 37;
        Alignment alignment = this.alignment;
        int hashCode4 = (hashCode3 + (alignment != null ? alignment.hashCode() : 0)) * 37;
        Size size = this.size;
        int hashCode5 = (hashCode4 + (size != null ? size.hashCode() : 0)) * 37;
        String str = this.accessibility_label;
        int hashCode6 = hashCode5 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(9);
        builder.icon = this.icon;
        builder.text_color = this.color;
        builder.text_style = this.alignment;
        builder.text_decoration = this.size;
        builder.text = this.accessibility_label;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        Color color = this.color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
        }
        Alignment alignment = this.alignment;
        if (alignment != null) {
            arrayList.add("alignment=" + alignment);
        }
        Size size = this.size;
        if (size != null) {
            arrayList.add("size=" + size);
        }
        String str = this.accessibility_label;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "accessibility_label=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ImageElement{", "}", 0, null, null, 56);
    }
}
