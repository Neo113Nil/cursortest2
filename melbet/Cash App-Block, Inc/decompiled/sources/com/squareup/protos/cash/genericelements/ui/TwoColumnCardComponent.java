package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
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
public final class TwoColumnCardComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TwoColumnCardComponent> CREATOR;
    public final Action action;
    public final ColumnWidth column_width;
    public final TwoColumnComponent header;
    public final List left;
    public final List right;
    public final Spacing spacing_between;
    public final StyleAttributes style_attributes;
    public final VerticalAlignment vertical_alignment;

    public enum Spacing implements WireEnum {
        SMALL(1),
        LARGE(2);

        public final int value;
        public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
        public static final TwoColumnCardComponent$Spacing$Companion$ADAPTER$1 ADAPTER = new TwoColumnCardComponent$Spacing$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Spacing.class), Syntax.PROTO_2, null);

        Spacing(int i) {
            this.value = i;
        }

        public static final Spacing fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return SMALL;
            }
            if (i != 2) {
                return null;
            }
            return LARGE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        TwoColumnCardComponent$Companion$ADAPTER$1 twoColumnCardComponent$Companion$ADAPTER$1 = new TwoColumnCardComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TwoColumnCardComponent.class), "type.googleapis.com/squareup.cash.genericelements.ui.TwoColumnCardComponent", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = twoColumnCardComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(twoColumnCardComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoColumnCardComponent(List list, List list2, ColumnWidth columnWidth, Action action, StyleAttributes styleAttributes, TwoColumnComponent twoColumnComponent, Spacing spacing, VerticalAlignment verticalAlignment, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.column_width = columnWidth;
        this.action = action;
        this.style_attributes = styleAttributes;
        this.header = twoColumnComponent;
        this.spacing_between = spacing;
        this.vertical_alignment = verticalAlignment;
        this.left = TransactorKt.immutableCopyOf("left", list);
        this.right = TransactorKt.immutableCopyOf("right", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TwoColumnCardComponent)) {
            return false;
        }
        TwoColumnCardComponent twoColumnCardComponent = (TwoColumnCardComponent) obj;
        return Intrinsics.areEqual(unknownFields(), twoColumnCardComponent.unknownFields()) && Intrinsics.areEqual(this.left, twoColumnCardComponent.left) && Intrinsics.areEqual(this.right, twoColumnCardComponent.right) && this.column_width == twoColumnCardComponent.column_width && Intrinsics.areEqual(this.action, twoColumnCardComponent.action) && Intrinsics.areEqual(this.style_attributes, twoColumnCardComponent.style_attributes) && Intrinsics.areEqual(this.header, twoColumnCardComponent.header) && this.spacing_between == twoColumnCardComponent.spacing_between && this.vertical_alignment == twoColumnCardComponent.vertical_alignment;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.left), 37, this.right);
        ColumnWidth columnWidth = this.column_width;
        int hashCode = (m + (columnWidth != null ? columnWidth.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode2 = (hashCode + (action != null ? action.hashCode() : 0)) * 37;
        StyleAttributes styleAttributes = this.style_attributes;
        int hashCode3 = (hashCode2 + (styleAttributes != null ? styleAttributes.hashCode() : 0)) * 37;
        TwoColumnComponent twoColumnComponent = this.header;
        int hashCode4 = (hashCode3 + (twoColumnComponent != null ? twoColumnComponent.hashCode() : 0)) * 37;
        Spacing spacing = this.spacing_between;
        int hashCode5 = (hashCode4 + (spacing != null ? spacing.hashCode() : 0)) * 37;
        VerticalAlignment verticalAlignment = this.vertical_alignment;
        int hashCode6 = hashCode5 + (verticalAlignment != null ? verticalAlignment.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(25, false);
        builder.count_groups = this.left;
        builder.external_token = this.right;
        builder.customer_token = this.column_width;
        builder.external_version = this.action;
        builder.updated_at = this.style_attributes;
        builder.created_at = this.header;
        builder.is_badged = this.spacing_between;
        builder.item_type = this.vertical_alignment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.left;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("left=", arrayList, list);
        }
        List list2 = this.right;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("right=", arrayList, list2);
        }
        ColumnWidth columnWidth = this.column_width;
        if (columnWidth != null) {
            arrayList.add("column_width=" + columnWidth);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        StyleAttributes styleAttributes = this.style_attributes;
        if (styleAttributes != null) {
            arrayList.add("style_attributes=" + styleAttributes);
        }
        TwoColumnComponent twoColumnComponent = this.header;
        if (twoColumnComponent != null) {
            arrayList.add("header=" + twoColumnComponent);
        }
        Spacing spacing = this.spacing_between;
        if (spacing != null) {
            arrayList.add("spacing_between=" + spacing);
        }
        VerticalAlignment verticalAlignment = this.vertical_alignment;
        if (verticalAlignment != null) {
            arrayList.add("vertical_alignment=" + verticalAlignment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TwoColumnCardComponent{", "}", 0, null, null, 56);
    }
}
