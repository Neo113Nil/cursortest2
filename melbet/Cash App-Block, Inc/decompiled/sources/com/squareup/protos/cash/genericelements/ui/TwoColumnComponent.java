package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.Card;
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
public final class TwoColumnComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TwoColumnComponent> CREATOR;
    public final ColumnWidth column_width;
    public final BaseElement left;
    public final BaseElement right;
    public final Spacing spacing_between;

    public enum Spacing implements WireEnum {
        SMALL(1),
        LARGE(2);

        public final int value;
        public static final Action.Type.Companion Companion = new Action.Type.Companion();
        public static final TwoColumnComponent$Spacing$Companion$ADAPTER$1 ADAPTER = new TwoColumnComponent$Spacing$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Spacing.class), Syntax.PROTO_2, null);

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
        TwoColumnComponent$Companion$ADAPTER$1 twoColumnComponent$Companion$ADAPTER$1 = new TwoColumnComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TwoColumnComponent.class), "type.googleapis.com/squareup.cash.genericelements.ui.TwoColumnComponent", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = twoColumnComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(twoColumnComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoColumnComponent(BaseElement baseElement, BaseElement baseElement2, ColumnWidth columnWidth, Spacing spacing, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.left = baseElement;
        this.right = baseElement2;
        this.column_width = columnWidth;
        this.spacing_between = spacing;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TwoColumnComponent)) {
            return false;
        }
        TwoColumnComponent twoColumnComponent = (TwoColumnComponent) obj;
        return Intrinsics.areEqual(unknownFields(), twoColumnComponent.unknownFields()) && Intrinsics.areEqual(this.left, twoColumnComponent.left) && Intrinsics.areEqual(this.right, twoColumnComponent.right) && this.column_width == twoColumnComponent.column_width && this.spacing_between == twoColumnComponent.spacing_between;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BaseElement baseElement = this.left;
        int hashCode2 = (hashCode + (baseElement != null ? baseElement.hashCode() : 0)) * 37;
        BaseElement baseElement2 = this.right;
        int hashCode3 = (hashCode2 + (baseElement2 != null ? baseElement2.hashCode() : 0)) * 37;
        ColumnWidth columnWidth = this.column_width;
        int hashCode4 = (hashCode3 + (columnWidth != null ? columnWidth.hashCode() : 0)) * 37;
        Spacing spacing = this.spacing_between;
        int hashCode5 = hashCode4 + (spacing != null ? spacing.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(16, false);
        builder.postal_code = this.left;
        builder.last_four_digits = this.right;
        builder.expiration = this.column_width;
        builder.ciphertext_ = this.spacing_between;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BaseElement baseElement = this.left;
        if (baseElement != null) {
            arrayList.add("left=" + baseElement);
        }
        BaseElement baseElement2 = this.right;
        if (baseElement2 != null) {
            arrayList.add("right=" + baseElement2);
        }
        ColumnWidth columnWidth = this.column_width;
        if (columnWidth != null) {
            arrayList.add("column_width=" + columnWidth);
        }
        Spacing spacing = this.spacing_between;
        if (spacing != null) {
            arrayList.add("spacing_between=" + spacing);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TwoColumnComponent{", "}", 0, null, null, 56);
    }
}
